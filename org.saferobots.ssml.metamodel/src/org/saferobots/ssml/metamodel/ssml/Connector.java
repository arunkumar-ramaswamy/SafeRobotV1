/**
 */
package org.saferobots.ssml.metamodel.ssml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Connector#getContains_system <em>Contains system</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Connector#getIn <em>In</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Connector#getOut <em>Out</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Connector#getHas_nfp <em>Has nfp</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Connector#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains system</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains system</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains system</em>' containment reference.
	 * @see #setContains_system(org.saferobots.ssml.metamodel.ssml.System)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getConnector_Contains_system()
	 * @model containment="true"
	 * @generated
	 */
	org.saferobots.ssml.metamodel.ssml.System getContains_system();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Connector#getContains_system <em>Contains system</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains system</em>' containment reference.
	 * @see #getContains_system()
	 * @generated
	 */
	void setContains_system(org.saferobots.ssml.metamodel.ssml.System value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Port)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getConnector_In()
	 * @model
	 * @generated
	 */
	Port getIn();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Connector#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Port value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(Port)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getConnector_Out()
	 * @model
	 * @generated
	 */
	Port getOut();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Connector#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Port value);

	/**
	 * Returns the value of the '<em><b>Has nfp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has nfp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has nfp</em>' containment reference.
	 * @see #setHas_nfp(NFP)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getConnector_Has_nfp()
	 * @model containment="true"
	 * @generated
	 */
	NFP getHas_nfp();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Connector#getHas_nfp <em>Has nfp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has nfp</em>' containment reference.
	 * @see #getHas_nfp()
	 * @generated
	 */
	void setHas_nfp(NFP value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Connector
