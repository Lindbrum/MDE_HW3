/**
 */
package daGiMa_MDE_HW4_old.impl;

import daGiMa_MDE_HW4_old.Course;
import daGiMa_MDE_HW4_old.CoursePeriod;
import daGiMa_MDE_HW4_old.CreditType;
import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage;
import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldTables;
import daGiMa_MDE_HW4_old.DegreeCourse;
import daGiMa_MDE_HW4_old.ExaminationCall;
import daGiMa_MDE_HW4_old.PassingGrade;
import daGiMa_MDE_HW4_old.Professor;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getId_course <em>Id course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getCfu <em>Cfu</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getCredit_type <em>Credit type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getYear <em>Year</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getDegree_courses <em>Degree courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.CourseImpl#getStudents_grades <em>Students grades</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getId_course() <em>Id course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_course()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_COURSE_EDEFAULT = "F-1234";

	/**
	 * The cached value of the '{@link #getId_course() <em>Id course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_course()
	 * @generated
	 * @ordered
	 */
	protected String id_course = ID_COURSE_EDEFAULT;

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
		return DaGiMa_MDE_HW4_oldPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_course() {
		return id_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_course(String newId_course) {
		String oldId_course = id_course;
		id_course = newId_course;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.COURSE__ID_COURSE, oldId_course, id_course));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, DaGiMa_MDE_HW4_oldPackage.COURSE__LANGUAGE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.COURSE__CFU, oldCfu, cfu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.COURSE__CREDIT_TYPE, oldCredit_type, credit_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.COURSE__YEAR, oldYear, year));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.COURSE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Professor> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectWithInverseResolvingEList.ManyInverse<Professor>(Professor.class, this, DaGiMa_MDE_HW4_oldPackage.COURSE__TEACHERS, DaGiMa_MDE_HW4_oldPackage.PROFESSOR__TAUGHT_COURSES);
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
			degree_courses = new EObjectWithInverseResolvingEList.ManyInverse<DegreeCourse>(DegreeCourse.class, this, DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE);
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
			calls = new EObjectContainmentWithInverseEList<ExaminationCall>(ExaminationCall.class, this, DaGiMa_MDE_HW4_oldPackage.COURSE__CALLS, DaGiMa_MDE_HW4_oldPackage.EXAMINATION_CALL__COURSE);
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
			students_grades = new EObjectWithInverseResolvingEList<PassingGrade>(PassingGrade.class, this, DaGiMa_MDE_HW4_oldPackage.COURSE__STUDENTS_GRADES, DaGiMa_MDE_HW4_oldPackage.PASSING_GRADE__COURSE);
		}
		return students_grades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean cfuCourseGreaterThan(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Course::cfuCourseGreaterThan";
		try {
			/**
			 *
			 * inv cfuCourseGreaterThan:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = cfu > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW4_oldPackage.Literals.COURSE___CFU_COURSE_GREATER_THAN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW4_oldTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int cfu = this.getCfu();
				final /*@NonInvalid*/ IntegerValue BOXED_cfu = ValueUtil.integerValueOf(cfu);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_cfu, DaGiMa_MDE_HW4_oldTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DaGiMa_MDE_HW4_oldTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			case DaGiMa_MDE_HW4_oldPackage.COURSE__TEACHERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeachers()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDegree_courses()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalls()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__STUDENTS_GRADES:
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
			case DaGiMa_MDE_HW4_oldPackage.COURSE__TEACHERS:
				return ((InternalEList<?>)getTeachers()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES:
				return ((InternalEList<?>)getDegree_courses()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CALLS:
				return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__STUDENTS_GRADES:
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
			case DaGiMa_MDE_HW4_oldPackage.COURSE__ID_COURSE:
				return getId_course();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__NAME:
				return getName();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__LANGUAGE:
				return getLanguage();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CFU:
				return getCfu();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CREDIT_TYPE:
				return getCredit_type();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__YEAR:
				return getYear();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__PERIOD:
				return getPeriod();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__TEACHERS:
				return getTeachers();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES:
				return getDegree_courses();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CALLS:
				return getCalls();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__STUDENTS_GRADES:
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
			case DaGiMa_MDE_HW4_oldPackage.COURSE__ID_COURSE:
				setId_course((String)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CFU:
				setCfu((Integer)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CREDIT_TYPE:
				setCredit_type((CreditType)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__YEAR:
				setYear((Integer)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__PERIOD:
				setPeriod((CoursePeriod)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Professor>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES:
				getDegree_courses().clear();
				getDegree_courses().addAll((Collection<? extends DegreeCourse>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends ExaminationCall>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__STUDENTS_GRADES:
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
			case DaGiMa_MDE_HW4_oldPackage.COURSE__ID_COURSE:
				setId_course(ID_COURSE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__LANGUAGE:
				getLanguage().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CFU:
				setCfu(CFU_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CREDIT_TYPE:
				setCredit_type(CREDIT_TYPE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__TEACHERS:
				getTeachers().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES:
				getDegree_courses().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CALLS:
				getCalls().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__STUDENTS_GRADES:
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
			case DaGiMa_MDE_HW4_oldPackage.COURSE__ID_COURSE:
				return ID_COURSE_EDEFAULT == null ? id_course != null : !ID_COURSE_EDEFAULT.equals(id_course);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW4_oldPackage.COURSE__LANGUAGE:
				return language != null && !language.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CFU:
				return cfu != CFU_EDEFAULT;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CREDIT_TYPE:
				return credit_type != CREDIT_TYPE_EDEFAULT;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__YEAR:
				return year != YEAR_EDEFAULT;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__PERIOD:
				return period != PERIOD_EDEFAULT;
			case DaGiMa_MDE_HW4_oldPackage.COURSE__TEACHERS:
				return teachers != null && !teachers.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES:
				return degree_courses != null && !degree_courses.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__CALLS:
				return calls != null && !calls.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.COURSE__STUDENTS_GRADES:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DaGiMa_MDE_HW4_oldPackage.COURSE___CFU_COURSE_GREATER_THAN__DIAGNOSTICCHAIN_MAP:
				return cfuCourseGreaterThan((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (id_course: ");
		result.append(id_course);
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
