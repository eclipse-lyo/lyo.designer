/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Publisher;
import adaptorinterface.ServiceProvider;
import adaptorinterface.ServiceProviderCatalog;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Provider Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ServiceProviderCatalogImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderCatalogImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderCatalogImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderCatalogImpl#getServiceProviders <em>Service Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceProviderCatalogImpl extends MinimalEObjectImpl.Container implements ServiceProviderCatalog {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher publisher;

	/**
	 * The cached value of the '{@link #getServiceProviders() <em>Service Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProvider> serviceProviders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.SERVICE_PROVIDER_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publisher getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Publisher newPublisher, NotificationChain msgs) {
		Publisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(Publisher newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceProvider> getServiceProviders() {
		if (serviceProviders == null) {
			serviceProviders = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this, AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS);
		}
		return serviceProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS:
				return ((InternalEList<?>)getServiceProviders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__TITLE:
				return getTitle();
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__DESCRIPTION:
				return getDescription();
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER:
				return getPublisher();
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS:
				return getServiceProviders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__TITLE:
				setTitle((String)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS:
				getServiceProviders().clear();
				getServiceProviders().addAll((Collection<? extends ServiceProvider>)newValue);
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
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS:
				getServiceProviders().clear();
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
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__PUBLISHER:
				return publisher != null;
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS:
				return serviceProviders != null && !serviceProviders.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ServiceProviderCatalogImpl
