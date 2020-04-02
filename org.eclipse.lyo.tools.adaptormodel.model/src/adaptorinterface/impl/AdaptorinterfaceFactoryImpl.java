/**
 */
package adaptorinterface.impl;

import adaptorinterface.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorinterfaceFactoryImpl extends EFactoryImpl implements AdaptorinterfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptorinterfaceFactory init() {
		try {
			AdaptorinterfaceFactory theAdaptorinterfaceFactory = (AdaptorinterfaceFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptorinterfacePackage.eNS_URI);
			if (theAdaptorinterfaceFactory != null) {
				return theAdaptorinterfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptorinterfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorinterfaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE: return createAdaptorInterface();
			case AdaptorinterfacePackage.SPECIFICATION: return createSpecification();
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION: return createDomainSpecification();
			case AdaptorinterfacePackage.NAMESPACE_PREFIX: return createNamespacePrefix();
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG: return createServiceProviderCatalog();
			case AdaptorinterfacePackage.SERVICE_PROVIDER: return createServiceProvider();
			case AdaptorinterfacePackage.SERVICE: return createService();
			case AdaptorinterfacePackage.WEB_SERVICE: return createWebService();
			case AdaptorinterfacePackage.RESOURCE: return createResource();
			case AdaptorinterfacePackage.RESOURCE_PROPERTY: return createResourceProperty();
			case AdaptorinterfacePackage.CREATION_FACTORY: return createCreationFactory();
			case AdaptorinterfacePackage.QUERY_CAPABILITY: return createQueryCapability();
			case AdaptorinterfacePackage.BASIC_CAPABILITY: return createBasicCapability();
			case AdaptorinterfacePackage.DIALOG: return createDialog();
			case AdaptorinterfacePackage.PUBLISHER: return createPublisher();
			case AdaptorinterfacePackage.GENERIC_REQUIRED_ADAPTOR: return createGenericRequiredAdaptor();
			case AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR: return createModelledRequiredAdaptor();
			case AdaptorinterfacePackage.GENERATION_SETTING: return createGenerationSetting();
			case AdaptorinterfacePackage.SHACL_SHAPE: return createShaclShape();
			case AdaptorinterfacePackage.SHAPE_PROPERTY: return createShapeProperty();
			case AdaptorinterfacePackage.SHACL_PROPERTY: return createShaclProperty();
			case AdaptorinterfacePackage.GENERAL_CONFIGURATION: return createGeneralConfiguration();
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION: return createProjectConfiguration();
			case AdaptorinterfacePackage.SERVER_CONFIGURATION: return createServerConfiguration();
			case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION: return createMavenProjectConfiguration();
			case AdaptorinterfacePackage.MAVEN_SERVER_CONFIGURATION: return createMavenServerConfiguration();
			case AdaptorinterfacePackage.MAVEN_SPECIFICATION_CONFIGURATION: return createMavenSpecificationConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_OCCURS:
				return createResourcePropertyOccursFromString(eDataType, initialValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_VALUE_TYPE:
				return createResourcePropertyValueTypeFromString(eDataType, initialValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_REPRESENTATION:
				return createResourcePropertyRepresentationFromString(eDataType, initialValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_IS_MEMBER_PROPERTY:
				return createResourcePropertyIsMemberPropertyFromString(eDataType, initialValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_MULTI_VALUE_REPRESENTATION:
				return createResourcePropertyMultiValueRepresentationFromString(eDataType, initialValue);
			case AdaptorinterfacePackage.RESOURCE_SERVICE_NAMESPACE:
				return createResourceServiceNamespaceFromString(eDataType, initialValue);
			case AdaptorinterfacePackage.SHACL_PROPERTY_DATA_TYPE:
				return createShaclPropertyDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_OCCURS:
				return convertResourcePropertyOccursToString(eDataType, instanceValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_VALUE_TYPE:
				return convertResourcePropertyValueTypeToString(eDataType, instanceValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_REPRESENTATION:
				return convertResourcePropertyRepresentationToString(eDataType, instanceValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_IS_MEMBER_PROPERTY:
				return convertResourcePropertyIsMemberPropertyToString(eDataType, instanceValue);
			case AdaptorinterfacePackage.RESOURCE_PROPERTY_MULTI_VALUE_REPRESENTATION:
				return convertResourcePropertyMultiValueRepresentationToString(eDataType, instanceValue);
			case AdaptorinterfacePackage.RESOURCE_SERVICE_NAMESPACE:
				return convertResourceServiceNamespaceToString(eDataType, instanceValue);
			case AdaptorinterfacePackage.SHACL_PROPERTY_DATA_TYPE:
				return convertShaclPropertyDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptorInterface createAdaptorInterface() {
		AdaptorInterfaceImpl adaptorInterface = new AdaptorInterfaceImpl();
		return adaptorInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSpecification createDomainSpecification() {
		DomainSpecificationImpl domainSpecification = new DomainSpecificationImpl();
		return domainSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespacePrefix createNamespacePrefix() {
		NamespacePrefixImpl namespacePrefix = new NamespacePrefixImpl();
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceProviderCatalog createServiceProviderCatalog() {
		ServiceProviderCatalogImpl serviceProviderCatalog = new ServiceProviderCatalogImpl();
		return serviceProviderCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceProvider createServiceProvider() {
		ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceProperty createResourceProperty() {
		ResourcePropertyImpl resourceProperty = new ResourcePropertyImpl();
		return resourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreationFactory createCreationFactory() {
		CreationFactoryImpl creationFactory = new CreationFactoryImpl();
		return creationFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryCapability createQueryCapability() {
		QueryCapabilityImpl queryCapability = new QueryCapabilityImpl();
		return queryCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicCapability createBasicCapability() {
		BasicCapabilityImpl basicCapability = new BasicCapabilityImpl();
		return basicCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dialog createDialog() {
		DialogImpl dialog = new DialogImpl();
		return dialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericRequiredAdaptor createGenericRequiredAdaptor() {
		GenericRequiredAdaptorImpl genericRequiredAdaptor = new GenericRequiredAdaptorImpl();
		return genericRequiredAdaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelledRequiredAdaptor createModelledRequiredAdaptor() {
		ModelledRequiredAdaptorImpl modelledRequiredAdaptor = new ModelledRequiredAdaptorImpl();
		return modelledRequiredAdaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationSetting createGenerationSetting() {
		GenerationSettingImpl generationSetting = new GenerationSettingImpl();
		return generationSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShaclShape createShaclShape() {
		ShaclShapeImpl shaclShape = new ShaclShapeImpl();
		return shaclShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShapeProperty createShapeProperty() {
		ShapePropertyImpl shapeProperty = new ShapePropertyImpl();
		return shapeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShaclProperty createShaclProperty() {
		ShaclPropertyImpl shaclProperty = new ShaclPropertyImpl();
		return shaclProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralConfiguration createGeneralConfiguration() {
		GeneralConfigurationImpl generalConfiguration = new GeneralConfigurationImpl();
		return generalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectConfiguration createProjectConfiguration() {
		ProjectConfigurationImpl projectConfiguration = new ProjectConfigurationImpl();
		return projectConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfiguration createServerConfiguration() {
		ServerConfigurationImpl serverConfiguration = new ServerConfigurationImpl();
		return serverConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MavenProjectConfiguration createMavenProjectConfiguration() {
		MavenProjectConfigurationImpl mavenProjectConfiguration = new MavenProjectConfigurationImpl();
		return mavenProjectConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MavenServerConfiguration createMavenServerConfiguration() {
		MavenServerConfigurationImpl mavenServerConfiguration = new MavenServerConfigurationImpl();
		return mavenServerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MavenSpecificationConfiguration createMavenSpecificationConfiguration() {
		MavenSpecificationConfigurationImpl mavenSpecificationConfiguration = new MavenSpecificationConfigurationImpl();
		return mavenSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebService createWebService() {
		WebServiceImpl webService = new WebServiceImpl();
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyOccurs createResourcePropertyOccursFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyOccurs result = ResourcePropertyOccurs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyOccursToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyValueType createResourcePropertyValueTypeFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyValueType result = ResourcePropertyValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyRepresentation createResourcePropertyRepresentationFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyRepresentation result = ResourcePropertyRepresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyRepresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyIsMemberProperty createResourcePropertyIsMemberPropertyFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyIsMemberProperty result = ResourcePropertyIsMemberProperty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyIsMemberPropertyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertyMultiValueRepresentation createResourcePropertyMultiValueRepresentationFromString(EDataType eDataType, String initialValue) {
		ResourcePropertyMultiValueRepresentation result = ResourcePropertyMultiValueRepresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePropertyMultiValueRepresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceServiceNamespace createResourceServiceNamespaceFromString(EDataType eDataType, String initialValue) {
		ResourceServiceNamespace result = ResourceServiceNamespace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceServiceNamespaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShaclPropertyDataType createShaclPropertyDataTypeFromString(EDataType eDataType, String initialValue) {
		ShaclPropertyDataType result = ShaclPropertyDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShaclPropertyDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptorinterfacePackage getAdaptorinterfacePackage() {
		return (AdaptorinterfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptorinterfacePackage getPackage() {
		return AdaptorinterfacePackage.eINSTANCE;
	}

} //AdaptorinterfaceFactoryImpl
