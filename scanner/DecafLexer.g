lexer grammar DecafLexer;

@header{
package compiler.scanner;
}

/* ***************************** Tipos de Variables ***************************** */
INT_LIT		: (DIGIT)+ | HEX_LIT;
HEX_LIT		: '0x' HEXDIG+;
CHAR_LIT	: '\'' (CHAR) '\'';
STRING_LIT	: '\"' (CHAR)* '\"';
BOOLEAN_LIT	: (BOOL);

PROGRAM				: 'Program';
fragment BOOL 		: ('true' | 'false');
fragment ALPHA		: ('a'..'z' | 'A'..'Z');
fragment HEXDIG		: (DIGIT | ('a'..'f'|'A'..'F'));
fragment DIGIT		: ('0'..'9');
fragment CHAR		: ' '..'!' | '#'..'&' | '('..'[' | ']'..'~' | SEQUENCE;
fragment SEQUENCE	: '\\\\' | '\\"'| '\\\'' | '\\n' | '\\t';
/* *****************************                    ***************************** */

/* *****************************       Ignorar      ***************************** */
COMMENT: 		'//' ~('\n' | '\r') '\r'? '\n' 	-> channel(HIDDEN);
WHITESPACE :	(' '| '\t'|'\n'|'\r')   		-> channel(HIDDEN);
/* *****************************                    ***************************** */

/* *****************************      Keywords      ***************************** */
BREAK			:	'break';
IF				:	'if';
FOR				:	'for';
CONTINUE 		:	'continue';
CALLOUT			:	'callout';
BOOL_TRUE		:	'true';
BOOL_FALSE		: 	'false';
BOOLEAN			:	'boolean';
VOID			:	'void';
CLASS			:	'class';
ELSE			:	'else';
RETURN			:	'return';
INT				:	'int';
ID				: 	('_' | ALPHA)(ALPHA | DIGIT | '_')*;
/* *****************************                    ***************************** */

/* *****************************      Símbolos      ***************************** */
LPAR	: '(';
RPAR	: ')';
SEMIC	: ';';
COMMA	: ',';
LBRACK	: '[';
RBRACK	: ']';
LBRACE  : '{';
RBRACE	: '}';
/* *****************************                    ***************************** */

/* *****************************     Operadores     ***************************** */
// Comparación
EQUAL		:	'==';
NOT_EQUAL	:	'!=';
GREATER		:	'>';
LESS		:	'<';
GTOE		:	'>=';
LTOE		:	'<=';

// Booleanos
AND			:	'&&';
OR			:	'||';
NOT 		:	'!';

// Artiméticos
PLUS 		:	'+';
SUBS		:	'-';
TIMES		:	'*';
DIV			:	'/';
MOD			:	'%';

// De Asignación
ASSIGN		:	'=';
ASSIGN_PLUS	:	'+=';
ASSIGN_SUBS:	'-=';
/* *****************************                    ***************************** */


BIN_OP				:	ARITH_OP | REL_OP | EQ_OP | COND_OP;

fragment ARITH_OP	:	PLUS | SUBS | TIMES | DIV | MOD;
fragment COND_OP	:	AND | OR;
fragment REL_OP		:	GREATER | LESS | GTOE | LTOE;
fragment EQ_OP		:	EQUAL | NOT_EQUAL;

ASSIGN_OP			:	ASSIGN | ASSIGN_PLUS | ASSIGN_SUBS;

LITERAL				:	INT_LIT | CHAR_LIT | BOOLEAN_LIT;
