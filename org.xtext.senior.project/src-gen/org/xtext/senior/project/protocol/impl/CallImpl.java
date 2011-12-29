/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.senior.project.protocol.Call;
import org.xtext.senior.project.protocol.Define;
import org.xtext.senior.project.protocol.ProtocolPackage;
import org.xtext.senior.project.protocol.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.CallImpl#getTransactionName <em>Transaction Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.CallImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends OperationImpl implements Call
{
  /**
   * The cached value of the '{@link #getTransactionName() <em>Transaction Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionName()
   * @generated
   * @ordered
   */
  protected Transaction transactionName;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Define> args;

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
  public Transaction getTransactionName()
  {
    if (transactionName != null && transactionName.eIsProxy())
    {
      InternalEObject oldTransactionName = (InternalEObject)transactionName;
      transactionName = (Transaction)eResolveProxy(oldTransactionName);
      if (transactionName != oldTransactionName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.CALL__TRANSACTÝON_NAME, oldTransactionName, transactionName));
      }
    }
    return transactionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction basicGetTransactionName()
  {
    return transactionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransactionName(Transaction newTransactionName)
  {
    Transaction oldTransactionName = transactionName;
    transactionName = newTransactionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.CALL__TRANSACTÝON_NAME, oldTransactionName, transactionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Define> getArgs()
  {
    if (args == null)
    {
      args = new EObjectResolvingEList<Define>(Define.class, this, ProtocolPackage.CALL__ARGS);
    }
    return args;
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
        if (resolve) return getTransactionName();
        return basicGetTransactionName();
      case ProtocolPackage.CALL__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProtocolPackage.CALL__TRANSACTÝON_NAME:
        setTransactionName((Transaction)newValue);
        return;
      case ProtocolPackage.CALL__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Define>)newValue);
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
        setTransactionName((Transaction)null);
        return;
      case ProtocolPackage.CALL__ARGS:
        getArgs().clear();
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
        return transactionName != null;
      case ProtocolPackage.CALL__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CallImpl
