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
package org.eclipse.lyo.oslc4j.codegenerator.services;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileServices {

	private static String targetFolder;
	
	public void setTargetFolder (String path) {
		targetFolder = path;
	}
	
	public boolean fileExists(String filepath) {
	    Path p = Paths.get(targetFolder, filepath); 
	    p.normalize();
	    File f = new File(p.toString());
	    return f.exists();
	}
}
