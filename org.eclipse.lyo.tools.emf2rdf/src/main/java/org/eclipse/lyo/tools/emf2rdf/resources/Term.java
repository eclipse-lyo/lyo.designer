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

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
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
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.tools.emf2rdf.constants.VocabularyClientConstants;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

@OslcNamespace(VocabularyClientConstants.RDFS_NAMSPACE)
@OslcName(VocabularyClientConstants.TERM)
@OslcResourceShape(title = "Term Resource Shape", describes = VocabularyClientConstants.TYPE_TERM)
public abstract class Term extends AbstractResource implements ITerm {
    private String name;
    private String label;
    private URI isDefinedBy;
    private String comment;
    private URI seeAlso;

    public Term() throws URISyntaxException {
        super();
    }

    public Term(final URI about) throws URISyntaxException {
        super(about);

    }

    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(), OslcConstants.PATH_RESOURCE_SHAPES,
                VocabularyClientConstants.PATH_TERM, Term.class);
    }

    public String toString() {
        return toString(false);
    }

    public String toString(boolean asLocalResource) {
        String result = "";

        if (asLocalResource) {
            result = result + "{a Local Term Resource} - update Term.toString() to present resource as desired.";
        } else {
            result = getAbout().toString();
        }

        return result;
    }

    public String toHtml() {
        return toHtml(false);
    }

    public String toHtml(boolean asLocalResource) {
        String result = "";

        if (asLocalResource) {
            result = toString(true);
        } else {
            result = "<a href=\"" + getAbout() + "\">" + toString() + "</a>";
        }

        return result;
    }

    @OslcName("name")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "name")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getName() {
        return name;
    }

    @OslcName("label")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "label")
    @OslcDescription("May be used to provide a human-readable version of a resource's name.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getLabel() {
        return label;
    }

    @OslcName("isDefinedBy")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "isDefinedBy")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcRange({ VocabularyClientConstants.TYPE_RDFSCLASS })
    @OslcReadOnly(false)
    public URI getIsDefinedBy() {
        return isDefinedBy;
    }

    @OslcName("comment")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "comment")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getComment() {
        return comment;
    }

    @OslcName("seeAlso")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "seeAlso")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcReadOnly(false)
    public URI getSeeAlso() {
        return seeAlso;
    }

    public void setName(final String name) {
        this.name = name;

    }

    public void setLabel(final String label) {
        this.label = label;

    }

    public void setIsDefinedBy(final URI isDefinedBy) {
        this.isDefinedBy = isDefinedBy;

    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setSeeAlso(final URI seeAlso) {
        this.seeAlso = seeAlso;
    }
}
