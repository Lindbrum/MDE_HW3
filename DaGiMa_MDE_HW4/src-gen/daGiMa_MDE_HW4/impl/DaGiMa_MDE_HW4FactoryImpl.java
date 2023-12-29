/**
 */
package daGiMa_MDE_HW4.impl;

import daGiMa_MDE_HW4.*;

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
public class DaGiMa_MDE_HW4FactoryImpl extends EFactoryImpl implements DaGiMa_MDE_HW4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DaGiMa_MDE_HW4Factory init() {
		try {
			DaGiMa_MDE_HW4Factory theDaGiMa_MDE_HW4Factory = (DaGiMa_MDE_HW4Factory) EPackage.Registry.INSTANCE
					.getEFactory(DaGiMa_MDE_HW4Package.eNS_URI);
			if (theDaGiMa_MDE_HW4Factory != null) {
				return theDaGiMa_MDE_HW4Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DaGiMa_MDE_HW4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaGiMa_MDE_HW4FactoryImpl() {
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
		case DaGiMa_MDE_HW4Package.UNIVERSITY:
			return createUniversity();
		case DaGiMa_MDE_HW4Package.PROFESSOR:
			return createProfessor();
		case DaGiMa_MDE_HW4Package.STUDENT:
			return createStudent();
		case DaGiMa_MDE_HW4Package.DEPARTMENT:
			return createDepartment();
		case DaGiMa_MDE_HW4Package.DEGREE_COURSE:
			return createDegreeCourse();
		case DaGiMa_MDE_HW4Package.THESIS:
			return createThesis();
		case DaGiMa_MDE_HW4Package.COURSE:
			return createCourse();
		case DaGiMa_MDE_HW4Package.EXAMINATION_CALL:
			return createExaminationCall();
		case DaGiMa_MDE_HW4Package.PASSING_GRADE:
			return createPassingGrade();
		case DaGiMa_MDE_HW4Package.CAREER:
			return createCareer();
		case DaGiMa_MDE_HW4Package.NEWS:
			return createNews();
		case DaGiMa_MDE_HW4Package.EXTRA_INFO:
			return createExtraInfo();
		case DaGiMa_MDE_HW4Package.CUSTOM_ENUMERATION:
			return createCustomEnumeration();
		case DaGiMa_MDE_HW4Package.CONTAINER:
			return createContainer();
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
		case DaGiMa_MDE_HW4Package.THESIS_TYPE:
			return createThesisTypeFromString(eDataType, initialValue);
		case DaGiMa_MDE_HW4Package.CREDIT_TYPE:
			return createCreditTypeFromString(eDataType, initialValue);
		case DaGiMa_MDE_HW4Package.COURSE_PERIOD:
			return createCoursePeriodFromString(eDataType, initialValue);
		case DaGiMa_MDE_HW4Package.EXAM_TYPE:
			return createExamTypeFromString(eDataType, initialValue);
		case DaGiMa_MDE_HW4Package.METADATA_TYPE:
			return createMetadataTypeFromString(eDataType, initialValue);
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
		case DaGiMa_MDE_HW4Package.THESIS_TYPE:
			return convertThesisTypeToString(eDataType, instanceValue);
		case DaGiMa_MDE_HW4Package.CREDIT_TYPE:
			return convertCreditTypeToString(eDataType, instanceValue);
		case DaGiMa_MDE_HW4Package.COURSE_PERIOD:
			return convertCoursePeriodToString(eDataType, instanceValue);
		case DaGiMa_MDE_HW4Package.EXAM_TYPE:
			return convertExamTypeToString(eDataType, instanceValue);
		case DaGiMa_MDE_HW4Package.METADATA_TYPE:
			return convertMetadataTypeToString(eDataType, instanceValue);
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
	public ExtraInfo createExtraInfo() {
		ExtraInfoImpl extraInfo = new ExtraInfoImpl();
		return extraInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEnumeration createCustomEnumeration() {
		CustomEnumerationImpl customEnumeration = new CustomEnumerationImpl();
		return customEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public daGiMa_MDE_HW4.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisType createThesisTypeFromString(EDataType eDataType, String initialValue) {
		ThesisType result = ThesisType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public MetadataType createMetadataTypeFromString(EDataType eDataType, String initialValue) {
		MetadataType result = MetadataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetadataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DaGiMa_MDE_HW4Package getDaGiMa_MDE_HW4Package() {
		return (DaGiMa_MDE_HW4Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DaGiMa_MDE_HW4Package getPackage() {
		return DaGiMa_MDE_HW4Package.eINSTANCE;
	}

} //DaGiMa_MDE_HW4FactoryImpl
