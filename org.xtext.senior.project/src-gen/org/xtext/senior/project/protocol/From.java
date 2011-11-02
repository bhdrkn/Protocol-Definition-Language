/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.From#getEventSource <em>Event Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getFrom()
 * @model
 * @generated
 */
public interface From extends Case
{
  /**
   * Returns the value of the '<em><b>Event Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Source</em>' reference.
   * @see #setEventSource(EventSource)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getFrom_EventSource()
   * @model
   * @generated
   */
  EventSource getEventSource();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.From#getEventSource <em>Event Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Source</em>' reference.
   * @see #getEventSource()
   * @generated
   */
  void setEventSource(EventSource value);

} // From
