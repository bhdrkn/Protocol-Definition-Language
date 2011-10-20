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
 *   <li>{@link org.xtext.senior.project.protocol.Definitions#getDefinitions <em>Definitions</em>}</li>
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
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.senior.project.protocol.Define}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see org.xtext.senior.project.protocol.ProtocolPackage#getDefinitions_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Define> getDefinitions();

} // Definitions
