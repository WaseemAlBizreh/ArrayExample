// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Example1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARRAY=1, OPEN_B=2, WS=3, NEWLINE=4, COMMA=5, CLOSE_B=6, ARRAY_INT=7, ARRAY_STRING=8;
	public static final int
		RULE_array = 0, RULE_arrayDef = 1, RULE_arraybody = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"array", "arrayDef", "arraybody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'array'", "'('", null, null, "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARRAY", "OPEN_B", "WS", "NEWLINE", "COMMA", "CLOSE_B", "ARRAY_INT", 
			"ARRAY_STRING"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Example1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Example1Parser.EOF, 0); }
		public List<ArrayDefContext> arrayDef() {
			return getRuleContexts(ArrayDefContext.class);
		}
		public ArrayDefContext arrayDef(int i) {
			return getRuleContext(ArrayDefContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				arrayDef();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARRAY );
			setState(11);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDefContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(Example1Parser.ARRAY, 0); }
		public TerminalNode OPEN_B() { return getToken(Example1Parser.OPEN_B, 0); }
		public ArraybodyContext arraybody() {
			return getRuleContext(ArraybodyContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(Example1Parser.CLOSE_B, 0); }
		public ArrayDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterArrayDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitArrayDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitArrayDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefContext arrayDef() throws RecognitionException {
		ArrayDefContext _localctx = new ArrayDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arrayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(ARRAY);
			setState(14);
			match(OPEN_B);
			setState(15);
			arraybody();
			setState(16);
			match(CLOSE_B);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArraybodyContext extends ParserRuleContext {
		public ArraybodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody; }
	 
		public ArraybodyContext() { }
		public void copyFrom(ArraybodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayINTContext extends ArraybodyContext {
		public List<TerminalNode> ARRAY_INT() { return getTokens(Example1Parser.ARRAY_INT); }
		public TerminalNode ARRAY_INT(int i) {
			return getToken(Example1Parser.ARRAY_INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ArrayINTContext(ArraybodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterArrayINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitArrayINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitArrayINT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStringContext extends ArraybodyContext {
		public List<TerminalNode> ARRAY_STRING() { return getTokens(Example1Parser.ARRAY_STRING); }
		public TerminalNode ARRAY_STRING(int i) {
			return getToken(Example1Parser.ARRAY_STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example1Parser.COMMA, i);
		}
		public ArrayStringContext(ArraybodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterArrayString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitArrayString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitArrayString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraybodyContext arraybody() throws RecognitionException {
		ArraybodyContext _localctx = new ArraybodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arraybody);
		int _la;
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY_INT:
				_localctx = new ArrayINTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(ARRAY_INT);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(19);
					match(COMMA);
					setState(20);
					match(ARRAY_INT);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ARRAY_STRING:
				_localctx = new ArrayStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(ARRAY_STRING);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(27);
					match(COMMA);
					setState(28);
					match(ARRAY_STRING);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\b%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0016\b\u0002"+
		"\n\u0002\f\u0002\u0019\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0003\u0002#\b\u0002\u0001"+
		"\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000%\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000"+
		"\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000"+
		"\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n"+
		"\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\f\u0005"+
		"\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0005\u0001"+
		"\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0010\u0003\u0004"+
		"\u0002\u0000\u0010\u0011\u0005\u0006\u0000\u0000\u0011\u0003\u0001\u0000"+
		"\u0000\u0000\u0012\u0017\u0005\u0007\u0000\u0000\u0013\u0014\u0005\u0005"+
		"\u0000\u0000\u0014\u0016\u0005\u0007\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018#\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001f\u0005\b\u0000\u0000"+
		"\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001e\u0005\b\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"\u0012\u0001\u0000\u0000"+
		"\u0000\"\u001a\u0001\u0000\u0000\u0000#\u0005\u0001\u0000\u0000\u0000"+
		"\u0004\t\u0017\u001f\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}