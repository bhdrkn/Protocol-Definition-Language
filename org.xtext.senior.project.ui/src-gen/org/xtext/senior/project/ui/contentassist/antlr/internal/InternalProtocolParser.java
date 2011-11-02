package org.xtext.senior.project.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.senior.project.services.ProtocolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProtocolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'[END]'", "'[DEFINITIONS]'", "'='", "'[TRANSACTIONS]'", "'TRANSACTION'", "'('", "')'", "'[BEGIN]'", "'decrypt'", "'for'", "'encrypt'", "'::'", "'->'", "'print'", "'CALL'", "'exchange'", "'[STATES]'", "'STATE'", "'|'", "'=>'", "'GET'", "'IS_SEND'", "'Arbitrator'", "'Participant'", "'INIT'", "'always'", "'otherwise'", "'source'", "'from'"
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
    public String getGrammarFileName() { return "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g"; }


     
     	private ProtocolGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProtocolGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRulePDLFile
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:61:1: entryRulePDLFile : rulePDLFile EOF ;
    public final void entryRulePDLFile() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:62:1: ( rulePDLFile EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:63:1: rulePDLFile EOF
            {
             before(grammarAccess.getPDLFileRule()); 
            pushFollow(FOLLOW_rulePDLFile_in_entryRulePDLFile61);
            rulePDLFile();
            _fsp--;

             after(grammarAccess.getPDLFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePDLFile68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePDLFile


    // $ANTLR start rulePDLFile
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:70:1: rulePDLFile : ( ( rule__PDLFile__Group__0 ) ) ;
    public final void rulePDLFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:74:2: ( ( ( rule__PDLFile__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:75:1: ( ( rule__PDLFile__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:75:1: ( ( rule__PDLFile__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:76:1: ( rule__PDLFile__Group__0 )
            {
             before(grammarAccess.getPDLFileAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:77:1: ( rule__PDLFile__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:77:2: rule__PDLFile__Group__0
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__0_in_rulePDLFile94);
            rule__PDLFile__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePDLFile


    // $ANTLR start entryRuleDefinitions
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:89:1: entryRuleDefinitions : ruleDefinitions EOF ;
    public final void entryRuleDefinitions() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:90:1: ( ruleDefinitions EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:91:1: ruleDefinitions EOF
            {
             before(grammarAccess.getDefinitionsRule()); 
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions121);
            ruleDefinitions();
            _fsp--;

             after(grammarAccess.getDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDefinitions


    // $ANTLR start ruleDefinitions
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:98:1: ruleDefinitions : ( ( rule__Definitions__Group__0 ) ) ;
    public final void ruleDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:102:2: ( ( ( rule__Definitions__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:103:1: ( ( rule__Definitions__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:103:1: ( ( rule__Definitions__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:104:1: ( rule__Definitions__Group__0 )
            {
             before(grammarAccess.getDefinitionsAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:105:1: ( rule__Definitions__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:105:2: rule__Definitions__Group__0
            {
            pushFollow(FOLLOW_rule__Definitions__Group__0_in_ruleDefinitions154);
            rule__Definitions__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefinitionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefinitions


    // $ANTLR start entryRuleEventSource
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:119:1: entryRuleEventSource : ruleEventSource EOF ;
    public final void entryRuleEventSource() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:120:1: ( ruleEventSource EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:121:1: ruleEventSource EOF
            {
             before(grammarAccess.getEventSourceRule()); 
            pushFollow(FOLLOW_ruleEventSource_in_entryRuleEventSource183);
            ruleEventSource();
            _fsp--;

             after(grammarAccess.getEventSourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSource190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEventSource


    // $ANTLR start ruleEventSource
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:128:1: ruleEventSource : ( ( rule__EventSource__Alternatives ) ) ;
    public final void ruleEventSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:132:2: ( ( ( rule__EventSource__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:133:1: ( ( rule__EventSource__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:133:1: ( ( rule__EventSource__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:134:1: ( rule__EventSource__Alternatives )
            {
             before(grammarAccess.getEventSourceAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:135:1: ( rule__EventSource__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:135:2: rule__EventSource__Alternatives
            {
            pushFollow(FOLLOW_rule__EventSource__Alternatives_in_ruleEventSource216);
            rule__EventSource__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEventSourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEventSource


    // $ANTLR start entryRuleArbitrator
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:147:1: entryRuleArbitrator : ruleArbitrator EOF ;
    public final void entryRuleArbitrator() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:148:1: ( ruleArbitrator EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:149:1: ruleArbitrator EOF
            {
             before(grammarAccess.getArbitratorRule()); 
            pushFollow(FOLLOW_ruleArbitrator_in_entryRuleArbitrator243);
            ruleArbitrator();
            _fsp--;

             after(grammarAccess.getArbitratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitrator250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArbitrator


    // $ANTLR start ruleArbitrator
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:156:1: ruleArbitrator : ( ( rule__Arbitrator__Group__0 ) ) ;
    public final void ruleArbitrator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:160:2: ( ( ( rule__Arbitrator__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:161:1: ( ( rule__Arbitrator__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:161:1: ( ( rule__Arbitrator__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:162:1: ( rule__Arbitrator__Group__0 )
            {
             before(grammarAccess.getArbitratorAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:163:1: ( rule__Arbitrator__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:163:2: rule__Arbitrator__Group__0
            {
            pushFollow(FOLLOW_rule__Arbitrator__Group__0_in_ruleArbitrator276);
            rule__Arbitrator__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArbitratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArbitrator


    // $ANTLR start entryRuleParticipant
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:175:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:176:1: ( ruleParticipant EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:177:1: ruleParticipant EOF
            {
             before(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant303);
            ruleParticipant();
            _fsp--;

             after(grammarAccess.getParticipantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleParticipant


    // $ANTLR start ruleParticipant
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:184:1: ruleParticipant : ( ( rule__Participant__Group__0 ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:188:2: ( ( ( rule__Participant__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:189:1: ( ( rule__Participant__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:189:1: ( ( rule__Participant__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:190:1: ( rule__Participant__Group__0 )
            {
             before(grammarAccess.getParticipantAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:191:1: ( rule__Participant__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:191:2: rule__Participant__Group__0
            {
            pushFollow(FOLLOW_rule__Participant__Group__0_in_ruleParticipant336);
            rule__Participant__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParticipantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParticipant


    // $ANTLR start entryRuleCipher
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:203:1: entryRuleCipher : ruleCipher EOF ;
    public final void entryRuleCipher() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:204:1: ( ruleCipher EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:205:1: ruleCipher EOF
            {
             before(grammarAccess.getCipherRule()); 
            pushFollow(FOLLOW_ruleCipher_in_entryRuleCipher363);
            ruleCipher();
            _fsp--;

             after(grammarAccess.getCipherRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCipher370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCipher


    // $ANTLR start ruleCipher
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:212:1: ruleCipher : ( ( rule__Cipher__Group__0 ) ) ;
    public final void ruleCipher() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:216:2: ( ( ( rule__Cipher__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:217:1: ( ( rule__Cipher__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:217:1: ( ( rule__Cipher__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:218:1: ( rule__Cipher__Group__0 )
            {
             before(grammarAccess.getCipherAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:219:1: ( rule__Cipher__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:219:2: rule__Cipher__Group__0
            {
            pushFollow(FOLLOW_rule__Cipher__Group__0_in_ruleCipher396);
            rule__Cipher__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCipherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCipher


    // $ANTLR start entryRuleTransactions
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:231:1: entryRuleTransactions : ruleTransactions EOF ;
    public final void entryRuleTransactions() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:232:1: ( ruleTransactions EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:233:1: ruleTransactions EOF
            {
             before(grammarAccess.getTransactionsRule()); 
            pushFollow(FOLLOW_ruleTransactions_in_entryRuleTransactions423);
            ruleTransactions();
            _fsp--;

             after(grammarAccess.getTransactionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactions430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTransactions


    // $ANTLR start ruleTransactions
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:240:1: ruleTransactions : ( ( rule__Transactions__Group__0 ) ) ;
    public final void ruleTransactions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:244:2: ( ( ( rule__Transactions__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:245:1: ( ( rule__Transactions__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:245:1: ( ( rule__Transactions__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:246:1: ( rule__Transactions__Group__0 )
            {
             before(grammarAccess.getTransactionsAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:247:1: ( rule__Transactions__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:247:2: rule__Transactions__Group__0
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0_in_ruleTransactions456);
            rule__Transactions__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTransactionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTransactions


    // $ANTLR start entryRuleTransaction
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:259:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:260:1: ( ruleTransaction EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:261:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction483);
            ruleTransaction();
            _fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTransaction


    // $ANTLR start ruleTransaction
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:268:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:272:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:273:1: ( ( rule__Transaction__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:273:1: ( ( rule__Transaction__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:274:1: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:275:1: ( rule__Transaction__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:275:2: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0_in_ruleTransaction516);
            rule__Transaction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTransactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTransaction


    // $ANTLR start entryRuleArgument
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:287:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:288:1: ( ruleArgument EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:289:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument543);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:296:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:300:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:301:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:301:1: ( ( rule__Argument__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:302:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:303:1: ( rule__Argument__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:303:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument576);
            rule__Argument__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleOperation
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:315:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:316:1: ( ruleOperation EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:317:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation603);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:324:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:328:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:329:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:329:1: ( ( rule__Operation__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:330:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:331:1: ( rule__Operation__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:331:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation636);
            rule__Operation__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleDecrypt
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:343:1: entryRuleDecrypt : ruleDecrypt EOF ;
    public final void entryRuleDecrypt() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:344:1: ( ruleDecrypt EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:345:1: ruleDecrypt EOF
            {
             before(grammarAccess.getDecryptRule()); 
            pushFollow(FOLLOW_ruleDecrypt_in_entryRuleDecrypt663);
            ruleDecrypt();
            _fsp--;

             after(grammarAccess.getDecryptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecrypt670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDecrypt


    // $ANTLR start ruleDecrypt
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:352:1: ruleDecrypt : ( ( rule__Decrypt__Group__0 ) ) ;
    public final void ruleDecrypt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:356:2: ( ( ( rule__Decrypt__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:357:1: ( ( rule__Decrypt__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:357:1: ( ( rule__Decrypt__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:358:1: ( rule__Decrypt__Group__0 )
            {
             before(grammarAccess.getDecryptAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:359:1: ( rule__Decrypt__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:359:2: rule__Decrypt__Group__0
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__0_in_ruleDecrypt696);
            rule__Decrypt__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDecryptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecrypt


    // $ANTLR start entryRuleEncrypt
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:371:1: entryRuleEncrypt : ruleEncrypt EOF ;
    public final void entryRuleEncrypt() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:372:1: ( ruleEncrypt EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:373:1: ruleEncrypt EOF
            {
             before(grammarAccess.getEncryptRule()); 
            pushFollow(FOLLOW_ruleEncrypt_in_entryRuleEncrypt723);
            ruleEncrypt();
            _fsp--;

             after(grammarAccess.getEncryptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncrypt730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEncrypt


    // $ANTLR start ruleEncrypt
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:380:1: ruleEncrypt : ( ( rule__Encrypt__Group__0 ) ) ;
    public final void ruleEncrypt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:384:2: ( ( ( rule__Encrypt__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:385:1: ( ( rule__Encrypt__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:385:1: ( ( rule__Encrypt__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:386:1: ( rule__Encrypt__Group__0 )
            {
             before(grammarAccess.getEncryptAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:387:1: ( rule__Encrypt__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:387:2: rule__Encrypt__Group__0
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__0_in_ruleEncrypt756);
            rule__Encrypt__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEncryptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEncrypt


    // $ANTLR start entryRuleSend
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:399:1: entryRuleSend : ruleSend EOF ;
    public final void entryRuleSend() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:400:1: ( ruleSend EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:401:1: ruleSend EOF
            {
             before(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend783);
            ruleSend();
            _fsp--;

             after(grammarAccess.getSendRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSend


    // $ANTLR start ruleSend
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:408:1: ruleSend : ( ( rule__Send__Group__0 ) ) ;
    public final void ruleSend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:412:2: ( ( ( rule__Send__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:413:1: ( ( rule__Send__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:413:1: ( ( rule__Send__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:414:1: ( rule__Send__Group__0 )
            {
             before(grammarAccess.getSendAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:415:1: ( rule__Send__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:415:2: rule__Send__Group__0
            {
            pushFollow(FOLLOW_rule__Send__Group__0_in_ruleSend816);
            rule__Send__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSendAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSend


    // $ANTLR start entryRulePrint
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:427:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:428:1: ( rulePrint EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:429:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint843);
            rulePrint();
            _fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrint


    // $ANTLR start rulePrint
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:436:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:440:2: ( ( ( rule__Print__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:441:1: ( ( rule__Print__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:441:1: ( ( rule__Print__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:442:1: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:443:1: ( rule__Print__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:443:2: rule__Print__Group__0
            {
            pushFollow(FOLLOW_rule__Print__Group__0_in_rulePrint876);
            rule__Print__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrint


    // $ANTLR start entryRuleCall
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:455:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:456:1: ( ruleCall EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:457:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall903);
            ruleCall();
            _fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCall


    // $ANTLR start ruleCall
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:464:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:468:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:469:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:469:1: ( ( rule__Call__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:470:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:471:1: ( rule__Call__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:471:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall936);
            rule__Call__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCall


    // $ANTLR start entryRuleExchange
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:483:1: entryRuleExchange : ruleExchange EOF ;
    public final void entryRuleExchange() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:484:1: ( ruleExchange EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:485:1: ruleExchange EOF
            {
             before(grammarAccess.getExchangeRule()); 
            pushFollow(FOLLOW_ruleExchange_in_entryRuleExchange963);
            ruleExchange();
            _fsp--;

             after(grammarAccess.getExchangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExchange970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExchange


    // $ANTLR start ruleExchange
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:492:1: ruleExchange : ( ( rule__Exchange__Group__0 ) ) ;
    public final void ruleExchange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:496:2: ( ( ( rule__Exchange__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:497:1: ( ( rule__Exchange__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:497:1: ( ( rule__Exchange__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:498:1: ( rule__Exchange__Group__0 )
            {
             before(grammarAccess.getExchangeAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:499:1: ( rule__Exchange__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:499:2: rule__Exchange__Group__0
            {
            pushFollow(FOLLOW_rule__Exchange__Group__0_in_ruleExchange996);
            rule__Exchange__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExchangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExchange


    // $ANTLR start entryRuleStates
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:511:1: entryRuleStates : ruleStates EOF ;
    public final void entryRuleStates() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:512:1: ( ruleStates EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:513:1: ruleStates EOF
            {
             before(grammarAccess.getStatesRule()); 
            pushFollow(FOLLOW_ruleStates_in_entryRuleStates1023);
            ruleStates();
            _fsp--;

             after(grammarAccess.getStatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStates1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStates


    // $ANTLR start ruleStates
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:520:1: ruleStates : ( ( rule__States__Group__0 ) ) ;
    public final void ruleStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:524:2: ( ( ( rule__States__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:525:1: ( ( rule__States__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:525:1: ( ( rule__States__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:526:1: ( rule__States__Group__0 )
            {
             before(grammarAccess.getStatesAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:527:1: ( rule__States__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:527:2: rule__States__Group__0
            {
            pushFollow(FOLLOW_rule__States__Group__0_in_ruleStates1056);
            rule__States__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStates


    // $ANTLR start entryRuleState
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:539:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:540:1: ( ruleState EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:541:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1083);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:548:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:552:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:553:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:553:1: ( ( rule__State__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:554:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:555:1: ( rule__State__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:555:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState1116);
            rule__State__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleGuard
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:567:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:568:1: ( ruleGuard EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:569:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard1143);
            ruleGuard();
            _fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGuard


    // $ANTLR start ruleGuard
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:576:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:580:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:581:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:581:1: ( ( rule__Guard__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:582:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:583:1: ( rule__Guard__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:583:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard1176);
            rule__Guard__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGuard


    // $ANTLR start entryRuleEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:595:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:596:1: ( ruleEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:597:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1203);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:604:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:608:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:609:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:609:1: ( ( rule__Event__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:610:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:611:1: ( rule__Event__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:611:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent1236);
            rule__Event__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleGetEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:623:1: entryRuleGetEvent : ruleGetEvent EOF ;
    public final void entryRuleGetEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:624:1: ( ruleGetEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:625:1: ruleGetEvent EOF
            {
             before(grammarAccess.getGetEventRule()); 
            pushFollow(FOLLOW_ruleGetEvent_in_entryRuleGetEvent1263);
            ruleGetEvent();
            _fsp--;

             after(grammarAccess.getGetEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetEvent1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleGetEvent


    // $ANTLR start ruleGetEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:632:1: ruleGetEvent : ( ( rule__GetEvent__Group__0 ) ) ;
    public final void ruleGetEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:636:2: ( ( ( rule__GetEvent__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:637:1: ( ( rule__GetEvent__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:637:1: ( ( rule__GetEvent__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:638:1: ( rule__GetEvent__Group__0 )
            {
             before(grammarAccess.getGetEventAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:639:1: ( rule__GetEvent__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:639:2: rule__GetEvent__Group__0
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__0_in_ruleGetEvent1296);
            rule__GetEvent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGetEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGetEvent


    // $ANTLR start entryRuleIsSendEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:651:1: entryRuleIsSendEvent : ruleIsSendEvent EOF ;
    public final void entryRuleIsSendEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:652:1: ( ruleIsSendEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:653:1: ruleIsSendEvent EOF
            {
             before(grammarAccess.getIsSendEventRule()); 
            pushFollow(FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent1323);
            ruleIsSendEvent();
            _fsp--;

             after(grammarAccess.getIsSendEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsSendEvent1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIsSendEvent


    // $ANTLR start ruleIsSendEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:660:1: ruleIsSendEvent : ( ( rule__IsSendEvent__Group__0 ) ) ;
    public final void ruleIsSendEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:664:2: ( ( ( rule__IsSendEvent__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:665:1: ( ( rule__IsSendEvent__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:665:1: ( ( rule__IsSendEvent__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:666:1: ( rule__IsSendEvent__Group__0 )
            {
             before(grammarAccess.getIsSendEventAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:667:1: ( rule__IsSendEvent__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:667:2: rule__IsSendEvent__Group__0
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__0_in_ruleIsSendEvent1356);
            rule__IsSendEvent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIsSendEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIsSendEvent


    // $ANTLR start entryRuleInit
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:679:1: entryRuleInit : ruleInit EOF ;
    public final void entryRuleInit() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:680:1: ( ruleInit EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:681:1: ruleInit EOF
            {
             before(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_ruleInit_in_entryRuleInit1383);
            ruleInit();
            _fsp--;

             after(grammarAccess.getInitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInit1390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInit


    // $ANTLR start ruleInit
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:688:1: ruleInit : ( ( rule__Init__KeywordAssignment ) ) ;
    public final void ruleInit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:692:2: ( ( ( rule__Init__KeywordAssignment ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:693:1: ( ( rule__Init__KeywordAssignment ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:693:1: ( ( rule__Init__KeywordAssignment ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:694:1: ( rule__Init__KeywordAssignment )
            {
             before(grammarAccess.getInitAccess().getKeywordAssignment()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:695:1: ( rule__Init__KeywordAssignment )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:695:2: rule__Init__KeywordAssignment
            {
            pushFollow(FOLLOW_rule__Init__KeywordAssignment_in_ruleInit1416);
            rule__Init__KeywordAssignment();
            _fsp--;


            }

             after(grammarAccess.getInitAccess().getKeywordAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInit


    // $ANTLR start entryRuleCase
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:707:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:708:1: ( ruleCase EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:709:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase1443);
            ruleCase();
            _fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCase


    // $ANTLR start ruleCase
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:716:1: ruleCase : ( ( rule__Case__Alternatives ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:720:2: ( ( ( rule__Case__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:721:1: ( ( rule__Case__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:721:1: ( ( rule__Case__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:722:1: ( rule__Case__Alternatives )
            {
             before(grammarAccess.getCaseAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:723:1: ( rule__Case__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:723:2: rule__Case__Alternatives
            {
            pushFollow(FOLLOW_rule__Case__Alternatives_in_ruleCase1476);
            rule__Case__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCaseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCase


    // $ANTLR start entryRuleAlways
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:735:1: entryRuleAlways : ruleAlways EOF ;
    public final void entryRuleAlways() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:736:1: ( ruleAlways EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:737:1: ruleAlways EOF
            {
             before(grammarAccess.getAlwaysRule()); 
            pushFollow(FOLLOW_ruleAlways_in_entryRuleAlways1503);
            ruleAlways();
            _fsp--;

             after(grammarAccess.getAlwaysRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlways1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAlways


    // $ANTLR start ruleAlways
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:744:1: ruleAlways : ( ( rule__Always__KeywordAssignment ) ) ;
    public final void ruleAlways() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:748:2: ( ( ( rule__Always__KeywordAssignment ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:749:1: ( ( rule__Always__KeywordAssignment ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:749:1: ( ( rule__Always__KeywordAssignment ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:750:1: ( rule__Always__KeywordAssignment )
            {
             before(grammarAccess.getAlwaysAccess().getKeywordAssignment()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:751:1: ( rule__Always__KeywordAssignment )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:751:2: rule__Always__KeywordAssignment
            {
            pushFollow(FOLLOW_rule__Always__KeywordAssignment_in_ruleAlways1536);
            rule__Always__KeywordAssignment();
            _fsp--;


            }

             after(grammarAccess.getAlwaysAccess().getKeywordAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAlways


    // $ANTLR start entryRuleOtherwise
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:763:1: entryRuleOtherwise : ruleOtherwise EOF ;
    public final void entryRuleOtherwise() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:764:1: ( ruleOtherwise EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:765:1: ruleOtherwise EOF
            {
             before(grammarAccess.getOtherwiseRule()); 
            pushFollow(FOLLOW_ruleOtherwise_in_entryRuleOtherwise1563);
            ruleOtherwise();
            _fsp--;

             after(grammarAccess.getOtherwiseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherwise1570); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOtherwise


    // $ANTLR start ruleOtherwise
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:772:1: ruleOtherwise : ( ( rule__Otherwise__KeywordAssignment ) ) ;
    public final void ruleOtherwise() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:776:2: ( ( ( rule__Otherwise__KeywordAssignment ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:777:1: ( ( rule__Otherwise__KeywordAssignment ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:777:1: ( ( rule__Otherwise__KeywordAssignment ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:778:1: ( rule__Otherwise__KeywordAssignment )
            {
             before(grammarAccess.getOtherwiseAccess().getKeywordAssignment()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:779:1: ( rule__Otherwise__KeywordAssignment )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:779:2: rule__Otherwise__KeywordAssignment
            {
            pushFollow(FOLLOW_rule__Otherwise__KeywordAssignment_in_ruleOtherwise1596);
            rule__Otherwise__KeywordAssignment();
            _fsp--;


            }

             after(grammarAccess.getOtherwiseAccess().getKeywordAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOtherwise


    // $ANTLR start entryRuleSource
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:791:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:792:1: ( ruleSource EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:793:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource1623);
            ruleSource();
            _fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource1630); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSource


    // $ANTLR start ruleSource
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:800:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:804:2: ( ( ( rule__Source__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:805:1: ( ( rule__Source__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:805:1: ( ( rule__Source__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:806:1: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:807:1: ( rule__Source__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:807:2: rule__Source__Group__0
            {
            pushFollow(FOLLOW_rule__Source__Group__0_in_ruleSource1656);
            rule__Source__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSource


    // $ANTLR start entryRuleFrom
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:819:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:820:1: ( ruleFrom EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:821:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom1683);
            ruleFrom();
            _fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom1690); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFrom


    // $ANTLR start ruleFrom
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:828:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:832:2: ( ( ( rule__From__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:833:1: ( ( rule__From__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:833:1: ( ( rule__From__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:834:1: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:835:1: ( rule__From__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:835:2: rule__From__Group__0
            {
            pushFollow(FOLLOW_rule__From__Group__0_in_ruleFrom1716);
            rule__From__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFrom


    // $ANTLR start rule__EventSource__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:848:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );
    public final void rule__EventSource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:852:1: ( ( ruleArbitrator ) | ( ruleParticipant ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==15) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==35) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==36) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("848:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("848:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("848:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:853:1: ( ruleArbitrator )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:853:1: ( ruleArbitrator )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:854:1: ruleArbitrator
                    {
                     before(grammarAccess.getEventSourceAccess().getArbitratorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleArbitrator_in_rule__EventSource__Alternatives1753);
                    ruleArbitrator();
                    _fsp--;

                     after(grammarAccess.getEventSourceAccess().getArbitratorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:859:6: ( ruleParticipant )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:859:6: ( ruleParticipant )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:860:1: ruleParticipant
                    {
                     before(grammarAccess.getEventSourceAccess().getParticipantParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParticipant_in_rule__EventSource__Alternatives1770);
                    ruleParticipant();
                    _fsp--;

                     after(grammarAccess.getEventSourceAccess().getParticipantParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EventSource__Alternatives


    // $ANTLR start rule__Operation__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:870:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:874:1: ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==24) ) {
                    alt2=3;
                }
                else if ( (LA2_3==28) ) {
                    alt2=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("870:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) );", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("870:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:875:1: ( ruleDecrypt )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:875:1: ( ruleDecrypt )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:876:1: ruleDecrypt
                    {
                     before(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecrypt_in_rule__Operation__Alternatives1802);
                    ruleDecrypt();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:881:6: ( ruleEncrypt )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:881:6: ( ruleEncrypt )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:882:1: ruleEncrypt
                    {
                     before(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEncrypt_in_rule__Operation__Alternatives1819);
                    ruleEncrypt();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:887:6: ( ruleSend )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:887:6: ( ruleSend )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:888:1: ruleSend
                    {
                     before(grammarAccess.getOperationAccess().getSendParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__Operation__Alternatives1836);
                    ruleSend();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getSendParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:893:6: ( rulePrint )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:893:6: ( rulePrint )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:894:1: rulePrint
                    {
                     before(grammarAccess.getOperationAccess().getPrintParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePrint_in_rule__Operation__Alternatives1853);
                    rulePrint();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getPrintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:899:6: ( ruleCall )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:899:6: ( ruleCall )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:900:1: ruleCall
                    {
                     before(grammarAccess.getOperationAccess().getCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__Operation__Alternatives1870);
                    ruleCall();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:905:6: ( ruleExchange )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:905:6: ( ruleExchange )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:906:1: ruleExchange
                    {
                     before(grammarAccess.getOperationAccess().getExchangeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleExchange_in_rule__Operation__Alternatives1887);
                    ruleExchange();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getExchangeParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operation__Alternatives


    // $ANTLR start rule__Event__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:916:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:920:1: ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==33) ) {
                    alt3=1;
                }
                else if ( (LA3_1==34) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("916:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==37) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("916:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:921:1: ( ruleGetEvent )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:921:1: ( ruleGetEvent )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:922:1: ruleGetEvent
                    {
                     before(grammarAccess.getEventAccess().getGetEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGetEvent_in_rule__Event__Alternatives1919);
                    ruleGetEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getGetEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:927:6: ( ruleIsSendEvent )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:927:6: ( ruleIsSendEvent )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:928:1: ruleIsSendEvent
                    {
                     before(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIsSendEvent_in_rule__Event__Alternatives1936);
                    ruleIsSendEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:933:6: ( ruleInit )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:933:6: ( ruleInit )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:934:1: ruleInit
                    {
                     before(grammarAccess.getEventAccess().getInitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInit_in_rule__Event__Alternatives1953);
                    ruleInit();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getInitParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__Alternatives


    // $ANTLR start rule__Case__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:944:1: rule__Case__Alternatives : ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleSource ) | ( ruleFrom ) );
    public final void rule__Case__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:948:1: ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleSource ) | ( ruleFrom ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 41:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("944:1: rule__Case__Alternatives : ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleSource ) | ( ruleFrom ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:949:1: ( ruleAlways )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:949:1: ( ruleAlways )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:950:1: ruleAlways
                    {
                     before(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAlways_in_rule__Case__Alternatives1985);
                    ruleAlways();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:955:6: ( ruleOtherwise )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:955:6: ( ruleOtherwise )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:956:1: ruleOtherwise
                    {
                     before(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOtherwise_in_rule__Case__Alternatives2002);
                    ruleOtherwise();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:961:6: ( ruleSource )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:961:6: ( ruleSource )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:962:1: ruleSource
                    {
                     before(grammarAccess.getCaseAccess().getSourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSource_in_rule__Case__Alternatives2019);
                    ruleSource();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getSourceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:967:6: ( ruleFrom )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:967:6: ( ruleFrom )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:968:1: ruleFrom
                    {
                     before(grammarAccess.getCaseAccess().getFromParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFrom_in_rule__Case__Alternatives2036);
                    ruleFrom();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getFromParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Case__Alternatives


    // $ANTLR start rule__PDLFile__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:980:1: rule__PDLFile__Group__0 : rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1 ;
    public final void rule__PDLFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:984:1: ( rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:985:2: rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__0__Impl_in_rule__PDLFile__Group__02066);
            rule__PDLFile__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__1_in_rule__PDLFile__Group__02069);
            rule__PDLFile__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__0


    // $ANTLR start rule__PDLFile__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:992:1: rule__PDLFile__Group__0__Impl : ( '[' ) ;
    public final void rule__PDLFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:996:1: ( ( '[' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:997:1: ( '[' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:997:1: ( '[' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:998:1: '['
            {
             before(grammarAccess.getPDLFileAccess().getLeftSquareBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__PDLFile__Group__0__Impl2097); 
             after(grammarAccess.getPDLFileAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__0__Impl


    // $ANTLR start rule__PDLFile__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1011:1: rule__PDLFile__Group__1 : rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2 ;
    public final void rule__PDLFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1015:1: ( rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1016:2: rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__1__Impl_in_rule__PDLFile__Group__12128);
            rule__PDLFile__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__2_in_rule__PDLFile__Group__12131);
            rule__PDLFile__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__1


    // $ANTLR start rule__PDLFile__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1023:1: rule__PDLFile__Group__1__Impl : ( ( rule__PDLFile__NameAssignment_1 ) ) ;
    public final void rule__PDLFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1027:1: ( ( ( rule__PDLFile__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1028:1: ( ( rule__PDLFile__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1028:1: ( ( rule__PDLFile__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1029:1: ( rule__PDLFile__NameAssignment_1 )
            {
             before(grammarAccess.getPDLFileAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1030:1: ( rule__PDLFile__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1030:2: rule__PDLFile__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PDLFile__NameAssignment_1_in_rule__PDLFile__Group__1__Impl2158);
            rule__PDLFile__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__1__Impl


    // $ANTLR start rule__PDLFile__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1040:1: rule__PDLFile__Group__2 : rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3 ;
    public final void rule__PDLFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1044:1: ( rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1045:2: rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__2__Impl_in_rule__PDLFile__Group__22188);
            rule__PDLFile__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__3_in_rule__PDLFile__Group__22191);
            rule__PDLFile__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__2


    // $ANTLR start rule__PDLFile__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1052:1: rule__PDLFile__Group__2__Impl : ( ']' ) ;
    public final void rule__PDLFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1056:1: ( ( ']' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1057:1: ( ']' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1057:1: ( ']' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1058:1: ']'
            {
             before(grammarAccess.getPDLFileAccess().getRGhtSquareBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__PDLFile__Group__2__Impl2219); 
             after(grammarAccess.getPDLFileAccess().getRGhtSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__2__Impl


    // $ANTLR start rule__PDLFile__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1071:1: rule__PDLFile__Group__3 : rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4 ;
    public final void rule__PDLFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1075:1: ( rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1076:2: rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__3__Impl_in_rule__PDLFile__Group__32250);
            rule__PDLFile__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__4_in_rule__PDLFile__Group__32253);
            rule__PDLFile__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__3


    // $ANTLR start rule__PDLFile__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1083:1: rule__PDLFile__Group__3__Impl : ( ( rule__PDLFile__DefinitionAssignment_3 ) ) ;
    public final void rule__PDLFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1087:1: ( ( ( rule__PDLFile__DefinitionAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1088:1: ( ( rule__PDLFile__DefinitionAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1088:1: ( ( rule__PDLFile__DefinitionAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1089:1: ( rule__PDLFile__DefinitionAssignment_3 )
            {
             before(grammarAccess.getPDLFileAccess().getDefinitionAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1090:1: ( rule__PDLFile__DefinitionAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1090:2: rule__PDLFile__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__PDLFile__DefinitionAssignment_3_in_rule__PDLFile__Group__3__Impl2280);
            rule__PDLFile__DefinitionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__3__Impl


    // $ANTLR start rule__PDLFile__Group__4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1100:1: rule__PDLFile__Group__4 : rule__PDLFile__Group__4__Impl rule__PDLFile__Group__5 ;
    public final void rule__PDLFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1104:1: ( rule__PDLFile__Group__4__Impl rule__PDLFile__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1105:2: rule__PDLFile__Group__4__Impl rule__PDLFile__Group__5
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__4__Impl_in_rule__PDLFile__Group__42310);
            rule__PDLFile__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__5_in_rule__PDLFile__Group__42313);
            rule__PDLFile__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__4


    // $ANTLR start rule__PDLFile__Group__4__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1112:1: rule__PDLFile__Group__4__Impl : ( ( rule__PDLFile__TransactionAssignment_4 ) ) ;
    public final void rule__PDLFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1116:1: ( ( ( rule__PDLFile__TransactionAssignment_4 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1117:1: ( ( rule__PDLFile__TransactionAssignment_4 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1117:1: ( ( rule__PDLFile__TransactionAssignment_4 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1118:1: ( rule__PDLFile__TransactionAssignment_4 )
            {
             before(grammarAccess.getPDLFileAccess().getTransactionAssignment_4()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1119:1: ( rule__PDLFile__TransactionAssignment_4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1119:2: rule__PDLFile__TransactionAssignment_4
            {
            pushFollow(FOLLOW_rule__PDLFile__TransactionAssignment_4_in_rule__PDLFile__Group__4__Impl2340);
            rule__PDLFile__TransactionAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getTransactionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__4__Impl


    // $ANTLR start rule__PDLFile__Group__5
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1129:1: rule__PDLFile__Group__5 : rule__PDLFile__Group__5__Impl rule__PDLFile__Group__6 ;
    public final void rule__PDLFile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1133:1: ( rule__PDLFile__Group__5__Impl rule__PDLFile__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1134:2: rule__PDLFile__Group__5__Impl rule__PDLFile__Group__6
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__5__Impl_in_rule__PDLFile__Group__52370);
            rule__PDLFile__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__6_in_rule__PDLFile__Group__52373);
            rule__PDLFile__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__5


    // $ANTLR start rule__PDLFile__Group__5__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1141:1: rule__PDLFile__Group__5__Impl : ( ( rule__PDLFile__StateAssignment_5 ) ) ;
    public final void rule__PDLFile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1145:1: ( ( ( rule__PDLFile__StateAssignment_5 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1146:1: ( ( rule__PDLFile__StateAssignment_5 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1146:1: ( ( rule__PDLFile__StateAssignment_5 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1147:1: ( rule__PDLFile__StateAssignment_5 )
            {
             before(grammarAccess.getPDLFileAccess().getStateAssignment_5()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1148:1: ( rule__PDLFile__StateAssignment_5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1148:2: rule__PDLFile__StateAssignment_5
            {
            pushFollow(FOLLOW_rule__PDLFile__StateAssignment_5_in_rule__PDLFile__Group__5__Impl2400);
            rule__PDLFile__StateAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getStateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__5__Impl


    // $ANTLR start rule__PDLFile__Group__6
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1158:1: rule__PDLFile__Group__6 : rule__PDLFile__Group__6__Impl ;
    public final void rule__PDLFile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1162:1: ( rule__PDLFile__Group__6__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1163:2: rule__PDLFile__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__6__Impl_in_rule__PDLFile__Group__62430);
            rule__PDLFile__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__6


    // $ANTLR start rule__PDLFile__Group__6__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1169:1: rule__PDLFile__Group__6__Impl : ( '[END]' ) ;
    public final void rule__PDLFile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1173:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1174:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1174:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1175:1: '[END]'
            {
             before(grammarAccess.getPDLFileAccess().getENDKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__PDLFile__Group__6__Impl2458); 
             after(grammarAccess.getPDLFileAccess().getENDKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__Group__6__Impl


    // $ANTLR start rule__Definitions__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1202:1: rule__Definitions__Group__0 : rule__Definitions__Group__0__Impl rule__Definitions__Group__1 ;
    public final void rule__Definitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1206:1: ( rule__Definitions__Group__0__Impl rule__Definitions__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1207:2: rule__Definitions__Group__0__Impl rule__Definitions__Group__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__02503);
            rule__Definitions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__02506);
            rule__Definitions__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__0


    // $ANTLR start rule__Definitions__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1214:1: rule__Definitions__Group__0__Impl : ( '[DEFINITIONS]' ) ;
    public final void rule__Definitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1218:1: ( ( '[DEFINITIONS]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1219:1: ( '[DEFINITIONS]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1219:1: ( '[DEFINITIONS]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1220:1: '[DEFINITIONS]'
            {
             before(grammarAccess.getDefinitionsAccess().getDEFINITIONSKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Definitions__Group__0__Impl2534); 
             after(grammarAccess.getDefinitionsAccess().getDEFINITIONSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__0__Impl


    // $ANTLR start rule__Definitions__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1233:1: rule__Definitions__Group__1 : rule__Definitions__Group__1__Impl rule__Definitions__Group__2 ;
    public final void rule__Definitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1237:1: ( rule__Definitions__Group__1__Impl rule__Definitions__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1238:2: rule__Definitions__Group__1__Impl rule__Definitions__Group__2
            {
            pushFollow(FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__12565);
            rule__Definitions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__12568);
            rule__Definitions__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__1


    // $ANTLR start rule__Definitions__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1245:1: rule__Definitions__Group__1__Impl : ( ( rule__Definitions__SourcesAssignment_1 )* ) ;
    public final void rule__Definitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1249:1: ( ( ( rule__Definitions__SourcesAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1250:1: ( ( rule__Definitions__SourcesAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1250:1: ( ( rule__Definitions__SourcesAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1251:1: ( rule__Definitions__SourcesAssignment_1 )*
            {
             before(grammarAccess.getDefinitionsAccess().getSourcesAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1252:1: ( rule__Definitions__SourcesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==15) ) {
                        int LA5_2 = input.LA(3);

                        if ( ((LA5_2>=35 && LA5_2<=36)) ) {
                            alt5=1;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1252:2: rule__Definitions__SourcesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Definitions__SourcesAssignment_1_in_rule__Definitions__Group__1__Impl2595);
            	    rule__Definitions__SourcesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDefinitionsAccess().getSourcesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__1__Impl


    // $ANTLR start rule__Definitions__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1262:1: rule__Definitions__Group__2 : rule__Definitions__Group__2__Impl rule__Definitions__Group__3 ;
    public final void rule__Definitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1266:1: ( rule__Definitions__Group__2__Impl rule__Definitions__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1267:2: rule__Definitions__Group__2__Impl rule__Definitions__Group__3
            {
            pushFollow(FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__22626);
            rule__Definitions__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__3_in_rule__Definitions__Group__22629);
            rule__Definitions__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__2


    // $ANTLR start rule__Definitions__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1274:1: rule__Definitions__Group__2__Impl : ( ( rule__Definitions__CipherAssignment_2 ) ) ;
    public final void rule__Definitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1278:1: ( ( ( rule__Definitions__CipherAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1279:1: ( ( rule__Definitions__CipherAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1279:1: ( ( rule__Definitions__CipherAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1280:1: ( rule__Definitions__CipherAssignment_2 )
            {
             before(grammarAccess.getDefinitionsAccess().getCipherAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1281:1: ( rule__Definitions__CipherAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1281:2: rule__Definitions__CipherAssignment_2
            {
            pushFollow(FOLLOW_rule__Definitions__CipherAssignment_2_in_rule__Definitions__Group__2__Impl2656);
            rule__Definitions__CipherAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefinitionsAccess().getCipherAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__2__Impl


    // $ANTLR start rule__Definitions__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1291:1: rule__Definitions__Group__3 : rule__Definitions__Group__3__Impl ;
    public final void rule__Definitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1295:1: ( rule__Definitions__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1296:2: rule__Definitions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group__3__Impl_in_rule__Definitions__Group__32686);
            rule__Definitions__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__3


    // $ANTLR start rule__Definitions__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1302:1: rule__Definitions__Group__3__Impl : ( '[END]' ) ;
    public final void rule__Definitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1306:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1307:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1307:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1308:1: '[END]'
            {
             before(grammarAccess.getDefinitionsAccess().getENDKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Definitions__Group__3__Impl2714); 
             after(grammarAccess.getDefinitionsAccess().getENDKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__Group__3__Impl


    // $ANTLR start rule__Arbitrator__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1329:1: rule__Arbitrator__Group__0 : rule__Arbitrator__Group__0__Impl rule__Arbitrator__Group__1 ;
    public final void rule__Arbitrator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1333:1: ( rule__Arbitrator__Group__0__Impl rule__Arbitrator__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1334:2: rule__Arbitrator__Group__0__Impl rule__Arbitrator__Group__1
            {
            pushFollow(FOLLOW_rule__Arbitrator__Group__0__Impl_in_rule__Arbitrator__Group__02753);
            rule__Arbitrator__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arbitrator__Group__1_in_rule__Arbitrator__Group__02756);
            rule__Arbitrator__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__Group__0


    // $ANTLR start rule__Arbitrator__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1341:1: rule__Arbitrator__Group__0__Impl : ( ( rule__Arbitrator__NameAssignment_0 ) ) ;
    public final void rule__Arbitrator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1345:1: ( ( ( rule__Arbitrator__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1346:1: ( ( rule__Arbitrator__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1346:1: ( ( rule__Arbitrator__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1347:1: ( rule__Arbitrator__NameAssignment_0 )
            {
             before(grammarAccess.getArbitratorAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1348:1: ( rule__Arbitrator__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1348:2: rule__Arbitrator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Arbitrator__NameAssignment_0_in_rule__Arbitrator__Group__0__Impl2783);
            rule__Arbitrator__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArbitratorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__Group__0__Impl


    // $ANTLR start rule__Arbitrator__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1358:1: rule__Arbitrator__Group__1 : rule__Arbitrator__Group__1__Impl rule__Arbitrator__Group__2 ;
    public final void rule__Arbitrator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1362:1: ( rule__Arbitrator__Group__1__Impl rule__Arbitrator__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1363:2: rule__Arbitrator__Group__1__Impl rule__Arbitrator__Group__2
            {
            pushFollow(FOLLOW_rule__Arbitrator__Group__1__Impl_in_rule__Arbitrator__Group__12813);
            rule__Arbitrator__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arbitrator__Group__2_in_rule__Arbitrator__Group__12816);
            rule__Arbitrator__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__Group__1


    // $ANTLR start rule__Arbitrator__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1370:1: rule__Arbitrator__Group__1__Impl : ( '=' ) ;
    public final void rule__Arbitrator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1374:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1375:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1375:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1376:1: '='
            {
             before(grammarAccess.getArbitratorAccess().getEqualsSGnKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Arbitrator__Group__1__Impl2844); 
             after(grammarAccess.getArbitratorAccess().getEqualsSGnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__Group__1__Impl


    // $ANTLR start rule__Arbitrator__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1389:1: rule__Arbitrator__Group__2 : rule__Arbitrator__Group__2__Impl ;
    public final void rule__Arbitrator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1393:1: ( rule__Arbitrator__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1394:2: rule__Arbitrator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Arbitrator__Group__2__Impl_in_rule__Arbitrator__Group__22875);
            rule__Arbitrator__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__Group__2


    // $ANTLR start rule__Arbitrator__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1400:1: rule__Arbitrator__Group__2__Impl : ( ( rule__Arbitrator__KeywordAssignment_2 ) ) ;
    public final void rule__Arbitrator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1404:1: ( ( ( rule__Arbitrator__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1405:1: ( ( rule__Arbitrator__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1405:1: ( ( rule__Arbitrator__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1406:1: ( rule__Arbitrator__KeywordAssignment_2 )
            {
             before(grammarAccess.getArbitratorAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1407:1: ( rule__Arbitrator__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1407:2: rule__Arbitrator__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Arbitrator__KeywordAssignment_2_in_rule__Arbitrator__Group__2__Impl2902);
            rule__Arbitrator__KeywordAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getArbitratorAccess().getKeywordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__Group__2__Impl


    // $ANTLR start rule__Participant__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1423:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1427:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1428:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
            {
            pushFollow(FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__02938);
            rule__Participant__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__02941);
            rule__Participant__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__Group__0


    // $ANTLR start rule__Participant__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1435:1: rule__Participant__Group__0__Impl : ( ( rule__Participant__NameAssignment_0 ) ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1439:1: ( ( ( rule__Participant__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1440:1: ( ( rule__Participant__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1440:1: ( ( rule__Participant__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1441:1: ( rule__Participant__NameAssignment_0 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1442:1: ( rule__Participant__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1442:2: rule__Participant__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl2968);
            rule__Participant__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParticipantAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__Group__0__Impl


    // $ANTLR start rule__Participant__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1452:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1456:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1457:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
            {
            pushFollow(FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__12998);
            rule__Participant__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__13001);
            rule__Participant__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__Group__1


    // $ANTLR start rule__Participant__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1464:1: rule__Participant__Group__1__Impl : ( '=' ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1468:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1469:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1469:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1470:1: '='
            {
             before(grammarAccess.getParticipantAccess().getEqualsSGnKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Participant__Group__1__Impl3029); 
             after(grammarAccess.getParticipantAccess().getEqualsSGnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__Group__1__Impl


    // $ANTLR start rule__Participant__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1483:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1487:1: ( rule__Participant__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1488:2: rule__Participant__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__23060);
            rule__Participant__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__Group__2


    // $ANTLR start rule__Participant__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1494:1: rule__Participant__Group__2__Impl : ( ( rule__Participant__KeywordAssignment_2 ) ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1498:1: ( ( ( rule__Participant__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1499:1: ( ( rule__Participant__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1499:1: ( ( rule__Participant__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1500:1: ( rule__Participant__KeywordAssignment_2 )
            {
             before(grammarAccess.getParticipantAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1501:1: ( rule__Participant__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1501:2: rule__Participant__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Participant__KeywordAssignment_2_in_rule__Participant__Group__2__Impl3087);
            rule__Participant__KeywordAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getParticipantAccess().getKeywordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__Group__2__Impl


    // $ANTLR start rule__Cipher__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1517:1: rule__Cipher__Group__0 : rule__Cipher__Group__0__Impl rule__Cipher__Group__1 ;
    public final void rule__Cipher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1521:1: ( rule__Cipher__Group__0__Impl rule__Cipher__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1522:2: rule__Cipher__Group__0__Impl rule__Cipher__Group__1
            {
            pushFollow(FOLLOW_rule__Cipher__Group__0__Impl_in_rule__Cipher__Group__03123);
            rule__Cipher__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Cipher__Group__1_in_rule__Cipher__Group__03126);
            rule__Cipher__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__Group__0


    // $ANTLR start rule__Cipher__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1529:1: rule__Cipher__Group__0__Impl : ( ( rule__Cipher__NameAssignment_0 ) ) ;
    public final void rule__Cipher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1533:1: ( ( ( rule__Cipher__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1534:1: ( ( rule__Cipher__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1534:1: ( ( rule__Cipher__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1535:1: ( rule__Cipher__NameAssignment_0 )
            {
             before(grammarAccess.getCipherAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1536:1: ( rule__Cipher__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1536:2: rule__Cipher__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Cipher__NameAssignment_0_in_rule__Cipher__Group__0__Impl3153);
            rule__Cipher__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCipherAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__Group__0__Impl


    // $ANTLR start rule__Cipher__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1546:1: rule__Cipher__Group__1 : rule__Cipher__Group__1__Impl rule__Cipher__Group__2 ;
    public final void rule__Cipher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1550:1: ( rule__Cipher__Group__1__Impl rule__Cipher__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1551:2: rule__Cipher__Group__1__Impl rule__Cipher__Group__2
            {
            pushFollow(FOLLOW_rule__Cipher__Group__1__Impl_in_rule__Cipher__Group__13183);
            rule__Cipher__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Cipher__Group__2_in_rule__Cipher__Group__13186);
            rule__Cipher__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__Group__1


    // $ANTLR start rule__Cipher__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1558:1: rule__Cipher__Group__1__Impl : ( '=' ) ;
    public final void rule__Cipher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1562:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1563:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1563:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1564:1: '='
            {
             before(grammarAccess.getCipherAccess().getEqualsSGnKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Cipher__Group__1__Impl3214); 
             after(grammarAccess.getCipherAccess().getEqualsSGnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__Group__1__Impl


    // $ANTLR start rule__Cipher__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1577:1: rule__Cipher__Group__2 : rule__Cipher__Group__2__Impl ;
    public final void rule__Cipher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1581:1: ( rule__Cipher__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1582:2: rule__Cipher__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cipher__Group__2__Impl_in_rule__Cipher__Group__23245);
            rule__Cipher__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__Group__2


    // $ANTLR start rule__Cipher__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1588:1: rule__Cipher__Group__2__Impl : ( ( rule__Cipher__KeywordAssignment_2 ) ) ;
    public final void rule__Cipher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1592:1: ( ( ( rule__Cipher__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1593:1: ( ( rule__Cipher__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1593:1: ( ( rule__Cipher__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1594:1: ( rule__Cipher__KeywordAssignment_2 )
            {
             before(grammarAccess.getCipherAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1595:1: ( rule__Cipher__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1595:2: rule__Cipher__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Cipher__KeywordAssignment_2_in_rule__Cipher__Group__2__Impl3272);
            rule__Cipher__KeywordAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCipherAccess().getKeywordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__Group__2__Impl


    // $ANTLR start rule__Transactions__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1611:1: rule__Transactions__Group__0 : rule__Transactions__Group__0__Impl rule__Transactions__Group__1 ;
    public final void rule__Transactions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1615:1: ( rule__Transactions__Group__0__Impl rule__Transactions__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1616:2: rule__Transactions__Group__0__Impl rule__Transactions__Group__1
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__03308);
            rule__Transactions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__03311);
            rule__Transactions__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transactions__Group__0


    // $ANTLR start rule__Transactions__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1623:1: rule__Transactions__Group__0__Impl : ( '[TRANSACTIONS]' ) ;
    public final void rule__Transactions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1627:1: ( ( '[TRANSACTIONS]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1628:1: ( '[TRANSACTIONS]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1628:1: ( '[TRANSACTIONS]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1629:1: '[TRANSACTIONS]'
            {
             before(grammarAccess.getTransactionsAccess().getTRANSACTIONSKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Transactions__Group__0__Impl3339); 
             after(grammarAccess.getTransactionsAccess().getTRANSACTIONSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transactions__Group__0__Impl


    // $ANTLR start rule__Transactions__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1642:1: rule__Transactions__Group__1 : rule__Transactions__Group__1__Impl rule__Transactions__Group__2 ;
    public final void rule__Transactions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1646:1: ( rule__Transactions__Group__1__Impl rule__Transactions__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1647:2: rule__Transactions__Group__1__Impl rule__Transactions__Group__2
            {
            pushFollow(FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__13370);
            rule__Transactions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transactions__Group__2_in_rule__Transactions__Group__13373);
            rule__Transactions__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transactions__Group__1


    // $ANTLR start rule__Transactions__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1654:1: rule__Transactions__Group__1__Impl : ( ( rule__Transactions__TransactionsAssignment_1 )* ) ;
    public final void rule__Transactions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1658:1: ( ( ( rule__Transactions__TransactionsAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1659:1: ( ( rule__Transactions__TransactionsAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1659:1: ( ( rule__Transactions__TransactionsAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1660:1: ( rule__Transactions__TransactionsAssignment_1 )*
            {
             before(grammarAccess.getTransactionsAccess().getTransactionsAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1661:1: ( rule__Transactions__TransactionsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1661:2: rule__Transactions__TransactionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Transactions__TransactionsAssignment_1_in_rule__Transactions__Group__1__Impl3400);
            	    rule__Transactions__TransactionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTransactionsAccess().getTransactionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transactions__Group__1__Impl


    // $ANTLR start rule__Transactions__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1671:1: rule__Transactions__Group__2 : rule__Transactions__Group__2__Impl ;
    public final void rule__Transactions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1675:1: ( rule__Transactions__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1676:2: rule__Transactions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transactions__Group__2__Impl_in_rule__Transactions__Group__23431);
            rule__Transactions__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transactions__Group__2


    // $ANTLR start rule__Transactions__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1682:1: rule__Transactions__Group__2__Impl : ( '[END]' ) ;
    public final void rule__Transactions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1686:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1687:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1687:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1688:1: '[END]'
            {
             before(grammarAccess.getTransactionsAccess().getENDKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Transactions__Group__2__Impl3459); 
             after(grammarAccess.getTransactionsAccess().getENDKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transactions__Group__2__Impl


    // $ANTLR start rule__Transaction__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1707:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1711:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1712:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__03496);
            rule__Transaction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__03499);
            rule__Transaction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__0


    // $ANTLR start rule__Transaction__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1719:1: rule__Transaction__Group__0__Impl : ( 'TRANSACTION' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1723:1: ( ( 'TRANSACTION' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1724:1: ( 'TRANSACTION' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1724:1: ( 'TRANSACTION' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1725:1: 'TRANSACTION'
            {
             before(grammarAccess.getTransactionAccess().getTRANSACTIONKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Transaction__Group__0__Impl3527); 
             after(grammarAccess.getTransactionAccess().getTRANSACTIONKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__0__Impl


    // $ANTLR start rule__Transaction__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1738:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1742:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1743:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__13558);
            rule__Transaction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__13561);
            rule__Transaction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__1


    // $ANTLR start rule__Transaction__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1750:1: rule__Transaction__Group__1__Impl : ( ( rule__Transaction__NameAssignment_1 ) ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1754:1: ( ( ( rule__Transaction__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1755:1: ( ( rule__Transaction__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1755:1: ( ( rule__Transaction__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1756:1: ( rule__Transaction__NameAssignment_1 )
            {
             before(grammarAccess.getTransactionAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1757:1: ( rule__Transaction__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1757:2: rule__Transaction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl3588);
            rule__Transaction__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTransactionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__1__Impl


    // $ANTLR start rule__Transaction__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1767:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1771:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1772:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__23618);
            rule__Transaction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__23621);
            rule__Transaction__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__2


    // $ANTLR start rule__Transaction__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1779:1: rule__Transaction__Group__2__Impl : ( '(' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1783:1: ( ( '(' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1784:1: ( '(' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1784:1: ( '(' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1785:1: '('
            {
             before(grammarAccess.getTransactionAccess().getLeftParenthesSKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Transaction__Group__2__Impl3649); 
             after(grammarAccess.getTransactionAccess().getLeftParenthesSKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__2__Impl


    // $ANTLR start rule__Transaction__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1798:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1802:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1803:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__33680);
            rule__Transaction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__33683);
            rule__Transaction__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__3


    // $ANTLR start rule__Transaction__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1810:1: rule__Transaction__Group__3__Impl : ( ( rule__Transaction__ArgumentsAssignment_3 )* ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1814:1: ( ( ( rule__Transaction__ArgumentsAssignment_3 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1815:1: ( ( rule__Transaction__ArgumentsAssignment_3 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1815:1: ( ( rule__Transaction__ArgumentsAssignment_3 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1816:1: ( rule__Transaction__ArgumentsAssignment_3 )*
            {
             before(grammarAccess.getTransactionAccess().getArgumentsAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1817:1: ( rule__Transaction__ArgumentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1817:2: rule__Transaction__ArgumentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__ArgumentsAssignment_3_in_rule__Transaction__Group__3__Impl3710);
            	    rule__Transaction__ArgumentsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getArgumentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__3__Impl


    // $ANTLR start rule__Transaction__Group__4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1827:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1831:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1832:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__43741);
            rule__Transaction__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__43744);
            rule__Transaction__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__4


    // $ANTLR start rule__Transaction__Group__4__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1839:1: rule__Transaction__Group__4__Impl : ( ')' ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1843:1: ( ( ')' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1844:1: ( ')' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1844:1: ( ')' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1845:1: ')'
            {
             before(grammarAccess.getTransactionAccess().getRGhtParenthesSKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Transaction__Group__4__Impl3772); 
             after(grammarAccess.getTransactionAccess().getRGhtParenthesSKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__4__Impl


    // $ANTLR start rule__Transaction__Group__5
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1858:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1862:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1863:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__53803);
            rule__Transaction__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__53806);
            rule__Transaction__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__5


    // $ANTLR start rule__Transaction__Group__5__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1870:1: rule__Transaction__Group__5__Impl : ( '[BEGIN]' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1874:1: ( ( '[BEGIN]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1875:1: ( '[BEGIN]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1875:1: ( '[BEGIN]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1876:1: '[BEGIN]'
            {
             before(grammarAccess.getTransactionAccess().getBEGINKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Transaction__Group__5__Impl3834); 
             after(grammarAccess.getTransactionAccess().getBEGINKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__5__Impl


    // $ANTLR start rule__Transaction__Group__6
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1889:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl rule__Transaction__Group__7 ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1893:1: ( rule__Transaction__Group__6__Impl rule__Transaction__Group__7 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1894:2: rule__Transaction__Group__6__Impl rule__Transaction__Group__7
            {
            pushFollow(FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__63865);
            rule__Transaction__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__7_in_rule__Transaction__Group__63868);
            rule__Transaction__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__6


    // $ANTLR start rule__Transaction__Group__6__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1901:1: rule__Transaction__Group__6__Impl : ( ( rule__Transaction__OperationsAssignment_6 )* ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1905:1: ( ( ( rule__Transaction__OperationsAssignment_6 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1906:1: ( ( rule__Transaction__OperationsAssignment_6 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1906:1: ( ( rule__Transaction__OperationsAssignment_6 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1907:1: ( rule__Transaction__OperationsAssignment_6 )*
            {
             before(grammarAccess.getTransactionAccess().getOperationsAssignment_6()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1908:1: ( rule__Transaction__OperationsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==21||LA8_0==23||(LA8_0>=26 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1908:2: rule__Transaction__OperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__OperationsAssignment_6_in_rule__Transaction__Group__6__Impl3895);
            	    rule__Transaction__OperationsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getOperationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__6__Impl


    // $ANTLR start rule__Transaction__Group__7
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1918:1: rule__Transaction__Group__7 : rule__Transaction__Group__7__Impl ;
    public final void rule__Transaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1922:1: ( rule__Transaction__Group__7__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1923:2: rule__Transaction__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group__7__Impl_in_rule__Transaction__Group__73926);
            rule__Transaction__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__7


    // $ANTLR start rule__Transaction__Group__7__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1929:1: rule__Transaction__Group__7__Impl : ( '[END]' ) ;
    public final void rule__Transaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1933:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1934:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1934:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1935:1: '[END]'
            {
             before(grammarAccess.getTransactionAccess().getENDKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Transaction__Group__7__Impl3954); 
             after(grammarAccess.getTransactionAccess().getENDKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__Group__7__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1964:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1968:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1969:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04001);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04004);
            rule__Argument__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0


    // $ANTLR start rule__Argument__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1976:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__KeywordAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1980:1: ( ( ( rule__Argument__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1981:1: ( ( rule__Argument__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1981:1: ( ( rule__Argument__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1982:1: ( rule__Argument__KeywordAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1983:1: ( rule__Argument__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1983:2: rule__Argument__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__KeywordAssignment_0_in_rule__Argument__Group__0__Impl4031);
            rule__Argument__KeywordAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0__Impl


    // $ANTLR start rule__Argument__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1993:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1997:1: ( rule__Argument__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1998:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14061);
            rule__Argument__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1


    // $ANTLR start rule__Argument__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2004:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2008:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2009:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2009:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2010:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2011:1: ( rule__Argument__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2011:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4088);
            rule__Argument__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1__Impl


    // $ANTLR start rule__Decrypt__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2025:1: rule__Decrypt__Group__0 : rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1 ;
    public final void rule__Decrypt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2029:1: ( rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2030:2: rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__0__Impl_in_rule__Decrypt__Group__04122);
            rule__Decrypt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__1_in_rule__Decrypt__Group__04125);
            rule__Decrypt__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__0


    // $ANTLR start rule__Decrypt__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2037:1: rule__Decrypt__Group__0__Impl : ( 'decrypt' ) ;
    public final void rule__Decrypt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2041:1: ( ( 'decrypt' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2042:1: ( 'decrypt' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2042:1: ( 'decrypt' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2043:1: 'decrypt'
            {
             before(grammarAccess.getDecryptAccess().getDecryptKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Decrypt__Group__0__Impl4153); 
             after(grammarAccess.getDecryptAccess().getDecryptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__0__Impl


    // $ANTLR start rule__Decrypt__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2056:1: rule__Decrypt__Group__1 : rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2 ;
    public final void rule__Decrypt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2060:1: ( rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2061:2: rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__1__Impl_in_rule__Decrypt__Group__14184);
            rule__Decrypt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__2_in_rule__Decrypt__Group__14187);
            rule__Decrypt__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__1


    // $ANTLR start rule__Decrypt__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2068:1: rule__Decrypt__Group__1__Impl : ( ( rule__Decrypt__MessageAssignment_1 ) ) ;
    public final void rule__Decrypt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2072:1: ( ( ( rule__Decrypt__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2073:1: ( ( rule__Decrypt__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2073:1: ( ( rule__Decrypt__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2074:1: ( rule__Decrypt__MessageAssignment_1 )
            {
             before(grammarAccess.getDecryptAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2075:1: ( rule__Decrypt__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2075:2: rule__Decrypt__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Decrypt__MessageAssignment_1_in_rule__Decrypt__Group__1__Impl4214);
            rule__Decrypt__MessageAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDecryptAccess().getMessageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__1__Impl


    // $ANTLR start rule__Decrypt__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2085:1: rule__Decrypt__Group__2 : rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3 ;
    public final void rule__Decrypt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2089:1: ( rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2090:2: rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__2__Impl_in_rule__Decrypt__Group__24244);
            rule__Decrypt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__3_in_rule__Decrypt__Group__24247);
            rule__Decrypt__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__2


    // $ANTLR start rule__Decrypt__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2097:1: rule__Decrypt__Group__2__Impl : ( 'for' ) ;
    public final void rule__Decrypt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2101:1: ( ( 'for' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2102:1: ( 'for' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2102:1: ( 'for' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2103:1: 'for'
            {
             before(grammarAccess.getDecryptAccess().getForKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Decrypt__Group__2__Impl4275); 
             after(grammarAccess.getDecryptAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__2__Impl


    // $ANTLR start rule__Decrypt__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2116:1: rule__Decrypt__Group__3 : rule__Decrypt__Group__3__Impl ;
    public final void rule__Decrypt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2120:1: ( rule__Decrypt__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2121:2: rule__Decrypt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__3__Impl_in_rule__Decrypt__Group__34306);
            rule__Decrypt__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__3


    // $ANTLR start rule__Decrypt__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2127:1: rule__Decrypt__Group__3__Impl : ( ( rule__Decrypt__ParticipantAssignment_3 ) ) ;
    public final void rule__Decrypt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2131:1: ( ( ( rule__Decrypt__ParticipantAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2132:1: ( ( rule__Decrypt__ParticipantAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2132:1: ( ( rule__Decrypt__ParticipantAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2133:1: ( rule__Decrypt__ParticipantAssignment_3 )
            {
             before(grammarAccess.getDecryptAccess().getParticipantAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2134:1: ( rule__Decrypt__ParticipantAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2134:2: rule__Decrypt__ParticipantAssignment_3
            {
            pushFollow(FOLLOW_rule__Decrypt__ParticipantAssignment_3_in_rule__Decrypt__Group__3__Impl4333);
            rule__Decrypt__ParticipantAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDecryptAccess().getParticipantAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__Group__3__Impl


    // $ANTLR start rule__Encrypt__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2152:1: rule__Encrypt__Group__0 : rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1 ;
    public final void rule__Encrypt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2156:1: ( rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2157:2: rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__0__Impl_in_rule__Encrypt__Group__04371);
            rule__Encrypt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__1_in_rule__Encrypt__Group__04374);
            rule__Encrypt__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__0


    // $ANTLR start rule__Encrypt__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2164:1: rule__Encrypt__Group__0__Impl : ( 'encrypt' ) ;
    public final void rule__Encrypt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2168:1: ( ( 'encrypt' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2169:1: ( 'encrypt' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2169:1: ( 'encrypt' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2170:1: 'encrypt'
            {
             before(grammarAccess.getEncryptAccess().getEncryptKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Encrypt__Group__0__Impl4402); 
             after(grammarAccess.getEncryptAccess().getEncryptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__0__Impl


    // $ANTLR start rule__Encrypt__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2183:1: rule__Encrypt__Group__1 : rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2 ;
    public final void rule__Encrypt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2187:1: ( rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2188:2: rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__1__Impl_in_rule__Encrypt__Group__14433);
            rule__Encrypt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__2_in_rule__Encrypt__Group__14436);
            rule__Encrypt__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__1


    // $ANTLR start rule__Encrypt__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2195:1: rule__Encrypt__Group__1__Impl : ( ( rule__Encrypt__MessageAssignment_1 ) ) ;
    public final void rule__Encrypt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2199:1: ( ( ( rule__Encrypt__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2200:1: ( ( rule__Encrypt__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2200:1: ( ( rule__Encrypt__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2201:1: ( rule__Encrypt__MessageAssignment_1 )
            {
             before(grammarAccess.getEncryptAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2202:1: ( rule__Encrypt__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2202:2: rule__Encrypt__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Encrypt__MessageAssignment_1_in_rule__Encrypt__Group__1__Impl4463);
            rule__Encrypt__MessageAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEncryptAccess().getMessageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__1__Impl


    // $ANTLR start rule__Encrypt__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2212:1: rule__Encrypt__Group__2 : rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3 ;
    public final void rule__Encrypt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2216:1: ( rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2217:2: rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__2__Impl_in_rule__Encrypt__Group__24493);
            rule__Encrypt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__3_in_rule__Encrypt__Group__24496);
            rule__Encrypt__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__2


    // $ANTLR start rule__Encrypt__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2224:1: rule__Encrypt__Group__2__Impl : ( 'for' ) ;
    public final void rule__Encrypt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2228:1: ( ( 'for' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2229:1: ( 'for' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2229:1: ( 'for' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2230:1: 'for'
            {
             before(grammarAccess.getEncryptAccess().getForKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Encrypt__Group__2__Impl4524); 
             after(grammarAccess.getEncryptAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__2__Impl


    // $ANTLR start rule__Encrypt__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2243:1: rule__Encrypt__Group__3 : rule__Encrypt__Group__3__Impl ;
    public final void rule__Encrypt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2247:1: ( rule__Encrypt__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2248:2: rule__Encrypt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__3__Impl_in_rule__Encrypt__Group__34555);
            rule__Encrypt__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__3


    // $ANTLR start rule__Encrypt__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2254:1: rule__Encrypt__Group__3__Impl : ( ( rule__Encrypt__ParticipantAssignment_3 ) ) ;
    public final void rule__Encrypt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2258:1: ( ( ( rule__Encrypt__ParticipantAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2259:1: ( ( rule__Encrypt__ParticipantAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2259:1: ( ( rule__Encrypt__ParticipantAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2260:1: ( rule__Encrypt__ParticipantAssignment_3 )
            {
             before(grammarAccess.getEncryptAccess().getParticipantAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2261:1: ( rule__Encrypt__ParticipantAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2261:2: rule__Encrypt__ParticipantAssignment_3
            {
            pushFollow(FOLLOW_rule__Encrypt__ParticipantAssignment_3_in_rule__Encrypt__Group__3__Impl4582);
            rule__Encrypt__ParticipantAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEncryptAccess().getParticipantAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__Group__3__Impl


    // $ANTLR start rule__Send__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2279:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2283:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2284:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__04620);
            rule__Send__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__04623);
            rule__Send__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__0


    // $ANTLR start rule__Send__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2291:1: rule__Send__Group__0__Impl : ( ( rule__Send__MessageAssignment_0 ) ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2295:1: ( ( ( rule__Send__MessageAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2296:1: ( ( rule__Send__MessageAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2296:1: ( ( rule__Send__MessageAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2297:1: ( rule__Send__MessageAssignment_0 )
            {
             before(grammarAccess.getSendAccess().getMessageAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2298:1: ( rule__Send__MessageAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2298:2: rule__Send__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__Send__MessageAssignment_0_in_rule__Send__Group__0__Impl4650);
            rule__Send__MessageAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSendAccess().getMessageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__0__Impl


    // $ANTLR start rule__Send__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2308:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2312:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2313:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__14680);
            rule__Send__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__14683);
            rule__Send__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__1


    // $ANTLR start rule__Send__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2320:1: rule__Send__Group__1__Impl : ( '::' ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2324:1: ( ( '::' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2325:1: ( '::' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2325:1: ( '::' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2326:1: '::'
            {
             before(grammarAccess.getSendAccess().getColonColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Send__Group__1__Impl4711); 
             after(grammarAccess.getSendAccess().getColonColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__1__Impl


    // $ANTLR start rule__Send__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2339:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2343:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2344:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__24742);
            rule__Send__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__24745);
            rule__Send__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__2


    // $ANTLR start rule__Send__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2351:1: rule__Send__Group__2__Impl : ( ( rule__Send__SourceAssignment_2 ) ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2355:1: ( ( ( rule__Send__SourceAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2356:1: ( ( rule__Send__SourceAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2356:1: ( ( rule__Send__SourceAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2357:1: ( rule__Send__SourceAssignment_2 )
            {
             before(grammarAccess.getSendAccess().getSourceAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2358:1: ( rule__Send__SourceAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2358:2: rule__Send__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Send__SourceAssignment_2_in_rule__Send__Group__2__Impl4772);
            rule__Send__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSendAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__2__Impl


    // $ANTLR start rule__Send__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2368:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2372:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2373:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__34802);
            rule__Send__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__34805);
            rule__Send__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__3


    // $ANTLR start rule__Send__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2380:1: rule__Send__Group__3__Impl : ( '->' ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2384:1: ( ( '->' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2385:1: ( '->' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2385:1: ( '->' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2386:1: '->'
            {
             before(grammarAccess.getSendAccess().getHyphenMNusGreaterThanSGnKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Send__Group__3__Impl4833); 
             after(grammarAccess.getSendAccess().getHyphenMNusGreaterThanSGnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__3__Impl


    // $ANTLR start rule__Send__Group__4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2399:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2403:1: ( rule__Send__Group__4__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2404:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__44864);
            rule__Send__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__4


    // $ANTLR start rule__Send__Group__4__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2410:1: rule__Send__Group__4__Impl : ( ( rule__Send__DestinationAssignment_4 ) ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2414:1: ( ( ( rule__Send__DestinationAssignment_4 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2415:1: ( ( rule__Send__DestinationAssignment_4 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2415:1: ( ( rule__Send__DestinationAssignment_4 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2416:1: ( rule__Send__DestinationAssignment_4 )
            {
             before(grammarAccess.getSendAccess().getDestinationAssignment_4()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2417:1: ( rule__Send__DestinationAssignment_4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2417:2: rule__Send__DestinationAssignment_4
            {
            pushFollow(FOLLOW_rule__Send__DestinationAssignment_4_in_rule__Send__Group__4__Impl4891);
            rule__Send__DestinationAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getSendAccess().getDestinationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__Group__4__Impl


    // $ANTLR start rule__Print__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2437:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2441:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2442:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__04931);
            rule__Print__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Print__Group__1_in_rule__Print__Group__04934);
            rule__Print__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Print__Group__0


    // $ANTLR start rule__Print__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2449:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2453:1: ( ( 'print' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2454:1: ( 'print' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2454:1: ( 'print' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2455:1: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Print__Group__0__Impl4962); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Print__Group__0__Impl


    // $ANTLR start rule__Print__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2468:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2472:1: ( rule__Print__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2473:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__14993);
            rule__Print__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Print__Group__1


    // $ANTLR start rule__Print__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2479:1: rule__Print__Group__1__Impl : ( ( rule__Print__MessageAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2483:1: ( ( ( rule__Print__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2484:1: ( ( rule__Print__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2484:1: ( ( rule__Print__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2485:1: ( rule__Print__MessageAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2486:1: ( rule__Print__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2486:2: rule__Print__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Print__MessageAssignment_1_in_rule__Print__Group__1__Impl5020);
            rule__Print__MessageAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPrintAccess().getMessageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Print__Group__1__Impl


    // $ANTLR start rule__Call__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2500:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2504:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2505:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05054);
            rule__Call__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05057);
            rule__Call__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Call__Group__0


    // $ANTLR start rule__Call__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2512:1: rule__Call__Group__0__Impl : ( 'CALL' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2516:1: ( ( 'CALL' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2517:1: ( 'CALL' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2517:1: ( 'CALL' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2518:1: 'CALL'
            {
             before(grammarAccess.getCallAccess().getCALLKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Call__Group__0__Impl5085); 
             after(grammarAccess.getCallAccess().getCALLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Call__Group__0__Impl


    // $ANTLR start rule__Call__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2531:1: rule__Call__Group__1 : rule__Call__Group__1__Impl ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2535:1: ( rule__Call__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2536:2: rule__Call__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15116);
            rule__Call__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Call__Group__1


    // $ANTLR start rule__Call__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2542:1: rule__Call__Group__1__Impl : ( ( rule__Call__TransactionNameAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2546:1: ( ( ( rule__Call__TransactionNameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2547:1: ( ( rule__Call__TransactionNameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2547:1: ( ( rule__Call__TransactionNameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2548:1: ( rule__Call__TransactionNameAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getTransactionNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2549:1: ( rule__Call__TransactionNameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2549:2: rule__Call__TransactionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__TransactionNameAssignment_1_in_rule__Call__Group__1__Impl5143);
            rule__Call__TransactionNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCallAccess().getTransactionNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Call__Group__1__Impl


    // $ANTLR start rule__Exchange__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2563:1: rule__Exchange__Group__0 : rule__Exchange__Group__0__Impl rule__Exchange__Group__1 ;
    public final void rule__Exchange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2567:1: ( rule__Exchange__Group__0__Impl rule__Exchange__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2568:2: rule__Exchange__Group__0__Impl rule__Exchange__Group__1
            {
            pushFollow(FOLLOW_rule__Exchange__Group__0__Impl_in_rule__Exchange__Group__05177);
            rule__Exchange__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exchange__Group__1_in_rule__Exchange__Group__05180);
            rule__Exchange__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__Group__0


    // $ANTLR start rule__Exchange__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2575:1: rule__Exchange__Group__0__Impl : ( ( rule__Exchange__SourceAssignment_0 ) ) ;
    public final void rule__Exchange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2579:1: ( ( ( rule__Exchange__SourceAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2580:1: ( ( rule__Exchange__SourceAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2580:1: ( ( rule__Exchange__SourceAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2581:1: ( rule__Exchange__SourceAssignment_0 )
            {
             before(grammarAccess.getExchangeAccess().getSourceAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2582:1: ( rule__Exchange__SourceAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2582:2: rule__Exchange__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Exchange__SourceAssignment_0_in_rule__Exchange__Group__0__Impl5207);
            rule__Exchange__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getExchangeAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__Group__0__Impl


    // $ANTLR start rule__Exchange__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2592:1: rule__Exchange__Group__1 : rule__Exchange__Group__1__Impl rule__Exchange__Group__2 ;
    public final void rule__Exchange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2596:1: ( rule__Exchange__Group__1__Impl rule__Exchange__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2597:2: rule__Exchange__Group__1__Impl rule__Exchange__Group__2
            {
            pushFollow(FOLLOW_rule__Exchange__Group__1__Impl_in_rule__Exchange__Group__15237);
            rule__Exchange__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exchange__Group__2_in_rule__Exchange__Group__15240);
            rule__Exchange__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__Group__1


    // $ANTLR start rule__Exchange__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2604:1: rule__Exchange__Group__1__Impl : ( 'exchange' ) ;
    public final void rule__Exchange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2608:1: ( ( 'exchange' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2609:1: ( 'exchange' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2609:1: ( 'exchange' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2610:1: 'exchange'
            {
             before(grammarAccess.getExchangeAccess().getExchangeKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Exchange__Group__1__Impl5268); 
             after(grammarAccess.getExchangeAccess().getExchangeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__Group__1__Impl


    // $ANTLR start rule__Exchange__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2623:1: rule__Exchange__Group__2 : rule__Exchange__Group__2__Impl ;
    public final void rule__Exchange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2627:1: ( rule__Exchange__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2628:2: rule__Exchange__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exchange__Group__2__Impl_in_rule__Exchange__Group__25299);
            rule__Exchange__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__Group__2


    // $ANTLR start rule__Exchange__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2634:1: rule__Exchange__Group__2__Impl : ( ( rule__Exchange__DestinationAssignment_2 ) ) ;
    public final void rule__Exchange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2638:1: ( ( ( rule__Exchange__DestinationAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2639:1: ( ( rule__Exchange__DestinationAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2639:1: ( ( rule__Exchange__DestinationAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2640:1: ( rule__Exchange__DestinationAssignment_2 )
            {
             before(grammarAccess.getExchangeAccess().getDestinationAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2641:1: ( rule__Exchange__DestinationAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2641:2: rule__Exchange__DestinationAssignment_2
            {
            pushFollow(FOLLOW_rule__Exchange__DestinationAssignment_2_in_rule__Exchange__Group__2__Impl5326);
            rule__Exchange__DestinationAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExchangeAccess().getDestinationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__Group__2__Impl


    // $ANTLR start rule__States__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2657:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2661:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2662:2: rule__States__Group__0__Impl rule__States__Group__1
            {
            pushFollow(FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__05362);
            rule__States__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__States__Group__1_in_rule__States__Group__05365);
            rule__States__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__States__Group__0


    // $ANTLR start rule__States__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2669:1: rule__States__Group__0__Impl : ( '[STATES]' ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2673:1: ( ( '[STATES]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2674:1: ( '[STATES]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2674:1: ( '[STATES]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2675:1: '[STATES]'
            {
             before(grammarAccess.getStatesAccess().getSTATESKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__States__Group__0__Impl5393); 
             after(grammarAccess.getStatesAccess().getSTATESKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__States__Group__0__Impl


    // $ANTLR start rule__States__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2688:1: rule__States__Group__1 : rule__States__Group__1__Impl rule__States__Group__2 ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2692:1: ( rule__States__Group__1__Impl rule__States__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2693:2: rule__States__Group__1__Impl rule__States__Group__2
            {
            pushFollow(FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__15424);
            rule__States__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__States__Group__2_in_rule__States__Group__15427);
            rule__States__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__States__Group__1


    // $ANTLR start rule__States__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2700:1: rule__States__Group__1__Impl : ( ( rule__States__StatesAssignment_1 )* ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2704:1: ( ( ( rule__States__StatesAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2705:1: ( ( rule__States__StatesAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2705:1: ( ( rule__States__StatesAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2706:1: ( rule__States__StatesAssignment_1 )*
            {
             before(grammarAccess.getStatesAccess().getStatesAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2707:1: ( rule__States__StatesAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2707:2: rule__States__StatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__States__StatesAssignment_1_in_rule__States__Group__1__Impl5454);
            	    rule__States__StatesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStatesAccess().getStatesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__States__Group__1__Impl


    // $ANTLR start rule__States__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2717:1: rule__States__Group__2 : rule__States__Group__2__Impl ;
    public final void rule__States__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2721:1: ( rule__States__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2722:2: rule__States__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__25485);
            rule__States__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__States__Group__2


    // $ANTLR start rule__States__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2728:1: rule__States__Group__2__Impl : ( '[END]' ) ;
    public final void rule__States__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2732:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2733:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2733:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2734:1: '[END]'
            {
             before(grammarAccess.getStatesAccess().getENDKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__States__Group__2__Impl5513); 
             after(grammarAccess.getStatesAccess().getENDKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__States__Group__2__Impl


    // $ANTLR start rule__State__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2753:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2757:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2758:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05550);
            rule__State__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__05553);
            rule__State__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__0


    // $ANTLR start rule__State__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2765:1: rule__State__Group__0__Impl : ( 'STATE' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2769:1: ( ( 'STATE' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2770:1: ( 'STATE' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2770:1: ( 'STATE' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2771:1: 'STATE'
            {
             before(grammarAccess.getStateAccess().getSTATEKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__State__Group__0__Impl5581); 
             after(grammarAccess.getStateAccess().getSTATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__0__Impl


    // $ANTLR start rule__State__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2784:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2788:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2789:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15612);
            rule__State__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__15615);
            rule__State__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__State__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2796:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2800:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2801:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2801:1: ( ( rule__State__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2802:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2803:1: ( rule__State__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2803:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl5642);
            rule__State__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__1__Impl


    // $ANTLR start rule__State__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2813:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2817:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2818:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__25672);
            rule__State__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__25675);
            rule__State__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__2


    // $ANTLR start rule__State__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2825:1: rule__State__Group__2__Impl : ( '(' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2829:1: ( ( '(' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2830:1: ( '(' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2830:1: ( '(' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2831:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesSKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__State__Group__2__Impl5703); 
             after(grammarAccess.getStateAccess().getLeftParenthesSKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__2__Impl


    // $ANTLR start rule__State__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2844:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2848:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2849:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__35734);
            rule__State__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__35737);
            rule__State__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__3


    // $ANTLR start rule__State__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2856:1: rule__State__Group__3__Impl : ( ( rule__State__EventAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2860:1: ( ( ( rule__State__EventAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2861:1: ( ( rule__State__EventAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2861:1: ( ( rule__State__EventAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2862:1: ( rule__State__EventAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getEventAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2863:1: ( rule__State__EventAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2863:2: rule__State__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__State__EventAssignment_3_in_rule__State__Group__3__Impl5764);
            rule__State__EventAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getEventAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__3__Impl


    // $ANTLR start rule__State__Group__4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2873:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2877:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2878:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__45794);
            rule__State__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__45797);
            rule__State__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__4


    // $ANTLR start rule__State__Group__4__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2885:1: rule__State__Group__4__Impl : ( ')' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2889:1: ( ( ')' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2890:1: ( ')' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2890:1: ( ')' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2891:1: ')'
            {
             before(grammarAccess.getStateAccess().getRGhtParenthesSKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__State__Group__4__Impl5825); 
             after(grammarAccess.getStateAccess().getRGhtParenthesSKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__4__Impl


    // $ANTLR start rule__State__Group__5
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2904:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2908:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2909:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__55856);
            rule__State__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__6_in_rule__State__Group__55859);
            rule__State__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__5


    // $ANTLR start rule__State__Group__5__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2916:1: rule__State__Group__5__Impl : ( '[BEGIN]' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2920:1: ( ( '[BEGIN]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2921:1: ( '[BEGIN]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2921:1: ( '[BEGIN]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2922:1: '[BEGIN]'
            {
             before(grammarAccess.getStateAccess().getBEGINKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__State__Group__5__Impl5887); 
             after(grammarAccess.getStateAccess().getBEGINKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__5__Impl


    // $ANTLR start rule__State__Group__6
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2935:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2939:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2940:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__65918);
            rule__State__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__7_in_rule__State__Group__65921);
            rule__State__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__6


    // $ANTLR start rule__State__Group__6__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2947:1: rule__State__Group__6__Impl : ( ( rule__State__GuardsAssignment_6 )* ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2951:1: ( ( ( rule__State__GuardsAssignment_6 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2952:1: ( ( rule__State__GuardsAssignment_6 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2952:1: ( ( rule__State__GuardsAssignment_6 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2953:1: ( rule__State__GuardsAssignment_6 )*
            {
             before(grammarAccess.getStateAccess().getGuardsAssignment_6()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2954:1: ( rule__State__GuardsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2954:2: rule__State__GuardsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__State__GuardsAssignment_6_in_rule__State__Group__6__Impl5948);
            	    rule__State__GuardsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGuardsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__6__Impl


    // $ANTLR start rule__State__Group__7
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2964:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2968:1: ( rule__State__Group__7__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2969:2: rule__State__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__75979);
            rule__State__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__7


    // $ANTLR start rule__State__Group__7__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2975:1: rule__State__Group__7__Impl : ( '[END]' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2979:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2980:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2980:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2981:1: '[END]'
            {
             before(grammarAccess.getStateAccess().getENDKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__State__Group__7__Impl6007); 
             after(grammarAccess.getStateAccess().getENDKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__7__Impl


    // $ANTLR start rule__Guard__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3010:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3014:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3015:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06054);
            rule__Guard__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06057);
            rule__Guard__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__0


    // $ANTLR start rule__Guard__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3022:1: rule__Guard__Group__0__Impl : ( '|' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3026:1: ( ( '|' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3027:1: ( '|' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3027:1: ( '|' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3028:1: '|'
            {
             before(grammarAccess.getGuardAccess().getVertCalLNeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Guard__Group__0__Impl6085); 
             after(grammarAccess.getGuardAccess().getVertCalLNeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__0__Impl


    // $ANTLR start rule__Guard__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3041:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3045:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3046:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16116);
            rule__Guard__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16119);
            rule__Guard__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__1


    // $ANTLR start rule__Guard__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3053:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__CasemAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3057:1: ( ( ( rule__Guard__CasemAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3058:1: ( ( rule__Guard__CasemAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3058:1: ( ( rule__Guard__CasemAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3059:1: ( rule__Guard__CasemAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getCasemAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3060:1: ( rule__Guard__CasemAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3060:2: rule__Guard__CasemAssignment_1
            {
            pushFollow(FOLLOW_rule__Guard__CasemAssignment_1_in_rule__Guard__Group__1__Impl6146);
            rule__Guard__CasemAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGuardAccess().getCasemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__1__Impl


    // $ANTLR start rule__Guard__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3070:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3074:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3075:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26176);
            rule__Guard__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26179);
            rule__Guard__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__2


    // $ANTLR start rule__Guard__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3082:1: rule__Guard__Group__2__Impl : ( '=>' ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3086:1: ( ( '=>' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3087:1: ( '=>' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3087:1: ( '=>' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3088:1: '=>'
            {
             before(grammarAccess.getGuardAccess().getEqualsSGnGreaterThanSGnKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Guard__Group__2__Impl6207); 
             after(grammarAccess.getGuardAccess().getEqualsSGnGreaterThanSGnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__2__Impl


    // $ANTLR start rule__Guard__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3101:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3105:1: ( rule__Guard__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3106:2: rule__Guard__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36238);
            rule__Guard__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__3


    // $ANTLR start rule__Guard__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3112:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__OperationAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3116:1: ( ( ( rule__Guard__OperationAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3117:1: ( ( rule__Guard__OperationAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3117:1: ( ( rule__Guard__OperationAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3118:1: ( rule__Guard__OperationAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getOperationAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3119:1: ( rule__Guard__OperationAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3119:2: rule__Guard__OperationAssignment_3
            {
            pushFollow(FOLLOW_rule__Guard__OperationAssignment_3_in_rule__Guard__Group__3__Impl6265);
            rule__Guard__OperationAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getGuardAccess().getOperationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__Group__3__Impl


    // $ANTLR start rule__GetEvent__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3137:1: rule__GetEvent__Group__0 : rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1 ;
    public final void rule__GetEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3141:1: ( rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3142:2: rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__0__Impl_in_rule__GetEvent__Group__06303);
            rule__GetEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GetEvent__Group__1_in_rule__GetEvent__Group__06306);
            rule__GetEvent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__Group__0


    // $ANTLR start rule__GetEvent__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3149:1: rule__GetEvent__Group__0__Impl : ( ( rule__GetEvent__WhoAssignment_0 ) ) ;
    public final void rule__GetEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3153:1: ( ( ( rule__GetEvent__WhoAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3154:1: ( ( rule__GetEvent__WhoAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3154:1: ( ( rule__GetEvent__WhoAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3155:1: ( rule__GetEvent__WhoAssignment_0 )
            {
             before(grammarAccess.getGetEventAccess().getWhoAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3156:1: ( rule__GetEvent__WhoAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3156:2: rule__GetEvent__WhoAssignment_0
            {
            pushFollow(FOLLOW_rule__GetEvent__WhoAssignment_0_in_rule__GetEvent__Group__0__Impl6333);
            rule__GetEvent__WhoAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getGetEventAccess().getWhoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__Group__0__Impl


    // $ANTLR start rule__GetEvent__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3166:1: rule__GetEvent__Group__1 : rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2 ;
    public final void rule__GetEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3170:1: ( rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3171:2: rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__1__Impl_in_rule__GetEvent__Group__16363);
            rule__GetEvent__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GetEvent__Group__2_in_rule__GetEvent__Group__16366);
            rule__GetEvent__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__Group__1


    // $ANTLR start rule__GetEvent__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3178:1: rule__GetEvent__Group__1__Impl : ( 'GET' ) ;
    public final void rule__GetEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3182:1: ( ( 'GET' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3183:1: ( 'GET' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3183:1: ( 'GET' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3184:1: 'GET'
            {
             before(grammarAccess.getGetEventAccess().getGETKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__GetEvent__Group__1__Impl6394); 
             after(grammarAccess.getGetEventAccess().getGETKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__Group__1__Impl


    // $ANTLR start rule__GetEvent__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3197:1: rule__GetEvent__Group__2 : rule__GetEvent__Group__2__Impl ;
    public final void rule__GetEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3201:1: ( rule__GetEvent__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3202:2: rule__GetEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__2__Impl_in_rule__GetEvent__Group__26425);
            rule__GetEvent__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__Group__2


    // $ANTLR start rule__GetEvent__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3208:1: rule__GetEvent__Group__2__Impl : ( ( rule__GetEvent__MessageAssignment_2 ) ) ;
    public final void rule__GetEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3212:1: ( ( ( rule__GetEvent__MessageAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3213:1: ( ( rule__GetEvent__MessageAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3213:1: ( ( rule__GetEvent__MessageAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3214:1: ( rule__GetEvent__MessageAssignment_2 )
            {
             before(grammarAccess.getGetEventAccess().getMessageAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3215:1: ( rule__GetEvent__MessageAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3215:2: rule__GetEvent__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__GetEvent__MessageAssignment_2_in_rule__GetEvent__Group__2__Impl6452);
            rule__GetEvent__MessageAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getGetEventAccess().getMessageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__Group__2__Impl


    // $ANTLR start rule__IsSendEvent__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3231:1: rule__IsSendEvent__Group__0 : rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1 ;
    public final void rule__IsSendEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3235:1: ( rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3236:2: rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__0__Impl_in_rule__IsSendEvent__Group__06488);
            rule__IsSendEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IsSendEvent__Group__1_in_rule__IsSendEvent__Group__06491);
            rule__IsSendEvent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IsSendEvent__Group__0


    // $ANTLR start rule__IsSendEvent__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3243:1: rule__IsSendEvent__Group__0__Impl : ( ( rule__IsSendEvent__MessageAssignment_0 ) ) ;
    public final void rule__IsSendEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3247:1: ( ( ( rule__IsSendEvent__MessageAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3248:1: ( ( rule__IsSendEvent__MessageAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3248:1: ( ( rule__IsSendEvent__MessageAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3249:1: ( rule__IsSendEvent__MessageAssignment_0 )
            {
             before(grammarAccess.getIsSendEventAccess().getMessageAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3250:1: ( rule__IsSendEvent__MessageAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3250:2: rule__IsSendEvent__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__IsSendEvent__MessageAssignment_0_in_rule__IsSendEvent__Group__0__Impl6518);
            rule__IsSendEvent__MessageAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIsSendEventAccess().getMessageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IsSendEvent__Group__0__Impl


    // $ANTLR start rule__IsSendEvent__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3260:1: rule__IsSendEvent__Group__1 : rule__IsSendEvent__Group__1__Impl ;
    public final void rule__IsSendEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3264:1: ( rule__IsSendEvent__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3265:2: rule__IsSendEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__1__Impl_in_rule__IsSendEvent__Group__16548);
            rule__IsSendEvent__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IsSendEvent__Group__1


    // $ANTLR start rule__IsSendEvent__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3271:1: rule__IsSendEvent__Group__1__Impl : ( 'IS_SEND' ) ;
    public final void rule__IsSendEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3275:1: ( ( 'IS_SEND' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3276:1: ( 'IS_SEND' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3276:1: ( 'IS_SEND' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3277:1: 'IS_SEND'
            {
             before(grammarAccess.getIsSendEventAccess().getIS_SENDKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__IsSendEvent__Group__1__Impl6576); 
             after(grammarAccess.getIsSendEventAccess().getIS_SENDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IsSendEvent__Group__1__Impl


    // $ANTLR start rule__Source__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3294:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3298:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3299:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_rule__Source__Group__0__Impl_in_rule__Source__Group__06611);
            rule__Source__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Source__Group__1_in_rule__Source__Group__06614);
            rule__Source__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__Group__0


    // $ANTLR start rule__Source__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3306:1: rule__Source__Group__0__Impl : ( ( rule__Source__KeywordAssignment_0 ) ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3310:1: ( ( ( rule__Source__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3311:1: ( ( rule__Source__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3311:1: ( ( rule__Source__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3312:1: ( rule__Source__KeywordAssignment_0 )
            {
             before(grammarAccess.getSourceAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3313:1: ( rule__Source__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3313:2: rule__Source__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Source__KeywordAssignment_0_in_rule__Source__Group__0__Impl6641);
            rule__Source__KeywordAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSourceAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__Group__0__Impl


    // $ANTLR start rule__Source__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3323:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3327:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3328:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_rule__Source__Group__1__Impl_in_rule__Source__Group__16671);
            rule__Source__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Source__Group__2_in_rule__Source__Group__16674);
            rule__Source__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__Group__1


    // $ANTLR start rule__Source__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3335:1: rule__Source__Group__1__Impl : ( '=' ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3339:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3340:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3340:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3341:1: '='
            {
             before(grammarAccess.getSourceAccess().getEqualsSGnKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Source__Group__1__Impl6702); 
             after(grammarAccess.getSourceAccess().getEqualsSGnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__Group__1__Impl


    // $ANTLR start rule__Source__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3354:1: rule__Source__Group__2 : rule__Source__Group__2__Impl ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3358:1: ( rule__Source__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3359:2: rule__Source__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Source__Group__2__Impl_in_rule__Source__Group__26733);
            rule__Source__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__Group__2


    // $ANTLR start rule__Source__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3365:1: rule__Source__Group__2__Impl : ( ( rule__Source__EventSourceAssignment_2 ) ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3369:1: ( ( ( rule__Source__EventSourceAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3370:1: ( ( rule__Source__EventSourceAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3370:1: ( ( rule__Source__EventSourceAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3371:1: ( rule__Source__EventSourceAssignment_2 )
            {
             before(grammarAccess.getSourceAccess().getEventSourceAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3372:1: ( rule__Source__EventSourceAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3372:2: rule__Source__EventSourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Source__EventSourceAssignment_2_in_rule__Source__Group__2__Impl6760);
            rule__Source__EventSourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSourceAccess().getEventSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__Group__2__Impl


    // $ANTLR start rule__From__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3388:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3392:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3393:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__06796);
            rule__From__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__From__Group__1_in_rule__From__Group__06799);
            rule__From__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__Group__0


    // $ANTLR start rule__From__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3400:1: rule__From__Group__0__Impl : ( ( rule__From__KeywordAssignment_0 ) ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3404:1: ( ( ( rule__From__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3405:1: ( ( rule__From__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3405:1: ( ( rule__From__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3406:1: ( rule__From__KeywordAssignment_0 )
            {
             before(grammarAccess.getFromAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3407:1: ( rule__From__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3407:2: rule__From__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__From__KeywordAssignment_0_in_rule__From__Group__0__Impl6826);
            rule__From__KeywordAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFromAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__Group__0__Impl


    // $ANTLR start rule__From__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3417:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3421:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3422:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__16856);
            rule__From__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__From__Group__2_in_rule__From__Group__16859);
            rule__From__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__Group__1


    // $ANTLR start rule__From__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3429:1: rule__From__Group__1__Impl : ( '=' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3433:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3434:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3434:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3435:1: '='
            {
             before(grammarAccess.getFromAccess().getEqualsSGnKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__From__Group__1__Impl6887); 
             after(grammarAccess.getFromAccess().getEqualsSGnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__Group__1__Impl


    // $ANTLR start rule__From__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3448:1: rule__From__Group__2 : rule__From__Group__2__Impl ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3452:1: ( rule__From__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3453:2: rule__From__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__26918);
            rule__From__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__Group__2


    // $ANTLR start rule__From__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3459:1: rule__From__Group__2__Impl : ( ( rule__From__EventSourceAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3463:1: ( ( ( rule__From__EventSourceAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3464:1: ( ( rule__From__EventSourceAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3464:1: ( ( rule__From__EventSourceAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3465:1: ( rule__From__EventSourceAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getEventSourceAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3466:1: ( rule__From__EventSourceAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3466:2: rule__From__EventSourceAssignment_2
            {
            pushFollow(FOLLOW_rule__From__EventSourceAssignment_2_in_rule__From__Group__2__Impl6945);
            rule__From__EventSourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFromAccess().getEventSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__Group__2__Impl


    // $ANTLR start rule__PDLFile__NameAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3483:1: rule__PDLFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PDLFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3487:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3488:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3488:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3489:1: RULE_ID
            {
             before(grammarAccess.getPDLFileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PDLFile__NameAssignment_16986); 
             after(grammarAccess.getPDLFileAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__NameAssignment_1


    // $ANTLR start rule__PDLFile__DefinitionAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3498:1: rule__PDLFile__DefinitionAssignment_3 : ( ruleDefinitions ) ;
    public final void rule__PDLFile__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3502:1: ( ( ruleDefinitions ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3503:1: ( ruleDefinitions )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3503:1: ( ruleDefinitions )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3504:1: ruleDefinitions
            {
             before(grammarAccess.getPDLFileAccess().getDefinitionDefinitionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDefinitions_in_rule__PDLFile__DefinitionAssignment_37017);
            ruleDefinitions();
            _fsp--;

             after(grammarAccess.getPDLFileAccess().getDefinitionDefinitionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__DefinitionAssignment_3


    // $ANTLR start rule__PDLFile__TransactionAssignment_4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3513:1: rule__PDLFile__TransactionAssignment_4 : ( ruleTransactions ) ;
    public final void rule__PDLFile__TransactionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3517:1: ( ( ruleTransactions ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3518:1: ( ruleTransactions )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3518:1: ( ruleTransactions )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3519:1: ruleTransactions
            {
             before(grammarAccess.getPDLFileAccess().getTransactionTransactionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransactions_in_rule__PDLFile__TransactionAssignment_47048);
            ruleTransactions();
            _fsp--;

             after(grammarAccess.getPDLFileAccess().getTransactionTransactionsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__TransactionAssignment_4


    // $ANTLR start rule__PDLFile__StateAssignment_5
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3528:1: rule__PDLFile__StateAssignment_5 : ( ruleStates ) ;
    public final void rule__PDLFile__StateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3532:1: ( ( ruleStates ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3533:1: ( ruleStates )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3533:1: ( ruleStates )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3534:1: ruleStates
            {
             before(grammarAccess.getPDLFileAccess().getStateStatesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStates_in_rule__PDLFile__StateAssignment_57079);
            ruleStates();
            _fsp--;

             after(grammarAccess.getPDLFileAccess().getStateStatesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__StateAssignment_5


    // $ANTLR start rule__Definitions__SourcesAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3543:1: rule__Definitions__SourcesAssignment_1 : ( ruleEventSource ) ;
    public final void rule__Definitions__SourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3547:1: ( ( ruleEventSource ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3548:1: ( ruleEventSource )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3548:1: ( ruleEventSource )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3549:1: ruleEventSource
            {
             before(grammarAccess.getDefinitionsAccess().getSourcesEventSourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEventSource_in_rule__Definitions__SourcesAssignment_17110);
            ruleEventSource();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getSourcesEventSourceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__SourcesAssignment_1


    // $ANTLR start rule__Definitions__CipherAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3558:1: rule__Definitions__CipherAssignment_2 : ( ruleCipher ) ;
    public final void rule__Definitions__CipherAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3562:1: ( ( ruleCipher ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3563:1: ( ruleCipher )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3563:1: ( ruleCipher )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3564:1: ruleCipher
            {
             before(grammarAccess.getDefinitionsAccess().getCipherCipherParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCipher_in_rule__Definitions__CipherAssignment_27141);
            ruleCipher();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getCipherCipherParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__CipherAssignment_2


    // $ANTLR start rule__Arbitrator__NameAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3573:1: rule__Arbitrator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Arbitrator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3577:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3578:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3578:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3579:1: RULE_ID
            {
             before(grammarAccess.getArbitratorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Arbitrator__NameAssignment_07172); 
             after(grammarAccess.getArbitratorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__NameAssignment_0


    // $ANTLR start rule__Arbitrator__KeywordAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3588:1: rule__Arbitrator__KeywordAssignment_2 : ( ( 'Arbitrator' ) ) ;
    public final void rule__Arbitrator__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3592:1: ( ( ( 'Arbitrator' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3593:1: ( ( 'Arbitrator' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3593:1: ( ( 'Arbitrator' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3594:1: ( 'Arbitrator' )
            {
             before(grammarAccess.getArbitratorAccess().getKeywordArbitratorKeyword_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3595:1: ( 'Arbitrator' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3596:1: 'Arbitrator'
            {
             before(grammarAccess.getArbitratorAccess().getKeywordArbitratorKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Arbitrator__KeywordAssignment_27208); 
             after(grammarAccess.getArbitratorAccess().getKeywordArbitratorKeyword_2_0()); 

            }

             after(grammarAccess.getArbitratorAccess().getKeywordArbitratorKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arbitrator__KeywordAssignment_2


    // $ANTLR start rule__Participant__NameAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3611:1: rule__Participant__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3615:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3616:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3616:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3617:1: RULE_ID
            {
             before(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_07247); 
             after(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__NameAssignment_0


    // $ANTLR start rule__Participant__KeywordAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3626:1: rule__Participant__KeywordAssignment_2 : ( ( 'Participant' ) ) ;
    public final void rule__Participant__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3630:1: ( ( ( 'Participant' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3631:1: ( ( 'Participant' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3631:1: ( ( 'Participant' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3632:1: ( 'Participant' )
            {
             before(grammarAccess.getParticipantAccess().getKeywordParticipantKeyword_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3633:1: ( 'Participant' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3634:1: 'Participant'
            {
             before(grammarAccess.getParticipantAccess().getKeywordParticipantKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Participant__KeywordAssignment_27283); 
             after(grammarAccess.getParticipantAccess().getKeywordParticipantKeyword_2_0()); 

            }

             after(grammarAccess.getParticipantAccess().getKeywordParticipantKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Participant__KeywordAssignment_2


    // $ANTLR start rule__Cipher__NameAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3649:1: rule__Cipher__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Cipher__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3653:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3654:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3654:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3655:1: RULE_ID
            {
             before(grammarAccess.getCipherAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cipher__NameAssignment_07322); 
             after(grammarAccess.getCipherAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__NameAssignment_0


    // $ANTLR start rule__Cipher__KeywordAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3664:1: rule__Cipher__KeywordAssignment_2 : ( RULE_ID ) ;
    public final void rule__Cipher__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3668:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3669:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3669:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3670:1: RULE_ID
            {
             before(grammarAccess.getCipherAccess().getKeywordIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cipher__KeywordAssignment_27353); 
             after(grammarAccess.getCipherAccess().getKeywordIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Cipher__KeywordAssignment_2


    // $ANTLR start rule__Transactions__TransactionsAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3679:1: rule__Transactions__TransactionsAssignment_1 : ( ruleTransaction ) ;
    public final void rule__Transactions__TransactionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3683:1: ( ( ruleTransaction ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3684:1: ( ruleTransaction )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3684:1: ( ruleTransaction )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3685:1: ruleTransaction
            {
             before(grammarAccess.getTransactionsAccess().getTransactionsTransactionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__Transactions__TransactionsAssignment_17384);
            ruleTransaction();
            _fsp--;

             after(grammarAccess.getTransactionsAccess().getTransactionsTransactionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transactions__TransactionsAssignment_1


    // $ANTLR start rule__Transaction__NameAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3694:1: rule__Transaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3698:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3699:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3699:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3700:1: RULE_ID
            {
             before(grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_17415); 
             after(grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__NameAssignment_1


    // $ANTLR start rule__Transaction__ArgumentsAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3709:1: rule__Transaction__ArgumentsAssignment_3 : ( ruleArgument ) ;
    public final void rule__Transaction__ArgumentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3713:1: ( ( ruleArgument ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3714:1: ( ruleArgument )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3714:1: ( ruleArgument )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3715:1: ruleArgument
            {
             before(grammarAccess.getTransactionAccess().getArgumentsArgumentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Transaction__ArgumentsAssignment_37446);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getTransactionAccess().getArgumentsArgumentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__ArgumentsAssignment_3


    // $ANTLR start rule__Transaction__OperationsAssignment_6
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3724:1: rule__Transaction__OperationsAssignment_6 : ( ruleOperation ) ;
    public final void rule__Transaction__OperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3728:1: ( ( ruleOperation ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3729:1: ( ruleOperation )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3729:1: ( ruleOperation )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3730:1: ruleOperation
            {
             before(grammarAccess.getTransactionAccess().getOperationsOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Transaction__OperationsAssignment_67477);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getTransactionAccess().getOperationsOperationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transaction__OperationsAssignment_6


    // $ANTLR start rule__Argument__KeywordAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3739:1: rule__Argument__KeywordAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3743:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3744:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3744:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3745:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getKeywordIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__KeywordAssignment_07508); 
             after(grammarAccess.getArgumentAccess().getKeywordIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__KeywordAssignment_0


    // $ANTLR start rule__Argument__NameAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3754:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3758:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3759:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3759:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3760:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_17539); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__NameAssignment_1


    // $ANTLR start rule__Decrypt__MessageAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3769:1: rule__Decrypt__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decrypt__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3773:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3774:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3774:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3775:1: RULE_ID
            {
             before(grammarAccess.getDecryptAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decrypt__MessageAssignment_17570); 
             after(grammarAccess.getDecryptAccess().getMessageIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__MessageAssignment_1


    // $ANTLR start rule__Decrypt__ParticipantAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3784:1: rule__Decrypt__ParticipantAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Decrypt__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3788:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3789:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3789:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3790:1: ( RULE_ID )
            {
             before(grammarAccess.getDecryptAccess().getParticipantParticipantCrossReference_3_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3791:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3792:1: RULE_ID
            {
             before(grammarAccess.getDecryptAccess().getParticipantParticipantIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decrypt__ParticipantAssignment_37605); 
             after(grammarAccess.getDecryptAccess().getParticipantParticipantIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDecryptAccess().getParticipantParticipantCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decrypt__ParticipantAssignment_3


    // $ANTLR start rule__Encrypt__MessageAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3803:1: rule__Encrypt__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Encrypt__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3807:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3808:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3808:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3809:1: RULE_ID
            {
             before(grammarAccess.getEncryptAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Encrypt__MessageAssignment_17640); 
             after(grammarAccess.getEncryptAccess().getMessageIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__MessageAssignment_1


    // $ANTLR start rule__Encrypt__ParticipantAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3818:1: rule__Encrypt__ParticipantAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Encrypt__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3822:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3823:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3823:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3824:1: ( RULE_ID )
            {
             before(grammarAccess.getEncryptAccess().getParticipantParticipantCrossReference_3_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3825:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3826:1: RULE_ID
            {
             before(grammarAccess.getEncryptAccess().getParticipantParticipantIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Encrypt__ParticipantAssignment_37675); 
             after(grammarAccess.getEncryptAccess().getParticipantParticipantIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEncryptAccess().getParticipantParticipantCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Encrypt__ParticipantAssignment_3


    // $ANTLR start rule__Send__MessageAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3837:1: rule__Send__MessageAssignment_0 : ( RULE_ID ) ;
    public final void rule__Send__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3841:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3842:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3842:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3843:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getMessageIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__MessageAssignment_07710); 
             after(grammarAccess.getSendAccess().getMessageIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__MessageAssignment_0


    // $ANTLR start rule__Send__SourceAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3852:1: rule__Send__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Send__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3856:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3857:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3857:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3858:1: ( RULE_ID )
            {
             before(grammarAccess.getSendAccess().getSourceEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3859:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3860:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getSourceEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__SourceAssignment_27745); 
             after(grammarAccess.getSendAccess().getSourceEventSourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSendAccess().getSourceEventSourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__SourceAssignment_2


    // $ANTLR start rule__Send__DestinationAssignment_4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3871:1: rule__Send__DestinationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Send__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3875:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3876:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3876:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3877:1: ( RULE_ID )
            {
             before(grammarAccess.getSendAccess().getDestinationEventSourceCrossReference_4_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3878:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3879:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getDestinationEventSourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__DestinationAssignment_47784); 
             after(grammarAccess.getSendAccess().getDestinationEventSourceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSendAccess().getDestinationEventSourceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Send__DestinationAssignment_4


    // $ANTLR start rule__Print__MessageAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3890:1: rule__Print__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Print__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3894:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3895:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3895:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3896:1: RULE_ID
            {
             before(grammarAccess.getPrintAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Print__MessageAssignment_17819); 
             after(grammarAccess.getPrintAccess().getMessageIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Print__MessageAssignment_1


    // $ANTLR start rule__Call__TransactionNameAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3905:1: rule__Call__TransactionNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Call__TransactionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3909:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3910:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3910:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3911:1: ( RULE_ID )
            {
             before(grammarAccess.getCallAccess().getTransactionNameTransactionCrossReference_1_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3912:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3913:1: RULE_ID
            {
             before(grammarAccess.getCallAccess().getTransactionNameTransactionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Call__TransactionNameAssignment_17854); 
             after(grammarAccess.getCallAccess().getTransactionNameTransactionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCallAccess().getTransactionNameTransactionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Call__TransactionNameAssignment_1


    // $ANTLR start rule__Exchange__SourceAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3924:1: rule__Exchange__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Exchange__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3928:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3929:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3929:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3930:1: ( RULE_ID )
            {
             before(grammarAccess.getExchangeAccess().getSourceEventSourceCrossReference_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3931:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3932:1: RULE_ID
            {
             before(grammarAccess.getExchangeAccess().getSourceEventSourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exchange__SourceAssignment_07893); 
             after(grammarAccess.getExchangeAccess().getSourceEventSourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getExchangeAccess().getSourceEventSourceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__SourceAssignment_0


    // $ANTLR start rule__Exchange__DestinationAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3943:1: rule__Exchange__DestinationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Exchange__DestinationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3947:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3948:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3948:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3949:1: ( RULE_ID )
            {
             before(grammarAccess.getExchangeAccess().getDestinationEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3950:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3951:1: RULE_ID
            {
             before(grammarAccess.getExchangeAccess().getDestinationEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exchange__DestinationAssignment_27932); 
             after(grammarAccess.getExchangeAccess().getDestinationEventSourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExchangeAccess().getDestinationEventSourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exchange__DestinationAssignment_2


    // $ANTLR start rule__States__StatesAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3962:1: rule__States__StatesAssignment_1 : ( ruleState ) ;
    public final void rule__States__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3966:1: ( ( ruleState ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3967:1: ( ruleState )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3967:1: ( ruleState )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3968:1: ruleState
            {
             before(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__States__StatesAssignment_17967);
            ruleState();
            _fsp--;

             after(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__States__StatesAssignment_1


    // $ANTLR start rule__State__NameAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3977:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3981:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3982:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3982:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3983:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_17998); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__NameAssignment_1


    // $ANTLR start rule__State__EventAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3992:1: rule__State__EventAssignment_3 : ( ruleEvent ) ;
    public final void rule__State__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3996:1: ( ( ruleEvent ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3997:1: ( ruleEvent )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3997:1: ( ruleEvent )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3998:1: ruleEvent
            {
             before(grammarAccess.getStateAccess().getEventEventParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__State__EventAssignment_38029);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getStateAccess().getEventEventParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__EventAssignment_3


    // $ANTLR start rule__State__GuardsAssignment_6
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4007:1: rule__State__GuardsAssignment_6 : ( ruleGuard ) ;
    public final void rule__State__GuardsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4011:1: ( ( ruleGuard ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4012:1: ( ruleGuard )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4012:1: ( ruleGuard )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4013:1: ruleGuard
            {
             before(grammarAccess.getStateAccess().getGuardsGuardParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleGuard_in_rule__State__GuardsAssignment_68060);
            ruleGuard();
            _fsp--;

             after(grammarAccess.getStateAccess().getGuardsGuardParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__GuardsAssignment_6


    // $ANTLR start rule__Guard__CasemAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4022:1: rule__Guard__CasemAssignment_1 : ( ruleCase ) ;
    public final void rule__Guard__CasemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4026:1: ( ( ruleCase ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4027:1: ( ruleCase )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4027:1: ( ruleCase )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4028:1: ruleCase
            {
             before(grammarAccess.getGuardAccess().getCasemCaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Guard__CasemAssignment_18091);
            ruleCase();
            _fsp--;

             after(grammarAccess.getGuardAccess().getCasemCaseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__CasemAssignment_1


    // $ANTLR start rule__Guard__OperationAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4037:1: rule__Guard__OperationAssignment_3 : ( ruleOperation ) ;
    public final void rule__Guard__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4041:1: ( ( ruleOperation ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4042:1: ( ruleOperation )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4042:1: ( ruleOperation )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4043:1: ruleOperation
            {
             before(grammarAccess.getGuardAccess().getOperationOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Guard__OperationAssignment_38122);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getGuardAccess().getOperationOperationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Guard__OperationAssignment_3


    // $ANTLR start rule__GetEvent__WhoAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4052:1: rule__GetEvent__WhoAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GetEvent__WhoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4056:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4057:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4057:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4058:1: ( RULE_ID )
            {
             before(grammarAccess.getGetEventAccess().getWhoDefineCrossReference_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4059:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4060:1: RULE_ID
            {
             before(grammarAccess.getGetEventAccess().getWhoDefineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetEvent__WhoAssignment_08157); 
             after(grammarAccess.getGetEventAccess().getWhoDefineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGetEventAccess().getWhoDefineCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__WhoAssignment_0


    // $ANTLR start rule__GetEvent__MessageAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4071:1: rule__GetEvent__MessageAssignment_2 : ( RULE_ID ) ;
    public final void rule__GetEvent__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4075:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4076:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4076:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4077:1: RULE_ID
            {
             before(grammarAccess.getGetEventAccess().getMessageIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetEvent__MessageAssignment_28192); 
             after(grammarAccess.getGetEventAccess().getMessageIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__MessageAssignment_2


    // $ANTLR start rule__IsSendEvent__MessageAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4086:1: rule__IsSendEvent__MessageAssignment_0 : ( RULE_ID ) ;
    public final void rule__IsSendEvent__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4090:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4091:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4091:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4092:1: RULE_ID
            {
             before(grammarAccess.getIsSendEventAccess().getMessageIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IsSendEvent__MessageAssignment_08223); 
             after(grammarAccess.getIsSendEventAccess().getMessageIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IsSendEvent__MessageAssignment_0


    // $ANTLR start rule__Init__KeywordAssignment
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4101:1: rule__Init__KeywordAssignment : ( ( 'INIT' ) ) ;
    public final void rule__Init__KeywordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4105:1: ( ( ( 'INIT' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4106:1: ( ( 'INIT' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4106:1: ( ( 'INIT' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4107:1: ( 'INIT' )
            {
             before(grammarAccess.getInitAccess().getKeywordINITKeyword_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4108:1: ( 'INIT' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4109:1: 'INIT'
            {
             before(grammarAccess.getInitAccess().getKeywordINITKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Init__KeywordAssignment8259); 
             after(grammarAccess.getInitAccess().getKeywordINITKeyword_0()); 

            }

             after(grammarAccess.getInitAccess().getKeywordINITKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Init__KeywordAssignment


    // $ANTLR start rule__Always__KeywordAssignment
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4124:1: rule__Always__KeywordAssignment : ( ( 'always' ) ) ;
    public final void rule__Always__KeywordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4128:1: ( ( ( 'always' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4129:1: ( ( 'always' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4129:1: ( ( 'always' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4130:1: ( 'always' )
            {
             before(grammarAccess.getAlwaysAccess().getKeywordAlwaysKeyword_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4131:1: ( 'always' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4132:1: 'always'
            {
             before(grammarAccess.getAlwaysAccess().getKeywordAlwaysKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Always__KeywordAssignment8303); 
             after(grammarAccess.getAlwaysAccess().getKeywordAlwaysKeyword_0()); 

            }

             after(grammarAccess.getAlwaysAccess().getKeywordAlwaysKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Always__KeywordAssignment


    // $ANTLR start rule__Otherwise__KeywordAssignment
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4147:1: rule__Otherwise__KeywordAssignment : ( ( 'otherwise' ) ) ;
    public final void rule__Otherwise__KeywordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4151:1: ( ( ( 'otherwise' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4152:1: ( ( 'otherwise' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4152:1: ( ( 'otherwise' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4153:1: ( 'otherwise' )
            {
             before(grammarAccess.getOtherwiseAccess().getKeywordOtherwiseKeyword_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4154:1: ( 'otherwise' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4155:1: 'otherwise'
            {
             before(grammarAccess.getOtherwiseAccess().getKeywordOtherwiseKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Otherwise__KeywordAssignment8347); 
             after(grammarAccess.getOtherwiseAccess().getKeywordOtherwiseKeyword_0()); 

            }

             after(grammarAccess.getOtherwiseAccess().getKeywordOtherwiseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Otherwise__KeywordAssignment


    // $ANTLR start rule__Source__KeywordAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4170:1: rule__Source__KeywordAssignment_0 : ( ( 'source' ) ) ;
    public final void rule__Source__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4174:1: ( ( ( 'source' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4175:1: ( ( 'source' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4175:1: ( ( 'source' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4176:1: ( 'source' )
            {
             before(grammarAccess.getSourceAccess().getKeywordSourceKeyword_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4177:1: ( 'source' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4178:1: 'source'
            {
             before(grammarAccess.getSourceAccess().getKeywordSourceKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Source__KeywordAssignment_08391); 
             after(grammarAccess.getSourceAccess().getKeywordSourceKeyword_0_0()); 

            }

             after(grammarAccess.getSourceAccess().getKeywordSourceKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__KeywordAssignment_0


    // $ANTLR start rule__Source__EventSourceAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4193:1: rule__Source__EventSourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Source__EventSourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4197:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4198:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4198:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4199:1: ( RULE_ID )
            {
             before(grammarAccess.getSourceAccess().getEventSourceEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4200:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4201:1: RULE_ID
            {
             before(grammarAccess.getSourceAccess().getEventSourceEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Source__EventSourceAssignment_28434); 
             after(grammarAccess.getSourceAccess().getEventSourceEventSourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSourceAccess().getEventSourceEventSourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__EventSourceAssignment_2


    // $ANTLR start rule__From__KeywordAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4212:1: rule__From__KeywordAssignment_0 : ( ( 'from' ) ) ;
    public final void rule__From__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4216:1: ( ( ( 'from' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4217:1: ( ( 'from' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4217:1: ( ( 'from' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4218:1: ( 'from' )
            {
             before(grammarAccess.getFromAccess().getKeywordFromKeyword_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4219:1: ( 'from' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4220:1: 'from'
            {
             before(grammarAccess.getFromAccess().getKeywordFromKeyword_0_0()); 
            match(input,41,FOLLOW_41_in_rule__From__KeywordAssignment_08474); 
             after(grammarAccess.getFromAccess().getKeywordFromKeyword_0_0()); 

            }

             after(grammarAccess.getFromAccess().getKeywordFromKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__KeywordAssignment_0


    // $ANTLR start rule__From__EventSourceAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4235:1: rule__From__EventSourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__From__EventSourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4239:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4240:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4240:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4241:1: ( RULE_ID )
            {
             before(grammarAccess.getFromAccess().getEventSourceEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4242:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4243:1: RULE_ID
            {
             before(grammarAccess.getFromAccess().getEventSourceEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__From__EventSourceAssignment_28517); 
             after(grammarAccess.getFromAccess().getEventSourceEventSourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFromAccess().getEventSourceEventSourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__EventSourceAssignment_2


 

    public static final BitSet FOLLOW_rulePDLFile_in_entryRulePDLFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePDLFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__0_in_rulePDLFile94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__0_in_ruleDefinitions154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSource_in_entryRuleEventSource183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSource190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventSource__Alternatives_in_ruleEventSource216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitrator_in_entryRuleArbitrator243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitrator250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__0_in_ruleArbitrator276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__0_in_ruleParticipant336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCipher_in_entryRuleCipher363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCipher370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__Group__0_in_ruleCipher396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_entryRuleTransactions423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactions430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0_in_ruleTransactions456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0_in_ruleTransaction516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_entryRuleDecrypt663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecrypt670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__0_in_ruleDecrypt696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_entryRuleEncrypt723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncrypt730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__0_in_ruleEncrypt756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0_in_ruleSend816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0_in_rulePrint876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_entryRuleExchange963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExchange970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__0_in_ruleExchange996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_entryRuleStates1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStates1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0_in_ruleStates1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_entryRuleGetEvent1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetEvent1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__0_in_ruleGetEvent1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsSendEvent1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__0_in_ruleIsSendEvent1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_entryRuleInit1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInit1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Init__KeywordAssignment_in_ruleInit1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Alternatives_in_ruleCase1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_entryRuleAlways1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlways1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Always__KeywordAssignment_in_ruleAlways1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_entryRuleOtherwise1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherwise1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Otherwise__KeywordAssignment_in_ruleOtherwise1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__0_in_ruleSource1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0_in_ruleFrom1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitrator_in_rule__EventSource__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_rule__EventSource__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_rule__Operation__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_rule__Operation__Alternatives1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__Operation__Alternatives1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_rule__Operation__Alternatives1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__Operation__Alternatives1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_rule__Operation__Alternatives1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_rule__Event__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_rule__Event__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_rule__Event__Alternatives1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_rule__Case__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_rule__Case__Alternatives2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__Case__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_rule__Case__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__0__Impl_in_rule__PDLFile__Group__02066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__1_in_rule__PDLFile__Group__02069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PDLFile__Group__0__Impl2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__1__Impl_in_rule__PDLFile__Group__12128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__2_in_rule__PDLFile__Group__12131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__NameAssignment_1_in_rule__PDLFile__Group__1__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__2__Impl_in_rule__PDLFile__Group__22188 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__3_in_rule__PDLFile__Group__22191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PDLFile__Group__2__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__3__Impl_in_rule__PDLFile__Group__32250 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__4_in_rule__PDLFile__Group__32253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__DefinitionAssignment_3_in_rule__PDLFile__Group__3__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__4__Impl_in_rule__PDLFile__Group__42310 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__5_in_rule__PDLFile__Group__42313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__TransactionAssignment_4_in_rule__PDLFile__Group__4__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__5__Impl_in_rule__PDLFile__Group__52370 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__6_in_rule__PDLFile__Group__52373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__StateAssignment_5_in_rule__PDLFile__Group__5__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__6__Impl_in_rule__PDLFile__Group__62430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PDLFile__Group__6__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__02503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__02506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Definitions__Group__0__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__12565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__12568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__SourcesAssignment_1_in_rule__Definitions__Group__1__Impl2595 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__22626 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Definitions__Group__3_in_rule__Definitions__Group__22629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__CipherAssignment_2_in_rule__Definitions__Group__2__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__3__Impl_in_rule__Definitions__Group__32686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Definitions__Group__3__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__0__Impl_in_rule__Arbitrator__Group__02753 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__1_in_rule__Arbitrator__Group__02756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__NameAssignment_0_in_rule__Arbitrator__Group__0__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__1__Impl_in_rule__Arbitrator__Group__12813 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__2_in_rule__Arbitrator__Group__12816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Arbitrator__Group__1__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__2__Impl_in_rule__Arbitrator__Group__22875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__KeywordAssignment_2_in_rule__Arbitrator__Group__2__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__02938 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__02941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__12998 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__13001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Participant__Group__1__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__23060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__KeywordAssignment_2_in_rule__Participant__Group__2__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__Group__0__Impl_in_rule__Cipher__Group__03123 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Cipher__Group__1_in_rule__Cipher__Group__03126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__NameAssignment_0_in_rule__Cipher__Group__0__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__Group__1__Impl_in_rule__Cipher__Group__13183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Cipher__Group__2_in_rule__Cipher__Group__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cipher__Group__1__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__Group__2__Impl_in_rule__Cipher__Group__23245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__KeywordAssignment_2_in_rule__Cipher__Group__2__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__03308 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__03311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Transactions__Group__0__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__13370 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transactions__Group__2_in_rule__Transactions__Group__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__TransactionsAssignment_1_in_rule__Transactions__Group__1__Impl3400 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__2__Impl_in_rule__Transactions__Group__23431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transactions__Group__2__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__03496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__03499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transaction__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__13558 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__13561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__23618 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__23621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transaction__Group__2__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__33680 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__33683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__ArgumentsAssignment_3_in_rule__Transaction__Group__3__Impl3710 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__43741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__43744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Transaction__Group__4__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__53803 = new BitSet(new long[]{0x000000000CA02010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__53806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Transaction__Group__5__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__63865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__7_in_rule__Transaction__Group__63868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__OperationsAssignment_6_in_rule__Transaction__Group__6__Impl3895 = new BitSet(new long[]{0x000000000CA00012L});
    public static final BitSet FOLLOW_rule__Transaction__Group__7__Impl_in_rule__Transaction__Group__73926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transaction__Group__7__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__KeywordAssignment_0_in_rule__Argument__Group__0__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__0__Impl_in_rule__Decrypt__Group__04122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__1_in_rule__Decrypt__Group__04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Decrypt__Group__0__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__1__Impl_in_rule__Decrypt__Group__14184 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__2_in_rule__Decrypt__Group__14187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__MessageAssignment_1_in_rule__Decrypt__Group__1__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__2__Impl_in_rule__Decrypt__Group__24244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__3_in_rule__Decrypt__Group__24247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Decrypt__Group__2__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__3__Impl_in_rule__Decrypt__Group__34306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__ParticipantAssignment_3_in_rule__Decrypt__Group__3__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__0__Impl_in_rule__Encrypt__Group__04371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__1_in_rule__Encrypt__Group__04374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Encrypt__Group__0__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__1__Impl_in_rule__Encrypt__Group__14433 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__2_in_rule__Encrypt__Group__14436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__MessageAssignment_1_in_rule__Encrypt__Group__1__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__2__Impl_in_rule__Encrypt__Group__24493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__3_in_rule__Encrypt__Group__24496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Encrypt__Group__2__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__3__Impl_in_rule__Encrypt__Group__34555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__ParticipantAssignment_3_in_rule__Encrypt__Group__3__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__04620 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__04623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__MessageAssignment_0_in_rule__Send__Group__0__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__14680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__14683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Send__Group__1__Impl4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__24742 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__24745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__SourceAssignment_2_in_rule__Send__Group__2__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__34802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__34805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Send__Group__3__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__44864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__DestinationAssignment_4_in_rule__Send__Group__4__Impl4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__04931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Print__Group__1_in_rule__Print__Group__04934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Print__Group__0__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__14993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__MessageAssignment_1_in_rule__Print__Group__1__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Call__Group__0__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__TransactionNameAssignment_1_in_rule__Call__Group__1__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__0__Impl_in_rule__Exchange__Group__05177 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Exchange__Group__1_in_rule__Exchange__Group__05180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__SourceAssignment_0_in_rule__Exchange__Group__0__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__1__Impl_in_rule__Exchange__Group__15237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exchange__Group__2_in_rule__Exchange__Group__15240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Exchange__Group__1__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__2__Impl_in_rule__Exchange__Group__25299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__DestinationAssignment_2_in_rule__Exchange__Group__2__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__05362 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_rule__States__Group__1_in_rule__States__Group__05365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__States__Group__0__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__15424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__States__Group__2_in_rule__States__Group__15427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__StatesAssignment_1_in_rule__States__Group__1__Impl5454 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__25485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__States__Group__2__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__05553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__State__Group__0__Impl5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__15615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__25672 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__25675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__2__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__35734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__35737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__EventAssignment_3_in_rule__State__Group__3__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__45794 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__45797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__State__Group__4__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__55856 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_rule__State__Group__6_in_rule__State__Group__55859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__State__Group__5__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__65918 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__State__Group__7_in_rule__State__Group__65921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__GuardsAssignment_6_in_rule__State__Group__6__Impl5948 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__75979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__State__Group__7__Impl6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06054 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Guard__Group__0__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16116 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__CasemAssignment_1_in_rule__Guard__Group__1__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26176 = new BitSet(new long[]{0x000000000CA00010L});
    public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Guard__Group__2__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__OperationAssignment_3_in_rule__Guard__Group__3__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__0__Impl_in_rule__GetEvent__Group__06303 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__1_in_rule__GetEvent__Group__06306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__WhoAssignment_0_in_rule__GetEvent__Group__0__Impl6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__1__Impl_in_rule__GetEvent__Group__16363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__2_in_rule__GetEvent__Group__16366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GetEvent__Group__1__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__2__Impl_in_rule__GetEvent__Group__26425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__MessageAssignment_2_in_rule__GetEvent__Group__2__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__0__Impl_in_rule__IsSendEvent__Group__06488 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__1_in_rule__IsSendEvent__Group__06491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__MessageAssignment_0_in_rule__IsSendEvent__Group__0__Impl6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__1__Impl_in_rule__IsSendEvent__Group__16548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IsSendEvent__Group__1__Impl6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__0__Impl_in_rule__Source__Group__06611 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Source__Group__1_in_rule__Source__Group__06614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__KeywordAssignment_0_in_rule__Source__Group__0__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__1__Impl_in_rule__Source__Group__16671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Source__Group__2_in_rule__Source__Group__16674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Source__Group__1__Impl6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__2__Impl_in_rule__Source__Group__26733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__EventSourceAssignment_2_in_rule__Source__Group__2__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__06796 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__From__Group__1_in_rule__From__Group__06799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__KeywordAssignment_0_in_rule__From__Group__0__Impl6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__16856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__From__Group__2_in_rule__From__Group__16859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__From__Group__1__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__26918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__EventSourceAssignment_2_in_rule__From__Group__2__Impl6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PDLFile__NameAssignment_16986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_rule__PDLFile__DefinitionAssignment_37017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_rule__PDLFile__TransactionAssignment_47048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_rule__PDLFile__StateAssignment_57079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSource_in_rule__Definitions__SourcesAssignment_17110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCipher_in_rule__Definitions__CipherAssignment_27141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Arbitrator__NameAssignment_07172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Arbitrator__KeywordAssignment_27208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_07247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Participant__KeywordAssignment_27283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cipher__NameAssignment_07322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cipher__KeywordAssignment_27353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__Transactions__TransactionsAssignment_17384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_17415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Transaction__ArgumentsAssignment_37446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Transaction__OperationsAssignment_67477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__KeywordAssignment_07508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_17539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decrypt__MessageAssignment_17570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decrypt__ParticipantAssignment_37605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Encrypt__MessageAssignment_17640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Encrypt__ParticipantAssignment_37675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__MessageAssignment_07710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__SourceAssignment_27745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__DestinationAssignment_47784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Print__MessageAssignment_17819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Call__TransactionNameAssignment_17854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exchange__SourceAssignment_07893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exchange__DestinationAssignment_27932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__States__StatesAssignment_17967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_17998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__State__EventAssignment_38029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__State__GuardsAssignment_68060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Guard__CasemAssignment_18091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Guard__OperationAssignment_38122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetEvent__WhoAssignment_08157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetEvent__MessageAssignment_28192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IsSendEvent__MessageAssignment_08223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Init__KeywordAssignment8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Always__KeywordAssignment8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Otherwise__KeywordAssignment8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Source__KeywordAssignment_08391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Source__EventSourceAssignment_28434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__From__KeywordAssignment_08474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__From__EventSourceAssignment_28517 = new BitSet(new long[]{0x0000000000000002L});

}