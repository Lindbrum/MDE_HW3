/**
 */
package daGiMa_MDE_HW4_old.util;

import daGiMa_MDE_HW4_old.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage
 * @generated
 */
public class DaGiMa_MDE_HW4_oldValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DaGiMa_MDE_HW4_oldValidator INSTANCE = new DaGiMa_MDE_HW4_oldValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "daGiMa_MDE_HW4_old";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Satisfy Minimal Cfu Requirement' of 'Professor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFESSOR__SATISFY_MINIMAL_CFU_REQUIREMENT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cfu Between Values' of 'Degree Course'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEGREE_COURSE__CFU_BETWEEN_VALUES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check If Enough Credits To Graduate' of 'Thesis'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int THESIS__CHECK_IF_ENOUGH_CREDITS_TO_GRADUATE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cfu Course Greater Than' of 'Course'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COURSE__CFU_COURSE_GREATER_THAN = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Be Sufficient If Defined' of 'Passing Grade'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PASSING_GRADE__MUST_BE_SUFFICIENT_IF_DEFINED = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaGiMa_MDE_HW4_oldValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DaGiMa_MDE_HW4_oldPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DaGiMa_MDE_HW4_oldPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.PROFESSOR:
				return validateProfessor((Professor)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE:
				return validateDegreeCourse((DegreeCourse)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.THESIS:
				return validateThesis((Thesis)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.EXAMINATION_CALL:
				return validateExaminationCall((ExaminationCall)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.PASSING_GRADE:
				return validatePassingGrade((PassingGrade)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.CAREER:
				return validateCareer((Career)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.NEWS:
				return validateNews((News)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.POST_GRADUATE_COURSE:
				return validatePostGraduateCourse((PostGraduateCourse)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.PH_D:
				return validatePhD((PhD)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.MASTER:
				return validateMaster((Master)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.THESIS_TYPE:
				return validateThesisType((ThesisType)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.CREDIT_TYPE:
				return validateCreditType((CreditType)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.COURSE_PERIOD:
				return validateCoursePeriod((CoursePeriod)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.EXAM_TYPE:
				return validateExamType((ExamType)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.POST_GRADUATE_LEVEL:
				return validatePostGraduateLevel((PostGraduateLevel)value, diagnostics, context);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE_TYPE:
				return validateDegreeCourseType((DegreeCourseType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor(Professor professor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(professor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(professor, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfessor_satisfyMinimalCfuRequirement(professor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the satisfyMinimalCfuRequirement constraint of '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor_satisfyMinimalCfuRequirement(Professor professor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return professor.satisfyMinimalCfuRequirement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeCourse(DegreeCourse degreeCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(degreeCourse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(degreeCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegreeCourse_cfuBetweenValues(degreeCourse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cfuBetweenValues constraint of '<em>Degree Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeCourse_cfuBetweenValues(DegreeCourse degreeCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return degreeCourse.cfuBetweenValues(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThesis(Thesis thesis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(thesis, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(thesis, diagnostics, context);
		if (result || diagnostics != null) result &= validateThesis_checkIfEnoughCreditsToGraduate(thesis, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkIfEnoughCreditsToGraduate constraint of '<em>Thesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThesis_checkIfEnoughCreditsToGraduate(Thesis thesis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return thesis.checkIfEnoughCreditsToGraduate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_cfuCourseGreaterThan(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cfuCourseGreaterThan constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_cfuCourseGreaterThan(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return course.cfuCourseGreaterThan(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExaminationCall(ExaminationCall examinationCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(examinationCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassingGrade(PassingGrade passingGrade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(passingGrade, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(passingGrade, diagnostics, context);
		if (result || diagnostics != null) result &= validatePassingGrade_mustBeSufficientIfDefined(passingGrade, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustBeSufficientIfDefined constraint of '<em>Passing Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassingGrade_mustBeSufficientIfDefined(PassingGrade passingGrade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return passingGrade.mustBeSufficientIfDefined(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareer(Career career, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(career, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNews(News news, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(news, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostGraduateCourse(PostGraduateCourse postGraduateCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(postGraduateCourse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(postGraduateCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegreeCourse_cfuBetweenValues(postGraduateCourse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhD(PhD phD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(phD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phD, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegreeCourse_cfuBetweenValues(phD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(master, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(master, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegreeCourse_cfuBetweenValues(master, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThesisType(ThesisType thesisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreditType(CreditType creditType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoursePeriod(CoursePeriod coursePeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExamType(ExamType examType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostGraduateLevel(PostGraduateLevel postGraduateLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeCourseType(DegreeCourseType degreeCourseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DaGiMa_MDE_HW4_oldValidator
