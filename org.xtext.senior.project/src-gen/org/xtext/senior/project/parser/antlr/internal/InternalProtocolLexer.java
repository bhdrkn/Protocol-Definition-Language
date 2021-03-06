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
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T43=43;
    public static final int Tokens=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:17:5: ( 'AsynchronousCipher' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:17:7: 'AsynchronousCipher'
            {
            match("AsynchronousCipher"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:18:5: ( 'SynchronousCipher' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:18:7: 'SynchronousCipher'
            {
            match("SynchronousCipher"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:19:5: ( 'Message' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:19:7: 'Message'
            {
            match("Message"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:20:5: ( '[TRANSACTIONS]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:20:7: '[TRANSACTIONS]'
            {
            match("[TRANSACTIONS]"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:21:5: ( 'TRANSACTION' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:21:7: 'TRANSACTION'
            {
            match("TRANSACTION"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:22:5: ( '(' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:22:7: '('
            {
            match('('); 

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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:23:5: ( ')' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:23:7: ')'
            {
            match(')'); 

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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:24:5: ( '[BEGIN]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:24:7: '[BEGIN]'
            {
            match("[BEGIN]"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:25:5: ( 'decrypt' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:25:7: 'decrypt'
            {
            match("decrypt"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:26:5: ( 'for' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:26:7: 'for'
            {
            match("for"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:27:5: ( 'encrypt' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:27:7: 'encrypt'
            {
            match("encrypt"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:28:5: ( '::' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:28:7: '::'
            {
            match("::"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:29:5: ( '->' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:29:7: '->'
            {
            match("->"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:30:5: ( 'print' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:30:7: 'print'
            {
            match("print"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:31:5: ( 'CALL' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:31:7: 'CALL'
            {
            match("CALL"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:32:5: ( 'exchange' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:32:7: 'exchange'
            {
            match("exchange"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:33:5: ( 'redirect' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:33:7: 'redirect'
            {
            match("redirect"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:34:5: ( '[STATES]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:34:7: '[STATES]'
            {
            match("[STATES]"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:35:5: ( 'STATE' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:35:7: 'STATE'
            {
            match("STATE"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:36:5: ( '|' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:36:7: '|'
            {
            match('|'); 

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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:37:5: ( '=>' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:37:7: '=>'
            {
            match("=>"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:38:5: ( 'GET' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:38:7: 'GET'
            {
            match("GET"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:39:5: ( 'SENDS' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:39:7: 'SENDS'
            {
            match("SENDS"); 


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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:40:5: ( 'IS_SEND' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:40:7: 'IS_SEND'
            {
            match("IS_SEND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:41:5: ( 'INIT' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:41:7: 'INIT'
            {
            match("INIT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:42:5: ( 'always' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:42:7: 'always'
            {
            match("always"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:43:5: ( 'otherwise' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:43:7: 'otherwise'
            {
            match("otherwise"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:44:5: ( 'to' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:44:7: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:45:5: ( 'from' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:45:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:46:5: ( '[TEST]' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:46:7: '[TEST]'
            {
            match("[TEST]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2367:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2367:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2367:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2367:11: '^'
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

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2367:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2369:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2369:12: ( '0' .. '9' )+
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2369:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2369:13: '0' .. '9'
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2371:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2371:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2373:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2373:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2373:24: ( options {greedy=false; } : . )*
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
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2373:52: .
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2375:41: '\\r'
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2377:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2379:16: ( . )
            // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:2379:18: .
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
        // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=44;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='[') ) {
            switch ( input.LA(2) ) {
            case 'B':
                {
                alt12=15;
                }
                break;
            case 'D':
                {
                alt12=4;
                }
                break;
            case 'S':
                {
                alt12=25;
                }
                break;
            case 'E':
                {
                alt12=3;
                }
                break;
            case 'T':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='E') ) {
                    alt12=37;
                }
                else if ( (LA12_37=='R') ) {
                    alt12=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 37, input);

                    throw nvae;
                }
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
                alt12=28;
            }
            else {
                alt12=5;}
        }
        else if ( (LA12_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='b') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='i') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='t') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='r') ) {
                                int LA12_139 = input.LA(7);

                                if ( (LA12_139=='a') ) {
                                    int LA12_155 = input.LA(8);

                                    if ( (LA12_155=='t') ) {
                                        int LA12_168 = input.LA(9);

                                        if ( (LA12_168=='o') ) {
                                            int LA12_180 = input.LA(10);

                                            if ( (LA12_180=='r') ) {
                                                int LA12_188 = input.LA(11);

                                                if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
                                                    alt12=38;
                                                }
                                                else {
                                                    alt12=6;}
                                            }
                                            else {
                                                alt12=38;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 's':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='y') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='n') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='c') ) {
                            int LA12_121 = input.LA(6);

                            if ( (LA12_121=='h') ) {
                                int LA12_140 = input.LA(7);

                                if ( (LA12_140=='r') ) {
                                    int LA12_156 = input.LA(8);

                                    if ( (LA12_156=='o') ) {
                                        int LA12_169 = input.LA(9);

                                        if ( (LA12_169=='n') ) {
                                            int LA12_181 = input.LA(10);

                                            if ( (LA12_181=='o') ) {
                                                int LA12_189 = input.LA(11);

                                                if ( (LA12_189=='u') ) {
                                                    int LA12_195 = input.LA(12);

                                                    if ( (LA12_195=='s') ) {
                                                        int LA12_199 = input.LA(13);

                                                        if ( (LA12_199=='C') ) {
                                                            int LA12_203 = input.LA(14);

                                                            if ( (LA12_203=='i') ) {
                                                                int LA12_205 = input.LA(15);

                                                                if ( (LA12_205=='p') ) {
                                                                    int LA12_207 = input.LA(16);

                                                                    if ( (LA12_207=='h') ) {
                                                                        int LA12_209 = input.LA(17);

                                                                        if ( (LA12_209=='e') ) {
                                                                            int LA12_211 = input.LA(18);

                                                                            if ( (LA12_211=='r') ) {
                                                                                int LA12_213 = input.LA(19);

                                                                                if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                                                                    alt12=38;
                                                                                }
                                                                                else {
                                                                                    alt12=8;}
                                                                            }
                                                                            else {
                                                                                alt12=38;}
                                                                        }
                                                                        else {
                                                                            alt12=38;}
                                                                    }
                                                                    else {
                                                                        alt12=38;}
                                                                }
                                                                else {
                                                                    alt12=38;}
                                                            }
                                                            else {
                                                                alt12=38;}
                                                        }
                                                        else {
                                                            alt12=38;}
                                                    }
                                                    else {
                                                        alt12=38;}
                                                }
                                                else {
                                                    alt12=38;}
                                            }
                                            else {
                                                alt12=38;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='P') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='a') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='r') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='t') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='i') ) {
                            int LA12_122 = input.LA(6);

                            if ( (LA12_122=='c') ) {
                                int LA12_141 = input.LA(7);

                                if ( (LA12_141=='i') ) {
                                    int LA12_157 = input.LA(8);

                                    if ( (LA12_157=='p') ) {
                                        int LA12_170 = input.LA(9);

                                        if ( (LA12_170=='a') ) {
                                            int LA12_182 = input.LA(10);

                                            if ( (LA12_182=='n') ) {
                                                int LA12_190 = input.LA(11);

                                                if ( (LA12_190=='t') ) {
                                                    int LA12_196 = input.LA(12);

                                                    if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                                                        alt12=38;
                                                    }
                                                    else {
                                                        alt12=7;}
                                                }
                                                else {
                                                    alt12=38;}
                                            }
                                            else {
                                                alt12=38;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'T':
                {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='A') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='T') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='E') ) {
                            int LA12_123 = input.LA(6);

                            if ( ((LA12_123>='0' && LA12_123<='9')||(LA12_123>='A' && LA12_123<='Z')||LA12_123=='_'||(LA12_123>='a' && LA12_123<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=26;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'y':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='n') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='c') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='h') ) {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='r') ) {
                                int LA12_143 = input.LA(7);

                                if ( (LA12_143=='o') ) {
                                    int LA12_158 = input.LA(8);

                                    if ( (LA12_158=='n') ) {
                                        int LA12_171 = input.LA(9);

                                        if ( (LA12_171=='o') ) {
                                            int LA12_183 = input.LA(10);

                                            if ( (LA12_183=='u') ) {
                                                int LA12_191 = input.LA(11);

                                                if ( (LA12_191=='s') ) {
                                                    int LA12_197 = input.LA(12);

                                                    if ( (LA12_197=='C') ) {
                                                        int LA12_201 = input.LA(13);

                                                        if ( (LA12_201=='i') ) {
                                                            int LA12_204 = input.LA(14);

                                                            if ( (LA12_204=='p') ) {
                                                                int LA12_206 = input.LA(15);

                                                                if ( (LA12_206=='h') ) {
                                                                    int LA12_208 = input.LA(16);

                                                                    if ( (LA12_208=='e') ) {
                                                                        int LA12_210 = input.LA(17);

                                                                        if ( (LA12_210=='r') ) {
                                                                            int LA12_212 = input.LA(18);

                                                                            if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
                                                                                alt12=38;
                                                                            }
                                                                            else {
                                                                                alt12=9;}
                                                                        }
                                                                        else {
                                                                            alt12=38;}
                                                                    }
                                                                    else {
                                                                        alt12=38;}
                                                                }
                                                                else {
                                                                    alt12=38;}
                                                            }
                                                            else {
                                                                alt12=38;}
                                                        }
                                                        else {
                                                            alt12=38;}
                                                    }
                                                    else {
                                                        alt12=38;}
                                                }
                                                else {
                                                    alt12=38;}
                                            }
                                            else {
                                                alt12=38;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'E':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='N') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='D') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='S') ) {
                            int LA12_125 = input.LA(6);

                            if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='M') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='e') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='s') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='s') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='a') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='g') ) {
                                int LA12_145 = input.LA(7);

                                if ( (LA12_145=='e') ) {
                                    int LA12_159 = input.LA(8);

                                    if ( ((LA12_159>='0' && LA12_159<='9')||(LA12_159>='A' && LA12_159<='Z')||LA12_159=='_'||(LA12_159>='a' && LA12_159<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='T') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='R') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='A') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='N') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='S') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='A') ) {
                                int LA12_146 = input.LA(7);

                                if ( (LA12_146=='C') ) {
                                    int LA12_160 = input.LA(8);

                                    if ( (LA12_160=='T') ) {
                                        int LA12_173 = input.LA(9);

                                        if ( (LA12_173=='I') ) {
                                            int LA12_184 = input.LA(10);

                                            if ( (LA12_184=='O') ) {
                                                int LA12_192 = input.LA(11);

                                                if ( (LA12_192=='N') ) {
                                                    int LA12_198 = input.LA(12);

                                                    if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
                                                        alt12=38;
                                                    }
                                                    else {
                                                        alt12=12;}
                                                }
                                                else {
                                                    alt12=38;}
                                            }
                                            else {
                                                alt12=38;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=13;
        }
        else if ( (LA12_0==')') ) {
            alt12=14;
        }
        else if ( (LA12_0=='d') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='e') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='c') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='r') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='y') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='p') ) {
                                int LA12_147 = input.LA(7);

                                if ( (LA12_147=='t') ) {
                                    int LA12_161 = input.LA(8);

                                    if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='r') ) {
                    int LA12_86 = input.LA(4);

                    if ( ((LA12_86>='0' && LA12_86<='9')||(LA12_86>='A' && LA12_86<='Z')||LA12_86=='_'||(LA12_86>='a' && LA12_86<='z')) ) {
                        alt12=38;
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'r':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='o') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='m') ) {
                        int LA12_109 = input.LA(5);

                        if ( ((LA12_109>='0' && LA12_109<='9')||(LA12_109>='A' && LA12_109<='Z')||LA12_109=='_'||(LA12_109>='a' && LA12_109<='z')) ) {
                            alt12=38;
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='c') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='r') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='y') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='p') ) {
                                int LA12_148 = input.LA(7);

                                if ( (LA12_148=='t') ) {
                                    int LA12_162 = input.LA(8);

                                    if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'x':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='c') ) {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='h') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='a') ) {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='n') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='g') ) {
                                    int LA12_163 = input.LA(8);

                                    if ( (LA12_163=='e') ) {
                                        int LA12_176 = input.LA(9);

                                        if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
                                            alt12=23;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0==':') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14==':') ) {
                alt12=19;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='-') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='>') ) {
                alt12=20;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='p') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='r') ) {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='i') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='n') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='t') ) {
                            int LA12_132 = input.LA(6);

                            if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=21;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='A') ) {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='L') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='L') ) {
                        int LA12_113 = input.LA(5);

                        if ( ((LA12_113>='0' && LA12_113<='9')||(LA12_113>='A' && LA12_113<='Z')||LA12_113=='_'||(LA12_113>='a' && LA12_113<='z')) ) {
                            alt12=38;
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='e') ) {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='d') ) {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='i') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='r') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='e') ) {
                                int LA12_151 = input.LA(7);

                                if ( (LA12_151=='c') ) {
                                    int LA12_164 = input.LA(8);

                                    if ( (LA12_164=='t') ) {
                                        int LA12_177 = input.LA(9);

                                        if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='|') ) {
            alt12=27;
        }
        else if ( (LA12_0=='G') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='E') ) {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='T') ) {
                    int LA12_93 = input.LA(4);

                    if ( ((LA12_93>='0' && LA12_93<='9')||(LA12_93>='A' && LA12_93<='Z')||LA12_93=='_'||(LA12_93>='a' && LA12_93<='z')) ) {
                        alt12=38;
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA12_65 = input.LA(3);

                if ( (LA12_65=='I') ) {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='T') ) {
                        int LA12_116 = input.LA(5);

                        if ( ((LA12_116>='0' && LA12_116<='9')||(LA12_116>='A' && LA12_116<='Z')||LA12_116=='_'||(LA12_116>='a' && LA12_116<='z')) ) {
                            alt12=38;
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'S':
                {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='_') ) {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='S') ) {
                        int LA12_117 = input.LA(5);

                        if ( (LA12_117=='E') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='N') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='D') ) {
                                    int LA12_165 = input.LA(8);

                                    if ( ((LA12_165>='0' && LA12_165<='9')||(LA12_165>='A' && LA12_165<='Z')||LA12_165=='_'||(LA12_165>='a' && LA12_165<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=31;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='a') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='l') ) {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='w') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='a') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='y') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='s') ) {
                                int LA12_153 = input.LA(7);

                                if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                                    alt12=38;
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='t') ) {
                int LA12_68 = input.LA(3);

                if ( (LA12_68=='h') ) {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='e') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='r') ) {
                            int LA12_138 = input.LA(6);

                            if ( (LA12_138=='w') ) {
                                int LA12_154 = input.LA(7);

                                if ( (LA12_154=='i') ) {
                                    int LA12_167 = input.LA(8);

                                    if ( (LA12_167=='s') ) {
                                        int LA12_179 = input.LA(9);

                                        if ( (LA12_179=='e') ) {
                                            int LA12_187 = input.LA(10);

                                            if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=34;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='o') ) {
                int LA12_69 = input.LA(3);

                if ( ((LA12_69>='0' && LA12_69<='9')||(LA12_69>='A' && LA12_69<='Z')||LA12_69=='_'||(LA12_69>='a' && LA12_69<='z')) ) {
                    alt12=38;
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='A' && LA12_25<='Z')||LA12_25=='_'||(LA12_25>='a' && LA12_25<='z')) ) {
                alt12=38;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='B'||(LA12_0>='D' && LA12_0<='F')||LA12_0=='H'||(LA12_0>='J' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||(LA12_0>='g' && LA12_0<='n')||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=38;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=39;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_28 = input.LA(2);

            if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFE')) ) {
                alt12=40;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_29 = input.LA(2);

            if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFE')) ) {
                alt12=40;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=42;
                }
                break;
            case '*':
                {
                alt12=41;
                }
                break;
            default:
                alt12=44;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=43;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFE')) ) {
            alt12=44;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

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
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}