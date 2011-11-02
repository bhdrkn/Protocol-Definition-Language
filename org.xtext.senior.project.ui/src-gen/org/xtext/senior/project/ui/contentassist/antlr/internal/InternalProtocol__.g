lexer grammar InternalProtocol;
@header {
package org.xtext.senior.project.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '[' ;
T12 : ']' ;
T13 : '[END]' ;
T14 : '[DEFINITIONS]' ;
T15 : '=' ;
T16 : '[TRANSACTIONS]' ;
T17 : 'TRANSACTION' ;
T18 : '(' ;
T19 : ')' ;
T20 : '[BEGIN]' ;
T21 : 'decrypt' ;
T22 : 'for' ;
T23 : 'encrypt' ;
T24 : '::' ;
T25 : '->' ;
T26 : 'print' ;
T27 : 'CALL' ;
T28 : 'exchange' ;
T29 : '[STATES]' ;
T30 : 'STATE' ;
T31 : '|' ;
T32 : '=>' ;
T33 : 'GET' ;
T34 : 'IS_SEND' ;
T35 : 'Arbitrator' ;
T36 : 'Participant' ;
T37 : 'INIT' ;
T38 : 'always' ;
T39 : 'otherwise' ;
T40 : 'source' ;
T41 : 'from' ;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 4255
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 4257
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 4259
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 4261
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 4263
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 4265
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 4267
RULE_ANY_OTHER : .;


