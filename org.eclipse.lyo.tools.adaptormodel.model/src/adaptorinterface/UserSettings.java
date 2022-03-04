/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.UserSettings#getViewPrefixes <em>View Prefixes</em>}</li>
 *   <li>{@link adaptorinterface.UserSettings#getViewLabelAs <em>View Label As</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getUserSettings()
 * @model
 * @generated
 */
public interface UserSettings extends EObject {
    /**
     * Returns the value of the '<em><b>View Prefixes</b></em>' attribute.
     * The default value is <code>"whenNecessary"</code>.
     * The literals are from the enumeration {@link adaptorinterface.UserSettingsViewPrefixes}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Prefixes</em>' attribute.
     * @see adaptorinterface.UserSettingsViewPrefixes
     * @see #setViewPrefixes(UserSettingsViewPrefixes)
     * @see adaptorinterface.AdaptorinterfacePackage#getUserSettings_ViewPrefixes()
     * @model default="whenNecessary"
     * @generated
     */
    UserSettingsViewPrefixes getViewPrefixes();

    /**
     * Sets the value of the '{@link adaptorinterface.UserSettings#getViewPrefixes <em>View Prefixes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>View Prefixes</em>' attribute.
     * @see adaptorinterface.UserSettingsViewPrefixes
     * @see #getViewPrefixes()
     * @generated
     */
    void setViewPrefixes(UserSettingsViewPrefixes value);

    /**
     * Returns the value of the '<em><b>View Label As</b></em>' attribute.
     * The default value is <code>"vocabulary"</code>.
     * The literals are from the enumeration {@link adaptorinterface.UserSettingsViewLabelAs}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Label As</em>' attribute.
     * @see adaptorinterface.UserSettingsViewLabelAs
     * @see #setViewLabelAs(UserSettingsViewLabelAs)
     * @see adaptorinterface.AdaptorinterfacePackage#getUserSettings_ViewLabelAs()
     * @model default="vocabulary"
     * @generated
     */
    UserSettingsViewLabelAs getViewLabelAs();

    /**
     * Sets the value of the '{@link adaptorinterface.UserSettings#getViewLabelAs <em>View Label As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>View Label As</em>' attribute.
     * @see adaptorinterface.UserSettingsViewLabelAs
     * @see #getViewLabelAs()
     * @generated
     */
    void setViewLabelAs(UserSettingsViewLabelAs value);

} // UserSettings
