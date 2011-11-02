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
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Definitions#getSources <em>Sources</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Definitions#getCipher <em>Cipher</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends EObject
{
  /**
   * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.senior.project.protocol.EventSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sources</em>' containment reference list.
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getDefinitions_Sources()
   * @model containment="true"
   * @generated
   */
  EList<EventSource> getSources();

  /**
   * Returns the value of the '<em><b>Cipher</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cipher</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cipher</em>' containment reference.
   * @see #setCipher(Cipher)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getDefinitions_Cipher()
   * @model containment="true"
   * @generated
   */
  Cipher getCipher();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Definitions#getCipher <em>Cipher</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cipher</em>' containment reference.
   * @see #getCipher()
   * @generated
   */
  void setCipher(Cipher value);

} // Definitions
