package org.eclipse.lyo.tools.toolchain.design;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import org.eclipse.emf.ecore.EObject;

public class DialogInputServices {

	public DialogInputServices() {
	}

	public String promptForString(EObject self, String title, String message, String initialValue) {
        InputDialog dlg = new InputDialog(Display.getCurrent().getActiveShell(), title, message, initialValue, null);
        if (dlg.open() == Window.OK) {
            return dlg.getValue();
        } else {
            return null;
        }
    }
}
