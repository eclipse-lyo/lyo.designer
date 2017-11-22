/**
 */
package vocabulary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.Term#getName <em>Name</em>}</li>
 *   <li>{@link vocabulary.Term#getLabel <em>Label</em>}</li>
 *   <li>{@link vocabulary.Term#getComment <em>Comment</em>}</li>
 *   <li>{@link vocabulary.Term#getSeeAlso <em>See Also</em>}</li>
 * </ul>
 *
 * @see vocabulary.VocabularyPackage#getTerm()
 * @model abstract="true"
 * @generated
 */
public interface Term extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see vocabulary.VocabularyPackage#getTerm_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link vocabulary.Term#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see vocabulary.VocabularyPackage#getTerm_Label()
     * @model required="true"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link vocabulary.Term#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comment</em>' attribute.
     * @see #setComment(String)
     * @see vocabulary.VocabularyPackage#getTerm_Comment()
     * @model required="true"
     * @generated
     */
    String getComment();

    /**
     * Sets the value of the '{@link vocabulary.Term#getComment <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comment</em>' attribute.
     * @see #getComment()
     * @generated
     */
    void setComment(String value);

    /**
     * Returns the value of the '<em><b>See Also</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>See Also</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>See Also</em>' attribute.
     * @see #setSeeAlso(String)
     * @see vocabulary.VocabularyPackage#getTerm_SeeAlso()
     * @model
     * @generated
     */
    String getSeeAlso();

    /**
     * Sets the value of the '{@link vocabulary.Term#getSeeAlso <em>See Also</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>See Also</em>' attribute.
     * @see #getSeeAlso()
     * @generated
     */
    void setSeeAlso(String value);

} // Term
