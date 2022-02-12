package adaptorinterface;


import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.AuthenticationConfiguration#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link adaptorinterface.AuthenticationConfiguration#getOauthRealm <em>Oauth Realm</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getAuthenticationConfiguration()
 * @model
 * @generated
 */
public interface AuthenticationConfiguration extends EObject {
	/**
     * Returns the value of the '<em><b>Application Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Application Name</em>' attribute.
     * @see #setApplicationName(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getAuthenticationConfiguration_ApplicationName()
     * @model required="true"
     * @generated
     */
	String getApplicationName();

	/**
     * Sets the value of the '{@link adaptorinterface.AuthenticationConfiguration#getApplicationName <em>Application Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application Name</em>' attribute.
     * @see #getApplicationName()
     * @generated
     */
	void setApplicationName(String value);

	/**
     * Returns the value of the '<em><b>Oauth Realm</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oauth Realm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Oauth Realm</em>' attribute.
     * @see #setOauthRealm(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getAuthenticationConfiguration_OauthRealm()
     * @model required="true"
     * @generated
     */
	String getOauthRealm();

	/**
     * Sets the value of the '{@link adaptorinterface.AuthenticationConfiguration#getOauthRealm <em>Oauth Realm</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oauth Realm</em>' attribute.
     * @see #getOauthRealm()
     * @generated
     */
	void setOauthRealm(String value);

} // AuthenticationConfiguration