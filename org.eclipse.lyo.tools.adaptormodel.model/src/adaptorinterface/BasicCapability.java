/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.BasicCapability#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link adaptorinterface.BasicCapability#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link adaptorinterface.BasicCapability#isRead <em>Read</em>}</li>
 *   <li>{@link adaptorinterface.BasicCapability#isDelete <em>Delete</em>}</li>
 *   <li>{@link adaptorinterface.BasicCapability#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getBasicCapability()
 * @model
 * @generated
 */
public interface BasicCapability extends EObject {
	/**
     * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Instance ID</em>' attribute.
     * @see #setInstanceID(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getBasicCapability_InstanceID()
     * @model
     * @generated
     */
	String getInstanceID();

	/**
     * Sets the value of the '{@link adaptorinterface.BasicCapability#getInstanceID <em>Instance ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instance ID</em>' attribute.
     * @see #getInstanceID()
     * @generated
     */
	void setInstanceID(String value);

	/**
     * Returns the value of the '<em><b>Resource Types</b></em>' reference list.
     * The list contents are of type {@link adaptorinterface.Resource}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Types</em>' reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getBasicCapability_ResourceTypes()
     * @model
     * @generated
     */
	EList<Resource> getResourceTypes();

	/**
     * Returns the value of the '<em><b>Read</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Read</em>' attribute.
     * @see #setRead(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getBasicCapability_Read()
     * @model default="true"
     * @generated
     */
	boolean isRead();

	/**
     * Sets the value of the '{@link adaptorinterface.BasicCapability#isRead <em>Read</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read</em>' attribute.
     * @see #isRead()
     * @generated
     */
	void setRead(boolean value);

	/**
     * Returns the value of the '<em><b>Delete</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delete</em>' attribute.
     * @see #setDelete(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getBasicCapability_Delete()
     * @model default="false"
     * @generated
     */
	boolean isDelete();

	/**
     * Sets the value of the '{@link adaptorinterface.BasicCapability#isDelete <em>Delete</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete</em>' attribute.
     * @see #isDelete()
     * @generated
     */
	void setDelete(boolean value);

	/**
     * Returns the value of the '<em><b>Update</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Update</em>' attribute.
     * @see #setUpdate(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getBasicCapability_Update()
     * @model default="false"
     * @generated
     */
	boolean isUpdate();

	/**
     * Sets the value of the '{@link adaptorinterface.BasicCapability#isUpdate <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Update</em>' attribute.
     * @see #isUpdate()
     * @generated
     */
	void setUpdate(boolean value);

} // BasicCapability
