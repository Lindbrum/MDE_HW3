/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.Professor;
import daGiMa_MDE_HW3.Student;
import daGiMa_MDE_HW3.Thesis;
import daGiMa_MDE_HW3.ThesisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.ThesisImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ThesisImpl#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ThesisImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ThesisImpl#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ThesisImpl#getDegree_course <em>Degree course</em>}</li>
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
		return DaGiMa_MDE_HW3Package.Literals.THESIS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.THESIS__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.THESIS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW3Package.THESIS__STUDENT) return null;
		return (Student)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, DaGiMa_MDE_HW3Package.THESIS__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW3Package.THESIS__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.THESIS__STUDENT, newStudent, newStudent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR, oldSupervisor, supervisor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR, oldSupervisor, newSupervisor);
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
				msgs = ((InternalEObject)supervisor).eInverseRemove(this, DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS, Professor.class, msgs);
			if (newSupervisor != null)
				msgs = ((InternalEObject)newSupervisor).eInverseAdd(this, DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS, Professor.class, msgs);
			msgs = basicSetSupervisor(newSupervisor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR, newSupervisor, newSupervisor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW3Package.THESIS__DEGREE_COURSE, oldDegree_course, degree_course));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.THESIS__DEGREE_COURSE, oldDegree_course, degree_course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.THESIS__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Student)otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR:
				if (supervisor != null)
					msgs = ((InternalEObject)supervisor).eInverseRemove(this, DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS, Professor.class, msgs);
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
			case DaGiMa_MDE_HW3Package.THESIS__STUDENT:
				return basicSetStudent(null, msgs);
			case DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR:
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
			case DaGiMa_MDE_HW3Package.THESIS__STUDENT:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED, Student.class, msgs);
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
			case DaGiMa_MDE_HW3Package.THESIS__TITLE:
				return getTitle();
			case DaGiMa_MDE_HW3Package.THESIS__TYPE:
				return getType();
			case DaGiMa_MDE_HW3Package.THESIS__STUDENT:
				return getStudent();
			case DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR:
				if (resolve) return getSupervisor();
				return basicGetSupervisor();
			case DaGiMa_MDE_HW3Package.THESIS__DEGREE_COURSE:
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
			case DaGiMa_MDE_HW3Package.THESIS__TITLE:
				setTitle((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__TYPE:
				setType((ThesisType)newValue);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__STUDENT:
				setStudent((Student)newValue);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR:
				setSupervisor((Professor)newValue);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__DEGREE_COURSE:
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
			case DaGiMa_MDE_HW3Package.THESIS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__STUDENT:
				setStudent((Student)null);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR:
				setSupervisor((Professor)null);
				return;
			case DaGiMa_MDE_HW3Package.THESIS__DEGREE_COURSE:
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
			case DaGiMa_MDE_HW3Package.THESIS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DaGiMa_MDE_HW3Package.THESIS__TYPE:
				return type != TYPE_EDEFAULT;
			case DaGiMa_MDE_HW3Package.THESIS__STUDENT:
				return getStudent() != null;
			case DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR:
				return supervisor != null;
			case DaGiMa_MDE_HW3Package.THESIS__DEGREE_COURSE:
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
