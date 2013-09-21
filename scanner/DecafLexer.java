// Generated from scanner/DecafLexer.g by ANTLR 4.1

package compiler.scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_LIT=1, CHAR_LIT=2, STRING_LIT=3, BOOL_LIT=4, COMMENT=5, WHITESPACE=6, 
		NEWLINE=7, PROGRAM=8, BREAK=9, IF=10, FOR=11, CONTINUE=12, CALLOUT=13, 
		BOOL_TRUE=14, BOOL_FALSE=15, BOOLEAN=16, VOID=17, CLASS=18, ELSE=19, RETURN=20, 
		INT=21, ID=22, LPAR=23, RPAR=24, SEMIC=25, COMMA=26, LBRACK=27, RBRACK=28, 
		LBRACE=29, RBRACE=30, EQUAL=31, NOT_EQUAL=32, GREATER=33, LESS=34, GTOE=35, 
		LTOE=36, AND=37, OR=38, NOT=39, SUBS=40, ARITH_OP=41, ASSIGN=42, ASSIGN_PLUS=43, 
		ASSIGN_SUBS=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT_LIT", "CHAR_LIT", "STRING_LIT", "BOOL_LIT", "COMMENT", "WHITESPACE", 
		"'\n'", "'Program'", "'break'", "'if'", "'for'", "'continue'", "'callout'", 
		"'true'", "'false'", "'boolean'", "'void'", "'class'", "'else'", "'return'", 
		"'int'", "ID", "'('", "')'", "';'", "','", "'['", "']'", "'{'", "'}'", 
		"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'!'", "'-'", 
		"ARITH_OP", "'='", "'+='", "'-='"
	};
	public static final String[] ruleNames = {
		"INT_LIT", "CHAR_LIT", "STRING_LIT", "BOOL_LIT", "COMMENT", "WHITESPACE", 
		"NEWLINE", "PROGRAM", "BREAK", "IF", "FOR", "CONTINUE", "CALLOUT", "BOOL_TRUE", 
		"BOOL_FALSE", "BOOLEAN", "VOID", "CLASS", "ELSE", "RETURN", "INT", "ID", 
		"LPAR", "RPAR", "SEMIC", "COMMA", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "GTOE", "LTOE", "AND", "OR", 
		"NOT", "SUBS", "ARITH_OP", "ASSIGN", "ASSIGN_PLUS", "ASSIGN_SUBS", "ALPHA", 
		"HEX_LIT", "HEXDIG", "DIGIT", "CHAR", "SEQUENCE", "PLUS", "TIMES", "DIV", 
		"MOD"
	};


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 5: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 6: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip(); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2.\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\6\2q\n\2\r\2\16\2r\3\2\5\2v\n\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\7\4~\n\4\f\4\16\4\u0081\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u0095"+
		"\n\6\f\6\16\6\u0098\13\6\3\6\5\6\u009b\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00fc"+
		"\n\27\3\27\3\27\3\27\7\27\u0101\n\27\f\27\16\27\u0104\13\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3*\3*\5*\u0134\n*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3"+
		"/\3/\3/\3/\6/\u0144\n/\r/\16/\u0145\3\60\3\60\5\60\u014a\n\60\3\61\3\61"+
		"\3\62\3\62\5\62\u0150\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u015c\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\28\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\2\r\b\3\17\t\4\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1"+
		"E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[\2\1]\2\1_\2\1a\2\1c\2\1"+
		"e\2\1g\2\1i\2\1k\2\1m\2\1\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\4\2CHch\6"+
		"\2\"#%(*]_\u0080\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3u\3\2\2\2\5w\3"+
		"\2\2\2\7{\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u009f\3\2\2\2\17"+
		"\u00a2\3\2\2\2\21\u00a5\3\2\2\2\23\u00ad\3\2\2\2\25\u00b3\3\2\2\2\27\u00b6"+
		"\3\2\2\2\31\u00ba\3\2\2\2\33\u00c3\3\2\2\2\35\u00cb\3\2\2\2\37\u00d0\3"+
		"\2\2\2!\u00d6\3\2\2\2#\u00de\3\2\2\2%\u00e3\3\2\2\2\'\u00e9\3\2\2\2)\u00ee"+
		"\3\2\2\2+\u00f5\3\2\2\2-\u00fb\3\2\2\2/\u0105\3\2\2\2\61\u0107\3\2\2\2"+
		"\63\u0109\3\2\2\2\65\u010b\3\2\2\2\67\u010d\3\2\2\29\u010f\3\2\2\2;\u0111"+
		"\3\2\2\2=\u0113\3\2\2\2?\u0115\3\2\2\2A\u0118\3\2\2\2C\u011b\3\2\2\2E"+
		"\u011d\3\2\2\2G\u011f\3\2\2\2I\u0122\3\2\2\2K\u0125\3\2\2\2M\u0128\3\2"+
		"\2\2O\u012b\3\2\2\2Q\u012d\3\2\2\2S\u0133\3\2\2\2U\u0135\3\2\2\2W\u0137"+
		"\3\2\2\2Y\u013a\3\2\2\2[\u013d\3\2\2\2]\u013f\3\2\2\2_\u0149\3\2\2\2a"+
		"\u014b\3\2\2\2c\u014f\3\2\2\2e\u015b\3\2\2\2g\u015d\3\2\2\2i\u015f\3\2"+
		"\2\2k\u0161\3\2\2\2m\u0163\3\2\2\2oq\5a\61\2po\3\2\2\2qr\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2sv\3\2\2\2tv\5]/\2up\3\2\2\2ut\3\2\2\2v\4\3\2\2\2wx\7)\2"+
		"\2xy\5c\62\2yz\7)\2\2z\6\3\2\2\2{\177\7$\2\2|~\5c\62\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7$\2\2\u0083\b\3\2\2\2\u0084\u0085\7v\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7w\2\2\u0087\u008e\7g\2\2\u0088\u0089\7h\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008e\7g\2\2"+
		"\u008d\u0084\3\2\2\2\u008d\u0088\3\2\2\2\u008e\n\3\2\2\2\u008f\u0090\7"+
		"\61\2\2\u0090\u0091\7\61\2\2\u0091\u0096\3\2\2\2\u0092\u0095\5c\62\2\u0093"+
		"\u0095\7)\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009b\7\17\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\b\6\2\2\u009e"+
		"\f\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\u00a1\b\7\3\2\u00a1\16\3\2\2\2\u00a2"+
		"\u00a3\7\f\2\2\u00a3\u00a4\b\b\4\2\u00a4\20\3\2\2\2\u00a5\u00a6\7R\2\2"+
		"\u00a6\u00a7\7t\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7i\2\2\u00a9\u00aa"+
		"\7t\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7o\2\2\u00ac\22\3\2\2\2\u00ad\u00ae"+
		"\7d\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7m\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\26\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\30\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7w\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7"+
		"c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9"+
		"\7w\2\2\u00c9\u00ca\7v\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2\u00cf\36\3\2\2\2\u00d0\u00d1"+
		"\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7q\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2"+
		"\u00dc\u00dd\7p\2\2\u00dd\"\3\2\2\2\u00de\u00df\7x\2\2\u00df\u00e0\7q"+
		"\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7f\2\2\u00e2$\3\2\2\2\u00e3\u00e4"+
		"\7e\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8&\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed(\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7t\2\2"+
		"\u00f3\u00f4\7p\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2"+
		"\2\u00f7\u00f8\7v\2\2\u00f8,\3\2\2\2\u00f9\u00fc\7a\2\2\u00fa\u00fc\5"+
		"[.\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u0102\3\2\2\2\u00fd"+
		"\u0101\5[.\2\u00fe\u0101\5a\61\2\u00ff\u0101\7a\2\2\u0100\u00fd\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103.\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7*\2\2\u0106\60\3\2\2\2\u0107\u0108\7+\2\2\u0108\62\3\2\2\2\u0109"+
		"\u010a\7=\2\2\u010a\64\3\2\2\2\u010b\u010c\7.\2\2\u010c\66\3\2\2\2\u010d"+
		"\u010e\7]\2\2\u010e8\3\2\2\2\u010f\u0110\7_\2\2\u0110:\3\2\2\2\u0111\u0112"+
		"\7}\2\2\u0112<\3\2\2\2\u0113\u0114\7\177\2\2\u0114>\3\2\2\2\u0115\u0116"+
		"\7?\2\2\u0116\u0117\7?\2\2\u0117@\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011a"+
		"\7?\2\2\u011aB\3\2\2\2\u011b\u011c\7@\2\2\u011cD\3\2\2\2\u011d\u011e\7"+
		">\2\2\u011eF\3\2\2\2\u011f\u0120\7@\2\2\u0120\u0121\7?\2\2\u0121H\3\2"+
		"\2\2\u0122\u0123\7>\2\2\u0123\u0124\7?\2\2\u0124J\3\2\2\2\u0125\u0126"+
		"\7(\2\2\u0126\u0127\7(\2\2\u0127L\3\2\2\2\u0128\u0129\7~\2\2\u0129\u012a"+
		"\7~\2\2\u012aN\3\2\2\2\u012b\u012c\7#\2\2\u012cP\3\2\2\2\u012d\u012e\7"+
		"/\2\2\u012eR\3\2\2\2\u012f\u0134\5g\64\2\u0130\u0134\5i\65\2\u0131\u0134"+
		"\5k\66\2\u0132\u0134\5m\67\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134T\3\2\2\2\u0135\u0136\7?\2\2\u0136"+
		"V\3\2\2\2\u0137\u0138\7-\2\2\u0138\u0139\7?\2\2\u0139X\3\2\2\2\u013a\u013b"+
		"\7/\2\2\u013b\u013c\7?\2\2\u013cZ\3\2\2\2\u013d\u013e\t\3\2\2\u013e\\"+
		"\3\2\2\2\u013f\u0140\7\62\2\2\u0140\u0141\7z\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0144\5_\60\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146^\3\2\2\2\u0147\u014a\5a\61\2\u0148\u014a"+
		"\t\4\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a`\3\2\2\2\u014b"+
		"\u014c\4\62;\2\u014cb\3\2\2\2\u014d\u0150\t\5\2\2\u014e\u0150\5e\63\2"+
		"\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150d\3\2\2\2\u0151\u0152\7"+
		"^\2\2\u0152\u015c\7^\2\2\u0153\u0154\7^\2\2\u0154\u015c\7$\2\2\u0155\u0156"+
		"\7^\2\2\u0156\u015c\7)\2\2\u0157\u0158\7^\2\2\u0158\u015c\7p\2\2\u0159"+
		"\u015a\7^\2\2\u015a\u015c\7v\2\2\u015b\u0151\3\2\2\2\u015b\u0153\3\2\2"+
		"\2\u015b\u0155\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015cf"+
		"\3\2\2\2\u015d\u015e\7-\2\2\u015eh\3\2\2\2\u015f\u0160\7,\2\2\u0160j\3"+
		"\2\2\2\u0161\u0162\7\61\2\2\u0162l\3\2\2\2\u0163\u0164\7\'\2\2\u0164n"+
		"\3\2\2\2\22\2ru\177\u008d\u0094\u0096\u009a\u00fb\u0100\u0102\u0133\u0145"+
		"\u0149\u014f\u015b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}