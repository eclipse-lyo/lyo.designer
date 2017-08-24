/*******************************************************************************
 * Copyright (c) 2017 Jad El-khoury.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Jad El-khoury        - Initial implementation of calling Acceleo generators from Sirius.
 *
 *******************************************************************************/
package org.eclipse.lyo.tools.toolchain.design;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ToolChainModel.design.Activator;
import org.eclipse.lyo.oslc4j.codegenerator.main.Generate;
import org.eclipse.lyo.tools.toolchain.design.DialogInputServices;

public class GeneratorServices {

    private final ILog logger;

    public GeneratorServices() {
        logger = Activator.getDefault().getLog();
    }

    private String getFolderPath(EObject self) {
        EObject rootContainer = EcoreUtil.getRootContainer(self);
        URI rootUri = EcoreUtil.getURI(rootContainer);
        URI resolvedRootUri = CommonPlugin.resolve(rootUri);
        Path rootPath = new Path(resolvedRootUri.toFileString());

        return rootPath.removeLastSegments(1).toOSString();
    }

    private boolean generateAdaptorInterface(EObject self, String targetFolder) {
        try {
            File folder = new File(targetFolder);
            List<String> arguments = new ArrayList<String>();

            Generate generator = new Generate(self, folder, arguments);

            generator.doGenerate(new BasicMonitor());
        } catch (IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
            logger.log(status);
            DialogInputServices dialogInputServices = new DialogInputServices();
            dialogInputServices.showMessage(self, "Exception!", "an Exception occurred during the generation process. Please see the error log.");
            return false;
        }
        return true;
    }

    public EObject generateAdaptorInterface(EObject self) {

        final String PROPERTIES_FILE_NAME = "generator.properties";
        final String GENERATION_PATH_PROPERTY = "generationPath";

        DialogInputServices dialogInputServices = new DialogInputServices();

        String folderPath = getFolderPath(self);
        String propertiesFilePath = folderPath + File.separator + PROPERTIES_FILE_NAME;
        String generationPath = null;
        try {
            Properties props = new Properties();
            File propertiesFile = new File(propertiesFilePath);
            if(propertiesFile.exists() && !propertiesFile.isDirectory()) {
                props.load(new FileInputStream(propertiesFile));
                generationPath = props.getProperty(GENERATION_PATH_PROPERTY);
            }
        } catch (IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
            logger.log(status);
            dialogInputServices.showMessage(self, "Exception!", "an Exception occurred reading the properties file:\""
                    + propertiesFilePath + "\". Please see the error log.");
            return self;
        }

        if (generationPath == null || generationPath.length() == 0) {
            generationPath = dialogInputServices.promptForFolder(self,
                    "Enter Generation Base Folder",
                    "Select the base folder for your generation." + "\n" +
                    "NOTE: To provide a default path, set a \"" + GENERATION_PATH_PROPERTY + "\" property in a \"" + PROPERTIES_FILE_NAME + "\" file, in the same location as your toolchain model.",
                    folderPath);
        }

        if (generationPath == null || generationPath.length() == 0) {
            return self;
        }

        File generationPathFile = new File(generationPath);
        if(!generationPathFile.exists() || !generationPathFile.isDirectory()) {
            dialogInputServices.showMessage(self, "Exception!", "Generation path " + generationPath + " must be an existing directory.");
            return self;
        }
        if (generateAdaptorInterface(self, generationPath)) {
            dialogInputServices.showMessage(self, "Generation Success", "Generation completed on \"" + generationPath + "\".");
        }
        return self;
    }

}
