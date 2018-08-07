/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.Resource#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getDescribes <em>Describes</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getExtends <em>Extends</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getResourceProperties <em>Resource Properties</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Shape {
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adaptorinterface.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link adaptorinterface.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getResource_Extends()
	 * @model
	 * @generated
	 */
	EList<Resource> getExtends();

	/**
	 * Returns the value of the '<em><b>Resource Properties</b></em>' reference list.
	 * The list contents are of type {@link adaptorinterface.ResourceProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Properties</em>' reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getResource_ResourceProperties()
	 * @model
	 * @generated
	 */
	EList<ResourceProperty> getResourceProperties();

	/**
	 * Returns the value of the '<em><b>Describes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' reference.
	 * @see #setDescribes(vocabulary.Class)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResource_Describes()
	 * @model
	 * @generated
	 */
	vocabulary.Class getDescribes();

	/**
	 * Sets the value of the '{@link adaptorinterface.Resource#getDescribes <em>Describes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describes</em>' reference.
	 * @see #getDescribes()
	 * @generated
	 */
	void setDescribes(vocabulary.Class value);

} // Resource
