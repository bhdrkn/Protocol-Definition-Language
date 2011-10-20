/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.senior.project.protocol.Case;
import org.xtext.senior.project.protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.CaseImpl#getDefineName <em>Define Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseImpl extends MinimalEObjectImpl.Container implements Case
{
  /**
   * The default value of the '{@link #getDefineName() <em>Define Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineName()
   * @generated
   * @ordered
   */
  protected static final String DEFÝNE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefineName() <em>Define Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineName()
   * @generated
   * @ordered
   */
  protected String defineName = DEFÝNE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProtocolPackage.Literals.CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefineName()
  {
    return defineName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefineName(String newDefineName)
  {
    String oldDefineName = defineName;
    defineName = newDefineName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.CASE__DEFÝNE_NAME, oldDefineName, defineName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProtocolPackage.CASE__DEFÝNE_NAME:
        return getDefineName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProtocolPackage.CASE__DEFÝNE_NAME:
        setDefineName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProtocolPackage.CASE__DEFÝNE_NAME:
        setDefineName(DEFÝNE_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProtocolPackage.CASE__DEFÝNE_NAME:
        return DEFÝNE_NAME_EDEFAULT == null ? defineName != null : !DEFÝNE_NAME_EDEFAULT.equals(defineName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (defineName: ");
    result.append(defineName);
    result.append(')');
    return result.toString();
  }

} //CaseImpl
