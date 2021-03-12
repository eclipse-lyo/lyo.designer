/**
 */
package toolchain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see toolchain.ToolchainPackage
 * @generated
 */
public interface ToolchainFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ToolchainFactory eINSTANCE = toolchain.impl.ToolchainFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Toolchain</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Toolchain</em>'.
     * @generated
     */
	Toolchain createToolchain();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	ToolchainPackage getToolchainPackage();

} //ToolchainFactory
