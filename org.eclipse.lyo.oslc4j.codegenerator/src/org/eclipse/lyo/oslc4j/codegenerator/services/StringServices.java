/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Simple
 */
package org.eclipse.lyo.oslc4j.codegenerator.services;

/** Encodes model text for the contents of a Java string literal. */
public class StringServices {
    public String escapeJavaString(String value) {
        StringBuilder result = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            switch (character) {
            case '\\': result.append("\\\\"); break;
            case '"': result.append("\\\""); break;
            case '\n': result.append("\\n"); break;
            case '\r': result.append("\\r"); break;
            case '\t': result.append("\\t"); break;
            case '\b': result.append("\\b"); break;
            case '\f': result.append("\\f"); break;
            default:
                if (character < 32 || character == 127) {
                    result.append(String.format("\\%03o", (int) character));
                } else {
                    result.append(character);
                }
            }
        }
        return result.toString();
    }
}
