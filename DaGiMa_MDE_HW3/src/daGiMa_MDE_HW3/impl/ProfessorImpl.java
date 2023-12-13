/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.Course;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.DegreeCourse;
import daGiMa_MDE_HW3.News;
import daGiMa_MDE_HW3.Professor;
import daGiMa_MDE_HW3.Thesis;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.ProfessorImpl#getOffice_telephone <em>Office telephone</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ProfessorImpl#getOrcid <em>Orcid</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ProfessorImpl#getCoordinated_degree_courses <em>Coordinated degree courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ProfessorImpl#getSupervised_thesis <em>Supervised thesis</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ProfessorImpl#getTaught_courses <em>Taught courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ProfessorImpl#getNews_posted <em>News posted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfessorImpl extends UserImpl implements Professor {
	/**
	 * The default value of the '{@link #getOffice_telephone() <em>Office telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice_telephone()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFICE_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffice_telephone() <em>Office telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice_telephone()
	 * @generated
	 * @ordered
	 */
	protected String office_telephone = OFFICE_TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrcid() <em>Orcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrcid()
	 * @generated
	 * @ordered
	 */
	protected static final String ORCID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrcid() <em>Orcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrcid()
	 * @generated
	 * @ordered
	 */
	protected String orcid = ORCID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinated_degree_courses() <em>Coordinated degree courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinated_degree_courses()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeCourse> coordinated_degree_courses;

	/**
	 * The cached value of the '{@link #getSupervised_thesis() <em>Supervised thesis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervised_thesis()
	 * @generated
	 * @ordered
	 */
	protected EList<Thesis> supervised_thesis;

	/**
	 * The cached value of the '{@link #getTaught_courses() <em>Taught courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaught_courses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> taught_courses;

	/**
	 * The cached value of the '{@link #getNews_posted() <em>News posted</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNews_posted()
	 * @generated
	 * @ordered
	 */
	protected EList<News> news_posted;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW3Package.Literals.PROFESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOffice_telephone() {
		return office_telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffice_telephone(String newOffice_telephone) {
		String oldOffice_telephone = office_telephone;
		office_telephone = newOffice_telephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.PROFESSOR__OFFICE_TELEPHONE, oldOffice_telephone, office_telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrcid() {
		return orcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrcid(String newOrcid) {
		String oldOrcid = orcid;
		orcid = newOrcid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.PROFESSOR__ORCID, oldOrcid, orcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeCourse> getCoordinated_degree_courses() {
		if (coordinated_degree_courses == null) {
			coordinated_degree_courses = new EObjectWithInverseResolvingEList<DegreeCourse>(DegreeCourse.class, this, DaGiMa_MDE_HW3Package.PROFESSOR__COORDINATED_DEGREE_COURSES, DaGiMa_MDE_HW3Package.DEGREE_COURSE__COORDINATOR);
		}
		return coordinated_degree_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Thesis> getSupervised_thesis() {
		if (supervised_thesis == null) {
			supervised_thesis = new EObjectWithInverseResolvingEList<Thesis>(Thesis.class, this, DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS, DaGiMa_MDE_HW3Package.THESIS__SUPERVISOR);
		}
		return supervised_thesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getTaught_courses() {
		if (taught_courses == null) {
			taught_courses = new EObjectResolvingEList<Course>(Course.class, this, DaGiMa_MDE_HW3Package.PROFESSOR__TAUGHT_COURSES);
		}
		return taught_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<News> getNews_posted() {
		if (news_posted == null) {
			news_posted = new EObjectWithInverseResolvingEList<News>(News.class, this, DaGiMa_MDE_HW3Package.PROFESSOR__NEWS_POSTED, DaGiMa_MDE_HW3Package.NEWS__AUTHOR);
		}
		return news_posted;
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
			case DaGiMa_MDE_HW3Package.PROFESSOR__COORDINATED_DEGREE_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoordinated_degree_courses()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupervised_thesis()).basicAdd(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.PROFESSOR__NEWS_POSTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNews_posted()).basicAdd(otherEnd, msgs);
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
			case DaGiMa_MDE_HW3Package.PROFESSOR__COORDINATED_DEGREE_COURSES:
				return ((InternalEList<?>)getCoordinated_degree_courses()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS:
				return ((InternalEList<?>)getSupervised_thesis()).basicRemove(otherEnd, msgs);
			case DaGiMa_MDE_HW3Package.PROFESSOR__NEWS_POSTED:
				return ((InternalEList<?>)getNews_posted()).basicRemove(otherEnd, msgs);
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
			case DaGiMa_MDE_HW3Package.PROFESSOR__OFFICE_TELEPHONE:
				return getOffice_telephone();
			case DaGiMa_MDE_HW3Package.PROFESSOR__ORCID:
				return getOrcid();
			case DaGiMa_MDE_HW3Package.PROFESSOR__COORDINATED_DEGREE_COURSES:
				return getCoordinated_degree_courses();
			case DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS:
				return getSupervised_thesis();
			case DaGiMa_MDE_HW3Package.PROFESSOR__TAUGHT_COURSES:
				return getTaught_courses();
			case DaGiMa_MDE_HW3Package.PROFESSOR__NEWS_POSTED:
				return getNews_posted();
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
			case DaGiMa_MDE_HW3Package.PROFESSOR__OFFICE_TELEPHONE:
				setOffice_telephone((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__ORCID:
				setOrcid((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__COORDINATED_DEGREE_COURSES:
				getCoordinated_degree_courses().clear();
				getCoordinated_degree_courses().addAll((Collection<? extends DegreeCourse>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS:
				getSupervised_thesis().clear();
				getSupervised_thesis().addAll((Collection<? extends Thesis>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__TAUGHT_COURSES:
				getTaught_courses().clear();
				getTaught_courses().addAll((Collection<? extends Course>)newValue);
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__NEWS_POSTED:
				getNews_posted().clear();
				getNews_posted().addAll((Collection<? extends News>)newValue);
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
			case DaGiMa_MDE_HW3Package.PROFESSOR__OFFICE_TELEPHONE:
				setOffice_telephone(OFFICE_TELEPHONE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__ORCID:
				setOrcid(ORCID_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__COORDINATED_DEGREE_COURSES:
				getCoordinated_degree_courses().clear();
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS:
				getSupervised_thesis().clear();
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__TAUGHT_COURSES:
				getTaught_courses().clear();
				return;
			case DaGiMa_MDE_HW3Package.PROFESSOR__NEWS_POSTED:
				getNews_posted().clear();
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
			case DaGiMa_MDE_HW3Package.PROFESSOR__OFFICE_TELEPHONE:
				return OFFICE_TELEPHONE_EDEFAULT == null ? office_telephone != null : !OFFICE_TELEPHONE_EDEFAULT.equals(office_telephone);
			case DaGiMa_MDE_HW3Package.PROFESSOR__ORCID:
				return ORCID_EDEFAULT == null ? orcid != null : !ORCID_EDEFAULT.equals(orcid);
			case DaGiMa_MDE_HW3Package.PROFESSOR__COORDINATED_DEGREE_COURSES:
				return coordinated_degree_courses != null && !coordinated_degree_courses.isEmpty();
			case DaGiMa_MDE_HW3Package.PROFESSOR__SUPERVISED_THESIS:
				return supervised_thesis != null && !supervised_thesis.isEmpty();
			case DaGiMa_MDE_HW3Package.PROFESSOR__TAUGHT_COURSES:
				return taught_courses != null && !taught_courses.isEmpty();
			case DaGiMa_MDE_HW3Package.PROFESSOR__NEWS_POSTED:
				return news_posted != null && !news_posted.isEmpty();
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
		result.append(" (office_telephone: ");
		result.append(office_telephone);
		result.append(", orcid: ");
		result.append(orcid);
		result.append(')');
		return result.toString();
	}

} //ProfessorImpl
