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
 *   <li>{@link adaptorinterface.Specification#getDomainSpecifications <em>Domain Specifications</em>}</li>
 *   <li>{@link adaptorinterface.Specification#getDomainPrefixes <em>Domain Prefixes</em>}</li>
 *   <li>{@link adaptorinterface.Specification#getGenerationSetting <em>Generation Setting</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
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

} // Specification
