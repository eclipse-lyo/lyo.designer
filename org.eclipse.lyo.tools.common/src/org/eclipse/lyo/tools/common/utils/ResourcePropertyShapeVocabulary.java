/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
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
package org.eclipse.lyo.tools.common.utils;

import java.net.URI;

import javax.xml.namespace.QName;

import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import adaptorinterface.DomainSpecification;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;
import adaptorinterface.ResourcePropertyOccurs;
import adaptorinterface.ResourcePropertyValueType;
import vocabulary.Vocabulary;

public class ResourcePropertyShapeVocabulary {

    public ResourcePropertyShapeVocabulary() {
    }

    /**
     * <p>
     * get the PropertyDefinition.
     * The definition is either explicitly defined in the model as a Vocabulary Property term, or
     * implied by constructing it from the Property shape.
     * </p>
     *
     * @param self
     *            The ResourceProperty that is in question.
     */
    public QName deducePropertyDefinition(ResourceProperty self) {
        if (null != self.getPropertyDefinition()) {
            Vocabulary v = (Vocabulary)self.getPropertyDefinition().eContainer();
            return new QName(v.getNamespaceURI(), self.getPropertyDefinition().getName(), v.getPreferredNamespacePrefix());
        }
        DomainSpecification ds = (DomainSpecification)self.eContainer();
        DomainSpecificationVocabulary vocab = new DomainSpecificationVocabulary();
        QName deducedVocabulary = vocab.deduceVocabulary(ds);
        return new QName(deducedVocabulary.getNamespaceURI(), self.getName(), deducedVocabulary.getPrefix());
    }

    public String deducePropertyDefinition_namespaceURI (ResourceProperty self) {
        return deducePropertyDefinition(self).getNamespaceURI();
    }
    public String deducePropertyDefinition_localPart (ResourceProperty self) {
        return deducePropertyDefinition(self).getLocalPart();
    }
    public String deducePropertyDefinition_prefix (ResourceProperty self) {
        return deducePropertyDefinition(self).getPrefix();
    }

    public String deducePropertyDefinitionComment(ResourceProperty self) {
        if (null != self.getPropertyDefinition()) {
            return self.getPropertyDefinition().getComment();
        }
        return self.getVocabularyComment();
    }

    public URI deducePropertyDefinition_URI (ResourceProperty self) {
        //I Cannot use UriBuilder to construct the URI since the "#" in the paths gets lost.
        //return UriBuilder.fromUri(v.getNamespaceURI()).path(resource.getDescribes().getName()).build().toString();
        return URI.create(deducePropertyDefinition_namespaceURI(self) + deducePropertyDefinition_localPart(self));
    }

    public URI getPropertyShapeURI(ResourceProperty self) {
        return java.net.URI.create(((DomainSpecification)self.eContainer()).getNamespaceURI() + self.getName());
    }
    
    public boolean isLiteral (ResourceProperty self) {
        return 
                self.getValueType().compareTo(ResourcePropertyValueType.LOCAL_RESOURCE) != 0 
                && self.getValueType().compareTo(ResourcePropertyValueType.RESOURCE) != 0 
                ;
    }

    public boolean isCardinalityMany (ResourceProperty self) {
        return 
                self.getOccurs().compareTo(ResourcePropertyOccurs.EXACTLY_ONE) != 0 
                && self.getOccurs().compareTo(ResourcePropertyOccurs.ZERO_OR_ONE) != 0 
                ;
    }

    public Occurs oslcCardinality (ResourceProperty self) {
        switch (self.getOccurs()) {
        case EXACTLY_ONE:
            return Occurs.ExactlyOne;
        case ONE_OR_MANY:
            return Occurs.OneOrMany;
        case ZERO_OR_MANY:
            return Occurs.ZeroOrMany;
        case ZERO_OR_ONE:
            return Occurs.ZeroOrOne;
        default:
            return Occurs.ExactlyOne;
        }
    }

    public ValueType oslcValueType (ResourceProperty self) {
        switch (self.getValueType()) {
        case BOOLEAN:
            return ValueType.Boolean;
        case DATE_TIME:
            return ValueType.DateTime;
        case DOUBLE:
            return ValueType.Double;
        case FLOAT:
            return ValueType.Float;
        case INTEGER:
            return ValueType.Integer;
        case LOCAL_RESOURCE:
            return ValueType.LocalResource;
        case RESOURCE:
            return ValueType.Resource;
        case STRING:
            return ValueType.String;
        case URI:
            return ValueType.Resource;
        case XML_LITERAL:
            return ValueType.XMLLiteral;
        default:
            return ValueType.String;
        }
    }
    
    
    //TODO: What to do with EITHER, and NA?
    public Representation oslcRepresentation (ResourceProperty self) {
        switch(self.getRepresentation()) {
        case REFERENCE:
            return Representation.Reference;
        case INLINE:
            return Representation.Inline;
        case EITHER:
            return null;
        case NA:
            return null;
        default:
            return Representation.Reference;
        }
    }

    public String cardinalityRepresentation (ResourceProperty self, Boolean numeric) {
        if (numeric) {
            switch (self.getOccurs()) {
            case EXACTLY_ONE:
                return "[1]";
            case ZERO_OR_ONE:
                return "[0..1]";
            case ZERO_OR_MANY:
                return "[0..*]";
            case ONE_OR_MANY:
                return "[1..*]";
            default:
                return "[*..*]";
            }
        }
        else {
            return oslcCardinality(self).name();
        }
        
    }
    
    public String toString (ResourceProperty self, Boolean withShapeLabel, Boolean withPrefix, Boolean withConstraints) {
        String s = "";
        if (withShapeLabel) {
            DomainSpecification ds = (DomainSpecification)self.eContainer();
            s += (withPrefix ? ds.getNamespacePrefix().getName() + ":" : "");
            s += self.getName();
        }
        else {
            s += (withPrefix ? deducePropertyDefinition(self).getPrefix() + ":" : "");
            s += deducePropertyDefinition(self).getLocalPart();
            
        }
        if (withConstraints) {
            s+= " : ";
            if (isLiteral(self)) {
                s+= self.getValueType().getName();
            }
            else {
                if (self.getRange().size() == 0) {
                    s += "Resource";
                }
                else {
                    s+= self.getRange().get(0).getName() + (self.getRange().size() > 1 ? "++" : "");
                }
            }
            
            if (isCardinalityMany(self)) {
                s+= "[]";
            }
        }
        return s;
    }

}