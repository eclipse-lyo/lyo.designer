/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorInterface;
import adaptorinterface.AdaptorinterfaceFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adaptor Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorInterfaceTest extends TestCase {

	/**
     * The fixture for this Adaptor Interface test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AdaptorInterface fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(AdaptorInterfaceTest.class);
    }

	/**
     * Constructs a new Adaptor Interface test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AdaptorInterfaceTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Adaptor Interface test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(AdaptorInterface fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Adaptor Interface test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AdaptorInterface getFixture() {
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
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createAdaptorInterface());
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

} //AdaptorInterfaceTest
