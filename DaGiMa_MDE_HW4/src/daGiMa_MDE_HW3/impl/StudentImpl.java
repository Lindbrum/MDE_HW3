/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.Career;
import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Tables;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.ExaminationCall;
import daGiMa_MDE_HW3.PassingGrade;
import daGiMa_MDE_HW3.Student;
import daGiMa_MDE_HW3.Thesis;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;
import org.eclipse.ocl.pivot.library.collection.CollectionAsOrderedSetOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.StudentImpl#getStudent_exams <em>Student exams</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.StudentImpl#getMatriculation_number <em>Matriculation number</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.StudentImpl#getThesis_defended <em>Thesis defended</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.StudentImpl#getEnrolled_courses <em>Enrolled courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.StudentImpl#getBooked_calls <em>Booked calls</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.StudentImpl#getTranscripts <em>Transcripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The default value of the '{@link #getMatriculation_number() <em>Matriculation number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculation_number()
	 * @generated
	 * @ordered
	 */
	protected static final long MATRICULATION_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMatriculation_number() <em>Matriculation number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculation_number()
	 * @generated
	 * @ordered
	 */
	protected long matriculation_number = MATRICULATION_NUMBER_EDEFAULT;

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
		return DaGiMa_MDE_HW3Package.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getStudent_exams() {
		/**
		 *
		 * transcripts->collect(transcript | transcript.courses.course)
		 * ->asOrderedSet()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Career> transcripts = this.getTranscripts();
		final /*@NonInvalid*/ OrderedSetValue BOXED_transcripts = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_CLSSid_Career, transcripts);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DaGiMa_MDE_HW3Tables.SEQ_CLSSid_Course);
		Iterator<Object> ITERATOR_transcript = BOXED_transcripts.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_transcript.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ Career transcript = (Career)ITERATOR_transcript.next();
			/**
			 * transcript.courses.course
			 */
			final /*@NonInvalid*/ List<PassingGrade> courses = transcript.getCourses();
			final /*@NonInvalid*/ OrderedSetValue BOXED_courses = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_CLSSid_PassingGrade, courses);
			/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(DaGiMa_MDE_HW3Tables.SEQ_CLSSid_Course);
			Iterator<Object> ITERATOR__1 = BOXED_courses.iterator();
			/*@NonInvalid*/ SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect_0 = accumulator_0;
					break;
				}
				/*@NonInvalid*/ PassingGrade _1 = (PassingGrade)ITERATOR__1.next();
				/**
				 * course
				 */
				final /*@NonInvalid*/ Course course = _1.getCourse();
				//
				accumulator_0.add(course);
			}
			//
			for (Object value : collect_0.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		final /*@NonInvalid*/ OrderedSetValue asOrderedSet = CollectionAsOrderedSetOperation.INSTANCE.evaluate(collect);
		final /*@NonInvalid*/ List<Course> ECORE_asOrderedSet = ((IdResolverExtension)idResolver).ecoreValueOfAll(Course.class, asOrderedSet);
		return (EList<Course>)ECORE_asOrderedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMatriculation_number() {
		return matriculation_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatriculation_number(long newMatriculation_number) {
		long oldMatriculation_number = matriculation_number;
		matriculation_number = newMatriculation_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.STUDENT__MATRICULATION_NUMBER, oldMatriculation_number, matriculation_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Thesis> getThesis_defended() {
		if (thesis_defended == null) {
			thesis_defended = new EObjectContainmentWithInverseEList<Thesis>(Thesis.class, this, DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED, DaGiMa_MDE_HW3Package.THESIS__STUDENT);
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
			enrolled_courses = new EObjectWithInverseResolvingEList.ManyInverse<DegreeCourse>(DegreeCourse.class, this, DaGiMa_MDE_HW3Package.STUDENT__ENROLLED_COURSES, DaGiMa_MDE_HW3Package.DEGREE_COURSE__ENROLLED_STUDENTS);
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
			booked_calls = new EObjectWithInverseResolvingEList.ManyInverse<ExaminationCall>(ExaminationCall.class, this, DaGiMa_MDE_HW3Package.STUDENT__BOOKED_CALLS, DaGiMa_MDE_HW3Package.EXAMINATION_CALL__BOOKED_STUDENTS);
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
			transcripts = new EObjectContainmentWithInverseEList<Career>(Career.class, this, DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS, DaGiMa_MDE_HW3Package.CAREER__STUDENT);
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
			case DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThesis_defended()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.STUDENT__ENROLLED_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnrolled_courses()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.STUDENT__BOOKED_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooked_calls()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS:
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
			case DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED:
				return ((InternalEList<?>)getThesis_defended()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.STUDENT__ENROLLED_COURSES:
				return ((InternalEList<?>)getEnrolled_courses()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.STUDENT__BOOKED_CALLS:
				return ((InternalEList<?>)getBooked_calls()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS:
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
			case DaGiMa_MDE_HW3Package.STUDENT__STUDENT_EXAMS:
				return getStudent_exams();
			case DaGiMa_MDE_HW3Package.STUDENT__MATRICULATION_NUMBER:
				return getMatriculation_number();
			case DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED:
				return getThesis_defended();
			case DaGiMa_MDE_HW3Package.STUDENT__ENROLLED_COURSES:
				return getEnrolled_courses();
			case DaGiMa_MDE_HW3Package.STUDENT__BOOKED_CALLS:
				return getBooked_calls();
			case DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS:
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
			case DaGiMa_MDE_HW3Package.STUDENT__STUDENT_EXAMS:
				getStudent_exams().clear();
				getStudent_exams().addAll((Collection<? extends Course>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__MATRICULATION_NUMBER:
				setMatriculation_number((Long)newValue);
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED:
				getThesis_defended().clear();
				getThesis_defended().addAll((Collection<? extends Thesis>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__ENROLLED_COURSES:
				getEnrolled_courses().clear();
				getEnrolled_courses().addAll((Collection<? extends DegreeCourse>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__BOOKED_CALLS:
				getBooked_calls().clear();
				getBooked_calls().addAll((Collection<? extends ExaminationCall>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS:
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
			case DaGiMa_MDE_HW3Package.STUDENT__STUDENT_EXAMS:
				getStudent_exams().clear();
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__MATRICULATION_NUMBER:
				setMatriculation_number(MATRICULATION_NUMBER_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED:
				getThesis_defended().clear();
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__ENROLLED_COURSES:
				getEnrolled_courses().clear();
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__BOOKED_CALLS:
				getBooked_calls().clear();
				return;
			case DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS:
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
			case DaGiMa_MDE_HW3Package.STUDENT__STUDENT_EXAMS:
				return !getStudent_exams().isEmpty();
			case DaGiMa_MDE_HW3Package.STUDENT__MATRICULATION_NUMBER:
				return matriculation_number != MATRICULATION_NUMBER_EDEFAULT;
			case DaGiMa_MDE_HW3Package.STUDENT__THESIS_DEFENDED:
				return thesis_defended != null && !thesis_defended.isEmpty();
			case DaGiMa_MDE_HW3Package.STUDENT__ENROLLED_COURSES:
				return enrolled_courses != null && !enrolled_courses.isEmpty();
			case DaGiMa_MDE_HW3Package.STUDENT__BOOKED_CALLS:
				return booked_calls != null && !booked_calls.isEmpty();
			case DaGiMa_MDE_HW3Package.STUDENT__TRANSCRIPTS:
				return transcripts != null && !transcripts.isEmpty();
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
		result.append(" (matriculation_number: ");
		result.append(matriculation_number);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
