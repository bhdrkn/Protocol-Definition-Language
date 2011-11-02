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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'[END]'", "'[DEFINITIONS]'", "'='", "'Arbitrator'", "'Participant'", "'[TRANSACTIONS]'", "'TRANSACTION'", "'('", "')'", "'[BEGIN]'", "'decrypt'", "'for'", "'encrypt'", "'::'", "'->'", "'print'", "'CALL'", "'exchange'", "'[STATES]'", "'STATE'", "'|'", "'=>'", "'GET'", "'IS_SEND'", "'INIT'", "'always'", "'otherwise'", "'source'", "'from'"
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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:86:1: rulePDLFile returns [EObject current=null] : ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) '[END]' ) ;
    public final EObject rulePDLFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_definition_3_0 = null;

        EObject lv_transaction_4_0 = null;

        EObject lv_state_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:91:6: ( ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:92:1: ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:92:1: ( '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:92:3: '[' ( (lv_name_1_0= RULE_ID ) ) ']' ( (lv_definition_3_0= ruleDefinitions ) ) ( (lv_transaction_4_0= ruleTransactions ) ) ( (lv_state_5_0= ruleStates ) ) '[END]'
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

            match(input,13,FOLLOW_13_in_rulePDLFile225); 

                    createLeafNode(grammarAccess.getPDLFileAccess().getENDKeyword_6(), null); 
                

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:208:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:209:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:210:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions261);
            iv_ruleDefinitions=ruleDefinitions();
            _fsp--;

             current =iv_ruleDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions271); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:217:1: ruleDefinitions returns [EObject current=null] : ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) '[END]' ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_sources_1_0 = null;

        EObject lv_cipher_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:222:6: ( ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:223:1: ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:223:1: ( '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:223:3: '[DEFINITIONS]' ( (lv_sources_1_0= ruleEventSource ) )* ( (lv_cipher_2_0= ruleCipher ) ) '[END]'
            {
            match(input,14,FOLLOW_14_in_ruleDefinitions306); 

                    createLeafNode(grammarAccess.getDefinitionsAccess().getDEFINITIONSKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:227:1: ( (lv_sources_1_0= ruleEventSource ) )*
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
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:228:1: (lv_sources_1_0= ruleEventSource )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:228:1: (lv_sources_1_0= ruleEventSource )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:229:3: lv_sources_1_0= ruleEventSource
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getSourcesEventSourceParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventSource_in_ruleDefinitions327);
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

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:251:3: ( (lv_cipher_2_0= ruleCipher ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:252:1: (lv_cipher_2_0= ruleCipher )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:252:1: (lv_cipher_2_0= ruleCipher )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:253:3: lv_cipher_2_0= ruleCipher
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getCipherCipherParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCipher_in_ruleDefinitions349);
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

            match(input,13,FOLLOW_13_in_ruleDefinitions359); 

                    createLeafNode(grammarAccess.getDefinitionsAccess().getENDKeyword_3(), null); 
                

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:289:1: entryRuleEventSource returns [EObject current=null] : iv_ruleEventSource= ruleEventSource EOF ;
    public final EObject entryRuleEventSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSource = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:290:2: (iv_ruleEventSource= ruleEventSource EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:291:2: iv_ruleEventSource= ruleEventSource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventSourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventSource_in_entryRuleEventSource397);
            iv_ruleEventSource=ruleEventSource();
            _fsp--;

             current =iv_ruleEventSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSource407); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:298:1: ruleEventSource returns [EObject current=null] : (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant ) ;
    public final EObject ruleEventSource() throws RecognitionException {
        EObject current = null;

        EObject this_Arbitrator_0 = null;

        EObject this_Participant_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:303:6: ( (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:304:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:304:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )
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
                            new NoViableAltException("304:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("304:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("304:1: (this_Arbitrator_0= ruleArbitrator | this_Participant_1= ruleParticipant )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:305:5: this_Arbitrator_0= ruleArbitrator
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventSourceAccess().getArbitratorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArbitrator_in_ruleEventSource454);
                    this_Arbitrator_0=ruleArbitrator();
                    _fsp--;

                     
                            current = this_Arbitrator_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:315:5: this_Participant_1= ruleParticipant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventSourceAccess().getParticipantParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleParticipant_in_ruleEventSource481);
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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:331:1: entryRuleArbitrator returns [EObject current=null] : iv_ruleArbitrator= ruleArbitrator EOF ;
    public final EObject entryRuleArbitrator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArbitrator = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:332:2: (iv_ruleArbitrator= ruleArbitrator EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:333:2: iv_ruleArbitrator= ruleArbitrator EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArbitratorRule(), currentNode); 
            pushFollow(FOLLOW_ruleArbitrator_in_entryRuleArbitrator516);
            iv_ruleArbitrator=ruleArbitrator();
            _fsp--;

             current =iv_ruleArbitrator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitrator526); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:340:1: ruleArbitrator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) ) ;
    public final EObject ruleArbitrator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_keyword_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:345:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:346:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:346:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:346:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Arbitrator' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:346:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:347:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:347:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:348:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArbitrator568); 

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

            match(input,15,FOLLOW_15_in_ruleArbitrator583); 

                    createLeafNode(grammarAccess.getArbitratorAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:374:1: ( (lv_keyword_2_0= 'Arbitrator' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:375:1: (lv_keyword_2_0= 'Arbitrator' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:375:1: (lv_keyword_2_0= 'Arbitrator' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:376:3: lv_keyword_2_0= 'Arbitrator'
            {
            lv_keyword_2_0=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleArbitrator601); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:403:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:404:2: (iv_ruleParticipant= ruleParticipant EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:405:2: iv_ruleParticipant= ruleParticipant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParticipantRule(), currentNode); 
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant650);
            iv_ruleParticipant=ruleParticipant();
            _fsp--;

             current =iv_ruleParticipant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant660); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:412:1: ruleParticipant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_keyword_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:417:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:418:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:418:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:418:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= 'Participant' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:418:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:419:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:419:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:420:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParticipant702); 

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

            match(input,15,FOLLOW_15_in_ruleParticipant717); 

                    createLeafNode(grammarAccess.getParticipantAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:446:1: ( (lv_keyword_2_0= 'Participant' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:447:1: (lv_keyword_2_0= 'Participant' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:447:1: (lv_keyword_2_0= 'Participant' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:448:3: lv_keyword_2_0= 'Participant'
            {
            lv_keyword_2_0=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_ruleParticipant735); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:475:1: entryRuleCipher returns [EObject current=null] : iv_ruleCipher= ruleCipher EOF ;
    public final EObject entryRuleCipher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCipher = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:476:2: (iv_ruleCipher= ruleCipher EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:477:2: iv_ruleCipher= ruleCipher EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCipherRule(), currentNode); 
            pushFollow(FOLLOW_ruleCipher_in_entryRuleCipher784);
            iv_ruleCipher=ruleCipher();
            _fsp--;

             current =iv_ruleCipher; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCipher794); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:484:1: ruleCipher returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCipher() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_keyword_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:489:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:490:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:490:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:490:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_keyword_2_0= RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:490:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:491:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:491:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:492:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCipher836); 

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

            match(input,15,FOLLOW_15_in_ruleCipher851); 

                    createLeafNode(grammarAccess.getCipherAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:518:1: ( (lv_keyword_2_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:519:1: (lv_keyword_2_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:519:1: (lv_keyword_2_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:520:3: lv_keyword_2_0= RULE_ID
            {
            lv_keyword_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCipher868); 

            			createLeafNode(grammarAccess.getCipherAccess().getKeywordIDTerminalRuleCall_2_0(), "keyword"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCipherRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_2_0, 
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
    // $ANTLR end ruleCipher


    // $ANTLR start entryRuleTransactions
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:550:1: entryRuleTransactions returns [EObject current=null] : iv_ruleTransactions= ruleTransactions EOF ;
    public final EObject entryRuleTransactions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactions = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:551:2: (iv_ruleTransactions= ruleTransactions EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:552:2: iv_ruleTransactions= ruleTransactions EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransactionsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransactions_in_entryRuleTransactions909);
            iv_ruleTransactions=ruleTransactions();
            _fsp--;

             current =iv_ruleTransactions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactions919); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:559:1: ruleTransactions returns [EObject current=null] : ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' ) ;
    public final EObject ruleTransactions() throws RecognitionException {
        EObject current = null;

        EObject lv_transactions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:564:6: ( ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:565:1: ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:565:1: ( '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:565:3: '[TRANSACTIONS]' ( (lv_transactions_1_0= ruleTransaction ) )* '[END]'
            {
            match(input,18,FOLLOW_18_in_ruleTransactions954); 

                    createLeafNode(grammarAccess.getTransactionsAccess().getTRANSACTIONSKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:569:1: ( (lv_transactions_1_0= ruleTransaction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:570:1: (lv_transactions_1_0= ruleTransaction )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:570:1: (lv_transactions_1_0= ruleTransaction )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:571:3: lv_transactions_1_0= ruleTransaction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransactionsAccess().getTransactionsTransactionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransaction_in_ruleTransactions975);
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
            	    break loop3;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleTransactions986); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:605:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:606:2: (iv_ruleTransaction= ruleTransaction EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:607:2: iv_ruleTransaction= ruleTransaction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransactionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction1022);
            iv_ruleTransaction=ruleTransaction();
            _fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction1032); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:614:1: ruleTransaction returns [EObject current=null] : ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_operations_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:619:6: ( ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:620:1: ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:620:1: ( 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:620:3: 'TRANSACTION' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_arguments_3_0= ruleArgument ) )* ')' '[BEGIN]' ( (lv_operations_6_0= ruleOperation ) )* '[END]'
            {
            match(input,19,FOLLOW_19_in_ruleTransaction1067); 

                    createLeafNode(grammarAccess.getTransactionAccess().getTRANSACTIONKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:624:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:625:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:625:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:626:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransaction1084); 

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

            match(input,20,FOLLOW_20_in_ruleTransaction1099); 

                    createLeafNode(grammarAccess.getTransactionAccess().getLeftParenthesSKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:652:1: ( (lv_arguments_3_0= ruleArgument ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:653:1: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:653:1: (lv_arguments_3_0= ruleArgument )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:654:3: lv_arguments_3_0= ruleArgument
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransactionAccess().getArgumentsArgumentParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleTransaction1120);
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
            	    break loop4;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleTransaction1131); 

                    createLeafNode(grammarAccess.getTransactionAccess().getRGhtParenthesSKeyword_4(), null); 
                
            match(input,22,FOLLOW_22_in_ruleTransaction1141); 

                    createLeafNode(grammarAccess.getTransactionAccess().getBEGINKeyword_5(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:684:1: ( (lv_operations_6_0= ruleOperation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==23||LA5_0==25||(LA5_0>=28 && LA5_0<=29)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:685:1: (lv_operations_6_0= ruleOperation )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:685:1: (lv_operations_6_0= ruleOperation )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:686:3: lv_operations_6_0= ruleOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransactionAccess().getOperationsOperationParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleTransaction1162);
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
            	    break loop5;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleTransaction1173); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:720:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:721:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:722:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1209);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1219); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:729:1: ruleArgument returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:734:6: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:735:1: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:735:1: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:735:2: ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:735:2: ( (lv_keyword_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:736:1: (lv_keyword_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:736:1: (lv_keyword_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:737:3: lv_keyword_0_0= RULE_ID
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1261); 

            			createLeafNode(grammarAccess.getArgumentAccess().getKeywordIDTerminalRuleCall_0_0(), "keyword"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"keyword",
            	        		lv_keyword_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:759:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:760:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:760:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:761:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1283); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:791:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:792:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:793:2: iv_ruleOperation= ruleOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1324);
            iv_ruleOperation=ruleOperation();
            _fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1334); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:800:1: ruleOperation returns [EObject current=null] : (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Decrypt_0 = null;

        EObject this_Encrypt_1 = null;

        EObject this_Send_2 = null;

        EObject this_Print_3 = null;

        EObject this_Call_4 = null;

        EObject this_Exchange_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:805:6: ( (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:806:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:806:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==26) ) {
                    alt6=3;
                }
                else if ( (LA6_3==30) ) {
                    alt6=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("806:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange )", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("806:1: (this_Decrypt_0= ruleDecrypt | this_Encrypt_1= ruleEncrypt | this_Send_2= ruleSend | this_Print_3= rulePrint | this_Call_4= ruleCall | this_Exchange_5= ruleExchange )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:807:5: this_Decrypt_0= ruleDecrypt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecrypt_in_ruleOperation1381);
                    this_Decrypt_0=ruleDecrypt();
                    _fsp--;

                     
                            current = this_Decrypt_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:817:5: this_Encrypt_1= ruleEncrypt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEncrypt_in_ruleOperation1408);
                    this_Encrypt_1=ruleEncrypt();
                    _fsp--;

                     
                            current = this_Encrypt_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:827:5: this_Send_2= ruleSend
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getSendParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSend_in_ruleOperation1435);
                    this_Send_2=ruleSend();
                    _fsp--;

                     
                            current = this_Send_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:837:5: this_Print_3= rulePrint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getPrintParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrint_in_ruleOperation1462);
                    this_Print_3=rulePrint();
                    _fsp--;

                     
                            current = this_Print_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:847:5: this_Call_4= ruleCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getCallParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleOperation1489);
                    this_Call_4=ruleCall();
                    _fsp--;

                     
                            current = this_Call_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:857:5: this_Exchange_5= ruleExchange
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOperationAccess().getExchangeParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExchange_in_ruleOperation1516);
                    this_Exchange_5=ruleExchange();
                    _fsp--;

                     
                            current = this_Exchange_5; 
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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:873:1: entryRuleDecrypt returns [EObject current=null] : iv_ruleDecrypt= ruleDecrypt EOF ;
    public final EObject entryRuleDecrypt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecrypt = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:874:2: (iv_ruleDecrypt= ruleDecrypt EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:875:2: iv_ruleDecrypt= ruleDecrypt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecryptRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecrypt_in_entryRuleDecrypt1551);
            iv_ruleDecrypt=ruleDecrypt();
            _fsp--;

             current =iv_ruleDecrypt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecrypt1561); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:882:1: ruleDecrypt returns [EObject current=null] : ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDecrypt() throws RecognitionException {
        EObject current = null;

        Token lv_message_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:887:6: ( ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:888:1: ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:888:1: ( 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:888:3: 'decrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) )
            {
            match(input,23,FOLLOW_23_in_ruleDecrypt1596); 

                    createLeafNode(grammarAccess.getDecryptAccess().getDecryptKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:892:1: ( (lv_message_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:893:1: (lv_message_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:893:1: (lv_message_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:894:3: lv_message_1_0= RULE_ID
            {
            lv_message_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecrypt1613); 

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

            match(input,24,FOLLOW_24_in_ruleDecrypt1628); 

                    createLeafNode(grammarAccess.getDecryptAccess().getForKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:920:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:921:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:921:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:922:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecryptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecrypt1646); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:942:1: entryRuleEncrypt returns [EObject current=null] : iv_ruleEncrypt= ruleEncrypt EOF ;
    public final EObject entryRuleEncrypt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEncrypt = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:943:2: (iv_ruleEncrypt= ruleEncrypt EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:944:2: iv_ruleEncrypt= ruleEncrypt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEncryptRule(), currentNode); 
            pushFollow(FOLLOW_ruleEncrypt_in_entryRuleEncrypt1682);
            iv_ruleEncrypt=ruleEncrypt();
            _fsp--;

             current =iv_ruleEncrypt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncrypt1692); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:951:1: ruleEncrypt returns [EObject current=null] : ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) ;
    public final EObject ruleEncrypt() throws RecognitionException {
        EObject current = null;

        Token lv_message_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:956:6: ( ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:957:1: ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:957:1: ( 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:957:3: 'encrypt' ( (lv_message_1_0= RULE_ID ) ) 'for' ( ( RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleEncrypt1727); 

                    createLeafNode(grammarAccess.getEncryptAccess().getEncryptKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:961:1: ( (lv_message_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:962:1: (lv_message_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:962:1: (lv_message_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:963:3: lv_message_1_0= RULE_ID
            {
            lv_message_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEncrypt1744); 

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

            match(input,24,FOLLOW_24_in_ruleEncrypt1759); 

                    createLeafNode(grammarAccess.getEncryptAccess().getForKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:989:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:990:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:990:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:991:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEncryptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEncrypt1777); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1011:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1012:2: (iv_ruleSend= ruleSend EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1013:2: iv_ruleSend= ruleSend EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSendRule(), currentNode); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend1813);
            iv_ruleSend=ruleSend();
            _fsp--;

             current =iv_ruleSend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend1823); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1020:1: ruleSend returns [EObject current=null] : ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token lv_message_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1025:6: ( ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1026:1: ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1026:1: ( ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1026:2: ( (lv_message_0_0= RULE_ID ) ) '::' ( ( RULE_ID ) ) '->' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1026:2: ( (lv_message_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1027:1: (lv_message_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1027:1: (lv_message_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1028:3: lv_message_0_0= RULE_ID
            {
            lv_message_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSend1865); 

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

            match(input,26,FOLLOW_26_in_ruleSend1880); 

                    createLeafNode(grammarAccess.getSendAccess().getColonColonKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1054:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1055:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1055:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1056:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSend1898); 

            		createLeafNode(grammarAccess.getSendAccess().getSourceEventSourceCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,27,FOLLOW_27_in_ruleSend1908); 

                    createLeafNode(grammarAccess.getSendAccess().getHyphenMNusGreaterThanSGnKeyword_3(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1072:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1073:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1073:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1074:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSend1926); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1094:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1095:2: (iv_rulePrint= rulePrint EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1096:2: iv_rulePrint= rulePrint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrintRule(), currentNode); 
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint1962);
            iv_rulePrint=rulePrint();
            _fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint1972); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1103:1: rulePrint returns [EObject current=null] : ( 'print' ( (lv_message_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token lv_message_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1108:6: ( ( 'print' ( (lv_message_1_0= RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1109:1: ( 'print' ( (lv_message_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1109:1: ( 'print' ( (lv_message_1_0= RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1109:3: 'print' ( (lv_message_1_0= RULE_ID ) )
            {
            match(input,28,FOLLOW_28_in_rulePrint2007); 

                    createLeafNode(grammarAccess.getPrintAccess().getPrintKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1113:1: ( (lv_message_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1114:1: (lv_message_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1114:1: (lv_message_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1115:3: lv_message_1_0= RULE_ID
            {
            lv_message_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrint2024); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1145:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1146:2: (iv_ruleCall= ruleCall EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1147:2: iv_ruleCall= ruleCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall2065);
            iv_ruleCall=ruleCall();
            _fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall2075); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1154:1: ruleCall returns [EObject current=null] : ( 'CALL' ( ( RULE_ID ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1159:6: ( ( 'CALL' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1160:1: ( 'CALL' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1160:1: ( 'CALL' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1160:3: 'CALL' ( ( RULE_ID ) )
            {
            match(input,29,FOLLOW_29_in_ruleCall2110); 

                    createLeafNode(grammarAccess.getCallAccess().getCALLKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1164:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1165:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1165:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1166:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall2128); 

            		createLeafNode(grammarAccess.getCallAccess().getTransactionNameTransactionCrossReference_1_0(), "transactionName"); 
            	

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
    // $ANTLR end ruleCall


    // $ANTLR start entryRuleExchange
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1186:1: entryRuleExchange returns [EObject current=null] : iv_ruleExchange= ruleExchange EOF ;
    public final EObject entryRuleExchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExchange = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1187:2: (iv_ruleExchange= ruleExchange EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1188:2: iv_ruleExchange= ruleExchange EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExchangeRule(), currentNode); 
            pushFollow(FOLLOW_ruleExchange_in_entryRuleExchange2164);
            iv_ruleExchange=ruleExchange();
            _fsp--;

             current =iv_ruleExchange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExchange2174); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1195:1: ruleExchange returns [EObject current=null] : ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) ) ;
    public final EObject ruleExchange() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1200:6: ( ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1201:1: ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1201:1: ( ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1201:2: ( ( RULE_ID ) ) 'exchange' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1201:2: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1202:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1202:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1203:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExchangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExchange2217); 

            		createLeafNode(grammarAccess.getExchangeAccess().getSourceEventSourceCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,30,FOLLOW_30_in_ruleExchange2227); 

                    createLeafNode(grammarAccess.getExchangeAccess().getExchangeKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1219:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1220:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1220:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1221:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExchangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExchange2245); 

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


    // $ANTLR start entryRuleStates
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1241:1: entryRuleStates returns [EObject current=null] : iv_ruleStates= ruleStates EOF ;
    public final EObject entryRuleStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStates = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1242:2: (iv_ruleStates= ruleStates EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1243:2: iv_ruleStates= ruleStates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleStates_in_entryRuleStates2281);
            iv_ruleStates=ruleStates();
            _fsp--;

             current =iv_ruleStates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStates2291); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1250:1: ruleStates returns [EObject current=null] : ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' ) ;
    public final EObject ruleStates() throws RecognitionException {
        EObject current = null;

        EObject lv_states_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1255:6: ( ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1256:1: ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1256:1: ( '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1256:3: '[STATES]' ( (lv_states_1_0= ruleState ) )* '[END]'
            {
            match(input,31,FOLLOW_31_in_ruleStates2326); 

                    createLeafNode(grammarAccess.getStatesAccess().getSTATESKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1260:1: ( (lv_states_1_0= ruleState ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1261:1: (lv_states_1_0= ruleState )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1261:1: (lv_states_1_0= ruleState )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1262:3: lv_states_1_0= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStates2347);
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
            	    break loop7;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleStates2358); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1296:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1297:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1298:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState2394);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2404); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1305:1: ruleState returns [EObject current=null] : ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_event_3_0 = null;

        EObject lv_guards_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1310:6: ( ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1311:1: ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1311:1: ( 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1311:3: 'STATE' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_event_3_0= ruleEvent ) ) ')' '[BEGIN]' ( (lv_guards_6_0= ruleGuard ) )* '[END]'
            {
            match(input,32,FOLLOW_32_in_ruleState2439); 

                    createLeafNode(grammarAccess.getStateAccess().getSTATEKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1315:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1316:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1316:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1317:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState2456); 

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

            match(input,20,FOLLOW_20_in_ruleState2471); 

                    createLeafNode(grammarAccess.getStateAccess().getLeftParenthesSKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1343:1: ( (lv_event_3_0= ruleEvent ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1344:1: (lv_event_3_0= ruleEvent )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1344:1: (lv_event_3_0= ruleEvent )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1345:3: lv_event_3_0= ruleEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEventEventParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleState2492);
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

            match(input,21,FOLLOW_21_in_ruleState2502); 

                    createLeafNode(grammarAccess.getStateAccess().getRGhtParenthesSKeyword_4(), null); 
                
            match(input,22,FOLLOW_22_in_ruleState2512); 

                    createLeafNode(grammarAccess.getStateAccess().getBEGINKeyword_5(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1375:1: ( (lv_guards_6_0= ruleGuard ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1376:1: (lv_guards_6_0= ruleGuard )
            	    {
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1376:1: (lv_guards_6_0= ruleGuard )
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1377:3: lv_guards_6_0= ruleGuard
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getGuardsGuardParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGuard_in_ruleState2533);
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
            	    break loop8;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleState2544); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1411:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1412:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1413:2: iv_ruleGuard= ruleGuard EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGuardRule(), currentNode); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard2580);
            iv_ruleGuard=ruleGuard();
            _fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard2590); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1420:1: ruleGuard returns [EObject current=null] : ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject lv_casem_1_0 = null;

        EObject lv_operation_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1425:6: ( ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1426:1: ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1426:1: ( '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1426:3: '|' ( (lv_casem_1_0= ruleCase ) ) '=>' ( (lv_operation_3_0= ruleOperation ) )
            {
            match(input,33,FOLLOW_33_in_ruleGuard2625); 

                    createLeafNode(grammarAccess.getGuardAccess().getVertCalLNeKeyword_0(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1430:1: ( (lv_casem_1_0= ruleCase ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1431:1: (lv_casem_1_0= ruleCase )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1431:1: (lv_casem_1_0= ruleCase )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1432:3: lv_casem_1_0= ruleCase
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGuardAccess().getCasemCaseParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCase_in_ruleGuard2646);
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

            match(input,34,FOLLOW_34_in_ruleGuard2656); 

                    createLeafNode(grammarAccess.getGuardAccess().getEqualsSGnGreaterThanSGnKeyword_2(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1458:1: ( (lv_operation_3_0= ruleOperation ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1459:1: (lv_operation_3_0= ruleOperation )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1459:1: (lv_operation_3_0= ruleOperation )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1460:3: lv_operation_3_0= ruleOperation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGuardAccess().getOperationOperationParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOperation_in_ruleGuard2677);
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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1490:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1491:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1492:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2713);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2723); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1499:1: ruleEvent returns [EObject current=null] : (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_GetEvent_0 = null;

        EObject this_IsSendEvent_1 = null;

        EObject this_Init_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1504:6: ( (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1505:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1505:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==36) ) {
                    alt9=2;
                }
                else if ( (LA9_1==35) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1505:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit )", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==37) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1505:1: (this_GetEvent_0= ruleGetEvent | this_IsSendEvent_1= ruleIsSendEvent | this_Init_2= ruleInit )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1506:5: this_GetEvent_0= ruleGetEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getGetEventParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGetEvent_in_ruleEvent2770);
                    this_GetEvent_0=ruleGetEvent();
                    _fsp--;

                     
                            current = this_GetEvent_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1516:5: this_IsSendEvent_1= ruleIsSendEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIsSendEvent_in_ruleEvent2797);
                    this_IsSendEvent_1=ruleIsSendEvent();
                    _fsp--;

                     
                            current = this_IsSendEvent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1526:5: this_Init_2= ruleInit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getInitParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInit_in_ruleEvent2824);
                    this_Init_2=ruleInit();
                    _fsp--;

                     
                            current = this_Init_2; 
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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1542:1: entryRuleGetEvent returns [EObject current=null] : iv_ruleGetEvent= ruleGetEvent EOF ;
    public final EObject entryRuleGetEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetEvent = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1543:2: (iv_ruleGetEvent= ruleGetEvent EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1544:2: iv_ruleGetEvent= ruleGetEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGetEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleGetEvent_in_entryRuleGetEvent2859);
            iv_ruleGetEvent=ruleGetEvent();
            _fsp--;

             current =iv_ruleGetEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetEvent2869); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1551:1: ruleGetEvent returns [EObject current=null] : ( ( ( RULE_ID ) ) 'GET' ( (lv_message_2_0= RULE_ID ) ) ) ;
    public final EObject ruleGetEvent() throws RecognitionException {
        EObject current = null;

        Token lv_message_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1556:6: ( ( ( ( RULE_ID ) ) 'GET' ( (lv_message_2_0= RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1557:1: ( ( ( RULE_ID ) ) 'GET' ( (lv_message_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1557:1: ( ( ( RULE_ID ) ) 'GET' ( (lv_message_2_0= RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1557:2: ( ( RULE_ID ) ) 'GET' ( (lv_message_2_0= RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1557:2: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1558:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1558:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1559:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getGetEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetEvent2912); 

            		createLeafNode(grammarAccess.getGetEventAccess().getWhoDefineCrossReference_0_0(), "who"); 
            	

            }


            }

            match(input,35,FOLLOW_35_in_ruleGetEvent2922); 

                    createLeafNode(grammarAccess.getGetEventAccess().getGETKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1575:1: ( (lv_message_2_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1576:1: (lv_message_2_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1576:1: (lv_message_2_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1577:3: lv_message_2_0= RULE_ID
            {
            lv_message_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetEvent2939); 

            			createLeafNode(grammarAccess.getGetEventAccess().getMessageIDTerminalRuleCall_2_0(), "message"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGetEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"message",
            	        		lv_message_2_0, 
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
    // $ANTLR end ruleGetEvent


    // $ANTLR start entryRuleIsSendEvent
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1607:1: entryRuleIsSendEvent returns [EObject current=null] : iv_ruleIsSendEvent= ruleIsSendEvent EOF ;
    public final EObject entryRuleIsSendEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSendEvent = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1608:2: (iv_ruleIsSendEvent= ruleIsSendEvent EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1609:2: iv_ruleIsSendEvent= ruleIsSendEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIsSendEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent2980);
            iv_ruleIsSendEvent=ruleIsSendEvent();
            _fsp--;

             current =iv_ruleIsSendEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsSendEvent2990); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1616:1: ruleIsSendEvent returns [EObject current=null] : ( ( (lv_message_0_0= RULE_ID ) ) 'IS_SEND' ) ;
    public final EObject ruleIsSendEvent() throws RecognitionException {
        EObject current = null;

        Token lv_message_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1621:6: ( ( ( (lv_message_0_0= RULE_ID ) ) 'IS_SEND' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1622:1: ( ( (lv_message_0_0= RULE_ID ) ) 'IS_SEND' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1622:1: ( ( (lv_message_0_0= RULE_ID ) ) 'IS_SEND' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1622:2: ( (lv_message_0_0= RULE_ID ) ) 'IS_SEND'
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1622:2: ( (lv_message_0_0= RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1623:1: (lv_message_0_0= RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1623:1: (lv_message_0_0= RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1624:3: lv_message_0_0= RULE_ID
            {
            lv_message_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsSendEvent3032); 

            			createLeafNode(grammarAccess.getIsSendEventAccess().getMessageIDTerminalRuleCall_0_0(), "message"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIsSendEventRule().getType().getClassifier());
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

            match(input,36,FOLLOW_36_in_ruleIsSendEvent3047); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1659:2: (iv_ruleInit= ruleInit EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1660:2: iv_ruleInit= ruleInit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitRule(), currentNode); 
            pushFollow(FOLLOW_ruleInit_in_entryRuleInit3083);
            iv_ruleInit=ruleInit();
            _fsp--;

             current =iv_ruleInit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInit3093); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1667:1: ruleInit returns [EObject current=null] : ( (lv_keyword_0_0= 'INIT' ) ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1672:6: ( ( (lv_keyword_0_0= 'INIT' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1673:1: ( (lv_keyword_0_0= 'INIT' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1673:1: ( (lv_keyword_0_0= 'INIT' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1674:1: (lv_keyword_0_0= 'INIT' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1674:1: (lv_keyword_0_0= 'INIT' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1675:3: lv_keyword_0_0= 'INIT'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_ruleInit3135); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1702:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1703:2: (iv_ruleCase= ruleCase EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1704:2: iv_ruleCase= ruleCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase3183);
            iv_ruleCase=ruleCase();
            _fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase3193); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1711:1: ruleCase returns [EObject current=null] : (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_Source_2= ruleSource | this_From_3= ruleFrom ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        EObject this_Always_0 = null;

        EObject this_Otherwise_1 = null;

        EObject this_Source_2 = null;

        EObject this_From_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1716:6: ( (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_Source_2= ruleSource | this_From_3= ruleFrom ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1717:1: (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_Source_2= ruleSource | this_From_3= ruleFrom )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1717:1: (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_Source_2= ruleSource | this_From_3= ruleFrom )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
                }
                break;
            case 41:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1717:1: (this_Always_0= ruleAlways | this_Otherwise_1= ruleOtherwise | this_Source_2= ruleSource | this_From_3= ruleFrom )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1718:5: this_Always_0= ruleAlways
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAlways_in_ruleCase3240);
                    this_Always_0=ruleAlways();
                    _fsp--;

                     
                            current = this_Always_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1728:5: this_Otherwise_1= ruleOtherwise
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOtherwise_in_ruleCase3267);
                    this_Otherwise_1=ruleOtherwise();
                    _fsp--;

                     
                            current = this_Otherwise_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1738:5: this_Source_2= ruleSource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getSourceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSource_in_ruleCase3294);
                    this_Source_2=ruleSource();
                    _fsp--;

                     
                            current = this_Source_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1748:5: this_From_3= ruleFrom
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCaseAccess().getFromParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFrom_in_ruleCase3321);
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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1764:1: entryRuleAlways returns [EObject current=null] : iv_ruleAlways= ruleAlways EOF ;
    public final EObject entryRuleAlways() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlways = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1765:2: (iv_ruleAlways= ruleAlways EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1766:2: iv_ruleAlways= ruleAlways EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAlwaysRule(), currentNode); 
            pushFollow(FOLLOW_ruleAlways_in_entryRuleAlways3356);
            iv_ruleAlways=ruleAlways();
            _fsp--;

             current =iv_ruleAlways; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlways3366); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1773:1: ruleAlways returns [EObject current=null] : ( (lv_keyword_0_0= 'always' ) ) ;
    public final EObject ruleAlways() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1778:6: ( ( (lv_keyword_0_0= 'always' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1779:1: ( (lv_keyword_0_0= 'always' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1779:1: ( (lv_keyword_0_0= 'always' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1780:1: (lv_keyword_0_0= 'always' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1780:1: (lv_keyword_0_0= 'always' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1781:3: lv_keyword_0_0= 'always'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_ruleAlways3408); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1808:1: entryRuleOtherwise returns [EObject current=null] : iv_ruleOtherwise= ruleOtherwise EOF ;
    public final EObject entryRuleOtherwise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherwise = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1809:2: (iv_ruleOtherwise= ruleOtherwise EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1810:2: iv_ruleOtherwise= ruleOtherwise EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOtherwiseRule(), currentNode); 
            pushFollow(FOLLOW_ruleOtherwise_in_entryRuleOtherwise3456);
            iv_ruleOtherwise=ruleOtherwise();
            _fsp--;

             current =iv_ruleOtherwise; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherwise3466); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1817:1: ruleOtherwise returns [EObject current=null] : ( (lv_keyword_0_0= 'otherwise' ) ) ;
    public final EObject ruleOtherwise() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1822:6: ( ( (lv_keyword_0_0= 'otherwise' ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1823:1: ( (lv_keyword_0_0= 'otherwise' ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1823:1: ( (lv_keyword_0_0= 'otherwise' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1824:1: (lv_keyword_0_0= 'otherwise' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1824:1: (lv_keyword_0_0= 'otherwise' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1825:3: lv_keyword_0_0= 'otherwise'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_ruleOtherwise3508); 

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


    // $ANTLR start entryRuleSource
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1852:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1853:2: (iv_ruleSource= ruleSource EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1854:2: iv_ruleSource= ruleSource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource3556);
            iv_ruleSource=ruleSource();
            _fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource3566); 

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
    // $ANTLR end entryRuleSource


    // $ANTLR start ruleSource
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1861:1: ruleSource returns [EObject current=null] : ( ( (lv_keyword_0_0= 'source' ) ) '=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1866:6: ( ( ( (lv_keyword_0_0= 'source' ) ) '=' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1867:1: ( ( (lv_keyword_0_0= 'source' ) ) '=' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1867:1: ( ( (lv_keyword_0_0= 'source' ) ) '=' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1867:2: ( (lv_keyword_0_0= 'source' ) ) '=' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1867:2: ( (lv_keyword_0_0= 'source' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1868:1: (lv_keyword_0_0= 'source' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1868:1: (lv_keyword_0_0= 'source' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1869:3: lv_keyword_0_0= 'source'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleSource3609); 

                    createLeafNode(grammarAccess.getSourceAccess().getKeywordSourceKeyword_0_0(), "keyword"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "keyword", lv_keyword_0_0, "source", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleSource3632); 

                    createLeafNode(grammarAccess.getSourceAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1892:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1893:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1893:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1894:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSource3650); 

            		createLeafNode(grammarAccess.getSourceAccess().getEventSourceEventSourceCrossReference_2_0(), "eventSource"); 
            	

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
    // $ANTLR end ruleSource


    // $ANTLR start entryRuleFrom
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1914:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1915:2: (iv_ruleFrom= ruleFrom EOF )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1916:2: iv_ruleFrom= ruleFrom EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFromRule(), currentNode); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom3686);
            iv_ruleFrom=ruleFrom();
            _fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom3696); 

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
    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1923:1: ruleFrom returns [EObject current=null] : ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1928:6: ( ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1929:1: ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1929:1: ( ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1929:2: ( (lv_keyword_0_0= 'from' ) ) '=' ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1929:2: ( (lv_keyword_0_0= 'from' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1930:1: (lv_keyword_0_0= 'from' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1930:1: (lv_keyword_0_0= 'from' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1931:3: lv_keyword_0_0= 'from'
            {
            lv_keyword_0_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleFrom3739); 

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

            match(input,15,FOLLOW_15_in_ruleFrom3762); 

                    createLeafNode(grammarAccess.getFromAccess().getEqualsSGnKeyword_1(), null); 
                
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1954:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1955:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1955:1: ( RULE_ID )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1956:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFromRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrom3780); 

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


 

    public static final BitSet FOLLOW_rulePDLFile_in_entryRulePDLFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePDLFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePDLFile120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePDLFile137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePDLFile152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDefinitions_in_rulePDLFile173 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleTransactions_in_rulePDLFile194 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleStates_in_rulePDLFile215 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePDLFile225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDefinitions306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventSource_in_ruleDefinitions327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCipher_in_ruleDefinitions349 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDefinitions359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSource_in_entryRuleEventSource397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSource407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitrator_in_ruleEventSource454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleEventSource481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitrator_in_entryRuleArbitrator516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitrator526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArbitrator568 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArbitrator583 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArbitrator601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParticipant702 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParticipant717 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParticipant735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCipher_in_entryRuleCipher784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCipher794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCipher836 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCipher851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCipher868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_entryRuleTransactions909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactions919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTransactions954 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_ruleTransaction_in_ruleTransactions975 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruleTransactions986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTransaction1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransaction1084 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransaction1099 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleTransaction1120 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleTransaction1131 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransaction1141 = new BitSet(new long[]{0x0000000032802010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleTransaction1162 = new BitSet(new long[]{0x0000000032802010L});
    public static final BitSet FOLLOW_13_in_ruleTransaction1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_ruleOperation1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_ruleOperation1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_ruleOperation1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_ruleOperation1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleOperation1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_ruleOperation1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_entryRuleDecrypt1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecrypt1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDecrypt1596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecrypt1613 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDecrypt1628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecrypt1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_entryRuleEncrypt1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncrypt1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEncrypt1727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEncrypt1744 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEncrypt1759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEncrypt1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend1813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSend1865 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSend1880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSend1898 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSend1908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSend1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrint2007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrint2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCall2110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_entryRuleExchange2164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExchange2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExchange2217 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExchange2227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExchange2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_entryRuleStates2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStates2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStates2326 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStates2347 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_13_in_ruleStates2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleState2439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState2456 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleState2471 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleState2492 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleState2502 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleState2512 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleState2533 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_13_in_ruleState2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGuard2625 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_ruleCase_in_ruleGuard2646 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleGuard2656 = new BitSet(new long[]{0x0000000032800010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleGuard2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_ruleEvent2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_ruleEvent2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_ruleEvent2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_entryRuleGetEvent2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetEvent2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetEvent2912 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGetEvent2922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetEvent2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent2980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsSendEvent2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsSendEvent3032 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleIsSendEvent3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_entryRuleInit3083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInit3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInit3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_ruleCase3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_ruleCase3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_ruleCase3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_ruleCase3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_entryRuleAlways3356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlways3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAlways3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_entryRuleOtherwise3456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherwise3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOtherwise3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource3556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSource3609 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSource3632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSource3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom3686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFrom3739 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFrom3762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrom3780 = new BitSet(new long[]{0x0000000000000002L});

}