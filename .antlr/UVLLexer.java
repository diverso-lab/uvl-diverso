// Generated from /home/pabpazjim/diverso/uvl-diverso/uvl-diverso/uvlparser/uvlparser/UVL.g4 by ANTLR 4.8

from antlr_denter.DenterHelper import DenterHelper
from UVLParser import UVLParser

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UVLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, RELATION_WORD=19, WORD=20, BOOLEAN=21, NUMBER=22, VECTOR=23, 
		NL=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "INT", "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", "VECTOR", 
			"NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'namespace'", "'features'", "'.'", "'{}'", "'{'", "','", "'}'", 
			"'\"'", "'constraints'", "'!'", "'&'", "'|'", "'=>'", "'<=>'", "'requires'", 
			"'excludes'", "'imports'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "RELATION_WORD", "WORD", "BOOLEAN", 
			"NUMBER", "VECTOR", "NL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	class UVLDenter(DenterHelper):
	    def __init__(self, lexer, nl_token, indent_token, dedent_token, ignore_eof):
	        super().__init__(nl_token, indent_token, dedent_token, ignore_eof)
	        self.lexer: UVLLexer = lexer

	    def pull_token(self):
	        return super(UVLLexer, self.lexer).nextToken()

	denter = None

	def nextToken(self):
	    if not self.denter:
	        self.denter = self.UVLDenter(self, self.NL, UVLParser.INDENT, UVLParser.DEDENT, True)
	    return self.denter.next_token()



	public UVLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UVL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\7\24\u0091\n\24\f\24\16\24\u0094\13\24\5\24\u0096\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00bb\n\25\3\25\3\25\5\25\u00bf\n\25\3"+
		"\25\5\25\u00c2\n\25\3\26\3\26\7\26\u00c6\n\26\f\26\16\26\u00c9\13\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d4\n\27\3\30\3\30"+
		"\3\30\7\30\u00d9\n\30\f\30\16\30\u00dc\13\30\3\30\3\30\6\30\u00e0\n\30"+
		"\r\30\16\30\u00e1\5\30\u00e4\n\30\5\30\u00e6\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00ed\n\31\3\31\5\31\u00f0\n\31\7\31\u00f2\n\31\f\31\16\31"+
		"\u00f5\13\31\3\31\3\31\3\32\5\32\u00fa\n\32\3\32\3\32\7\32\u00fe\n\32"+
		"\f\32\16\32\u0101\13\32\3\32\5\32\u0104\n\32\3\32\3\32\7\32\u0108\n\32"+
		"\f\32\16\32\u010b\13\32\5\32\u010d\n\32\3\33\6\33\u0110\n\33\r\33\16\33"+
		"\u0111\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26-\27/\30\61\31\63"+
		"\32\65\33\3\2\7\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\2\"\"\2\u012c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5A\3\2\2\2\7J\3\2\2\2\tL\3\2"+
		"\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25c\3"+
		"\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35l\3\2\2\2\37p\3\2\2\2!y\3"+
		"\2\2\2#\u0082\3\2\2\2%\u008a\3\2\2\2\'\u0095\3\2\2\2)\u00c1\3\2\2\2+\u00c3"+
		"\3\2\2\2-\u00d3\3\2\2\2/\u00e5\3\2\2\2\61\u00e7\3\2\2\2\63\u010c\3\2\2"+
		"\2\65\u010f\3\2\2\2\678\7p\2\289\7c\2\29:\7o\2\2:;\7g\2\2;<\7u\2\2<=\7"+
		"r\2\2=>\7c\2\2>?\7e\2\2?@\7g\2\2@\4\3\2\2\2AB\7h\2\2BC\7g\2\2CD\7c\2\2"+
		"DE\7v\2\2EF\7w\2\2FG\7t\2\2GH\7g\2\2HI\7u\2\2I\6\3\2\2\2JK\7\60\2\2K\b"+
		"\3\2\2\2LM\7}\2\2MN\7\177\2\2N\n\3\2\2\2OP\7}\2\2P\f\3\2\2\2QR\7.\2\2"+
		"R\16\3\2\2\2ST\7\177\2\2T\20\3\2\2\2UV\7$\2\2V\22\3\2\2\2WX\7e\2\2XY\7"+
		"q\2\2YZ\7p\2\2Z[\7u\2\2[\\\7v\2\2\\]\7t\2\2]^\7c\2\2^_\7k\2\2_`\7p\2\2"+
		"`a\7v\2\2ab\7u\2\2b\24\3\2\2\2cd\7#\2\2d\26\3\2\2\2ef\7(\2\2f\30\3\2\2"+
		"\2gh\7~\2\2h\32\3\2\2\2ij\7?\2\2jk\7@\2\2k\34\3\2\2\2lm\7>\2\2mn\7?\2"+
		"\2no\7@\2\2o\36\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7s\2\2st\7w\2\2tu\7k\2\2u"+
		"v\7t\2\2vw\7g\2\2wx\7u\2\2x \3\2\2\2yz\7g\2\2z{\7z\2\2{|\7e\2\2|}\7n\2"+
		"\2}~\7w\2\2~\177\7f\2\2\177\u0080\7g\2\2\u0080\u0081\7u\2\2\u0081\"\3"+
		"\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7o\2\2\u0084\u0085\7r\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\u0088\7v\2\2\u0088\u0089\7u\2\2"+
		"\u0089$\3\2\2\2\u008a\u008b\7c\2\2\u008b\u008c\7u\2\2\u008c&\3\2\2\2\u008d"+
		"\u0096\7\62\2\2\u008e\u0092\t\2\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2"+
		"\2\2\u0096(\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c\u009d\7p\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7x\2\2"+
		"\u00a1\u00c2\7g\2\2\u00a2\u00a3\7q\2\2\u00a3\u00c2\7t\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7c\2\2\u00ab\u00c2\7n\2\2"+
		"\u00ac\u00ad\7o\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7f\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\u00c2\7{\2\2\u00b5\u00ba\7]\2\2\u00b6\u00b7\5\'\24"+
		"\2\u00b7\u00b8\7\60\2\2\u00b8\u00b9\7\60\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bf\5\'"+
		"\24\2\u00bd\u00bf\7,\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\7_\2\2\u00c1\u0097\3\2\2\2\u00c1\u00a2\3\2"+
		"\2\2\u00c1\u00a4\3\2\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c2"+
		"*\3\2\2\2\u00c3\u00c7\t\4\2\2\u00c4\u00c6\t\5\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8,\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7w\2\2\u00cd\u00d4\7g\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d4\7g\2\2\u00d3\u00ca"+
		"\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4.\3\2\2\2\u00d5\u00e6\7\62\2\2\u00d6"+
		"\u00da\t\2\2\2\u00d7\u00d9\t\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e3\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00df\7\60\2\2\u00de\u00e0\t\3\2\2\u00df\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e6\60\3\2\2\2\u00e7\u00f3"+
		"\7]\2\2\u00e8\u00ed\5-\27\2\u00e9\u00ed\5/\30\2\u00ea\u00ed\5+\26\2\u00eb"+
		"\u00ed\5\61\31\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0\7.\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ec\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7_\2\2\u00f7\62\3\2\2\2"+
		"\u00f8\u00fa\7\17\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00ff\7\f\2\2\u00fc\u00fe\7\"\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u010d\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7\17\2\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\7\f\2\2\u0106\u0108\7\13"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u00f9\3\2"+
		"\2\2\u010c\u0103\3\2\2\2\u010d\64\3\2\2\2\u010e\u0110\t\6\2\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\b\33\2\2\u0114\66\3\2\2\2\27\2\u0092\u0095"+
		"\u00ba\u00be\u00c1\u00c7\u00d3\u00da\u00e1\u00e3\u00e5\u00ec\u00ef\u00f3"+
		"\u00f9\u00ff\u0103\u0109\u010c\u0111\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}