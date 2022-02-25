/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.Resource#getId <em>Id</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getDescribes <em>Describes</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getExtends <em>Extends</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getResourceProperties <em>Resource Properties</em>}</li>
 *   <li>{@link adaptorinterface.Resource#getAdditionalConstraints <em>Additional Constraints</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Shape {
	/**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_Id()
     * @model id="true" required="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link adaptorinterface.Resource#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link adaptorinterface.Resource#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_Title()
     * @model
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link adaptorinterface.Resource#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link adaptorinterface.Resource#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Extends</b></em>' reference list.
     * The list contents are of type {@link adaptorinterface.Resource}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Extends</em>' reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_Extends()
     * @model
     * @generated
     */
	EList<Resource> getExtends();

	/**
     * Returns the value of the '<em><b>Resource Properties</b></em>' reference list.
     * The list contents are of type {@link adaptorinterface.ResourceProperty}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Properties</em>' reference list.
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_ResourceProperties()
     * @model
     * @generated
     */
	EList<ResourceProperty> getResourceProperties();

	/**
     * Returns the value of the '<em><b>Additional Constraints</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additional Constraints</em>' attribute list.
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_AdditionalConstraints()
     * @model
     * @generated
     */
    EList<String> getAdditionalConstraints();

    /**
     * Returns the value of the '<em><b>Describes</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Describes</em>' reference.
     * @see #setDescribes(vocabulary.Class)
     * @see adaptorinterface.AdaptorinterfacePackage#getResource_Describes()
     * @model
     * @generated
     */
	vocabulary.Class getDescribes();

	/**
     * Sets the value of the '{@link adaptorinterface.Resource#getDescribes <em>Describes</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Describes</em>' reference.
     * @see #getDescribes()
     * @generated
     */
	void setDescribes(vocabulary.Class value);

} // Resource
