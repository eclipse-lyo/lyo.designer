/**
 */
package adaptorinterface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store With Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.StoreWithAuthentication#getUsername <em>Username</em>}</li>
 *   <li>{@link adaptorinterface.StoreWithAuthentication#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getStoreWithAuthentication()
 * @model
 * @generated
 */
public interface StoreWithAuthentication extends Store {
    /**
     * Returns the value of the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Username</em>' attribute.
     * @see #setUsername(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getStoreWithAuthentication_Username()
     * @model required="true"
     * @generated
     */
    String getUsername();

    /**
     * Sets the value of the '{@link adaptorinterface.StoreWithAuthentication#getUsername <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Username</em>' attribute.
     * @see #getUsername()
     * @generated
     */
    void setUsername(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #setPassword(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getStoreWithAuthentication_Password()
     * @model required="true"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link adaptorinterface.StoreWithAuthentication#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #getPassword()
     * @generated
     */
    void setPassword(String value);

} // StoreWithAuthentication
