/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.Career;
import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Tables;
import daGiMa_MDE_HW3.PassingGrade;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passing Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.PassingGradeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.PassingGradeImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.PassingGradeImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.PassingGradeImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassingGradeImpl extends MinimalEObjectImpl.Container implements PassingGrade {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2024-01-28");

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_EDEFAULT = "30";

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected String grade = GRADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassingGradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW3Package.Literals.PASSING_GRADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.PASSING_GRADE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(String newGrade) {
		String oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.PASSING_GRADE__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE, oldCourse, newCourse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		if (newCourse != course) {
			NotificationChain msgs = null;
			if (course != null)
				msgs = ((InternalEObject)course).eInverseRemove(this, DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES, Course.class, msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES, Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Career getStudent() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT) return null;
		return (Career)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Career newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Career newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, DaGiMa_MDE_HW3Package.CAREER__COURSES, Career.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean mustBeSufficientIfDefined(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PassingGrade::mustBeSufficientIfDefined";
		try {
			/**
			 *
			 * inv mustBeSufficientIfDefined:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = grade.oclIsUndefined() or
			 *         grade.matches('([Aa][+]{0,1}){1}|[B-Db-d]{1}|(1[8-9]{1}|2[0-9]{1}|30[Ll]{0,1}){1}')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Package.Literals.PASSING_GRADE___MUST_BE_SUFFICIENT_IF_DEFINED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String grade = this.getGrade();
					final /*@NonInvalid*/ boolean oclIsUndefined = grade == null;
					final /*@Thrown*/ Boolean result;
					if (oclIsUndefined) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_matches;
						try {
							if (grade == null) {
								throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, grade, DaGiMa_MDE_HW3Tables.STR__o_91_Aa_93_91_p_93_123_0_44_1_125_e_123_1_125_124_91_B_m_Db_m_d_93_123_1_125_124_o_1_91_8_m_9_93_123_1_125_124_2_91_0_m_9_93_123_1_125_124_30_91_Ll_93_123_0_44_1_125_e_123).booleanValue();
							CAUGHT_matches = matches;
						}
						catch (Exception e) {
							CAUGHT_matches = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_matches == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_matches instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_matches;
							}
							result = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE:
				if (course != null)
					msgs = ((InternalEObject)course).eInverseRemove(this, DaGiMa_MDE_HW3Package.COURSE__STUDENTS_GRADES, Course.class, msgs);
				return basicSetCourse((Course)otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Career)otherEnd, msgs);
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
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE:
				return basicSetCourse(null, msgs);
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT:
				return basicSetStudent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW3Package.CAREER__COURSES, Career.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__DATE:
				return getDate();
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__GRADE:
				return getGrade();
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT:
				return getStudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__DATE:
				setDate((Date)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__GRADE:
				setGrade((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE:
				setCourse((Course)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT:
				setStudent((Career)newValue);
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
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE:
				setCourse((Course)null);
				return;
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT:
				setStudent((Career)null);
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
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__GRADE:
				return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__COURSE:
				return course != null;
			case DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT:
				return getStudent() != null;
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
			case DaGiMa_MDE_HW3Package.PASSING_GRADE___MUST_BE_SUFFICIENT_IF_DEFINED__DIAGNOSTICCHAIN_MAP:
				return mustBeSufficientIfDefined((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (date: ");
		result.append(date);
		result.append(", grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //PassingGradeImpl
