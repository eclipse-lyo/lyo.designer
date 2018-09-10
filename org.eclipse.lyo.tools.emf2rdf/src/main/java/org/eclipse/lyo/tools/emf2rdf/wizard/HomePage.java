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


import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.lyo.tools.emf2rdf.constants.ExportConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */
public class HomePage extends WizardPage {
    private Button[] radios;
    private boolean enableNext = false;

    private Composite container;

    public boolean isfileSelected = false;

    public HomePage() {
        super("HomePage");
        setTitle("Select export destination");
        setDescription("Export model to a file or a triple store");
        
    }

    @Override
    public void createControl(Composite parent) {
        container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);

        GridData gd = new GridData(GridData.FILL_BOTH);

        radios = new Button[2];
        Button fileButton = new Button(container, SWT.RADIO);
        fileButton.setText(ExportConstants.FILE);
        fileButton.setLayoutData(gd);
        fileButton.setFocus();
        fileButton.setToolTipText("Select this to export model to a file.");

        Button tripleStoreButton = new Button(container, SWT.RADIO);
        tripleStoreButton.setText(ExportConstants.TRIPLESTORE);
        tripleStoreButton.setLayoutData(gd);
        tripleStoreButton.setToolTipText("Select this to export model to a triple store.");
        tripleStoreButton.setLocation(-1, -1);

        radios[0] = fileButton;
        radios[1] = tripleStoreButton;

        fileButton.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                if (fileButton.getSelection()) {
                    ExportDestinationWizard wizard = (ExportDestinationWizard) getWizard();
                    enableNext = true;
                    isfileSelected = true;
                    canFlipToNextPage();
                    setPageComplete(false);
                    TripleStoreDetailsPage tripleStoreDetailsPage = (TripleStoreDetailsPage) getWizard().getContainer()
                            .getCurrentPage().getNextPage();
                    if (null != tripleStoreDetailsPage) {
                        tripleStoreDetailsPage.setPageComplete(true);
                    }
                    wizard.getContainer().updateButtons();
                    wizard.setDestination(ExportConstants.FILE);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("MMEE");

            }
        });

        tripleStoreButton.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                if (tripleStoreButton.getSelection()) {

                    ExportDestinationWizard wizard = (ExportDestinationWizard) getWizard();
                    enableNext = true;
                    isfileSelected = false;
                    canFlipToNextPage();
                    setPageComplete(false);
                    wizard.getContainer().updateButtons();
                    wizard.setDestination(ExportConstants.TRIPLESTORE);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub

            }
        });

        // required to avoid an error in the system
        setControl(container);
        setPageComplete(true);

    }

    @Override
    public boolean canFlipToNextPage() {
        return enableNext;
    }

    public Button[] getRadios() {
        return radios;
    }

    public void setRadios(Button[] radios) {
        this.radios = radios;
    }
}