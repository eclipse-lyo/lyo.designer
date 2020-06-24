/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Persistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ServicePersistence#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getServicePersistence()
 * @model abstract="true"
 * @generated
 */
public interface ServicePersistence extends EObject {
    /**
     * Returns the value of the '<em><b>Store</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Store</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Store</em>' reference.
     * @see #setStore(Store)
     * @see adaptorinterface.AdaptorinterfacePackage#getServicePersistence_Store()
     * @model required="true"
     * @generated
     */
    Store getStore();

    /**
     * Sets the value of the '{@link adaptorinterface.ServicePersistence#getStore <em>Store</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Store</em>' reference.
     * @see #getStore()
     * @generated
     */
    void setStore(Store value);

} // ServicePersistence
