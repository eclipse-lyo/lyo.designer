/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shacl Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ShaclShape#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.ShaclShape#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link adaptorinterface.ShaclShape#isClosed <em>Closed</em>}</li>
 *   <li>{@link adaptorinterface.ShaclShape#getShaclProperties <em>Shacl Properties</em>}</li>
 *   <li>{@link adaptorinterface.ShaclShape#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getShaclShape()
 * @model
 * @generated
 */
public interface ShaclShape extends Shape {
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclShape_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclShape#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' reference.
	 * @see #setTargetClass(vocabulary.Class)
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclShape_TargetClass()
	 * @model
	 * @generated
	 */
	vocabulary.Class getTargetClass();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclShape#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(vocabulary.Class value);

	/**
	 * Returns the value of the '<em><b>Closed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' attribute.
	 * @see #setClosed(boolean)
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclShape_Closed()
	 * @model default="false"
	 * @generated
	 */
	boolean isClosed();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclShape#isClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #isClosed()
	 * @generated
	 */
	void setClosed(boolean value);

	/**
	 * Returns the value of the '<em><b>Shacl Properties</b></em>' reference list.
	 * The list contents are of type {@link adaptorinterface.ShaclProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shacl Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shacl Properties</em>' reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclShape_ShaclProperties()
	 * @model
	 * @generated
	 */
	EList<ShaclProperty> getShaclProperties();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link adaptorinterface.ShaclShape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclShape_Extends()
	 * @model
	 * @generated
	 */
	EList<ShaclShape> getExtends();

} // ShaclShape
