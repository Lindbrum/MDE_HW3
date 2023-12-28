/**
 */
package daGiMa_MDE_HW4.impl;

import daGiMa_MDE_HW4.Career;
import daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package;
import daGiMa_MDE_HW4.DaGiMa_MDE_HW4Tables;
import daGiMa_MDE_HW4.DegreeCourse;
import daGiMa_MDE_HW4.Professor;
import daGiMa_MDE_HW4.Student;
import daGiMa_MDE_HW4.Thesis;
import daGiMa_MDE_HW4.ThesisType;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.impl.ThesisImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ThesisImpl#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ThesisImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ThesisImpl#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ThesisImpl#getDegree_course <em>Degree course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThesisImpl extends MinimalEObjectImpl.Container implements Thesis {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "A thesis";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ThesisType TYPE_EDEFAULT = ThesisType.COMPILATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ThesisType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisor()
	 * @generated
	 * @ordered
	 */
	protected Professor supervisor;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4Package.Literals.THESIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.THESIS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThesisType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ThesisType newType) {
		ThesisType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.THESIS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW4Package.THESIS__STUDENT) return null;
		return (Student)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, DaGiMa_MDE_HW4Package.THESIS__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW4Package.THESIS__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, DaGiMa_MDE_HW4Package.STUDENT__THESIS_DEFENDED, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.THESIS__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professor getSupervisor() {
		if (supervisor != null && supervisor.eIsProxy()) {
			InternalEObject oldSupervisor = (InternalEObject)supervisor;
			supervisor = (Professor)eResolveProxy(oldSupervisor);
			if (supervisor != oldSupervisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR, oldSupervisor, supervisor));
			}
		}
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor basicGetSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupervisor(Professor newSupervisor, NotificationChain msgs) {
		Professor oldSupervisor = supervisor;
		supervisor = newSupervisor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR, oldSupervisor, newSupervisor);
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
	public void setSupervisor(Professor newSupervisor) {
		if (newSupervisor != supervisor) {
			NotificationChain msgs = null;
			if (supervisor != null)
				msgs = ((InternalEObject)supervisor).eInverseRemove(this, DaGiMa_MDE_HW4Package.PROFESSOR__SUPERVISED_THESIS, Professor.class, msgs);
			if (newSupervisor != null)
				msgs = ((InternalEObject)newSupervisor).eInverseAdd(this, DaGiMa_MDE_HW4Package.PROFESSOR__SUPERVISED_THESIS, Professor.class, msgs);
			msgs = basicSetSupervisor(newSupervisor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR, newSupervisor, newSupervisor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW4Package.THESIS__DEGREE_COURSE, oldDegree_course, degree_course));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.THESIS__DEGREE_COURSE, oldDegree_course, degree_course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkIfEnoughCreditsToGraduate(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Thesis::checkIfEnoughCreditsToGraduate";
		try {
			/**
			 *
			 * inv checkIfEnoughCreditsToGraduate:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = student.transcripts->select(transcript | transcript.degree_course = self.degree_course)
			 *         ->forAll(e | e.passedAllExams())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW4Package.Literals.THESIS___CHECK_IF_ENOUGH_CREDITS_TO_GRADUATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW4Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ Student student = this.getStudent();
				final /*@NonInvalid*/ List<Career> transcripts = student.getTranscripts();
				final /*@NonInvalid*/ OrderedSetValue BOXED_transcripts = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW4Tables.ORD_CLSSid_Career, transcripts);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DaGiMa_MDE_HW4Tables.ORD_CLSSid_Career);
				Iterator<Object> ITERATOR_transcript = BOXED_transcripts.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_transcript.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Career transcript = (Career)ITERATOR_transcript.next();
					/**
					 * transcript.degree_course = self.degree_course
					 */
					final /*@NonInvalid*/ DegreeCourse degree_course = transcript.getDegree_course();
					final /*@NonInvalid*/ DegreeCourse degree_course_0 = this.getDegree_course();
					final /*@NonInvalid*/ boolean eq = degree_course.equals(degree_course_0);
					//
					if (eq) {
						accumulator.add(transcript);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_e_0 = select.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Career e_0 = (Career)ITERATOR_e_0.next();
					/**
					 * e.passedAllExams()
					 */
					final /*@NonInvalid*/ boolean passedAllExams = e_0.passedAllExams();
					//
					if (!passedAllExams) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (passedAllExams) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, DaGiMa_MDE_HW4Tables.INT_0).booleanValue();
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
			case DaGiMa_MDE_HW4Package.THESIS__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Student)otherEnd, msgs);
			case DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR:
				if (supervisor != null)
					msgs = ((InternalEObject)supervisor).eInverseRemove(this, DaGiMa_MDE_HW4Package.PROFESSOR__SUPERVISED_THESIS, Professor.class, msgs);
				return basicSetSupervisor((Professor)otherEnd, msgs);
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
			case DaGiMa_MDE_HW4Package.THESIS__STUDENT:
				return basicSetStudent(null, msgs);
			case DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR:
				return basicSetSupervisor(null, msgs);
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
			case DaGiMa_MDE_HW4Package.THESIS__STUDENT:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW4Package.STUDENT__THESIS_DEFENDED, Student.class, msgs);
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
			case DaGiMa_MDE_HW4Package.THESIS__TITLE:
				return getTitle();
			case DaGiMa_MDE_HW4Package.THESIS__TYPE:
				return getType();
			case DaGiMa_MDE_HW4Package.THESIS__STUDENT:
				return getStudent();
			case DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR:
				if (resolve) return getSupervisor();
				return basicGetSupervisor();
			case DaGiMa_MDE_HW4Package.THESIS__DEGREE_COURSE:
				if (resolve) return getDegree_course();
				return basicGetDegree_course();
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
			case DaGiMa_MDE_HW4Package.THESIS__TITLE:
				setTitle((String)newValue);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__TYPE:
				setType((ThesisType)newValue);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__STUDENT:
				setStudent((Student)newValue);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR:
				setSupervisor((Professor)newValue);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__DEGREE_COURSE:
				setDegree_course((DegreeCourse)newValue);
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
			case DaGiMa_MDE_HW4Package.THESIS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__STUDENT:
				setStudent((Student)null);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR:
				setSupervisor((Professor)null);
				return;
			case DaGiMa_MDE_HW4Package.THESIS__DEGREE_COURSE:
				setDegree_course((DegreeCourse)null);
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
			case DaGiMa_MDE_HW4Package.THESIS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DaGiMa_MDE_HW4Package.THESIS__TYPE:
				return type != TYPE_EDEFAULT;
			case DaGiMa_MDE_HW4Package.THESIS__STUDENT:
				return getStudent() != null;
			case DaGiMa_MDE_HW4Package.THESIS__SUPERVISOR:
				return supervisor != null;
			case DaGiMa_MDE_HW4Package.THESIS__DEGREE_COURSE:
				return degree_course != null;
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
			case DaGiMa_MDE_HW4Package.THESIS___CHECK_IF_ENOUGH_CREDITS_TO_GRADUATE__DIAGNOSTICCHAIN_MAP:
				return checkIfEnoughCreditsToGraduate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ThesisImpl
