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
package org.eclipse.lyo.tools.common.utils;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.emf.ecore.EObject;

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
