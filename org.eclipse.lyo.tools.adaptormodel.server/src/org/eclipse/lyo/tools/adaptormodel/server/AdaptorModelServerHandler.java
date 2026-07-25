package org.eclipse.lyo.tools.adaptormodel.server;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Workbench command handler that toggles the embedded Adaptor Model server.
 * Bound to a toolbar button / menu item via plugin.xml.
 */
public class AdaptorModelServerHandler extends AbstractHandler {

    private static boolean serverRuns = false;
    private static Thread serverThread;
    private static final String DEFAULT_PORT = "8080";

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        if (!serverRuns) {
            return showStartOption(event, window);
        }
        return showStopOption(event, window);
    }

    private Object showStartOption(ExecutionEvent event, IWorkbenchWindow window) throws ExecutionException {
        InputDialog dialog = new InputDialog(HandlerUtil.getActiveShellChecked(event), "Adaptor Model Server",
                "Start the Adaptor Model (MCP/REST) server on the specified port:", DEFAULT_PORT,
                new IInputValidator() {
                    @Override
                    public String isValid(String newText) {
                        return isPort(newText) ? null : "Please insert a valid port number.";
                    }
                });
        if (dialog.open() != Window.OK) {
            return null;
        }
        int port = Integer.parseInt(dialog.getValue().trim());
        serverThread = new Thread(new AdaptorModelServer(port));
        serverThread.start();
        serverRuns = true;
        MessageDialog.openInformation(window.getShell(), "Adaptor Model Server",
                "Server is running on port " + port + ".");
        return null;
    }

    private Object showStopOption(ExecutionEvent event, IWorkbenchWindow window) {
        if (!MessageDialog.openQuestion(window.getShell(), "Adaptor Model Server",
                "Server is running. Do you want to stop it?")) {
            return null;
        }
        serverThread.interrupt();
        serverRuns = false;
        MessageDialog.openInformation(window.getShell(), "Adaptor Model Server", "Server stopped.");
        return null;
    }

    private static boolean isPort(String text) {
        text = text.trim();
        if (text.length() < 1 || text.length() > 5) {
            return false;
        }
        try {
            int value = Integer.parseInt(text);
            return value > 0 && value <= 65535;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
