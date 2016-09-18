/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.QueryCapability#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.QueryCapability#getLabel <em>Label</em>}</li>
 *   <li>{@link adaptorinterface.QueryCapability#getQueryBaseURI <em>Query Base URI</em>}</li>
 *   <li>{@link adaptorinterface.QueryCapability#getResourceTypes <em>Resource Types</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getQueryCapability()
 * @model
 * @generated
 */
public interface QueryCapability extends EObject {
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getQueryCapability_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link adaptorinterface.QueryCapability#getTitle <em>Title</em>}' attribute.
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getQueryCapability_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link adaptorinterface.QueryCapability#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Query Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Base URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Base URI</em>' attribute.
	 * @see #setQueryBaseURI(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getQueryCapability_QueryBaseURI()
	 * @model required="true"
	 * @generated
	 */
	String getQueryBaseURI();

	/**
	 * Sets the value of the '{@link adaptorinterface.QueryCapability#getQueryBaseURI <em>Query Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Base URI</em>' attribute.
	 * @see #getQueryBaseURI()
	 * @generated
	 */
	void setQueryBaseURI(String value);

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
	 * @see adaptorinterface.AdaptorinterfacePackage#getQueryCapability_ResourceTypes()
	 * @model
	 * @generated
	 */
	EList<Resource> getResourceTypes();

} // QueryCapability
