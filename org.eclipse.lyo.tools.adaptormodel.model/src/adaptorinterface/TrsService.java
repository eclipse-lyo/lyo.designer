/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trs Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.TrsService#getBasePageLimit <em>Base Page Limit</em>}</li>
 *   <li>{@link adaptorinterface.TrsService#getChangeLogPageLimit <em>Change Log Page Limit</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getTrsService()
 * @model abstract="true"
 * @generated
 */
public interface TrsService extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Page Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Page Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Page Limit</em>' attribute.
	 * @see #setBasePageLimit(int)
	 * @see adaptorinterface.AdaptorinterfacePackage#getTrsService_BasePageLimit()
	 * @model required="true"
	 * @generated
	 */
	int getBasePageLimit();

	/**
	 * Sets the value of the '{@link adaptorinterface.TrsService#getBasePageLimit <em>Base Page Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Page Limit</em>' attribute.
	 * @see #getBasePageLimit()
	 * @generated
	 */
	void setBasePageLimit(int value);

	/**
	 * Returns the value of the '<em><b>Change Log Page Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Log Page Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log Page Limit</em>' attribute.
	 * @see #setChangeLogPageLimit(int)
	 * @see adaptorinterface.AdaptorinterfacePackage#getTrsService_ChangeLogPageLimit()
	 * @model required="true"
	 * @generated
	 */
	int getChangeLogPageLimit();

	/**
	 * Sets the value of the '{@link adaptorinterface.TrsService#getChangeLogPageLimit <em>Change Log Page Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log Page Limit</em>' attribute.
	 * @see #getChangeLogPageLimit()
	 * @generated
	 */
	void setChangeLogPageLimit(int value);

} // TrsService
