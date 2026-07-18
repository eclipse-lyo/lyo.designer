package org.eclipse.lyo.tools.adaptormodel.server.servlet;

import java.io.IOException;
import java.io.Reader;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.eclipse.lyo.tools.adaptormodel.server.ModelException;
import org.eclipse.lyo.tools.adaptormodel.server.service.ModelService;

/**
 * Minimal Model Context Protocol (MCP) server over JSON-RPC 2.0, mounted at
 * {@code /mcp}. It exposes the model operations as MCP "tools" so that an LLM
 * agent can build an Adaptor Interface model.
 *
 * <p>
 * Supported methods: {@code initialize}, {@code ping}, {@code tools/list},
 * {@code tools/call}.
 * </p>
 */
public class McpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final ModelService service = new ModelService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        debug("POST " + request.getRequestURI());
        JsonObject body;
        try (Reader reader = request.getReader()) {
            body = JsonParser.parseReader(reader).getAsJsonObject();
        }

        String method = body.has("method") ? body.get("method").getAsString() : "";
        JsonObject params = body.has("params") && body.get("params").isJsonObject() ? body.getAsJsonObject("params")
                : new JsonObject();
        JsonElement id = body.has("id") ? body.get("id") : JsonNull.INSTANCE;

        JsonObject result = new JsonObject();
        JsonObject error = null;
        try {
            switch (method) {
                case "initialize":
                    result.addProperty("protocolVersion", "2024-11-05");
                    JsonObject capabilities = new JsonObject();
                    capabilities.add("tools", new JsonObject());
                    result.add("capabilities", capabilities);
                    JsonObject serverInfo = new JsonObject();
                    serverInfo.addProperty("name", "lyo-adaptor-model-mcp");
                    serverInfo.addProperty("version", "7.0.0");
                    result.add("serverInfo", serverInfo);
                    break;
                case "ping":
                    // empty result
                    break;
                case "tools/list":
                    result.add("tools", toolsList());
                    break;
                case "tools/call":
                    result.add("content", toolsCall(params));
                    break;
                default:
                    error = new JsonObject();
                    error.addProperty("code", -32601);
                    error.addProperty("message", "Method not found: " + method);
            }
        } catch (ModelException e) {
            debug("MCP error (ModelException): " + e.getMessage());
            error = new JsonObject();
            error.addProperty("code", -32000);
            error.addProperty("message", e.getMessage());
        } catch (Exception e) {
            debug("MCP error: " + e);
            error = new JsonObject();
            error.addProperty("code", -32000);
            error.addProperty("message", e.toString());
        }

        JsonObject out = new JsonObject();
        out.addProperty("jsonrpc", "2.0");
        out.add("id", id);
        if (error != null) {
            out.add("error", error);
        } else {
            out.add("result", result);
        }
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(out.toString());
    }

    private JsonArray toolsList() {
        JsonArray tools = new JsonArray();

        tools.add(tool("list_metamodel", "List the Adaptor Interface metamodel (element types and their features).",
                objectSchema()));

        JsonObject getElementProps = objectSchema();
        getElementProps.add("fragment", stringProperty("Fragment id of the element to read."));
        tools.add(tool("get_element", "Read a single element by its fragment id.", getElementProps));

        JsonObject queryProps = objectSchema();
        queryProps.add("type", stringProperty("Optional element type filter, e.g. WebService."));
        queryProps.add("fullTextSearch", stringProperty("Optional case-insensitive text match on name/title/id."));
        tools.add(tool("query_elements", "List elements, optionally filtered by type or text.", queryProps));

        JsonObject createProps = objectSchema();
        createProps.add("type", stringProperty("Element type to create, e.g. WebService, ServiceProvider, Service, Resource, ResourceProperty, ShaclShape, ShaclProperty, Store, ..."));
        createProps.add("containerFragment", stringProperty("Fragment id of the container element (omit to create the AdaptorInterface root)."));
        createProps.add("containmentFeature", stringProperty("Optional explicit containment feature name (required for ambiguous containers, e.g. Dialog under Service)."));
        createProps.add("attributes", objectProperty("Map of attribute name -> value."));
        createProps.add("references", objectProperty("Map of reference name -> array of target fragment ids."));
        tools.add(tool("create_element", "Create a new element of the given type under a container.", createProps));

        JsonObject updateProps = objectSchema();
        updateProps.add("fragment", stringProperty("Fragment id of the element to update."));
        updateProps.add("attributes", objectProperty("Map of attribute name -> value."));
        updateProps.add("references", objectProperty("Map of reference name -> array of target fragment ids."));
        tools.add(tool("update_element", "Update attributes/references of an existing element.", updateProps));

        JsonObject deleteProps = objectSchema();
        deleteProps.add("fragment", stringProperty("Fragment id of the element to delete."));
        tools.add(tool("delete_element", "Delete an element (removes it from its container).", deleteProps));

        JsonObject statusProps = objectSchema();
        tools.add(tool("server_status",
                "Report runtime diagnostics: number of open Sirius sessions, whether an AdaptorInterface editing domain was found, resource count, etc.",
                statusProps));

        return tools;
    }

    private JsonArray toolsCall(JsonObject params) {
        String name = params.has("name") ? params.get("name").getAsString() : "";
        JsonObject args = params.has("arguments") && params.get("arguments").isJsonObject()
                ? params.getAsJsonObject("arguments")
                : new JsonObject();
        JsonElement result;
        switch (name) {
            case "list_metamodel":
                result = service.metamodel();
                break;
            case "get_element":
                result = service.getElement(reqStr(args, "fragment"));
                break;
            case "query_elements":
                result = service.query(optStr(args, "type"), optStr(args, "fullTextSearch"));
                break;
            case "create_element":
                result = service.create(args);
                break;
            case "update_element":
                service.update(reqStr(args, "fragment"), args);
                result = new JsonObject();
                break;
            case "delete_element":
                service.delete(reqStr(args, "fragment"));
                result = new JsonObject();
                break;
            case "server_status":
                result = service.diagnostics();
                break;
            default:
                throw new ModelException("Unknown tool: " + name);
        }

        JsonArray content = new JsonArray();
        JsonObject text = new JsonObject();
        text.addProperty("type", "text");
        text.addProperty("text", result.toString());
        content.add(text);
        return content;
    }

    private static void debug(String message) {
        System.out.println("[AdaptorModelServer][mcp] " + message);
    }

    // ---- schema helpers ----

    private static JsonObject tool(String name, String description, JsonObject properties) {
        JsonObject tool = new JsonObject();
        tool.addProperty("name", name);
        tool.addProperty("description", description);
        JsonObject schema = new JsonObject();
        schema.addProperty("type", "object");
        schema.add("properties", properties);
        tool.add("inputSchema", schema);
        return tool;
    }

    private static JsonObject objectSchema() {
        JsonObject schema = new JsonObject();
        schema.addProperty("type", "object");
        schema.add("properties", new JsonObject());
        return schema;
    }

    private static JsonObject stringProperty(String description) {
        JsonObject property = new JsonObject();
        property.addProperty("type", "string");
        property.addProperty("description", description);
        return property;
    }

    private static JsonObject objectProperty(String description) {
        JsonObject property = new JsonObject();
        property.addProperty("type", "object");
        property.addProperty("description", description);
        return property;
    }

    private static String reqStr(JsonObject args, String key) {
        if (!args.has(key) || args.get(key).isJsonNull()) {
            throw new ModelException("Missing required argument: " + key);
        }
        return args.get(key).getAsString();
    }

    private static String optStr(JsonObject args, String key) {
        if (!args.has(key) || args.get(key).isJsonNull()) {
            return null;
        }
        return args.get(key).getAsString();
    }
}
