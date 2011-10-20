/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.senior.project.protocol.Case;
import org.xtext.senior.project.protocol.Guard;
import org.xtext.senior.project.protocol.Operation;
import org.xtext.senior.project.protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.GuardImpl#getCasem <em>Casem</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.GuardImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends MinimalEObjectImpl.Container implements Guard
{
  /**
   * The cached value of the '{@link #getCasem() <em>Casem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCasem()
   * @generated
   * @ordered
   */
  protected Case casem;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected Operation operation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuardImpl()
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
    return ProtocolPackage.Literals.GUARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case getCasem()
  {
    return casem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCasem(Case newCasem, NotificationChain msgs)
  {
    Case oldCasem = casem;
    casem = newCasem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.GUARD__CASEM, oldCasem, newCasem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCasem(Case newCasem)
  {
    if (newCasem != casem)
    {
      NotificationChain msgs = null;
      if (casem != null)
        msgs = ((InternalEObject)casem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.GUARD__CASEM, null, msgs);
      if (newCasem != null)
        msgs = ((InternalEObject)newCasem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.GUARD__CASEM, null, msgs);
      msgs = basicSetCasem(newCasem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.GUARD__CASEM, newCasem, newCasem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs)
  {
    Operation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.GUARD__OPERATÝON, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(Operation newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.GUARD__OPERATÝON, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.GUARD__OPERATÝON, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.GUARD__OPERATÝON, newOperation, newOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProtocolPackage.GUARD__CASEM:
        return basicSetCasem(null, msgs);
      case ProtocolPackage.GUARD__OPERATÝON:
        return basicSetOperation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ProtocolPackage.GUARD__CASEM:
        return getCasem();
      case ProtocolPackage.GUARD__OPERATÝON:
        return getOperation();
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
      case ProtocolPackage.GUARD__CASEM:
        setCasem((Case)newValue);
        return;
      case ProtocolPackage.GUARD__OPERATÝON:
        setOperation((Operation)newValue);
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
      case ProtocolPackage.GUARD__CASEM:
        setCasem((Case)null);
        return;
      case ProtocolPackage.GUARD__OPERATÝON:
        setOperation((Operation)null);
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
      case ProtocolPackage.GUARD__CASEM:
        return casem != null;
      case ProtocolPackage.GUARD__OPERATÝON:
        return operation != null;
    }
    return super.eIsSet(featureID);
  }

} //GuardImpl
