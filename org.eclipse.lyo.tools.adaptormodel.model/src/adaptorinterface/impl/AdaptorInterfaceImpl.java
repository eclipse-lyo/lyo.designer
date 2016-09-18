/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.RequiredAdaptor;
import adaptorinterface.ServiceProviderCatalog;
import adaptorinterface.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptor Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getServiceProviderCatalog <em>Service Provider Catalog</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getRequiredAdaptors <em>Required Adaptors</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getJavaFilesBasePath <em>Java Files Base Path</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getJspFilesBasePath <em>Jsp Files Base Path</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_classImports <em>Backend Code Template class Imports</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_classMethods <em>Backend Code Template class Methods</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_servletListenerInitialize <em>Backend Code Template servlet Listener Initialize</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_servletListenerDestroy <em>Backend Code Template servlet Listener Destroy</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_getServiceProviders <em>Backend Code Template get Service Providers</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_getResource <em>Backend Code Template get Resource</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_getResources <em>Backend Code Template get Resources</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_searchResources <em>Backend Code Template search Resources</em>}</li>
 *   <li>{@link adaptorinterface.impl.AdaptorInterfaceImpl#getBackendCodeTemplate_createResource <em>Backend Code Template create Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptorInterfaceImpl extends MinimalEObjectImpl.Container implements AdaptorInterface {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceProviderCatalog() <em>Service Provider Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviderCatalog()
	 * @generated
	 * @ordered
	 */
	protected ServiceProviderCatalog serviceProviderCatalog;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification specification;

	/**
	 * The cached value of the '{@link #getRequiredAdaptors() <em>Required Adaptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAdaptors()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredAdaptor> requiredAdaptors;

	/**
	 * The default value of the '{@link #getJavaClassBaseNamespace() <em>Java Class Base Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassBaseNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_CLASS_BASE_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaClassBaseNamespace() <em>Java Class Base Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClassBaseNamespace()
	 * @generated
	 * @ordered
	 */
	protected String javaClassBaseNamespace = JAVA_CLASS_BASE_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaFilesBasePath() <em>Java Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaFilesBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_FILES_BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaFilesBasePath() <em>Java Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaFilesBasePath()
	 * @generated
	 * @ordered
	 */
	protected String javaFilesBasePath = JAVA_FILES_BASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getJspFilesBasePath() <em>Jsp Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJspFilesBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String JSP_FILES_BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJspFilesBasePath() <em>Jsp Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJspFilesBasePath()
	 * @generated
	 * @ordered
	 */
	protected String jspFilesBasePath = JSP_FILES_BASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavascriptFilesBasePath() <em>Javascript Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavascriptFilesBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVASCRIPT_FILES_BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavascriptFilesBasePath() <em>Javascript Files Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavascriptFilesBasePath()
	 * @generated
	 * @ordered
	 */
	protected String javascriptFilesBasePath = JAVASCRIPT_FILES_BASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_classImports() <em>Backend Code Template class Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_classImports()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_CLASS_IMPORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_classImports() <em>Backend Code Template class Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_classImports()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_classImports = BACKEND_CODE_TEMPLATE_CLASS_IMPORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_classMethods() <em>Backend Code Template class Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_classMethods()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_CLASS_METHODS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_classMethods() <em>Backend Code Template class Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_classMethods()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_classMethods = BACKEND_CODE_TEMPLATE_CLASS_METHODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_servletListenerInitialize() <em>Backend Code Template servlet Listener Initialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_servletListenerInitialize()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_servletListenerInitialize() <em>Backend Code Template servlet Listener Initialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_servletListenerInitialize()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_servletListenerInitialize = BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_servletListenerDestroy() <em>Backend Code Template servlet Listener Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_servletListenerDestroy()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_servletListenerDestroy() <em>Backend Code Template servlet Listener Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_servletListenerDestroy()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_servletListenerDestroy = BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_getServiceProviders() <em>Backend Code Template get Service Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_getServiceProviders()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_getServiceProviders() <em>Backend Code Template get Service Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_getServiceProviders()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_getServiceProviders = BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_getResource() <em>Backend Code Template get Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_GET_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_getResource() <em>Backend Code Template get Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_getResource()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_getResource = BACKEND_CODE_TEMPLATE_GET_RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_getResources() <em>Backend Code Template get Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_getResources()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_GET_RESOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_getResources() <em>Backend Code Template get Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_getResources()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_getResources = BACKEND_CODE_TEMPLATE_GET_RESOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_searchResources() <em>Backend Code Template search Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_searchResources()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_searchResources() <em>Backend Code Template search Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_searchResources()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_searchResources = BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackendCodeTemplate_createResource() <em>Backend Code Template create Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_createResource()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_CODE_TEMPLATE_CREATE_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackendCodeTemplate_createResource() <em>Backend Code Template create Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendCodeTemplate_createResource()
	 * @generated
	 * @ordered
	 */
	protected String backendCodeTemplate_createResource = BACKEND_CODE_TEMPLATE_CREATE_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptorInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptorinterfacePackage.Literals.ADAPTOR_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderCatalog getServiceProviderCatalog() {
		return serviceProviderCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProviderCatalog(ServiceProviderCatalog newServiceProviderCatalog, NotificationChain msgs) {
		ServiceProviderCatalog oldServiceProviderCatalog = serviceProviderCatalog;
		serviceProviderCatalog = newServiceProviderCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG, oldServiceProviderCatalog, newServiceProviderCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProviderCatalog(ServiceProviderCatalog newServiceProviderCatalog) {
		if (newServiceProviderCatalog != serviceProviderCatalog) {
			NotificationChain msgs = null;
			if (serviceProviderCatalog != null)
				msgs = ((InternalEObject)serviceProviderCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG, null, msgs);
			if (newServiceProviderCatalog != null)
				msgs = ((InternalEObject)newServiceProviderCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG, null, msgs);
			msgs = basicSetServiceProviderCatalog(newServiceProviderCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG, newServiceProviderCatalog, newServiceProviderCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaClassBaseNamespace() {
		return javaClassBaseNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaClassBaseNamespace(String newJavaClassBaseNamespace) {
		String oldJavaClassBaseNamespace = javaClassBaseNamespace;
		javaClassBaseNamespace = newJavaClassBaseNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE, oldJavaClassBaseNamespace, javaClassBaseNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
		Specification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaFilesBasePath() {
		return javaFilesBasePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaFilesBasePath(String newJavaFilesBasePath) {
		String oldJavaFilesBasePath = javaFilesBasePath;
		javaFilesBasePath = newJavaFilesBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH, oldJavaFilesBasePath, javaFilesBasePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJspFilesBasePath() {
		return jspFilesBasePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJspFilesBasePath(String newJspFilesBasePath) {
		String oldJspFilesBasePath = jspFilesBasePath;
		jspFilesBasePath = newJspFilesBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH, oldJspFilesBasePath, jspFilesBasePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavascriptFilesBasePath() {
		return javascriptFilesBasePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavascriptFilesBasePath(String newJavascriptFilesBasePath) {
		String oldJavascriptFilesBasePath = javascriptFilesBasePath;
		javascriptFilesBasePath = newJavascriptFilesBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH, oldJavascriptFilesBasePath, javascriptFilesBasePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_classImports() {
		return backendCodeTemplate_classImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_classImports(String newBackendCodeTemplate_classImports) {
		String oldBackendCodeTemplate_classImports = backendCodeTemplate_classImports;
		backendCodeTemplate_classImports = newBackendCodeTemplate_classImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS, oldBackendCodeTemplate_classImports, backendCodeTemplate_classImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredAdaptor> getRequiredAdaptors() {
		if (requiredAdaptors == null) {
			requiredAdaptors = new EObjectContainmentEList<RequiredAdaptor>(RequiredAdaptor.class, this, AdaptorinterfacePackage.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS);
		}
		return requiredAdaptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_getResources() {
		return backendCodeTemplate_getResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_getResources(String newBackendCodeTemplate_getResources) {
		String oldBackendCodeTemplate_getResources = backendCodeTemplate_getResources;
		backendCodeTemplate_getResources = newBackendCodeTemplate_getResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES, oldBackendCodeTemplate_getResources, backendCodeTemplate_getResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_getResource() {
		return backendCodeTemplate_getResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_getResource(String newBackendCodeTemplate_getResource) {
		String oldBackendCodeTemplate_getResource = backendCodeTemplate_getResource;
		backendCodeTemplate_getResource = newBackendCodeTemplate_getResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE, oldBackendCodeTemplate_getResource, backendCodeTemplate_getResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_searchResources() {
		return backendCodeTemplate_searchResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_searchResources(String newBackendCodeTemplate_searchResources) {
		String oldBackendCodeTemplate_searchResources = backendCodeTemplate_searchResources;
		backendCodeTemplate_searchResources = newBackendCodeTemplate_searchResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES, oldBackendCodeTemplate_searchResources, backendCodeTemplate_searchResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_createResource() {
		return backendCodeTemplate_createResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_createResource(String newBackendCodeTemplate_createResource) {
		String oldBackendCodeTemplate_createResource = backendCodeTemplate_createResource;
		backendCodeTemplate_createResource = newBackendCodeTemplate_createResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE, oldBackendCodeTemplate_createResource, backendCodeTemplate_createResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_classMethods() {
		return backendCodeTemplate_classMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_classMethods(String newBackendCodeTemplate_classMethods) {
		String oldBackendCodeTemplate_classMethods = backendCodeTemplate_classMethods;
		backendCodeTemplate_classMethods = newBackendCodeTemplate_classMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS, oldBackendCodeTemplate_classMethods, backendCodeTemplate_classMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_servletListenerInitialize() {
		return backendCodeTemplate_servletListenerInitialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_servletListenerInitialize(String newBackendCodeTemplate_servletListenerInitialize) {
		String oldBackendCodeTemplate_servletListenerInitialize = backendCodeTemplate_servletListenerInitialize;
		backendCodeTemplate_servletListenerInitialize = newBackendCodeTemplate_servletListenerInitialize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE, oldBackendCodeTemplate_servletListenerInitialize, backendCodeTemplate_servletListenerInitialize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_servletListenerDestroy() {
		return backendCodeTemplate_servletListenerDestroy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_servletListenerDestroy(String newBackendCodeTemplate_servletListenerDestroy) {
		String oldBackendCodeTemplate_servletListenerDestroy = backendCodeTemplate_servletListenerDestroy;
		backendCodeTemplate_servletListenerDestroy = newBackendCodeTemplate_servletListenerDestroy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY, oldBackendCodeTemplate_servletListenerDestroy, backendCodeTemplate_servletListenerDestroy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackendCodeTemplate_getServiceProviders() {
		return backendCodeTemplate_getServiceProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackendCodeTemplate_getServiceProviders(String newBackendCodeTemplate_getServiceProviders) {
		String oldBackendCodeTemplate_getServiceProviders = backendCodeTemplate_getServiceProviders;
		backendCodeTemplate_getServiceProviders = newBackendCodeTemplate_getServiceProviders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS, oldBackendCodeTemplate_getServiceProviders, backendCodeTemplate_getServiceProviders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG:
				return basicSetServiceProviderCatalog(null, msgs);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS:
				return ((InternalEList<?>)getRequiredAdaptors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__NAME:
				return getName();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG:
				return getServiceProviderCatalog();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION:
				return getSpecification();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS:
				return getRequiredAdaptors();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE:
				return getJavaClassBaseNamespace();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH:
				return getJavaFilesBasePath();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH:
				return getJspFilesBasePath();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH:
				return getJavascriptFilesBasePath();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS:
				return getBackendCodeTemplate_classImports();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS:
				return getBackendCodeTemplate_classMethods();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE:
				return getBackendCodeTemplate_servletListenerInitialize();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY:
				return getBackendCodeTemplate_servletListenerDestroy();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS:
				return getBackendCodeTemplate_getServiceProviders();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE:
				return getBackendCodeTemplate_getResource();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES:
				return getBackendCodeTemplate_getResources();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES:
				return getBackendCodeTemplate_searchResources();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE:
				return getBackendCodeTemplate_createResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG:
				setServiceProviderCatalog((ServiceProviderCatalog)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS:
				getRequiredAdaptors().clear();
				getRequiredAdaptors().addAll((Collection<? extends RequiredAdaptor>)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE:
				setJavaClassBaseNamespace((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH:
				setJavaFilesBasePath((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH:
				setJspFilesBasePath((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH:
				setJavascriptFilesBasePath((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS:
				setBackendCodeTemplate_classImports((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS:
				setBackendCodeTemplate_classMethods((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE:
				setBackendCodeTemplate_servletListenerInitialize((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY:
				setBackendCodeTemplate_servletListenerDestroy((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS:
				setBackendCodeTemplate_getServiceProviders((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE:
				setBackendCodeTemplate_getResource((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES:
				setBackendCodeTemplate_getResources((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES:
				setBackendCodeTemplate_searchResources((String)newValue);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE:
				setBackendCodeTemplate_createResource((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG:
				setServiceProviderCatalog((ServiceProviderCatalog)null);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS:
				getRequiredAdaptors().clear();
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE:
				setJavaClassBaseNamespace(JAVA_CLASS_BASE_NAMESPACE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH:
				setJavaFilesBasePath(JAVA_FILES_BASE_PATH_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH:
				setJspFilesBasePath(JSP_FILES_BASE_PATH_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH:
				setJavascriptFilesBasePath(JAVASCRIPT_FILES_BASE_PATH_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS:
				setBackendCodeTemplate_classImports(BACKEND_CODE_TEMPLATE_CLASS_IMPORTS_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS:
				setBackendCodeTemplate_classMethods(BACKEND_CODE_TEMPLATE_CLASS_METHODS_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE:
				setBackendCodeTemplate_servletListenerInitialize(BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY:
				setBackendCodeTemplate_servletListenerDestroy(BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS:
				setBackendCodeTemplate_getServiceProviders(BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE:
				setBackendCodeTemplate_getResource(BACKEND_CODE_TEMPLATE_GET_RESOURCE_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES:
				setBackendCodeTemplate_getResources(BACKEND_CODE_TEMPLATE_GET_RESOURCES_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES:
				setBackendCodeTemplate_searchResources(BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES_EDEFAULT);
				return;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE:
				setBackendCodeTemplate_createResource(BACKEND_CODE_TEMPLATE_CREATE_RESOURCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG:
				return serviceProviderCatalog != null;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__SPECIFICATION:
				return specification != null;
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__REQUIRED_ADAPTORS:
				return requiredAdaptors != null && !requiredAdaptors.isEmpty();
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE:
				return JAVA_CLASS_BASE_NAMESPACE_EDEFAULT == null ? javaClassBaseNamespace != null : !JAVA_CLASS_BASE_NAMESPACE_EDEFAULT.equals(javaClassBaseNamespace);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH:
				return JAVA_FILES_BASE_PATH_EDEFAULT == null ? javaFilesBasePath != null : !JAVA_FILES_BASE_PATH_EDEFAULT.equals(javaFilesBasePath);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH:
				return JSP_FILES_BASE_PATH_EDEFAULT == null ? jspFilesBasePath != null : !JSP_FILES_BASE_PATH_EDEFAULT.equals(jspFilesBasePath);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH:
				return JAVASCRIPT_FILES_BASE_PATH_EDEFAULT == null ? javascriptFilesBasePath != null : !JAVASCRIPT_FILES_BASE_PATH_EDEFAULT.equals(javascriptFilesBasePath);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS:
				return BACKEND_CODE_TEMPLATE_CLASS_IMPORTS_EDEFAULT == null ? backendCodeTemplate_classImports != null : !BACKEND_CODE_TEMPLATE_CLASS_IMPORTS_EDEFAULT.equals(backendCodeTemplate_classImports);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS:
				return BACKEND_CODE_TEMPLATE_CLASS_METHODS_EDEFAULT == null ? backendCodeTemplate_classMethods != null : !BACKEND_CODE_TEMPLATE_CLASS_METHODS_EDEFAULT.equals(backendCodeTemplate_classMethods);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE:
				return BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE_EDEFAULT == null ? backendCodeTemplate_servletListenerInitialize != null : !BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE_EDEFAULT.equals(backendCodeTemplate_servletListenerInitialize);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY:
				return BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY_EDEFAULT == null ? backendCodeTemplate_servletListenerDestroy != null : !BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY_EDEFAULT.equals(backendCodeTemplate_servletListenerDestroy);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS:
				return BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS_EDEFAULT == null ? backendCodeTemplate_getServiceProviders != null : !BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS_EDEFAULT.equals(backendCodeTemplate_getServiceProviders);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE:
				return BACKEND_CODE_TEMPLATE_GET_RESOURCE_EDEFAULT == null ? backendCodeTemplate_getResource != null : !BACKEND_CODE_TEMPLATE_GET_RESOURCE_EDEFAULT.equals(backendCodeTemplate_getResource);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES:
				return BACKEND_CODE_TEMPLATE_GET_RESOURCES_EDEFAULT == null ? backendCodeTemplate_getResources != null : !BACKEND_CODE_TEMPLATE_GET_RESOURCES_EDEFAULT.equals(backendCodeTemplate_getResources);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES:
				return BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES_EDEFAULT == null ? backendCodeTemplate_searchResources != null : !BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES_EDEFAULT.equals(backendCodeTemplate_searchResources);
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE:
				return BACKEND_CODE_TEMPLATE_CREATE_RESOURCE_EDEFAULT == null ? backendCodeTemplate_createResource != null : !BACKEND_CODE_TEMPLATE_CREATE_RESOURCE_EDEFAULT.equals(backendCodeTemplate_createResource);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", javaClassBaseNamespace: ");
		result.append(javaClassBaseNamespace);
		result.append(", javaFilesBasePath: ");
		result.append(javaFilesBasePath);
		result.append(", jspFilesBasePath: ");
		result.append(jspFilesBasePath);
		result.append(", javascriptFilesBasePath: ");
		result.append(javascriptFilesBasePath);
		result.append(", backendCodeTemplate_classImports: ");
		result.append(backendCodeTemplate_classImports);
		result.append(", backendCodeTemplate_classMethods: ");
		result.append(backendCodeTemplate_classMethods);
		result.append(", backendCodeTemplate_servletListenerInitialize: ");
		result.append(backendCodeTemplate_servletListenerInitialize);
		result.append(", backendCodeTemplate_servletListenerDestroy: ");
		result.append(backendCodeTemplate_servletListenerDestroy);
		result.append(", backendCodeTemplate_getServiceProviders: ");
		result.append(backendCodeTemplate_getServiceProviders);
		result.append(", backendCodeTemplate_getResource: ");
		result.append(backendCodeTemplate_getResource);
		result.append(", backendCodeTemplate_getResources: ");
		result.append(backendCodeTemplate_getResources);
		result.append(", backendCodeTemplate_searchResources: ");
		result.append(backendCodeTemplate_searchResources);
		result.append(", backendCodeTemplate_createResource: ");
		result.append(backendCodeTemplate_createResource);
		result.append(')');
		return result.toString();
	}

} //AdaptorInterfaceImpl
