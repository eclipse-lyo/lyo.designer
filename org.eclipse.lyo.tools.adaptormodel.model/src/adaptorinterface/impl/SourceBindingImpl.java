/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Source;
import adaptorinterface.SourceBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.SourceBindingImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceBindingImpl extends MinimalEObjectImpl.Container implements SourceBinding {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected Source source;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SourceBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.SOURCE_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Source getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (Source)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.SOURCE_BINDING__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Source basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSource(Source newSource) {
        Source oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SOURCE_BINDING__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.SOURCE_BINDING__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AdaptorinterfacePackage.SOURCE_BINDING__SOURCE:
                setSource((Source)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case AdaptorinterfacePackage.SOURCE_BINDING__SOURCE:
                setSource((Source)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case AdaptorinterfacePackage.SOURCE_BINDING__SOURCE:
                return source != null;
        }
        return super.eIsSet(featureID);
    }

} //SourceBindingImpl
