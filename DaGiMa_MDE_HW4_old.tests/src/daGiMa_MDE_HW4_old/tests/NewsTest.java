/**
 */
package daGiMa_MDE_HW4_old.tests;

import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldFactory;
import daGiMa_MDE_HW4_old.News;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>News</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewsTest extends TestCase {

	/**
	 * The fixture for this News test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected News fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NewsTest.class);
	}

	/**
	 * Constructs a new News test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this News test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(News fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this News test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected News getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createNews());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NewsTest
