/**
 */
package adaptorinterface.util;

import adaptorinterface.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfacePackage
 * @generated
 */
public class AdaptorinterfaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptorinterfacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorinterfaceSwitch() {
		if (modelPackage == null) {
			modelPackage = AdaptorinterfacePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AdaptorinterfacePackage.ADAPTOR_INTERFACE: {
				AdaptorInterface adaptorInterface = (AdaptorInterface)theEObject;
				T result = caseAdaptorInterface(adaptorInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.DOMAIN_SPECIFICATION: {
				DomainSpecification domainSpecification = (DomainSpecification)theEObject;
				T result = caseDomainSpecification(domainSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.NAMESPACE_PREFIX: {
				NamespacePrefix namespacePrefix = (NamespacePrefix)theEObject;
				T result = caseNamespacePrefix(namespacePrefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SERVICE_PROVIDER_CATALOG: {
				ServiceProviderCatalog serviceProviderCatalog = (ServiceProviderCatalog)theEObject;
				T result = caseServiceProviderCatalog(serviceProviderCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SERVICE_PROVIDER: {
				ServiceProvider serviceProvider = (ServiceProvider)theEObject;
				T result = caseServiceProvider(serviceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.WEB_SERVICE: {
				WebService webService = (WebService)theEObject;
				T result = caseWebService(webService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseShape(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.RESOURCE_PROPERTY: {
				ResourceProperty resourceProperty = (ResourceProperty)theEObject;
				T result = caseResourceProperty(resourceProperty);
				if (result == null) result = caseShapeProperty(resourceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.CREATION_FACTORY: {
				CreationFactory creationFactory = (CreationFactory)theEObject;
				T result = caseCreationFactory(creationFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.QUERY_CAPABILITY: {
				QueryCapability queryCapability = (QueryCapability)theEObject;
				T result = caseQueryCapability(queryCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.BASIC_CAPABILITY: {
				BasicCapability basicCapability = (BasicCapability)theEObject;
				T result = caseBasicCapability(basicCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.DIALOG: {
				Dialog dialog = (Dialog)theEObject;
				T result = caseDialog(dialog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.PUBLISHER: {
				Publisher publisher = (Publisher)theEObject;
				T result = casePublisher(publisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.REQUIRED_ADAPTOR: {
				RequiredAdaptor requiredAdaptor = (RequiredAdaptor)theEObject;
				T result = caseRequiredAdaptor(requiredAdaptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.GENERIC_REQUIRED_ADAPTOR: {
				GenericRequiredAdaptor genericRequiredAdaptor = (GenericRequiredAdaptor)theEObject;
				T result = caseGenericRequiredAdaptor(genericRequiredAdaptor);
				if (result == null) result = caseRequiredAdaptor(genericRequiredAdaptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.MODELLED_REQUIRED_ADAPTOR: {
				ModelledRequiredAdaptor modelledRequiredAdaptor = (ModelledRequiredAdaptor)theEObject;
				T result = caseModelledRequiredAdaptor(modelledRequiredAdaptor);
				if (result == null) result = caseRequiredAdaptor(modelledRequiredAdaptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.GENERATION_SETTING: {
				GenerationSetting generationSetting = (GenerationSetting)theEObject;
				T result = caseGenerationSetting(generationSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SHACL_SHAPE: {
				ShaclShape shaclShape = (ShaclShape)theEObject;
				T result = caseShaclShape(shaclShape);
				if (result == null) result = caseShape(shaclShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SHAPE_PROPERTY: {
				ShapeProperty shapeProperty = (ShapeProperty)theEObject;
				T result = caseShapeProperty(shapeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SHACL_PROPERTY: {
				ShaclProperty shaclProperty = (ShaclProperty)theEObject;
				T result = caseShaclProperty(shaclProperty);
				if (result == null) result = caseShapeProperty(shaclProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.AUTHENTICATION_CONFIGURATION: {
				AuthenticationConfiguration authenticationConfiguration = (AuthenticationConfiguration)theEObject;
				T result = caseAuthenticationConfiguration(authenticationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.GENERAL_CONFIGURATION: {
				GeneralConfiguration generalConfiguration = (GeneralConfiguration)theEObject;
				T result = caseGeneralConfiguration(generalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.PROJECT_CONFIGURATION: {
				ProjectConfiguration projectConfiguration = (ProjectConfiguration)theEObject;
				T result = caseProjectConfiguration(projectConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SERVER_CONFIGURATION: {
				ServerConfiguration serverConfiguration = (ServerConfiguration)theEObject;
				T result = caseServerConfiguration(serverConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.SPECIFICATION_CONFIGURATION: {
				SpecificationConfiguration specificationConfiguration = (SpecificationConfiguration)theEObject;
				T result = caseSpecificationConfiguration(specificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.MAVEN_PROJECT_CONFIGURATION: {
				MavenProjectConfiguration mavenProjectConfiguration = (MavenProjectConfiguration)theEObject;
				T result = caseMavenProjectConfiguration(mavenProjectConfiguration);
				if (result == null) result = caseProjectConfiguration(mavenProjectConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.MAVEN_SERVER_CONFIGURATION: {
				MavenServerConfiguration mavenServerConfiguration = (MavenServerConfiguration)theEObject;
				T result = caseMavenServerConfiguration(mavenServerConfiguration);
				if (result == null) result = caseServerConfiguration(mavenServerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptorinterfacePackage.MAVEN_SPECIFICATION_CONFIGURATION: {
				MavenSpecificationConfiguration mavenSpecificationConfiguration = (MavenSpecificationConfiguration)theEObject;
				T result = caseMavenSpecificationConfiguration(mavenSpecificationConfiguration);
				if (result == null) result = caseSpecificationConfiguration(mavenSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptor Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptor Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptorInterface(AdaptorInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecification(DomainSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespacePrefix(NamespacePrefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Provider Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Provider Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProviderCatalog(ServiceProviderCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProvider(ServiceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceProperty(ResourceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationFactory(CreationFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryCapability(QueryCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCapability(BasicCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialog(Dialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisher(Publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Adaptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredAdaptor(RequiredAdaptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Required Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Required Adaptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericRequiredAdaptor(GenericRequiredAdaptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelled Required Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelled Required Adaptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelledRequiredAdaptor(ModelledRequiredAdaptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationSetting(GenerationSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shacl Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shacl Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShaclShape(ShaclShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeProperty(ShapeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shacl Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shacl Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShaclProperty(ShaclProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationConfiguration(AuthenticationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralConfiguration(GeneralConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectConfiguration(ProjectConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerConfiguration(ServerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationConfiguration(SpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maven Project Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maven Project Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMavenProjectConfiguration(MavenProjectConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maven Server Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maven Server Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMavenServerConfiguration(MavenServerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maven Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maven Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMavenSpecificationConfiguration(MavenSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebService(WebService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AdaptorinterfaceSwitch
