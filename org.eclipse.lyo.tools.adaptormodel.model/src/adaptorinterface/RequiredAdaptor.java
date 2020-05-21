/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Adaptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.RequiredAdaptor#getServiceProviderCatalogURI <em>Service Provider Catalog URI</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getRequiredAdaptor()
 * @model abstract="true"
 * @generated
 */
public interface RequiredAdaptor extends EObject {
	/**
     * Returns the value of the '<em><b>Service Provider Catalog URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Catalog URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Provider Catalog URI</em>' attribute.
     * @see #setServiceProviderCatalogURI(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getRequiredAdaptor_ServiceProviderCatalogURI()
     * @model required="true"
     * @generated
     */
	String getServiceProviderCatalogURI();

	/**
     * Sets the value of the '{@link adaptorinterface.RequiredAdaptor#getServiceProviderCatalogURI <em>Service Provider Catalog URI</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Provider Catalog URI</em>' attribute.
     * @see #getServiceProviderCatalogURI()
     * @generated
     */
	void setServiceProviderCatalogURI(String value);

} // RequiredAdaptor
