/*******************************************************************************
 * Copyright (c) 2018 Yash Khatri.
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
 *     Yash Khatri       - initial API and implementation and/or initial documentation
 * 
 *******************************************************************************/

package org.eclipse.lyo.tools.emf2rdf.loadmodel;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.lyo.tools.emf2rdf.constants.VocabularyClientConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Specification;
import toolchain.Toolchain;
import toolchain.ToolchainPackage;
import vocabulary.Vocabularies;
import vocabulary.VocabularyPackage;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */
public class EMFModelLoader {

    private static final Logger LOGGER = LoggerFactory.getLogger(EMFModelLoader.class);
    
    private static void initialize() {
        ToolchainPackage.eINSTANCE.eClass();
        VocabularyPackage.eINSTANCE.eClass();
        AdaptorinterfacePackage.eINSTANCE.eClass();
    }

    private static void registerPackages() {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("toolchain", new XMIResourceFactoryImpl());
        m.put("vocabulary", new XMIResourceFactoryImpl());
        m.put("domain", new XMIResourceFactoryImpl());
        m.put("xml", new XMIResourceFactoryImpl());
    }
    
    static {
        initialize();
        registerPackages();
    }

    public Object determineModel(URI path) {

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        try {
        Resource resource = resSet.getResource(path, true);

        for (Iterator<EObject> iterator = resource.getContents().iterator(); iterator.hasNext();) {
            EObject next = iterator.next();
            String interfaceName = next.getClass().getInterfaces()[0].getSimpleName();
            if (VocabularyClientConstants.VOCABULARIES_INTERFACE.equalsIgnoreCase(interfaceName)) {
                LOGGER.info("vocabulary model loaded from vocabulary package");
                return (Vocabularies) next;
            } else if (VocabularyClientConstants.SPECIFICATION_INTERFACE.equalsIgnoreCase(interfaceName)) {
                LOGGER.info("specification model loaded from adaptor interface package");
                return (Specification) next;
            } else if (VocabularyClientConstants.TOOLCHAIN_INTERFACE.equalsIgnoreCase(interfaceName)) {
                Toolchain toolchain = (Toolchain) next;
                LOGGER.info("toolchain model loaded from toolchain package");
                return toolchain;
            }
        }
        } catch (Exception e) {
            LOGGER.info("Exception caught while getting resource from ResourceSet. Returning null. {} ",e);
            return null;
        }
        return null;
    }

   
}
