/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Eclipse Distribution License 1.0
 * which is available at http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Simple
 */
package org.eclipse.lyo.oslc4j.codegenerator.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import adaptorinterface.AdaptorinterfacePackage;
import toolchain.ToolchainPackage;
import vocabulary.VocabularyPackage;

/**
 * Standalone entry point for running the Lyo Designer code generator without an
 * Eclipse workspace.
 */
public class HeadlessGenerator extends Generate {

    public HeadlessGenerator(URI modelURI, File targetFolder, List<?> arguments) throws IOException {
        super(modelURI, targetFolder, arguments);
    }

    @Override
    public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);

        registerPackage(resourceSet, ToolchainPackage.class, ToolchainPackage.eNS_URI, ToolchainPackage.eINSTANCE);
        registerPackage(resourceSet, AdaptorinterfacePackage.class, AdaptorinterfacePackage.eNS_URI,
                AdaptorinterfacePackage.eINSTANCE);
        registerPackage(resourceSet, VocabularyPackage.class, VocabularyPackage.eNS_URI, VocabularyPackage.eINSTANCE);
    }

    private void registerPackage(ResourceSet resourceSet, Class<? extends EPackage> packageClass, String namespaceUri,
            EPackage packageInstance) {
        if (!isInWorkspace(packageClass)) {
            resourceSet.getPackageRegistry().put(namespaceUri, packageInstance);
        }
    }

    @Override
    public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);

        XMIResourceFactoryImpl factory = new XMIResourceFactoryImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", factory);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("toolchain", factory);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, factory);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println(
                    "Usage: HeadlessGenerator <model-path> <output-directory> [properties-file ...]");
            System.exit(2);
            return;
        }

        try {
            File modelFile = new File(args[0]).getAbsoluteFile();
            File outputDirectory = new File(args[1]).getAbsoluteFile();
            URI modelUri = URI.createFileURI(modelFile.getPath());
            List<String> arguments = new ArrayList<String>();
            HeadlessGenerator generator = new HeadlessGenerator(modelUri, outputDirectory, arguments);

            for (int i = 2; i < args.length; i++) {
                generator.addPropertiesFile(new File(args[i]).getAbsolutePath());
            }

            generator.doGenerate(new BasicMonitor());
            System.out.println("Generation finished.");
        } catch (IOException e) {
            e.printStackTrace(System.err);
            System.exit(1);
        }
    }
}
