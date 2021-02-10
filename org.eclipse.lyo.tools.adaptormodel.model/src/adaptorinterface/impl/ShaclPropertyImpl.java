/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.ShaclProperty;
import adaptorinterface.ShaclPropertyDataType;
import adaptorinterface.ShaclShape;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vocabulary.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shacl Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.ShaclPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.ShaclPropertyImpl#getPath <em>Path</em>}</li>
 *   <li>{@link adaptorinterface.impl.ShaclPropertyImpl#getMinCount <em>Min Count</em>}</li>
 *   <li>{@link adaptorinterface.impl.ShaclPropertyImpl#getMaxCount <em>Max Count</em>}</li>
 *   <li>{@link adaptorinterface.impl.ShaclPropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link adaptorinterface.impl.ShaclPropertyImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShaclPropertyImpl extends ShapePropertyImpl implements ShaclProperty {
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
     * The cached value of the '{@link #getPath() <em>Path</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
	protected Property path;

	/**
     * The default value of the '{@link #getMinCount() <em>Min Count</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinCount()
     * @generated
     * @ordered
     */
	protected static final int MIN_COUNT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMinCount() <em>Min Count</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinCount()
     * @generated
     * @ordered
     */
	protected int minCount = MIN_COUNT_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxCount() <em>Max Count</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxCount()
     * @generated
     * @ordered
     */
	protected static final int MAX_COUNT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMaxCount() <em>Max Count</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxCount()
     * @generated
     * @ordered
     */
	protected int maxCount = MAX_COUNT_EDEFAULT;

	/**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
	protected static final ShaclPropertyDataType DATA_TYPE_EDEFAULT = ShaclPropertyDataType.BOOLEAN;

	/**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
	protected ShaclPropertyDataType dataType = DATA_TYPE_EDEFAULT;

	/**
     * The cached value of the '{@link #getClass_() <em>Class</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
	protected EList<ShaclShape> class_;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ShaclPropertyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.SHACL_PROPERTY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SHACL_PROPERTY__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Property getPath() {
        if (path != null && path.eIsProxy()) {
            InternalEObject oldPath = (InternalEObject)path;
            path = (Property)eResolveProxy(oldPath);
            if (path != oldPath) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptorinterfacePackage.SHACL_PROPERTY__PATH, oldPath, path));
            }
        }
        return path;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Property basicGetPath() {
        return path;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setPath(Property newPath) {
        Property oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SHACL_PROPERTY__PATH, oldPath, path));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int getMinCount() {
        return minCount;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setMinCount(int newMinCount) {
        int oldMinCount = minCount;
        minCount = newMinCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SHACL_PROPERTY__MIN_COUNT, oldMinCount, minCount));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int getMaxCount() {
        return maxCount;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setMaxCount(int newMaxCount) {
        int oldMaxCount = maxCount;
        maxCount = newMaxCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SHACL_PROPERTY__MAX_COUNT, oldMaxCount, maxCount));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ShaclPropertyDataType getDataType() {
        return dataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void setDataType(ShaclPropertyDataType newDataType) {
        ShaclPropertyDataType oldDataType = dataType;
        dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.SHACL_PROPERTY__DATA_TYPE, oldDataType, dataType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EList<ShaclShape> getClass_() {
        if (class_ == null) {
            class_ = new EObjectResolvingEList<ShaclShape>(ShaclShape.class, this, AdaptorinterfacePackage.SHACL_PROPERTY__CLASS);
        }
        return class_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.SHACL_PROPERTY__NAME:
                return getName();
            case AdaptorinterfacePackage.SHACL_PROPERTY__PATH:
                if (resolve) return getPath();
                return basicGetPath();
            case AdaptorinterfacePackage.SHACL_PROPERTY__MIN_COUNT:
                return getMinCount();
            case AdaptorinterfacePackage.SHACL_PROPERTY__MAX_COUNT:
                return getMaxCount();
            case AdaptorinterfacePackage.SHACL_PROPERTY__DATA_TYPE:
                return getDataType();
            case AdaptorinterfacePackage.SHACL_PROPERTY__CLASS:
                return getClass_();
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
            case AdaptorinterfacePackage.SHACL_PROPERTY__NAME:
                setName((String)newValue);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__PATH:
                setPath((Property)newValue);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__MIN_COUNT:
                setMinCount((Integer)newValue);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__MAX_COUNT:
                setMaxCount((Integer)newValue);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__DATA_TYPE:
                setDataType((ShaclPropertyDataType)newValue);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__CLASS:
                getClass_().clear();
                getClass_().addAll((Collection<? extends ShaclShape>)newValue);
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
            case AdaptorinterfacePackage.SHACL_PROPERTY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__PATH:
                setPath((Property)null);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__MIN_COUNT:
                setMinCount(MIN_COUNT_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__MAX_COUNT:
                setMaxCount(MAX_COUNT_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case AdaptorinterfacePackage.SHACL_PROPERTY__CLASS:
                getClass_().clear();
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
            case AdaptorinterfacePackage.SHACL_PROPERTY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case AdaptorinterfacePackage.SHACL_PROPERTY__PATH:
                return path != null;
            case AdaptorinterfacePackage.SHACL_PROPERTY__MIN_COUNT:
                return minCount != MIN_COUNT_EDEFAULT;
            case AdaptorinterfacePackage.SHACL_PROPERTY__MAX_COUNT:
                return maxCount != MAX_COUNT_EDEFAULT;
            case AdaptorinterfacePackage.SHACL_PROPERTY__DATA_TYPE:
                return dataType != DATA_TYPE_EDEFAULT;
            case AdaptorinterfacePackage.SHACL_PROPERTY__CLASS:
                return class_ != null && !class_.isEmpty();
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
        result.append(", minCount: ");
        result.append(minCount);
        result.append(", maxCount: ");
        result.append(maxCount);
        result.append(", dataType: ");
        result.append(dataType);
        result.append(')');
        return result.toString();
    }

} //ShaclPropertyImpl
