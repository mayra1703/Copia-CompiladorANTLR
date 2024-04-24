// Generated from c:/Users/mayme/OneDrive/Desktop/automatas2/practica02/proyectoAutomatas/grammar/Compilator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CompilatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, PLUS=4, MINUS=5, MULT=6, DIV=7, IGUAL=8, OC=9, 
		OL=10, SERENITYCLASS=11, COZYCONDITION=12, TWILIGHTOPTION=13, ELSE=14, 
		DREAMYELSE=15, ARROW=16, WHISPER=17, INITKEY=18, FINALKEY=19, GATITO=20, 
		PUNTITO=21, STARSTRING=22, NUM=23, ID=24, LINECOMMENT=25, COMMENT=26, 
		NEWLINE=27, SPACES=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE", "PLUS", "MINUS", "MULT", "DIV", "IGUAL", "OC", 
			"OL", "SERENITYCLASS", "COZYCONDITION", "TWILIGHTOPTION", "ELSE", "DREAMYELSE", 
			"ARROW", "WHISPER", "INITKEY", "FINALKEY", "GATITO", "PUNTITO", "STARSTRING", 
			"NUM", "ID", "LINECOMMENT", "COMMENT", "NEWLINE", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, "'+'", "'-'", "'*'", "'/'", "'='", null, null, 
			"'SerenityClass'", "'CozyCondition'", "'TwilightOption'", "'else'", "'DreamElse'", 
			"'->'", "'WHISPER'", "'{'", "'}'", "'#'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "PLUS", "MINUS", "MULT", "DIV", "IGUAL", "OC", 
			"OL", "SERENITYCLASS", "COZYCONDITION", "TWILIGHTOPTION", "ELSE", "DREAMYELSE", 
			"ARROW", "WHISPER", "INITKEY", "FINALKEY", "GATITO", "PUNTITO", "STARSTRING", 
			"NUM", "ID", "LINECOMMENT", "COMMENT", "NEWLINE", "SPACES"
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


	public CompilatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compilator.g4"; }

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
		"\u0004\u0000\u001c\u010c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002W\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bj\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0081\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00d2\b\u0015\n\u0015\f\u0015\u00d5\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016\u00da\b\u0016\u000b\u0016\f\u0016\u00db"+
		"\u0001\u0017\u0004\u0017\u00df\b\u0017\u000b\u0017\f\u0017\u00e0\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00e7\b\u0018\n"+
		"\u0018\f\u0018\u00ea\t\u0018\u0001\u0018\u0003\u0018\u00ed\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00f7\b\u0019\n\u0019\f\u0019\u00fa\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0003\u001a\u0102\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b"+
		"\u0107\b\u001b\u000b\u001b\f\u001b\u0108\u0001\u001b\u0001\u001b\u0003"+
		"\u00d3\u00e8\u00f8\u0000\u001c\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c\u0001"+
		"\u0000\u0004\u0002\u0000<<>>\u0001\u000009\u0002\u0000AZaz\u0003\u0000"+
		"\t\n\r\r  \u011c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000\u0003;\u0001\u0000\u0000"+
		"\u0000\u0005V\u0001\u0000\u0000\u0000\u0007X\u0001\u0000\u0000\u0000\t"+
		"Z\u0001\u0000\u0000\u0000\u000b\\\u0001\u0000\u0000\u0000\r^\u0001\u0000"+
		"\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000"+
		"\u0013\u0080\u0001\u0000\u0000\u0000\u0015\u0082\u0001\u0000\u0000\u0000"+
		"\u0017\u0090\u0001\u0000\u0000\u0000\u0019\u009e\u0001\u0000\u0000\u0000"+
		"\u001b\u00ad\u0001\u0000\u0000\u0000\u001d\u00b2\u0001\u0000\u0000\u0000"+
		"\u001f\u00bc\u0001\u0000\u0000\u0000!\u00bf\u0001\u0000\u0000\u0000#\u00c7"+
		"\u0001\u0000\u0000\u0000%\u00c9\u0001\u0000\u0000\u0000\'\u00cb\u0001"+
		"\u0000\u0000\u0000)\u00cd\u0001\u0000\u0000\u0000+\u00cf\u0001\u0000\u0000"+
		"\u0000-\u00d9\u0001\u0000\u0000\u0000/\u00de\u0001\u0000\u0000\u00001"+
		"\u00e2\u0001\u0000\u0000\u00003\u00f2\u0001\u0000\u0000\u00005\u0101\u0001"+
		"\u0000\u0000\u00007\u0106\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000"+
		":\u0002\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000<\u0004\u0001\u0000"+
		"\u0000\u0000=>\u0005r\u0000\u0000>?\u0005e\u0000\u0000?@\u0005l\u0000"+
		"\u0000@A\u0005a\u0000\u0000AB\u0005x\u0000\u0000BC\u0005i\u0000\u0000"+
		"CD\u0005n\u0000\u0000DW\u0005t\u0000\u0000EF\u0005n\u0000\u0000FG\u0005"+
		"i\u0000\u0000GH\u0005g\u0000\u0000HI\u0005h\u0000\u0000IJ\u0005t\u0000"+
		"\u0000JK\u0005c\u0000\u0000KL\u0005h\u0000\u0000LM\u0005a\u0000\u0000"+
		"MW\u0005r\u0000\u0000NO\u0005s\u0000\u0000OP\u0005k\u0000\u0000PQ\u0005"+
		"y\u0000\u0000QR\u0005f\u0000\u0000RS\u0005l\u0000\u0000ST\u0005o\u0000"+
		"\u0000TU\u0005a\u0000\u0000UW\u0005t\u0000\u0000V=\u0001\u0000\u0000\u0000"+
		"VE\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000W\u0006\u0001\u0000"+
		"\u0000\u0000XY\u0005+\u0000\u0000Y\b\u0001\u0000\u0000\u0000Z[\u0005-"+
		"\u0000\u0000[\n\u0001\u0000\u0000\u0000\\]\u0005*\u0000\u0000]\f\u0001"+
		"\u0000\u0000\u0000^_\u0005/\u0000\u0000_\u000e\u0001\u0000\u0000\u0000"+
		"`a\u0005=\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bj\u0007\u0000\u0000"+
		"\u0000cd\u0005<\u0000\u0000dj\u0005=\u0000\u0000ef\u0005>\u0000\u0000"+
		"fj\u0005=\u0000\u0000gh\u0005!\u0000\u0000hj\u0005=\u0000\u0000ib\u0001"+
		"\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000j\u0012\u0001\u0000\u0000\u0000kl\u0005|\u0000"+
		"\u0000l\u0081\u0005|\u0000\u0000mn\u0005&\u0000\u0000n\u0081\u0005&\u0000"+
		"\u0000op\u0005=\u0000\u0000p\u0081\u0005=\u0000\u0000qr\u0005p\u0000\u0000"+
		"rs\u0005e\u0000\u0000st\u0005a\u0000\u0000tu\u0005c\u0000\u0000uv\u0005"+
		"e\u0000\u0000vw\u0005f\u0000\u0000wx\u0005u\u0000\u0000x\u0081\u0005l"+
		"\u0000\u0000yz\u0005c\u0000\u0000z{\u0005h\u0000\u0000{|\u0005a\u0000"+
		"\u0000|}\u0005o\u0000\u0000}~\u0005t\u0000\u0000~\u007f\u0005i\u0000\u0000"+
		"\u007f\u0081\u0005c\u0000\u0000\u0080k\u0001\u0000\u0000\u0000\u0080m"+
		"\u0001\u0000\u0000\u0000\u0080o\u0001\u0000\u0000\u0000\u0080q\u0001\u0000"+
		"\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0081\u0014\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005S\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084"+
		"\u0085\u0005r\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086\u0087\u0005"+
		"n\u0000\u0000\u0087\u0088\u0005i\u0000\u0000\u0088\u0089\u0005t\u0000"+
		"\u0000\u0089\u008a\u0005y\u0000\u0000\u008a\u008b\u0005C\u0000\u0000\u008b"+
		"\u008c\u0005l\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u008e\u0005"+
		"s\u0000\u0000\u008e\u008f\u0005s\u0000\u0000\u008f\u0016\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005C\u0000\u0000\u0091\u0092\u0005o\u0000\u0000\u0092"+
		"\u0093\u0005z\u0000\u0000\u0093\u0094\u0005y\u0000\u0000\u0094\u0095\u0005"+
		"C\u0000\u0000\u0095\u0096\u0005o\u0000\u0000\u0096\u0097\u0005n\u0000"+
		"\u0000\u0097\u0098\u0005d\u0000\u0000\u0098\u0099\u0005i\u0000\u0000\u0099"+
		"\u009a\u0005t\u0000\u0000\u009a\u009b\u0005i\u0000\u0000\u009b\u009c\u0005"+
		"o\u0000\u0000\u009c\u009d\u0005n\u0000\u0000\u009d\u0018\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005T\u0000\u0000\u009f\u00a0\u0005w\u0000\u0000\u00a0"+
		"\u00a1\u0005i\u0000\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2\u00a3\u0005"+
		"i\u0000\u0000\u00a3\u00a4\u0005g\u0000\u0000\u00a4\u00a5\u0005h\u0000"+
		"\u0000\u00a5\u00a6\u0005t\u0000\u0000\u00a6\u00a7\u0005O\u0000\u0000\u00a7"+
		"\u00a8\u0005p\u0000\u0000\u00a8\u00a9\u0005t\u0000\u0000\u00a9\u00aa\u0005"+
		"i\u0000\u0000\u00aa\u00ab\u0005o\u0000\u0000\u00ab\u00ac\u0005n\u0000"+
		"\u0000\u00ac\u001a\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000"+
		"\u00ae\u00af\u0005l\u0000\u0000\u00af\u00b0\u0005s\u0000\u0000\u00b0\u00b1"+
		"\u0005e\u0000\u0000\u00b1\u001c\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"D\u0000\u0000\u00b3\u00b4\u0005r\u0000\u0000\u00b4\u00b5\u0005e\u0000"+
		"\u0000\u00b5\u00b6\u0005a\u0000\u0000\u00b6\u00b7\u0005m\u0000\u0000\u00b7"+
		"\u00b8\u0005E\u0000\u0000\u00b8\u00b9\u0005l\u0000\u0000\u00b9\u00ba\u0005"+
		"s\u0000\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb\u001e\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005-\u0000\u0000\u00bd\u00be\u0005>\u0000\u0000\u00be"+
		" \u0001\u0000\u0000\u0000\u00bf\u00c0\u0005W\u0000\u0000\u00c0\u00c1\u0005"+
		"H\u0000\u0000\u00c1\u00c2\u0005I\u0000\u0000\u00c2\u00c3\u0005S\u0000"+
		"\u0000\u00c3\u00c4\u0005P\u0000\u0000\u00c4\u00c5\u0005E\u0000\u0000\u00c5"+
		"\u00c6\u0005R\u0000\u0000\u00c6\"\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005{\u0000\u0000\u00c8$\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005}"+
		"\u0000\u0000\u00ca&\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005#\u0000\u0000"+
		"\u00cc(\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005.\u0000\u0000\u00ce*"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d3\u0005\"\u0000\u0000\u00d0\u00d2\t"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\"\u0000\u0000\u00d7,\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0007\u0001\u0000\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc.\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0007\u0002\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e10\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005/\u0000\u0000\u00e3\u00e4\u0005/\u0000\u0000\u00e4\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e7\t\u0000\u0000\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005"+
		"\r\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\n\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0006\u0018\u0000"+
		"\u0000\u00f12\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005/\u0000\u0000\u00f3"+
		"\u00f4\u0005*\u0000\u0000\u00f4\u00f8\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\t\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005*\u0000\u0000\u00fc\u00fd\u0005/\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0006\u0019\u0000"+
		"\u0000\u00ff4\u0001\u0000\u0000\u0000\u0100\u0102\u0005\r\u0000\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005\n\u0000\u0000\u0104"+
		"6\u0001\u0000\u0000\u0000\u0105\u0107\u0007\u0003\u0000\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0006\u001b\u0000\u0000\u010b8\u0001"+
		"\u0000\u0000\u0000\f\u0000Vi\u0080\u00d3\u00db\u00e0\u00e8\u00ec\u00f8"+
		"\u0101\u0108\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}