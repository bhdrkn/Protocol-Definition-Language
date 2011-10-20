/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Transactions#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getTransactions()
 * @model
 * @generated
 */
public interface Transactions extends EObject
{
  /**
   * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.senior.project.protocol.Transaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transactions</em>' containment reference list.
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getTransactions_Transactions()
   * @model containment="true"
   * @generated
   */
  EList<Transaction> getTransactions();

} // Transactions
