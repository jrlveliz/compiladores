parser grammar DecafParser;

@header{
package compiler.parser;
}

options{
	tokenVocab=DecafLexer;
}

/* ***************************** Tipos de Variables ***************************** */
program				:	CLASS PROGRAM LBRACE (field_decl)* (method_decl)* RBRACE;

field_decl			:	type ( ( (ID | ID LBRACK  INT_LIT RBRACK)  COMMA)*  (ID | ID LBRACK  INT_LIT RBRACK)  ) SEMIC;

method_decl			:	(type | VOID) ID LPAR ((type ID COMMA)* (type ID) )?	RPAR block;

block 				:	LBRACE (var_decl)* (statement)*	RBRACE;

var_decl			:	type (ID COMMA)* ID SEMIC;

type 				:	INT | BOOLEAN;

statement			:	location ASSIGN_OP expr SEMIC
					|	method_call SEMIC
					|	IF	LPAR expr RPAR block ( ELSE block )?
					|	FOR ID EQUAL expr COMMA expr block
					|	RETURN ( expr )? SEMIC
					| 	BREAK SEMIC
					| 	CONTINUE SEMIC
					| 	block;

method_call			:	method_name LPAR ((expr COMMA)* expr)? RPAR
					| 	'callout' LPAR STRING_LIT  (COMMA  (callout_arg COMMA)* callout_arg)? RPAR;

method_name			:	ID;

location			:	ID
					| 	ID LBRACK expr RBRACK; 

expr				:	location
					|	method_call
					|	LITERAL
					|	expr BIN_OP expr 
					| 	SUBS expr 
					| 	NOT expr
					| 	LPAR expr RPAR;

callout_arg			:	expr | STRING_LIT;