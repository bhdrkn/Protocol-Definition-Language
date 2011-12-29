/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Send Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.IsSendEvent#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getIsSendEvent()
 * @model
 * @generated
 */
public interface IsSendEvent extends Event
{
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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getIsSendEvent_Message()
   * @model
   * @generated
   */
  Message getMessage();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.IsSendEvent#getMessage <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(Message value);

} // IsSendEvent
