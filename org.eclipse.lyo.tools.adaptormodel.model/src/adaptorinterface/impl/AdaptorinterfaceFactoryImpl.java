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
			case AdaptorinterfacePackage.RESOURCE_SERVICE_NAMESPACE:
				return createResourceServiceNamespaceFromString(eDataType, initialValue);
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
			case AdaptorinterfacePackage.RESOURCE_SERVICE_NAMESPACE:
				return convertResourceServiceNamespaceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorInterface createAdaptorInterface() {
		AdaptorInterfaceImpl adaptorInterface = new AdaptorInterfaceImpl();
		return adaptorInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecification createDomainSpecification() {
		DomainSpecificationImpl domainSpecification = new DomainSpecificationImpl();
		return domainSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacePrefix createNamespacePrefix() {
		NamespacePrefixImpl namespacePrefix = new NamespacePrefixImpl();
		return namespacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderCatalog createServiceProviderCatalog() {
		ServiceProviderCatalogImpl serviceProviderCatalog = new ServiceProviderCatalogImpl();
		return serviceProviderCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvider createServiceProvider() {
		ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProperty createResourceProperty() {
		ResourcePropertyImpl resourceProperty = new ResourcePropertyImpl();
		return resourceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationFactory createCreationFactory() {
		CreationFactoryImpl creationFactory = new CreationFactoryImpl();
		return creationFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryCapability createQueryCapability() {
		QueryCapabilityImpl queryCapability = new QueryCapabilityImpl();
		return queryCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCapability createBasicCapability() {
		BasicCapabilityImpl basicCapability = new BasicCapabilityImpl();
		return basicCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog createDialog() {
		DialogImpl dialog = new DialogImpl();
		return dialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericRequiredAdaptor createGenericRequiredAdaptor() {
		GenericRequiredAdaptorImpl genericRequiredAdaptor = new GenericRequiredAdaptorImpl();
		return genericRequiredAdaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelledRequiredAdaptor createModelledRequiredAdaptor() {
		ModelledRequiredAdaptorImpl modelledRequiredAdaptor = new ModelledRequiredAdaptorImpl();
		return modelledRequiredAdaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationSetting createGenerationSetting() {
		GenerationSettingImpl generationSetting = new GenerationSettingImpl();
		return generationSetting;
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
