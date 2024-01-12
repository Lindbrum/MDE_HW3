/**
 */
package daGiMa_MDE_HW4_dest.impl;

import daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage;
import daGiMa_MDE_HW4_dest.Department;
import daGiMa_MDE_HW4_dest.News;
import daGiMa_MDE_HW4_dest.Professor;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>News</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.NewsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.NewsImpl#getPublication_date <em>Publication date</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.NewsImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.NewsImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.impl.NewsImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewsImpl extends MinimalEObjectImpl.Container implements News {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "A news title";

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
	 * The default value of the '{@link #getPublication_date() <em>Publication date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUBLICATION_DATE_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "2023-12-18");

	/**
	 * The cached value of the '{@link #getPublication_date() <em>Publication date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication_date()
	 * @generated
	 * @ordered
	 */
	protected Date publication_date = PUBLICATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department department;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut porta ante id turpis faucibus pharetra non nec arcu. Morbi luctus, est at tincidunt scelerisque, eros purus posuere purus, in facilisis turpis lectus et neque. Phasellus euismod accumsan turpis faucibus lobortis. In eleifend ligula non iaculis pulvinar. Nulla malesuada ac massa vulputate molestie.";

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4_destPackage.Literals.NEWS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.NEWS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPublication_date() {
		return publication_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublication_date(Date newPublication_date) {
		Date oldPublication_date = publication_date;
		publication_date = newPublication_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.NEWS__PUBLICATION_DATE, oldPublication_date, publication_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartment() {
		if (department != null && department.eIsProxy()) {
			InternalEObject oldDepartment = (InternalEObject)department;
			department = (Department)eResolveProxy(oldDepartment);
			if (department != oldDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT, oldDepartment, department));
			}
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		Department oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT, oldDepartment, newDepartment);
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
	public void setDepartment(Department newDepartment) {
		if (newDepartment != department) {
			NotificationChain msgs = null;
			if (department != null)
				msgs = ((InternalEObject)department).eInverseRemove(this, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS, Department.class, msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professor getAuthor() {
		if (eContainerFeatureID() != DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR) return null;
		return (Professor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Professor newAuthor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAuthor, DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(Professor newAuthor) {
		if (newAuthor != eInternalContainer() || (eContainerFeatureID() != DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR && newAuthor != null)) {
			if (EcoreUtil.isAncestor(this, newAuthor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, DaGiMa_MDE_HW4_destPackage.PROFESSOR__NEWS_POSTED, Professor.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_destPackage.NEWS__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT:
				if (department != null)
					msgs = ((InternalEObject)department).eInverseRemove(this, DaGiMa_MDE_HW4_destPackage.DEPARTMENT__RELATED_NEWS, Department.class, msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
			case DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAuthor((Professor)otherEnd, msgs);
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
			case DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT:
				return basicSetDepartment(null, msgs);
			case DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR:
				return basicSetAuthor(null, msgs);
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
			case DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR:
				return eInternalContainer().eInverseRemove(this, DaGiMa_MDE_HW4_destPackage.PROFESSOR__NEWS_POSTED, Professor.class, msgs);
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
			case DaGiMa_MDE_HW4_destPackage.NEWS__TITLE:
				return getTitle();
			case DaGiMa_MDE_HW4_destPackage.NEWS__PUBLICATION_DATE:
				return getPublication_date();
			case DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT:
				if (resolve) return getDepartment();
				return basicGetDepartment();
			case DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR:
				return getAuthor();
			case DaGiMa_MDE_HW4_destPackage.NEWS__BODY:
				return getBody();
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
			case DaGiMa_MDE_HW4_destPackage.NEWS__TITLE:
				setTitle((String)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__PUBLICATION_DATE:
				setPublication_date((Date)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT:
				setDepartment((Department)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR:
				setAuthor((Professor)newValue);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__BODY:
				setBody((String)newValue);
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
			case DaGiMa_MDE_HW4_destPackage.NEWS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__PUBLICATION_DATE:
				setPublication_date(PUBLICATION_DATE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT:
				setDepartment((Department)null);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR:
				setAuthor((Professor)null);
				return;
			case DaGiMa_MDE_HW4_destPackage.NEWS__BODY:
				setBody(BODY_EDEFAULT);
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
			case DaGiMa_MDE_HW4_destPackage.NEWS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DaGiMa_MDE_HW4_destPackage.NEWS__PUBLICATION_DATE:
				return PUBLICATION_DATE_EDEFAULT == null ? publication_date != null : !PUBLICATION_DATE_EDEFAULT.equals(publication_date);
			case DaGiMa_MDE_HW4_destPackage.NEWS__DEPARTMENT:
				return department != null;
			case DaGiMa_MDE_HW4_destPackage.NEWS__AUTHOR:
				return getAuthor() != null;
			case DaGiMa_MDE_HW4_destPackage.NEWS__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
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
		result.append(", publication_date: ");
		result.append(publication_date);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //NewsImpl
