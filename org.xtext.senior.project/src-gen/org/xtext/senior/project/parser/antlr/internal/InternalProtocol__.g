lexer grammar InternalProtocol;
@header {
package org.xtext.senior.project.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'pdlfile' ;
T12 : '[DEFINITIONS]' ;
T13 : '[END]' ;
T14 : '=' ;
T15 : '[TRANSACTIONS]' ;
T16 : 'TRANSACTION' ;
T17 : '(' ;
T18 : ')' ;
T19 : '[BEGIN]' ;
T20 : 'decrypt' ;
T21 : 'for' ;
T22 : 'encrypt' ;
T23 : '::' ;
T24 : '->' ;
T25 : 'print' ;
T26 : 'CALL' ;
T27 : '[STATES]' ;
T28 : 'STATE' ;
T29 : '|' ;
T30 : '=>' ;
T31 : 'GET' ;
T32 : 'IS_SEND' ;
T33 : 'always' ;
T34 : 'otherwise' ;
T35 : 'source' ;
T36 : 'from' ;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1650
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1652
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1654
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1656
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1658
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1660
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.senior.project/src-gen/org/xtext/senior/project/parser/antlr/internal/InternalProtocol.g" 1662
RULE_ANY_OTHER : .;


