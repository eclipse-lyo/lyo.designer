/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.AuthenticationConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.AuthenticationConfigurationImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.AuthenticationConfigurationImpl#getOauthRealm <em>Oauth Realm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationConfigurationImpl extends MinimalEObjectImpl.Container implements AuthenticationConfiguration {
	/**
     * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getApplicationName()
     * @generated
     * @ordered
     */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getApplicationName()
     * @generated
     * @ordered
     */
	protected String applicationName = APPLICATION_NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getOauthRealm() <em>Oauth Realm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOauthRealm()
     * @generated
     * @ordered
     */
	protected static final String OAUTH_REALM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getOauthRealm() <em>Oauth Realm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOauthRealm()
     * @generated
     * @ordered
     */
	protected String oauthRealm = OAUTH_REALM_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AuthenticationConfigurationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.AUTHENTICATION_CONFIGURATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getApplicationName() {
        return applicationName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setApplicationName(String newApplicationName) {
        String oldApplicationName = applicationName;
        applicationName = newApplicationName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__APPLICATION_NAME, oldApplicationName, applicationName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getOauthRealm() {
        return oauthRealm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOauthRealm(String newOauthRealm) {
        String oldOauthRealm = oauthRealm;
        oauthRealm = newOauthRealm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__OAUTH_REALM, oldOauthRealm, oauthRealm));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__APPLICATION_NAME:
                return getApplicationName();
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__OAUTH_REALM:
                return getOauthRealm();
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
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__APPLICATION_NAME:
                setApplicationName((String)newValue);
                return;
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__OAUTH_REALM:
                setOauthRealm((String)newValue);
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
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__APPLICATION_NAME:
                setApplicationName(APPLICATION_NAME_EDEFAULT);
                return;
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__OAUTH_REALM:
                setOauthRealm(OAUTH_REALM_EDEFAULT);
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
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__APPLICATION_NAME:
                return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
            case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION__OAUTH_REALM:
                return OAUTH_REALM_EDEFAULT == null ? oauthRealm != null : !OAUTH_REALM_EDEFAULT.equals(oauthRealm);
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
        result.append(" (applicationName: ");
        result.append(applicationName);
        result.append(", oauthRealm: ");
        result.append(oauthRealm);
        result.append(')');
        return result.toString();
    }

} //AuthenticationConfigurationImpl
