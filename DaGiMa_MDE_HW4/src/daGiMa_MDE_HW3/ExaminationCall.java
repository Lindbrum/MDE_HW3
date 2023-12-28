/**
 */
package daGiMa_MDE_HW3;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examination Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.ExaminationCall#getDate <em>Date</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExaminationCall#getClassroom <em>Classroom</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExaminationCall#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExaminationCall#getDescription <em>Description</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExaminationCall#getCourse <em>Course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.ExaminationCall#getBooked_students <em>Booked students</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExaminationCall()
 * @model
 * @generated
 */
public interface ExaminationCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * The default value is <code>"2024-01-28"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExaminationCall_Date()
	 * @model default="2024-01-28" required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExaminationCall#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Classroom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classroom</em>' attribute.
	 * @see #setClassroom(String)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExaminationCall_Classroom()
	 * @model required="true"
	 * @generated
	 */
	String getClassroom();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExaminationCall#getClassroom <em>Classroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classroom</em>' attribute.
	 * @see #getClassroom()
	 * @generated
	 */
	void setClassroom(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link daGiMa_MDE_HW3.ExamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW3.ExamType
	 * @see #setType(ExamType)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExaminationCall_Type()
	 * @model required="true"
	 * @generated
	 */
	ExamType getType();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExaminationCall#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW3.ExamType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExamType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"An exam call description"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExaminationCall_Description()
	 * @model default="An exam call description"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExaminationCall#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Course#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' container reference.
	 * @see #setCourse(Course)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExaminationCall_Course()
	 * @see daGiMa_MDE_HW3.Course#getCalls
	 * @model opposite="calls" required="true" transient="false"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.ExaminationCall#getCourse <em>Course</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' container reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Booked students</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW3.Student}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Student#getBooked_calls <em>Booked calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked students</em>' reference list.
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getExaminationCall_Booked_students()
	 * @see daGiMa_MDE_HW3.Student#getBooked_calls
	 * @model opposite="booked_calls"
	 * @generated
	 */
	EList<Student> getBooked_students();

} // ExaminationCall
