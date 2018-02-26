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
import java.util.HashSet;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
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
public interface IOntology
{

    public void addTerms(final Link terms );

    @OslcName("namespaceURI")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "namespaceURI")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getNamespaceURI();

    @OslcName("label")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "label")
    @OslcDescription("May be used to provide a human-readable version of a resource's name.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getLabel();

    @OslcName("description")
    @OslcPropertyDefinition(VocabularyClientConstants.DUBLIN_CORE_NAMSPACE + "description")
    @OslcDescription("Descriptive text about resource represented as rich text in XHTML content. SHOULD include only content that is valid and suitable inside an XHTML <div> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getDescription();

    @OslcName("source")
    @OslcPropertyDefinition(VocabularyClientConstants.DUBLIN_CORE_NAMSPACE + "source")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcReadOnly(false)
    public URI getSource();

    @OslcName("title")
    @OslcPropertyDefinition(VocabularyClientConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle();

    @OslcName("prefix")
    @OslcPropertyDefinition(VocabularyClientConstants.VANN_NAMSPACE + "prefix")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getPrefix();

    @OslcName("terms")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "terms")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({VocabularyClientConstants.TYPE_TERM})
    @OslcReadOnly(false)
    public HashSet<Link> getTerms();

    public void setNamespaceURI(final String namespaceURI );
    public void setLabel(final String label );
    public void setDescription(final String description );
    public void setSource(final URI source );
    public void setTitle(final String title );
    public void setPrefix(final String prefix );
    public void setTerms(final HashSet<Link> terms );
}

