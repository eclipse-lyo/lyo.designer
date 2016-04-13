/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptorinterface.CreationFactory#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.CreationFactory#getLabel <em>Label</em>}</li>
 *   <li>{@link adaptorinterface.CreationFactory#getCreationURI <em>Creation URI</em>}</li>
 *   <li>{@link adaptorinterface.CreationFactory#getResourceTypes <em>Resource Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getCreationFactory()
 * @model
 * @generated
 */
public interface CreationFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getCreationFactory_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link adaptorinterface.CreationFactory#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see adaptorinterface.AdaptorinterfacePackage#getCreationFactory_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link adaptorinterface.CreationFactory#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Creation URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation URI</em>' attribute.
	 * @see #setCreationURI(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getCreationFactory_CreationURI()
	 * @model required="true"
	 * @generated
	 */
	String getCreationURI();

	/**
	 * Sets the value of the '{@link adaptorinterface.CreationFactory#getCreationURI <em>Creation URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation URI</em>' attribute.
	 * @see #getCreationURI()
	 * @generated
	 */
	void setCreationURI(String value);

	/**
	 * Returns the value of the '<em><b>Resource Types</b></em>' reference list.
	 * The list contents are of type {@link adaptorinterface.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Types</em>' reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getCreationFactory_ResourceTypes()
	 * @model
	 * @generated
	 */
	EList<Resource> getResourceTypes();

} // CreationFactory
