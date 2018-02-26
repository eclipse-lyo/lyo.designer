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

import java.util.HashSet;

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

@OslcNamespace(VocabularyClientConstants.RDFS_NAMSPACE)
@OslcName(VocabularyClientConstants.RDFSCLASS)
@OslcResourceShape(title = "Class Resource Shape", describes = VocabularyClientConstants.TYPE_RDFSCLASS)
public interface IRdfsClass
{

    public void addSubClassOf(final Link subClassOf );

    @OslcName("subClassOf")
    @OslcPropertyDefinition(VocabularyClientConstants.RDFS_NAMSPACE + "subClassOf")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({VocabularyClientConstants.TYPE_RDFSCLASS})
    @OslcReadOnly(false)
    public HashSet<Link> getSubClassOf();

    public void setSubClassOf(final HashSet<Link> subClassOf );
    
    @OslcName("type")
    @OslcPropertyDefinition(VocabularyClientConstants.RDF_NAMSPACE + "type")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({VocabularyClientConstants.TYPE_RDFSCLASS})
    @OslcReadOnly(false)
    public Link getType();
    
    public void setType(final Link type);
    
}

