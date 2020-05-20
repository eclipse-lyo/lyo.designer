/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.Service#getDomainSpecification <em>Domain Specification</em>}</li>
 *   <li>{@link adaptorinterface.Service#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link adaptorinterface.Service#getCreationFactories <em>Creation Factories</em>}</li>
 *   <li>{@link adaptorinterface.Service#getQueryCapabilities <em>Query Capabilities</em>}</li>
 *   <li>{@link adaptorinterface.Service#getSelectionDialogs <em>Selection Dialogs</em>}</li>
 *   <li>{@link adaptorinterface.Service#getCreationDialogs <em>Creation Dialogs</em>}</li>
 *   <li>{@link adaptorinterface.Service#getBasicCapabilities <em>Basic Capabilities</em>}</li>
 *   <li>{@link adaptorinterface.Service#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
     * Returns the value of the '<em><b>Domain Specification</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Domain Specification</em>' reference.
     * @see #setDomainSpecification(DomainSpecification)
     * @see adaptorinterface.AdaptorinterfacePackage#getService_DomainSpecification()
     * @model required="true"
     * @generated
     */
	DomainSpecification getDomainSpecification();

	/**
     * Sets the value of the '{@link adaptorinterface.Service#getDomainSpecification <em>Domain Specification</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Domain Specification</em>' reference.
     * @see #getDomainSpecification()
     * @generated
     */
	void setDomainSpecification(DomainSpecification value);

	/**
     * Returns the value of the '<em><b>Service Namespace</b></em>' attribute.
     * The default value is <code>"independantOfServiceProvider"</code>.
     * The literals are from the enumeration {@link adaptorinterface.ResourceServiceNamespace}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Namespace</em>' attribute.
     * @see adaptorinterface.ResourceServiceNamespace
     * @see #setServiceNamespace(ResourceServiceNamespace)
     * @see adaptorinterface.AdaptorinterfacePackage#getService_ServiceNamespace()
     * @model default="independantOfServiceProvider" required="true"
     * @generated
     */
	ResourceServiceNamespace getServiceNamespace();

	/**
     * Sets the value of the '{@link adaptorinterface.Service#getServiceNamespace <em>Service Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Namespace</em>' attribute.
     * @see adaptorinterface.ResourceServiceNamespace
     * @see #getServiceNamespace()
     * @generated
     */
	void setServiceNamespace(ResourceServiceNamespace value);

	/**
     * Returns the value of the '<em><b>Creation Factories</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.CreationFactory}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Factories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Creation Factories</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getService_CreationFactories()
     * @model containment="true"
     * @generated
     */
	EList<CreationFactory> getCreationFactories();

	/**
     * Returns the value of the '<em><b>Query Capabilities</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.QueryCapability}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Query Capabilities</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getService_QueryCapabilities()
     * @model containment="true"
     * @generated
     */
	EList<QueryCapability> getQueryCapabilities();

	/**
     * Returns the value of the '<em><b>Selection Dialogs</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.Dialog}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Dialogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Selection Dialogs</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getService_SelectionDialogs()
     * @model containment="true"
     * @generated
     */
	EList<Dialog> getSelectionDialogs();

	/**
     * Returns the value of the '<em><b>Creation Dialogs</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.Dialog}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Dialogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Creation Dialogs</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getService_CreationDialogs()
     * @model containment="true"
     * @generated
     */
	EList<Dialog> getCreationDialogs();

	/**
     * Returns the value of the '<em><b>Basic Capabilities</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.BasicCapability}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Capabilities</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getService_BasicCapabilities()
     * @model containment="true"
     * @generated
     */
	EList<BasicCapability> getBasicCapabilities();

	/**
     * Returns the value of the '<em><b>Usages</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Usages</em>' attribute list.
     * @see adaptorinterface.AdaptorinterfacePackage#getService_Usages()
     * @model
     * @generated
     */
	EList<String> getUsages();

} // Service
