/**
 */
package daGiMa_MDE_HW3;

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
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface DaGiMa_MDE_HW3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "daGiMa_MDE_HW3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dagima_mde_hw3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dagima_mde_hw3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DaGiMa_MDE_HW3Package eINSTANCE = daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl.init();

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.UniversityImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getUniversity()
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
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.UserImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getUser()
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
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.ProfessorImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getProfessor()
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
	 * The feature id for the '<em><b>News posted</b></em>' reference list.
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
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.StudentImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getStudent()
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
	 * The feature id for the '<em><b>Matriculation number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRICULATION_NUMBER = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thesis defended</b></em>' reference list.
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
	 * The feature id for the '<em><b>Transcripts</b></em>' reference list.
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
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.DepartmentImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getDepartment()
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
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.DegreeCourseImpl <em>Degree Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.DegreeCourseImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getDegreeCourse()
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
	 * The number of structural features of the '<em>Degree Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Degree Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.ThesisImpl <em>Thesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.ThesisImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getThesis()
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
	 * The feature id for the '<em><b>Student</b></em>' reference.
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
	 * The number of operations of the '<em>Thesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THESIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.CourseImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

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
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.ExaminationCallImpl <em>Examination Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.ExaminationCallImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getExaminationCall()
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
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.PassingGradeImpl <em>Passing Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.PassingGradeImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getPassingGrade()
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
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.CareerImpl <em>Career</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.CareerImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCareer()
	 * @generated
	 */
	int CAREER = 10;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER__STUDENT = 0;

	/**
	 * The feature id for the '<em><b>Degree course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER__DEGREE_COURSE = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER__COURSES = 2;

	/**
	 * The number of structural features of the '<em>Career</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Career</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAREER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.NewsImpl <em>News</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.NewsImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getNews()
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
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__AUTHOR = 3;

	/**
	 * The number of structural features of the '<em>News</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>News</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl <em>Extra Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.ExtraInfoImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getExtraInfo()
	 * @generated
	 */
	int EXTRA_INFO = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Lower multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO__LOWER_MULTIPLICITY = 3;

	/**
	 * The feature id for the '<em><b>Higher multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO__HIGHER_MULTIPLICITY = 4;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO__ENUM = 5;

	/**
	 * The number of structural features of the '<em>Extra Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Extra Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.impl.CustomEnumerationImpl <em>Custom Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.impl.CustomEnumerationImpl
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCustomEnumeration()
	 * @generated
	 */
	int CUSTOM_ENUMERATION = 13;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENUMERATION__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Custom Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENUMERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Custom Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENUMERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.ThesisType <em>Thesis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.ThesisType
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getThesisType()
	 * @generated
	 */
	int THESIS_TYPE = 14;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.CreditType <em>Credit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.CreditType
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCreditType()
	 * @generated
	 */
	int CREDIT_TYPE = 15;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.CoursePeriod <em>Course Period</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.CoursePeriod
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCoursePeriod()
	 * @generated
	 */
	int COURSE_PERIOD = 16;

	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.ExamType <em>Exam Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.ExamType
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getExamType()
	 * @generated
	 */
	int EXAM_TYPE = 17;


	/**
	 * The meta object id for the '{@link daGiMa_MDE_HW3.MetadataType <em>Metadata Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW3.MetadataType
	 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see daGiMa_MDE_HW3.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.University#getRector <em>Rector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rector</em>'.
	 * @see daGiMa_MDE_HW3.University#getRector()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Rector();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW3.University#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see daGiMa_MDE_HW3.University#getDepartments()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Departments();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW3.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see daGiMa_MDE_HW3.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Professor#getOffice_telephone <em>Office telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office telephone</em>'.
	 * @see daGiMa_MDE_HW3.Professor#getOffice_telephone()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Office_telephone();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Professor#getOrcid <em>Orcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orcid</em>'.
	 * @see daGiMa_MDE_HW3.Professor#getOrcid()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Orcid();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Professor#getCoordinated_degree_courses <em>Coordinated degree courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coordinated degree courses</em>'.
	 * @see daGiMa_MDE_HW3.Professor#getCoordinated_degree_courses()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Coordinated_degree_courses();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Professor#getSupervised_thesis <em>Supervised thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supervised thesis</em>'.
	 * @see daGiMa_MDE_HW3.Professor#getSupervised_thesis()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Supervised_thesis();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Professor#getTaught_courses <em>Taught courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Taught courses</em>'.
	 * @see daGiMa_MDE_HW3.Professor#getTaught_courses()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Taught_courses();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Professor#getNews_posted <em>News posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>News posted</em>'.
	 * @see daGiMa_MDE_HW3.Professor#getNews_posted()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_News_posted();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see daGiMa_MDE_HW3.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Student#getMatriculation_number <em>Matriculation number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matriculation number</em>'.
	 * @see daGiMa_MDE_HW3.Student#getMatriculation_number()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Matriculation_number();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Student#getThesis_defended <em>Thesis defended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thesis defended</em>'.
	 * @see daGiMa_MDE_HW3.Student#getThesis_defended()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Thesis_defended();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Student#getEnrolled_courses <em>Enrolled courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled courses</em>'.
	 * @see daGiMa_MDE_HW3.Student#getEnrolled_courses()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Enrolled_courses();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Student#getBooked_calls <em>Booked calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booked calls</em>'.
	 * @see daGiMa_MDE_HW3.Student#getBooked_calls()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Booked_calls();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Student#getTranscripts <em>Transcripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transcripts</em>'.
	 * @see daGiMa_MDE_HW3.Student#getTranscripts()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Transcripts();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see daGiMa_MDE_HW3.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW3.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see daGiMa_MDE_HW3.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see daGiMa_MDE_HW3.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.User#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see daGiMa_MDE_HW3.User#getTelephone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Telephone();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see daGiMa_MDE_HW3.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Department#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see daGiMa_MDE_HW3.Department#getWebsite()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Website();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW3.Department#getOffered_courses <em>Offered courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered courses</em>'.
	 * @see daGiMa_MDE_HW3.Department#getOffered_courses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Offered_courses();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW3.Department#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see daGiMa_MDE_HW3.Department#getUniversity()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_University();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW3.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Department#getRelated_news <em>Related news</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related news</em>'.
	 * @see daGiMa_MDE_HW3.Department#getRelated_news()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Related_news();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.DegreeCourse <em>Degree Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree Course</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse
	 * @generated
	 */
	EClass getDegreeCourse();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.DegreeCourse#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getCode()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.DegreeCourse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getName()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.DegreeCourse#getReference_year <em>Reference year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference year</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getReference_year()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Reference_year();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.DegreeCourse#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getDuration()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Duration();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.DegreeCourse#getCfu <em>Cfu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfu</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getCfu()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Cfu();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.DegreeCourse#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getDescription()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Description();

	/**
	 * Returns the meta object for the attribute list '{@link daGiMa_MDE_HW3.DegreeCourse#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getLanguage()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EAttribute getDegreeCourse_Language();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW3.DegreeCourse#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getDepartment()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Department();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.DegreeCourse#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getCoordinator()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Coordinator();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.DegreeCourse#getEnrolled_students <em>Enrolled students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled students</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getEnrolled_students()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Enrolled_students();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.DegreeCourse#getCourse_catalogue <em>Course catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course catalogue</em>'.
	 * @see daGiMa_MDE_HW3.DegreeCourse#getCourse_catalogue()
	 * @see #getDegreeCourse()
	 * @generated
	 */
	EReference getDegreeCourse_Course_catalogue();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.Thesis <em>Thesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesis</em>'.
	 * @see daGiMa_MDE_HW3.Thesis
	 * @generated
	 */
	EClass getThesis();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Thesis#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see daGiMa_MDE_HW3.Thesis#getTitle()
	 * @see #getThesis()
	 * @generated
	 */
	EAttribute getThesis_Title();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Thesis#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daGiMa_MDE_HW3.Thesis#getType()
	 * @see #getThesis()
	 * @generated
	 */
	EAttribute getThesis_Type();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.Thesis#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see daGiMa_MDE_HW3.Thesis#getStudent()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Student();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.Thesis#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisor</em>'.
	 * @see daGiMa_MDE_HW3.Thesis#getSupervisor()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Supervisor();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.Thesis#getDegree_course <em>Degree course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degree course</em>'.
	 * @see daGiMa_MDE_HW3.Thesis#getDegree_course()
	 * @see #getThesis()
	 * @generated
	 */
	EReference getThesis_Degree_course();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see daGiMa_MDE_HW3.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see daGiMa_MDE_HW3.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW3.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute list '{@link daGiMa_MDE_HW3.Course#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see daGiMa_MDE_HW3.Course#getLanguage()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Language();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Course#getCfu <em>Cfu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfu</em>'.
	 * @see daGiMa_MDE_HW3.Course#getCfu()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Cfu();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Course#getCredit_type <em>Credit type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit type</em>'.
	 * @see daGiMa_MDE_HW3.Course#getCredit_type()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credit_type();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Course#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see daGiMa_MDE_HW3.Course#getYear()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Year();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.Course#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see daGiMa_MDE_HW3.Course#getPeriod()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Period();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Course#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teachers</em>'.
	 * @see daGiMa_MDE_HW3.Course#getTeachers()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Teachers();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Course#getDegree_courses <em>Degree courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Degree courses</em>'.
	 * @see daGiMa_MDE_HW3.Course#getDegree_courses()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Degree_courses();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW3.Course#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see daGiMa_MDE_HW3.Course#getCalls()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Calls();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.Course#getStudents_grades <em>Students grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students grades</em>'.
	 * @see daGiMa_MDE_HW3.Course#getStudents_grades()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Students_grades();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.ExaminationCall <em>Examination Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination Call</em>'.
	 * @see daGiMa_MDE_HW3.ExaminationCall
	 * @generated
	 */
	EClass getExaminationCall();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExaminationCall#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see daGiMa_MDE_HW3.ExaminationCall#getDate()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Date();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExaminationCall#getClassroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classroom</em>'.
	 * @see daGiMa_MDE_HW3.ExaminationCall#getClassroom()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Classroom();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExaminationCall#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daGiMa_MDE_HW3.ExaminationCall#getType()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Type();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExaminationCall#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see daGiMa_MDE_HW3.ExaminationCall#getDescription()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EAttribute getExaminationCall_Description();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW3.ExaminationCall#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see daGiMa_MDE_HW3.ExaminationCall#getCourse()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EReference getExaminationCall_Course();

	/**
	 * Returns the meta object for the reference list '{@link daGiMa_MDE_HW3.ExaminationCall#getBooked_students <em>Booked students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booked students</em>'.
	 * @see daGiMa_MDE_HW3.ExaminationCall#getBooked_students()
	 * @see #getExaminationCall()
	 * @generated
	 */
	EReference getExaminationCall_Booked_students();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.PassingGrade <em>Passing Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passing Grade</em>'.
	 * @see daGiMa_MDE_HW3.PassingGrade
	 * @generated
	 */
	EClass getPassingGrade();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.PassingGrade#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see daGiMa_MDE_HW3.PassingGrade#getDate()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EAttribute getPassingGrade_Date();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.PassingGrade#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see daGiMa_MDE_HW3.PassingGrade#getGrade()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EAttribute getPassingGrade_Grade();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.PassingGrade#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see daGiMa_MDE_HW3.PassingGrade#getCourse()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EReference getPassingGrade_Course();

	/**
	 * Returns the meta object for the container reference '{@link daGiMa_MDE_HW3.PassingGrade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Student</em>'.
	 * @see daGiMa_MDE_HW3.PassingGrade#getStudent()
	 * @see #getPassingGrade()
	 * @generated
	 */
	EReference getPassingGrade_Student();

	/**
	 * Returns the meta object for the '{@link daGiMa_MDE_HW3.PassingGrade#mustBeSufficientIfDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Be Sufficient If Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Sufficient If Defined</em>' operation.
	 * @see daGiMa_MDE_HW3.PassingGrade#mustBeSufficientIfDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.Career <em>Career</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Career</em>'.
	 * @see daGiMa_MDE_HW3.Career
	 * @generated
	 */
	EClass getCareer();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.Career#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see daGiMa_MDE_HW3.Career#getStudent()
	 * @see #getCareer()
	 * @generated
	 */
	EReference getCareer_Student();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.Career#getDegree_course <em>Degree course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degree course</em>'.
	 * @see daGiMa_MDE_HW3.Career#getDegree_course()
	 * @see #getCareer()
	 * @generated
	 */
	EReference getCareer_Degree_course();

	/**
	 * Returns the meta object for the containment reference list '{@link daGiMa_MDE_HW3.Career#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see daGiMa_MDE_HW3.Career#getCourses()
	 * @see #getCareer()
	 * @generated
	 */
	EReference getCareer_Courses();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.News <em>News</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>News</em>'.
	 * @see daGiMa_MDE_HW3.News
	 * @generated
	 */
	EClass getNews();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.News#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see daGiMa_MDE_HW3.News#getTitle()
	 * @see #getNews()
	 * @generated
	 */
	EAttribute getNews_Title();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.News#getPublication_date <em>Publication date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication date</em>'.
	 * @see daGiMa_MDE_HW3.News#getPublication_date()
	 * @see #getNews()
	 * @generated
	 */
	EAttribute getNews_Publication_date();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.News#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Department</em>'.
	 * @see daGiMa_MDE_HW3.News#getDepartment()
	 * @see #getNews()
	 * @generated
	 */
	EReference getNews_Department();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.News#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see daGiMa_MDE_HW3.News#getAuthor()
	 * @see #getNews()
	 * @generated
	 */
	EReference getNews_Author();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.ExtraInfo <em>Extra Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Info</em>'.
	 * @see daGiMa_MDE_HW3.ExtraInfo
	 * @generated
	 */
	EClass getExtraInfo();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExtraInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see daGiMa_MDE_HW3.ExtraInfo#getName()
	 * @see #getExtraInfo()
	 * @generated
	 */
	EAttribute getExtraInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExtraInfo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see daGiMa_MDE_HW3.ExtraInfo#getValue()
	 * @see #getExtraInfo()
	 * @generated
	 */
	EAttribute getExtraInfo_Value();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExtraInfo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see daGiMa_MDE_HW3.ExtraInfo#getType()
	 * @see #getExtraInfo()
	 * @generated
	 */
	EAttribute getExtraInfo_Type();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExtraInfo#getLower_multiplicity <em>Lower multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower multiplicity</em>'.
	 * @see daGiMa_MDE_HW3.ExtraInfo#getLower_multiplicity()
	 * @see #getExtraInfo()
	 * @generated
	 */
	EAttribute getExtraInfo_Lower_multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link daGiMa_MDE_HW3.ExtraInfo#getHigher_multiplicity <em>Higher multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Higher multiplicity</em>'.
	 * @see daGiMa_MDE_HW3.ExtraInfo#getHigher_multiplicity()
	 * @see #getExtraInfo()
	 * @generated
	 */
	EAttribute getExtraInfo_Higher_multiplicity();

	/**
	 * Returns the meta object for the reference '{@link daGiMa_MDE_HW3.ExtraInfo#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum</em>'.
	 * @see daGiMa_MDE_HW3.ExtraInfo#getEnum()
	 * @see #getExtraInfo()
	 * @generated
	 */
	EReference getExtraInfo_Enum();

	/**
	 * Returns the meta object for class '{@link daGiMa_MDE_HW3.CustomEnumeration <em>Custom Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Enumeration</em>'.
	 * @see daGiMa_MDE_HW3.CustomEnumeration
	 * @generated
	 */
	EClass getCustomEnumeration();

	/**
	 * Returns the meta object for the attribute list '{@link daGiMa_MDE_HW3.CustomEnumeration#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see daGiMa_MDE_HW3.CustomEnumeration#getValues()
	 * @see #getCustomEnumeration()
	 * @generated
	 */
	EAttribute getCustomEnumeration_Values();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW3.ThesisType <em>Thesis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thesis Type</em>'.
	 * @see daGiMa_MDE_HW3.ThesisType
	 * @generated
	 */
	EEnum getThesisType();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW3.CreditType <em>Credit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credit Type</em>'.
	 * @see daGiMa_MDE_HW3.CreditType
	 * @generated
	 */
	EEnum getCreditType();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW3.CoursePeriod <em>Course Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Period</em>'.
	 * @see daGiMa_MDE_HW3.CoursePeriod
	 * @generated
	 */
	EEnum getCoursePeriod();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW3.ExamType <em>Exam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exam Type</em>'.
	 * @see daGiMa_MDE_HW3.ExamType
	 * @generated
	 */
	EEnum getExamType();

	/**
	 * Returns the meta object for enum '{@link daGiMa_MDE_HW3.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metadata Type</em>'.
	 * @see daGiMa_MDE_HW3.MetadataType
	 * @generated
	 */
	EEnum getMetadataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DaGiMa_MDE_HW3Factory getDaGiMa_MDE_HW3Factory();

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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.UniversityImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getUniversity()
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.ProfessorImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getProfessor()
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
		 * The meta object literal for the '<em><b>News posted</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__NEWS_POSTED = eINSTANCE.getProfessor_News_posted();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.StudentImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getStudent()
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
		 * The meta object literal for the '<em><b>Thesis defended</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Transcripts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__TRANSCRIPTS = eINSTANCE.getStudent_Transcripts();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.UserImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getUser()
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.DepartmentImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getDepartment()
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.DegreeCourseImpl <em>Degree Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.DegreeCourseImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getDegreeCourse()
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.ThesisImpl <em>Thesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.ThesisImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getThesis()
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
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.CourseImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.ExaminationCallImpl <em>Examination Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.ExaminationCallImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getExaminationCall()
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.PassingGradeImpl <em>Passing Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.PassingGradeImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getPassingGrade()
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.CareerImpl <em>Career</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.CareerImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCareer()
		 * @generated
		 */
		EClass CAREER = eINSTANCE.getCareer();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
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
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.NewsImpl <em>News</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.NewsImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getNews()
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
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEWS__AUTHOR = eINSTANCE.getNews_Author();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl <em>Extra Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.ExtraInfoImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getExtraInfo()
		 * @generated
		 */
		EClass EXTRA_INFO = eINSTANCE.getExtraInfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_INFO__NAME = eINSTANCE.getExtraInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_INFO__VALUE = eINSTANCE.getExtraInfo_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_INFO__TYPE = eINSTANCE.getExtraInfo_Type();

		/**
		 * The meta object literal for the '<em><b>Lower multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_INFO__LOWER_MULTIPLICITY = eINSTANCE.getExtraInfo_Lower_multiplicity();

		/**
		 * The meta object literal for the '<em><b>Higher multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_INFO__HIGHER_MULTIPLICITY = eINSTANCE.getExtraInfo_Higher_multiplicity();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRA_INFO__ENUM = eINSTANCE.getExtraInfo_Enum();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.impl.CustomEnumerationImpl <em>Custom Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.impl.CustomEnumerationImpl
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCustomEnumeration()
		 * @generated
		 */
		EClass CUSTOM_ENUMERATION = eINSTANCE.getCustomEnumeration();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ENUMERATION__VALUES = eINSTANCE.getCustomEnumeration_Values();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.ThesisType <em>Thesis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.ThesisType
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getThesisType()
		 * @generated
		 */
		EEnum THESIS_TYPE = eINSTANCE.getThesisType();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.CreditType <em>Credit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.CreditType
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCreditType()
		 * @generated
		 */
		EEnum CREDIT_TYPE = eINSTANCE.getCreditType();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.CoursePeriod <em>Course Period</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.CoursePeriod
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getCoursePeriod()
		 * @generated
		 */
		EEnum COURSE_PERIOD = eINSTANCE.getCoursePeriod();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.ExamType <em>Exam Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.ExamType
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getExamType()
		 * @generated
		 */
		EEnum EXAM_TYPE = eINSTANCE.getExamType();

		/**
		 * The meta object literal for the '{@link daGiMa_MDE_HW3.MetadataType <em>Metadata Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see daGiMa_MDE_HW3.MetadataType
		 * @see daGiMa_MDE_HW3.impl.DaGiMa_MDE_HW3PackageImpl#getMetadataType()
		 * @generated
		 */
		EEnum METADATA_TYPE = eINSTANCE.getMetadataType();

	}

} //DaGiMa_MDE_HW3Package
