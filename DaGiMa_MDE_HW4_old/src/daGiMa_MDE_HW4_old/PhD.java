/**
 */
package daGiMa_MDE_HW4_old;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ph D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4_old.PhD#getResearchField <em>Research Field</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getPhD()
 * @model
 * @generated
 */
public interface PhD extends PostGraduateCourse {
	/**
	 * Returns the value of the '<em><b>Research Field</b></em>' attribute.
	 * The default value is <code>"NewPhD"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Research Field</em>' attribute.
	 * @see #setResearchField(String)
	 * @see daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldPackage#getPhD_ResearchField()
	 * @model default="NewPhD" required="true"
	 * @generated
	 */
	String getResearchField();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW4_old.PhD#getResearchField <em>Research Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Field</em>' attribute.
	 * @see #getResearchField()
	 * @generated
	 */
	void setResearchField(String value);

} // PhD
