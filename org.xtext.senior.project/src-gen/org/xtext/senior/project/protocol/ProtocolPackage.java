/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.senior.project.protocol.ProtocolFactory
 * @model kind="package"
 * @generated
 */
public interface ProtocolPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "protocol";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/senior/project/Protocol";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "protocol";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProtocolPackage eINSTANCE = org.xtext.senior.project.protocol.impl.ProtocolPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.PDLFileImpl <em>PDL File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.PDLFileImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getPDLFile()
   * @generated
   */
  int PDL_F�LE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDL_F�LE__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDL_F�LE__DEF�N�T�ON = 1;

  /**
   * The feature id for the '<em><b>Transaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDL_F�LE__TRANSACT�ON = 2;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDL_F�LE__STATE = 3;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDL_F�LE__TEST = 4;

  /**
   * The number of structural features of the '<em>PDL File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDL_F�LE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.DefinitionsImpl <em>Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.DefinitionsImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getDefinitions()
   * @generated
   */
  int DEF�N�T�ONS = 1;

  /**
   * The feature id for the '<em><b>Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF�N�T�ONS__SOURCES = 0;

  /**
   * The feature id for the '<em><b>Cipher</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF�N�T�ONS__C�PHER = 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF�N�T�ONS__MESSAGE = 2;

  /**
   * The number of structural features of the '<em>Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF�N�T�ONS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.DefineImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getDefine()
   * @generated
   */
  int DEF�NE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF�NE__NAME = 0;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF�NE__KEYWORD = 1;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF�NE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.EventSourceImpl <em>Event Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.EventSourceImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getEventSource()
   * @generated
   */
  int EVENT_SOURCE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SOURCE__NAME = DEF�NE__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SOURCE__KEYWORD = DEF�NE__KEYWORD;

  /**
   * The number of structural features of the '<em>Event Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SOURCE_FEATURE_COUNT = DEF�NE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.ArbitratorImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getArbitrator()
   * @generated
   */
  int ARB�TRATOR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARB�TRATOR__NAME = EVENT_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARB�TRATOR__KEYWORD = EVENT_SOURCE__KEYWORD;

  /**
   * The number of structural features of the '<em>Arbitrator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARB�TRATOR_FEATURE_COUNT = EVENT_SOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.ParticipantImpl <em>Participant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.ParticipantImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getParticipant()
   * @generated
   */
  int PART�C�PANT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART�C�PANT__NAME = EVENT_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART�C�PANT__KEYWORD = EVENT_SOURCE__KEYWORD;

  /**
   * The number of structural features of the '<em>Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART�C�PANT_FEATURE_COUNT = EVENT_SOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.CipherImpl <em>Cipher</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.CipherImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getCipher()
   * @generated
   */
  int C�PHER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int C�PHER__NAME = DEF�NE__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int C�PHER__KEYWORD = DEF�NE__KEYWORD;

  /**
   * The number of structural features of the '<em>Cipher</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int C�PHER_FEATURE_COUNT = DEF�NE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.MessageImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = DEF�NE__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__KEYWORD = DEF�NE__KEYWORD;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = DEF�NE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.TransactionsImpl <em>Transactions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.TransactionsImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTransactions()
   * @generated
   */
  int TRANSACT�ONS = 8;

  /**
   * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACT�ONS__TRANSACT�ONS = 0;

  /**
   * The number of structural features of the '<em>Transactions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACT�ONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.TransactionImpl <em>Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.TransactionImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTransaction()
   * @generated
   */
  int TRANSACT�ON = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACT�ON__NAME = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACT�ON__ARGUMENTS = 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACT�ON__OPERAT�ONS = 2;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACT�ON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.ArgumentImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 10;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.OperationImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getOperation()
   * @generated
   */
  int OPERAT�ON = 11;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAT�ON_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.DecryptImpl <em>Decrypt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.DecryptImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getDecrypt()
   * @generated
   */
  int DECRYPT = 12;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECRYPT__MESSAGE = OPERAT�ON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Participant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECRYPT__PART�C�PANT = OPERAT�ON_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Decrypt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECRYPT_FEATURE_COUNT = OPERAT�ON_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.EncryptImpl <em>Encrypt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.EncryptImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getEncrypt()
   * @generated
   */
  int ENCRYPT = 13;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCRYPT__MESSAGE = OPERAT�ON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Participant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCRYPT__PART�C�PANT = OPERAT�ON_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Encrypt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCRYPT_FEATURE_COUNT = OPERAT�ON_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.SendImpl <em>Send</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.SendImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getSend()
   * @generated
   */
  int SEND = 14;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND__MESSAGE = OPERAT�ON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND__SOURCE = OPERAT�ON_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND__DEST�NAT�ON = OPERAT�ON_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Send</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_FEATURE_COUNT = OPERAT�ON_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.PrintImpl <em>Print</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.PrintImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getPrint()
   * @generated
   */
  int PR�NT = 15;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PR�NT__MESSAGE = OPERAT�ON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PR�NT_FEATURE_COUNT = OPERAT�ON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.CallImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getCall()
   * @generated
   */
  int CALL = 16;

  /**
   * The feature id for the '<em><b>Transaction Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__TRANSACT�ON_NAME = OPERAT�ON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__ARGS = OPERAT�ON_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = OPERAT�ON_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.ExchangeImpl <em>Exchange</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.ExchangeImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getExchange()
   * @generated
   */
  int EXCHANGE = 17;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE__SOURCE = OPERAT�ON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE__DEST�NAT�ON = OPERAT�ON_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exchange</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_FEATURE_COUNT = OPERAT�ON_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.RedirectImpl <em>Redirect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.RedirectImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getRedirect()
   * @generated
   */
  int RED�RECT = 18;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RED�RECT__MESSAGE = OPERAT�ON_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RED�RECT__DEST�NAT�ON = OPERAT�ON_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Redirect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RED�RECT_FEATURE_COUNT = OPERAT�ON_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.StatesImpl <em>States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.StatesImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getStates()
   * @generated
   */
  int STATES = 19;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__STATES = 0;

  /**
   * The number of structural features of the '<em>States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.StateImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getState()
   * @generated
   */
  int STATE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EVENT = 1;

  /**
   * The feature id for the '<em><b>Guards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__GUARDS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.GuardImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 21;

  /**
   * The feature id for the '<em><b>Casem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__CASEM = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__OPERAT�ON = 1;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.EventImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 22;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.GetEventImpl <em>Get Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.GetEventImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getGetEvent()
   * @generated
   */
  int GET_EVENT = 23;

  /**
   * The feature id for the '<em><b>Who</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_EVENT__WHO = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_EVENT__MESSAGE = EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Get Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.SendsEventImpl <em>Sends Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.SendsEventImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getSendsEvent()
   * @generated
   */
  int SENDS_EVENT = 24;

  /**
   * The feature id for the '<em><b>Who</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDS_EVENT__WHO = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDS_EVENT__MESSAGE = EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sends Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDS_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.IsSendEventImpl <em>Is Send Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.IsSendEventImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getIsSendEvent()
   * @generated
   */
  int IS_SEND_EVENT = 25;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_SEND_EVENT__MESSAGE = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Is Send Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_SEND_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.InitImpl <em>Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.InitImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getInit()
   * @generated
   */
  int IN�T = 26;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN�T__KEYWORD = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN�T_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.CaseImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getCase()
   * @generated
   */
  int CASE = 27;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__KEYWORD = 0;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.AlwaysImpl <em>Always</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.AlwaysImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getAlways()
   * @generated
   */
  int ALWAYS = 28;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS__KEYWORD = CASE__KEYWORD;

  /**
   * The number of structural features of the '<em>Always</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_FEATURE_COUNT = CASE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.OtherwiseImpl <em>Otherwise</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.OtherwiseImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getOtherwise()
   * @generated
   */
  int OTHERW�SE = 29;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERW�SE__KEYWORD = CASE__KEYWORD;

  /**
   * The number of structural features of the '<em>Otherwise</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERW�SE_FEATURE_COUNT = CASE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.ToImpl <em>To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.ToImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTo()
   * @generated
   */
  int TO = 30;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__KEYWORD = CASE__KEYWORD;

  /**
   * The feature id for the '<em><b>Event Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__EVENT_SOURCE = CASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.FromImpl <em>From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.FromImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getFrom()
   * @generated
   */
  int FROM = 31;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__KEYWORD = CASE__KEYWORD;

  /**
   * The feature id for the '<em><b>Event Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__EVENT_SOURCE = CASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.senior.project.protocol.impl.TestImpl <em>Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.senior.project.protocol.impl.TestImpl
   * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTest()
   * @generated
   */
  int TEST = 32;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__OPERAT�ONS = 0;

  /**
   * The number of structural features of the '<em>Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.PDLFile <em>PDL File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PDL File</em>'.
   * @see org.xtext.senior.project.protocol.PDLFile
   * @generated
   */
  EClass getPDLFile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.PDLFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.senior.project.protocol.PDLFile#getName()
   * @see #getPDLFile()
   * @generated
   */
  EAttribute getPDLFile_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.PDLFile#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.xtext.senior.project.protocol.PDLFile#getDefinition()
   * @see #getPDLFile()
   * @generated
   */
  EReference getPDLFile_Definition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.PDLFile#getTransaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transaction</em>'.
   * @see org.xtext.senior.project.protocol.PDLFile#getTransaction()
   * @see #getPDLFile()
   * @generated
   */
  EReference getPDLFile_Transaction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.PDLFile#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.xtext.senior.project.protocol.PDLFile#getState()
   * @see #getPDLFile()
   * @generated
   */
  EReference getPDLFile_State();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.PDLFile#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see org.xtext.senior.project.protocol.PDLFile#getTest()
   * @see #getPDLFile()
   * @generated
   */
  EReference getPDLFile_Test();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definitions</em>'.
   * @see org.xtext.senior.project.protocol.Definitions
   * @generated
   */
  EClass getDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.senior.project.protocol.Definitions#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see org.xtext.senior.project.protocol.Definitions#getSources()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_Sources();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.Definitions#getCipher <em>Cipher</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cipher</em>'.
   * @see org.xtext.senior.project.protocol.Definitions#getCipher()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_Cipher();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.Definitions#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.Definitions#getMessage()
   * @see #getDefinitions()
   * @generated
   */
  EReference getDefinitions_Message();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see org.xtext.senior.project.protocol.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Define#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.senior.project.protocol.Define#getName()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Define#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.xtext.senior.project.protocol.Define#getKeyword()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Keyword();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.EventSource <em>Event Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Source</em>'.
   * @see org.xtext.senior.project.protocol.EventSource
   * @generated
   */
  EClass getEventSource();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Arbitrator <em>Arbitrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arbitrator</em>'.
   * @see org.xtext.senior.project.protocol.Arbitrator
   * @generated
   */
  EClass getArbitrator();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant</em>'.
   * @see org.xtext.senior.project.protocol.Participant
   * @generated
   */
  EClass getParticipant();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Cipher <em>Cipher</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cipher</em>'.
   * @see org.xtext.senior.project.protocol.Cipher
   * @generated
   */
  EClass getCipher();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Transactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transactions</em>'.
   * @see org.xtext.senior.project.protocol.Transactions
   * @generated
   */
  EClass getTransactions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.senior.project.protocol.Transactions#getTransactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transactions</em>'.
   * @see org.xtext.senior.project.protocol.Transactions#getTransactions()
   * @see #getTransactions()
   * @generated
   */
  EReference getTransactions_Transactions();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction</em>'.
   * @see org.xtext.senior.project.protocol.Transaction
   * @generated
   */
  EClass getTransaction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Transaction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.senior.project.protocol.Transaction#getName()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.senior.project.protocol.Transaction#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.xtext.senior.project.protocol.Transaction#getArguments()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Arguments();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.senior.project.protocol.Transaction#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.xtext.senior.project.protocol.Transaction#getOperations()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Operations();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.xtext.senior.project.protocol.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Argument#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.xtext.senior.project.protocol.Argument#getKeyword()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.senior.project.protocol.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.xtext.senior.project.protocol.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Decrypt <em>Decrypt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decrypt</em>'.
   * @see org.xtext.senior.project.protocol.Decrypt
   * @generated
   */
  EClass getDecrypt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Decrypt#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.Decrypt#getMessage()
   * @see #getDecrypt()
   * @generated
   */
  EAttribute getDecrypt_Message();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Decrypt#getParticipant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Participant</em>'.
   * @see org.xtext.senior.project.protocol.Decrypt#getParticipant()
   * @see #getDecrypt()
   * @generated
   */
  EReference getDecrypt_Participant();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Encrypt <em>Encrypt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Encrypt</em>'.
   * @see org.xtext.senior.project.protocol.Encrypt
   * @generated
   */
  EClass getEncrypt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Encrypt#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.Encrypt#getMessage()
   * @see #getEncrypt()
   * @generated
   */
  EAttribute getEncrypt_Message();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Encrypt#getParticipant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Participant</em>'.
   * @see org.xtext.senior.project.protocol.Encrypt#getParticipant()
   * @see #getEncrypt()
   * @generated
   */
  EReference getEncrypt_Participant();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Send <em>Send</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Send</em>'.
   * @see org.xtext.senior.project.protocol.Send
   * @generated
   */
  EClass getSend();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Send#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.Send#getMessage()
   * @see #getSend()
   * @generated
   */
  EAttribute getSend_Message();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Send#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.xtext.senior.project.protocol.Send#getSource()
   * @see #getSend()
   * @generated
   */
  EReference getSend_Source();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Send#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see org.xtext.senior.project.protocol.Send#getDestination()
   * @see #getSend()
   * @generated
   */
  EReference getSend_Destination();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print</em>'.
   * @see org.xtext.senior.project.protocol.Print
   * @generated
   */
  EClass getPrint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Print#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.Print#getMessage()
   * @see #getPrint()
   * @generated
   */
  EAttribute getPrint_Message();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.xtext.senior.project.protocol.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Call#getTransactionName <em>Transaction Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transaction Name</em>'.
   * @see org.xtext.senior.project.protocol.Call#getTransactionName()
   * @see #getCall()
   * @generated
   */
  EReference getCall_TransactionName();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.senior.project.protocol.Call#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Args</em>'.
   * @see org.xtext.senior.project.protocol.Call#getArgs()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Exchange <em>Exchange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exchange</em>'.
   * @see org.xtext.senior.project.protocol.Exchange
   * @generated
   */
  EClass getExchange();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Exchange#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.xtext.senior.project.protocol.Exchange#getSource()
   * @see #getExchange()
   * @generated
   */
  EReference getExchange_Source();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Exchange#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see org.xtext.senior.project.protocol.Exchange#getDestination()
   * @see #getExchange()
   * @generated
   */
  EReference getExchange_Destination();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Redirect <em>Redirect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Redirect</em>'.
   * @see org.xtext.senior.project.protocol.Redirect
   * @generated
   */
  EClass getRedirect();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Redirect#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.Redirect#getMessage()
   * @see #getRedirect()
   * @generated
   */
  EAttribute getRedirect_Message();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.Redirect#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see org.xtext.senior.project.protocol.Redirect#getDestination()
   * @see #getRedirect()
   * @generated
   */
  EReference getRedirect_Destination();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States</em>'.
   * @see org.xtext.senior.project.protocol.States
   * @generated
   */
  EClass getStates();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.senior.project.protocol.States#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.senior.project.protocol.States#getStates()
   * @see #getStates()
   * @generated
   */
  EReference getStates_States();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.senior.project.protocol.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.senior.project.protocol.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.State#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.xtext.senior.project.protocol.State#getEvent()
   * @see #getState()
   * @generated
   */
  EReference getState_Event();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.senior.project.protocol.State#getGuards <em>Guards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guards</em>'.
   * @see org.xtext.senior.project.protocol.State#getGuards()
   * @see #getState()
   * @generated
   */
  EReference getState_Guards();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.xtext.senior.project.protocol.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.Guard#getCasem <em>Casem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Casem</em>'.
   * @see org.xtext.senior.project.protocol.Guard#getCasem()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Casem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.senior.project.protocol.Guard#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see org.xtext.senior.project.protocol.Guard#getOperation()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Operation();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.senior.project.protocol.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.GetEvent <em>Get Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Event</em>'.
   * @see org.xtext.senior.project.protocol.GetEvent
   * @generated
   */
  EClass getGetEvent();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.GetEvent#getWho <em>Who</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Who</em>'.
   * @see org.xtext.senior.project.protocol.GetEvent#getWho()
   * @see #getGetEvent()
   * @generated
   */
  EReference getGetEvent_Who();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.GetEvent#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.GetEvent#getMessage()
   * @see #getGetEvent()
   * @generated
   */
  EReference getGetEvent_Message();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.SendsEvent <em>Sends Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sends Event</em>'.
   * @see org.xtext.senior.project.protocol.SendsEvent
   * @generated
   */
  EClass getSendsEvent();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.SendsEvent#getWho <em>Who</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Who</em>'.
   * @see org.xtext.senior.project.protocol.SendsEvent#getWho()
   * @see #getSendsEvent()
   * @generated
   */
  EReference getSendsEvent_Who();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.SendsEvent#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.SendsEvent#getMessage()
   * @see #getSendsEvent()
   * @generated
   */
  EReference getSendsEvent_Message();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.IsSendEvent <em>Is Send Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Send Event</em>'.
   * @see org.xtext.senior.project.protocol.IsSendEvent
   * @generated
   */
  EClass getIsSendEvent();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.IsSendEvent#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.xtext.senior.project.protocol.IsSendEvent#getMessage()
   * @see #getIsSendEvent()
   * @generated
   */
  EReference getIsSendEvent_Message();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Init <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init</em>'.
   * @see org.xtext.senior.project.protocol.Init
   * @generated
   */
  EClass getInit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Init#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.xtext.senior.project.protocol.Init#getKeyword()
   * @see #getInit()
   * @generated
   */
  EAttribute getInit_Keyword();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see org.xtext.senior.project.protocol.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.senior.project.protocol.Case#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.xtext.senior.project.protocol.Case#getKeyword()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_Keyword();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Always <em>Always</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Always</em>'.
   * @see org.xtext.senior.project.protocol.Always
   * @generated
   */
  EClass getAlways();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Otherwise <em>Otherwise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Otherwise</em>'.
   * @see org.xtext.senior.project.protocol.Otherwise
   * @generated
   */
  EClass getOtherwise();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.To <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To</em>'.
   * @see org.xtext.senior.project.protocol.To
   * @generated
   */
  EClass getTo();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.To#getEventSource <em>Event Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Source</em>'.
   * @see org.xtext.senior.project.protocol.To#getEventSource()
   * @see #getTo()
   * @generated
   */
  EReference getTo_EventSource();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.From <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From</em>'.
   * @see org.xtext.senior.project.protocol.From
   * @generated
   */
  EClass getFrom();

  /**
   * Returns the meta object for the reference '{@link org.xtext.senior.project.protocol.From#getEventSource <em>Event Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Source</em>'.
   * @see org.xtext.senior.project.protocol.From#getEventSource()
   * @see #getFrom()
   * @generated
   */
  EReference getFrom_EventSource();

  /**
   * Returns the meta object for class '{@link org.xtext.senior.project.protocol.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test</em>'.
   * @see org.xtext.senior.project.protocol.Test
   * @generated
   */
  EClass getTest();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.senior.project.protocol.Test#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.xtext.senior.project.protocol.Test#getOperations()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Operations();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProtocolFactory getProtocolFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.PDLFileImpl <em>PDL File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.PDLFileImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getPDLFile()
     * @generated
     */
    EClass PDL_F�LE = eINSTANCE.getPDLFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PDL_F�LE__NAME = eINSTANCE.getPDLFile_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDL_F�LE__DEF�N�T�ON = eINSTANCE.getPDLFile_Definition();

    /**
     * The meta object literal for the '<em><b>Transaction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDL_F�LE__TRANSACT�ON = eINSTANCE.getPDLFile_Transaction();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDL_F�LE__STATE = eINSTANCE.getPDLFile_State();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PDL_F�LE__TEST = eINSTANCE.getPDLFile_Test();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.DefinitionsImpl <em>Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.DefinitionsImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getDefinitions()
     * @generated
     */
    EClass DEF�N�T�ONS = eINSTANCE.getDefinitions();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF�N�T�ONS__SOURCES = eINSTANCE.getDefinitions_Sources();

    /**
     * The meta object literal for the '<em><b>Cipher</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF�N�T�ONS__C�PHER = eINSTANCE.getDefinitions_Cipher();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF�N�T�ONS__MESSAGE = eINSTANCE.getDefinitions_Message();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.DefineImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getDefine()
     * @generated
     */
    EClass DEF�NE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF�NE__NAME = eINSTANCE.getDefine_Name();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF�NE__KEYWORD = eINSTANCE.getDefine_Keyword();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.EventSourceImpl <em>Event Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.EventSourceImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getEventSource()
     * @generated
     */
    EClass EVENT_SOURCE = eINSTANCE.getEventSource();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.ArbitratorImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getArbitrator()
     * @generated
     */
    EClass ARB�TRATOR = eINSTANCE.getArbitrator();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.ParticipantImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getParticipant()
     * @generated
     */
    EClass PART�C�PANT = eINSTANCE.getParticipant();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.CipherImpl <em>Cipher</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.CipherImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getCipher()
     * @generated
     */
    EClass C�PHER = eINSTANCE.getCipher();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.MessageImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.TransactionsImpl <em>Transactions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.TransactionsImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTransactions()
     * @generated
     */
    EClass TRANSACT�ONS = eINSTANCE.getTransactions();

    /**
     * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACT�ONS__TRANSACT�ONS = eINSTANCE.getTransactions_Transactions();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.TransactionImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTransaction()
     * @generated
     */
    EClass TRANSACT�ON = eINSTANCE.getTransaction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACT�ON__NAME = eINSTANCE.getTransaction_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACT�ON__ARGUMENTS = eINSTANCE.getTransaction_Arguments();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACT�ON__OPERAT�ONS = eINSTANCE.getTransaction_Operations();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.ArgumentImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__KEYWORD = eINSTANCE.getArgument_Keyword();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.OperationImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getOperation()
     * @generated
     */
    EClass OPERAT�ON = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.DecryptImpl <em>Decrypt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.DecryptImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getDecrypt()
     * @generated
     */
    EClass DECRYPT = eINSTANCE.getDecrypt();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECRYPT__MESSAGE = eINSTANCE.getDecrypt_Message();

    /**
     * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECRYPT__PART�C�PANT = eINSTANCE.getDecrypt_Participant();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.EncryptImpl <em>Encrypt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.EncryptImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getEncrypt()
     * @generated
     */
    EClass ENCRYPT = eINSTANCE.getEncrypt();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENCRYPT__MESSAGE = eINSTANCE.getEncrypt_Message();

    /**
     * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENCRYPT__PART�C�PANT = eINSTANCE.getEncrypt_Participant();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.SendImpl <em>Send</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.SendImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getSend()
     * @generated
     */
    EClass SEND = eINSTANCE.getSend();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEND__MESSAGE = eINSTANCE.getSend_Message();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND__SOURCE = eINSTANCE.getSend_Source();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND__DEST�NAT�ON = eINSTANCE.getSend_Destination();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.PrintImpl <em>Print</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.PrintImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getPrint()
     * @generated
     */
    EClass PR�NT = eINSTANCE.getPrint();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PR�NT__MESSAGE = eINSTANCE.getPrint_Message();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.CallImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Transaction Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__TRANSACT�ON_NAME = eINSTANCE.getCall_TransactionName();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__ARGS = eINSTANCE.getCall_Args();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.ExchangeImpl <em>Exchange</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.ExchangeImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getExchange()
     * @generated
     */
    EClass EXCHANGE = eINSTANCE.getExchange();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCHANGE__SOURCE = eINSTANCE.getExchange_Source();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCHANGE__DEST�NAT�ON = eINSTANCE.getExchange_Destination();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.RedirectImpl <em>Redirect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.RedirectImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getRedirect()
     * @generated
     */
    EClass RED�RECT = eINSTANCE.getRedirect();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RED�RECT__MESSAGE = eINSTANCE.getRedirect_Message();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RED�RECT__DEST�NAT�ON = eINSTANCE.getRedirect_Destination();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.StatesImpl <em>States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.StatesImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getStates()
     * @generated
     */
    EClass STATES = eINSTANCE.getStates();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__STATES = eINSTANCE.getStates_States();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.StateImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__EVENT = eINSTANCE.getState_Event();

    /**
     * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__GUARDS = eINSTANCE.getState_Guards();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.GuardImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Casem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__CASEM = eINSTANCE.getGuard_Casem();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__OPERAT�ON = eINSTANCE.getGuard_Operation();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.EventImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.GetEventImpl <em>Get Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.GetEventImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getGetEvent()
     * @generated
     */
    EClass GET_EVENT = eINSTANCE.getGetEvent();

    /**
     * The meta object literal for the '<em><b>Who</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_EVENT__WHO = eINSTANCE.getGetEvent_Who();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_EVENT__MESSAGE = eINSTANCE.getGetEvent_Message();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.SendsEventImpl <em>Sends Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.SendsEventImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getSendsEvent()
     * @generated
     */
    EClass SENDS_EVENT = eINSTANCE.getSendsEvent();

    /**
     * The meta object literal for the '<em><b>Who</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENDS_EVENT__WHO = eINSTANCE.getSendsEvent_Who();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENDS_EVENT__MESSAGE = eINSTANCE.getSendsEvent_Message();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.IsSendEventImpl <em>Is Send Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.IsSendEventImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getIsSendEvent()
     * @generated
     */
    EClass IS_SEND_EVENT = eINSTANCE.getIsSendEvent();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_SEND_EVENT__MESSAGE = eINSTANCE.getIsSendEvent_Message();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.InitImpl <em>Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.InitImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getInit()
     * @generated
     */
    EClass IN�T = eINSTANCE.getInit();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN�T__KEYWORD = eINSTANCE.getInit_Keyword();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.CaseImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__KEYWORD = eINSTANCE.getCase_Keyword();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.AlwaysImpl <em>Always</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.AlwaysImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getAlways()
     * @generated
     */
    EClass ALWAYS = eINSTANCE.getAlways();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.OtherwiseImpl <em>Otherwise</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.OtherwiseImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getOtherwise()
     * @generated
     */
    EClass OTHERW�SE = eINSTANCE.getOtherwise();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.ToImpl <em>To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.ToImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTo()
     * @generated
     */
    EClass TO = eINSTANCE.getTo();

    /**
     * The meta object literal for the '<em><b>Event Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TO__EVENT_SOURCE = eINSTANCE.getTo_EventSource();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.FromImpl <em>From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.FromImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getFrom()
     * @generated
     */
    EClass FROM = eINSTANCE.getFrom();

    /**
     * The meta object literal for the '<em><b>Event Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM__EVENT_SOURCE = eINSTANCE.getFrom_EventSource();

    /**
     * The meta object literal for the '{@link org.xtext.senior.project.protocol.impl.TestImpl <em>Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.senior.project.protocol.impl.TestImpl
     * @see org.xtext.senior.project.protocol.impl.ProtocolPackageImpl#getTest()
     * @generated
     */
    EClass TEST = eINSTANCE.getTest();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__OPERAT�ONS = eINSTANCE.getTest_Operations();

  }

} //ProtocolPackage
