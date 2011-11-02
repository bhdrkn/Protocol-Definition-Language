/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.senior.project.protocol.EventSource;
import org.xtext.senior.project.protocol.ProtocolPackage;
import org.xtext.senior.project.protocol.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.SourceImpl#getEventSource <em>Event Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends CaseImpl implements Source
{
  /**
   * The cached value of the '{@link #getEventSource() <em>Event Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSource()
   * @generated
   * @ordered
   */
  protected EventSource eventSource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SourceImpl()
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
    return ProtocolPackage.Literals.SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSource getEventSource()
  {
    if (eventSource != null && eventSource.eIsProxy())
    {
      InternalEObject oldEventSource = (InternalEObject)eventSource;
      eventSource = (EventSource)eResolveProxy(oldEventSource);
      if (eventSource != oldEventSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.SOURCE__EVENT_SOURCE, oldEventSource, eventSource));
      }
    }
    return eventSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSource basicGetEventSource()
  {
    return eventSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventSource(EventSource newEventSource)
  {
    EventSource oldEventSource = eventSource;
    eventSource = newEventSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.SOURCE__EVENT_SOURCE, oldEventSource, eventSource));
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
      case ProtocolPackage.SOURCE__EVENT_SOURCE:
        if (resolve) return getEventSource();
        return basicGetEventSource();
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
      case ProtocolPackage.SOURCE__EVENT_SOURCE:
        setEventSource((EventSource)newValue);
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
      case ProtocolPackage.SOURCE__EVENT_SOURCE:
        setEventSource((EventSource)null);
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
      case ProtocolPackage.SOURCE__EVENT_SOURCE:
        return eventSource != null;
    }
    return super.eIsSet(featureID);
  }

} //SourceImpl
