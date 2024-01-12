/**
 */
package daGiMa_MDE_HW4_dest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_dest.Container#getUniversities <em>Universities</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Container#getProfessors <em>Professors</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Container#getStudents <em>Students</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Container#getCourses <em>Courses</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Container#getCustom_enumerations <em>Custom enumerations</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Container#getExtra_infos <em>Extra infos</em>}</li>
 *   <li>{@link daGiMa_MDE_HW4_dest.Container#getModel_name <em>Model name</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Universities</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.University}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universities</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer_Universities()
	 * @model containment="true"
	 * @generated
	 */
	EList<University> getUniversities();

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer_Professors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Professor> getProfessors();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Custom enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.CustomEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom enumerations</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer_Custom_enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomEnumeration> getCustom_enumerations();

	/**
	 * Returns the value of the '<em><b>Extra infos</b></em>' containment reference list.
	 * The list contents are of type {@link daGiMa_MDE_HW4_dest.ExtraInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra infos</em>' containment reference list.
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer_Extra_infos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtraInfo> getExtra_infos();

	/**
	 * Returns the value of the '<em><b>Model name</b></em>' attribute.
	 * The default value is <code>"NewModel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model name</em>' attribute.
	 * @see #isSetModel_name()
	 * @see #unsetModel_name()
	 * @see #setModel_name(String)
	 * @see daGiMa_MDE_HW4_dest.DaGiMa_MDE_HW4_destPackage#getContainer_Model_name()
	 * @model default="NewModel" unsettable="true" required="true"
	 * @generated
	 */
	String getModel_name();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_dest.Container#getModel_name <em>Model name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model name</em>' attribute.
	 * @see #isSetModel_name()
	 * @see #unsetModel_name()
	 * @see #getModel_name()
	 * @generated
	 */
	void setModel_name(String value);

	/**
	 * Unsets the value of the '{@link daGiMa_MDE_HW4_dest.Container#getModel_name <em>Model name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModel_name()
	 * @see #getModel_name()
	 * @see #setModel_name(String)
	 * @generated
	 */
	void unsetModel_name();

	/**
	 * Returns whether the value of the '{@link daGiMa_MDE_HW4_dest.Container#getModel_name <em>Model name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model name</em>' attribute is set.
	 * @see #unsetModel_name()
	 * @see #getModel_name()
	 * @see #setModel_name(String)
	 * @generated
	 */
	boolean isSetModel_name();

} // Container
