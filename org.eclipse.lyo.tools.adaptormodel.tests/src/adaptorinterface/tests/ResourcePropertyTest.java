/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.ResourceProperty;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcePropertyTest extends ShapePropertyTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(ResourcePropertyTest.class);
    }

	/**
     * Constructs a new Resource Property test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourcePropertyTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Resource Property test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected ResourceProperty getFixture() {
        return (ResourceProperty)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createResourceProperty());
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

} //ResourcePropertyTest
