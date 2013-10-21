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

statement			:	location assign_op expr SEMIC 				#assign
					|	method_call SEMIC							#methodCall
					|	IF	LPAR expr RPAR block ( ELSE block )?	#ifstmnt
					|	FOR ID ASSIGN expr COMMA expr block 		#forstmnt
					|	RETURN ( expr )? SEMIC						#return_st
					| 	BREAK SEMIC									#break_st
					| 	CONTINUE SEMIC								#continue_st
					| 	block 										#block_st;

method_call			:	ID LPAR ((expr COMMA)* expr)? RPAR		#method_call1
					| 	'callout' LPAR STRING_LIT  (COMMA  (callout_arg COMMA)* callout_arg)? RPAR	#method_callout;

location			:	ID
					| 	ID LBRACK expr RBRACK
						{CC4Parser.detectRule("LOCATION RULE");};

expr				:	location 					#location_exp
					|	method_call					#method_exp	
					|	literal						#literal_exp
					|	expr (TIMES | DIV) expr 	#multDiv
					|   expr (PLUS | SUBS) expr 	#plusMin
					|   expr bin_op expr 			#bin_op_exp
					| 	SUBS expr 					#neg_sign
					| 	NOT expr 					#not_expr
					| 	LPAR expr RPAR				#par_expr;

callout_arg			:	expr | STRING_LIT;

bin_op				:	rel_op | eq_op | cond_op | MOD;
assign_op			:	ASSIGN | ASSIGN_PLUS | ASSIGN_SUBS;
cond_op				:	AND | OR;
rel_op				:	GREATER | LESS | GTOE | LTOE;
eq_op				:	EQUAL | NOT_EQUAL;
literal 			:	INT_LIT | CHAR_LIT | BOOL_LIT;