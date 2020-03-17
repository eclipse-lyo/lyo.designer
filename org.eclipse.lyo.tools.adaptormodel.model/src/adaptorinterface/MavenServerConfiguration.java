/**
 */
package adaptorinterface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maven Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.MavenServerConfiguration#getJettyPort <em>Jetty Port</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getMavenServerConfiguration()
 * @model
 * @generated
 */
public interface MavenServerConfiguration extends ServerConfiguration {
	/**
	 * Returns the value of the '<em><b>Jetty Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jetty Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetty Port</em>' attribute.
	 * @see #setJettyPort(int)
	 * @see adaptorinterface.AdaptorinterfacePackage#getMavenServerConfiguration_JettyPort()
	 * @model
	 * @generated
	 */
	int getJettyPort();

	/**
	 * Sets the value of the '{@link adaptorinterface.MavenServerConfiguration#getJettyPort <em>Jetty Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jetty Port</em>' attribute.
	 * @see #getJettyPort()
	 * @generated
	 */
	void setJettyPort(int value);

} // MavenServerConfiguration
