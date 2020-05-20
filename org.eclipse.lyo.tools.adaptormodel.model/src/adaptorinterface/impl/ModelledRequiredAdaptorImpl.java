/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.ModelledRequiredAdaptor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelled Required Adaptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ModelledRequiredAdaptorImpl#getAdaptorInterface <em>Adaptor Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelledRequiredAdaptorImpl extends RequiredAdaptorImpl implements ModelledRequiredAdaptor {
	/**
     * The cached value of the '{@link #getAdaptorInterface() <em>Adaptor Interface</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAdaptorInterface()
     * @generated
     * @ordered
     */
	protected AdaptorInterface adaptorInterface;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ModelledRequiredAdaptorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.MODELLED_REQUIRED_ADAPTOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public AdaptorInterface getAdaptorInterface() {
        if (adaptorInterface != null && adaptorInterface.eIsProxy()) {
            InternalEObject oldAdaptorInterface = (InternalEObject)adaptorInterface;
            adaptorInterface = (AdaptorInterface)eResolveProxy(oldAdaptorInterface);
            if (adaptorInterface != oldAdaptorInterface) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE, oldAdaptorInterface, adaptorInterface));
            }
        }
        return adaptorInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AdaptorInterface basicGetAdaptorInterface() {
        return adaptorInterface;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setAdaptorInterface(AdaptorInterface newAdaptorInterface) {
        AdaptorInterface oldAdaptorInterface = adaptorInterface;
        adaptorInterface = newAdaptorInterface;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE, oldAdaptorInterface, adaptorInterface));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE:
                if (resolve) return getAdaptorInterface();
                return basicGetAdaptorInterface();
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
            case AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE:
                setAdaptorInterface((AdaptorInterface)newValue);
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
            case AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE:
                setAdaptorInterface((AdaptorInterface)null);
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
            case AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE:
                return adaptorInterface != null;
        }
        return super.eIsSet(featureID);
    }

} //ModelledRequiredAdaptorImpl
