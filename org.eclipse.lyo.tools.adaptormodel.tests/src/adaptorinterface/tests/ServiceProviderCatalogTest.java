/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.ServiceProviderCatalog;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Provider Catalog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceProviderCatalogTest extends TestCase {

	/**
	 * The fixture for this Service Provider Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderCatalog fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceProviderCatalogTest.class);
	}

	/**
	 * Constructs a new Service Provider Catalog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderCatalogTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Provider Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceProviderCatalog fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Provider Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderCatalog getFixture() {
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
		setFixture(AdaptorinterfaceFactory.eINSTANCE.createServiceProviderCatalog());
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

} //ServiceProviderCatalogTest
