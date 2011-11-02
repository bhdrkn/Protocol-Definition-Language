package org.xtext.senior.project.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProtocolLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=42;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T41=41;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T39=39;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalProtocolLexer() {;} 
    public InternalProtocolLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:10:5: ( '[' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:10:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:11:5: ( ']' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:11:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:12:5: ( '[END]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:12:7: '[END]'
            {
            match("[END]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:13:5: ( '[DEFINITIONS]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:13:7: '[DEFINITIONS]'
            {
            match("[DEFINITIONS]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:14:5: ( '=' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:14:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:15:5: ( 'Arbitrator' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:15:7: 'Arbitrator'
            {
            match("Arbitrator"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:16:5: ( 'Participant' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:16:7: 'Participant'
            {
            match("Participant"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:17:5: ( '[TRANSACTIONS]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:17:7: '[TRANSACTIONS]'
            {
            match("[TRANSACTIONS]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:18:5: ( 'TRANSACTION' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:18:7: 'TRANSACTION'
            {
            match("TRANSACTION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:19:5: ( '(' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:19:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:20:5: ( ')' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:20:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:21:5: ( '[BEGIN]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:21:7: '[BEGIN]'
            {
            match("[BEGIN]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:22:5: ( 'decrypt' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:22:7: 'decrypt'
            {
            match("decrypt"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:23:5: ( 'for' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:23:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:24:5: ( 'encrypt' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:24:7: 'encrypt'
            {
            match("encrypt"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:25:5: ( '::' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:25:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:26:5: ( '->' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:26:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:27:5: ( 'print' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:27:7: 'print'
            {
            match("print"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:28:5: ( 'CALL' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:28:7: 'CALL'
            {
            match("CALL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:29:5: ( 'exchange' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:29:7: 'exchange'
            {
            match("exchange"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:30:5: ( '[STATES]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:30:7: '[STATES]'
            {
            match("[STATES]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:31:5: ( 'STATE' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:31:7: 'STATE'
            {
            match("STATE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:32:5: ( '|' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:32:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:33:5: ( '=>' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:33:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:34:5: ( 'GET' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:34:7: 'GET'
            {
            match("GET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:35:5: ( 'IS_SEND' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:35:7: 'IS_SEND'
            {
            match("IS_SEND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:36:5: ( 'INIT' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:36:7: 'INIT'
            {
            match("INIT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:37:5: ( 'always' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:37:7: 'always'
            {
            match("always"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:38:5: ( 'otherwise' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:38:7: 'otherwise'
            {
            match("otherwise"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:39:5: ( 'source' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:39:7: 'source'
            {
            match("source"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:40:5: ( 'from' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:40:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1975:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1975:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1975:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1975:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1975:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1977:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1977:12: ( '0' .. '9' )+
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1977:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1977:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1979:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1979:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1981:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1981:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1981:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1981:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1983:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1985:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1985:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1985:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1987:16: ( . )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1987:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='[') ) {
            switch ( input.LA(2) ) {
            case 'T':
                {
                alt12=8;
                }
                break;
            case 'D':
                {
                alt12=4;
                }
                break;
            case 'B':
                {
                alt12=12;
                }
                break;
            case 'S':
                {
                alt12=21;
                }
                break;
            case 'E':
                {
                alt12=3;
                }
                break;
            default:
                alt12=1;}

        }
        else if ( (LA12_0==']') ) {
            alt12=2;
        }
        else if ( (LA12_0=='=') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='>') ) {
                alt12=24;
            }
            else {
                alt12=5;}
        }
        else if ( (LA12_0=='A') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='r') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='b') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='i') ) {
                        int LA12_85 = input.LA(5);

                        if ( (LA12_85=='t') ) {
                            int LA12_102 = input.LA(6);

                            if ( (LA12_102=='r') ) {
                                int LA12_117 = input.LA(7);

                                if ( (LA12_117=='a') ) {
                                    int LA12_129 = input.LA(8);

                                    if ( (LA12_129=='t') ) {
                                        int LA12_139 = input.LA(9);

                                        if ( (LA12_139=='o') ) {
                                            int LA12_147 = input.LA(10);

                                            if ( (LA12_147=='r') ) {
                                                int LA12_152 = input.LA(11);

                                                if ( ((LA12_152>='0' && LA12_152<='9')||(LA12_152>='A' && LA12_152<='Z')||LA12_152=='_'||(LA12_152>='a' && LA12_152<='z')) ) {
                                                    alt12=32;
                                                }
                                                else {
                                                    alt12=6;}
                                            }
                                            else {
                                                alt12=32;}
                                        }
                                        else {
                                            alt12=32;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='P') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='a') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='r') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='t') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='i') ) {
                            int LA12_103 = input.LA(6);

                            if ( (LA12_103=='c') ) {
                                int LA12_118 = input.LA(7);

                                if ( (LA12_118=='i') ) {
                                    int LA12_130 = input.LA(8);

                                    if ( (LA12_130=='p') ) {
                                        int LA12_140 = input.LA(9);

                                        if ( (LA12_140=='a') ) {
                                            int LA12_148 = input.LA(10);

                                            if ( (LA12_148=='n') ) {
                                                int LA12_153 = input.LA(11);

                                                if ( (LA12_153=='t') ) {
                                                    int LA12_157 = input.LA(12);

                                                    if ( ((LA12_157>='0' && LA12_157<='9')||(LA12_157>='A' && LA12_157<='Z')||LA12_157=='_'||(LA12_157>='a' && LA12_157<='z')) ) {
                                                        alt12=32;
                                                    }
                                                    else {
                                                        alt12=7;}
                                                }
                                                else {
                                                    alt12=32;}
                                            }
                                            else {
                                                alt12=32;}
                                        }
                                        else {
                                            alt12=32;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='T') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='R') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='A') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='N') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='S') ) {
                            int LA12_104 = input.LA(6);

                            if ( (LA12_104=='A') ) {
                                int LA12_119 = input.LA(7);

                                if ( (LA12_119=='C') ) {
                                    int LA12_131 = input.LA(8);

                                    if ( (LA12_131=='T') ) {
                                        int LA12_141 = input.LA(9);

                                        if ( (LA12_141=='I') ) {
                                            int LA12_149 = input.LA(10);

                                            if ( (LA12_149=='O') ) {
                                                int LA12_154 = input.LA(11);

                                                if ( (LA12_154=='N') ) {
                                                    int LA12_158 = input.LA(12);

                                                    if ( ((LA12_158>='0' && LA12_158<='9')||(LA12_158>='A' && LA12_158<='Z')||LA12_158=='_'||(LA12_158>='a' && LA12_158<='z')) ) {
                                                        alt12=32;
                                                    }
                                                    else {
                                                        alt12=9;}
                                                }
                                                else {
                                                    alt12=32;}
                                            }
                                            else {
                                                alt12=32;}
                                        }
                                        else {
                                            alt12=32;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=10;
        }
        else if ( (LA12_0==')') ) {
            alt12=11;
        }
        else if ( (LA12_0=='d') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='e') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='c') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='r') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='y') ) {
                            int LA12_105 = input.LA(6);

                            if ( (LA12_105=='p') ) {
                                int LA12_120 = input.LA(7);

                                if ( (LA12_120=='t') ) {
                                    int LA12_132 = input.LA(8);

                                    if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                                        alt12=32;
                                    }
                                    else {
                                        alt12=13;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='o') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='m') ) {
                        int LA12_89 = input.LA(5);

                        if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=31;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            case 'o':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='r') ) {
                    int LA12_73 = input.LA(4);

                    if ( ((LA12_73>='0' && LA12_73<='9')||(LA12_73>='A' && LA12_73<='Z')||LA12_73=='_'||(LA12_73>='a' && LA12_73<='z')) ) {
                        alt12=32;
                    }
                    else {
                        alt12=14;}
                }
                else {
                    alt12=32;}
                }
                break;
            default:
                alt12=32;}

        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='c') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='h') ) {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='a') ) {
                            int LA12_107 = input.LA(6);

                            if ( (LA12_107=='n') ) {
                                int LA12_121 = input.LA(7);

                                if ( (LA12_121=='g') ) {
                                    int LA12_133 = input.LA(8);

                                    if ( (LA12_133=='e') ) {
                                        int LA12_143 = input.LA(9);

                                        if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                                            alt12=32;
                                        }
                                        else {
                                            alt12=20;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            case 'n':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='c') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='r') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='y') ) {
                            int LA12_108 = input.LA(6);

                            if ( (LA12_108=='p') ) {
                                int LA12_122 = input.LA(7);

                                if ( (LA12_122=='t') ) {
                                    int LA12_134 = input.LA(8);

                                    if ( ((LA12_134>='0' && LA12_134<='9')||(LA12_134>='A' && LA12_134<='Z')||LA12_134=='_'||(LA12_134>='a' && LA12_134<='z')) ) {
                                        alt12=32;
                                    }
                                    else {
                                        alt12=15;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            default:
                alt12=32;}

        }
        else if ( (LA12_0==':') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12==':') ) {
                alt12=16;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='-') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='>') ) {
                alt12=17;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='p') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='r') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='i') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='n') ) {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='t') ) {
                            int LA12_109 = input.LA(6);

                            if ( ((LA12_109>='0' && LA12_109<='9')||(LA12_109>='A' && LA12_109<='Z')||LA12_109=='_'||(LA12_109>='a' && LA12_109<='z')) ) {
                                alt12=32;
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='A') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='L') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='L') ) {
                        int LA12_94 = input.LA(5);

                        if ( ((LA12_94>='0' && LA12_94<='9')||(LA12_94>='A' && LA12_94<='Z')||LA12_94=='_'||(LA12_94>='a' && LA12_94<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='S') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='T') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='A') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='T') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='E') ) {
                            int LA12_111 = input.LA(6);

                            if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                                alt12=32;
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='|') ) {
            alt12=23;
        }
        else if ( (LA12_0=='G') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='E') ) {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='T') ) {
                    int LA12_79 = input.LA(4);

                    if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                        alt12=32;
                    }
                    else {
                        alt12=25;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='I') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='T') ) {
                        int LA12_97 = input.LA(5);

                        if ( ((LA12_97>='0' && LA12_97<='9')||(LA12_97>='A' && LA12_97<='Z')||LA12_97=='_'||(LA12_97>='a' && LA12_97<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            case 'S':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='_') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='S') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='E') ) {
                            int LA12_113 = input.LA(6);

                            if ( (LA12_113=='N') ) {
                                int LA12_125 = input.LA(7);

                                if ( (LA12_125=='D') ) {
                                    int LA12_135 = input.LA(8);

                                    if ( ((LA12_135>='0' && LA12_135<='9')||(LA12_135>='A' && LA12_135<='Z')||LA12_135=='_'||(LA12_135>='a' && LA12_135<='z')) ) {
                                        alt12=32;
                                    }
                                    else {
                                        alt12=26;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            default:
                alt12=32;}

        }
        else if ( (LA12_0=='a') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='l') ) {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='w') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='a') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='y') ) {
                            int LA12_114 = input.LA(6);

                            if ( (LA12_114=='s') ) {
                                int LA12_126 = input.LA(7);

                                if ( ((LA12_126>='0' && LA12_126<='9')||(LA12_126>='A' && LA12_126<='Z')||LA12_126=='_'||(LA12_126>='a' && LA12_126<='z')) ) {
                                    alt12=32;
                                }
                                else {
                                    alt12=28;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='t') ) {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='h') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='e') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='r') ) {
                            int LA12_115 = input.LA(6);

                            if ( (LA12_115=='w') ) {
                                int LA12_127 = input.LA(7);

                                if ( (LA12_127=='i') ) {
                                    int LA12_137 = input.LA(8);

                                    if ( (LA12_137=='s') ) {
                                        int LA12_146 = input.LA(9);

                                        if ( (LA12_146=='e') ) {
                                            int LA12_151 = input.LA(10);

                                            if ( ((LA12_151>='0' && LA12_151<='9')||(LA12_151>='A' && LA12_151<='Z')||LA12_151=='_'||(LA12_151>='a' && LA12_151<='z')) ) {
                                                alt12=32;
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=32;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='o') ) {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='u') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='r') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='c') ) {
                            int LA12_116 = input.LA(6);

                            if ( (LA12_116=='e') ) {
                                int LA12_128 = input.LA(7);

                                if ( ((LA12_128>='0' && LA12_128<='9')||(LA12_128>='A' && LA12_128<='Z')||LA12_128=='_'||(LA12_128>='a' && LA12_128<='z')) ) {
                                    alt12=32;
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='A' && LA12_23<='Z')||LA12_23=='_'||(LA12_23>='a' && LA12_23<='z')) ) {
                alt12=32;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='B'||(LA12_0>='D' && LA12_0<='F')||LA12_0=='H'||(LA12_0>='J' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||(LA12_0>='g' && LA12_0<='n')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {
            alt12=32;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=33;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=34;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFE')) ) {
                alt12=34;
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=35;
                }
                break;
            case '/':
                {
                alt12=36;
                }
                break;
            default:
                alt12=38;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=37;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFE')) ) {
            alt12=38;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:134: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:151: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:163: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:179: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:195: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:203: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}