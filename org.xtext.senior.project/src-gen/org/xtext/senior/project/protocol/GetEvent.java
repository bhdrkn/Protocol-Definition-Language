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
   * Returns the value of the '<em><b>Who</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Who</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Who</em>' attribute.
   * @see #setWho(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getGetEvent_Who()
   * @model
   * @generated
   */
  String getWho();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.GetEvent#getWho <em>Who</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Who</em>' attribute.
   * @see #getWho()
   * @generated
   */
  void setWho(String value);

} // GetEvent
