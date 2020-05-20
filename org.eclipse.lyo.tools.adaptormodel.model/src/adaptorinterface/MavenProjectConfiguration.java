/**
 */
package adaptorinterface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maven Project Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.MavenProjectConfiguration#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link adaptorinterface.MavenProjectConfiguration#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link adaptorinterface.MavenProjectConfiguration#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getMavenProjectConfiguration()
 * @model
 * @generated
 */
public interface MavenProjectConfiguration extends ProjectConfiguration {
	/**
     * Returns the value of the '<em><b>Group Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Group Id</em>' attribute.
     * @see #setGroupId(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getMavenProjectConfiguration_GroupId()
     * @model required="true"
     * @generated
     */
	String getGroupId();

	/**
     * Sets the value of the '{@link adaptorinterface.MavenProjectConfiguration#getGroupId <em>Group Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group Id</em>' attribute.
     * @see #getGroupId()
     * @generated
     */
	void setGroupId(String value);

	/**
     * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact Id</em>' attribute.
     * @see #setArtifactId(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getMavenProjectConfiguration_ArtifactId()
     * @model required="true"
     * @generated
     */
	String getArtifactId();

	/**
     * Sets the value of the '{@link adaptorinterface.MavenProjectConfiguration#getArtifactId <em>Artifact Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Artifact Id</em>' attribute.
     * @see #getArtifactId()
     * @generated
     */
	void setArtifactId(String value);

	/**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getMavenProjectConfiguration_Version()
     * @model required="true"
     * @generated
     */
	String getVersion();

	/**
     * Sets the value of the '{@link adaptorinterface.MavenProjectConfiguration#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
	void setVersion(String value);

} // MavenProjectConfiguration
