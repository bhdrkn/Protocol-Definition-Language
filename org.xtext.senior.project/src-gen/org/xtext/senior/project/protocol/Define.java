/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.Define#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.Define#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.senior.project.protocol.ProtocolPackage#getDefine()
 * @model
 * @generated
 */
public interface Define extends EObject
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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getDefine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Define#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getDefine_Keyword()
   * @model
   * @generated
   */
  String getKeyword();

  /**
   * Sets the value of the '{@link org.xtext.senior.project.protocol.Define#getKeyword <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' attribute.
   * @see #getKeyword()
   * @generated
   */
  void setKeyword(String value);

} // Define
