/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.Specification#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.Specification#getDomainSpecifications <em>Domain Specifications</em>}</li>
 *   <li>{@link adaptorinterface.Specification#getDomainPrefixes <em>Domain Prefixes</em>}</li>
 *   <li>{@link adaptorinterface.Specification#getGenerationSetting <em>Generation Setting</em>}</li>
 *   <li>{@link adaptorinterface.Specification#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link adaptorinterface.Specification#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecification_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link adaptorinterface.Specification#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Domain Specifications</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.DomainSpecification}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Domain Specifications</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecification_DomainSpecifications()
     * @model containment="true" keys="name"
     * @generated
     */
	EList<DomainSpecification> getDomainSpecifications();

	/**
     * Returns the value of the '<em><b>Domain Prefixes</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.NamespacePrefix}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Prefixes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Domain Prefixes</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecification_DomainPrefixes()
     * @model containment="true" keys="name"
     * @generated
     */
	EList<NamespacePrefix> getDomainPrefixes();

	/**
     * Returns the value of the '<em><b>Generation Setting</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Setting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Generation Setting</em>' containment reference.
     * @see #setGenerationSetting(GenerationSetting)
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecification_GenerationSetting()
     * @model containment="true"
     * @generated
     */
	GenerationSetting getGenerationSetting();

	/**
     * Sets the value of the '{@link adaptorinterface.Specification#getGenerationSetting <em>Generation Setting</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generation Setting</em>' containment reference.
     * @see #getGenerationSetting()
     * @generated
     */
	void setGenerationSetting(GenerationSetting value);

	/**
     * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration</em>' containment reference.
     * @see #setConfiguration(SpecificationConfiguration)
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecification_Configuration()
     * @model containment="true"
     * @generated
     */
	SpecificationConfiguration getConfiguration();

	/**
     * Sets the value of the '{@link adaptorinterface.Specification#getConfiguration <em>Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Configuration</em>' containment reference.
     * @see #getConfiguration()
     * @generated
     */
	void setConfiguration(SpecificationConfiguration value);

    /**
     * Returns the value of the '<em><b>User Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Settings</em>' containment reference.
     * @see #setUserSettings(UserSettings)
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecification_UserSettings()
     * @model containment="true"
     * @generated
     */
    UserSettings getUserSettings();

    /**
     * Sets the value of the '{@link adaptorinterface.Specification#getUserSettings <em>User Settings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Settings</em>' containment reference.
     * @see #getUserSettings()
     * @generated
     */
    void setUserSettings(UserSettings value);

} // Specification
