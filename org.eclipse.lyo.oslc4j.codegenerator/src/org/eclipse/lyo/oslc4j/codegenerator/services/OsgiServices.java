package org.eclipse.lyo.oslc4j.codegenerator.services;

import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;

public class OsgiServices {

	public String getOSGiBundleVersion() {
		Version version = FrameworkUtil.getBundle(getClass()).getVersion();
		return version.toString();
	}
}
