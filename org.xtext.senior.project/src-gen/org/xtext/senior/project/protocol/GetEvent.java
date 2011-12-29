/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.GetEvent#getWho <em>Who</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.GetEvent#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getGetEvent()
 * @model
 * @generated
 */
public interface GetEvent extends Event
{
  /**
   * Returns the value of the '<em><b>Who</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Who</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Who</em>' reference.
   * @see #setWho(Define)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getGetEvent_Who()
   * @model
   * @generated
   */
  Define getWho();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.GetEvent#getWho <em>Who</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Who</em>' reference.
   * @see #getWho()
   * @generated
   */
  void setWho(Define value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' reference.
   * @see #setMessage(Message)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getGetEvent_Message()
   * @model
   * @generated
   */
  Message getMessage();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.GetEvent#getMessage <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(Message value);

} // GetEvent
