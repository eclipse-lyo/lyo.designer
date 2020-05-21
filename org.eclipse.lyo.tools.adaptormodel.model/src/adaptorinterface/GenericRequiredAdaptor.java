/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Required Adaptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.GenericRequiredAdaptor#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.GenericRequiredAdaptor#getServicedResources <em>Serviced Resources</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getGenericRequiredAdaptor()
 * @model
 * @generated
 */
public interface GenericRequiredAdaptor extends RequiredAdaptor {
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
     * @see adaptorinterface.AdaptorinterfacePackage#getGenericRequiredAdaptor_Name()
     * @model required="true"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link adaptorinterface.GenericRequiredAdaptor#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Serviced Resources</b></em>' reference list.
     * The list contents are of type {@link adaptorinterface.Resource}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviced Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Serviced Resources</em>' reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getGenericRequiredAdaptor_ServicedResources()
     * @model
     * @generated
     */
	EList<Resource> getServicedResources();

} // GenericRequiredAdaptor
