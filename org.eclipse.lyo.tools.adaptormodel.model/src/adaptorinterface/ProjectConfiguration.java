/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ProjectConfiguration#isDoNotGenerateProjectConfigurationFiles <em>Do Not Generate Project Configuration Files</em>}</li>
 *   <li>{@link adaptorinterface.ProjectConfiguration#getLyoVersion <em>Lyo Version</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getProjectConfiguration()
 * @model
 * @generated
 */
public interface ProjectConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Do Not Generate Project Configuration Files</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Not Generate Project Configuration Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Not Generate Project Configuration Files</em>' attribute.
	 * @see #setDoNotGenerateProjectConfigurationFiles(boolean)
	 * @see adaptorinterface.AdaptorinterfacePackage#getProjectConfiguration_DoNotGenerateProjectConfigurationFiles()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDoNotGenerateProjectConfigurationFiles();

	/**
	 * Sets the value of the '{@link adaptorinterface.ProjectConfiguration#isDoNotGenerateProjectConfigurationFiles <em>Do Not Generate Project Configuration Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Not Generate Project Configuration Files</em>' attribute.
	 * @see #isDoNotGenerateProjectConfigurationFiles()
	 * @generated
	 */
	void setDoNotGenerateProjectConfigurationFiles(boolean value);

	/**
	 * Returns the value of the '<em><b>Lyo Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lyo Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lyo Version</em>' attribute.
	 * @see #setLyoVersion(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getProjectConfiguration_LyoVersion()
	 * @model required="true"
	 * @generated
	 */
	String getLyoVersion();

	/**
	 * Sets the value of the '{@link adaptorinterface.ProjectConfiguration#getLyoVersion <em>Lyo Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lyo Version</em>' attribute.
	 * @see #getLyoVersion()
	 * @generated
	 */
	void setLyoVersion(String value);

} // ProjectConfiguration
