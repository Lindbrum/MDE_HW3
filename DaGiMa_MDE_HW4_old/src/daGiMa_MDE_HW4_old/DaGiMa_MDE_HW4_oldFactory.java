/**
 */
package daGiMa_MDE_HW4_old;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage
 * @generated
 */
public interface DaGiMa_MDE_HW4_oldFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DaGiMa_MDE_HW4_oldFactory eINSTANCE = daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University</em>'.
	 * @generated
	 */
	University createUniversity();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Degree Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree Course</em>'.
	 * @generated
	 */
	DegreeCourse createDegreeCourse();

	/**
	 * Returns a new object of class '<em>Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thesis</em>'.
	 * @generated
	 */
	Thesis createThesis();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Examination Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examination Call</em>'.
	 * @generated
	 */
	ExaminationCall createExaminationCall();

	/**
	 * Returns a new object of class '<em>Passing Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passing Grade</em>'.
	 * @generated
	 */
	PassingGrade createPassingGrade();

	/**
	 * Returns a new object of class '<em>Career</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Career</em>'.
	 * @generated
	 */
	Career createCareer();

	/**
	 * Returns a new object of class '<em>News</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>News</em>'.
	 * @generated
	 */
	News createNews();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Ph D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ph D</em>'.
	 * @generated
	 */
	PhD createPhD();

	/**
	 * Returns a new object of class '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master</em>'.
	 * @generated
	 */
	Master createMaster();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DaGiMa_MDE_HW4_oldPackage getDaGiMa_MDE_HW4_oldPackage();

} //DaGiMa_MDE_HW4_oldFactory
