/**
 */
package adaptorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Settings View Label As</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfacePackage#getUserSettingsViewLabelAs()
 * @model
 * @generated
 */
public enum UserSettingsViewLabelAs implements Enumerator {
    /**
     * The '<em><b>Shape</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHAPE_VALUE
     * @generated
     * @ordered
     */
    SHAPE(0, "shape", "shape"),

    /**
     * The '<em><b>Vocabulary</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOCABULARY_VALUE
     * @generated
     * @ordered
     */
    VOCABULARY(1, "vocabulary", "vocabulary");

    /**
     * The '<em><b>Shape</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHAPE
     * @model name="shape"
     * @generated
     * @ordered
     */
    public static final int SHAPE_VALUE = 0;

    /**
     * The '<em><b>Vocabulary</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOCABULARY
     * @model name="vocabulary"
     * @generated
     * @ordered
     */
    public static final int VOCABULARY_VALUE = 1;

    /**
     * An array of all the '<em><b>User Settings View Label As</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UserSettingsViewLabelAs[] VALUES_ARRAY =
        new UserSettingsViewLabelAs[] {
            SHAPE,
            VOCABULARY,
        };

    /**
     * A public read-only list of all the '<em><b>User Settings View Label As</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<UserSettingsViewLabelAs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>User Settings View Label As</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UserSettingsViewLabelAs get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UserSettingsViewLabelAs result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>User Settings View Label As</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UserSettingsViewLabelAs getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UserSettingsViewLabelAs result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>User Settings View Label As</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UserSettingsViewLabelAs get(int value) {
        switch (value) {
            case SHAPE_VALUE: return SHAPE;
            case VOCABULARY_VALUE: return VOCABULARY;
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
    private UserSettingsViewLabelAs(int value, String name, String literal) {
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
    
} //UserSettingsViewLabelAs
