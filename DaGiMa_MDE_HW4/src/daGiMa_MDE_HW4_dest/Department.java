/**
 */
package daGiMa_MDE_HW4_dest;

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
 *   <li>{@link daGiMa_MDE_HW4_dest.Department#getWebsite <em>Website</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Department#getOffered_courses <em>Offered courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Department#getUniversity <em>University</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Department#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Department#getRelated_news <em>Related news</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getDepartment()
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
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getDepartment_Website()
	 * @model required="true"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Department#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Offered courses</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.DegreeCourse}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.DegreeCourse#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered courses</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getDepartment_Offered_courses()
	 * @see daGiMa_MDE_HW4_dest.DegreeCourse#getDepartment
	 * @model opposite="department" containment="true" required="true"
	 * @generated
	 */
	EList<DegreeCourse> getOffered_courses();

	/**
	 * Returns the value of the '<em><b>University</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.University#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' container reference.
	 * @see #setUniversity(University)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getDepartment_University()
	 * @see daGiMa_MDE_HW4_dest.University#getDepartments
	 * @model opposite="departments" transient="false"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Department#getUniversity <em>University</em>}' container reference.
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
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getDepartment_Name()
	 * @model default="A department" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Related news</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.News}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.News#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related news</em>' reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getDepartment_Related_news()
	 * @see daGiMa_MDE_HW4_dest.News#getDepartment
	 * @model opposite="department"
	 * @generated
	 */
	EList<News> getRelated_news();

} // Department
