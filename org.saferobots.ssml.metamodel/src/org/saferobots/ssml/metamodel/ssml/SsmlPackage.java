/**
 */
package org.saferobots.ssml.metamodel.ssml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.saferobots.ssml.metamodel.ssml.SsmlFactory
 * @model kind="package"
 * @generated
 */
public interface SsmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ssml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ssml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ssml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SsmlPackage eINSTANCE = org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SystemImpl
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GATES = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl <em>Dispatch Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getDispatch_Gate()
	 * @generated
	 */
	int DISPATCH_GATE = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__POLICY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Dispatch Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dispatch Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Contains system</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONTAINS_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IN = 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUT = 2;

	/**
	 * The feature id for the '<em><b>Has nfp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HAS_NFP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 4;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_PolicyImpl <em>Dispatch Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.impl.Dispatch_PolicyImpl
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getDispatch_Policy()
	 * @generated
	 */
	int DISPATCH_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_POLICY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dispatch Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dispatch Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.impl.PortImpl
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.impl.NFPImpl <em>NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.impl.NFPImpl
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getNFP()
	 * @generated
	 */
	int NFP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP__NAME = 0;

	/**
	 * The number of structural features of the '<em>NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.port_type <em>port type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.port_type
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getport_type()
	 * @generated
	 */
	int PORT_TYPE = 6;


	/**
	 * The meta object id for the '{@link org.saferobots.ssml.metamodel.ssml.gate_type <em>gate type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.metamodel.ssml.gate_type
	 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getgate_type()
	 * @generated
	 */
	int GATE_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.metamodel.ssml.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.metamodel.ssml.System#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.System#getGates()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.metamodel.ssml.System#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.System#getConnectors()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate <em>Dispatch Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatch Gate</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Dispatch_Gate
	 * @generated
	 */
	EClass getDispatch_Gate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getPorts()
	 * @see #getDispatch_Gate()
	 * @generated
	 */
	EReference getDispatch_Gate_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getPolicy()
	 * @see #getDispatch_Gate()
	 * @generated
	 */
	EReference getDispatch_Gate_Policy();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getName()
	 * @see #getDispatch_Gate()
	 * @generated
	 */
	EAttribute getDispatch_Gate_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Dispatch_Gate#getType()
	 * @see #getDispatch_Gate()
	 * @generated
	 */
	EAttribute getDispatch_Gate_Type();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.metamodel.ssml.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.metamodel.ssml.Connector#getContains_system <em>Contains system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains system</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Connector#getContains_system()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Contains_system();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.metamodel.ssml.Connector#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Connector#getIn()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_In();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.metamodel.ssml.Connector#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Connector#getOut()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Out();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.metamodel.ssml.Connector#getHas_nfp <em>Has nfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has nfp</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Connector#getHas_nfp()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Has_nfp();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Policy <em>Dispatch Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatch Policy</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Dispatch_Policy
	 * @generated
	 */
	EClass getDispatch_Policy();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.Dispatch_Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Dispatch_Policy#getName()
	 * @see #getDispatch_Policy()
	 * @generated
	 */
	EAttribute getDispatch_Policy_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.metamodel.ssml.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.metamodel.ssml.NFP <em>NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.NFP
	 * @generated
	 */
	EClass getNFP();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.metamodel.ssml.NFP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.NFP#getName()
	 * @see #getNFP()
	 * @generated
	 */
	EAttribute getNFP_Name();

	/**
	 * Returns the meta object for enum '{@link org.saferobots.ssml.metamodel.ssml.port_type <em>port type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>port type</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.port_type
	 * @generated
	 */
	EEnum getport_type();

	/**
	 * Returns the meta object for enum '{@link org.saferobots.ssml.metamodel.ssml.gate_type <em>gate type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>gate type</em>'.
	 * @see org.saferobots.ssml.metamodel.ssml.gate_type
	 * @generated
	 */
	EEnum getgate_type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SsmlFactory getSsmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SystemImpl
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GATES = eINSTANCE.getSystem_Gates();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONNECTORS = eINSTANCE.getSystem_Connectors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl <em>Dispatch Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.impl.Dispatch_GateImpl
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getDispatch_Gate()
		 * @generated
		 */
		EClass DISPATCH_GATE = eINSTANCE.getDispatch_Gate();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCH_GATE__PORTS = eINSTANCE.getDispatch_Gate_Ports();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCH_GATE__POLICY = eINSTANCE.getDispatch_Gate_Policy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPATCH_GATE__NAME = eINSTANCE.getDispatch_Gate_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPATCH_GATE__TYPE = eINSTANCE.getDispatch_Gate_Type();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.impl.ConnectorImpl
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Contains system</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONTAINS_SYSTEM = eINSTANCE.getConnector_Contains_system();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__IN = eINSTANCE.getConnector_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__OUT = eINSTANCE.getConnector_Out();

		/**
		 * The meta object literal for the '<em><b>Has nfp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__HAS_NFP = eINSTANCE.getConnector_Has_nfp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.impl.Dispatch_PolicyImpl <em>Dispatch Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.impl.Dispatch_PolicyImpl
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getDispatch_Policy()
		 * @generated
		 */
		EClass DISPATCH_POLICY = eINSTANCE.getDispatch_Policy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPATCH_POLICY__NAME = eINSTANCE.getDispatch_Policy_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.impl.PortImpl
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.impl.NFPImpl <em>NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.impl.NFPImpl
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getNFP()
		 * @generated
		 */
		EClass NFP = eINSTANCE.getNFP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP__NAME = eINSTANCE.getNFP_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.port_type <em>port type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.port_type
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getport_type()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getport_type();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.metamodel.ssml.gate_type <em>gate type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.metamodel.ssml.gate_type
		 * @see org.saferobots.ssml.metamodel.ssml.impl.SsmlPackageImpl#getgate_type()
		 * @generated
		 */
		EEnum GATE_TYPE = eINSTANCE.getgate_type();

	}

} //SsmlPackage
