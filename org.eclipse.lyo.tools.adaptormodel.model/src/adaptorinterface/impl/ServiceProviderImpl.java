/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Publisher;
import adaptorinterface.Service;
import adaptorinterface.ServiceProvider;

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
 * An implementation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link adaptorinterface.impl.ServiceProviderImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderImpl#getServices <em>Services</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderImpl#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link adaptorinterface.impl.ServiceProviderImpl#getInstanceID <em>Instance ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProviderImpl extends MinimalEObjectImpl.Container implements ServiceProvider {
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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The default value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNamespace() <em>Service Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNamespace()
	 * @generated
	 * @ordered
	 */
	protected String serviceNamespace = SERVICE_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String instanceID = INSTANCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.SERVICE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNamespace() {
		return serviceNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNamespace(String newServiceNamespace) {
		String oldServiceNamespace = serviceNamespace;
		serviceNamespace = newServiceNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICE_NAMESPACE, oldServiceNamespace, serviceNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceID() {
		return instanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(String newInstanceID) {
		String oldInstanceID = instanceID;
		instanceID = newInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SERVICE_PROVIDER__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case AdaptorinterfacePackage.SERVICE_PROVIDER__TITLE:
				return getTitle();
			case AdaptorinterfacePackage.SERVICE_PROVIDER__DESCRIPTION:
				return getDescription();
			case AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER:
				return getPublisher();
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICES:
				return getServices();
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICE_NAMESPACE:
				return getServiceNamespace();
			case AdaptorinterfacePackage.SERVICE_PROVIDER__INSTANCE_ID:
				return getInstanceID();
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
			case AdaptorinterfacePackage.SERVICE_PROVIDER__TITLE:
				setTitle((String)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICE_NAMESPACE:
				setServiceNamespace((String)newValue);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__INSTANCE_ID:
				setInstanceID((String)newValue);
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
			case AdaptorinterfacePackage.SERVICE_PROVIDER__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICES:
				getServices().clear();
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICE_NAMESPACE:
				setServiceNamespace(SERVICE_NAMESPACE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
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
			case AdaptorinterfacePackage.SERVICE_PROVIDER__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AdaptorinterfacePackage.SERVICE_PROVIDER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AdaptorinterfacePackage.SERVICE_PROVIDER__PUBLISHER:
				return publisher != null;
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICES:
				return services != null && !services.isEmpty();
			case AdaptorinterfacePackage.SERVICE_PROVIDER__SERVICE_NAMESPACE:
				return SERVICE_NAMESPACE_EDEFAULT == null ? serviceNamespace != null : !SERVICE_NAMESPACE_EDEFAULT.equals(serviceNamespace);
			case AdaptorinterfacePackage.SERVICE_PROVIDER__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", serviceNamespace: ");
		result.append(serviceNamespace);
		result.append(", instanceID: ");
		result.append(instanceID);
		result.append(')');
		return result.toString();
	}

} //ServiceProviderImpl
