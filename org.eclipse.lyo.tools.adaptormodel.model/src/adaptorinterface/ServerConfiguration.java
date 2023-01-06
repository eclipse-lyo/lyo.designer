/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ServerConfiguration#getRootServerBaseUrl <em>Root Server Base Url</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#getApplicationContextPath <em>Application Context Path</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#getServletUrlPattern <em>Servlet Url Pattern</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#isDoNotRegenerateJspFiles <em>Do Not Regenerate Jsp Files</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#isGenerateJspFilesForOslcUI <em>Generate Jsp Files For Oslc UI</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#getGeneralConfiguration <em>General Configuration</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#getProjectConfiguration <em>Project Configuration</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#getAuthenticationConfiguration <em>Authentication Configuration</em>}</li>
 *   <li>{@link adaptorinterface.ServerConfiguration#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration()
 * @model
 * @generated
 */
public interface ServerConfiguration extends EObject {
	/**
     * Returns the value of the '<em><b>Root Server Base Url</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Server Base Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Root Server Base Url</em>' attribute.
     * @see #setRootServerBaseUrl(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_RootServerBaseUrl()
     * @model required="true"
     * @generated
     */
	String getRootServerBaseUrl();

	/**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#getRootServerBaseUrl <em>Root Server Base Url</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Server Base Url</em>' attribute.
     * @see #getRootServerBaseUrl()
     * @generated
     */
	void setRootServerBaseUrl(String value);

	/**
     * Returns the value of the '<em><b>Application Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Context Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Application Context Path</em>' attribute.
     * @see #setApplicationContextPath(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_ApplicationContextPath()
     * @model required="true"
     * @generated
     */
	String getApplicationContextPath();

	/**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#getApplicationContextPath <em>Application Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application Context Path</em>' attribute.
     * @see #getApplicationContextPath()
     * @generated
     */
	void setApplicationContextPath(String value);

	/**
     * Returns the value of the '<em><b>Servlet Url Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Url Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Servlet Url Pattern</em>' attribute.
     * @see #setServletUrlPattern(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_ServletUrlPattern()
     * @model required="true"
     * @generated
     */
	String getServletUrlPattern();

	/**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#getServletUrlPattern <em>Servlet Url Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Servlet Url Pattern</em>' attribute.
     * @see #getServletUrlPattern()
     * @generated
     */
	void setServletUrlPattern(String value);

	/**
     * Returns the value of the '<em><b>Do Not Regenerate Jsp Files</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Not Regenerate Jsp Files</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Do Not Regenerate Jsp Files</em>' attribute.
     * @see #setDoNotRegenerateJspFiles(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_DoNotRegenerateJspFiles()
     * @model
     * @generated
     */
	boolean isDoNotRegenerateJspFiles();

	/**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#isDoNotRegenerateJspFiles <em>Do Not Regenerate Jsp Files</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Not Regenerate Jsp Files</em>' attribute.
     * @see #isDoNotRegenerateJspFiles()
     * @generated
     */
	void setDoNotRegenerateJspFiles(boolean value);

	/**
     * Returns the value of the '<em><b>Generate Jsp Files For Oslc UI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generate Jsp Files For Oslc UI</em>' attribute.
     * @see #setGenerateJspFilesForOslcUI(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_GenerateJspFilesForOslcUI()
     * @model
     * @generated
     */
    boolean isGenerateJspFilesForOslcUI();

    /**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#isGenerateJspFilesForOslcUI <em>Generate Jsp Files For Oslc UI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generate Jsp Files For Oslc UI</em>' attribute.
     * @see #isGenerateJspFilesForOslcUI()
     * @generated
     */
    void setGenerateJspFilesForOslcUI(boolean value);

    /**
     * Returns the value of the '<em><b>General Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>General Configuration</em>' containment reference.
     * @see #setGeneralConfiguration(GeneralConfiguration)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_GeneralConfiguration()
     * @model containment="true" required="true"
     * @generated
     */
	GeneralConfiguration getGeneralConfiguration();

	/**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#getGeneralConfiguration <em>General Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>General Configuration</em>' containment reference.
     * @see #getGeneralConfiguration()
     * @generated
     */
	void setGeneralConfiguration(GeneralConfiguration value);

	/**
     * Returns the value of the '<em><b>Project Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Project Configuration</em>' containment reference.
     * @see #setProjectConfiguration(ProjectConfiguration)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_ProjectConfiguration()
     * @model containment="true" required="true"
     * @generated
     */
	ProjectConfiguration getProjectConfiguration();

	/**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#getProjectConfiguration <em>Project Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project Configuration</em>' containment reference.
     * @see #getProjectConfiguration()
     * @generated
     */
	void setProjectConfiguration(ProjectConfiguration value);

	/**
     * Returns the value of the '<em><b>Authentication Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Authentication Configuration</em>' containment reference.
     * @see #setAuthenticationConfiguration(AuthenticationConfiguration)
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_AuthenticationConfiguration()
     * @model containment="true"
     * @generated
     */
	AuthenticationConfiguration getAuthenticationConfiguration();

	/**
     * Sets the value of the '{@link adaptorinterface.ServerConfiguration#getAuthenticationConfiguration <em>Authentication Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authentication Configuration</em>' containment reference.
     * @see #getAuthenticationConfiguration()
     * @generated
     */
	void setAuthenticationConfiguration(AuthenticationConfiguration value);

    /**
     * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.Configuration}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getServerConfiguration_Configurations()
     * @model containment="true"
     * @generated
     */
    EList<Configuration> getConfigurations();

} // ServerConfiguration
