/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.senior.project.protocol.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolFactoryImpl extends EFactoryImpl implements ProtocolFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProtocolFactory init()
  {
    try
    {
      ProtocolFactory theProtocolFactory = (ProtocolFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/senior/project/Protocol"); 
      if (theProtocolFactory != null)
      {
        return theProtocolFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProtocolFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProtocolPackage.PDL_FÝLE: return createPDLFile();
      case ProtocolPackage.DEFÝNÝTÝONS: return createDefinitions();
      case ProtocolPackage.DEFÝNE: return createDefine();
      case ProtocolPackage.EVENT_SOURCE: return createEventSource();
      case ProtocolPackage.ARBÝTRATOR: return createArbitrator();
      case ProtocolPackage.PARTÝCÝPANT: return createParticipant();
      case ProtocolPackage.CÝPHER: return createCipher();
      case ProtocolPackage.TRANSACTÝONS: return createTransactions();
      case ProtocolPackage.TRANSACTÝON: return createTransaction();
      case ProtocolPackage.ARGUMENT: return createArgument();
      case ProtocolPackage.OPERATÝON: return createOperation();
      case ProtocolPackage.DECRYPT: return createDecrypt();
      case ProtocolPackage.ENCRYPT: return createEncrypt();
      case ProtocolPackage.SEND: return createSend();
      case ProtocolPackage.PRÝNT: return createPrint();
      case ProtocolPackage.CALL: return createCall();
      case ProtocolPackage.EXCHANGE: return createExchange();
      case ProtocolPackage.STATES: return createStates();
      case ProtocolPackage.STATE: return createState();
      case ProtocolPackage.GUARD: return createGuard();
      case ProtocolPackage.EVENT: return createEvent();
      case ProtocolPackage.GET_EVENT: return createGetEvent();
      case ProtocolPackage.IS_SEND_EVENT: return createIsSendEvent();
      case ProtocolPackage.INÝT: return createInit();
      case ProtocolPackage.CASE: return createCase();
      case ProtocolPackage.ALWAYS: return createAlways();
      case ProtocolPackage.OTHERWÝSE: return createOtherwise();
      case ProtocolPackage.SOURCE: return createSource();
      case ProtocolPackage.FROM: return createFrom();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDLFile createPDLFile()
  {
    PDLFileImpl pdlFile = new PDLFileImpl();
    return pdlFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions createDefinitions()
  {
    DefinitionsImpl definitions = new DefinitionsImpl();
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define createDefine()
  {
    DefineImpl define = new DefineImpl();
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSource createEventSource()
  {
    EventSourceImpl eventSource = new EventSourceImpl();
    return eventSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arbitrator createArbitrator()
  {
    ArbitratorImpl arbitrator = new ArbitratorImpl();
    return arbitrator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant createParticipant()
  {
    ParticipantImpl participant = new ParticipantImpl();
    return participant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cipher createCipher()
  {
    CipherImpl cipher = new CipherImpl();
    return cipher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transactions createTransactions()
  {
    TransactionsImpl transactions = new TransactionsImpl();
    return transactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction createTransaction()
  {
    TransactionImpl transaction = new TransactionImpl();
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decrypt createDecrypt()
  {
    DecryptImpl decrypt = new DecryptImpl();
    return decrypt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Encrypt createEncrypt()
  {
    EncryptImpl encrypt = new EncryptImpl();
    return encrypt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Send createSend()
  {
    SendImpl send = new SendImpl();
    return send;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exchange createExchange()
  {
    ExchangeImpl exchange = new ExchangeImpl();
    return exchange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States createStates()
  {
    StatesImpl states = new StatesImpl();
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetEvent createGetEvent()
  {
    GetEventImpl getEvent = new GetEventImpl();
    return getEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsSendEvent createIsSendEvent()
  {
    IsSendEventImpl ýsSendEvent = new IsSendEventImpl();
    return ýsSendEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init createInit()
  {
    InitImpl ýnit = new InitImpl();
    return ýnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Always createAlways()
  {
    AlwaysImpl always = new AlwaysImpl();
    return always;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Otherwise createOtherwise()
  {
    OtherwiseImpl otherwise = new OtherwiseImpl();
    return otherwise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public From createFrom()
  {
    FromImpl from = new FromImpl();
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolPackage getProtocolPackage()
  {
    return (ProtocolPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProtocolPackage getPackage()
  {
    return ProtocolPackage.eINSTANCE;
  }

} //ProtocolFactoryImpl
