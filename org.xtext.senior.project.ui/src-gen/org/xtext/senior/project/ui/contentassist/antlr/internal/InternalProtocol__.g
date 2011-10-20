lexer grammar InternalProtocol;
@header {
package org.xtext.senior.project.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'always' ;
T12 : 'otherwise' ;
T13 : 'pdlfile' ;
T14 : '[DEFINITIONS]' ;
T15 : '[END]' ;
T16 : '=' ;
T17 : '[TRANSACTIONS]' ;
T18 : 'TRANSACTION' ;
T19 : '(' ;
T20 : ')' ;
T21 : '[BEGIN]' ;
T22 : 'decrypt' ;
T23 : 'for' ;
T24 : 'encrypt' ;
T25 : '::' ;
T26 : '->' ;
T27 : 'print' ;
T28 : 'CALL' ;
T29 : '[STATES]' ;
T30 : 'STATE' ;
T31 : '|' ;
T32 : '=>' ;
T33 : 'GET' ;
T34 : 'IS_SEND' ;
T35 : 'source' ;
T36 : 'from' ;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 3431
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 3433
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 3435
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 3437
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 3439
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 3441
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.senior.project.ui/src-gen/org/xtext/senior/project/ui/contentassist/antlr/internal/InternalProtocol.g" 3443
RULE_ANY_OTHER : .;

