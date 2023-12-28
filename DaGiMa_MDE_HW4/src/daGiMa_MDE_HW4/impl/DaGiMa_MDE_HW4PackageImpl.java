/**
 */
package daGiMa_MDE_HW4.impl;

import daGiMa_MDE_HW4.Career;
import daGiMa_MDE_HW4.Course;
import daGiMa_MDE_HW4.CoursePeriod;
import daGiMa_MDE_HW4.CreditType;
import daGiMa_MDE_HW4.CustomEnumeration;
import daGiMa_MDE_HW4.DaGiMa_MDE_HW4Factory;
import daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package;
import daGiMa_MDE_HW4.DegreeCourse;
import daGiMa_MDE_HW4.Department;
import daGiMa_MDE_HW4.ExamType;
import daGiMa_MDE_HW4.ExaminationCall;
import daGiMa_MDE_HW4.ExtraInfo;
import daGiMa_MDE_HW4.MetadataType;
import daGiMa_MDE_HW4.News;
import daGiMa_MDE_HW4.PassingGrade;
import daGiMa_MDE_HW4.Professor;
import daGiMa_MDE_HW4.Student;
import daGiMa_MDE_HW4.Thesis;
import daGiMa_MDE_HW4.ThesisType;
import daGiMa_MDE_HW4.University;
import daGiMa_MDE_HW4.User;

