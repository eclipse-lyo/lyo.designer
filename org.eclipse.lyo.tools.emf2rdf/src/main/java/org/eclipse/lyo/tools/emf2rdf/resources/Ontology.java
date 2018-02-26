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
import org.eclipse.lyo.oslc4j.core.model.Link;
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

@OslcNamespace(VocabularyClientConstants.OWL_NAMSPACE)
@OslcName(VocabularyClientConstants.ONTOLOGY)
@OslcResourceShape(title = "Ontology Resource Shape", describes = VocabularyClientConstants.TYPE_ONTOLOGY)
public class Ontology extends AbstractResource implements IOntology {
    private String namespaceURI;
    private String label;
    private String description;
    private URI source;
    private String title;
    private String prefix;
    private HashSet<Link> terms = new HashSet<Link>();

    public Ontology() throws URISyntaxException {
        super();
    }

    public Ontology(final URI about) throws URISyntaxException {
        super(about);
    }

    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(), OslcConstants.PATH_RESOURCE_SHAPES,
                VocabularyClientConstants.PATH_ONTOLOGY, Ontology.class);
    }

    public String toString() {
        return toString(false);
    }

    public String toString(boolean asLocalResource) {
        String result = "";

        if (asLocalResource) {
            result = result
                    + "{a Local Ontology Resource} - update Ontology.toString() to present resource as desired.";
        } else {
            result = getAbout().toString();
        }
        return result;
    }

    public void addTerms(final Link terms) {
        this.terms.add(terms);
    }

    @OslcName("namespaceURI")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "namespaceURI")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getNamespaceURI() {
        return namespaceURI;
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

    @OslcName("description")
    @OslcPropertyDefinition(VocabularyClientConstants.DUBLIN_CORE_NAMSPACE + "description")
    @OslcDescription("Descriptive text about resource represented as rich text in XHTML content. SHOULD include only content that is valid and suitable inside an XHTML <div> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getDescription() {
        return description;
    }

    @OslcName("source")
    @OslcPropertyDefinition(VocabularyClientConstants.DUBLIN_CORE_NAMSPACE + "source")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcReadOnly(false)
    public URI getSource() {
        return source;
    }

    @OslcName("title")
    @OslcPropertyDefinition(VocabularyClientConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle() {
        return title;
    }

    @OslcName("prefix")
    @OslcPropertyDefinition(VocabularyClientConstants.VANN_NAMSPACE + "prefix")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getPrefix() {
        return prefix;
    }

    @OslcName("terms")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "terms")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ VocabularyClientConstants.TYPE_TERM })
    @OslcReadOnly(false)
    public HashSet<Link> getTerms() {
        return terms;
    }

    public void setNamespaceURI(final String namespaceURI) {
        this.namespaceURI = namespaceURI;

    }

    public void setLabel(final String label) {
        this.label = label;

    }

    public void setDescription(final String description) {
        this.description = description;

    }

    public void setSource(final URI source) {
        this.source = source;

    }

    public void setTitle(final String title) {
        this.title = title;

    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;

    }

    public void setTerms(final HashSet<Link> terms) {
        this.terms.clear();
        if (terms != null) {
            this.terms.addAll(terms);
        }
    }
}
