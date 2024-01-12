/**
 */
package daGiMa_MDE_HW4_dest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Career</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_dest.Career#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Career#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Career#getDegree_course <em>Degree course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Career#getCourses <em>Courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Career#getMatriculation_number <em>Matriculation number</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCareer()
 * @model
 * @generated
 */
public interface Career extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"New transcript"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCareer_Name()
	 * @model default="New transcript" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Career#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.Student#getTranscripts <em>Transcripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCareer_Student()
	 * @see daGiMa_MDE_HW4_dest.Student#getTranscripts
	 * @model opposite="transcripts" required="true" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Career#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Degree course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree course</em>' reference.
	 * @see #setDegree_course(DegreeCourse)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCareer_Degree_course()
	 * @model required="true"
	 * @generated
	 */
	DegreeCourse getDegree_course();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Career#getDegree_course <em>Degree course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree course</em>' reference.
	 * @see #getDegree_course()
	 * @generated
	 */
	void setDegree_course(DegreeCourse value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.PassingGrade}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.PassingGrade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCareer_Courses()
	 * @see daGiMa_MDE_HW4_dest.PassingGrade#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<PassingGrade> getCourses();

	/**
	 * Returns the value of the '<em><b>Matriculation number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculation number</em>' attribute.
	 * @see #setMatriculation_number(long)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getCareer_Matriculation_number()
	 * @model required="true"
	 * @generated
	 */
	long getMatriculation_number();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Career#getMatriculation_number <em>Matriculation number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matriculation number</em>' attribute.
	 * @see #getMatriculation_number()
	 * @generated
	 */
	void setMatriculation_number(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='courses-&gt;forAll(course|course.grade.size() &gt; 0)'"
	 * @generated
	 */
	boolean passedAllExams();

} // Career
