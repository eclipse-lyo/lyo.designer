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
package org.eclipse.lyo.tools.emf2rdf.wizard;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.lyo.tools.emf2rdf.constants.ExportConstants;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ExportWizardDialog extends WizardDialog {
    
    public ExportWizardDialog(Shell parentShell, IWizard newWizard) {
        super(parentShell, newWizard);
    }

    /*
     * Overriding nextPressed method.
     */
    @Override
    public void nextPressed() {
       if(getCurrentPage().getName().equalsIgnoreCase(ExportConstants.HOME_PAGE)) {
           HomePage currentActivePage = (HomePage) getCurrentPage();
           if (currentActivePage.isfileSelected) {
               //Finishing the wizard tasks on next button. 
               currentActivePage.getWizard().performFinish();
               currentActivePage.getWizard().dispose();
               Display.getCurrent().getActiveShell().dispose();
           } else {
               super.nextPressed();
           }
       } else {
           TripleStoreDetailsPage currentActivePage = (TripleStoreDetailsPage) getCurrentPage();
           //Finishing the wizard tasks on next button.
           currentActivePage.getWizard().performFinish();
           currentActivePage.getWizard().dispose();
           Display.getCurrent().getActiveShell().dispose();
       }
    }

    /*
     * 
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        super.createButtonsForButtonBar(parent);
        Button finish = getButton(IDialogConstants.FINISH_ID);
        finish.setVisible(false);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.exclude = true;
        finish.setLayoutData(gd);
    }
}
