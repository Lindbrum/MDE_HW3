/**
 */
package daGiMa_MDE_HW4_old;

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
 *   <li>{@link daGiMa_MDE_HW4_old.Career#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Career#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Career#getDegree_course <em>Degree course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Career#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getCareer()
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
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getCareer_Name()
	 * @model default="New transcript" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Career#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Student#getTranscripts <em>Transcripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getCareer_Student()
	 * @see daGiMa_MDE_HW4_old.Student#getTranscripts
	 * @model opposite="transcripts" required="true" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Career#getStudent <em>Student</em>}' container reference.
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
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getCareer_Degree_course()
	 * @model required="true"
	 * @generated
	 */
	DegreeCourse getDegree_course();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Career#getDegree_course <em>Degree course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree course</em>' reference.
	 * @see #getDegree_course()
	 * @generated
	 */
	void setDegree_course(DegreeCourse value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.PassingGrade}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.PassingGrade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getCareer_Courses()
	 * @see daGiMa_MDE_HW4_old.PassingGrade#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<PassingGrade> getCourses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='courses-&gt;forAll(course|course.grade.size() &gt; 0)'"
	 * @generated
	 */
	boolean passedAllExams();

} // Career
