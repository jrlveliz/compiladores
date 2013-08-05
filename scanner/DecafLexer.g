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

ID			: ('_' | ALPHA)(ALPHA | DIGIT | '_')*;

fragment BOOL 		: ('true' | 'false');
fragment ALPHA		: ('a'..'z' | 'A'..'Z');
fragment HEXDIG		: (DIGIT | ('a'..'f'|'A'..'F'));
fragment DIGIT		: ('0'..'9');
fragment CHAR		: ' '..'!' | '#'..'&' | '('..'[' | ']'..'~' | SEQUENCE;
fragment SEQUENCE	: '\\\\' | '\\"'| '\\\'' | '\\n' | '\\t';
/* *****************************                    ***************************** */

/* *****************************       Ignorar      ***************************** */
COMMENT: '//' ~('\n' | '\r') '\r'? '\n' -> channel(HIDDEN);
WHITESPACE :	(' '| '\t'|'\n'|'\r');
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
/* *****************************                    ***************************** */