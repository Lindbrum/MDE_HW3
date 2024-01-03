/**
 */
package daGiMa_MDE_HW4_old;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * property student_exams : Course[*] { ordered derived volatile } {
 * derivation : transcripts->collect(transcript|transcript.courses.course)->asOrderedSet();
 * }
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.Student#getMatriculation_number <em>Matriculation number</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Student#getThesis_defended <em>Thesis defended</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Student#getEnrolled_courses <em>Enrolled courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Student#getBooked_calls <em>Booked calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Student#getTranscripts <em>Transcripts</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getStudent()
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
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getStudent_Matriculation_number()
	 * @model required="true"
	 * @generated
	 */
	long getMatriculation_number();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Student#getMatriculation_number <em>Matriculation number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matriculation number</em>' attribute.
	 * @see #getMatriculation_number()
	 * @generated
	 */
	void setMatriculation_number(long value);

	/**
	 * Returns the value of the '<em><b>Thesis defended</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.Thesis}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Thesis#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesis defended</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getStudent_Thesis_defended()
	 * @see daGiMa_MDE_HW4_old.Thesis#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<Thesis> getThesis_defended();

	/**
	 * Returns the value of the '<em><b>Enrolled courses</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.DegreeCourse}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.DegreeCourse#getEnrolled_students <em>Enrolled students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled courses</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getStudent_Enrolled_courses()
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getEnrolled_students
	 * @model opposite="enrolled_students"
	 * @generated
	 */
	EList<DegreeCourse> getEnrolled_courses();

	/**
	 * Returns the value of the '<em><b>Booked calls</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.ExaminationCall}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.ExaminationCall#getBooked_students <em>Booked students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked calls</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getStudent_Booked_calls()
	 * @see daGiMa_MDE_HW4_old.ExaminationCall#getBooked_students
	 * @model opposite="booked_students"
	 * @generated
	 */
	EList<ExaminationCall> getBooked_calls();

	/**
	 * Returns the value of the '<em><b>Transcripts</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.Career}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Career#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transcripts</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getStudent_Transcripts()
	 * @see daGiMa_MDE_HW4_old.Career#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<Career> getTranscripts();

} // Student
