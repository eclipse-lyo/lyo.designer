/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.tools.codegenerator.ui.common;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.osgi.framework.Bundle;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.Specification;

import org.eclipse.lyo.oslc4j.codegenerator.main.Generate;
import org.eclipse.lyo.oslc4j.codegenerator.main.GenerateSpecification;
import org.eclipse.lyo.tools.codegenerator.ui.Activator;
import org.eclipse.lyo.tools.codegenerator.ui.popupMenus.DialogServices;
import org.eclipse.ui.PlatformUI;


/**
 * Main entry point of the 'Codegenerator' generation module.
 */
public class GenerateAll {

	/**
	 * The output folder.
	 */
	private File targetFolder;

	private AbstractAcceleoGenerator generator;

	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(URI modelURI, File targetFolder, List<? extends Object> arguments) throws IOException {
		generator = new Generate(modelURI, targetFolder, arguments);
		String generationID = AcceleoLaunchingUtil.computeUIProjectID(
				"org.eclipse.lyo.oslc4j.codegenerator",
				"org.eclipse.lyo.oslc4j.codegenerator.main.Generate",
				modelURI.toString(),
				targetFolder.toString(),
				new ArrayList<String>());
		generator.setGenerationID(generationID);
		this.targetFolder = targetFolder;
	}

	public GenerateAll(AdaptorInterface adaptorInterface, File targetFolder, List<? extends Object> arguments) throws IOException {
		generator = new Generate(adaptorInterface, targetFolder, arguments);
		String generationID = AcceleoLaunchingUtil.computeUIProjectID(
				"org.eclipse.lyo.oslc4j.codegenerator",
				"org.eclipse.lyo.oslc4j.codegenerator.main.Generate",
				adaptorInterface.toString(),
				targetFolder.toString(),
				new ArrayList<String>());
		generator.setGenerationID(generationID);
		this.targetFolder = targetFolder;
	}

	public GenerateAll(Specification specification, File targetFolder, List<? extends Object> arguments) throws IOException {
		generator = new GenerateSpecification(specification, targetFolder, arguments);
		String generationID = AcceleoLaunchingUtil.computeUIProjectID(
				"org.eclipse.lyo.oslc4j.codegenerator",
				"org.eclipse.lyo.oslc4j.codegenerator.main.GenerateSpecification",
				specification.toString(),
				targetFolder.toString(),
				new ArrayList<String>());
		generator.setGenerationID(generationID);
		this.targetFolder = targetFolder;
	}

	
	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate() throws IOException {
		if (!targetFolder.exists()) {
			targetFolder.mkdirs();
		}

		IRunnableWithProgress operation = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) {
				try {					
					monitor.subTask("Loading...");
					monitor.worked(1);
					generator.doGenerate(BasicMonitor.toMonitor(monitor));
				    DialogServices.showMessage("Generation Success", "Generation completed on \"" + targetFolder.toString() + "\".");
				} catch (IOException e) {
				    IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				    Activator.getDefault().getLog().log(status);
				    DialogServices.showMessage("Exception!", "an Exception occurred during the generation process. Please see the error log.");
				}
				return;
			}
		};
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
		} catch (InvocationTargetException | InterruptedException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		    DialogServices.showMessage("Exception!", "an Exception occurred during the generation process. Please see the error log.");
		}

	}
	
	/**
	 * Finds the template in the plug-in. Returns the template plug-in URI.
	 * 
	 * @param bundleID
	 *            is the plug-in ID
	 * @param relativePath
	 *            is the relative path of the template in the plug-in
	 * @return the template URI
	 * @throws IOException
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private URI getTemplateURI(String bundleID, IPath relativePath) throws IOException {
		Bundle bundle = Platform.getBundle(bundleID);
		if (bundle == null) {
			// no need to go any further
			return URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		URL url = bundle.getEntry(relativePath.toString());
		if (url == null && relativePath.segmentCount() > 1) {
			Enumeration<URL> entries = bundle.findEntries("/", "*.emtl", true);
			if (entries != null) {
				String[] segmentsRelativePath = relativePath.segments();
				while (url == null && entries.hasMoreElements()) {
					URL entry = entries.nextElement();
					IPath path = new Path(entry.getPath());
					if (path.segmentCount() > relativePath.segmentCount()) {
						path = path.removeFirstSegments(path.segmentCount() - relativePath.segmentCount());
					}
					String[] segmentsPath = path.segments();
					boolean equals = segmentsPath.length == segmentsRelativePath.length;
					for (int i = 0; equals && i < segmentsPath.length; i++) {
						equals = segmentsPath[i].equals(segmentsRelativePath[i]);
					}
					if (equals) {
						url = bundle.getEntry(entry.getPath());
					}
				}
			}
		}
		URI result;
		if (url != null) {
			result = URI.createPlatformPluginURI(new Path(bundleID).append(new Path(url.getPath())).toString(), false);
		} else {
			result = URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		return result;
	}

}
