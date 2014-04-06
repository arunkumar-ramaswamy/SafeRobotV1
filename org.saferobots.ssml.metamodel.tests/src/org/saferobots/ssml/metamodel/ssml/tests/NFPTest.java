/**
 */
package org.saferobots.ssml.metamodel.ssml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.saferobots.ssml.metamodel.ssml.NFP;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NFP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFPTest extends TestCase {

	/**
	 * The fixture for this NFP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NFPTest.class);
	}

	/**
	 * Constructs a new NFP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFPTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this NFP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NFP fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this NFP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP getFixture() {
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
		setFixture(SsmlFactory.eINSTANCE.createNFP());
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

} //NFPTest
