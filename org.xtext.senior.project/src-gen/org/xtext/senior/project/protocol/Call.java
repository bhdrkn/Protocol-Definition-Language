/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Call#getTransactionName <em>Transaction Name</em>}</li>
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

} // Call
