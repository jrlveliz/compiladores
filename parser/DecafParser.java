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
		HEX_LIT=2, CLASS=26, LBRACK=13, INT_LIT=1, BOOLEAN_LIT=5, STRING_LIT=4, 
		MOD=44, LBRACE=15, FOR=19, GTOE=35, NOT=39, ID=30, AND=37, BREAK=17, IF=18, 
		ASSIGN_OP=49, BOOLEAN=24, GREATER=33, LPAR=9, CONTINUE=20, COMMA=12, NOT_EQUAL=32, 
		BIN_OP=48, EQUAL=31, RETURN=28, LESS=34, ASSIGN_SUBS=47, PLUS=40, VOID=25, 
		COMMENT=7, BOOL_FALSE=23, CALLOUT=21, RBRACK=14, SUBS=41, RBRACE=16, ELSE=27, 
		WHITESPACE=8, LITERAL=50, INT=29, CHAR_LIT=3, OR=38, ASSIGN=45, LTOE=36, 
		PROGRAM=6, RPAR=10, ASSIGN_PLUS=46, DIV=43, SEMIC=11, TIMES=42, BOOL_TRUE=22;
	public static final String[] tokenNames = {
		"<INVALID>", "INT_LIT", "HEX_LIT", "CHAR_LIT", "STRING_LIT", "BOOLEAN_LIT", 
		"'Program'", "COMMENT", "WHITESPACE", "'('", "')'", "';'", "','", "'['", 
		"']'", "'{'", "'}'", "'break'", "'if'", "'for'", "'continue'", "'callout'", 
		"'true'", "'false'", "'boolean'", "'void'", "'class'", "'else'", "'return'", 
		"'int'", "ID", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", 
		"'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "BIN_OP", 
		"ASSIGN_OP", "LITERAL"
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
			setState(41); type();
			{
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(42); match(ID);
						}
						break;

					case 2:
						{
						setState(43); match(ID);
						setState(44); match(LBRACK);
						setState(45); match(INT_LIT);
						setState(46); match(RBRACK);
						}
						break;
					}
					setState(49); match(COMMA);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(55); match(ID);
				}
				break;

			case 2:
				{
				setState(56); match(ID);
				setState(57); match(LBRACK);
				setState(58); match(INT_LIT);
				setState(59); match(RBRACK);
				}
				break;
			}
			}
			setState(62); match(SEMIC);
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
			setState(66);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(64); type();
				}
				break;
			case VOID:
				{
				setState(65); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(68); match(ID);
			setState(69); match(LPAR);
			setState(82);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(70); type();
						setState(71); match(ID);
						setState(72); match(COMMA);
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				{
				setState(79); type();
				setState(80); match(ID);
				}
				}
			}

			setState(84); match(RPAR);
			setState(85); block();
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
			setState(87); match(LBRACE);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(88); var_decl();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(94); statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(RBRACE);
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
			setState(102); type();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(103); match(ID);
					setState(104); match(COMMA);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(110); match(ID);
			setState(111); match(SEMIC);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(DecafParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode EQUAL() { return getToken(DecafParser.EQUAL, 0); }
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
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); location();
				setState(116); match(ASSIGN_OP);
				setState(117); expr(0);
				setState(118); match(SEMIC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); method_call();
				setState(121); match(SEMIC);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); match(IF);
				setState(124); match(LPAR);
				setState(125); expr(0);
				setState(126); match(RPAR);
				setState(127); block();
				setState(130);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(128); match(ELSE);
					setState(129); block();
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132); match(FOR);
				setState(133); match(ID);
				setState(134); match(EQUAL);
				setState(135); expr(0);
				setState(136); match(COMMA);
				setState(137); expr(0);
				setState(138); block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140); match(RETURN);
				setState(142);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << CALLOUT) | (1L << ID) | (1L << NOT) | (1L << SUBS) | (1L << LITERAL))) != 0)) {
					{
					setState(141); expr(0);
					}
				}

				setState(144); match(SEMIC);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145); match(BREAK);
				setState(146); match(SEMIC);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147); match(CONTINUE);
				setState(148); match(SEMIC);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(149); block();
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
			setState(183);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); method_name();
				setState(153); match(LPAR);
				setState(163);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << CALLOUT) | (1L << ID) | (1L << NOT) | (1L << SUBS) | (1L << LITERAL))) != 0)) {
					{
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(154); expr(0);
							setState(155); match(COMMA);
							}
							} 
						}
						setState(161);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(162); expr(0);
					}
				}

				setState(165); match(RPAR);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); match(CALLOUT);
				setState(168); match(LPAR);
				setState(169); match(STRING_LIT);
				setState(180);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(170); match(COMMA);
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(171); callout_arg();
							setState(172); match(COMMA);
							}
							} 
						}
						setState(178);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(179); callout_arg();
					}
				}

				setState(182); match(RPAR);
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
			setState(185); match(ID);
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
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(ID);
				setState(189); match(LBRACK);
				setState(190); expr(0);
				setState(191); match(RBRACK);
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
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(196); match(SUBS);
				setState(197); expr(3);
				}
				break;

			case 2:
				{
				setState(198); match(NOT);
				setState(199); expr(2);
				}
				break;

			case 3:
				{
				setState(200); location();
				}
				break;

			case 4:
				{
				setState(201); method_call();
				}
				break;

			case 5:
				{
				setState(202); match(LITERAL);
				}
				break;

			case 6:
				{
				setState(203); match(LPAR);
				setState(204); expr(0);
				setState(205); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
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
					setState(209);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(210); match(BIN_OP);
					setState(211); expr(5);
					}
					} 
				}
				setState(216);
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
		enterRule(_localctx, 22, RULE_callout_arg);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case LPAR:
			case CALLOUT:
			case ID:
			case NOT:
			case SUBS:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); expr(0);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(STRING_LIT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\64\u00e0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3"+
		"\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\4\3"+
		"\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3"+
		"\4\5\4U\n\4\3\4\3\4\3\4\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\7\5b\n\5"+
		"\f\5\16\5e\13\5\3\5\3\5\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0085\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0091\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0099\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00a0\n\t"+
		"\f\t\16\t\u00a3\13\t\3\t\5\t\u00a6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3\t\5\t\u00b7\n\t\3\t\5\t\u00ba"+
		"\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c4\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d2\n\f\3\f\3\f\3\f\7\f\u00d7"+
		"\n\f\f\f\16\f\u00da\13\f\3\r\3\r\5\r\u00de\n\r\3\r\2\16\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\2\3\4\2\32\32\37\37\u00f4\2\32\3\2\2\2\4+\3\2\2\2\6D\3"+
		"\2\2\2\bY\3\2\2\2\nh\3\2\2\2\fs\3\2\2\2\16\u0098\3\2\2\2\20\u00b9\3\2"+
		"\2\2\22\u00bb\3\2\2\2\24\u00c3\3\2\2\2\26\u00d1\3\2\2\2\30\u00dd\3\2\2"+
		"\2\32\33\7\34\2\2\33\34\7\b\2\2\34 \7\21\2\2\35\37\5\4\3\2\36\35\3\2\2"+
		"\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!&\3\2\2\2\" \3\2\2\2#%\5\6\4\2$"+
		"#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\22\2"+
		"\2*\3\3\2\2\2+\66\5\f\7\2,\62\7 \2\2-.\7 \2\2./\7\17\2\2/\60\7\3\2\2\60"+
		"\62\7\20\2\2\61,\3\2\2\2\61-\3\2\2\2\62\63\3\2\2\2\63\65\7\16\2\2\64\61"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67>\3\2\2\28\66\3\2\2"+
		"\29?\7 \2\2:;\7 \2\2;<\7\17\2\2<=\7\3\2\2=?\7\20\2\2>9\3\2\2\2>:\3\2\2"+
		"\2?@\3\2\2\2@A\7\r\2\2A\5\3\2\2\2BE\5\f\7\2CE\7\33\2\2DB\3\2\2\2DC\3\2"+
		"\2\2EF\3\2\2\2FG\7 \2\2GT\7\13\2\2HI\5\f\7\2IJ\7 \2\2JK\7\16\2\2KM\3\2"+
		"\2\2LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\f"+
		"\7\2RS\7 \2\2SU\3\2\2\2TN\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\f\2\2WX\5\b"+
		"\5\2X\7\3\2\2\2Y]\7\21\2\2Z\\\5\n\6\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]"+
		"^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5\16\b\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\22\2\2g\t\3\2\2\2hm\5\f\7\2ij\7 \2"+
		"\2jl\7\16\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2"+
		"\2\2pq\7 \2\2qr\7\r\2\2r\13\3\2\2\2st\t\2\2\2t\r\3\2\2\2uv\5\24\13\2v"+
		"w\7\63\2\2wx\5\26\f\2xy\7\r\2\2y\u0099\3\2\2\2z{\5\20\t\2{|\7\r\2\2|\u0099"+
		"\3\2\2\2}~\7\24\2\2~\177\7\13\2\2\177\u0080\5\26\f\2\u0080\u0081\7\f\2"+
		"\2\u0081\u0084\5\b\5\2\u0082\u0083\7\35\2\2\u0083\u0085\5\b\5\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0099\3\2\2\2\u0086\u0087\7\25"+
		"\2\2\u0087\u0088\7 \2\2\u0088\u0089\7!\2\2\u0089\u008a\5\26\f\2\u008a"+
		"\u008b\7\16\2\2\u008b\u008c\5\26\f\2\u008c\u008d\5\b\5\2\u008d\u0099\3"+
		"\2\2\2\u008e\u0090\7\36\2\2\u008f\u0091\5\26\f\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0099\7\r\2\2\u0093\u0094\7\23"+
		"\2\2\u0094\u0099\7\r\2\2\u0095\u0096\7\26\2\2\u0096\u0099\7\r\2\2\u0097"+
		"\u0099\5\b\5\2\u0098u\3\2\2\2\u0098z\3\2\2\2\u0098}\3\2\2\2\u0098\u0086"+
		"\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0095\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\17\3\2\2\2\u009a\u009b\5\22\n\2\u009b\u00a5\7\13"+
		"\2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\16\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\5\26\f\2\u00a5"+
		"\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\f"+
		"\2\2\u00a8\u00ba\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\7\13\2\2\u00ab"+
		"\u00b6\7\6\2\2\u00ac\u00b2\7\16\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\7"+
		"\16\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00ac\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\7\f\2\2\u00b9\u009a\3\2\2\2\u00b9\u00a9\3\2"+
		"\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\7 \2\2\u00bc\23\3\2\2\2\u00bd\u00c4"+
		"\7 \2\2\u00be\u00bf\7 \2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\5\26\f\2\u00c1"+
		"\u00c2\7\20\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3"+
		"\2\2\2\u00c4\25\3\2\2\2\u00c5\u00c6\b\f\1\2\u00c6\u00c7\7+\2\2\u00c7\u00d2"+
		"\5\26\f\2\u00c8\u00c9\7)\2\2\u00c9\u00d2\5\26\f\2\u00ca\u00d2\5\24\13"+
		"\2\u00cb\u00d2\5\20\t\2\u00cc\u00d2\7\64\2\2\u00cd\u00ce\7\13\2\2\u00ce"+
		"\u00cf\5\26\f\2\u00cf\u00d0\7\f\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c5\3"+
		"\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1"+
		"\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\6\f"+
		"\2\3\u00d4\u00d5\7\62\2\2\u00d5\u00d7\5\26\f\2\u00d6\u00d3\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\27\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00de\5\26\f\2\u00dc\u00de\7\6\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\31\3\2\2\2\31 &\61\66>DNT]cm"+
		"\u0084\u0090\u0098\u00a1\u00a5\u00b2\u00b6\u00b9\u00c3\u00d1\u00d8\u00dd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}