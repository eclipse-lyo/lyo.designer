/**
 */
package vocabulary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.GeneralConfiguration#isDoNotGenerate <em>Do Not Generate</em>}</li>
 *   <li>{@link vocabulary.GeneralConfiguration#getFilesBasePath <em>Files Base Path</em>}</li>
 *   <li>{@link vocabulary.GeneralConfiguration#getJavaBasePackageName <em>Java Base Package Name</em>}</li>
 * </ul>
 *
 * @see vocabulary.VocabularyPackage#getGeneralConfiguration()
 * @model
 * @generated
 */
public interface GeneralConfiguration extends EObject {
    /**
     * Returns the value of the '<em><b>Do Not Generate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Do Not Generate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Do Not Generate</em>' attribute.
     * @see #setDoNotGenerate(boolean)
     * @see vocabulary.VocabularyPackage#getGeneralConfiguration_DoNotGenerate()
     * @model
     * @generated
     */
    boolean isDoNotGenerate();

    /**
     * Sets the value of the '{@link vocabulary.GeneralConfiguration#isDoNotGenerate <em>Do Not Generate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Not Generate</em>' attribute.
     * @see #isDoNotGenerate()
     * @generated
     */
    void setDoNotGenerate(boolean value);

    /**
     * Returns the value of the '<em><b>Files Base Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Files Base Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Files Base Path</em>' attribute.
     * @see #setFilesBasePath(String)
     * @see vocabulary.VocabularyPackage#getGeneralConfiguration_FilesBasePath()
     * @model
     * @generated
     */
    String getFilesBasePath();

    /**
     * Sets the value of the '{@link vocabulary.GeneralConfiguration#getFilesBasePath <em>Files Base Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Files Base Path</em>' attribute.
     * @see #getFilesBasePath()
     * @generated
     */
    void setFilesBasePath(String value);

    /**
     * Returns the value of the '<em><b>Java Base Package Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Java Base Package Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Java Base Package Name</em>' attribute.
     * @see #setJavaBasePackageName(String)
     * @see vocabulary.VocabularyPackage#getGeneralConfiguration_JavaBasePackageName()
     * @model
     * @generated
     */
    String getJavaBasePackageName();

    /**
     * Sets the value of the '{@link vocabulary.GeneralConfiguration#getJavaBasePackageName <em>Java Base Package Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Java Base Package Name</em>' attribute.
     * @see #getJavaBasePackageName()
     * @generated
     */
    void setJavaBasePackageName(String value);

} // GeneralConfiguration
