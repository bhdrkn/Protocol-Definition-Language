/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.senior.project.protocol.Event;
import org.xtext.senior.project.protocol.Guard;
import org.xtext.senior.project.protocol.ProtocolPackage;
import org.xtext.senior.project.protocol.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.StateImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.StateImpl#getGuards <em>Guards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
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
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuards()
   * @generated
   * @ordered
   */
  protected EList<Guard> guards;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return ProtocolPackage.Literals.STATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.STATE__EVENT, oldEvent, newEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    if (newEvent != event)
    {
      NotificationChain msgs = null;
      if (event != null)
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.STATE__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.STATE__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.STATE__EVENT, newEvent, newEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Guard> getGuards()
  {
    if (guards == null)
    {
      guards = new EObjectContainmentEList<Guard>(Guard.class, this, ProtocolPackage.STATE__GUARDS);
    }
    return guards;
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
      case ProtocolPackage.STATE__EVENT:
        return basicSetEvent(null, msgs);
      case ProtocolPackage.STATE__GUARDS:
        return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
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
      case ProtocolPackage.STATE__NAME:
        return getName();
      case ProtocolPackage.STATE__EVENT:
        return getEvent();
      case ProtocolPackage.STATE__GUARDS:
        return getGuards();
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
      case ProtocolPackage.STATE__NAME:
        setName((String)newValue);
        return;
      case ProtocolPackage.STATE__EVENT:
        setEvent((Event)newValue);
        return;
      case ProtocolPackage.STATE__GUARDS:
        getGuards().clear();
        getGuards().addAll((Collection<? extends Guard>)newValue);
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
      case ProtocolPackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProtocolPackage.STATE__EVENT:
        setEvent((Event)null);
        return;
      case ProtocolPackage.STATE__GUARDS:
        getGuards().clear();
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
      case ProtocolPackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProtocolPackage.STATE__EVENT:
        return event != null;
      case ProtocolPackage.STATE__GUARDS:
        return guards != null && !guards.isEmpty();
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

} //StateImpl
