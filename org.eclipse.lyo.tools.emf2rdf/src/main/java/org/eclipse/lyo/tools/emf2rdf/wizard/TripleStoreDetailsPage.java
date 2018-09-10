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

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.lyo.tools.emf2rdf.helper.Utils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

public class TripleStoreDetailsPage extends WizardPage {
    private Text sparqlUpdateEndPointText;
    private Text namedGraphUriText;
    private Text userNameText;
    private Text passwordText;
    Button requiresAuthenticationButton;
    private Composite container;
    public boolean enableNext = false;

    public TripleStoreDetailsPage() {
        super("TripleStoreDetailsPage");
        setTitle("Enter Triple Store Details");
    }

    private void checkIfPageComplete() {
        if (!namedGraphUriText.getText().isEmpty() && !sparqlUpdateEndPointText.getText().isEmpty()) {
            if (requiresAuthenticationButton.getSelection()) {
                if (!userNameText.getText().isEmpty() && !passwordText.getText().isEmpty()) {
                    setPageComplete(true);
                } else {
                    setPageComplete(false);
                }
            } else {
                setPageComplete(true);
            }
        } else {
            setPageComplete(false);
        }
        HomePage homePage = (HomePage) getWizard().getContainer().getCurrentPage().getPreviousPage();
        if(null!=homePage) {
            homePage.setPageComplete(true);
        }
        WizardPage page = (WizardPage) getWizard().getContainer().getCurrentPage();
        if(page.getName().equalsIgnoreCase("HomePage")) {
            page.setPageComplete(true);
        }
    }

    @Override
    public void createControl(Composite parent) {
        container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);

        Label sparqlUpdateEndPointLabel = new Label(container, SWT.NONE);
        sparqlUpdateEndPointLabel.setText("Sparql Update End Point");
        sparqlUpdateEndPointText = new Text(container, SWT.BORDER | SWT.SINGLE);
        sparqlUpdateEndPointText.setText(Utils.sparqlUpdateEndPoint);
        sparqlUpdateEndPointText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                checkIfPageComplete();
                canFlipToNextPage();
                getWizard().getContainer().updateButtons();
            }
        });
        sparqlUpdateEndPointText.setLayoutData(gd);

        Label namedGraphUriLabel = new Label(container, SWT.NONE);
        namedGraphUriLabel.setText("NamedGraph URI");
        namedGraphUriText = new Text(container, SWT.BORDER | SWT.SINGLE);
        namedGraphUriText.setText(Utils.namedGraphUri);
        namedGraphUriText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                checkIfPageComplete();
                canFlipToNextPage();
                getWizard().getContainer().updateButtons();
            }
        });
        namedGraphUriText.setLayoutData(gd);

        Label requiresAuthenticationLabel = new Label(container, SWT.NONE);
        requiresAuthenticationLabel.setText("Requires Authentication");
        requiresAuthenticationButton = new Button(container, SWT.CHECK);
        requiresAuthenticationButton.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                if (requiresAuthenticationButton.getSelection()) {
                    passwordText.setEnabled(true);
                    userNameText.setEnabled(true);

                    checkIfPageComplete();
                    canFlipToNextPage();
                    getWizard().getContainer().updateButtons();

                } else {
                    passwordText.setEnabled(false);
                    userNameText.setEnabled(false);

                    checkIfPageComplete();
                    canFlipToNextPage();
                    getWizard().getContainer().updateButtons();
                }

            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {

            }
        });

        Label usernameLabel = new Label(container, SWT.NONE);
        usernameLabel.setText("Username");

        userNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
        userNameText.setText(Utils.username);
        userNameText.setLayoutData(gd);

        Label passwordLabel = new Label(container, SWT.NONE);
        passwordLabel.setText("Passowrd");

        passwordText = new Text(container, SWT.BORDER | SWT.SINGLE);
        passwordText.setText(Utils.password);
        passwordText.setLayoutData(gd);

        passwordText.setEnabled(false);
        userNameText.setEnabled(false);

        userNameText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                checkIfPageComplete();
                canFlipToNextPage();
                getWizard().getContainer().updateButtons();

            }
        });

        passwordText.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                checkIfPageComplete();
                canFlipToNextPage();
                getWizard().getContainer().updateButtons();
            }
        });

        // required to avoid an error in the system
        setControl(container);
        checkIfPageComplete();
        canFlipToNextPage();
        getWizard().getContainer().updateButtons();
    }

    public String getSparqlUpdateEndPointText() {
        return sparqlUpdateEndPointText.getText();
    }

    public String getUserNameText() {
        return userNameText.getText();
    }

    public String getPasswordText() {
        return passwordText.getText();
    }

    public Button getRequiresAuthenticationButton() {
        return requiresAuthenticationButton;
    }

    public String getnamedGraphUriText() {
        return namedGraphUriText.getText();
    }

    public void setSparqlUpdateEndPointText(Text sparqlUpdateEndPointText) {
        this.sparqlUpdateEndPointText = sparqlUpdateEndPointText;
    }

    public void setUserNameText(Text userNameText) {
        this.userNameText = userNameText;
    }

    public void setPasswordText(Text passwordText) {
        this.passwordText = passwordText;
    }

    public void setnamedGraphUriText(Text namedGraphUriText) {
        this.namedGraphUriText = namedGraphUriText;
    }

    public void setRequiresAuthenticationButton(Button requiresAuthenticationButton) {
        this.requiresAuthenticationButton = requiresAuthenticationButton;
    }

    @Override
    public boolean canFlipToNextPage() {
        return enableNext;
    }
    
    @Override
    public void setPageComplete(boolean complete) {
        super.setPageComplete(complete);
        enableNext = complete;
    }
}