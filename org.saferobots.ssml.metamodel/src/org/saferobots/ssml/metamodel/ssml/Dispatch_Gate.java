/**
 */
package org.saferobots.ssml.metamodel.ssml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatch Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getDispatch_Gate()
 * @model
 * @generated
 */
public interface Dispatch_Gate extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.metamodel.ssml.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getDispatch_Gate_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(Dispatch_Policy)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getDispatch_Gate_Policy()
	 * @model containment="true"
	 * @generated
	 */
	Dispatch_Policy getPolicy();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(Dispatch_Policy value);

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
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getDispatch_Gate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.saferobots.ssml.metamodel.ssml.gate_type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.metamodel.ssml.gate_type
	 * @see #setType(gate_type)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getDispatch_Gate_Type()
	 * @model
	 * @generated
	 */
	gate_type getType();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.metamodel.ssml.gate_type
	 * @see #getType()
	 * @generated
	 */
	void setType(gate_type value);

} // Dispatch_Gate
