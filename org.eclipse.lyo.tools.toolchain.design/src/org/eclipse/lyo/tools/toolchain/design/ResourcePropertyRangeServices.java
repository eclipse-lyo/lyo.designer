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
package org.eclipse.lyo.tools.toolchain.design;

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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;

public class ResourcePropertyRangeServices {
	ResourceProperty self;
	Resource existingResouce;
	Resource newResource;
    int replaceInRange;

    public ResourcePropertyRangeServices() {
    }

    /**
     * <p>
     * Prompt the user on whether 
     * one should add or replace a <{@link Resource}}> to the range of <{@link ResourceProperty}}>.
     * </p>
     *
     * @param self
     *            The ResourceProperty that is in question.
     * @return int  1: if the newResource should replace the existingResource in the range
     *              0: if the newResource should be added to the range, without replacing existing resources in range.
     *              -1: if the operation is cancelled.
     */
    public int replaceInRange(ResourceProperty self, Resource existingResouce, Resource newResource) {
    	this.self = self;
    	this.existingResouce = existingResouce;
    	this.newResource = newResource;
    	this.replaceInRange = -1;
        ReplaceDialog dialog = new ReplaceDialog(Display.getCurrent().getActiveShell());
        int status = dialog.open();
        if (status == Dialog.OK) {
            return this.replaceInRange;
        }
        return -1;
    }

    class ReplaceDialog extends Dialog {
        public ReplaceDialog(Shell parentShell) {
            super(parentShell);
        }

        @Override
        protected Control createDialogArea(Composite parent) {
            Composite container = (Composite) super.createDialogArea(parent);
            
            Label label = new Label (container, SWT.NONE);
            label.setText ("You are changing the range of the '" + self.getName() + "' Property. Please choose one of the following alternatives:");
            
            Button replaceInRangeButton = new Button(container, SWT.RADIO);
            replaceInRangeButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
            replaceInRangeButton.setText("Replace '" + existingResouce.getName() + "' with '" + newResource.getName() + "' in the range.");
            //replaceInRangeButton.setToolTipText("");
            replaceInRangeButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (replaceInRangeButton.getSelection()) {
                        replaceInRange = 1;
                    }
                }
            });

            Button addToRangeButton = new Button(container, SWT.RADIO);
            addToRangeButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
            addToRangeButton.setText("Add '" + newResource.getName() + "' to the range.");
            addToRangeButton.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (addToRangeButton.getSelection()) {
                        replaceInRange = 0;
                    }
                }
            });

            return container;
        }

        @Override
        protected void configureShell(Shell newShell) {
            super.configureShell(newShell);
            newShell.setText("Confirm Decision");
        }

        @Override
        protected Point getInitialSize() {
            return new Point(500, 170);
        }

    }
}