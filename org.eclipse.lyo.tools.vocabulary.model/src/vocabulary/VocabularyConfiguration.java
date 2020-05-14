/**
 */
package vocabulary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.VocabularyConfiguration#getGeneralConfiguration <em>General Configuration</em>}</li>
 * </ul>
 *
 * @see vocabulary.VocabularyPackage#getVocabularyConfiguration()
 * @model
 * @generated
 */
public interface VocabularyConfiguration extends EObject {
    /**
     * Returns the value of the '<em><b>General Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Configuration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General Configuration</em>' containment reference.
     * @see #setGeneralConfiguration(GeneralConfiguration)
     * @see vocabulary.VocabularyPackage#getVocabularyConfiguration_GeneralConfiguration()
     * @model containment="true" required="true"
     * @generated
     */
    GeneralConfiguration getGeneralConfiguration();

    /**
     * Sets the value of the '{@link vocabulary.VocabularyConfiguration#getGeneralConfiguration <em>General Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General Configuration</em>' containment reference.
     * @see #getGeneralConfiguration()
     * @generated
     */
    void setGeneralConfiguration(GeneralConfiguration value);

} // VocabularyConfiguration
