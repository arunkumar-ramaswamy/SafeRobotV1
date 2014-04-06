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

import org.saferobots.ssml.metamodel.ssml.Connector;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.SsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.SystemImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.SystemImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.SystemImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements org.saferobots.ssml.metamodel.ssml.System {
	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Dispatch_Gate> gates;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsmlPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dispatch_Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Dispatch_Gate>(Dispatch_Gate.class, this, SsmlPackage.SYSTEM__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, SsmlPackage.SYSTEM__CONNECTORS);
		}
		return connectors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsmlPackage.SYSTEM__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
			case SsmlPackage.SYSTEM__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
			case SsmlPackage.SYSTEM__GATES:
				return getGates();
			case SsmlPackage.SYSTEM__CONNECTORS:
				return getConnectors();
			case SsmlPackage.SYSTEM__NAME:
				return getName();
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
			case SsmlPackage.SYSTEM__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Dispatch_Gate>)newValue);
				return;
			case SsmlPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case SsmlPackage.SYSTEM__NAME:
				setName((String)newValue);
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
			case SsmlPackage.SYSTEM__GATES:
				getGates().clear();
				return;
			case SsmlPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				return;
			case SsmlPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
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
			case SsmlPackage.SYSTEM__GATES:
				return gates != null && !gates.isEmpty();
			case SsmlPackage.SYSTEM__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case SsmlPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //SystemImpl
