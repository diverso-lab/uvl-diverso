// Generated from /home/pabpazjim/diverso/uvl-diverso/uvl-diverso/UVL.g4 by ANTLR 4.8

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, RELATION_WORD=16, 
		WORD=17, BOOLEAN=18, NUMBER=19, VECTOR=20, VALUE=21, NL=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "INT", "RELATION_WORD", 
			"WORD", "BOOLEAN", "NUMBER", "VECTOR", "VALUE", "NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'", "'constraints'", 
			"'!'", "'&'", "'|'", "'=>'", "'<=>'", "'imports'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", 
			"VECTOR", "VALUE", "NL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00f6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\7\21q\n\21"+
		"\f\21\16\21t\13\21\5\21v\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u009b\n\22\3\22\3\22\5\22\u009f\n\22\3\22\5\22\u00a2\n\22\3\23\3\23\7"+
		"\23\u00a6\n\23\f\23\16\23\u00a9\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u00b4\n\24\3\25\3\25\3\25\7\25\u00b9\n\25\f\25\16\25"+
		"\u00bc\13\25\3\25\3\25\6\25\u00c0\n\25\r\25\16\25\u00c1\5\25\u00c4\n\25"+
		"\5\25\u00c6\n\25\3\26\3\26\3\26\5\26\u00cb\n\26\7\26\u00cd\n\26\f\26\16"+
		"\26\u00d0\13\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00d8\n\27\3\30\5\30"+
		"\u00db\n\30\3\30\3\30\7\30\u00df\n\30\f\30\16\30\u00e2\13\30\3\30\5\30"+
		"\u00e5\n\30\3\30\3\30\7\30\u00e9\n\30\f\30\16\30\u00ec\13\30\5\30\u00ee"+
		"\n\30\3\31\6\31\u00f1\n\31\r\31\16\31\u00f2\3\31\3\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#"+
		"\22%\23\'\24)\25+\26-\27/\30\61\31\3\2\7\3\2\63;\3\2\62;\4\2C\\c|\6\2"+
		"\62;C\\aac|\3\2\"\"\2\u010d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5<\3\2\2\2\7>\3\2\2\2\tA\3"+
		"\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23U\3\2\2\2\25W"+
		"\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33^\3\2\2\2\35b\3\2\2\2\37j\3\2\2\2!"+
		"u\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00b3\3\2\2\2)\u00c5\3\2\2\2"+
		"+\u00c7\3\2\2\2-\u00d7\3\2\2\2/\u00ed\3\2\2\2\61\u00f0\3\2\2\2\63\64\7"+
		"h\2\2\64\65\7g\2\2\65\66\7c\2\2\66\67\7v\2\2\678\7w\2\289\7t\2\29:\7g"+
		"\2\2:;\7u\2\2;\4\3\2\2\2<=\7\60\2\2=\6\3\2\2\2>?\7}\2\2?@\7\177\2\2@\b"+
		"\3\2\2\2AB\7}\2\2B\n\3\2\2\2CD\7.\2\2D\f\3\2\2\2EF\7\177\2\2F\16\3\2\2"+
		"\2GH\7$\2\2H\20\3\2\2\2IJ\7e\2\2JK\7q\2\2KL\7p\2\2LM\7u\2\2MN\7v\2\2N"+
		"O\7t\2\2OP\7c\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2ST\7u\2\2T\22\3\2\2\2UV\7"+
		"#\2\2V\24\3\2\2\2WX\7(\2\2X\26\3\2\2\2YZ\7~\2\2Z\30\3\2\2\2[\\\7?\2\2"+
		"\\]\7@\2\2]\32\3\2\2\2^_\7>\2\2_`\7?\2\2`a\7@\2\2a\34\3\2\2\2bc\7k\2\2"+
		"cd\7o\2\2de\7r\2\2ef\7q\2\2fg\7t\2\2gh\7v\2\2hi\7u\2\2i\36\3\2\2\2jk\7"+
		"c\2\2kl\7u\2\2l \3\2\2\2mv\7\62\2\2nr\t\2\2\2oq\t\3\2\2po\3\2\2\2qt\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2um\3\2\2\2un\3\2\2\2v\""+
		"\3\2\2\2wx\7c\2\2xy\7n\2\2yz\7v\2\2z{\7g\2\2{|\7t\2\2|}\7p\2\2}~\7c\2"+
		"\2~\177\7v\2\2\177\u0080\7k\2\2\u0080\u0081\7x\2\2\u0081\u00a2\7g\2\2"+
		"\u0082\u0083\7q\2\2\u0083\u00a2\7t\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7r\2\2\u0086\u0087\7v\2\2\u0087\u0088\7k\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7p\2\2\u008a\u008b\7c\2\2\u008b\u00a2\7n\2\2\u008c\u008d\7o\2\2"+
		"\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\u0090\7f\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7v\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u00a2\7{\2\2\u0095\u009a\7]\2\2\u0096\u0097\5!\21\2\u0097\u0098\7\60"+
		"\2\2\u0098\u0099\7\60\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009f\5!\21\2\u009d\u009f\7,"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\7_\2\2\u00a1w\3\2\2\2\u00a1\u0082\3\2\2\2\u00a1\u0084\3\2\2\2\u00a1"+
		"\u008c\3\2\2\2\u00a1\u0095\3\2\2\2\u00a2$\3\2\2\2\u00a3\u00a7\t\4\2\2"+
		"\u00a4\u00a6\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8&\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7w\2\2\u00ad\u00b4\7g\2\2"+
		"\u00ae\u00af\7h\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b4\7g\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4"+
		"(\3\2\2\2\u00b5\u00c6\7\62\2\2\u00b6\u00ba\t\2\2\2\u00b7\u00b9\t\3\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00c3\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\60\2\2"+
		"\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c5\u00b6\3\2"+
		"\2\2\u00c6*\3\2\2\2\u00c7\u00ce\7]\2\2\u00c8\u00ca\5-\27\2\u00c9\u00cb"+
		"\7.\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7_\2\2\u00d2"+
		",\3\2\2\2\u00d3\u00d8\5\'\24\2\u00d4\u00d8\5)\25\2\u00d5\u00d8\5%\23\2"+
		"\u00d6\u00d8\5+\26\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8.\3\2\2\2\u00d9\u00db\7\17\2\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e0\7\f"+
		"\2\2\u00dd\u00df\7\"\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00ee\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e5\7\17\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00ea\7\f\2\2\u00e7\u00e9\7\13\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00da\3\2\2\2\u00ed\u00e4\3\2"+
		"\2\2\u00ee\60\3\2\2\2\u00ef\u00f1\t\6\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\31\2\2\u00f5\62\3\2\2\2\27\2ru\u009a\u009e\u00a1\u00a7\u00b3"+
		"\u00ba\u00c1\u00c3\u00c5\u00ca\u00ce\u00d7\u00da\u00e0\u00e4\u00ea\u00ed"+
		"\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}