package org.eclipse.lyo.tools.adaptormodel.server.session;

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
        try {
            for (Session session : SessionManager.INSTANCE.getSessions()) {
                if (session.isOpen()) {
                    TransactionalEditingDomain ed = session.getTransactionalEditingDomain();
                    if (ed != null && containsAdaptorInterface(ed.getResourceSet())) {
                        return ed;
                    }
                }
            }
        } catch (Throwable t) {
            // Sirius not available / not initialized yet - fall through
        }
        if (PlatformUI.isWorkbenchRunning()) {
            AtomicReference<EditingDomain> ref = new AtomicReference<>();
            Display.getDefault().syncExec(() -> {
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                if (window != null) {
                    IEditorPart editor = window.getActivePage().getActiveEditor();
                    if (editor instanceof IEditingDomainProvider) {
                        EditingDomain ed = ((IEditingDomainProvider) editor).getEditingDomain();
                        if (ed != null && containsAdaptorInterface(ed.getResourceSet())) {
                            ref.set(ed);
                        }
                    }
                }
            });
            if (ref.get() != null) {
                return ref.get();
            }
        }
        return null;
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
