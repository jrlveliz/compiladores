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
		RULE_parametros = 4, RULE_param_decl = 5, RULE_block = 6, RULE_var_decl = 7, 
		RULE_type = 8, RULE_statement = 9, RULE_method_call = 10, RULE_method_name = 11, 
		RULE_location = 12, RULE_expr = 13, RULE_callout_arg = 14, RULE_bin_op = 15, 
		RULE_assing_op = 16, RULE_cond_op = 17, RULE_rel_op = 18, RULE_eq_op = 19, 
		RULE_literal = 20;
	public static final String[] ruleNames = {
		"program", "field_decl", "var_decl_name", "method_decl", "parametros", 
		"param_decl", "block", "var_decl", "type", "statement", "method_call", 
		"method_name", "location", "expr", "callout_arg", "bin_op", "assing_op", 
		"cond_op", "rel_op", "eq_op", "literal"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
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
			setState(42); match(CLASS);
			setState(43); match(PROGRAM);
			setState(44); match(LBRACE);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(45); field_decl();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << VOID) | (1L << INT))) != 0)) {
				{
				{
				setState(51); method_decl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(RBRACE);
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
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitField_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); type();
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(61); var_decl_name();
					setState(62); match(COMMA);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(69); var_decl_name();
			setState(70); match(SEMIC);
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
		public TerminalNode RBRACK() { return getToken(DecafParser.RBRACK, 0); }
		public TerminalNode INT_LIT() { return getToken(DecafParser.INT_LIT, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(DecafParser.LBRACK, 0); }
		public Var_decl_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitVar_decl_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_nameContext var_decl_name() throws RecognitionException {
		Var_decl_nameContext _localctx = new Var_decl_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl_name);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); match(ID);
				setState(75); match(LBRACK);
				setState(76); match(INT_LIT);
				setState(77); match(RBRACK);
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
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public TerminalNode RPAR() { return getToken(DecafParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethod_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(80); type();
				}
				break;
			case VOID:
				{
				setState(81); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84); match(ID);
			setState(85); match(LPAR);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(86); parametros();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); match(RPAR);
			setState(93); block();
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

	public static class ParametrosContext extends ParserRuleContext {
		public Param_declContext param_decl(int i) {
			return getRuleContext(Param_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public List<Param_declContext> param_decl() {
			return getRuleContexts(Param_declContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(96); param_decl();
					setState(97); match(COMMA);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(104); param_decl();
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

	public static class Param_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitParam_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitParam_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); type();
			setState(107); match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(LBRACE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(110); var_decl();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << RETURN) | (1L << ID) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(116); statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122); match(RBRACE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); type();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(126); match(ID);
					setState(127); match(COMMA);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(133); match(ID);
			setState(134); match(SEMIC);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(BOOLEAN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); location();
				setState(143); assing_op();
				setState(144); expr(0);
				setState(145); match(SEMIC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); method_call();
				setState(148); match(SEMIC);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150); match(IF);
				setState(151); match(LPAR);
				setState(152); expr(0);
				setState(153); match(RPAR);
				setState(154); block();
				setState(157);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(155); match(ELSE);
					setState(156); block();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159); match(FOR);
				setState(160); match(ID);
				setState(161); match(ASSIGN);
				setState(162); expr(0);
				setState(163); match(COMMA);
				setState(164); expr(0);
				setState(165); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167); match(RETURN);
				setState(169);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LIT) | (1L << CHAR_LIT) | (1L << BOOL_LIT) | (1L << CALLOUT) | (1L << ID) | (1L << LPAR) | (1L << NOT) | (1L << SUBS))) != 0)) {
					{
					setState(168); expr(0);
					}
				}

				setState(171); match(SEMIC);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172); match(BREAK);
				setState(173); match(SEMIC);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174); match(CONTINUE);
				setState(175); match(SEMIC);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(176); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(213);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); method_name();
				setState(182); match(LPAR);
				setState(192);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LIT) | (1L << CHAR_LIT) | (1L << BOOL_LIT) | (1L << CALLOUT) | (1L << ID) | (1L << LPAR) | (1L << NOT) | (1L << SUBS))) != 0)) {
					{
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(183); expr(0);
							setState(184); match(COMMA);
							}
							} 
						}
						setState(190);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(191); expr(0);
					}
				}

				setState(194); match(RPAR);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); match(CALLOUT);
				setState(197); match(LPAR);
				setState(198); match(STRING_LIT);
				setState(209);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(199); match(COMMA);
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(200); callout_arg();
							setState(201); match(COMMA);
							}
							} 
						}
						setState(207);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(208); callout_arg();
					}
				}

				setState(211); match(RPAR);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_location);
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(ID);
				setState(219); match(LBRACK);
				setState(220); expr(0);
				setState(221); match(RBRACK);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(227); match(SUBS);
				setState(228); expr(3);
				}
				break;

			case 2:
				{
				setState(229); match(NOT);
				setState(230); expr(2);
				}
				break;

			case 3:
				{
				setState(231); location();
				}
				break;

			case 4:
				{
				setState(232); method_call();
				}
				break;

			case 5:
				{
				setState(233); literal();
				}
				break;

			case 6:
				{
				setState(234); match(LPAR);
				setState(235); expr(0);
				setState(236); match(RPAR);
				CC4Parser.detectRule("EXPRESION RULE");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
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
					setState(241);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(242); bin_op();
					setState(243); expr(0);
					}
					} 
				}
				setState(249);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCallout_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callout_arg);
		try {
			setState(252);
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
				setState(250); expr(0);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); match(STRING_LIT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bin_op);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case ARITH_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(ARITH_OP);
				}
				break;
			case GREATER:
			case LESS:
			case GTOE:
			case LTOE:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); rel_op();
				}
				break;
			case EQUAL:
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(256); eq_op();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(257); cond_op();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitAssing_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assing_opContext assing_op() throws RecognitionException {
		Assing_opContext _localctx = new Assing_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assing_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		case 13: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3.\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4Q"+
		"\n\4\3\5\3\5\5\5U\n\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7"+
		"\br\n\b\f\b\16\bu\13\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\t\u0083\n\t\f\t\16\t\u0086\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n"+
		"\u008f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00a0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00ac\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00b6\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u00bd\n\f\f\f\16\f\u00c0\13\f\3\f"+
		"\5\f\u00c3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ce\n\f\f\f\16"+
		"\f\u00d1\13\f\3\f\5\f\u00d4\n\f\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00e3\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f2\n\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00f8\n\17\f\17\16\17\u00fb\13\17\3\20\3\20\5\20\u00ff\n\20\3\21"+
		"\3\21\3\21\3\21\5\21\u0105\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7"+
		"\3\2,.\3\2\'(\3\2#&\3\2!\"\4\2\3\4\6\6\u011f\2,\3\2\2\2\4>\3\2\2\2\6P"+
		"\3\2\2\2\bT\3\2\2\2\ng\3\2\2\2\fl\3\2\2\2\16o\3\2\2\2\20\177\3\2\2\2\22"+
		"\u008e\3\2\2\2\24\u00b5\3\2\2\2\26\u00d7\3\2\2\2\30\u00d9\3\2\2\2\32\u00e2"+
		"\3\2\2\2\34\u00f1\3\2\2\2\36\u00fe\3\2\2\2 \u0104\3\2\2\2\"\u0106\3\2"+
		"\2\2$\u0108\3\2\2\2&\u010a\3\2\2\2(\u010c\3\2\2\2*\u010e\3\2\2\2,-\7\24"+
		"\2\2-.\7\n\2\2.\62\7\37\2\2/\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\5\b\5\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7 \2\2"+
		"<=\b\2\1\2=\3\3\2\2\2>D\5\22\n\2?@\5\6\4\2@A\7\34\2\2AC\3\2\2\2B?\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\5\6\4\2HI\7\33"+
		"\2\2IJ\b\3\1\2J\5\3\2\2\2KQ\7\30\2\2LM\7\30\2\2MN\7\35\2\2NO\7\3\2\2O"+
		"Q\7\36\2\2PK\3\2\2\2PL\3\2\2\2Q\7\3\2\2\2RU\5\22\n\2SU\7\23\2\2TR\3\2"+
		"\2\2TS\3\2\2\2UV\3\2\2\2VW\7\30\2\2W[\7\31\2\2XZ\5\n\6\2YX\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\32\2\2_`\5\16\b\2"+
		"`a\b\5\1\2a\t\3\2\2\2bc\5\f\7\2cd\7\34\2\2df\3\2\2\2eb\3\2\2\2fi\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\f\7\2k\13\3\2\2\2lm\5\22"+
		"\n\2mn\7\30\2\2n\r\3\2\2\2os\7\37\2\2pr\5\20\t\2qp\3\2\2\2ru\3\2\2\2s"+
		"q\3\2\2\2st\3\2\2\2ty\3\2\2\2us\3\2\2\2vx\5\24\13\2wv\3\2\2\2x{\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7 \2\2}~\b\b\1\2~\17\3\2"+
		"\2\2\177\u0084\5\22\n\2\u0080\u0081\7\30\2\2\u0081\u0083\7\34\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\30\2\2\u0088"+
		"\u0089\7\33\2\2\u0089\u008a\b\t\1\2\u008a\21\3\2\2\2\u008b\u008f\7\27"+
		"\2\2\u008c\u008d\7\22\2\2\u008d\u008f\b\n\1\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\23\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0092\5\""+
		"\22\2\u0092\u0093\5\34\17\2\u0093\u0094\7\33\2\2\u0094\u00b6\3\2\2\2\u0095"+
		"\u0096\5\26\f\2\u0096\u0097\7\33\2\2\u0097\u00b6\3\2\2\2\u0098\u0099\7"+
		"\f\2\2\u0099\u009a\7\31\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7\32\2\2"+
		"\u009c\u009f\5\16\b\2\u009d\u009e\7\25\2\2\u009e\u00a0\5\16\b\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00b6\3\2\2\2\u00a1\u00a2\7\r"+
		"\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\5\34\17\2\u00a5"+
		"\u00a6\7\34\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\5\16\b\2\u00a8\u00b6"+
		"\3\2\2\2\u00a9\u00ab\7\26\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00aa\3\2\2"+
		"\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b6\7\33\2\2\u00ae"+
		"\u00af\7\13\2\2\u00af\u00b6\7\33\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b6"+
		"\7\33\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00b4\b\13\1\2\u00b4\u00b6\3\2\2"+
		"\2\u00b5\u0090\3\2\2\2\u00b5\u0095\3\2\2\2\u00b5\u0098\3\2\2\2\u00b5\u00a1"+
		"\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\5\30\r\2\u00b8\u00c2\7\31"+
		"\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\7\34\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\5\34\17\2\u00c2"+
		"\u00be\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\32"+
		"\2\2\u00c5\u00d8\3\2\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\7\31\2\2\u00c8"+
		"\u00d3\7\5\2\2\u00c9\u00cf\7\34\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc"+
		"\7\34\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d4\5\36\20\2\u00d3\u00c9\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\32\2\2\u00d6\u00d8\b\f\1\2\u00d7\u00b7"+
		"\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00da\7\30\2\2\u00da"+
		"\31\3\2\2\2\u00db\u00e3\7\30\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\7\35"+
		"\2\2\u00de\u00df\5\34\17\2\u00df\u00e0\7\36\2\2\u00e0\u00e1\b\16\1\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3\33\3\2\2"+
		"\2\u00e4\u00e5\b\17\1\2\u00e5\u00e6\7*\2\2\u00e6\u00f2\5\34\17\2\u00e7"+
		"\u00e8\7)\2\2\u00e8\u00f2\5\34\17\2\u00e9\u00f2\5\32\16\2\u00ea\u00f2"+
		"\5\26\f\2\u00eb\u00f2\5*\26\2\u00ec\u00ed\7\31\2\2\u00ed\u00ee\5\34\17"+
		"\2\u00ee\u00ef\7\32\2\2\u00ef\u00f0\b\17\1\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00e4\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2"+
		"\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f9\3\2\2\2\u00f3"+
		"\u00f4\6\17\2\3\u00f4\u00f5\5 \21\2\u00f5\u00f6\5\34\17\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\5\34\17"+
		"\2\u00fd\u00ff\7\5\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\37"+
		"\3\2\2\2\u0100\u0105\7+\2\2\u0101\u0105\5&\24\2\u0102\u0105\5(\25\2\u0103"+
		"\u0105\5$\23\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0103\3\2\2\2\u0105!\3\2\2\2\u0106\u0107\t\2\2\2\u0107#\3\2"+
		"\2\2\u0108\u0109\t\3\2\2\u0109%\3\2\2\2\u010a\u010b\t\4\2\2\u010b\'\3"+
		"\2\2\2\u010c\u010d\t\5\2\2\u010d)\3\2\2\2\u010e\u010f\t\6\2\2\u010f+\3"+
		"\2\2\2\32\628DPT[gsy\u0084\u008e\u009f\u00ab\u00b5\u00be\u00c2\u00cf\u00d3"+
		"\u00d7\u00e2\u00f1\u00f9\u00fe\u0104";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}