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

import javax.xml.namespace.QName;

import adaptorinterface.DomainSpecification;
import vocabulary.Vocabulary;

public class DomainSpecificationVocabulary {

    public DomainSpecificationVocabulary() {
    }

    public QName deduceVocabulary(DomainSpecification self) {
        if (null != self.getDefaultVocabulary()) {
            Vocabulary v = (Vocabulary)self.getDefaultVocabulary();
            return new QName(v.getNamespaceURI(), v.getLabel(), v.getPreferredNamespacePrefix());
        }
        return new QName(self.getNamespaceURI(), self.getName(), self.getNamespacePrefix().getName());
    }

    public String deduceVocabulary_namespaceURI (DomainSpecification self) {
        return deduceVocabulary(self).getNamespaceURI();
    }
    public String deduceVocabulary_localPart (DomainSpecification self) {
        return deduceVocabulary(self).getLocalPart();
    }
    public String deduceVocabulary_prefix (DomainSpecification self) {
        return deduceVocabulary(self).getPrefix();
    }



}