/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Send#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Send#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Send#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getSend()
 * @model
 * @generated
 */
public interface Send extends Operation
{
  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getSend_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Send#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getSend_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Send#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getSend_Destination()
   * @model
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Send#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

} // Send
