/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.senior.project.protocol.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.senior.project.protocol.Argument;
import org.xtext.senior.project.protocol.Call;
import org.xtext.senior.project.protocol.Case;
import org.xtext.senior.project.protocol.Decrypt;
import org.xtext.senior.project.protocol.Define;
import org.xtext.senior.project.protocol.Definitions;
import org.xtext.senior.project.protocol.Encrypt;
import org.xtext.senior.project.protocol.Event;
import org.xtext.senior.project.protocol.From;
import org.xtext.senior.project.protocol.GetEvent;
import org.xtext.senior.project.protocol.Guard;
import org.xtext.senior.project.protocol.IsSendEvent;
import org.xtext.senior.project.protocol.Operation;
import org.xtext.senior.project.protocol.PDLFile;
import org.xtext.senior.project.protocol.Print;
import org.xtext.senior.project.protocol.ProtocolFactory;
import org.xtext.senior.project.protocol.ProtocolPackage;
import org.xtext.senior.project.protocol.Send;
import org.xtext.senior.project.protocol.Source;
import org.xtext.senior.project.protocol.State;
import org.xtext.senior.project.protocol.States;
import org.xtext.senior.project.protocol.Transaction;
import org.xtext.senior.project.protocol.Transactions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolPackageImpl extends EPackageImpl implements ProtocolPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdlFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decryptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass encryptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass printEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ýsSendEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.senior.project.protocol.ProtocolPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProtocolPackageImpl()
  {
    super(eNS_URI, ProtocolFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProtocolPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProtocolPackage init()
  {
    if (isInited) return (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);

    // Obtain or create and register package
    ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProtocolPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theProtocolPackage.createPackageContents();

    // Initialize created meta-data
    theProtocolPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProtocolPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProtocolPackage.eNS_URI, theProtocolPackage);
    return theProtocolPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDLFile()
  {
    return pdlFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPDLFile_Name()
  {
    return (EAttribute)pdlFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDLFile_Definition()
  {
    return (EReference)pdlFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDLFile_Transaction()
  {
    return (EReference)pdlFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPDLFile_State()
  {
    return (EReference)pdlFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitions()
  {
    return definitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinitions_Definitions()
  {
    return (EReference)definitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefine()
  {
    return defineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefine_Name()
  {
    return (EAttribute)defineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefine_Keyword()
  {
    return (EAttribute)defineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransactions()
  {
    return transactionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactions_Transactions()
  {
    return (EReference)transactionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransaction()
  {
    return transactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Name()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransaction_Arguments()
  {
    return (EReference)transactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransaction_Operations()
  {
    return (EReference)transactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Keyword()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Name()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecrypt()
  {
    return decryptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecrypt_Message()
  {
    return (EAttribute)decryptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecrypt_Participant()
  {
    return (EAttribute)decryptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEncrypt()
  {
    return encryptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEncrypt_Message()
  {
    return (EAttribute)encryptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEncrypt_Participant()
  {
    return (EAttribute)encryptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSend()
  {
    return sendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSend_Message()
  {
    return (EAttribute)sendEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSend_Source()
  {
    return (EAttribute)sendEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSend_Destination()
  {
    return (EAttribute)sendEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrint()
  {
    return printEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrint_Message()
  {
    return (EAttribute)printEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCall()
  {
    return callEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCall_TransactionName()
  {
    return (EAttribute)callEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStates()
  {
    return statesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStates_States()
  {
    return (EReference)statesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Event()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Guards()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuard()
  {
    return guardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_Casem()
  {
    return (EReference)guardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_Operation()
  {
    return (EReference)guardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Keyword()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetEvent()
  {
    return getEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetEvent_Who()
  {
    return (EAttribute)getEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsSendEvent()
  {
    return ýsSendEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCase_DefineName()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSource()
  {
    return sourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrom()
  {
    return fromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolFactory getProtocolFactory()
  {
    return (ProtocolFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pdlFileEClass = createEClass(PDL_FÝLE);
    createEAttribute(pdlFileEClass, PDL_FÝLE__NAME);
    createEReference(pdlFileEClass, PDL_FÝLE__DEFÝNÝTÝON);
    createEReference(pdlFileEClass, PDL_FÝLE__TRANSACTÝON);
    createEReference(pdlFileEClass, PDL_FÝLE__STATE);

    definitionsEClass = createEClass(DEFÝNÝTÝONS);
    createEReference(definitionsEClass, DEFÝNÝTÝONS__DEFÝNÝTÝONS);

    defineEClass = createEClass(DEFÝNE);
    createEAttribute(defineEClass, DEFÝNE__NAME);
    createEAttribute(defineEClass, DEFÝNE__KEYWORD);

    transactionsEClass = createEClass(TRANSACTÝONS);
    createEReference(transactionsEClass, TRANSACTÝONS__TRANSACTÝONS);

    transactionEClass = createEClass(TRANSACTÝON);
    createEAttribute(transactionEClass, TRANSACTÝON__NAME);
    createEReference(transactionEClass, TRANSACTÝON__ARGUMENTS);
    createEReference(transactionEClass, TRANSACTÝON__OPERATÝONS);

    argumentEClass = createEClass(ARGUMENT);
    createEAttribute(argumentEClass, ARGUMENT__KEYWORD);
    createEAttribute(argumentEClass, ARGUMENT__NAME);

    operationEClass = createEClass(OPERATÝON);

    decryptEClass = createEClass(DECRYPT);
    createEAttribute(decryptEClass, DECRYPT__MESSAGE);
    createEAttribute(decryptEClass, DECRYPT__PARTÝCÝPANT);

    encryptEClass = createEClass(ENCRYPT);
    createEAttribute(encryptEClass, ENCRYPT__MESSAGE);
    createEAttribute(encryptEClass, ENCRYPT__PARTÝCÝPANT);

    sendEClass = createEClass(SEND);
    createEAttribute(sendEClass, SEND__MESSAGE);
    createEAttribute(sendEClass, SEND__SOURCE);
    createEAttribute(sendEClass, SEND__DESTÝNATÝON);

    printEClass = createEClass(PRÝNT);
    createEAttribute(printEClass, PRÝNT__MESSAGE);

    callEClass = createEClass(CALL);
    createEAttribute(callEClass, CALL__TRANSACTÝON_NAME);

    statesEClass = createEClass(STATES);
    createEReference(statesEClass, STATES__STATES);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);
    createEReference(stateEClass, STATE__EVENT);
    createEReference(stateEClass, STATE__GUARDS);

    guardEClass = createEClass(GUARD);
    createEReference(guardEClass, GUARD__CASEM);
    createEReference(guardEClass, GUARD__OPERATÝON);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__KEYWORD);

    getEventEClass = createEClass(GET_EVENT);
    createEAttribute(getEventEClass, GET_EVENT__WHO);

    ýsSendEventEClass = createEClass(IS_SEND_EVENT);

    caseEClass = createEClass(CASE);
    createEAttribute(caseEClass, CASE__DEFÝNE_NAME);

    sourceEClass = createEClass(SOURCE);

    fromEClass = createEClass(FROM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    decryptEClass.getESuperTypes().add(this.getOperation());
    encryptEClass.getESuperTypes().add(this.getOperation());
    sendEClass.getESuperTypes().add(this.getOperation());
    printEClass.getESuperTypes().add(this.getOperation());
    callEClass.getESuperTypes().add(this.getOperation());
    getEventEClass.getESuperTypes().add(this.getEvent());
    ýsSendEventEClass.getESuperTypes().add(this.getEvent());
    sourceEClass.getESuperTypes().add(this.getCase());
    fromEClass.getESuperTypes().add(this.getCase());

    // Initialize classes and features; add operations and parameters
    initEClass(pdlFileEClass, PDLFile.class, "PDLFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPDLFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, PDLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPDLFile_Definition(), this.getDefinitions(), null, "definition", null, 0, 1, PDLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPDLFile_Transaction(), this.getTransactions(), null, "transaction", null, 0, 1, PDLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPDLFile_State(), this.getStates(), null, "state", null, 0, 1, PDLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionsEClass, Definitions.class, "Definitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitions_Definitions(), this.getDefine(), null, "definitions", null, 0, -1, Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defineEClass, Define.class, "Define", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefine_Name(), ecorePackage.getEString(), "name", null, 0, 1, Define.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefine_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, Define.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionsEClass, Transactions.class, "Transactions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransactions_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, Transactions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransaction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransaction_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransaction_Operations(), this.getOperation(), null, "operations", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArgument_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(decryptEClass, Decrypt.class, "Decrypt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecrypt_Message(), ecorePackage.getEString(), "message", null, 0, 1, Decrypt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecrypt_Participant(), ecorePackage.getEString(), "participant", null, 0, 1, Decrypt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(encryptEClass, Encrypt.class, "Encrypt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEncrypt_Message(), ecorePackage.getEString(), "message", null, 0, 1, Encrypt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEncrypt_Participant(), ecorePackage.getEString(), "participant", null, 0, 1, Encrypt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sendEClass, Send.class, "Send", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSend_Message(), ecorePackage.getEString(), "message", null, 0, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSend_Source(), ecorePackage.getEString(), "source", null, 0, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSend_Destination(), ecorePackage.getEString(), "destination", null, 0, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrint_Message(), ecorePackage.getEString(), "message", null, 0, 1, Print.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCall_TransactionName(), ecorePackage.getEString(), "transactionName", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statesEClass, States.class, "States", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStates_States(), this.getState(), null, "states", null, 0, -1, States.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Event(), this.getEvent(), null, "event", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Guards(), this.getGuard(), null, "guards", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGuard_Casem(), this.getCase(), null, "casem", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGuard_Operation(), this.getOperation(), null, "operation", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getEventEClass, GetEvent.class, "GetEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetEvent_Who(), ecorePackage.getEString(), "who", null, 0, 1, GetEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ýsSendEventEClass, IsSendEvent.class, "IsSendEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCase_DefineName(), ecorePackage.getEString(), "defineName", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fromEClass, From.class, "From", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //ProtocolPackageImpl
