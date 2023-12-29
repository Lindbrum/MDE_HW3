/**
 */
package daGiMa_MDE_HW4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.University#getRector <em>Rector</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.University#getDepartments <em>Departments</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.University#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Rector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rector</em>' reference.
	 * @see #setRector(Professor)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUniversity_Rector()
	 * @model required="true"
	 * @generated
	 */
	Professor getRector();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.University#getRector <em>Rector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rector</em>' reference.
	 * @see #getRector()
	 * @generated
	 */
	void setRector(Professor value);

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4.Department}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4.Department#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUniversity_Departments()
	 * @see daGiMa_MDE_HW4.Department#getUniversity
	 * @model opposite="university" containment="true" required="true"
	 * @generated
	 */
	EList<Department> getDepartments();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"A university"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUniversity_Name()
	 * @model default="A university" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // University
