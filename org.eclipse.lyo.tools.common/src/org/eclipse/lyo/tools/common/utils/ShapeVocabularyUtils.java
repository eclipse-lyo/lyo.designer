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

import adaptorinterface.DomainSpecification;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;
import adaptorinterface.ResourcePropertyOccurs;

public class ShapeVocabularyUtils {

    public ShapeVocabularyUtils() {
    }

    //DomainSpecification
    public String deduceVocabulary_namespaceURI (DomainSpecification self) {
        return self.deduceVocabulary().getNamespaceURI();
    }
    public String deduceVocabulary_localPart (DomainSpecification self) {
        return self.deduceVocabulary().getLocalPart();
    }
    public String deduceVocabulary_prefix (DomainSpecification self) {
        return self.deduceVocabulary().getPrefix();
    }

    //Resource
    public String deduceDescribes_namespaceURI (Resource self) {
        return self.deduceDescribes().getNamespaceURI();
    }
    public String deduceDescribes_localPart (Resource self) {
        return self.deduceDescribes().getLocalPart();
    }
    public String deduceDescribes_prefix (Resource self) {
        return self.deduceDescribes().getPrefix();
    }
    public String toString (Resource self, Boolean withShapeLabel, Boolean withPrefix) {
        return self.toString(withShapeLabel, withPrefix);
    }

    //ResourceProperty
    public String deducePropertyDefinition_namespaceURI (ResourceProperty self) {
        return self.deducePropertyDefinition().getNamespaceURI();
    }
    public String deducePropertyDefinition_localPart (ResourceProperty self) {
        return self.deducePropertyDefinition().getLocalPart();
    }
    public String deducePropertyDefinition_prefix (ResourceProperty self) {
        return self.deducePropertyDefinition().getPrefix();
    }
    public boolean isLiteral (ResourceProperty self) {
        return self.isLiteral();
    }
    public boolean isCardinalityMany (ResourceProperty self) {
        return self.isCardinalityMany();
    }
    public String toString (ResourceProperty self, Boolean withShapeLabel, Boolean withPrefix, Boolean withConstraints) {
        return self.toString(withShapeLabel, withPrefix, withConstraints);
    }

    //ResourcePropertyOccurs
    public String toStringNumeric (ResourcePropertyOccurs occurs ) {
        return occurs.toStringNumeric();
    }

}