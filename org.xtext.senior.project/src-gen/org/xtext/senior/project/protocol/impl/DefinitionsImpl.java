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

import org.xtext.senior.project.protocol.Cipher;
import org.xtext.senior.project.protocol.Definitions;
import org.xtext.senior.project.protocol.EventSource;
import org.xtext.senior.project.protocol.Message;
import org.xtext.senior.project.protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.senior.project.protocol.impl.DefinitionsImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.DefinitionsImpl#getCipher <em>Cipher</em>}</li>
 *   <li>{@link org.xtext.senior.project.protocol.impl.DefinitionsImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends MinimalEObjectImpl.Container implements Definitions
{
  /**
   * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSources()
   * @generated
   * @ordered
   */
  protected EList<EventSource> sources;

  /**
   * The cached value of the '{@link #getCipher() <em>Cipher</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCipher()
   * @generated
   * @ordered
   */
  protected Cipher cipher;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
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
  protected DefinitionsImpl()
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
    return ProtocolPackage.Literals.DEFİNİTİONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventSource> getSources()
  {
    if (sources == null)
    {
      sources = new EObjectContainmentEList<EventSource>(EventSource.class, this, ProtocolPackage.DEFİNİTİONS__SOURCES);
    }
    return sources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cipher getCipher()
  {
    return cipher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCipher(Cipher newCipher, NotificationChain msgs)
  {
    Cipher oldCipher = cipher;
    cipher = newCipher;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.DEFİNİTİONS__CİPHER, oldCipher, newCipher);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCipher(Cipher newCipher)
  {
    if (newCipher != cipher)
    {
      NotificationChain msgs = null;
      if (cipher != null)
        msgs = ((InternalEObject)cipher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.DEFİNİTİONS__CİPHER, null, msgs);
      if (newCipher != null)
        msgs = ((InternalEObject)newCipher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.DEFİNİTİONS__CİPHER, null, msgs);
      msgs = basicSetCipher(newCipher, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.DEFİNİTİONS__CİPHER, newCipher, newCipher));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs)
  {
    Message oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.DEFİNİTİONS__MESSAGE, oldMessage, newMessage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(Message newMessage)
  {
    if (newMessage != message)
    {
      NotificationChain msgs = null;
      if (message != null)
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.DEFİNİTİONS__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.DEFİNİTİONS__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.DEFİNİTİONS__MESSAGE, newMessage, newMessage));
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
      case ProtocolPackage.DEFİNİTİONS__SOURCES:
        return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
      case ProtocolPackage.DEFİNİTİONS__CİPHER:
        return basicSetCipher(null, msgs);
      case ProtocolPackage.DEFİNİTİONS__MESSAGE:
        return basicSetMessage(null, msgs);
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
      case ProtocolPackage.DEFİNİTİONS__SOURCES:
        return getSources();
      case ProtocolPackage.DEFİNİTİONS__CİPHER:
        return getCipher();
      case ProtocolPackage.DEFİNİTİONS__MESSAGE:
        return getMessage();
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
      case ProtocolPackage.DEFİNİTİONS__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends EventSource>)newValue);
        return;
      case ProtocolPackage.DEFİNİTİONS__CİPHER:
        setCipher((Cipher)newValue);
        return;
      case ProtocolPackage.DEFİNİTİONS__MESSAGE:
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
      case ProtocolPackage.DEFİNİTİONS__SOURCES:
        getSources().clear();
        return;
      case ProtocolPackage.DEFİNİTİONS__CİPHER:
        setCipher((Cipher)null);
        return;
      case ProtocolPackage.DEFİNİTİONS__MESSAGE:
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
      case ProtocolPackage.DEFİNİTİONS__SOURCES:
        return sources != null && !sources.isEmpty();
      case ProtocolPackage.DEFİNİTİONS__CİPHER:
        return cipher != null;
      case ProtocolPackage.DEFİNİTİONS__MESSAGE:
        return message != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionsImpl
