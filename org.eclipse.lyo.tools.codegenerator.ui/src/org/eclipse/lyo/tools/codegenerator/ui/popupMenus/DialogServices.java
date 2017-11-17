package org.eclipse.lyo.tools.codegenerator.ui.popupMenus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Properties;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.lyo.tools.codegenerator.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * Codegenerator code generation.
 */
public class DialogServices {
	
	public static void showMessage(String title, String message) {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
		        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				String[] buttonLabels = {"OK"};
				MessageDialog dialog = new MessageDialog(shell, title, null, message, MessageDialog.NONE, buttonLabels , 1);
				dialog.open();
			}
		});
		return;
	}
	
	public static String promptForFolder(String title, String message, String initialFolder) {
		class DirectoryDialogThread implements Runnable {
			String title;
			String message;
			String initialFolder;
			String selectedFolder;
			
			public String getSelectedFolder() {
				return selectedFolder;
			}

			public DirectoryDialogThread(String t, String m, String i) {
		       title = t;
		       message = m;
		       initialFolder = i;
		   }

		   public void run() {
		        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				DirectoryDialog dialog = new DirectoryDialog(shell, SWT.OPEN);
				dialog.setFilterPath(initialFolder);
				dialog.setMessage(message);
				dialog.setText(title);
				selectedFolder = dialog.open();
		   }
		}

		DirectoryDialogThread dialogThread = new DirectoryDialogThread(title, message, initialFolder);
		PlatformUI.getWorkbench().getDisplay().syncExec(dialogThread);
		return dialogThread.getSelectedFolder();
	}

    public static File getGenerationTargetFolder(File modellingProjectBaseFolder) {

        final String PROPERTIES_FILE_NAME = "generator.properties";
        final String GENERATION_PATH_PROPERTY = "generationPath";

        FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.equals(PROPERTIES_FILE_NAME);
			}
		};
		File[] projectFolderPropertiesFiles = modellingProjectBaseFolder.listFiles(filter);

        String generationPath = null;
		if ((projectFolderPropertiesFiles.length == 1) && !projectFolderPropertiesFiles[0].isDirectory()) {
            Properties props = new Properties();
        	File propertiesFile = projectFolderPropertiesFiles[0];
            try {
				props.load(new FileInputStream(propertiesFile));
			} catch (FileNotFoundException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
	            showMessage("Exception!", "an Exception occurred reading the properties file:\""
	                    + propertiesFile + "\". Please see the error log.");
	            return null;
			} catch (IOException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
	            showMessage("Exception!", "an Exception occurred reading the properties file:\""
                + propertiesFile + "\". Please see the error log.");
				return null;
			}
            generationPath = props.getProperty(GENERATION_PATH_PROPERTY);
        }

        if (generationPath == null || generationPath.length() == 0) {
            generationPath = promptForFolder("Enter Generation Base Folder",
                    "Select the base folder for your generation." + "\n" +
                    "NOTE: To provide a default path, set a \"" + GENERATION_PATH_PROPERTY + "\" property in a \"" + PROPERTIES_FILE_NAME + "\" file, in the same location as your toolchain model.",
                    modellingProjectBaseFolder.toString());
        }

        if (generationPath == null || generationPath.length() == 0) {
            return null;
        }

        File generationPathFile = new File(generationPath);
        if(!generationPathFile.exists() || !generationPathFile.isDirectory()) {
            showMessage("Exception!", "Generation path " + generationPath + " must be an existing directory.");
            return null;
        }
        return generationPathFile;
    }


    public static File getModellingProjectBaseFolder(EObject self) {
        EObject rootContainer = EcoreUtil.getRootContainer(self);
        URI rootUri = EcoreUtil.getURI(rootContainer);
        URI resolvedRootUri = CommonPlugin.resolve(rootUri);
        
        IWorkspace workspace= ResourcesPlugin.getWorkspace();    
        IPath location= Path.fromOSString(resolvedRootUri.toFileString()); 
        IFile ifile= workspace.getRoot().getFileForLocation(location);
        File projectLocation = ifile.getProject().getLocation().toFile();
        return projectLocation;
    }

}