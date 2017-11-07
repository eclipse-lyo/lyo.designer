/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptor Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.AdaptorInterface#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getServiceProviderCatalog <em>Service Provider Catalog</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getSpecification <em>Specification</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getRequiredAdaptors <em>Required Adaptors</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getJavaFilesBasePath <em>Java Files Base Path</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getJspFilesBasePath <em>Jsp Files Base Path</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classImports <em>Backend Code Template class Imports</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classMethods <em>Backend Code Template class Methods</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerInitialize <em>Backend Code Template servlet Listener Initialize</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerDestroy <em>Backend Code Template servlet Listener Destroy</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getServiceProviders <em>Backend Code Template get Service Providers</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResource <em>Backend Code Template get Resource</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResources <em>Backend Code Template get Resources</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_searchResources <em>Backend Code Template search Resources</em>}</li>
 *   <li>{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_createResource <em>Backend Code Template create Resource</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface()
 * @model
 * @generated
 */
public interface AdaptorInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Provider Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider Catalog</em>' containment reference.
	 * @see #setServiceProviderCatalog(ServiceProviderCatalog)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_ServiceProviderCatalog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceProviderCatalog getServiceProviderCatalog();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getServiceProviderCatalog <em>Service Provider Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider Catalog</em>' containment reference.
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	void setServiceProviderCatalog(ServiceProviderCatalog value);

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
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Java Class Base Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class Base Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class Base Namespace</em>' attribute.
	 * @see #setJavaClassBaseNamespace(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_JavaClassBaseNamespace()
	 * @model required="true"
	 * @generated
	 */
	String getJavaClassBaseNamespace();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class Base Namespace</em>' attribute.
	 * @see #getJavaClassBaseNamespace()
	 * @generated
	 */
	void setJavaClassBaseNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Specification)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Java Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Files Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Files Base Path</em>' attribute.
	 * @see #setJavaFilesBasePath(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_JavaFilesBasePath()
	 * @model required="true"
	 * @generated
	 */
	String getJavaFilesBasePath();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getJavaFilesBasePath <em>Java Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Files Base Path</em>' attribute.
	 * @see #getJavaFilesBasePath()
	 * @generated
	 */
	void setJavaFilesBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Jsp Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsp Files Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsp Files Base Path</em>' attribute.
	 * @see #setJspFilesBasePath(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_JspFilesBasePath()
	 * @model required="true"
	 * @generated
	 */
	String getJspFilesBasePath();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getJspFilesBasePath <em>Jsp Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsp Files Base Path</em>' attribute.
	 * @see #getJspFilesBasePath()
	 * @generated
	 */
	void setJspFilesBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Javascript Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Javascript Files Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Javascript Files Base Path</em>' attribute.
	 * @see #setJavascriptFilesBasePath(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_JavascriptFilesBasePath()
	 * @model required="true"
	 * @generated
	 */
	String getJavascriptFilesBasePath();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Javascript Files Base Path</em>' attribute.
	 * @see #getJavascriptFilesBasePath()
	 * @generated
	 */
	void setJavascriptFilesBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template class Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template class Imports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template class Imports</em>' attribute.
	 * @see #setBackendCodeTemplate_classImports(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_classImports()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_classImports();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classImports <em>Backend Code Template class Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template class Imports</em>' attribute.
	 * @see #getBackendCodeTemplate_classImports()
	 * @generated
	 */
	void setBackendCodeTemplate_classImports(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template class Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template class Methods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template class Methods</em>' attribute.
	 * @see #setBackendCodeTemplate_classMethods(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_classMethods()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_classMethods();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classMethods <em>Backend Code Template class Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template class Methods</em>' attribute.
	 * @see #getBackendCodeTemplate_classMethods()
	 * @generated
	 */
	void setBackendCodeTemplate_classMethods(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template servlet Listener Initialize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template servlet Listener Initialize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template servlet Listener Initialize</em>' attribute.
	 * @see #setBackendCodeTemplate_servletListenerInitialize(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_servletListenerInitialize()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_servletListenerInitialize();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerInitialize <em>Backend Code Template servlet Listener Initialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template servlet Listener Initialize</em>' attribute.
	 * @see #getBackendCodeTemplate_servletListenerInitialize()
	 * @generated
	 */
	void setBackendCodeTemplate_servletListenerInitialize(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template servlet Listener Destroy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template servlet Listener Destroy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template servlet Listener Destroy</em>' attribute.
	 * @see #setBackendCodeTemplate_servletListenerDestroy(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_servletListenerDestroy()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_servletListenerDestroy();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerDestroy <em>Backend Code Template servlet Listener Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template servlet Listener Destroy</em>' attribute.
	 * @see #getBackendCodeTemplate_servletListenerDestroy()
	 * @generated
	 */
	void setBackendCodeTemplate_servletListenerDestroy(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template get Service Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template get Service Providers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template get Service Providers</em>' attribute.
	 * @see #setBackendCodeTemplate_getServiceProviders(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_getServiceProviders()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_getServiceProviders();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getServiceProviders <em>Backend Code Template get Service Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template get Service Providers</em>' attribute.
	 * @see #getBackendCodeTemplate_getServiceProviders()
	 * @generated
	 */
	void setBackendCodeTemplate_getServiceProviders(String value);

	/**
	 * Returns the value of the '<em><b>Required Adaptors</b></em>' containment reference list.
	 * The list contents are of type {@link adaptorinterface.RequiredAdaptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Adaptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Adaptors</em>' containment reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_RequiredAdaptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredAdaptor> getRequiredAdaptors();

	/**
	 * Returns the value of the '<em><b>Backend Code Template get Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template get Resources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template get Resources</em>' attribute.
	 * @see #setBackendCodeTemplate_getResources(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_getResources()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_getResources();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResources <em>Backend Code Template get Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template get Resources</em>' attribute.
	 * @see #getBackendCodeTemplate_getResources()
	 * @generated
	 */
	void setBackendCodeTemplate_getResources(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template get Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template get Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template get Resource</em>' attribute.
	 * @see #setBackendCodeTemplate_getResource(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_getResource()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_getResource();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResource <em>Backend Code Template get Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template get Resource</em>' attribute.
	 * @see #getBackendCodeTemplate_getResource()
	 * @generated
	 */
	void setBackendCodeTemplate_getResource(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template search Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template search Resources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template search Resources</em>' attribute.
	 * @see #setBackendCodeTemplate_searchResources(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_searchResources()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_searchResources();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_searchResources <em>Backend Code Template search Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template search Resources</em>' attribute.
	 * @see #getBackendCodeTemplate_searchResources()
	 * @generated
	 */
	void setBackendCodeTemplate_searchResources(String value);

	/**
	 * Returns the value of the '<em><b>Backend Code Template create Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backend Code Template create Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Code Template create Resource</em>' attribute.
	 * @see #setBackendCodeTemplate_createResource(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getAdaptorInterface_BackendCodeTemplate_createResource()
	 * @model
	 * @generated
	 */
	String getBackendCodeTemplate_createResource();

	/**
	 * Sets the value of the '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_createResource <em>Backend Code Template create Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backend Code Template create Resource</em>' attribute.
	 * @see #getBackendCodeTemplate_createResource()
	 * @generated
	 */
	void setBackendCodeTemplate_createResource(String value);

} // AdaptorInterface
