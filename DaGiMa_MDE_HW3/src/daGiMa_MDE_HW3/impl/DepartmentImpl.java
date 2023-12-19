/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Tables;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.Department;
import daGiMa_MDE_HW3.News;
import daGiMa_MDE_HW3.Professor;
import daGiMa_MDE_HW3.University;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.DepartmentImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.DepartmentImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.DepartmentImpl#getOffered_courses <em>Offered courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.DepartmentImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.DepartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.DepartmentImpl#getRelated_news <em>Related news</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOffered_courses() <em>Offered courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffered_courses()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeCourse> offered_courses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "A department";

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
	 * The cached value of the '{@link #getRelated_news() <em>Related news</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated_news()
	 * @generated
	 * @ordered
	 */
	protected EList<News> related_news;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW3Package.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Professor> getTeachers() {
		/**
		 *
		 * offered_courses->collect(degree_course | degree_course.course_catalogue.teachers)
		 * ->asOrderedSet()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<DegreeCourse> offered_courses = this.getOffered_courses();
		final /*@NonInvalid*/ OrderedSetValue BOXED_offered_courses = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_CLSSid_DegreeCourse_0, offered_courses);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(DaGiMa_MDE_HW3Tables.SEQ_CLSSid_Professor);
		Iterator<Object> ITERATOR_degree_course = BOXED_offered_courses.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR_degree_course.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ DegreeCourse degree_course = (DegreeCourse)ITERATOR_degree_course.next();
			/**
			 * degree_course.course_catalogue.teachers
			 */
			final /*@NonInvalid*/ List<Course> course_catalogue = degree_course.getCourse_catalogue();
			final /*@NonInvalid*/ OrderedSetValue BOXED_course_catalogue = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_CLSSid_Course, course_catalogue);
			/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(DaGiMa_MDE_HW3Tables.SEQ_CLSSid_Professor);
			Iterator<Object> ITERATOR__1 = BOXED_course_catalogue.iterator();
			/*@NonInvalid*/ SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect_0 = accumulator_0;
					break;
				}
				/*@NonInvalid*/ Course _1 = (Course)ITERATOR__1.next();
				/**
				 * teachers
				 */
				final /*@NonInvalid*/ List<Professor> teachers = _1.getTeachers();
				final /*@NonInvalid*/ OrderedSetValue BOXED_teachers = idResolver.createOrderedSetOfAll(DaGiMa_MDE_HW3Tables.ORD_CLSSid_Professor_0, teachers);
				//
				for (Object value : BOXED_teachers.flatten().getElements()) {
					accumulator_0.add(value);
				}
			}
			//
			for (Object value : collect_0.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		final /*@NonInvalid*/ OrderedSetValue asOrderedSet = CollectionAsOrderedSetOperation.INSTANCE.evaluate(collect);
		final /*@NonInvalid*/ List<Professor> ECORE_asOrderedSet = ((IdResolverExtension)idResolver).ecoreValueOfAll(Professor.class, asOrderedSet);
		return (EList<Professor>)ECORE_asOrderedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.DEPARTMENT__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeCourse> getOffered_courses() {
		if (offered_courses == null) {
			offered_courses = new EObjectContainmentWithInverseEList<DegreeCourse>(DegreeCourse.class, this, DaGiMa_MDE_HW3Package.DEPARTMENT__OFFERED_COURSES, DaGiMa_MDE_HW3Package.DEGREE_COURSE__DEPARTMENT);
		}
		return offered_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University getUniversity() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY) return null;
		return (University)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniversity, DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversity(University newUniversity) {
		if (newUniversity != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY && newUniversity != null)) {
			if (EcoreUtil.isAncestor(this, newUniversity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject)newUniversity).eInverseAdd(this, DaGiMa_MDE_HW3Package.UNIVERSITY__DEPARTMENTS, University.class, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY, newUniversity, newUniversity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.DEPARTMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<News> getRelated_news() {
		if (related_news == null) {
			related_news = new EObjectWithInverseResolvingEList<News>(News.class, this, DaGiMa_MDE_HW3Package.DEPARTMENT__RELATED_NEWS, DaGiMa_MDE_HW3Package.NEWS__DEPARTMENT);
		}
		return related_news;
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
			case DaGiMa_MDE_HW3Package.DEPARTMENT__OFFERED_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffered_courses()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniversity((University)otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.DEPARTMENT__RELATED_NEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelated_news()).basicAdd(otherEnd, msgs);
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
			case DaGiMa_MDE_HW3Package.DEPARTMENT__OFFERED_COURSES:
				return ((InternalEList<?>)getOffered_courses()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY:
				return basicSetUniversity(null, msgs);
			case DaGiMa_MDE_HW3Package.DEPARTMENT__RELATED_NEWS:
				return ((InternalEList<?>)getRelated_news()).basicRemove(otherEnd, msgs);
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
			case DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW3Package.UNIVERSITY__DEPARTMENTS, University.class, msgs);
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
			case DaGiMa_MDE_HW3Package.DEPARTMENT__TEACHERS:
				return getTeachers();
			case DaGiMa_MDE_HW3Package.DEPARTMENT__WEBSITE:
				return getWebsite();
			case DaGiMa_MDE_HW3Package.DEPARTMENT__OFFERED_COURSES:
				return getOffered_courses();
			case DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY:
				return getUniversity();
			case DaGiMa_MDE_HW3Package.DEPARTMENT__NAME:
				return getName();
			case DaGiMa_MDE_HW3Package.DEPARTMENT__RELATED_NEWS:
				return getRelated_news();
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
			case DaGiMa_MDE_HW3Package.DEPARTMENT__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Professor>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__WEBSITE:
				setWebsite((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__OFFERED_COURSES:
				getOffered_courses().clear();
				getOffered_courses().addAll((Collection<? extends DegreeCourse>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY:
				setUniversity((University)newValue);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__RELATED_NEWS:
				getRelated_news().clear();
				getRelated_news().addAll((Collection<? extends News>)newValue);
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
			case DaGiMa_MDE_HW3Package.DEPARTMENT__TEACHERS:
				getTeachers().clear();
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__OFFERED_COURSES:
				getOffered_courses().clear();
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY:
				setUniversity((University)null);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__RELATED_NEWS:
				getRelated_news().clear();
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
			case DaGiMa_MDE_HW3Package.DEPARTMENT__TEACHERS:
				return !getTeachers().isEmpty();
			case DaGiMa_MDE_HW3Package.DEPARTMENT__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case DaGiMa_MDE_HW3Package.DEPARTMENT__OFFERED_COURSES:
				return offered_courses != null && !offered_courses.isEmpty();
			case DaGiMa_MDE_HW3Package.DEPARTMENT__UNIVERSITY:
				return getUniversity() != null;
			case DaGiMa_MDE_HW3Package.DEPARTMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW3Package.DEPARTMENT__RELATED_NEWS:
				return related_news != null && !related_news.isEmpty();
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
		result.append(" (website: ");
		result.append(website);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
