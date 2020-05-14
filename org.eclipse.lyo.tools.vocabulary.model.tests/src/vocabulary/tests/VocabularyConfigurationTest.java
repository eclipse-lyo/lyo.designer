/**
 */
package vocabulary.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vocabulary.VocabularyConfiguration;
import vocabulary.VocabularyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyConfigurationTest extends TestCase {

    /**
     * The fixture for this Configuration test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VocabularyConfiguration fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(VocabularyConfigurationTest.class);
    }

    /**
     * Constructs a new Configuration test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VocabularyConfigurationTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Configuration test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(VocabularyConfiguration fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Configuration test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VocabularyConfiguration getFixture() {
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
        setFixture(VocabularyFactory.eINSTANCE.createVocabularyConfiguration());
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

} //VocabularyConfigurationTest
