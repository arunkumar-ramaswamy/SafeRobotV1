/**
 */
package org.saferobots.ssml.metamodel.ssml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>gate type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.saferobots.ssml.metamodel.ssml.SsmlPackage#getgate_type()
 * @model
 * @generated
 */
public enum gate_type implements Enumerator {
	/**
	 * The '<em><b>Splitter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLITTER_VALUE
	 * @generated
	 * @ordered
	 */
	SPLITTER(0, "splitter", "splitter"),

	/**
	 * The '<em><b>Merger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGER_VALUE
	 * @generated
	 * @ordered
	 */
	MERGER(1, "merger", "merger"),

	/**
	 * The '<em><b>Selector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTOR(2, "selector", "selector"),

	/**
	 * The '<em><b>Synchronizer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONIZER_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCHRONIZER(3, "synchronizer", "synchronizer"),

	/**
	 * The '<em><b>Delay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	DELAY(4, "delay", "delay"),

	/**
	 * The '<em><b>User defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_DEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USER_DEFINED(5, "user_defined", "user_defined");

	/**
	 * The '<em><b>Splitter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Splitter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPLITTER
	 * @model name="splitter"
	 * @generated
	 * @ordered
	 */
	public static final int SPLITTER_VALUE = 0;

	/**
	 * The '<em><b>Merger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Merger</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MERGER
	 * @model name="merger"
	 * @generated
	 * @ordered
	 */
	public static final int MERGER_VALUE = 1;

	/**
	 * The '<em><b>Selector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTOR
	 * @model name="selector"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTOR_VALUE = 2;

	/**
	 * The '<em><b>Synchronizer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synchronizer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONIZER
	 * @model name="synchronizer"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONIZER_VALUE = 3;

	/**
	 * The '<em><b>Delay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAY
	 * @model name="delay"
	 * @generated
	 * @ordered
	 */
	public static final int DELAY_VALUE = 4;

	/**
	 * The '<em><b>User defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User defined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_DEFINED
	 * @model name="user_defined"
	 * @generated
	 * @ordered
	 */
	public static final int USER_DEFINED_VALUE = 5;

	/**
	 * An array of all the '<em><b>gate type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final gate_type[] VALUES_ARRAY =
		new gate_type[] {
			SPLITTER,
			MERGER,
			SELECTOR,
			SYNCHRONIZER,
			DELAY,
			USER_DEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>gate type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<gate_type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>gate type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static gate_type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			gate_type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>gate type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static gate_type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			gate_type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>gate type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static gate_type get(int value) {
		switch (value) {
			case SPLITTER_VALUE: return SPLITTER;
			case MERGER_VALUE: return MERGER;
			case SELECTOR_VALUE: return SELECTOR;
			case SYNCHRONIZER_VALUE: return SYNCHRONIZER;
			case DELAY_VALUE: return DELAY;
			case USER_DEFINED_VALUE: return USER_DEFINED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private gate_type(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //gate_type
