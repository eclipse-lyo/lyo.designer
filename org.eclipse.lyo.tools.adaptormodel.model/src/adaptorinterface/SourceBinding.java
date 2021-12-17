/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.SourceBinding#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getSourceBinding()
 * @model
 * @generated
 */
public interface SourceBinding extends EObject {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Source)
     * @see adaptorinterface.AdaptorinterfacePackage#getSourceBinding_Source()
     * @model required="true"
     * @generated
     */
    Source getSource();

    /**
     * Sets the value of the '{@link adaptorinterface.SourceBinding#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Source value);

} // SourceBinding
