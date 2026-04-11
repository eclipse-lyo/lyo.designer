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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;

import adaptorinterface.Specification;

import org.eclipse.lyo.oslc4j.codegenerator.python.main.GenerateSpecification;
import org.eclipse.lyo.tools.codegenerator.ui.Activator;
import org.eclipse.lyo.tools.codegenerator.ui.popupMenus.DialogServices;
import org.eclipse.ui.PlatformUI;


/**
 * Main entry point of the Python 'Codegenerator' generation module.
 * Only supports Specification models (client-side Python code generation).
 * AdaptorInterface models are not supported for Python generation.
 */
public class GenerateAllPython {

	/**
	 * The output folder.
	 */
	private File targetFolder;

	private AbstractAcceleoGenerator generator;

	/**
	 * Constructor for URI-based generation.
	 * 
	 * <p>Since Python code generation only supports Specification models,
	 * this constructor uses the Python GenerateSpecification generator.
	 * If the model contains an AdaptorInterface instead of a Specification,
	 * the Acceleo engine will simply not find a matching template entry point
	 * and no files will be generated.</p>
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 */
	public GenerateAllPython(URI modelURI, File targetFolder, List<? extends Object> arguments) throws IOException {
		generator = new GenerateSpecification(modelURI, targetFolder, arguments);
		String generationID = AcceleoLaunchingUtil.computeUIProjectID(
				"org.eclipse.lyo.oslc4j.codegenerator",
				"org.eclipse.lyo.oslc4j.codegenerator.python.main.GenerateSpecification",
				modelURI.toString(),
				targetFolder.toString(),
				new ArrayList<String>());
		generator.setGenerationID(generationID);
		this.targetFolder = targetFolder;
	}

	/**
	 * Constructor for Specification-based generation.
	 * 
	 * @param specification
	 *            the Specification model element
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 */
	public GenerateAllPython(Specification specification, File targetFolder, List<? extends Object> arguments) throws IOException {
		generator = new GenerateSpecification(specification, targetFolder, arguments);
		String generationID = AcceleoLaunchingUtil.computeUIProjectID(
				"org.eclipse.lyo.oslc4j.codegenerator",
				"org.eclipse.lyo.oslc4j.codegenerator.python.main.GenerateSpecification",
				specification.toString(),
				targetFolder.toString(),
				new ArrayList<String>());
		generator.setGenerationID(generationID);
		this.targetFolder = targetFolder;
	}

	
	/**
	 * Launches the generation.
	 *
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
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
				    DialogServices.showMessage("Generation Success", "Python code generation completed on \"" + targetFolder.toString() + "\".");
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

}
