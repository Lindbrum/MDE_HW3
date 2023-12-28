/**
 */
package daGiMa_MDE_HW4.impl;

import daGiMa_MDE_HW4.Course;
import daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package;
import daGiMa_MDE_HW4.ExamType;
import daGiMa_MDE_HW4.ExaminationCall;
import daGiMa_MDE_HW4.Student;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examination Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.impl.ExaminationCallImpl#getDate <em>Date</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ExaminationCallImpl#getClassroom <em>Classroom</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ExaminationCallImpl#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ExaminationCallImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ExaminationCallImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.ExaminationCallImpl#getBooked_students <em>Booked students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExaminationCallImpl extends MinimalEObjectImpl.Container implements ExaminationCall {
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
	 * The default value of the '{@link #getClassroom() <em>Classroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassroom()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassroom() <em>Classroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassroom()
	 * @generated
	 * @ordered
	 */
	protected String classroom = CLASSROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExamType TYPE_EDEFAULT = ExamType.WRITTEN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExamType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "An exam call description";

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
	 * The cached value of the '{@link #getBooked_students() <em>Booked students</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooked_students()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> booked_students;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4Package.Literals.EXAMINATION_CALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassroom() {
		return classroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassroom(String newClassroom) {
		String oldClassroom = classroom;
		classroom = newClassroom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.EXAMINATION_CALL__CLASSROOM, oldClassroom, classroom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExamType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ExamType newType) {
		ExamType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.EXAMINATION_CALL__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE) return null;
		return (Course)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourse, DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		if (newCourse != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE && newCourse != null)) {
			if (EcoreUtil.isAncestor(this, newCourse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, DaGiMa_MDE_HW4Package.COURSE__CALLS, Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getBooked_students() {
		if (booked_students == null) {
			booked_students = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, DaGiMa_MDE_HW4Package.EXAMINATION_CALL__BOOKED_STUDENTS, DaGiMa_MDE_HW4Package.STUDENT__BOOKED_CALLS);
		}
		return booked_students;
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
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourse((Course)otherEnd, msgs);
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__BOOKED_STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooked_students()).basicAdd(otherEnd, msgs);
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
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE:
				return basicSetCourse(null, msgs);
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__BOOKED_STUDENTS:
				return ((InternalEList<?>)getBooked_students()).basicRemove(otherEnd, msgs);
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
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW4Package.COURSE__CALLS, Course.class, msgs);
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
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DATE:
				return getDate();
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__CLASSROOM:
				return getClassroom();
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__TYPE:
				return getType();
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DESCRIPTION:
				return getDescription();
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE:
				return getCourse();
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__BOOKED_STUDENTS:
				return getBooked_students();
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
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DATE:
				setDate((Date)newValue);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__CLASSROOM:
				setClassroom((String)newValue);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__TYPE:
				setType((ExamType)newValue);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE:
				setCourse((Course)newValue);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__BOOKED_STUDENTS:
				getBooked_students().clear();
				getBooked_students().addAll((Collection<? extends Student>)newValue);
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
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__CLASSROOM:
				setClassroom(CLASSROOM_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE:
				setCourse((Course)null);
				return;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__BOOKED_STUDENTS:
				getBooked_students().clear();
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
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__CLASSROOM:
				return CLASSROOM_EDEFAULT == null ? classroom != null : !CLASSROOM_EDEFAULT.equals(classroom);
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__TYPE:
				return type != TYPE_EDEFAULT;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__COURSE:
				return getCourse() != null;
			case DaGiMa_MDE_HW4Package.EXAMINATION_CALL__BOOKED_STUDENTS:
				return booked_students != null && !booked_students.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(", classroom: ");
		result.append(classroom);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ExaminationCallImpl
