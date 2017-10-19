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

} // Property
