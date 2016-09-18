/**
 */
package adaptorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Property Occurs</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfacePackage#getResourcePropertyOccurs()
 * @model
 * @generated
 */
public enum ResourcePropertyOccurs implements Enumerator {
	/**
	 * The '<em><b>Exactly One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_ONE(0, "exactlyOne", "exactlyOne"),

	/**
	 * The '<em><b>Zero Or One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_OR_ONE(1, "zeroOrOne", "zeroOrOne"),

	/**
	 * The '<em><b>Zero Or Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_OR_MANY(2, "zeroOrMany", "zeroOrMany"),

	/**
	 * The '<em><b>One Or Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_OR_MANY(3, "oneOrMany", "oneOrMany");

	/**
	 * The '<em><b>Exactly One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exactly One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONE
	 * @model name="exactlyOne"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_ONE_VALUE = 0;

	/**
	 * The '<em><b>Zero Or One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero Or One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE
	 * @model name="zeroOrOne"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_OR_ONE_VALUE = 1;

	/**
	 * The '<em><b>Zero Or Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero Or Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_MANY
	 * @model name="zeroOrMany"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_OR_MANY_VALUE = 2;

	/**
	 * The '<em><b>One Or Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Or Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MANY
	 * @model name="oneOrMany"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_OR_MANY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Resource Property Occurs</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourcePropertyOccurs[] VALUES_ARRAY =
		new ResourcePropertyOccurs[] {
			EXACTLY_ONE,
			ZERO_OR_ONE,
			ZERO_OR_MANY,
			ONE_OR_MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Property Occurs</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourcePropertyOccurs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Property Occurs</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourcePropertyOccurs get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourcePropertyOccurs result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Property Occurs</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourcePropertyOccurs getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourcePropertyOccurs result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Property Occurs</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourcePropertyOccurs get(int value) {
		switch (value) {
			case EXACTLY_ONE_VALUE: return EXACTLY_ONE;
			case ZERO_OR_ONE_VALUE: return ZERO_OR_ONE;
			case ZERO_OR_MANY_VALUE: return ZERO_OR_MANY;
			case ONE_OR_MANY_VALUE: return ONE_OR_MANY;
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
	private ResourcePropertyOccurs(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ResourcePropertyOccurs
