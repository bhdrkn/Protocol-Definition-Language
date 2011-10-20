/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decrypt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Decrypt#getMessage <em>Message</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Decrypt#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getDecrypt()
 * @model
 * @generated
 */
public interface Decrypt extends Operation
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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getDecrypt_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Decrypt#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

  /**
   * Returns the value of the '<em><b>Participant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participant</em>' attribute.
   * @see #setParticipant(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getDecrypt_Participant()
   * @model
   * @generated
   */
  String getParticipant();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Decrypt#getParticipant <em>Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Participant</em>' attribute.
   * @see #getParticipant()
   * @generated
   */
  void setParticipant(String value);

} // Decrypt
