/**
 */
package adaptorinterface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service Persistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.WebServicePersistence#isRead <em>Read</em>}</li>
 *   <li>{@link adaptorinterface.WebServicePersistence#isDelete <em>Delete</em>}</li>
 *   <li>{@link adaptorinterface.WebServicePersistence#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getWebServicePersistence()
 * @model
 * @generated
 */
public interface WebServicePersistence extends ServicePersistence {
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
     * @see adaptorinterface.AdaptorinterfacePackage#getWebServicePersistence_Read()
     * @model default="true" required="true"
     * @generated
     */
    boolean isRead();

    /**
     * Sets the value of the '{@link adaptorinterface.WebServicePersistence#isRead <em>Read</em>}' attribute.
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
     * @see adaptorinterface.AdaptorinterfacePackage#getWebServicePersistence_Delete()
     * @model default="false" required="true"
     * @generated
     */
    boolean isDelete();

    /**
     * Sets the value of the '{@link adaptorinterface.WebServicePersistence#isDelete <em>Delete</em>}' attribute.
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
     * @see adaptorinterface.AdaptorinterfacePackage#getWebServicePersistence_Update()
     * @model default="false" required="true"
     * @generated
     */
    boolean isUpdate();

    /**
     * Sets the value of the '{@link adaptorinterface.WebServicePersistence#isUpdate <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Update</em>' attribute.
     * @see #isUpdate()
     * @generated
     */
    void setUpdate(boolean value);

} // WebServicePersistence
