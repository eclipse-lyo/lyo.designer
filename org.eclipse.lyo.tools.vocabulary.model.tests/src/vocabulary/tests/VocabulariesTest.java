/**
 */
package vocabulary.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vocabulary.Vocabularies;
import vocabulary.VocabularyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vocabularies</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabulariesTest extends TestCase {

	/**
	 * The fixture for this Vocabularies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vocabularies fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VocabulariesTest.class);
	}

	/**
	 * Constructs a new Vocabularies test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabulariesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vocabularies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vocabularies fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vocabularies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vocabularies getFixture() {
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
		setFixture(VocabularyFactory.eINSTANCE.createVocabularies());
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

} //VocabulariesTest
