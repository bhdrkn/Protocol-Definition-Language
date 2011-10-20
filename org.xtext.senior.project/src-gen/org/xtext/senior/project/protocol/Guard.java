/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Guard#getCasem <em>Casem</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Guard#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject
{
  /**
   * Returns the value of the '<em><b>Casem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Casem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Casem</em>' containment reference.
   * @see #setCasem(Case)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getGuard_Casem()
   * @model containment="true"
   * @generated
   */
  Case getCasem();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Guard#getCasem <em>Casem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Casem</em>' containment reference.
   * @see #getCasem()
   * @generated
   */
  void setCasem(Case value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(Operation)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getGuard_Operation()
   * @model containment="true"
   * @generated
   */
  Operation getOperation();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Guard#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(Operation value);

} // Guard
