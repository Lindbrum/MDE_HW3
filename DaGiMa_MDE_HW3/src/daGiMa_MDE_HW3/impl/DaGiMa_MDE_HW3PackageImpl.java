/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.Career;
import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.CoursePeriod;
import daGiMa_MDE_HW3.CreditType;
import daGiMa_MDE_HW3.CustomEnumeration;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Factory;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.Department;
import daGiMa_MDE_HW3.ExamType;
import daGiMa_MDE_HW3.ExaminationCall;
import daGiMa_MDE_HW3.ExtraInfo;
import daGiMa_MDE_HW3.MetadataType;
import daGiMa_MDE_HW3.News;
import daGiMa_MDE_HW3.PassingGrade;
import daGiMa_MDE_HW3.Professor;
import daGiMa_MDE_HW3.Student;
import daGiMa_MDE_HW3.Thesis;
import daGiMa_MDE_HW3.ThesisType;
import daGiMa_MDE_HW3.University;
import daGiMa_MDE_HW3.User;

import daGiMa_MDE_HW3.util.DaGiMa_MDE_HW3Validator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DaGiMa_MDE_HW3PackageImpl extends EPackageImpl implements DaGiMa_MDE_HW3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeCourseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examinationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passingGradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass careerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thesisTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum creditTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coursePeriodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum examTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metadataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DaGiMa_MDE_HW3PackageImpl() {
		super(eNS_URI, DaGiMa_MDE_HW3Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DaGiMa_MDE_HW3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DaGiMa_MDE_HW3Package init() {
		if (isInited) return (DaGiMa_MDE_HW3Package)EPackage.Registry.INSTANCE.getEPackage(DaGiMa_MDE_HW3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredDaGiMa_MDE_HW3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		DaGiMa_MDE_HW3PackageImpl theDaGiMa_MDE_HW3Package = registeredDaGiMa_MDE_HW3Package instanceof DaGiMa_MDE_HW3PackageImpl ? (DaGiMa_MDE_HW3PackageImpl)registeredDaGiMa_MDE_HW3Package : new DaGiMa_MDE_HW3PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDaGiMa_MDE_HW3Package.createPackageContents();

		// Initialize created meta-data
		theDaGiMa_MDE_HW3Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDaGiMa_MDE_HW3Package,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DaGiMa_MDE_HW3Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDaGiMa_MDE_HW3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DaGiMa_MDE_HW3Package.eNS_URI, theDaGiMa_MDE_HW3Package);
		return theDaGiMa_MDE_HW3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversity() {
		return universityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Rector() {
		return (EReference)universityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Departments() {
		return (EReference)universityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversity_Name() {
		return (EAttribute)universityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfessor_Office_telephone() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfessor_Orcid() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfessor_Coordinated_degree_courses() {
		return (EReference)professorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfessor_Supervised_thesis() {
		return (EReference)professorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfessor_Taught_courses() {
		return (EReference)professorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfessor_News_posted() {
		return (EReference)professorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_Matriculation_number() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Thesis_defended() {
		return (EReference)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Enrolled_courses() {
		return (EReference)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Booked_calls() {
		return (EReference)studentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Transcripts() {
		return (EReference)studentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Surname() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Telephone() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Website() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Offered_courses() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_University() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Related_news() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegreeCourse() {
		return degreeCourseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeCourse_Code() {
		return (EAttribute)degreeCourseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeCourse_Name() {
		return (EAttribute)degreeCourseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeCourse_Reference_year() {
		return (EAttribute)degreeCourseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeCourse_Duration() {
		return (EAttribute)degreeCourseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeCourse_Cfu() {
		return (EAttribute)degreeCourseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeCourse_Description() {
		return (EAttribute)degreeCourseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeCourse_Language() {
		return (EAttribute)degreeCourseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeCourse_Department() {
		return (EReference)degreeCourseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeCourse_Coordinator() {
		return (EReference)degreeCourseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeCourse_Enrolled_students() {
		return (EReference)degreeCourseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeCourse_Course_catalogue() {
		return (EReference)degreeCourseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThesis() {
		return thesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThesis_Title() {
		return (EAttribute)thesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThesis_Type() {
		return (EAttribute)thesisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThesis_Student() {
		return (EReference)thesisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThesis_Supervisor() {
		return (EReference)thesisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThesis_Degree_course() {
		return (EReference)thesisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Language() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Cfu() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credit_type() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Year() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Period() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Teachers() {
		return (EReference)courseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Degree_courses() {
		return (EReference)courseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Calls() {
		return (EReference)courseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Students_grades() {
		return (EReference)courseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExaminationCall() {
		return examinationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExaminationCall_Date() {
		return (EAttribute)examinationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExaminationCall_Classroom() {
		return (EAttribute)examinationCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExaminationCall_Type() {
		return (EAttribute)examinationCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExaminationCall_Description() {
		return (EAttribute)examinationCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExaminationCall_Course() {
		return (EReference)examinationCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExaminationCall_Booked_students() {
		return (EReference)examinationCallEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassingGrade() {
		return passingGradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassingGrade_Date() {
		return (EAttribute)passingGradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassingGrade_Grade() {
		return (EAttribute)passingGradeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPassingGrade_Course() {
		return (EReference)passingGradeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPassingGrade_Student() {
		return (EReference)passingGradeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map() {
		return passingGradeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCareer() {
		return careerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCareer_Student() {
		return (EReference)careerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCareer_Degree_course() {
		return (EReference)careerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCareer_Courses() {
		return (EReference)careerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNews() {
		return newsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNews_Title() {
		return (EAttribute)newsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNews_Publication_date() {
		return (EAttribute)newsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNews_Department() {
		return (EReference)newsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNews_Author() {
		return (EReference)newsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtraInfo() {
		return extraInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraInfo_Name() {
		return (EAttribute)extraInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraInfo_Value() {
		return (EAttribute)extraInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraInfo_Type() {
		return (EAttribute)extraInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraInfo_Lower_multiplicity() {
		return (EAttribute)extraInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraInfo_Higher_multiplicity() {
		return (EAttribute)extraInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtraInfo_Enum() {
		return (EReference)extraInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomEnumeration() {
		return customEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomEnumeration_Values() {
		return (EAttribute)customEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getThesisType() {
		return thesisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCreditType() {
		return creditTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoursePeriod() {
		return coursePeriodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExamType() {
		return examTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMetadataType() {
		return metadataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DaGiMa_MDE_HW3Factory getDaGiMa_MDE_HW3Factory() {
		return (DaGiMa_MDE_HW3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		universityEClass = createEClass(UNIVERSITY);
		createEReference(universityEClass, UNIVERSITY__RECTOR);
		createEReference(universityEClass, UNIVERSITY__DEPARTMENTS);
		createEAttribute(universityEClass, UNIVERSITY__NAME);

		professorEClass = createEClass(PROFESSOR);
		createEAttribute(professorEClass, PROFESSOR__OFFICE_TELEPHONE);
		createEAttribute(professorEClass, PROFESSOR__ORCID);
		createEReference(professorEClass, PROFESSOR__COORDINATED_DEGREE_COURSES);
		createEReference(professorEClass, PROFESSOR__SUPERVISED_THESIS);
		createEReference(professorEClass, PROFESSOR__TAUGHT_COURSES);
		createEReference(professorEClass, PROFESSOR__NEWS_POSTED);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__MATRICULATION_NUMBER);
		createEReference(studentEClass, STUDENT__THESIS_DEFENDED);
		createEReference(studentEClass, STUDENT__ENROLLED_COURSES);
		createEReference(studentEClass, STUDENT__BOOKED_CALLS);
		createEReference(studentEClass, STUDENT__TRANSCRIPTS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__SURNAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__TELEPHONE);

		departmentEClass = createEClass(DEPARTMENT);
		createEAttribute(departmentEClass, DEPARTMENT__WEBSITE);
		createEReference(departmentEClass, DEPARTMENT__OFFERED_COURSES);
		createEReference(departmentEClass, DEPARTMENT__UNIVERSITY);
		createEAttribute(departmentEClass, DEPARTMENT__NAME);
		createEReference(departmentEClass, DEPARTMENT__RELATED_NEWS);

		degreeCourseEClass = createEClass(DEGREE_COURSE);
		createEAttribute(degreeCourseEClass, DEGREE_COURSE__CODE);
		createEAttribute(degreeCourseEClass, DEGREE_COURSE__NAME);
		createEAttribute(degreeCourseEClass, DEGREE_COURSE__REFERENCE_YEAR);
		createEAttribute(degreeCourseEClass, DEGREE_COURSE__DURATION);
		createEAttribute(degreeCourseEClass, DEGREE_COURSE__CFU);
		createEAttribute(degreeCourseEClass, DEGREE_COURSE__DESCRIPTION);
		createEAttribute(degreeCourseEClass, DEGREE_COURSE__LANGUAGE);
		createEReference(degreeCourseEClass, DEGREE_COURSE__DEPARTMENT);
		createEReference(degreeCourseEClass, DEGREE_COURSE__COORDINATOR);
		createEReference(degreeCourseEClass, DEGREE_COURSE__ENROLLED_STUDENTS);
		createEReference(degreeCourseEClass, DEGREE_COURSE__COURSE_CATALOGUE);

		thesisEClass = createEClass(THESIS);
		createEAttribute(thesisEClass, THESIS__TITLE);
		createEAttribute(thesisEClass, THESIS__TYPE);
		createEReference(thesisEClass, THESIS__STUDENT);
		createEReference(thesisEClass, THESIS__SUPERVISOR);
		createEReference(thesisEClass, THESIS__DEGREE_COURSE);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__LANGUAGE);
		createEAttribute(courseEClass, COURSE__CFU);
		createEAttribute(courseEClass, COURSE__CREDIT_TYPE);
		createEAttribute(courseEClass, COURSE__YEAR);
		createEAttribute(courseEClass, COURSE__PERIOD);
		createEReference(courseEClass, COURSE__TEACHERS);
		createEReference(courseEClass, COURSE__DEGREE_COURSES);
		createEReference(courseEClass, COURSE__CALLS);
		createEReference(courseEClass, COURSE__STUDENTS_GRADES);

		examinationCallEClass = createEClass(EXAMINATION_CALL);
		createEAttribute(examinationCallEClass, EXAMINATION_CALL__DATE);
		createEAttribute(examinationCallEClass, EXAMINATION_CALL__CLASSROOM);
		createEAttribute(examinationCallEClass, EXAMINATION_CALL__TYPE);
		createEAttribute(examinationCallEClass, EXAMINATION_CALL__DESCRIPTION);
		createEReference(examinationCallEClass, EXAMINATION_CALL__COURSE);
		createEReference(examinationCallEClass, EXAMINATION_CALL__BOOKED_STUDENTS);

		passingGradeEClass = createEClass(PASSING_GRADE);
		createEAttribute(passingGradeEClass, PASSING_GRADE__DATE);
		createEAttribute(passingGradeEClass, PASSING_GRADE__GRADE);
		createEReference(passingGradeEClass, PASSING_GRADE__COURSE);
		createEReference(passingGradeEClass, PASSING_GRADE__STUDENT);
		createEOperation(passingGradeEClass, PASSING_GRADE___MUST_BE_SUFFICIENT_IF_DEFINED__DIAGNOSTICCHAIN_MAP);

		careerEClass = createEClass(CAREER);
		createEReference(careerEClass, CAREER__STUDENT);
		createEReference(careerEClass, CAREER__DEGREE_COURSE);
		createEReference(careerEClass, CAREER__COURSES);

		newsEClass = createEClass(NEWS);
		createEAttribute(newsEClass, NEWS__TITLE);
		createEAttribute(newsEClass, NEWS__PUBLICATION_DATE);
		createEReference(newsEClass, NEWS__DEPARTMENT);
		createEReference(newsEClass, NEWS__AUTHOR);

		extraInfoEClass = createEClass(EXTRA_INFO);
		createEAttribute(extraInfoEClass, EXTRA_INFO__NAME);
		createEAttribute(extraInfoEClass, EXTRA_INFO__VALUE);
		createEAttribute(extraInfoEClass, EXTRA_INFO__TYPE);
		createEAttribute(extraInfoEClass, EXTRA_INFO__LOWER_MULTIPLICITY);
		createEAttribute(extraInfoEClass, EXTRA_INFO__HIGHER_MULTIPLICITY);
		createEReference(extraInfoEClass, EXTRA_INFO__ENUM);

		customEnumerationEClass = createEClass(CUSTOM_ENUMERATION);
		createEAttribute(customEnumerationEClass, CUSTOM_ENUMERATION__VALUES);

		// Create enums
		thesisTypeEEnum = createEEnum(THESIS_TYPE);
		creditTypeEEnum = createEEnum(CREDIT_TYPE);
		coursePeriodEEnum = createEEnum(COURSE_PERIOD);
		examTypeEEnum = createEEnum(EXAM_TYPE);
		metadataTypeEEnum = createEEnum(METADATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		professorEClass.getESuperTypes().add(this.getUser());
		studentEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversity_Rector(), this.getProfessor(), null, "rector", null, 1, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Departments(), this.getDepartment(), this.getDepartment_University(), "departments", null, 1, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversity_Name(), ecorePackage.getEString(), "name", "A university", 1, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfessor_Office_telephone(), ecorePackage.getEString(), "office_telephone", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfessor_Orcid(), ecorePackage.getEString(), "orcid", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Coordinated_degree_courses(), this.getDegreeCourse(), this.getDegreeCourse_Coordinator(), "coordinated_degree_courses", null, 0, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Supervised_thesis(), this.getThesis(), this.getThesis_Supervisor(), "supervised_thesis", null, 0, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Taught_courses(), this.getCourse(), null, "taught_courses", null, 1, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_News_posted(), this.getNews(), this.getNews_Author(), "news_posted", null, 0, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_Matriculation_number(), ecorePackage.getELong(), "matriculation_number", null, 1, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Thesis_defended(), this.getThesis(), this.getThesis_Student(), "thesis_defended", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Enrolled_courses(), this.getDegreeCourse(), this.getDegreeCourse_Enrolled_students(), "enrolled_courses", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Booked_calls(), this.getExaminationCall(), this.getExaminationCall_Booked_students(), "booked_calls", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Transcripts(), this.getCareer(), this.getCareer_Student(), "transcripts", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Surname(), ecorePackage.getEString(), "surname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Telephone(), ecorePackage.getEString(), "telephone", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartment_Website(), ecorePackage.getEString(), "website", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Offered_courses(), this.getDegreeCourse(), this.getDegreeCourse_Department(), "offered_courses", null, 1, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_University(), this.getUniversity(), this.getUniversity_Departments(), "university", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Name(), ecorePackage.getEString(), "name", "A department", 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Related_news(), this.getNews(), this.getNews_Department(), "related_news", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(degreeCourseEClass, DegreeCourse.class, "DegreeCourse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDegreeCourse_Code(), ecorePackage.getEString(), "code", "L-44", 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeCourse_Name(), ecorePackage.getEString(), "name", "A degree course", 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeCourse_Reference_year(), ecorePackage.getEInt(), "reference_year", "2023", 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeCourse_Duration(), ecorePackage.getEInt(), "duration", "3", 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeCourse_Cfu(), ecorePackage.getEInt(), "cfu", "180", 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeCourse_Description(), ecorePackage.getEString(), "description", "A description of this course", 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeCourse_Language(), ecorePackage.getEString(), "language", "English", 1, -1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegreeCourse_Department(), this.getDepartment(), this.getDepartment_Offered_courses(), "department", null, 0, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegreeCourse_Coordinator(), this.getProfessor(), this.getProfessor_Coordinated_degree_courses(), "coordinator", null, 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegreeCourse_Enrolled_students(), this.getStudent(), this.getStudent_Enrolled_courses(), "enrolled_students", null, 0, -1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegreeCourse_Course_catalogue(), this.getCourse(), this.getCourse_Degree_courses(), "course_catalogue", null, 1, -1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thesisEClass, Thesis.class, "Thesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThesis_Title(), ecorePackage.getEString(), "title", "A thesis", 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThesis_Type(), this.getThesisType(), "type", "COMPILATION", 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThesis_Student(), this.getStudent(), this.getStudent_Thesis_defended(), "student", null, 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThesis_Supervisor(), this.getProfessor(), this.getProfessor_Supervised_thesis(), "supervisor", null, 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThesis_Degree_course(), this.getDegreeCourse(), null, "degree_course", null, 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", "F-1234", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", "A course", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Language(), ecorePackage.getEString(), "language", "English", 1, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Cfu(), ecorePackage.getEInt(), "cfu", "6", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credit_type(), this.getCreditType(), "credit_type", "B", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Year(), ecorePackage.getEInt(), "year", "2", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Period(), this.getCoursePeriod(), "period", "FIRST_SEMESTER", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Teachers(), this.getProfessor(), null, "teachers", null, 1, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Degree_courses(), this.getDegreeCourse(), this.getDegreeCourse_Course_catalogue(), "degree_courses", null, 1, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Calls(), this.getExaminationCall(), this.getExaminationCall_Course(), "calls", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Students_grades(), this.getPassingGrade(), this.getPassingGrade_Course(), "students_grades", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examinationCallEClass, ExaminationCall.class, "ExaminationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExaminationCall_Date(), ecorePackage.getEDate(), "date", "2024-01-28", 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationCall_Classroom(), ecorePackage.getEString(), "classroom", null, 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationCall_Type(), this.getExamType(), "type", null, 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationCall_Description(), ecorePackage.getEString(), "description", "An exam call description", 0, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationCall_Course(), this.getCourse(), this.getCourse_Calls(), "course", null, 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationCall_Booked_students(), this.getStudent(), this.getStudent_Booked_calls(), "booked_students", null, 0, -1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passingGradeEClass, PassingGrade.class, "PassingGrade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassingGrade_Date(), ecorePackage.getEDate(), "date", "2024-01-28", 0, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassingGrade_Grade(), ecorePackage.getEString(), "grade", "30", 0, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassingGrade_Course(), this.getCourse(), this.getCourse_Students_grades(), "course", null, 1, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassingGrade_Student(), this.getCareer(), this.getCareer_Courses(), "student", null, 1, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustBeSufficientIfDefined", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(careerEClass, Career.class, "Career", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCareer_Student(), this.getStudent(), this.getStudent_Transcripts(), "student", null, 1, 1, Career.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCareer_Degree_course(), this.getDegreeCourse(), null, "degree_course", null, 1, 1, Career.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCareer_Courses(), this.getPassingGrade(), this.getPassingGrade_Student(), "courses", null, 0, -1, Career.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newsEClass, News.class, "News", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNews_Title(), ecorePackage.getEString(), "title", "A news title", 1, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNews_Publication_date(), ecorePackage.getEDate(), "publication_date", "2023-12-18", 1, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNews_Department(), this.getDepartment(), this.getDepartment_Related_news(), "department", null, 0, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNews_Author(), this.getProfessor(), this.getProfessor_News_posted(), "author", null, 1, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extraInfoEClass, ExtraInfo.class, "ExtraInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraInfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Value(), ecorePackage.getEString(), "value", null, 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Type(), this.getMetadataType(), "type", "STRING", 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Lower_multiplicity(), ecorePackage.getEInt(), "lower_multiplicity", "0", 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Higher_multiplicity(), ecorePackage.getEInt(), "higher_multiplicity", null, 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtraInfo_Enum(), this.getCustomEnumeration(), null, "enum", null, 0, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customEnumerationEClass, CustomEnumeration.class, "CustomEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomEnumeration_Values(), ecorePackage.getEString(), "values", null, 1, -1, CustomEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(thesisTypeEEnum, ThesisType.class, "ThesisType");
		addEEnumLiteral(thesisTypeEEnum, ThesisType.COMPILATION);
		addEEnumLiteral(thesisTypeEEnum, ThesisType.EXPERIMENTAL);
		addEEnumLiteral(thesisTypeEEnum, ThesisType.PUBLICATION);

		initEEnum(creditTypeEEnum, CreditType.class, "CreditType");
		addEEnumLiteral(creditTypeEEnum, CreditType.B);
		addEEnumLiteral(creditTypeEEnum, CreditType.C);
		addEEnumLiteral(creditTypeEEnum, CreditType.D);
		addEEnumLiteral(creditTypeEEnum, CreditType.E);
		addEEnumLiteral(creditTypeEEnum, CreditType.F);

		initEEnum(coursePeriodEEnum, CoursePeriod.class, "CoursePeriod");
		addEEnumLiteral(coursePeriodEEnum, CoursePeriod.FIRST_SEMESTER);
		addEEnumLiteral(coursePeriodEEnum, CoursePeriod.SECOND_SEMESTER);

		initEEnum(examTypeEEnum, ExamType.class, "ExamType");
		addEEnumLiteral(examTypeEEnum, ExamType.WRITTEN);
		addEEnumLiteral(examTypeEEnum, ExamType.ORAL);
		addEEnumLiteral(examTypeEEnum, ExamType.PROJECT);

		initEEnum(metadataTypeEEnum, MetadataType.class, "MetadataType");
		addEEnumLiteral(metadataTypeEEnum, MetadataType.STRING);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.INTEGER);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.BOOLEAN);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.FLOAT);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.DOUBLE);
		addEEnumLiteral(metadataTypeEEnum, MetadataType.ENUMERATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (passingGradeEClass,
		   source,
		   new String[] {
			   "constraints", "mustBeSufficientIfDefined"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tgrade.oclIsUndefined() or (grade.matches(\'([Aa][+]{0,1}){1}|[B-Db-d]{1}|(1[8-9]{1}|2[0-9]{1}|30[Ll]{0,1}){1}\'))"
		   });
	}

} //DaGiMa_MDE_HW3PackageImpl
