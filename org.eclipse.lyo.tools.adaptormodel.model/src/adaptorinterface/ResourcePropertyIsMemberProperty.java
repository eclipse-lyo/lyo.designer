/**
 */
package adaptorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Property Is Member Property</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfacePackage#getResourcePropertyIsMemberProperty()
 * @model
 * @generated
 */
public enum ResourcePropertyIsMemberProperty implements Enumerator {
	/**
     * The '<em><b>Na</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NA_VALUE
     * @generated
     * @ordered
     */
	NA(-1, "n_a", "n_a"),

	/**
     * The '<em><b>False</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FALSE_VALUE
     * @generated
     * @ordered
     */
	FALSE(0, "false", "false"),

	/**
     * The '<em><b>True</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TRUE_VALUE
     * @generated
     * @ordered
     */
	TRUE(1, "true", "true");

	/**
     * The '<em><b>Na</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Na</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NA
     * @model name="n_a"
     * @generated
     * @ordered
     */
	public static final int NA_VALUE = -1;

	/**
     * The '<em><b>False</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>False</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FALSE
     * @model name="false"
     * @generated
     * @ordered
     */
	public static final int FALSE_VALUE = 0;

	/**
     * The '<em><b>True</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>True</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #TRUE
     * @model name="true"
     * @generated
     * @ordered
     */
	public static final int TRUE_VALUE = 1;

	/**
     * An array of all the '<em><b>Resource Property Is Member Property</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ResourcePropertyIsMemberProperty[] VALUES_ARRAY =
		new ResourcePropertyIsMemberProperty[] {
            NA,
            FALSE,
            TRUE,
        };

	/**
     * A public read-only list of all the '<em><b>Resource Property Is Member Property</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ResourcePropertyIsMemberProperty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Resource Property Is Member Property</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ResourcePropertyIsMemberProperty get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ResourcePropertyIsMemberProperty result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Resource Property Is Member Property</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ResourcePropertyIsMemberProperty getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ResourcePropertyIsMemberProperty result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Resource Property Is Member Property</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ResourcePropertyIsMemberProperty get(int value) {
        switch (value) {
            case NA_VALUE: return NA;
            case FALSE_VALUE: return FALSE;
            case TRUE_VALUE: return TRUE;
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
	private ResourcePropertyIsMemberProperty(int value, String name, String literal) {
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
	
} //ResourcePropertyIsMemberProperty
