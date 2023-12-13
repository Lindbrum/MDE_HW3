/**
 */
package daGiMa_MDE_HW3.tests;

import daGiMa_MDE_HW3.DaGiMa_MDE_HW3Factory;
import daGiMa_MDE_HW3.Thesis;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Thesis</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThesisTest extends TestCase {

	/**
	 * The fixture for this Thesis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Thesis fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThesisTest.class);
	}

	/**
	 * Constructs a new Thesis test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThesisTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Thesis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Thesis fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Thesis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Thesis getFixture() {
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
		setFixture(DaGiMa_MDE_HW3Factory.eINSTANCE.createThesis());
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

} //ThesisTest
