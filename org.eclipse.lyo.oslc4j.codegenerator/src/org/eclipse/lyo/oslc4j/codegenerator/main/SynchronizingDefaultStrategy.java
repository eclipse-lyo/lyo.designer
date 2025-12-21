/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
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
package org.eclipse.lyo.oslc4j.codegenerator.main;

import java.io.File;
import java.io.IOException;

import org.eclipse.acceleo.engine.generation.strategy.DefaultStrategy;
import org.eclipse.acceleo.engine.generation.writers.AbstractAcceleoWriter;

/**
 * Default Acceleo strategy that always enables synchronization/merge so user code
 * inside protected areas ("Start of user code" blocks) is preserved during
 * regeneration when running the standalone CLI.
 */
class SynchronizingDefaultStrategy extends DefaultStrategy {

    @Override
    public AbstractAcceleoWriter createWriterFor(
            File file,
            AbstractAcceleoWriter existingWriter,
            boolean append,
            boolean synchronize) throws IOException {
        return super.createWriterFor(file, existingWriter, append, true);
    }

    @Override
    public AbstractAcceleoWriter createWriterFor(
            File file,
            AbstractAcceleoWriter existingWriter,
            boolean append,
            boolean synchronize,
            String charset) throws IOException {
        return super.createWriterFor(file, existingWriter, append, true, charset);
    }
}