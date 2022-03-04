/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.UserSettings;
import adaptorinterface.UserSettingsViewLabelAs;
import adaptorinterface.UserSettingsViewPrefixes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.UserSettingsImpl#getViewPrefixes <em>View Prefixes</em>}</li>
 *   <li>{@link adaptorinterface.impl.UserSettingsImpl#getViewLabelAs <em>View Label As</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserSettingsImpl extends MinimalEObjectImpl.Container implements UserSettings {
    /**
     * The default value of the '{@link #getViewPrefixes() <em>View Prefixes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewPrefixes()
     * @generated
     * @ordered
     */
    protected static final UserSettingsViewPrefixes VIEW_PREFIXES_EDEFAULT = UserSettingsViewPrefixes.WHEN_NECESSARY;

    /**
     * The cached value of the '{@link #getViewPrefixes() <em>View Prefixes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewPrefixes()
     * @generated
     * @ordered
     */
    protected UserSettingsViewPrefixes viewPrefixes = VIEW_PREFIXES_EDEFAULT;

    /**
     * The default value of the '{@link #getViewLabelAs() <em>View Label As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewLabelAs()
     * @generated
     * @ordered
     */
    protected static final UserSettingsViewLabelAs VIEW_LABEL_AS_EDEFAULT = UserSettingsViewLabelAs.VOCABULARY;

    /**
     * The cached value of the '{@link #getViewLabelAs() <em>View Label As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getViewLabelAs()
     * @generated
     * @ordered
     */
    protected UserSettingsViewLabelAs viewLabelAs = VIEW_LABEL_AS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UserSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.USER_SETTINGS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UserSettingsViewPrefixes getViewPrefixes() {
        return viewPrefixes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setViewPrefixes(UserSettingsViewPrefixes newViewPrefixes) {
        UserSettingsViewPrefixes oldViewPrefixes = viewPrefixes;
        viewPrefixes = newViewPrefixes == null ? VIEW_PREFIXES_EDEFAULT : newViewPrefixes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.USER_SETTINGS__VIEW_PREFIXES, oldViewPrefixes, viewPrefixes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UserSettingsViewLabelAs getViewLabelAs() {
        return viewLabelAs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setViewLabelAs(UserSettingsViewLabelAs newViewLabelAs) {
        UserSettingsViewLabelAs oldViewLabelAs = viewLabelAs;
        viewLabelAs = newViewLabelAs == null ? VIEW_LABEL_AS_EDEFAULT : newViewLabelAs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.USER_SETTINGS__VIEW_LABEL_AS, oldViewLabelAs, viewLabelAs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_PREFIXES:
                return getViewPrefixes();
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_LABEL_AS:
                return getViewLabelAs();
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
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_PREFIXES:
                setViewPrefixes((UserSettingsViewPrefixes)newValue);
                return;
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_LABEL_AS:
                setViewLabelAs((UserSettingsViewLabelAs)newValue);
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
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_PREFIXES:
                setViewPrefixes(VIEW_PREFIXES_EDEFAULT);
                return;
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_LABEL_AS:
                setViewLabelAs(VIEW_LABEL_AS_EDEFAULT);
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
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_PREFIXES:
                return viewPrefixes != VIEW_PREFIXES_EDEFAULT;
            case AdaptorinterfacePackage.USER_SETTINGS__VIEW_LABEL_AS:
                return viewLabelAs != VIEW_LABEL_AS_EDEFAULT;
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
        result.append(" (viewPrefixes: ");
        result.append(viewPrefixes);
        result.append(", viewLabelAs: ");
        result.append(viewLabelAs);
        result.append(')');
        return result.toString();
    }

} //UserSettingsImpl
