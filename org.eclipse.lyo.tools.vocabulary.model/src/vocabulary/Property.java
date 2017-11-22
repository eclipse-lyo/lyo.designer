/**
 */
package vocabulary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.Property#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link vocabulary.Property#getDomain <em>Domain</em>}</li>
 *   <li>{@link vocabulary.Property#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see vocabulary.VocabularyPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Term {
    /**
     * Returns the value of the '<em><b>Sub Property Of</b></em>' reference list.
     * The list contents are of type {@link vocabulary.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Property Of</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Property Of</em>' reference list.
     * @see vocabulary.VocabularyPackage#getProperty_SubPropertyOf()
     * @model
     * @generated
     */
    EList<Property> getSubPropertyOf();

    /**
     * Returns the value of the '<em><b>Domain</b></em>' reference list.
     * The list contents are of type {@link vocabulary.Class}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Domain</em>' reference list.
     * @see vocabulary.VocabularyPackage#getProperty_Domain()
     * @model
     * @generated
     */
    EList<vocabulary.Class> getDomain();

    /**
     * Returns the value of the '<em><b>Range</b></em>' reference list.
     * The list contents are of type {@link vocabulary.Class}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range</em>' reference list.
     * @see vocabulary.VocabularyPackage#getProperty_Range()
     * @model
     * @generated
     */
    EList<vocabulary.Class> getRange();

} // Property
