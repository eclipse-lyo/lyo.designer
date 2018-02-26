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

package org.eclipse.lyo.tools.emf2rdf.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Properties;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.lyo.oslc4j.core.model.IResource;
import org.eclipse.lyo.store.Store;
import org.eclipse.lyo.store.StoreAccessException;
import org.eclipse.lyo.store.internals.SparqlStoreImpl;
import org.eclipse.lyo.tools.emf2rdf.constants.ExportConstants;
import org.eclipse.lyo.tools.emf2rdf.wizard.TripleStoreDetailsPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Yash Khatri
 * @version $version-stub$
 * @since 2.4.0-SNAPSHOT
 */
public class Utils {

    static Properties props = new Properties();
    static IFile ifile;
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
    private static String exportDestination = System.getProperty(ExportConstants.EXPORT_DESTINATION);
    public static String namedGraphUri = "";
    public static String sparqlUpdateEndPoint = "";
    public static String username = "";
    public static String password = "";

    public static IFile getIfile() {
        return ifile;
    }

    public static void setIfile(IFile ifile) {
        Utils.ifile = ifile;
    }

    /**
     * <p>
     * This method is used for creating the file.
     *
     * @param {@link
     *            Model} The model that has to be printed in a file.
     * @throws {@link
     *             FileNotFoundException} Throws when the file is not found.
     */
    public static String serialiseModelAsTurtle(Model outModel, String outputFileName) throws FileNotFoundException {

        if (outputFileName == null) {
            return Status.CANCEL.toString();
        }
        if (outModel != null) {
            LOGGER.info("creating output file.");
            // Get the file extension from here and set to writer
            checkIfFileExtensionExists(outputFileName);
            String rdfFormat = getRDFFormat(outputFileName);
            FileOutputStream output = new FileOutputStream(new File(outputFileName));
            outModel.write(output, rdfFormat);
            LOGGER.info("file \"{}\" created.", outputFileName);
            return Status.SUCCESSFUL.toString();

        } else {
            LOGGER.info("output JenaModel or filename is null {} {}. file not created", outModel, outputFileName);
            return Status.UNSUCCESSFUL.toString();
        }

    }

    private static String getRDFFormat(String outputFileName) {

        if (outputFileName != null) {
            if (outputFileName.toLowerCase().endsWith(".ttl")) {
                return Lang.TURTLE.getName();
            } else if (outputFileName.toLowerCase().endsWith(".nt")) {
                return Lang.NTRIPLES.getName();
            } else if (outputFileName.toLowerCase().endsWith(".rdf")) {
                return Lang.RDFXML.getName();
            } else {
                // Return Turtle by default.
                return Lang.TURTLE.getName();
            }
        }
        return null;
    }

    private static String checkIfFileExtensionExists(String outputFileName) {
        if (outputFileName != null && (!outputFileName.toLowerCase().endsWith(".ttl")
                || !outputFileName.toLowerCase().endsWith(".nt") || !outputFileName.toLowerCase().endsWith(".rdf"))) {
            return outputFileName + ".ttl";
        } else {
            return outputFileName;
        }

    }

    public static String validateURL(String urlString) {
        if (!urlString.startsWith("http://")) {
            return "http://" + urlString;
        } else {
            return urlString;
        }
    }

    public static void informUser(String message) {
        LOGGER.info("Informing User {} ", message);
        if (null != Display.getCurrent()) {
            MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Info", message);
        } else {
            LOGGER.info("No Display found. Message {}", message);
        }
    }

    public static String promptForFileName(String message, String location) {
        LOGGER.info("Prompted for asking file name.");
        String filePath = "turtlefiles/export.ttl";
        if (null != Display.getCurrent()) {
            Shell shell = Display.getCurrent().getActiveShell();
            shell.open();
            FileDialog dialog = new FileDialog(shell, SWT.SAVE);
            dialog.setText(message);
            dialog.setFilterNames(new String[] { Lang.TURTLE.getName() + " (*.ttl)",
                    Lang.NTRIPLES.getName() + " (*.nt)", Lang.RDFXML.getName() + " (*.rdf)" });
            dialog.setFilterExtensions(new String[] { "*.ttl", "*.nt", "*.rdf" }); // Windows wild cards
            dialog.setFilterPath(location); // Windows path
            dialog.setFileName("export.ttl");
            filePath = dialog.open();
            LOGGER.info("Selected file path by user: {} ", filePath);
        } else {
            LOGGER.info("No Display found. Filepath {} ", filePath);
        }
        return filePath;
    }

