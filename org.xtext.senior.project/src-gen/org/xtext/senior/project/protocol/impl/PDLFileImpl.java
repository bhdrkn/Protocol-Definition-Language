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

import org.xtext.senior.project.protocol.Definitions;
import org.xtext.senior.project.protocol.PDLFile;
import org.xtext.senior.project.protocol.ProtocolPackage;
import org.xtext.senior.project.protocol.States;
import org.xtext.senior.project.protocol.Test;
import org.xtext.senior.project.protocol.Transactions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDL File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.PDLFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.PDLFileImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.PDLFileImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.PDLFileImpl#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.PDLFileImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PDLFileImpl extends MinimalEObjectImpl.Container implements PDLFile
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected Definitions definition;

  /**
   * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransaction()
   * @generated
   * @ordered
   */
  protected Transactions transaction;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected States state;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected Test test;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PDLFileImpl()
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
    return ProtocolPackage.Literals.PDL_FÝLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions getDefinition()
  {
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinition(Definitions newDefinition, NotificationChain msgs)
  {
    Definitions oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON, oldDefinition, newDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinition(Definitions newDefinition)
  {
    if (newDefinition != definition)
    {
      NotificationChain msgs = null;
      if (definition != null)
        msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON, null, msgs);
      if (newDefinition != null)
        msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON, null, msgs);
      msgs = basicSetDefinition(newDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON, newDefinition, newDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transactions getTransaction()
  {
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransaction(Transactions newTransaction, NotificationChain msgs)
  {
    Transactions oldTransaction = transaction;
    transaction = newTransaction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__TRANSACTÝON, oldTransaction, newTransaction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransaction(Transactions newTransaction)
  {
    if (newTransaction != transaction)
    {
      NotificationChain msgs = null;
      if (transaction != null)
        msgs = ((InternalEObject)transaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__TRANSACTÝON, null, msgs);
      if (newTransaction != null)
        msgs = ((InternalEObject)newTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__TRANSACTÝON, null, msgs);
      msgs = basicSetTransaction(newTransaction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__TRANSACTÝON, newTransaction, newTransaction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState(States newState, NotificationChain msgs)
  {
    States oldState = state;
    state = newState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__STATE, oldState, newState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(States newState)
  {
    if (newState != state)
    {
      NotificationChain msgs = null;
      if (state != null)
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest(Test newTest, NotificationChain msgs)
  {
    Test oldTest = test;
    test = newTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__TEST, oldTest, newTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(Test newTest)
  {
    if (newTest != test)
    {
      NotificationChain msgs = null;
      if (test != null)
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PDL_FÝLE__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PDL_FÝLE__TEST, newTest, newTest));
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
      case ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON:
        return basicSetDefinition(null, msgs);
      case ProtocolPackage.PDL_FÝLE__TRANSACTÝON:
        return basicSetTransaction(null, msgs);
      case ProtocolPackage.PDL_FÝLE__STATE:
        return basicSetState(null, msgs);
      case ProtocolPackage.PDL_FÝLE__TEST:
        return basicSetTest(null, msgs);
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
      case ProtocolPackage.PDL_FÝLE__NAME:
        return getName();
      case ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON:
        return getDefinition();
      case ProtocolPackage.PDL_FÝLE__TRANSACTÝON:
        return getTransaction();
      case ProtocolPackage.PDL_FÝLE__STATE:
        return getState();
      case ProtocolPackage.PDL_FÝLE__TEST:
        return getTest();
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
      case ProtocolPackage.PDL_FÝLE__NAME:
        setName((String)newValue);
        return;
      case ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON:
        setDefinition((Definitions)newValue);
        return;
      case ProtocolPackage.PDL_FÝLE__TRANSACTÝON:
        setTransaction((Transactions)newValue);
        return;
      case ProtocolPackage.PDL_FÝLE__STATE:
        setState((States)newValue);
        return;
      case ProtocolPackage.PDL_FÝLE__TEST:
        setTest((Test)newValue);
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
      case ProtocolPackage.PDL_FÝLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON:
        setDefinition((Definitions)null);
        return;
      case ProtocolPackage.PDL_FÝLE__TRANSACTÝON:
        setTransaction((Transactions)null);
        return;
      case ProtocolPackage.PDL_FÝLE__STATE:
        setState((States)null);
        return;
      case ProtocolPackage.PDL_FÝLE__TEST:
        setTest((Test)null);
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
      case ProtocolPackage.PDL_FÝLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProtocolPackage.PDL_FÝLE__DEFÝNÝTÝON:
        return definition != null;
      case ProtocolPackage.PDL_FÝLE__TRANSACTÝON:
        return transaction != null;
      case ProtocolPackage.PDL_FÝLE__STATE:
        return state != null;
      case ProtocolPackage.PDL_FÝLE__TEST:
        return test != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PDLFileImpl
