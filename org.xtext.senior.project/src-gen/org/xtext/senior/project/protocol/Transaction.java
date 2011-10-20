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
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Transaction#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Transaction#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Transaction#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject
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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getTransaction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Transaction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.senior.project.protocol.Argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getTransaction_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getArguments();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.senior.project.protocol.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getTransaction_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // Transaction
