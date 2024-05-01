// Generated from c:/Users/mayme/OneDrive/Desktop/automatas2/practica02/proyectoAutomatas/grammar/LexerRules.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, PLUS=2, MINUS=3, MULT=4, DIV=5, MOD=6, IGUAL=7, OC=8, OL=9, 
		VOID=10, MAIN=11, INITPAR=12, FINALPAR=13, IF=14, ELSE=15, DO=16, WHILE=17, 
		PRINTF=18, INITKEY=19, FINALKEY=20, SEMI=21, INT=22, CHAR=23, FLOAT=24, 
		ID=25, INV_ID=26, NEWLINE=27, SPACES=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "PLUS", "MINUS", "MULT", "DIV", "MOD", "IGUAL", "OC", "OL", 
			"VOID", "MAIN", "INITPAR", "FINALPAR", "IF", "ELSE", "DO", "WHILE", "PRINTF", 
			"INITKEY", "FINALKEY", "SEMI", "INT", "CHAR", "FLOAT", "ID", "INV_ID", 
			"NEWLINE", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", null, null, "'void'", 
			"'main'", "'('", "')'", "'if'", "'else'", "'do'", "'while'", "'printf'", 
			"'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "PLUS", "MINUS", "MULT", "DIV", "MOD", "IGUAL", "OC", 
			"OL", "VOID", "MAIN", "INITPAR", "FINALPAR", "IF", "ELSE", "DO", "WHILE", 
			"PRINTF", "INITKEY", "FINALKEY", "SEMI", "INT", "CHAR", "FLOAT", "ID", 
			"INV_ID", "NEWLINE", "SPACES"
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


	public LexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerRules.g4"; }

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
		"\u0004\u0000\u001c\u00bd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0005\u0000<\b\u0000"+
		"\n\u0000\f\u0000?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"V\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b^\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u008d\b\u0015"+
		"\u0001\u0015\u0004\u0015\u0090\b\u0015\u000b\u0015\f\u0015\u0091\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0096\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0004\u0017\u009b\b\u0017\u000b\u0017\f\u0017\u009c\u0001\u0017"+
		"\u0001\u0017\u0004\u0017\u00a1\b\u0017\u000b\u0017\f\u0017\u00a2\u0001"+
		"\u0018\u0001\u0018\u0004\u0018\u00a7\b\u0018\u000b\u0018\f\u0018\u00a8"+
		"\u0003\u0018\u00ab\b\u0018\u0001\u0019\u0004\u0019\u00ae\b\u0019\u000b"+
		"\u0019\f\u0019\u00af\u0001\u001a\u0003\u001a\u00b3\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0004\u001b\u00b8\b\u001b\u000b\u001b\f\u001b"+
		"\u00b9\u0001\u001b\u0001\u001b\u0001=\u0000\u001c\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c\u0001\u0000\b\u0002\u0000<<>>\u0001\u000009\u0003\u0000  AZaz"+
		"\u0001\u0000..\u0002\u0000AZaz\u0004\u000009AZ__az\u0005\u0000++--09A"+
		"Zaz\u0003\u0000\t\n\r\r  \u00cc\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000\u0003B"+
		"\u0001\u0000\u0000\u0000\u0005D\u0001\u0000\u0000\u0000\u0007F\u0001\u0000"+
		"\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000"+
		"\rL\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011]\u0001"+
		"\u0000\u0000\u0000\u0013_\u0001\u0000\u0000\u0000\u0015d\u0001\u0000\u0000"+
		"\u0000\u0017i\u0001\u0000\u0000\u0000\u0019k\u0001\u0000\u0000\u0000\u001b"+
		"m\u0001\u0000\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001fu\u0001"+
		"\u0000\u0000\u0000!x\u0001\u0000\u0000\u0000#~\u0001\u0000\u0000\u0000"+
		"%\u0085\u0001\u0000\u0000\u0000\'\u0087\u0001\u0000\u0000\u0000)\u0089"+
		"\u0001\u0000\u0000\u0000+\u008c\u0001\u0000\u0000\u0000-\u0093\u0001\u0000"+
		"\u0000\u0000/\u009a\u0001\u0000\u0000\u00001\u00a4\u0001\u0000\u0000\u0000"+
		"3\u00ad\u0001\u0000\u0000\u00005\u00b2\u0001\u0000\u0000\u00007\u00b7"+
		"\u0001\u0000\u0000\u00009=\u0005\"\u0000\u0000:<\t\u0000\u0000\u0000;"+
		":\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@A\u0005\"\u0000\u0000A\u0002\u0001\u0000\u0000\u0000BC\u0005"+
		"+\u0000\u0000C\u0004\u0001\u0000\u0000\u0000DE\u0005-\u0000\u0000E\u0006"+
		"\u0001\u0000\u0000\u0000FG\u0005*\u0000\u0000G\b\u0001\u0000\u0000\u0000"+
		"HI\u0005/\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005%\u0000\u0000"+
		"K\f\u0001\u0000\u0000\u0000LM\u0005=\u0000\u0000M\u000e\u0001\u0000\u0000"+
		"\u0000NV\u0007\u0000\u0000\u0000OP\u0005<\u0000\u0000PV\u0005=\u0000\u0000"+
		"QR\u0005>\u0000\u0000RV\u0005=\u0000\u0000ST\u0005!\u0000\u0000TV\u0005"+
		"=\u0000\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UQ\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V\u0010\u0001\u0000\u0000"+
		"\u0000WX\u0005|\u0000\u0000X^\u0005|\u0000\u0000YZ\u0005&\u0000\u0000"+
		"Z^\u0005&\u0000\u0000[\\\u0005=\u0000\u0000\\^\u0005=\u0000\u0000]W\u0001"+
		"\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^\u0012\u0001\u0000\u0000\u0000_`\u0005v\u0000\u0000`a\u0005o\u0000\u0000"+
		"ab\u0005i\u0000\u0000bc\u0005d\u0000\u0000c\u0014\u0001\u0000\u0000\u0000"+
		"de\u0005m\u0000\u0000ef\u0005a\u0000\u0000fg\u0005i\u0000\u0000gh\u0005"+
		"n\u0000\u0000h\u0016\u0001\u0000\u0000\u0000ij\u0005(\u0000\u0000j\u0018"+
		"\u0001\u0000\u0000\u0000kl\u0005)\u0000\u0000l\u001a\u0001\u0000\u0000"+
		"\u0000mn\u0005i\u0000\u0000no\u0005f\u0000\u0000o\u001c\u0001\u0000\u0000"+
		"\u0000pq\u0005e\u0000\u0000qr\u0005l\u0000\u0000rs\u0005s\u0000\u0000"+
		"st\u0005e\u0000\u0000t\u001e\u0001\u0000\u0000\u0000uv\u0005d\u0000\u0000"+
		"vw\u0005o\u0000\u0000w \u0001\u0000\u0000\u0000xy\u0005w\u0000\u0000y"+
		"z\u0005h\u0000\u0000z{\u0005i\u0000\u0000{|\u0005l\u0000\u0000|}\u0005"+
		"e\u0000\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0005p\u0000\u0000\u007f"+
		"\u0080\u0005r\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082\u0005"+
		"n\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0084\u0005f\u0000"+
		"\u0000\u0084$\u0001\u0000\u0000\u0000\u0085\u0086\u0005{\u0000\u0000\u0086"+
		"&\u0001\u0000\u0000\u0000\u0087\u0088\u0005}\u0000\u0000\u0088(\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005;\u0000\u0000\u008a*\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0003\u0005\u0002\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0007\u0001\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092,\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0005\"\u0000\u0000\u0094\u0096\u0007\u0002\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000\u0098."+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0001\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0003\u0000\u0000\u009f\u00a1"+
		"\u0007\u0001\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a30\u0001\u0000\u0000\u0000\u00a4\u00aa\u0007"+
		"\u0004\u0000\u0000\u00a5\u00a7\u0007\u0005\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab2\u0001\u0000\u0000\u0000\u00ac\u00ae\u0007\u0006"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b04\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005\r\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000"+
		"\u00b56\u0001\u0000\u0000\u0000\u00b6\u00b8\u0007\u0007\u0000\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006\u001b\u0000\u0000\u00bc"+
		"8\u0001\u0000\u0000\u0000\u000e\u0000=U]\u008c\u0091\u0095\u009c\u00a2"+
		"\u00a8\u00aa\u00af\u00b2\u00b9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}