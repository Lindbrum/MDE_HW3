/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.CoursePeriod;
import daGiMa_MDE_HW3.CreditType;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.ExaminationCall;
import daGiMa_MDE_HW3.PassingGrade;
import daGiMa_MDE_HW3.Professor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getCfu <em>Cfu</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getCredit_type <em>Credit type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getYear <em>Year</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getDegree_courses <em>Degree courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CourseImpl#getStudents_grades <em>Students grades</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = "F-1234";

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "A course";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * The default value of the '{@link #getCfu() <em>Cfu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfu()
	 * @generated
	 * @ordered
	 */
	protected static final int CFU_EDEFAULT = 6;

	/**
	 * The cached value of the '{@link #getCfu() <em>Cfu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfu()
	 * @generated
	 * @ordered
	 */
	protected int cfu = CFU_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredit_type() <em>Credit type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_type()
	 * @generated
	 * @ordered
	 */
	protected static final CreditType CREDIT_TYPE_EDEFAULT = CreditType.B;

	/**
	 * The cached value of the '{@link #getCredit_type() <em>Credit type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_type()
	 * @generated
	 * @ordered
	 */
	protected CreditType credit_type = CREDIT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final CoursePeriod PERIOD_EDEFAULT = CoursePeriod.FIRST_SEMESTER;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected CoursePeriod period = PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor> teachers;

	/**
	 * The cached value of the '{@link #getDegree_courses() <em>Degree courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree_courses()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeCourse> degree_courses;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<ExaminationCall> calls;

	/**
	 * The cached value of the '{@link #getStudents_grades() <em>Students grades</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents_grades()
	 * @generated
	 * @ordered
	 */
	protected EList<PassingGrade> students_grades;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW3Package.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, DaGiMa_MDE_HW3Package.COURSE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCfu() {
		return cfu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCfu(int newCfu) {
		int oldCfu = cfu;
		cfu = newCfu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.COURSE__CFU, oldCfu, cfu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreditType getCredit_type() {
		return credit_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit_type(CreditType newCredit_type) {
		CreditType oldCredit_type = credit_type;
		credit_type = newCredit_type == null ? CREDIT_TYPE_EDEFAULT : newCredit_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.COURSE__CREDIT_TYPE, oldCredit_type, credit_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.COURSE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoursePeriod getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(CoursePeriod newPeriod) {
		CoursePeriod oldPeriod = period;
		period = newPeriod == null ? PERIOD_EDEFAULT : newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.COURSE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Professor> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectResolvingEList<Professor>(Professor.class, this, DaGiMa_MDE_HW3Package.COURSE__TEACHERS);
		}
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeCourse> getDegree_courses() {
		if (degree_courses == null) {
			degree_courses = new EObjectWithInverseResolvingEList.ManyInverse<DegreeCourse>(DegreeCourse.class, this, DaGiMa_MDE_HW3Package.COURSE__DEGREE_COURSES, DaGiMa_MDE_HW3Package.DEGREE_COURSE__COURSE_CATALOGUE);
		}
		return degree_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExaminationCall> getCalls() {
		if (calls == null) {
			calls = new EObjectContainmentWithInverseEList<ExaminationCall>(ExaminationCall.class, this, DaGiMa_MDE_HW3Package.COURSE__CALLS, DaGiMa_MDE_HW3Package.EXAMINATION_CALL__COURSE);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PassingGrade> getStudents_grades() {
		if (students_grades == null) {
			students_grades = new EObjectWithInverseResolvingEList<PassingGrade>(PassingGrade.class, this, DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES, DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE);
		}
		return students_grades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.COURSE__DEGREE_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDegree_courses()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.COURSE__CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalls()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents_grades()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.COURSE__DEGREE_COURSES:
				return ((InternalEList<?>)getDegree_courses()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.COURSE__CALLS:
				return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES:
				return ((InternalEList<?>)getStudents_grades()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.COURSE__CODE:
				return getCode();
			case DaGiMa_MDE_HW3Package.COURSE__NAME:
				return getName();
			case DaGiMa_MDE_HW3Package.COURSE__LANGUAGE:
				return getLanguage();
			case DaGiMa_MDE_HW3Package.COURSE__CFU:
				return getCfu();
			case DaGiMa_MDE_HW3Package.COURSE__CREDIT_TYPE:
				return getCredit_type();
			case DaGiMa_MDE_HW3Package.COURSE__YEAR:
				return getYear();
			case DaGiMa_MDE_HW3Package.COURSE__PERIOD:
				return getPeriod();
			case DaGiMa_MDE_HW3Package.COURSE__TEACHERS:
				return getTeachers();
			case DaGiMa_MDE_HW3Package.COURSE__DEGREE_COURSES:
				return getDegree_courses();
			case DaGiMa_MDE_HW3Package.COURSE__CALLS:
				return getCalls();
			case DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES:
				return getStudents_grades();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.COURSE__CODE:
				setCode((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__CFU:
				setCfu((Integer)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__CREDIT_TYPE:
				setCredit_type((CreditType)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__YEAR:
				setYear((Integer)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__PERIOD:
				setPeriod((CoursePeriod)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Professor>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__DEGREE_COURSES:
				getDegree_courses().clear();
				getDegree_courses().addAll((Collection<? extends DegreeCourse>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends ExaminationCall>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES:
				getStudents_grades().clear();
				getStudents_grades().addAll((Collection<? extends PassingGrade>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__LANGUAGE:
				getLanguage().clear();
				return;
			case DaGiMa_MDE_HW3Package.COURSE__CFU:
				setCfu(CFU_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__CREDIT_TYPE:
				setCredit_type(CREDIT_TYPE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.COURSE__TEACHERS:
				getTeachers().clear();
				return;
			case DaGiMa_MDE_HW3Package.COURSE__DEGREE_COURSES:
				getDegree_courses().clear();
				return;
			case DaGiMa_MDE_HW3Package.COURSE__CALLS:
				getCalls().clear();
				return;
			case DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES:
				getStudents_grades().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DaGiMa_MDE_HW3Package.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW3Package.COURSE__LANGUAGE:
				return language != null && !language.isEmpty();
			case DaGiMa_MDE_HW3Package.COURSE__CFU:
				return cfu != CFU_EDEFAULT;
			case DaGiMa_MDE_HW3Package.COURSE__CREDIT_TYPE:
				return credit_type != CREDIT_TYPE_EDEFAULT;
			case DaGiMa_MDE_HW3Package.COURSE__YEAR:
				return year != YEAR_EDEFAULT;
			case DaGiMa_MDE_HW3Package.COURSE__PERIOD:
				return period != PERIOD_EDEFAULT;
			case DaGiMa_MDE_HW3Package.COURSE__TEACHERS:
				return teachers != null && !teachers.isEmpty();
			case DaGiMa_MDE_HW3Package.COURSE__DEGREE_COURSES:
				return degree_courses != null && !degree_courses.isEmpty();
			case DaGiMa_MDE_HW3Package.COURSE__CALLS:
				return calls != null && !calls.isEmpty();
			case DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES:
				return students_grades != null && !students_grades.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", language: ");
		result.append(language);
		result.append(", cfu: ");
		result.append(cfu);
		result.append(", credit_type: ");
		result.append(credit_type);
		result.append(", year: ");
		result.append(year);
		result.append(", period: ");
		result.append(period);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
