/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.AuthenticationConfiguration;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Authentication Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthenticationConfigurationTest extends TestCase {

	/**
	 * The fixture for this Authentication Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthenticationConfigurationTest.class);
	}

	/**
	 * Constructs a new Authentication Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Authentication Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AuthenticationConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Authentication Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationConfiguration getFixture() {
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
		setFixture(AdaptorinterfaceFactory.eINSTANCE.createAuthenticationConfiguration());
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

} //AuthenticationConfigurationTest
