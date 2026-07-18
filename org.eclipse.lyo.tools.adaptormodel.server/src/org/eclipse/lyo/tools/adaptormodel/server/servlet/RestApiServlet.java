package org.eclipse.lyo.tools.adaptormodel.server.servlet;

import java.io.IOException;
import java.io.Reader;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.eclipse.lyo.tools.adaptormodel.server.ModelException;
import org.eclipse.lyo.tools.adaptormodel.server.service.ModelService;
import org.eclipse.lyo.tools.adaptormodel.server.session.ModelSessionProvider;

/**
 * REST API mounted under {@code /api}.
 *
 * <ul>
 *   <li>GET  /api/metamodel</li>
 *   <li>GET  /api/status</li>
 *   <li>GET  /api/elements?type=&amp;fullTextSearch=</li>
 *   <li>GET  /api/elements/{fragment}</li>
 *   <li>POST /api/elements            (create)</li>
 *   <li>PUT  /api/elements/{fragment} (update)</li>
 *   <li>DELETE /api/elements/{fragment}</li>
 * </ul>
 */
public class RestApiServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final ModelService service = new ModelService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = strip(request);
        debug(request.getMethod() + " " + request.getRequestURI());
        try {
            if (path.equals("/metamodel") || path.equals("/metamodel/")) {
                ok(response, service.metamodel());
            } else if (path.equals("/status") || path.equals("/status/")) {
                JsonObject status = new JsonObject();
                status.addProperty("status", "up");
                JsonObject diag = service.diagnostics();
                for (Map.Entry<String, JsonElement> e : diag.entrySet()) {
                    status.add(e.getKey(), e.getValue());
                }
                ok(response, status);
            } else if (path.equals("/roots") || path.equals("/roots/")) {
                ok(response, service.roots());
            } else if (path.equals("/elements") || path.equals("/elements/")) {
                ok(response,
                        service.query(request.getParameter("type"), request.getParameter("fullTextSearch")));
            } else if (path.startsWith("/elements/")) {
                String fragment = decode(path.substring("/elements/".length()));
                ok(response, service.getElement(fragment));
            } else {
                error(response, HttpServletResponse.SC_NOT_FOUND, "Unknown path: " + path);
            }
        } catch (ModelException e) {
            debug("GET " + path + " -> 400: " + e.getMessage());
            error(response, HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        } catch (Exception e) {
            debug("GET " + path + " -> 500: " + e);
            error(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = strip(request);
        debug(request.getMethod() + " " + request.getRequestURI());
        if (!path.equals("/elements") && !path.equals("/elements/")) {
            error(response, HttpServletResponse.SC_NOT_FOUND, "POST is only supported on /api/elements");
            return;
        }
        try {
            ok(response, service.create(parse(request)));
        } catch (ModelException e) {
            debug("POST " + path + " -> 400: " + e.getMessage());
            error(response, HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        } catch (Exception e) {
            debug("POST " + path + " -> 500: " + e);
            error(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.toString());
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = strip(request);
        debug(request.getMethod() + " " + request.getRequestURI());
        if (!path.startsWith("/elements/")) {
            error(response, HttpServletResponse.SC_NOT_FOUND, "PUT is only supported on /api/elements/{fragment}");
            return;
        }
        try {
            String fragment = decode(path.substring("/elements/".length()));
            service.update(fragment, parse(request));
            ok(response, new JsonObject());
        } catch (ModelException e) {
            debug("PUT " + path + " -> 400: " + e.getMessage());
            error(response, HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        } catch (Exception e) {
            debug("PUT " + path + " -> 500: " + e);
            error(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.toString());
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = strip(request);
        debug(request.getMethod() + " " + request.getRequestURI());
        if (!path.startsWith("/elements/")) {
            error(response, HttpServletResponse.SC_NOT_FOUND, "DELETE is only supported on /api/elements/{fragment}");
            return;
        }
        try {
            String fragment = decode(path.substring("/elements/".length()));
            service.delete(fragment);
            ok(response, new JsonObject());
        } catch (ModelException e) {
            debug("DELETE " + path + " -> 400: " + e.getMessage());
            error(response, HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        } catch (Exception e) {
            debug("DELETE " + path + " -> 500: " + e);
            error(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.toString());
        }
    }

    private static void debug(String message) {
        System.out.println("[AdaptorModelServer][rest] " + message);
    }

    private static String strip(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String contextPath = request.getContextPath();
        if (contextPath != null && uri.startsWith(contextPath)) {
            uri = uri.substring(contextPath.length());
        }
        if (uri.startsWith("/api")) {
            uri = uri.substring("/api".length());
        }
        return uri.isEmpty() ? "/" : uri;
    }

    private static String decode(String value) throws IOException {
        return URLDecoder.decode(value, StandardCharsets.UTF_8.name());
    }

    private static JsonObject parse(HttpServletRequest request) throws IOException {
        try (Reader reader = request.getReader()) {
            return JsonParser.parseReader(reader).getAsJsonObject();
        }
    }

    private static void ok(HttpServletResponse response, JsonObject json) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(json.toString());
    }

    private static void ok(HttpServletResponse response, JsonArray json) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(json.toString());
    }

    private static void error(HttpServletResponse response, int code, String message) throws IOException {
        response.setContentType("application/json");
        response.setStatus(code);
        JsonObject json = new JsonObject();
        json.addProperty("error", message);
        response.getWriter().println(json.toString());
    }
}
