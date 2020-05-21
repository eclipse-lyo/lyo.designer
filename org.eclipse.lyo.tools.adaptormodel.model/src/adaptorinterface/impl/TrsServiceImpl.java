/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.TrsService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trs Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.TrsServiceImpl#getBasePageLimit <em>Base Page Limit</em>}</li>
 *   <li>{@link adaptorinterface.impl.TrsServiceImpl#getChangeLogPageLimit <em>Change Log Page Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrsServiceImpl extends MinimalEObjectImpl.Container implements TrsService {
	/**
     * The default value of the '{@link #getBasePageLimit() <em>Base Page Limit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBasePageLimit()
     * @generated
     * @ordered
     */
	protected static final int BASE_PAGE_LIMIT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getBasePageLimit() <em>Base Page Limit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBasePageLimit()
     * @generated
     * @ordered
     */
	protected int basePageLimit = BASE_PAGE_LIMIT_EDEFAULT;

	/**
     * The default value of the '{@link #getChangeLogPageLimit() <em>Change Log Page Limit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getChangeLogPageLimit()
     * @generated
     * @ordered
     */
	protected static final int CHANGE_LOG_PAGE_LIMIT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getChangeLogPageLimit() <em>Change Log Page Limit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getChangeLogPageLimit()
     * @generated
     * @ordered
     */
	protected int changeLogPageLimit = CHANGE_LOG_PAGE_LIMIT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TrsServiceImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.TRS_SERVICE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getBasePageLimit() {
        return basePageLimit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBasePageLimit(int newBasePageLimit) {
        int oldBasePageLimit = basePageLimit;
        basePageLimit = newBasePageLimit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.TRS_SERVICE__BASE_PAGE_LIMIT, oldBasePageLimit, basePageLimit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getChangeLogPageLimit() {
        return changeLogPageLimit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setChangeLogPageLimit(int newChangeLogPageLimit) {
        int oldChangeLogPageLimit = changeLogPageLimit;
        changeLogPageLimit = newChangeLogPageLimit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT, oldChangeLogPageLimit, changeLogPageLimit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.TRS_SERVICE__BASE_PAGE_LIMIT:
                return getBasePageLimit();
            case AdaptorinterfacePackage.TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT:
                return getChangeLogPageLimit();
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
            case AdaptorinterfacePackage.TRS_SERVICE__BASE_PAGE_LIMIT:
                setBasePageLimit((Integer)newValue);
                return;
            case AdaptorinterfacePackage.TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT:
                setChangeLogPageLimit((Integer)newValue);
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
            case AdaptorinterfacePackage.TRS_SERVICE__BASE_PAGE_LIMIT:
                setBasePageLimit(BASE_PAGE_LIMIT_EDEFAULT);
                return;
            case AdaptorinterfacePackage.TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT:
                setChangeLogPageLimit(CHANGE_LOG_PAGE_LIMIT_EDEFAULT);
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
            case AdaptorinterfacePackage.TRS_SERVICE__BASE_PAGE_LIMIT:
                return basePageLimit != BASE_PAGE_LIMIT_EDEFAULT;
            case AdaptorinterfacePackage.TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT:
                return changeLogPageLimit != CHANGE_LOG_PAGE_LIMIT_EDEFAULT;
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
        result.append(" (basePageLimit: ");
        result.append(basePageLimit);
        result.append(", changeLogPageLimit: ");
        result.append(changeLogPageLimit);
        result.append(')');
        return result.toString();
    }

} //TrsServiceImpl
