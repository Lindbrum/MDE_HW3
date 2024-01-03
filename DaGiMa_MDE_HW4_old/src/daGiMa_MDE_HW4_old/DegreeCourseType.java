/**
 */
package daGiMa_MDE_HW4_old;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Degree Course Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourseType()
 * @model
 * @generated
 */
public enum DegreeCourseType implements Enumerator {
	/**
	 * The '<em><b>BACHELOR DEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELOR_DEGREE(0, "BACHELOR_DEGREE", "BACHELOR_DEGREE"),

	/**
	 * The '<em><b>MASTER DEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_DEGREE(1, "MASTER_DEGREE", "MASTER_DEGREE"),

	/**
	 * The '<em><b>MASTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(2, "MASTER", "MASTER"),

	/**
	 * The '<em><b>PHD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHD_VALUE
	 * @generated
	 * @ordered
	 */
	PHD(3, "PHD", "PHD");

	/**
	 * The '<em><b>BACHELOR DEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_DEGREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BACHELOR_DEGREE_VALUE = 0;

	/**
	 * The '<em><b>MASTER DEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_DEGREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_DEGREE_VALUE = 1;

	/**
	 * The '<em><b>MASTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 2;

	/**
	 * The '<em><b>PHD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHD_VALUE = 3;

	/**
	 * An array of all the '<em><b>Degree Course Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DegreeCourseType[] VALUES_ARRAY =
		new DegreeCourseType[] {
			BACHELOR_DEGREE,
			MASTER_DEGREE,
			MASTER,
			PHD,
		};

	/**
	 * A public read-only list of all the '<em><b>Degree Course Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DegreeCourseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Degree Course Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeCourseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DegreeCourseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Degree Course Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeCourseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DegreeCourseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Degree Course Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DegreeCourseType get(int value) {
		switch (value) {
			case BACHELOR_DEGREE_VALUE: return BACHELOR_DEGREE;
			case MASTER_DEGREE_VALUE: return MASTER_DEGREE;
			case MASTER_VALUE: return MASTER;
			case PHD_VALUE: return PHD;
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
	private DegreeCourseType(int value, String name, String literal) {
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
	
} //DegreeCourseType