    public static String[] promptForResourceOrShaclShape() {
        String[] elements = { ExportConstants.OSLC_SHAPE, ExportConstants.SHACL_SHAPE };
        String message = "Select the type of shape for exporting Specification Diagram.";
        ListSelectionDialog dialog = new ListSelectionDialog(Display.getCurrent().getActiveShell(), elements,
                ArrayContentProvider.getInstance(), new LabelProvider(), message);
        dialog.setTitle("Exporting Specification Diagram");
        dialog.setInitialSelections(elements);
        dialog.setHelpAvailable(true);
        // user pressed cancel
        if (dialog.open() != Window.OK) {
            return null;
        }
        Object[] objectArray = dialog.getResult();
        String[] result = Arrays.copyOf(objectArray, objectArray.length, String[].class);

        return result;
    }

    public static String getModellingProjectBaseFolder() {
        try {
            return ifile.getProject().getLocation().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getExportDestination() {
        return exportDestination;
    }

    public static void setExportDestination(String exportDestination) {
        Utils.exportDestination = exportDestination;
    }

    public static void createPropertiesFile(TripleStoreDetailsPage tripleStoreDetailsPage) {
        try {
            Properties props = new Properties();
            props.setProperty(ExportConstants.SPARQL_UPDATE_END_POINT,
                    tripleStoreDetailsPage.getSparqlUpdateEndPointText());
            props.setProperty(ExportConstants.GRAPH_NAME, tripleStoreDetailsPage.getnamedGraphUriText());
            props.setProperty(ExportConstants.USERNAME, tripleStoreDetailsPage.getUserNameText());
            props.setProperty(ExportConstants.PASSWORD, tripleStoreDetailsPage.getUserNameText());
            props.store(
                    new FileOutputStream(new File(getModellingProjectBaseFolder().toString() + "/store.properties")),
                    "Triple Store Details");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    public static String saveModeltoTripleStore(Model model) {
        if (model != null) {
            Properties props = new Properties();
            try {
                props.load(new FileInputStream(getModellingProjectBaseFolder().toString() + "/store.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String graphName = props.getProperty(ExportConstants.GRAPH_NAME);
            String sparqlUpdateEndPoint = props.getProperty(ExportConstants.SPARQL_UPDATE_END_POINT);
            String userName = props.getProperty(ExportConstants.USERNAME);
            String password = props.getProperty(ExportConstants.PASSWORD);

            SimpleAuthenticator authenticator = new SimpleAuthenticator("admin", "admin".toCharArray());
            DatasetAccessor accessor = DatasetAccessorFactory.createHTTP(sparqlUpdateEndPoint, authenticator);
            accessor.add(model);

            // insertJenaModel(graphName, model);

            return Status.SUCCESSFUL.toString();
        } else {
            LOGGER.info("output JenaModel is null {}", model);
            return Status.UNSUCCESSFUL.toString();
        }
    }
    */

    public static String savetoTripleStore(IResource... resources) {
        if (null != resources) {

            populateStoreDetails();

            Store store = new SparqlStoreImpl(sparqlUpdateEndPoint, sparqlUpdateEndPoint, username, password);

            try {
                store.<IResource>updateResources(new URI(namedGraphUri), resources);
            } catch (StoreAccessException | URISyntaxException e) {
                e.printStackTrace();
                return Status.UNSUCCESSFUL.toString();
            }
        } else {
            LOGGER.info("Vocabulary Resources to Save are null -> " + resources);
            return Status.UNSUCCESSFUL.toString();
        }
        return Status.SUCCESSFUL.toString();
    }

    public static void populateStoreDetails(){
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(getModellingProjectBaseFolder().toString() + "/store.properties"));
            namedGraphUri = props.getProperty(ExportConstants.GRAPH_NAME);
            sparqlUpdateEndPoint = props.getProperty(ExportConstants.SPARQL_UPDATE_END_POINT);
            username = props.getProperty(ExportConstants.USERNAME);
            password = props.getProperty(ExportConstants.PASSWORD);
        } catch (IOException e) {
            namedGraphUri = "";
            sparqlUpdateEndPoint = "";
            username = "";
            password = "";
            LOGGER.info("FileNotFoundException. File store.properties doesnot exist.");
        }
    }

}
