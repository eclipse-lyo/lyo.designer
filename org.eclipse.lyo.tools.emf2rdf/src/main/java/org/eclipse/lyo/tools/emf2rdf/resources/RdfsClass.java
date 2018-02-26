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

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

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

@OslcNamespace(VocabularyClientConstants.RDFS_NAMSPACE)
@OslcName(VocabularyClientConstants.RDFSCLASS)
@OslcResourceShape(title = "Class Resource Shape", describes = VocabularyClientConstants.TYPE_RDFSCLASS)
public class RdfsClass extends Term implements IRdfsClass {
    private HashSet<Link> subClassOf = new HashSet<Link>();
    private Link type;

    public RdfsClass() throws URISyntaxException {
        super();

    }

    public RdfsClass(final URI about) throws URISyntaxException {
        super(about);
    }

    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(), OslcConstants.PATH_RESOURCE_SHAPES,
                VocabularyClientConstants.PATH_RDFSCLASS, RdfsClass.class);
    }

    public String toString() {
        return toString(false);
    }

    public String toString(boolean asLocalResource) {
        String result = "";

        if (asLocalResource) {
            result = result + "{a Local Class Resource} - update Class.toString() to present resource as desired.";
        } else {
            result = getAbout().toString();
        }

        return result;
    }

    public String toHtml() {
        return toHtml(false);
    }

    public void addSubClassOf(final Link subClassOf) {
        this.subClassOf.add(subClassOf);
    }

    @OslcName("subClassOf")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "subClassOf")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ VocabularyClientConstants.TYPE_RDFSCLASS })
    @OslcReadOnly(false)
    public HashSet<Link> getSubClassOf() {
        return subClassOf;
    }

    public void setSubClassOf(final HashSet<Link> subClassOf) {
        this.subClassOf.clear();
        if (subClassOf != null) {
            this.subClassOf.addAll(subClassOf);
        }

    }

    @OslcName("type")
    @OslcPropertyDefinition(VocabularyClientConstants.RDF_NAMSPACE + "type")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ VocabularyClientConstants.TYPE_RDFSCLASS })
    @OslcReadOnly(false)
    public Link getType() {
        return type;
    }

    public void setType(final Link type) {
        this.type = type;

    }
}
