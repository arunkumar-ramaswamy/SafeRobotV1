/**
 */
package org.saferobots.ssml.metamodel.ssml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage
 * @generated
 */
public interface SsmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SsmlFactory eINSTANCE = org.saferobots.ssml.metamodel.ssml.impl.SsmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Dispatch Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Gate</em>'.
	 * @generated
	 */
	Dispatch_Gate createDispatch_Gate();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Dispatch Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Policy</em>'.
	 * @generated
	 */
	Dispatch_Policy createDispatch_Policy();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>NFP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP</em>'.
	 * @generated
	 */
	NFP createNFP();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SsmlPackage getSsmlPackage();

} //SsmlFactory
