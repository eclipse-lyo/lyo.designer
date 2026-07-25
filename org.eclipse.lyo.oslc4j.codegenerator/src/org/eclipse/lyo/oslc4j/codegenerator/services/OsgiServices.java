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

import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;

public class OsgiServices {

	public String getOSGiBundleVersion() {
		var bundle = FrameworkUtil.getBundle(getClass());
		if (bundle != null) {
			Version version = bundle.getVersion();
			return version.toString();
		}

		String configuredVersion = System.getProperty("lyod.codegen.version");
		if (configuredVersion == null || configuredVersion.isBlank()) {
			configuredVersion = System.getenv("LYOD_CODEGEN_VERSION");
		}
		if (configuredVersion != null && !configuredVersion.isBlank()) {
			return configuredVersion;
		}

		String implementationVersion = getClass().getPackage().getImplementationVersion();
		if (implementationVersion != null && !implementationVersion.isBlank()) {
			return implementationVersion;
		}

		return "7.0.0";
	}
}
