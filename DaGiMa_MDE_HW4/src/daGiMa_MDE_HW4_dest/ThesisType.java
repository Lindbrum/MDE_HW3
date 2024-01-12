/**
 */
package daGiMa_MDE_HW4_dest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Thesis Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getThesisType()
 * @model
 * @generated
 */
public enum ThesisType implements Enumerator {
	/**
	 * The '<em><b>COMPILATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPILATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPILATION(0, "COMPILATION", "COMPILATION"),

	/**
	 * The '<em><b>EXPERIMENTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERIMENTAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXPERIMENTAL(1, "EXPERIMENTAL", "EXPERIMENTAL"),

	/**
	 * The '<em><b>PUBLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLICATION(2, "PUBLICATION", "PUBLICATION");

	/**
	 * The '<em><b>COMPILATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPILATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPILATION_VALUE = 0;

	/**
	 * The '<em><b>EXPERIMENTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERIMENTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPERIMENTAL_VALUE = 1;

	/**
	 * The '<em><b>PUBLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUBLICATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Thesis Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ThesisType[] VALUES_ARRAY =
		new ThesisType[] {
			COMPILATION,
			EXPERIMENTAL,
			PUBLICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Thesis Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ThesisType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Thesis Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThesisType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThesisType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thesis Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThesisType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThesisType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thesis Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThesisType get(int value) {
		switch (value) {
			case COMPILATION_VALUE: return COMPILATION;
			case EXPERIMENTAL_VALUE: return EXPERIMENTAL;
			case PUBLICATION_VALUE: return PUBLICATION;
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
	private ThesisType(int value, String name, String literal) {
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
	
} //ThesisType
