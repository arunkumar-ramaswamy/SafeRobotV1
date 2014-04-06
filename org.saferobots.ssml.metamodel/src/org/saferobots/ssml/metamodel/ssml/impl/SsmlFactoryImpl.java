/**
 */
package org.saferobots.ssml.metamodel.ssml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.saferobots.ssml.metamodel.ssml.Connector;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Policy;
import org.saferobots.ssml.metamodel.ssml.NFP;
import org.saferobots.ssml.metamodel.ssml.Port;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;
import org.saferobots.ssml.metamodel.ssml.SsmlPackage;
import org.saferobots.ssml.metamodel.ssml.gate_type;
import org.saferobots.ssml.metamodel.ssml.port_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SsmlFactoryImpl extends EFactoryImpl implements SsmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SsmlFactory init() {
		try {
			SsmlFactory theSsmlFactory = (SsmlFactory)EPackage.Registry.INSTANCE.getEFactory(SsmlPackage.eNS_URI);
			if (theSsmlFactory != null) {
				return theSsmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SsmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SsmlPackage.SYSTEM: return createSystem();
			case SsmlPackage.DISPATCH_GATE: return createDispatch_Gate();
			case SsmlPackage.CONNECTOR: return createConnector();
			case SsmlPackage.DISPATCH_POLICY: return createDispatch_Policy();
			case SsmlPackage.PORT: return createPort();
			case SsmlPackage.NFP: return createNFP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SsmlPackage.PORT_TYPE:
				return createport_typeFromString(eDataType, initialValue);
			case SsmlPackage.GATE_TYPE:
				return creategate_typeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SsmlPackage.PORT_TYPE:
				return convertport_typeToString(eDataType, instanceValue);
			case SsmlPackage.GATE_TYPE:
				return convertgate_typeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.saferobots.ssml.metamodel.ssml.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatch_Gate createDispatch_Gate() {
		Dispatch_GateImpl dispatch_Gate = new Dispatch_GateImpl();
		return dispatch_Gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatch_Policy createDispatch_Policy() {
		Dispatch_PolicyImpl dispatch_Policy = new Dispatch_PolicyImpl();
		return dispatch_Policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP createNFP() {
		NFPImpl nfp = new NFPImpl();
		return nfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public port_type createport_typeFromString(EDataType eDataType, String initialValue) {
		port_type result = port_type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertport_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gate_type creategate_typeFromString(EDataType eDataType, String initialValue) {
		gate_type result = gate_type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertgate_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlPackage getSsmlPackage() {
		return (SsmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SsmlPackage getPackage() {
		return SsmlPackage.eINSTANCE;
	}

} //SsmlFactoryImpl
