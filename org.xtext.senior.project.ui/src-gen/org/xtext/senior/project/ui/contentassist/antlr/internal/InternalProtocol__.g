lexer grammar InternalProtocol;
@header {
package org.xtext.senior.project.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'AsynchronousCipher' ;
T12 : 'SynchronousCipher' ;
T13 : 'Arbitrator' ;
T14 : 'Participant' ;
T15 : 'Message' ;
T16 : '[' ;
T17 : ']' ;
T18 : '[END]' ;
T19 : '[DEFINITIONS]' ;
T20 : '=' ;
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
T42 : '[TEST]' ;
T43 : 'INIT' ;
T44 : 'always' ;
T45 : 'otherwise' ;
T46 : 'to' ;
T47 : 'from' ;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 5203
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 5205
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 5207
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 5209
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 5211
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 5213
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 5215
RULE_ANY_OTHER : .;


