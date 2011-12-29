package org.xtext.senior.project.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.senior.project.services.ProtocolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProtocolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'[END]'", "'[DEFINITIONS]'", "'='", "'Arbitrator'", "'Participant'", "'AsynchronousCipher'", "'SynchronousCipher'", "'Message'", "'[TRANSACTIONS]'", "'TRANSACTION'", "'('", "')'", "'[BEGIN]'", "'decrypt'", "'for'", "'encrypt'", "'::'", "'->'", "'print'", "'CALL'", "'exchange'", "'redirect'", "'[STATES]'", "'STATE'", "'|'", "'=>'", "'GET'", "'SENDS'", "'IS_SEND'", "'INIT'", "'always'", "'otherwise'", "'to'", "'from'", "'[TEST]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalProtocolParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g"; }



     	private ProtocolGrammarAccess grammarAccess;
     	
        public InternalProtocolParser(TokenStream input, IAstFactory factory, ProtocolGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/senior/project/parser/antlr/internal/InternalProtocol.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PDLFile";	
       	}
       	
       	@Override
       	protected ProtocolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRulePDLFile
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:77:1: entryRulePDLFile returns [EObject current=null] : iv_rulePDLFile= rulePDLFile EOF ;
    public final EObject entryRulePDLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDLFile = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:78:2: (iv_rulePDLFile= rulePDLFile EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:79:2: iv_rulePDLFile= rulePDLFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPDLFileRule(), currentNode); 
            pushFollow(FOLLOW_rulePDLFile_in_entryRulePDLFile75);
            iv_rulePDLFile=rulePDLFile();
            _fsp--;

             current =iv_rulePDLFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePDLFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePDLFile


    // $ANTLR start rulePDLFile
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:86:1: rulePDLFile returns [EObject current=null] : ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) ( (lv_test_6_0= ruleTest ) ) '[END]' ) ;
    public final EObject rulePDLFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_definition_3_0 = null;

        EObject lv_transaction_4_0 = null;

        EObject lv_state_5_0 = null;

        EObject lv_test_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:91:6: ( ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) ( (lv_test_6_0= ruleTest ) ) '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:92:1: ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) ( (lv_test_6_0= ruleTest ) ) '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:92:1: ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) ( (lv_test_6_0= ruleTest ) ) '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:92:3: '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) ( (lv_test_6_0= ruleTest ) ) '[END]'
            {
            match(input,11,FOLLOW_11_in_rulePDLFile120); 

                    createLeafNode(grammarAccess.getPDLFileAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:96:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:97:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:97:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:98:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePDLFile137); 

            			createLeafNode(grammarAccess.getPDLFileAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPDLFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_rulePDLFile152); 

                    createLeafNode(grammarAccess.getPDLFileAccess().getRGhtSquareBracketKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:124:1: ( (lv_definition_3_0= ruleDefinitions ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:125:1: (lv_definition_3_0= ruleDefinitions )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:125:1: (lv_definition_3_0= ruleDefinitions )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:126:3: lv_definition_3_0= ruleDefinitions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPDLFileAccess().getDefinitionDefinitionsParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDefinitions_in_rulePDLFile173);
            lv_definition_3_0=ruleDefinitions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPDLFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"definition",
            	        		lv_definition_3_0, 
            	        		"Definitions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:148:2: ( (lv_transaction_4_0= ruleTransactions ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:149:1: (lv_transaction_4_0= ruleTransactions )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:149:1: (lv_transaction_4_0= ruleTransactions )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:150:3: lv_transaction_4_0= ruleTransactions
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPDLFileAccess().getTransactionTransactionsParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTransactions_in_rulePDLFile194);
            lv_transaction_4_0=ruleTransactions();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPDLFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"transaction",
            	        		lv_transaction_4_0, 
            	        		"Transactions", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:172:2: ( (lv_state_5_0= ruleStates ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:173:1: (lv_state_5_0= ruleStates )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:173:1: (lv_state_5_0= ruleStates )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:174:3: lv_state_5_0= ruleStates
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPDLFileAccess().getStateStatesParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStates_in_rulePDLFile215);
            lv_state_5_0=ruleStates();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPDLFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"state",
            	        		lv_state_5_0, 
            	        		"States", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:196:2: ( (lv_test_6_0= ruleTest ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:197:1: (lv_test_6_0= ruleTest )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:197:1: (lv_test_6_0= ruleTest )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:198:3: lv_test_6_0= ruleTest
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPDLFileAccess().getTestTestParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTest_in_rulePDLFile236);
            lv_test_6_0=ruleTest();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPDLFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"test",
            	        		lv_test_6_0, 
            	        		"Test", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_rulePDLFile246); 

                    createLeafNode(grammarAccess.getPDLFileAccess().getENDKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePDLFile


    // $ANTLR start entryRuleDefinitions
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:232:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:233:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:234:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions282);
            iv_ruleDefinitions=ruleDefinitions();
            _fsp--;

             current =iv_ruleDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDefinitions


    // $ANTLR start ruleDefinitions
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:241:1: ruleDefinitions returns [EObject current=null] : ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) ( (lv_message_3_0= ruleMessage ) ) '[END]' ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_sources_1_0 = null;

        EObject lv_cipher_2_0 = null;

        EObject lv_message_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:246:6: ( ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) ( (lv_message_3_0= ruleMessage ) ) '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:247:1: ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) ( (lv_message_3_0= ruleMessage ) ) '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:247:1: ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) ( (lv_message_3_0= ruleMessage ) ) '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:247:3: '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) ( (lv_message_3_0= ruleMessage ) ) '[END]'
            {
            match(input,14,FOLLOW_14_in_ruleDefinitions327); 

                    createLeafNode(grammarAccess.getDefinitionsAccess().getDEFINITIONSKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:251:1: ( (lv_sources_1_0= ruleEventSource ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==15) ) {
                        int LA1_2 = input.LA(3);

                        if ( ((LA1_2>=16 && LA1_2<=17)) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:252:1: (lv_sources_1_0= ruleEventSource )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:252:1: (lv_sources_1_0= ruleEventSource )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:253:3: lv_sources_1_0= ruleEventSource
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getSourcesEventSourceParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventSource_in_ruleDefinitions348);
            	    lv_sources_1_0=ruleEventSource();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sources",
            	    	        		lv_sources_1_0, 
            	    	        		"EventSource", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:275:3: ( (lv_cipher_2_0= ruleCipher ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:276:1: (lv_cipher_2_0= ruleCipher )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:276:1: (lv_cipher_2_0= ruleCipher )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:277:3: lv_cipher_2_0= ruleCipher
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getCipherCipherParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCipher_in_ruleDefinitions370);
            lv_cipher_2_0=ruleCipher();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"cipher",
            	        		lv_cipher_2_0, 
            	        		"Cipher", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:299:2: ( (lv_message_3_0= ruleMessage ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:300:1: (lv_message_3_0= ruleMessage )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:300:1: (lv_message_3_0= ruleMessage )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:301:3: lv_message_3_0= ruleMessage
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getMessageMessageParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMessage_in_ruleDefinitions391);
            lv_message_3_0=ruleMessage();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefinitionsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_3_0, 
            	        		"Message", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleDefinitions401); 

                    createLeafNode(grammarAccess.getDefinitionsAccess().getENDKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDefinitions


    // $ANTLR start entryRuleEventSource
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:337:1: entryRuleEventSource returns [EObject current=null] : iv_ruleEventSource= ruleEventSource EOF ;
    public final EObject entryRuleEventSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSource = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:338:2: (iv_ruleEventSource= ruleEventSource EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:339:2: iv_ruleEventSource= ruleEventSource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventSourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventSource_in_entryRuleEventSource439);
            iv_ruleEventSource=ruleEventSource();
            _fsp--;

             current =iv_ruleEventSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSource449); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEventSource


    // $ANTLR start ruleEventSource
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:346:1: ruleEventSource returns [EObject current=null] : (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant ) ;
    public final EObject ruleEventSource() throws RecognitionException {
        EObject current = null;

        EObject this_Arbitrator_0 = null;

        EObject this_Participant_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:351:6: ( (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:352:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:352:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==16) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==17) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("352:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("352:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("352:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:353:5: this_Arbitrator_0= ruleArbitrator
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventSourceAccess().getArbitratorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArbitrator_in_ruleEventSource496);
                    this_Arbitrator_0=ruleArbitrator();
                    _fsp--;

                     
                            current = this_Arbitrator_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:363:5: this_Participant_1= ruleParticipant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventSourceAccess().getParticipantParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleParticipant_in_ruleEventSource523);
                    this_Participant_1=ruleParticipant();
                    _fsp--;

                     
                            current = this_Participant_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEventSource


    // $ANTLR start entryRuleArbitrator
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:379:1: entryRuleArbitrator returns [EObject current=null] : iv_ruleArbitrator= ruleArbitrator EOF ;
    public final EObject entryRuleArbitrator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArbitrator = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:380:2: (iv_ruleArbitrator= ruleArbitrator EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:381:2: iv_ruleArbitrator= ruleArbitrator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArbitratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleArbitrator_in_entryRuleArbitrator558);
            iv_ruleArbitrator=ruleArbitrator();
            _fsp--;

             current =iv_ruleArbitrator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitrator568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArbitrator


    // $ANTLR start ruleArbitrator
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:388:1: ruleArbitrator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) ) ;
    public final EObject ruleArbitrator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_keyword_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:393:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:394:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:394:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:394:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:394:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:395:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:395:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:396:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArbitrator610); 

            			createLeafNode(grammarAccess.getArbitratorAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArbitratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleArbitrator625); 

                    createLeafNode(grammarAccess.getArbitratorAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:422:1: ( (lv_keyword_2_0= 'Arbitrator' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:423:1: (lv_keyword_2_0= 'Arbitrator' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:423:1: (lv_keyword_2_0= 'Arbitrator' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:424:3: lv_keyword_2_0= 'Arbitrator'
            {
            lv_keyword_2_0=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleArbitrator643); 

                    createLeafNode(grammarAccess.getArbitratorAccess().getKeywordArbitratorKeyword_2_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArbitratorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_2_0, "Arbitrator", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArbitrator


    // $ANTLR start entryRuleParticipant
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:451:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:452:2: (iv_ruleParticipant= ruleParticipant EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:453:2: iv_ruleParticipant= ruleParticipant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParticipantRule(), currentNode); 
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant692);
            iv_ruleParticipant=ruleParticipant();
            _fsp--;

             current =iv_ruleParticipant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParticipant


    // $ANTLR start ruleParticipant
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:460:1: ruleParticipant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_keyword_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:465:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:466:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:466:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:466:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:466:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:467:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:467:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:468:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParticipant744); 

            			createLeafNode(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParticipantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleParticipant759); 

                    createLeafNode(grammarAccess.getParticipantAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:494:1: ( (lv_keyword_2_0= 'Participant' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:495:1: (lv_keyword_2_0= 'Participant' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:495:1: (lv_keyword_2_0= 'Participant' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:496:3: lv_keyword_2_0= 'Participant'
            {
            lv_keyword_2_0=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_ruleParticipant777); 

                    createLeafNode(grammarAccess.getParticipantAccess().getKeywordParticipantKeyword_2_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParticipantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_2_0, "Participant", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParticipant


    // $ANTLR start entryRuleCipher
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:523:1: entryRuleCipher returns [EObject current=null] : iv_ruleCipher= ruleCipher EOF ;
    public final EObject entryRuleCipher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCipher = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:524:2: (iv_ruleCipher= ruleCipher EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:525:2: iv_ruleCipher= ruleCipher EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCipherRule(), currentNode); 
            pushFollow(FOLLOW_ruleCipher_in_entryRuleCipher826);
            iv_ruleCipher=ruleCipher();
            _fsp--;

             current =iv_ruleCipher; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCipher836); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCipher


    // $ANTLR start ruleCipher
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:532:1: ruleCipher returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) ) ) ) ;
    public final EObject ruleCipher() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_keyword_2_1=null;
        Token lv_keyword_2_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:537:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:538:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:538:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:538:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:538:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:539:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:539:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:540:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCipher878); 

            			createLeafNode(grammarAccess.getCipherAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCipherRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleCipher893); 

                    createLeafNode(grammarAccess.getCipherAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:566:1: ( ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:567:1: ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:567:1: ( (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:568:1: (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:568:1: (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("568:1: (lv_keyword_2_1= 'AsynchronousCipher' | lv_keyword_2_2= 'SynchronousCipher' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:569:3: lv_keyword_2_1= 'AsynchronousCipher'
                    {
                    lv_keyword_2_1=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleCipher913); 

                            createLeafNode(grammarAccess.getCipherAccess().getKeywordAsynchronousCipherKeyword_2_0_0(), "keyword"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCipherRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "keyword", lv_keyword_2_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:587:8: lv_keyword_2_2= 'SynchronousCipher'
                    {
                    lv_keyword_2_2=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleCipher942); 

                            createLeafNode(grammarAccess.getCipherAccess().getKeywordSynchronousCipherKeyword_2_0_1(), "keyword"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCipherRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "keyword", lv_keyword_2_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCipher


    // $ANTLR start entryRuleMessage
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:616:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:617:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:618:2: iv_ruleMessage= ruleMessage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMessageRule(), currentNode); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage994);
            iv_ruleMessage=ruleMessage();
            _fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:625:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Message' ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_keyword_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:630:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Message' ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:631:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Message' ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:631:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Message' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:631:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Message' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:631:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:632:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:632:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:633:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1046); 

            			createLeafNode(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleMessage1061); 

                    createLeafNode(grammarAccess.getMessageAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:659:1: ( (lv_keyword_2_0= 'Message' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:660:1: (lv_keyword_2_0= 'Message' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:660:1: (lv_keyword_2_0= 'Message' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:661:3: lv_keyword_2_0= 'Message'
            {
            lv_keyword_2_0=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_ruleMessage1079); 

                    createLeafNode(grammarAccess.getMessageAccess().getKeywordMessageKeyword_2_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_2_0, "Message", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMessage


    // $ANTLR start entryRuleKeyword
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:688:1: entryRuleKeyword returns [String current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final String entryRuleKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyword = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:689:2: (iv_ruleKeyword= ruleKeyword EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:690:2: iv_ruleKeyword= ruleKeyword EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKeywordRule(), currentNode); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword1129);
            iv_ruleKeyword=ruleKeyword();
            _fsp--;

             current =iv_ruleKeyword.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword1140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleKeyword


    // $ANTLR start ruleKeyword
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:697:1: ruleKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Arbitrator' | kw= 'Participant' | kw= 'Message' | kw= 'AsynchronousCipher' | kw= 'SynchronousCipher' ) ;
    public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:702:6: ( (kw= 'Arbitrator' | kw= 'Participant' | kw= 'Message' | kw= 'AsynchronousCipher' | kw= 'SynchronousCipher' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:703:1: (kw= 'Arbitrator' | kw= 'Participant' | kw= 'Message' | kw= 'AsynchronousCipher' | kw= 'SynchronousCipher' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:703:1: (kw= 'Arbitrator' | kw= 'Participant' | kw= 'Message' | kw= 'AsynchronousCipher' | kw= 'SynchronousCipher' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("703:1: (kw= 'Arbitrator' | kw= 'Participant' | kw= 'Message' | kw= 'AsynchronousCipher' | kw= 'SynchronousCipher' )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:704:2: kw= 'Arbitrator'
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleKeyword1178); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getKeywordAccess().getArbitratorKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:711:2: kw= 'Participant'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleKeyword1197); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getKeywordAccess().getParticipantKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:718:2: kw= 'Message'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleKeyword1216); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getKeywordAccess().getMessageKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:725:2: kw= 'AsynchronousCipher'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleKeyword1235); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getKeywordAccess().getAsynchronousCipherKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:732:2: kw= 'SynchronousCipher'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleKeyword1254); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getKeywordAccess().getSynchronousCipherKeyword_4(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleKeyword


    // $ANTLR start entryRuleTransactions
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:745:1: entryRuleTransactions returns [EObject current=null] : iv_ruleTransactions= ruleTransactions EOF ;
    public final EObject entryRuleTransactions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactions = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:746:2: (iv_ruleTransactions= ruleTransactions EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:747:2: iv_ruleTransactions= ruleTransactions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransactionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransactions_in_entryRuleTransactions1294);
            iv_ruleTransactions=ruleTransactions();
            _fsp--;

             current =iv_ruleTransactions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactions1304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransactions


    // $ANTLR start ruleTransactions
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:754:1: ruleTransactions returns [EObject current=null] : ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' ) ;
    public final EObject ruleTransactions() throws RecognitionException {
        EObject current = null;

        EObject lv_transactions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:759:6: ( ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:760:1: ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:760:1: ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:760:3: '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]'
            {
            match(input,21,FOLLOW_21_in_ruleTransactions1339); 

                    createLeafNode(grammarAccess.getTransactionsAccess().getTRANSACTIONSKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:764:1: ( (lv_transactions_1_0= ruleTransaction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:765:1: (lv_transactions_1_0= ruleTransaction )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:765:1: (lv_transactions_1_0= ruleTransaction )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:766:3: lv_transactions_1_0= ruleTransaction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransactionsAccess().getTransactionsTransactionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransaction_in_ruleTransactions1360);
            	    lv_transactions_1_0=ruleTransaction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTransactionsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"transactions",
            	    	        		lv_transactions_1_0, 
            	    	        		"Transaction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleTransactions1371); 

                    createLeafNode(grammarAccess.getTransactionsAccess().getENDKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransactions


    // $ANTLR start entryRuleTransaction
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:800:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:801:2: (iv_ruleTransaction= ruleTransaction EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:802:2: iv_ruleTransaction= ruleTransaction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransactionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction1407);
            iv_ruleTransaction=ruleTransaction();
            _fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction1417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransaction


    // $ANTLR start ruleTransaction
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:809:1: ruleTransaction returns [EObject current=null] : ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_operations_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:814:6: ( ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:815:1: ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:815:1: ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:815:3: 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]'
            {
            match(input,22,FOLLOW_22_in_ruleTransaction1452); 

                    createLeafNode(grammarAccess.getTransactionAccess().getTRANSACTIONKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:819:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:820:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:820:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:821:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransaction1469); 

            			createLeafNode(grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTransactionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleTransaction1484); 

                    createLeafNode(grammarAccess.getTransactionAccess().getLeftParenthesSKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:847:1: ( (lv_arguments_3_0= ruleArgument ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:848:1: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:848:1: (lv_arguments_3_0= ruleArgument )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:849:3: lv_arguments_3_0= ruleArgument
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransactionAccess().getArgumentsArgumentParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleTransaction1505);
            	    lv_arguments_3_0=ruleArgument();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTransactionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"arguments",
            	    	        		lv_arguments_3_0, 
            	    	        		"Argument", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_ruleTransaction1516); 

                    createLeafNode(grammarAccess.getTransactionAccess().getRGhtParenthesSKeyword_4(), null); 
                
            match(input,25,FOLLOW_25_in_ruleTransaction1526); 

                    createLeafNode(grammarAccess.getTransactionAccess().getBEGINKeyword_5(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:879:1: ( (lv_operations_6_0= ruleOperation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==26||LA7_0==28||(LA7_0>=31 && LA7_0<=32)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:880:1: (lv_operations_6_0= ruleOperation )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:880:1: (lv_operations_6_0= ruleOperation )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:881:3: lv_operations_6_0= ruleOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransactionAccess().getOperationsOperationParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleTransaction1547);
            	    lv_operations_6_0=ruleOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTransactionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"operations",
            	    	        		lv_operations_6_0, 
            	    	        		"Operation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleTransaction1558); 

                    createLeafNode(grammarAccess.getTransactionAccess().getENDKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransaction


    // $ANTLR start entryRuleArgument
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:915:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:916:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:917:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1594);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1604); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:924:1: ruleArgument returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_keyword_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:929:6: ( ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:930:1: ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:930:1: ( ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:930:2: ( (lv_keyword_0_0= ruleKeyword ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:930:2: ( (lv_keyword_0_0= ruleKeyword ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:931:1: (lv_keyword_0_0= ruleKeyword )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:931:1: (lv_keyword_0_0= ruleKeyword )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:932:3: lv_keyword_0_0= ruleKeyword
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getKeywordKeywordParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleKeyword_in_ruleArgument1650);
            lv_keyword_0_0=ruleKeyword();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"Keyword", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:954:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:955:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:955:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:956:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1667); 

            			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleOperation
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:986:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:987:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:988:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1708);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1718); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:995:1: ruleOperation returns [EObject current=null] : (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange | this_Redirect_6= ruleRedirect ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Decrypt_0 = null;

        EObject this_Encrypt_1 = null;

        EObject this_Send_2 = null;

        EObject this_Print_3 = null;

        EObject this_Call_4 = null;

        EObject this_Exchange_5 = null;

        EObject this_Redirect_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1000:6: ( (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange | this_Redirect_6= ruleRedirect ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1001:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange | this_Redirect_6= ruleRedirect )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1001:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange | this_Redirect_6= ruleRedirect )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt8=7;
                    }
                    break;
                case 33:
                    {
                    alt8=6;
                    }
                    break;
                case 29:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1001:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange | this_Redirect_6= ruleRedirect )", 8, 3, input);

                    throw nvae;
                }

                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            case 32:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1001:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange | this_Redirect_6= ruleRedirect )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1002:5: this_Decrypt_0= ruleDecrypt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecrypt_in_ruleOperation1765);
                    this_Decrypt_0=ruleDecrypt();
                    _fsp--;

                     
                            current = this_Decrypt_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1012:5: this_Encrypt_1= ruleEncrypt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEncrypt_in_ruleOperation1792);
                    this_Encrypt_1=ruleEncrypt();
                    _fsp--;

                     
                            current = this_Encrypt_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1022:5: this_Send_2= ruleSend
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getSendParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSend_in_ruleOperation1819);
                    this_Send_2=ruleSend();
                    _fsp--;

                     
                            current = this_Send_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1032:5: this_Print_3= rulePrint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getPrintParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrint_in_ruleOperation1846);
                    this_Print_3=rulePrint();
                    _fsp--;

                     
                            current = this_Print_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1042:5: this_Call_4= ruleCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getCallParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleOperation1873);
                    this_Call_4=ruleCall();
                    _fsp--;

                     
                            current = this_Call_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1052:5: this_Exchange_5= ruleExchange
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getExchangeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExchange_in_ruleOperation1900);
                    this_Exchange_5=ruleExchange();
                    _fsp--;

                     
                            current = this_Exchange_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1062:5: this_Redirect_6= ruleRedirect
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getRedirectParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRedirect_in_ruleOperation1927);
                    this_Redirect_6=ruleRedirect();
                    _fsp--;

                     
                            current = this_Redirect_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleDecrypt
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1078:1: entryRuleDecrypt returns [EObject current=null] : iv_ruleDecrypt= ruleDecrypt EOF ;
    public final EObject entryRuleDecrypt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecrypt = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1079:2: (iv_ruleDecrypt= ruleDecrypt EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1080:2: iv_ruleDecrypt= ruleDecrypt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecryptRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecrypt_in_entryRuleDecrypt1962);
            iv_ruleDecrypt=ruleDecrypt();
            _fsp--;

             current =iv_ruleDecrypt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecrypt1972); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDecrypt


    // $ANTLR start ruleDecrypt
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1087:1: ruleDecrypt returns [EObject current=null] : ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDecrypt() throws RecognitionException {
        EObject current = null;

        Token lv_message_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1092:6: ( ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1093:1: ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1093:1: ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1093:3: 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) )
            {
            match(input,26,FOLLOW_26_in_ruleDecrypt2007); 

                    createLeafNode(grammarAccess.getDecryptAccess().getDecryptKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1097:1: ( (lv_message_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1098:1: (lv_message_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1098:1: (lv_message_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1099:3: lv_message_1_0= RULE_ID
            {
            lv_message_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecrypt2024); 

            			createLeafNode(grammarAccess.getDecryptAccess().getMessageIDTerminalRuleCall_1_0(), "message"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecryptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,27,FOLLOW_27_in_ruleDecrypt2039); 

                    createLeafNode(grammarAccess.getDecryptAccess().getForKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1125:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1126:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1126:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1127:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecryptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecrypt2057); 

            		createLeafNode(grammarAccess.getDecryptAccess().getParticipantParticipantCrossReference_3_0(), "participant"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDecrypt


    // $ANTLR start entryRuleEncrypt
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1147:1: entryRuleEncrypt returns [EObject current=null] : iv_ruleEncrypt= ruleEncrypt EOF ;
    public final EObject entryRuleEncrypt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncrypt = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1148:2: (iv_ruleEncrypt= ruleEncrypt EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1149:2: iv_ruleEncrypt= ruleEncrypt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEncryptRule(), currentNode); 
            pushFollow(FOLLOW_ruleEncrypt_in_entryRuleEncrypt2093);
            iv_ruleEncrypt=ruleEncrypt();
            _fsp--;

             current =iv_ruleEncrypt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncrypt2103); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEncrypt


    // $ANTLR start ruleEncrypt
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1156:1: ruleEncrypt returns [EObject current=null] : ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) ;
    public final EObject ruleEncrypt() throws RecognitionException {
        EObject current = null;

        Token lv_message_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1161:6: ( ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1162:1: ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1162:1: ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1162:3: 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) )
            {
            match(input,28,FOLLOW_28_in_ruleEncrypt2138); 

                    createLeafNode(grammarAccess.getEncryptAccess().getEncryptKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1166:1: ( (lv_message_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1167:1: (lv_message_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1167:1: (lv_message_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1168:3: lv_message_1_0= RULE_ID
            {
            lv_message_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEncrypt2155); 

            			createLeafNode(grammarAccess.getEncryptAccess().getMessageIDTerminalRuleCall_1_0(), "message"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEncryptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,27,FOLLOW_27_in_ruleEncrypt2170); 

                    createLeafNode(grammarAccess.getEncryptAccess().getForKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1194:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1195:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1195:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1196:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEncryptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEncrypt2188); 

            		createLeafNode(grammarAccess.getEncryptAccess().getParticipantParticipantCrossReference_3_0(), "participant"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEncrypt


    // $ANTLR start entryRuleSend
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1216:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1217:2: (iv_ruleSend= ruleSend EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1218:2: iv_ruleSend= ruleSend EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSendRule(), currentNode); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend2224);
            iv_ruleSend=ruleSend();
            _fsp--;

             current =iv_ruleSend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend2234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSend


    // $ANTLR start ruleSend
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1225:1: ruleSend returns [EObject current=null] : ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token lv_message_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1230:6: ( ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1231:1: ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1231:1: ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1231:2: ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1231:2: ( (lv_message_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1232:1: (lv_message_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1232:1: (lv_message_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1233:3: lv_message_0_0= RULE_ID
            {
            lv_message_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSend2276); 

            			createLeafNode(grammarAccess.getSendAccess().getMessageIDTerminalRuleCall_0_0(), "message"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,29,FOLLOW_29_in_ruleSend2291); 

                    createLeafNode(grammarAccess.getSendAccess().getColonColonKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1259:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1260:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1260:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1261:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSend2309); 

            		createLeafNode(grammarAccess.getSendAccess().getSourceEventSourceCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,30,FOLLOW_30_in_ruleSend2319); 

                    createLeafNode(grammarAccess.getSendAccess().getHyphenMNusGreaterThanSGnKeyword_3(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1277:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1278:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1278:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1279:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSend2337); 

            		createLeafNode(grammarAccess.getSendAccess().getDestinationEventSourceCrossReference_4_0(), "destination"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSend


    // $ANTLR start entryRulePrint
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1299:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1300:2: (iv_rulePrint= rulePrint EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1301:2: iv_rulePrint= rulePrint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrintRule(), currentNode); 
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint2373);
            iv_rulePrint=rulePrint();
            _fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint2383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrint


    // $ANTLR start rulePrint
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1308:1: rulePrint returns [EObject current=null] : ( 'print' ( (lv_message_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token lv_message_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1313:6: ( ( 'print' ( (lv_message_1_0= RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1314:1: ( 'print' ( (lv_message_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1314:1: ( 'print' ( (lv_message_1_0= RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1314:3: 'print' ( (lv_message_1_0= RULE_ID ) )
            {
            match(input,31,FOLLOW_31_in_rulePrint2418); 

                    createLeafNode(grammarAccess.getPrintAccess().getPrintKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1318:1: ( (lv_message_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1319:1: (lv_message_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1319:1: (lv_message_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1320:3: lv_message_1_0= RULE_ID
            {
            lv_message_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrint2435); 

            			createLeafNode(grammarAccess.getPrintAccess().getMessageIDTerminalRuleCall_1_0(), "message"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrint


    // $ANTLR start entryRuleCall
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1350:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1351:2: (iv_ruleCall= ruleCall EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1352:2: iv_ruleCall= ruleCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall2476);
            iv_ruleCall=ruleCall();
            _fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall2486); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCall


    // $ANTLR start ruleCall
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1359:1: ruleCall returns [EObject current=null] : ( 'CALL' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) )* ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1364:6: ( ( 'CALL' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) )* ')' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1365:1: ( 'CALL' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) )* ')' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1365:1: ( 'CALL' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) )* ')' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1365:3: 'CALL' ( ( RULE_ID ) ) '(' ( ( RULE_ID ) )* ')'
            {
            match(input,32,FOLLOW_32_in_ruleCall2521); 

                    createLeafNode(grammarAccess.getCallAccess().getCALLKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1369:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1370:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1370:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1371:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall2539); 

            		createLeafNode(grammarAccess.getCallAccess().getTransactionNameTransactionCrossReference_1_0(), "transactionName"); 
            	

            }


            }

            match(input,23,FOLLOW_23_in_ruleCall2549); 

                    createLeafNode(grammarAccess.getCallAccess().getLeftParenthesSKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1387:1: ( ( RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1388:1: ( RULE_ID )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1388:1: ( RULE_ID )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1389:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getCallRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall2567); 

            	    		createLeafNode(grammarAccess.getCallAccess().getArgsDefineCrossReference_3_0(), "args"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_ruleCall2578); 

                    createLeafNode(grammarAccess.getCallAccess().getRGhtParenthesSKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCall


    // $ANTLR start entryRuleExchange
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1413:1: entryRuleExchange returns [EObject current=null] : iv_ruleExchange= ruleExchange EOF ;
    public final EObject entryRuleExchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExchange = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1414:2: (iv_ruleExchange= ruleExchange EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1415:2: iv_ruleExchange= ruleExchange EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExchangeRule(), currentNode); 
            pushFollow(FOLLOW_ruleExchange_in_entryRuleExchange2614);
            iv_ruleExchange=ruleExchange();
            _fsp--;

             current =iv_ruleExchange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExchange2624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExchange


    // $ANTLR start ruleExchange
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1422:1: ruleExchange returns [EObject current=null] : ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) ) ;
    public final EObject ruleExchange() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1427:6: ( ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1428:1: ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1428:1: ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1428:2: ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1428:2: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1429:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1429:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1430:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExchangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExchange2667); 

            		createLeafNode(grammarAccess.getExchangeAccess().getSourceEventSourceCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,33,FOLLOW_33_in_ruleExchange2677); 

                    createLeafNode(grammarAccess.getExchangeAccess().getExchangeKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1446:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1447:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1447:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1448:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExchangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExchange2695); 

            		createLeafNode(grammarAccess.getExchangeAccess().getDestinationEventSourceCrossReference_2_0(), "destination"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExchange


    // $ANTLR start entryRuleRedirect
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1468:1: entryRuleRedirect returns [EObject current=null] : iv_ruleRedirect= ruleRedirect EOF ;
    public final EObject entryRuleRedirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirect = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1469:2: (iv_ruleRedirect= ruleRedirect EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1470:2: iv_ruleRedirect= ruleRedirect EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRedirectRule(), currentNode); 
            pushFollow(FOLLOW_ruleRedirect_in_entryRuleRedirect2731);
            iv_ruleRedirect=ruleRedirect();
            _fsp--;

             current =iv_ruleRedirect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRedirect2741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRedirect


    // $ANTLR start ruleRedirect
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1477:1: ruleRedirect returns [EObject current=null] : ( ( (lv_message_0_0= RULE_ID ) ) 'redirect' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRedirect() throws RecognitionException {
        EObject current = null;

        Token lv_message_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1482:6: ( ( ( (lv_message_0_0= RULE_ID ) ) 'redirect' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1483:1: ( ( (lv_message_0_0= RULE_ID ) ) 'redirect' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1483:1: ( ( (lv_message_0_0= RULE_ID ) ) 'redirect' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1483:2: ( (lv_message_0_0= RULE_ID ) ) 'redirect' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1483:2: ( (lv_message_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1484:1: (lv_message_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1484:1: (lv_message_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1485:3: lv_message_0_0= RULE_ID
            {
            lv_message_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirect2783); 

            			createLeafNode(grammarAccess.getRedirectAccess().getMessageIDTerminalRuleCall_0_0(), "message"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRedirectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,34,FOLLOW_34_in_ruleRedirect2798); 

                    createLeafNode(grammarAccess.getRedirectAccess().getRedirectKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1511:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1512:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1512:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1513:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRedirectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRedirect2816); 

            		createLeafNode(grammarAccess.getRedirectAccess().getDestinationEventSourceCrossReference_2_0(), "destination"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRedirect


    // $ANTLR start entryRuleStates
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1533:1: entryRuleStates returns [EObject current=null] : iv_ruleStates= ruleStates EOF ;
    public final EObject entryRuleStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStates = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1534:2: (iv_ruleStates= ruleStates EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1535:2: iv_ruleStates= ruleStates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleStates_in_entryRuleStates2852);
            iv_ruleStates=ruleStates();
            _fsp--;

             current =iv_ruleStates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStates2862); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStates


    // $ANTLR start ruleStates
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1542:1: ruleStates returns [EObject current=null] : ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' ) ;
    public final EObject ruleStates() throws RecognitionException {
        EObject current = null;

        EObject lv_states_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1547:6: ( ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1548:1: ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1548:1: ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1548:3: '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]'
            {
            match(input,35,FOLLOW_35_in_ruleStates2897); 

                    createLeafNode(grammarAccess.getStatesAccess().getSTATESKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1552:1: ( (lv_states_1_0= ruleState ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1553:1: (lv_states_1_0= ruleState )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1553:1: (lv_states_1_0= ruleState )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1554:3: lv_states_1_0= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStates2918);
            	    lv_states_1_0=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStatesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"states",
            	    	        		lv_states_1_0, 
            	    	        		"State", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleStates2929); 

                    createLeafNode(grammarAccess.getStatesAccess().getENDKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStates


    // $ANTLR start entryRuleState
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1588:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1589:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1590:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState2965);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1597:1: ruleState returns [EObject current=null] : ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_event_3_0 = null;

        EObject lv_guards_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1602:6: ( ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1603:1: ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1603:1: ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1603:3: 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]'
            {
            match(input,36,FOLLOW_36_in_ruleState3010); 

                    createLeafNode(grammarAccess.getStateAccess().getSTATEKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1607:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1608:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1608:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1609:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3027); 

            			createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleState3042); 

                    createLeafNode(grammarAccess.getStateAccess().getLeftParenthesSKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1635:1: ( (lv_event_3_0= ruleEvent ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1636:1: (lv_event_3_0= ruleEvent )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1636:1: (lv_event_3_0= ruleEvent )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1637:3: lv_event_3_0= ruleEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEventEventParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleState3063);
            lv_event_3_0=ruleEvent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"event",
            	        		lv_event_3_0, 
            	        		"Event", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleState3073); 

                    createLeafNode(grammarAccess.getStateAccess().getRGhtParenthesSKeyword_4(), null); 
                
            match(input,25,FOLLOW_25_in_ruleState3083); 

                    createLeafNode(grammarAccess.getStateAccess().getBEGINKeyword_5(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1667:1: ( (lv_guards_6_0= ruleGuard ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1668:1: (lv_guards_6_0= ruleGuard )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1668:1: (lv_guards_6_0= ruleGuard )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1669:3: lv_guards_6_0= ruleGuard
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getGuardsGuardParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGuard_in_ruleState3104);
            	    lv_guards_6_0=ruleGuard();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"guards",
            	    	        		lv_guards_6_0, 
            	    	        		"Guard", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleState3115); 

                    createLeafNode(grammarAccess.getStateAccess().getENDKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleGuard
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1703:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1704:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1705:2: iv_ruleGuard= ruleGuard EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGuardRule(), currentNode); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard3151);
            iv_ruleGuard=ruleGuard();
            _fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard3161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGuard


    // $ANTLR start ruleGuard
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1712:1: ruleGuard returns [EObject current=null] : ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject lv_casem_1_0 = null;

        EObject lv_operation_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1717:6: ( ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1718:1: ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1718:1: ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1718:3: '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) )
            {
            match(input,37,FOLLOW_37_in_ruleGuard3196); 

                    createLeafNode(grammarAccess.getGuardAccess().getVertCalLNeKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1722:1: ( (lv_casem_1_0= ruleCase ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1723:1: (lv_casem_1_0= ruleCase )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1723:1: (lv_casem_1_0= ruleCase )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1724:3: lv_casem_1_0= ruleCase
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGuardAccess().getCasemCaseParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCase_in_ruleGuard3217);
            lv_casem_1_0=ruleCase();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGuardRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"casem",
            	        		lv_casem_1_0, 
            	        		"Case", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,38,FOLLOW_38_in_ruleGuard3227); 

                    createLeafNode(grammarAccess.getGuardAccess().getEqualsSGnGreaterThanSGnKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1750:1: ( (lv_operation_3_0= ruleOperation ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1751:1: (lv_operation_3_0= ruleOperation )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1751:1: (lv_operation_3_0= ruleOperation )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1752:3: lv_operation_3_0= ruleOperation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGuardAccess().getOperationOperationParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOperation_in_ruleGuard3248);
            lv_operation_3_0=ruleOperation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGuardRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"operation",
            	        		lv_operation_3_0, 
            	        		"Operation", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGuard


    // $ANTLR start entryRuleEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1782:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1783:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1784:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3284);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3294); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1791:1: ruleEvent returns [EObject current=null] : (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit | this_SendsEvent_3= ruleSendsEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_GetEvent_0 = null;

        EObject this_IsSendEvent_1 = null;

        EObject this_Init_2 = null;

        EObject this_SendsEvent_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1796:6: ( (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit | this_SendsEvent_3= ruleSendsEvent ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1797:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit | this_SendsEvent_3= ruleSendsEvent )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1797:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit | this_SendsEvent_3= ruleSendsEvent )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt12=4;
                    }
                    break;
                case 39:
                    {
                    alt12=1;
                    }
                    break;
                case 41:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1797:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit | this_SendsEvent_3= ruleSendsEvent )", 12, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA12_0==42) ) {
                alt12=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1797:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit | this_SendsEvent_3= ruleSendsEvent )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1798:5: this_GetEvent_0= ruleGetEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getGetEventParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGetEvent_in_ruleEvent3341);
                    this_GetEvent_0=ruleGetEvent();
                    _fsp--;

                     
                            current = this_GetEvent_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1808:5: this_IsSendEvent_1= ruleIsSendEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIsSendEvent_in_ruleEvent3368);
                    this_IsSendEvent_1=ruleIsSendEvent();
                    _fsp--;

                     
                            current = this_IsSendEvent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1818:5: this_Init_2= ruleInit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getInitParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInit_in_ruleEvent3395);
                    this_Init_2=ruleInit();
                    _fsp--;

                     
                            current = this_Init_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1828:5: this_SendsEvent_3= ruleSendsEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getSendsEventParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSendsEvent_in_ruleEvent3422);
                    this_SendsEvent_3=ruleSendsEvent();
                    _fsp--;

                     
                            current = this_SendsEvent_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleGetEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1844:1: entryRuleGetEvent returns [EObject current=null] : iv_ruleGetEvent= ruleGetEvent EOF ;
    public final EObject entryRuleGetEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetEvent = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1845:2: (iv_ruleGetEvent= ruleGetEvent EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1846:2: iv_ruleGetEvent= ruleGetEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGetEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleGetEvent_in_entryRuleGetEvent3457);
            iv_ruleGetEvent=ruleGetEvent();
            _fsp--;

             current =iv_ruleGetEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetEvent3467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGetEvent


    // $ANTLR start ruleGetEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1853:1: ruleGetEvent returns [EObject current=null] : ( ( ( RULE_ID ) ) 'GET' ( ( RULE_ID ) ) ) ;
    public final EObject ruleGetEvent() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1858:6: ( ( ( ( RULE_ID ) ) 'GET' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1859:1: ( ( ( RULE_ID ) ) 'GET' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1859:1: ( ( ( RULE_ID ) ) 'GET' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1859:2: ( ( RULE_ID ) ) 'GET' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1859:2: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1860:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1860:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1861:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getGetEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetEvent3510); 

            		createLeafNode(grammarAccess.getGetEventAccess().getWhoDefineCrossReference_0_0(), "who"); 
            	

            }


            }

            match(input,39,FOLLOW_39_in_ruleGetEvent3520); 

                    createLeafNode(grammarAccess.getGetEventAccess().getGETKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1877:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1878:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1878:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1879:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getGetEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetEvent3538); 

            		createLeafNode(grammarAccess.getGetEventAccess().getMessageMessageCrossReference_2_0(), "message"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGetEvent


    // $ANTLR start entryRuleSendsEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1899:1: entryRuleSendsEvent returns [EObject current=null] : iv_ruleSendsEvent= ruleSendsEvent EOF ;
    public final EObject entryRuleSendsEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendsEvent = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1900:2: (iv_ruleSendsEvent= ruleSendsEvent EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1901:2: iv_ruleSendsEvent= ruleSendsEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSendsEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleSendsEvent_in_entryRuleSendsEvent3574);
            iv_ruleSendsEvent=ruleSendsEvent();
            _fsp--;

             current =iv_ruleSendsEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendsEvent3584); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSendsEvent


    // $ANTLR start ruleSendsEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1908:1: ruleSendsEvent returns [EObject current=null] : ( ( ( RULE_ID ) ) 'SENDS' ( ( RULE_ID ) ) ) ;
    public final EObject ruleSendsEvent() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1913:6: ( ( ( ( RULE_ID ) ) 'SENDS' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1914:1: ( ( ( RULE_ID ) ) 'SENDS' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1914:1: ( ( ( RULE_ID ) ) 'SENDS' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1914:2: ( ( RULE_ID ) ) 'SENDS' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1914:2: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1915:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1915:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1916:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSendsEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSendsEvent3627); 

            		createLeafNode(grammarAccess.getSendsEventAccess().getWhoDefineCrossReference_0_0(), "who"); 
            	

            }


            }

            match(input,40,FOLLOW_40_in_ruleSendsEvent3637); 

                    createLeafNode(grammarAccess.getSendsEventAccess().getSENDSKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1932:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1933:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1933:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1934:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSendsEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSendsEvent3655); 

            		createLeafNode(grammarAccess.getSendsEventAccess().getMessageMessageCrossReference_2_0(), "message"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSendsEvent


    // $ANTLR start entryRuleIsSendEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1954:1: entryRuleIsSendEvent returns [EObject current=null] : iv_ruleIsSendEvent= ruleIsSendEvent EOF ;
    public final EObject entryRuleIsSendEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSendEvent = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1955:2: (iv_ruleIsSendEvent= ruleIsSendEvent EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1956:2: iv_ruleIsSendEvent= ruleIsSendEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIsSendEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent3691);
            iv_ruleIsSendEvent=ruleIsSendEvent();
            _fsp--;

             current =iv_ruleIsSendEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsSendEvent3701); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIsSendEvent


    // $ANTLR start ruleIsSendEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1963:1: ruleIsSendEvent returns [EObject current=null] : ( ( ( RULE_ID ) ) 'IS_SEND' ) ;
    public final EObject ruleIsSendEvent() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1968:6: ( ( ( ( RULE_ID ) ) 'IS_SEND' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1969:1: ( ( ( RULE_ID ) ) 'IS_SEND' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1969:1: ( ( ( RULE_ID ) ) 'IS_SEND' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1969:2: ( ( RULE_ID ) ) 'IS_SEND'
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1969:2: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1970:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1970:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1971:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getIsSendEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsSendEvent3744); 

            		createLeafNode(grammarAccess.getIsSendEventAccess().getMessageMessageCrossReference_0_0(), "message"); 
            	

            }


            }

            match(input,41,FOLLOW_41_in_ruleIsSendEvent3754); 

                    createLeafNode(grammarAccess.getIsSendEventAccess().getIS_SENDKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIsSendEvent


    // $ANTLR start entryRuleInit
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1995:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1996:2: (iv_ruleInit= ruleInit EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1997:2: iv_ruleInit= ruleInit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitRule(), currentNode); 
            pushFollow(FOLLOW_ruleInit_in_entryRuleInit3790);
            iv_ruleInit=ruleInit();
            _fsp--;

             current =iv_ruleInit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInit3800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInit


    // $ANTLR start ruleInit
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2004:1: ruleInit returns [EObject current=null] : ( (lv_keyword_0_0= 'INIT' ) ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2009:6: ( ( (lv_keyword_0_0= 'INIT' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2010:1: ( (lv_keyword_0_0= 'INIT' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2010:1: ( (lv_keyword_0_0= 'INIT' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2011:1: (lv_keyword_0_0= 'INIT' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2011:1: (lv_keyword_0_0= 'INIT' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2012:3: lv_keyword_0_0= 'INIT'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_ruleInit3842); 

                    createLeafNode(grammarAccess.getInitAccess().getKeywordINITKeyword_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_0_0, "INIT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInit


    // $ANTLR start entryRuleCase
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2039:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2040:2: (iv_ruleCase= ruleCase EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2041:2: iv_ruleCase= ruleCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase3890);
            iv_ruleCase=ruleCase();
            _fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase3900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCase


    // $ANTLR start ruleCase
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2048:1: ruleCase returns [EObject current=null] : (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_To_2= ruleTo | this_From_3= ruleFrom ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        EObject this_Always_0 = null;

        EObject this_Otherwise_1 = null;

        EObject this_To_2 = null;

        EObject this_From_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2053:6: ( (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_To_2= ruleTo | this_From_3= ruleFrom ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2054:1: (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_To_2= ruleTo | this_From_3= ruleFrom )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2054:1: (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_To_2= ruleTo | this_From_3= ruleFrom )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt13=1;
                }
                break;
            case 44:
                {
                alt13=2;
                }
                break;
            case 45:
                {
                alt13=3;
                }
                break;
            case 46:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2054:1: (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_To_2= ruleTo | this_From_3= ruleFrom )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2055:5: this_Always_0= ruleAlways
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAlways_in_ruleCase3947);
                    this_Always_0=ruleAlways();
                    _fsp--;

                     
                            current = this_Always_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2065:5: this_Otherwise_1= ruleOtherwise
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOtherwise_in_ruleCase3974);
                    this_Otherwise_1=ruleOtherwise();
                    _fsp--;

                     
                            current = this_Otherwise_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2075:5: this_To_2= ruleTo
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getToParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTo_in_ruleCase4001);
                    this_To_2=ruleTo();
                    _fsp--;

                     
                            current = this_To_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2085:5: this_From_3= ruleFrom
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getFromParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFrom_in_ruleCase4028);
                    this_From_3=ruleFrom();
                    _fsp--;

                     
                            current = this_From_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCase


    // $ANTLR start entryRuleAlways
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2101:1: entryRuleAlways returns [EObject current=null] : iv_ruleAlways= ruleAlways EOF ;
    public final EObject entryRuleAlways() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlways = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2102:2: (iv_ruleAlways= ruleAlways EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2103:2: iv_ruleAlways= ruleAlways EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAlwaysRule(), currentNode); 
            pushFollow(FOLLOW_ruleAlways_in_entryRuleAlways4063);
            iv_ruleAlways=ruleAlways();
            _fsp--;

             current =iv_ruleAlways; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlways4073); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAlways


    // $ANTLR start ruleAlways
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2110:1: ruleAlways returns [EObject current=null] : ( (lv_keyword_0_0= 'always' ) ) ;
    public final EObject ruleAlways() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2115:6: ( ( (lv_keyword_0_0= 'always' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2116:1: ( (lv_keyword_0_0= 'always' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2116:1: ( (lv_keyword_0_0= 'always' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2117:1: (lv_keyword_0_0= 'always' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2117:1: (lv_keyword_0_0= 'always' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2118:3: lv_keyword_0_0= 'always'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_ruleAlways4115); 

                    createLeafNode(grammarAccess.getAlwaysAccess().getKeywordAlwaysKeyword_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAlwaysRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_0_0, "always", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAlways


    // $ANTLR start entryRuleOtherwise
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2145:1: entryRuleOtherwise returns [EObject current=null] : iv_ruleOtherwise= ruleOtherwise EOF ;
    public final EObject entryRuleOtherwise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherwise = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2146:2: (iv_ruleOtherwise= ruleOtherwise EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2147:2: iv_ruleOtherwise= ruleOtherwise EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOtherwiseRule(), currentNode); 
            pushFollow(FOLLOW_ruleOtherwise_in_entryRuleOtherwise4163);
            iv_ruleOtherwise=ruleOtherwise();
            _fsp--;

             current =iv_ruleOtherwise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherwise4173); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOtherwise


    // $ANTLR start ruleOtherwise
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2154:1: ruleOtherwise returns [EObject current=null] : ( (lv_keyword_0_0= 'otherwise' ) ) ;
    public final EObject ruleOtherwise() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2159:6: ( ( (lv_keyword_0_0= 'otherwise' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2160:1: ( (lv_keyword_0_0= 'otherwise' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2160:1: ( (lv_keyword_0_0= 'otherwise' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2161:1: (lv_keyword_0_0= 'otherwise' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2161:1: (lv_keyword_0_0= 'otherwise' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2162:3: lv_keyword_0_0= 'otherwise'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,44,FOLLOW_44_in_ruleOtherwise4215); 

                    createLeafNode(grammarAccess.getOtherwiseAccess().getKeywordOtherwiseKeyword_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOtherwiseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_0_0, "otherwise", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOtherwise


    // $ANTLR start entryRuleTo
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2189:1: entryRuleTo returns [EObject current=null] : iv_ruleTo= ruleTo EOF ;
    public final EObject entryRuleTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTo = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2190:2: (iv_ruleTo= ruleTo EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2191:2: iv_ruleTo= ruleTo EOF
            {
             currentNode = createCompositeNode(grammarAccess.getToRule(), currentNode); 
            pushFollow(FOLLOW_ruleTo_in_entryRuleTo4263);
            iv_ruleTo=ruleTo();
            _fsp--;

             current =iv_ruleTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTo4273); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTo


    // $ANTLR start ruleTo
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2198:1: ruleTo returns [EObject current=null] : ( ( (lv_keyword_0_0= 'to' ) ) '=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleTo() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2203:6: ( ( ( (lv_keyword_0_0= 'to' ) ) '=' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2204:1: ( ( (lv_keyword_0_0= 'to' ) ) '=' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2204:1: ( ( (lv_keyword_0_0= 'to' ) ) '=' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2204:2: ( (lv_keyword_0_0= 'to' ) ) '=' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2204:2: ( (lv_keyword_0_0= 'to' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2205:1: (lv_keyword_0_0= 'to' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2205:1: (lv_keyword_0_0= 'to' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2206:3: lv_keyword_0_0= 'to'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_ruleTo4316); 

                    createLeafNode(grammarAccess.getToAccess().getKeywordToKeyword_0_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getToRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_0_0, "to", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleTo4339); 

                    createLeafNode(grammarAccess.getToAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2229:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2230:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2230:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2231:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getToRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTo4357); 

            		createLeafNode(grammarAccess.getToAccess().getEventSourceEventSourceCrossReference_2_0(), "eventSource"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTo


    // $ANTLR start entryRuleFrom
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2251:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2252:2: (iv_ruleFrom= ruleFrom EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2253:2: iv_ruleFrom= ruleFrom EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFromRule(), currentNode); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom4393);
            iv_ruleFrom=ruleFrom();
            _fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom4403); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFrom


    // $ANTLR start ruleFrom
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2260:1: ruleFrom returns [EObject current=null] : ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2265:6: ( ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2266:1: ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2266:1: ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2266:2: ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2266:2: ( (lv_keyword_0_0= 'from' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2267:1: (lv_keyword_0_0= 'from' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2267:1: (lv_keyword_0_0= 'from' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2268:3: lv_keyword_0_0= 'from'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,46,FOLLOW_46_in_ruleFrom4446); 

                    createLeafNode(grammarAccess.getFromAccess().getKeywordFromKeyword_0_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFromRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_0_0, "from", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleFrom4469); 

                    createLeafNode(grammarAccess.getFromAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2291:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2292:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2292:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2293:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFromRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrom4487); 

            		createLeafNode(grammarAccess.getFromAccess().getEventSourceEventSourceCrossReference_2_0(), "eventSource"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFrom


    // $ANTLR start entryRuleTest
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2313:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2314:2: (iv_ruleTest= ruleTest EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2315:2: iv_ruleTest= ruleTest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTestRule(), currentNode); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest4523);
            iv_ruleTest=ruleTest();
            _fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest4533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTest


    // $ANTLR start ruleTest
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2322:1: ruleTest returns [EObject current=null] : ( '[TEST]' ( (lv_operations_1_0= ruleOperation ) )* '[END]' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2327:6: ( ( '[TEST]' ( (lv_operations_1_0= ruleOperation ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2328:1: ( '[TEST]' ( (lv_operations_1_0= ruleOperation ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2328:1: ( '[TEST]' ( (lv_operations_1_0= ruleOperation ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2328:3: '[TEST]' ( (lv_operations_1_0= ruleOperation ) )* '[END]'
            {
            match(input,47,FOLLOW_47_in_ruleTest4568); 

                    createLeafNode(grammarAccess.getTestAccess().getTESTKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2332:1: ( (lv_operations_1_0= ruleOperation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==26||LA14_0==28||(LA14_0>=31 && LA14_0<=32)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2333:1: (lv_operations_1_0= ruleOperation )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2333:1: (lv_operations_1_0= ruleOperation )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2334:3: lv_operations_1_0= ruleOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTestAccess().getOperationsOperationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleTest4589);
            	    lv_operations_1_0=ruleOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTestRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"operations",
            	    	        		lv_operations_1_0, 
            	    	        		"Operation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleTest4600); 

                    createLeafNode(grammarAccess.getTestAccess().getENDKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTest


 

    public static final BitSet FOLLOW_rulePDLFile_in_entryRulePDLFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePDLFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePDLFile120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePDLFile137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePDLFile152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDefinitions_in_rulePDLFile173 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleTransactions_in_rulePDLFile194 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleStates_in_rulePDLFile215 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleTest_in_rulePDLFile236 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePDLFile246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDefinitions327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventSource_in_ruleDefinitions348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCipher_in_ruleDefinitions370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleDefinitions391 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDefinitions401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSource_in_entryRuleEventSource439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSource449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitrator_in_ruleEventSource496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleEventSource523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitrator_in_entryRuleArbitrator558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitrator568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArbitrator610 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArbitrator625 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArbitrator643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParticipant744 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParticipant759 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParticipant777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCipher_in_entryRuleCipher826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCipher836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCipher878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCipher893 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleCipher913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCipher942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1046 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessage1061 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMessage1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleKeyword1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleKeyword1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleKeyword1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleKeyword1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleKeyword1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_entryRuleTransactions1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactions1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTransactions1339 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_ruleTransaction_in_ruleTransactions1360 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleTransactions1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction1407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTransaction1452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransaction1469 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransaction1484 = new BitSet(new long[]{0x00000000011F0000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleTransaction1505 = new BitSet(new long[]{0x00000000011F0000L});
    public static final BitSet FOLLOW_24_in_ruleTransaction1516 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransaction1526 = new BitSet(new long[]{0x0000000194002010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleTransaction1547 = new BitSet(new long[]{0x0000000194002010L});
    public static final BitSet FOLLOW_13_in_ruleTransaction1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_ruleArgument1650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_ruleOperation1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_ruleOperation1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_ruleOperation1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_ruleOperation1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleOperation1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_ruleOperation1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedirect_in_ruleOperation1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_entryRuleDecrypt1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecrypt1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDecrypt2007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecrypt2024 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDecrypt2039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecrypt2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_entryRuleEncrypt2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncrypt2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEncrypt2138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEncrypt2155 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEncrypt2170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEncrypt2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSend2276 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSend2291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSend2309 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSend2319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSend2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint2373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrint2418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrint2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall2476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCall2521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall2539 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCall2549 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall2567 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleCall2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_entryRuleExchange2614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExchange2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExchange2667 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleExchange2677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExchange2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedirect_in_entryRuleRedirect2731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRedirect2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirect2783 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRedirect2798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRedirect2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_entryRuleStates2852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStates2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStates2897 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStates2918 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_13_in_ruleStates2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleState3010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3027 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleState3042 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleState3063 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleState3073 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleState3083 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleState3104 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleState3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard3151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGuard3196 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_ruleCase_in_ruleGuard3217 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGuard3227 = new BitSet(new long[]{0x0000000194000010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleGuard3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_ruleEvent3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_ruleEvent3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_ruleEvent3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendsEvent_in_ruleEvent3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_entryRuleGetEvent3457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetEvent3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetEvent3510 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleGetEvent3520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetEvent3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendsEvent_in_entryRuleSendsEvent3574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendsEvent3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSendsEvent3627 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSendsEvent3637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSendsEvent3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent3691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsSendEvent3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsSendEvent3744 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleIsSendEvent3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_entryRuleInit3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInit3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInit3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase3890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_ruleCase3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_ruleCase3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTo_in_ruleCase4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_ruleCase4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_entryRuleAlways4063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlways4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlways4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_entryRuleOtherwise4163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherwise4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOtherwise4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTo_in_entryRuleTo4263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTo4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTo4316 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTo4339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTo4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom4393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFrom4446 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFrom4469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrom4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest4523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTest4568 = new BitSet(new long[]{0x0000000194002010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleTest4589 = new BitSet(new long[]{0x0000000194002010L});
    public static final BitSet FOLLOW_13_in_ruleTest4600 = new BitSet(new long[]{0x0000000000000002L});

}