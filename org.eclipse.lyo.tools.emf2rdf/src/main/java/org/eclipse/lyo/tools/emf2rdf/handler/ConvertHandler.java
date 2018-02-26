/*******************************************************************************
 * Copyright (c) 2018 Yash Khatri.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Yash Khatri       - initial API and implementation and/or initial documentation
 * 
 *******************************************************************************/

package org.eclipse.lyo.tools.emf2rdf.handler;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edapt.internal.common.URIUtils;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.lyo.tools.emf2rdf.constants.VocabularyClientConstants;
import org.eclipse.lyo.tools.emf2rdf.helper.ExportHelper;
import org.eclipse.lyo.tools.emf2rdf.helper.Status;
import org.eclipse.lyo.tools.emf2rdf.helper.Utils;
import org.eclipse.lyo.tools.emf2rdf.loadmodel.EMFModelLoader;
import org.eclipse.lyo.tools.emf2rdf.wizard.ExportDestinationWizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.actions.ActionDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */
public class ConvertHandler extends ActionDelegate implements IActionDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConvertHandler.class);
    protected List<IFile> files;

 /*
 * This methods are used if we use menu contribution instead of object contribution in plugin.xml.
 * And replace "extends AbstractHandler implements IHandler" in this class. 
 * 
    protected String getPersistentProperty(IResource res, QualifiedName qn) {
        try {
            return res.getPersistentProperty(qn);
        } catch (CoreException e) {
            return "";
        }
    }

    protected void setPersistentProperty(IResource res, QualifiedName qn, String value) {
        try {
            res.setPersistentProperty(qn, value);
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
        Object firstElement = selection.getFirstElement();
        IFile ifile = (IFile) firstElement;
        Utils.setIfile(ifile);
        return promptForAskingExportDestination();
    }
    */

    @SuppressWarnings("unchecked")
    public void selectionChanged(IAction action, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            files = ((IStructuredSelection) selection).toList();
        }
    }

    public void run(IAction action) {
        if (files != null) {
            Iterator<IFile> filesIt = files.iterator();
            while (filesIt.hasNext()) {
                Object firstElement = filesIt.next();
                IFile ifile = (IFile) firstElement;
                Utils.setIfile(ifile);
                promptForAskingExportDestination();
            }
        }

    }

    @SuppressWarnings("restriction")
    private Object loadEMFResource() {

        URI uri = URIUtils.getURI(Utils.getIfile());

        EMFModelLoader emfLoader = new EMFModelLoader();
        ExportHelper helper = new ExportHelper();
        Object emfResource = emfLoader.determineModel(uri);
        String status = Status.UNSUCCESSFUL.toString();

        if (null != emfResource) {
            exportResources(helper, emfResource, status);
        } else {
            Utils.informUser("Export " + Status.UNSUCCESSFUL.toString() + ". No Specification or Vocabulary found. ");
        }
        return null;
    }

    private void exportResources(ExportHelper helper, Object emfResource, String status) {

        switch (emfResource.getClass().getSimpleName()) {
        case VocabularyClientConstants.VOCABULARIES_IMPL:
            status = helper.exportVocabularies(emfResource);
            break;
        case VocabularyClientConstants.SPECIFICATION_IMPL:
            status = helper.exportSpecifications(emfResource);
            break;
        case VocabularyClientConstants.TOOLCHAIN_IMPL:
            status = helper.exportToolChain(emfResource);
            break;
        }

        if (status.equalsIgnoreCase(Status.CANCEL.toString())) {
            LOGGER.info("Export cancelled by the user.");
        } else if (status.equalsIgnoreCase(Status.SUCCESSFUL.toString())) {
            Utils.informUser("Export " + Status.SUCCESSFUL.toString() + ".");
        } else {
            Utils.informUser("Export " + Status.UNSUCCESSFUL.toString() + ".");
        }
    }

    public Object promptForAskingExportDestination() {
        LOGGER.info("Prompted User for asking export destination.");
        Utils.populateStoreDetails();
        WizardDialog wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), new ExportDestinationWizard());
        wizardDialog.setPageSize(140, 140);
        if (wizardDialog.open() == Window.OK) {
            return loadEMFResource();
        } else {
            LOGGER.info("User Cancelled the Operation");
        }
        return null;
    }
}