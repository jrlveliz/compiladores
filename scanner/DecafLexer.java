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
		INT_LIT=1, HEX_LIT=2, CHAR_LIT=3, STRING_LIT=4, BOOLEAN_LIT=5, ID=6, COMMENT=7, 
		WHITESPACE=8, LPAR=9, RPAR=10, SEMIC=11, COMMA=12, LBRACK=13, RBRACK=14, 
		LBRACE=15, RBRACE=16, BREAK=17, IF=18, FOR=19, CONTINUE=20, CALLOUT=21, 
		BOOL_TRUE=22, BOOL_FALSE=23, BOOLEAN=24, VOID=25, CLASS=26, ELSE=27, RETURN=28, 
		INT=29, EQUAL=30, NOT_EQUAL=31, GREATER=32, LESS=33, GTOE=34, LTOE=35, 
		AND=36, OR=37, NOT=38, PLUS=39, SUBS=40, TIMES=41, DIV=42, MOD=43, ASSIGN=44, 
		ASSIGN_PLUS=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT_LIT", "HEX_LIT", "CHAR_LIT", "STRING_LIT", "BOOLEAN_LIT", "ID", "COMMENT", 
		"WHITESPACE", "'('", "')'", "';'", "','", "'['", "']'", "'{'", "'}'", 
		"'break'", "'if'", "'for'", "'continue'", "'callout'", "'true'", "'false'", 
		"'boolean'", "'void'", "'class'", "'else'", "'return'", "'int'", "'=='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'!'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'='", "'+='"
	};
	public static final String[] ruleNames = {
		"INT_LIT", "HEX_LIT", "CHAR_LIT", "STRING_LIT", "BOOLEAN_LIT", "ID", "BOOL", 
		"ALPHA", "HEXDIG", "DIGIT", "CHAR", "SEQUENCE", "COMMENT", "WHITESPACE", 
		"LPAR", "RPAR", "SEMIC", "COMMA", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"BREAK", "IF", "FOR", "CONTINUE", "CALLOUT", "BOOL_TRUE", "BOOL_FALSE", 
		"BOOLEAN", "VOID", "CLASS", "ELSE", "RETURN", "INT", "EQUAL", "NOT_EQUAL", 
		"GREATER", "LESS", "GTOE", "LTOE", "AND", "OR", "NOT", "PLUS", "SUBS", 
		"TIMES", "DIV", "MOD", "ASSIGN", "ASSIGN_PLUS"
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
		case 12: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2/\u0147\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\6\2k\n\2\r\2\16\2l\3\2\5\2p\n\2\3\3\3\3\3\3\3\3\6\3v\n\3\r\3\16"+
		"\3w\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7\7\7\u0090\n\7\f\7\16\7\u0093"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\n\3"+
		"\n\5\n\u00a4\n\n\3\13\3\13\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00bd\n"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*"+
		"\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\2\65\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\t\2\35\n\1\37\13\1!\f\1"+
		"#\r\1%\16\1\'\17\1)\20\1+\21\1-\22\1/\23\1\61\24\1\63\25\1\65\26\1\67"+
		"\27\19\30\1;\31\1=\32\1?\33\1A\34\1C\35\1E\36\1G\37\1I \1K!\1M\"\1O#\1"+
		"Q$\1S%\1U&\1W\'\1Y(\1[)\1]*\1_+\1a,\1c-\1e.\1g/\1\3\2\7\4\2C\\c|\4\2C"+
		"Hch\6\2\"#%(*]_\u0080\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0150\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7y\3\2\2\2\t}\3\2\2\2\13\u0086"+
		"\3\2\2\2\r\u008a\3\2\2\2\17\u009d\3\2\2\2\21\u009f\3\2\2\2\23\u00a3\3"+
		"\2\2\2\25\u00a5\3\2\2\2\27\u00a9\3\2\2\2\31\u00b5\3\2\2\2\33\u00b7\3\2"+
		"\2\2\35\u00c2\3\2\2\2\37\u00c4\3\2\2\2!\u00c6\3\2\2\2#\u00c8\3\2\2\2%"+
		"\u00ca\3\2\2\2\'\u00cc\3\2\2\2)\u00ce\3\2\2\2+\u00d0\3\2\2\2-\u00d2\3"+
		"\2\2\2/\u00d4\3\2\2\2\61\u00da\3\2\2\2\63\u00dd\3\2\2\2\65\u00e1\3\2\2"+
		"\2\67\u00ea\3\2\2\29\u00f2\3\2\2\2;\u00f7\3\2\2\2=\u00fd\3\2\2\2?\u0105"+
		"\3\2\2\2A\u010a\3\2\2\2C\u0110\3\2\2\2E\u0115\3\2\2\2G\u011c\3\2\2\2I"+
		"\u0120\3\2\2\2K\u0123\3\2\2\2M\u0126\3\2\2\2O\u0128\3\2\2\2Q\u012a\3\2"+
		"\2\2S\u012d\3\2\2\2U\u0130\3\2\2\2W\u0133\3\2\2\2Y\u0136\3\2\2\2[\u0138"+
		"\3\2\2\2]\u013a\3\2\2\2_\u013c\3\2\2\2a\u013e\3\2\2\2c\u0140\3\2\2\2e"+
		"\u0142\3\2\2\2g\u0144\3\2\2\2ik\5\25\13\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2mp\3\2\2\2np\5\5\3\2oj\3\2\2\2on\3\2\2\2p\4\3\2\2\2qr\7\62"+
		"\2\2rs\7z\2\2su\3\2\2\2tv\5\23\n\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2"+
		"\2\2x\6\3\2\2\2yz\7)\2\2z{\5\27\f\2{|\7)\2\2|\b\3\2\2\2}\u0081\7$\2\2"+
		"~\u0080\5\27\f\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7$"+
		"\2\2\u0085\n\3\2\2\2\u0086\u0087\5\17\b\2\u0087\f\3\2\2\2\u0088\u008b"+
		"\7a\2\2\u0089\u008b\5\21\t\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u0091\3\2\2\2\u008c\u0090\5\21\t\2\u008d\u0090\5\25\13\2\u008e\u0090"+
		"\7a\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\16\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097"+
		"\7w\2\2\u0097\u009e\7g\2\2\u0098\u0099\7h\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009e\7g\2\2\u009d\u0094\3\2\2"+
		"\2\u009d\u0098\3\2\2\2\u009e\20\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\22\3"+
		"\2\2\2\u00a1\u00a4\5\25\13\2\u00a2\u00a4\t\3\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\4\62;\2\u00a6\26\3\2\2\2\u00a7"+
		"\u00aa\t\4\2\2\u00a8\u00aa\5\31\r\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7^\2\2\u00ac\u00b6\7^\2\2\u00ad\u00ae"+
		"\7^\2\2\u00ae\u00b6\7$\2\2\u00af\u00b0\7^\2\2\u00b0\u00b6\7)\2\2\u00b1"+
		"\u00b2\7^\2\2\u00b2\u00b6\7p\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b6\7v\2\2"+
		"\u00b5\u00ab\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8"+
		"\u00b9\7\61\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\n\5\2\2\u00bb\u00bd\7"+
		"\17\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7\f\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\16\2\2\u00c1\34\3\2\2"+
		"\2\u00c2\u00c3\t\6\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7*\2\2\u00c5 \3\2"+
		"\2\2\u00c6\u00c7\7+\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7=\2\2\u00c9$\3\2"+
		"\2\2\u00ca\u00cb\7.\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7]\2\2\u00cd(\3\2\2"+
		"\2\u00ce\u00cf\7_\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7}\2\2\u00d1,\3\2\2\2"+
		"\u00d2\u00d3\7\177\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7"+
		"t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7m\2\2\u00d9\60"+
		"\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dc\62\3\2\2\2\u00dd"+
		"\u00de\7h\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\64\3\2\2\2\u00e1"+
		"\u00e2\7e\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2"+
		"\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed"+
		"\7n\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7w\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f18\3\2\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7t\2\2\u00f4"+
		"\u00f5\7w\2\2\u00f5\u00f6\7g\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8"+
		"\u00f9\7c\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc<\3\2\2\2\u00fd\u00fe\7d\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7q\2"+
		"\2\u0100\u0101\7n\2\2\u0101\u0102\7g\2\2\u0102\u0103\7c\2\2\u0103\u0104"+
		"\7p\2\2\u0104>\3\2\2\2\u0105\u0106\7x\2\2\u0106\u0107\7q\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7f\2\2\u0109@\3\2\2\2\u010a\u010b\7e\2\2\u010b\u010c"+
		"\7n\2\2\u010c\u010d\7c\2\2\u010d\u010e\7u\2\2\u010e\u010f\7u\2\2\u010f"+
		"B\3\2\2\2\u0110\u0111\7g\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113"+
		"\u0114\7g\2\2\u0114D\3\2\2\2\u0115\u0116\7t\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7v\2\2\u0118\u0119\7w\2\2\u0119\u011a\7t\2\2\u011a\u011b\7p\2\2"+
		"\u011bF\3\2\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f\7v\2"+
		"\2\u011fH\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122\7?\2\2\u0122J\3\2\2\2"+
		"\u0123\u0124\7#\2\2\u0124\u0125\7?\2\2\u0125L\3\2\2\2\u0126\u0127\7@\2"+
		"\2\u0127N\3\2\2\2\u0128\u0129\7>\2\2\u0129P\3\2\2\2\u012a\u012b\7@\2\2"+
		"\u012b\u012c\7?\2\2\u012cR\3\2\2\2\u012d\u012e\7>\2\2\u012e\u012f\7?\2"+
		"\2\u012fT\3\2\2\2\u0130\u0131\7(\2\2\u0131\u0132\7(\2\2\u0132V\3\2\2\2"+
		"\u0133\u0134\7~\2\2\u0134\u0135\7~\2\2\u0135X\3\2\2\2\u0136\u0137\7#\2"+
		"\2\u0137Z\3\2\2\2\u0138\u0139\7-\2\2\u0139\\\3\2\2\2\u013a\u013b\7/\2"+
		"\2\u013b^\3\2\2\2\u013c\u013d\7,\2\2\u013d`\3\2\2\2\u013e\u013f\7\61\2"+
		"\2\u013fb\3\2\2\2\u0140\u0141\7\'\2\2\u0141d\3\2\2\2\u0142\u0143\7?\2"+
		"\2\u0143f\3\2\2\2\u0144\u0145\7-\2\2\u0145\u0146\7?\2\2\u0146h\3\2\2\2"+
		"\17\2low\u0081\u008a\u008f\u0091\u009d\u00a3\u00a9\u00b5\u00bc";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}