/**
 */
package toolchain.impl;

import adaptorinterface.AdaptorinterfacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import toolchain.Toolchain;
import toolchain.ToolchainFactory;
import toolchain.ToolchainPackage;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolchainPackageImpl extends EPackageImpl implements ToolchainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolchainEClass = null;

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
	 * @see toolchain.ToolchainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToolchainPackageImpl() {
		super(eNS_URI, ToolchainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToolchainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToolchainPackage init() {
		if (isInited) return (ToolchainPackage)EPackage.Registry.INSTANCE.getEPackage(ToolchainPackage.eNS_URI);

		// Obtain or create and register package
		ToolchainPackageImpl theToolchainPackage = (ToolchainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToolchainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToolchainPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AdaptorinterfacePackage.eINSTANCE.eClass();
		VocabularyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToolchainPackage.createPackageContents();

		// Initialize created meta-data
		theToolchainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToolchainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToolchainPackage.eNS_URI, theToolchainPackage);
		return theToolchainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolchain() {
		return toolchainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolchain_Name() {
		return (EAttribute)toolchainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolchain_AdaptorInterfaces() {
		return (EReference)toolchainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolchain_Specification() {
		return (EReference)toolchainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolchain_Vocabularies() {
		return (EReference)toolchainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolchainFactory getToolchainFactory() {
		return (ToolchainFactory)getEFactoryInstance();
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
		toolchainEClass = createEClass(TOOLCHAIN);
		createEAttribute(toolchainEClass, TOOLCHAIN__NAME);
		createEReference(toolchainEClass, TOOLCHAIN__ADAPTOR_INTERFACES);
		createEReference(toolchainEClass, TOOLCHAIN__SPECIFICATION);
		createEReference(toolchainEClass, TOOLCHAIN__VOCABULARIES);
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
		AdaptorinterfacePackage theAdaptorinterfacePackage = (AdaptorinterfacePackage)EPackage.Registry.INSTANCE.getEPackage(AdaptorinterfacePackage.eNS_URI);
		VocabularyPackage theVocabularyPackage = (VocabularyPackage)EPackage.Registry.INSTANCE.getEPackage(VocabularyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(toolchainEClass, Toolchain.class, "Toolchain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolchain_Name(), ecorePackage.getEString(), "name", "New ToolChain", 0, 1, Toolchain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolchain_AdaptorInterfaces(), theAdaptorinterfacePackage.getAdaptorInterface(), null, "adaptorInterfaces", null, 0, -1, Toolchain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolchain_Specification(), theAdaptorinterfacePackage.getSpecification(), null, "specification", null, 1, 1, Toolchain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolchain_Vocabularies(), theVocabularyPackage.getVocabularies(), null, "vocabularies", null, 1, 1, Toolchain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToolchainPackageImpl
