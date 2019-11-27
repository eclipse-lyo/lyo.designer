package org.eclipse.lyo.oslc4j.codegenerator.services;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileServices {

	String targetFolder;
	
	public void setTargetFolder (String path) {
		this.targetFolder = path;
	}
	
	public boolean fileExists(String filepath) {
	    Path p = Paths.get(targetFolder, filepath); 
	    p.normalize();
	    File f = new File(p.toString());
	    return f.exists();
	}
}
