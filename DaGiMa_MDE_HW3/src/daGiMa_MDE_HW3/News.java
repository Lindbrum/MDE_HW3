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
 *   <li>{@link daGiMa_MDE_HW3.News#getBody <em>Body</em>}</li>
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
	 * Returns the value of the '<em><b>Author</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link daGiMa_MDE_HW3.Professor#getNews_posted <em>News posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' container reference.
	 * @see #setAuthor(Professor)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getNews_Author()
	 * @see daGiMa_MDE_HW3.Professor#getNews_posted
	 * @model opposite="news_posted" required="true" transient="false"
	 * @generated
	 */
	Professor getAuthor();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.News#getAuthor <em>Author</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' container reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Professor value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * The default value is <code>"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut porta ante id turpis faucibus pharetra non nec arcu. Morbi luctus, est at tincidunt scelerisque, eros purus posuere purus, in facilisis turpis lectus et neque. Phasellus euismod accumsan turpis faucibus lobortis. In eleifend ligula non iaculis pulvinar. Nulla malesuada ac massa vulputate molestie."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see daGiMa_MDE_HW3.DaGiMa_MDE_HW3Package#getNews_Body()
	 * @model default="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut porta ante id turpis faucibus pharetra non nec arcu. Morbi luctus, est at tincidunt scelerisque, eros purus posuere purus, in facilisis turpis lectus et neque. Phasellus euismod accumsan turpis faucibus lobortis. In eleifend ligula non iaculis pulvinar. Nulla malesuada ac massa vulputate molestie." required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link daGiMa_MDE_HW3.News#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // News
