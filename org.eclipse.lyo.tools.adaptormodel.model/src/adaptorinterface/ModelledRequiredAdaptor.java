/**
 */
package adaptorinterface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelled Required Adaptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adaptorinterface.ModelledRequiredAdaptor#getAdaptorInterface <em>Adaptor Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getModelledRequiredAdaptor()
 * @model
 * @generated
 */
public interface ModelledRequiredAdaptor extends RequiredAdaptor {
	/**
	 * Returns the value of the '<em><b>Adaptor Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptor Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptor Interface</em>' reference.
	 * @see #setAdaptorInterface(AdaptorInterface)
	 * @see adaptorinterface.AdaptorinterfacePackage#getModelledRequiredAdaptor_AdaptorInterface()
	 * @model required="true"
	 * @generated
	 */
	AdaptorInterface getAdaptorInterface();

	/**
	 * Sets the value of the '{@link adaptorinterface.ModelledRequiredAdaptor#getAdaptorInterface <em>Adaptor Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptor Interface</em>' reference.
	 * @see #getAdaptorInterface()
	 * @generated
	 */
	void setAdaptorInterface(AdaptorInterface value);

} // ModelledRequiredAdaptor
