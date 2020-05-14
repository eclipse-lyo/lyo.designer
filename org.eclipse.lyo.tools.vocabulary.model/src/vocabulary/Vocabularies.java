/**
 */
package vocabulary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabularies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.Vocabularies#getVocabularies <em>Vocabularies</em>}</li>
 *   <li>{@link vocabulary.Vocabularies#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see vocabulary.VocabularyPackage#getVocabularies()
 * @model
 * @generated
 */
public interface Vocabularies extends EObject {
    /**
     * Returns the value of the '<em><b>Vocabularies</b></em>' containment reference list.
     * The list contents are of type {@link vocabulary.Vocabulary}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vocabularies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vocabularies</em>' containment reference list.
     * @see vocabulary.VocabularyPackage#getVocabularies_Vocabularies()
     * @model containment="true" keys="label"
     * @generated
     */
    EList<Vocabulary> getVocabularies();

    /**
     * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration</em>' containment reference.
     * @see #setConfiguration(VocabularyConfiguration)
     * @see vocabulary.VocabularyPackage#getVocabularies_Configuration()
     * @model containment="true"
     * @generated
     */
    VocabularyConfiguration getConfiguration();

    /**
     * Sets the value of the '{@link vocabulary.Vocabularies#getConfiguration <em>Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Configuration</em>' containment reference.
     * @see #getConfiguration()
     * @generated
     */
    void setConfiguration(VocabularyConfiguration value);

} // Vocabularies
