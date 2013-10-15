lexer grammar DecafLexer;

@header{
package compiler.scanner;
}

/* *****************************       Errores      ***************************** */

/* *****************************                    ***************************** */

/* ***************************** Tipos de Variables ***************************** */

INT_LIT			:	(DIGIT)+ | HEX_LIT;
CHAR_LIT		:	'\'' (CHAR) '\'';
STRING_LIT		:	'\"' (CHAR)* '\"';
BOOL_LIT		:	('true' | 'false');
/* *****************************                    ***************************** */

/* *****************************       Ignorar      ***************************** */
COMMENT			:	'//' ~('\r' | '\n')* '\r'? '\n' 	{skip();};
WHITESPACE 		:	(' '| '\t'|'\n'|'\r')   		{skip();};
NEWLINE			:	'\n'							{skip();};
/* *****************************                    ***************************** */

/* *****************************      Keywords      ***************************** */
PROGRAM			:	'Program';
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
LPAR			:	'(';
RPAR			:	')';
SEMIC			:	';';
COMMA			:	',';
LBRACK			:	'[';
RBRACK			:	']';
LBRACE 			:	'{';
RBRACE			:	'}';
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
OR 			:	'||';
NOT 		:	'!';

// Artiméticos
SUBS		:	'-';
PLUS 		:	'+';
TIMES		:	'*';
DIV			:	'/';
MOD			:	'%';

// De Asignación
ASSIGN				:	'=';
ASSIGN_PLUS			:	'+=';
ASSIGN_SUBS			:	'-=';
/******************************                    ***************************** */

fragment ALPHA		: ('a'..'z' | 'A'..'Z');
fragment HEX_LIT	: '0x' HEXDIG+;
fragment HEXDIG		: (DIGIT | ('a'..'f'|'A'..'F'));
fragment DIGIT		: ('0'..'9');
fragment CHAR		: ' '..'!' | '#'..'&' | '('..'[' | ']'..'~' | SEQUENCE;
fragment SEQUENCE	: '\\\\' | '\\"'| '\\\'' | '\\n' | '\\t';