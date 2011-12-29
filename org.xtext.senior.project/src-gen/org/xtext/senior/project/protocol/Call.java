/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Call#getTransactionName <em>Transaction Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Call#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Operation
{
  /**
   * Returns the value of the '<em><b>Transaction Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transaction Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transaction Name</em>' reference.
   * @see #setTransactionName(Transaction)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getCall_TransactionName()
   * @model
   * @generated
   */
  Transaction getTransactionName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Call#getTransactionName <em>Transaction Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transaction Name</em>' reference.
   * @see #getTransactionName()
   * @generated
   */
  void setTransactionName(Transaction value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' reference list.
   * The list contents are of type {@link org.xtext.senior.project.protocol.Define}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' reference list.
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getCall_Args()
   * @model
   * @generated
   */
  EList<Define> getArgs();

} // Call
