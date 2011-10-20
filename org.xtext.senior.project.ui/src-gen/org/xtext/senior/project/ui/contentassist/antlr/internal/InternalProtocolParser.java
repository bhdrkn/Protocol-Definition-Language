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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'always'", "'otherwise'", "'pdlfile'", "'[DEFINITIONS]'", "'[END]'", "'='", "'[TRANSACTIONS]'", "'TRANSACTION'", "'('", "')'", "'[BEGIN]'", "'decrypt'", "'for'", "'encrypt'", "'::'", "'->'", "'print'", "'CALL'", "'[STATES]'", "'STATE'", "'|'", "'=>'", "'GET'", "'IS_SEND'", "'source'", "'from'"
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


    // $ANTLR start entryRuleDefine
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:117:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:118:1: ( ruleDefine EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:119:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine181);
            ruleDefine();
            _fsp--;

             after(grammarAccess.getDefineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine188); 

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
    // $ANTLR end entryRuleDefine


    // $ANTLR start ruleDefine
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:126:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:130:2: ( ( ( rule__Define__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:131:1: ( ( rule__Define__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:131:1: ( ( rule__Define__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:132:1: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:133:1: ( rule__Define__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:133:2: rule__Define__Group__0
            {
            pushFollow(FOLLOW_rule__Define__Group__0_in_ruleDefine214);
            rule__Define__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefine


    // $ANTLR start entryRuleTransactions
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:145:1: entryRuleTransactions : ruleTransactions EOF ;
    public final void entryRuleTransactions() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:146:1: ( ruleTransactions EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:147:1: ruleTransactions EOF
            {
             before(grammarAccess.getTransactionsRule()); 
            pushFollow(FOLLOW_ruleTransactions_in_entryRuleTransactions241);
            ruleTransactions();
            _fsp--;

             after(grammarAccess.getTransactionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactions248); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:154:1: ruleTransactions : ( ( rule__Transactions__Group__0 ) ) ;
    public final void ruleTransactions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:158:2: ( ( ( rule__Transactions__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:159:1: ( ( rule__Transactions__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:159:1: ( ( rule__Transactions__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:160:1: ( rule__Transactions__Group__0 )
            {
             before(grammarAccess.getTransactionsAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:161:1: ( rule__Transactions__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:161:2: rule__Transactions__Group__0
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0_in_ruleTransactions274);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:173:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:174:1: ( ruleTransaction EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:175:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction301);
            ruleTransaction();
            _fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction308); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:182:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:186:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:187:1: ( ( rule__Transaction__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:187:1: ( ( rule__Transaction__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:188:1: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:189:1: ( rule__Transaction__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:189:2: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0_in_ruleTransaction334);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:201:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:202:1: ( ruleArgument EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:203:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument361);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument368); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:210:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:214:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:215:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:215:1: ( ( rule__Argument__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:216:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:217:1: ( rule__Argument__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:217:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument394);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:229:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:230:1: ( ruleOperation EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:231:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation421);
            ruleOperation();
            _fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation428); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:238:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:242:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:243:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:243:1: ( ( rule__Operation__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:244:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:245:1: ( rule__Operation__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:245:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation454);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:257:1: entryRuleDecrypt : ruleDecrypt EOF ;
    public final void entryRuleDecrypt() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:258:1: ( ruleDecrypt EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:259:1: ruleDecrypt EOF
            {
             before(grammarAccess.getDecryptRule()); 
            pushFollow(FOLLOW_ruleDecrypt_in_entryRuleDecrypt481);
            ruleDecrypt();
            _fsp--;

             after(grammarAccess.getDecryptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecrypt488); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:266:1: ruleDecrypt : ( ( rule__Decrypt__Group__0 ) ) ;
    public final void ruleDecrypt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:270:2: ( ( ( rule__Decrypt__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:271:1: ( ( rule__Decrypt__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:271:1: ( ( rule__Decrypt__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:272:1: ( rule__Decrypt__Group__0 )
            {
             before(grammarAccess.getDecryptAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:273:1: ( rule__Decrypt__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:273:2: rule__Decrypt__Group__0
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__0_in_ruleDecrypt514);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:285:1: entryRuleEncrypt : ruleEncrypt EOF ;
    public final void entryRuleEncrypt() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:286:1: ( ruleEncrypt EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:287:1: ruleEncrypt EOF
            {
             before(grammarAccess.getEncryptRule()); 
            pushFollow(FOLLOW_ruleEncrypt_in_entryRuleEncrypt541);
            ruleEncrypt();
            _fsp--;

             after(grammarAccess.getEncryptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncrypt548); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:294:1: ruleEncrypt : ( ( rule__Encrypt__Group__0 ) ) ;
    public final void ruleEncrypt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:298:2: ( ( ( rule__Encrypt__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:299:1: ( ( rule__Encrypt__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:299:1: ( ( rule__Encrypt__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:300:1: ( rule__Encrypt__Group__0 )
            {
             before(grammarAccess.getEncryptAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:301:1: ( rule__Encrypt__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:301:2: rule__Encrypt__Group__0
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__0_in_ruleEncrypt574);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:313:1: entryRuleSend : ruleSend EOF ;
    public final void entryRuleSend() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:314:1: ( ruleSend EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:315:1: ruleSend EOF
            {
             before(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_ruleSend_in_entryRuleSend601);
            ruleSend();
            _fsp--;

             after(grammarAccess.getSendRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSend608); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:322:1: ruleSend : ( ( rule__Send__Group__0 ) ) ;
    public final void ruleSend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:326:2: ( ( ( rule__Send__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:327:1: ( ( rule__Send__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:327:1: ( ( rule__Send__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:328:1: ( rule__Send__Group__0 )
            {
             before(grammarAccess.getSendAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:329:1: ( rule__Send__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:329:2: rule__Send__Group__0
            {
            pushFollow(FOLLOW_rule__Send__Group__0_in_ruleSend634);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:341:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:342:1: ( rulePrint EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:343:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_rulePrint_in_entryRulePrint661);
            rulePrint();
            _fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrint668); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:350:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:354:2: ( ( ( rule__Print__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:355:1: ( ( rule__Print__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:355:1: ( ( rule__Print__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:356:1: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:357:1: ( rule__Print__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:357:2: rule__Print__Group__0
            {
            pushFollow(FOLLOW_rule__Print__Group__0_in_rulePrint694);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:369:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:370:1: ( ruleCall EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:371:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall721);
            ruleCall();
            _fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall728); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:378:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:382:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:383:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:383:1: ( ( rule__Call__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:384:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:385:1: ( rule__Call__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:385:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall754);
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


    // $ANTLR start entryRuleStates
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:397:1: entryRuleStates : ruleStates EOF ;
    public final void entryRuleStates() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:398:1: ( ruleStates EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:399:1: ruleStates EOF
            {
             before(grammarAccess.getStatesRule()); 
            pushFollow(FOLLOW_ruleStates_in_entryRuleStates781);
            ruleStates();
            _fsp--;

             after(grammarAccess.getStatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStates788); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:406:1: ruleStates : ( ( rule__States__Group__0 ) ) ;
    public final void ruleStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:410:2: ( ( ( rule__States__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:411:1: ( ( rule__States__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:411:1: ( ( rule__States__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:412:1: ( rule__States__Group__0 )
            {
             before(grammarAccess.getStatesAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:413:1: ( rule__States__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:413:2: rule__States__Group__0
            {
            pushFollow(FOLLOW_rule__States__Group__0_in_ruleStates814);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:425:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:426:1: ( ruleState EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:427:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState841);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState848); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:434:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:438:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:439:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:439:1: ( ( rule__State__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:440:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:441:1: ( rule__State__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:441:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState874);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:453:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:454:1: ( ruleGuard EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:455:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard901);
            ruleGuard();
            _fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard908); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:462:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:466:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:467:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:467:1: ( ( rule__Guard__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:468:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:469:1: ( rule__Guard__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:469:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard934);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:481:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:482:1: ( ruleEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:483:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent961);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent968); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:490:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:494:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:495:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:495:1: ( ( rule__Event__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:496:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:497:1: ( rule__Event__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:497:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent994);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:509:1: entryRuleGetEvent : ruleGetEvent EOF ;
    public final void entryRuleGetEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:510:1: ( ruleGetEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:511:1: ruleGetEvent EOF
            {
             before(grammarAccess.getGetEventRule()); 
            pushFollow(FOLLOW_ruleGetEvent_in_entryRuleGetEvent1021);
            ruleGetEvent();
            _fsp--;

             after(grammarAccess.getGetEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetEvent1028); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:518:1: ruleGetEvent : ( ( rule__GetEvent__Group__0 ) ) ;
    public final void ruleGetEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:522:2: ( ( ( rule__GetEvent__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:523:1: ( ( rule__GetEvent__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:523:1: ( ( rule__GetEvent__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:524:1: ( rule__GetEvent__Group__0 )
            {
             before(grammarAccess.getGetEventAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:525:1: ( rule__GetEvent__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:525:2: rule__GetEvent__Group__0
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__0_in_ruleGetEvent1054);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:537:1: entryRuleIsSendEvent : ruleIsSendEvent EOF ;
    public final void entryRuleIsSendEvent() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:538:1: ( ruleIsSendEvent EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:539:1: ruleIsSendEvent EOF
            {
             before(grammarAccess.getIsSendEventRule()); 
            pushFollow(FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent1081);
            ruleIsSendEvent();
            _fsp--;

             after(grammarAccess.getIsSendEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsSendEvent1088); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:546:1: ruleIsSendEvent : ( ( rule__IsSendEvent__Group__0 ) ) ;
    public final void ruleIsSendEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:550:2: ( ( ( rule__IsSendEvent__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:551:1: ( ( rule__IsSendEvent__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:551:1: ( ( rule__IsSendEvent__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:552:1: ( rule__IsSendEvent__Group__0 )
            {
             before(grammarAccess.getIsSendEventAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:553:1: ( rule__IsSendEvent__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:553:2: rule__IsSendEvent__Group__0
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__0_in_ruleIsSendEvent1114);
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


    // $ANTLR start entryRuleCase
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:565:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:566:1: ( ruleCase EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:567:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase1141);
            ruleCase();
            _fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase1148); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:574:1: ruleCase : ( ( rule__Case__Alternatives ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:578:2: ( ( ( rule__Case__Alternatives ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:579:1: ( ( rule__Case__Alternatives ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:579:1: ( ( rule__Case__Alternatives ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:580:1: ( rule__Case__Alternatives )
            {
             before(grammarAccess.getCaseAccess().getAlternatives()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:581:1: ( rule__Case__Alternatives )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:581:2: rule__Case__Alternatives
            {
            pushFollow(FOLLOW_rule__Case__Alternatives_in_ruleCase1174);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:593:1: entryRuleAlways : ruleAlways EOF ;
    public final void entryRuleAlways() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:594:1: ( ruleAlways EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:595:1: ruleAlways EOF
            {
             before(grammarAccess.getAlwaysRule()); 
            pushFollow(FOLLOW_ruleAlways_in_entryRuleAlways1201);
            ruleAlways();
            _fsp--;

             after(grammarAccess.getAlwaysRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlways1208); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:602:1: ruleAlways : ( 'always' ) ;
    public final void ruleAlways() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:606:2: ( ( 'always' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:607:1: ( 'always' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:607:1: ( 'always' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:608:1: 'always'
            {
             before(grammarAccess.getAlwaysAccess().getAlwaysKeyword()); 
            match(input,11,FOLLOW_11_in_ruleAlways1235); 
             after(grammarAccess.getAlwaysAccess().getAlwaysKeyword()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:623:1: entryRuleOtherwise : ruleOtherwise EOF ;
    public final void entryRuleOtherwise() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:624:1: ( ruleOtherwise EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:625:1: ruleOtherwise EOF
            {
             before(grammarAccess.getOtherwiseRule()); 
            pushFollow(FOLLOW_ruleOtherwise_in_entryRuleOtherwise1263);
            ruleOtherwise();
            _fsp--;

             after(grammarAccess.getOtherwiseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherwise1270); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:632:1: ruleOtherwise : ( 'otherwise' ) ;
    public final void ruleOtherwise() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:636:2: ( ( 'otherwise' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:637:1: ( 'otherwise' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:637:1: ( 'otherwise' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:638:1: 'otherwise'
            {
             before(grammarAccess.getOtherwiseAccess().getOtherwiseKeyword()); 
            match(input,12,FOLLOW_12_in_ruleOtherwise1297); 
             after(grammarAccess.getOtherwiseAccess().getOtherwiseKeyword()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:653:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:654:1: ( ruleSource EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:655:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource1325);
            ruleSource();
            _fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource1332); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:662:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:666:2: ( ( ( rule__Source__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:667:1: ( ( rule__Source__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:667:1: ( ( rule__Source__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:668:1: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:669:1: ( rule__Source__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:669:2: rule__Source__Group__0
            {
            pushFollow(FOLLOW_rule__Source__Group__0_in_ruleSource1358);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:681:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:682:1: ( ruleFrom EOF )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:683:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom1385);
            ruleFrom();
            _fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom1392); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:690:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:694:2: ( ( ( rule__From__Group__0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:695:1: ( ( rule__From__Group__0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:695:1: ( ( rule__From__Group__0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:696:1: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:697:1: ( rule__From__Group__0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:697:2: rule__From__Group__0
            {
            pushFollow(FOLLOW_rule__From__Group__0_in_ruleFrom1418);
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


    // $ANTLR start rule__Operation__Alternatives
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:709:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:713:1: ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("709:1: rule__Operation__Alternatives : ( ( ruleDecrypt ) | ( ruleEncrypt ) | ( ruleSend ) | ( rulePrint ) | ( ruleCall ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:714:1: ( ruleDecrypt )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:714:1: ( ruleDecrypt )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:715:1: ruleDecrypt
                    {
                     before(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecrypt_in_rule__Operation__Alternatives1454);
                    ruleDecrypt();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getDecryptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:720:6: ( ruleEncrypt )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:720:6: ( ruleEncrypt )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:721:1: ruleEncrypt
                    {
                     before(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEncrypt_in_rule__Operation__Alternatives1471);
                    ruleEncrypt();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getEncryptParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:726:6: ( ruleSend )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:726:6: ( ruleSend )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:727:1: ruleSend
                    {
                     before(grammarAccess.getOperationAccess().getSendParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSend_in_rule__Operation__Alternatives1488);
                    ruleSend();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getSendParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:732:6: ( rulePrint )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:732:6: ( rulePrint )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:733:1: rulePrint
                    {
                     before(grammarAccess.getOperationAccess().getPrintParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePrint_in_rule__Operation__Alternatives1505);
                    rulePrint();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getPrintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:738:6: ( ruleCall )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:738:6: ( ruleCall )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:739:1: ruleCall
                    {
                     before(grammarAccess.getOperationAccess().getCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__Operation__Alternatives1522);
                    ruleCall();
                    _fsp--;

                     after(grammarAccess.getOperationAccess().getCallParserRuleCall_4()); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:749:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:753:1: ( ( ruleGetEvent ) | ( ruleIsSendEvent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==34) ) {
                    alt2=2;
                }
                else if ( (LA2_1==33) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("749:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("749:1: rule__Event__Alternatives : ( ( ruleGetEvent ) | ( ruleIsSendEvent ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:754:1: ( ruleGetEvent )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:754:1: ( ruleGetEvent )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:755:1: ruleGetEvent
                    {
                     before(grammarAccess.getEventAccess().getGetEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGetEvent_in_rule__Event__Alternatives1554);
                    ruleGetEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getGetEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:760:6: ( ruleIsSendEvent )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:760:6: ( ruleIsSendEvent )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:761:1: ruleIsSendEvent
                    {
                     before(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIsSendEvent_in_rule__Event__Alternatives1571);
                    ruleIsSendEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getIsSendEventParserRuleCall_1()); 

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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:771:1: rule__Case__Alternatives : ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleSource ) | ( ruleFrom ) );
    public final void rule__Case__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:775:1: ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleSource ) | ( ruleFrom ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("771:1: rule__Case__Alternatives : ( ( ruleAlways ) | ( ruleOtherwise ) | ( ruleSource ) | ( ruleFrom ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:776:1: ( ruleAlways )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:776:1: ( ruleAlways )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:777:1: ruleAlways
                    {
                     before(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAlways_in_rule__Case__Alternatives1603);
                    ruleAlways();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getAlwaysParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:782:6: ( ruleOtherwise )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:782:6: ( ruleOtherwise )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:783:1: ruleOtherwise
                    {
                     before(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOtherwise_in_rule__Case__Alternatives1620);
                    ruleOtherwise();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getOtherwiseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:788:6: ( ruleSource )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:788:6: ( ruleSource )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:789:1: ruleSource
                    {
                     before(grammarAccess.getCaseAccess().getSourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSource_in_rule__Case__Alternatives1637);
                    ruleSource();
                    _fsp--;

                     after(grammarAccess.getCaseAccess().getSourceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:794:6: ( ruleFrom )
                    {
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:794:6: ( ruleFrom )
                    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:795:1: ruleFrom
                    {
                     before(grammarAccess.getCaseAccess().getFromParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFrom_in_rule__Case__Alternatives1654);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:807:1: rule__PDLFile__Group__0 : rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1 ;
    public final void rule__PDLFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:811:1: ( rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:812:2: rule__PDLFile__Group__0__Impl rule__PDLFile__Group__1
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__0__Impl_in_rule__PDLFile__Group__01684);
            rule__PDLFile__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__1_in_rule__PDLFile__Group__01687);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:819:1: rule__PDLFile__Group__0__Impl : ( 'pdlfile' ) ;
    public final void rule__PDLFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:823:1: ( ( 'pdlfile' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:824:1: ( 'pdlfile' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:824:1: ( 'pdlfile' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:825:1: 'pdlfile'
            {
             before(grammarAccess.getPDLFileAccess().getPdlfileKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__PDLFile__Group__0__Impl1715); 
             after(grammarAccess.getPDLFileAccess().getPdlfileKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:838:1: rule__PDLFile__Group__1 : rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2 ;
    public final void rule__PDLFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:842:1: ( rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:843:2: rule__PDLFile__Group__1__Impl rule__PDLFile__Group__2
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__1__Impl_in_rule__PDLFile__Group__11746);
            rule__PDLFile__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__2_in_rule__PDLFile__Group__11749);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:850:1: rule__PDLFile__Group__1__Impl : ( ( rule__PDLFile__NameAssignment_1 ) ) ;
    public final void rule__PDLFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:854:1: ( ( ( rule__PDLFile__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:855:1: ( ( rule__PDLFile__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:855:1: ( ( rule__PDLFile__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:856:1: ( rule__PDLFile__NameAssignment_1 )
            {
             before(grammarAccess.getPDLFileAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:857:1: ( rule__PDLFile__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:857:2: rule__PDLFile__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PDLFile__NameAssignment_1_in_rule__PDLFile__Group__1__Impl1776);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:867:1: rule__PDLFile__Group__2 : rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3 ;
    public final void rule__PDLFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:871:1: ( rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:872:2: rule__PDLFile__Group__2__Impl rule__PDLFile__Group__3
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__2__Impl_in_rule__PDLFile__Group__21806);
            rule__PDLFile__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__3_in_rule__PDLFile__Group__21809);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:879:1: rule__PDLFile__Group__2__Impl : ( ( rule__PDLFile__DefinitionAssignment_2 ) ) ;
    public final void rule__PDLFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:883:1: ( ( ( rule__PDLFile__DefinitionAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:884:1: ( ( rule__PDLFile__DefinitionAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:884:1: ( ( rule__PDLFile__DefinitionAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:885:1: ( rule__PDLFile__DefinitionAssignment_2 )
            {
             before(grammarAccess.getPDLFileAccess().getDefinitionAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:886:1: ( rule__PDLFile__DefinitionAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:886:2: rule__PDLFile__DefinitionAssignment_2
            {
            pushFollow(FOLLOW_rule__PDLFile__DefinitionAssignment_2_in_rule__PDLFile__Group__2__Impl1836);
            rule__PDLFile__DefinitionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getDefinitionAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:896:1: rule__PDLFile__Group__3 : rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4 ;
    public final void rule__PDLFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:900:1: ( rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:901:2: rule__PDLFile__Group__3__Impl rule__PDLFile__Group__4
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__3__Impl_in_rule__PDLFile__Group__31866);
            rule__PDLFile__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PDLFile__Group__4_in_rule__PDLFile__Group__31869);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:908:1: rule__PDLFile__Group__3__Impl : ( ( rule__PDLFile__TransactionAssignment_3 ) ) ;
    public final void rule__PDLFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:912:1: ( ( ( rule__PDLFile__TransactionAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:913:1: ( ( rule__PDLFile__TransactionAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:913:1: ( ( rule__PDLFile__TransactionAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:914:1: ( rule__PDLFile__TransactionAssignment_3 )
            {
             before(grammarAccess.getPDLFileAccess().getTransactionAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:915:1: ( rule__PDLFile__TransactionAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:915:2: rule__PDLFile__TransactionAssignment_3
            {
            pushFollow(FOLLOW_rule__PDLFile__TransactionAssignment_3_in_rule__PDLFile__Group__3__Impl1896);
            rule__PDLFile__TransactionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getTransactionAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:925:1: rule__PDLFile__Group__4 : rule__PDLFile__Group__4__Impl ;
    public final void rule__PDLFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:929:1: ( rule__PDLFile__Group__4__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:930:2: rule__PDLFile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PDLFile__Group__4__Impl_in_rule__PDLFile__Group__41926);
            rule__PDLFile__Group__4__Impl();
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:936:1: rule__PDLFile__Group__4__Impl : ( ( rule__PDLFile__StateAssignment_4 ) ) ;
    public final void rule__PDLFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:940:1: ( ( ( rule__PDLFile__StateAssignment_4 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:941:1: ( ( rule__PDLFile__StateAssignment_4 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:941:1: ( ( rule__PDLFile__StateAssignment_4 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:942:1: ( rule__PDLFile__StateAssignment_4 )
            {
             before(grammarAccess.getPDLFileAccess().getStateAssignment_4()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:943:1: ( rule__PDLFile__StateAssignment_4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:943:2: rule__PDLFile__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__PDLFile__StateAssignment_4_in_rule__PDLFile__Group__4__Impl1953);
            rule__PDLFile__StateAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPDLFileAccess().getStateAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Definitions__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:963:1: rule__Definitions__Group__0 : rule__Definitions__Group__0__Impl rule__Definitions__Group__1 ;
    public final void rule__Definitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:967:1: ( rule__Definitions__Group__0__Impl rule__Definitions__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:968:2: rule__Definitions__Group__0__Impl rule__Definitions__Group__1
            {
            pushFollow(FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__01993);
            rule__Definitions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__01996);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:975:1: rule__Definitions__Group__0__Impl : ( '[DEFINITIONS]' ) ;
    public final void rule__Definitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:979:1: ( ( '[DEFINITIONS]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:980:1: ( '[DEFINITIONS]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:980:1: ( '[DEFINITIONS]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:981:1: '[DEFINITIONS]'
            {
             before(grammarAccess.getDefinitionsAccess().getDEFINITIONSKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Definitions__Group__0__Impl2024); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:994:1: rule__Definitions__Group__1 : rule__Definitions__Group__1__Impl rule__Definitions__Group__2 ;
    public final void rule__Definitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:998:1: ( rule__Definitions__Group__1__Impl rule__Definitions__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:999:2: rule__Definitions__Group__1__Impl rule__Definitions__Group__2
            {
            pushFollow(FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__12055);
            rule__Definitions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__12058);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1006:1: rule__Definitions__Group__1__Impl : ( ( rule__Definitions__DefinitionsAssignment_1 )* ) ;
    public final void rule__Definitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1010:1: ( ( ( rule__Definitions__DefinitionsAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1011:1: ( ( rule__Definitions__DefinitionsAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1011:1: ( ( rule__Definitions__DefinitionsAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1012:1: ( rule__Definitions__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getDefinitionsAccess().getDefinitionsAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1013:1: ( rule__Definitions__DefinitionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1013:2: rule__Definitions__DefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Definitions__DefinitionsAssignment_1_in_rule__Definitions__Group__1__Impl2085);
            	    rule__Definitions__DefinitionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDefinitionsAccess().getDefinitionsAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1023:1: rule__Definitions__Group__2 : rule__Definitions__Group__2__Impl ;
    public final void rule__Definitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1027:1: ( rule__Definitions__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1028:2: rule__Definitions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__22116);
            rule__Definitions__Group__2__Impl();
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1034:1: rule__Definitions__Group__2__Impl : ( '[END]' ) ;
    public final void rule__Definitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1038:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1039:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1039:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1040:1: '[END]'
            {
             before(grammarAccess.getDefinitionsAccess().getENDKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Definitions__Group__2__Impl2144); 
             after(grammarAccess.getDefinitionsAccess().getENDKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Define__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1059:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1063:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1064:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02181);
            rule__Define__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02184);
            rule__Define__Group__1();
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
    // $ANTLR end rule__Define__Group__0


    // $ANTLR start rule__Define__Group__0__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1071:1: rule__Define__Group__0__Impl : ( ( rule__Define__NameAssignment_0 ) ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1075:1: ( ( ( rule__Define__NameAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1076:1: ( ( rule__Define__NameAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1076:1: ( ( rule__Define__NameAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1077:1: ( rule__Define__NameAssignment_0 )
            {
             before(grammarAccess.getDefineAccess().getNameAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1078:1: ( rule__Define__NameAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1078:2: rule__Define__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Define__NameAssignment_0_in_rule__Define__Group__0__Impl2211);
            rule__Define__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDefineAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Define__Group__0__Impl


    // $ANTLR start rule__Define__Group__1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1088:1: rule__Define__Group__1 : rule__Define__Group__1__Impl rule__Define__Group__2 ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1092:1: ( rule__Define__Group__1__Impl rule__Define__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1093:2: rule__Define__Group__1__Impl rule__Define__Group__2
            {
            pushFollow(FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12241);
            rule__Define__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Define__Group__2_in_rule__Define__Group__12244);
            rule__Define__Group__2();
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
    // $ANTLR end rule__Define__Group__1


    // $ANTLR start rule__Define__Group__1__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1100:1: rule__Define__Group__1__Impl : ( '=' ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1104:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1105:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1105:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1106:1: '='
            {
             before(grammarAccess.getDefineAccess().getEqualsSGnKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Define__Group__1__Impl2272); 
             after(grammarAccess.getDefineAccess().getEqualsSGnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Define__Group__1__Impl


    // $ANTLR start rule__Define__Group__2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1119:1: rule__Define__Group__2 : rule__Define__Group__2__Impl ;
    public final void rule__Define__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1123:1: ( rule__Define__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1124:2: rule__Define__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Define__Group__2__Impl_in_rule__Define__Group__22303);
            rule__Define__Group__2__Impl();
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
    // $ANTLR end rule__Define__Group__2


    // $ANTLR start rule__Define__Group__2__Impl
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1130:1: rule__Define__Group__2__Impl : ( ( rule__Define__KeywordAssignment_2 ) ) ;
    public final void rule__Define__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1134:1: ( ( ( rule__Define__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1135:1: ( ( rule__Define__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1135:1: ( ( rule__Define__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1136:1: ( rule__Define__KeywordAssignment_2 )
            {
             before(grammarAccess.getDefineAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1137:1: ( rule__Define__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1137:2: rule__Define__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__Define__KeywordAssignment_2_in_rule__Define__Group__2__Impl2330);
            rule__Define__KeywordAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefineAccess().getKeywordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Define__Group__2__Impl


    // $ANTLR start rule__Transactions__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1153:1: rule__Transactions__Group__0 : rule__Transactions__Group__0__Impl rule__Transactions__Group__1 ;
    public final void rule__Transactions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1157:1: ( rule__Transactions__Group__0__Impl rule__Transactions__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1158:2: rule__Transactions__Group__0__Impl rule__Transactions__Group__1
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__02366);
            rule__Transactions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__02369);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1165:1: rule__Transactions__Group__0__Impl : ( '[TRANSACTIONS]' ) ;
    public final void rule__Transactions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1169:1: ( ( '[TRANSACTIONS]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1170:1: ( '[TRANSACTIONS]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1170:1: ( '[TRANSACTIONS]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1171:1: '[TRANSACTIONS]'
            {
             before(grammarAccess.getTransactionsAccess().getTRANSACTIONSKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Transactions__Group__0__Impl2397); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1184:1: rule__Transactions__Group__1 : rule__Transactions__Group__1__Impl rule__Transactions__Group__2 ;
    public final void rule__Transactions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1188:1: ( rule__Transactions__Group__1__Impl rule__Transactions__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1189:2: rule__Transactions__Group__1__Impl rule__Transactions__Group__2
            {
            pushFollow(FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__12428);
            rule__Transactions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transactions__Group__2_in_rule__Transactions__Group__12431);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1196:1: rule__Transactions__Group__1__Impl : ( ( rule__Transactions__TransactionsAssignment_1 )* ) ;
    public final void rule__Transactions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1200:1: ( ( ( rule__Transactions__TransactionsAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1201:1: ( ( rule__Transactions__TransactionsAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1201:1: ( ( rule__Transactions__TransactionsAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1202:1: ( rule__Transactions__TransactionsAssignment_1 )*
            {
             before(grammarAccess.getTransactionsAccess().getTransactionsAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1203:1: ( rule__Transactions__TransactionsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1203:2: rule__Transactions__TransactionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Transactions__TransactionsAssignment_1_in_rule__Transactions__Group__1__Impl2458);
            	    rule__Transactions__TransactionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1213:1: rule__Transactions__Group__2 : rule__Transactions__Group__2__Impl ;
    public final void rule__Transactions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1217:1: ( rule__Transactions__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1218:2: rule__Transactions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transactions__Group__2__Impl_in_rule__Transactions__Group__22489);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1224:1: rule__Transactions__Group__2__Impl : ( '[END]' ) ;
    public final void rule__Transactions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1228:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1229:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1229:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1230:1: '[END]'
            {
             before(grammarAccess.getTransactionsAccess().getENDKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Transactions__Group__2__Impl2517); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1249:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1253:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1254:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__02554);
            rule__Transaction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__02557);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1261:1: rule__Transaction__Group__0__Impl : ( 'TRANSACTION' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1265:1: ( ( 'TRANSACTION' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1266:1: ( 'TRANSACTION' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1266:1: ( 'TRANSACTION' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1267:1: 'TRANSACTION'
            {
             before(grammarAccess.getTransactionAccess().getTRANSACTIONKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Transaction__Group__0__Impl2585); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1280:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1284:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1285:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__12616);
            rule__Transaction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__12619);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1292:1: rule__Transaction__Group__1__Impl : ( ( rule__Transaction__NameAssignment_1 ) ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1296:1: ( ( ( rule__Transaction__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1297:1: ( ( rule__Transaction__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1297:1: ( ( rule__Transaction__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1298:1: ( rule__Transaction__NameAssignment_1 )
            {
             before(grammarAccess.getTransactionAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1299:1: ( rule__Transaction__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1299:2: rule__Transaction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl2646);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1309:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1313:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1314:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__22676);
            rule__Transaction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__22679);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1321:1: rule__Transaction__Group__2__Impl : ( '(' ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1325:1: ( ( '(' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1326:1: ( '(' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1326:1: ( '(' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1327:1: '('
            {
             before(grammarAccess.getTransactionAccess().getLeftParenthesSKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Transaction__Group__2__Impl2707); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1340:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1344:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1345:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__32738);
            rule__Transaction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__32741);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1352:1: rule__Transaction__Group__3__Impl : ( ( rule__Transaction__ArgumentsAssignment_3 )* ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1356:1: ( ( ( rule__Transaction__ArgumentsAssignment_3 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1357:1: ( ( rule__Transaction__ArgumentsAssignment_3 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1357:1: ( ( rule__Transaction__ArgumentsAssignment_3 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1358:1: ( rule__Transaction__ArgumentsAssignment_3 )*
            {
             before(grammarAccess.getTransactionAccess().getArgumentsAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1359:1: ( rule__Transaction__ArgumentsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1359:2: rule__Transaction__ArgumentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__ArgumentsAssignment_3_in_rule__Transaction__Group__3__Impl2768);
            	    rule__Transaction__ArgumentsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1369:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1373:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1374:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__42799);
            rule__Transaction__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__42802);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1381:1: rule__Transaction__Group__4__Impl : ( ')' ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1385:1: ( ( ')' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1386:1: ( ')' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1386:1: ( ')' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1387:1: ')'
            {
             before(grammarAccess.getTransactionAccess().getRGhtParenthesSKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Transaction__Group__4__Impl2830); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1400:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1404:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1405:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__52861);
            rule__Transaction__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__52864);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1412:1: rule__Transaction__Group__5__Impl : ( '[BEGIN]' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1416:1: ( ( '[BEGIN]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1417:1: ( '[BEGIN]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1417:1: ( '[BEGIN]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1418:1: '[BEGIN]'
            {
             before(grammarAccess.getTransactionAccess().getBEGINKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Transaction__Group__5__Impl2892); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1431:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl rule__Transaction__Group__7 ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1435:1: ( rule__Transaction__Group__6__Impl rule__Transaction__Group__7 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1436:2: rule__Transaction__Group__6__Impl rule__Transaction__Group__7
            {
            pushFollow(FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__62923);
            rule__Transaction__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__7_in_rule__Transaction__Group__62926);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1443:1: rule__Transaction__Group__6__Impl : ( ( rule__Transaction__OperationsAssignment_6 )* ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1447:1: ( ( ( rule__Transaction__OperationsAssignment_6 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1448:1: ( ( rule__Transaction__OperationsAssignment_6 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1448:1: ( ( rule__Transaction__OperationsAssignment_6 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1449:1: ( rule__Transaction__OperationsAssignment_6 )*
            {
             before(grammarAccess.getTransactionAccess().getOperationsAssignment_6()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1450:1: ( rule__Transaction__OperationsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22||LA7_0==24||(LA7_0>=27 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1450:2: rule__Transaction__OperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__OperationsAssignment_6_in_rule__Transaction__Group__6__Impl2953);
            	    rule__Transaction__OperationsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1460:1: rule__Transaction__Group__7 : rule__Transaction__Group__7__Impl ;
    public final void rule__Transaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1464:1: ( rule__Transaction__Group__7__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1465:2: rule__Transaction__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group__7__Impl_in_rule__Transaction__Group__72984);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1471:1: rule__Transaction__Group__7__Impl : ( '[END]' ) ;
    public final void rule__Transaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1475:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1476:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1476:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1477:1: '[END]'
            {
             before(grammarAccess.getTransactionAccess().getENDKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Transaction__Group__7__Impl3012); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1506:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1510:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1511:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__03059);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__03062);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1518:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__KeywordAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1522:1: ( ( ( rule__Argument__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1523:1: ( ( rule__Argument__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1523:1: ( ( rule__Argument__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1524:1: ( rule__Argument__KeywordAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1525:1: ( rule__Argument__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1525:2: rule__Argument__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__KeywordAssignment_0_in_rule__Argument__Group__0__Impl3089);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1535:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1539:1: ( rule__Argument__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1540:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__13119);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1546:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1550:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1551:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1551:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1552:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1553:1: ( rule__Argument__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1553:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl3146);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1567:1: rule__Decrypt__Group__0 : rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1 ;
    public final void rule__Decrypt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1571:1: ( rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1572:2: rule__Decrypt__Group__0__Impl rule__Decrypt__Group__1
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__0__Impl_in_rule__Decrypt__Group__03180);
            rule__Decrypt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__1_in_rule__Decrypt__Group__03183);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1579:1: rule__Decrypt__Group__0__Impl : ( 'decrypt' ) ;
    public final void rule__Decrypt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1583:1: ( ( 'decrypt' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1584:1: ( 'decrypt' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1584:1: ( 'decrypt' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1585:1: 'decrypt'
            {
             before(grammarAccess.getDecryptAccess().getDecryptKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Decrypt__Group__0__Impl3211); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1598:1: rule__Decrypt__Group__1 : rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2 ;
    public final void rule__Decrypt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1602:1: ( rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1603:2: rule__Decrypt__Group__1__Impl rule__Decrypt__Group__2
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__1__Impl_in_rule__Decrypt__Group__13242);
            rule__Decrypt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__2_in_rule__Decrypt__Group__13245);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1610:1: rule__Decrypt__Group__1__Impl : ( ( rule__Decrypt__MessageAssignment_1 ) ) ;
    public final void rule__Decrypt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1614:1: ( ( ( rule__Decrypt__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1615:1: ( ( rule__Decrypt__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1615:1: ( ( rule__Decrypt__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1616:1: ( rule__Decrypt__MessageAssignment_1 )
            {
             before(grammarAccess.getDecryptAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1617:1: ( rule__Decrypt__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1617:2: rule__Decrypt__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Decrypt__MessageAssignment_1_in_rule__Decrypt__Group__1__Impl3272);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1627:1: rule__Decrypt__Group__2 : rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3 ;
    public final void rule__Decrypt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1631:1: ( rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1632:2: rule__Decrypt__Group__2__Impl rule__Decrypt__Group__3
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__2__Impl_in_rule__Decrypt__Group__23302);
            rule__Decrypt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decrypt__Group__3_in_rule__Decrypt__Group__23305);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1639:1: rule__Decrypt__Group__2__Impl : ( 'for' ) ;
    public final void rule__Decrypt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1643:1: ( ( 'for' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1644:1: ( 'for' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1644:1: ( 'for' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1645:1: 'for'
            {
             before(grammarAccess.getDecryptAccess().getForKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Decrypt__Group__2__Impl3333); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1658:1: rule__Decrypt__Group__3 : rule__Decrypt__Group__3__Impl ;
    public final void rule__Decrypt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1662:1: ( rule__Decrypt__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1663:2: rule__Decrypt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Decrypt__Group__3__Impl_in_rule__Decrypt__Group__33364);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1669:1: rule__Decrypt__Group__3__Impl : ( ( rule__Decrypt__ParticipantAssignment_3 ) ) ;
    public final void rule__Decrypt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1673:1: ( ( ( rule__Decrypt__ParticipantAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1674:1: ( ( rule__Decrypt__ParticipantAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1674:1: ( ( rule__Decrypt__ParticipantAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1675:1: ( rule__Decrypt__ParticipantAssignment_3 )
            {
             before(grammarAccess.getDecryptAccess().getParticipantAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1676:1: ( rule__Decrypt__ParticipantAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1676:2: rule__Decrypt__ParticipantAssignment_3
            {
            pushFollow(FOLLOW_rule__Decrypt__ParticipantAssignment_3_in_rule__Decrypt__Group__3__Impl3391);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1694:1: rule__Encrypt__Group__0 : rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1 ;
    public final void rule__Encrypt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1698:1: ( rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1699:2: rule__Encrypt__Group__0__Impl rule__Encrypt__Group__1
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__0__Impl_in_rule__Encrypt__Group__03429);
            rule__Encrypt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__1_in_rule__Encrypt__Group__03432);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1706:1: rule__Encrypt__Group__0__Impl : ( 'encrypt' ) ;
    public final void rule__Encrypt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1710:1: ( ( 'encrypt' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1711:1: ( 'encrypt' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1711:1: ( 'encrypt' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1712:1: 'encrypt'
            {
             before(grammarAccess.getEncryptAccess().getEncryptKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Encrypt__Group__0__Impl3460); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1725:1: rule__Encrypt__Group__1 : rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2 ;
    public final void rule__Encrypt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1729:1: ( rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1730:2: rule__Encrypt__Group__1__Impl rule__Encrypt__Group__2
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__1__Impl_in_rule__Encrypt__Group__13491);
            rule__Encrypt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__2_in_rule__Encrypt__Group__13494);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1737:1: rule__Encrypt__Group__1__Impl : ( ( rule__Encrypt__MessageAssignment_1 ) ) ;
    public final void rule__Encrypt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1741:1: ( ( ( rule__Encrypt__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1742:1: ( ( rule__Encrypt__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1742:1: ( ( rule__Encrypt__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1743:1: ( rule__Encrypt__MessageAssignment_1 )
            {
             before(grammarAccess.getEncryptAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1744:1: ( rule__Encrypt__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1744:2: rule__Encrypt__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Encrypt__MessageAssignment_1_in_rule__Encrypt__Group__1__Impl3521);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1754:1: rule__Encrypt__Group__2 : rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3 ;
    public final void rule__Encrypt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1758:1: ( rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1759:2: rule__Encrypt__Group__2__Impl rule__Encrypt__Group__3
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__2__Impl_in_rule__Encrypt__Group__23551);
            rule__Encrypt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Encrypt__Group__3_in_rule__Encrypt__Group__23554);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1766:1: rule__Encrypt__Group__2__Impl : ( 'for' ) ;
    public final void rule__Encrypt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1770:1: ( ( 'for' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1771:1: ( 'for' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1771:1: ( 'for' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1772:1: 'for'
            {
             before(grammarAccess.getEncryptAccess().getForKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Encrypt__Group__2__Impl3582); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1785:1: rule__Encrypt__Group__3 : rule__Encrypt__Group__3__Impl ;
    public final void rule__Encrypt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1789:1: ( rule__Encrypt__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1790:2: rule__Encrypt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Encrypt__Group__3__Impl_in_rule__Encrypt__Group__33613);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1796:1: rule__Encrypt__Group__3__Impl : ( ( rule__Encrypt__ParticipantAssignment_3 ) ) ;
    public final void rule__Encrypt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1800:1: ( ( ( rule__Encrypt__ParticipantAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1801:1: ( ( rule__Encrypt__ParticipantAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1801:1: ( ( rule__Encrypt__ParticipantAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1802:1: ( rule__Encrypt__ParticipantAssignment_3 )
            {
             before(grammarAccess.getEncryptAccess().getParticipantAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1803:1: ( rule__Encrypt__ParticipantAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1803:2: rule__Encrypt__ParticipantAssignment_3
            {
            pushFollow(FOLLOW_rule__Encrypt__ParticipantAssignment_3_in_rule__Encrypt__Group__3__Impl3640);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1821:1: rule__Send__Group__0 : rule__Send__Group__0__Impl rule__Send__Group__1 ;
    public final void rule__Send__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1825:1: ( rule__Send__Group__0__Impl rule__Send__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1826:2: rule__Send__Group__0__Impl rule__Send__Group__1
            {
            pushFollow(FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__03678);
            rule__Send__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__1_in_rule__Send__Group__03681);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1833:1: rule__Send__Group__0__Impl : ( ( rule__Send__MessageAssignment_0 ) ) ;
    public final void rule__Send__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1837:1: ( ( ( rule__Send__MessageAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1838:1: ( ( rule__Send__MessageAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1838:1: ( ( rule__Send__MessageAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1839:1: ( rule__Send__MessageAssignment_0 )
            {
             before(grammarAccess.getSendAccess().getMessageAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1840:1: ( rule__Send__MessageAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1840:2: rule__Send__MessageAssignment_0
            {
            pushFollow(FOLLOW_rule__Send__MessageAssignment_0_in_rule__Send__Group__0__Impl3708);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1850:1: rule__Send__Group__1 : rule__Send__Group__1__Impl rule__Send__Group__2 ;
    public final void rule__Send__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1854:1: ( rule__Send__Group__1__Impl rule__Send__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1855:2: rule__Send__Group__1__Impl rule__Send__Group__2
            {
            pushFollow(FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__13738);
            rule__Send__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__2_in_rule__Send__Group__13741);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1862:1: rule__Send__Group__1__Impl : ( '::' ) ;
    public final void rule__Send__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1866:1: ( ( '::' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1867:1: ( '::' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1867:1: ( '::' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1868:1: '::'
            {
             before(grammarAccess.getSendAccess().getColonColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Send__Group__1__Impl3769); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1881:1: rule__Send__Group__2 : rule__Send__Group__2__Impl rule__Send__Group__3 ;
    public final void rule__Send__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1885:1: ( rule__Send__Group__2__Impl rule__Send__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1886:2: rule__Send__Group__2__Impl rule__Send__Group__3
            {
            pushFollow(FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__23800);
            rule__Send__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__3_in_rule__Send__Group__23803);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1893:1: rule__Send__Group__2__Impl : ( ( rule__Send__SourceAssignment_2 ) ) ;
    public final void rule__Send__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1897:1: ( ( ( rule__Send__SourceAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1898:1: ( ( rule__Send__SourceAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1898:1: ( ( rule__Send__SourceAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1899:1: ( rule__Send__SourceAssignment_2 )
            {
             before(grammarAccess.getSendAccess().getSourceAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1900:1: ( rule__Send__SourceAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1900:2: rule__Send__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Send__SourceAssignment_2_in_rule__Send__Group__2__Impl3830);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1910:1: rule__Send__Group__3 : rule__Send__Group__3__Impl rule__Send__Group__4 ;
    public final void rule__Send__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1914:1: ( rule__Send__Group__3__Impl rule__Send__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1915:2: rule__Send__Group__3__Impl rule__Send__Group__4
            {
            pushFollow(FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__33860);
            rule__Send__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Send__Group__4_in_rule__Send__Group__33863);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1922:1: rule__Send__Group__3__Impl : ( '->' ) ;
    public final void rule__Send__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1926:1: ( ( '->' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1927:1: ( '->' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1927:1: ( '->' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1928:1: '->'
            {
             before(grammarAccess.getSendAccess().getHyphenMNusGreaterThanSGnKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Send__Group__3__Impl3891); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1941:1: rule__Send__Group__4 : rule__Send__Group__4__Impl ;
    public final void rule__Send__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1945:1: ( rule__Send__Group__4__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1946:2: rule__Send__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__43922);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1952:1: rule__Send__Group__4__Impl : ( ( rule__Send__DestinationAssignment_4 ) ) ;
    public final void rule__Send__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1956:1: ( ( ( rule__Send__DestinationAssignment_4 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1957:1: ( ( rule__Send__DestinationAssignment_4 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1957:1: ( ( rule__Send__DestinationAssignment_4 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1958:1: ( rule__Send__DestinationAssignment_4 )
            {
             before(grammarAccess.getSendAccess().getDestinationAssignment_4()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1959:1: ( rule__Send__DestinationAssignment_4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1959:2: rule__Send__DestinationAssignment_4
            {
            pushFollow(FOLLOW_rule__Send__DestinationAssignment_4_in_rule__Send__Group__4__Impl3949);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1979:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1983:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1984:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__03989);
            rule__Print__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Print__Group__1_in_rule__Print__Group__03992);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1991:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1995:1: ( ( 'print' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1996:1: ( 'print' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1996:1: ( 'print' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:1997:1: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Print__Group__0__Impl4020); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2010:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2014:1: ( rule__Print__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2015:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__14051);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2021:1: rule__Print__Group__1__Impl : ( ( rule__Print__MessageAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2025:1: ( ( ( rule__Print__MessageAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2026:1: ( ( rule__Print__MessageAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2026:1: ( ( rule__Print__MessageAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2027:1: ( rule__Print__MessageAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getMessageAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2028:1: ( rule__Print__MessageAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2028:2: rule__Print__MessageAssignment_1
            {
            pushFollow(FOLLOW_rule__Print__MessageAssignment_1_in_rule__Print__Group__1__Impl4078);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2042:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2046:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2047:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__04112);
            rule__Call__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__04115);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2054:1: rule__Call__Group__0__Impl : ( 'CALL' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2058:1: ( ( 'CALL' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2059:1: ( 'CALL' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2059:1: ( 'CALL' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2060:1: 'CALL'
            {
             before(grammarAccess.getCallAccess().getCALLKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Call__Group__0__Impl4143); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2073:1: rule__Call__Group__1 : rule__Call__Group__1__Impl ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2077:1: ( rule__Call__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2078:2: rule__Call__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__14174);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2084:1: rule__Call__Group__1__Impl : ( ( rule__Call__TransactionNameAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2088:1: ( ( ( rule__Call__TransactionNameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2089:1: ( ( rule__Call__TransactionNameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2089:1: ( ( rule__Call__TransactionNameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2090:1: ( rule__Call__TransactionNameAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getTransactionNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2091:1: ( rule__Call__TransactionNameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2091:2: rule__Call__TransactionNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Call__TransactionNameAssignment_1_in_rule__Call__Group__1__Impl4201);
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


    // $ANTLR start rule__States__Group__0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2105:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2109:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2110:2: rule__States__Group__0__Impl rule__States__Group__1
            {
            pushFollow(FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__04235);
            rule__States__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__States__Group__1_in_rule__States__Group__04238);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2117:1: rule__States__Group__0__Impl : ( '[STATES]' ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2121:1: ( ( '[STATES]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2122:1: ( '[STATES]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2122:1: ( '[STATES]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2123:1: '[STATES]'
            {
             before(grammarAccess.getStatesAccess().getSTATESKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__States__Group__0__Impl4266); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2136:1: rule__States__Group__1 : rule__States__Group__1__Impl rule__States__Group__2 ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2140:1: ( rule__States__Group__1__Impl rule__States__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2141:2: rule__States__Group__1__Impl rule__States__Group__2
            {
            pushFollow(FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__14297);
            rule__States__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__States__Group__2_in_rule__States__Group__14300);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2148:1: rule__States__Group__1__Impl : ( ( rule__States__StatesAssignment_1 )* ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2152:1: ( ( ( rule__States__StatesAssignment_1 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2153:1: ( ( rule__States__StatesAssignment_1 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2153:1: ( ( rule__States__StatesAssignment_1 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2154:1: ( rule__States__StatesAssignment_1 )*
            {
             before(grammarAccess.getStatesAccess().getStatesAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2155:1: ( rule__States__StatesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2155:2: rule__States__StatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__States__StatesAssignment_1_in_rule__States__Group__1__Impl4327);
            	    rule__States__StatesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2165:1: rule__States__Group__2 : rule__States__Group__2__Impl ;
    public final void rule__States__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2169:1: ( rule__States__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2170:2: rule__States__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__24358);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2176:1: rule__States__Group__2__Impl : ( '[END]' ) ;
    public final void rule__States__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2180:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2181:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2181:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2182:1: '[END]'
            {
             before(grammarAccess.getStatesAccess().getENDKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__States__Group__2__Impl4386); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2201:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2205:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2206:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__04423);
            rule__State__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__04426);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2213:1: rule__State__Group__0__Impl : ( 'STATE' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2217:1: ( ( 'STATE' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2218:1: ( 'STATE' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2218:1: ( 'STATE' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2219:1: 'STATE'
            {
             before(grammarAccess.getStateAccess().getSTATEKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__State__Group__0__Impl4454); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2232:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2236:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2237:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__14485);
            rule__State__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__14488);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2244:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2248:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2249:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2249:1: ( ( rule__State__NameAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2250:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2251:1: ( rule__State__NameAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2251:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl4515);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2261:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2265:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2266:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__24545);
            rule__State__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__24548);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2273:1: rule__State__Group__2__Impl : ( '(' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2277:1: ( ( '(' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2278:1: ( '(' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2278:1: ( '(' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2279:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesSKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__State__Group__2__Impl4576); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2292:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2296:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2297:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__34607);
            rule__State__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__34610);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2304:1: rule__State__Group__3__Impl : ( ( rule__State__EventAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2308:1: ( ( ( rule__State__EventAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2309:1: ( ( rule__State__EventAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2309:1: ( ( rule__State__EventAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2310:1: ( rule__State__EventAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getEventAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2311:1: ( rule__State__EventAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2311:2: rule__State__EventAssignment_3
            {
            pushFollow(FOLLOW_rule__State__EventAssignment_3_in_rule__State__Group__3__Impl4637);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2321:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2325:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2326:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44667);
            rule__State__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__44670);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2333:1: rule__State__Group__4__Impl : ( ')' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2337:1: ( ( ')' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2338:1: ( ')' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2338:1: ( ')' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2339:1: ')'
            {
             before(grammarAccess.getStateAccess().getRGhtParenthesSKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__State__Group__4__Impl4698); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2352:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2356:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2357:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54729);
            rule__State__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__6_in_rule__State__Group__54732);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2364:1: rule__State__Group__5__Impl : ( '[BEGIN]' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2368:1: ( ( '[BEGIN]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2369:1: ( '[BEGIN]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2369:1: ( '[BEGIN]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2370:1: '[BEGIN]'
            {
             before(grammarAccess.getStateAccess().getBEGINKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__State__Group__5__Impl4760); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2383:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2387:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2388:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__64791);
            rule__State__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__7_in_rule__State__Group__64794);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2395:1: rule__State__Group__6__Impl : ( ( rule__State__GuardsAssignment_6 )* ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2399:1: ( ( ( rule__State__GuardsAssignment_6 )* ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2400:1: ( ( rule__State__GuardsAssignment_6 )* )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2400:1: ( ( rule__State__GuardsAssignment_6 )* )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2401:1: ( rule__State__GuardsAssignment_6 )*
            {
             before(grammarAccess.getStateAccess().getGuardsAssignment_6()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2402:1: ( rule__State__GuardsAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2402:2: rule__State__GuardsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__State__GuardsAssignment_6_in_rule__State__Group__6__Impl4821);
            	    rule__State__GuardsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2412:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2416:1: ( rule__State__Group__7__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2417:2: rule__State__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__74852);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2423:1: rule__State__Group__7__Impl : ( '[END]' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2427:1: ( ( '[END]' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2428:1: ( '[END]' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2428:1: ( '[END]' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2429:1: '[END]'
            {
             before(grammarAccess.getStateAccess().getENDKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__State__Group__7__Impl4880); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2458:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2462:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2463:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__04927);
            rule__Guard__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__04930);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2470:1: rule__Guard__Group__0__Impl : ( '|' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2474:1: ( ( '|' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2475:1: ( '|' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2475:1: ( '|' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2476:1: '|'
            {
             before(grammarAccess.getGuardAccess().getVertCalLNeKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Guard__Group__0__Impl4958); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2489:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2493:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2494:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__14989);
            rule__Guard__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__14992);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2501:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__CasemAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2505:1: ( ( ( rule__Guard__CasemAssignment_1 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2506:1: ( ( rule__Guard__CasemAssignment_1 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2506:1: ( ( rule__Guard__CasemAssignment_1 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2507:1: ( rule__Guard__CasemAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getCasemAssignment_1()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2508:1: ( rule__Guard__CasemAssignment_1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2508:2: rule__Guard__CasemAssignment_1
            {
            pushFollow(FOLLOW_rule__Guard__CasemAssignment_1_in_rule__Guard__Group__1__Impl5019);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2518:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2522:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2523:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__25049);
            rule__Guard__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__25052);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2530:1: rule__Guard__Group__2__Impl : ( '=>' ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2534:1: ( ( '=>' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2535:1: ( '=>' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2535:1: ( '=>' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2536:1: '=>'
            {
             before(grammarAccess.getGuardAccess().getEqualsSGnGreaterThanSGnKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Guard__Group__2__Impl5080); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2549:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2553:1: ( rule__Guard__Group__3__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2554:2: rule__Guard__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__35111);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2560:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__OperationAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2564:1: ( ( ( rule__Guard__OperationAssignment_3 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2565:1: ( ( rule__Guard__OperationAssignment_3 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2565:1: ( ( rule__Guard__OperationAssignment_3 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2566:1: ( rule__Guard__OperationAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getOperationAssignment_3()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2567:1: ( rule__Guard__OperationAssignment_3 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2567:2: rule__Guard__OperationAssignment_3
            {
            pushFollow(FOLLOW_rule__Guard__OperationAssignment_3_in_rule__Guard__Group__3__Impl5138);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2585:1: rule__GetEvent__Group__0 : rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1 ;
    public final void rule__GetEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2589:1: ( rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2590:2: rule__GetEvent__Group__0__Impl rule__GetEvent__Group__1
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__0__Impl_in_rule__GetEvent__Group__05176);
            rule__GetEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GetEvent__Group__1_in_rule__GetEvent__Group__05179);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2597:1: rule__GetEvent__Group__0__Impl : ( ( rule__GetEvent__WhoAssignment_0 ) ) ;
    public final void rule__GetEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2601:1: ( ( ( rule__GetEvent__WhoAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2602:1: ( ( rule__GetEvent__WhoAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2602:1: ( ( rule__GetEvent__WhoAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2603:1: ( rule__GetEvent__WhoAssignment_0 )
            {
             before(grammarAccess.getGetEventAccess().getWhoAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2604:1: ( rule__GetEvent__WhoAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2604:2: rule__GetEvent__WhoAssignment_0
            {
            pushFollow(FOLLOW_rule__GetEvent__WhoAssignment_0_in_rule__GetEvent__Group__0__Impl5206);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2614:1: rule__GetEvent__Group__1 : rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2 ;
    public final void rule__GetEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2618:1: ( rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2619:2: rule__GetEvent__Group__1__Impl rule__GetEvent__Group__2
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__1__Impl_in_rule__GetEvent__Group__15236);
            rule__GetEvent__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GetEvent__Group__2_in_rule__GetEvent__Group__15239);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2626:1: rule__GetEvent__Group__1__Impl : ( 'GET' ) ;
    public final void rule__GetEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2630:1: ( ( 'GET' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2631:1: ( 'GET' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2631:1: ( 'GET' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2632:1: 'GET'
            {
             before(grammarAccess.getGetEventAccess().getGETKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__GetEvent__Group__1__Impl5267); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2645:1: rule__GetEvent__Group__2 : rule__GetEvent__Group__2__Impl ;
    public final void rule__GetEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2649:1: ( rule__GetEvent__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2650:2: rule__GetEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GetEvent__Group__2__Impl_in_rule__GetEvent__Group__25298);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2656:1: rule__GetEvent__Group__2__Impl : ( ( rule__GetEvent__KeywordAssignment_2 ) ) ;
    public final void rule__GetEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2660:1: ( ( ( rule__GetEvent__KeywordAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2661:1: ( ( rule__GetEvent__KeywordAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2661:1: ( ( rule__GetEvent__KeywordAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2662:1: ( rule__GetEvent__KeywordAssignment_2 )
            {
             before(grammarAccess.getGetEventAccess().getKeywordAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2663:1: ( rule__GetEvent__KeywordAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2663:2: rule__GetEvent__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__GetEvent__KeywordAssignment_2_in_rule__GetEvent__Group__2__Impl5325);
            rule__GetEvent__KeywordAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getGetEventAccess().getKeywordAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2679:1: rule__IsSendEvent__Group__0 : rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1 ;
    public final void rule__IsSendEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2683:1: ( rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2684:2: rule__IsSendEvent__Group__0__Impl rule__IsSendEvent__Group__1
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__0__Impl_in_rule__IsSendEvent__Group__05361);
            rule__IsSendEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IsSendEvent__Group__1_in_rule__IsSendEvent__Group__05364);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2691:1: rule__IsSendEvent__Group__0__Impl : ( ( rule__IsSendEvent__KeywordAssignment_0 ) ) ;
    public final void rule__IsSendEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2695:1: ( ( ( rule__IsSendEvent__KeywordAssignment_0 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2696:1: ( ( rule__IsSendEvent__KeywordAssignment_0 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2696:1: ( ( rule__IsSendEvent__KeywordAssignment_0 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2697:1: ( rule__IsSendEvent__KeywordAssignment_0 )
            {
             before(grammarAccess.getIsSendEventAccess().getKeywordAssignment_0()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2698:1: ( rule__IsSendEvent__KeywordAssignment_0 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2698:2: rule__IsSendEvent__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__IsSendEvent__KeywordAssignment_0_in_rule__IsSendEvent__Group__0__Impl5391);
            rule__IsSendEvent__KeywordAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIsSendEventAccess().getKeywordAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2708:1: rule__IsSendEvent__Group__1 : rule__IsSendEvent__Group__1__Impl ;
    public final void rule__IsSendEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2712:1: ( rule__IsSendEvent__Group__1__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2713:2: rule__IsSendEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsSendEvent__Group__1__Impl_in_rule__IsSendEvent__Group__15421);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2719:1: rule__IsSendEvent__Group__1__Impl : ( 'IS_SEND' ) ;
    public final void rule__IsSendEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2723:1: ( ( 'IS_SEND' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2724:1: ( 'IS_SEND' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2724:1: ( 'IS_SEND' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2725:1: 'IS_SEND'
            {
             before(grammarAccess.getIsSendEventAccess().getIS_SENDKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__IsSendEvent__Group__1__Impl5449); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2742:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2746:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2747:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_rule__Source__Group__0__Impl_in_rule__Source__Group__05484);
            rule__Source__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Source__Group__1_in_rule__Source__Group__05487);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2754:1: rule__Source__Group__0__Impl : ( 'source' ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2758:1: ( ( 'source' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2759:1: ( 'source' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2759:1: ( 'source' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2760:1: 'source'
            {
             before(grammarAccess.getSourceAccess().getSourceKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Source__Group__0__Impl5515); 
             after(grammarAccess.getSourceAccess().getSourceKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2773:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2777:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2778:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_rule__Source__Group__1__Impl_in_rule__Source__Group__15546);
            rule__Source__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Source__Group__2_in_rule__Source__Group__15549);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2785:1: rule__Source__Group__1__Impl : ( '=' ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2789:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2790:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2790:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2791:1: '='
            {
             before(grammarAccess.getSourceAccess().getEqualsSGnKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Source__Group__1__Impl5577); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2804:1: rule__Source__Group__2 : rule__Source__Group__2__Impl ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2808:1: ( rule__Source__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2809:2: rule__Source__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Source__Group__2__Impl_in_rule__Source__Group__25608);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2815:1: rule__Source__Group__2__Impl : ( ( rule__Source__DefineNameAssignment_2 ) ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2819:1: ( ( ( rule__Source__DefineNameAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2820:1: ( ( rule__Source__DefineNameAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2820:1: ( ( rule__Source__DefineNameAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2821:1: ( rule__Source__DefineNameAssignment_2 )
            {
             before(grammarAccess.getSourceAccess().getDefineNameAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2822:1: ( rule__Source__DefineNameAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2822:2: rule__Source__DefineNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Source__DefineNameAssignment_2_in_rule__Source__Group__2__Impl5635);
            rule__Source__DefineNameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSourceAccess().getDefineNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2838:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2842:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2843:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__05671);
            rule__From__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__From__Group__1_in_rule__From__Group__05674);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2850:1: rule__From__Group__0__Impl : ( 'from' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2854:1: ( ( 'from' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2855:1: ( 'from' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2855:1: ( 'from' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2856:1: 'from'
            {
             before(grammarAccess.getFromAccess().getFromKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__From__Group__0__Impl5702); 
             after(grammarAccess.getFromAccess().getFromKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2869:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2873:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2874:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__15733);
            rule__From__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__From__Group__2_in_rule__From__Group__15736);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2881:1: rule__From__Group__1__Impl : ( '=' ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2885:1: ( ( '=' ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2886:1: ( '=' )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2886:1: ( '=' )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2887:1: '='
            {
             before(grammarAccess.getFromAccess().getEqualsSGnKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__From__Group__1__Impl5764); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2900:1: rule__From__Group__2 : rule__From__Group__2__Impl ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2904:1: ( rule__From__Group__2__Impl )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2905:2: rule__From__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__25795);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2911:1: rule__From__Group__2__Impl : ( ( rule__From__DefineNameAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2915:1: ( ( ( rule__From__DefineNameAssignment_2 ) ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2916:1: ( ( rule__From__DefineNameAssignment_2 ) )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2916:1: ( ( rule__From__DefineNameAssignment_2 ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2917:1: ( rule__From__DefineNameAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getDefineNameAssignment_2()); 
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2918:1: ( rule__From__DefineNameAssignment_2 )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2918:2: rule__From__DefineNameAssignment_2
            {
            pushFollow(FOLLOW_rule__From__DefineNameAssignment_2_in_rule__From__Group__2__Impl5822);
            rule__From__DefineNameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFromAccess().getDefineNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2935:1: rule__PDLFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PDLFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2939:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2940:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2940:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2941:1: RULE_ID
            {
             before(grammarAccess.getPDLFileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PDLFile__NameAssignment_15863); 
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


    // $ANTLR start rule__PDLFile__DefinitionAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2950:1: rule__PDLFile__DefinitionAssignment_2 : ( ruleDefinitions ) ;
    public final void rule__PDLFile__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2954:1: ( ( ruleDefinitions ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2955:1: ( ruleDefinitions )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2955:1: ( ruleDefinitions )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2956:1: ruleDefinitions
            {
             before(grammarAccess.getPDLFileAccess().getDefinitionDefinitionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDefinitions_in_rule__PDLFile__DefinitionAssignment_25894);
            ruleDefinitions();
            _fsp--;

             after(grammarAccess.getPDLFileAccess().getDefinitionDefinitionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__DefinitionAssignment_2


    // $ANTLR start rule__PDLFile__TransactionAssignment_3
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2965:1: rule__PDLFile__TransactionAssignment_3 : ( ruleTransactions ) ;
    public final void rule__PDLFile__TransactionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2969:1: ( ( ruleTransactions ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2970:1: ( ruleTransactions )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2970:1: ( ruleTransactions )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2971:1: ruleTransactions
            {
             before(grammarAccess.getPDLFileAccess().getTransactionTransactionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransactions_in_rule__PDLFile__TransactionAssignment_35925);
            ruleTransactions();
            _fsp--;

             after(grammarAccess.getPDLFileAccess().getTransactionTransactionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__TransactionAssignment_3


    // $ANTLR start rule__PDLFile__StateAssignment_4
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2980:1: rule__PDLFile__StateAssignment_4 : ( ruleStates ) ;
    public final void rule__PDLFile__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2984:1: ( ( ruleStates ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2985:1: ( ruleStates )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2985:1: ( ruleStates )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2986:1: ruleStates
            {
             before(grammarAccess.getPDLFileAccess().getStateStatesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStates_in_rule__PDLFile__StateAssignment_45956);
            ruleStates();
            _fsp--;

             after(grammarAccess.getPDLFileAccess().getStateStatesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PDLFile__StateAssignment_4


    // $ANTLR start rule__Definitions__DefinitionsAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2995:1: rule__Definitions__DefinitionsAssignment_1 : ( ruleDefine ) ;
    public final void rule__Definitions__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:2999:1: ( ( ruleDefine ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3000:1: ( ruleDefine )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3000:1: ( ruleDefine )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3001:1: ruleDefine
            {
             before(grammarAccess.getDefinitionsAccess().getDefinitionsDefineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefine_in_rule__Definitions__DefinitionsAssignment_15987);
            ruleDefine();
            _fsp--;

             after(grammarAccess.getDefinitionsAccess().getDefinitionsDefineParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definitions__DefinitionsAssignment_1


    // $ANTLR start rule__Define__NameAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3010:1: rule__Define__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Define__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3014:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3015:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3015:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3016:1: RULE_ID
            {
             before(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Define__NameAssignment_06018); 
             after(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Define__NameAssignment_0


    // $ANTLR start rule__Define__KeywordAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3025:1: rule__Define__KeywordAssignment_2 : ( RULE_ID ) ;
    public final void rule__Define__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3029:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3030:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3030:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3031:1: RULE_ID
            {
             before(grammarAccess.getDefineAccess().getKeywordIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Define__KeywordAssignment_26049); 
             after(grammarAccess.getDefineAccess().getKeywordIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Define__KeywordAssignment_2


    // $ANTLR start rule__Transactions__TransactionsAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3040:1: rule__Transactions__TransactionsAssignment_1 : ( ruleTransaction ) ;
    public final void rule__Transactions__TransactionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3044:1: ( ( ruleTransaction ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3045:1: ( ruleTransaction )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3045:1: ( ruleTransaction )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3046:1: ruleTransaction
            {
             before(grammarAccess.getTransactionsAccess().getTransactionsTransactionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__Transactions__TransactionsAssignment_16080);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3055:1: rule__Transaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3059:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3060:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3060:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3061:1: RULE_ID
            {
             before(grammarAccess.getTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_16111); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3070:1: rule__Transaction__ArgumentsAssignment_3 : ( ruleArgument ) ;
    public final void rule__Transaction__ArgumentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3074:1: ( ( ruleArgument ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3075:1: ( ruleArgument )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3075:1: ( ruleArgument )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3076:1: ruleArgument
            {
             before(grammarAccess.getTransactionAccess().getArgumentsArgumentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Transaction__ArgumentsAssignment_36142);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3085:1: rule__Transaction__OperationsAssignment_6 : ( ruleOperation ) ;
    public final void rule__Transaction__OperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3089:1: ( ( ruleOperation ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3090:1: ( ruleOperation )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3090:1: ( ruleOperation )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3091:1: ruleOperation
            {
             before(grammarAccess.getTransactionAccess().getOperationsOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Transaction__OperationsAssignment_66173);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3100:1: rule__Argument__KeywordAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3104:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3105:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3105:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3106:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getKeywordIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__KeywordAssignment_06204); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3115:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3119:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3120:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3120:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3121:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_16235); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3130:1: rule__Decrypt__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decrypt__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3134:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3135:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3135:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3136:1: RULE_ID
            {
             before(grammarAccess.getDecryptAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decrypt__MessageAssignment_16266); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3145:1: rule__Decrypt__ParticipantAssignment_3 : ( RULE_ID ) ;
    public final void rule__Decrypt__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3149:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3150:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3150:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3151:1: RULE_ID
            {
             before(grammarAccess.getDecryptAccess().getParticipantIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decrypt__ParticipantAssignment_36297); 
             after(grammarAccess.getDecryptAccess().getParticipantIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3160:1: rule__Encrypt__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Encrypt__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3164:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3165:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3165:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3166:1: RULE_ID
            {
             before(grammarAccess.getEncryptAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Encrypt__MessageAssignment_16328); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3175:1: rule__Encrypt__ParticipantAssignment_3 : ( RULE_ID ) ;
    public final void rule__Encrypt__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3179:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3180:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3180:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3181:1: RULE_ID
            {
             before(grammarAccess.getEncryptAccess().getParticipantIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Encrypt__ParticipantAssignment_36359); 
             after(grammarAccess.getEncryptAccess().getParticipantIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3190:1: rule__Send__MessageAssignment_0 : ( RULE_ID ) ;
    public final void rule__Send__MessageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3194:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3195:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3195:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3196:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getMessageIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__MessageAssignment_06390); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3205:1: rule__Send__SourceAssignment_2 : ( RULE_ID ) ;
    public final void rule__Send__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3209:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3210:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3210:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3211:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getSourceIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__SourceAssignment_26421); 
             after(grammarAccess.getSendAccess().getSourceIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3220:1: rule__Send__DestinationAssignment_4 : ( RULE_ID ) ;
    public final void rule__Send__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3224:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3225:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3225:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3226:1: RULE_ID
            {
             before(grammarAccess.getSendAccess().getDestinationIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Send__DestinationAssignment_46452); 
             after(grammarAccess.getSendAccess().getDestinationIDTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3235:1: rule__Print__MessageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Print__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3239:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3240:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3240:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3241:1: RULE_ID
            {
             before(grammarAccess.getPrintAccess().getMessageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Print__MessageAssignment_16483); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3250:1: rule__Call__TransactionNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Call__TransactionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3254:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3255:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3255:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3256:1: RULE_ID
            {
             before(grammarAccess.getCallAccess().getTransactionNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Call__TransactionNameAssignment_16514); 
             after(grammarAccess.getCallAccess().getTransactionNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__States__StatesAssignment_1
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3265:1: rule__States__StatesAssignment_1 : ( ruleState ) ;
    public final void rule__States__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3269:1: ( ( ruleState ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3270:1: ( ruleState )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3270:1: ( ruleState )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3271:1: ruleState
            {
             before(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__States__StatesAssignment_16545);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3280:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3284:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3285:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3285:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3286:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_16576); 
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3295:1: rule__State__EventAssignment_3 : ( ruleEvent ) ;
    public final void rule__State__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3299:1: ( ( ruleEvent ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3300:1: ( ruleEvent )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3300:1: ( ruleEvent )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3301:1: ruleEvent
            {
             before(grammarAccess.getStateAccess().getEventEventParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__State__EventAssignment_36607);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3310:1: rule__State__GuardsAssignment_6 : ( ruleGuard ) ;
    public final void rule__State__GuardsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3314:1: ( ( ruleGuard ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3315:1: ( ruleGuard )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3315:1: ( ruleGuard )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3316:1: ruleGuard
            {
             before(grammarAccess.getStateAccess().getGuardsGuardParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleGuard_in_rule__State__GuardsAssignment_66638);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3325:1: rule__Guard__CasemAssignment_1 : ( ruleCase ) ;
    public final void rule__Guard__CasemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3329:1: ( ( ruleCase ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3330:1: ( ruleCase )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3330:1: ( ruleCase )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3331:1: ruleCase
            {
             before(grammarAccess.getGuardAccess().getCasemCaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Guard__CasemAssignment_16669);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3340:1: rule__Guard__OperationAssignment_3 : ( ruleOperation ) ;
    public final void rule__Guard__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3344:1: ( ( ruleOperation ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3345:1: ( ruleOperation )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3345:1: ( ruleOperation )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3346:1: ruleOperation
            {
             before(grammarAccess.getGuardAccess().getOperationOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Guard__OperationAssignment_36700);
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
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3355:1: rule__GetEvent__WhoAssignment_0 : ( RULE_ID ) ;
    public final void rule__GetEvent__WhoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3359:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3360:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3360:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3361:1: RULE_ID
            {
             before(grammarAccess.getGetEventAccess().getWhoIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetEvent__WhoAssignment_06731); 
             after(grammarAccess.getGetEventAccess().getWhoIDTerminalRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start rule__GetEvent__KeywordAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3370:1: rule__GetEvent__KeywordAssignment_2 : ( RULE_ID ) ;
    public final void rule__GetEvent__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3374:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3375:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3375:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3376:1: RULE_ID
            {
             before(grammarAccess.getGetEventAccess().getKeywordIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetEvent__KeywordAssignment_26762); 
             after(grammarAccess.getGetEventAccess().getKeywordIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GetEvent__KeywordAssignment_2


    // $ANTLR start rule__IsSendEvent__KeywordAssignment_0
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3385:1: rule__IsSendEvent__KeywordAssignment_0 : ( RULE_ID ) ;
    public final void rule__IsSendEvent__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3389:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3390:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3390:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3391:1: RULE_ID
            {
             before(grammarAccess.getIsSendEventAccess().getKeywordIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IsSendEvent__KeywordAssignment_06793); 
             after(grammarAccess.getIsSendEventAccess().getKeywordIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IsSendEvent__KeywordAssignment_0


    // $ANTLR start rule__Source__DefineNameAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3400:1: rule__Source__DefineNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Source__DefineNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3404:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3405:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3405:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3406:1: RULE_ID
            {
             before(grammarAccess.getSourceAccess().getDefineNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Source__DefineNameAssignment_26824); 
             after(grammarAccess.getSourceAccess().getDefineNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Source__DefineNameAssignment_2


    // $ANTLR start rule__From__DefineNameAssignment_2
    // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3415:1: rule__From__DefineNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__From__DefineNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3419:1: ( ( RULE_ID ) )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3420:1: ( RULE_ID )
            {
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3420:1: ( RULE_ID )
            // ../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g:3421:1: RULE_ID
            {
             before(grammarAccess.getFromAccess().getDefineNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__From__DefineNameAssignment_26855); 
             after(grammarAccess.getFromAccess().getDefineNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__From__DefineNameAssignment_2


 

    public static final BitSet FOLLOW_rulePDLFile_in_entryRulePDLFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePDLFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__0_in_rulePDLFile94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__0_in_ruleDefinitions154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0_in_ruleDefine214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_entryRuleTransactions241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactions248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0_in_ruleTransactions274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0_in_ruleTransaction334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_entryRuleDecrypt481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecrypt488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__0_in_ruleDecrypt514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_entryRuleEncrypt541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncrypt548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__0_in_ruleEncrypt574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_entryRuleSend601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSend608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0_in_ruleSend634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_entryRulePrint661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrint668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0_in_rulePrint694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_entryRuleStates781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStates788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0_in_ruleStates814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_entryRuleGetEvent1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetEvent1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__0_in_ruleGetEvent1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_entryRuleIsSendEvent1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsSendEvent1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__0_in_ruleIsSendEvent1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Alternatives_in_ruleCase1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_entryRuleAlways1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlways1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAlways1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_entryRuleOtherwise1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherwise1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleOtherwise1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__0_in_ruleSource1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0_in_ruleFrom1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecrypt_in_rule__Operation__Alternatives1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncrypt_in_rule__Operation__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSend_in_rule__Operation__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrint_in_rule__Operation__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__Operation__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetEvent_in_rule__Event__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsSendEvent_in_rule__Event__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlways_in_rule__Case__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_rule__Case__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__Case__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_rule__Case__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__0__Impl_in_rule__PDLFile__Group__01684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__1_in_rule__PDLFile__Group__01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PDLFile__Group__0__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__1__Impl_in_rule__PDLFile__Group__11746 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__2_in_rule__PDLFile__Group__11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__NameAssignment_1_in_rule__PDLFile__Group__1__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__2__Impl_in_rule__PDLFile__Group__21806 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__3_in_rule__PDLFile__Group__21809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__DefinitionAssignment_2_in_rule__PDLFile__Group__2__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__3__Impl_in_rule__PDLFile__Group__31866 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__4_in_rule__PDLFile__Group__31869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__TransactionAssignment_3_in_rule__PDLFile__Group__3__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__Group__4__Impl_in_rule__PDLFile__Group__41926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PDLFile__StateAssignment_4_in_rule__PDLFile__Group__4__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__0__Impl_in_rule__Definitions__Group__01993 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1_in_rule__Definitions__Group__01996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Definitions__Group__0__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__Group__1__Impl_in_rule__Definitions__Group__12055 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2_in_rule__Definitions__Group__12058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definitions__DefinitionsAssignment_1_in_rule__Definitions__Group__1__Impl2085 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Definitions__Group__2__Impl_in_rule__Definitions__Group__22116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Definitions__Group__2__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02181 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__NameAssignment_0_in_rule__Define__Group__0__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Define__Group__2_in_rule__Define__Group__12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Define__Group__1__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__2__Impl_in_rule__Define__Group__22303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__KeywordAssignment_2_in_rule__Define__Group__2__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__02366 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__02369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transactions__Group__0__Impl2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__12428 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transactions__Group__2_in_rule__Transactions__Group__12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__TransactionsAssignment_1_in_rule__Transactions__Group__1__Impl2458 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__2__Impl_in_rule__Transactions__Group__22489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transactions__Group__2__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__02554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__02557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transaction__Group__0__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__12616 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__12619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__NameAssignment_1_in_rule__Transaction__Group__1__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__22676 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__22679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Transaction__Group__2__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__32738 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__32741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__ArgumentsAssignment_3_in_rule__Transaction__Group__3__Impl2768 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__42799 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__42802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Transaction__Group__4__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__52861 = new BitSet(new long[]{0x0000000019408010L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6_in_rule__Transaction__Group__52864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Transaction__Group__5__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__6__Impl_in_rule__Transaction__Group__62923 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__7_in_rule__Transaction__Group__62926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__OperationsAssignment_6_in_rule__Transaction__Group__6__Impl2953 = new BitSet(new long[]{0x0000000019400012L});
    public static final BitSet FOLLOW_rule__Transaction__Group__7__Impl_in_rule__Transaction__Group__72984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transaction__Group__7__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__03059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__03062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__KeywordAssignment_0_in_rule__Argument__Group__0__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__0__Impl_in_rule__Decrypt__Group__03180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__1_in_rule__Decrypt__Group__03183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Decrypt__Group__0__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__1__Impl_in_rule__Decrypt__Group__13242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__2_in_rule__Decrypt__Group__13245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__MessageAssignment_1_in_rule__Decrypt__Group__1__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__2__Impl_in_rule__Decrypt__Group__23302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__3_in_rule__Decrypt__Group__23305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Decrypt__Group__2__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__Group__3__Impl_in_rule__Decrypt__Group__33364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decrypt__ParticipantAssignment_3_in_rule__Decrypt__Group__3__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__0__Impl_in_rule__Encrypt__Group__03429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__1_in_rule__Encrypt__Group__03432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Encrypt__Group__0__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__1__Impl_in_rule__Encrypt__Group__13491 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__2_in_rule__Encrypt__Group__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__MessageAssignment_1_in_rule__Encrypt__Group__1__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__2__Impl_in_rule__Encrypt__Group__23551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__3_in_rule__Encrypt__Group__23554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Encrypt__Group__2__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__Group__3__Impl_in_rule__Encrypt__Group__33613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Encrypt__ParticipantAssignment_3_in_rule__Encrypt__Group__3__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__0__Impl_in_rule__Send__Group__03678 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Send__Group__1_in_rule__Send__Group__03681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__MessageAssignment_0_in_rule__Send__Group__0__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__1__Impl_in_rule__Send__Group__13738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Send__Group__2_in_rule__Send__Group__13741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Send__Group__1__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__2__Impl_in_rule__Send__Group__23800 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Send__Group__3_in_rule__Send__Group__23803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__SourceAssignment_2_in_rule__Send__Group__2__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__3__Impl_in_rule__Send__Group__33860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Send__Group__4_in_rule__Send__Group__33863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Send__Group__3__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__Group__4__Impl_in_rule__Send__Group__43922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Send__DestinationAssignment_4_in_rule__Send__Group__4__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__0__Impl_in_rule__Print__Group__03989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Print__Group__1_in_rule__Print__Group__03992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Print__Group__0__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__Group__1__Impl_in_rule__Print__Group__14051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Print__MessageAssignment_1_in_rule__Print__Group__1__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__04112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__04115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Call__Group__0__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__14174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__TransactionNameAssignment_1_in_rule__Call__Group__1__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__04235 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_rule__States__Group__1_in_rule__States__Group__04238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__States__Group__0__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__14297 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__States__Group__2_in_rule__States__Group__14300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__StatesAssignment_1_in_rule__States__Group__1__Impl4327 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__24358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__States__Group__2__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__04423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__04426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__State__Group__0__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__14485 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__14488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__24545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__24548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__State__Group__2__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__34607 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__34610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__EventAssignment_3_in_rule__State__Group__3__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44667 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__44670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__State__Group__4__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54729 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_rule__State__Group__6_in_rule__State__Group__54732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group__5__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__64791 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__State__Group__7_in_rule__State__Group__64794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__GuardsAssignment_6_in_rule__State__Group__6__Impl4821 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__74852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__7__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__04927 = new BitSet(new long[]{0x0000001800001800L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__04930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Guard__Group__0__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__14989 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__14992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__CasemAssignment_1_in_rule__Guard__Group__1__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__25049 = new BitSet(new long[]{0x0000000019400010L});
    public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__25052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Guard__Group__2__Impl5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__35111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__OperationAssignment_3_in_rule__Guard__Group__3__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__0__Impl_in_rule__GetEvent__Group__05176 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__1_in_rule__GetEvent__Group__05179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__WhoAssignment_0_in_rule__GetEvent__Group__0__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__1__Impl_in_rule__GetEvent__Group__15236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__2_in_rule__GetEvent__Group__15239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GetEvent__Group__1__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__Group__2__Impl_in_rule__GetEvent__Group__25298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetEvent__KeywordAssignment_2_in_rule__GetEvent__Group__2__Impl5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__0__Impl_in_rule__IsSendEvent__Group__05361 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__1_in_rule__IsSendEvent__Group__05364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__KeywordAssignment_0_in_rule__IsSendEvent__Group__0__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsSendEvent__Group__1__Impl_in_rule__IsSendEvent__Group__15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IsSendEvent__Group__1__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__0__Impl_in_rule__Source__Group__05484 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Source__Group__1_in_rule__Source__Group__05487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Source__Group__0__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__1__Impl_in_rule__Source__Group__15546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Source__Group__2_in_rule__Source__Group__15549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Source__Group__1__Impl5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Group__2__Impl_in_rule__Source__Group__25608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__DefineNameAssignment_2_in_rule__Source__Group__2__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__05671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__From__Group__1_in_rule__From__Group__05674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__From__Group__0__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__15733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__From__Group__2_in_rule__From__Group__15736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__From__Group__1__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__25795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__DefineNameAssignment_2_in_rule__From__Group__2__Impl5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PDLFile__NameAssignment_15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_rule__PDLFile__DefinitionAssignment_25894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_rule__PDLFile__TransactionAssignment_35925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_rule__PDLFile__StateAssignment_45956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_rule__Definitions__DefinitionsAssignment_15987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Define__NameAssignment_06018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Define__KeywordAssignment_26049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__Transactions__TransactionsAssignment_16080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transaction__NameAssignment_16111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Transaction__ArgumentsAssignment_36142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Transaction__OperationsAssignment_66173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__KeywordAssignment_06204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_16235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decrypt__MessageAssignment_16266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decrypt__ParticipantAssignment_36297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Encrypt__MessageAssignment_16328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Encrypt__ParticipantAssignment_36359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__MessageAssignment_06390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__SourceAssignment_26421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Send__DestinationAssignment_46452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Print__MessageAssignment_16483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Call__TransactionNameAssignment_16514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__States__StatesAssignment_16545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_16576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__State__EventAssignment_36607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__State__GuardsAssignment_66638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Guard__CasemAssignment_16669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Guard__OperationAssignment_36700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetEvent__WhoAssignment_06731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetEvent__KeywordAssignment_26762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IsSendEvent__KeywordAssignment_06793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Source__DefineNameAssignment_26824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__From__DefineNameAssignment_26855 = new BitSet(new long[]{0x0000000000000002L});

}