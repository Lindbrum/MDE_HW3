/**
 */
package daGiMa_MDE_HW4;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passing Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.PassingGrade#getDate <em>Date</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.PassingGrade#getGrade <em>Grade</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.PassingGrade#getCourse <em>Course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.PassingGrade#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getPassingGrade()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeSufficientIfDefined'"
 * @generated
 */
public interface PassingGrade extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * The default value is <code>"2024-01-28"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getPassingGrade_Date()
	 * @model default="2024-01-28"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.PassingGrade#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getPassingGrade_Grade()
	 * @model default="30"
	 * @generated
	 */
	String getGrade();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.PassingGrade#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4.Course#getStudents_grades <em>Students grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getPassingGrade_Course()
	 * @see daGiMa_MDE_HW4.Course#getStudents_grades
	 * @model opposite="students_grades" required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.PassingGrade#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4.Career#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Career)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getPassingGrade_Student()
	 * @see daGiMa_MDE_HW4.Career#getCourses
	 * @model opposite="courses" required="true" transient="false"
	 * @generated
	 */
	Career getStudent();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.PassingGrade#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Career value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tgrade.size() = 0 or (grade.matches(\'([Aa][+]{0,1}){1}|[B-Db-d]{1}|(1[8-9]{1}|2[0-9]{1}|30[Ll]{0,1}){1}\'))'"
	 * @generated
	 */
	boolean mustBeSufficientIfDefined(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PassingGrade
