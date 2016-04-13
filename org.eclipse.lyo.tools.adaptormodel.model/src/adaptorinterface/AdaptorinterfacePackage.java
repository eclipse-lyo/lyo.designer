/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptorinterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptorinterface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.lyo/oslc4j/adaptorInterface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oslc4j_ai";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorinterfacePackage eINSTANCE = adaptorinterface.impl.AdaptorinterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.AdaptorInterfaceImpl <em>Adaptor Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.AdaptorInterfaceImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getAdaptorInterface()
	 * @generated
	 */
	int ADAPTOR_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Service Provider Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Java Class Base Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Java Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH = 4;

	/**
	 * The feature id for the '<em><b>Jsp Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH = 5;

	/**
	 * The feature id for the '<em><b>Javascript Files Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH = 6;

	/**
	 * The feature id for the '<em><b>Required Adaptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__REQUIRED_ADAPTORS = 7;

	/**
	 * The feature id for the '<em><b>Backend Code Template get Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES = 8;

	/**
	 * The feature id for the '<em><b>Backend Code Template get Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Backend Code Template search Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES = 10;

	/**
	 * The feature id for the '<em><b>Backend Code Template create Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE = 11;

	/**
	 * The number of structural features of the '<em>Adaptor Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Adaptor Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.SpecificationImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Domain Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DOMAIN_SPECIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Domain Prefixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DOMAIN_PREFIXES = 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.DomainSpecificationImpl <em>Domain Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.DomainSpecificationImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDomainSpecification()
	 * @generated
	 */
	int DOMAIN_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__NAMESPACE_URI = 1;

	/**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__NAMESPACE_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Resource Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Domain Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Domain Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.NamespacePrefixImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getNamespacePrefix()
	 * @generated
	 */
	int NAMESPACE_PREFIX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_PREFIX__NAME = 0;

	/**
	 * The number of structural features of the '<em>Namespace Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_PREFIX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Namespace Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_PREFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.ServiceProviderCatalogImpl <em>Service Provider Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.ServiceProviderCatalogImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProviderCatalog()
	 * @generated
	 */
	int SERVICE_PROVIDER_CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS = 3;

	/**
	 * The number of structural features of the '<em>Service Provider Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Provider Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.ServiceProviderImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__SERVICE_NAMESPACE = 4;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__INSTANCE_ID = 5;

	/**
	 * The number of structural features of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.ServiceImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Domain Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOMAIN_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Creation Factories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CREATION_FACTORIES = 2;

	/**
	 * The feature id for the '<em><b>Query Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__QUERY_CAPABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Selection Dialogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SELECTION_DIALOGS = 4;

	/**
	 * The feature id for the '<em><b>Creation Dialogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CREATION_DIALOGS = 5;

	/**
	 * The feature id for the '<em><b>Basic Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASIC_CAPABILITIES = 6;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.ResourceImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Resource Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.ResourcePropertyImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceProperty()
	 * @generated
	 */
	int RESOURCE_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__OCCURS = 2;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__VALUE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__REPRESENTATION = 5;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__RANGE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Allowed Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__ALLOWED_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Is Member Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__IS_MEMBER_PROPERTY = 9;

	/**
	 * The number of structural features of the '<em>Resource Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Resource Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.CreationFactoryImpl <em>Creation Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.CreationFactoryImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getCreationFactory()
	 * @generated
	 */
	int CREATION_FACTORY = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Creation URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__CREATION_URI = 2;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY__RESOURCE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Creation Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Creation Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.QueryCapabilityImpl <em>Query Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.QueryCapabilityImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getQueryCapability()
	 * @generated
	 */
	int QUERY_CAPABILITY = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Query Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__QUERY_BASE_URI = 2;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY__RESOURCE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Query Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Query Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.BasicCapabilityImpl <em>Basic Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.BasicCapabilityImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getBasicCapability()
	 * @generated
	 */
	int BASIC_CAPABILITY = 11;

	/**
	 * The feature id for the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__RESOURCE_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__READ = 2;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__DELETE = 3;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY__UPDATE = 4;

	/**
	 * The number of structural features of the '<em>Basic Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Basic Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.DialogImpl <em>Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.DialogImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDialog()
	 * @generated
	 */
	int DIALOG = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Dialog URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__DIALOG_URI = 2;

	/**
	 * The feature id for the '<em><b>Hint Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__HINT_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Hint Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__HINT_HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__RESOURCE_TYPES = 5;

	/**
	 * The number of structural features of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.PublisherImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ICON = 3;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.RequiredAdaptorImpl <em>Required Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.RequiredAdaptorImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getRequiredAdaptor()
	 * @generated
	 */
	int REQUIRED_ADAPTOR = 14;

	/**
	 * The feature id for the '<em><b>Service Provider Catalog URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = 0;

	/**
	 * The number of structural features of the '<em>Required Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ADAPTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Required Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ADAPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.GenericRequiredAdaptorImpl <em>Generic Required Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.GenericRequiredAdaptorImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGenericRequiredAdaptor()
	 * @generated
	 */
	int GENERIC_REQUIRED_ADAPTOR = 15;

	/**
	 * The feature id for the '<em><b>Service Provider Catalog URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_REQUIRED_ADAPTOR__NAME = REQUIRED_ADAPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serviced Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_REQUIRED_ADAPTOR__SERVICED_RESOURCES = REQUIRED_ADAPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Required Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_REQUIRED_ADAPTOR_FEATURE_COUNT = REQUIRED_ADAPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generic Required Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_REQUIRED_ADAPTOR_OPERATION_COUNT = REQUIRED_ADAPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.impl.ModelledRequiredAdaptorImpl <em>Modelled Required Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.impl.ModelledRequiredAdaptorImpl
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getModelledRequiredAdaptor()
	 * @generated
	 */
	int MODELLED_REQUIRED_ADAPTOR = 16;

	/**
	 * The feature id for the '<em><b>Service Provider Catalog URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLED_REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI;

	/**
	 * The feature id for the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE = REQUIRED_ADAPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modelled Required Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLED_REQUIRED_ADAPTOR_FEATURE_COUNT = REQUIRED_ADAPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modelled Required Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLED_REQUIRED_ADAPTOR_OPERATION_COUNT = REQUIRED_ADAPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.ResourcePropertyOccurs
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyOccurs()
	 * @generated
	 */
	int RESOURCE_PROPERTY_OCCURS = 17;

	/**
	 * The meta object id for the '{@link adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.ResourcePropertyValueType
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyValueType()
	 * @generated
	 */
	int RESOURCE_PROPERTY_VALUE_TYPE = 18;

	/**
	 * The meta object id for the '{@link adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.ResourcePropertyRepresentation
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyRepresentation()
	 * @generated
	 */
	int RESOURCE_PROPERTY_REPRESENTATION = 19;

	/**
	 * The meta object id for the '{@link adaptorinterface.ResourcePropertyIsMemberProperty <em>Resource Property Is Member Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.ResourcePropertyIsMemberProperty
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyIsMemberProperty()
	 * @generated
	 */
	int RESOURCE_PROPERTY_IS_MEMBER_PROPERTY = 20;

	/**
	 * The meta object id for the '{@link adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adaptorinterface.ResourceServiceNamespace
	 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceServiceNamespace()
	 * @generated
	 */
	int RESOURCE_SERVICE_NAMESPACE = 21;


	/**
	 * Returns the meta object for class '{@link adaptorinterface.AdaptorInterface <em>Adaptor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor Interface</em>'.
	 * @see adaptorinterface.AdaptorInterface
	 * @generated
	 */
	EClass getAdaptorInterface();

	/**
	 * Returns the meta object for the containment reference '{@link adaptorinterface.AdaptorInterface#getServiceProviderCatalog <em>Service Provider Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider Catalog</em>'.
	 * @see adaptorinterface.AdaptorInterface#getServiceProviderCatalog()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EReference getAdaptorInterface_ServiceProviderCatalog();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adaptorinterface.AdaptorInterface#getName()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class Base Namespace</em>'.
	 * @see adaptorinterface.AdaptorInterface#getJavaClassBaseNamespace()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_JavaClassBaseNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link adaptorinterface.AdaptorInterface#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see adaptorinterface.AdaptorInterface#getSpecification()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EReference getAdaptorInterface_Specification();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJavaFilesBasePath <em>Java Files Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Files Base Path</em>'.
	 * @see adaptorinterface.AdaptorInterface#getJavaFilesBasePath()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_JavaFilesBasePath();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJspFilesBasePath <em>Jsp Files Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsp Files Base Path</em>'.
	 * @see adaptorinterface.AdaptorInterface#getJspFilesBasePath()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_JspFilesBasePath();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Javascript Files Base Path</em>'.
	 * @see adaptorinterface.AdaptorInterface#getJavascriptFilesBasePath()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_JavascriptFilesBasePath();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.AdaptorInterface#getRequiredAdaptors <em>Required Adaptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Adaptors</em>'.
	 * @see adaptorinterface.AdaptorInterface#getRequiredAdaptors()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EReference getAdaptorInterface_RequiredAdaptors();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResources <em>Backend Code Template get Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Code Template get Resources</em>'.
	 * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResources()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_BackendCodeTemplate_getResources();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResource <em>Backend Code Template get Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Code Template get Resource</em>'.
	 * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResource()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_BackendCodeTemplate_getResource();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_searchResources <em>Backend Code Template search Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Code Template search Resources</em>'.
	 * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_searchResources()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_BackendCodeTemplate_searchResources();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_createResource <em>Backend Code Template create Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend Code Template create Resource</em>'.
	 * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_createResource()
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	EAttribute getAdaptorInterface_BackendCodeTemplate_createResource();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see adaptorinterface.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.Specification#getDomainSpecifications <em>Domain Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Specifications</em>'.
	 * @see adaptorinterface.Specification#getDomainSpecifications()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_DomainSpecifications();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.Specification#getDomainPrefixes <em>Domain Prefixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Prefixes</em>'.
	 * @see adaptorinterface.Specification#getDomainPrefixes()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_DomainPrefixes();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.DomainSpecification <em>Domain Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specification</em>'.
	 * @see adaptorinterface.DomainSpecification
	 * @generated
	 */
	EClass getDomainSpecification();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.DomainSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adaptorinterface.DomainSpecification#getName()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EAttribute getDomainSpecification_Name();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.DomainSpecification#getNamespaceURI <em>Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace URI</em>'.
	 * @see adaptorinterface.DomainSpecification#getNamespaceURI()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EAttribute getDomainSpecification_NamespaceURI();

	/**
	 * Returns the meta object for the reference '{@link adaptorinterface.DomainSpecification#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace Prefix</em>'.
	 * @see adaptorinterface.DomainSpecification#getNamespacePrefix()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EReference getDomainSpecification_NamespacePrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.DomainSpecification#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see adaptorinterface.DomainSpecification#getResources()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EReference getDomainSpecification_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.DomainSpecification#getResourceProperties <em>Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Properties</em>'.
	 * @see adaptorinterface.DomainSpecification#getResourceProperties()
	 * @see #getDomainSpecification()
	 * @generated
	 */
	EReference getDomainSpecification_ResourceProperties();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.NamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Prefix</em>'.
	 * @see adaptorinterface.NamespacePrefix
	 * @generated
	 */
	EClass getNamespacePrefix();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.NamespacePrefix#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adaptorinterface.NamespacePrefix#getName()
	 * @see #getNamespacePrefix()
	 * @generated
	 */
	EAttribute getNamespacePrefix_Name();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.ServiceProviderCatalog <em>Service Provider Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider Catalog</em>'.
	 * @see adaptorinterface.ServiceProviderCatalog
	 * @generated
	 */
	EClass getServiceProviderCatalog();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProviderCatalog#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see adaptorinterface.ServiceProviderCatalog#getTitle()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EAttribute getServiceProviderCatalog_Title();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProviderCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see adaptorinterface.ServiceProviderCatalog#getDescription()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EAttribute getServiceProviderCatalog_Description();

	/**
	 * Returns the meta object for the containment reference '{@link adaptorinterface.ServiceProviderCatalog#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see adaptorinterface.ServiceProviderCatalog#getPublisher()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EReference getServiceProviderCatalog_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.ServiceProviderCatalog#getServiceProviders <em>Service Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Providers</em>'.
	 * @see adaptorinterface.ServiceProviderCatalog#getServiceProviders()
	 * @see #getServiceProviderCatalog()
	 * @generated
	 */
	EReference getServiceProviderCatalog_ServiceProviders();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider</em>'.
	 * @see adaptorinterface.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see adaptorinterface.ServiceProvider#getTitle()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Title();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see adaptorinterface.ServiceProvider#getDescription()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Description();

	/**
	 * Returns the meta object for the containment reference '{@link adaptorinterface.ServiceProvider#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see adaptorinterface.ServiceProvider#getPublisher()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.ServiceProvider#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see adaptorinterface.ServiceProvider#getServices()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Services();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getServiceNamespace <em>Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Namespace</em>'.
	 * @see adaptorinterface.ServiceProvider#getServiceNamespace()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_ServiceNamespace();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see adaptorinterface.ServiceProvider#getInstanceID()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_InstanceID();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see adaptorinterface.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link adaptorinterface.Service#getDomainSpecification <em>Domain Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Specification</em>'.
	 * @see adaptorinterface.Service#getDomainSpecification()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DomainSpecification();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Service#getServiceNamespace <em>Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Namespace</em>'.
	 * @see adaptorinterface.Service#getServiceNamespace()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getCreationFactories <em>Creation Factories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creation Factories</em>'.
	 * @see adaptorinterface.Service#getCreationFactories()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_CreationFactories();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getQueryCapabilities <em>Query Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Capabilities</em>'.
	 * @see adaptorinterface.Service#getQueryCapabilities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_QueryCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getSelectionDialogs <em>Selection Dialogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selection Dialogs</em>'.
	 * @see adaptorinterface.Service#getSelectionDialogs()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_SelectionDialogs();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getCreationDialogs <em>Creation Dialogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creation Dialogs</em>'.
	 * @see adaptorinterface.Service#getCreationDialogs()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_CreationDialogs();

	/**
	 * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getBasicCapabilities <em>Basic Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Capabilities</em>'.
	 * @see adaptorinterface.Service#getBasicCapabilities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_BasicCapabilities();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see adaptorinterface.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adaptorinterface.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.Resource#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see adaptorinterface.Resource#getExtends()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Extends();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.Resource#getResourceProperties <em>Resource Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Properties</em>'.
	 * @see adaptorinterface.Resource#getResourceProperties()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ResourceProperties();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.ResourceProperty <em>Resource Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Property</em>'.
	 * @see adaptorinterface.ResourceProperty
	 * @generated
	 */
	EClass getResourceProperty();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see adaptorinterface.ResourceProperty#getTitle()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Title();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adaptorinterface.ResourceProperty#getName()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getOccurs <em>Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurs</em>'.
	 * @see adaptorinterface.ResourceProperty#getOccurs()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Occurs();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see adaptorinterface.ResourceProperty#isReadOnly()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see adaptorinterface.ResourceProperty#getValueType()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see adaptorinterface.ResourceProperty#getRepresentation()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Representation();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.ResourceProperty#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Range</em>'.
	 * @see adaptorinterface.ResourceProperty#getRange()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EReference getResourceProperty_Range();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see adaptorinterface.ResourceProperty#getDescription()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Description();

	/**
	 * Returns the meta object for the attribute list '{@link adaptorinterface.ResourceProperty#getAllowedValue <em>Allowed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Value</em>'.
	 * @see adaptorinterface.ResourceProperty#getAllowedValue()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_AllowedValue();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getIsMemberProperty <em>Is Member Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Member Property</em>'.
	 * @see adaptorinterface.ResourceProperty#getIsMemberProperty()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_IsMemberProperty();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.CreationFactory <em>Creation Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Factory</em>'.
	 * @see adaptorinterface.CreationFactory
	 * @generated
	 */
	EClass getCreationFactory();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.CreationFactory#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see adaptorinterface.CreationFactory#getTitle()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EAttribute getCreationFactory_Title();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.CreationFactory#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see adaptorinterface.CreationFactory#getLabel()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EAttribute getCreationFactory_Label();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.CreationFactory#getCreationURI <em>Creation URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation URI</em>'.
	 * @see adaptorinterface.CreationFactory#getCreationURI()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EAttribute getCreationFactory_CreationURI();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.CreationFactory#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see adaptorinterface.CreationFactory#getResourceTypes()
	 * @see #getCreationFactory()
	 * @generated
	 */
	EReference getCreationFactory_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.QueryCapability <em>Query Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Capability</em>'.
	 * @see adaptorinterface.QueryCapability
	 * @generated
	 */
	EClass getQueryCapability();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.QueryCapability#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see adaptorinterface.QueryCapability#getTitle()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EAttribute getQueryCapability_Title();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.QueryCapability#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see adaptorinterface.QueryCapability#getLabel()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EAttribute getQueryCapability_Label();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.QueryCapability#getQueryBaseURI <em>Query Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Base URI</em>'.
	 * @see adaptorinterface.QueryCapability#getQueryBaseURI()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EAttribute getQueryCapability_QueryBaseURI();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.QueryCapability#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see adaptorinterface.QueryCapability#getResourceTypes()
	 * @see #getQueryCapability()
	 * @generated
	 */
	EReference getQueryCapability_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.BasicCapability <em>Basic Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Capability</em>'.
	 * @see adaptorinterface.BasicCapability
	 * @generated
	 */
	EClass getBasicCapability();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#getInstanceID <em>Instance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance ID</em>'.
	 * @see adaptorinterface.BasicCapability#getInstanceID()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EAttribute getBasicCapability_InstanceID();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.BasicCapability#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see adaptorinterface.BasicCapability#getResourceTypes()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EReference getBasicCapability_ResourceTypes();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#isRead <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read</em>'.
	 * @see adaptorinterface.BasicCapability#isRead()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EAttribute getBasicCapability_Read();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#isDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see adaptorinterface.BasicCapability#isDelete()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EAttribute getBasicCapability_Delete();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see adaptorinterface.BasicCapability#isUpdate()
	 * @see #getBasicCapability()
	 * @generated
	 */
	EAttribute getBasicCapability_Update();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.Dialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog</em>'.
	 * @see adaptorinterface.Dialog
	 * @generated
	 */
	EClass getDialog();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see adaptorinterface.Dialog#getTitle()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Title();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see adaptorinterface.Dialog#getLabel()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Label();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getDialogURI <em>Dialog URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialog URI</em>'.
	 * @see adaptorinterface.Dialog#getDialogURI()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_DialogURI();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getHintWidth <em>Hint Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint Width</em>'.
	 * @see adaptorinterface.Dialog#getHintWidth()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_HintWidth();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getHintHeight <em>Hint Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint Height</em>'.
	 * @see adaptorinterface.Dialog#getHintHeight()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_HintHeight();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.Dialog#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Types</em>'.
	 * @see adaptorinterface.Dialog#getResourceTypes()
	 * @see #getDialog()
	 * @generated
	 */
	EReference getDialog_ResourceTypes();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see adaptorinterface.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see adaptorinterface.Publisher#getTitle()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Title();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see adaptorinterface.Publisher#getLabel()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Label();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see adaptorinterface.Publisher#getIdentifier()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see adaptorinterface.Publisher#getIcon()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Icon();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.RequiredAdaptor <em>Required Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Adaptor</em>'.
	 * @see adaptorinterface.RequiredAdaptor
	 * @generated
	 */
	EClass getRequiredAdaptor();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.RequiredAdaptor#getServiceProviderCatalogURI <em>Service Provider Catalog URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Provider Catalog URI</em>'.
	 * @see adaptorinterface.RequiredAdaptor#getServiceProviderCatalogURI()
	 * @see #getRequiredAdaptor()
	 * @generated
	 */
	EAttribute getRequiredAdaptor_ServiceProviderCatalogURI();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.GenericRequiredAdaptor <em>Generic Required Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Required Adaptor</em>'.
	 * @see adaptorinterface.GenericRequiredAdaptor
	 * @generated
	 */
	EClass getGenericRequiredAdaptor();

	/**
	 * Returns the meta object for the attribute '{@link adaptorinterface.GenericRequiredAdaptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adaptorinterface.GenericRequiredAdaptor#getName()
	 * @see #getGenericRequiredAdaptor()
	 * @generated
	 */
	EAttribute getGenericRequiredAdaptor_Name();

	/**
	 * Returns the meta object for the reference list '{@link adaptorinterface.GenericRequiredAdaptor#getServicedResources <em>Serviced Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serviced Resources</em>'.
	 * @see adaptorinterface.GenericRequiredAdaptor#getServicedResources()
	 * @see #getGenericRequiredAdaptor()
	 * @generated
	 */
	EReference getGenericRequiredAdaptor_ServicedResources();

	/**
	 * Returns the meta object for class '{@link adaptorinterface.ModelledRequiredAdaptor <em>Modelled Required Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelled Required Adaptor</em>'.
	 * @see adaptorinterface.ModelledRequiredAdaptor
	 * @generated
	 */
	EClass getModelledRequiredAdaptor();

	/**
	 * Returns the meta object for the reference '{@link adaptorinterface.ModelledRequiredAdaptor#getAdaptorInterface <em>Adaptor Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adaptor Interface</em>'.
	 * @see adaptorinterface.ModelledRequiredAdaptor#getAdaptorInterface()
	 * @see #getModelledRequiredAdaptor()
	 * @generated
	 */
	EReference getModelledRequiredAdaptor_AdaptorInterface();

	/**
	 * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Property Occurs</em>'.
	 * @see adaptorinterface.ResourcePropertyOccurs
	 * @generated
	 */
	EEnum getResourcePropertyOccurs();

	/**
	 * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Property Value Type</em>'.
	 * @see adaptorinterface.ResourcePropertyValueType
	 * @generated
	 */
	EEnum getResourcePropertyValueType();

	/**
	 * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Property Representation</em>'.
	 * @see adaptorinterface.ResourcePropertyRepresentation
	 * @generated
	 */
	EEnum getResourcePropertyRepresentation();

	/**
	 * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyIsMemberProperty <em>Resource Property Is Member Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Property Is Member Property</em>'.
	 * @see adaptorinterface.ResourcePropertyIsMemberProperty
	 * @generated
	 */
	EEnum getResourcePropertyIsMemberProperty();

	/**
	 * Returns the meta object for enum '{@link adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Service Namespace</em>'.
	 * @see adaptorinterface.ResourceServiceNamespace
	 * @generated
	 */
	EEnum getResourceServiceNamespace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptorinterfaceFactory getAdaptorinterfaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.AdaptorInterfaceImpl <em>Adaptor Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.AdaptorInterfaceImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getAdaptorInterface()
		 * @generated
		 */
		EClass ADAPTOR_INTERFACE = eINSTANCE.getAdaptorInterface();

		/**
		 * The meta object literal for the '<em><b>Service Provider Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG = eINSTANCE.getAdaptorInterface_ServiceProviderCatalog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__NAME = eINSTANCE.getAdaptorInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Java Class Base Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE = eINSTANCE.getAdaptorInterface_JavaClassBaseNamespace();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE__SPECIFICATION = eINSTANCE.getAdaptorInterface_Specification();

		/**
		 * The meta object literal for the '<em><b>Java Files Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH = eINSTANCE.getAdaptorInterface_JavaFilesBasePath();

		/**
		 * The meta object literal for the '<em><b>Jsp Files Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH = eINSTANCE.getAdaptorInterface_JspFilesBasePath();

		/**
		 * The meta object literal for the '<em><b>Javascript Files Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH = eINSTANCE.getAdaptorInterface_JavascriptFilesBasePath();

		/**
		 * The meta object literal for the '<em><b>Required Adaptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTOR_INTERFACE__REQUIRED_ADAPTORS = eINSTANCE.getAdaptorInterface_RequiredAdaptors();

		/**
		 * The meta object literal for the '<em><b>Backend Code Template get Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_getResources();

		/**
		 * The meta object literal for the '<em><b>Backend Code Template get Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_getResource();

		/**
		 * The meta object literal for the '<em><b>Backend Code Template search Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_searchResources();

		/**
		 * The meta object literal for the '<em><b>Backend Code Template create Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_createResource();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.SpecificationImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Domain Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__DOMAIN_SPECIFICATIONS = eINSTANCE.getSpecification_DomainSpecifications();

		/**
		 * The meta object literal for the '<em><b>Domain Prefixes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__DOMAIN_PREFIXES = eINSTANCE.getSpecification_DomainPrefixes();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.DomainSpecificationImpl <em>Domain Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.DomainSpecificationImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDomainSpecification()
		 * @generated
		 */
		EClass DOMAIN_SPECIFICATION = eINSTANCE.getDomainSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFICATION__NAME = eINSTANCE.getDomainSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFICATION__NAMESPACE_URI = eINSTANCE.getDomainSpecification_NamespaceURI();

		/**
		 * The meta object literal for the '<em><b>Namespace Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFICATION__NAMESPACE_PREFIX = eINSTANCE.getDomainSpecification_NamespacePrefix();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFICATION__RESOURCES = eINSTANCE.getDomainSpecification_Resources();

		/**
		 * The meta object literal for the '<em><b>Resource Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES = eINSTANCE.getDomainSpecification_ResourceProperties();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.NamespacePrefixImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getNamespacePrefix()
		 * @generated
		 */
		EClass NAMESPACE_PREFIX = eINSTANCE.getNamespacePrefix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_PREFIX__NAME = eINSTANCE.getNamespacePrefix_Name();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.ServiceProviderCatalogImpl <em>Service Provider Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.ServiceProviderCatalogImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProviderCatalog()
		 * @generated
		 */
		EClass SERVICE_PROVIDER_CATALOG = eINSTANCE.getServiceProviderCatalog();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER_CATALOG__TITLE = eINSTANCE.getServiceProviderCatalog_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER_CATALOG__DESCRIPTION = eINSTANCE.getServiceProviderCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER_CATALOG__PUBLISHER = eINSTANCE.getServiceProviderCatalog_Publisher();

		/**
		 * The meta object literal for the '<em><b>Service Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS = eINSTANCE.getServiceProviderCatalog_ServiceProviders();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.ServiceProviderImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__TITLE = eINSTANCE.getServiceProvider_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__DESCRIPTION = eINSTANCE.getServiceProvider_Description();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__PUBLISHER = eINSTANCE.getServiceProvider_Publisher();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__SERVICES = eINSTANCE.getServiceProvider_Services();

		/**
		 * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__SERVICE_NAMESPACE = eINSTANCE.getServiceProvider_ServiceNamespace();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__INSTANCE_ID = eINSTANCE.getServiceProvider_InstanceID();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.ServiceImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Domain Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DOMAIN_SPECIFICATION = eINSTANCE.getService_DomainSpecification();

		/**
		 * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_NAMESPACE = eINSTANCE.getService_ServiceNamespace();

		/**
		 * The meta object literal for the '<em><b>Creation Factories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CREATION_FACTORIES = eINSTANCE.getService_CreationFactories();

		/**
		 * The meta object literal for the '<em><b>Query Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__QUERY_CAPABILITIES = eINSTANCE.getService_QueryCapabilities();

		/**
		 * The meta object literal for the '<em><b>Selection Dialogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SELECTION_DIALOGS = eINSTANCE.getService_SelectionDialogs();

		/**
		 * The meta object literal for the '<em><b>Creation Dialogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CREATION_DIALOGS = eINSTANCE.getService_CreationDialogs();

		/**
		 * The meta object literal for the '<em><b>Basic Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASIC_CAPABILITIES = eINSTANCE.getService_BasicCapabilities();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.ResourceImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__EXTENDS = eINSTANCE.getResource_Extends();

		/**
		 * The meta object literal for the '<em><b>Resource Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCE_PROPERTIES = eINSTANCE.getResource_ResourceProperties();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.ResourcePropertyImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceProperty()
		 * @generated
		 */
		EClass RESOURCE_PROPERTY = eINSTANCE.getResourceProperty();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__TITLE = eINSTANCE.getResourceProperty_Title();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__NAME = eINSTANCE.getResourceProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__OCCURS = eINSTANCE.getResourceProperty_Occurs();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__READ_ONLY = eINSTANCE.getResourceProperty_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__VALUE_TYPE = eINSTANCE.getResourceProperty_ValueType();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__REPRESENTATION = eINSTANCE.getResourceProperty_Representation();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROPERTY__RANGE = eINSTANCE.getResourceProperty_Range();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__DESCRIPTION = eINSTANCE.getResourceProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Allowed Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__ALLOWED_VALUE = eINSTANCE.getResourceProperty_AllowedValue();

		/**
		 * The meta object literal for the '<em><b>Is Member Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__IS_MEMBER_PROPERTY = eINSTANCE.getResourceProperty_IsMemberProperty();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.CreationFactoryImpl <em>Creation Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.CreationFactoryImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getCreationFactory()
		 * @generated
		 */
		EClass CREATION_FACTORY = eINSTANCE.getCreationFactory();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_FACTORY__TITLE = eINSTANCE.getCreationFactory_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_FACTORY__LABEL = eINSTANCE.getCreationFactory_Label();

		/**
		 * The meta object literal for the '<em><b>Creation URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_FACTORY__CREATION_URI = eINSTANCE.getCreationFactory_CreationURI();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION_FACTORY__RESOURCE_TYPES = eINSTANCE.getCreationFactory_ResourceTypes();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.QueryCapabilityImpl <em>Query Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.QueryCapabilityImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getQueryCapability()
		 * @generated
		 */
		EClass QUERY_CAPABILITY = eINSTANCE.getQueryCapability();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CAPABILITY__TITLE = eINSTANCE.getQueryCapability_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CAPABILITY__LABEL = eINSTANCE.getQueryCapability_Label();

		/**
		 * The meta object literal for the '<em><b>Query Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_CAPABILITY__QUERY_BASE_URI = eINSTANCE.getQueryCapability_QueryBaseURI();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_CAPABILITY__RESOURCE_TYPES = eINSTANCE.getQueryCapability_ResourceTypes();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.BasicCapabilityImpl <em>Basic Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.BasicCapabilityImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getBasicCapability()
		 * @generated
		 */
		EClass BASIC_CAPABILITY = eINSTANCE.getBasicCapability();

		/**
		 * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CAPABILITY__INSTANCE_ID = eINSTANCE.getBasicCapability_InstanceID();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_CAPABILITY__RESOURCE_TYPES = eINSTANCE.getBasicCapability_ResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CAPABILITY__READ = eINSTANCE.getBasicCapability_Read();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CAPABILITY__DELETE = eINSTANCE.getBasicCapability_Delete();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CAPABILITY__UPDATE = eINSTANCE.getBasicCapability_Update();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.DialogImpl <em>Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.DialogImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDialog()
		 * @generated
		 */
		EClass DIALOG = eINSTANCE.getDialog();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__TITLE = eINSTANCE.getDialog_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__LABEL = eINSTANCE.getDialog_Label();

		/**
		 * The meta object literal for the '<em><b>Dialog URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__DIALOG_URI = eINSTANCE.getDialog_DialogURI();

		/**
		 * The meta object literal for the '<em><b>Hint Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__HINT_WIDTH = eINSTANCE.getDialog_HintWidth();

		/**
		 * The meta object literal for the '<em><b>Hint Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__HINT_HEIGHT = eINSTANCE.getDialog_HintHeight();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG__RESOURCE_TYPES = eINSTANCE.getDialog_ResourceTypes();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.PublisherImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__TITLE = eINSTANCE.getPublisher_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__LABEL = eINSTANCE.getPublisher_Label();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__IDENTIFIER = eINSTANCE.getPublisher_Identifier();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__ICON = eINSTANCE.getPublisher_Icon();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.RequiredAdaptorImpl <em>Required Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.RequiredAdaptorImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getRequiredAdaptor()
		 * @generated
		 */
		EClass REQUIRED_ADAPTOR = eINSTANCE.getRequiredAdaptor();

		/**
		 * The meta object literal for the '<em><b>Service Provider Catalog URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = eINSTANCE.getRequiredAdaptor_ServiceProviderCatalogURI();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.GenericRequiredAdaptorImpl <em>Generic Required Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.GenericRequiredAdaptorImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGenericRequiredAdaptor()
		 * @generated
		 */
		EClass GENERIC_REQUIRED_ADAPTOR = eINSTANCE.getGenericRequiredAdaptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_REQUIRED_ADAPTOR__NAME = eINSTANCE.getGenericRequiredAdaptor_Name();

		/**
		 * The meta object literal for the '<em><b>Serviced Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_REQUIRED_ADAPTOR__SERVICED_RESOURCES = eINSTANCE.getGenericRequiredAdaptor_ServicedResources();

		/**
		 * The meta object literal for the '{@link adaptorinterface.impl.ModelledRequiredAdaptorImpl <em>Modelled Required Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.impl.ModelledRequiredAdaptorImpl
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getModelledRequiredAdaptor()
		 * @generated
		 */
		EClass MODELLED_REQUIRED_ADAPTOR = eINSTANCE.getModelledRequiredAdaptor();

		/**
		 * The meta object literal for the '<em><b>Adaptor Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE = eINSTANCE.getModelledRequiredAdaptor_AdaptorInterface();

		/**
		 * The meta object literal for the '{@link adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.ResourcePropertyOccurs
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyOccurs()
		 * @generated
		 */
		EEnum RESOURCE_PROPERTY_OCCURS = eINSTANCE.getResourcePropertyOccurs();

		/**
		 * The meta object literal for the '{@link adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.ResourcePropertyValueType
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyValueType()
		 * @generated
		 */
		EEnum RESOURCE_PROPERTY_VALUE_TYPE = eINSTANCE.getResourcePropertyValueType();

		/**
		 * The meta object literal for the '{@link adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.ResourcePropertyRepresentation
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyRepresentation()
		 * @generated
		 */
		EEnum RESOURCE_PROPERTY_REPRESENTATION = eINSTANCE.getResourcePropertyRepresentation();

		/**
		 * The meta object literal for the '{@link adaptorinterface.ResourcePropertyIsMemberProperty <em>Resource Property Is Member Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.ResourcePropertyIsMemberProperty
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyIsMemberProperty()
		 * @generated
		 */
		EEnum RESOURCE_PROPERTY_IS_MEMBER_PROPERTY = eINSTANCE.getResourcePropertyIsMemberProperty();

		/**
		 * The meta object literal for the '{@link adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adaptorinterface.ResourceServiceNamespace
		 * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceServiceNamespace()
		 * @generated
		 */
		EEnum RESOURCE_SERVICE_NAMESPACE = eINSTANCE.getResourceServiceNamespace();

	}

} //AdaptorinterfacePackage
