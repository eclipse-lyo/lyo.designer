/**
 */
package toolchain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import toolchain.Toolchain;
import toolchain.ToolchainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Toolchain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolchainTest extends TestCase {

	/**
     * The fixture for this Toolchain test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Toolchain fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(ToolchainTest.class);
    }

	/**
     * Constructs a new Toolchain test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ToolchainTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Toolchain test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(Toolchain fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Toolchain test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Toolchain getFixture() {
        return fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(ToolchainFactory.eINSTANCE.createToolchain());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
	@Override
	protected void tearDown() throws Exception {
        setFixture(null);
    }

} //ToolchainTest
