/**
 */
package toolchain;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.Specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import vocabulary.Vocabularies;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toolchain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link toolchain.Toolchain#getName <em>Name</em>}</li>
 *   <li>{@link toolchain.Toolchain#getAdaptorInterfaces <em>Adaptor Interfaces</em>}</li>
 *   <li>{@link toolchain.Toolchain#getSpecification <em>Specification</em>}</li>
 *   <li>{@link toolchain.Toolchain#getVocabularies <em>Vocabularies</em>}</li>
 * </ul>
 *
 * @see toolchain.ToolchainPackage#getToolchain()
 * @model
 * @generated
 */
public interface Toolchain extends EObject {
	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>"New ToolChain"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see toolchain.ToolchainPackage#getToolchain_Name()
     * @model default="New ToolChain"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link toolchain.Toolchain#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Adaptor Interfaces</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.AdaptorInterface}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptor Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Adaptor Interfaces</em>' containment reference list.
     * @see toolchain.ToolchainPackage#getToolchain_AdaptorInterfaces()
     * @model containment="true"
     * @generated
     */
	EList<AdaptorInterface> getAdaptorInterfaces();

	/**
     * Returns the value of the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Specification</em>' containment reference.
     * @see #setSpecification(Specification)
     * @see toolchain.ToolchainPackage#getToolchain_Specification()
     * @model containment="true" required="true"
     * @generated
     */
	Specification getSpecification();

	/**
     * Sets the value of the '{@link toolchain.Toolchain#getSpecification <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specification</em>' containment reference.
     * @see #getSpecification()
     * @generated
     */
	void setSpecification(Specification value);

	/**
     * Returns the value of the '<em><b>Vocabularies</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabularies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Vocabularies</em>' containment reference.
     * @see #setVocabularies(Vocabularies)
     * @see toolchain.ToolchainPackage#getToolchain_Vocabularies()
     * @model containment="true" required="true"
     * @generated
     */
	Vocabularies getVocabularies();

	/**
     * Sets the value of the '{@link toolchain.Toolchain#getVocabularies <em>Vocabularies</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vocabularies</em>' containment reference.
     * @see #getVocabularies()
     * @generated
     */
	void setVocabularies(Vocabularies value);

} // Toolchain
