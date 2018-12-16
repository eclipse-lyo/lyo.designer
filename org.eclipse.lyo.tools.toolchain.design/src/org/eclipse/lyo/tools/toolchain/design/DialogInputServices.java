/*******************************************************************************
 * Copyright (c) 2017 Jad El-khoury.
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
 *     Jad El-khoury        - Migrating complex queries into mtl files.
 *     
 *******************************************************************************/
package org.eclipse.lyo.tools.toolchain.design;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;

public class DialogInputServices {

	public DialogInputServices() {
	}

	public void showMessage(EObject self, String title, String message) {
		String[] buttonLabels = {"OK"};
		MessageDialog dialog = new MessageDialog(Display.getCurrent().getActiveShell(), title, null, message, MessageDialog.NONE, buttonLabels , 1);
		dialog.open();
		return;
	}

	public String promptForString(EObject self, String title, String message, String initialValue) {
		
		ServiceProviderCatalog x = new ServiceProviderCatalog();

		InputDialog dlg = new InputDialog(Display.getCurrent().getActiveShell(), title, message, initialValue, null);
        if (dlg.open() == Window.OK) {
            return dlg.getValue();
        } else {
            return null;
        }
    }

	public String promptForFolder(EObject self, String title, String message, String initialFolder) {
		DirectoryDialog dialog = new DirectoryDialog(Display.getCurrent().getActiveShell());
		dialog.setFilterPath(initialFolder);
		dialog.setMessage(message);
		dialog.setText(title);
		String result = dialog.open();
		return result;
	}

}
