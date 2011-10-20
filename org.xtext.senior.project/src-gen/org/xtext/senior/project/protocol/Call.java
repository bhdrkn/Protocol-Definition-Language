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
   * Returns the value of the '<em><b>Transaction Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transaction Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transaction Name</em>' attribute.
   * @see #setTransactionName(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getCall_TransactionName()
   * @model
   * @generated
   */
  String getTransactionName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Call#getTransactionName <em>Transaction Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transaction Name</em>' attribute.
   * @see #getTransactionName()
   * @generated
   */
  void setTransactionName(String value);

} // Call
