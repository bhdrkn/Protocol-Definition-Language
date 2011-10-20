/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.senior.project.protocol.Call;
import org.xtext.senior.project.protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.CallImpl#getTransactionName <em>Transaction Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends OperationImpl implements Call
{
  /**
   * The default value of the '{@link #getTransactionName() <em>Transaction Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionName()
   * @generated
   * @ordered
   */
  protected static final String TRANSACTÝON_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransactionName() <em>Transaction Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionName()
   * @generated
   * @ordered
   */
  protected String transactionName = TRANSACTÝON_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallImpl()
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
    return ProtocolPackage.Literals.CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTransactionName()
  {
    return transactionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransactionName(String newTransactionName)
  {
    String oldTransactionName = transactionName;
    transactionName = newTransactionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.CALL__TRANSACTÝON_NAME, oldTransactionName, transactionName));
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
      case ProtocolPackage.CALL__TRANSACTÝON_NAME:
        return getTransactionName();
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
      case ProtocolPackage.CALL__TRANSACTÝON_NAME:
        setTransactionName((String)newValue);
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
      case ProtocolPackage.CALL__TRANSACTÝON_NAME:
        setTransactionName(TRANSACTÝON_NAME_EDEFAULT);
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
      case ProtocolPackage.CALL__TRANSACTÝON_NAME:
        return TRANSACTÝON_NAME_EDEFAULT == null ? transactionName != null : !TRANSACTÝON_NAME_EDEFAULT.equals(transactionName);
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
    result.append(" (transactionName: ");
    result.append(transactionName);
    result.append(')');
    return result.toString();
  }

} //CallImpl
