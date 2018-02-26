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

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

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
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.tools.emf2rdf.constants.VocabularyClientConstants;

@OslcNamespace(VocabularyClientConstants.RDF_NAMSPACE)
@OslcName(VocabularyClientConstants.PROPERTY)
@OslcResourceShape(title = "Property Resource Shape", describes = VocabularyClientConstants.TYPE_PROPERTY)
public class Property extends Term implements IProperty {
    private HashSet<Link> subPropertyOf = new HashSet<Link>();
    private HashSet<Link> domain = new HashSet<Link>();
    private HashSet<Link> range = new HashSet<Link>();

    public Property() throws URISyntaxException {
        super();
    }

    public Property(final URI about) throws URISyntaxException {
        super(about);

    }

    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(), OslcConstants.PATH_RESOURCE_SHAPES,
                VocabularyClientConstants.PATH_PROPERTY, Property.class);
    }

    public String toString() {
        return toString(false);
    }

    public String toString(boolean asLocalResource) {
        String result = "";

        if (asLocalResource) {
            result = result
                    + "{a Local Property Resource} - update Property.toString() to present resource as desired.";
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

    public void addSubPropertyOf(final Link subPropertyOf) {
        this.subPropertyOf.add(subPropertyOf);
    }

    @OslcName("subPropertyOf")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "subPropertyOf")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ VocabularyClientConstants.TYPE_PROPERTY })
    @OslcReadOnly(false)
    public HashSet<Link> getSubPropertyOf() {
        return subPropertyOf;
    }

    public void setSubPropertyOf(final HashSet<Link> subPropertyOf) {
        this.subPropertyOf.clear();
        if (subPropertyOf != null) {
            this.subPropertyOf.addAll(subPropertyOf);
        }

    }

    public void addDomain(final Link domain) {
        this.domain.add(domain);
    }

    @OslcName("domain")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "domain")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ VocabularyClientConstants.TYPE_RDFSCLASS })
    @OslcReadOnly(false)
    public HashSet<Link> getDomain() {
        return domain;
    }

    public void setDomain(final HashSet<Link> domain) {
        this.domain.clear();
        if (domain != null) {
            this.domain.addAll(domain);
        }
    }

    public void addRange(final Link range) {
        this.range.add(range);
    }

    @OslcName("range")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "range")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ VocabularyClientConstants.TYPE_RDFSCLASS })
    @OslcReadOnly(false)
    public HashSet<Link> getRange() {
        return range;
    }

    public void setRange(final HashSet<Link> range) {
        this.range.clear();
        if (range != null) {
            this.range.addAll(range);
        }
    }
}
