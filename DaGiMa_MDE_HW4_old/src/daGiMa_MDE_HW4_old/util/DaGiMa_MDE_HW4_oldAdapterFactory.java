/**
 */
package daGiMa_MDE_HW4_old.util;

import daGiMa_MDE_HW4_old.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage
 * @generated
 */
public class DaGiMa_MDE_HW4_oldAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DaGiMa_MDE_HW4_oldPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaGiMa_MDE_HW4_oldAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DaGiMa_MDE_HW4_oldPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaGiMa_MDE_HW4_oldSwitch<Adapter> modelSwitch =
		new DaGiMa_MDE_HW4_oldSwitch<Adapter>() {
			@Override
			public Adapter caseUniversity(University object) {
				return createUniversityAdapter();
			}
			@Override
			public Adapter caseProfessor(Professor object) {
				return createProfessorAdapter();
			}
			@Override
			public Adapter caseStudent(Student object) {
				return createStudentAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseDepartment(Department object) {
				return createDepartmentAdapter();
			}
			@Override
			public Adapter caseDegreeCourse(DegreeCourse object) {
				return createDegreeCourseAdapter();
			}
			@Override
			public Adapter caseThesis(Thesis object) {
				return createThesisAdapter();
			}
			@Override
			public Adapter caseCourse(Course object) {
				return createCourseAdapter();
			}
			@Override
			public Adapter caseExaminationCall(ExaminationCall object) {
				return createExaminationCallAdapter();
			}
			@Override
			public Adapter casePassingGrade(PassingGrade object) {
				return createPassingGradeAdapter();
			}
			@Override
			public Adapter caseCareer(Career object) {
				return createCareerAdapter();
			}
			@Override
			public Adapter caseNews(News object) {
				return createNewsAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter casePostGraduateCourse(PostGraduateCourse object) {
				return createPostGraduateCourseAdapter();
			}
			@Override
			public Adapter casePhD(PhD object) {
				return createPhDAdapter();
			}
			@Override
			public Adapter caseMaster(Master object) {
				return createMasterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.University
	 * @generated
	 */
	public Adapter createUniversityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Professor
	 * @generated
	 */
	public Adapter createProfessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Student
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Department
	 * @generated
	 */
	public Adapter createDepartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.DegreeCourse <em>Degree Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse
	 * @generated
	 */
	public Adapter createDegreeCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Thesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Thesis
	 * @generated
	 */
	public Adapter createThesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.ExaminationCall <em>Examination Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall
	 * @generated
	 */
	public Adapter createExaminationCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.PassingGrade <em>Passing Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.PassingGrade
	 * @generated
	 */
	public Adapter createPassingGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Career <em>Career</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Career
	 * @generated
	 */
	public Adapter createCareerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.News <em>News</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.News
	 * @generated
	 */
	public Adapter createNewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.PostGraduateCourse <em>Post Graduate Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.PostGraduateCourse
	 * @generated
	 */
	public Adapter createPostGraduateCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.PhD <em>Ph D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.PhD
	 * @generated
	 */
	public Adapter createPhDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link daGiMa_MDE_HW4_old.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see daGiMa_MDE_HW4_old.Master
	 * @generated
	 */
	public Adapter createMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DaGiMa_MDE_HW4_oldAdapterFactory
