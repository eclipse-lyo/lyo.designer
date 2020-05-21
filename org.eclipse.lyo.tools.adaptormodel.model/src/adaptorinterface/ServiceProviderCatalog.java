/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ServiceProviderCatalog#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProviderCatalog#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProviderCatalog#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProviderCatalog#getServiceProviders <em>Service Providers</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getServiceProviderCatalog()
 * @model
 * @generated
 */
public interface ServiceProviderCatalog extends EObject {
	/**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProviderCatalog_Title()
     * @model
     * @generated
     */
	String getTitle();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProviderCatalog#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
	void setTitle(String value);

	/**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProviderCatalog_Description()
     * @model
     * @generated
     */
	String getDescription();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProviderCatalog#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
	void setDescription(String value);

	/**
     * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Publisher</em>' containment reference.
     * @see #setPublisher(Publisher)
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProviderCatalog_Publisher()
     * @model containment="true"
     * @generated
     */
	Publisher getPublisher();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProviderCatalog#getPublisher <em>Publisher</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publisher</em>' containment reference.
     * @see #getPublisher()
     * @generated
     */
	void setPublisher(Publisher value);

	/**
     * Returns the value of the '<em><b>Service Providers</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.ServiceProvider}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Providers</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProviderCatalog_ServiceProviders()
     * @model containment="true"
     * @generated
     */
	EList<ServiceProvider> getServiceProviders();

} // ServiceProviderCatalog
