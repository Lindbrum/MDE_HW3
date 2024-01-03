/**
 */
package daGiMa_MDE_HW4_old.impl;

import daGiMa_MDE_HW4_old.Course;
import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage;
import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldTables;
import daGiMa_MDE_HW4_old.DegreeCourse;
import daGiMa_MDE_HW4_old.DegreeCourseType;
import daGiMa_MDE_HW4_old.Department;
import daGiMa_MDE_HW4_old.Professor;
import daGiMa_MDE_HW4_old.Student;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * An implementation of the model object '<em><b>Degree Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getReference_year <em>Reference year</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getCfu <em>Cfu</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getEnrolled_students <em>Enrolled students</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getCourse_catalogue <em>Course catalogue</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.DegreeCourseImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DegreeCourseImpl extends MinimalEObjectImpl.Container implements DegreeCourse {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = "L-44";

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
	protected static final String NAME_EDEFAULT = "A degree course";

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
	 * The default value of the '{@link #getReference_year() <em>Reference year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_year()
	 * @generated
	 * @ordered
	 */
	protected static final int REFERENCE_YEAR_EDEFAULT = 2023;

	/**
	 * The cached value of the '{@link #getReference_year() <em>Reference year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_year()
	 * @generated
	 * @ordered
	 */
	protected int reference_year = REFERENCE_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCfu() <em>Cfu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfu()
	 * @generated
	 * @ordered
	 */
	protected static final int CFU_EDEFAULT = 180;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "A description of this course";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected Professor coordinator;

	/**
	 * The cached value of the '{@link #getEnrolled_students() <em>Enrolled students</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolled_students()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> enrolled_students;

	/**
	 * The cached value of the '{@link #getCourse_catalogue() <em>Course catalogue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse_catalogue()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course_catalogue;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DegreeCourseType TYPE_EDEFAULT = DegreeCourseType.BACHELOR_DEGREE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DegreeCourseType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4_oldPackage.Literals.DEGREE_COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReference_year() {
		return reference_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference_year(int newReference_year) {
		int oldReference_year = reference_year;
		reference_year = newReference_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__REFERENCE_YEAR, oldReference_year, reference_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CFU, oldCfu, cfu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartment() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, DaGiMa_MDE_HW4_oldPackage.DEPARTMENT__OFFERED_COURSES, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professor getCoordinator() {
		if (coordinator != null && coordinator.eIsProxy()) {
			InternalEObject oldCoordinator = (InternalEObject)coordinator;
			coordinator = (Professor)eResolveProxy(oldCoordinator);
			if (coordinator != oldCoordinator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR, oldCoordinator, coordinator));
			}
		}
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor basicGetCoordinator() {
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinator(Professor newCoordinator, NotificationChain msgs) {
		Professor oldCoordinator = coordinator;
		coordinator = newCoordinator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR, oldCoordinator, newCoordinator);
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
	public void setCoordinator(Professor newCoordinator) {
		if (newCoordinator != coordinator) {
			NotificationChain msgs = null;
			if (coordinator != null)
				msgs = ((InternalEObject)coordinator).eInverseRemove(this, DaGiMa_MDE_HW4_oldPackage.PROFESSOR__COORDINATED_DEGREE_COURSES, Professor.class, msgs);
			if (newCoordinator != null)
				msgs = ((InternalEObject)newCoordinator).eInverseAdd(this, DaGiMa_MDE_HW4_oldPackage.PROFESSOR__COORDINATED_DEGREE_COURSES, Professor.class, msgs);
			msgs = basicSetCoordinator(newCoordinator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR, newCoordinator, newCoordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getEnrolled_students() {
		if (enrolled_students == null) {
			enrolled_students = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__ENROLLED_STUDENTS, DaGiMa_MDE_HW4_oldPackage.STUDENT__ENROLLED_COURSES);
		}
		return enrolled_students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse_catalogue() {
		if (course_catalogue == null) {
			course_catalogue = new EObjectWithInverseResolvingEList.ManyInverse<Course>(Course.class, this, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE, DaGiMa_MDE_HW4_oldPackage.COURSE__DEGREE_COURSES);
		}
		return course_catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeCourseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DegreeCourseType newType) {
		DegreeCourseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean cfuBetweenValues(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "DegreeCourse::cfuBetweenValues";
		try {
			/**
			 *
			 * inv cfuBetweenValues:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = cfu > 0 and cfu <= 360
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, DaGiMa_MDE_HW4_oldPackage.Literals.DEGREE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, DaGiMa_MDE_HW4_oldTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int cfu_0 = this.getCfu();
				final /*@NonInvalid*/ IntegerValue BOXED_cfu_0 = ValueUtil.integerValueOf(cfu_0);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_cfu_0, DaGiMa_MDE_HW4_oldTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!gt) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_cfu_0, DaGiMa_MDE_HW4_oldTables.INT_360).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR:
				if (coordinator != null)
					msgs = ((InternalEObject)coordinator).eInverseRemove(this, DaGiMa_MDE_HW4_oldPackage.PROFESSOR__COORDINATED_DEGREE_COURSES, Professor.class, msgs);
				return basicSetCoordinator((Professor)otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__ENROLLED_STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnrolled_students()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourse_catalogue()).basicAdd(otherEnd, msgs);
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT:
				return basicSetDepartment(null, msgs);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR:
				return basicSetCoordinator(null, msgs);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__ENROLLED_STUDENTS:
				return ((InternalEList<?>)getEnrolled_students()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE:
				return ((InternalEList<?>)getCourse_catalogue()).basicRemove(otherEnd, msgs);
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW4_oldPackage.DEPARTMENT__OFFERED_COURSES, Department.class, msgs);
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CODE:
				return getCode();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__NAME:
				return getName();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__REFERENCE_YEAR:
				return getReference_year();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DURATION:
				return getDuration();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CFU:
				return getCfu();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DESCRIPTION:
				return getDescription();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__LANGUAGE:
				return getLanguage();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT:
				return getDepartment();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR:
				if (resolve) return getCoordinator();
				return basicGetCoordinator();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__ENROLLED_STUDENTS:
				return getEnrolled_students();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE:
				return getCourse_catalogue();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__TYPE:
				return getType();
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CODE:
				setCode((String)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__REFERENCE_YEAR:
				setReference_year((Integer)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DURATION:
				setDuration((Integer)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CFU:
				setCfu((Integer)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT:
				setDepartment((Department)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR:
				setCoordinator((Professor)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__ENROLLED_STUDENTS:
				getEnrolled_students().clear();
				getEnrolled_students().addAll((Collection<? extends Student>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE:
				getCourse_catalogue().clear();
				getCourse_catalogue().addAll((Collection<? extends Course>)newValue);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__TYPE:
				setType((DegreeCourseType)newValue);
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__REFERENCE_YEAR:
				setReference_year(REFERENCE_YEAR_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CFU:
				setCfu(CFU_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__LANGUAGE:
				getLanguage().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT:
				setDepartment((Department)null);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR:
				setCoordinator((Professor)null);
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__ENROLLED_STUDENTS:
				getEnrolled_students().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE:
				getCourse_catalogue().clear();
				return;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__REFERENCE_YEAR:
				return reference_year != REFERENCE_YEAR_EDEFAULT;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DURATION:
				return duration != DURATION_EDEFAULT;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__CFU:
				return cfu != CFU_EDEFAULT;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__LANGUAGE:
				return language != null && !language.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__DEPARTMENT:
				return getDepartment() != null;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COORDINATOR:
				return coordinator != null;
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__ENROLLED_STUDENTS:
				return enrolled_students != null && !enrolled_students.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__COURSE_CATALOGUE:
				return course_catalogue != null && !course_catalogue.isEmpty();
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE__TYPE:
				return type != TYPE_EDEFAULT;
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
			case DaGiMa_MDE_HW4_oldPackage.DEGREE_COURSE___CFU_BETWEEN_VALUES__DIAGNOSTICCHAIN_MAP:
				return cfuBetweenValues((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", reference_year: ");
		result.append(reference_year);
		result.append(", duration: ");
		result.append(duration);
		result.append(", cfu: ");
		result.append(cfu);
		result.append(", description: ");
		result.append(description);
		result.append(", language: ");
		result.append(language);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DegreeCourseImpl
