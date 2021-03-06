/**
 */
package edu.uoc.som.xopenapi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.xopenapi.SecurityRequirement#getSecurityScopes <em>Security Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.xopenapi.SecurityRequirement#getSecuritySchema <em>Security Schema</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.xopenapi.XOpenAPIPackage#getSecurityRequirement()
 * @model
 * @generated
 */
public interface SecurityRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Scopes</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.xopenapi.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Scopes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Scopes</em>' reference list.
	 * @see edu.uoc.som.xopenapi.XOpenAPIPackage#getSecurityRequirement_SecurityScopes()
	 * @model
	 * @generated
	 */
	EList<SecurityScope> getSecurityScopes();

	/**
	 * Returns the value of the '<em><b>Security Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Schema</em>' reference.
	 * @see #setSecuritySchema(SecuritySchema)
	 * @see edu.uoc.som.xopenapi.XOpenAPIPackage#getSecurityRequirement_SecuritySchema()
	 * @model
	 * @generated
	 */
	SecuritySchema getSecuritySchema();

	/**
	 * Sets the value of the '{@link edu.uoc.som.xopenapi.SecurityRequirement#getSecuritySchema <em>Security Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Schema</em>' reference.
	 * @see #getSecuritySchema()
	 * @generated
	 */
	void setSecuritySchema(SecuritySchema value);

} // SecurityRequirement
