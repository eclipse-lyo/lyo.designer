/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.DomainSpecification#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.DomainSpecification#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link adaptorinterface.DomainSpecification#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link adaptorinterface.DomainSpecification#getResources <em>Resources</em>}</li>
 *   <li>{@link adaptorinterface.DomainSpecification#getResourceProperties <em>Resource Properties</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getDomainSpecification()
 * @model
 * @generated
 */
public interface DomainSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getDomainSpecification_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adaptorinterface.DomainSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace URI</em>' attribute.
	 * @see #setNamespaceURI(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getDomainSpecification_NamespaceURI()
	 * @model required="true"
	 * @generated
	 */
	String getNamespaceURI();

	/**
	 * Sets the value of the '{@link adaptorinterface.DomainSpecification#getNamespaceURI <em>Namespace URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace URI</em>' attribute.
	 * @see #getNamespaceURI()
	 * @generated
	 */
	void setNamespaceURI(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Prefix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Prefix</em>' reference.
	 * @see #setNamespacePrefix(NamespacePrefix)
	 * @see adaptorinterface.AdaptorinterfacePackage#getDomainSpecification_NamespacePrefix()
	 * @model required="true"
	 * @generated
	 */
	NamespacePrefix getNamespacePrefix();

	/**
	 * Sets the value of the '{@link adaptorinterface.DomainSpecification#getNamespacePrefix <em>Namespace Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Prefix</em>' reference.
	 * @see #getNamespacePrefix()
	 * @generated
	 */
	void setNamespacePrefix(NamespacePrefix value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link adaptorinterface.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getDomainSpecification_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Resource Properties</b></em>' containment reference list.
	 * The list contents are of type {@link adaptorinterface.ResourceProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Properties</em>' containment reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getDomainSpecification_ResourceProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceProperty> getResourceProperties();

} // DomainSpecification
