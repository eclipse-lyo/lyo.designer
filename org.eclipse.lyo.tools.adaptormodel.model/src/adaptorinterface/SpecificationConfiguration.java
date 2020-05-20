/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.SpecificationConfiguration#getGeneralConfiguration <em>General Configuration</em>}</li>
 *   <li>{@link adaptorinterface.SpecificationConfiguration#getProjectConfiguration <em>Project Configuration</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getSpecificationConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface SpecificationConfiguration extends EObject {
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
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecificationConfiguration_GeneralConfiguration()
     * @model containment="true" required="true"
     * @generated
     */
	GeneralConfiguration getGeneralConfiguration();

	/**
     * Sets the value of the '{@link adaptorinterface.SpecificationConfiguration#getGeneralConfiguration <em>General Configuration</em>}' containment reference.
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
     * @see adaptorinterface.AdaptorinterfacePackage#getSpecificationConfiguration_ProjectConfiguration()
     * @model containment="true" required="true"
     * @generated
     */
	ProjectConfiguration getProjectConfiguration();

	/**
     * Sets the value of the '{@link adaptorinterface.SpecificationConfiguration#getProjectConfiguration <em>Project Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project Configuration</em>' containment reference.
     * @see #getProjectConfiguration()
     * @generated
     */
	void setProjectConfiguration(ProjectConfiguration value);

} // SpecificationConfiguration
