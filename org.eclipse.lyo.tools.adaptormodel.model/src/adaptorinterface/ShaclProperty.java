/**
 */
package adaptorinterface;

import org.eclipse.emf.common.util.EList;

import vocabulary.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shacl Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adaptorinterface.ShaclProperty#getName <em>Name</em>}</li>
 *   <li>{@link adaptorinterface.ShaclProperty#getPath <em>Path</em>}</li>
 *   <li>{@link adaptorinterface.ShaclProperty#getMinCount <em>Min Count</em>}</li>
 *   <li>{@link adaptorinterface.ShaclProperty#getMaxCount <em>Max Count</em>}</li>
 *   <li>{@link adaptorinterface.ShaclProperty#getDataType <em>Data Type</em>}</li>
 *   <li>{@link adaptorinterface.ShaclProperty#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see adaptorinterface.AdaptorinterfacePackage#getShaclProperty()
 * @model
 * @generated
 */
public interface ShaclProperty extends ShapeProperty {
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
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference.
	 * @see #setPath(Property)
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclProperty_Path()
	 * @model
	 * @generated
	 */
	Property getPath();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclProperty#getPath <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Property value);

	/**
	 * Returns the value of the '<em><b>Min Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Count</em>' attribute.
	 * @see #setMinCount(int)
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclProperty_MinCount()
	 * @model
	 * @generated
	 */
	int getMinCount();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclProperty#getMinCount <em>Min Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Count</em>' attribute.
	 * @see #getMinCount()
	 * @generated
	 */
	void setMinCount(int value);

	/**
	 * Returns the value of the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Count</em>' attribute.
	 * @see #setMaxCount(int)
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclProperty_MaxCount()
	 * @model
	 * @generated
	 */
	int getMaxCount();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclProperty#getMaxCount <em>Max Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Count</em>' attribute.
	 * @see #getMaxCount()
	 * @generated
	 */
	void setMaxCount(int value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link adaptorinterface.ShaclPropertyDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see adaptorinterface.ShaclPropertyDataType
	 * @see #setDataType(ShaclPropertyDataType)
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclProperty_DataType()
	 * @model
	 * @generated
	 */
	ShaclPropertyDataType getDataType();

	/**
	 * Sets the value of the '{@link adaptorinterface.ShaclProperty#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see adaptorinterface.ShaclPropertyDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ShaclPropertyDataType value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference list.
	 * The list contents are of type {@link adaptorinterface.ShaclShape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference list.
	 * @see adaptorinterface.AdaptorinterfacePackage#getShaclProperty_Class()
	 * @model
	 * @generated
	 */
	EList<ShaclShape> getClass_();

} // ShaclProperty
