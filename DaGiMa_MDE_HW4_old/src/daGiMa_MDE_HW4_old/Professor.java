/**
 */
package daGiMa_MDE_HW4_old;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.Professor#getOffice_telephone <em>Office telephone</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Professor#getOrcid <em>Orcid</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Professor#getCoordinated_degree_courses <em>Coordinated degree courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Professor#getSupervised_thesis <em>Supervised thesis</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Professor#getTaught_courses <em>Taught courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.Professor#getNews_posted <em>News posted</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getProfessor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='satisfyMinimalCfuRequirement'"
 * @generated
 */
public interface Professor extends User {
	/**
	 * Returns the value of the '<em><b>Office telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office telephone</em>' attribute.
	 * @see #setOffice_telephone(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getProfessor_Office_telephone()
	 * @model required="true"
	 * @generated
	 */
	String getOffice_telephone();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Professor#getOffice_telephone <em>Office telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office telephone</em>' attribute.
	 * @see #getOffice_telephone()
	 * @generated
	 */
	void setOffice_telephone(String value);

	/**
	 * Returns the value of the '<em><b>Orcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orcid</em>' attribute.
	 * @see #setOrcid(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getProfessor_Orcid()
	 * @model required="true"
	 * @generated
	 */
	String getOrcid();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Professor#getOrcid <em>Orcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orcid</em>' attribute.
	 * @see #getOrcid()
	 * @generated
	 */
	void setOrcid(String value);

	/**
	 * Returns the value of the '<em><b>Coordinated degree courses</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.DegreeCourse}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinated degree courses</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getProfessor_Coordinated_degree_courses()
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getCoordinator
	 * @model opposite="coordinator"
	 * @generated
	 */
	EList<DegreeCourse> getCoordinated_degree_courses();

	/**
	 * Returns the value of the '<em><b>Supervised thesis</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.Thesis}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Thesis#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervised thesis</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getProfessor_Supervised_thesis()
	 * @see daGiMa_MDE_HW4_old.Thesis#getSupervisor
	 * @model opposite="supervisor"
	 * @generated
	 */
	EList<Thesis> getSupervised_thesis();

	/**
	 * Returns the value of the '<em><b>Taught courses</b></em>' reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.Course}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.Course#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taught courses</em>' reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getProfessor_Taught_courses()
	 * @see daGiMa_MDE_HW4_old.Course#getTeachers
	 * @model opposite="teachers" required="true"
	 * @generated
	 */
	EList<Course> getTaught_courses();

	/**
	 * Returns the value of the '<em><b>News posted</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_old.News}.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW4_old.News#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>News posted</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getProfessor_News_posted()
	 * @see daGiMa_MDE_HW4_old.News#getAuthor
	 * @model opposite="author" containment="true"
	 * @generated
	 */
	EList<News> getNews_posted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='taught_courses-&gt;collect(course|course.cfu)-&gt;sum()'"
	 * @generated
	 */
	BigInteger totalCfuTaught();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttotalCfuTaught() &gt;= 15'"
	 * @generated
	 */
	boolean satisfyMinimalCfuRequirement(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Professor
