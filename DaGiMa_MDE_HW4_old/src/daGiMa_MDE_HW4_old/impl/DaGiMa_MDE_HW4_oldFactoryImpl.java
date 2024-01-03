/**
 */
package daGiMa_MDE_HW4_old.impl;

import daGiMa_MDE_HW4_old.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DaGiMa_MDE_HW4_oldFactoryImpl extends EFactoryImpl implements DaGiMa_MDE_HW4_oldFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DaGiMa_MDE_HW4_oldFactory init() {
		try {
			DaGiMa_MDE_HW4_oldFactory theDaGiMa_MDE_HW4_oldFactory = (DaGiMa_MDE_HW4_oldFactory)EPackage.Registry.INSTANCE.getEFactory(DaGiMa_MDE_HW4_oldPackage.eNS_URI);
			if (theDaGiMa_MDE_HW4_oldFactory != null) {
				return theDaGiMa_MDE_HW4_oldFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DaGiMa_MDE_HW4_oldFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaGiMa_MDE_HW4_oldFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DaGiMa_MDE_HW4_oldPackage.UNIVERSITY: return createUniversity();
			case DaGiMa_MDE_HW4_oldPackage.PROFESSOR: return createProfessor();
			case DaGiMa_MDE_HW4_oldPackage.STUDENT: return createStudent();
			case DaGiMa_MDE_HW4_oldPackage.DEPARTMENT: return createDepartment();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE: return createDegreeCourse();
			case DaGiMa_MDE_HW4_oldPackage.THESIS: return createThesis();
			case DaGiMa_MDE_HW4_oldPackage.COURSE: return createCourse();
			case DaGiMa_MDE_HW4_oldPackage.EXAMINATION_CALL: return createExaminationCall();
			case DaGiMa_MDE_HW4_oldPackage.PASSING_GRADE: return createPassingGrade();
			case DaGiMa_MDE_HW4_oldPackage.CAREER: return createCareer();
			case DaGiMa_MDE_HW4_oldPackage.NEWS: return createNews();
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER: return createContainer();
			case DaGiMa_MDE_HW4_oldPackage.PH_D: return createPhD();
			case DaGiMa_MDE_HW4_oldPackage.MASTER: return createMaster();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DaGiMa_MDE_HW4_oldPackage.THESIS_TYPE:
				return createThesisTypeFromString(eDataType, initialValue);
			case DaGiMa_MDE_HW4_oldPackage.CREDIT_TYPE:
				return createCreditTypeFromString(eDataType, initialValue);
			case DaGiMa_MDE_HW4_oldPackage.COURSE_PERIOD:
				return createCoursePeriodFromString(eDataType, initialValue);
			case DaGiMa_MDE_HW4_oldPackage.EXAM_TYPE:
				return createExamTypeFromString(eDataType, initialValue);
			case DaGiMa_MDE_HW4_oldPackage.POST_GRADUATE_LEVEL:
				return createPostGraduateLevelFromString(eDataType, initialValue);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE_TYPE:
				return createDegreeCourseTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DaGiMa_MDE_HW4_oldPackage.THESIS_TYPE:
				return convertThesisTypeToString(eDataType, instanceValue);
			case DaGiMa_MDE_HW4_oldPackage.CREDIT_TYPE:
				return convertCreditTypeToString(eDataType, instanceValue);
			case DaGiMa_MDE_HW4_oldPackage.COURSE_PERIOD:
				return convertCoursePeriodToString(eDataType, instanceValue);
			case DaGiMa_MDE_HW4_oldPackage.EXAM_TYPE:
				return convertExamTypeToString(eDataType, instanceValue);
			case DaGiMa_MDE_HW4_oldPackage.POST_GRADUATE_LEVEL:
				return convertPostGraduateLevelToString(eDataType, instanceValue);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE_TYPE:
				return convertDegreeCourseTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professor createProfessor() {
		ProfessorImpl professor = new ProfessorImpl();
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeCourse createDegreeCourse() {
		DegreeCourseImpl degreeCourse = new DegreeCourseImpl();
		return degreeCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thesis createThesis() {
		ThesisImpl thesis = new ThesisImpl();
		return thesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExaminationCall createExaminationCall() {
		ExaminationCallImpl examinationCall = new ExaminationCallImpl();
		return examinationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassingGrade createPassingGrade() {
		PassingGradeImpl passingGrade = new PassingGradeImpl();
		return passingGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Career createCareer() {
		CareerImpl career = new CareerImpl();
		return career;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public News createNews() {
		NewsImpl news = new NewsImpl();
		return news;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public daGiMa_MDE_HW4_old.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhD createPhD() {
		PhDImpl phD = new PhDImpl();
		return phD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Master createMaster() {
		MasterImpl master = new MasterImpl();
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisType createThesisTypeFromString(EDataType eDataType, String initialValue) {
		ThesisType result = ThesisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThesisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditType createCreditTypeFromString(EDataType eDataType, String initialValue) {
		CreditType result = CreditType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreditTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePeriod createCoursePeriodFromString(EDataType eDataType, String initialValue) {
		CoursePeriod result = CoursePeriod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoursePeriodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamType createExamTypeFromString(EDataType eDataType, String initialValue) {
		ExamType result = ExamType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExamTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostGraduateLevel createPostGraduateLevelFromString(EDataType eDataType, String initialValue) {
		PostGraduateLevel result = PostGraduateLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostGraduateLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeCourseType createDegreeCourseTypeFromString(EDataType eDataType, String initialValue) {
		DegreeCourseType result = DegreeCourseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreeCourseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DaGiMa_MDE_HW4_oldPackage getDaGiMa_MDE_HW4_oldPackage() {
		return (DaGiMa_MDE_HW4_oldPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DaGiMa_MDE_HW4_oldPackage getPackage() {
		return DaGiMa_MDE_HW4_oldPackage.eINSTANCE;
	}

} //DaGiMa_MDE_HW4_oldFactoryImpl
