/**
 */
package vocabulary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.Class#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link vocabulary.Class#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vocabulary.VocabularyPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Term {
	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference list.
	 * The list contents are of type {@link vocabulary.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference list.
	 * @see vocabulary.VocabularyPackage#getClass_SubClassOf()
	 * @model
	 * @generated
	 */
	EList<Class> getSubClassOf();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Class)
	 * @see vocabulary.VocabularyPackage#getClass_Type()
	 * @model
	 * @generated
	 */
	Class getType();

	/**
	 * Sets the value of the '{@link vocabulary.Class#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class value);

} // Class
