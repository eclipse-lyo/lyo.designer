/*******************************************************************************
 * Copyright (c) 2017 Yash Khatri.
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
 *     Yash Khatri      - Initial implementation of loading imported models.
 *
 *******************************************************************************/
package org.eclipse.lyo.tools.toolchain.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import adaptorinterface.DomainSpecification;
import vocabulary.Vocabulary;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

public class ConfirmDeletionServices {

    Boolean deletefromModel;

    public ConfirmDeletionServices() {
    }

    /**
     * <p>
     * This method is used for prompting the user to decide whether the
     * <{@link Vocabulary}}> or <{@link DomainSpecification}}> he/she is trying to
     * delete should be deleted from the graphical diagram only or from the
     * underlying model as well.
     * </p>
     * 
     * @param self
     *            The EObject that is in question to be deleted.
     * @return boolean true; if the EObject should be deleted from model and from
     *         all diagrams. false; if the EObject should be deleted from graphical
     *         diagram only. null; if the operation is cancelled.
     */
    public boolean deleteFromModel(EObject self) {

        Boolean cancelled = null;
        ConfirmDeleteDialog dialog = new ConfirmDeleteDialog(Display.getCurrent().getActiveShell());
        int status = dialog.open();
        if (status == Dialog.OK) {
            return deletefromModel;
        }
        return cancelled;
    }

    class ConfirmDeleteDialog extends Dialog {

        public ConfirmDeleteDialog(Shell parentShell) {
            super(parentShell);
        }

        @Override
        protected Control createDialogArea(Composite parent) {
            Composite container = (Composite) super.createDialogArea(parent);

            Button deleteFromDiagramButton = new Button(container, SWT.RADIO);
            deleteFromDiagramButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
            deleteFromDiagramButton.setText("Delete from Diagram");
            deleteFromDiagramButton.setToolTipText(
                    "This will only delete the item from the current graphical diagram. The item will remain in the underlying model, and all other diagrams are not affected.");
            deleteFromDiagramButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (deleteFromDiagramButton.getSelection()) {
                        deletefromModel = false;
                    }
                }
            });

            Button deleteFromModelButton = new Button(container, SWT.RADIO);
            deleteFromModelButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
            deleteFromModelButton.setText("Delete from Model");
            deleteFromModelButton.setToolTipText(
                    "This will delete the item from the underlying model, as well as all graphical diagram.");
            deleteFromModelButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (deleteFromModelButton.getSelection()) {
                        deletefromModel = true;
                    }
                }
            });

            return container;
        }

        @Override
        protected void configureShell(Shell newShell) {
            super.configureShell(newShell);
            newShell.setText("Confirm Delete");
        }

        @Override
        protected Point getInitialSize() {
            return new Point(450, 150);
        }

    }
}