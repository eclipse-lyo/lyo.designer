/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ServiceProvider#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProvider#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProvider#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProvider#getServices <em>Services</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProvider#getServiceNamespace <em>Service Namespace</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProvider#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link adaptorinterface.ServiceProvider#getSourceBinding <em>Source Binding</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends EObject {
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
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider_Title()
     * @model
     * @generated
     */
	String getTitle();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProvider#getTitle <em>Title</em>}' attribute.
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
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider_Description()
     * @model
     * @generated
     */
	String getDescription();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProvider#getDescription <em>Description</em>}' attribute.
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
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider_Publisher()
     * @model containment="true"
     * @generated
     */
	Publisher getPublisher();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProvider#getPublisher <em>Publisher</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publisher</em>' containment reference.
     * @see #getPublisher()
     * @generated
     */
	void setPublisher(Publisher value);

	/**
     * Returns the value of the '<em><b>Services</b></em>' containment reference list.
     * The list contents are of type {@link adaptorinterface.Service}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' containment reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider_Services()
     * @model containment="true" required="true"
     * @generated
     */
	EList<Service> getServices();

	/**
     * Returns the value of the '<em><b>Service Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Service Namespace</em>' attribute.
     * @see #setServiceNamespace(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider_ServiceNamespace()
     * @model
     * @generated
     */
	String getServiceNamespace();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProvider#getServiceNamespace <em>Service Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Namespace</em>' attribute.
     * @see #getServiceNamespace()
     * @generated
     */
	void setServiceNamespace(String value);

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
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider_InstanceID()
     * @model
     * @generated
     */
	String getInstanceID();

	/**
     * Sets the value of the '{@link adaptorinterface.ServiceProvider#getInstanceID <em>Instance ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instance ID</em>' attribute.
     * @see #getInstanceID()
     * @generated
     */
	void setInstanceID(String value);

    /**
     * Returns the value of the '<em><b>Source Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Binding</em>' containment reference.
     * @see #setSourceBinding(SourceBinding)
     * @see adaptorinterface.AdaptorinterfacePackage#getServiceProvider_SourceBinding()
     * @model containment="true"
     * @generated
     */
    SourceBinding getSourceBinding();

    /**
     * Sets the value of the '{@link adaptorinterface.ServiceProvider#getSourceBinding <em>Source Binding</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Binding</em>' containment reference.
     * @see #getSourceBinding()
     * @generated
     */
    void setSourceBinding(SourceBinding value);

} // ServiceProvider
