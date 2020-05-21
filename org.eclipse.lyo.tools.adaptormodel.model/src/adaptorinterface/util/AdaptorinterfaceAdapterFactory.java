/**
 */
package adaptorinterface.util;

import adaptorinterface.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfacePackage
 * @generated
 */
public class AdaptorinterfaceAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static AdaptorinterfacePackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AdaptorinterfaceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = AdaptorinterfacePackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AdaptorinterfaceSwitch<Adapter> modelSwitch =
		new AdaptorinterfaceSwitch<Adapter>() {
            @Override
            public Adapter caseAdaptorInterface(AdaptorInterface object) {
                return createAdaptorInterfaceAdapter();
            }
            @Override
            public Adapter caseSpecification(Specification object) {
                return createSpecificationAdapter();
            }
            @Override
            public Adapter caseDomainSpecification(DomainSpecification object) {
                return createDomainSpecificationAdapter();
            }
            @Override
            public Adapter caseNamespacePrefix(NamespacePrefix object) {
                return createNamespacePrefixAdapter();
            }
            @Override
            public Adapter caseServiceProviderCatalog(ServiceProviderCatalog object) {
                return createServiceProviderCatalogAdapter();
            }
            @Override
            public Adapter caseServiceProvider(ServiceProvider object) {
                return createServiceProviderAdapter();
            }
            @Override
            public Adapter caseService(Service object) {
                return createServiceAdapter();
            }
            @Override
            public Adapter caseWebService(WebService object) {
                return createWebServiceAdapter();
            }
            @Override
            public Adapter caseTrsService(TrsService object) {
                return createTrsServiceAdapter();
            }
            @Override
            public Adapter caseInmemPagedTrsService(InmemPagedTrsService object) {
                return createInmemPagedTrsServiceAdapter();
            }
            @Override
            public Adapter caseResource(Resource object) {
                return createResourceAdapter();
            }
            @Override
            public Adapter caseResourceProperty(ResourceProperty object) {
                return createResourcePropertyAdapter();
            }
            @Override
            public Adapter caseCreationFactory(CreationFactory object) {
                return createCreationFactoryAdapter();
            }
            @Override
            public Adapter caseQueryCapability(QueryCapability object) {
                return createQueryCapabilityAdapter();
            }
            @Override
            public Adapter caseBasicCapability(BasicCapability object) {
                return createBasicCapabilityAdapter();
            }
            @Override
            public Adapter caseDialog(Dialog object) {
                return createDialogAdapter();
            }
            @Override
            public Adapter casePublisher(Publisher object) {
                return createPublisherAdapter();
            }
            @Override
            public Adapter caseRequiredAdaptor(RequiredAdaptor object) {
                return createRequiredAdaptorAdapter();
            }
            @Override
            public Adapter caseGenericRequiredAdaptor(GenericRequiredAdaptor object) {
                return createGenericRequiredAdaptorAdapter();
            }
            @Override
            public Adapter caseModelledRequiredAdaptor(ModelledRequiredAdaptor object) {
                return createModelledRequiredAdaptorAdapter();
            }
            @Override
            public Adapter caseGenerationSetting(GenerationSetting object) {
                return createGenerationSettingAdapter();
            }
            @Override
            public Adapter caseShape(Shape object) {
                return createShapeAdapter();
            }
            @Override
            public Adapter caseShaclShape(ShaclShape object) {
                return createShaclShapeAdapter();
            }
            @Override
            public Adapter caseShapeProperty(ShapeProperty object) {
                return createShapePropertyAdapter();
            }
            @Override
            public Adapter caseShaclProperty(ShaclProperty object) {
                return createShaclPropertyAdapter();
            }
            @Override
            public Adapter caseAuthenticationConfiguration(AuthenticationConfiguration object) {
                return createAuthenticationConfigurationAdapter();
            }
            @Override
            public Adapter caseGeneralConfiguration(GeneralConfiguration object) {
                return createGeneralConfigurationAdapter();
            }
            @Override
            public Adapter caseProjectConfiguration(ProjectConfiguration object) {
                return createProjectConfigurationAdapter();
            }
            @Override
            public Adapter caseServerConfiguration(ServerConfiguration object) {
                return createServerConfigurationAdapter();
            }
            @Override
            public Adapter caseSpecificationConfiguration(SpecificationConfiguration object) {
                return createSpecificationConfigurationAdapter();
            }
            @Override
            public Adapter caseMavenProjectConfiguration(MavenProjectConfiguration object) {
                return createMavenProjectConfigurationAdapter();
            }
            @Override
            public Adapter caseMavenServerConfiguration(MavenServerConfiguration object) {
                return createMavenServerConfigurationAdapter();
            }
            @Override
            public Adapter caseMavenSpecificationConfiguration(MavenSpecificationConfiguration object) {
                return createMavenSpecificationConfigurationAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.AdaptorInterface <em>Adaptor Interface</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.AdaptorInterface
     * @generated
     */
	public Adapter createAdaptorInterfaceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.Specification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.Specification
     * @generated
     */
	public Adapter createSpecificationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.DomainSpecification <em>Domain Specification</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.DomainSpecification
     * @generated
     */
	public Adapter createDomainSpecificationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.NamespacePrefix <em>Namespace Prefix</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.NamespacePrefix
     * @generated
     */
	public Adapter createNamespacePrefixAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ServiceProviderCatalog <em>Service Provider Catalog</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ServiceProviderCatalog
     * @generated
     */
	public Adapter createServiceProviderCatalogAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ServiceProvider <em>Service Provider</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ServiceProvider
     * @generated
     */
	public Adapter createServiceProviderAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.Service
     * @generated
     */
	public Adapter createServiceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.Resource
     * @generated
     */
	public Adapter createResourceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ResourceProperty <em>Resource Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ResourceProperty
     * @generated
     */
	public Adapter createResourcePropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.CreationFactory <em>Creation Factory</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.CreationFactory
     * @generated
     */
	public Adapter createCreationFactoryAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.QueryCapability <em>Query Capability</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.QueryCapability
     * @generated
     */
	public Adapter createQueryCapabilityAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.BasicCapability <em>Basic Capability</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.BasicCapability
     * @generated
     */
	public Adapter createBasicCapabilityAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.Dialog <em>Dialog</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.Dialog
     * @generated
     */
	public Adapter createDialogAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.Publisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.Publisher
     * @generated
     */
	public Adapter createPublisherAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.RequiredAdaptor <em>Required Adaptor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.RequiredAdaptor
     * @generated
     */
	public Adapter createRequiredAdaptorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.GenericRequiredAdaptor <em>Generic Required Adaptor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.GenericRequiredAdaptor
     * @generated
     */
	public Adapter createGenericRequiredAdaptorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ModelledRequiredAdaptor <em>Modelled Required Adaptor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ModelledRequiredAdaptor
     * @generated
     */
	public Adapter createModelledRequiredAdaptorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.GenerationSetting <em>Generation Setting</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.GenerationSetting
     * @generated
     */
	public Adapter createGenerationSettingAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.Shape
     * @generated
     */
	public Adapter createShapeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ShaclShape <em>Shacl Shape</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ShaclShape
     * @generated
     */
	public Adapter createShaclShapeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ShapeProperty <em>Shape Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ShapeProperty
     * @generated
     */
	public Adapter createShapePropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ShaclProperty <em>Shacl Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ShaclProperty
     * @generated
     */
	public Adapter createShaclPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.AuthenticationConfiguration <em>Authentication Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.AuthenticationConfiguration
     * @generated
     */
	public Adapter createAuthenticationConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.GeneralConfiguration <em>General Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.GeneralConfiguration
     * @generated
     */
	public Adapter createGeneralConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ProjectConfiguration <em>Project Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ProjectConfiguration
     * @generated
     */
	public Adapter createProjectConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.ServerConfiguration <em>Server Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.ServerConfiguration
     * @generated
     */
	public Adapter createServerConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.SpecificationConfiguration <em>Specification Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.SpecificationConfiguration
     * @generated
     */
	public Adapter createSpecificationConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.MavenProjectConfiguration <em>Maven Project Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.MavenProjectConfiguration
     * @generated
     */
	public Adapter createMavenProjectConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.MavenServerConfiguration <em>Maven Server Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.MavenServerConfiguration
     * @generated
     */
	public Adapter createMavenServerConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.MavenSpecificationConfiguration <em>Maven Specification Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.MavenSpecificationConfiguration
     * @generated
     */
	public Adapter createMavenSpecificationConfigurationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.WebService <em>Web Service</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.WebService
     * @generated
     */
	public Adapter createWebServiceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.TrsService <em>Trs Service</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.TrsService
     * @generated
     */
	public Adapter createTrsServiceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link adaptorinterface.InmemPagedTrsService <em>Inmem Paged Trs Service</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see adaptorinterface.InmemPagedTrsService
     * @generated
     */
	public Adapter createInmemPagedTrsServiceAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //AdaptorinterfaceAdapterFactory
