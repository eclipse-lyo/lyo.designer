/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getDescribes <em>Describes</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link adaptorinterface.impl.ResourceImpl#getResourceProperties <em>Resource Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends ShapeImpl implements Resource {
	/**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getDescribes() <em>Describes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribes()
	 * @generated
	 * @ordered
	 */
	protected vocabulary.Class describes;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> extends_;

	/**
	 * The cached value of the '{@link #getResourceProperties() <em>Resource Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceProperty> resourceProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.RESOURCE;
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * EclipseLyo: creating the id once it is null
     */
    public String getId() {
        if (null == id) {
            id = org.eclipse.emf.ecore.util.EcoreUtil.generateUUID();
        }
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<Resource>(Resource.class, this, AdaptorinterfacePackage.RESOURCE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceProperty> getResourceProperties() {
		if (resourceProperties == null) {
			resourceProperties = new EObjectResolvingEList<ResourceProperty>(ResourceProperty.class, this, AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES);
		}
		return resourceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public vocabulary.Class getDescribes() {
		if (describes != null && describes.eIsProxy()) {
			InternalEObject oldDescribes = (InternalEObject)describes;
			describes = (vocabulary.Class)eResolveProxy(oldDescribes);
			if (describes != oldDescribes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.RESOURCE__DESCRIBES, oldDescribes, describes));
			}
		}
		return describes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vocabulary.Class basicGetDescribes() {
		return describes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribes(vocabulary.Class newDescribes) {
		vocabulary.Class oldDescribes = describes;
		describes = newDescribes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.RESOURCE__DESCRIBES, oldDescribes, describes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
            case AdaptorinterfacePackage.RESOURCE__ID:
                return getId();
			case AdaptorinterfacePackage.RESOURCE__NAME:
				return getName();
			case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
				if (resolve) return getDescribes();
				return basicGetDescribes();
			case AdaptorinterfacePackage.RESOURCE__EXTENDS:
				return getExtends();
			case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
				return getResourceProperties();
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
            case AdaptorinterfacePackage.RESOURCE__ID:
                setId((String)newValue);
                return;
			case AdaptorinterfacePackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
				setDescribes((vocabulary.Class)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Resource>)newValue);
				return;
			case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
				getResourceProperties().clear();
				getResourceProperties().addAll((Collection<? extends ResourceProperty>)newValue);
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
            case AdaptorinterfacePackage.RESOURCE__ID:
                setId(ID_EDEFAULT);
                return;
			case AdaptorinterfacePackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
				setDescribes((vocabulary.Class)null);
				return;
			case AdaptorinterfacePackage.RESOURCE__EXTENDS:
				getExtends().clear();
				return;
			case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
				getResourceProperties().clear();
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
            case AdaptorinterfacePackage.RESOURCE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AdaptorinterfacePackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptorinterfacePackage.RESOURCE__DESCRIBES:
				return describes != null;
			case AdaptorinterfacePackage.RESOURCE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case AdaptorinterfacePackage.RESOURCE__RESOURCE_PROPERTIES:
				return resourceProperties != null && !resourceProperties.isEmpty();
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
