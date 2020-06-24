/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.WebServicePersistence;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Web Service Persistence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebServicePersistenceTest extends ServicePersistenceTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(WebServicePersistenceTest.class);
    }

    /**
     * Constructs a new Web Service Persistence test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WebServicePersistenceTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Web Service Persistence test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected WebServicePersistence getFixture() {
        return (WebServicePersistence)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(AdaptorinterfaceFactory.eINSTANCE.createWebServicePersistence());
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

} //WebServicePersistenceTest
