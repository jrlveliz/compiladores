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
		HEX_LIT=3, CLASS=20, LBRACK=29, INT_LIT=2, BOOLEAN_LIT=6, STRING_LIT=5, 
		MOD=46, LBRACE=31, FOR=13, GTOE=37, NOT=41, ID=24, AND=39, BREAK=11, IF=12, 
		ASSIGN_OP=47, BOOLEAN=18, GREATER=35, LPAR=25, CONTINUE=14, COMMA=28, 
		NOT_EQUAL=34, BIN_OP=51, EQUAL=33, ASSIGN_SUBS=50, RETURN=22, LESS=36, 
		PLUS=42, VOID=19, COMMENT=8, BOOL_FALSE=17, CALLOUT=15, RBRACK=30, SUBS=43, 
		RBRACE=32, ELSE=21, WHITESPACE=9, LITERAL=1, INT=23, CHAR_LIT=4, NEWLINE=10, 
		OR=40, ASSIGN=48, LTOE=38, PROGRAM=7, RPAR=26, ASSIGN_PLUS=49, DIV=45, 
		SEMIC=27, TIMES=44, BOOL_TRUE=16;
	public static final String[] tokenNames = {
		"<INVALID>", "LITERAL", "INT_LIT", "HEX_LIT", "CHAR_LIT", "STRING_LIT", 
		"BOOLEAN_LIT", "'Program'", "COMMENT", "WHITESPACE", "'\n'", "'break'", 
		"'if'", "'for'", "'continue'", "'callout'", "'true'", "'false'", "'boolean'", 
		"'void'", "'class'", "'else'", "'return'", "'int'", "ID", "'('", "')'", 
		"';'", "','", "'['", "']'", "'{'", "'}'", "'=='", "'!='", "'>'", "'<'", 
		"'>='", "'<='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"ASSIGN_OP", "'='", "'+='", "'-='", "BIN_OP"
	};
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_statement = 6, RULE_method_call = 7, 
		RULE_method_name = 8, RULE_location = 9, RULE_expr = 10, RULE_callout_arg = 11;
	public static final String[] ruleNames = {
		"program", "field_decl", "method_decl", "block", "var_decl", "type", "statement", 
		"method_call", "method_name", "location", "expr", "callout_arg"
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(CLASS);
			setState(25); match(PROGRAM);
			setState(26); match(LBRACE);
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(27); field_decl();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << VOID) | (1L << INT))) != 0)) {
				{
				{
				setState(33); method_decl();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39); match(RBRACE);
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
		public List<TerminalNode> RBRACK() { return getTokens(DecafParser.RBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(DecafParser.LBRACK, i);
		}
		public TerminalNode RBRACK(int i) {
			return getToken(DecafParser.RBRACK, i);
		}
		public List<TerminalNode> INT_LIT() { return getTokens(DecafParser.INT_LIT); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_LIT(int i) {
			return getToken(DecafParser.INT_LIT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(DecafParser.LBRACK); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
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
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42); type();
			{
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(43); match(ID);
						}
						break;

					case 2:
						{
						setState(44); match(ID);
						setState(45); match(LBRACK);
						setState(46); match(INT_LIT);
						setState(47); match(RBRACK);
						}
						break;
					}
					setState(50); match(COMMA);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(56); match(ID);
				}
				break;

			case 2:
				{
				setState(57); match(ID);
				setState(58); match(LBRACK);
				setState(59); match(INT_LIT);
				setState(60); match(RBRACK);
				}
				break;
			}
			}
			setState(63); match(SEMIC);
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
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(66); type();
				}
				break;
			case VOID:
				{
				setState(67); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70); match(ID);
			setState(71); match(LPAR);
			setState(84);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(72); type();
						setState(73); match(ID);
						setState(74); match(COMMA);
						}
						} 
					}
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				{
				setState(81); type();
				setState(82); match(ID);
				}
				}
			}

			setState(86); match(RPAR);
			setState(87); block();
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(LBRACE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(91); var_decl();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << RETURN) | (1L << ID) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(97); statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(RBRACE);
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
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106); type();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(107); match(ID);
					setState(108); match(COMMA);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(114); match(ID);
			setState(115); match(SEMIC);
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
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(BOOLEAN);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(DecafParser.ASSIGN, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode ASSIGN_OP() { return getToken(DecafParser.ASSIGN_OP, 0); }
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
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); location();
				setState(124); match(ASSIGN_OP);
				setState(125); expr(0);
				setState(126); match(SEMIC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); method_call();
				setState(129); match(SEMIC);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131); match(IF);
				setState(132); match(LPAR);
				setState(133); expr(0);
				setState(134); match(RPAR);
				setState(135); block();
				setState(138);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(136); match(ELSE);
					setState(137); block();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); match(FOR);
				setState(141); match(ID);
				setState(142); match(ASSIGN);
				setState(143); expr(0);
				setState(144); match(COMMA);
				setState(145); expr(0);
				setState(146); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148); match(RETURN);
				setState(150);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << CALLOUT) | (1L << ID) | (1L << LPAR) | (1L << NOT) | (1L << SUBS))) != 0)) {
					{
					setState(149); expr(0);
					}
				}

				setState(152); match(SEMIC);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153); match(BREAK);
				setState(154); match(SEMIC);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155); match(CONTINUE);
				setState(156); match(SEMIC);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(157); block();
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
		enterRule(_localctx, 14, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(194);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); method_name();
				setState(163); match(LPAR);
				setState(173);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << CALLOUT) | (1L << ID) | (1L << LPAR) | (1L << NOT) | (1L << SUBS))) != 0)) {
					{
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(164); expr(0);
							setState(165); match(COMMA);
							}
							} 
						}
						setState(171);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					setState(172); expr(0);
					}
				}

				setState(175); match(RPAR);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(CALLOUT);
				setState(178); match(LPAR);
				setState(179); match(STRING_LIT);
				setState(190);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(180); match(COMMA);
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(181); callout_arg();
							setState(182); match(COMMA);
							}
							} 
						}
						setState(188);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					setState(189); callout_arg();
					}
				}

				setState(192); match(RPAR);
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
		enterRule(_localctx, 16, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(ID);
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
		enterRule(_localctx, 18, RULE_location);
		try {
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); match(ID);
				setState(200); match(LBRACK);
				setState(201); expr(0);
				setState(202); match(RBRACK);
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
		public TerminalNode LITERAL() { return getToken(DecafParser.LITERAL, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DecafParser.NOT, 0); }
		public TerminalNode SUBS() { return getToken(DecafParser.SUBS, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode BIN_OP() { return getToken(DecafParser.BIN_OP, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(208); match(SUBS);
				setState(209); expr(3);
				}
				break;

			case 2:
				{
				setState(210); match(NOT);
				setState(211); expr(2);
				}
				break;

			case 3:
				{
				setState(212); location();
				}
				break;

			case 4:
				{
				setState(213); method_call();
				}
				break;

			case 5:
				{
				setState(214); match(LITERAL);
				}
				break;

			case 6:
				{
				setState(215); match(LPAR);
				setState(216); expr(0);
				setState(217); match(RPAR);
				CC4Parser.detectRule("EXPRESION RULE");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(222);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(223); match(BIN_OP);
					setState(224); expr(5);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 22, RULE_callout_arg);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case LITERAL:
			case CALLOUT:
			case ID:
			case LPAR:
			case NOT:
			case SUBS:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); expr(0);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(STRING_LIT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\65\u00ed\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3"+
		"\3\3\4\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4\3"+
		"\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3"+
		"\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s"+
		"\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0099\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a3"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\t\5\t\u00b0"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be"+
		"\13\t\3\t\5\t\u00c1\n\t\3\t\3\t\5\t\u00c5\n\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00d0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00df\n\f\3\f\3\f\3\f\7\f\u00e4\n\f\f\f\16\f\u00e7"+
		"\13\f\3\r\3\r\5\r\u00eb\n\r\3\r\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2"+
		"\u0102\2\32\3\2\2\2\4,\3\2\2\2\6F\3\2\2\2\b\\\3\2\2\2\nl\3\2\2\2\f{\3"+
		"\2\2\2\16\u00a2\3\2\2\2\20\u00c4\3\2\2\2\22\u00c6\3\2\2\2\24\u00cf\3\2"+
		"\2\2\26\u00de\3\2\2\2\30\u00ea\3\2\2\2\32\33\7\26\2\2\33\34\7\t\2\2\34"+
		" \7!\2\2\35\37\5\4\3\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2"+
		"\2!&\3\2\2\2\" \3\2\2\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2"+
		"\2\2\')\3\2\2\2(&\3\2\2\2)*\7\"\2\2*+\b\2\1\2+\3\3\2\2\2,\67\5\f\7\2-"+
		"\63\7\32\2\2./\7\32\2\2/\60\7\37\2\2\60\61\7\4\2\2\61\63\7 \2\2\62-\3"+
		"\2\2\2\62.\3\2\2\2\63\64\3\2\2\2\64\66\7\36\2\2\65\62\3\2\2\2\669\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\28?\3\2\2\29\67\3\2\2\2:@\7\32\2\2;<\7\32"+
		"\2\2<=\7\37\2\2=>\7\4\2\2>@\7 \2\2?:\3\2\2\2?;\3\2\2\2@A\3\2\2\2AB\7\35"+
		"\2\2BC\b\3\1\2C\5\3\2\2\2DG\5\f\7\2EG\7\25\2\2FD\3\2\2\2FE\3\2\2\2GH\3"+
		"\2\2\2HI\7\32\2\2IV\7\33\2\2JK\5\f\7\2KL\7\32\2\2LM\7\36\2\2MO\3\2\2\2"+
		"NJ\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\f\7\2"+
		"TU\7\32\2\2UW\3\2\2\2VP\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\34\2\2YZ\5\b\5"+
		"\2Z[\b\4\1\2[\7\3\2\2\2\\`\7!\2\2]_\5\n\6\2^]\3\2\2\2_b\3\2\2\2`^\3\2"+
		"\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\16\b\2dc\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\"\2\2jk\b\5\1\2k\t\3\2\2\2lq"+
		"\5\f\7\2mn\7\32\2\2np\7\36\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rt\3\2\2\2sq\3\2\2\2tu\7\32\2\2uv\7\35\2\2vw\b\6\1\2w\13\3\2\2\2x|\7\31"+
		"\2\2yz\7\24\2\2z|\b\7\1\2{x\3\2\2\2{y\3\2\2\2|\r\3\2\2\2}~\5\24\13\2~"+
		"\177\7\61\2\2\177\u0080\5\26\f\2\u0080\u0081\7\35\2\2\u0081\u00a3\3\2"+
		"\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\35\2\2\u0084\u00a3\3\2\2\2\u0085"+
		"\u0086\7\16\2\2\u0086\u0087\7\33\2\2\u0087\u0088\5\26\f\2\u0088\u0089"+
		"\7\34\2\2\u0089\u008c\5\b\5\2\u008a\u008b\7\27\2\2\u008b\u008d\5\b\5\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u00a3\3\2\2\2\u008e\u008f"+
		"\7\17\2\2\u008f\u0090\7\32\2\2\u0090\u0091\7\62\2\2\u0091\u0092\5\26\f"+
		"\2\u0092\u0093\7\36\2\2\u0093\u0094\5\26\f\2\u0094\u0095\5\b\5\2\u0095"+
		"\u00a3\3\2\2\2\u0096\u0098\7\30\2\2\u0097\u0099\5\26\f\2\u0098\u0097\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a3\7\35\2\2\u009b"+
		"\u009c\7\r\2\2\u009c\u00a3\7\35\2\2\u009d\u009e\7\20\2\2\u009e\u00a3\7"+
		"\35\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\b\b\1\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"}\3\2\2\2\u00a2\u0082\3\2\2\2\u00a2\u0085\3\2\2\2\u00a2\u008e\3\2\2\2"+
		"\u00a2\u0096\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009f"+
		"\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00af\7\33\2\2\u00a6"+
		"\u00a7\5\26\f\2\u00a7\u00a8\7\36\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a6\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\5\26\f\2\u00af\u00ab\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\34\2\2\u00b2"+
		"\u00c5\3\2\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\7\33\2\2\u00b5\u00c0\7"+
		"\7\2\2\u00b6\u00bc\7\36\2\2\u00b7\u00b8\5\30\r\2\u00b8\u00b9\7\36\2\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\5\30\r\2\u00c0\u00b6\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c5\b\t\1\2\u00c4\u00a4\3\2\2\2\u00c4"+
		"\u00b3\3\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c7\7\32\2\2\u00c7\23\3\2\2\2"+
		"\u00c8\u00d0\7\32\2\2\u00c9\u00ca\7\32\2\2\u00ca\u00cb\7\37\2\2\u00cb"+
		"\u00cc\5\26\f\2\u00cc\u00cd\7 \2\2\u00cd\u00ce\b\13\1\2\u00ce\u00d0\3"+
		"\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00d0\25\3\2\2\2\u00d1"+
		"\u00d2\b\f\1\2\u00d2\u00d3\7-\2\2\u00d3\u00df\5\26\f\2\u00d4\u00d5\7+"+
		"\2\2\u00d5\u00df\5\26\f\2\u00d6\u00df\5\24\13\2\u00d7\u00df\5\20\t\2\u00d8"+
		"\u00df\7\3\2\2\u00d9\u00da\7\33\2\2\u00da\u00db\5\26\f\2\u00db\u00dc\7"+
		"\34\2\2\u00dc\u00dd\b\f\1\2\u00dd\u00df\3\2\2\2\u00de\u00d1\3\2\2\2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2"+
		"\2\2\u00de\u00d9\3\2\2\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\6\f\2\3\u00e1"+
		"\u00e2\7\65\2\2\u00e2\u00e4\5\26\f\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\27\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00eb\5\26\f\2\u00e9\u00eb\7\7\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\31\3\2\2\2\32 &\62\67?FPV`fq{\u008c\u0098"+
		"\u00a2\u00ab\u00af\u00bc\u00c0\u00c4\u00cf\u00de\u00e5\u00ea";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}