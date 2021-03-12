/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.MavenServerConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.MavenServerConfigurationImpl#getJettyPort <em>Jetty Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MavenServerConfigurationImpl extends ServerConfigurationImpl implements MavenServerConfiguration {
	/**
     * The default value of the '{@link #getJettyPort() <em>Jetty Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJettyPort()
     * @generated
     * @ordered
     */
	protected static final int JETTY_PORT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getJettyPort() <em>Jetty Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getJettyPort()
     * @generated
     * @ordered
     */
	protected int jettyPort = JETTY_PORT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MavenServerConfigurationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AdaptorinterfacePackage.Literals.MAVEN_SERVER_CONFIGURATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getJettyPort() {
        return jettyPort;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setJettyPort(int newJettyPort) {
        int oldJettyPort = jettyPort;
        jettyPort = newJettyPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.MAVEN_SERVER_CONFIGURATION__JETTY_PORT, oldJettyPort, jettyPort));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AdaptorinterfacePackage.MAVEN_SERVER_CONFIGURATION__JETTY_PORT:
                return getJettyPort();
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
            case AdaptorinterfacePackage.MAVEN_SERVER_CONFIGURATION__JETTY_PORT:
                setJettyPort((Integer)newValue);
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
            case AdaptorinterfacePackage.MAVEN_SERVER_CONFIGURATION__JETTY_PORT:
                setJettyPort(JETTY_PORT_EDEFAULT);
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
            case AdaptorinterfacePackage.MAVEN_SERVER_CONFIGURATION__JETTY_PORT:
                return jettyPort != JETTY_PORT_EDEFAULT;
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
        result.append(" (jettyPort: ");
        result.append(jettyPort);
        result.append(')');
        return result.toString();
    }

} //MavenServerConfigurationImpl
