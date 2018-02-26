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

package org.eclipse.lyo.tools.emf2rdf.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.tools.emf2rdf.constants.VocabularyClientConstants;

// End of user code
@OslcNamespace(VocabularyClientConstants.OWL_NAMSPACE)
@OslcName(VocabularyClientConstants.VOCABULARIES)
@OslcResourceShape(title = "Vocabularies Resource Shape", describes = VocabularyClientConstants.TYPE_VOCABULARIES)
public class Vocabularies extends AbstractResource implements IVocabularies {
    private HashSet<Link> vocabularies = new HashSet<Link>();

    public Vocabularies() throws URISyntaxException {
        super();

    }

    public Vocabularies(final URI about) throws URISyntaxException {
        super(about);

    }

    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(), OslcConstants.PATH_RESOURCE_SHAPES,
                VocabularyClientConstants.PATH_VOCABULARIES, Vocabularies.class);
    }

    public String toString() {
        return toString(false);
    }

    public String toString(boolean asLocalResource) {
        String result = "";

        if (asLocalResource) {
            result = result
                    + "{a Local Vocabularies Resource} - update Vocabularies.toString() to present resource as desired.";
        } else {
            result = getAbout().toString();
        }

        return result;
    }

    public void addVocabularies(final Link vocabularies) {
        this.vocabularies.add(vocabularies);
    }

    @OslcName("vocabularies")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "vocabularies")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ VocabularyClientConstants.TYPE_ONTOLOGY })
    @OslcReadOnly(false)
    public HashSet<Link> getVocabularies() {
        return vocabularies;
    }

    public void setVocabularies(final HashSet<Link> vocabularies) {
        this.vocabularies.clear();
        if (vocabularies != null) {
            this.vocabularies.addAll(vocabularies);
        }
    }
}
