/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.WebServicePersistence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service Persistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.WebServicePersistenceImpl#isRead <em>Read</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServicePersistenceImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link adaptorinterface.impl.WebServicePersistenceImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebServicePersistenceImpl extends ServicePersistenceImpl implements WebServicePersistence {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WebServicePersistenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.WEB_SERVICE_PERSISTENCE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__READ, oldRead, read));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__DELETE, oldDelete, delete));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__UPDATE, oldUpdate, update));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__READ:
                return isRead();
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__DELETE:
                return isDelete();
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__UPDATE:
                return isUpdate();
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
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__READ:
                setRead((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__DELETE:
                setDelete((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__UPDATE:
                setUpdate((Boolean)newValue);
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
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__READ:
                setRead(READ_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__DELETE:
                setDelete(DELETE_EDEFAULT);
                return;
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__UPDATE:
                setUpdate(UPDATE_EDEFAULT);
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
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__READ:
                return read != READ_EDEFAULT;
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__DELETE:
                return delete != DELETE_EDEFAULT;
            case AdaptorinterfacePackage.WEB_SERVICE_PERSISTENCE__UPDATE:
                return update != UPDATE_EDEFAULT;
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
        result.append(" (read: ");
        result.append(read);
        result.append(", delete: ");
        result.append(delete);
        result.append(", update: ");
        result.append(update);
        result.append(')');
        return result.toString();
    }

} //WebServicePersistenceImpl
