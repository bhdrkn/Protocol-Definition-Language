/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Argument#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Argument#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject
{
  /**
   * Returns the value of the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' attribute.
   * @see #setKeyword(String)
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getArgument_Keyword()
   * @model
   * @generated
   */
  String getKeyword();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Argument#getKeyword <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' attribute.
   * @see #getKeyword()
   * @generated
   */
  void setKeyword(String value);

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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getArgument_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Argument#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Argument
