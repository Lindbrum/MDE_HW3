/**
 */
package daGiMa_MDE_HW4_old.tests;

import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldFactory;
import daGiMa_MDE_HW4_old.PhD;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ph D</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhDTest extends PostGraduateCourseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhDTest.class);
	}

	/**
	 * Constructs a new Ph D test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ph D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PhD getFixture() {
		return (PhD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createPhD());
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

} //PhDTest
