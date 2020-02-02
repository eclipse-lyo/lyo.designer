/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.WebService#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.WebService#getServiceUrlPattern <em>Service Url Pattern</em>}</li>
 *   <li>{@link adaptorinterface.WebService#getResourceUrlPattern <em>Resource Url Pattern</em>}</li>
 *   <li>{@link adaptorinterface.WebService#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link adaptorinterface.WebService#isRead <em>Read</em>}</li>
 *   <li>{@link adaptorinterface.WebService#isDelete <em>Delete</em>}</li>
 *   <li>{@link adaptorinterface.WebService#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getWebService()
 * @model
 * @generated
 */
public interface WebService extends EObject {
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getWebService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adaptorinterface.WebService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service Url Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Url Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Url Pattern</em>' attribute.
	 * @see #setServiceUrlPattern(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getWebService_ServiceUrlPattern()
	 * @model
	 * @generated
	 */
	String getServiceUrlPattern();

	/**
	 * Sets the value of the '{@link adaptorinterface.WebService#getServiceUrlPattern <em>Service Url Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Url Pattern</em>' attribute.
	 * @see #getServiceUrlPattern()
	 * @generated
	 */
	void setServiceUrlPattern(String value);

	/**
	 * Returns the value of the '<em><b>Resource Url Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Url Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Url Pattern</em>' attribute.
	 * @see #setResourceUrlPattern(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getWebService_ResourceUrlPattern()
	 * @model
	 * @generated
	 */
	String getResourceUrlPattern();

	/**
	 * Sets the value of the '{@link adaptorinterface.WebService#getResourceUrlPattern <em>Resource Url Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Url Pattern</em>' attribute.
	 * @see #getResourceUrlPattern()
	 * @generated
	 */
	void setResourceUrlPattern(String value);

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
	 * @see adaptorinterface.AdaptorinterfacePackage#getWebService_ResourceTypes()
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getWebService_Read()
	 * @model default="true"
	 * @generated
	 */
	boolean isRead();

	/**
	 * Sets the value of the '{@link adaptorinterface.WebService#isRead <em>Read</em>}' attribute.
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getWebService_Delete()
	 * @model default="false"
	 * @generated
	 */
	boolean isDelete();

	/**
	 * Sets the value of the '{@link adaptorinterface.WebService#isDelete <em>Delete</em>}' attribute.
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getWebService_Update()
	 * @model default="false"
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link adaptorinterface.WebService#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

} // WebService
