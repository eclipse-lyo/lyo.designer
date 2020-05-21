/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.ModelledRequiredAdaptor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modelled Required Adaptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelledRequiredAdaptorTest extends RequiredAdaptorTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(ModelledRequiredAdaptorTest.class);
    }

	/**
     * Constructs a new Modelled Required Adaptor test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ModelledRequiredAdaptorTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Modelled Required Adaptor test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected ModelledRequiredAdaptor getFixture() {
        return (ModelledRequiredAdaptor)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createModelledRequiredAdaptor());
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

} //ModelledRequiredAdaptorTest
