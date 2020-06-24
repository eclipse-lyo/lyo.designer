/**
 */
package adaptorinterface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSLC Service Persistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.OSLCServicePersistence#isCreationFactory <em>Creation Factory</em>}</li>
 *   <li>{@link adaptorinterface.OSLCServicePersistence#isQueryCapability <em>Query Capability</em>}</li>
 *   <li>{@link adaptorinterface.OSLCServicePersistence#isSelectionDialog <em>Selection Dialog</em>}</li>
 *   <li>{@link adaptorinterface.OSLCServicePersistence#isCreationDialog <em>Creation Dialog</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getOSLCServicePersistence()
 * @model
 * @generated
 */
public interface OSLCServicePersistence extends ServicePersistence {
    /**
     * Returns the value of the '<em><b>Creation Factory</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Creation Factory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Creation Factory</em>' attribute.
     * @see #setCreationFactory(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getOSLCServicePersistence_CreationFactory()
     * @model default="false" required="true"
     * @generated
     */
    boolean isCreationFactory();

    /**
     * Sets the value of the '{@link adaptorinterface.OSLCServicePersistence#isCreationFactory <em>Creation Factory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Creation Factory</em>' attribute.
     * @see #isCreationFactory()
     * @generated
     */
    void setCreationFactory(boolean value);

    /**
     * Returns the value of the '<em><b>Query Capability</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Query Capability</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Query Capability</em>' attribute.
     * @see #setQueryCapability(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getOSLCServicePersistence_QueryCapability()
     * @model default="true" required="true"
     * @generated
     */
    boolean isQueryCapability();

    /**
     * Sets the value of the '{@link adaptorinterface.OSLCServicePersistence#isQueryCapability <em>Query Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Query Capability</em>' attribute.
     * @see #isQueryCapability()
     * @generated
     */
    void setQueryCapability(boolean value);

    /**
     * Returns the value of the '<em><b>Selection Dialog</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selection Dialog</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selection Dialog</em>' attribute.
     * @see #setSelectionDialog(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getOSLCServicePersistence_SelectionDialog()
     * @model default="true" required="true"
     * @generated
     */
    boolean isSelectionDialog();

    /**
     * Sets the value of the '{@link adaptorinterface.OSLCServicePersistence#isSelectionDialog <em>Selection Dialog</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selection Dialog</em>' attribute.
     * @see #isSelectionDialog()
     * @generated
     */
    void setSelectionDialog(boolean value);

    /**
     * Returns the value of the '<em><b>Creation Dialog</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Creation Dialog</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Creation Dialog</em>' attribute.
     * @see #setCreationDialog(boolean)
     * @see adaptorinterface.AdaptorinterfacePackage#getOSLCServicePersistence_CreationDialog()
     * @model default="false" required="true"
     * @generated
     */
    boolean isCreationDialog();

    /**
     * Sets the value of the '{@link adaptorinterface.OSLCServicePersistence#isCreationDialog <em>Creation Dialog</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Creation Dialog</em>' attribute.
     * @see #isCreationDialog()
     * @generated
     */
    void setCreationDialog(boolean value);

} // OSLCServicePersistence
