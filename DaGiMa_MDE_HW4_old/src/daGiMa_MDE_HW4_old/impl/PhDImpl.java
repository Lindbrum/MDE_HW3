/**
 */
package daGiMa_MDE_HW4_old.impl;

import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage;
import daGiMa_MDE_HW4_old.PhD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ph D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.impl.PhDImpl#getResearchField <em>Research Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhDImpl extends PostGraduateCourseImpl implements PhD {
	/**
	 * The default value of the '{@link #getResearchField() <em>Research Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchField()
	 * @generated
	 * @ordered
	 */
	protected static final String RESEARCH_FIELD_EDEFAULT = "NewPhD";

	/**
	 * The cached value of the '{@link #getResearchField() <em>Research Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchField()
	 * @generated
	 * @ordered
	 */
	protected String researchField = RESEARCH_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DaGiMa_MDE_HW4_oldPackage.Literals.PH_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResearchField() {
		return researchField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResearchField(String newResearchField) {
		String oldResearchField = researchField;
		researchField = newResearchField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DaGiMa_MDE_HW4_oldPackage.PH_D__RESEARCH_FIELD, oldResearchField, researchField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DaGiMa_MDE_HW4_oldPackage.PH_D__RESEARCH_FIELD:
				return getResearchField();
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
			case DaGiMa_MDE_HW4_oldPackage.PH_D__RESEARCH_FIELD:
				setResearchField((String)newValue);
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
			case DaGiMa_MDE_HW4_oldPackage.PH_D__RESEARCH_FIELD:
				setResearchField(RESEARCH_FIELD_EDEFAULT);
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
			case DaGiMa_MDE_HW4_oldPackage.PH_D__RESEARCH_FIELD:
				return RESEARCH_FIELD_EDEFAULT == null ? researchField != null : !RESEARCH_FIELD_EDEFAULT.equals(researchField);
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
		result.append(" (researchField: ");
		result.append(researchField);
		result.append(')');
		return result.toString();
	}

} //PhDImpl
