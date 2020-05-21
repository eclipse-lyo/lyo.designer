/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.GenericRequiredAdaptor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Required Adaptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericRequiredAdaptorTest extends RequiredAdaptorTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(GenericRequiredAdaptorTest.class);
    }

	/**
     * Constructs a new Generic Required Adaptor test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GenericRequiredAdaptorTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Generic Required Adaptor test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected GenericRequiredAdaptor getFixture() {
        return (GenericRequiredAdaptor)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createGenericRequiredAdaptor());
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

} //GenericRequiredAdaptorTest
