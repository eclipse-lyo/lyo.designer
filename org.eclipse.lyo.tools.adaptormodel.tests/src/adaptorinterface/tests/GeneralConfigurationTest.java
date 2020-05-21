/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.GeneralConfiguration;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>General Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralConfigurationTest extends TestCase {

	/**
     * The fixture for this General Configuration test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GeneralConfiguration fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(GeneralConfigurationTest.class);
    }

	/**
     * Constructs a new General Configuration test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GeneralConfigurationTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this General Configuration test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(GeneralConfiguration fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this General Configuration test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GeneralConfiguration getFixture() {
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
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createGeneralConfiguration());
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

} //GeneralConfigurationTest
