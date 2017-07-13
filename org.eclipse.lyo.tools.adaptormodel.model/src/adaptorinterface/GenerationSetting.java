/**
 */
package adaptorinterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.GenerationSetting#getJavaClassPackageName <em>Java Class Package Name</em>}</li>
 *   <li>{@link adaptorinterface.GenerationSetting#getJavaFilesPath <em>Java Files Path</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getGenerationSetting()
 * @model
 * @generated
 */
public interface GenerationSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Class Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class Package Name</em>' attribute.
	 * @see #setJavaClassPackageName(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getGenerationSetting_JavaClassPackageName()
	 * @model
	 * @generated
	 */
	String getJavaClassPackageName();

	/**
	 * Sets the value of the '{@link adaptorinterface.GenerationSetting#getJavaClassPackageName <em>Java Class Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class Package Name</em>' attribute.
	 * @see #getJavaClassPackageName()
	 * @generated
	 */
	void setJavaClassPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Java Files Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Files Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Files Path</em>' attribute.
	 * @see #setJavaFilesPath(String)
	 * @see adaptorinterface.AdaptorinterfacePackage#getGenerationSetting_JavaFilesPath()
	 * @model
	 * @generated
	 */
	String getJavaFilesPath();

	/**
	 * Sets the value of the '{@link adaptorinterface.GenerationSetting#getJavaFilesPath <em>Java Files Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Files Path</em>' attribute.
	 * @see #getJavaFilesPath()
	 * @generated
	 */
	void setJavaFilesPath(String value);

} // GenerationSetting
