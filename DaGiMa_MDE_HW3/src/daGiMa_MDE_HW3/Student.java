/**
 */
package daGiMa_MDE_HW3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.Student#getMatriculation_number <em>Matriculation number</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Student#getThesis_defended <em>Thesis defended</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Student#getEnrolled_courses <em>Enrolled courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Student#getBooked_calls <em>Booked calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Student#getTranscripts <em>Transcripts</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Student#getStudent_exams <em>Student exams</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getStudent()
 * @model
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Matriculation number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculation number</em>' attribute.
	 * @see #setMatriculation_number(long)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getStudent_Matriculation_number()
	 * @model required="true"
	 * @generated
	 */
	long getMatriculation_number();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.Student#getMatriculation_number <em>Matriculation number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matriculation number</em>' attribute.
	 * @see #getMatriculation_number()
	 * @generated
	 */
	void setMatriculation_number(long value);

	/**
	 * Returns the value of the '<em><b>Thesis defended</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW3.Thesis}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Thesis#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis defended</em>' containment reference list.
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getStudent_Thesis_defended()
	 * @see daGiMa_MDE_HW3.Thesis#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<Thesis> getThesis_defended();

	/**
	 * Returns the value of the '<em><b>Enrolled courses</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW3.DegreeCourse}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.DegreeCourse#getEnrolled_students <em>Enrolled students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled courses</em>' reference list.
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getStudent_Enrolled_courses()
	 * @see daGiMa_MDE_HW3.DegreeCourse#getEnrolled_students
	 * @model opposite="enrolled_students"
	 * @generated
	 */
	EList<DegreeCourse> getEnrolled_courses();

	/**
	 * Returns the value of the '<em><b>Booked calls</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW3.ExaminationCall}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.ExaminationCall#getBooked_students <em>Booked students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked calls</em>' reference list.
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getStudent_Booked_calls()
	 * @see daGiMa_MDE_HW3.ExaminationCall#getBooked_students
	 * @model opposite="booked_students"
	 * @generated
	 */
	EList<ExaminationCall> getBooked_calls();

	/**
	 * Returns the value of the '<em><b>Transcripts</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW3.Career}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Career#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transcripts</em>' containment reference list.
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getStudent_Transcripts()
	 * @see daGiMa_MDE_HW3.Career#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<Career> getTranscripts();

	/**
	 * Returns the value of the '<em><b>Student exams</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW3.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student exams</em>' reference list.
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getStudent_Student_exams()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Course> getStudent_exams();

} // Student
