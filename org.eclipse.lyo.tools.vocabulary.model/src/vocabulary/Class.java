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

} // Class
