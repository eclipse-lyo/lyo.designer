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

package org.eclipse.lyo.tools.emf2rdf.helper;

import java.util.List;

import org.apache.jena.rdf.model.Model;
import org.eclipse.lyo.oslc4j.core.model.IResource;
import org.eclipse.lyo.tools.emf2rdf.constants.ExportConstants;
import org.eclipse.lyo.tools.emf2rdf.jenabuilder.SpecificationJenaBuilder;
import org.eclipse.lyo.tools.emf2rdf.jenabuilder.VocabularyJenaBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import adaptorinterface.Specification;
import toolchain.Toolchain;
import vocabulary.Vocabularies;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */
public class ExportHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExportHelper.class);

    public String exportToolChain(Object emfResource) {
        LOGGER.info("Exporting Toolchain");
        Toolchain toolchain = (Toolchain) emfResource;
        Vocabularies vocabularies = toolchain.getVocabularies();
        Specification specification = toolchain.getSpecification();
        String status = Status.UNSUCCESSFUL.toString();
        if (vocabularies != null) {
            LOGGER.info("Found Vocabularies inside Toolchain. Exporting Vocabularies.");
            status = exportVocabulariesInternal(vocabularies);
        }
        if (specification != null) {
            LOGGER.info("Found Specification inside Toolchain. Exporting Specification");
            status = exportSpecificationInternal(specification);
        }

        return status;
    }

    public String exportSpecifications(Object emfResource) {

        LOGGER.info("Exporting Specification.");
        Specification specification = (Specification) emfResource;
        return exportSpecificationInternal(specification);
    }

    public String exportSpecificationInternal(Specification specification) {

        SpecificationJenaBuilder builder = new SpecificationJenaBuilder();
        Model outModel = null;
        String status = Status.UNSUCCESSFUL.toString();
        try {
            String[] shapeTypes = Utils.promptForResourceOrShaclShape();
            if(shapeTypes==null) {
                return Status.CANCEL.toString();
            }
            for(String shapeType : shapeTypes) {
                outModel = builder.buildJenaModel(specification, shapeType);
                if(Utils.getExportDestination().equalsIgnoreCase(ExportConstants.FILE)) {
                    status = Utils.serialiseModelAsTurtle(outModel, Utils.promptForFileName("Select file name for Specification", Utils.getModellingProjectBaseFolder().toString()));
                } else {
                    List<IResource> oslcResourceList = builder.getOSLCResources(specification, shapeType);
                    IResource[] oslcResources = oslcResourceList.toArray(new IResource[oslcResourceList.size()]);
                    status = Utils.savetoTripleStore(oslcResources);
                }
            }
            return status;
        } catch (Exception e) {
            e.printStackTrace();
            return Status.UNSUCCESSFUL.toString();
        }
    }

    public String  exportVocabularies(Object emfResource) {

        LOGGER.info("Exporting Vocabularies.");
        Vocabularies vocabularies = (Vocabularies) emfResource;
        return exportVocabulariesInternal(vocabularies);
    }

    public String exportVocabulariesInternal(Vocabularies vocabularies) {

        VocabularyJenaBuilder builder = new VocabularyJenaBuilder();
        String status = Status.UNSUCCESSFUL.toString();
        try {

            if(Utils.getExportDestination().equalsIgnoreCase(ExportConstants.FILE)) {
                Model outModel = builder.buildJenaModel(vocabularies);
                status = Utils.serialiseModelAsTurtle(outModel, Utils.promptForFileName("Select file name for Vocabularies", Utils.getModellingProjectBaseFolder()));
            } else {
                List<IResource> oslcResourceList = builder.getOSLCResources(vocabularies);
                IResource[] oslcResources = oslcResourceList.toArray(new IResource[oslcResourceList.size()]);
                status = Utils.savetoTripleStore(oslcResources);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
