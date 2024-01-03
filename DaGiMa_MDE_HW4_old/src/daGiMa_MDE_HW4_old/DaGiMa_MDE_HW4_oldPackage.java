/**
 */
package daGiMa_MDE_HW4_old;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface DaGiMa_MDE_HW4_oldPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "daGiMa_MDE_HW4_old";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/daGiMa_MDE_HW4_old";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "daGiMa_MDE_HW4_old";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DaGiMa_MDE_HW4_oldPackage eINSTANCE = daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl.init();

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.UniversityImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Rector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__RECTOR = 0;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__DEPARTMENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 2;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.UserImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TELEPHONE = 3;

	/**
	 * The feature id for the '<em><b>Birth date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIRTH_DATE = 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.ProfessorImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__SURNAME = USER__SURNAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TELEPHONE = USER__TELEPHONE;

	/**
	 * The feature id for the '<em><b>Birth date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__BIRTH_DATE = USER__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Office telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__OFFICE_TELEPHONE = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ORCID = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordinated degree courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__COORDINATED_DEGREE_COURSES = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supervised thesis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__SUPERVISED_THESIS = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Taught courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TAUGHT_COURSES = USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>News posted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NEWS_POSTED = USER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Total Cfu Taught</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___TOTAL_CFU_TAUGHT = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Satisfy Minimal Cfu Requirement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___SATISFY_MINIMAL_CFU_REQUIREMENT__DIAGNOSTICCHAIN_MAP = USER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.StudentImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SURNAME = USER__SURNAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__TELEPHONE = USER__TELEPHONE;

	/**
	 * The feature id for the '<em><b>Birth date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__BIRTH_DATE = USER__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Matriculation number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRICULATION_NUMBER = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thesis defended</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__THESIS_DEFENDED = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enrolled courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ENROLLED_COURSES = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Booked calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__BOOKED_CALLS = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transcripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__TRANSCRIPTS = USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.DepartmentImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__WEBSITE = 0;

	/**
	 * The feature id for the '<em><b>Offered courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__OFFERED_COURSES = 1;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__UNIVERSITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Related news</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__RELATED_NEWS = 4;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl <em>Degree Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.DegreeCourseImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getDegreeCourse()
	 * @generated
	 */
	int DEGREE_COURSE = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Reference year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__REFERENCE_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Cfu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__CFU = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__DEPARTMENT = 7;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__COORDINATOR = 8;

	/**
	 * The feature id for the '<em><b>Enrolled students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__ENROLLED_STUDENTS = 9;

	/**
	 * The feature id for the '<em><b>Course catalogue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__COURSE_CATALOGUE = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE__TYPE = 11;

	/**
	 * The number of structural features of the '<em>Degree Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Cfu Between Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Degree Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.ThesisImpl <em>Thesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.ThesisImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getThesis()
	 * @generated
	 */
	int THESIS = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__SUPERVISOR = 3;

	/**
	 * The feature id for the '<em><b>Degree course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS__DEGREE_COURSE = 4;

	/**
	 * The number of structural features of the '<em>Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Check If Enough Credits To Graduate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS___CHECK_IF_ENOUGH_CREDITS_TO_GRADUATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.CourseImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 7;

	/**
	 * The feature id for the '<em><b>Id course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ID_COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Cfu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CFU = 3;

	/**
	 * The feature id for the '<em><b>Credit type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDIT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__YEAR = 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PERIOD = 6;

	/**
	 * The feature id for the '<em><b>Teachers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TEACHERS = 7;

	/**
	 * The feature id for the '<em><b>Degree courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEGREE_COURSES = 8;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CALLS = 9;

	/**
	 * The feature id for the '<em><b>Students grades</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDENTS_GRADES = 10;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Cfu Course Greater Than</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___CFU_COURSE_GREATER_THAN__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.ExaminationCallImpl <em>Examination Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.ExaminationCallImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getExaminationCall()
	 * @generated
	 */
	int EXAMINATION_CALL = 8;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL__DATE = 0;

	/**
	 * The feature id for the '<em><b>Classroom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL__CLASSROOM = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL__COURSE = 4;

	/**
	 * The feature id for the '<em><b>Booked students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL__BOOKED_STUDENTS = 5;

	/**
	 * The number of structural features of the '<em>Examination Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Examination Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.PassingGradeImpl <em>Passing Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.PassingGradeImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPassingGrade()
	 * @generated
	 */
	int PASSING_GRADE = 9;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_GRADE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_GRADE__GRADE = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_GRADE__COURSE = 2;

	/**
	 * The feature id for the '<em><b>Student</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_GRADE__STUDENT = 3;

	/**
	 * The number of structural features of the '<em>Passing Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_GRADE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Must Be Sufficient If Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_GRADE___MUST_BE_SUFFICIENT_IF_DEFINED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Passing Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_GRADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.CareerImpl <em>Career</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.CareerImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCareer()
	 * @generated
	 */
	int CAREER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Student</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER__STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Degree course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER__DEGREE_COURSE = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER__COURSES = 3;

	/**
	 * The number of structural features of the '<em>Career</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Passed All Exams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER___PASSED_ALL_EXAMS = 0;

	/**
	 * The number of operations of the '<em>Career</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.NewsImpl <em>News</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.NewsImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getNews()
	 * @generated
	 */
	int NEWS = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Publication date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__PUBLICATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__BODY = 4;

	/**
	 * The number of structural features of the '<em>News</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>News</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.ContainerImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Universities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__UNIVERSITIES = 0;

	/**
	 * The feature id for the '<em><b>Professors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PROFESSORS = 1;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STUDENTS = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COURSES = 3;

	/**
	 * The feature id for the '<em><b>Model name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MODEL_NAME = 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.PostGraduateCourseImpl <em>Post Graduate Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.PostGraduateCourseImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPostGraduateCourse()
	 * @generated
	 */
	int POST_GRADUATE_COURSE = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__CODE = DEGREE_COURSE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__NAME = DEGREE_COURSE__NAME;

	/**
	 * The feature id for the '<em><b>Reference year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__REFERENCE_YEAR = DEGREE_COURSE__REFERENCE_YEAR;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__DURATION = DEGREE_COURSE__DURATION;

	/**
	 * The feature id for the '<em><b>Cfu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__CFU = DEGREE_COURSE__CFU;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__DESCRIPTION = DEGREE_COURSE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__LANGUAGE = DEGREE_COURSE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__DEPARTMENT = DEGREE_COURSE__DEPARTMENT;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__COORDINATOR = DEGREE_COURSE__COORDINATOR;

	/**
	 * The feature id for the '<em><b>Enrolled students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__ENROLLED_STUDENTS = DEGREE_COURSE__ENROLLED_STUDENTS;

	/**
	 * The feature id for the '<em><b>Course catalogue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__COURSE_CATALOGUE = DEGREE_COURSE__COURSE_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE__TYPE = DEGREE_COURSE__TYPE;

	/**
	 * The number of structural features of the '<em>Post Graduate Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE_FEATURE_COUNT = DEGREE_COURSE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Cfu Between Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP = DEGREE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Post Graduate Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_GRADUATE_COURSE_OPERATION_COUNT = DEGREE_COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.PhDImpl <em>Ph D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.PhDImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPhD()
	 * @generated
	 */
	int PH_D = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__CODE = POST_GRADUATE_COURSE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__NAME = POST_GRADUATE_COURSE__NAME;

	/**
	 * The feature id for the '<em><b>Reference year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__REFERENCE_YEAR = POST_GRADUATE_COURSE__REFERENCE_YEAR;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__DURATION = POST_GRADUATE_COURSE__DURATION;

	/**
	 * The feature id for the '<em><b>Cfu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__CFU = POST_GRADUATE_COURSE__CFU;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__DESCRIPTION = POST_GRADUATE_COURSE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__LANGUAGE = POST_GRADUATE_COURSE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__DEPARTMENT = POST_GRADUATE_COURSE__DEPARTMENT;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__COORDINATOR = POST_GRADUATE_COURSE__COORDINATOR;

	/**
	 * The feature id for the '<em><b>Enrolled students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__ENROLLED_STUDENTS = POST_GRADUATE_COURSE__ENROLLED_STUDENTS;

	/**
	 * The feature id for the '<em><b>Course catalogue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__COURSE_CATALOGUE = POST_GRADUATE_COURSE__COURSE_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__TYPE = POST_GRADUATE_COURSE__TYPE;

	/**
	 * The feature id for the '<em><b>Research Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D__RESEARCH_FIELD = POST_GRADUATE_COURSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ph D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D_FEATURE_COUNT = POST_GRADUATE_COURSE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Cfu Between Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP = POST_GRADUATE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Ph D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PH_D_OPERATION_COUNT = POST_GRADUATE_COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.impl.MasterImpl <em>Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.impl.MasterImpl
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getMaster()
	 * @generated
	 */
	int MASTER = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__CODE = POST_GRADUATE_COURSE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__NAME = POST_GRADUATE_COURSE__NAME;

	/**
	 * The feature id for the '<em><b>Reference year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__REFERENCE_YEAR = POST_GRADUATE_COURSE__REFERENCE_YEAR;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__DURATION = POST_GRADUATE_COURSE__DURATION;

	/**
	 * The feature id for the '<em><b>Cfu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__CFU = POST_GRADUATE_COURSE__CFU;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__DESCRIPTION = POST_GRADUATE_COURSE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__LANGUAGE = POST_GRADUATE_COURSE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__DEPARTMENT = POST_GRADUATE_COURSE__DEPARTMENT;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__COORDINATOR = POST_GRADUATE_COURSE__COORDINATOR;

	/**
	 * The feature id for the '<em><b>Enrolled students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__ENROLLED_STUDENTS = POST_GRADUATE_COURSE__ENROLLED_STUDENTS;

	/**
	 * The feature id for the '<em><b>Course catalogue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__COURSE_CATALOGUE = POST_GRADUATE_COURSE__COURSE_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__TYPE = POST_GRADUATE_COURSE__TYPE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__LEVEL = POST_GRADUATE_COURSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FEATURE_COUNT = POST_GRADUATE_COURSE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Cfu Between Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP = POST_GRADUATE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_OPERATION_COUNT = POST_GRADUATE_COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.ThesisType <em>Thesis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.ThesisType
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getThesisType()
	 * @generated
	 */
	int THESIS_TYPE = 16;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.CreditType <em>Credit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.CreditType
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCreditType()
	 * @generated
	 */
	int CREDIT_TYPE = 17;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.CoursePeriod <em>Course Period</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.CoursePeriod
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCoursePeriod()
	 * @generated
	 */
	int COURSE_PERIOD = 18;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.ExamType <em>Exam Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.ExamType
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getExamType()
	 * @generated
	 */
	int EXAM_TYPE = 19;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.PostGraduateLevel <em>Post Graduate Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.PostGraduateLevel
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPostGraduateLevel()
	 * @generated
	 */
	int POST_GRADUATE_LEVEL = 20;


	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW4_old.DegreeCourseType <em>Degree Course Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4_old.DegreeCourseType
	 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getDegreeCourseType()
	 * @generated
	 */
	int DEGREE_COURSE_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see daGiMa_MDE_HW4_old.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW4_old.University#getRector <em>Rector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rector</em>'.
	 * @see daGiMa_MDE_HW4_old.University#getRector()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Rector();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.University#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see daGiMa_MDE_HW4_old.University#getDepartments()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Departments();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW4_old.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see daGiMa_MDE_HW4_old.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Professor#getOffice_telephone <em>Office telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office telephone</em>'.
	 * @see daGiMa_MDE_HW4_old.Professor#getOffice_telephone()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Office_telephone();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Professor#getOrcid <em>Orcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orcid</em>'.
	 * @see daGiMa_MDE_HW4_old.Professor#getOrcid()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Orcid();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Professor#getCoordinated_degree_courses <em>Coordinated degree courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coordinated degree courses</em>'.
	 * @see daGiMa_MDE_HW4_old.Professor#getCoordinated_degree_courses()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Coordinated_degree_courses();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Professor#getSupervised_thesis <em>Supervised thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supervised thesis</em>'.
	 * @see daGiMa_MDE_HW4_old.Professor#getSupervised_thesis()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Supervised_thesis();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Professor#getTaught_courses <em>Taught courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Taught courses</em>'.
	 * @see daGiMa_MDE_HW4_old.Professor#getTaught_courses()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Taught_courses();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Professor#getNews_posted <em>News posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>News posted</em>'.
	 * @see daGiMa_MDE_HW4_old.Professor#getNews_posted()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_News_posted();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW4_old.Professor#totalCfuTaught() <em>Total Cfu Taught</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Cfu Taught</em>' operation.
	 * @see daGiMa_MDE_HW4_old.Professor#totalCfuTaught()
	 * @generated
	 */
	EOperation getProfessor__TotalCfuTaught();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW4_old.Professor#satisfyMinimalCfuRequirement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Satisfy Minimal Cfu Requirement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Satisfy Minimal Cfu Requirement</em>' operation.
	 * @see daGiMa_MDE_HW4_old.Professor#satisfyMinimalCfuRequirement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProfessor__SatisfyMinimalCfuRequirement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see daGiMa_MDE_HW4_old.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Student#getMatriculation_number <em>Matriculation number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matriculation number</em>'.
	 * @see daGiMa_MDE_HW4_old.Student#getMatriculation_number()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Matriculation_number();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Student#getThesis_defended <em>Thesis defended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thesis defended</em>'.
	 * @see daGiMa_MDE_HW4_old.Student#getThesis_defended()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Thesis_defended();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Student#getEnrolled_courses <em>Enrolled courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled courses</em>'.
	 * @see daGiMa_MDE_HW4_old.Student#getEnrolled_courses()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Enrolled_courses();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Student#getBooked_calls <em>Booked calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booked calls</em>'.
	 * @see daGiMa_MDE_HW4_old.Student#getBooked_calls()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Booked_calls();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Student#getTranscripts <em>Transcripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transcripts</em>'.
	 * @see daGiMa_MDE_HW4_old.Student#getTranscripts()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Transcripts();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see daGiMa_MDE_HW4_old.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW4_old.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see daGiMa_MDE_HW4_old.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see daGiMa_MDE_HW4_old.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.User#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see daGiMa_MDE_HW4_old.User#getTelephone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.User#getBirth_date <em>Birth date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth date</em>'.
	 * @see daGiMa_MDE_HW4_old.User#getBirth_date()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Birth_date();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see daGiMa_MDE_HW4_old.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Department#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see daGiMa_MDE_HW4_old.Department#getWebsite()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Website();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Department#getOffered_courses <em>Offered courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered courses</em>'.
	 * @see daGiMa_MDE_HW4_old.Department#getOffered_courses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Offered_courses();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW4_old.Department#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see daGiMa_MDE_HW4_old.Department#getUniversity()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_University();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW4_old.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Department#getRelated_news <em>Related news</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related news</em>'.
	 * @see daGiMa_MDE_HW4_old.Department#getRelated_news()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Related_news();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.DegreeCourse <em>Degree Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree Course</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse
	 * @generated
	 */
	EClass getDegreeCourse();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getCode()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.DegreeCourse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getName()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.DegreeCourse#getReference_year <em>Reference year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference year</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getReference_year()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Reference_year();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.DegreeCourse#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getDuration()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Duration();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCfu <em>Cfu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfu</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getCfu()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Cfu();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.DegreeCourse#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getDescription()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Description();

	/**
	 * Returns the meta object for the attribute list '{@link daGiMa_MDE_HW4_old.DegreeCourse#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getLanguage()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Language();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW4_old.DegreeCourse#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getDepartment()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Department();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getCoordinator()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Coordinator();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.DegreeCourse#getEnrolled_students <em>Enrolled students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled students</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getEnrolled_students()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Enrolled_students();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.DegreeCourse#getCourse_catalogue <em>Course catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course catalogue</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getCourse_catalogue()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Course_catalogue();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.DegreeCourse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#getType()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Type();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW4_old.DegreeCourse#cfuBetweenValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cfu Between Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cfu Between Values</em>' operation.
	 * @see daGiMa_MDE_HW4_old.DegreeCourse#cfuBetweenValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDegreeCourse__CfuBetweenValues__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Thesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis</em>'.
	 * @see daGiMa_MDE_HW4_old.Thesis
	 * @generated
	 */
	EClass getThesis();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Thesis#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see daGiMa_MDE_HW4_old.Thesis#getTitle()
	 * @see #getThesis()
	 * @generated
	 */
	EAttribute getThesis_Title();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Thesis#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daGiMa_MDE_HW4_old.Thesis#getType()
	 * @see #getThesis()
	 * @generated
	 */
	EAttribute getThesis_Type();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW4_old.Thesis#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Student</em>'.
	 * @see daGiMa_MDE_HW4_old.Thesis#getStudent()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Student();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW4_old.Thesis#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisor</em>'.
	 * @see daGiMa_MDE_HW4_old.Thesis#getSupervisor()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Supervisor();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW4_old.Thesis#getDegree_course <em>Degree course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degree course</em>'.
	 * @see daGiMa_MDE_HW4_old.Thesis#getDegree_course()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Degree_course();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW4_old.Thesis#checkIfEnoughCreditsToGraduate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check If Enough Credits To Graduate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check If Enough Credits To Graduate</em>' operation.
	 * @see daGiMa_MDE_HW4_old.Thesis#checkIfEnoughCreditsToGraduate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getThesis__CheckIfEnoughCreditsToGraduate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see daGiMa_MDE_HW4_old.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Course#getId_course <em>Id course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id course</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getId_course()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Id_course();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute list '{@link daGiMa_MDE_HW4_old.Course#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getLanguage()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Language();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Course#getCfu <em>Cfu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfu</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getCfu()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Cfu();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Course#getCredit_type <em>Credit type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit type</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getCredit_type()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credit_type();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Course#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getYear()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Year();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Course#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getPeriod()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Period();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Course#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teachers</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getTeachers()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Teachers();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Course#getDegree_courses <em>Degree courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Degree courses</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getDegree_courses()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Degree_courses();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Course#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getCalls()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Calls();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.Course#getStudents_grades <em>Students grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students grades</em>'.
	 * @see daGiMa_MDE_HW4_old.Course#getStudents_grades()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Students_grades();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW4_old.Course#cfuCourseGreaterThan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cfu Course Greater Than</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cfu Course Greater Than</em>' operation.
	 * @see daGiMa_MDE_HW4_old.Course#cfuCourseGreaterThan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourse__CfuCourseGreaterThan__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.ExaminationCall <em>Examination Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination Call</em>'.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall
	 * @generated
	 */
	EClass getExaminationCall();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.ExaminationCall#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall#getDate()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Date();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.ExaminationCall#getClassroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classroom</em>'.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall#getClassroom()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Classroom();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.ExaminationCall#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall#getType()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Type();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.ExaminationCall#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall#getDescription()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Description();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW4_old.ExaminationCall#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall#getCourse()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EReference getExaminationCall_Course();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW4_old.ExaminationCall#getBooked_students <em>Booked students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booked students</em>'.
	 * @see daGiMa_MDE_HW4_old.ExaminationCall#getBooked_students()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EReference getExaminationCall_Booked_students();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.PassingGrade <em>Passing Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passing Grade</em>'.
	 * @see daGiMa_MDE_HW4_old.PassingGrade
	 * @generated
	 */
	EClass getPassingGrade();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.PassingGrade#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see daGiMa_MDE_HW4_old.PassingGrade#getDate()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EAttribute getPassingGrade_Date();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.PassingGrade#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see daGiMa_MDE_HW4_old.PassingGrade#getGrade()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EAttribute getPassingGrade_Grade();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW4_old.PassingGrade#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see daGiMa_MDE_HW4_old.PassingGrade#getCourse()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EReference getPassingGrade_Course();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW4_old.PassingGrade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Student</em>'.
	 * @see daGiMa_MDE_HW4_old.PassingGrade#getStudent()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EReference getPassingGrade_Student();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW4_old.PassingGrade#mustBeSufficientIfDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Be Sufficient If Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Sufficient If Defined</em>' operation.
	 * @see daGiMa_MDE_HW4_old.PassingGrade#mustBeSufficientIfDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Career <em>Career</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Career</em>'.
	 * @see daGiMa_MDE_HW4_old.Career
	 * @generated
	 */
	EClass getCareer();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Career#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW4_old.Career#getName()
	 * @see #getCareer()
	 * @generated
	 */
	EAttribute getCareer_Name();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW4_old.Career#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Student</em>'.
	 * @see daGiMa_MDE_HW4_old.Career#getStudent()
	 * @see #getCareer()
	 * @generated
	 */
	EReference getCareer_Student();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW4_old.Career#getDegree_course <em>Degree course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degree course</em>'.
	 * @see daGiMa_MDE_HW4_old.Career#getDegree_course()
	 * @see #getCareer()
	 * @generated
	 */
	EReference getCareer_Degree_course();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Career#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see daGiMa_MDE_HW4_old.Career#getCourses()
	 * @see #getCareer()
	 * @generated
	 */
	EReference getCareer_Courses();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW4_old.Career#passedAllExams() <em>Passed All Exams</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Passed All Exams</em>' operation.
	 * @see daGiMa_MDE_HW4_old.Career#passedAllExams()
	 * @generated
	 */
	EOperation getCareer__PassedAllExams();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.News <em>News</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>News</em>'.
	 * @see daGiMa_MDE_HW4_old.News
	 * @generated
	 */
	EClass getNews();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.News#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see daGiMa_MDE_HW4_old.News#getTitle()
	 * @see #getNews()
	 * @generated
	 */
	EAttribute getNews_Title();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.News#getPublication_date <em>Publication date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication date</em>'.
	 * @see daGiMa_MDE_HW4_old.News#getPublication_date()
	 * @see #getNews()
	 * @generated
	 */
	EAttribute getNews_Publication_date();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW4_old.News#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Department</em>'.
	 * @see daGiMa_MDE_HW4_old.News#getDepartment()
	 * @see #getNews()
	 * @generated
	 */
	EReference getNews_Department();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW4_old.News#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Author</em>'.
	 * @see daGiMa_MDE_HW4_old.News#getAuthor()
	 * @see #getNews()
	 * @generated
	 */
	EReference getNews_Author();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.News#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see daGiMa_MDE_HW4_old.News#getBody()
	 * @see #getNews()
	 * @generated
	 */
	EAttribute getNews_Body();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see daGiMa_MDE_HW4_old.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Container#getUniversities <em>Universities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Universities</em>'.
	 * @see daGiMa_MDE_HW4_old.Container#getUniversities()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Universities();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Container#getProfessors <em>Professors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Professors</em>'.
	 * @see daGiMa_MDE_HW4_old.Container#getProfessors()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Professors();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Container#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see daGiMa_MDE_HW4_old.Container#getStudents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Students();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW4_old.Container#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see daGiMa_MDE_HW4_old.Container#getCourses()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Courses();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Container#getModel_name <em>Model name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model name</em>'.
	 * @see daGiMa_MDE_HW4_old.Container#getModel_name()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Model_name();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.PostGraduateCourse <em>Post Graduate Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Graduate Course</em>'.
	 * @see daGiMa_MDE_HW4_old.PostGraduateCourse
	 * @generated
	 */
	EClass getPostGraduateCourse();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.PhD <em>Ph D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ph D</em>'.
	 * @see daGiMa_MDE_HW4_old.PhD
	 * @generated
	 */
	EClass getPhD();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.PhD#getResearchField <em>Research Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Research Field</em>'.
	 * @see daGiMa_MDE_HW4_old.PhD#getResearchField()
	 * @see #getPhD()
	 * @generated
	 */
	EAttribute getPhD_ResearchField();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW4_old.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master</em>'.
	 * @see daGiMa_MDE_HW4_old.Master
	 * @generated
	 */
	EClass getMaster();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW4_old.Master#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see daGiMa_MDE_HW4_old.Master#getLevel()
	 * @see #getMaster()
	 * @generated
	 */
	EAttribute getMaster_Level();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW4_old.ThesisType <em>Thesis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thesis Type</em>'.
	 * @see daGiMa_MDE_HW4_old.ThesisType
	 * @generated
	 */
	EEnum getThesisType();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW4_old.CreditType <em>Credit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credit Type</em>'.
	 * @see daGiMa_MDE_HW4_old.CreditType
	 * @generated
	 */
	EEnum getCreditType();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW4_old.CoursePeriod <em>Course Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Period</em>'.
	 * @see daGiMa_MDE_HW4_old.CoursePeriod
	 * @generated
	 */
	EEnum getCoursePeriod();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW4_old.ExamType <em>Exam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exam Type</em>'.
	 * @see daGiMa_MDE_HW4_old.ExamType
	 * @generated
	 */
	EEnum getExamType();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW4_old.PostGraduateLevel <em>Post Graduate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Post Graduate Level</em>'.
	 * @see daGiMa_MDE_HW4_old.PostGraduateLevel
	 * @generated
	 */
	EEnum getPostGraduateLevel();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW4_old.DegreeCourseType <em>Degree Course Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Degree Course Type</em>'.
	 * @see daGiMa_MDE_HW4_old.DegreeCourseType
	 * @generated
	 */
	EEnum getDegreeCourseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DaGiMa_MDE_HW4_oldFactory getDaGiMa_MDE_HW4_oldFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.UniversityImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Rector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__RECTOR = eINSTANCE.getUniversity_Rector();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__DEPARTMENTS = eINSTANCE.getUniversity_Departments();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.ProfessorImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Office telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__OFFICE_TELEPHONE = eINSTANCE.getProfessor_Office_telephone();

		/**
		 * The meta object literal for the '<em><b>Orcid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__ORCID = eINSTANCE.getProfessor_Orcid();

		/**
		 * The meta object literal for the '<em><b>Coordinated degree courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__COORDINATED_DEGREE_COURSES = eINSTANCE.getProfessor_Coordinated_degree_courses();

		/**
		 * The meta object literal for the '<em><b>Supervised thesis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__SUPERVISED_THESIS = eINSTANCE.getProfessor_Supervised_thesis();

		/**
		 * The meta object literal for the '<em><b>Taught courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__TAUGHT_COURSES = eINSTANCE.getProfessor_Taught_courses();

		/**
		 * The meta object literal for the '<em><b>News posted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__NEWS_POSTED = eINSTANCE.getProfessor_News_posted();

		/**
		 * The meta object literal for the '<em><b>Total Cfu Taught</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___TOTAL_CFU_TAUGHT = eINSTANCE.getProfessor__TotalCfuTaught();

		/**
		 * The meta object literal for the '<em><b>Satisfy Minimal Cfu Requirement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___SATISFY_MINIMAL_CFU_REQUIREMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProfessor__SatisfyMinimalCfuRequirement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.StudentImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Matriculation number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__MATRICULATION_NUMBER = eINSTANCE.getStudent_Matriculation_number();

		/**
		 * The meta object literal for the '<em><b>Thesis defended</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__THESIS_DEFENDED = eINSTANCE.getStudent_Thesis_defended();

		/**
		 * The meta object literal for the '<em><b>Enrolled courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ENROLLED_COURSES = eINSTANCE.getStudent_Enrolled_courses();

		/**
		 * The meta object literal for the '<em><b>Booked calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__BOOKED_CALLS = eINSTANCE.getStudent_Booked_calls();

		/**
		 * The meta object literal for the '<em><b>Transcripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__TRANSCRIPTS = eINSTANCE.getStudent_Transcripts();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.UserImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SURNAME = eINSTANCE.getUser_Surname();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__TELEPHONE = eINSTANCE.getUser_Telephone();

		/**
		 * The meta object literal for the '<em><b>Birth date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIRTH_DATE = eINSTANCE.getUser_Birth_date();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.DepartmentImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__WEBSITE = eINSTANCE.getDepartment_Website();

		/**
		 * The meta object literal for the '<em><b>Offered courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__OFFERED_COURSES = eINSTANCE.getDepartment_Offered_courses();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__UNIVERSITY = eINSTANCE.getDepartment_University();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Related news</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__RELATED_NEWS = eINSTANCE.getDepartment_Related_news();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl <em>Degree Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.DegreeCourseImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getDegreeCourse()
		 * @generated
		 */
		EClass DEGREE_COURSE = eINSTANCE.getDegreeCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__CODE = eINSTANCE.getDegreeCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__NAME = eINSTANCE.getDegreeCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Reference year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__REFERENCE_YEAR = eINSTANCE.getDegreeCourse_Reference_year();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__DURATION = eINSTANCE.getDegreeCourse_Duration();

		/**
		 * The meta object literal for the '<em><b>Cfu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__CFU = eINSTANCE.getDegreeCourse_Cfu();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__DESCRIPTION = eINSTANCE.getDegreeCourse_Description();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__LANGUAGE = eINSTANCE.getDegreeCourse_Language();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_COURSE__DEPARTMENT = eINSTANCE.getDegreeCourse_Department();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_COURSE__COORDINATOR = eINSTANCE.getDegreeCourse_Coordinator();

		/**
		 * The meta object literal for the '<em><b>Enrolled students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_COURSE__ENROLLED_STUDENTS = eINSTANCE.getDegreeCourse_Enrolled_students();

		/**
		 * The meta object literal for the '<em><b>Course catalogue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_COURSE__COURSE_CATALOGUE = eINSTANCE.getDegreeCourse_Course_catalogue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_COURSE__TYPE = eINSTANCE.getDegreeCourse_Type();

		/**
		 * The meta object literal for the '<em><b>Cfu Between Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEGREE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDegreeCourse__CfuBetweenValues__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.ThesisImpl <em>Thesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.ThesisImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getThesis()
		 * @generated
		 */
		EClass THESIS = eINSTANCE.getThesis();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS__TITLE = eINSTANCE.getThesis_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THESIS__TYPE = eINSTANCE.getThesis_Type();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__STUDENT = eINSTANCE.getThesis_Student();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__SUPERVISOR = eINSTANCE.getThesis_Supervisor();

		/**
		 * The meta object literal for the '<em><b>Degree course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THESIS__DEGREE_COURSE = eINSTANCE.getThesis_Degree_course();

		/**
		 * The meta object literal for the '<em><b>Check If Enough Credits To Graduate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THESIS___CHECK_IF_ENOUGH_CREDITS_TO_GRADUATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getThesis__CheckIfEnoughCreditsToGraduate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.CourseImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Id course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__ID_COURSE = eINSTANCE.getCourse_Id_course();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LANGUAGE = eINSTANCE.getCourse_Language();

		/**
		 * The meta object literal for the '<em><b>Cfu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CFU = eINSTANCE.getCourse_Cfu();

		/**
		 * The meta object literal for the '<em><b>Credit type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDIT_TYPE = eINSTANCE.getCourse_Credit_type();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__YEAR = eINSTANCE.getCourse_Year();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__PERIOD = eINSTANCE.getCourse_Period();

		/**
		 * The meta object literal for the '<em><b>Teachers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__TEACHERS = eINSTANCE.getCourse_Teachers();

		/**
		 * The meta object literal for the '<em><b>Degree courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__DEGREE_COURSES = eINSTANCE.getCourse_Degree_courses();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__CALLS = eINSTANCE.getCourse_Calls();

		/**
		 * The meta object literal for the '<em><b>Students grades</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__STUDENTS_GRADES = eINSTANCE.getCourse_Students_grades();

		/**
		 * The meta object literal for the '<em><b>Cfu Course Greater Than</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___CFU_COURSE_GREATER_THAN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCourse__CfuCourseGreaterThan__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.ExaminationCallImpl <em>Examination Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.ExaminationCallImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getExaminationCall()
		 * @generated
		 */
		EClass EXAMINATION_CALL = eINSTANCE.getExaminationCall();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_CALL__DATE = eINSTANCE.getExaminationCall_Date();

		/**
		 * The meta object literal for the '<em><b>Classroom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_CALL__CLASSROOM = eINSTANCE.getExaminationCall_Classroom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_CALL__TYPE = eINSTANCE.getExaminationCall_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_CALL__DESCRIPTION = eINSTANCE.getExaminationCall_Description();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION_CALL__COURSE = eINSTANCE.getExaminationCall_Course();

		/**
		 * The meta object literal for the '<em><b>Booked students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION_CALL__BOOKED_STUDENTS = eINSTANCE.getExaminationCall_Booked_students();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.PassingGradeImpl <em>Passing Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.PassingGradeImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPassingGrade()
		 * @generated
		 */
		EClass PASSING_GRADE = eINSTANCE.getPassingGrade();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSING_GRADE__DATE = eINSTANCE.getPassingGrade_Date();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSING_GRADE__GRADE = eINSTANCE.getPassingGrade_Grade();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSING_GRADE__COURSE = eINSTANCE.getPassingGrade_Course();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSING_GRADE__STUDENT = eINSTANCE.getPassingGrade_Student();

		/**
		 * The meta object literal for the '<em><b>Must Be Sufficient If Defined</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PASSING_GRADE___MUST_BE_SUFFICIENT_IF_DEFINED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.CareerImpl <em>Career</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.CareerImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCareer()
		 * @generated
		 */
		EClass CAREER = eINSTANCE.getCareer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAREER__NAME = eINSTANCE.getCareer_Name();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAREER__STUDENT = eINSTANCE.getCareer_Student();

		/**
		 * The meta object literal for the '<em><b>Degree course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAREER__DEGREE_COURSE = eINSTANCE.getCareer_Degree_course();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAREER__COURSES = eINSTANCE.getCareer_Courses();

		/**
		 * The meta object literal for the '<em><b>Passed All Exams</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAREER___PASSED_ALL_EXAMS = eINSTANCE.getCareer__PassedAllExams();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.NewsImpl <em>News</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.NewsImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getNews()
		 * @generated
		 */
		EClass NEWS = eINSTANCE.getNews();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEWS__TITLE = eINSTANCE.getNews_Title();

		/**
		 * The meta object literal for the '<em><b>Publication date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEWS__PUBLICATION_DATE = eINSTANCE.getNews_Publication_date();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEWS__DEPARTMENT = eINSTANCE.getNews_Department();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEWS__AUTHOR = eINSTANCE.getNews_Author();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEWS__BODY = eINSTANCE.getNews_Body();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.ContainerImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Universities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__UNIVERSITIES = eINSTANCE.getContainer_Universities();

		/**
		 * The meta object literal for the '<em><b>Professors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PROFESSORS = eINSTANCE.getContainer_Professors();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__STUDENTS = eINSTANCE.getContainer_Students();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__COURSES = eINSTANCE.getContainer_Courses();

		/**
		 * The meta object literal for the '<em><b>Model name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MODEL_NAME = eINSTANCE.getContainer_Model_name();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.PostGraduateCourseImpl <em>Post Graduate Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.PostGraduateCourseImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPostGraduateCourse()
		 * @generated
		 */
		EClass POST_GRADUATE_COURSE = eINSTANCE.getPostGraduateCourse();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.PhDImpl <em>Ph D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.PhDImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPhD()
		 * @generated
		 */
		EClass PH_D = eINSTANCE.getPhD();

		/**
		 * The meta object literal for the '<em><b>Research Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PH_D__RESEARCH_FIELD = eINSTANCE.getPhD_ResearchField();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.impl.MasterImpl <em>Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.impl.MasterImpl
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getMaster()
		 * @generated
		 */
		EClass MASTER = eINSTANCE.getMaster();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER__LEVEL = eINSTANCE.getMaster_Level();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.ThesisType <em>Thesis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.ThesisType
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getThesisType()
		 * @generated
		 */
		EEnum THESIS_TYPE = eINSTANCE.getThesisType();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.CreditType <em>Credit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.CreditType
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCreditType()
		 * @generated
		 */
		EEnum CREDIT_TYPE = eINSTANCE.getCreditType();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.CoursePeriod <em>Course Period</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.CoursePeriod
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getCoursePeriod()
		 * @generated
		 */
		EEnum COURSE_PERIOD = eINSTANCE.getCoursePeriod();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.ExamType <em>Exam Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.ExamType
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getExamType()
		 * @generated
		 */
		EEnum EXAM_TYPE = eINSTANCE.getExamType();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.PostGraduateLevel <em>Post Graduate Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.PostGraduateLevel
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getPostGraduateLevel()
		 * @generated
		 */
		EEnum POST_GRADUATE_LEVEL = eINSTANCE.getPostGraduateLevel();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW4_old.DegreeCourseType <em>Degree Course Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW4_old.DegreeCourseType
		 * @see daGiMa_MDE_HW4_old.impl.DaGiMa_MDE_HW4_oldPackageImpl#getDegreeCourseType()
		 * @generated
		 */
		EEnum DEGREE_COURSE_TYPE = eINSTANCE.getDegreeCourseType();

	}

} //DaGiMa_MDE_HW4_oldPackage
