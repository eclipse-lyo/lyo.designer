/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;
import vocabulary.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ResourceProperty#getTitle <em>Title</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getPropertyDefinition <em>Property Definition</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getOccurs <em>Occurs</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getValueType <em>Value Type</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getRdfCollectionRepresentation <em>Rdf Collection Representation</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getRange <em>Range</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getAllowedValue <em>Allowed Value</em>}</li>
 *   <li>{@link adaptorinterface.ResourceProperty#getIsMemberProperty <em>Is Member Property</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty()
 * @model
 * @generated
 */
public interface ResourceProperty extends ShapeProperty {
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Property Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Definition</em>' reference.
	 * @see #setPropertyDefinition(Property)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_PropertyDefinition()
	 * @model
	 * @generated
	 */
	Property getPropertyDefinition();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getPropertyDefinition <em>Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Definition</em>' reference.
	 * @see #getPropertyDefinition()
	 * @generated
	 */
	void setPropertyDefinition(Property value);

	/**
	 * Returns the value of the '<em><b>Occurs</b></em>' attribute.
	 * The default value is <code>"exactlyOne"</code>.
	 * The literals are from the enumeration {@link adaptorinterface.ResourcePropertyOccurs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurs</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyOccurs
	 * @see #setOccurs(ResourcePropertyOccurs)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_Occurs()
	 * @model default="exactlyOne"
	 * @generated
	 */
	ResourcePropertyOccurs getOccurs();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getOccurs <em>Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurs</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyOccurs
	 * @see #getOccurs()
	 * @generated
	 */
	void setOccurs(ResourcePropertyOccurs value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link adaptorinterface.ResourcePropertyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyValueType
	 * @see #setValueType(ResourcePropertyValueType)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_ValueType()
	 * @model
	 * @generated
	 */
	ResourcePropertyValueType getValueType();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyValueType
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ResourcePropertyValueType value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The default value is <code>"n_a"</code>.
	 * The literals are from the enumeration {@link adaptorinterface.ResourcePropertyRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyRepresentation
	 * @see #setRepresentation(ResourcePropertyRepresentation)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_Representation()
	 * @model default="n_a"
	 * @generated
	 */
	ResourcePropertyRepresentation getRepresentation();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyRepresentation
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(ResourcePropertyRepresentation value);

	/**
	 * Returns the value of the '<em><b>Rdf Collection Representation</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link adaptorinterface.ResourcePropertyRdfCollectionRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Collection Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Collection Representation</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyRdfCollectionRepresentation
	 * @see #setRdfCollectionRepresentation(ResourcePropertyRdfCollectionRepresentation)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_RdfCollectionRepresentation()
	 * @model default="none"
	 * @generated
	 */
	ResourcePropertyRdfCollectionRepresentation getRdfCollectionRepresentation();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getRdfCollectionRepresentation <em>Rdf Collection Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Collection Representation</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyRdfCollectionRepresentation
	 * @see #getRdfCollectionRepresentation()
	 * @generated
	 */
	void setRdfCollectionRepresentation(ResourcePropertyRdfCollectionRepresentation value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference list.
	 * The list contents are of type {@link adaptorinterface.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_Range()
	 * @model
	 * @generated
	 */
	EList<Resource> getRange();

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
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Value</em>' attribute list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_AllowedValue()
	 * @model
	 * @generated
	 */
	EList<String> getAllowedValue();

	/**
	 * Returns the value of the '<em><b>Is Member Property</b></em>' attribute.
	 * The literals are from the enumeration {@link adaptorinterface.ResourcePropertyIsMemberProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Member Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Member Property</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyIsMemberProperty
	 * @see #setIsMemberProperty(ResourcePropertyIsMemberProperty)
	 * @see adaptorinterface.AdaptorinterfacePackage#getResourceProperty_IsMemberProperty()
	 * @model
	 * @generated
	 */
	ResourcePropertyIsMemberProperty getIsMemberProperty();

	/**
	 * Sets the value of the '{@link adaptorinterface.ResourceProperty#getIsMemberProperty <em>Is Member Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Member Property</em>' attribute.
	 * @see adaptorinterface.ResourcePropertyIsMemberProperty
	 * @see #getIsMemberProperty()
	 * @generated
	 */
	void setIsMemberProperty(ResourcePropertyIsMemberProperty value);

} // ResourceProperty
