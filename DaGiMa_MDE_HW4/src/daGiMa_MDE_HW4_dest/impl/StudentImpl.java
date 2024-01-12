/**
 */
package daGiMa_MDE_HW4_dest.impl;

import daGiMa_MDE_HW4_dest.Career;
import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage;
import daGiMa_MDE_HW4_dest.DegreeCourse;
import daGiMa_MDE_HW4_dest.ExaminationCall;
import daGiMa_MDE_HW4_dest.Student;
import daGiMa_MDE_HW4_dest.Thesis;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.StudentImpl#getThesis_defended <em>Thesis defended</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.StudentImpl#getEnrolled_courses <em>Enrolled courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.StudentImpl#getBooked_calls <em>Booked calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.StudentImpl#getTranscripts <em>Transcripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The cached value of the '{@link #getThesis_defended() <em>Thesis defended</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThesis_defended()
	 * @generated
	 * @ordered
	 */
	protected EList<Thesis> thesis_defended;

	/**
	 * The cached value of the '{@link #getEnrolled_courses() <em>Enrolled courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolled_courses()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeCourse> enrolled_courses;

	/**
	 * The cached value of the '{@link #getBooked_calls() <em>Booked calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooked_calls()
	 * @generated
	 * @ordered
	 */
	protected EList<ExaminationCall> booked_calls;

	/**
	 * The cached value of the '{@link #getTranscripts() <em>Transcripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Career> transcripts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4_destPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Thesis> getThesis_defended() {
		if (thesis_defended == null) {
			thesis_defended = new EObjectContainmentWithInverseEList<Thesis>(Thesis.class, this, DaGiMa_MDE_HW4_destPackage.STUDENT__THESIS_DEFENDED, DaGiMa_MDE_HW4_destPackage.THESIS__STUDENT);
		}
		return thesis_defended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeCourse> getEnrolled_courses() {
		if (enrolled_courses == null) {
			enrolled_courses = new EObjectWithInverseResolvingEList.ManyInverse<DegreeCourse>(DegreeCourse.class, this, DaGiMa_MDE_HW4_destPackage.STUDENT__ENROLLED_COURSES, DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__ENROLLED_STUDENTS);
		}
		return enrolled_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExaminationCall> getBooked_calls() {
		if (booked_calls == null) {
			booked_calls = new EObjectWithInverseResolvingEList.ManyInverse<ExaminationCall>(ExaminationCall.class, this, DaGiMa_MDE_HW4_destPackage.STUDENT__BOOKED_CALLS, DaGiMa_MDE_HW4_destPackage.EXAMINATION_CALL__BOOKED_STUDENTS);
		}
		return booked_calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Career> getTranscripts() {
		if (transcripts == null) {
			transcripts = new EObjectContainmentWithInverseEList<Career>(Career.class, this, DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS, DaGiMa_MDE_HW4_destPackage.CAREER__STUDENT);
		}
		return transcripts;
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
			case DaGiMa_MDE_HW4_destPackage.STUDENT__THESIS_DEFENDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThesis_defended()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.STUDENT__ENROLLED_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnrolled_courses()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.STUDENT__BOOKED_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooked_calls()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTranscripts()).basicAdd(otherEnd, msgs);
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
			case DaGiMa_MDE_HW4_destPackage.STUDENT__THESIS_DEFENDED:
				return ((InternalEList<?>)getThesis_defended()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.STUDENT__ENROLLED_COURSES:
				return ((InternalEList<?>)getEnrolled_courses()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.STUDENT__BOOKED_CALLS:
				return ((InternalEList<?>)getBooked_calls()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS:
				return ((InternalEList<?>)getTranscripts()).basicRemove(otherEnd, msgs);
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
			case DaGiMa_MDE_HW4_destPackage.STUDENT__THESIS_DEFENDED:
				return getThesis_defended();
			case DaGiMa_MDE_HW4_destPackage.STUDENT__ENROLLED_COURSES:
				return getEnrolled_courses();
			case DaGiMa_MDE_HW4_destPackage.STUDENT__BOOKED_CALLS:
				return getBooked_calls();
			case DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS:
				return getTranscripts();
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
			case DaGiMa_MDE_HW4_destPackage.STUDENT__THESIS_DEFENDED:
				getThesis_defended().clear();
				getThesis_defended().addAll((Collection<? extends Thesis>)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.STUDENT__ENROLLED_COURSES:
				getEnrolled_courses().clear();
				getEnrolled_courses().addAll((Collection<? extends DegreeCourse>)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.STUDENT__BOOKED_CALLS:
				getBooked_calls().clear();
				getBooked_calls().addAll((Collection<? extends ExaminationCall>)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS:
				getTranscripts().clear();
				getTranscripts().addAll((Collection<? extends Career>)newValue);
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
			case DaGiMa_MDE_HW4_destPackage.STUDENT__THESIS_DEFENDED:
				getThesis_defended().clear();
				return;
			case DaGiMa_MDE_HW4_destPackage.STUDENT__ENROLLED_COURSES:
				getEnrolled_courses().clear();
				return;
			case DaGiMa_MDE_HW4_destPackage.STUDENT__BOOKED_CALLS:
				getBooked_calls().clear();
				return;
			case DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS:
				getTranscripts().clear();
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
			case DaGiMa_MDE_HW4_destPackage.STUDENT__THESIS_DEFENDED:
				return thesis_defended != null && !thesis_defended.isEmpty();
			case DaGiMa_MDE_HW4_destPackage.STUDENT__ENROLLED_COURSES:
				return enrolled_courses != null && !enrolled_courses.isEmpty();
			case DaGiMa_MDE_HW4_destPackage.STUDENT__BOOKED_CALLS:
				return booked_calls != null && !booked_calls.isEmpty();
			case DaGiMa_MDE_HW4_destPackage.STUDENT__TRANSCRIPTS:
				return transcripts != null && !transcripts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudentImpl
