/**
 */
package vocabulary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vocabulary.Vocabulary#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link vocabulary.Vocabulary#getLabel <em>Label</em>}</li>
 *   <li>{@link vocabulary.Vocabulary#getDescription <em>Description</em>}</li>
 *   <li>{@link vocabulary.Vocabulary#getSource <em>Source</em>}</li>
 *   <li>{@link vocabulary.Vocabulary#getPreferredNamespacePrefix <em>Preferred Namespace Prefix</em>}</li>
 *   <li>{@link vocabulary.Vocabulary#getClasses <em>Classes</em>}</li>
 *   <li>{@link vocabulary.Vocabulary#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see vocabulary.VocabularyPackage#getVocabulary()
 * @model
 * @generated
 */
public interface Vocabulary extends EObject {
    /**
     * Returns the value of the '<em><b>Namespace URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace URI</em>' attribute.
     * @see #setNamespaceURI(String)
     * @see vocabulary.VocabularyPackage#getVocabulary_NamespaceURI()
     * @model required="true"
     *        extendedMetaData="wildcards='' name=''"
     * @generated
     */
    String getNamespaceURI();

    /**
     * Sets the value of the '{@link vocabulary.Vocabulary#getNamespaceURI <em>Namespace URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace URI</em>' attribute.
     * @see #getNamespaceURI()
     * @generated
     */
    void setNamespaceURI(String value);

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
     * @see vocabulary.VocabularyPackage#getVocabulary_Label()
     * @model required="true"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link vocabulary.Vocabulary#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see vocabulary.VocabularyPackage#getVocabulary_Description()
     * @model required="true"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link vocabulary.Vocabulary#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The URI of the RDF source for this vocabulary.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see vocabulary.VocabularyPackage#getVocabulary_Source()
     * @model required="true"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link vocabulary.Vocabulary#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource(String value);

    /**
     * Returns the value of the '<em><b>Preferred Namespace Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preferred Namespace Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preferred Namespace Prefix</em>' attribute.
     * @see #setPreferredNamespacePrefix(String)
     * @see vocabulary.VocabularyPackage#getVocabulary_PreferredNamespacePrefix()
     * @model required="true"
     * @generated
     */
    String getPreferredNamespacePrefix();

    /**
     * Sets the value of the '{@link vocabulary.Vocabulary#getPreferredNamespacePrefix <em>Preferred Namespace Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preferred Namespace Prefix</em>' attribute.
     * @see #getPreferredNamespacePrefix()
     * @generated
     */
    void setPreferredNamespacePrefix(String value);

    /**
     * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
     * The list contents are of type {@link vocabulary.Class}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classes</em>' containment reference list.
     * @see vocabulary.VocabularyPackage#getVocabulary_Classes()
     * @model containment="true" keys="name"
     * @generated
     */
    EList<vocabulary.Class> getClasses();

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link vocabulary.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see vocabulary.VocabularyPackage#getVocabulary_Properties()
     * @model containment="true" keys="name"
     * @generated
     */
    EList<Property> getProperties();

} // Vocabulary
