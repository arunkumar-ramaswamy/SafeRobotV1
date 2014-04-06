/**
 */
package org.saferobots.ssml.metamodel.ssml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.saferobots.ssml.metamodel.ssml.Connector;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Policy;
import org.saferobots.ssml.metamodel.ssml.Port;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;
import org.saferobots.ssml.metamodel.ssml.SsmlPackage;
import org.saferobots.ssml.metamodel.ssml.gate_type;
import org.saferobots.ssml.metamodel.ssml.port_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SsmlPackageImpl extends EPackageImpl implements SsmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatch_GateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatch_PolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum port_typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gate_typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SsmlPackageImpl() {
		super(eNS_URI, SsmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SsmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SsmlPackage init() {
		if (isInited) return (SsmlPackage)EPackage.Registry.INSTANCE.getEPackage(SsmlPackage.eNS_URI);

		// Obtain or create and register package
		SsmlPackageImpl theSsmlPackage = (SsmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SsmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SsmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSsmlPackage.createPackageContents();

		// Initialize created meta-data
		theSsmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSsmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SsmlPackage.eNS_URI, theSsmlPackage);
		return theSsmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Gates() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Connectors() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatch_Gate() {
		return dispatch_GateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispatch_Gate_Ports() {
		return (EReference)dispatch_GateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispatch_Gate_Policy() {
		return (EReference)dispatch_GateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispatch_Gate_Name() {
		return (EAttribute)dispatch_GateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispatch_Gate_Type() {
		return (EAttribute)dispatch_GateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Contains_system() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_In() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Out() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Has_nfp() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Name() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatch_Policy() {
		return dispatch_PolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispatch_Policy_Name() {
		return (EAttribute)dispatch_PolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP() {
		return nfpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Name() {
		return (EAttribute)nfpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getport_type() {
		return port_typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getgate_type() {
		return gate_typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlFactory getSsmlFactory() {
		return (SsmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__GATES);
		createEReference(systemEClass, SYSTEM__CONNECTORS);
		createEAttribute(systemEClass, SYSTEM__NAME);

		dispatch_GateEClass = createEClass(DISPATCH_GATE);
		createEReference(dispatch_GateEClass, DISPATCH_GATE__PORTS);
		createEReference(dispatch_GateEClass, DISPATCH_GATE__POLICY);
		createEAttribute(dispatch_GateEClass, DISPATCH_GATE__NAME);
		createEAttribute(dispatch_GateEClass, DISPATCH_GATE__TYPE);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__CONTAINS_SYSTEM);
		createEReference(connectorEClass, CONNECTOR__IN);
		createEReference(connectorEClass, CONNECTOR__OUT);
		createEReference(connectorEClass, CONNECTOR__HAS_NFP);
		createEAttribute(connectorEClass, CONNECTOR__NAME);

		dispatch_PolicyEClass = createEClass(DISPATCH_POLICY);
		createEAttribute(dispatch_PolicyEClass, DISPATCH_POLICY__NAME);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__TYPE);

		nfpEClass = createEClass(NFP);
		createEAttribute(nfpEClass, NFP__NAME);

		// Create enums
		port_typeEEnum = createEEnum(PORT_TYPE);
		gate_typeEEnum = createEEnum(GATE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, org.saferobots.ssml.metamodel.ssml.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Gates(), this.getDispatch_Gate(), null, "gates", null, 0, -1, org.saferobots.ssml.metamodel.ssml.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, org.saferobots.ssml.metamodel.ssml.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.saferobots.ssml.metamodel.ssml.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispatch_GateEClass, Dispatch_Gate.class, "Dispatch_Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDispatch_Gate_Ports(), this.getPort(), null, "ports", null, 0, -1, Dispatch_Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDispatch_Gate_Policy(), this.getDispatch_Policy(), null, "policy", null, 0, 1, Dispatch_Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDispatch_Gate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dispatch_Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDispatch_Gate_Type(), this.getgate_type(), "type", null, 0, 1, Dispatch_Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Contains_system(), this.getSystem(), null, "contains_system", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_In(), this.getPort(), null, "in", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Out(), this.getPort(), null, "out", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Has_nfp(), this.getNFP(), null, "has_nfp", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispatch_PolicyEClass, Dispatch_Policy.class, "Dispatch_Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDispatch_Policy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dispatch_Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Type(), this.getport_type(), "type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfpEClass, org.saferobots.ssml.metamodel.ssml.NFP.class, "NFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.saferobots.ssml.metamodel.ssml.NFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(port_typeEEnum, port_type.class, "port_type");
		addEEnumLiteral(port_typeEEnum, port_type.IN);
		addEEnumLiteral(port_typeEEnum, port_type.OUT);

		initEEnum(gate_typeEEnum, gate_type.class, "gate_type");
		addEEnumLiteral(gate_typeEEnum, gate_type.SPLITTER);
		addEEnumLiteral(gate_typeEEnum, gate_type.MERGER);
		addEEnumLiteral(gate_typeEEnum, gate_type.SELECTOR);
		addEEnumLiteral(gate_typeEEnum, gate_type.SYNCHRONIZER);
		addEEnumLiteral(gate_typeEEnum, gate_type.DELAY);
		addEEnumLiteral(gate_typeEEnum, gate_type.USER_DEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //SsmlPackageImpl
