/**
 */
package vocabulary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vocabulary.VocabularyFactory
 * @model kind="package"
 * @generated
 */
public interface VocabularyPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "vocabulary";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://org.eclipse.lyo/oslc4j/vocabulary";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "oscl4j_vocabulary";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VocabularyPackage eINSTANCE = vocabulary.impl.VocabularyPackageImpl.init();

    /**
     * The meta object id for the '{@link vocabulary.impl.VocabulariesImpl <em>Vocabularies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see vocabulary.impl.VocabulariesImpl
     * @see vocabulary.impl.VocabularyPackageImpl#getVocabularies()
     * @generated
     */
    int VOCABULARIES = 0;

    /**
     * The feature id for the '<em><b>Vocabularies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARIES__VOCABULARIES = 0;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARIES__CONFIGURATION = 1;

    /**
     * The number of structural features of the '<em>Vocabularies</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARIES_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Vocabularies</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARIES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link vocabulary.impl.VocabularyImpl <em>Vocabulary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see vocabulary.impl.VocabularyImpl
     * @see vocabulary.impl.VocabularyPackageImpl#getVocabulary()
     * @generated
     */
    int VOCABULARY = 1;

    /**
     * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__NAMESPACE_URI = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__LABEL = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__SOURCE = 3;

    /**
     * The feature id for the '<em><b>Preferred Namespace Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__PREFERRED_NAMESPACE_PREFIX = 4;

    /**
     * The feature id for the '<em><b>Classes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__CLASSES = 5;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__PROPERTIES = 6;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY__CONFIGURATION = 7;

    /**
     * The number of structural features of the '<em>Vocabulary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Vocabulary</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link vocabulary.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see vocabulary.impl.TermImpl
     * @see vocabulary.impl.VocabularyPackageImpl#getTerm()
     * @generated
     */
    int TERM = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERM__NAME = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERM__LABEL = 1;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERM__COMMENT = 2;

    /**
     * The feature id for the '<em><b>See Also</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERM__SEE_ALSO = 3;

    /**
     * The number of structural features of the '<em>Term</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERM_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Term</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link vocabulary.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see vocabulary.impl.ClassImpl
     * @see vocabulary.impl.VocabularyPackageImpl#getClass_()
     * @generated
     */
    int CLASS = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__NAME = TERM__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__LABEL = TERM__LABEL;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__COMMENT = TERM__COMMENT;

    /**
     * The feature id for the '<em><b>See Also</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__SEE_ALSO = TERM__SEE_ALSO;

    /**
     * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__SUB_CLASS_OF = TERM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__TYPE = TERM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link vocabulary.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see vocabulary.impl.PropertyImpl
     * @see vocabulary.impl.VocabularyPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = TERM__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__LABEL = TERM__LABEL;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__COMMENT = TERM__COMMENT;

    /**
     * The feature id for the '<em><b>See Also</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__SEE_ALSO = TERM__SEE_ALSO;

    /**
     * The feature id for the '<em><b>Sub Property Of</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__SUB_PROPERTY_OF = TERM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DOMAIN = TERM_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Range</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__RANGE = TERM_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link vocabulary.impl.GeneralConfigurationImpl <em>General Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see vocabulary.impl.GeneralConfigurationImpl
     * @see vocabulary.impl.VocabularyPackageImpl#getGeneralConfiguration()
     * @generated
     */
    int GENERAL_CONFIGURATION = 5;

    /**
     * The feature id for the '<em><b>Do Not Generate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_CONFIGURATION__DO_NOT_GENERATE = 0;

    /**
     * The feature id for the '<em><b>Files Base Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_CONFIGURATION__FILES_BASE_PATH = 1;

    /**
     * The feature id for the '<em><b>Java Base Package Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME = 2;

    /**
     * The number of structural features of the '<em>General Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_CONFIGURATION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>General Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_CONFIGURATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link vocabulary.impl.VocabularyConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see vocabulary.impl.VocabularyConfigurationImpl
     * @see vocabulary.impl.VocabularyPackageImpl#getVocabularyConfiguration()
     * @generated
     */
    int VOCABULARY_CONFIGURATION = 6;

    /**
     * The feature id for the '<em><b>General Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION = 0;

    /**
     * The number of structural features of the '<em>Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY_CONFIGURATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOCABULARY_CONFIGURATION_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link vocabulary.Vocabularies <em>Vocabularies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vocabularies</em>'.
     * @see vocabulary.Vocabularies
     * @generated
     */
    EClass getVocabularies();

    /**
     * Returns the meta object for the containment reference list '{@link vocabulary.Vocabularies#getVocabularies <em>Vocabularies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Vocabularies</em>'.
     * @see vocabulary.Vocabularies#getVocabularies()
     * @see #getVocabularies()
     * @generated
     */
    EReference getVocabularies_Vocabularies();

    /**
     * Returns the meta object for the containment reference '{@link vocabulary.Vocabularies#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Configuration</em>'.
     * @see vocabulary.Vocabularies#getConfiguration()
     * @see #getVocabularies()
     * @generated
     */
    EReference getVocabularies_Configuration();

    /**
     * Returns the meta object for class '{@link vocabulary.Vocabulary <em>Vocabulary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vocabulary</em>'.
     * @see vocabulary.Vocabulary
     * @generated
     */
    EClass getVocabulary();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Vocabulary#getNamespaceURI <em>Namespace URI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace URI</em>'.
     * @see vocabulary.Vocabulary#getNamespaceURI()
     * @see #getVocabulary()
     * @generated
     */
    EAttribute getVocabulary_NamespaceURI();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Vocabulary#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see vocabulary.Vocabulary#getLabel()
     * @see #getVocabulary()
     * @generated
     */
    EAttribute getVocabulary_Label();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Vocabulary#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see vocabulary.Vocabulary#getDescription()
     * @see #getVocabulary()
     * @generated
     */
    EAttribute getVocabulary_Description();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Vocabulary#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see vocabulary.Vocabulary#getSource()
     * @see #getVocabulary()
     * @generated
     */
    EAttribute getVocabulary_Source();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Vocabulary#getPreferredNamespacePrefix <em>Preferred Namespace Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preferred Namespace Prefix</em>'.
     * @see vocabulary.Vocabulary#getPreferredNamespacePrefix()
     * @see #getVocabulary()
     * @generated
     */
    EAttribute getVocabulary_PreferredNamespacePrefix();

    /**
     * Returns the meta object for the containment reference list '{@link vocabulary.Vocabulary#getClasses <em>Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classes</em>'.
     * @see vocabulary.Vocabulary#getClasses()
     * @see #getVocabulary()
     * @generated
     */
    EReference getVocabulary_Classes();

    /**
     * Returns the meta object for the containment reference list '{@link vocabulary.Vocabulary#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see vocabulary.Vocabulary#getProperties()
     * @see #getVocabulary()
     * @generated
     */
    EReference getVocabulary_Properties();

    /**
     * Returns the meta object for the containment reference '{@link vocabulary.Vocabulary#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Configuration</em>'.
     * @see vocabulary.Vocabulary#getConfiguration()
     * @see #getVocabulary()
     * @generated
     */
    EReference getVocabulary_Configuration();

    /**
     * Returns the meta object for class '{@link vocabulary.Term <em>Term</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Term</em>'.
     * @see vocabulary.Term
     * @generated
     */
    EClass getTerm();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Term#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see vocabulary.Term#getName()
     * @see #getTerm()
     * @generated
     */
    EAttribute getTerm_Name();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Term#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see vocabulary.Term#getLabel()
     * @see #getTerm()
     * @generated
     */
    EAttribute getTerm_Label();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.Term#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see vocabulary.Term#getComment()
     * @see #getTerm()
     * @generated
     */
    EAttribute getTerm_Comment();

    /**
     * Returns the meta object for the attribute list '{@link vocabulary.Term#getSeeAlso <em>See Also</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>See Also</em>'.
     * @see vocabulary.Term#getSeeAlso()
     * @see #getTerm()
     * @generated
     */
    EAttribute getTerm_SeeAlso();

    /**
     * Returns the meta object for class '{@link vocabulary.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class</em>'.
     * @see vocabulary.Class
     * @generated
     */
    EClass getClass_();

    /**
     * Returns the meta object for the reference list '{@link vocabulary.Class#getSubClassOf <em>Sub Class Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Class Of</em>'.
     * @see vocabulary.Class#getSubClassOf()
     * @see #getClass_()
     * @generated
     */
    EReference getClass_SubClassOf();

    /**
     * Returns the meta object for the reference '{@link vocabulary.Class#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see vocabulary.Class#getType()
     * @see #getClass_()
     * @generated
     */
    EReference getClass_Type();

    /**
     * Returns the meta object for class '{@link vocabulary.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see vocabulary.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the reference list '{@link vocabulary.Property#getSubPropertyOf <em>Sub Property Of</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Property Of</em>'.
     * @see vocabulary.Property#getSubPropertyOf()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_SubPropertyOf();

    /**
     * Returns the meta object for the reference list '{@link vocabulary.Property#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Domain</em>'.
     * @see vocabulary.Property#getDomain()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Domain();

    /**
     * Returns the meta object for the reference list '{@link vocabulary.Property#getRange <em>Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Range</em>'.
     * @see vocabulary.Property#getRange()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_Range();

    /**
     * Returns the meta object for class '{@link vocabulary.GeneralConfiguration <em>General Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Configuration</em>'.
     * @see vocabulary.GeneralConfiguration
     * @generated
     */
    EClass getGeneralConfiguration();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.GeneralConfiguration#isDoNotGenerate <em>Do Not Generate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Not Generate</em>'.
     * @see vocabulary.GeneralConfiguration#isDoNotGenerate()
     * @see #getGeneralConfiguration()
     * @generated
     */
    EAttribute getGeneralConfiguration_DoNotGenerate();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.GeneralConfiguration#getFilesBasePath <em>Files Base Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Files Base Path</em>'.
     * @see vocabulary.GeneralConfiguration#getFilesBasePath()
     * @see #getGeneralConfiguration()
     * @generated
     */
    EAttribute getGeneralConfiguration_FilesBasePath();

    /**
     * Returns the meta object for the attribute '{@link vocabulary.GeneralConfiguration#getJavaBasePackageName <em>Java Base Package Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Base Package Name</em>'.
     * @see vocabulary.GeneralConfiguration#getJavaBasePackageName()
     * @see #getGeneralConfiguration()
     * @generated
     */
    EAttribute getGeneralConfiguration_JavaBasePackageName();

    /**
     * Returns the meta object for class '{@link vocabulary.VocabularyConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Configuration</em>'.
     * @see vocabulary.VocabularyConfiguration
     * @generated
     */
    EClass getVocabularyConfiguration();

    /**
     * Returns the meta object for the containment reference '{@link vocabulary.VocabularyConfiguration#getGeneralConfiguration <em>General Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>General Configuration</em>'.
     * @see vocabulary.VocabularyConfiguration#getGeneralConfiguration()
     * @see #getVocabularyConfiguration()
     * @generated
     */
    EReference getVocabularyConfiguration_GeneralConfiguration();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VocabularyFactory getVocabularyFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link vocabulary.impl.VocabulariesImpl <em>Vocabularies</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see vocabulary.impl.VocabulariesImpl
         * @see vocabulary.impl.VocabularyPackageImpl#getVocabularies()
         * @generated
         */
        EClass VOCABULARIES = eINSTANCE.getVocabularies();

        /**
         * The meta object literal for the '<em><b>Vocabularies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VOCABULARIES__VOCABULARIES = eINSTANCE.getVocabularies_Vocabularies();

        /**
         * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VOCABULARIES__CONFIGURATION = eINSTANCE.getVocabularies_Configuration();

        /**
         * The meta object literal for the '{@link vocabulary.impl.VocabularyImpl <em>Vocabulary</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see vocabulary.impl.VocabularyImpl
         * @see vocabulary.impl.VocabularyPackageImpl#getVocabulary()
         * @generated
         */
        EClass VOCABULARY = eINSTANCE.getVocabulary();

        /**
         * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VOCABULARY__NAMESPACE_URI = eINSTANCE.getVocabulary_NamespaceURI();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VOCABULARY__LABEL = eINSTANCE.getVocabulary_Label();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VOCABULARY__DESCRIPTION = eINSTANCE.getVocabulary_Description();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VOCABULARY__SOURCE = eINSTANCE.getVocabulary_Source();

        /**
         * The meta object literal for the '<em><b>Preferred Namespace Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VOCABULARY__PREFERRED_NAMESPACE_PREFIX = eINSTANCE.getVocabulary_PreferredNamespacePrefix();

        /**
         * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VOCABULARY__CLASSES = eINSTANCE.getVocabulary_Classes();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VOCABULARY__PROPERTIES = eINSTANCE.getVocabulary_Properties();

        /**
         * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VOCABULARY__CONFIGURATION = eINSTANCE.getVocabulary_Configuration();

        /**
         * The meta object literal for the '{@link vocabulary.impl.TermImpl <em>Term</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see vocabulary.impl.TermImpl
         * @see vocabulary.impl.VocabularyPackageImpl#getTerm()
         * @generated
         */
        EClass TERM = eINSTANCE.getTerm();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TERM__NAME = eINSTANCE.getTerm_Name();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TERM__LABEL = eINSTANCE.getTerm_Label();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TERM__COMMENT = eINSTANCE.getTerm_Comment();

        /**
         * The meta object literal for the '<em><b>See Also</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TERM__SEE_ALSO = eINSTANCE.getTerm_SeeAlso();

        /**
         * The meta object literal for the '{@link vocabulary.impl.ClassImpl <em>Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see vocabulary.impl.ClassImpl
         * @see vocabulary.impl.VocabularyPackageImpl#getClass_()
         * @generated
         */
        EClass CLASS = eINSTANCE.getClass_();

        /**
         * The meta object literal for the '<em><b>Sub Class Of</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASS__SUB_CLASS_OF = eINSTANCE.getClass_SubClassOf();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASS__TYPE = eINSTANCE.getClass_Type();

        /**
         * The meta object literal for the '{@link vocabulary.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see vocabulary.impl.PropertyImpl
         * @see vocabulary.impl.VocabularyPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Sub Property Of</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__SUB_PROPERTY_OF = eINSTANCE.getProperty_SubPropertyOf();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__DOMAIN = eINSTANCE.getProperty_Domain();

        /**
         * The meta object literal for the '<em><b>Range</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__RANGE = eINSTANCE.getProperty_Range();

        /**
         * The meta object literal for the '{@link vocabulary.impl.GeneralConfigurationImpl <em>General Configuration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see vocabulary.impl.GeneralConfigurationImpl
         * @see vocabulary.impl.VocabularyPackageImpl#getGeneralConfiguration()
         * @generated
         */
        EClass GENERAL_CONFIGURATION = eINSTANCE.getGeneralConfiguration();

        /**
         * The meta object literal for the '<em><b>Do Not Generate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_CONFIGURATION__DO_NOT_GENERATE = eINSTANCE.getGeneralConfiguration_DoNotGenerate();

        /**
         * The meta object literal for the '<em><b>Files Base Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_CONFIGURATION__FILES_BASE_PATH = eINSTANCE.getGeneralConfiguration_FilesBasePath();

        /**
         * The meta object literal for the '<em><b>Java Base Package Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME = eINSTANCE.getGeneralConfiguration_JavaBasePackageName();

        /**
         * The meta object literal for the '{@link vocabulary.impl.VocabularyConfigurationImpl <em>Configuration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see vocabulary.impl.VocabularyConfigurationImpl
         * @see vocabulary.impl.VocabularyPackageImpl#getVocabularyConfiguration()
         * @generated
         */
        EClass VOCABULARY_CONFIGURATION = eINSTANCE.getVocabularyConfiguration();

        /**
         * The meta object literal for the '<em><b>General Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VOCABULARY_CONFIGURATION__GENERAL_CONFIGURATION = eINSTANCE.getVocabularyConfiguration_GeneralConfiguration();

    }

} //VocabularyPackage
