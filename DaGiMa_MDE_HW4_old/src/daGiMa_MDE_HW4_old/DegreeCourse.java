/**
 */
package daGiMa_MDE_HW4_old;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getCode <em>Code</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getReference_year <em>Reference year</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getDuration <em>Duration</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getCfu <em>Cfu</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getDescription <em>Description</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getLanguage <em>Language</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getDepartment <em>Department</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getEnrolled_students <em>Enrolled students</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getCourse_catalogue <em>Course catalogue</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.DegreeCourse#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cfuBetweenValues'"
 * @generated
 */
public interface DegreeCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"L-44"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Code()
	 * @model default="L-44" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"A degree course"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Name()
	 * @model default="A degree course" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reference year</b></em>' attribute.
	 * The default value is <code>"2023"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference year</em>' attribute.
	 * @see #setReference_year(int)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Reference_year()
	 * @model default="2023" required="true"
	 * @generated
	 */
	int getReference_year();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getReference_year <em>Reference year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference year</em>' attribute.
	 * @see #getReference_year()
	 * @generated
	 */
	void setReference_year(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Duration()
	 * @model default="3" required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Cfu</b></em>' attribute.
	 * The default value is <code>"180"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfu</em>' attribute.
	 * @see #setCfu(int)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Cfu()
	 * @model default="180" required="true"
	 * @generated
	 */
	int getCfu();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCfu <em>Cfu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfu</em>' attribute.
	 * @see #getCfu()
	 * @generated
	 */
	void setCfu(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"A description of this course"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Description()
	 * @model default="A description of this course" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Language()
	 * @model default="English" required="true"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Department#getOffered_courses <em>Offered courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Department()
	 * @see daGiMa_MDE_HW4_old.Department#getOffered_courses
	 * @model opposite="offered_courses" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Professor#getCoordinated_degree_courses <em>Coordinated degree courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' reference.
	 * @see #setCoordinator(Professor)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Coordinator()
	 * @see daGiMa_MDE_HW4_old.Professor#getCoordinated_degree_courses
	 * @model opposite="coordinated_degree_courses" required="true"
	 * @generated
	 */
	Professor getCoordinator();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCoordinator <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator</em>' reference.
	 * @see #getCoordinator()
	 * @generated
	 */
	void setCoordinator(Professor value);

	/**
	 * Returns the value of the '<em><b>Enrolled students</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.Student}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Student#getEnrolled_courses <em>Enrolled courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled students</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Enrolled_students()
	 * @see daGiMa_MDE_HW4_old.Student#getEnrolled_courses
	 * @model opposite="enrolled_courses"
	 * @generated
	 */
	EList<Student> getEnrolled_students();

	/**
	 * Returns the value of the '<em><b>Course catalogue</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.Course}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Course#getDegree_courses <em>Degree courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course catalogue</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Course_catalogue()
	 * @see daGiMa_MDE_HW4_old.Course#getDegree_courses
	 * @model opposite="degree_courses" required="true"
	 * @generated
	 */
	EList<Course> getCourse_catalogue();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link daGiMa_MDE_HW4_old.DegreeCourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW4_old.DegreeCourseType
	 * @see #setType(DegreeCourseType)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getDegreeCourse_Type()
	 * @model required="true"
	 * @generated
	 */
	DegreeCourseType getType();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.DegreeCourse#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW4_old.DegreeCourseType
	 * @see #getType()
	 * @generated
	 */
	void setType(DegreeCourseType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tcfu &gt; 0 and cfu &lt;= 360'"
	 * @generated
	 */
	boolean cfuBetweenValues(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DegreeCourse
