/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.ShaclProperty;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shacl Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShaclPropertyTest extends ShapePropertyTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(ShaclPropertyTest.class);
    }

	/**
     * Constructs a new Shacl Property test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShaclPropertyTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Shacl Property test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected ShaclProperty getFixture() {
        return (ShaclProperty)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createShaclProperty());
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

} //ShaclPropertyTest
