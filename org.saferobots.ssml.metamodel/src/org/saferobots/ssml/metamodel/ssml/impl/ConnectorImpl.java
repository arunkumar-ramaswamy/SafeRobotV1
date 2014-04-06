/**
 */
package org.saferobots.ssml.metamodel.ssml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.saferobots.ssml.metamodel.ssml.Connector;
import org.saferobots.ssml.metamodel.ssml.NFP;
import org.saferobots.ssml.metamodel.ssml.Port;
import org.saferobots.ssml.metamodel.ssml.SsmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl#getContains_system <em>Contains system</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl#getOut <em>Out</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl#getHas_nfp <em>Has nfp</em>}</li>
 *   <li>{@link org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getContains_system() <em>Contains system</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_system()
	 * @generated
	 * @ordered
	 */
	protected org.saferobots.ssml.metamodel.ssml.System contains_system;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected Port in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected Port out;

	/**
	 * The cached value of the '{@link #getHas_nfp() <em>Has nfp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_nfp()
	 * @generated
	 * @ordered
	 */
	protected NFP has_nfp;

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
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsmlPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.saferobots.ssml.metamodel.ssml.System getContains_system() {
		return contains_system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains_system(org.saferobots.ssml.metamodel.ssml.System newContains_system, NotificationChain msgs) {
		org.saferobots.ssml.metamodel.ssml.System oldContains_system = contains_system;
		contains_system = newContains_system;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SsmlPackage.CONNECTOR__CONTAINS_SYSTEM, oldContains_system, newContains_system);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContains_system(org.saferobots.ssml.metamodel.ssml.System newContains_system) {
		if (newContains_system != contains_system) {
			NotificationChain msgs = null;
			if (contains_system != null)
				msgs = ((InternalEObject)contains_system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SsmlPackage.CONNECTOR__CONTAINS_SYSTEM, null, msgs);
			if (newContains_system != null)
				msgs = ((InternalEObject)newContains_system).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SsmlPackage.CONNECTOR__CONTAINS_SYSTEM, null, msgs);
			msgs = basicSetContains_system(newContains_system, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.CONNECTOR__CONTAINS_SYSTEM, newContains_system, newContains_system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getIn() {
		if (in != null && in.eIsProxy()) {
			InternalEObject oldIn = (InternalEObject)in;
			in = (Port)eResolveProxy(oldIn);
			if (in != oldIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsmlPackage.CONNECTOR__IN, oldIn, in));
			}
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(Port newIn) {
		Port oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.CONNECTOR__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOut() {
		if (out != null && out.eIsProxy()) {
			InternalEObject oldOut = (InternalEObject)out;
			out = (Port)eResolveProxy(oldOut);
			if (out != oldOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsmlPackage.CONNECTOR__OUT, oldOut, out));
			}
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(Port newOut) {
		Port oldOut = out;
		out = newOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.CONNECTOR__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP getHas_nfp() {
		return has_nfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_nfp(NFP newHas_nfp, NotificationChain msgs) {
		NFP oldHas_nfp = has_nfp;
		has_nfp = newHas_nfp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SsmlPackage.CONNECTOR__HAS_NFP, oldHas_nfp, newHas_nfp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_nfp(NFP newHas_nfp) {
		if (newHas_nfp != has_nfp) {
			NotificationChain msgs = null;
			if (has_nfp != null)
				msgs = ((InternalEObject)has_nfp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SsmlPackage.CONNECTOR__HAS_NFP, null, msgs);
			if (newHas_nfp != null)
				msgs = ((InternalEObject)newHas_nfp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SsmlPackage.CONNECTOR__HAS_NFP, null, msgs);
			msgs = basicSetHas_nfp(newHas_nfp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.CONNECTOR__HAS_NFP, newHas_nfp, newHas_nfp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlPackage.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsmlPackage.CONNECTOR__CONTAINS_SYSTEM:
				return basicSetContains_system(null, msgs);
			case SsmlPackage.CONNECTOR__HAS_NFP:
				return basicSetHas_nfp(null, msgs);
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
			case SsmlPackage.CONNECTOR__CONTAINS_SYSTEM:
				return getContains_system();
			case SsmlPackage.CONNECTOR__IN:
				if (resolve) return getIn();
				return basicGetIn();
			case SsmlPackage.CONNECTOR__OUT:
				if (resolve) return getOut();
				return basicGetOut();
			case SsmlPackage.CONNECTOR__HAS_NFP:
				return getHas_nfp();
			case SsmlPackage.CONNECTOR__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SsmlPackage.CONNECTOR__CONTAINS_SYSTEM:
				setContains_system((org.saferobots.ssml.metamodel.ssml.System)newValue);
				return;
			case SsmlPackage.CONNECTOR__IN:
				setIn((Port)newValue);
				return;
			case SsmlPackage.CONNECTOR__OUT:
				setOut((Port)newValue);
				return;
			case SsmlPackage.CONNECTOR__HAS_NFP:
				setHas_nfp((NFP)newValue);
				return;
			case SsmlPackage.CONNECTOR__NAME:
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
			case SsmlPackage.CONNECTOR__CONTAINS_SYSTEM:
				setContains_system((org.saferobots.ssml.metamodel.ssml.System)null);
				return;
			case SsmlPackage.CONNECTOR__IN:
				setIn((Port)null);
				return;
			case SsmlPackage.CONNECTOR__OUT:
				setOut((Port)null);
				return;
			case SsmlPackage.CONNECTOR__HAS_NFP:
				setHas_nfp((NFP)null);
				return;
			case SsmlPackage.CONNECTOR__NAME:
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
			case SsmlPackage.CONNECTOR__CONTAINS_SYSTEM:
				return contains_system != null;
			case SsmlPackage.CONNECTOR__IN:
				return in != null;
			case SsmlPackage.CONNECTOR__OUT:
				return out != null;
			case SsmlPackage.CONNECTOR__HAS_NFP:
				return has_nfp != null;
			case SsmlPackage.CONNECTOR__NAME:
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

} //ConnectorImpl
