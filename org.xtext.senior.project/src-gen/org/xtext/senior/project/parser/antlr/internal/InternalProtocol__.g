lexer grammar InternalProtocol;
@header {
package org.xtext.senior.project.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[' ;
T12 : ']' ;
T13 : '[END]' ;
T14 : '[DEFINITIONS]' ;
T15 : '=' ;
T16 : 'Arbitrator' ;
T17 : 'Participant' ;
T18 : 'AsynchronousCipher' ;
T19 : 'SynchronousCipher' ;
T20 : 'Message' ;
T21 : '[TRANSACTIONS]' ;
T22 : 'TRANSACTION' ;
T23 : '(' ;
T24 : ')' ;
T25 : '[BEGIN]' ;
T26 : 'decrypt' ;
T27 : 'for' ;
T28 : 'encrypt' ;
T29 : '::' ;
T30 : '->' ;
T31 : 'print' ;
T32 : 'CALL' ;
T33 : 'exchange' ;
T34 : 'redirect' ;
T35 : '[STATES]' ;
T36 : 'STATE' ;
T37 : '|' ;
T38 : '=>' ;
T39 : 'GET' ;
T40 : 'SENDS' ;
T41 : 'IS_SEND' ;
T42 : 'INIT' ;
T43 : 'always' ;
T44 : 'otherwise' ;
T45 : 'to' ;
T46 : 'from' ;
T47 : '[TEST]' ;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 2367
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 2369
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 2371
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 2373
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 2375
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 2377
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 2379
RULE_ANY_OTHER : .;


