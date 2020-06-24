/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.OSLCServicePersistence;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSLC Service Persistence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSLCServicePersistenceTest extends ServicePersistenceTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(OSLCServicePersistenceTest.class);
    }

    /**
     * Constructs a new OSLC Service Persistence test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OSLCServicePersistenceTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this OSLC Service Persistence test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected OSLCServicePersistence getFixture() {
        return (OSLCServicePersistence)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createOSLCServicePersistence());
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

} //OSLCServicePersistenceTest
