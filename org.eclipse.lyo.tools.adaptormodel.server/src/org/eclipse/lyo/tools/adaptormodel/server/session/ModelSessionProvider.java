package org.eclipse.lyo.tools.adaptormodel.server.session;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.lyo.tools.adaptormodel.server.ModelException;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import adaptorinterface.AdaptorInterface;

import com.google.gson.JsonObject;

/**
 * Locates the live {@link EditingDomain} that backs the open Adaptor Interface
 * model and provides thread-safe read/write helpers.
 *
 * <p>
 * The model is normally open inside a Sirius session (the AdaptorInterface
 * diagram). We therefore first look for an open Sirius {@link Session} whose
 * semantic resources contain an {@link AdaptorInterface} root. As a fallback we
 * look at the active editor (the generated EMF editor also implements
 * {@link IEditingDomainProvider}).
 * </p>
 *
 * <p>
 * Reads are executed inside the editing domain's read transaction
 * ({@link TransactionalEditingDomain#runExclusive(Runnable)}); writes are
 * executed as {@link RecordingCommand}s so that Sirius refreshes and the
 * adapters stay consistent.
 * </p>
 */
public enum ModelSessionProvider {

    INSTANCE;

    public EditingDomain findEditingDomain() {
        EditingDomain result = null;
        int sessionsTotal = 0;
        int sessionsOpen = 0;
        try {
            EditingDomain preferred = null;
            EditingDomain any = null;
            for (Session session : SessionManager.INSTANCE.getSessions()) {
                sessionsTotal++;
                if (!session.isOpen()) {
                    continue;
                }
                sessionsOpen++;
                TransactionalEditingDomain ed = session.getTransactionalEditingDomain();
                if (ed == null) {
                    continue;
                }
                // Make sure lazy-loaded semantic resources are parsed so the
                // AdaptorInterface root is visible in the resource set.
                ensureLoaded(ed.getResourceSet());
                if (containsAdaptorInterface(ed.getResourceSet())) {
                    preferred = ed;
                    break;
                }
                if (any == null && !ed.getResourceSet().getResources().isEmpty()) {
                    any = ed;
                }
            }
            if (preferred != null) {
                result = preferred;
            } else if (any != null) {
                result = any;
            }
            if (result == null && PlatformUI.isWorkbenchRunning()) {
                AtomicReference<EditingDomain> ref = new AtomicReference<>();
                Display.getDefault().syncExec(() -> {
                    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    if (window != null) {
                        IEditorPart editor = window.getActivePage().getActiveEditor();
                        if (editor instanceof IEditingDomainProvider) {
                            EditingDomain ed = ((IEditingDomainProvider) editor).getEditingDomain();
                            if (ed != null) {
                                ensureLoaded(ed.getResourceSet());
                                if (containsAdaptorInterface(ed.getResourceSet()) || ref.get() == null) {
                                    ref.set(ed);
                                }
                            }
                        }
                    }
                });
                result = ref.get();
            }
        } catch (Throwable t) {
            log("findEditingDomain failed: " + t);
        }
        log("findEditingDomain: sessions(total=" + sessionsTotal + ",open=" + sessionsOpen + ") -> "
                + (result == null ? "NONE"
                        : result.getClass().getSimpleName() + (result instanceof TransactionalEditingDomain ? "[tx]" : "")));
        return result;
    }

    public JsonObject diagnostics() {
        JsonObject result = new JsonObject();
        int total = 0;
        int open = 0;
        try {
            for (Session session : SessionManager.INSTANCE.getSessions()) {
                total++;
                if (session.isOpen()) {
                    open++;
                }
            }
        } catch (Throwable t) {
            total = -1;
            open = -1;
        }
        result.addProperty("sessionsTotal", total);
        result.addProperty("sessionsOpen", open);
        EditingDomain ed = findEditingDomain();
        result.addProperty("sessionFound", ed != null);
        if (ed != null) {
            result.addProperty("editingDomainClass", ed.getClass().getName());
            result.addProperty("transactional", ed instanceof TransactionalEditingDomain);
            ResourceSet rs = ed.getResourceSet();
            result.addProperty("resourceCount", rs.getResources().size());
            result.addProperty("adaptorInterfacePresent", containsAdaptorInterface(rs));
        }
        return result;
    }

    private static void log(String message) {
        System.out.println("[AdaptorModelServer] " + message);
    }

    public <T> T read(EditingDomain editingDomain, Function<ResourceSet, T> fn) {
        ResourceSet resourceSet = editingDomain.getResourceSet();
        if (editingDomain instanceof TransactionalEditingDomain) {
            AtomicReference<T> ref = new AtomicReference<>();
            try {
                ((TransactionalEditingDomain) editingDomain).runExclusive(() -> ref.set(fn.apply(resourceSet)));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new ModelException("Interrupted while reading the model");
            }
            return ref.get();
        }
        return fn.apply(resourceSet);
    }

    public void write(EditingDomain editingDomain, Runnable runnable) {
        if (editingDomain instanceof TransactionalEditingDomain) {
            ((TransactionalEditingDomain) editingDomain).getCommandStack()
                    .execute(new RecordingCommand((TransactionalEditingDomain) editingDomain) {
                        @Override
                        protected void doExecute() {
                            runnable.run();
                        }
                    });
        } else {
            runnable.run();
        }
    }

    private static void ensureLoaded(ResourceSet resourceSet) {
        for (Resource resource : resourceSet.getResources()) {
            if (!resource.isLoaded()) {
                try {
                    resource.load(Collections.emptyMap());
                } catch (Throwable t) {
                    // Ignore resources that cannot be loaded right now.
                }
            }
        }
    }

    private static boolean containsAdaptorInterface(ResourceSet resourceSet) {
        for (Resource resource : resourceSet.getResources()) {
            for (EObject root : resource.getContents()) {
                if (root instanceof AdaptorInterface) {
                    return true;
                }
            }
        }
        return false;
    }
}
