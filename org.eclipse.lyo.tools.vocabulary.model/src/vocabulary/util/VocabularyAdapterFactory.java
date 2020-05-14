/**
 */
package vocabulary.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vocabulary.GeneralConfiguration;
import vocabulary.Property;
import vocabulary.Term;
import vocabulary.Vocabularies;
import vocabulary.Vocabulary;
import vocabulary.VocabularyConfiguration;
import vocabulary.VocabularyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vocabulary.VocabularyPackage
 * @generated
 */
public class VocabularyAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VocabularyPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VocabularyAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = VocabularyPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VocabularySwitch<Adapter> modelSwitch =
        new VocabularySwitch<Adapter>() {
            @Override
            public Adapter caseVocabularies(Vocabularies object) {
                return createVocabulariesAdapter();
            }
            @Override
            public Adapter caseVocabulary(Vocabulary object) {
                return createVocabularyAdapter();
            }
            @Override
            public Adapter caseTerm(Term object) {
                return createTermAdapter();
            }
            @Override
            public Adapter caseClass(vocabulary.Class object) {
                return createClassAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseGeneralConfiguration(GeneralConfiguration object) {
                return createGeneralConfigurationAdapter();
            }
            @Override
            public Adapter caseVocabularyConfiguration(VocabularyConfiguration object) {
                return createVocabularyConfigurationAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link vocabulary.Vocabularies <em>Vocabularies</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see vocabulary.Vocabularies
     * @generated
     */
    public Adapter createVocabulariesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link vocabulary.Vocabulary <em>Vocabulary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see vocabulary.Vocabulary
     * @generated
     */
    public Adapter createVocabularyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link vocabulary.Term <em>Term</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see vocabulary.Term
     * @generated
     */
    public Adapter createTermAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link vocabulary.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see vocabulary.Class
     * @generated
     */
    public Adapter createClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link vocabulary.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see vocabulary.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link vocabulary.GeneralConfiguration <em>General Configuration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see vocabulary.GeneralConfiguration
     * @generated
     */
    public Adapter createGeneralConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link vocabulary.VocabularyConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see vocabulary.VocabularyConfiguration
     * @generated
     */
    public Adapter createVocabularyConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //VocabularyAdapterFactory
