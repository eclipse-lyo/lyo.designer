/**
 */
package vocabulary.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vocabulary.Vocabulary;
import vocabulary.VocabularyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyTest extends TestCase {

	/**
	 * The fixture for this Vocabulary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vocabulary fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VocabularyTest.class);
	}

	/**
	 * Constructs a new Vocabulary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vocabulary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vocabulary fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vocabulary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vocabulary getFixture() {
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
		setFixture(VocabularyFactory.eINSTANCE.createVocabulary());
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

} //VocabularyTest
