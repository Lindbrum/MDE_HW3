/**
 */
package daGiMa_MDE_HW3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.Thesis#getTitle <em>Title</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Thesis#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Thesis#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Thesis#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.Thesis#getDegree_course <em>Degree course</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getThesis()
 * @model
 * @generated
 */
public interface Thesis extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"A thesis"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getThesis_Title()
	 * @model default="A thesis" id="true" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.Thesis#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"COMPILATION"</code>.
	 * The literals are from the enumeration {@link daGiMa_MDE_HW3.ThesisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW3.ThesisType
	 * @see #setType(ThesisType)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getThesis_Type()
	 * @model default="COMPILATION" required="true"
	 * @generated
	 */
	ThesisType getType();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.Thesis#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW3.ThesisType
	 * @see #getType()
	 * @generated
	 */
	void setType(ThesisType value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Student#getThesis_defended <em>Thesis defended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getThesis_Student()
	 * @see daGiMa_MDE_HW3.Student#getThesis_defended
	 * @model opposite="thesis_defended" required="true"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.Thesis#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Professor#getSupervised_thesis <em>Supervised thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' reference.
	 * @see #setSupervisor(Professor)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getThesis_Supervisor()
	 * @see daGiMa_MDE_HW3.Professor#getSupervised_thesis
	 * @model opposite="supervised_thesis" required="true"
	 * @generated
	 */
	Professor getSupervisor();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.Thesis#getSupervisor <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Professor value);

	/**
	 * Returns the value of the '<em><b>Degree course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree course</em>' reference.
	 * @see #setDegree_course(DegreeCourse)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getThesis_Degree_course()
	 * @model required="true"
	 * @generated
	 */
	DegreeCourse getDegree_course();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.Thesis#getDegree_course <em>Degree course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree course</em>' reference.
	 * @see #getDegree_course()
	 * @generated
	 */
	void setDegree_course(DegreeCourse value);

} // Thesis
