/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.OSLCServicePersistence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSLC Service Persistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.OSLCServicePersistenceImpl#isCreationFactory <em>Creation Factory</em>}</li>
 *   <li>{@link adaptorinterface.impl.OSLCServicePersistenceImpl#isQueryCapability <em>Query Capability</em>}</li>
 *   <li>{@link adaptorinterface.impl.OSLCServicePersistenceImpl#isSelectionDialog <em>Selection Dialog</em>}</li>
 *   <li>{@link adaptorinterface.impl.OSLCServicePersistenceImpl#isCreationDialog <em>Creation Dialog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSLCServicePersistenceImpl extends ServicePersistenceImpl implements OSLCServicePersistence {
    /**
     * The default value of the '{@link #isCreationFactory() <em>Creation Factory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCreationFactory()
     * @generated
     * @ordered
     */
    protected static final boolean CREATION_FACTORY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCreationFactory() <em>Creation Factory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCreationFactory()
     * @generated
     * @ordered
     */
    protected boolean creationFactory = CREATION_FACTORY_EDEFAULT;

    /**
     * The default value of the '{@link #isQueryCapability() <em>Query Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isQueryCapability()
     * @generated
     * @ordered
     */
    protected static final boolean QUERY_CAPABILITY_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isQueryCapability() <em>Query Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isQueryCapability()
     * @generated
     * @ordered
     */
    protected boolean queryCapability = QUERY_CAPABILITY_EDEFAULT;

    /**
     * The default value of the '{@link #isSelectionDialog() <em>Selection Dialog</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelectionDialog()
     * @generated
     * @ordered
     */
    protected static final boolean SELECTION_DIALOG_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isSelectionDialog() <em>Selection Dialog</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelectionDialog()
     * @generated
     * @ordered
     */
    protected boolean selectionDialog = SELECTION_DIALOG_EDEFAULT;

    /**
     * The default value of the '{@link #isCreationDialog() <em>Creation Dialog</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCreationDialog()
     * @generated
     * @ordered
     */
    protected static final boolean CREATION_DIALOG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCreationDialog() <em>Creation Dialog</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCreationDialog()
     * @generated
     * @ordered
     */
    protected boolean creationDialog = CREATION_DIALOG_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OSLCServicePersistenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.OSLC_SERVICE_PERSISTENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isCreationFactory() {
        return creationFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCreationFactory(boolean newCreationFactory) {
        boolean oldCreationFactory = creationFactory;
        creationFactory = newCreationFactory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY, oldCreationFactory, creationFactory));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isQueryCapability() {
        return queryCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQueryCapability(boolean newQueryCapability) {
        boolean oldQueryCapability = queryCapability;
        queryCapability = newQueryCapability;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY, oldQueryCapability, queryCapability));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSelectionDialog() {
        return selectionDialog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSelectionDialog(boolean newSelectionDialog) {
        boolean oldSelectionDialog = selectionDialog;
        selectionDialog = newSelectionDialog;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG, oldSelectionDialog, selectionDialog));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isCreationDialog() {
        return creationDialog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCreationDialog(boolean newCreationDialog) {
        boolean oldCreationDialog = creationDialog;
        creationDialog = newCreationDialog;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG, oldCreationDialog, creationDialog));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY:
                return isCreationFactory();
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY:
                return isQueryCapability();
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG:
                return isSelectionDialog();
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG:
                return isCreationDialog();
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
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY:
                setCreationFactory((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY:
                setQueryCapability((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG:
                setSelectionDialog((Boolean)newValue);
                return;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG:
                setCreationDialog((Boolean)newValue);
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
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY:
                setCreationFactory(CREATION_FACTORY_EDEFAULT);
                return;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY:
                setQueryCapability(QUERY_CAPABILITY_EDEFAULT);
                return;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG:
                setSelectionDialog(SELECTION_DIALOG_EDEFAULT);
                return;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG:
                setCreationDialog(CREATION_DIALOG_EDEFAULT);
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
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY:
                return creationFactory != CREATION_FACTORY_EDEFAULT;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY:
                return queryCapability != QUERY_CAPABILITY_EDEFAULT;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG:
                return selectionDialog != SELECTION_DIALOG_EDEFAULT;
            case AdaptorinterfacePackage.OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG:
                return creationDialog != CREATION_DIALOG_EDEFAULT;
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
        result.append(" (creationFactory: ");
        result.append(creationFactory);
        result.append(", queryCapability: ");
        result.append(queryCapability);
        result.append(", selectionDialog: ");
        result.append(selectionDialog);
        result.append(", creationDialog: ");
        result.append(creationDialog);
        result.append(')');
        return result.toString();
    }

} //OSLCServicePersistenceImpl
