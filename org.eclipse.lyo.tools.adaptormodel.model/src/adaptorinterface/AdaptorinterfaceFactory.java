/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfacePackage
 * @generated
 */
public interface AdaptorinterfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptorinterfaceFactory eINSTANCE = adaptorinterface.impl.AdaptorinterfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adaptor Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptor Interface</em>'.
	 * @generated
	 */
	AdaptorInterface createAdaptorInterface();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Domain Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specification</em>'.
	 * @generated
	 */
	DomainSpecification createDomainSpecification();

	/**
	 * Returns a new object of class '<em>Namespace Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Prefix</em>'.
	 * @generated
	 */
	NamespacePrefix createNamespacePrefix();

	/**
	 * Returns a new object of class '<em>Service Provider Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Provider Catalog</em>'.
	 * @generated
	 */
	ServiceProviderCatalog createServiceProviderCatalog();

	/**
	 * Returns a new object of class '<em>Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Provider</em>'.
	 * @generated
	 */
	ServiceProvider createServiceProvider();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Resource Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Property</em>'.
	 * @generated
	 */
	ResourceProperty createResourceProperty();

	/**
	 * Returns a new object of class '<em>Creation Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Factory</em>'.
	 * @generated
	 */
	CreationFactory createCreationFactory();

	/**
	 * Returns a new object of class '<em>Query Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Capability</em>'.
	 * @generated
	 */
	QueryCapability createQueryCapability();

	/**
	 * Returns a new object of class '<em>Basic Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Capability</em>'.
	 * @generated
	 */
	BasicCapability createBasicCapability();

	/**
	 * Returns a new object of class '<em>Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialog</em>'.
	 * @generated
	 */
	Dialog createDialog();

	/**
	 * Returns a new object of class '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher</em>'.
	 * @generated
	 */
	Publisher createPublisher();

	/**
	 * Returns a new object of class '<em>Generic Required Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Required Adaptor</em>'.
	 * @generated
	 */
	GenericRequiredAdaptor createGenericRequiredAdaptor();

	/**
	 * Returns a new object of class '<em>Modelled Required Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelled Required Adaptor</em>'.
	 * @generated
	 */
	ModelledRequiredAdaptor createModelledRequiredAdaptor();

	/**
	 * Returns a new object of class '<em>Generation Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Setting</em>'.
	 * @generated
	 */
	GenerationSetting createGenerationSetting();

	/**
	 * Returns a new object of class '<em>Shacl Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shacl Shape</em>'.
	 * @generated
	 */
	ShaclShape createShaclShape();

	/**
	 * Returns a new object of class '<em>Shape Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape Property</em>'.
	 * @generated
	 */
	ShapeProperty createShapeProperty();

	/**
	 * Returns a new object of class '<em>Shacl Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shacl Property</em>'.
	 * @generated
	 */
	ShaclProperty createShaclProperty();

	/**
	 * Returns a new object of class '<em>Authentication Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Configuration</em>'.
	 * @generated
	 */
	AuthenticationConfiguration createAuthenticationConfiguration();

	/**
	 * Returns a new object of class '<em>General Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Configuration</em>'.
	 * @generated
	 */
	GeneralConfiguration createGeneralConfiguration();

	/**
	 * Returns a new object of class '<em>Project Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Configuration</em>'.
	 * @generated
	 */
	ProjectConfiguration createProjectConfiguration();

	/**
	 * Returns a new object of class '<em>Server Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Configuration</em>'.
	 * @generated
	 */
	ServerConfiguration createServerConfiguration();

	/**
	 * Returns a new object of class '<em>Maven Project Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maven Project Configuration</em>'.
	 * @generated
	 */
	MavenProjectConfiguration createMavenProjectConfiguration();

	/**
	 * Returns a new object of class '<em>Maven Server Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maven Server Configuration</em>'.
	 * @generated
	 */
	MavenServerConfiguration createMavenServerConfiguration();

	/**
	 * Returns a new object of class '<em>Maven Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maven Specification Configuration</em>'.
	 * @generated
	 */
	MavenSpecificationConfiguration createMavenSpecificationConfiguration();

	/**
	 * Returns a new object of class '<em>Web Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Service</em>'.
	 * @generated
	 */
	WebService createWebService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptorinterfacePackage getAdaptorinterfacePackage();

} //AdaptorinterfaceFactory
