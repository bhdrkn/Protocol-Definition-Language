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

import org.xtext.senior.project.protocol.Define;
import org.xtext.senior.project.protocol.GetEvent;
import org.xtext.senior.project.protocol.Message;
import org.xtext.senior.project.protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.GetEventImpl#getWho <em>Who</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.GetEventImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetEventImpl extends EventImpl implements GetEvent
{
  /**
   * The cached value of the '{@link #getWho() <em>Who</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWho()
   * @generated
   * @ordered
   */
  protected Define who;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected Message message;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetEventImpl()
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
    return ProtocolPackage.Literals.GET_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define getWho()
  {
    if (who != null && who.eIsProxy())
    {
      InternalEObject oldWho = (InternalEObject)who;
      who = (Define)eResolveProxy(oldWho);
      if (who != oldWho)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.GET_EVENT__WHO, oldWho, who));
      }
    }
    return who;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define basicGetWho()
  {
    return who;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWho(Define newWho)
  {
    Define oldWho = who;
    who = newWho;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.GET_EVENT__WHO, oldWho, who));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getMessage()
  {
    if (message != null && message.eIsProxy())
    {
      InternalEObject oldMessage = (InternalEObject)message;
      message = (Message)eResolveProxy(oldMessage);
      if (message != oldMessage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.GET_EVENT__MESSAGE, oldMessage, message));
      }
    }
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message basicGetMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(Message newMessage)
  {
    Message oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.GET_EVENT__MESSAGE, oldMessage, message));
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
      case ProtocolPackage.GET_EVENT__WHO:
        if (resolve) return getWho();
        return basicGetWho();
      case ProtocolPackage.GET_EVENT__MESSAGE:
        if (resolve) return getMessage();
        return basicGetMessage();
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
      case ProtocolPackage.GET_EVENT__WHO:
        setWho((Define)newValue);
        return;
      case ProtocolPackage.GET_EVENT__MESSAGE:
        setMessage((Message)newValue);
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
      case ProtocolPackage.GET_EVENT__WHO:
        setWho((Define)null);
        return;
      case ProtocolPackage.GET_EVENT__MESSAGE:
        setMessage((Message)null);
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
      case ProtocolPackage.GET_EVENT__WHO:
        return who != null;
      case ProtocolPackage.GET_EVENT__MESSAGE:
        return message != null;
    }
    return super.eIsSet(featureID);
  }

} //GetEventImpl
