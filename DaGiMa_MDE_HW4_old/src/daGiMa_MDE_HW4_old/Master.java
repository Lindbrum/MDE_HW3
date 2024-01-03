/**
 */
package daGiMa_MDE_HW4_old;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.Master#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getMaster()
 * @model
 * @generated
 */
public interface Master extends PostGraduateCourse {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link daGiMa_MDE_HW4_old.PostGraduateLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see daGiMa_MDE_HW4_old.PostGraduateLevel
	 * @see #setLevel(PostGraduateLevel)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getMaster_Level()
	 * @model required="true"
	 * @generated
	 */
	PostGraduateLevel getLevel();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.Master#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see daGiMa_MDE_HW4_old.PostGraduateLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(PostGraduateLevel value);

} // Master
