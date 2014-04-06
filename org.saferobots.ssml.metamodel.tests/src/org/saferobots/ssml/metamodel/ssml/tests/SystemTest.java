/**
 */
package org.saferobots.ssml.metamodel.ssml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.saferobots.ssml.metamodel.ssml.SsmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTest extends TestCase {

	/**
	 * The fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org.saferobots.ssml.metamodel.ssml.System fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemTest.class);
	}

	/**
	 * Constructs a new System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(org.saferobots.ssml.metamodel.ssml.System fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org.saferobots.ssml.metamodel.ssml.System getFixture() {
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
		setFixture(SsmlFactory.eINSTANCE.createSystem());
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

} //SystemTest
