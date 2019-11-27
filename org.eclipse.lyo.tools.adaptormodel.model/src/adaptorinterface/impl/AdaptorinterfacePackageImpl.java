/**
 */
package adaptorinterface.impl;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.BasicCapability;
import adaptorinterface.CreationFactory;
import adaptorinterface.Dialog;
import adaptorinterface.DomainSpecification;
import adaptorinterface.GenerationSetting;
import adaptorinterface.GenericRequiredAdaptor;
import adaptorinterface.ModelledRequiredAdaptor;
import adaptorinterface.NamespacePrefix;
import adaptorinterface.Publisher;
import adaptorinterface.QueryCapability;
import adaptorinterface.RequiredAdaptor;
import adaptorinterface.Resource;
import adaptorinterface.ResourceProperty;
import adaptorinterface.ResourcePropertyIsMemberProperty;
import adaptorinterface.ResourcePropertyOccurs;
import adaptorinterface.ResourcePropertyRepresentation;
import adaptorinterface.ResourcePropertyValueType;
import adaptorinterface.ResourceServiceNamespace;
import adaptorinterface.Service;
import adaptorinterface.ServiceProvider;
import adaptorinterface.ServiceProviderCatalog;
import adaptorinterface.ShaclProperty;
import adaptorinterface.ShaclPropertyDataType;
import adaptorinterface.ShaclShape;
import adaptorinterface.Shape;
import adaptorinterface.ShapeProperty;
import adaptorinterface.Specification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorinterfacePackageImpl extends EPackageImpl implements AdaptorinterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptorInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespacePrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredAdaptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericRequiredAdaptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelledRequiredAdaptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shaclShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shaclPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePropertyOccursEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePropertyValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePropertyRepresentationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePropertyIsMemberPropertyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceServiceNamespaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shaclPropertyDataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see adaptorinterface.AdaptorinterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptorinterfacePackageImpl() {
		super(eNS_URI, AdaptorinterfaceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AdaptorinterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptorinterfacePackage init() {
		if (isInited) return (AdaptorinterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AdaptorinterfacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdaptorinterfacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdaptorinterfacePackageImpl theAdaptorinterfacePackage = registeredAdaptorinterfacePackage instanceof AdaptorinterfacePackageImpl ? (AdaptorinterfacePackageImpl)registeredAdaptorinterfacePackage : new AdaptorinterfacePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		VocabularyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAdaptorinterfacePackage.createPackageContents();

		// Initialize created meta-data
		theAdaptorinterfacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptorinterfacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptorinterfacePackage.eNS_URI, theAdaptorinterfacePackage);
		return theAdaptorinterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdaptorInterface() {
		return adaptorInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdaptorInterface_ServiceProviderCatalog() {
		return (EReference)adaptorInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_Name() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_JavaClassBaseNamespace() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdaptorInterface_Specification() {
		return (EReference)adaptorInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_JavaFilesBasePath() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_JspFilesBasePath() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_JavascriptFilesBasePath() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_DoNotRegenerateJspFiles() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_SwaggerDocumentation() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_classImports() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_classMethods() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_servletListenerInitialize() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_servletListenerDestroy() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_getServiceProviders() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdaptorInterface_RequiredAdaptors() {
		return (EReference)adaptorInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_getResources() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_getResource() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_searchResources() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdaptorInterface_BackendCodeTemplate_createResource() {
		return (EAttribute)adaptorInterfaceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecification_DomainSpecifications() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecification_DomainPrefixes() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecification_GenerationSetting() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainSpecification() {
		return domainSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainSpecification_Name() {
		return (EAttribute)domainSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainSpecification_NamespaceURI() {
		return (EAttribute)domainSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecification_NamespacePrefix() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecification_Resources() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecification_ResourceProperties() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecification_GenerationSetting() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecification_ShaclShapes() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainSpecification_ShaclProperties() {
		return (EReference)domainSpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespacePrefix() {
		return namespacePrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamespacePrefix_Name() {
		return (EAttribute)namespacePrefixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceProviderCatalog() {
		return serviceProviderCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceProviderCatalog_Title() {
		return (EAttribute)serviceProviderCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceProviderCatalog_Description() {
		return (EAttribute)serviceProviderCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceProviderCatalog_Publisher() {
		return (EReference)serviceProviderCatalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceProviderCatalog_ServiceProviders() {
		return (EReference)serviceProviderCatalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceProvider() {
		return serviceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceProvider_Title() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceProvider_Description() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceProvider_Publisher() {
		return (EReference)serviceProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceProvider_Services() {
		return (EReference)serviceProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceProvider_ServiceNamespace() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceProvider_InstanceID() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_DomainSpecification() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ServiceNamespace() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_CreationFactories() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_QueryCapabilities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_SelectionDialogs() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_CreationDialogs() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_BasicCapabilities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Usages() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Extends() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_ResourceProperties() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Describes() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceProperty() {
		return resourcePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_Title() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_Name() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceProperty_PropertyDefinition() {
		return (EReference)resourcePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_Occurs() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_ReadOnly() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_ValueType() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_Representation() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceProperty_Range() {
		return (EReference)resourcePropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_Description() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_AllowedValue() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceProperty_IsMemberProperty() {
		return (EAttribute)resourcePropertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreationFactory() {
		return creationFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreationFactory_Title() {
		return (EAttribute)creationFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreationFactory_Label() {
		return (EAttribute)creationFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreationFactory_CreationURI() {
		return (EAttribute)creationFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreationFactory_ResourceTypes() {
		return (EReference)creationFactoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreationFactory_Usages() {
		return (EAttribute)creationFactoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryCapability() {
		return queryCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryCapability_Title() {
		return (EAttribute)queryCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryCapability_Label() {
		return (EAttribute)queryCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryCapability_QueryBaseURI() {
		return (EAttribute)queryCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryCapability_ResourceTypes() {
		return (EReference)queryCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueryCapability_Usages() {
		return (EAttribute)queryCapabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicCapability() {
		return basicCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicCapability_InstanceID() {
		return (EAttribute)basicCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicCapability_ResourceTypes() {
		return (EReference)basicCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicCapability_Read() {
		return (EAttribute)basicCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicCapability_Delete() {
		return (EAttribute)basicCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicCapability_Update() {
		return (EAttribute)basicCapabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDialog() {
		return dialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialog_Title() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialog_Label() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialog_DialogURI() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialog_HintWidth() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialog_HintHeight() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDialog_ResourceTypes() {
		return (EReference)dialogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDialog_Usages() {
		return (EAttribute)dialogEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublisher() {
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisher_Title() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisher_Label() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisher_Identifier() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisher_Icon() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredAdaptor() {
		return requiredAdaptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequiredAdaptor_ServiceProviderCatalogURI() {
		return (EAttribute)requiredAdaptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericRequiredAdaptor() {
		return genericRequiredAdaptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericRequiredAdaptor_Name() {
		return (EAttribute)genericRequiredAdaptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericRequiredAdaptor_ServicedResources() {
		return (EReference)genericRequiredAdaptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelledRequiredAdaptor() {
		return modelledRequiredAdaptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelledRequiredAdaptor_AdaptorInterface() {
		return (EReference)modelledRequiredAdaptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerationSetting() {
		return generationSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationSetting_JavaClassPackageName() {
		return (EAttribute)generationSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationSetting_JavaFilesPath() {
		return (EAttribute)generationSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShaclShape() {
		return shaclShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShaclShape_Name() {
		return (EAttribute)shaclShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShaclShape_TargetClass() {
		return (EReference)shaclShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShaclShape_Closed() {
		return (EAttribute)shaclShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShaclShape_ShaclProperties() {
		return (EReference)shaclShapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShaclShape_Extends() {
		return (EReference)shaclShapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShapeProperty() {
		return shapePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShaclProperty() {
		return shaclPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShaclProperty_Name() {
		return (EAttribute)shaclPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShaclProperty_Path() {
		return (EReference)shaclPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShaclProperty_MinCount() {
		return (EAttribute)shaclPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShaclProperty_MaxCount() {
		return (EAttribute)shaclPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShaclProperty_DataType() {
		return (EAttribute)shaclPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShaclProperty_Class() {
		return (EReference)shaclPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourcePropertyOccurs() {
		return resourcePropertyOccursEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourcePropertyValueType() {
		return resourcePropertyValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourcePropertyRepresentation() {
		return resourcePropertyRepresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourcePropertyIsMemberProperty() {
		return resourcePropertyIsMemberPropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceServiceNamespace() {
		return resourceServiceNamespaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShaclPropertyDataType() {
		return shaclPropertyDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptorinterfaceFactory getAdaptorinterfaceFactory() {
		return (AdaptorinterfaceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adaptorInterfaceEClass = createEClass(ADAPTOR_INTERFACE);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__NAME);
		createEReference(adaptorInterfaceEClass, ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG);
		createEReference(adaptorInterfaceEClass, ADAPTOR_INTERFACE__SPECIFICATION);
		createEReference(adaptorInterfaceEClass, ADAPTOR_INTERFACE__REQUIRED_ADAPTORS);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__DO_NOT_REGENERATE_JSP_FILES);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__SWAGGER_DOCUMENTATION);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES);
		createEAttribute(adaptorInterfaceEClass, ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__DOMAIN_SPECIFICATIONS);
		createEReference(specificationEClass, SPECIFICATION__DOMAIN_PREFIXES);
		createEReference(specificationEClass, SPECIFICATION__GENERATION_SETTING);

		domainSpecificationEClass = createEClass(DOMAIN_SPECIFICATION);
		createEAttribute(domainSpecificationEClass, DOMAIN_SPECIFICATION__NAME);
		createEAttribute(domainSpecificationEClass, DOMAIN_SPECIFICATION__NAMESPACE_URI);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__NAMESPACE_PREFIX);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__RESOURCES);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__GENERATION_SETTING);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__SHACL_SHAPES);
		createEReference(domainSpecificationEClass, DOMAIN_SPECIFICATION__SHACL_PROPERTIES);

		namespacePrefixEClass = createEClass(NAMESPACE_PREFIX);
		createEAttribute(namespacePrefixEClass, NAMESPACE_PREFIX__NAME);

		serviceProviderCatalogEClass = createEClass(SERVICE_PROVIDER_CATALOG);
		createEAttribute(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__TITLE);
		createEAttribute(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__DESCRIPTION);
		createEReference(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__PUBLISHER);
		createEReference(serviceProviderCatalogEClass, SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS);

		serviceProviderEClass = createEClass(SERVICE_PROVIDER);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__TITLE);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__DESCRIPTION);
		createEReference(serviceProviderEClass, SERVICE_PROVIDER__PUBLISHER);
		createEReference(serviceProviderEClass, SERVICE_PROVIDER__SERVICES);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__SERVICE_NAMESPACE);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__INSTANCE_ID);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__DOMAIN_SPECIFICATION);
		createEAttribute(serviceEClass, SERVICE__SERVICE_NAMESPACE);
		createEReference(serviceEClass, SERVICE__CREATION_FACTORIES);
		createEReference(serviceEClass, SERVICE__QUERY_CAPABILITIES);
		createEReference(serviceEClass, SERVICE__SELECTION_DIALOGS);
		createEReference(serviceEClass, SERVICE__CREATION_DIALOGS);
		createEReference(serviceEClass, SERVICE__BASIC_CAPABILITIES);
		createEAttribute(serviceEClass, SERVICE__USAGES);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEReference(resourceEClass, RESOURCE__DESCRIBES);
		createEReference(resourceEClass, RESOURCE__EXTENDS);
		createEReference(resourceEClass, RESOURCE__RESOURCE_PROPERTIES);

		resourcePropertyEClass = createEClass(RESOURCE_PROPERTY);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__TITLE);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__NAME);
		createEReference(resourcePropertyEClass, RESOURCE_PROPERTY__PROPERTY_DEFINITION);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__OCCURS);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__READ_ONLY);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__VALUE_TYPE);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__REPRESENTATION);
		createEReference(resourcePropertyEClass, RESOURCE_PROPERTY__RANGE);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__DESCRIPTION);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__ALLOWED_VALUE);
		createEAttribute(resourcePropertyEClass, RESOURCE_PROPERTY__IS_MEMBER_PROPERTY);

		creationFactoryEClass = createEClass(CREATION_FACTORY);
		createEAttribute(creationFactoryEClass, CREATION_FACTORY__TITLE);
		createEAttribute(creationFactoryEClass, CREATION_FACTORY__LABEL);
		createEAttribute(creationFactoryEClass, CREATION_FACTORY__CREATION_URI);
		createEReference(creationFactoryEClass, CREATION_FACTORY__RESOURCE_TYPES);
		createEAttribute(creationFactoryEClass, CREATION_FACTORY__USAGES);

		queryCapabilityEClass = createEClass(QUERY_CAPABILITY);
		createEAttribute(queryCapabilityEClass, QUERY_CAPABILITY__TITLE);
		createEAttribute(queryCapabilityEClass, QUERY_CAPABILITY__LABEL);
		createEAttribute(queryCapabilityEClass, QUERY_CAPABILITY__QUERY_BASE_URI);
		createEReference(queryCapabilityEClass, QUERY_CAPABILITY__RESOURCE_TYPES);
		createEAttribute(queryCapabilityEClass, QUERY_CAPABILITY__USAGES);

		basicCapabilityEClass = createEClass(BASIC_CAPABILITY);
		createEAttribute(basicCapabilityEClass, BASIC_CAPABILITY__INSTANCE_ID);
		createEReference(basicCapabilityEClass, BASIC_CAPABILITY__RESOURCE_TYPES);
		createEAttribute(basicCapabilityEClass, BASIC_CAPABILITY__READ);
		createEAttribute(basicCapabilityEClass, BASIC_CAPABILITY__DELETE);
		createEAttribute(basicCapabilityEClass, BASIC_CAPABILITY__UPDATE);

		dialogEClass = createEClass(DIALOG);
		createEAttribute(dialogEClass, DIALOG__TITLE);
		createEAttribute(dialogEClass, DIALOG__LABEL);
		createEAttribute(dialogEClass, DIALOG__DIALOG_URI);
		createEAttribute(dialogEClass, DIALOG__HINT_WIDTH);
		createEAttribute(dialogEClass, DIALOG__HINT_HEIGHT);
		createEReference(dialogEClass, DIALOG__RESOURCE_TYPES);
		createEAttribute(dialogEClass, DIALOG__USAGES);

		publisherEClass = createEClass(PUBLISHER);
		createEAttribute(publisherEClass, PUBLISHER__TITLE);
		createEAttribute(publisherEClass, PUBLISHER__LABEL);
		createEAttribute(publisherEClass, PUBLISHER__IDENTIFIER);
		createEAttribute(publisherEClass, PUBLISHER__ICON);

		requiredAdaptorEClass = createEClass(REQUIRED_ADAPTOR);
		createEAttribute(requiredAdaptorEClass, REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI);

		genericRequiredAdaptorEClass = createEClass(GENERIC_REQUIRED_ADAPTOR);
		createEAttribute(genericRequiredAdaptorEClass, GENERIC_REQUIRED_ADAPTOR__NAME);
		createEReference(genericRequiredAdaptorEClass, GENERIC_REQUIRED_ADAPTOR__SERVICED_RESOURCES);

		modelledRequiredAdaptorEClass = createEClass(MODELLED_REQUIRED_ADAPTOR);
		createEReference(modelledRequiredAdaptorEClass, MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE);

		generationSettingEClass = createEClass(GENERATION_SETTING);
		createEAttribute(generationSettingEClass, GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME);
		createEAttribute(generationSettingEClass, GENERATION_SETTING__JAVA_FILES_PATH);

		shapeEClass = createEClass(SHAPE);

		shaclShapeEClass = createEClass(SHACL_SHAPE);
		createEAttribute(shaclShapeEClass, SHACL_SHAPE__NAME);
		createEReference(shaclShapeEClass, SHACL_SHAPE__TARGET_CLASS);
		createEAttribute(shaclShapeEClass, SHACL_SHAPE__CLOSED);
		createEReference(shaclShapeEClass, SHACL_SHAPE__SHACL_PROPERTIES);
		createEReference(shaclShapeEClass, SHACL_SHAPE__EXTENDS);

		shapePropertyEClass = createEClass(SHAPE_PROPERTY);

		shaclPropertyEClass = createEClass(SHACL_PROPERTY);
		createEAttribute(shaclPropertyEClass, SHACL_PROPERTY__NAME);
		createEReference(shaclPropertyEClass, SHACL_PROPERTY__PATH);
		createEAttribute(shaclPropertyEClass, SHACL_PROPERTY__MIN_COUNT);
		createEAttribute(shaclPropertyEClass, SHACL_PROPERTY__MAX_COUNT);
		createEAttribute(shaclPropertyEClass, SHACL_PROPERTY__DATA_TYPE);
		createEReference(shaclPropertyEClass, SHACL_PROPERTY__CLASS);

		// Create enums
		resourcePropertyOccursEEnum = createEEnum(RESOURCE_PROPERTY_OCCURS);
		resourcePropertyValueTypeEEnum = createEEnum(RESOURCE_PROPERTY_VALUE_TYPE);
		resourcePropertyRepresentationEEnum = createEEnum(RESOURCE_PROPERTY_REPRESENTATION);
		resourcePropertyIsMemberPropertyEEnum = createEEnum(RESOURCE_PROPERTY_IS_MEMBER_PROPERTY);
		resourceServiceNamespaceEEnum = createEEnum(RESOURCE_SERVICE_NAMESPACE);
		shaclPropertyDataTypeEEnum = createEEnum(SHACL_PROPERTY_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VocabularyPackage theVocabularyPackage = (VocabularyPackage)EPackage.Registry.INSTANCE.getEPackage(VocabularyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(this.getShape());
		resourcePropertyEClass.getESuperTypes().add(this.getShapeProperty());
		genericRequiredAdaptorEClass.getESuperTypes().add(this.getRequiredAdaptor());
		modelledRequiredAdaptorEClass.getESuperTypes().add(this.getRequiredAdaptor());
		shaclShapeEClass.getESuperTypes().add(this.getShape());
		shaclPropertyEClass.getESuperTypes().add(this.getShapeProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(adaptorInterfaceEClass, AdaptorInterface.class, "AdaptorInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdaptorInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptorInterface_ServiceProviderCatalog(), this.getServiceProviderCatalog(), null, "serviceProviderCatalog", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptorInterface_Specification(), this.getSpecification(), null, "specification", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptorInterface_RequiredAdaptors(), this.getRequiredAdaptor(), null, "requiredAdaptors", null, 0, -1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_JavaClassBaseNamespace(), ecorePackage.getEString(), "javaClassBaseNamespace", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_JavaFilesBasePath(), ecorePackage.getEString(), "javaFilesBasePath", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_JspFilesBasePath(), ecorePackage.getEString(), "jspFilesBasePath", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_JavascriptFilesBasePath(), ecorePackage.getEString(), "javascriptFilesBasePath", null, 1, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_DoNotRegenerateJspFiles(), ecorePackage.getEBoolean(), "doNotRegenerateJspFiles", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_SwaggerDocumentation(), ecorePackage.getEBoolean(), "swaggerDocumentation", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_classImports(), ecorePackage.getEString(), "backendCodeTemplate_classImports", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_classMethods(), ecorePackage.getEString(), "backendCodeTemplate_classMethods", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_servletListenerInitialize(), ecorePackage.getEString(), "backendCodeTemplate_servletListenerInitialize", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_servletListenerDestroy(), ecorePackage.getEString(), "backendCodeTemplate_servletListenerDestroy", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_getServiceProviders(), ecorePackage.getEString(), "backendCodeTemplate_getServiceProviders", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_getResource(), ecorePackage.getEString(), "backendCodeTemplate_getResource", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_getResources(), ecorePackage.getEString(), "backendCodeTemplate_getResources", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_searchResources(), ecorePackage.getEString(), "backendCodeTemplate_searchResources", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdaptorInterface_BackendCodeTemplate_createResource(), ecorePackage.getEString(), "backendCodeTemplate_createResource", null, 0, 1, AdaptorInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_DomainSpecifications(), this.getDomainSpecification(), null, "domainSpecifications", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSpecification_DomainSpecifications().getEKeys().add(this.getDomainSpecification_Name());
		initEReference(getSpecification_DomainPrefixes(), this.getNamespacePrefix(), null, "domainPrefixes", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSpecification_DomainPrefixes().getEKeys().add(this.getNamespacePrefix_Name());
		initEReference(getSpecification_GenerationSetting(), this.getGenerationSetting(), null, "generationSetting", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainSpecificationEClass, DomainSpecification.class, "DomainSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainSpecification_NamespaceURI(), ecorePackage.getEString(), "namespaceURI", null, 1, 1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecification_NamespacePrefix(), this.getNamespacePrefix(), null, "namespacePrefix", null, 1, 1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecification_Resources(), this.getResource(), null, "resources", null, 0, -1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDomainSpecification_Resources().getEKeys().add(this.getResource_Name());
		initEReference(getDomainSpecification_ResourceProperties(), this.getResourceProperty(), null, "resourceProperties", null, 0, -1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDomainSpecification_ResourceProperties().getEKeys().add(this.getResourceProperty_Name());
		initEReference(getDomainSpecification_GenerationSetting(), this.getGenerationSetting(), null, "generationSetting", null, 0, 1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecification_ShaclShapes(), this.getShaclShape(), null, "shaclShapes", null, 0, -1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDomainSpecification_ShaclShapes().getEKeys().add(this.getShaclShape_Name());
		initEReference(getDomainSpecification_ShaclProperties(), this.getShaclProperty(), null, "shaclProperties", null, 0, -1, DomainSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDomainSpecification_ShaclProperties().getEKeys().add(this.getShaclProperty_Name());

		initEClass(namespacePrefixEClass, NamespacePrefix.class, "NamespacePrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespacePrefix_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamespacePrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceProviderCatalogEClass, ServiceProviderCatalog.class, "ServiceProviderCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceProviderCatalog_Title(), ecorePackage.getEString(), "title", null, 0, 1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProviderCatalog_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProviderCatalog_Publisher(), this.getPublisher(), null, "publisher", null, 0, 1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProviderCatalog_ServiceProviders(), this.getServiceProvider(), null, "serviceProviders", null, 0, -1, ServiceProviderCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceProvider_Title(), ecorePackage.getEString(), "title", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProvider_Publisher(), this.getPublisher(), null, "publisher", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceProvider_Services(), this.getService(), null, "services", null, 1, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_ServiceNamespace(), ecorePackage.getEString(), "serviceNamespace", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_DomainSpecification(), this.getDomainSpecification(), null, "domainSpecification", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ServiceNamespace(), this.getResourceServiceNamespace(), "serviceNamespace", "relativeToServiceProvider", 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_CreationFactories(), this.getCreationFactory(), null, "creationFactories", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_QueryCapabilities(), this.getQueryCapability(), null, "queryCapabilities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_SelectionDialogs(), this.getDialog(), null, "selectionDialogs", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_CreationDialogs(), this.getDialog(), null, "creationDialogs", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_BasicCapabilities(), this.getBasicCapability(), null, "basicCapabilities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Usages(), ecorePackage.getEString(), "usages", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Describes(), theVocabularyPackage.getClass_(), null, "describes", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Extends(), this.getResource(), null, "extends", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ResourceProperties(), this.getResourceProperty(), null, "resourceProperties", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePropertyEClass, ResourceProperty.class, "ResourceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceProperty_Title(), ecorePackage.getEString(), "title", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceProperty_PropertyDefinition(), theVocabularyPackage.getProperty(), null, "propertyDefinition", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Occurs(), this.getResourcePropertyOccurs(), "occurs", "exactlyOne", 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_ValueType(), this.getResourcePropertyValueType(), "valueType", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Representation(), this.getResourcePropertyRepresentation(), "representation", "n_a", 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceProperty_Range(), this.getResource(), null, "range", null, 0, -1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_AllowedValue(), ecorePackage.getEString(), "allowedValue", null, 0, -1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProperty_IsMemberProperty(), this.getResourcePropertyIsMemberProperty(), "isMemberProperty", null, 0, 1, ResourceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationFactoryEClass, CreationFactory.class, "CreationFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreationFactory_Title(), ecorePackage.getEString(), "title", null, 1, 1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationFactory_Label(), ecorePackage.getEString(), "label", null, 0, 1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationFactory_CreationURI(), ecorePackage.getEString(), "creationURI", null, 1, 1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreationFactory_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreationFactory_Usages(), ecorePackage.getEString(), "usages", null, 0, -1, CreationFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryCapabilityEClass, QueryCapability.class, "QueryCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryCapability_Title(), ecorePackage.getEString(), "title", null, 1, 1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryCapability_Label(), ecorePackage.getEString(), "label", null, 0, 1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryCapability_QueryBaseURI(), ecorePackage.getEString(), "queryBaseURI", null, 1, 1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryCapability_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryCapability_Usages(), ecorePackage.getEString(), "usages", null, 0, -1, QueryCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicCapabilityEClass, BasicCapability.class, "BasicCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicCapability_InstanceID(), ecorePackage.getEString(), "instanceID", null, 0, 1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicCapability_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCapability_Read(), ecorePackage.getEBoolean(), "read", "true", 0, 1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCapability_Delete(), ecorePackage.getEBoolean(), "delete", "false", 0, 1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCapability_Update(), ecorePackage.getEBoolean(), "update", "false", 0, 1, BasicCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogEClass, Dialog.class, "Dialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialog_Title(), ecorePackage.getEString(), "title", null, 1, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_Label(), ecorePackage.getEString(), "label", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_DialogURI(), ecorePackage.getEString(), "dialogURI", null, 1, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_HintWidth(), ecorePackage.getEShort(), "hintWidth", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_HintHeight(), ecorePackage.getEShort(), "hintHeight", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialog_ResourceTypes(), this.getResource(), null, "resourceTypes", null, 0, -1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialog_Usages(), ecorePackage.getEString(), "usages", null, 0, -1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publisherEClass, Publisher.class, "Publisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublisher_Title(), ecorePackage.getEString(), "title", null, 1, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_Label(), ecorePackage.getEString(), "label", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredAdaptorEClass, RequiredAdaptor.class, "RequiredAdaptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredAdaptor_ServiceProviderCatalogURI(), ecorePackage.getEString(), "serviceProviderCatalogURI", null, 1, 1, RequiredAdaptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericRequiredAdaptorEClass, GenericRequiredAdaptor.class, "GenericRequiredAdaptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericRequiredAdaptor_Name(), ecorePackage.getEString(), "name", null, 1, 1, GenericRequiredAdaptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericRequiredAdaptor_ServicedResources(), this.getResource(), null, "servicedResources", null, 0, -1, GenericRequiredAdaptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelledRequiredAdaptorEClass, ModelledRequiredAdaptor.class, "ModelledRequiredAdaptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelledRequiredAdaptor_AdaptorInterface(), this.getAdaptorInterface(), null, "adaptorInterface", null, 1, 1, ModelledRequiredAdaptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationSettingEClass, GenerationSetting.class, "GenerationSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationSetting_JavaClassPackageName(), ecorePackage.getEString(), "javaClassPackageName", null, 0, 1, GenerationSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationSetting_JavaFilesPath(), ecorePackage.getEString(), "javaFilesPath", null, 0, 1, GenerationSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shaclShapeEClass, ShaclShape.class, "ShaclShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShaclShape_Name(), ecorePackage.getEString(), "name", null, 0, 1, ShaclShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShaclShape_TargetClass(), theVocabularyPackage.getClass_(), null, "targetClass", null, 0, 1, ShaclShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShaclShape_Closed(), ecorePackage.getEBoolean(), "closed", "false", 0, 1, ShaclShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShaclShape_ShaclProperties(), this.getShaclProperty(), null, "shaclProperties", null, 0, -1, ShaclShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShaclShape_Extends(), this.getShaclShape(), null, "extends", null, 0, -1, ShaclShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapePropertyEClass, ShapeProperty.class, "ShapeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shaclPropertyEClass, ShaclProperty.class, "ShaclProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShaclProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ShaclProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShaclProperty_Path(), theVocabularyPackage.getProperty(), null, "path", null, 0, 1, ShaclProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShaclProperty_MinCount(), ecorePackage.getEInt(), "minCount", null, 0, 1, ShaclProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShaclProperty_MaxCount(), ecorePackage.getEInt(), "maxCount", null, 0, 1, ShaclProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShaclProperty_DataType(), this.getShaclPropertyDataType(), "dataType", null, 0, 1, ShaclProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShaclProperty_Class(), this.getShaclShape(), null, "class", null, 0, -1, ShaclProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourcePropertyOccursEEnum, ResourcePropertyOccurs.class, "ResourcePropertyOccurs");
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.EXACTLY_ONE);
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.ZERO_OR_ONE);
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.ZERO_OR_MANY);
		addEEnumLiteral(resourcePropertyOccursEEnum, ResourcePropertyOccurs.ONE_OR_MANY);

		initEEnum(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.class, "ResourcePropertyValueType");
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.BOOLEAN);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.STRING);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.DATE_TIME);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.XML_LITERAL);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.RESOURCE);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.LOCAL_RESOURCE);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.URI);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.DOUBLE);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.FLOAT);
		addEEnumLiteral(resourcePropertyValueTypeEEnum, ResourcePropertyValueType.INTEGER);

		initEEnum(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.class, "ResourcePropertyRepresentation");
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.REFERENCE);
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.INLINE);
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.EITHER);
		addEEnumLiteral(resourcePropertyRepresentationEEnum, ResourcePropertyRepresentation.NA);

		initEEnum(resourcePropertyIsMemberPropertyEEnum, ResourcePropertyIsMemberProperty.class, "ResourcePropertyIsMemberProperty");
		addEEnumLiteral(resourcePropertyIsMemberPropertyEEnum, ResourcePropertyIsMemberProperty.NA);
		addEEnumLiteral(resourcePropertyIsMemberPropertyEEnum, ResourcePropertyIsMemberProperty.FALSE);
		addEEnumLiteral(resourcePropertyIsMemberPropertyEEnum, ResourcePropertyIsMemberProperty.TRUE);

		initEEnum(resourceServiceNamespaceEEnum, ResourceServiceNamespace.class, "ResourceServiceNamespace");
		addEEnumLiteral(resourceServiceNamespaceEEnum, ResourceServiceNamespace.RELATIVE_TO_SERVICE_PROVIDER);
		addEEnumLiteral(resourceServiceNamespaceEEnum, ResourceServiceNamespace.INDEPENDANT_OF_SERVICE_PROVIDER);

		initEEnum(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.class, "ShaclPropertyDataType");
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.BOOLEAN);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.STRING);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.DATE_TIME);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.XML_LITERAL);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.RESOURCE);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.URI);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.DOUBLE);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.FLOAT);
		addEEnumLiteral(shaclPropertyDataTypeEEnum, ShaclPropertyDataType.INTEGER);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptorinterfacePackageImpl
