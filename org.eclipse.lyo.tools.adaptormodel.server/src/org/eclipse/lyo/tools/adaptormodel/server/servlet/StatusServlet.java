package org.eclipse.lyo.tools.adaptormodel.server.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.lyo.tools.adaptormodel.server.session.ModelSessionProvider;

/**
 * Serves a small HTML landing page at {@code /} describing the available
 * endpoints, plus a quick model-session connectivity indicator.
 */
public class StatusServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean hasSession = ModelSessionProvider.INSTANCE.findEditingDomain() != null;
        StringBuilder html = new StringBuilder();
        html.append("<html><body style='font-family:sans-serif'>");
        html.append("<h1>Lyo Adaptor Model &mdash; MCP / REST Server</h1>");
        html.append("<p>Model session: <b>")
                .append(hasSession ? "connected" : "not found &mdash; open the AdaptorInterface diagram")
                .append("</b></p>");
        html.append("<h2>REST API</h2><ul>");
        html.append("<li><code>GET /api/metamodel</code></li>");
        html.append("<li><code>GET /api/status</code></li>");
        html.append("<li><code>GET /api/elements?type=&amp;fullTextSearch=</code></li>");
        html.append("<li><code>GET /api/elements/{fragment}</code></li>");
        html.append("<li><code>POST /api/elements</code> &mdash; create</li>");
        html.append("<li><code>PUT /api/elements/{fragment}</code> &mdash; update</li>");
        html.append("<li><code>DELETE /api/elements/{fragment}</code> &mdash; delete</li>");
        html.append("</ul><h2>MCP</h2><ul>");
        html.append("<li><code>POST /mcp</code> &mdash; JSON-RPC (initialize, tools/list, tools/call)</li>");
        html.append("</ul></body></html>");
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(html.toString());
    }
}
