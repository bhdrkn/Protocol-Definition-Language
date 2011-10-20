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
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.State#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.State#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.State#getGuards <em>Guards</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(Event)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getState_Event()
   * @model containment="true"
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.State#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.senior.project.protocol.Guard}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guards</em>' containment reference list.
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getState_Guards()
   * @model containment="true"
   * @generated
   */
  EList<Guard> getGuards();

} // State
