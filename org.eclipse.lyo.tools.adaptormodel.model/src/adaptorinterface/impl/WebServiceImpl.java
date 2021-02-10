/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Resource;
import adaptorinterface.WebService;

import adaptorinterface.WebServicePersistence;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#getServiceUrlPattern <em>Service Url Pattern</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#getResourceUrlPattern <em>Resource Url Pattern</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#isRead <em>Read</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#isUpdate <em>Update</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServiceImpl#getPersistence <em>Persistence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebServiceImpl extends MinimalEObjectImpl.Container implements WebService {
	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getServiceUrlPattern() <em>Service Url Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServiceUrlPattern()
     * @generated
     * @ordered
     */
	protected static final String SERVICE_URL_PATTERN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getServiceUrlPattern() <em>Service Url Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getServiceUrlPattern()
     * @generated
     * @ordered
     */
	protected String serviceUrlPattern = SERVICE_URL_PATTERN_EDEFAULT;

	/**
     * The default value of the '{@link #getResourceUrlPattern() <em>Resource Url Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResourceUrlPattern()
     * @generated
     * @ordered
     */
	protected static final String RESOURCE_URL_PATTERN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getResourceUrlPattern() <em>Resource Url Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResourceUrlPattern()
     * @generated
     * @ordered
     */
	protected String resourceUrlPattern = RESOURCE_URL_PATTERN_EDEFAULT;

	/**
     * The cached value of the '{@link #getResourceTypes() <em>Resource Types</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResourceTypes()
     * @generated
     * @ordered
     */
	protected EList<Resource> resourceTypes;

	/**
     * The default value of the '{@link #isRead() <em>Read</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isRead()
     * @generated
     * @ordered
     */
	protected static final boolean READ_EDEFAULT = true;

	/**
     * The cached value of the '{@link #isRead() <em>Read</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isRead()
     * @generated
     * @ordered
     */
	protected boolean read = READ_EDEFAULT;

	/**
     * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDelete()
     * @generated
     * @ordered
     */
	protected static final boolean DELETE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDelete()
     * @generated
     * @ordered
     */
	protected boolean delete = DELETE_EDEFAULT;

	/**
     * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isUpdate()
     * @generated
     * @ordered
     */
	protected static final boolean UPDATE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isUpdate()
     * @generated
     * @ordered
     */
	protected boolean update = UPDATE_EDEFAULT;

	/**
     * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistence()
     * @generated
     * @ordered
     */
    protected WebServicePersistence persistence;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WebServiceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.WEB_SERVICE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getServiceUrlPattern() {
        return serviceUrlPattern;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setServiceUrlPattern(String newServiceUrlPattern) {
        String oldServiceUrlPattern = serviceUrlPattern;
        serviceUrlPattern = newServiceUrlPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__SERVICE_URL_PATTERN, oldServiceUrlPattern, serviceUrlPattern));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getResourceUrlPattern() {
        return resourceUrlPattern;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setResourceUrlPattern(String newResourceUrlPattern) {
        String oldResourceUrlPattern = resourceUrlPattern;
        resourceUrlPattern = newResourceUrlPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_URL_PATTERN, oldResourceUrlPattern, resourceUrlPattern));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EList<Resource> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new EObjectResolvingEList<Resource>(Resource.class, this, AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_TYPES);
        }
        return resourceTypes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public boolean isRead() {
        return read;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setRead(boolean newRead) {
        boolean oldRead = read;
        read = newRead;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__READ, oldRead, read));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public boolean isDelete() {
        return delete;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setDelete(boolean newDelete) {
        boolean oldDelete = delete;
        delete = newDelete;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__DELETE, oldDelete, delete));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public boolean isUpdate() {
        return update;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setUpdate(boolean newUpdate) {
        boolean oldUpdate = update;
        update = newUpdate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__UPDATE, oldUpdate, update));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WebServicePersistence getPersistence() {
        return persistence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPersistence(WebServicePersistence newPersistence, NotificationChain msgs) {
        WebServicePersistence oldPersistence = persistence;
        persistence = newPersistence;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE, oldPersistence, newPersistence);
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
    public void setPersistence(WebServicePersistence newPersistence) {
        if (newPersistence != persistence) {
            NotificationChain msgs = null;
            if (persistence != null)
                msgs = ((InternalEObject)persistence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE, null, msgs);
            if (newPersistence != null)
                msgs = ((InternalEObject)newPersistence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE, null, msgs);
            msgs = basicSetPersistence(newPersistence, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE, newPersistence, newPersistence));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE:
                return basicSetPersistence(null, msgs);
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
            case AdaptorinterfacePackage.WEB_SERVICE__NAME:
                return getName();
            case AdaptorinterfacePackage.WEB_SERVICE__SERVICE_URL_PATTERN:
                return getServiceUrlPattern();
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_URL_PATTERN:
                return getResourceUrlPattern();
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_TYPES:
                return getResourceTypes();
            case AdaptorinterfacePackage.WEB_SERVICE__READ:
                return isRead();
            case AdaptorinterfacePackage.WEB_SERVICE__DELETE:
                return isDelete();
            case AdaptorinterfacePackage.WEB_SERVICE__UPDATE:
                return isUpdate();
            case AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE:
                return getPersistence();
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
            case AdaptorinterfacePackage.WEB_SERVICE__NAME:
                setName((String)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__SERVICE_URL_PATTERN:
                setServiceUrlPattern((String)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_URL_PATTERN:
                setResourceUrlPattern((String)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_TYPES:
                getResourceTypes().clear();
                getResourceTypes().addAll((Collection<? extends Resource>)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__READ:
                setRead((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__DELETE:
                setDelete((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__UPDATE:
                setUpdate((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE:
                setPersistence((WebServicePersistence)newValue);
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
            case AdaptorinterfacePackage.WEB_SERVICE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__SERVICE_URL_PATTERN:
                setServiceUrlPattern(SERVICE_URL_PATTERN_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_URL_PATTERN:
                setResourceUrlPattern(RESOURCE_URL_PATTERN_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_TYPES:
                getResourceTypes().clear();
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__READ:
                setRead(READ_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__DELETE:
                setDelete(DELETE_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__UPDATE:
                setUpdate(UPDATE_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE:
                setPersistence((WebServicePersistence)null);
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
            case AdaptorinterfacePackage.WEB_SERVICE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case AdaptorinterfacePackage.WEB_SERVICE__SERVICE_URL_PATTERN:
                return SERVICE_URL_PATTERN_EDEFAULT == null ? serviceUrlPattern != null : !SERVICE_URL_PATTERN_EDEFAULT.equals(serviceUrlPattern);
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_URL_PATTERN:
                return RESOURCE_URL_PATTERN_EDEFAULT == null ? resourceUrlPattern != null : !RESOURCE_URL_PATTERN_EDEFAULT.equals(resourceUrlPattern);
            case AdaptorinterfacePackage.WEB_SERVICE__RESOURCE_TYPES:
                return resourceTypes != null && !resourceTypes.isEmpty();
            case AdaptorinterfacePackage.WEB_SERVICE__READ:
                return read != READ_EDEFAULT;
            case AdaptorinterfacePackage.WEB_SERVICE__DELETE:
                return delete != DELETE_EDEFAULT;
            case AdaptorinterfacePackage.WEB_SERVICE__UPDATE:
                return update != UPDATE_EDEFAULT;
            case AdaptorinterfacePackage.WEB_SERVICE__PERSISTENCE:
                return persistence != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", serviceUrlPattern: ");
        result.append(serviceUrlPattern);
        result.append(", resourceUrlPattern: ");
        result.append(resourceUrlPattern);
        result.append(", read: ");
        result.append(read);
        result.append(", delete: ");
        result.append(delete);
        result.append(", update: ");
        result.append(update);
        result.append(')');
        return result.toString();
    }

} //WebServiceImpl
