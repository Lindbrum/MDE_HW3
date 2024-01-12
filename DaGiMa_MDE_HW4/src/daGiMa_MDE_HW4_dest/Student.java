/**
 */
package daGiMa_MDE_HW4_dest;

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
 *   <li>{@link daGiMa_MDE_HW4_dest.Student#getThesis_defended <em>Thesis defended</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Student#getEnrolled_courses <em>Enrolled courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Student#getBooked_calls <em>Booked calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Student#getTranscripts <em>Transcripts</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Thesis defended</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.Thesis}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.Thesis#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis defended</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getStudent_Thesis_defended()
	 * @see daGiMa_MDE_HW4_dest.Thesis#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<Thesis> getThesis_defended();

	/**
	 * Returns the value of the '<em><b>Enrolled courses</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.DegreeCourse}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.DegreeCourse#getEnrolled_students <em>Enrolled students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled courses</em>' reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getStudent_Enrolled_courses()
	 * @see daGiMa_MDE_HW4_dest.DegreeCourse#getEnrolled_students
	 * @model opposite="enrolled_students"
	 * @generated
	 */
	EList<DegreeCourse> getEnrolled_courses();

	/**
	 * Returns the value of the '<em><b>Booked calls</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.ExaminationCall}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.ExaminationCall#getBooked_students <em>Booked students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked calls</em>' reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getStudent_Booked_calls()
	 * @see daGiMa_MDE_HW4_dest.ExaminationCall#getBooked_students
	 * @model opposite="booked_students"
	 * @generated
	 */
	EList<ExaminationCall> getBooked_calls();

	/**
	 * Returns the value of the '<em><b>Transcripts</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.Career}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.Career#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transcripts</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getStudent_Transcripts()
	 * @see daGiMa_MDE_HW4_dest.Career#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<Career> getTranscripts();

} // Student
