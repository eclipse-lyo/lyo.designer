/**
 */
package adaptorinterface.tests;

import adaptorinterface.AdaptorinterfaceFactory;
import adaptorinterface.Dialog;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DialogTest extends TestCase {

	/**
	 * The fixture for this Dialog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dialog fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DialogTest.class);
	}

	/**
	 * Constructs a new Dialog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dialog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dialog fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dialog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dialog getFixture() {
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
		setFixture(AdaptorinterfaceFactory.eINSTANCE.createDialog());
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

} //DialogTest
