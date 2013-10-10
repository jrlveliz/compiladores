parser grammar DecafParser;

@header{
package compiler.parser;
}

options{
	tokenVocab=DecafLexer;
}



@members {
    public void emitErrorMessage(String msg) {
        System.err.println(msg);
    }
}

/* ***************************** Tipos de Variables ***************************** */
program				:	CLASS PROGRAM LBRACE (field_decl)* (method_decl)* RBRACE 
						{CC4Parser.detectRule("PROGRAM RULE");} #class;

field_decl			:	type (var_decl_name  COMMA)*  var_decl_name SEMIC 
						{CC4Parser.detectRule("FIELD DECLARATION RULE");};

var_decl_name       :	ID
					| 	ID LBRACK  INT_LIT RBRACK;

method_decl			:	(type | VOID) ID LPAR (parametros)? RPAR block
						{CC4Parser.detectRule("METHOD DECLARATION RULE");};

parametros			:	(param_decl COMMA)* param_decl;

param_decl			:	type ID;

block 				:	LBRACE (var_decl)* (statement)*	RBRACE
						{CC4Parser.detectRule("BLOCK RULE");};

var_decl			:	type (ID COMMA)* ID SEMIC
						{CC4Parser.detectRule("VARIABLE DECLARATION RULE");};

type 				:	INT | BOOLEAN
						{CC4Parser.detectRule("TYPE RULE");};

statement			:	location assing_op expr SEMIC
					|	method_call SEMIC
					|	IF	LPAR expr RPAR block ( ELSE block )?
					|	FOR ID ASSIGN expr COMMA expr block
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
					|	literal
					|	expr bin_op expr 
					| 	SUBS expr 
					| 	NOT expr
					| 	LPAR expr RPAR
						{CC4Parser.detectRule("EXPRESION RULE");};

callout_arg			:	expr | STRING_LIT;

bin_op				:	ARITH_OP | rel_op | eq_op | cond_op;
assing_op			:	ASSIGN | ASSIGN_PLUS | ASSIGN_SUBS;
cond_op				:	AND | OR;
rel_op				:	GREATER | LESS | GTOE | LTOE;
eq_op				:	EQUAL | NOT_EQUAL;
literal 			:	INT_LIT | CHAR_LIT | BOOL_LIT;