/**
 */
package toolchain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see toolchain.ToolchainFactory
 * @model kind="package"
 * @generated
 */
public interface ToolchainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toolchain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.lyo/oslc4j/toolChain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oslc4j_tc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToolchainPackage eINSTANCE = toolchain.impl.ToolchainPackageImpl.init();

	/**
	 * The meta object id for the '{@link toolchain.impl.ToolchainImpl <em>Toolchain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolchain.impl.ToolchainImpl
	 * @see toolchain.impl.ToolchainPackageImpl#getToolchain()
	 * @generated
	 */
	int TOOLCHAIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLCHAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Adaptor Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLCHAIN__ADAPTOR_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLCHAIN__SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Toolchain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLCHAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Toolchain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLCHAIN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link toolchain.Toolchain <em>Toolchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolchain</em>'.
	 * @see toolchain.Toolchain
	 * @generated
	 */
	EClass getToolchain();

	/**
	 * Returns the meta object for the attribute '{@link toolchain.Toolchain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see toolchain.Toolchain#getName()
	 * @see #getToolchain()
	 * @generated
	 */
	EAttribute getToolchain_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link toolchain.Toolchain#getAdaptorInterfaces <em>Adaptor Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptor Interfaces</em>'.
	 * @see toolchain.Toolchain#getAdaptorInterfaces()
	 * @see #getToolchain()
	 * @generated
	 */
	EReference getToolchain_AdaptorInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link toolchain.Toolchain#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see toolchain.Toolchain#getSpecification()
	 * @see #getToolchain()
	 * @generated
	 */
	EReference getToolchain_Specification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToolchainFactory getToolchainFactory();

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
		 * The meta object literal for the '{@link toolchain.impl.ToolchainImpl <em>Toolchain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolchain.impl.ToolchainImpl
		 * @see toolchain.impl.ToolchainPackageImpl#getToolchain()
		 * @generated
		 */
		EClass TOOLCHAIN = eINSTANCE.getToolchain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLCHAIN__NAME = eINSTANCE.getToolchain_Name();

		/**
		 * The meta object literal for the '<em><b>Adaptor Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLCHAIN__ADAPTOR_INTERFACES = eINSTANCE.getToolchain_AdaptorInterfaces();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLCHAIN__SPECIFICATION = eINSTANCE.getToolchain_Specification();

	}

} //ToolchainPackage
