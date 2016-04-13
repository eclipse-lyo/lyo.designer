/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.QueryCapability;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Query Capability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryCapabilityTest extends TestCase {

	/**
	 * The fixture for this Query Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCapability fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QueryCapabilityTest.class);
	}

	/**
	 * Constructs a new Query Capability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryCapabilityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Query Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QueryCapability fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Query Capability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCapability getFixture() {
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
		setFixture(AdaptorinterfaceFactory.eINSTANCE.createQueryCapability());
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

} //QueryCapabilityTest
