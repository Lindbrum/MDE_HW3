/**
 */
package daGiMa_MDE_HW4.impl;

import daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package;
import daGiMa_MDE_HW4.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.UserImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.UserImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.impl.UserImpl#getBirth_date <em>Birth date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirth_date() <em>Birth date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirth_date() <em>Birth date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_date()
	 * @generated
	 * @ordered
	 */
	protected Date birth_date = BIRTH_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4Package.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.USER__SURNAME, oldSurname,
					surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.USER__TELEPHONE, oldTelephone,
					telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirth_date() {
		return birth_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirth_date(Date newBirth_date) {
		Date oldBirth_date = birth_date;
		birth_date = newBirth_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4Package.USER__BIRTH_DATE, oldBirth_date,
					birth_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DaGiMa_MDE_HW4Package.USER__NAME:
			return getName();
		case DaGiMa_MDE_HW4Package.USER__SURNAME:
			return getSurname();
		case DaGiMa_MDE_HW4Package.USER__EMAIL:
			return getEmail();
		case DaGiMa_MDE_HW4Package.USER__TELEPHONE:
			return getTelephone();
		case DaGiMa_MDE_HW4Package.USER__BIRTH_DATE:
			return getBirth_date();
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
		case DaGiMa_MDE_HW4Package.USER__NAME:
			setName((String) newValue);
			return;
		case DaGiMa_MDE_HW4Package.USER__SURNAME:
			setSurname((String) newValue);
			return;
		case DaGiMa_MDE_HW4Package.USER__EMAIL:
			setEmail((String) newValue);
			return;
		case DaGiMa_MDE_HW4Package.USER__TELEPHONE:
			setTelephone((String) newValue);
			return;
		case DaGiMa_MDE_HW4Package.USER__BIRTH_DATE:
			setBirth_date((Date) newValue);
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
		case DaGiMa_MDE_HW4Package.USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DaGiMa_MDE_HW4Package.USER__SURNAME:
			setSurname(SURNAME_EDEFAULT);
			return;
		case DaGiMa_MDE_HW4Package.USER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case DaGiMa_MDE_HW4Package.USER__TELEPHONE:
			setTelephone(TELEPHONE_EDEFAULT);
			return;
		case DaGiMa_MDE_HW4Package.USER__BIRTH_DATE:
			setBirth_date(BIRTH_DATE_EDEFAULT);
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
		case DaGiMa_MDE_HW4Package.USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DaGiMa_MDE_HW4Package.USER__SURNAME:
			return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
		case DaGiMa_MDE_HW4Package.USER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case DaGiMa_MDE_HW4Package.USER__TELEPHONE:
			return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
		case DaGiMa_MDE_HW4Package.USER__BIRTH_DATE:
			return BIRTH_DATE_EDEFAULT == null ? birth_date != null : !BIRTH_DATE_EDEFAULT.equals(birth_date);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", surname: ");
		result.append(surname);
		result.append(", email: ");
		result.append(email);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", birth_date: ");
		result.append(birth_date);
		result.append(')');
		return result.toString();
	}

} //UserImpl
