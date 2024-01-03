/**
 */
package daGiMa_MDE_HW4_old.tests;

import daGiMa_MDE_HW4_old.DaGiMa_MDE_HW4_oldFactory;
import daGiMa_MDE_HW4_old.Master;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Master</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterTest extends PostGraduateCourseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MasterTest.class);
	}

	/**
	 * Constructs a new Master test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Master test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Master getFixture() {
		return (Master)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DaGiMa_MDE_HW4_oldFactory.eINSTANCE.createMaster());
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

} //MasterTest
