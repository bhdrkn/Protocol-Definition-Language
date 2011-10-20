/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDL File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.PDLFile#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.PDLFile#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.PDLFile#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.PDLFile#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getPDLFile()
 * @model
 * @generated
 */
public interface PDLFile extends EObject
{
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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getPDLFile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.PDLFile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(Definitions)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getPDLFile_Definition()
   * @model containment="true"
   * @generated
   */
  Definitions getDefinition();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.PDLFile#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(Definitions value);

  /**
   * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transaction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transaction</em>' containment reference.
   * @see #setTransaction(Transactions)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getPDLFile_Transaction()
   * @model containment="true"
   * @generated
   */
  Transactions getTransaction();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.PDLFile#getTransaction <em>Transaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transaction</em>' containment reference.
   * @see #getTransaction()
   * @generated
   */
  void setTransaction(Transactions value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(States)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getPDLFile_State()
   * @model containment="true"
   * @generated
   */
  States getState();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.PDLFile#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(States value);

} // PDLFile
