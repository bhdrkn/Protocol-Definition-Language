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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AsynchronousCipher'", "'SynchronousCipher'", "'Arbitrator'", "'Participant'", "'Message'", "'['", "']'", "'[END]'", "'[DEFINITIONS]'", "'='", "'[TRANSACTIONS]'", "'TRANSACTION'", "'('", "')'", "'[BEGIN]'", "'decrypt'", "'for'", "'encrypt'", "'::'", "'->'", "'print'", "'CALL'", "'exchange'", "'redirect'", "'[STATES]'", "'STATE'", "'|'", "'=>'", "'GET'", "'SENDS'", "'IS_SEND'", "'[TEST]'", "'INIT'", "'always'", "'otherwise'", "'to'", "'from'"
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


    // $ANTLR start entryRuleMessage
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:231:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:232:1: ( ruleMessage EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:233:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage423);
            ruleMessage();
            _fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage430); 

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
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:240:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:244:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:245:1: ( ( rule__Message__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:245:1: ( ( rule__Message__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:246:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:247:1: ( rule__Message__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:247:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage456);
            rule__Message__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

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
    // $ANTLR end ruleMessage


    // $ANTLR start entryRuleKeyword
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:259:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:260:1: ( ruleKeyword EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:261:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_ruleKeyword_in_entryRuleKeyword483);
            ruleKeyword();
            _fsp--;

             after(grammarAccess.getKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyword490); 

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
    // $ANTLR end entryRuleKeyword


    // $ANTLR start ruleKeyword
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:268:1: ruleKeyword : ( ( rule__Keyword__Alternatives ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:272:2: ( ( ( rule__Keyword__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:273:1: ( ( rule__Keyword__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:273:1: ( ( rule__Keyword__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:274:1: ( rule__Keyword__Alternatives )
            {
             before(grammarAccess.getKeywordAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:275:1: ( rule__Keyword__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:275:2: rule__Keyword__Alternatives
            {
            pushFollow(FOLLOW_rule__Keyword__Alternatives_in_ruleKeyword516);
            rule__Keyword__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getKeywordAccess().getAlternatives()); 

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
    // $ANTLR end ruleKeyword


    // $ANTLR start entryRuleTransactions
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:287:1: entryRuleTransactions : ruleTransactions EOF ;
    public final void entryRuleTransactions() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:288:1: ( ruleTransactions EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:289:1: ruleTransactions EOF
            {
             before(grammarAccess.getTransactionsRule()); 
            pushFollow(FOLLOW_ruleTransactions_in_entryRuleTransactions543);
            ruleTransactions();
            _fsp--;

             after(grammarAccess.getTransactionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactions550); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:296:1: ruleTransactions : ( ( rule__Transactions__Group__0 ) ) ;
    public final void ruleTransactions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:300:2: ( ( ( rule__Transactions__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:301:1: ( ( rule__Transactions__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:301:1: ( ( rule__Transactions__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:302:1: ( rule__Transactions__Group__0 )
            {
             before(grammarAccess.getTransactionsAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:303:1: ( rule__Transactions__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:303:2: rule__Transactions__Group__0
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0_in_ruleTransactions576);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:315:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:316:1: ( ruleTransaction EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:317:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction603);
            ruleTransaction();
            _fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction610); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:324:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:328:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:329:1: ( ( rule__Transaction__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:329:1: ( ( rule__Transaction__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:330:1: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:331:1: ( rule__Transaction__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:331:2: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0_in_ruleTransaction636);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:343:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:344:1: ( ruleArgument EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:345:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument663);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument670); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:352:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:356:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:357:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:357:1: ( ( rule__Argument__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:358:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:359:1: ( rule__Argument__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:359:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument696);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:371:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:372:1: ( ruleOperation EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:373:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation723);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation730); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:380:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:384:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:385:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:385:1: ( ( rule__Operation__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:386:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:387:1: ( rule__Operation__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:387:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation756);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:399:1: entryRuleDecrypt : ruleDecrypt EOF ;
    public final void entryRuleDecrypt() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:400:1: ( ruleDecrypt EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:401:1: ruleDecrypt EOF
            {
             before(grammarAccess.getDecryptRule()); 
            pushFollow(FOLLOW_ruleDecrypt_in_entryRuleDecrypt783);
            ruleDecrypt();
            _fsp--;

             after(grammarAccess.getDecryptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecrypt790); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:408:1: ruleDecrypt : ( ( rule__Decrypt__Group__0 ) ) ;
    public final void ruleDecrypt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:412:2: ( ( ( rule__Decrypt__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:413:1: ( ( rule__Decrypt__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:413:1: ( ( rule__Decrypt__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:414:1: ( rule__Decrypt__Group__0 )
            {
             before(grammarAccess.getDecryptAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:415:1: ( rule__Decrypt__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:415:2: rule__Decrypt__Group__0
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__0_in_ruleDecrypt816);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:427:1: entryRuleEncrypt : ruleEncrypt EOF ;
    public final void entryRuleEncrypt() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:428:1: ( ruleEncrypt EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:429:1: ruleEncrypt EOF
            {
             before(grammarAccess.getEncryptRule()); 
            pushFollow(FOLLOW_ruleEncrypt_in_entryRuleEncrypt843);
            ruleEncrypt();
            _fsp--;

             after(grammarAccess.getEncryptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncrypt850); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:436:1: ruleEncrypt : ( ( rule__Encrypt__Group__0 ) ) ;
    public final void ruleEncrypt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:440:2: ( ( ( rule__Encrypt__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:441:1: ( ( rule__Encrypt__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:441:1: ( ( rule__Encrypt__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:442:1: ( rule__Encrypt__Group__0 )
            {
             before(grammarAccess.getEncryptAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:443:1: ( rule__Encrypt__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:443:2: rule__Encrypt__Group__0
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__0_in_ruleEncrypt876);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:455:1: entryRuleSend : ruleSend EOF ;
    public final void entryRuleSend() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:456:1: ( ruleSend EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:457:1: ruleSend EOF
            {
             before(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend903);
            ruleSend();
            _fsp--;

             after(grammarAccess.getSendRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend910); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:464:1: ruleSend : ( ( rule__Send__Group__0 ) ) ;
    public final void ruleSend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:468:2: ( ( ( rule__Send__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:469:1: ( ( rule__Send__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:469:1: ( ( rule__Send__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:470:1: ( rule__Send__Group__0 )
            {
             before(grammarAccess.getSendAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:471:1: ( rule__Send__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:471:2: rule__Send__Group__0
            {
            pushFollow(FOLLOW_rule__Send__Group__0_in_ruleSend936);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:483:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:484:1: ( rulePrint EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:485:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint963);
            rulePrint();
            _fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint970); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:492:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:496:2: ( ( ( rule__Print__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:497:1: ( ( rule__Print__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:497:1: ( ( rule__Print__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:498:1: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:499:1: ( rule__Print__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:499:2: rule__Print__Group__0
            {
            pushFollow(FOLLOW_rule__Print__Group__0_in_rulePrint996);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:511:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:512:1: ( ruleCall EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:513:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1023);
            ruleCall();
            _fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1030); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:520:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:524:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:525:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:525:1: ( ( rule__Call__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:526:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:527:1: ( rule__Call__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:527:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall1056);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:539:1: entryRuleExchange : ruleExchange EOF ;
    public final void entryRuleExchange() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:540:1: ( ruleExchange EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:541:1: ruleExchange EOF
            {
             before(grammarAccess.getExchangeRule()); 
            pushFollow(FOLLOW_ruleExchange_in_entryRuleExchange1083);
            ruleExchange();
            _fsp--;

             after(grammarAccess.getExchangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExchange1090); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:548:1: ruleExchange : ( ( rule__Exchange__Group__0 ) ) ;
    public final void ruleExchange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:552:2: ( ( ( rule__Exchange__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:553:1: ( ( rule__Exchange__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:553:1: ( ( rule__Exchange__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:554:1: ( rule__Exchange__Group__0 )
            {
             before(grammarAccess.getExchangeAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:555:1: ( rule__Exchange__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:555:2: rule__Exchange__Group__0
            {
            pushFollow(FOLLOW_rule__Exchange__Group__0_in_ruleExchange1116);
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


    // $ANTLR start entryRuleRedirect
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:567:1: entryRuleRedirect : ruleRedirect EOF ;
    public final void entryRuleRedirect() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:568:1: ( ruleRedirect EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:569:1: ruleRedirect EOF
            {
             before(grammarAccess.getRedirectRule()); 
            pushFollow(FOLLOW_ruleRedirect_in_entryRuleRedirect1143);
            ruleRedirect();
            _fsp--;

             after(grammarAccess.getRedirectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRedirect1150); 

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
    // $ANTLR end entryRuleRedirect


    // $ANTLR start ruleRedirect
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:576:1: ruleRedirect : ( ( rule__Redirect__Group__0 ) ) ;
    public final void ruleRedirect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:580:2: ( ( ( rule__Redirect__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:581:1: ( ( rule__Redirect__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:581:1: ( ( rule__Redirect__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:582:1: ( rule__Redirect__Group__0 )
            {
             before(grammarAccess.getRedirectAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:583:1: ( rule__Redirect__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:583:2: rule__Redirect__Group__0
            {
            pushFollow(FOLLOW_rule__Redirect__Group__0_in_ruleRedirect1176);
            rule__Redirect__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRedirectAccess().getGroup()); 

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
    // $ANTLR end ruleRedirect


    // $ANTLR start entryRuleStates
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:595:1: entryRuleStates : ruleStates EOF ;
    public final void entryRuleStates() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:596:1: ( ruleStates EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:597:1: ruleStates EOF
            {
             before(grammarAccess.getStatesRule()); 
            pushFollow(FOLLOW_ruleStates_in_entryRuleStates1203);
            ruleStates();
            _fsp--;

             after(grammarAccess.getStatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStates1210); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:604:1: ruleStates : ( ( rule__States__Group__0 ) ) ;
    public final void ruleStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:608:2: ( ( ( rule__States__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:609:1: ( ( rule__States__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:609:1: ( ( rule__States__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:610:1: ( rule__States__Group__0 )
            {
             before(grammarAccess.getStatesAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:611:1: ( rule__States__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:611:2: rule__States__Group__0
            {
            pushFollow(FOLLOW_rule__States__Group__0_in_ruleStates1236);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:623:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:624:1: ( ruleState EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:625:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1263);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1270); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:632:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:636:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:637:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:637:1: ( ( rule__State__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:638:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:639:1: ( rule__State__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:639:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState1296);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:651:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:652:1: ( ruleGuard EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:653:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard1323);
            ruleGuard();
            _fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard1330); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:660:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:664:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:665:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:665:1: ( ( rule__Guard__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:666:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:667:1: ( rule__Guard__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:667:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard1356);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:679:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:680:1: ( ruleEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:681:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1383);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1390); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:688:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:692:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:693:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:693:1: ( ( rule__Event__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:694:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:695:1: ( rule__Event__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:695:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent1416);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:707:1: entryRuleGetEvent : ruleGetEvent EOF ;
    public final void entryRuleGetEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:708:1: ( ruleGetEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:709:1: ruleGetEvent EOF
            {
             before(grammarAccess.getGetEventRule()); 
            pushFollow(FOLLOW_ruleGetEvent_in_entryRuleGetEvent1443);
            ruleGetEvent();
            _fsp--;

             after(grammarAccess.getGetEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetEvent1450); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:716:1: ruleGetEvent : ( ( rule__GetEvent__Group__0 ) ) ;
    public final void ruleGetEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:720:2: ( ( ( rule__GetEvent__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:721:1: ( ( rule__GetEvent__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:721:1: ( ( rule__GetEvent__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:722:1: ( rule__GetEvent__Group__0 )
            {
             before(grammarAccess.getGetEventAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:723:1: ( rule__GetEvent__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:723:2: rule__GetEvent__Group__0
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__0_in_ruleGetEvent1476);
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


    // $ANTLR start entryRuleSendsEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:735:1: entryRuleSendsEvent : ruleSendsEvent EOF ;
    public final void entryRuleSendsEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:736:1: ( ruleSendsEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:737:1: ruleSendsEvent EOF
            {
             before(grammarAccess.getSendsEventRule()); 
            pushFollow(FOLLOW_ruleSendsEvent_in_entryRuleSendsEvent1503);
            ruleSendsEvent();
            _fsp--;

             after(grammarAccess.getSendsEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSendsEvent1510); 

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
    // $ANTLR end entryRuleSendsEvent


    // $ANTLR start ruleSendsEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:744:1: ruleSendsEvent : ( ( rule__SendsEvent__Group__0 ) ) ;
    public final void ruleSendsEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:748:2: ( ( ( rule__SendsEvent__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:749:1: ( ( rule__SendsEvent__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:749:1: ( ( rule__SendsEvent__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:750:1: ( rule__SendsEvent__Group__0 )
            {
             before(grammarAccess.getSendsEventAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:751:1: ( rule__SendsEvent__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:751:2: rule__SendsEvent__Group__0
            {
            pushFollow(FOLLOW_rule__SendsEvent__Group__0_in_ruleSendsEvent1536);
            rule__SendsEvent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSendsEventAccess().getGroup()); 

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
    // $ANTLR end ruleSendsEvent


    // $ANTLR start entryRuleIsSendEvent
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:763:1: entryRuleIsSendEvent : ruleIsSendEvent EOF ;
    public final void entryRuleIsSendEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:764:1: ( ruleIsSendEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:765:1: ruleIsSendEvent EOF
            {
             before(grammarAccess.getIsSendEventRule()); 
            pushFollow(FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent1563);
            ruleIsSendEvent();
            _fsp--;

             after(grammarAccess.getIsSendEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsSendEvent1570); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:772:1: ruleIsSendEvent : ( ( rule__IsSendEvent__Group__0 ) ) ;
    public final void ruleIsSendEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:776:2: ( ( ( rule__IsSendEvent__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:777:1: ( ( rule__IsSendEvent__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:777:1: ( ( rule__IsSendEvent__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:778:1: ( rule__IsSendEvent__Group__0 )
            {
             before(grammarAccess.getIsSendEventAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:779:1: ( rule__IsSendEvent__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:779:2: rule__IsSendEvent__Group__0
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__0_in_ruleIsSendEvent1596);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:791:1: entryRuleInit : ruleInit EOF ;
    public final void entryRuleInit() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:792:1: ( ruleInit EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:793:1: ruleInit EOF
            {
             before(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_ruleInit_in_entryRuleInit1623);
            ruleInit();
            _fsp--;

             after(grammarAccess.getInitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInit1630); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:800:1: ruleInit : ( ( rule__Init__KeywordAssignment ) ) ;
    public final void ruleInit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:804:2: ( ( ( rule__Init__KeywordAssignment ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:805:1: ( ( rule__Init__KeywordAssignment ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:805:1: ( ( rule__Init__KeywordAssignment ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:806:1: ( rule__Init__KeywordAssignment )
            {
             before(grammarAccess.getInitAccess().getKeywordAssignment()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:807:1: ( rule__Init__KeywordAssignment )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:807:2: rule__Init__KeywordAssignment
            {
            pushFollow(FOLLOW_rule__Init__KeywordAssignment_in_ruleInit1656);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:819:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:820:1: ( ruleCase EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:821:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase1683);
            ruleCase();
            _fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase1690); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:828:1: ruleCase : ( ( rule__Case__Alternatives ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:832:2: ( ( ( rule__Case__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:833:1: ( ( rule__Case__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:833:1: ( ( rule__Case__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:834:1: ( rule__Case__Alternatives )
            {
             before(grammarAccess.getCaseAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:835:1: ( rule__Case__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:835:2: rule__Case__Alternatives
            {
            pushFollow(FOLLOW_rule__Case__Alternatives_in_ruleCase1716);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:847:1: entryRuleAlways : ruleAlways EOF ;
    public final void entryRuleAlways() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:848:1: ( ruleAlways EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:849:1: ruleAlways EOF
            {
             before(grammarAccess.getAlwaysRule()); 
            pushFollow(FOLLOW_ruleAlways_in_entryRuleAlways1743);
            ruleAlways();
            _fsp--;

             after(grammarAccess.getAlwaysRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlways1750); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:856:1: ruleAlways : ( ( rule__Always__KeywordAssignment ) ) ;
    public final void ruleAlways() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:860:2: ( ( ( rule__Always__KeywordAssignment ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:861:1: ( ( rule__Always__KeywordAssignment ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:861:1: ( ( rule__Always__KeywordAssignment ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:862:1: ( rule__Always__KeywordAssignment )
            {
             before(grammarAccess.getAlwaysAccess().getKeywordAssignment()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:863:1: ( rule__Always__KeywordAssignment )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:863:2: rule__Always__KeywordAssignment
            {
            pushFollow(FOLLOW_rule__Always__KeywordAssignment_in_ruleAlways1776);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:875:1: entryRuleOtherwise : ruleOtherwise EOF ;
    public final void entryRuleOtherwise() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:876:1: ( ruleOtherwise EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:877:1: ruleOtherwise EOF
            {
             before(grammarAccess.getOtherwiseRule()); 
            pushFollow(FOLLOW_ruleOtherwise_in_entryRuleOtherwise1803);
            ruleOtherwise();
            _fsp--;

             after(grammarAccess.getOtherwiseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherwise1810); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:884:1: ruleOtherwise : ( ( rule__Otherwise__KeywordAssignment ) ) ;
    public final void ruleOtherwise() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:888:2: ( ( ( rule__Otherwise__KeywordAssignment ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:889:1: ( ( rule__Otherwise__KeywordAssignment ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:889:1: ( ( rule__Otherwise__KeywordAssignment ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:890:1: ( rule__Otherwise__KeywordAssignment )
            {
             before(grammarAccess.getOtherwiseAccess().getKeywordAssignment()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:891:1: ( rule__Otherwise__KeywordAssignment )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:891:2: rule__Otherwise__KeywordAssignment
            {
            pushFollow(FOLLOW_rule__Otherwise__KeywordAssignment_in_ruleOtherwise1836);
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


    // $ANTLR start entryRuleTo
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:903:1: entryRuleTo : ruleTo EOF ;
    public final void entryRuleTo() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:904:1: ( ruleTo EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:905:1: ruleTo EOF
            {
             before(grammarAccess.getToRule()); 
            pushFollow(FOLLOW_ruleTo_in_entryRuleTo1863);
            ruleTo();
            _fsp--;

             after(grammarAccess.getToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTo1870); 

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
    // $ANTLR end entryRuleTo


    // $ANTLR start ruleTo
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:912:1: ruleTo : ( ( rule__To__Group__0 ) ) ;
    public final void ruleTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:916:2: ( ( ( rule__To__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:917:1: ( ( rule__To__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:917:1: ( ( rule__To__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:918:1: ( rule__To__Group__0 )
            {
             before(grammarAccess.getToAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:919:1: ( rule__To__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:919:2: rule__To__Group__0
            {
            pushFollow(FOLLOW_rule__To__Group__0_in_ruleTo1896);
            rule__To__Group__0();
            _fsp--;


            }

             after(grammarAccess.getToAccess().getGroup()); 

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
    // $ANTLR end ruleTo


    // $ANTLR start entryRuleFrom
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:931:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:932:1: ( ruleFrom EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:933:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom1923);
            ruleFrom();
            _fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom1930); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:940:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:944:2: ( ( ( rule__From__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:945:1: ( ( rule__From__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:945:1: ( ( rule__From__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:946:1: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:947:1: ( rule__From__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:947:2: rule__From__Group__0
            {
            pushFollow(FOLLOW_rule__From__Group__0_in_ruleFrom1956);
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


    // $ANTLR start entryRuleTest
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:959:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:960:1: ( ruleTest EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:961:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest1983);
            ruleTest();
            _fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest1990); 

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
    // $ANTLR end entryRuleTest


    // $ANTLR start ruleTest
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:968:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:972:2: ( ( ( rule__Test__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:973:1: ( ( rule__Test__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:973:1: ( ( rule__Test__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:974:1: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:975:1: ( rule__Test__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:975:2: rule__Test__Group__0
            {
            pushFollow(FOLLOW_rule__Test__Group__0_in_ruleTest2016);
            rule__Test__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

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
    // $ANTLR end ruleTest


    // $ANTLR start rule__EventSource__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:988:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );
    public final void rule__EventSource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:992:1: ( ( ruleArbitrator ) | ( ruleParticipant ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==14) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==13) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("988:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("988:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("988:1: rule__EventSource__Alternatives : ( ( ruleArbitrator ) | ( ruleParticipant ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:993:1: ( ruleArbitrator )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:993:1: ( ruleArbitrator )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:994:1: ruleArbitrator
                    {
                     before(grammarAccess.getEventSourceAccess().getArbitratorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleArbitrator_in_rule__EventSource__Alternatives2053);
                    ruleArbitrator();
                    _fsp--;

                     after(grammarAccess.getEventSourceAccess().getArbitratorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:999:6: ( ruleParticipant )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:999:6: ( ruleParticipant )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1000:1: ruleParticipant
                    {
                     before(grammarAccess.getEventSourceAccess().getParticipantParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParticipant_in_rule__EventSource__Alternatives2070);
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


    // $ANTLR start rule__Cipher__KeywordAlternatives_2_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1010:1: rule__Cipher__KeywordAlternatives_2_0 : ( ( 'AsynchronousCipher' ) | ( 'SynchronousCipher' ) );
    public final void rule__Cipher__KeywordAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1014:1: ( ( 'AsynchronousCipher' ) | ( 'SynchronousCipher' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1010:1: rule__Cipher__KeywordAlternatives_2_0 : ( ( 'AsynchronousCipher' ) | ( 'SynchronousCipher' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1015:1: ( 'AsynchronousCipher' )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1015:1: ( 'AsynchronousCipher' )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1016:1: 'AsynchronousCipher'
                    {
                     before(grammarAccess.getCipherAccess().getKeywordAsynchronousCipherKeyword_2_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Cipher__KeywordAlternatives_2_02103); 
                     after(grammarAccess.getCipherAccess().getKeywordAsynchronousCipherKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1023:6: ( 'SynchronousCipher' )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1023:6: ( 'SynchronousCipher' )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1024:1: 'SynchronousCipher'
                    {
                     before(grammarAccess.getCipherAccess().getKeywordSynchronousCipherKeyword_2_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Cipher__KeywordAlternatives_2_02123); 
                     after(grammarAccess.getCipherAccess().getKeywordSynchronousCipherKeyword_2_0_1()); 

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
    // $ANTLR end rule__Cipher__KeywordAlternatives_2_0


    // $ANTLR start rule__Keyword__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1036:1: rule__Keyword__Alternatives : ( ( 'Arbitrator' ) | ( 'Participant' ) | ( 'Message' ) | ( 'AsynchronousCipher' ) | ( 'SynchronousCipher' ) );
    public final void rule__Keyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1040:1: ( ( 'Arbitrator' ) | ( 'Participant' ) | ( 'Message' ) | ( 'AsynchronousCipher' ) | ( 'SynchronousCipher' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 11:
                {
                alt3=4;
                }
                break;
            case 12:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1036:1: rule__Keyword__Alternatives : ( ( 'Arbitrator' ) | ( 'Participant' ) | ( 'Message' ) | ( 'AsynchronousCipher' ) | ( 'SynchronousCipher' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1041:1: ( 'Arbitrator' )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1041:1: ( 'Arbitrator' )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1042:1: 'Arbitrator'
                    {
                     before(grammarAccess.getKeywordAccess().getArbitratorKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Keyword__Alternatives2158); 
                     after(grammarAccess.getKeywordAccess().getArbitratorKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1049:6: ( 'Participant' )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1049:6: ( 'Participant' )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1050:1: 'Participant'
                    {
                     before(grammarAccess.getKeywordAccess().getParticipantKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Keyword__Alternatives2178); 
                     after(grammarAccess.getKeywordAccess().getParticipantKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1057:6: ( 'Message' )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1057:6: ( 'Message' )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1058:1: 'Message'
                    {
                     before(grammarAccess.getKeywordAccess().getMessageKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__Keyword__Alternatives2198); 
                     after(grammarAccess.getKeywordAccess().getMessageKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1065:6: ( 'AsynchronousCipher' )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1065:6: ( 'AsynchronousCipher' )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1066:1: 'AsynchronousCipher'
                    {
                     before(grammarAccess.getKeywordAccess().getAsynchronousCipherKeyword_3()); 
                    match(input,11,FOLLOW_11_in_rule__Keyword__Alternatives2218); 
                     after(grammarAccess.getKeywordAccess().getAsynchronousCipherKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1073:6: ( 'SynchronousCipher' )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1073:6: ( 'SynchronousCipher' )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1074:1: 'SynchronousCipher'
                    {
                     before(grammarAccess.getKeywordAccess().getSynchronousCipherKeyword_4()); 
                    match(input,12,FOLLOW_12_in_rule__Keyword__Alternatives2238); 
                     after(grammarAccess.getKeywordAccess().getSynchronousCipherKeyword_4()); 

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
    // $ANTLR end rule__Keyword__Alternatives


    // $ANTLR start rule__Operation__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1086:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) | ( ruleRedirect ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1090:1: ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) | ( ruleRedirect ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt4=6;
                    }
                    break;
                case 29:
                    {
                    alt4=3;
                    }
                    break;
                case 34:
                    {
                    alt4=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1086:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) | ( ruleRedirect ) );", 4, 3, input);

                    throw nvae;
                }

                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1086:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) | ( ruleExchange ) | ( ruleRedirect ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1091:1: ( ruleDecrypt )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1091:1: ( ruleDecrypt )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1092:1: ruleDecrypt
                    {
                     before(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecrypt_in_rule__Operation__Alternatives2272);
                    ruleDecrypt();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1097:6: ( ruleEncrypt )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1097:6: ( ruleEncrypt )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1098:1: ruleEncrypt
                    {
                     before(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEncrypt_in_rule__Operation__Alternatives2289);
                    ruleEncrypt();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1103:6: ( ruleSend )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1103:6: ( ruleSend )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1104:1: ruleSend
                    {
                     before(grammarAccess.getOperationAccess().getSendParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__Operation__Alternatives2306);
                    ruleSend();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getSendParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1109:6: ( rulePrint )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1109:6: ( rulePrint )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1110:1: rulePrint
                    {
                     before(grammarAccess.getOperationAccess().getPrintParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePrint_in_rule__Operation__Alternatives2323);
                    rulePrint();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getPrintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1115:6: ( ruleCall )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1115:6: ( ruleCall )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1116:1: ruleCall
                    {
                     before(grammarAccess.getOperationAccess().getCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__Operation__Alternatives2340);
                    ruleCall();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1121:6: ( ruleExchange )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1121:6: ( ruleExchange )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1122:1: ruleExchange
                    {
                     before(grammarAccess.getOperationAccess().getExchangeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleExchange_in_rule__Operation__Alternatives2357);
                    ruleExchange();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getExchangeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1127:6: ( ruleRedirect )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1127:6: ( ruleRedirect )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1128:1: ruleRedirect
                    {
                     before(grammarAccess.getOperationAccess().getRedirectParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleRedirect_in_rule__Operation__Alternatives2374);
                    ruleRedirect();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getRedirectParserRuleCall_6()); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1138:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) | ( ruleSendsEvent ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1142:1: ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) | ( ruleSendsEvent ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt5=2;
                    }
                    break;
                case 39:
                    {
                    alt5=1;
                    }
                    break;
                case 40:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1138:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) | ( ruleSendsEvent ) );", 5, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA5_0==43) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1138:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) | ( ruleInit ) | ( ruleSendsEvent ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1143:1: ( ruleGetEvent )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1143:1: ( ruleGetEvent )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1144:1: ruleGetEvent
                    {
                     before(grammarAccess.getEventAccess().getGetEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGetEvent_in_rule__Event__Alternatives2406);
                    ruleGetEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getGetEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1149:6: ( ruleIsSendEvent )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1149:6: ( ruleIsSendEvent )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1150:1: ruleIsSendEvent
                    {
                     before(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIsSendEvent_in_rule__Event__Alternatives2423);
                    ruleIsSendEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1155:6: ( ruleInit )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1155:6: ( ruleInit )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1156:1: ruleInit
                    {
                     before(grammarAccess.getEventAccess().getInitParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInit_in_rule__Event__Alternatives2440);
                    ruleInit();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getInitParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1161:6: ( ruleSendsEvent )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1161:6: ( ruleSendsEvent )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1162:1: ruleSendsEvent
                    {
                     before(grammarAccess.getEventAccess().getSendsEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSendsEvent_in_rule__Event__Alternatives2457);
                    ruleSendsEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getSendsEventParserRuleCall_3()); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1172:1: rule__Case__Alternatives : ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleTo ) | ( ruleFrom ) );
    public final void rule__Case__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1176:1: ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleTo ) | ( ruleFrom ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case 46:
                {
                alt6=3;
                }
                break;
            case 47:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1172:1: rule__Case__Alternatives : ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleTo ) | ( ruleFrom ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1177:1: ( ruleAlways )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1177:1: ( ruleAlways )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1178:1: ruleAlways
                    {
                     before(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAlways_in_rule__Case__Alternatives2489);
                    ruleAlways();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1183:6: ( ruleOtherwise )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1183:6: ( ruleOtherwise )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1184:1: ruleOtherwise
                    {
                     before(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOtherwise_in_rule__Case__Alternatives2506);
                    ruleOtherwise();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1189:6: ( ruleTo )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1189:6: ( ruleTo )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1190:1: ruleTo
                    {
                     before(grammarAccess.getCaseAccess().getToParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTo_in_rule__Case__Alternatives2523);
                    ruleTo();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getToParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1195:6: ( ruleFrom )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1195:6: ( ruleFrom )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1196:1: ruleFrom
                    {
                     before(grammarAccess.getCaseAccess().getFromParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFrom_in_rule__Case__Alternatives2540);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1208:1: rule__PDLFile__Group__0 : rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1 ;
    public final void rule__PDLFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1212:1: ( rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1213:2: rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__0__Impl_in_rule__PDLFile__Group__02570);
            rule__PDLFile__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__1_in_rule__PDLFile__Group__02573);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1220:1: rule__PDLFile__Group__0__Impl : ( '[' ) ;
    public final void rule__PDLFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1224:1: ( ( '[' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1225:1: ( '[' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1225:1: ( '[' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1226:1: '['
            {
             before(grammarAccess.getPDLFileAccess().getLeftSquareBracketKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__PDLFile__Group__0__Impl2601); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1239:1: rule__PDLFile__Group__1 : rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2 ;
    public final void rule__PDLFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1243:1: ( rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1244:2: rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__1__Impl_in_rule__PDLFile__Group__12632);
            rule__PDLFile__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__2_in_rule__PDLFile__Group__12635);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1251:1: rule__PDLFile__Group__1__Impl : ( ( rule__PDLFile__NameAssignment_1 ) ) ;
    public final void rule__PDLFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1255:1: ( ( ( rule__PDLFile__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1256:1: ( ( rule__PDLFile__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1256:1: ( ( rule__PDLFile__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1257:1: ( rule__PDLFile__NameAssignment_1 )
            {
             before(grammarAccess.getPDLFileAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1258:1: ( rule__PDLFile__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1258:2: rule__PDLFile__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PDLFile__NameAssignment_1_in_rule__PDLFile__Group__1__Impl2662);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1268:1: rule__PDLFile__Group__2 : rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3 ;
    public final void rule__PDLFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1272:1: ( rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1273:2: rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__2__Impl_in_rule__PDLFile__Group__22692);
            rule__PDLFile__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__3_in_rule__PDLFile__Group__22695);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1280:1: rule__PDLFile__Group__2__Impl : ( ']' ) ;
    public final void rule__PDLFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1284:1: ( ( ']' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1285:1: ( ']' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1285:1: ( ']' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1286:1: ']'
            {
             before(grammarAccess.getPDLFileAccess().getRGhtSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__PDLFile__Group__2__Impl2723); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1299:1: rule__PDLFile__Group__3 : rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4 ;
    public final void rule__PDLFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1303:1: ( rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1304:2: rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__3__Impl_in_rule__PDLFile__Group__32754);
            rule__PDLFile__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__4_in_rule__PDLFile__Group__32757);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1311:1: rule__PDLFile__Group__3__Impl : ( ( rule__PDLFile__DefinitionAssignment_3 ) ) ;
    public final void rule__PDLFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1315:1: ( ( ( rule__PDLFile__DefinitionAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1316:1: ( ( rule__PDLFile__DefinitionAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1316:1: ( ( rule__PDLFile__DefinitionAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1317:1: ( rule__PDLFile__DefinitionAssignment_3 )
            {
             before(grammarAccess.getPDLFileAccess().getDefinitionAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1318:1: ( rule__PDLFile__DefinitionAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1318:2: rule__PDLFile__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__PDLFile__DefinitionAssignment_3_in_rule__PDLFile__Group__3__Impl2784);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1328:1: rule__PDLFile__Group__4 : rule__PDLFile__Group__4__Impl rule__PDLFile__Group__5 ;
    public final void rule__PDLFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1332:1: ( rule__PDLFile__Group__4__Impl rule__PDLFile__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1333:2: rule__PDLFile__Group__4__Impl rule__PDLFile__Group__5
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__4__Impl_in_rule__PDLFile__Group__42814);
            rule__PDLFile__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__5_in_rule__PDLFile__Group__42817);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1340:1: rule__PDLFile__Group__4__Impl : ( ( rule__PDLFile__TransactionAssignment_4 ) ) ;
    public final void rule__PDLFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1344:1: ( ( ( rule__PDLFile__TransactionAssignment_4 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1345:1: ( ( rule__PDLFile__TransactionAssignment_4 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1345:1: ( ( rule__PDLFile__TransactionAssignment_4 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1346:1: ( rule__PDLFile__TransactionAssignment_4 )
            {
             before(grammarAccess.getPDLFileAccess().getTransactionAssignment_4()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1347:1: ( rule__PDLFile__TransactionAssignment_4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1347:2: rule__PDLFile__TransactionAssignment_4
            {
            pushFollow(FOLLOW_rule__PDLFile__TransactionAssignment_4_in_rule__PDLFile__Group__4__Impl2844);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1357:1: rule__PDLFile__Group__5 : rule__PDLFile__Group__5__Impl rule__PDLFile__Group__6 ;
    public final void rule__PDLFile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1361:1: ( rule__PDLFile__Group__5__Impl rule__PDLFile__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1362:2: rule__PDLFile__Group__5__Impl rule__PDLFile__Group__6
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__5__Impl_in_rule__PDLFile__Group__52874);
            rule__PDLFile__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__6_in_rule__PDLFile__Group__52877);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1369:1: rule__PDLFile__Group__5__Impl : ( ( rule__PDLFile__StateAssignment_5 ) ) ;
    public final void rule__PDLFile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1373:1: ( ( ( rule__PDLFile__StateAssignment_5 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1374:1: ( ( rule__PDLFile__StateAssignment_5 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1374:1: ( ( rule__PDLFile__StateAssignment_5 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1375:1: ( rule__PDLFile__StateAssignment_5 )
            {
             before(grammarAccess.getPDLFileAccess().getStateAssignment_5()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1376:1: ( rule__PDLFile__StateAssignment_5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1376:2: rule__PDLFile__StateAssignment_5
            {
            pushFollow(FOLLOW_rule__PDLFile__StateAssignment_5_in_rule__PDLFile__Group__5__Impl2904);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1386:1: rule__PDLFile__Group__6 : rule__PDLFile__Group__6__Impl rule__PDLFile__Group__7 ;
    public final void rule__PDLFile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1390:1: ( rule__PDLFile__Group__6__Impl rule__PDLFile__Group__7 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1391:2: rule__PDLFile__Group__6__Impl rule__PDLFile__Group__7
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__6__Impl_in_rule__PDLFile__Group__62934);
            rule__PDLFile__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__7_in_rule__PDLFile__Group__62937);
            rule__PDLFile__Group__7();
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1398:1: rule__PDLFile__Group__6__Impl : ( ( rule__PDLFile__TestAssignment_6 ) ) ;
    public final void rule__PDLFile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1402:1: ( ( ( rule__PDLFile__TestAssignment_6 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1403:1: ( ( rule__PDLFile__TestAssignment_6 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1403:1: ( ( rule__PDLFile__TestAssignment_6 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1404:1: ( rule__PDLFile__TestAssignment_6 )
            {
             before(grammarAccess.getPDLFileAccess().getTestAssignment_6()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1405:1: ( rule__PDLFile__TestAssignment_6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1405:2: rule__PDLFile__TestAssignment_6
            {
            pushFollow(FOLLOW_rule__PDLFile__TestAssignment_6_in_rule__PDLFile__Group__6__Impl2964);
            rule__PDLFile__TestAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getTestAssignment_6()); 

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


    // $ANTLR start rule__PDLFile__Group__7
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1415:1: rule__PDLFile__Group__7 : rule__PDLFile__Group__7__Impl ;
    public final void rule__PDLFile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1419:1: ( rule__PDLFile__Group__7__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1420:2: rule__PDLFile__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__7__Impl_in_rule__PDLFile__Group__72994);
            rule__PDLFile__Group__7__Impl();
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
    // $ANTLR end rule__PDLFile__Group__7


    // $ANTLR start rule__PDLFile__Group__7__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1426:1: rule__PDLFile__Group__7__Impl : ( '[END]' ) ;
    public final void rule__PDLFile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1430:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1431:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1431:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1432:1: '[END]'
            {
             before(grammarAccess.getPDLFileAccess().getENDKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__PDLFile__Group__7__Impl3022); 
             after(grammarAccess.getPDLFileAccess().getENDKeyword_7()); 

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
    // $ANTLR end rule__PDLFile__Group__7__Impl


    // $ANTLR start rule__Definitions__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1461:1: rule__Definitions__Group__0 : rule__Definitions__Group__0__Impl rule__Definitions__Group__1 ;
    public final void rule__Definitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1465:1: ( rule__Definitions__Group__0__Impl rule__Definitions__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1466:2: rule__Definitions__Group__0__Impl rule__Definitions__Group__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__03069);
            rule__Definitions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__03072);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1473:1: rule__Definitions__Group__0__Impl : ( '[DEFINITIONS]' ) ;
    public final void rule__Definitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1477:1: ( ( '[DEFINITIONS]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1478:1: ( '[DEFINITIONS]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1478:1: ( '[DEFINITIONS]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1479:1: '[DEFINITIONS]'
            {
             before(grammarAccess.getDefinitionsAccess().getDEFINITIONSKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Definitions__Group__0__Impl3100); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1492:1: rule__Definitions__Group__1 : rule__Definitions__Group__1__Impl rule__Definitions__Group__2 ;
    public final void rule__Definitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1496:1: ( rule__Definitions__Group__1__Impl rule__Definitions__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1497:2: rule__Definitions__Group__1__Impl rule__Definitions__Group__2
            {
            pushFollow(FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__13131);
            rule__Definitions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__13134);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1504:1: rule__Definitions__Group__1__Impl : ( ( rule__Definitions__SourcesAssignment_1 )* ) ;
    public final void rule__Definitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1508:1: ( ( ( rule__Definitions__SourcesAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1509:1: ( ( rule__Definitions__SourcesAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1509:1: ( ( rule__Definitions__SourcesAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1510:1: ( rule__Definitions__SourcesAssignment_1 )*
            {
             before(grammarAccess.getDefinitionsAccess().getSourcesAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1511:1: ( rule__Definitions__SourcesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==20) ) {
                        int LA7_2 = input.LA(3);

                        if ( ((LA7_2>=13 && LA7_2<=14)) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1511:2: rule__Definitions__SourcesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Definitions__SourcesAssignment_1_in_rule__Definitions__Group__1__Impl3161);
            	    rule__Definitions__SourcesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1521:1: rule__Definitions__Group__2 : rule__Definitions__Group__2__Impl rule__Definitions__Group__3 ;
    public final void rule__Definitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1525:1: ( rule__Definitions__Group__2__Impl rule__Definitions__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1526:2: rule__Definitions__Group__2__Impl rule__Definitions__Group__3
            {
            pushFollow(FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__23192);
            rule__Definitions__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__3_in_rule__Definitions__Group__23195);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1533:1: rule__Definitions__Group__2__Impl : ( ( rule__Definitions__CipherAssignment_2 ) ) ;
    public final void rule__Definitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1537:1: ( ( ( rule__Definitions__CipherAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1538:1: ( ( rule__Definitions__CipherAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1538:1: ( ( rule__Definitions__CipherAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1539:1: ( rule__Definitions__CipherAssignment_2 )
            {
             before(grammarAccess.getDefinitionsAccess().getCipherAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1540:1: ( rule__Definitions__CipherAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1540:2: rule__Definitions__CipherAssignment_2
            {
            pushFollow(FOLLOW_rule__Definitions__CipherAssignment_2_in_rule__Definitions__Group__2__Impl3222);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1550:1: rule__Definitions__Group__3 : rule__Definitions__Group__3__Impl rule__Definitions__Group__4 ;
    public final void rule__Definitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1554:1: ( rule__Definitions__Group__3__Impl rule__Definitions__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1555:2: rule__Definitions__Group__3__Impl rule__Definitions__Group__4
            {
            pushFollow(FOLLOW_rule__Definitions__Group__3__Impl_in_rule__Definitions__Group__33252);
            rule__Definitions__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__4_in_rule__Definitions__Group__33255);
            rule__Definitions__Group__4();
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1562:1: rule__Definitions__Group__3__Impl : ( ( rule__Definitions__MessageAssignment_3 ) ) ;
    public final void rule__Definitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1566:1: ( ( ( rule__Definitions__MessageAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1567:1: ( ( rule__Definitions__MessageAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1567:1: ( ( rule__Definitions__MessageAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1568:1: ( rule__Definitions__MessageAssignment_3 )
            {
             before(grammarAccess.getDefinitionsAccess().getMessageAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1569:1: ( rule__Definitions__MessageAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1569:2: rule__Definitions__MessageAssignment_3
            {
            pushFollow(FOLLOW_rule__Definitions__MessageAssignment_3_in_rule__Definitions__Group__3__Impl3282);
            rule__Definitions__MessageAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDefinitionsAccess().getMessageAssignment_3()); 

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


    // $ANTLR start rule__Definitions__Group__4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1579:1: rule__Definitions__Group__4 : rule__Definitions__Group__4__Impl ;
    public final void rule__Definitions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1583:1: ( rule__Definitions__Group__4__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1584:2: rule__Definitions__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group__4__Impl_in_rule__Definitions__Group__43312);
            rule__Definitions__Group__4__Impl();
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
    // $ANTLR end rule__Definitions__Group__4


    // $ANTLR start rule__Definitions__Group__4__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1590:1: rule__Definitions__Group__4__Impl : ( '[END]' ) ;
    public final void rule__Definitions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1594:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1595:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1595:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1596:1: '[END]'
            {
             before(grammarAccess.getDefinitionsAccess().getENDKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Definitions__Group__4__Impl3340); 
             after(grammarAccess.getDefinitionsAccess().getENDKeyword_4()); 

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
    // $ANTLR end rule__Definitions__Group__4__Impl


    // $ANTLR start rule__Arbitrator__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1619:1: rule__Arbitrator__Group__0 : rule__Arbitrator__Group__0__Impl rule__Arbitrator__Group__1 ;
    public final void rule__Arbitrator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1623:1: ( rule__Arbitrator__Group__0__Impl rule__Arbitrator__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1624:2: rule__Arbitrator__Group__0__Impl rule__Arbitrator__Group__1
            {
            pushFollow(FOLLOW_rule__Arbitrator__Group__0__Impl_in_rule__Arbitrator__Group__03381);
            rule__Arbitrator__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arbitrator__Group__1_in_rule__Arbitrator__Group__03384);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1631:1: rule__Arbitrator__Group__0__Impl : ( ( rule__Arbitrator__NameAssignment_0 ) ) ;
    public final void rule__Arbitrator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1635:1: ( ( ( rule__Arbitrator__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1636:1: ( ( rule__Arbitrator__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1636:1: ( ( rule__Arbitrator__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1637:1: ( rule__Arbitrator__NameAssignment_0 )
            {
             before(grammarAccess.getArbitratorAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1638:1: ( rule__Arbitrator__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1638:2: rule__Arbitrator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Arbitrator__NameAssignment_0_in_rule__Arbitrator__Group__0__Impl3411);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1648:1: rule__Arbitrator__Group__1 : rule__Arbitrator__Group__1__Impl rule__Arbitrator__Group__2 ;
    public final void rule__Arbitrator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1652:1: ( rule__Arbitrator__Group__1__Impl rule__Arbitrator__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1653:2: rule__Arbitrator__Group__1__Impl rule__Arbitrator__Group__2
            {
            pushFollow(FOLLOW_rule__Arbitrator__Group__1__Impl_in_rule__Arbitrator__Group__13441);
            rule__Arbitrator__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arbitrator__Group__2_in_rule__Arbitrator__Group__13444);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1660:1: rule__Arbitrator__Group__1__Impl : ( '=' ) ;
    public final void rule__Arbitrator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1664:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1665:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1665:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1666:1: '='
            {
             before(grammarAccess.getArbitratorAccess().getEqualsSGnKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Arbitrator__Group__1__Impl3472); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1679:1: rule__Arbitrator__Group__2 : rule__Arbitrator__Group__2__Impl ;
    public final void rule__Arbitrator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1683:1: ( rule__Arbitrator__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1684:2: rule__Arbitrator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Arbitrator__Group__2__Impl_in_rule__Arbitrator__Group__23503);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1690:1: rule__Arbitrator__Group__2__Impl : ( ( rule__Arbitrator__KeywordAssignment_2 ) ) ;
    public final void rule__Arbitrator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1694:1: ( ( ( rule__Arbitrator__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1695:1: ( ( rule__Arbitrator__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1695:1: ( ( rule__Arbitrator__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1696:1: ( rule__Arbitrator__KeywordAssignment_2 )
            {
             before(grammarAccess.getArbitratorAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1697:1: ( rule__Arbitrator__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1697:2: rule__Arbitrator__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Arbitrator__KeywordAssignment_2_in_rule__Arbitrator__Group__2__Impl3530);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1713:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1717:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1718:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
            {
            pushFollow(FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__03566);
            rule__Participant__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__03569);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1725:1: rule__Participant__Group__0__Impl : ( ( rule__Participant__NameAssignment_0 ) ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1729:1: ( ( ( rule__Participant__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1730:1: ( ( rule__Participant__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1730:1: ( ( rule__Participant__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1731:1: ( rule__Participant__NameAssignment_0 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1732:1: ( rule__Participant__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1732:2: rule__Participant__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl3596);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1742:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1746:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1747:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
            {
            pushFollow(FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__13626);
            rule__Participant__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__13629);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1754:1: rule__Participant__Group__1__Impl : ( '=' ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1758:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1759:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1759:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1760:1: '='
            {
             before(grammarAccess.getParticipantAccess().getEqualsSGnKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Participant__Group__1__Impl3657); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1773:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1777:1: ( rule__Participant__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1778:2: rule__Participant__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__23688);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1784:1: rule__Participant__Group__2__Impl : ( ( rule__Participant__KeywordAssignment_2 ) ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1788:1: ( ( ( rule__Participant__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1789:1: ( ( rule__Participant__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1789:1: ( ( rule__Participant__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1790:1: ( rule__Participant__KeywordAssignment_2 )
            {
             before(grammarAccess.getParticipantAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1791:1: ( rule__Participant__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1791:2: rule__Participant__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Participant__KeywordAssignment_2_in_rule__Participant__Group__2__Impl3715);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1807:1: rule__Cipher__Group__0 : rule__Cipher__Group__0__Impl rule__Cipher__Group__1 ;
    public final void rule__Cipher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1811:1: ( rule__Cipher__Group__0__Impl rule__Cipher__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1812:2: rule__Cipher__Group__0__Impl rule__Cipher__Group__1
            {
            pushFollow(FOLLOW_rule__Cipher__Group__0__Impl_in_rule__Cipher__Group__03751);
            rule__Cipher__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Cipher__Group__1_in_rule__Cipher__Group__03754);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1819:1: rule__Cipher__Group__0__Impl : ( ( rule__Cipher__NameAssignment_0 ) ) ;
    public final void rule__Cipher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1823:1: ( ( ( rule__Cipher__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1824:1: ( ( rule__Cipher__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1824:1: ( ( rule__Cipher__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1825:1: ( rule__Cipher__NameAssignment_0 )
            {
             before(grammarAccess.getCipherAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1826:1: ( rule__Cipher__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1826:2: rule__Cipher__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Cipher__NameAssignment_0_in_rule__Cipher__Group__0__Impl3781);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1836:1: rule__Cipher__Group__1 : rule__Cipher__Group__1__Impl rule__Cipher__Group__2 ;
    public final void rule__Cipher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1840:1: ( rule__Cipher__Group__1__Impl rule__Cipher__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1841:2: rule__Cipher__Group__1__Impl rule__Cipher__Group__2
            {
            pushFollow(FOLLOW_rule__Cipher__Group__1__Impl_in_rule__Cipher__Group__13811);
            rule__Cipher__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Cipher__Group__2_in_rule__Cipher__Group__13814);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1848:1: rule__Cipher__Group__1__Impl : ( '=' ) ;
    public final void rule__Cipher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1852:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1853:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1853:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1854:1: '='
            {
             before(grammarAccess.getCipherAccess().getEqualsSGnKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Cipher__Group__1__Impl3842); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1867:1: rule__Cipher__Group__2 : rule__Cipher__Group__2__Impl ;
    public final void rule__Cipher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1871:1: ( rule__Cipher__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1872:2: rule__Cipher__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cipher__Group__2__Impl_in_rule__Cipher__Group__23873);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1878:1: rule__Cipher__Group__2__Impl : ( ( rule__Cipher__KeywordAssignment_2 ) ) ;
    public final void rule__Cipher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1882:1: ( ( ( rule__Cipher__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1883:1: ( ( rule__Cipher__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1883:1: ( ( rule__Cipher__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1884:1: ( rule__Cipher__KeywordAssignment_2 )
            {
             before(grammarAccess.getCipherAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1885:1: ( rule__Cipher__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1885:2: rule__Cipher__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Cipher__KeywordAssignment_2_in_rule__Cipher__Group__2__Impl3900);
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


    // $ANTLR start rule__Message__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1901:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1905:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1906:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03936);
            rule__Message__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03939);
            rule__Message__Group__1();
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
    // $ANTLR end rule__Message__Group__0


    // $ANTLR start rule__Message__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1913:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1917:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1918:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1918:1: ( ( rule__Message__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1919:1: ( rule__Message__NameAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1920:1: ( rule__Message__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1920:2: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3966);
            rule__Message__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__Message__Group__0__Impl


    // $ANTLR start rule__Message__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1930:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1934:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1935:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13996);
            rule__Message__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13999);
            rule__Message__Group__2();
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
    // $ANTLR end rule__Message__Group__1


    // $ANTLR start rule__Message__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1942:1: rule__Message__Group__1__Impl : ( '=' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1946:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1947:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1947:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1948:1: '='
            {
             before(grammarAccess.getMessageAccess().getEqualsSGnKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Message__Group__1__Impl4027); 
             after(grammarAccess.getMessageAccess().getEqualsSGnKeyword_1()); 

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
    // $ANTLR end rule__Message__Group__1__Impl


    // $ANTLR start rule__Message__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1961:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1965:1: ( rule__Message__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1966:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__24058);
            rule__Message__Group__2__Impl();
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
    // $ANTLR end rule__Message__Group__2


    // $ANTLR start rule__Message__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1972:1: rule__Message__Group__2__Impl : ( ( rule__Message__KeywordAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1976:1: ( ( ( rule__Message__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1977:1: ( ( rule__Message__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1977:1: ( ( rule__Message__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1978:1: ( rule__Message__KeywordAssignment_2 )
            {
             before(grammarAccess.getMessageAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1979:1: ( rule__Message__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1979:2: rule__Message__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Message__KeywordAssignment_2_in_rule__Message__Group__2__Impl4085);
            rule__Message__KeywordAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMessageAccess().getKeywordAssignment_2()); 

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
    // $ANTLR end rule__Message__Group__2__Impl


    // $ANTLR start rule__Transactions__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1995:1: rule__Transactions__Group__0 : rule__Transactions__Group__0__Impl rule__Transactions__Group__1 ;
    public final void rule__Transactions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1999:1: ( rule__Transactions__Group__0__Impl rule__Transactions__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2000:2: rule__Transactions__Group__0__Impl rule__Transactions__Group__1
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__04121);
            rule__Transactions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__04124);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2007:1: rule__Transactions__Group__0__Impl : ( '[TRANSACTIONS]' ) ;
    public final void rule__Transactions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2011:1: ( ( '[TRANSACTIONS]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2012:1: ( '[TRANSACTIONS]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2012:1: ( '[TRANSACTIONS]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2013:1: '[TRANSACTIONS]'
            {
             before(grammarAccess.getTransactionsAccess().getTRANSACTIONSKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Transactions__Group__0__Impl4152); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2026:1: rule__Transactions__Group__1 : rule__Transactions__Group__1__Impl rule__Transactions__Group__2 ;
    public final void rule__Transactions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2030:1: ( rule__Transactions__Group__1__Impl rule__Transactions__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2031:2: rule__Transactions__Group__1__Impl rule__Transactions__Group__2
            {
            pushFollow(FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__14183);
            rule__Transactions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transactions__Group__2_in_rule__Transactions__Group__14186);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2038:1: rule__Transactions__Group__1__Impl : ( ( rule__Transactions__TransactionsAssignment_1 )* ) ;
    public final void rule__Transactions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2042:1: ( ( ( rule__Transactions__TransactionsAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2043:1: ( ( rule__Transactions__TransactionsAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2043:1: ( ( rule__Transactions__TransactionsAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2044:1: ( rule__Transactions__TransactionsAssignment_1 )*
            {
             before(grammarAccess.getTransactionsAccess().getTransactionsAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2045:1: ( rule__Transactions__TransactionsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2045:2: rule__Transactions__TransactionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Transactions__TransactionsAssignment_1_in_rule__Transactions__Group__1__Impl4213);
            	    rule__Transactions__TransactionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2055:1: rule__Transactions__Group__2 : rule__Transactions__Group__2__Impl ;
    public final void rule__Transactions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2059:1: ( rule__Transactions__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2060:2: rule__Transactions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transactions__Group__2__Impl_in_rule__Transactions__Group__24244);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2066:1: rule__Transactions__Group__2__Impl : ( '[END]' ) ;
    public final void rule__Transactions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2070:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2071:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2071:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2072:1: '[END]'
            {
             before(grammarAccess.getTransactionsAccess().getENDKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Transactions__Group__2__Impl4272); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2091:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2095:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2096:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__04309);
            rule__Transaction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__04312);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2103:1: rule__Transaction__Group__0__Impl : ( 'TRANSACTION' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2107:1: ( ( 'TRANSACTION' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2108:1: ( 'TRANSACTION' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2108:1: ( 'TRANSACTION' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2109:1: 'TRANSACTION'
            {
             before(grammarAccess.getTransactionAccess().getTRANSACTIONKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Transaction__Group__0__Impl4340); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2122:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2126:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2127:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__14371);
            rule__Transaction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__14374);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2134:1: rule__Transaction__Group__1__Impl : ( ( rule__Transaction__NameAssignment_1 ) ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2138:1: ( ( ( rule__Transaction__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2139:1: ( ( rule__Transaction__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2139:1: ( ( rule__Transaction__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2140:1: ( rule__Transaction__NameAssignment_1 )
            {
             before(grammarAccess.getTransactionAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2141:1: ( rule__Transaction__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2141:2: rule__Transaction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl4401);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2151:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2155:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2156:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__24431);
            rule__Transaction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__24434);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2163:1: rule__Transaction__Group__2__Impl : ( '(' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2167:1: ( ( '(' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2168:1: ( '(' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2168:1: ( '(' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2169:1: '('
            {
             before(grammarAccess.getTransactionAccess().getLeftParenthesSKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Transaction__Group__2__Impl4462); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2182:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2186:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2187:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__34493);
            rule__Transaction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__34496);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2194:1: rule__Transaction__Group__3__Impl : ( ( rule__Transaction__ArgumentsAssignment_3 )* ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2198:1: ( ( ( rule__Transaction__ArgumentsAssignment_3 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2199:1: ( ( rule__Transaction__ArgumentsAssignment_3 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2199:1: ( ( rule__Transaction__ArgumentsAssignment_3 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2200:1: ( rule__Transaction__ArgumentsAssignment_3 )*
            {
             before(grammarAccess.getTransactionAccess().getArgumentsAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2201:1: ( rule__Transaction__ArgumentsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=15)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2201:2: rule__Transaction__ArgumentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__ArgumentsAssignment_3_in_rule__Transaction__Group__3__Impl4523);
            	    rule__Transaction__ArgumentsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2211:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2215:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2216:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__44554);
            rule__Transaction__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__44557);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2223:1: rule__Transaction__Group__4__Impl : ( ')' ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2227:1: ( ( ')' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2228:1: ( ')' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2228:1: ( ')' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2229:1: ')'
            {
             before(grammarAccess.getTransactionAccess().getRGhtParenthesSKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Transaction__Group__4__Impl4585); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2242:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2246:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2247:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__54616);
            rule__Transaction__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__54619);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2254:1: rule__Transaction__Group__5__Impl : ( '[BEGIN]' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2258:1: ( ( '[BEGIN]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2259:1: ( '[BEGIN]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2259:1: ( '[BEGIN]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2260:1: '[BEGIN]'
            {
             before(grammarAccess.getTransactionAccess().getBEGINKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Transaction__Group__5__Impl4647); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2273:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl rule__Transaction__Group__7 ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2277:1: ( rule__Transaction__Group__6__Impl rule__Transaction__Group__7 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2278:2: rule__Transaction__Group__6__Impl rule__Transaction__Group__7
            {
            pushFollow(FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__64678);
            rule__Transaction__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__7_in_rule__Transaction__Group__64681);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2285:1: rule__Transaction__Group__6__Impl : ( ( rule__Transaction__OperationsAssignment_6 )* ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2289:1: ( ( ( rule__Transaction__OperationsAssignment_6 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2290:1: ( ( rule__Transaction__OperationsAssignment_6 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2290:1: ( ( rule__Transaction__OperationsAssignment_6 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2291:1: ( rule__Transaction__OperationsAssignment_6 )*
            {
             before(grammarAccess.getTransactionAccess().getOperationsAssignment_6()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2292:1: ( rule__Transaction__OperationsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==26||LA10_0==28||(LA10_0>=31 && LA10_0<=32)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2292:2: rule__Transaction__OperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__OperationsAssignment_6_in_rule__Transaction__Group__6__Impl4708);
            	    rule__Transaction__OperationsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2302:1: rule__Transaction__Group__7 : rule__Transaction__Group__7__Impl ;
    public final void rule__Transaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2306:1: ( rule__Transaction__Group__7__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2307:2: rule__Transaction__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group__7__Impl_in_rule__Transaction__Group__74739);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2313:1: rule__Transaction__Group__7__Impl : ( '[END]' ) ;
    public final void rule__Transaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2317:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2318:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2318:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2319:1: '[END]'
            {
             before(grammarAccess.getTransactionAccess().getENDKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Transaction__Group__7__Impl4767); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2348:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2352:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2353:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04814);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04817);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2360:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__KeywordAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2364:1: ( ( ( rule__Argument__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2365:1: ( ( rule__Argument__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2365:1: ( ( rule__Argument__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2366:1: ( rule__Argument__KeywordAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2367:1: ( rule__Argument__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2367:2: rule__Argument__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__KeywordAssignment_0_in_rule__Argument__Group__0__Impl4844);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2377:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2381:1: ( rule__Argument__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2382:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14874);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2388:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2392:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2393:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2393:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2394:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2395:1: ( rule__Argument__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2395:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4901);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2409:1: rule__Decrypt__Group__0 : rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1 ;
    public final void rule__Decrypt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2413:1: ( rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2414:2: rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__0__Impl_in_rule__Decrypt__Group__04935);
            rule__Decrypt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__1_in_rule__Decrypt__Group__04938);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2421:1: rule__Decrypt__Group__0__Impl : ( 'decrypt' ) ;
    public final void rule__Decrypt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2425:1: ( ( 'decrypt' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2426:1: ( 'decrypt' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2426:1: ( 'decrypt' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2427:1: 'decrypt'
            {
             before(grammarAccess.getDecryptAccess().getDecryptKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Decrypt__Group__0__Impl4966); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2440:1: rule__Decrypt__Group__1 : rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2 ;
    public final void rule__Decrypt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2444:1: ( rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2445:2: rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__1__Impl_in_rule__Decrypt__Group__14997);
            rule__Decrypt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__2_in_rule__Decrypt__Group__15000);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2452:1: rule__Decrypt__Group__1__Impl : ( ( rule__Decrypt__MessageAssignment_1 ) ) ;
    public final void rule__Decrypt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2456:1: ( ( ( rule__Decrypt__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2457:1: ( ( rule__Decrypt__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2457:1: ( ( rule__Decrypt__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2458:1: ( rule__Decrypt__MessageAssignment_1 )
            {
             before(grammarAccess.getDecryptAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2459:1: ( rule__Decrypt__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2459:2: rule__Decrypt__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Decrypt__MessageAssignment_1_in_rule__Decrypt__Group__1__Impl5027);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2469:1: rule__Decrypt__Group__2 : rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3 ;
    public final void rule__Decrypt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2473:1: ( rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2474:2: rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__2__Impl_in_rule__Decrypt__Group__25057);
            rule__Decrypt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__3_in_rule__Decrypt__Group__25060);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2481:1: rule__Decrypt__Group__2__Impl : ( 'for' ) ;
    public final void rule__Decrypt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2485:1: ( ( 'for' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2486:1: ( 'for' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2486:1: ( 'for' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2487:1: 'for'
            {
             before(grammarAccess.getDecryptAccess().getForKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Decrypt__Group__2__Impl5088); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2500:1: rule__Decrypt__Group__3 : rule__Decrypt__Group__3__Impl ;
    public final void rule__Decrypt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2504:1: ( rule__Decrypt__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2505:2: rule__Decrypt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__3__Impl_in_rule__Decrypt__Group__35119);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2511:1: rule__Decrypt__Group__3__Impl : ( ( rule__Decrypt__ParticipantAssignment_3 ) ) ;
    public final void rule__Decrypt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2515:1: ( ( ( rule__Decrypt__ParticipantAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2516:1: ( ( rule__Decrypt__ParticipantAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2516:1: ( ( rule__Decrypt__ParticipantAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2517:1: ( rule__Decrypt__ParticipantAssignment_3 )
            {
             before(grammarAccess.getDecryptAccess().getParticipantAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2518:1: ( rule__Decrypt__ParticipantAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2518:2: rule__Decrypt__ParticipantAssignment_3
            {
            pushFollow(FOLLOW_rule__Decrypt__ParticipantAssignment_3_in_rule__Decrypt__Group__3__Impl5146);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2536:1: rule__Encrypt__Group__0 : rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1 ;
    public final void rule__Encrypt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2540:1: ( rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2541:2: rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__0__Impl_in_rule__Encrypt__Group__05184);
            rule__Encrypt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__1_in_rule__Encrypt__Group__05187);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2548:1: rule__Encrypt__Group__0__Impl : ( 'encrypt' ) ;
    public final void rule__Encrypt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2552:1: ( ( 'encrypt' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2553:1: ( 'encrypt' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2553:1: ( 'encrypt' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2554:1: 'encrypt'
            {
             before(grammarAccess.getEncryptAccess().getEncryptKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Encrypt__Group__0__Impl5215); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2567:1: rule__Encrypt__Group__1 : rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2 ;
    public final void rule__Encrypt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2571:1: ( rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2572:2: rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__1__Impl_in_rule__Encrypt__Group__15246);
            rule__Encrypt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__2_in_rule__Encrypt__Group__15249);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2579:1: rule__Encrypt__Group__1__Impl : ( ( rule__Encrypt__MessageAssignment_1 ) ) ;
    public final void rule__Encrypt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2583:1: ( ( ( rule__Encrypt__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2584:1: ( ( rule__Encrypt__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2584:1: ( ( rule__Encrypt__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2585:1: ( rule__Encrypt__MessageAssignment_1 )
            {
             before(grammarAccess.getEncryptAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2586:1: ( rule__Encrypt__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2586:2: rule__Encrypt__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Encrypt__MessageAssignment_1_in_rule__Encrypt__Group__1__Impl5276);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2596:1: rule__Encrypt__Group__2 : rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3 ;
    public final void rule__Encrypt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2600:1: ( rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2601:2: rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__2__Impl_in_rule__Encrypt__Group__25306);
            rule__Encrypt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__3_in_rule__Encrypt__Group__25309);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2608:1: rule__Encrypt__Group__2__Impl : ( 'for' ) ;
    public final void rule__Encrypt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2612:1: ( ( 'for' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2613:1: ( 'for' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2613:1: ( 'for' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2614:1: 'for'
            {
             before(grammarAccess.getEncryptAccess().getForKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Encrypt__Group__2__Impl5337); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2627:1: rule__Encrypt__Group__3 : rule__Encrypt__Group__3__Impl ;
    public final void rule__Encrypt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2631:1: ( rule__Encrypt__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2632:2: rule__Encrypt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__3__Impl_in_rule__Encrypt__Group__35368);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2638:1: rule__Encrypt__Group__3__Impl : ( ( rule__Encrypt__ParticipantAssignment_3 ) ) ;
    public final void rule__Encrypt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2642:1: ( ( ( rule__Encrypt__ParticipantAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2643:1: ( ( rule__Encrypt__ParticipantAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2643:1: ( ( rule__Encrypt__ParticipantAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2644:1: ( rule__Encrypt__ParticipantAssignment_3 )
            {
             before(grammarAccess.getEncryptAccess().getParticipantAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2645:1: ( rule__Encrypt__ParticipantAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2645:2: rule__Encrypt__ParticipantAssignment_3
            {
            pushFollow(FOLLOW_rule__Encrypt__ParticipantAssignment_3_in_rule__Encrypt__Group__3__Impl5395);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2663:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2667:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2668:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__05433);
            rule__Send__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__05436);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2675:1: rule__Send__Group__0__Impl : ( ( rule__Send__MessageAssignment_0 ) ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2679:1: ( ( ( rule__Send__MessageAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2680:1: ( ( rule__Send__MessageAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2680:1: ( ( rule__Send__MessageAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2681:1: ( rule__Send__MessageAssignment_0 )
            {
             before(grammarAccess.getSendAccess().getMessageAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2682:1: ( rule__Send__MessageAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2682:2: rule__Send__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__Send__MessageAssignment_0_in_rule__Send__Group__0__Impl5463);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2692:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2696:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2697:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__15493);
            rule__Send__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__15496);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2704:1: rule__Send__Group__1__Impl : ( '::' ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2708:1: ( ( '::' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2709:1: ( '::' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2709:1: ( '::' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2710:1: '::'
            {
             before(grammarAccess.getSendAccess().getColonColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Send__Group__1__Impl5524); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2723:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2727:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2728:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__25555);
            rule__Send__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__25558);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2735:1: rule__Send__Group__2__Impl : ( ( rule__Send__SourceAssignment_2 ) ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2739:1: ( ( ( rule__Send__SourceAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2740:1: ( ( rule__Send__SourceAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2740:1: ( ( rule__Send__SourceAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2741:1: ( rule__Send__SourceAssignment_2 )
            {
             before(grammarAccess.getSendAccess().getSourceAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2742:1: ( rule__Send__SourceAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2742:2: rule__Send__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Send__SourceAssignment_2_in_rule__Send__Group__2__Impl5585);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2752:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2756:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2757:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__35615);
            rule__Send__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__35618);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2764:1: rule__Send__Group__3__Impl : ( '->' ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2768:1: ( ( '->' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2769:1: ( '->' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2769:1: ( '->' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2770:1: '->'
            {
             before(grammarAccess.getSendAccess().getHyphenMNusGreaterThanSGnKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Send__Group__3__Impl5646); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2783:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2787:1: ( rule__Send__Group__4__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2788:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__45677);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2794:1: rule__Send__Group__4__Impl : ( ( rule__Send__DestinationAssignment_4 ) ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2798:1: ( ( ( rule__Send__DestinationAssignment_4 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2799:1: ( ( rule__Send__DestinationAssignment_4 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2799:1: ( ( rule__Send__DestinationAssignment_4 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2800:1: ( rule__Send__DestinationAssignment_4 )
            {
             before(grammarAccess.getSendAccess().getDestinationAssignment_4()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2801:1: ( rule__Send__DestinationAssignment_4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2801:2: rule__Send__DestinationAssignment_4
            {
            pushFollow(FOLLOW_rule__Send__DestinationAssignment_4_in_rule__Send__Group__4__Impl5704);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2821:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2825:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2826:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__05744);
            rule__Print__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Print__Group__1_in_rule__Print__Group__05747);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2833:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2837:1: ( ( 'print' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2838:1: ( 'print' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2838:1: ( 'print' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2839:1: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Print__Group__0__Impl5775); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2852:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2856:1: ( rule__Print__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2857:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__15806);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2863:1: rule__Print__Group__1__Impl : ( ( rule__Print__MessageAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2867:1: ( ( ( rule__Print__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2868:1: ( ( rule__Print__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2868:1: ( ( rule__Print__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2869:1: ( rule__Print__MessageAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2870:1: ( rule__Print__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2870:2: rule__Print__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Print__MessageAssignment_1_in_rule__Print__Group__1__Impl5833);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2884:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2888:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2889:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05867);
            rule__Call__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05870);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2896:1: rule__Call__Group__0__Impl : ( 'CALL' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2900:1: ( ( 'CALL' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2901:1: ( 'CALL' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2901:1: ( 'CALL' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2902:1: 'CALL'
            {
             before(grammarAccess.getCallAccess().getCALLKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Call__Group__0__Impl5898); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2915:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2919:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2920:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15929);
            rule__Call__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15932);
            rule__Call__Group__2();
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2927:1: rule__Call__Group__1__Impl : ( ( rule__Call__TransactionNameAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2931:1: ( ( ( rule__Call__TransactionNameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2932:1: ( ( rule__Call__TransactionNameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2932:1: ( ( rule__Call__TransactionNameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2933:1: ( rule__Call__TransactionNameAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getTransactionNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2934:1: ( rule__Call__TransactionNameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2934:2: rule__Call__TransactionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__TransactionNameAssignment_1_in_rule__Call__Group__1__Impl5959);
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


    // $ANTLR start rule__Call__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2944:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2948:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2949:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25989);
            rule__Call__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__25992);
            rule__Call__Group__3();
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
    // $ANTLR end rule__Call__Group__2


    // $ANTLR start rule__Call__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2956:1: rule__Call__Group__2__Impl : ( '(' ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2960:1: ( ( '(' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2961:1: ( '(' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2961:1: ( '(' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2962:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesSKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Call__Group__2__Impl6020); 
             after(grammarAccess.getCallAccess().getLeftParenthesSKeyword_2()); 

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
    // $ANTLR end rule__Call__Group__2__Impl


    // $ANTLR start rule__Call__Group__3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2975:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2979:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2980:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__36051);
            rule__Call__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__36054);
            rule__Call__Group__4();
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
    // $ANTLR end rule__Call__Group__3


    // $ANTLR start rule__Call__Group__3__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2987:1: rule__Call__Group__3__Impl : ( ( rule__Call__ArgsAssignment_3 )* ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2991:1: ( ( ( rule__Call__ArgsAssignment_3 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2992:1: ( ( rule__Call__ArgsAssignment_3 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2992:1: ( ( rule__Call__ArgsAssignment_3 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2993:1: ( rule__Call__ArgsAssignment_3 )*
            {
             before(grammarAccess.getCallAccess().getArgsAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2994:1: ( rule__Call__ArgsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2994:2: rule__Call__ArgsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Call__ArgsAssignment_3_in_rule__Call__Group__3__Impl6081);
            	    rule__Call__ArgsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCallAccess().getArgsAssignment_3()); 

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
    // $ANTLR end rule__Call__Group__3__Impl


    // $ANTLR start rule__Call__Group__4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3004:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3008:1: ( rule__Call__Group__4__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3009:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__46112);
            rule__Call__Group__4__Impl();
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
    // $ANTLR end rule__Call__Group__4


    // $ANTLR start rule__Call__Group__4__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3015:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3019:1: ( ( ')' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3020:1: ( ')' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3020:1: ( ')' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3021:1: ')'
            {
             before(grammarAccess.getCallAccess().getRGhtParenthesSKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Call__Group__4__Impl6140); 
             after(grammarAccess.getCallAccess().getRGhtParenthesSKeyword_4()); 

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
    // $ANTLR end rule__Call__Group__4__Impl


    // $ANTLR start rule__Exchange__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3044:1: rule__Exchange__Group__0 : rule__Exchange__Group__0__Impl rule__Exchange__Group__1 ;
    public final void rule__Exchange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3048:1: ( rule__Exchange__Group__0__Impl rule__Exchange__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3049:2: rule__Exchange__Group__0__Impl rule__Exchange__Group__1
            {
            pushFollow(FOLLOW_rule__Exchange__Group__0__Impl_in_rule__Exchange__Group__06181);
            rule__Exchange__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exchange__Group__1_in_rule__Exchange__Group__06184);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3056:1: rule__Exchange__Group__0__Impl : ( ( rule__Exchange__SourceAssignment_0 ) ) ;
    public final void rule__Exchange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3060:1: ( ( ( rule__Exchange__SourceAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3061:1: ( ( rule__Exchange__SourceAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3061:1: ( ( rule__Exchange__SourceAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3062:1: ( rule__Exchange__SourceAssignment_0 )
            {
             before(grammarAccess.getExchangeAccess().getSourceAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3063:1: ( rule__Exchange__SourceAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3063:2: rule__Exchange__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Exchange__SourceAssignment_0_in_rule__Exchange__Group__0__Impl6211);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3073:1: rule__Exchange__Group__1 : rule__Exchange__Group__1__Impl rule__Exchange__Group__2 ;
    public final void rule__Exchange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3077:1: ( rule__Exchange__Group__1__Impl rule__Exchange__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3078:2: rule__Exchange__Group__1__Impl rule__Exchange__Group__2
            {
            pushFollow(FOLLOW_rule__Exchange__Group__1__Impl_in_rule__Exchange__Group__16241);
            rule__Exchange__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exchange__Group__2_in_rule__Exchange__Group__16244);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3085:1: rule__Exchange__Group__1__Impl : ( 'exchange' ) ;
    public final void rule__Exchange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3089:1: ( ( 'exchange' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3090:1: ( 'exchange' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3090:1: ( 'exchange' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3091:1: 'exchange'
            {
             before(grammarAccess.getExchangeAccess().getExchangeKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Exchange__Group__1__Impl6272); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3104:1: rule__Exchange__Group__2 : rule__Exchange__Group__2__Impl ;
    public final void rule__Exchange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3108:1: ( rule__Exchange__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3109:2: rule__Exchange__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exchange__Group__2__Impl_in_rule__Exchange__Group__26303);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3115:1: rule__Exchange__Group__2__Impl : ( ( rule__Exchange__DestinationAssignment_2 ) ) ;
    public final void rule__Exchange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3119:1: ( ( ( rule__Exchange__DestinationAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3120:1: ( ( rule__Exchange__DestinationAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3120:1: ( ( rule__Exchange__DestinationAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3121:1: ( rule__Exchange__DestinationAssignment_2 )
            {
             before(grammarAccess.getExchangeAccess().getDestinationAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3122:1: ( rule__Exchange__DestinationAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3122:2: rule__Exchange__DestinationAssignment_2
            {
            pushFollow(FOLLOW_rule__Exchange__DestinationAssignment_2_in_rule__Exchange__Group__2__Impl6330);
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


    // $ANTLR start rule__Redirect__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3138:1: rule__Redirect__Group__0 : rule__Redirect__Group__0__Impl rule__Redirect__Group__1 ;
    public final void rule__Redirect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3142:1: ( rule__Redirect__Group__0__Impl rule__Redirect__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3143:2: rule__Redirect__Group__0__Impl rule__Redirect__Group__1
            {
            pushFollow(FOLLOW_rule__Redirect__Group__0__Impl_in_rule__Redirect__Group__06366);
            rule__Redirect__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Redirect__Group__1_in_rule__Redirect__Group__06369);
            rule__Redirect__Group__1();
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
    // $ANTLR end rule__Redirect__Group__0


    // $ANTLR start rule__Redirect__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3150:1: rule__Redirect__Group__0__Impl : ( ( rule__Redirect__MessageAssignment_0 ) ) ;
    public final void rule__Redirect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3154:1: ( ( ( rule__Redirect__MessageAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3155:1: ( ( rule__Redirect__MessageAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3155:1: ( ( rule__Redirect__MessageAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3156:1: ( rule__Redirect__MessageAssignment_0 )
            {
             before(grammarAccess.getRedirectAccess().getMessageAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3157:1: ( rule__Redirect__MessageAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3157:2: rule__Redirect__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__Redirect__MessageAssignment_0_in_rule__Redirect__Group__0__Impl6396);
            rule__Redirect__MessageAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRedirectAccess().getMessageAssignment_0()); 

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
    // $ANTLR end rule__Redirect__Group__0__Impl


    // $ANTLR start rule__Redirect__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3167:1: rule__Redirect__Group__1 : rule__Redirect__Group__1__Impl rule__Redirect__Group__2 ;
    public final void rule__Redirect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3171:1: ( rule__Redirect__Group__1__Impl rule__Redirect__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3172:2: rule__Redirect__Group__1__Impl rule__Redirect__Group__2
            {
            pushFollow(FOLLOW_rule__Redirect__Group__1__Impl_in_rule__Redirect__Group__16426);
            rule__Redirect__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Redirect__Group__2_in_rule__Redirect__Group__16429);
            rule__Redirect__Group__2();
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
    // $ANTLR end rule__Redirect__Group__1


    // $ANTLR start rule__Redirect__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3179:1: rule__Redirect__Group__1__Impl : ( 'redirect' ) ;
    public final void rule__Redirect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3183:1: ( ( 'redirect' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3184:1: ( 'redirect' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3184:1: ( 'redirect' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3185:1: 'redirect'
            {
             before(grammarAccess.getRedirectAccess().getRedirectKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Redirect__Group__1__Impl6457); 
             after(grammarAccess.getRedirectAccess().getRedirectKeyword_1()); 

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
    // $ANTLR end rule__Redirect__Group__1__Impl


    // $ANTLR start rule__Redirect__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3198:1: rule__Redirect__Group__2 : rule__Redirect__Group__2__Impl ;
    public final void rule__Redirect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3202:1: ( rule__Redirect__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3203:2: rule__Redirect__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Redirect__Group__2__Impl_in_rule__Redirect__Group__26488);
            rule__Redirect__Group__2__Impl();
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
    // $ANTLR end rule__Redirect__Group__2


    // $ANTLR start rule__Redirect__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3209:1: rule__Redirect__Group__2__Impl : ( ( rule__Redirect__DestinationAssignment_2 ) ) ;
    public final void rule__Redirect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3213:1: ( ( ( rule__Redirect__DestinationAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3214:1: ( ( rule__Redirect__DestinationAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3214:1: ( ( rule__Redirect__DestinationAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3215:1: ( rule__Redirect__DestinationAssignment_2 )
            {
             before(grammarAccess.getRedirectAccess().getDestinationAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3216:1: ( rule__Redirect__DestinationAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3216:2: rule__Redirect__DestinationAssignment_2
            {
            pushFollow(FOLLOW_rule__Redirect__DestinationAssignment_2_in_rule__Redirect__Group__2__Impl6515);
            rule__Redirect__DestinationAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRedirectAccess().getDestinationAssignment_2()); 

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
    // $ANTLR end rule__Redirect__Group__2__Impl


    // $ANTLR start rule__States__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3232:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3236:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3237:2: rule__States__Group__0__Impl rule__States__Group__1
            {
            pushFollow(FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__06551);
            rule__States__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__States__Group__1_in_rule__States__Group__06554);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3244:1: rule__States__Group__0__Impl : ( '[STATES]' ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3248:1: ( ( '[STATES]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3249:1: ( '[STATES]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3249:1: ( '[STATES]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3250:1: '[STATES]'
            {
             before(grammarAccess.getStatesAccess().getSTATESKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__States__Group__0__Impl6582); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3263:1: rule__States__Group__1 : rule__States__Group__1__Impl rule__States__Group__2 ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3267:1: ( rule__States__Group__1__Impl rule__States__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3268:2: rule__States__Group__1__Impl rule__States__Group__2
            {
            pushFollow(FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__16613);
            rule__States__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__States__Group__2_in_rule__States__Group__16616);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3275:1: rule__States__Group__1__Impl : ( ( rule__States__StatesAssignment_1 )* ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3279:1: ( ( ( rule__States__StatesAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3280:1: ( ( rule__States__StatesAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3280:1: ( ( rule__States__StatesAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3281:1: ( rule__States__StatesAssignment_1 )*
            {
             before(grammarAccess.getStatesAccess().getStatesAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3282:1: ( rule__States__StatesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3282:2: rule__States__StatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__States__StatesAssignment_1_in_rule__States__Group__1__Impl6643);
            	    rule__States__StatesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3292:1: rule__States__Group__2 : rule__States__Group__2__Impl ;
    public final void rule__States__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3296:1: ( rule__States__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3297:2: rule__States__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__26674);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3303:1: rule__States__Group__2__Impl : ( '[END]' ) ;
    public final void rule__States__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3307:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3308:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3308:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3309:1: '[END]'
            {
             before(grammarAccess.getStatesAccess().getENDKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__States__Group__2__Impl6702); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3328:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3332:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3333:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__06739);
            rule__State__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__06742);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3340:1: rule__State__Group__0__Impl : ( 'STATE' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3344:1: ( ( 'STATE' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3345:1: ( 'STATE' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3345:1: ( 'STATE' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3346:1: 'STATE'
            {
             before(grammarAccess.getStateAccess().getSTATEKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__State__Group__0__Impl6770); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3359:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3363:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3364:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__16801);
            rule__State__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__16804);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3371:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3375:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3376:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3376:1: ( ( rule__State__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3377:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3378:1: ( rule__State__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3378:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl6831);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3388:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3392:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3393:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__26861);
            rule__State__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__26864);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3400:1: rule__State__Group__2__Impl : ( '(' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3404:1: ( ( '(' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3405:1: ( '(' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3405:1: ( '(' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3406:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesSKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__State__Group__2__Impl6892); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3419:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3423:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3424:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__36923);
            rule__State__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__36926);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3431:1: rule__State__Group__3__Impl : ( ( rule__State__EventAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3435:1: ( ( ( rule__State__EventAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3436:1: ( ( rule__State__EventAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3436:1: ( ( rule__State__EventAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3437:1: ( rule__State__EventAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getEventAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3438:1: ( rule__State__EventAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3438:2: rule__State__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__State__EventAssignment_3_in_rule__State__Group__3__Impl6953);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3448:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3452:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3453:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__46983);
            rule__State__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__46986);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3460:1: rule__State__Group__4__Impl : ( ')' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3464:1: ( ( ')' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3465:1: ( ')' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3465:1: ( ')' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3466:1: ')'
            {
             before(grammarAccess.getStateAccess().getRGhtParenthesSKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__State__Group__4__Impl7014); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3479:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3483:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3484:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__57045);
            rule__State__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__6_in_rule__State__Group__57048);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3491:1: rule__State__Group__5__Impl : ( '[BEGIN]' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3495:1: ( ( '[BEGIN]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3496:1: ( '[BEGIN]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3496:1: ( '[BEGIN]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3497:1: '[BEGIN]'
            {
             before(grammarAccess.getStateAccess().getBEGINKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__State__Group__5__Impl7076); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3510:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3514:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3515:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__67107);
            rule__State__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__7_in_rule__State__Group__67110);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3522:1: rule__State__Group__6__Impl : ( ( rule__State__GuardsAssignment_6 )* ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3526:1: ( ( ( rule__State__GuardsAssignment_6 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3527:1: ( ( rule__State__GuardsAssignment_6 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3527:1: ( ( rule__State__GuardsAssignment_6 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3528:1: ( rule__State__GuardsAssignment_6 )*
            {
             before(grammarAccess.getStateAccess().getGuardsAssignment_6()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3529:1: ( rule__State__GuardsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3529:2: rule__State__GuardsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__State__GuardsAssignment_6_in_rule__State__Group__6__Impl7137);
            	    rule__State__GuardsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3539:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3543:1: ( rule__State__Group__7__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3544:2: rule__State__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__77168);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3550:1: rule__State__Group__7__Impl : ( '[END]' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3554:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3555:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3555:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3556:1: '[END]'
            {
             before(grammarAccess.getStateAccess().getENDKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__State__Group__7__Impl7196); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3585:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3589:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3590:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__07243);
            rule__Guard__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__07246);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3597:1: rule__Guard__Group__0__Impl : ( '|' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3601:1: ( ( '|' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3602:1: ( '|' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3602:1: ( '|' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3603:1: '|'
            {
             before(grammarAccess.getGuardAccess().getVertCalLNeKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Guard__Group__0__Impl7274); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3616:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3620:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3621:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__17305);
            rule__Guard__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__17308);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3628:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__CasemAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3632:1: ( ( ( rule__Guard__CasemAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3633:1: ( ( rule__Guard__CasemAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3633:1: ( ( rule__Guard__CasemAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3634:1: ( rule__Guard__CasemAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getCasemAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3635:1: ( rule__Guard__CasemAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3635:2: rule__Guard__CasemAssignment_1
            {
            pushFollow(FOLLOW_rule__Guard__CasemAssignment_1_in_rule__Guard__Group__1__Impl7335);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3645:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3649:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3650:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__27365);
            rule__Guard__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__27368);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3657:1: rule__Guard__Group__2__Impl : ( '=>' ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3661:1: ( ( '=>' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3662:1: ( '=>' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3662:1: ( '=>' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3663:1: '=>'
            {
             before(grammarAccess.getGuardAccess().getEqualsSGnGreaterThanSGnKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Guard__Group__2__Impl7396); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3676:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3680:1: ( rule__Guard__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3681:2: rule__Guard__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__37427);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3687:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__OperationAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3691:1: ( ( ( rule__Guard__OperationAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3692:1: ( ( rule__Guard__OperationAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3692:1: ( ( rule__Guard__OperationAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3693:1: ( rule__Guard__OperationAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getOperationAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3694:1: ( rule__Guard__OperationAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3694:2: rule__Guard__OperationAssignment_3
            {
            pushFollow(FOLLOW_rule__Guard__OperationAssignment_3_in_rule__Guard__Group__3__Impl7454);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3712:1: rule__GetEvent__Group__0 : rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1 ;
    public final void rule__GetEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3716:1: ( rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3717:2: rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__0__Impl_in_rule__GetEvent__Group__07492);
            rule__GetEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GetEvent__Group__1_in_rule__GetEvent__Group__07495);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3724:1: rule__GetEvent__Group__0__Impl : ( ( rule__GetEvent__WhoAssignment_0 ) ) ;
    public final void rule__GetEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3728:1: ( ( ( rule__GetEvent__WhoAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3729:1: ( ( rule__GetEvent__WhoAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3729:1: ( ( rule__GetEvent__WhoAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3730:1: ( rule__GetEvent__WhoAssignment_0 )
            {
             before(grammarAccess.getGetEventAccess().getWhoAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3731:1: ( rule__GetEvent__WhoAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3731:2: rule__GetEvent__WhoAssignment_0
            {
            pushFollow(FOLLOW_rule__GetEvent__WhoAssignment_0_in_rule__GetEvent__Group__0__Impl7522);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3741:1: rule__GetEvent__Group__1 : rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2 ;
    public final void rule__GetEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3745:1: ( rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3746:2: rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__1__Impl_in_rule__GetEvent__Group__17552);
            rule__GetEvent__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GetEvent__Group__2_in_rule__GetEvent__Group__17555);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3753:1: rule__GetEvent__Group__1__Impl : ( 'GET' ) ;
    public final void rule__GetEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3757:1: ( ( 'GET' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3758:1: ( 'GET' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3758:1: ( 'GET' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3759:1: 'GET'
            {
             before(grammarAccess.getGetEventAccess().getGETKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__GetEvent__Group__1__Impl7583); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3772:1: rule__GetEvent__Group__2 : rule__GetEvent__Group__2__Impl ;
    public final void rule__GetEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3776:1: ( rule__GetEvent__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3777:2: rule__GetEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__2__Impl_in_rule__GetEvent__Group__27614);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3783:1: rule__GetEvent__Group__2__Impl : ( ( rule__GetEvent__MessageAssignment_2 ) ) ;
    public final void rule__GetEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3787:1: ( ( ( rule__GetEvent__MessageAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3788:1: ( ( rule__GetEvent__MessageAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3788:1: ( ( rule__GetEvent__MessageAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3789:1: ( rule__GetEvent__MessageAssignment_2 )
            {
             before(grammarAccess.getGetEventAccess().getMessageAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3790:1: ( rule__GetEvent__MessageAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3790:2: rule__GetEvent__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__GetEvent__MessageAssignment_2_in_rule__GetEvent__Group__2__Impl7641);
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


    // $ANTLR start rule__SendsEvent__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3806:1: rule__SendsEvent__Group__0 : rule__SendsEvent__Group__0__Impl rule__SendsEvent__Group__1 ;
    public final void rule__SendsEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3810:1: ( rule__SendsEvent__Group__0__Impl rule__SendsEvent__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3811:2: rule__SendsEvent__Group__0__Impl rule__SendsEvent__Group__1
            {
            pushFollow(FOLLOW_rule__SendsEvent__Group__0__Impl_in_rule__SendsEvent__Group__07677);
            rule__SendsEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SendsEvent__Group__1_in_rule__SendsEvent__Group__07680);
            rule__SendsEvent__Group__1();
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
    // $ANTLR end rule__SendsEvent__Group__0


    // $ANTLR start rule__SendsEvent__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3818:1: rule__SendsEvent__Group__0__Impl : ( ( rule__SendsEvent__WhoAssignment_0 ) ) ;
    public final void rule__SendsEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3822:1: ( ( ( rule__SendsEvent__WhoAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3823:1: ( ( rule__SendsEvent__WhoAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3823:1: ( ( rule__SendsEvent__WhoAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3824:1: ( rule__SendsEvent__WhoAssignment_0 )
            {
             before(grammarAccess.getSendsEventAccess().getWhoAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3825:1: ( rule__SendsEvent__WhoAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3825:2: rule__SendsEvent__WhoAssignment_0
            {
            pushFollow(FOLLOW_rule__SendsEvent__WhoAssignment_0_in_rule__SendsEvent__Group__0__Impl7707);
            rule__SendsEvent__WhoAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSendsEventAccess().getWhoAssignment_0()); 

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
    // $ANTLR end rule__SendsEvent__Group__0__Impl


    // $ANTLR start rule__SendsEvent__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3835:1: rule__SendsEvent__Group__1 : rule__SendsEvent__Group__1__Impl rule__SendsEvent__Group__2 ;
    public final void rule__SendsEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3839:1: ( rule__SendsEvent__Group__1__Impl rule__SendsEvent__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3840:2: rule__SendsEvent__Group__1__Impl rule__SendsEvent__Group__2
            {
            pushFollow(FOLLOW_rule__SendsEvent__Group__1__Impl_in_rule__SendsEvent__Group__17737);
            rule__SendsEvent__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SendsEvent__Group__2_in_rule__SendsEvent__Group__17740);
            rule__SendsEvent__Group__2();
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
    // $ANTLR end rule__SendsEvent__Group__1


    // $ANTLR start rule__SendsEvent__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3847:1: rule__SendsEvent__Group__1__Impl : ( 'SENDS' ) ;
    public final void rule__SendsEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3851:1: ( ( 'SENDS' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3852:1: ( 'SENDS' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3852:1: ( 'SENDS' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3853:1: 'SENDS'
            {
             before(grammarAccess.getSendsEventAccess().getSENDSKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__SendsEvent__Group__1__Impl7768); 
             after(grammarAccess.getSendsEventAccess().getSENDSKeyword_1()); 

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
    // $ANTLR end rule__SendsEvent__Group__1__Impl


    // $ANTLR start rule__SendsEvent__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3866:1: rule__SendsEvent__Group__2 : rule__SendsEvent__Group__2__Impl ;
    public final void rule__SendsEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3870:1: ( rule__SendsEvent__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3871:2: rule__SendsEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SendsEvent__Group__2__Impl_in_rule__SendsEvent__Group__27799);
            rule__SendsEvent__Group__2__Impl();
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
    // $ANTLR end rule__SendsEvent__Group__2


    // $ANTLR start rule__SendsEvent__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3877:1: rule__SendsEvent__Group__2__Impl : ( ( rule__SendsEvent__MessageAssignment_2 ) ) ;
    public final void rule__SendsEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3881:1: ( ( ( rule__SendsEvent__MessageAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3882:1: ( ( rule__SendsEvent__MessageAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3882:1: ( ( rule__SendsEvent__MessageAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3883:1: ( rule__SendsEvent__MessageAssignment_2 )
            {
             before(grammarAccess.getSendsEventAccess().getMessageAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3884:1: ( rule__SendsEvent__MessageAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3884:2: rule__SendsEvent__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__SendsEvent__MessageAssignment_2_in_rule__SendsEvent__Group__2__Impl7826);
            rule__SendsEvent__MessageAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSendsEventAccess().getMessageAssignment_2()); 

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
    // $ANTLR end rule__SendsEvent__Group__2__Impl


    // $ANTLR start rule__IsSendEvent__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3900:1: rule__IsSendEvent__Group__0 : rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1 ;
    public final void rule__IsSendEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3904:1: ( rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3905:2: rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__0__Impl_in_rule__IsSendEvent__Group__07862);
            rule__IsSendEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IsSendEvent__Group__1_in_rule__IsSendEvent__Group__07865);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3912:1: rule__IsSendEvent__Group__0__Impl : ( ( rule__IsSendEvent__MessageAssignment_0 ) ) ;
    public final void rule__IsSendEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3916:1: ( ( ( rule__IsSendEvent__MessageAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3917:1: ( ( rule__IsSendEvent__MessageAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3917:1: ( ( rule__IsSendEvent__MessageAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3918:1: ( rule__IsSendEvent__MessageAssignment_0 )
            {
             before(grammarAccess.getIsSendEventAccess().getMessageAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3919:1: ( rule__IsSendEvent__MessageAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3919:2: rule__IsSendEvent__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__IsSendEvent__MessageAssignment_0_in_rule__IsSendEvent__Group__0__Impl7892);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3929:1: rule__IsSendEvent__Group__1 : rule__IsSendEvent__Group__1__Impl ;
    public final void rule__IsSendEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3933:1: ( rule__IsSendEvent__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3934:2: rule__IsSendEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__1__Impl_in_rule__IsSendEvent__Group__17922);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3940:1: rule__IsSendEvent__Group__1__Impl : ( 'IS_SEND' ) ;
    public final void rule__IsSendEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3944:1: ( ( 'IS_SEND' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3945:1: ( 'IS_SEND' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3945:1: ( 'IS_SEND' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3946:1: 'IS_SEND'
            {
             before(grammarAccess.getIsSendEventAccess().getIS_SENDKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__IsSendEvent__Group__1__Impl7950); 
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


    // $ANTLR start rule__To__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3963:1: rule__To__Group__0 : rule__To__Group__0__Impl rule__To__Group__1 ;
    public final void rule__To__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3967:1: ( rule__To__Group__0__Impl rule__To__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3968:2: rule__To__Group__0__Impl rule__To__Group__1
            {
            pushFollow(FOLLOW_rule__To__Group__0__Impl_in_rule__To__Group__07985);
            rule__To__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__To__Group__1_in_rule__To__Group__07988);
            rule__To__Group__1();
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
    // $ANTLR end rule__To__Group__0


    // $ANTLR start rule__To__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3975:1: rule__To__Group__0__Impl : ( ( rule__To__KeywordAssignment_0 ) ) ;
    public final void rule__To__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3979:1: ( ( ( rule__To__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3980:1: ( ( rule__To__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3980:1: ( ( rule__To__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3981:1: ( rule__To__KeywordAssignment_0 )
            {
             before(grammarAccess.getToAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3982:1: ( rule__To__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3982:2: rule__To__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__To__KeywordAssignment_0_in_rule__To__Group__0__Impl8015);
            rule__To__KeywordAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getToAccess().getKeywordAssignment_0()); 

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
    // $ANTLR end rule__To__Group__0__Impl


    // $ANTLR start rule__To__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3992:1: rule__To__Group__1 : rule__To__Group__1__Impl rule__To__Group__2 ;
    public final void rule__To__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3996:1: ( rule__To__Group__1__Impl rule__To__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3997:2: rule__To__Group__1__Impl rule__To__Group__2
            {
            pushFollow(FOLLOW_rule__To__Group__1__Impl_in_rule__To__Group__18045);
            rule__To__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__To__Group__2_in_rule__To__Group__18048);
            rule__To__Group__2();
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
    // $ANTLR end rule__To__Group__1


    // $ANTLR start rule__To__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4004:1: rule__To__Group__1__Impl : ( '=' ) ;
    public final void rule__To__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4008:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4009:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4009:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4010:1: '='
            {
             before(grammarAccess.getToAccess().getEqualsSGnKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__To__Group__1__Impl8076); 
             after(grammarAccess.getToAccess().getEqualsSGnKeyword_1()); 

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
    // $ANTLR end rule__To__Group__1__Impl


    // $ANTLR start rule__To__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4023:1: rule__To__Group__2 : rule__To__Group__2__Impl ;
    public final void rule__To__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4027:1: ( rule__To__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4028:2: rule__To__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__To__Group__2__Impl_in_rule__To__Group__28107);
            rule__To__Group__2__Impl();
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
    // $ANTLR end rule__To__Group__2


    // $ANTLR start rule__To__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4034:1: rule__To__Group__2__Impl : ( ( rule__To__EventSourceAssignment_2 ) ) ;
    public final void rule__To__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4038:1: ( ( ( rule__To__EventSourceAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4039:1: ( ( rule__To__EventSourceAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4039:1: ( ( rule__To__EventSourceAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4040:1: ( rule__To__EventSourceAssignment_2 )
            {
             before(grammarAccess.getToAccess().getEventSourceAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4041:1: ( rule__To__EventSourceAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4041:2: rule__To__EventSourceAssignment_2
            {
            pushFollow(FOLLOW_rule__To__EventSourceAssignment_2_in_rule__To__Group__2__Impl8134);
            rule__To__EventSourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getToAccess().getEventSourceAssignment_2()); 

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
    // $ANTLR end rule__To__Group__2__Impl


    // $ANTLR start rule__From__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4057:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4061:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4062:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__08170);
            rule__From__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__From__Group__1_in_rule__From__Group__08173);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4069:1: rule__From__Group__0__Impl : ( ( rule__From__KeywordAssignment_0 ) ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4073:1: ( ( ( rule__From__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4074:1: ( ( rule__From__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4074:1: ( ( rule__From__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4075:1: ( rule__From__KeywordAssignment_0 )
            {
             before(grammarAccess.getFromAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4076:1: ( rule__From__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4076:2: rule__From__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__From__KeywordAssignment_0_in_rule__From__Group__0__Impl8200);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4086:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4090:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4091:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__18230);
            rule__From__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__From__Group__2_in_rule__From__Group__18233);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4098:1: rule__From__Group__1__Impl : ( '=' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4102:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4103:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4103:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4104:1: '='
            {
             before(grammarAccess.getFromAccess().getEqualsSGnKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__From__Group__1__Impl8261); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4117:1: rule__From__Group__2 : rule__From__Group__2__Impl ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4121:1: ( rule__From__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4122:2: rule__From__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__28292);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4128:1: rule__From__Group__2__Impl : ( ( rule__From__EventSourceAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4132:1: ( ( ( rule__From__EventSourceAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4133:1: ( ( rule__From__EventSourceAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4133:1: ( ( rule__From__EventSourceAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4134:1: ( rule__From__EventSourceAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getEventSourceAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4135:1: ( rule__From__EventSourceAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4135:2: rule__From__EventSourceAssignment_2
            {
            pushFollow(FOLLOW_rule__From__EventSourceAssignment_2_in_rule__From__Group__2__Impl8319);
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


    // $ANTLR start rule__Test__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4151:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4155:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4156:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__08355);
            rule__Test__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Test__Group__1_in_rule__Test__Group__08358);
            rule__Test__Group__1();
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
    // $ANTLR end rule__Test__Group__0


    // $ANTLR start rule__Test__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4163:1: rule__Test__Group__0__Impl : ( '[TEST]' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4167:1: ( ( '[TEST]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4168:1: ( '[TEST]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4168:1: ( '[TEST]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4169:1: '[TEST]'
            {
             before(grammarAccess.getTestAccess().getTESTKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Test__Group__0__Impl8386); 
             after(grammarAccess.getTestAccess().getTESTKeyword_0()); 

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
    // $ANTLR end rule__Test__Group__0__Impl


    // $ANTLR start rule__Test__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4182:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4186:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4187:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__18417);
            rule__Test__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Test__Group__2_in_rule__Test__Group__18420);
            rule__Test__Group__2();
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
    // $ANTLR end rule__Test__Group__1


    // $ANTLR start rule__Test__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4194:1: rule__Test__Group__1__Impl : ( ( rule__Test__OperationsAssignment_1 )* ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4198:1: ( ( ( rule__Test__OperationsAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4199:1: ( ( rule__Test__OperationsAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4199:1: ( ( rule__Test__OperationsAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4200:1: ( rule__Test__OperationsAssignment_1 )*
            {
             before(grammarAccess.getTestAccess().getOperationsAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4201:1: ( rule__Test__OperationsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==26||LA14_0==28||(LA14_0>=31 && LA14_0<=32)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4201:2: rule__Test__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Test__OperationsAssignment_1_in_rule__Test__Group__1__Impl8447);
            	    rule__Test__OperationsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getOperationsAssignment_1()); 

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
    // $ANTLR end rule__Test__Group__1__Impl


    // $ANTLR start rule__Test__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4211:1: rule__Test__Group__2 : rule__Test__Group__2__Impl ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4215:1: ( rule__Test__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4216:2: rule__Test__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__28478);
            rule__Test__Group__2__Impl();
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
    // $ANTLR end rule__Test__Group__2


    // $ANTLR start rule__Test__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4222:1: rule__Test__Group__2__Impl : ( '[END]' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4226:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4227:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4227:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4228:1: '[END]'
            {
             before(grammarAccess.getTestAccess().getENDKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Test__Group__2__Impl8506); 
             after(grammarAccess.getTestAccess().getENDKeyword_2()); 

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
    // $ANTLR end rule__Test__Group__2__Impl


    // $ANTLR start rule__PDLFile__NameAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4248:1: rule__PDLFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PDLFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4252:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4253:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4253:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4254:1: RULE_ID
            {
             before(grammarAccess.getPDLFileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PDLFile__NameAssignment_18548); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4263:1: rule__PDLFile__DefinitionAssignment_3 : ( ruleDefinitions ) ;
    public final void rule__PDLFile__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4267:1: ( ( ruleDefinitions ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4268:1: ( ruleDefinitions )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4268:1: ( ruleDefinitions )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4269:1: ruleDefinitions
            {
             before(grammarAccess.getPDLFileAccess().getDefinitionDefinitionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDefinitions_in_rule__PDLFile__DefinitionAssignment_38579);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4278:1: rule__PDLFile__TransactionAssignment_4 : ( ruleTransactions ) ;
    public final void rule__PDLFile__TransactionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4282:1: ( ( ruleTransactions ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4283:1: ( ruleTransactions )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4283:1: ( ruleTransactions )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4284:1: ruleTransactions
            {
             before(grammarAccess.getPDLFileAccess().getTransactionTransactionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransactions_in_rule__PDLFile__TransactionAssignment_48610);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4293:1: rule__PDLFile__StateAssignment_5 : ( ruleStates ) ;
    public final void rule__PDLFile__StateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4297:1: ( ( ruleStates ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4298:1: ( ruleStates )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4298:1: ( ruleStates )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4299:1: ruleStates
            {
             before(grammarAccess.getPDLFileAccess().getStateStatesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStates_in_rule__PDLFile__StateAssignment_58641);
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


    // $ANTLR start rule__PDLFile__TestAssignment_6
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4308:1: rule__PDLFile__TestAssignment_6 : ( ruleTest ) ;
    public final void rule__PDLFile__TestAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4312:1: ( ( ruleTest ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4313:1: ( ruleTest )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4313:1: ( ruleTest )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4314:1: ruleTest
            {
             before(grammarAccess.getPDLFileAccess().getTestTestParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTest_in_rule__PDLFile__TestAssignment_68672);
            ruleTest();
            _fsp--;

             after(grammarAccess.getPDLFileAccess().getTestTestParserRuleCall_6_0()); 

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
    // $ANTLR end rule__PDLFile__TestAssignment_6


    // $ANTLR start rule__Definitions__SourcesAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4323:1: rule__Definitions__SourcesAssignment_1 : ( ruleEventSource ) ;
    public final void rule__Definitions__SourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4327:1: ( ( ruleEventSource ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4328:1: ( ruleEventSource )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4328:1: ( ruleEventSource )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4329:1: ruleEventSource
            {
             before(grammarAccess.getDefinitionsAccess().getSourcesEventSourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEventSource_in_rule__Definitions__SourcesAssignment_18703);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4338:1: rule__Definitions__CipherAssignment_2 : ( ruleCipher ) ;
    public final void rule__Definitions__CipherAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4342:1: ( ( ruleCipher ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4343:1: ( ruleCipher )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4343:1: ( ruleCipher )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4344:1: ruleCipher
            {
             before(grammarAccess.getDefinitionsAccess().getCipherCipherParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCipher_in_rule__Definitions__CipherAssignment_28734);
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


    // $ANTLR start rule__Definitions__MessageAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4353:1: rule__Definitions__MessageAssignment_3 : ( ruleMessage ) ;
    public final void rule__Definitions__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4357:1: ( ( ruleMessage ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4358:1: ( ruleMessage )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4358:1: ( ruleMessage )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4359:1: ruleMessage
            {
             before(grammarAccess.getDefinitionsAccess().getMessageMessageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__Definitions__MessageAssignment_38765);
            ruleMessage();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getMessageMessageParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Definitions__MessageAssignment_3


    // $ANTLR start rule__Arbitrator__NameAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4368:1: rule__Arbitrator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Arbitrator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4372:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4373:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4373:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4374:1: RULE_ID
            {
             before(grammarAccess.getArbitratorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Arbitrator__NameAssignment_08796); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4383:1: rule__Arbitrator__KeywordAssignment_2 : ( ( 'Arbitrator' ) ) ;
    public final void rule__Arbitrator__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4387:1: ( ( ( 'Arbitrator' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4388:1: ( ( 'Arbitrator' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4388:1: ( ( 'Arbitrator' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4389:1: ( 'Arbitrator' )
            {
             before(grammarAccess.getArbitratorAccess().getKeywordArbitratorKeyword_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4390:1: ( 'Arbitrator' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4391:1: 'Arbitrator'
            {
             before(grammarAccess.getArbitratorAccess().getKeywordArbitratorKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Arbitrator__KeywordAssignment_28832); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4406:1: rule__Participant__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4410:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4411:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4411:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4412:1: RULE_ID
            {
             before(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_08871); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4421:1: rule__Participant__KeywordAssignment_2 : ( ( 'Participant' ) ) ;
    public final void rule__Participant__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4425:1: ( ( ( 'Participant' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4426:1: ( ( 'Participant' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4426:1: ( ( 'Participant' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4427:1: ( 'Participant' )
            {
             before(grammarAccess.getParticipantAccess().getKeywordParticipantKeyword_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4428:1: ( 'Participant' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4429:1: 'Participant'
            {
             before(grammarAccess.getParticipantAccess().getKeywordParticipantKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Participant__KeywordAssignment_28907); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4444:1: rule__Cipher__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Cipher__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4448:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4449:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4449:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4450:1: RULE_ID
            {
             before(grammarAccess.getCipherAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cipher__NameAssignment_08946); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4459:1: rule__Cipher__KeywordAssignment_2 : ( ( rule__Cipher__KeywordAlternatives_2_0 ) ) ;
    public final void rule__Cipher__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4463:1: ( ( ( rule__Cipher__KeywordAlternatives_2_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4464:1: ( ( rule__Cipher__KeywordAlternatives_2_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4464:1: ( ( rule__Cipher__KeywordAlternatives_2_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4465:1: ( rule__Cipher__KeywordAlternatives_2_0 )
            {
             before(grammarAccess.getCipherAccess().getKeywordAlternatives_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4466:1: ( rule__Cipher__KeywordAlternatives_2_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4466:2: rule__Cipher__KeywordAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Cipher__KeywordAlternatives_2_0_in_rule__Cipher__KeywordAssignment_28977);
            rule__Cipher__KeywordAlternatives_2_0();
            _fsp--;


            }

             after(grammarAccess.getCipherAccess().getKeywordAlternatives_2_0()); 

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


    // $ANTLR start rule__Message__NameAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4475:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4479:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4480:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4480:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4481:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_09010); 
             after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Message__NameAssignment_0


    // $ANTLR start rule__Message__KeywordAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4490:1: rule__Message__KeywordAssignment_2 : ( ( 'Message' ) ) ;
    public final void rule__Message__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4494:1: ( ( ( 'Message' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4495:1: ( ( 'Message' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4495:1: ( ( 'Message' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4496:1: ( 'Message' )
            {
             before(grammarAccess.getMessageAccess().getKeywordMessageKeyword_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4497:1: ( 'Message' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4498:1: 'Message'
            {
             before(grammarAccess.getMessageAccess().getKeywordMessageKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Message__KeywordAssignment_29046); 
             after(grammarAccess.getMessageAccess().getKeywordMessageKeyword_2_0()); 

            }

             after(grammarAccess.getMessageAccess().getKeywordMessageKeyword_2_0()); 

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
    // $ANTLR end rule__Message__KeywordAssignment_2


    // $ANTLR start rule__Transactions__TransactionsAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4513:1: rule__Transactions__TransactionsAssignment_1 : ( ruleTransaction ) ;
    public final void rule__Transactions__TransactionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4517:1: ( ( ruleTransaction ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4518:1: ( ruleTransaction )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4518:1: ( ruleTransaction )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4519:1: ruleTransaction
            {
             before(grammarAccess.getTransactionsAccess().getTransactionsTransactionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__Transactions__TransactionsAssignment_19085);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4528:1: rule__Transaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4532:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4533:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4533:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4534:1: RULE_ID
            {
             before(grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_19116); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4543:1: rule__Transaction__ArgumentsAssignment_3 : ( ruleArgument ) ;
    public final void rule__Transaction__ArgumentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4547:1: ( ( ruleArgument ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4548:1: ( ruleArgument )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4548:1: ( ruleArgument )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4549:1: ruleArgument
            {
             before(grammarAccess.getTransactionAccess().getArgumentsArgumentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Transaction__ArgumentsAssignment_39147);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4558:1: rule__Transaction__OperationsAssignment_6 : ( ruleOperation ) ;
    public final void rule__Transaction__OperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4562:1: ( ( ruleOperation ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4563:1: ( ruleOperation )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4563:1: ( ruleOperation )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4564:1: ruleOperation
            {
             before(grammarAccess.getTransactionAccess().getOperationsOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Transaction__OperationsAssignment_69178);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4573:1: rule__Argument__KeywordAssignment_0 : ( ruleKeyword ) ;
    public final void rule__Argument__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4577:1: ( ( ruleKeyword ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4578:1: ( ruleKeyword )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4578:1: ( ruleKeyword )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4579:1: ruleKeyword
            {
             before(grammarAccess.getArgumentAccess().getKeywordKeywordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleKeyword_in_rule__Argument__KeywordAssignment_09209);
            ruleKeyword();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getKeywordKeywordParserRuleCall_0_0()); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4588:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4592:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4593:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4593:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4594:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_19240); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4603:1: rule__Decrypt__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decrypt__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4607:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4608:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4608:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4609:1: RULE_ID
            {
             before(grammarAccess.getDecryptAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decrypt__MessageAssignment_19271); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4618:1: rule__Decrypt__ParticipantAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Decrypt__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4622:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4623:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4623:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4624:1: ( RULE_ID )
            {
             before(grammarAccess.getDecryptAccess().getParticipantParticipantCrossReference_3_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4625:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4626:1: RULE_ID
            {
             before(grammarAccess.getDecryptAccess().getParticipantParticipantIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decrypt__ParticipantAssignment_39306); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4637:1: rule__Encrypt__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Encrypt__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4641:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4642:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4642:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4643:1: RULE_ID
            {
             before(grammarAccess.getEncryptAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Encrypt__MessageAssignment_19341); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4652:1: rule__Encrypt__ParticipantAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Encrypt__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4656:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4657:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4657:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4658:1: ( RULE_ID )
            {
             before(grammarAccess.getEncryptAccess().getParticipantParticipantCrossReference_3_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4659:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4660:1: RULE_ID
            {
             before(grammarAccess.getEncryptAccess().getParticipantParticipantIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Encrypt__ParticipantAssignment_39376); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4671:1: rule__Send__MessageAssignment_0 : ( RULE_ID ) ;
    public final void rule__Send__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4675:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4676:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4676:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4677:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getMessageIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__MessageAssignment_09411); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4686:1: rule__Send__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Send__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4690:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4691:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4691:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4692:1: ( RULE_ID )
            {
             before(grammarAccess.getSendAccess().getSourceEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4693:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4694:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getSourceEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__SourceAssignment_29446); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4705:1: rule__Send__DestinationAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Send__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4709:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4710:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4710:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4711:1: ( RULE_ID )
            {
             before(grammarAccess.getSendAccess().getDestinationEventSourceCrossReference_4_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4712:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4713:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getDestinationEventSourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__DestinationAssignment_49485); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4724:1: rule__Print__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Print__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4728:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4729:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4729:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4730:1: RULE_ID
            {
             before(grammarAccess.getPrintAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Print__MessageAssignment_19520); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4739:1: rule__Call__TransactionNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Call__TransactionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4743:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4744:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4744:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4745:1: ( RULE_ID )
            {
             before(grammarAccess.getCallAccess().getTransactionNameTransactionCrossReference_1_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4746:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4747:1: RULE_ID
            {
             before(grammarAccess.getCallAccess().getTransactionNameTransactionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Call__TransactionNameAssignment_19555); 
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


    // $ANTLR start rule__Call__ArgsAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4758:1: rule__Call__ArgsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Call__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4762:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4763:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4763:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4764:1: ( RULE_ID )
            {
             before(grammarAccess.getCallAccess().getArgsDefineCrossReference_3_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4765:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4766:1: RULE_ID
            {
             before(grammarAccess.getCallAccess().getArgsDefineIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Call__ArgsAssignment_39594); 
             after(grammarAccess.getCallAccess().getArgsDefineIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCallAccess().getArgsDefineCrossReference_3_0()); 

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
    // $ANTLR end rule__Call__ArgsAssignment_3


    // $ANTLR start rule__Exchange__SourceAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4777:1: rule__Exchange__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Exchange__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4781:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4782:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4782:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4783:1: ( RULE_ID )
            {
             before(grammarAccess.getExchangeAccess().getSourceEventSourceCrossReference_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4784:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4785:1: RULE_ID
            {
             before(grammarAccess.getExchangeAccess().getSourceEventSourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exchange__SourceAssignment_09633); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4796:1: rule__Exchange__DestinationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Exchange__DestinationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4800:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4801:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4801:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4802:1: ( RULE_ID )
            {
             before(grammarAccess.getExchangeAccess().getDestinationEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4803:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4804:1: RULE_ID
            {
             before(grammarAccess.getExchangeAccess().getDestinationEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exchange__DestinationAssignment_29672); 
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


    // $ANTLR start rule__Redirect__MessageAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4815:1: rule__Redirect__MessageAssignment_0 : ( RULE_ID ) ;
    public final void rule__Redirect__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4819:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4820:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4820:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4821:1: RULE_ID
            {
             before(grammarAccess.getRedirectAccess().getMessageIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Redirect__MessageAssignment_09707); 
             after(grammarAccess.getRedirectAccess().getMessageIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Redirect__MessageAssignment_0


    // $ANTLR start rule__Redirect__DestinationAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4830:1: rule__Redirect__DestinationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Redirect__DestinationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4834:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4835:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4835:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4836:1: ( RULE_ID )
            {
             before(grammarAccess.getRedirectAccess().getDestinationEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4837:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4838:1: RULE_ID
            {
             before(grammarAccess.getRedirectAccess().getDestinationEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Redirect__DestinationAssignment_29742); 
             after(grammarAccess.getRedirectAccess().getDestinationEventSourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRedirectAccess().getDestinationEventSourceCrossReference_2_0()); 

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
    // $ANTLR end rule__Redirect__DestinationAssignment_2


    // $ANTLR start rule__States__StatesAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4849:1: rule__States__StatesAssignment_1 : ( ruleState ) ;
    public final void rule__States__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4853:1: ( ( ruleState ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4854:1: ( ruleState )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4854:1: ( ruleState )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4855:1: ruleState
            {
             before(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__States__StatesAssignment_19777);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4864:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4868:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4869:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4869:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4870:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_19808); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4879:1: rule__State__EventAssignment_3 : ( ruleEvent ) ;
    public final void rule__State__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4883:1: ( ( ruleEvent ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4884:1: ( ruleEvent )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4884:1: ( ruleEvent )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4885:1: ruleEvent
            {
             before(grammarAccess.getStateAccess().getEventEventParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__State__EventAssignment_39839);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4894:1: rule__State__GuardsAssignment_6 : ( ruleGuard ) ;
    public final void rule__State__GuardsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4898:1: ( ( ruleGuard ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4899:1: ( ruleGuard )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4899:1: ( ruleGuard )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4900:1: ruleGuard
            {
             before(grammarAccess.getStateAccess().getGuardsGuardParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleGuard_in_rule__State__GuardsAssignment_69870);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4909:1: rule__Guard__CasemAssignment_1 : ( ruleCase ) ;
    public final void rule__Guard__CasemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4913:1: ( ( ruleCase ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4914:1: ( ruleCase )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4914:1: ( ruleCase )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4915:1: ruleCase
            {
             before(grammarAccess.getGuardAccess().getCasemCaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Guard__CasemAssignment_19901);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4924:1: rule__Guard__OperationAssignment_3 : ( ruleOperation ) ;
    public final void rule__Guard__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4928:1: ( ( ruleOperation ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4929:1: ( ruleOperation )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4929:1: ( ruleOperation )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4930:1: ruleOperation
            {
             before(grammarAccess.getGuardAccess().getOperationOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Guard__OperationAssignment_39932);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4939:1: rule__GetEvent__WhoAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GetEvent__WhoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4943:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4944:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4944:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4945:1: ( RULE_ID )
            {
             before(grammarAccess.getGetEventAccess().getWhoDefineCrossReference_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4946:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4947:1: RULE_ID
            {
             before(grammarAccess.getGetEventAccess().getWhoDefineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetEvent__WhoAssignment_09967); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4958:1: rule__GetEvent__MessageAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__GetEvent__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4962:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4963:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4963:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4964:1: ( RULE_ID )
            {
             before(grammarAccess.getGetEventAccess().getMessageMessageCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4965:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4966:1: RULE_ID
            {
             before(grammarAccess.getGetEventAccess().getMessageMessageIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetEvent__MessageAssignment_210006); 
             after(grammarAccess.getGetEventAccess().getMessageMessageIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGetEventAccess().getMessageMessageCrossReference_2_0()); 

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


    // $ANTLR start rule__SendsEvent__WhoAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4977:1: rule__SendsEvent__WhoAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SendsEvent__WhoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4981:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4982:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4982:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4983:1: ( RULE_ID )
            {
             before(grammarAccess.getSendsEventAccess().getWhoDefineCrossReference_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4984:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4985:1: RULE_ID
            {
             before(grammarAccess.getSendsEventAccess().getWhoDefineIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SendsEvent__WhoAssignment_010045); 
             after(grammarAccess.getSendsEventAccess().getWhoDefineIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSendsEventAccess().getWhoDefineCrossReference_0_0()); 

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
    // $ANTLR end rule__SendsEvent__WhoAssignment_0


    // $ANTLR start rule__SendsEvent__MessageAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:4996:1: rule__SendsEvent__MessageAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SendsEvent__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5000:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5001:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5001:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5002:1: ( RULE_ID )
            {
             before(grammarAccess.getSendsEventAccess().getMessageMessageCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5003:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5004:1: RULE_ID
            {
             before(grammarAccess.getSendsEventAccess().getMessageMessageIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SendsEvent__MessageAssignment_210084); 
             after(grammarAccess.getSendsEventAccess().getMessageMessageIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSendsEventAccess().getMessageMessageCrossReference_2_0()); 

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
    // $ANTLR end rule__SendsEvent__MessageAssignment_2


    // $ANTLR start rule__IsSendEvent__MessageAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5015:1: rule__IsSendEvent__MessageAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__IsSendEvent__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5019:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5020:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5020:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5021:1: ( RULE_ID )
            {
             before(grammarAccess.getIsSendEventAccess().getMessageMessageCrossReference_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5022:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5023:1: RULE_ID
            {
             before(grammarAccess.getIsSendEventAccess().getMessageMessageIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IsSendEvent__MessageAssignment_010123); 
             after(grammarAccess.getIsSendEventAccess().getMessageMessageIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getIsSendEventAccess().getMessageMessageCrossReference_0_0()); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5034:1: rule__Init__KeywordAssignment : ( ( 'INIT' ) ) ;
    public final void rule__Init__KeywordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5038:1: ( ( ( 'INIT' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5039:1: ( ( 'INIT' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5039:1: ( ( 'INIT' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5040:1: ( 'INIT' )
            {
             before(grammarAccess.getInitAccess().getKeywordINITKeyword_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5041:1: ( 'INIT' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5042:1: 'INIT'
            {
             before(grammarAccess.getInitAccess().getKeywordINITKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Init__KeywordAssignment10163); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5057:1: rule__Always__KeywordAssignment : ( ( 'always' ) ) ;
    public final void rule__Always__KeywordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5061:1: ( ( ( 'always' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5062:1: ( ( 'always' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5062:1: ( ( 'always' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5063:1: ( 'always' )
            {
             before(grammarAccess.getAlwaysAccess().getKeywordAlwaysKeyword_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5064:1: ( 'always' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5065:1: 'always'
            {
             before(grammarAccess.getAlwaysAccess().getKeywordAlwaysKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Always__KeywordAssignment10207); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5080:1: rule__Otherwise__KeywordAssignment : ( ( 'otherwise' ) ) ;
    public final void rule__Otherwise__KeywordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5084:1: ( ( ( 'otherwise' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5085:1: ( ( 'otherwise' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5085:1: ( ( 'otherwise' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5086:1: ( 'otherwise' )
            {
             before(grammarAccess.getOtherwiseAccess().getKeywordOtherwiseKeyword_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5087:1: ( 'otherwise' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5088:1: 'otherwise'
            {
             before(grammarAccess.getOtherwiseAccess().getKeywordOtherwiseKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Otherwise__KeywordAssignment10251); 
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


    // $ANTLR start rule__To__KeywordAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5103:1: rule__To__KeywordAssignment_0 : ( ( 'to' ) ) ;
    public final void rule__To__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5107:1: ( ( ( 'to' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5108:1: ( ( 'to' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5108:1: ( ( 'to' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5109:1: ( 'to' )
            {
             before(grammarAccess.getToAccess().getKeywordToKeyword_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5110:1: ( 'to' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5111:1: 'to'
            {
             before(grammarAccess.getToAccess().getKeywordToKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__To__KeywordAssignment_010295); 
             after(grammarAccess.getToAccess().getKeywordToKeyword_0_0()); 

            }

             after(grammarAccess.getToAccess().getKeywordToKeyword_0_0()); 

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
    // $ANTLR end rule__To__KeywordAssignment_0


    // $ANTLR start rule__To__EventSourceAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5126:1: rule__To__EventSourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__To__EventSourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5130:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5131:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5131:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5132:1: ( RULE_ID )
            {
             before(grammarAccess.getToAccess().getEventSourceEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5133:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5134:1: RULE_ID
            {
             before(grammarAccess.getToAccess().getEventSourceEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__To__EventSourceAssignment_210338); 
             after(grammarAccess.getToAccess().getEventSourceEventSourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getToAccess().getEventSourceEventSourceCrossReference_2_0()); 

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
    // $ANTLR end rule__To__EventSourceAssignment_2


    // $ANTLR start rule__From__KeywordAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5145:1: rule__From__KeywordAssignment_0 : ( ( 'from' ) ) ;
    public final void rule__From__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5149:1: ( ( ( 'from' ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5150:1: ( ( 'from' ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5150:1: ( ( 'from' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5151:1: ( 'from' )
            {
             before(grammarAccess.getFromAccess().getKeywordFromKeyword_0_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5152:1: ( 'from' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5153:1: 'from'
            {
             before(grammarAccess.getFromAccess().getKeywordFromKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__From__KeywordAssignment_010378); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5168:1: rule__From__EventSourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__From__EventSourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5172:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5173:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5173:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5174:1: ( RULE_ID )
            {
             before(grammarAccess.getFromAccess().getEventSourceEventSourceCrossReference_2_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5175:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5176:1: RULE_ID
            {
             before(grammarAccess.getFromAccess().getEventSourceEventSourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__From__EventSourceAssignment_210421); 
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


    // $ANTLR start rule__Test__OperationsAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5187:1: rule__Test__OperationsAssignment_1 : ( ruleOperation ) ;
    public final void rule__Test__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5191:1: ( ( ruleOperation ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5192:1: ( ruleOperation )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5192:1: ( ruleOperation )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:5193:1: ruleOperation
            {
             before(grammarAccess.getTestAccess().getOperationsOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Test__OperationsAssignment_110456);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getTestAccess().getOperationsOperationParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Test__OperationsAssignment_1


 

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
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_entryRuleKeyword483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyword490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keyword__Alternatives_in_ruleKeyword516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_entryRuleTransactions543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactions550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0_in_ruleTransactions576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0_in_ruleTransaction636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_entryRuleDecrypt783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecrypt790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__0_in_ruleDecrypt816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_entryRuleEncrypt843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncrypt850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__0_in_ruleEncrypt876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0_in_ruleSend936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0_in_rulePrint996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_entryRuleExchange1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExchange1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__0_in_ruleExchange1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedirect_in_entryRuleRedirect1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRedirect1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redirect__Group__0_in_ruleRedirect1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_entryRuleStates1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStates1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0_in_ruleStates1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_entryRuleGetEvent1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetEvent1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__0_in_ruleGetEvent1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendsEvent_in_entryRuleSendsEvent1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSendsEvent1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendsEvent__Group__0_in_ruleSendsEvent1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsSendEvent1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__0_in_ruleIsSendEvent1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_entryRuleInit1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInit1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Init__KeywordAssignment_in_ruleInit1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Alternatives_in_ruleCase1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_entryRuleAlways1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlways1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Always__KeywordAssignment_in_ruleAlways1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_entryRuleOtherwise1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherwise1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Otherwise__KeywordAssignment_in_ruleOtherwise1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTo_in_entryRuleTo1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTo1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__To__Group__0_in_ruleTo1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0_in_ruleFrom1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0_in_ruleTest2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitrator_in_rule__EventSource__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_rule__EventSource__Alternatives2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Cipher__KeywordAlternatives_2_02103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cipher__KeywordAlternatives_2_02123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Keyword__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Keyword__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Keyword__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Keyword__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Keyword__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_rule__Operation__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_rule__Operation__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__Operation__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_rule__Operation__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__Operation__Alternatives2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExchange_in_rule__Operation__Alternatives2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedirect_in_rule__Operation__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_rule__Event__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_rule__Event__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_rule__Event__Alternatives2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSendsEvent_in_rule__Event__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_rule__Case__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_rule__Case__Alternatives2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTo_in_rule__Case__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_rule__Case__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__0__Impl_in_rule__PDLFile__Group__02570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__1_in_rule__PDLFile__Group__02573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PDLFile__Group__0__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__1__Impl_in_rule__PDLFile__Group__12632 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__2_in_rule__PDLFile__Group__12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__NameAssignment_1_in_rule__PDLFile__Group__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__2__Impl_in_rule__PDLFile__Group__22692 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__3_in_rule__PDLFile__Group__22695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PDLFile__Group__2__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__3__Impl_in_rule__PDLFile__Group__32754 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__4_in_rule__PDLFile__Group__32757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__DefinitionAssignment_3_in_rule__PDLFile__Group__3__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__4__Impl_in_rule__PDLFile__Group__42814 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__5_in_rule__PDLFile__Group__42817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__TransactionAssignment_4_in_rule__PDLFile__Group__4__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__5__Impl_in_rule__PDLFile__Group__52874 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__6_in_rule__PDLFile__Group__52877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__StateAssignment_5_in_rule__PDLFile__Group__5__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__6__Impl_in_rule__PDLFile__Group__62934 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__7_in_rule__PDLFile__Group__62937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__TestAssignment_6_in_rule__PDLFile__Group__6__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__7__Impl_in_rule__PDLFile__Group__72994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PDLFile__Group__7__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__03069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__03072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definitions__Group__0__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__13131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__13134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__SourcesAssignment_1_in_rule__Definitions__Group__1__Impl3161 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__23192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definitions__Group__3_in_rule__Definitions__Group__23195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__CipherAssignment_2_in_rule__Definitions__Group__2__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__3__Impl_in_rule__Definitions__Group__33252 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definitions__Group__4_in_rule__Definitions__Group__33255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__MessageAssignment_3_in_rule__Definitions__Group__3__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__4__Impl_in_rule__Definitions__Group__43312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definitions__Group__4__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__0__Impl_in_rule__Arbitrator__Group__03381 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__1_in_rule__Arbitrator__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__NameAssignment_0_in_rule__Arbitrator__Group__0__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__1__Impl_in_rule__Arbitrator__Group__13441 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__2_in_rule__Arbitrator__Group__13444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Arbitrator__Group__1__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__Group__2__Impl_in_rule__Arbitrator__Group__23503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arbitrator__KeywordAssignment_2_in_rule__Arbitrator__Group__2__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__03566 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__03569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__13626 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__13629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Participant__Group__1__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__23688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__KeywordAssignment_2_in_rule__Participant__Group__2__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__Group__0__Impl_in_rule__Cipher__Group__03751 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Cipher__Group__1_in_rule__Cipher__Group__03754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__NameAssignment_0_in_rule__Cipher__Group__0__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__Group__1__Impl_in_rule__Cipher__Group__13811 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Cipher__Group__2_in_rule__Cipher__Group__13814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Cipher__Group__1__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__Group__2__Impl_in_rule__Cipher__Group__23873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__KeywordAssignment_2_in_rule__Cipher__Group__2__Impl3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03936 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13996 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Message__Group__1__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__24058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__KeywordAssignment_2_in_rule__Message__Group__2__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__04121 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__04124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Transactions__Group__0__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__14183 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transactions__Group__2_in_rule__Transactions__Group__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__TransactionsAssignment_1_in_rule__Transactions__Group__1__Impl4213 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__2__Impl_in_rule__Transactions__Group__24244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transactions__Group__2__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__04309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__04312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transaction__Group__0__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__14371 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__14374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__24431 = new BitSet(new long[]{0x000000000100F800L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__24434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Transaction__Group__2__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__34493 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__34496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__ArgumentsAssignment_3_in_rule__Transaction__Group__3__Impl4523 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__44554 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__44557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transaction__Group__4__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__54616 = new BitSet(new long[]{0x0000000194040010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__54619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Transaction__Group__5__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__64678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__7_in_rule__Transaction__Group__64681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__OperationsAssignment_6_in_rule__Transaction__Group__6__Impl4708 = new BitSet(new long[]{0x0000000194000012L});
    public static final BitSet FOLLOW_rule__Transaction__Group__7__Impl_in_rule__Transaction__Group__74739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transaction__Group__7__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__KeywordAssignment_0_in_rule__Argument__Group__0__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__14874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__0__Impl_in_rule__Decrypt__Group__04935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__1_in_rule__Decrypt__Group__04938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Decrypt__Group__0__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__1__Impl_in_rule__Decrypt__Group__14997 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__2_in_rule__Decrypt__Group__15000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__MessageAssignment_1_in_rule__Decrypt__Group__1__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__2__Impl_in_rule__Decrypt__Group__25057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__3_in_rule__Decrypt__Group__25060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Decrypt__Group__2__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__3__Impl_in_rule__Decrypt__Group__35119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__ParticipantAssignment_3_in_rule__Decrypt__Group__3__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__0__Impl_in_rule__Encrypt__Group__05184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__1_in_rule__Encrypt__Group__05187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Encrypt__Group__0__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__1__Impl_in_rule__Encrypt__Group__15246 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__2_in_rule__Encrypt__Group__15249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__MessageAssignment_1_in_rule__Encrypt__Group__1__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__2__Impl_in_rule__Encrypt__Group__25306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__3_in_rule__Encrypt__Group__25309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Encrypt__Group__2__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__3__Impl_in_rule__Encrypt__Group__35368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__ParticipantAssignment_3_in_rule__Encrypt__Group__3__Impl5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__05433 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__05436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__MessageAssignment_0_in_rule__Send__Group__0__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__15493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Send__Group__1__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__25555 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__25558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__SourceAssignment_2_in_rule__Send__Group__2__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__35615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__35618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Send__Group__3__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__45677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__DestinationAssignment_4_in_rule__Send__Group__4__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__05744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Print__Group__1_in_rule__Print__Group__05747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Print__Group__0__Impl5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__MessageAssignment_1_in_rule__Print__Group__1__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Call__Group__0__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15929 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__TransactionNameAssignment_1_in_rule__Call__Group__1__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25989 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__25992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Call__Group__2__Impl6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__36051 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__36054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ArgsAssignment_3_in_rule__Call__Group__3__Impl6081 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__46112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Call__Group__4__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__0__Impl_in_rule__Exchange__Group__06181 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exchange__Group__1_in_rule__Exchange__Group__06184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__SourceAssignment_0_in_rule__Exchange__Group__0__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__1__Impl_in_rule__Exchange__Group__16241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exchange__Group__2_in_rule__Exchange__Group__16244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exchange__Group__1__Impl6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__Group__2__Impl_in_rule__Exchange__Group__26303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exchange__DestinationAssignment_2_in_rule__Exchange__Group__2__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redirect__Group__0__Impl_in_rule__Redirect__Group__06366 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Redirect__Group__1_in_rule__Redirect__Group__06369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redirect__MessageAssignment_0_in_rule__Redirect__Group__0__Impl6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redirect__Group__1__Impl_in_rule__Redirect__Group__16426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Redirect__Group__2_in_rule__Redirect__Group__16429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Redirect__Group__1__Impl6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redirect__Group__2__Impl_in_rule__Redirect__Group__26488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redirect__DestinationAssignment_2_in_rule__Redirect__Group__2__Impl6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__06551 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_rule__States__Group__1_in_rule__States__Group__06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__States__Group__0__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__16613 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__States__Group__2_in_rule__States__Group__16616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__StatesAssignment_1_in_rule__States__Group__1__Impl6643 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__26674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__States__Group__2__Impl6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__06739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__06742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__State__Group__0__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__16801 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__16804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__26861 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__26864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__Group__2__Impl6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__36923 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__36926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__EventAssignment_3_in_rule__State__Group__3__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__46983 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__46986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group__4__Impl7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__57045 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_rule__State__Group__6_in_rule__State__Group__57048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group__5__Impl7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__67107 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__State__Group__7_in_rule__State__Group__67110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__GuardsAssignment_6_in_rule__State__Group__6__Impl7137 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__77168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__7__Impl7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__07243 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__07246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Guard__Group__0__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__17305 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__17308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__CasemAssignment_1_in_rule__Guard__Group__1__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__27365 = new BitSet(new long[]{0x0000000194000010L});
    public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__27368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Guard__Group__2__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__37427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__OperationAssignment_3_in_rule__Guard__Group__3__Impl7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__0__Impl_in_rule__GetEvent__Group__07492 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__1_in_rule__GetEvent__Group__07495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__WhoAssignment_0_in_rule__GetEvent__Group__0__Impl7522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__1__Impl_in_rule__GetEvent__Group__17552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__2_in_rule__GetEvent__Group__17555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__GetEvent__Group__1__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__2__Impl_in_rule__GetEvent__Group__27614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__MessageAssignment_2_in_rule__GetEvent__Group__2__Impl7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendsEvent__Group__0__Impl_in_rule__SendsEvent__Group__07677 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SendsEvent__Group__1_in_rule__SendsEvent__Group__07680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendsEvent__WhoAssignment_0_in_rule__SendsEvent__Group__0__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendsEvent__Group__1__Impl_in_rule__SendsEvent__Group__17737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SendsEvent__Group__2_in_rule__SendsEvent__Group__17740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SendsEvent__Group__1__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendsEvent__Group__2__Impl_in_rule__SendsEvent__Group__27799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SendsEvent__MessageAssignment_2_in_rule__SendsEvent__Group__2__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__0__Impl_in_rule__IsSendEvent__Group__07862 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__1_in_rule__IsSendEvent__Group__07865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__MessageAssignment_0_in_rule__IsSendEvent__Group__0__Impl7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__1__Impl_in_rule__IsSendEvent__Group__17922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IsSendEvent__Group__1__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__To__Group__0__Impl_in_rule__To__Group__07985 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__To__Group__1_in_rule__To__Group__07988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__To__KeywordAssignment_0_in_rule__To__Group__0__Impl8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__To__Group__1__Impl_in_rule__To__Group__18045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__To__Group__2_in_rule__To__Group__18048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__To__Group__1__Impl8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__To__Group__2__Impl_in_rule__To__Group__28107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__To__EventSourceAssignment_2_in_rule__To__Group__2__Impl8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__08170 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__From__Group__1_in_rule__From__Group__08173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__KeywordAssignment_0_in_rule__From__Group__0__Impl8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__18230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__From__Group__2_in_rule__From__Group__18233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__From__Group__1__Impl8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__28292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__EventSourceAssignment_2_in_rule__From__Group__2__Impl8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__08355 = new BitSet(new long[]{0x0000000194040010L});
    public static final BitSet FOLLOW_rule__Test__Group__1_in_rule__Test__Group__08358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Test__Group__0__Impl8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__18417 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Test__Group__2_in_rule__Test__Group__18420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__OperationsAssignment_1_in_rule__Test__Group__1__Impl8447 = new BitSet(new long[]{0x0000000194000012L});
    public static final BitSet FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__28478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Test__Group__2__Impl8506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PDLFile__NameAssignment_18548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_rule__PDLFile__DefinitionAssignment_38579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_rule__PDLFile__TransactionAssignment_48610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_rule__PDLFile__StateAssignment_58641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_rule__PDLFile__TestAssignment_68672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSource_in_rule__Definitions__SourcesAssignment_18703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCipher_in_rule__Definitions__CipherAssignment_28734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Definitions__MessageAssignment_38765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Arbitrator__NameAssignment_08796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Arbitrator__KeywordAssignment_28832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_08871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Participant__KeywordAssignment_28907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cipher__NameAssignment_08946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cipher__KeywordAlternatives_2_0_in_rule__Cipher__KeywordAssignment_28977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_09010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Message__KeywordAssignment_29046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__Transactions__TransactionsAssignment_19085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_19116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Transaction__ArgumentsAssignment_39147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Transaction__OperationsAssignment_69178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyword_in_rule__Argument__KeywordAssignment_09209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_19240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decrypt__MessageAssignment_19271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decrypt__ParticipantAssignment_39306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Encrypt__MessageAssignment_19341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Encrypt__ParticipantAssignment_39376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__MessageAssignment_09411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__SourceAssignment_29446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__DestinationAssignment_49485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Print__MessageAssignment_19520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Call__TransactionNameAssignment_19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Call__ArgsAssignment_39594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exchange__SourceAssignment_09633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exchange__DestinationAssignment_29672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Redirect__MessageAssignment_09707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Redirect__DestinationAssignment_29742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__States__StatesAssignment_19777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_19808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__State__EventAssignment_39839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__State__GuardsAssignment_69870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Guard__CasemAssignment_19901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Guard__OperationAssignment_39932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetEvent__WhoAssignment_09967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetEvent__MessageAssignment_210006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SendsEvent__WhoAssignment_010045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SendsEvent__MessageAssignment_210084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IsSendEvent__MessageAssignment_010123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Init__KeywordAssignment10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Always__KeywordAssignment10207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Otherwise__KeywordAssignment10251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__To__KeywordAssignment_010295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__To__EventSourceAssignment_210338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__From__KeywordAssignment_010378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__From__EventSourceAssignment_210421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Test__OperationsAssignment_110456 = new BitSet(new long[]{0x0000000000000002L});

}