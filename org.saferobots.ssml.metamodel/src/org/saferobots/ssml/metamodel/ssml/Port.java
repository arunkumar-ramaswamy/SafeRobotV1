/**
 */
package org.saferobots.ssml.metamodel.ssml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Port#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.Port#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
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
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.saferobots.ssml.metamodel.ssml.port_type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.metamodel.ssml.port_type
	 * @see #setType(port_type)
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getPort_Type()
	 * @model
	 * @generated
	 */
	port_type getType();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.metamodel.ssml.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.metamodel.ssml.port_type
	 * @see #getType()
	 * @generated
	 */
	void setType(port_type value);

} // Port
