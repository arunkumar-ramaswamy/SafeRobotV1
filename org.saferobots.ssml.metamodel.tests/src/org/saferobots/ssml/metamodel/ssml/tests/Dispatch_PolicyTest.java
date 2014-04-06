/**
 */
package org.saferobots.ssml.metamodel.ssml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.saferobots.ssml.metamodel.ssml.Dispatch_Policy;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dispatch Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dispatch_PolicyTest extends TestCase {

	/**
	 * The fixture for this Dispatch Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dispatch_Policy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Dispatch_PolicyTest.class);
	}

	/**
	 * Constructs a new Dispatch Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatch_PolicyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dispatch Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dispatch_Policy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dispatch Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dispatch_Policy getFixture() {
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
		setFixture(SsmlFactory.eINSTANCE.createDispatch_Policy());
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

} //Dispatch_PolicyTest
