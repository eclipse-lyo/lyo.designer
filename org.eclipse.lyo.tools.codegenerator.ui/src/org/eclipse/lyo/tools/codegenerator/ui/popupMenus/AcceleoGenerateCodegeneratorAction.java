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
package org.eclipse.lyo.tools.codegenerator.ui.popupMenus;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.lyo.tools.codegenerator.ui.Activator;
import org.eclipse.lyo.tools.codegenerator.ui.common.GenerateAll;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.actions.ActionDelegate;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.Specification;

/**
 * Codegenerator code generation.
 */
public class AcceleoGenerateCodegeneratorAction extends ActionDelegate implements IActionDelegate {
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	public void generateAdaptorInterface(AdaptorInterface adaptorInterface) {
		File modelProjectFolder = DialogServices.getModellingProjectBaseFolder(adaptorInterface);
		File generationPath = DialogServices.getGenerationTargetFolder(modelProjectFolder);
		if(generationPath == null) {
		    return;
		}
		try {
			GenerateAll generator = new GenerateAll(adaptorInterface, generationPath, getArguments());
			generator.doGenerate();
		} catch (IOException e) {
		    IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
		    Activator.getDefault().getLog().log(status);
		    DialogServices.showMessage("Exception!", "an Exception occurred during the generation process. Please see the error log.");
		}
	}


	public void generateSpecification(Specification specification) {
		File modelProjectFolder = DialogServices.getModellingProjectBaseFolder(specification);
		File generationPath = DialogServices.getGenerationTargetFolder(modelProjectFolder);
		if(generationPath == null) {
		    return;
		}
		try {
			GenerateAll generator = new GenerateAll(specification, generationPath, getArguments());
			generator.doGenerate();
		} catch (IOException e) {
		    IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
		    Activator.getDefault().getLog().log(status);
		    DialogServices.showMessage("Exception!", "an Exception occurred during the generation process. Please see the error log.");
		}
	}

	
	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		if (files != null) {
			Iterator<IFile> filesIt = files.iterator();
			while (filesIt.hasNext()) {
				IFile model = (IFile)filesIt.next();
				URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
				
				File modelProjectFolder = model.getProject().getLocation().toFile();
				File generationPath = DialogServices.getGenerationTargetFolder(modelProjectFolder);
				if (generationPath == null) {
					return;
				}
				try {
					GenerateAll generator = new GenerateAll(modelURI, generationPath, getArguments());
					generator.doGenerate();
				} catch (IOException e) {
				    IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				    Activator.getDefault().getLog().log(status);
				    DialogServices.showMessage("Exception!", "an Exception occurred during the generation process. Please see the error log.");
				}
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

}