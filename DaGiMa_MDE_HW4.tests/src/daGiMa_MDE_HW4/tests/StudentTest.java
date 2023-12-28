/**
 */
package daGiMa_MDE_HW4.tests;

import daGiMa_MDE_HW4.DaGiMa_MDE_HW4Factory;
import daGiMa_MDE_HW4.Student;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link daGiMa_MDE_HW4.Student#getStudent_exams() <em>Student exams</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StudentTest extends UserTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudentTest.class);
	}

	/**
	 * Constructs a new Student test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Student test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Student getFixture() {
		return (Student)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DaGiMa_MDE_HW4Factory.eINSTANCE.createStudent());
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

	/**
	 * Tests the '{@link daGiMa_MDE_HW4.Student#getStudent_exams() <em>Student exams</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see daGiMa_MDE_HW4.Student#getStudent_exams()
	 * @generated
	 */
	public void testGetStudent_exams() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StudentTest
