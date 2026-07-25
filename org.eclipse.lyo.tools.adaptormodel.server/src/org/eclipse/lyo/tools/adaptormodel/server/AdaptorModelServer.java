package org.eclipse.lyo.tools.adaptormodel.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import org.eclipse.lyo.tools.adaptormodel.server.servlet.McpServlet;
import org.eclipse.lyo.tools.adaptormodel.server.servlet.RestApiServlet;
import org.eclipse.lyo.tools.adaptormodel.server.servlet.StatusServlet;

/**
 * Embedded Jetty server (runs inside the Eclipse workbench, in a worker
 * thread). Mirrors the Capella reference server but exposes the live Adaptor
 * Interface model via the REST and MCP endpoints.
 */
public class AdaptorModelServer implements Runnable {

    private final int port;

    public AdaptorModelServer(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        runServer(port);
    }

    public void runServer(int serverPort) {
        Server server = new Server(serverPort);
        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(StatusServlet.class, "/");
        handler.addServletWithMapping(RestApiServlet.class, "/api/*");
        handler.addServletWithMapping(McpServlet.class, "/mcp");
        server.setHandler(handler);
        try {
            server.start();
            System.out.println("Adaptor Model Server started on port " + serverPort);
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                server.stop();
                server.destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Adaptor Model Server stopped");
        }
    }
}
