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

import adaptorinterface.DomainSpecification;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;
import vocabulary.Vocabulary;

public class ResourceShapeVocabulary {

    public ResourceShapeVocabulary() {
    }

    public QName deduceDescribes(Resource self) {
        if (null != self.getDescribes()) {
            Vocabulary v = (Vocabulary)self.getDescribes().eContainer();
            return new QName(v.getNamespaceURI(), self.getDescribes().getName(), v.getPreferredNamespacePrefix());
        }
        DomainSpecification ds = (DomainSpecification)self.eContainer();
        DomainSpecificationVocabulary vocab = new DomainSpecificationVocabulary();
        QName deducedVocabulary = vocab.deduceVocabulary(ds);
        return new QName(deducedVocabulary.getNamespaceURI(), self.getName(), deducedVocabulary.getPrefix());
    }

    public String deduceDescribes_namespaceURI (Resource self) {
        return deduceDescribes(self).getNamespaceURI();
    }
    public String deduceDescribes_localPart (Resource self) {
        return deduceDescribes(self).getLocalPart();
    }
    public String deduceDescribes_prefix (Resource self) {
        return deduceDescribes(self).getPrefix();
    }

    public String deduceDescribesComment(Resource self) {
        if (null != self.getDescribes()) {
            return self.getDescribes().getComment();
        }
        return self.getVocabularyComment();
    }

    public URI deduceDescribes_URI (Resource self) {
        //I Cannot use UriBuilder to construct the URI since the "#" in the paths gets lost.
        //return UriBuilder.fromUri(v.getNamespaceURI()).path(resource.getDescribes().getName()).build().toString();
        return URI.create(deduceDescribes_namespaceURI(self) + deduceDescribes_localPart(self));
    }

    public URI getResourceShapeURI(Resource self) {
        return java.net.URI.create(((DomainSpecification)self.eContainer()).getNamespaceURI() + self.getName());
    }

    public String toString (Resource self, Boolean withShapeLabel, Boolean withPrefix) {
        String s = "";
        if (withShapeLabel) {
            DomainSpecification ds = (DomainSpecification)self.eContainer();
            s += (withPrefix ? ds.getNamespacePrefix().getName() + ":" : "");
            s += self.getName();
        }
        else {
            s += (withPrefix ? deduceDescribes(self).getPrefix() + ":" : "");
            s += deduceDescribes(self).getLocalPart();
            
        }
        return s;
    }
    

}