package org.eclipse.lyo.tools.adaptormodel.server;

/**
 * Runtime exception used to signal model-API errors (missing session, unknown
 * type, invalid reference, etc.). Carried to the HTTP/MCP layer as a 4xx error.
 */
public class ModelException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ModelException(String message) {
        super(message);
    }

    public ModelException(String message, Throwable cause) {
        super(message, cause);
    }
}
