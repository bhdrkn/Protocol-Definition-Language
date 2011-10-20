/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.xtext.senior.project.protocol.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.senior.project.protocol.ProtocolPackage
 * @generated
 */
public class ProtocolSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProtocolPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ProtocolPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ProtocolPackage.PDL_FÝLE:
      {
        PDLFile pdlFile = (PDLFile)theEObject;
        T result = casePDLFile(pdlFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.DEFÝNÝTÝONS:
      {
        Definitions definitions = (Definitions)theEObject;
        T result = caseDefinitions(definitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.DEFÝNE:
      {
        Define define = (Define)theEObject;
        T result = caseDefine(define);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.TRANSACTÝONS:
      {
        Transactions transactions = (Transactions)theEObject;
        T result = caseTransactions(transactions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.TRANSACTÝON:
      {
        Transaction transaction = (Transaction)theEObject;
        T result = caseTransaction(transaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.OPERATÝON:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.DECRYPT:
      {
        Decrypt decrypt = (Decrypt)theEObject;
        T result = caseDecrypt(decrypt);
        if (result == null) result = caseOperation(decrypt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.ENCRYPT:
      {
        Encrypt encrypt = (Encrypt)theEObject;
        T result = caseEncrypt(encrypt);
        if (result == null) result = caseOperation(encrypt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.SEND:
      {
        Send send = (Send)theEObject;
        T result = caseSend(send);
        if (result == null) result = caseOperation(send);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.PRÝNT:
      {
        Print print = (Print)theEObject;
        T result = casePrint(print);
        if (result == null) result = caseOperation(print);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.CALL:
      {
        Call call = (Call)theEObject;
        T result = caseCall(call);
        if (result == null) result = caseOperation(call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.STATES:
      {
        States states = (States)theEObject;
        T result = caseStates(states);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.GUARD:
      {
        Guard guard = (Guard)theEObject;
        T result = caseGuard(guard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.GET_EVENT:
      {
        GetEvent getEvent = (GetEvent)theEObject;
        T result = caseGetEvent(getEvent);
        if (result == null) result = caseEvent(getEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.IS_SEND_EVENT:
      {
        IsSendEvent ýsSendEvent = (IsSendEvent)theEObject;
        T result = caseIsSendEvent(ýsSendEvent);
        if (result == null) result = caseEvent(ýsSendEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.SOURCE:
      {
        Source source = (Source)theEObject;
        T result = caseSource(source);
        if (result == null) result = caseCase(source);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtocolPackage.FROM:
      {
        From from = (From)theEObject;
        T result = caseFrom(from);
        if (result == null) result = caseCase(from);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PDL File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PDL File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDLFile(PDLFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitions(Definitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Define</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Define</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefine(Define object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transactions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transactions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransactions(Transactions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransaction(Transaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decrypt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decrypt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecrypt(Decrypt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Encrypt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Encrypt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEncrypt(Encrypt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSend(Send object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrint(Print object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCall(Call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>States</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>States</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStates(States object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuard(Guard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetEvent(GetEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Send Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Send Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsSendEvent(IsSendEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSource(Source object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrom(From object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ProtocolSwitch
