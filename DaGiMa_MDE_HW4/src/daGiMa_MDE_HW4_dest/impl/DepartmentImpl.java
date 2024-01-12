/**
 */
package daGiMa_MDE_HW4_dest.impl;

import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage;
import daGiMa_MDE_HW4_dest.DegreeCourse;
import daGiMa_MDE_HW4_dest.Department;
import daGiMa_MDE_HW4_dest.News;
import daGiMa_MDE_HW4_dest.University;

import java.util.Collection;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.DepartmentImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.DepartmentImpl#getOffered_courses <em>Offered courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.DepartmentImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.DepartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.DepartmentImpl#getRelated_news <em>Related news</em>}</li>
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
		return DaGiMa_MDE_HW4_destPackage.Literals.DEPARTMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeCourse> getOffered_courses() {
		if (offered_courses == null) {
			offered_courses = new EObjectContainmentWithInverseEList<DegreeCourse>(DegreeCourse.class, this, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__OFFERED_COURSES, DaGiMa_MDE_HW4_destPackage.DEGREE_COURSE__DEPARTMENT);
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
		if (eContainerFeatureID() != DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY) return null;
		return (University)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniversity, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversity(University newUniversity) {
		if (newUniversity != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY && newUniversity != null)) {
			if (EcoreUtil.isAncestor(this, newUniversity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject)newUniversity).eInverseAdd(this, DaGiMa_MDE_HW4_destPackage.UNIVERSITY__DEPARTMENTS, University.class, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY, newUniversity, newUniversity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<News> getRelated_news() {
		if (related_news == null) {
			related_news = new EObjectWithInverseResolvingEList<News>(News.class, this, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS, DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT);
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
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__OFFERED_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffered_courses()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniversity((University)otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS:
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
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__OFFERED_COURSES:
				return ((InternalEList<?>)getOffered_courses()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY:
				return basicSetUniversity(null, msgs);
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS:
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
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW4_destPackage.UNIVERSITY__DEPARTMENTS, University.class, msgs);
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
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__WEBSITE:
				return getWebsite();
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__OFFERED_COURSES:
				return getOffered_courses();
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY:
				return getUniversity();
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__NAME:
				return getName();
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS:
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
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__WEBSITE:
				setWebsite((String)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__OFFERED_COURSES:
				getOffered_courses().clear();
				getOffered_courses().addAll((Collection<? extends DegreeCourse>)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY:
				setUniversity((University)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS:
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
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__OFFERED_COURSES:
				getOffered_courses().clear();
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY:
				setUniversity((University)null);
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS:
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
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__OFFERED_COURSES:
				return offered_courses != null && !offered_courses.isEmpty();
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__UNIVERSITY:
				return getUniversity() != null;
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS:
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
