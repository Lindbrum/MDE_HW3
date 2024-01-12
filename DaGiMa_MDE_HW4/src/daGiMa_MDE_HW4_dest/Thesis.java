/**
 */
package daGiMa_MDE_HW4_dest;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

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
 *   <li>{@link daGiMa_MDE_HW4_dest.Thesis#getTitle <em>Title</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Thesis#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Thesis#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Thesis#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Thesis#getDegree_course <em>Degree course</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getThesis()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkIfEnoughCreditsToGraduate'"
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
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getThesis_Title()
	 * @model default="A thesis" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Thesis#getTitle <em>Title</em>}' attribute.
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
	 * The literals are from the enumeration {@link daGiMa_MDE_HW4_dest.ThesisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW4_dest.ThesisType
	 * @see #setType(ThesisType)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getThesis_Type()
	 * @model default="COMPILATION" required="true"
	 * @generated
	 */
	ThesisType getType();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Thesis#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see daGiMa_MDE_HW4_dest.ThesisType
	 * @see #getType()
	 * @generated
	 */
	void setType(ThesisType value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.Student#getThesis_defended <em>Thesis defended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getThesis_Student()
	 * @see daGiMa_MDE_HW4_dest.Student#getThesis_defended
	 * @model opposite="thesis_defended" required="true" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Thesis#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_dest.Professor#getSupervised_thesis <em>Supervised thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' reference.
	 * @see #setSupervisor(Professor)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getThesis_Supervisor()
	 * @see daGiMa_MDE_HW4_dest.Professor#getSupervised_thesis
	 * @model opposite="supervised_thesis" required="true"
	 * @generated
	 */
	Professor getSupervisor();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Thesis#getSupervisor <em>Supervisor</em>}' reference.
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
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getThesis_Degree_course()
	 * @model required="true"
	 * @generated
	 */
	DegreeCourse getDegree_course();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Thesis#getDegree_course <em>Degree course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree course</em>' reference.
	 * @see #getDegree_course()
	 * @generated
	 */
	void setDegree_course(DegreeCourse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tstudent.transcripts-&gt;select(transcript|transcript.degree_course = self.degree_course)-&gt;forAll(e|e.passedAllExams())'"
	 * @generated
	 */
	boolean checkIfEnoughCreditsToGraduate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Thesis