import daGiMa_MDE_HW4.util.DaGiMa_MDE_HW4Validator;

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
public class DaGiMa_MDE_HW4PackageImpl extends EPackageImpl implements DaGiMa_MDE_HW4Package {
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
	private EClass containerEClass = null;

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
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DaGiMa_MDE_HW4PackageImpl() {
		super(eNS_URI, DaGiMa_MDE_HW4Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DaGiMa_MDE_HW4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DaGiMa_MDE_HW4Package init() {
		if (isInited) return (DaGiMa_MDE_HW4Package)EPackage.Registry.INSTANCE.getEPackage(DaGiMa_MDE_HW4Package.eNS_URI);

		// Obtain or create and register package
		Object registeredDaGiMa_MDE_HW4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		DaGiMa_MDE_HW4PackageImpl theDaGiMa_MDE_HW4Package = registeredDaGiMa_MDE_HW4Package instanceof DaGiMa_MDE_HW4PackageImpl ? (DaGiMa_MDE_HW4PackageImpl)registeredDaGiMa_MDE_HW4Package : new DaGiMa_MDE_HW4PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDaGiMa_MDE_HW4Package.createPackageContents();

		// Initialize created meta-data
		theDaGiMa_MDE_HW4Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDaGiMa_MDE_HW4Package,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DaGiMa_MDE_HW4Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDaGiMa_MDE_HW4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DaGiMa_MDE_HW4Package.eNS_URI, theDaGiMa_MDE_HW4Package);
		return theDaGiMa_MDE_HW4Package;
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
	public EOperation getProfessor__TotalCfuTaught() {
		return professorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProfessor__SatisfyMinimalCfuRequirement__DiagnosticChain_Map() {
		return professorEClass.getEOperations().get(1);
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
	public EReference getStudent_Student_exams() {
		return (EReference)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_Matriculation_number() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Thesis_defended() {
		return (EReference)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Enrolled_courses() {
		return (EReference)studentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Booked_calls() {
		return (EReference)studentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_Transcripts() {
		return (EReference)studentEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getUser_All_contacts() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Birth_date() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
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
	public EReference getDepartment_Teachers() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Website() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Offered_courses() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_University() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Related_news() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(5);
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
	public EReference getDegreeCourse_Extra_info() {
		return (EReference)degreeCourseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDegreeCourse__CfuBetweenValues__DiagnosticChain_Map() {
		return degreeCourseEClass.getEOperations().get(0);
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
	public EOperation getThesis__CheckIfEnoughCreditsToGraduate__DiagnosticChain_Map() {
		return thesisEClass.getEOperations().get(0);
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
	public EReference getCourse_Extra_info() {
		return (EReference)courseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCourse__CfuCourseGreaterThan__DiagnosticChain_Map() {
		return courseEClass.getEOperations().get(0);
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
	public EAttribute getCareer_Name() {
		return (EAttribute)careerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCareer_Student() {
		return (EReference)careerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCareer_Degree_course() {
		return (EReference)careerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCareer_Courses() {
		return (EReference)careerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCareer_TotalAcquiredCfu() {
		return (EAttribute)careerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCareer__PassedAllExams() {
		return careerEClass.getEOperations().get(0);
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
	public EAttribute getNews_Body() {
		return (EAttribute)newsEClass.getEStructuralFeatures().get(4);
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
	public EOperation getExtraInfo__FloatTypeCheck__DiagnosticChain_Map() {
		return extraInfoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExtraInfo__DoubleTypeCheck__DiagnosticChain_Map() {
		return extraInfoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExtraInfo__IntegerTypeCheck__DiagnosticChain_Map() {
		return extraInfoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExtraInfo__BooleanTypeCheck__DiagnosticChain_Map() {
		return extraInfoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExtraInfo__StringTypeCheck__DiagnosticChain_Map() {
		return extraInfoEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExtraInfo__EnumTypeCheck__DiagnosticChain_Map() {
		return extraInfoEClass.getEOperations().get(5);
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
	public EAttribute getCustomEnumeration_Name() {
		return (EAttribute)customEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomEnumeration_Values() {
		return (EAttribute)customEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Universities() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Professors() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Students() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Courses() {
		return (EReference)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Custom_enumerations() {
		return (EReference)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Extra_infos() {
		return (EReference)containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Model_name() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(6);
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
	public DaGiMa_MDE_HW4Factory getDaGiMa_MDE_HW4Factory() {
		return (DaGiMa_MDE_HW4Factory)getEFactoryInstance();
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
		createEOperation(professorEClass, PROFESSOR___TOTAL_CFU_TAUGHT);
		createEOperation(professorEClass, PROFESSOR___SATISFY_MINIMAL_CFU_REQUIREMENT__DIAGNOSTICCHAIN_MAP);

		studentEClass = createEClass(STUDENT);
		createEReference(studentEClass, STUDENT__STUDENT_EXAMS);
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
		createEAttribute(userEClass, USER__ALL_CONTACTS);
		createEAttribute(userEClass, USER__BIRTH_DATE);

		departmentEClass = createEClass(DEPARTMENT);
		createEReference(departmentEClass, DEPARTMENT__TEACHERS);
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
		createEReference(degreeCourseEClass, DEGREE_COURSE__EXTRA_INFO);
		createEOperation(degreeCourseEClass, DEGREE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP);

		thesisEClass = createEClass(THESIS);
		createEAttribute(thesisEClass, THESIS__TITLE);
		createEAttribute(thesisEClass, THESIS__TYPE);
		createEReference(thesisEClass, THESIS__STUDENT);
		createEReference(thesisEClass, THESIS__SUPERVISOR);
		createEReference(thesisEClass, THESIS__DEGREE_COURSE);
		createEOperation(thesisEClass, THESIS___CHECK_IF_ENOUGH_CREDITS_TO_GRADUATE__DIAGNOSTICCHAIN_MAP);

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
		createEReference(courseEClass, COURSE__EXTRA_INFO);
		createEOperation(courseEClass, COURSE___CFU_COURSE_GREATER_THAN__DIAGNOSTICCHAIN_MAP);

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
		createEAttribute(careerEClass, CAREER__NAME);
		createEReference(careerEClass, CAREER__STUDENT);
		createEReference(careerEClass, CAREER__DEGREE_COURSE);
		createEReference(careerEClass, CAREER__COURSES);
		createEAttribute(careerEClass, CAREER__TOTAL_ACQUIRED_CFU);
		createEOperation(careerEClass, CAREER___PASSED_ALL_EXAMS);

		newsEClass = createEClass(NEWS);
		createEAttribute(newsEClass, NEWS__TITLE);
		createEAttribute(newsEClass, NEWS__PUBLICATION_DATE);
		createEReference(newsEClass, NEWS__DEPARTMENT);
		createEReference(newsEClass, NEWS__AUTHOR);
		createEAttribute(newsEClass, NEWS__BODY);

		extraInfoEClass = createEClass(EXTRA_INFO);
		createEAttribute(extraInfoEClass, EXTRA_INFO__NAME);
		createEAttribute(extraInfoEClass, EXTRA_INFO__VALUE);
		createEAttribute(extraInfoEClass, EXTRA_INFO__TYPE);
		createEAttribute(extraInfoEClass, EXTRA_INFO__LOWER_MULTIPLICITY);
		createEAttribute(extraInfoEClass, EXTRA_INFO__HIGHER_MULTIPLICITY);
		createEReference(extraInfoEClass, EXTRA_INFO__ENUM);
		createEOperation(extraInfoEClass, EXTRA_INFO___FLOAT_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
		createEOperation(extraInfoEClass, EXTRA_INFO___DOUBLE_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
		createEOperation(extraInfoEClass, EXTRA_INFO___INTEGER_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
		createEOperation(extraInfoEClass, EXTRA_INFO___BOOLEAN_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
		createEOperation(extraInfoEClass, EXTRA_INFO___STRING_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);
		createEOperation(extraInfoEClass, EXTRA_INFO___ENUM_TYPE_CHECK__DIAGNOSTICCHAIN_MAP);

		customEnumerationEClass = createEClass(CUSTOM_ENUMERATION);
		createEAttribute(customEnumerationEClass, CUSTOM_ENUMERATION__NAME);
		createEAttribute(customEnumerationEClass, CUSTOM_ENUMERATION__VALUES);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__UNIVERSITIES);
		createEReference(containerEClass, CONTAINER__PROFESSORS);
		createEReference(containerEClass, CONTAINER__STUDENTS);
		createEReference(containerEClass, CONTAINER__COURSES);
		createEReference(containerEClass, CONTAINER__CUSTOM_ENUMERATIONS);
		createEReference(containerEClass, CONTAINER__EXTRA_INFOS);
		createEAttribute(containerEClass, CONTAINER__MODEL_NAME);

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
		initEAttribute(getUniversity_Name(), ecorePackage.getEString(), "name", "A university", 1, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfessor_Office_telephone(), ecorePackage.getEString(), "office_telephone", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfessor_Orcid(), ecorePackage.getEString(), "orcid", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Coordinated_degree_courses(), this.getDegreeCourse(), this.getDegreeCourse_Coordinator(), "coordinated_degree_courses", null, 0, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Supervised_thesis(), this.getThesis(), this.getThesis_Supervisor(), "supervised_thesis", null, 0, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Taught_courses(), this.getCourse(), this.getCourse_Teachers(), "taught_courses", null, 1, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_News_posted(), this.getNews(), this.getNews_Author(), "news_posted", null, 0, -1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProfessor__TotalCfuTaught(), ecorePackage.getEBigInteger(), "totalCfuTaught", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getProfessor__SatisfyMinimalCfuRequirement__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "satisfyMinimalCfuRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudent_Student_exams(), this.getCourse(), null, "student_exams", null, 0, -1, Student.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Matriculation_number(), ecorePackage.getELong(), "matriculation_number", null, 1, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Thesis_defended(), this.getThesis(), this.getThesis_Student(), "thesis_defended", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Enrolled_courses(), this.getDegreeCourse(), this.getDegreeCourse_Enrolled_students(), "enrolled_courses", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Booked_calls(), this.getExaminationCall(), this.getExaminationCall_Booked_students(), "booked_calls", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Transcripts(), this.getCareer(), this.getCareer_Student(), "transcripts", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Surname(), ecorePackage.getEString(), "surname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Telephone(), ecorePackage.getEString(), "telephone", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_All_contacts(), ecorePackage.getEString(), "all_contacts", null, 0, 1, User.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Birth_date(), ecorePackage.getEDate(), "birth_date", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartment_Teachers(), this.getProfessor(), null, "teachers", null, 0, -1, Department.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Website(), ecorePackage.getEString(), "website", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Offered_courses(), this.getDegreeCourse(), this.getDegreeCourse_Department(), "offered_courses", null, 1, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_University(), this.getUniversity(), this.getUniversity_Departments(), "university", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Name(), ecorePackage.getEString(), "name", "A department", 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Related_news(), this.getNews(), this.getNews_Department(), "related_news", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(degreeCourseEClass, DegreeCourse.class, "DegreeCourse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDegreeCourse_Code(), ecorePackage.getEString(), "code", "L-44", 1, 1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getDegreeCourse_Extra_info(), this.getExtraInfo(), null, "extra_info", null, 0, -1, DegreeCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDegreeCourse__CfuBetweenValues__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cfuBetweenValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(thesisEClass, Thesis.class, "Thesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThesis_Title(), ecorePackage.getEString(), "title", "A thesis", 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThesis_Type(), this.getThesisType(), "type", "COMPILATION", 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThesis_Student(), this.getStudent(), this.getStudent_Thesis_defended(), "student", null, 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThesis_Supervisor(), this.getProfessor(), this.getProfessor_Supervised_thesis(), "supervisor", null, 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThesis_Degree_course(), this.getDegreeCourse(), null, "degree_course", null, 1, 1, Thesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getThesis__CheckIfEnoughCreditsToGraduate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "checkIfEnoughCreditsToGraduate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", "F-1234", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", "A course", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Language(), ecorePackage.getEString(), "language", "English", 1, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Cfu(), ecorePackage.getEInt(), "cfu", "6", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credit_type(), this.getCreditType(), "credit_type", "B", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Year(), ecorePackage.getEInt(), "year", "2", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Period(), this.getCoursePeriod(), "period", "FIRST_SEMESTER", 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Teachers(), this.getProfessor(), this.getProfessor_Taught_courses(), "teachers", null, 1, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Degree_courses(), this.getDegreeCourse(), this.getDegreeCourse_Course_catalogue(), "degree_courses", null, 1, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Calls(), this.getExaminationCall(), this.getExaminationCall_Course(), "calls", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Students_grades(), this.getPassingGrade(), this.getPassingGrade_Course(), "students_grades", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Extra_info(), this.getExtraInfo(), null, "extra_info", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCourse__CfuCourseGreaterThan__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cfuCourseGreaterThan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(examinationCallEClass, ExaminationCall.class, "ExaminationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExaminationCall_Date(), ecorePackage.getEDate(), "date", "2024-01-28", 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationCall_Classroom(), ecorePackage.getEString(), "classroom", null, 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationCall_Type(), this.getExamType(), "type", null, 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationCall_Description(), ecorePackage.getEString(), "description", "An exam call description", 0, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationCall_Course(), this.getCourse(), this.getCourse_Calls(), "course", null, 1, 1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationCall_Booked_students(), this.getStudent(), this.getStudent_Booked_calls(), "booked_students", null, 0, -1, ExaminationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passingGradeEClass, PassingGrade.class, "PassingGrade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassingGrade_Date(), ecorePackage.getEDate(), "date", "2024-01-28", 0, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassingGrade_Grade(), ecorePackage.getEString(), "grade", "30", 0, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassingGrade_Course(), this.getCourse(), this.getCourse_Students_grades(), "course", null, 1, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassingGrade_Student(), this.getCareer(), this.getCareer_Courses(), "student", null, 1, 1, PassingGrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustBeSufficientIfDefined", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(careerEClass, Career.class, "Career", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCareer_Name(), ecorePackage.getEString(), "name", "New transcript", 1, 1, Career.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCareer_Student(), this.getStudent(), this.getStudent_Transcripts(), "student", null, 1, 1, Career.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCareer_Degree_course(), this.getDegreeCourse(), null, "degree_course", null, 1, 1, Career.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCareer_Courses(), this.getPassingGrade(), this.getPassingGrade_Student(), "courses", null, 0, -1, Career.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCareer_TotalAcquiredCfu(), ecorePackage.getEBigInteger(), "totalAcquiredCfu", null, 1, 1, Career.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getCareer__PassedAllExams(), ecorePackage.getEBoolean(), "passedAllExams", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(newsEClass, News.class, "News", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNews_Title(), ecorePackage.getEString(), "title", "A news title", 1, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNews_Publication_date(), ecorePackage.getEDate(), "publication_date", "2023-12-18", 1, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNews_Department(), this.getDepartment(), this.getDepartment_Related_news(), "department", null, 0, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNews_Author(), this.getProfessor(), this.getProfessor_News_posted(), "author", null, 1, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNews_Body(), ecorePackage.getEString(), "body", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut porta ante id turpis faucibus pharetra non nec arcu. Morbi luctus, est at tincidunt scelerisque, eros purus posuere purus, in facilisis turpis lectus et neque. Phasellus euismod accumsan turpis faucibus lobortis. In eleifend ligula non iaculis pulvinar. Nulla malesuada ac massa vulputate molestie.", 1, 1, News.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extraInfoEClass, ExtraInfo.class, "ExtraInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraInfo_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Value(), ecorePackage.getEString(), "value", null, 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Type(), this.getMetadataType(), "type", "STRING", 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Lower_multiplicity(), ecorePackage.getEInt(), "lower_multiplicity", "0", 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraInfo_Higher_multiplicity(), ecorePackage.getEInt(), "higher_multiplicity", null, 1, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtraInfo_Enum(), this.getCustomEnumeration(), null, "enum", null, 0, 1, ExtraInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExtraInfo__FloatTypeCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "floatTypeCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtraInfo__DoubleTypeCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "doubleTypeCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtraInfo__IntegerTypeCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "integerTypeCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtraInfo__BooleanTypeCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "booleanTypeCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtraInfo__StringTypeCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "stringTypeCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtraInfo__EnumTypeCheck__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "enumTypeCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(customEnumerationEClass, CustomEnumeration.class, "CustomEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomEnumeration_Name(), ecorePackage.getEString(), "name", null, 1, 1, CustomEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomEnumeration_Values(), ecorePackage.getEString(), "values", null, 1, -1, CustomEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, daGiMa_MDE_HW4.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Universities(), this.getUniversity(), null, "universities", null, 0, -1, daGiMa_MDE_HW4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Professors(), this.getProfessor(), null, "professors", null, 0, -1, daGiMa_MDE_HW4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Students(), this.getStudent(), null, "students", null, 0, -1, daGiMa_MDE_HW4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Courses(), this.getCourse(), null, "courses", null, 0, -1, daGiMa_MDE_HW4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Custom_enumerations(), this.getCustomEnumeration(), null, "custom_enumerations", null, 0, -1, daGiMa_MDE_HW4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Extra_infos(), this.getExtraInfo(), null, "extra_infos", null, 0, -1, daGiMa_MDE_HW4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Model_name(), ecorePackage.getEString(), "model_name", "NewModel", 1, 1, daGiMa_MDE_HW4.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
		  (professorEClass,
		   source,
		   new String[] {
			   "constraints", "satisfyMinimalCfuRequirement"
		   });
		addAnnotation
		  (degreeCourseEClass,
		   source,
		   new String[] {
			   "constraints", "cfuBetweenValues"
		   });
		addAnnotation
		  (thesisEClass,
		   source,
		   new String[] {
			   "constraints", "checkIfEnoughCreditsToGraduate"
		   });
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "constraints", "cfuCourseGreaterThan"
		   });
		addAnnotation
		  (passingGradeEClass,
		   source,
		   new String[] {
			   "constraints", "mustBeSufficientIfDefined"
		   });
		addAnnotation
		  (extraInfoEClass,
		   source,
		   new String[] {
			   "constraints", "enumTypeCheck"
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
		  (getProfessor__TotalCfuTaught(),
		   source,
		   new String[] {
			   "body", "taught_courses->collect(course|course.cfu)->sum()"
		   });
		addAnnotation
		  (getProfessor__SatisfyMinimalCfuRequirement__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\ttotalCfuTaught() >= 15"
		   });
		addAnnotation
		  (getDegreeCourse__CfuBetweenValues__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tcfu > 0 and cfu <= 360"
		   });
		addAnnotation
		  (getThesis__CheckIfEnoughCreditsToGraduate__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tstudent.transcripts->select(transcript|transcript.degree_course = self.degree_course)->forAll(e|e.passedAllExams())"
		   });
		addAnnotation
		  (getCourse__CfuCourseGreaterThan__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tcfu > 0"
		   });
		addAnnotation
		  (getPassingGrade__MustBeSufficientIfDefined__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tgrade.size() = 0 or (grade.matches(\'([Aa][+]{0,1}){1}|[B-Db-d]{1}|(1[8-9]{1}|2[0-9]{1}|30[Ll]{0,1}){1}\'))"
		   });
		addAnnotation
		  (getCareer__PassedAllExams(),
		   source,
		   new String[] {
			   "body", "courses->forAll(course|course.grade.size() > 0)"
		   });
		addAnnotation
		  (getExtraInfo__FloatTypeCheck__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tvalue.matches(\'[0-9]+([.]{1}[0-9]+)?[Ff]\') or type <> MetadataType::FLOAT"
		   });
		addAnnotation
		  (getExtraInfo__DoubleTypeCheck__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tvalue.matches(\'[0-9]+([.]{1}[0-9]+)?[Dd]\') or type <> MetadataType::DOUBLE"
		   });
		addAnnotation
		  (getExtraInfo__IntegerTypeCheck__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tvalue.matches(\'[0-9]+\') or type <> MetadataType::INTEGER"
		   });
		addAnnotation
		  (getExtraInfo__BooleanTypeCheck__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tvalue.matches(\'^true|false$\') or type <> MetadataType::BOOLEAN"
		   });
		addAnnotation
		  (getExtraInfo__StringTypeCheck__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tvalue.oclIsTypeOf(String) or type <> MetadataType::STRING"
		   });
		addAnnotation
		  (getExtraInfo__EnumTypeCheck__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tenum?.values->one(enumValue | enumValue = value) or type <> MetadataType::ENUMERATION"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getStudent_Student_exams(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getDepartment_Teachers(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //DaGiMa_MDE_HW4PackageImpl
