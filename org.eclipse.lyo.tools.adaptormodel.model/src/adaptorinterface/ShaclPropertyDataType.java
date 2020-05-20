/**
 */
package adaptorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shacl Property Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfacePackage#getShaclPropertyDataType()
 * @model
 * @generated
 */
public enum ShaclPropertyDataType implements Enumerator {
	/**
     * The '<em><b>Boolean</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BOOLEAN_VALUE
     * @generated
     * @ordered
     */
	BOOLEAN(0, "Boolean", "Boolean"),

	/**
     * The '<em><b>String</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STRING_VALUE
     * @generated
     * @ordered
     */
	STRING(1, "String", "String"),

	/**
     * The '<em><b>Date Time</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DATE_TIME_VALUE
     * @generated
     * @ordered
     */
	DATE_TIME(2, "DateTime", "DateTime"),

	/**
     * The '<em><b>XML Literal</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #XML_LITERAL_VALUE
     * @generated
     * @ordered
     */
	XML_LITERAL(3, "XMLLiteral", "XMLLiteral"),

	/**
     * The '<em><b>Resource</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #RESOURCE_VALUE
     * @generated
     * @ordered
     */
	RESOURCE(4, "Resource", "Resource"),

	/**
     * The '<em><b>URI</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #URI_VALUE
     * @generated
     * @ordered
     */
	URI(6, "URI", "URI"),

	/**
     * The '<em><b>Double</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DOUBLE_VALUE
     * @generated
     * @ordered
     */
	DOUBLE(7, "Double", "Double"),

	/**
     * The '<em><b>Float</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FLOAT_VALUE
     * @generated
     * @ordered
     */
	FLOAT(8, "Float", "Float"),

	/**
     * The '<em><b>Integer</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #INTEGER_VALUE
     * @generated
     * @ordered
     */
	INTEGER(9, "Integer", "Integer");

	/**
     * The '<em><b>Boolean</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #BOOLEAN
     * @model name="Boolean"
     * @generated
     * @ordered
     */
	public static final int BOOLEAN_VALUE = 0;

	/**
     * The '<em><b>String</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #STRING
     * @model name="String"
     * @generated
     * @ordered
     */
	public static final int STRING_VALUE = 1;

	/**
     * The '<em><b>Date Time</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DATE_TIME
     * @model name="DateTime"
     * @generated
     * @ordered
     */
	public static final int DATE_TIME_VALUE = 2;

	/**
     * The '<em><b>XML Literal</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #XML_LITERAL
     * @model name="XMLLiteral"
     * @generated
     * @ordered
     */
	public static final int XML_LITERAL_VALUE = 3;

	/**
     * The '<em><b>Resource</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #RESOURCE
     * @model name="Resource"
     * @generated
     * @ordered
     */
	public static final int RESOURCE_VALUE = 4;

	/**
     * The '<em><b>URI</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #URI
     * @model
     * @generated
     * @ordered
     */
	public static final int URI_VALUE = 6;

	/**
     * The '<em><b>Double</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DOUBLE
     * @model name="Double"
     * @generated
     * @ordered
     */
	public static final int DOUBLE_VALUE = 7;

	/**
     * The '<em><b>Float</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FLOAT
     * @model name="Float"
     * @generated
     * @ordered
     */
	public static final int FLOAT_VALUE = 8;

	/**
     * The '<em><b>Integer</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #INTEGER
     * @model name="Integer"
     * @generated
     * @ordered
     */
	public static final int INTEGER_VALUE = 9;

	/**
     * An array of all the '<em><b>Shacl Property Data Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ShaclPropertyDataType[] VALUES_ARRAY =
		new ShaclPropertyDataType[] {
            BOOLEAN,
            STRING,
            DATE_TIME,
            XML_LITERAL,
            RESOURCE,
            URI,
            DOUBLE,
            FLOAT,
            INTEGER,
        };

	/**
     * A public read-only list of all the '<em><b>Shacl Property Data Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ShaclPropertyDataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Shacl Property Data Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ShaclPropertyDataType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ShaclPropertyDataType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Shacl Property Data Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ShaclPropertyDataType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ShaclPropertyDataType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Shacl Property Data Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ShaclPropertyDataType get(int value) {
        switch (value) {
            case BOOLEAN_VALUE: return BOOLEAN;
            case STRING_VALUE: return STRING;
            case DATE_TIME_VALUE: return DATE_TIME;
            case XML_LITERAL_VALUE: return XML_LITERAL;
            case RESOURCE_VALUE: return RESOURCE;
            case URI_VALUE: return URI;
            case DOUBLE_VALUE: return DOUBLE;
            case FLOAT_VALUE: return FLOAT;
            case INTEGER_VALUE: return INTEGER;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private ShaclPropertyDataType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }

} //ShaclPropertyDataType
