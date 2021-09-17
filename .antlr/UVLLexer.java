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
		RELATION_WORD=18, WORD=19, BOOLEAN=20, NUMBER=21, VECTOR=22, NL=23, WS=24;
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
			"INT", "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", "VECTOR", "NL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'", "'constraints'", 
			"'!'", "'&'", "'|'", "'=>'", "'<=>'", "'requires'", "'excludes'", "'imports'", 
			"'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "RELATION_WORD", "WORD", "BOOLEAN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0109\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\7\23\u0085\n\23\f\23\16\23\u0088\13\23\5\23\u008a"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00af\n\24\3\24\3\24\5\24"+
		"\u00b3\n\24\3\24\5\24\u00b6\n\24\3\25\3\25\7\25\u00ba\n\25\f\25\16\25"+
		"\u00bd\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c8\n"+
		"\26\3\27\3\27\3\27\7\27\u00cd\n\27\f\27\16\27\u00d0\13\27\3\27\3\27\6"+
		"\27\u00d4\n\27\r\27\16\27\u00d5\5\27\u00d8\n\27\5\27\u00da\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u00e1\n\30\3\30\5\30\u00e4\n\30\7\30\u00e6\n\30"+
		"\f\30\16\30\u00e9\13\30\3\30\3\30\3\31\5\31\u00ee\n\31\3\31\3\31\7\31"+
		"\u00f2\n\31\f\31\16\31\u00f5\13\31\3\31\5\31\u00f8\n\31\3\31\3\31\7\31"+
		"\u00fc\n\31\f\31\16\31\u00ff\13\31\5\31\u0101\n\31\3\32\6\32\u0104\n\32"+
		"\r\32\16\32\u0105\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\24)\25+\26-\27/"+
		"\30\61\31\63\32\3\2\7\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\2\"\""+
		"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5>\3\2\2\2\7@\3\2\2\2\tC\3\2\2"+
		"\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23W\3\2\2\2\25Y\3\2"+
		"\2\2\27[\3\2\2\2\31]\3\2\2\2\33`\3\2\2\2\35d\3\2\2\2\37m\3\2\2\2!v\3\2"+
		"\2\2#~\3\2\2\2%\u0089\3\2\2\2\'\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00c7\3"+
		"\2\2\2-\u00d9\3\2\2\2/\u00db\3\2\2\2\61\u0100\3\2\2\2\63\u0103\3\2\2\2"+
		"\65\66\7h\2\2\66\67\7g\2\2\678\7c\2\289\7v\2\29:\7w\2\2:;\7t\2\2;<\7g"+
		"\2\2<=\7u\2\2=\4\3\2\2\2>?\7\60\2\2?\6\3\2\2\2@A\7}\2\2AB\7\177\2\2B\b"+
		"\3\2\2\2CD\7}\2\2D\n\3\2\2\2EF\7.\2\2F\f\3\2\2\2GH\7\177\2\2H\16\3\2\2"+
		"\2IJ\7$\2\2J\20\3\2\2\2KL\7e\2\2LM\7q\2\2MN\7p\2\2NO\7u\2\2OP\7v\2\2P"+
		"Q\7t\2\2QR\7c\2\2RS\7k\2\2ST\7p\2\2TU\7v\2\2UV\7u\2\2V\22\3\2\2\2WX\7"+
		"#\2\2X\24\3\2\2\2YZ\7(\2\2Z\26\3\2\2\2[\\\7~\2\2\\\30\3\2\2\2]^\7?\2\2"+
		"^_\7@\2\2_\32\3\2\2\2`a\7>\2\2ab\7?\2\2bc\7@\2\2c\34\3\2\2\2de\7t\2\2"+
		"ef\7g\2\2fg\7s\2\2gh\7w\2\2hi\7k\2\2ij\7t\2\2jk\7g\2\2kl\7u\2\2l\36\3"+
		"\2\2\2mn\7g\2\2no\7z\2\2op\7e\2\2pq\7n\2\2qr\7w\2\2rs\7f\2\2st\7g\2\2"+
		"tu\7u\2\2u \3\2\2\2vw\7k\2\2wx\7o\2\2xy\7r\2\2yz\7q\2\2z{\7t\2\2{|\7v"+
		"\2\2|}\7u\2\2}\"\3\2\2\2~\177\7c\2\2\177\u0080\7u\2\2\u0080$\3\2\2\2\u0081"+
		"\u008a\7\62\2\2\u0082\u0086\t\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2"+
		"\2\2\u008a&\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7x\2\2"+
		"\u0095\u00b6\7g\2\2\u0096\u0097\7q\2\2\u0097\u00b6\7t\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7r\2\2\u009a\u009b\7v\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7p\2\2\u009e\u009f\7c\2\2\u009f\u00b6\7n\2\2"+
		"\u00a0\u00a1\7o\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4"+
		"\7f\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00b6\7{\2\2\u00a9\u00ae\7]\2\2\u00aa\u00ab\5%\23"+
		"\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\7\60\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b3\5%"+
		"\23\2\u00b1\u00b3\7,\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\7_\2\2\u00b5\u008b\3\2\2\2\u00b5\u0096\3\2"+
		"\2\2\u00b5\u0098\3\2\2\2\u00b5\u00a0\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b6"+
		"(\3\2\2\2\u00b7\u00bb\t\4\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc*\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c8\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2"+
		"\u00c4\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c8\7g\2\2\u00c7\u00be"+
		"\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8,\3\2\2\2\u00c9\u00da\7\62\2\2\u00ca"+
		"\u00ce\t\2\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d7\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d3\7\60\2\2\u00d2\u00d4\t\3\2\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00c9\3\2\2\2\u00d9\u00ca\3\2\2\2\u00da.\3\2\2\2\u00db\u00e7"+
		"\7]\2\2\u00dc\u00e1\5+\26\2\u00dd\u00e1\5-\27\2\u00de\u00e1\5)\25\2\u00df"+
		"\u00e1\5/\30\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\7.\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2"+
		"\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7_\2\2\u00eb\60\3\2\2\2"+
		"\u00ec\u00ee\7\17\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f3\7\f\2\2\u00f0\u00f2\7\"\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u0101\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\17\2\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\7\f\2\2\u00fa\u00fc\7\13"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00ed\3\2"+
		"\2\2\u0100\u00f7\3\2\2\2\u0101\62\3\2\2\2\u0102\u0104\t\6\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\b\32\2\2\u0108\64\3\2\2\2\27\2\u0086\u0089"+
		"\u00ae\u00b2\u00b5\u00bb\u00c7\u00ce\u00d5\u00d7\u00d9\u00e0\u00e3\u00e7"+
		"\u00ed\u00f3\u00f7\u00fd\u0100\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}