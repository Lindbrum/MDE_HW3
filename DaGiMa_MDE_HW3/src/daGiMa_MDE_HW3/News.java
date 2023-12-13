/**
 */
package daGiMa_MDE_HW3;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>News</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link daGiMa_MDE_HW3.News#getTitle <em>Title</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.News#getPublication_date <em>Publication date</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.News#getDepartment <em>Department</em>}</li>
 *   <li>{@link daGiMa_MDE_HW3.News#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getNews()
 * @model
 * @generated
 */
public interface News extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"A news title"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getNews_Title()
	 * @model default="A news title" id="true" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.News#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Publication date</b></em>' attribute.
	 * The default value is <code>"2023-12-18"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication date</em>' attribute.
	 * @see #setPublication_date(Date)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getNews_Publication_date()
	 * @model default="2023-12-18" required="true"
	 * @generated
	 */
	Date getPublication_date();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.News#getPublication_date <em>Publication date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication date</em>' attribute.
	 * @see #getPublication_date()
	 * @generated
	 */
	void setPublication_date(Date value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Department#getRelated_news <em>Related news</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' reference.
	 * @see #setDepartment(Department)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getNews_Department()
	 * @see daGiMa_MDE_HW3.Department#getRelated_news
	 * @model opposite="related_news"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.News#getDepartment <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Professor#getNews_posted <em>News posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Professor)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getNews_Author()
	 * @see daGiMa_MDE_HW3.Professor#getNews_posted
	 * @model opposite="news_posted" required="true"
	 * @generated
	 */
	Professor getAuthor();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.News#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Professor value);

} // News
