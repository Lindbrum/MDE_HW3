/**
 */
package daGiMa_MDE_HW3.impl;

import daGiMa_MDE_HW3.CustomEnumeration;
import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package;
import daGiMa_MDE_HW3.ExtraInfo;
import daGiMa_MDE_HW3.MetadataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getValue <em>Value</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getType <em>Type</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getLower_multiplicity <em>Lower multiplicity</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getHigher_multiplicity <em>Higher multiplicity</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.impl.ExtraInfoImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtraInfoImpl extends MinimalEObjectImpl.Container implements ExtraInfo {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MetadataType TYPE_EDEFAULT = MetadataType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MetadataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower_multiplicity() <em>Lower multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower_multiplicity() <em>Lower multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected int lower_multiplicity = LOWER_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigher_multiplicity() <em>Higher multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigher_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGHER_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHigher_multiplicity() <em>Higher multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigher_multiplicity()
	 * @generated
	 * @ordered
	 */
	protected int higher_multiplicity = HIGHER_MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected CustomEnumeration enum_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW3Package.Literals.EXTRA_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MetadataType newType) {
		MetadataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLower_multiplicity() {
		return lower_multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower_multiplicity(int newLower_multiplicity) {
		int oldLower_multiplicity = lower_multiplicity;
		lower_multiplicity = newLower_multiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY, oldLower_multiplicity, lower_multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHigher_multiplicity() {
		return higher_multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHigher_multiplicity(int newHigher_multiplicity) {
		int oldHigher_multiplicity = higher_multiplicity;
		higher_multiplicity = newHigher_multiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY, oldHigher_multiplicity, higher_multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEnumeration getEnum() {
		if (enum_ != null && enum_.eIsProxy()) {
			InternalEObject oldEnum = (InternalEObject)enum_;
			enum_ = (CustomEnumeration)eResolveProxy(oldEnum);
			if (enum_ != oldEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM, oldEnum, enum_));
			}
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEnumeration basicGetEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnum(CustomEnumeration newEnum) {
		CustomEnumeration oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				return getName();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				return getValue();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				return getType();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				return getLower_multiplicity();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				return getHigher_multiplicity();
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				if (resolve) return getEnum();
				return basicGetEnum();
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
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				setName((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				setValue((String)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				setType((MetadataType)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				setLower_multiplicity((Integer)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				setHigher_multiplicity((Integer)newValue);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				setEnum((CustomEnumeration)newValue);
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
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				setLower_multiplicity(LOWER_MULTIPLICITY_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				setHigher_multiplicity(HIGHER_MULTIPLICITY_EDEFAULT);
				return;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				setEnum((CustomEnumeration)null);
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
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__TYPE:
				return type != TYPE_EDEFAULT;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__LOWER_MULTIPLICITY:
				return lower_multiplicity != LOWER_MULTIPLICITY_EDEFAULT;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__HIGHER_MULTIPLICITY:
				return higher_multiplicity != HIGHER_MULTIPLICITY_EDEFAULT;
			case DaGiMa_MDE_HW3Package.EXTRA_INFO__ENUM:
				return enum_ != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", lower_multiplicity: ");
		result.append(lower_multiplicity);
		result.append(", higher_multiplicity: ");
		result.append(higher_multiplicity);
		result.append(')');
		return result.toString();
	}

} //ExtraInfoImpl
