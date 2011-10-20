/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Case#getDefineName <em>Define Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject
{
  /**
   * Returns the value of the '<em><b>Define Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Define Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define Name</em>' attribute.
   * @see #setDefineName(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getCase_DefineName()
   * @model
   * @generated
   */
  String getDefineName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Case#getDefineName <em>Define Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Define Name</em>' attribute.
   * @see #getDefineName()
   * @generated
   */
  void setDefineName(String value);

} // Case
