/**
 */
package org.saferobots.ssml.metamodel.ssml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Policy;
import org.saferobots.ssml.metamodel.ssml.Port;
import org.saferobots.ssml.metamodel.ssml.SsmlPackage;
import org.saferobots.ssml.metamodel.ssml.gate_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dispatch_GateImpl extends MinimalEObjectImpl.Container implements Dispatch_Gate {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected Dispatch_Policy policy;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final gate_type TYPE_EDEFAULT = gate_type.SPLITTER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected gate_type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dispatch_GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsmlPackage.Literals.DISPATCH_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, SsmlPackage.DISPATCH_GATE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatch_Policy getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(Dispatch_Policy newPolicy, NotificationChain msgs) {
		Dispatch_Policy oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SsmlPackage.DISPATCH_GATE__POLICY, oldPolicy, newPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(Dispatch_Policy newPolicy) {
		if (newPolicy != policy) {
			NotificationChain msgs = null;
			if (policy != null)
				msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SsmlPackage.DISPATCH_GATE__POLICY, null, msgs);
			if (newPolicy != null)
				msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SsmlPackage.DISPATCH_GATE__POLICY, null, msgs);
			msgs = basicSetPolicy(newPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.DISPATCH_GATE__POLICY, newPolicy, newPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.DISPATCH_GATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gate_type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(gate_type newType) {
		gate_type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.DISPATCH_GATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsmlPackage.DISPATCH_GATE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case SsmlPackage.DISPATCH_GATE__POLICY:
				return basicSetPolicy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SsmlPackage.DISPATCH_GATE__PORTS:
				return getPorts();
			case SsmlPackage.DISPATCH_GATE__POLICY:
				return getPolicy();
			case SsmlPackage.DISPATCH_GATE__NAME:
				return getName();
			case SsmlPackage.DISPATCH_GATE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SsmlPackage.DISPATCH_GATE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case SsmlPackage.DISPATCH_GATE__POLICY:
				setPolicy((Dispatch_Policy)newValue);
				return;
			case SsmlPackage.DISPATCH_GATE__NAME:
				setName((String)newValue);
				return;
			case SsmlPackage.DISPATCH_GATE__TYPE:
				setType((gate_type)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SsmlPackage.DISPATCH_GATE__PORTS:
				getPorts().clear();
				return;
			case SsmlPackage.DISPATCH_GATE__POLICY:
				setPolicy((Dispatch_Policy)null);
				return;
			case SsmlPackage.DISPATCH_GATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SsmlPackage.DISPATCH_GATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SsmlPackage.DISPATCH_GATE__PORTS:
				return ports != null && !ports.isEmpty();
			case SsmlPackage.DISPATCH_GATE__POLICY:
				return policy != null;
			case SsmlPackage.DISPATCH_GATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SsmlPackage.DISPATCH_GATE__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //Dispatch_GateImpl
