// Generated from parser/DecafParser.g by ANTLR 4.1

package compiler.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RBRACK=28, CLASS=18, LBRACK=27, SUBS=40, BOOL_LIT=4, INT_LIT=1, RBRACE=30, 
		STRING_LIT=3, ARITH_OP=41, LBRACE=29, ELSE=19, FOR=11, WHITESPACE=6, GTOE=35, 
		INT=21, CHAR_LIT=2, NOT=39, AND=37, ID=22, BREAK=9, IF=10, GREATER=33, 
		BOOLEAN=16, NEWLINE=7, LPAR=23, CONTINUE=12, NOT_EQUAL=32, COMMA=26, EQUAL=31, 
		OR=38, ASSIGN_SUBS=44, ASSIGN=42, LESS=34, RETURN=20, LTOE=36, PROGRAM=8, 
		RPAR=24, ASSIGN_PLUS=43, VOID=17, SEMIC=25, COMMENT=5, BOOL_FALSE=15, 
		BOOL_TRUE=14, CALLOUT=13;
	public static final String[] tokenNames = {
		"<INVALID>", "INT_LIT", "CHAR_LIT", "STRING_LIT", "BOOL_LIT", "COMMENT", 
		"WHITESPACE", "'\n'", "'Program'", "'break'", "'if'", "'for'", "'continue'", 
		"'callout'", "'true'", "'false'", "'boolean'", "'void'", "'class'", "'else'", 
		"'return'", "'int'", "ID", "'('", "')'", "';'", "','", "'['", "']'", "'{'", 
		"'}'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'!'", 
		"'-'", "ARITH_OP", "'='", "'+='", "'-='"
	};
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_var_decl_name = 2, RULE_method_decl = 3, 
		RULE_block = 4, RULE_var_decl = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_method_call = 8, RULE_method_name = 9, RULE_location = 10, RULE_expr = 11, 
		RULE_callout_arg = 12, RULE_bin_op = 13, RULE_assing_op = 14, RULE_cond_op = 15, 
		RULE_rel_op = 16, RULE_eq_op = 17, RULE_literal = 18;
	public static final String[] ruleNames = {
		"program", "field_decl", "var_decl_name", "method_decl", "block", "var_decl", 
		"type", "statement", "method_call", "method_name", "location", "expr", 
		"callout_arg", "bin_op", "assing_op", "cond_op", "rel_op", "eq_op", "literal"
	};

	@Override
	public String getGrammarFileName() { return "DecafParser.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    public void emitErrorMessage(String msg) {
	        System.err.println(msg);
	    }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassContext extends ProgramContext {
		public TerminalNode LBRACE() { return getToken(DecafParser.LBRACE, 0); }
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public TerminalNode PROGRAM() { return getToken(DecafParser.PROGRAM, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(DecafParser.RBRACE, 0); }
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public ClassContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitClass(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			_localctx = new ClassContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(CLASS);
			setState(39); match(PROGRAM);
			setState(40); match(LBRACE);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(41); field_decl();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << VOID) | (1L << INT))) != 0)) {
				{
				{
				setState(47); method_decl();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); match(RBRACE);
			CC4Parser.detectRule("PROGRAM RULE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
	 
		public Field_declContext() { }
		public void copyFrom(Field_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldDeclContext extends Field_declContext {
		public TerminalNode SEMIC() { return getToken(DecafParser.SEMIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_decl_nameContext var_decl_name(int i) {
			return getRuleContext(Var_decl_nameContext.class,i);
		}
		public List<Var_decl_nameContext> var_decl_name() {
			return getRuleContexts(Var_decl_nameContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public FieldDeclContext(Field_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitFieldDecl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		try {
			int _alt;
			_localctx = new FieldDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56); type();
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(57); var_decl_name();
					setState(58); match(COMMA);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(65); var_decl_name();
			}
			setState(67); match(SEMIC);
			CC4Parser.detectRule("FIELD DECLARATION RULE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_nameContext extends ParserRuleContext {
		public Var_decl_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_name; }
	 
		public Var_decl_nameContext() { }
		public void copyFrom(Var_decl_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclIDContext extends Var_decl_nameContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public VarDeclIDContext(Var_decl_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVarDeclID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVarDeclID(this);
		}
	}
	public static class VarDeclArrayContext extends Var_decl_nameContext {
		public TerminalNode RBRACK() { return getToken(DecafParser.RBRACK, 0); }
		public TerminalNode INT_LIT() { return getToken(DecafParser.INT_LIT, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(DecafParser.LBRACK, 0); }
		public VarDeclArrayContext(Var_decl_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVarDeclArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVarDeclArray(this);
		}
	}

	public final Var_decl_nameContext var_decl_name() throws RecognitionException {
		Var_decl_nameContext _localctx = new Var_decl_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl_name);
		try {
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VarDeclIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(ID);
				}
				break;

			case 2:
				_localctx = new VarDeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71); match(ID);
				setState(72); match(LBRACK);
				setState(73); match(INT_LIT);
				setState(74); match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(77); type();
				}
				break;
			case VOID:
				{
				setState(78); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81); match(ID);
			setState(82); match(LPAR);
			setState(95);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(83); type();
						setState(84); match(ID);
						setState(85); match(COMMA);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				{
				setState(92); type();
				setState(93); match(ID);
				}
				}
			}

			setState(97); match(RPAR);
			setState(98); block();
			CC4Parser.detectRule("METHOD DECLARATION RULE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode LBRACE() { return getToken(DecafParser.LBRACE, 0); }
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(DecafParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(LBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(102); var_decl();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << RETURN) | (1L << ID) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(108); statement();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114); match(RBRACE);
			CC4Parser.detectRule("BLOCK RULE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode SEMIC() { return getToken(DecafParser.SEMIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); type();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(118); match(ID);
					setState(119); match(COMMA);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(125); match(ID);
			setState(126); match(SEMIC);
			CC4Parser.detectRule("VARIABLE DECLARATION RULE");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); match(BOOLEAN);
				CC4Parser.detectRule("TYPE RULE");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Assing_opContext assing_op() {
			return getRuleContext(Assing_opContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public TerminalNode SEMIC() { return getToken(DecafParser.SEMIC, 0); }
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode ASSIGN() { return getToken(DecafParser.ASSIGN, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); location();
				setState(135); assing_op();
				setState(136); expr(0);
				setState(137); match(SEMIC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); method_call();
				setState(140); match(SEMIC);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); match(IF);
				setState(143); match(LPAR);
				setState(144); expr(0);
				setState(145); match(RPAR);
				setState(146); block();
				setState(149);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(147); match(ELSE);
					setState(148); block();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151); match(FOR);
				setState(152); match(ID);
				setState(153); match(ASSIGN);
				setState(154); expr(0);
				setState(155); match(COMMA);
				setState(156); expr(0);
				setState(157); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159); match(RETURN);
				setState(161);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LIT) | (1L << CHAR_LIT) | (1L << BOOL_LIT) | (1L << CALLOUT) | (1L << ID) | (1L << LPAR) | (1L << NOT) | (1L << SUBS))) != 0)) {
					{
					setState(160); expr(0);
					}
				}

				setState(163); match(SEMIC);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164); match(BREAK);
				setState(165); match(SEMIC);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166); match(CONTINUE);
				setState(167); match(SEMIC);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168); block();
				CC4Parser.detectRule("STATEMENT RULE");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(DecafParser.STRING_LIT, 0); }
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(205);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); method_name();
				setState(174); match(LPAR);
				setState(184);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LIT) | (1L << CHAR_LIT) | (1L << BOOL_LIT) | (1L << CALLOUT) | (1L << ID) | (1L << LPAR) | (1L << NOT) | (1L << SUBS))) != 0)) {
					{
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(175); expr(0);
							setState(176); match(COMMA);
							}
							} 
						}
						setState(182);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(183); expr(0);
					}
				}

				setState(186); match(RPAR);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(CALLOUT);
				setState(189); match(LPAR);
				setState(190); match(STRING_LIT);
				setState(201);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(191); match(COMMA);
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(192); callout_arg();
							setState(193); match(COMMA);
							}
							} 
						}
						setState(199);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(200); callout_arg();
					}
				}

				setState(203); match(RPAR);
				CC4Parser.detectRule("METHOD CALL RULE");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(DecafParser.RBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(DecafParser.LBRACK, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_location);
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(ID);
				setState(211); match(LBRACK);
				setState(212); expr(0);
				setState(213); match(RBRACK);
				CC4Parser.detectRule("LOCATION RULE");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DecafParser.NOT, 0); }
		public TerminalNode SUBS() { return getToken(DecafParser.SUBS, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(219); match(SUBS);
				setState(220); expr(3);
				}
				break;

			case 2:
				{
				setState(221); match(NOT);
				setState(222); expr(2);
				}
				break;

			case 3:
				{
				setState(223); location();
				}
				break;

			case 4:
				{
				setState(224); method_call();
				}
				break;

			case 5:
				{
				setState(225); literal();
				}
				break;

			case 6:
				{
				setState(226); match(LPAR);
				setState(227); expr(0);
				setState(228); match(RPAR);
				CC4Parser.detectRule("EXPRESION RULE");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(233);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(234); bin_op();
					setState(235); expr(0);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(DecafParser.STRING_LIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callout_arg);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case INT_LIT:
			case CHAR_LIT:
			case BOOL_LIT:
			case CALLOUT:
			case ID:
			case LPAR:
			case NOT:
			case SUBS:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); expr(0);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); match(STRING_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_opContext extends ParserRuleContext {
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public TerminalNode ARITH_OP() { return getToken(DecafParser.ARITH_OP, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bin_op);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case ARITH_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); match(ARITH_OP);
				}
				break;
			case GREATER:
			case LESS:
			case GTOE:
			case LTOE:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); rel_op();
				}
				break;
			case EQUAL:
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(248); eq_op();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(249); cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assing_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN_PLUS() { return getToken(DecafParser.ASSIGN_PLUS, 0); }
		public TerminalNode ASSIGN() { return getToken(DecafParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_SUBS() { return getToken(DecafParser.ASSIGN_SUBS, 0); }
		public Assing_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assing_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssing_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssing_op(this);
		}
	}

	public final Assing_opContext assing_op() throws RecognitionException {
		Assing_opContext _localctx = new Assing_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assing_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_PLUS) | (1L << ASSIGN_SUBS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DecafParser.AND, 0); }
		public TerminalNode OR() { return getToken(DecafParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode GTOE() { return getToken(DecafParser.GTOE, 0); }
		public TerminalNode LESS() { return getToken(DecafParser.LESS, 0); }
		public TerminalNode LTOE() { return getToken(DecafParser.LTOE, 0); }
		public TerminalNode GREATER() { return getToken(DecafParser.GREATER, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << GTOE) | (1L << LTOE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(DecafParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(DecafParser.NOT_EQUAL, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOL_LIT() { return getToken(DecafParser.BOOL_LIT, 0); }
		public TerminalNode CHAR_LIT() { return getToken(DecafParser.CHAR_LIT, 0); }
		public TerminalNode INT_LIT() { return getToken(DecafParser.INT_LIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LIT) | (1L << CHAR_LIT) | (1L << BOOL_LIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3.\u0109\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3"+
		"B\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\5\5R\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\5\5\5b\n"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\7\6p\n\6\f\6\16"+
		"\6s\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\5\b\u0087\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00a4\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3\n\5\n\u00bb\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c6\n\n\f\n\16\n\u00c9\13\n\3\n\5"+
		"\n\u00cc\n\n\3\n\3\n\5\n\u00d0\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00db\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00ea\n\r\3\r\3\r\3\r\3\r\7\r\u00f0\n\r\f\r\16\r\u00f3\13\r\3\16\3"+
		"\16\5\16\u00f7\n\16\3\17\3\17\3\17\3\17\5\17\u00fd\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\25\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&\2\7\3\2,.\3\2\'(\3\2#&\3\2!\"\4\2\3\4\6\6\u0119\2"+
		"(\3\2\2\2\4:\3\2\2\2\6M\3\2\2\2\bQ\3\2\2\2\ng\3\2\2\2\fw\3\2\2\2\16\u0086"+
		"\3\2\2\2\20\u00ad\3\2\2\2\22\u00cf\3\2\2\2\24\u00d1\3\2\2\2\26\u00da\3"+
		"\2\2\2\30\u00e9\3\2\2\2\32\u00f6\3\2\2\2\34\u00fc\3\2\2\2\36\u00fe\3\2"+
		"\2\2 \u0100\3\2\2\2\"\u0102\3\2\2\2$\u0104\3\2\2\2&\u0106\3\2\2\2()\7"+
		"\24\2\2)*\7\n\2\2*.\7\37\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7 "+
		"\2\289\b\2\1\29\3\3\2\2\2:@\5\16\b\2;<\5\6\4\2<=\7\34\2\2=?\3\2\2\2>;"+
		"\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\5\6\4\2D"+
		"E\3\2\2\2EF\7\33\2\2FG\b\3\1\2G\5\3\2\2\2HN\7\30\2\2IJ\7\30\2\2JK\7\35"+
		"\2\2KL\7\3\2\2LN\7\36\2\2MH\3\2\2\2MI\3\2\2\2N\7\3\2\2\2OR\5\16\b\2PR"+
		"\7\23\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2ST\7\30\2\2Ta\7\31\2\2UV\5\16\b"+
		"\2VW\7\30\2\2WX\7\34\2\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\^\3\2\2\2][\3\2\2\2^_\5\16\b\2_`\7\30\2\2`b\3\2\2\2a[\3\2\2\2"+
		"ab\3\2\2\2bc\3\2\2\2cd\7\32\2\2de\5\n\6\2ef\b\5\1\2f\t\3\2\2\2gk\7\37"+
		"\2\2hj\5\f\7\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lq\3\2\2\2mk\3\2"+
		"\2\2np\5\20\t\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3"+
		"\2\2\2tu\7 \2\2uv\b\6\1\2v\13\3\2\2\2w|\5\16\b\2xy\7\30\2\2y{\7\34\2\2"+
		"zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7\30\2\2\u0080\u0081\7\33\2\2\u0081\u0082\b\7\1\2\u0082\r\3\2\2\2\u0083"+
		"\u0087\7\27\2\2\u0084\u0085\7\22\2\2\u0085\u0087\b\b\1\2\u0086\u0083\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0087\17\3\2\2\2\u0088\u0089\5\26\f\2\u0089"+
		"\u008a\5\36\20\2\u008a\u008b\5\30\r\2\u008b\u008c\7\33\2\2\u008c\u00ae"+
		"\3\2\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\33\2\2\u008f\u00ae\3\2\2\2"+
		"\u0090\u0091\7\f\2\2\u0091\u0092\7\31\2\2\u0092\u0093\5\30\r\2\u0093\u0094"+
		"\7\32\2\2\u0094\u0097\5\n\6\2\u0095\u0096\7\25\2\2\u0096\u0098\5\n\6\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00ae\3\2\2\2\u0099\u009a"+
		"\7\r\2\2\u009a\u009b\7\30\2\2\u009b\u009c\7,\2\2\u009c\u009d\5\30\r\2"+
		"\u009d\u009e\7\34\2\2\u009e\u009f\5\30\r\2\u009f\u00a0\5\n\6\2\u00a0\u00ae"+
		"\3\2\2\2\u00a1\u00a3\7\26\2\2\u00a2\u00a4\5\30\r\2\u00a3\u00a2\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ae\7\33\2\2\u00a6\u00a7"+
		"\7\13\2\2\u00a7\u00ae\7\33\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00ae\7\33\2"+
		"\2\u00aa\u00ab\5\n\6\2\u00ab\u00ac\b\t\1\2\u00ac\u00ae\3\2\2\2\u00ad\u0088"+
		"\3\2\2\2\u00ad\u008d\3\2\2\2\u00ad\u0090\3\2\2\2\u00ad\u0099\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ae\21\3\2\2\2\u00af\u00b0\5\24\13\2\u00b0\u00ba\7\31\2\2\u00b1"+
		"\u00b2\5\30\r\2\u00b2\u00b3\7\34\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\5\30\r\2\u00ba\u00b6\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\32\2\2\u00bd"+
		"\u00d0\3\2\2\2\u00be\u00bf\7\17\2\2\u00bf\u00c0\7\31\2\2\u00c0\u00cb\7"+
		"\5\2\2\u00c1\u00c7\7\34\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7\34\2\2"+
		"\u00c4\u00c6\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cc\5\32\16\2\u00cb\u00c1\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00ce\7\32\2\2\u00ce\u00d0\b\n\1\2\u00cf\u00af\3\2\2\2\u00cf"+
		"\u00be\3\2\2\2\u00d0\23\3\2\2\2\u00d1\u00d2\7\30\2\2\u00d2\25\3\2\2\2"+
		"\u00d3\u00db\7\30\2\2\u00d4\u00d5\7\30\2\2\u00d5\u00d6\7\35\2\2\u00d6"+
		"\u00d7\5\30\r\2\u00d7\u00d8\7\36\2\2\u00d8\u00d9\b\f\1\2\u00d9\u00db\3"+
		"\2\2\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00db\27\3\2\2\2\u00dc"+
		"\u00dd\b\r\1\2\u00dd\u00de\7*\2\2\u00de\u00ea\5\30\r\2\u00df\u00e0\7)"+
		"\2\2\u00e0\u00ea\5\30\r\2\u00e1\u00ea\5\26\f\2\u00e2\u00ea\5\22\n\2\u00e3"+
		"\u00ea\5&\24\2\u00e4\u00e5\7\31\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\7"+
		"\32\2\2\u00e7\u00e8\b\r\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00dc\3\2\2\2\u00e9"+
		"\u00df\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2"+
		"\2\2\u00e9\u00e4\3\2\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\6\r\2\3\u00ec"+
		"\u00ed\5\34\17\2\u00ed\u00ee\5\30\r\2\u00ee\u00f0\3\2\2\2\u00ef\u00eb"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\31\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\5\30\r\2\u00f5\u00f7\7\5\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\33\3\2\2\2\u00f8\u00fd"+
		"\7+\2\2\u00f9\u00fd\5\"\22\2\u00fa\u00fd\5$\23\2\u00fb\u00fd\5 \21\2\u00fc"+
		"\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\35\3\2\2\2\u00fe\u00ff\t\2\2\2\u00ff\37\3\2\2\2\u0100\u0101"+
		"\t\3\2\2\u0101!\3\2\2\2\u0102\u0103\t\4\2\2\u0103#\3\2\2\2\u0104\u0105"+
		"\t\5\2\2\u0105%\3\2\2\2\u0106\u0107\t\6\2\2\u0107\'\3\2\2\2\32.\64@MQ"+
		"[akq|\u0086\u0097\u00a3\u00ad\u00b6\u00ba\u00c7\u00cb\u00cf\u00da\u00e9"+
		"\u00f1\u00f6\u00fc";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}