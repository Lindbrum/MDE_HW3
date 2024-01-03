/**
 */
package daGiMa_MDE_HW4;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.User#getName <em>Name</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.User#getSurname <em>Surname</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.User#getEmail <em>Email</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.User#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4.User#getBirth_date <em>Birth date</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUser_Surname()
	 * @model required="true"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.User#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUser_Telephone()
	 * @model required="true"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.User#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Birth date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth date</em>' attribute.
	 * @see #setBirth_date(Date)
	 * @see daGiMa_MDE_HW4.DaGiMa_MDE_HW4Package#getUser_Birth_date()
	 * @model required="true"
	 * @generated
	 */
	Date getBirth_date();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4.User#getBirth_date <em>Birth date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth date</em>' attribute.
	 * @see #getBirth_date()
	 * @generated
	 */
	void setBirth_date(Date value);

} // User
