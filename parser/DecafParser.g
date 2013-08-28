parser grammar DecafParser;

@header{
package compiler.parser;
}

options{
	tokenVocab=DecafLexer;
}

/* ***************************** Tipos de Variables ***************************** */
program				:	CLASS PROGRAM LBRACE (field_decl)* (method_decl)* RBRACE 
						{CC4Parser.detectRule("PROGRAM RULE");};

field_decl			:	type ( ( (ID | ID LBRACK  INT_LIT RBRACK)  COMMA)*  (ID | ID LBRACK  INT_LIT RBRACK)  ) SEMIC
						{CC4Parser.detectRule("FIELD DECLARATION RULE");};

method_decl			:	(type | VOID) ID LPAR ((type ID COMMA)* (type ID) )?	RPAR block
						{CC4Parser.detectRule("METHOD DECLARATION RULE");};

block 				:	LBRACE (var_decl)* (statement)*	RBRACE
						{CC4Parser.detectRule("BLOCK RULE");};F

var_decl			:	type (ID COMMA)* ID SEMIC
						{CC4Parser.detectRule("VARIABLE DECLARATION RULE");};

type 				:	INT | BOOLEAN
						{CC4Parser.detectRule("TYPE RULE");};

statement			:	location ASSIGN_OP expr SEMIC
					|	method_call SEMIC
					|	IF	LPAR expr RPAR block ( ELSE block )?
					|	FOR ID EQUAL expr COMMA expr block
					|	RETURN ( expr )? SEMIC
					| 	BREAK SEMIC
					| 	CONTINUE SEMIC
					| 	block
						{CC4Parser.detectRule("STATEMENT RULE");};

method_call			:	method_name LPAR ((expr COMMA)* expr)? RPAR
					| 	'callout' LPAR STRING_LIT  (COMMA  (callout_arg COMMA)* callout_arg)? RPAR
						{CC4Parser.detectRule("METHOD CALL RULE");};

method_name			:	ID;

location			:	ID
					| 	ID LBRACK expr RBRACK
						{CC4Parser.detectRule("LOCATION RULE");};

expr				:	location
					|	method_call
					|	LITERAL
					|	expr BIN_OP expr 
					| 	SUBS expr 
					| 	NOT expr
					| 	LPAR expr RPAR
						{CC4Parser.detectRule("EXPRESION RULE");};

callout_arg			:	expr | STRING_LIT;