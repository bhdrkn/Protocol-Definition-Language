/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.senior.project.protocol.ProtocolPackage;
import org.xtext.senior.project.protocol.Transaction;
import org.xtext.senior.project.protocol.Transactions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transactions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.TransactionsImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionsImpl extends MinimalEObjectImpl.Container implements Transactions
{
  /**
   * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactions()
   * @generated
   * @ordered
   */
  protected EList<Transaction> transactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionsImpl()
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
    return ProtocolPackage.Literals.TRANSACTÝONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transaction> getTransactions()
  {
    if (transactions == null)
    {
      transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this, ProtocolPackage.TRANSACTÝONS__TRANSACTÝONS);
    }
    return transactions;
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
      case ProtocolPackage.TRANSACTÝONS__TRANSACTÝONS:
        return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
      case ProtocolPackage.TRANSACTÝONS__TRANSACTÝONS:
        return getTransactions();
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
      case ProtocolPackage.TRANSACTÝONS__TRANSACTÝONS:
        getTransactions().clear();
        getTransactions().addAll((Collection<? extends Transaction>)newValue);
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
      case ProtocolPackage.TRANSACTÝONS__TRANSACTÝONS:
        getTransactions().clear();
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
      case ProtocolPackage.TRANSACTÝONS__TRANSACTÝONS:
        return transactions != null && !transactions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransactionsImpl
