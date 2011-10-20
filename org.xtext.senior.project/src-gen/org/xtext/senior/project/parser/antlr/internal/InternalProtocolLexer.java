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
    public static final int Tokens=37;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:10:5: ( 'pdlfile' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:10:7: 'pdlfile'
            {
            match("pdlfile"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:11:5: ( '[DEFINITIONS]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:11:7: '[DEFINITIONS]'
            {
            match("[DEFINITIONS]"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:13:5: ( '=' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:13:7: '='
            {
            match('='); 

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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:14:5: ( '[TRANSACTIONS]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:14:7: '[TRANSACTIONS]'
            {
            match("[TRANSACTIONS]"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:15:5: ( 'TRANSACTION' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:15:7: 'TRANSACTION'
            {
            match("TRANSACTION"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:16:5: ( '(' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:16:7: '('
            {
            match('('); 

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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:17:5: ( ')' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:17:7: ')'
            {
            match(')'); 

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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:18:5: ( '[BEGIN]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:18:7: '[BEGIN]'
            {
            match("[BEGIN]"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:19:5: ( 'decrypt' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:19:7: 'decrypt'
            {
            match("decrypt"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:20:5: ( 'for' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:20:7: 'for'
            {
            match("for"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:21:5: ( 'encrypt' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:21:7: 'encrypt'
            {
            match("encrypt"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:22:5: ( '::' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:22:7: '::'
            {
            match("::"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:23:5: ( '->' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:23:7: '->'
            {
            match("->"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:24:5: ( 'print' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:24:7: 'print'
            {
            match("print"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:25:5: ( 'CALL' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:25:7: 'CALL'
            {
            match("CALL"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:26:5: ( '[STATES]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:26:7: '[STATES]'
            {
            match("[STATES]"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:27:5: ( 'STATE' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:27:7: 'STATE'
            {
            match("STATE"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:28:5: ( '|' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:28:7: '|'
            {
            match('|'); 

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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:29:5: ( '=>' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:29:7: '=>'
            {
            match("=>"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:30:5: ( 'GET' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:30:7: 'GET'
            {
            match("GET"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:31:5: ( 'IS_SEND' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:31:7: 'IS_SEND'
            {
            match("IS_SEND"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:32:5: ( 'always' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:32:7: 'always'
            {
            match("always"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:33:5: ( 'otherwise' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:33:7: 'otherwise'
            {
            match("otherwise"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:34:5: ( 'source' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:34:7: 'source'
            {
            match("source"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:35:5: ( 'from' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:35:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1650:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1650:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1650:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1650:11: '^'
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

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1650:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1652:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1652:12: ( '0' .. '9' )+
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1652:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1652:13: '0' .. '9'
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1654:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1654:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1656:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1656:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1656:24: ( options {greedy=false; } : . )*
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
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1656:52: .
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1658:41: '\\r'
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1660:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1660:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1660:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1662:16: ( . )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1662:18: .
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
        // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=33;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='i') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='n') ) {
                        int LA12_74 = input.LA(5);

                        if ( (LA12_74=='t') ) {
                            int LA12_88 = input.LA(6);

                            if ( ((LA12_88>='0' && LA12_88<='9')||(LA12_88>='A' && LA12_88<='Z')||LA12_88=='_'||(LA12_88>='a' && LA12_88<='z')) ) {
                                alt12=27;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            case 'd':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='l') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='f') ) {
                        int LA12_75 = input.LA(5);

                        if ( (LA12_75=='i') ) {
                            int LA12_89 = input.LA(6);

                            if ( (LA12_89=='l') ) {
                                int LA12_101 = input.LA(7);

                                if ( (LA12_101=='e') ) {
                                    int LA12_110 = input.LA(8);

                                    if ( ((LA12_110>='0' && LA12_110<='9')||(LA12_110>='A' && LA12_110<='Z')||LA12_110=='_'||(LA12_110>='a' && LA12_110<='z')) ) {
                                        alt12=27;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            default:
                alt12=27;}

        }
        else if ( (LA12_0=='[') ) {
            switch ( input.LA(2) ) {
            case 'B':
                {
                alt12=9;
                }
                break;
            case 'S':
                {
                alt12=17;
                }
                break;
            case 'E':
                {
                alt12=3;
                }
                break;
            case 'D':
                {
                alt12=2;
                }
                break;
            case 'T':
                {
                alt12=5;
                }
                break;
            default:
                alt12=33;}

        }
        else if ( (LA12_0=='=') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='>') ) {
                alt12=20;
            }
            else {
                alt12=4;}
        }
        else if ( (LA12_0=='T') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='R') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='A') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='N') ) {
                        int LA12_76 = input.LA(5);

                        if ( (LA12_76=='S') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='A') ) {
                                int LA12_102 = input.LA(7);

                                if ( (LA12_102=='C') ) {
                                    int LA12_111 = input.LA(8);

                                    if ( (LA12_111=='T') ) {
                                        int LA12_119 = input.LA(9);

                                        if ( (LA12_119=='I') ) {
                                            int LA12_124 = input.LA(10);

                                            if ( (LA12_124=='O') ) {
                                                int LA12_126 = input.LA(11);

                                                if ( (LA12_126=='N') ) {
                                                    int LA12_128 = input.LA(12);

                                                    if ( ((LA12_128>='0' && LA12_128<='9')||(LA12_128>='A' && LA12_128<='Z')||LA12_128=='_'||(LA12_128>='a' && LA12_128<='z')) ) {
                                                        alt12=27;
                                                    }
                                                    else {
                                                        alt12=6;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=7;
        }
        else if ( (LA12_0==')') ) {
            alt12=8;
        }
        else if ( (LA12_0=='d') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='e') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='c') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='r') ) {
                        int LA12_77 = input.LA(5);

                        if ( (LA12_77=='y') ) {
                            int LA12_91 = input.LA(6);

                            if ( (LA12_91=='p') ) {
                                int LA12_103 = input.LA(7);

                                if ( (LA12_103=='t') ) {
                                    int LA12_112 = input.LA(8);

                                    if ( ((LA12_112>='0' && LA12_112<='9')||(LA12_112>='A' && LA12_112<='Z')||LA12_112=='_'||(LA12_112>='a' && LA12_112<='z')) ) {
                                        alt12=27;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='r') ) {
                    int LA12_64 = input.LA(4);

                    if ( ((LA12_64>='0' && LA12_64<='9')||(LA12_64>='A' && LA12_64<='Z')||LA12_64=='_'||(LA12_64>='a' && LA12_64<='z')) ) {
                        alt12=27;
                    }
                    else {
                        alt12=11;}
                }
                else {
                    alt12=27;}
                }
                break;
            case 'r':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='o') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='m') ) {
                        int LA12_79 = input.LA(5);

                        if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                            alt12=27;
                        }
                        else {
                            alt12=26;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            default:
                alt12=27;}

        }
        else if ( (LA12_0=='e') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='n') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='c') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='r') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='y') ) {
                            int LA12_93 = input.LA(6);

                            if ( (LA12_93=='p') ) {
                                int LA12_104 = input.LA(7);

                                if ( (LA12_104=='t') ) {
                                    int LA12_113 = input.LA(8);

                                    if ( ((LA12_113>='0' && LA12_113<='9')||(LA12_113>='A' && LA12_113<='Z')||LA12_113=='_'||(LA12_113>='a' && LA12_113<='z')) ) {
                                        alt12=27;
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0==':') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10==':') ) {
                alt12=13;
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='-') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='>') ) {
                alt12=14;
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='A') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='L') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='L') ) {
                        int LA12_81 = input.LA(5);

                        if ( ((LA12_81>='0' && LA12_81<='9')||(LA12_81>='A' && LA12_81<='Z')||LA12_81=='_'||(LA12_81>='a' && LA12_81<='z')) ) {
                            alt12=27;
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='S') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='T') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='A') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='T') ) {
                        int LA12_82 = input.LA(5);

                        if ( (LA12_82=='E') ) {
                            int LA12_95 = input.LA(6);

                            if ( ((LA12_95>='0' && LA12_95<='9')||(LA12_95>='A' && LA12_95<='Z')||LA12_95=='_'||(LA12_95>='a' && LA12_95<='z')) ) {
                                alt12=27;
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='|') ) {
            alt12=19;
        }
        else if ( (LA12_0=='G') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='E') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='T') ) {
                    int LA12_69 = input.LA(4);

                    if ( ((LA12_69>='0' && LA12_69<='9')||(LA12_69>='A' && LA12_69<='Z')||LA12_69=='_'||(LA12_69>='a' && LA12_69<='z')) ) {
                        alt12=27;
                    }
                    else {
                        alt12=21;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='I') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='S') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='_') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='S') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='E') ) {
                            int LA12_96 = input.LA(6);

                            if ( (LA12_96=='N') ) {
                                int LA12_106 = input.LA(7);

                                if ( (LA12_106=='D') ) {
                                    int LA12_114 = input.LA(8);

                                    if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                                        alt12=27;
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='a') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='l') ) {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='w') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='a') ) {
                        int LA12_85 = input.LA(5);

                        if ( (LA12_85=='y') ) {
                            int LA12_97 = input.LA(6);

                            if ( (LA12_97=='s') ) {
                                int LA12_107 = input.LA(7);

                                if ( ((LA12_107>='0' && LA12_107<='9')||(LA12_107>='A' && LA12_107<='Z')||LA12_107=='_'||(LA12_107>='a' && LA12_107<='z')) ) {
                                    alt12=27;
                                }
                                else {
                                    alt12=23;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='t') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='h') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='e') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='r') ) {
                            int LA12_98 = input.LA(6);

                            if ( (LA12_98=='w') ) {
                                int LA12_108 = input.LA(7);

                                if ( (LA12_108=='i') ) {
                                    int LA12_116 = input.LA(8);

                                    if ( (LA12_116=='s') ) {
                                        int LA12_123 = input.LA(9);

                                        if ( (LA12_123=='e') ) {
                                            int LA12_125 = input.LA(10);

                                            if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                                                alt12=27;
                                            }
                                            else {
                                                alt12=24;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='o') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='u') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='r') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='c') ) {
                            int LA12_99 = input.LA(6);

                            if ( (LA12_99=='e') ) {
                                int LA12_109 = input.LA(7);

                                if ( ((LA12_109>='0' && LA12_109<='9')||(LA12_109>='A' && LA12_109<='Z')||LA12_109=='_'||(LA12_109>='a' && LA12_109<='z')) ) {
                                    alt12=27;
                                }
                                else {
                                    alt12=25;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='A' && LA12_20<='Z')||LA12_20=='_'||(LA12_20>='a' && LA12_20<='z')) ) {
                alt12=27;
            }
            else {
                alt12=33;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='F')||LA12_0=='H'||(LA12_0>='J' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||(LA12_0>='g' && LA12_0<='n')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {
            alt12=27;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=28;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFE')) ) {
                alt12=29;
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
                alt12=29;
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=31;
                }
                break;
            case '*':
                {
                alt12=30;
                }
                break;
            default:
                alt12=33;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=32;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='\\' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFE')) ) {
            alt12=33;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

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
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:122: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:131: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:183: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}