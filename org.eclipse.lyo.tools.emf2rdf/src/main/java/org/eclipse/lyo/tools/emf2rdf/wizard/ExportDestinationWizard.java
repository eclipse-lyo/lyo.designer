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
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.lyo.tools.emf2rdf.constants.ExportConstants;
import org.eclipse.lyo.tools.emf2rdf.helper.Utils;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */

public class ExportDestinationWizard extends Wizard {

    protected HomePage homePage;
    protected TripleStoreDetailsPage tripleStoreDetailsPage;
    protected String destination = ExportConstants.FILE;
    protected boolean isNextPageAdded;

    public ExportDestinationWizard() {
        super();
        setNeedsProgressMonitor(true);
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page == homePage) {
            if (destination.equals(ExportConstants.TRIPLESTORE)) {
                setForcePreviousAndNextButtons(false);
                if (!isNextPageAdded) {
                    addPage(tripleStoreDetailsPage);
                    setNextPageAdded(true);
                }
            }
        }
        return super.getNextPage(page);
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TripleStoreDetailsPage getTripleStoreDetailsPage() {
        return tripleStoreDetailsPage;
    }

    public void setTripleStoreDetailsPage(TripleStoreDetailsPage tripleStoreDetailsPage) {
        this.tripleStoreDetailsPage = tripleStoreDetailsPage;
    }

    public boolean isNextPageAdded() {
        return isNextPageAdded;
    }

    public void setNextPageAdded(boolean isNextPageAdded) {
        this.isNextPageAdded = isNextPageAdded;
    }

    @Override
    public String getWindowTitle() {
        return "Export to RDF...";
    }

    @Override
    public void addPages() {
        homePage = new HomePage();
        addPage(homePage);
        tripleStoreDetailsPage = new TripleStoreDetailsPage();
        setForcePreviousAndNextButtons(true);
    }

    @Override
    public boolean performFinish() {
        Utils.setExportDestination(destination);
        if (ExportConstants.TRIPLESTORE.equalsIgnoreCase(destination)) {
            Utils.createPropertiesFile(tripleStoreDetailsPage);
        }
        return true;
    }

}