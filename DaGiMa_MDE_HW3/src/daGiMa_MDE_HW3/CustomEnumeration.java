/**
 */
package daGiMa_MDE_HW3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.CustomEnumeration#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getCustomEnumeration()
 * @model
 * @generated
 */
public interface CustomEnumeration extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getCustomEnumeration_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValues();

} // CustomEnumeration
