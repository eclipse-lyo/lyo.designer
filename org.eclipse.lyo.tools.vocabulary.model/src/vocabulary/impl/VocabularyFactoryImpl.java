/**
 */
package vocabulary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vocabulary.Property;
import vocabulary.Vocabularies;
import vocabulary.Vocabulary;
import vocabulary.VocabularyFactory;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyFactoryImpl extends EFactoryImpl implements VocabularyFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VocabularyFactory init() {
        try {
            VocabularyFactory theVocabularyFactory = (VocabularyFactory)EPackage.Registry.INSTANCE.getEFactory(VocabularyPackage.eNS_URI);
            if (theVocabularyFactory != null) {
                return theVocabularyFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VocabularyFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VocabularyFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case VocabularyPackage.VOCABULARIES: return createVocabularies();
            case VocabularyPackage.VOCABULARY: return createVocabulary();
            case VocabularyPackage.CLASS: return createClass();
            case VocabularyPackage.PROPERTY: return createProperty();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vocabularies createVocabularies() {
        VocabulariesImpl vocabularies = new VocabulariesImpl();
        return vocabularies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vocabulary createVocabulary() {
        VocabularyImpl vocabulary = new VocabularyImpl();
        return vocabulary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public vocabulary.Class createClass() {
        ClassImpl class_ = new ClassImpl();
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VocabularyPackage getVocabularyPackage() {
        return (VocabularyPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VocabularyPackage getPackage() {
        return VocabularyPackage.eINSTANCE;
    }

} //VocabularyFactoryImpl
