/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.Dialog#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.Dialog#getLabel <em>Label</em>}</li>
 *   <li>{@link adaptorinterface.Dialog#getDialogURI <em>Dialog URI</em>}</li>
 *   <li>{@link adaptorinterface.Dialog#getHintWidth <em>Hint Width</em>}</li>
 *   <li>{@link adaptorinterface.Dialog#getHintHeight <em>Hint Height</em>}</li>
 *   <li>{@link adaptorinterface.Dialog#getResourceTypes <em>Resource Types</em>}</li>
 *   <li>{@link adaptorinterface.Dialog#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getDialog()
 * @model
 * @generated
 */
public interface Dialog extends EObject {
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getDialog_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link adaptorinterface.Dialog#getTitle <em>Title</em>}' attribute.
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getDialog_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link adaptorinterface.Dialog#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Dialog URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialog URI</em>' attribute.
	 * @see #setDialogURI(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getDialog_DialogURI()
	 * @model required="true"
	 * @generated
	 */
	String getDialogURI();

	/**
	 * Sets the value of the '{@link adaptorinterface.Dialog#getDialogURI <em>Dialog URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog URI</em>' attribute.
	 * @see #getDialogURI()
	 * @generated
	 */
	void setDialogURI(String value);

	/**
	 * Returns the value of the '<em><b>Hint Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint Width</em>' attribute.
	 * @see #setHintWidth(short)
	 * @see adaptorinterface.AdaptorinterfacePackage#getDialog_HintWidth()
	 * @model
	 * @generated
	 */
	short getHintWidth();

	/**
	 * Sets the value of the '{@link adaptorinterface.Dialog#getHintWidth <em>Hint Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint Width</em>' attribute.
	 * @see #getHintWidth()
	 * @generated
	 */
	void setHintWidth(short value);

	/**
	 * Returns the value of the '<em><b>Hint Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint Height</em>' attribute.
	 * @see #setHintHeight(short)
	 * @see adaptorinterface.AdaptorinterfacePackage#getDialog_HintHeight()
	 * @model
	 * @generated
	 */
	short getHintHeight();

	/**
	 * Sets the value of the '{@link adaptorinterface.Dialog#getHintHeight <em>Hint Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint Height</em>' attribute.
	 * @see #getHintHeight()
	 * @generated
	 */
	void setHintHeight(short value);

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
	 * @see adaptorinterface.AdaptorinterfacePackage#getDialog_ResourceTypes()
	 * @model
	 * @generated
	 */
	EList<Resource> getResourceTypes();

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' attribute list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getDialog_Usages()
	 * @model
	 * @generated
	 */
	EList<String> getUsages();

} // Dialog
