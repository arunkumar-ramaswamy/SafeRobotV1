/**
 */
package org.saferobots.ssml.metamodel.ssml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.System#getGates <em>Gates</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.System#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.System#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getSystem_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dispatch_Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.metamodel.ssml.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getSystem_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

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
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // System
