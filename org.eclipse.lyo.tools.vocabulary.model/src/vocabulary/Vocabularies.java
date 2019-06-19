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

} // Vocabularies
