/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.Career;
import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Tables;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.PassingGrade;
import daGiMa_MDE_HW3.Student;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Career</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.CareerImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CareerImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CareerImpl#getDegree_course <em>Degree course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CareerImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.CareerImpl#getTotalAcquiredCfu <em>Total Acquired Cfu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CareerImpl extends MinimalEObjectImpl.Container implements Career {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "New transcript";

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
	 * The cached value of the '{@link #getDegree_course() <em>Degree course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree_course()
	 * @generated
	 * @ordered
	 */
	protected DegreeCourse degree_course;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<PassingGrade> courses;

	/**
	 * The default value of the '{@link #getTotalAcquiredCfu() <em>Total Acquired Cfu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAcquiredCfu()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TOTAL_ACQUIRED_CFU_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW3Package.Literals.CAREER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.CAREER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW3Package.CAREER__STUDENT) return null;
		return (Student)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, DaGiMa_MDE_HW3Package.CAREER__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW3Package.CAREER__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.CAREER__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeCourse getDegree_course() {
		if (degree_course != null && degree_course.eIsProxy()) {
			InternalEObject oldDegree_course = (InternalEObject)degree_course;
			degree_course = (DegreeCourse)eResolveProxy(oldDegree_course);
			if (degree_course != oldDegree_course) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW3Package.CAREER__DEGREE_COURSE, oldDegree_course, degree_course));
			}
		}
		return degree_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeCourse basicGetDegree_course() {
		return degree_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree_course(DegreeCourse newDegree_course) {
		DegreeCourse oldDegree_course = degree_course;
		degree_course = newDegree_course;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.CAREER__DEGREE_COURSE, oldDegree_course, degree_course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PassingGrade> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<PassingGrade>(PassingGrade.class, this, DaGiMa_MDE_HW3Package.CAREER__COURSES, DaGiMa_MDE_HW3Package.PASSING_GRADE__STUDENT);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTotalAcquiredCfu() {
		/**
		 *
		 * courses->select(transcriptEntry |
		 *   transcriptEntry.grade.size() > 0)
		 * ->collect(passingGrade | passingGrade.course.cfu)
		 * ->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<PassingGrade> courses = this.getCourses();
		final /*@NonInvalid*/ OrderedSetValue BOXED_courses = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_CLSSid_PassingGrade, courses);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DaGiMa_MDE_HW3Tables.ORD_CLSSid_PassingGrade);
		Iterator<Object> ITERATOR_transcriptEntry = BOXED_courses.iterator();
		/*@Thrown*/ OrderedSetValue select;
		while (true) {
			if (!ITERATOR_transcriptEntry.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ PassingGrade transcriptEntry = (PassingGrade)ITERATOR_transcriptEntry.next();
			/**
			 * transcriptEntry.grade.size() > 0
			 */
			final /*@NonInvalid*/ String grade = transcriptEntry.getGrade();
			if (grade == null) {
				throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
			}
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(grade);
			final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
			//
			if (gt == ValueUtil.TRUE_VALUE) {
				accumulator.add(transcriptEntry);
			}
		}
		/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(DaGiMa_MDE_HW3Tables.SEQ_DATAid_EInt);
		Iterator<Object> ITERATOR_passingGrade = select.iterator();
		/*@Thrown*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_passingGrade.hasNext()) {
				collect = accumulator_0;
				break;
			}
			/*@NonInvalid*/ PassingGrade passingGrade = (PassingGrade)ITERATOR_passingGrade.next();
			/**
			 * passingGrade.course.cfu
			 */
			final /*@NonInvalid*/ Course course = passingGrade.getCourse();
			final /*@NonInvalid*/ int cfu = course.getCfu();
			final /*@NonInvalid*/ IntegerValue BOXED_cfu = ValueUtil.integerValueOf(cfu);
			//
			accumulator_0.add(BOXED_cfu);
		}
		final /*@Thrown*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW3Tables.DATAid_EInt, collect);
		final BigInteger ECORE_sum = ValueUtil.bigIntegerValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTotalAcquiredCfu(BigInteger newTotalAcquiredCfu) {
		// TODO: implement this method to set the 'Total Acquired Cfu' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean passedAllExams() {
		/**
		 *
		 * courses->forAll(course | course.grade.size() > 0)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<PassingGrade> courses = this.getCourses();
		final /*@NonInvalid*/ OrderedSetValue BOXED_courses = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_CLSSid_PassingGrade, courses);
		/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		Iterator<Object> ITERATOR_course = BOXED_courses.iterator();
		/*@Thrown*/ Boolean forAll;
		while (true) {
			if (!ITERATOR_course.hasNext()) {
				if (accumulator == ValueUtil.TRUE_VALUE) {
					forAll = ValueUtil.TRUE_VALUE;
				}
				else {
					throw (InvalidValueException)accumulator;
				}
				break;
			}
			/*@NonInvalid*/ PassingGrade course = (PassingGrade)ITERATOR_course.next();
			/**
			 * course.grade.size() > 0
			 */
			/*@Caught*/ Object CAUGHT_gt;
			try {
				final /*@NonInvalid*/ String grade = course.getGrade();
				if (grade == null) {
					throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
				}
				final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(grade);
				final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, DaGiMa_MDE_HW3Tables.INT_0).booleanValue();
				CAUGHT_gt = gt;
			}
			catch (Exception e) {
				CAUGHT_gt = ValueUtil.createInvalidValue(e);
			}
			//
			if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
				forAll = ValueUtil.FALSE_VALUE;
				break;														// Stop immediately
			}
			else if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
				;															// Carry on
			}
			else if (CAUGHT_gt instanceof InvalidValueException) {		// Abnormal exception evaluation result
				accumulator = CAUGHT_gt;									// Cache an exception failure
			}
			else {															// Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
			}
		}
		if (forAll == null) {
			throw new InvalidValueException("Null body for \'daGiMa_MDE_HW3::Career::passedAllExams() : Boolean[1]\'");
		}
		return forAll;
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
			case DaGiMa_MDE_HW3Package.CAREER__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Student)otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.CAREER__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
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
			case DaGiMa_MDE_HW3Package.CAREER__STUDENT:
				return basicSetStudent(null, msgs);
			case DaGiMa_MDE_HW3Package.CAREER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
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
			case DaGiMa_MDE_HW3Package.CAREER__STUDENT:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS, Student.class, msgs);
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
			case DaGiMa_MDE_HW3Package.CAREER__NAME:
				return getName();
			case DaGiMa_MDE_HW3Package.CAREER__STUDENT:
				return getStudent();
			case DaGiMa_MDE_HW3Package.CAREER__DEGREE_COURSE:
				if (resolve) return getDegree_course();
				return basicGetDegree_course();
			case DaGiMa_MDE_HW3Package.CAREER__COURSES:
				return getCourses();
			case DaGiMa_MDE_HW3Package.CAREER__TOTAL_ACQUIRED_CFU:
				return getTotalAcquiredCfu();
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
			case DaGiMa_MDE_HW3Package.CAREER__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.CAREER__STUDENT:
				setStudent((Student)newValue);
				return;
			case DaGiMa_MDE_HW3Package.CAREER__DEGREE_COURSE:
				setDegree_course((DegreeCourse)newValue);
				return;
			case DaGiMa_MDE_HW3Package.CAREER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends PassingGrade>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.CAREER__TOTAL_ACQUIRED_CFU:
				setTotalAcquiredCfu((BigInteger)newValue);
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
			case DaGiMa_MDE_HW3Package.CAREER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.CAREER__STUDENT:
				setStudent((Student)null);
				return;
			case DaGiMa_MDE_HW3Package.CAREER__DEGREE_COURSE:
				setDegree_course((DegreeCourse)null);
				return;
			case DaGiMa_MDE_HW3Package.CAREER__COURSES:
				getCourses().clear();
				return;
			case DaGiMa_MDE_HW3Package.CAREER__TOTAL_ACQUIRED_CFU:
				setTotalAcquiredCfu(TOTAL_ACQUIRED_CFU_EDEFAULT);
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
			case DaGiMa_MDE_HW3Package.CAREER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW3Package.CAREER__STUDENT:
				return getStudent() != null;
			case DaGiMa_MDE_HW3Package.CAREER__DEGREE_COURSE:
				return degree_course != null;
			case DaGiMa_MDE_HW3Package.CAREER__COURSES:
				return courses != null && !courses.isEmpty();
			case DaGiMa_MDE_HW3Package.CAREER__TOTAL_ACQUIRED_CFU:
				return TOTAL_ACQUIRED_CFU_EDEFAULT == null ? getTotalAcquiredCfu() != null : !TOTAL_ACQUIRED_CFU_EDEFAULT.equals(getTotalAcquiredCfu());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DaGiMa_MDE_HW3Package.CAREER___PASSED_ALL_EXAMS:
				return passedAllExams();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CareerImpl
