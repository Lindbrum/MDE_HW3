/**
 */
package daGiMa_MDE_HW4_old;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.Department#getWebsite <em>Website</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Department#getOffered_courses <em>Offered courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Department#getUniversity <em>University</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Department#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Department#getRelated_news <em>Related news</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDepartment_Website()
	 * @model required="true"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Department#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Offered courses</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.DegreeCourse}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.DegreeCourse#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered courses</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDepartment_Offered_courses()
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getDepartment
	 * @model opposite="department" containment="true" required="true"
	 * @generated
	 */
	EList<DegreeCourse> getOffered_courses();

	/**
	 * Returns the value of the '<em><b>University</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.University#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' container reference.
	 * @see #setUniversity(University)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDepartment_University()
	 * @see daGiMa_MDE_HW4_old.University#getDepartments
	 * @model opposite="departments" transient="false"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Department#getUniversity <em>University</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' container reference.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(University value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"A department"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDepartment_Name()
	 * @model default="A department" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Related news</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.News}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.News#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related news</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDepartment_Related_news()
	 * @see daGiMa_MDE_HW4_old.News#getDepartment
	 * @model opposite="department"
	 * @generated
	 */
	EList<News> getRelated_news();

} // Department
