/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.RequiredAdaptor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Adaptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.RequiredAdaptorImpl#getServiceProviderCatalogURI <em>Service Provider Catalog URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequiredAdaptorImpl extends MinimalEObjectImpl.Container implements RequiredAdaptor {
	/**
	 * The default value of the '{@link #getServiceProviderCatalogURI() <em>Service Provider Catalog URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviderCatalogURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PROVIDER_CATALOG_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceProviderCatalogURI() <em>Service Provider Catalog URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviderCatalogURI()
	 * @generated
	 * @ordered
	 */
	protected String serviceProviderCatalogURI = SERVICE_PROVIDER_CATALOG_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredAdaptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.REQUIRED_ADAPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceProviderCatalogURI() {
		return serviceProviderCatalogURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProviderCatalogURI(String newServiceProviderCatalogURI) {
		String oldServiceProviderCatalogURI = serviceProviderCatalogURI;
		serviceProviderCatalogURI = newServiceProviderCatalogURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI, oldServiceProviderCatalogURI, serviceProviderCatalogURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorinterfacePackage.REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI:
				return getServiceProviderCatalogURI();
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
			case AdaptorinterfacePackage.REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI:
				setServiceProviderCatalogURI((String)newValue);
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
			case AdaptorinterfacePackage.REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI:
				setServiceProviderCatalogURI(SERVICE_PROVIDER_CATALOG_URI_EDEFAULT);
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
			case AdaptorinterfacePackage.REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI:
				return SERVICE_PROVIDER_CATALOG_URI_EDEFAULT == null ? serviceProviderCatalogURI != null : !SERVICE_PROVIDER_CATALOG_URI_EDEFAULT.equals(serviceProviderCatalogURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceProviderCatalogURI: ");
		result.append(serviceProviderCatalogURI);
		result.append(')');
		return result.toString();
	}

} //RequiredAdaptorImpl
