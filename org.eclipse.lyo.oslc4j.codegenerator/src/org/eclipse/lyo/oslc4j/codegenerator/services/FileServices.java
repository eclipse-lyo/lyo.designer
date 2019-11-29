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
