/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.Specification;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationTest extends TestCase {

	/**
	 * The fixture for this Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specification fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecificationTest.class);
	}

	/**
	 * Constructs a new Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Specification fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specification getFixture() {
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
		setFixture(AdaptorinterfaceFactory.eINSTANCE.createSpecification());
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

} //SpecificationTest
