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
T18 : '[TRANSACTIONS]' ;
T19 : 'TRANSACTION' ;
T20 : '(' ;
T21 : ')' ;
T22 : '[BEGIN]' ;
T23 : 'decrypt' ;
T24 : 'for' ;
T25 : 'encrypt' ;
T26 : '::' ;
T27 : '->' ;
T28 : 'print' ;
T29 : 'CALL' ;
T30 : 'exchange' ;
T31 : '[STATES]' ;
T32 : 'STATE' ;
T33 : '|' ;
T34 : '=>' ;
T35 : 'GET' ;
T36 : 'IS_SEND' ;
T37 : 'INIT' ;
T38 : 'always' ;
T39 : 'otherwise' ;
T40 : 'source' ;
T41 : 'from' ;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1975
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1977
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1979
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1981
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1983
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1985
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1987
RULE_ANY_OTHER : .;


