// Generated from ./C.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, Identifier=29, IntConst=30, WC=31;
	public static final int
		RULE_start = 0, RULE_includes = 1, RULE_include = 2, RULE_main = 3, RULE_conditionStatement = 4, 
		RULE_expressionStatement = 5, RULE_compoundStatement = 6, RULE_items = 7, 
		RULE_item = 8, RULE_declaration = 9, RULE_statement = 10, RULE_expression = 11, 
		RULE_assignOperator = 12, RULE_assignExpression = 13, RULE_orCondition = 14, 
		RULE_andCondition = 15, RULE_eqCondition = 16, RULE_relCondition = 17, 
		RULE_additive = 18, RULE_multiple = 19, RULE_unary = 20, RULE_primary = 21, 
		RULE_type = 22, RULE_constant = 23;
	public static final String[] ruleNames = {
		"start", "includes", "include", "main", "conditionStatement", "expressionStatement", 
		"compoundStatement", "items", "item", "declaration", "statement", "expression", 
		"assignOperator", "assignExpression", "orCondition", "andCondition", "eqCondition", 
		"relCondition", "additive", "multiple", "unary", "primary", "type", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include'", "'<'", "'>'", "'int'", "'main'", "'('", "')'", "'if'", 
		"'else'", "';'", "'{'", "'}'", "'='", "'*='", "'/='", "'||'", "'&&'", 
		"'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'void'", "'char'", "'short'", 
		"'float'", "'double'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Identifier", "IntConst", "WC"
	};
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    static void wr(String x) {System.out.print(x);}
	    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			includes();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(49);
				main();
				}
			}

			setState(52);
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

	public static class IncludesContext extends ParserRuleContext {
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIncludes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIncludes(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_includes);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				include();
				setState(55);
				includes();
				}
				break;
			case EOF:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IncludeContext extends ParserRuleContext {
		public Token i;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			match(T__1);
			setState(62);
			((IncludeContext)_localctx).i = match(Identifier);
			setState(63);
			match(T__2);
			wr("#include <" + (((IncludeContext)_localctx).i!=null?((IncludeContext)_localctx).i.getText():null) + ">\n");
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

	public static class MainContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__3);
			setState(67);
			match(T__4);
			setState(68);
			match(T__5);
			setState(69);
			match(T__6);
			wr("\nint main () ");
			{
			setState(71);
			compoundStatement(0);
			}
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

	public static class ConditionStatementContext extends ParserRuleContext {
		public int amount;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConditionStatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConditionStatement(this);
		}
	}

	public final ConditionStatementContext conditionStatement(int amount) throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 8, RULE_conditionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__7);
			setState(74);
			match(T__5);
			wr("if (");
			setState(76);
			expression();
			setState(77);
			match(T__6);
			wr(")");
			setState(79);
			statement(amount);
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(80);
				match(T__8);
				wr(" else ");
				setState(82);
				statement(amount);
				}
				break;
			}
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public int amount;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement(int amount) throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 10, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			tabs(amount);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(86);
				expression();
				}
			}

			setState(89);
			match(T__9);
			wr(";\n");
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public int amount;
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement(int amount) throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 12, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__10);
			wr("{\n");
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << Identifier) | (1L << IntConst))) != 0)) {
				{
				setState(94);
				items(amount + 4);
				}
			}

			setState(97);
			match(T__11);
			wr("}\n");
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

	public static class ItemsContext extends ParserRuleContext {
		public int amount;
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ItemsContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitItems(this);
		}
	}

	public final ItemsContext items(int amount) throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState(), amount);
		enterRule(_localctx, 14, RULE_items);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				item(amount);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				item(amount);
				setState(102);
				items(amount);
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

	public static class ItemContext extends ParserRuleContext {
		public int amount;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ItemContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitItem(this);
		}
	}

	public final ItemContext item(int amount) throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState(), amount);
		enterRule(_localctx, 16, RULE_item);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				tabs(amount);
				setState(107);
				declaration();
				}
				break;
			case T__5:
			case T__7:
			case T__9:
			case T__10:
			case Identifier:
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				tabs(amount);
				setState(109);
				statement(amount);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token i;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			type();
			setState(113);
			((DeclarationContext)_localctx).i = match(Identifier);
			wr(" " + (((DeclarationContext)_localctx).i!=null?((DeclarationContext)_localctx).i.getText():null) + " ");
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(115);
				match(T__12);
				wr("= ");
				setState(117);
				assignExpression();
				}
			}

			setState(120);
			match(T__9);
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
		public int amount;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int amount) {
			super(parent, invokingState);
			this.amount = amount;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int amount) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), amount);
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				compoundStatement(amount);
				}
				break;
			case T__5:
			case T__9:
			case Identifier:
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				expressionStatement(amount);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				conditionStatement(amount);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			assignExpression();
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

	public static class AssignOperatorContext extends ParserRuleContext {
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignOperator(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignOperator);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__12);
				wr(" = ");
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__13);
				wr(" *= ");
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__14);
				wr(" /= ");
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignExpression(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignExpression);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				orCondition(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				unary();
				setState(139);
				assignOperator();
				setState(140);
				assignExpression();
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

	public static class OrConditionContext extends ParserRuleContext {
		public AndConditionContext andCondition() {
			return getRuleContext(AndConditionContext.class,0);
		}
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitOrCondition(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		return orCondition(0);
	}

	private OrConditionContext orCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrConditionContext _localctx = new OrConditionContext(_ctx, _parentState);
		OrConditionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_orCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			andCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orCondition);
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(148);
					match(T__15);
					wr(" || ");
					setState(150);
					andCondition(0);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class AndConditionContext extends ParserRuleContext {
		public EqConditionContext eqCondition() {
			return getRuleContext(EqConditionContext.class,0);
		}
		public AndConditionContext andCondition() {
			return getRuleContext(AndConditionContext.class,0);
		}
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAndCondition(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		return andCondition(0);
	}

	private AndConditionContext andCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndConditionContext _localctx = new AndConditionContext(_ctx, _parentState);
		AndConditionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_andCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157);
			eqCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andCondition);
					setState(159);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(160);
					match(T__16);
					wr(" && ");
					setState(162);
					eqCondition(0);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class EqConditionContext extends ParserRuleContext {
		public RelConditionContext relCondition() {
			return getRuleContext(RelConditionContext.class,0);
		}
		public EqConditionContext eqCondition() {
			return getRuleContext(EqConditionContext.class,0);
		}
		public EqConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterEqCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitEqCondition(this);
		}
	}

	public final EqConditionContext eqCondition() throws RecognitionException {
		return eqCondition(0);
	}

	private EqConditionContext eqCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqConditionContext _localctx = new EqConditionContext(_ctx, _parentState);
		EqConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_eqCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			relCondition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new EqConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqCondition);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(172);
						match(T__17);
						wr(" == ");
						setState(174);
						relCondition(0);
						}
						break;
					case 2:
						{
						_localctx = new EqConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqCondition);
						setState(175);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(176);
						match(T__18);
						wr(" != ");
						setState(178);
						relCondition(0);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class RelConditionContext extends ParserRuleContext {
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public RelConditionContext relCondition() {
			return getRuleContext(RelConditionContext.class,0);
		}
		public RelConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterRelCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitRelCondition(this);
		}
	}

	public final RelConditionContext relCondition() throws RecognitionException {
		return relCondition(0);
	}

	private RelConditionContext relCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelConditionContext _localctx = new RelConditionContext(_ctx, _parentState);
		RelConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_relCondition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			additive(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new RelConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relCondition);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(T__1);
						wr(" < ");
						setState(190);
						additive(0);
						}
						break;
					case 2:
						{
						_localctx = new RelConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relCondition);
						setState(191);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(192);
						match(T__2);
						wr(" > ");
						setState(194);
						additive(0);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AdditiveContext extends ParserRuleContext {
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAdditive(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		return additive(0);
	}

	private AdditiveContext additive(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveContext _localctx = new AdditiveContext(_ctx, _parentState);
		AdditiveContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_additive, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			multiple(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						match(T__19);
						wr(" + ");
						setState(206);
						multiple(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additive);
						setState(207);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(208);
						match(T__20);
						wr(" - ");
						setState(210);
						multiple(0);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class MultipleContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMultiple(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		return multiple(0);
	}

	private MultipleContext multiple(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultipleContext _localctx = new MultipleContext(_ctx, _parentState);
		MultipleContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_multiple, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultipleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiple);
						setState(219);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(220);
						match(T__21);
						wr(" * ");
						setState(222);
						unary();
						}
						break;
					case 2:
						{
						_localctx = new MultipleContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiple);
						setState(223);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(224);
						match(T__22);
						wr(" / ");
						setState(226);
						unary();
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class UnaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			primary();
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

	public static class PrimaryContext extends ParserRuleContext {
		public Token i;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primary);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((PrimaryContext)_localctx).i = match(Identifier);
				wr((((PrimaryContext)_localctx).i!=null?((PrimaryContext)_localctx).i.getText():null));
				}
				break;
			case IntConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				constant();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(T__5);
				wr("(");
				setState(239);
				expression();
				setState(240);
				match(T__6);
				wr(")");
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__23);
				wr("void");
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__24);
				wr("char");
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(T__25);
				wr("short");
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(T__3);
				wr("int");
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(T__26);
				wr("float");
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(T__27);
				wr("double");
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

	public static class ConstantContext extends ParserRuleContext {
		public Token i;
		public TerminalNode IntConst() { return getToken(CParser.IntConst, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((ConstantContext)_localctx).i = match(IntConst);
			wr((((ConstantContext)_localctx).i!=null?((ConstantContext)_localctx).i.getText():null));
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
		case 14:
			return orCondition_sempred((OrConditionContext)_localctx, predIndex);
		case 15:
			return andCondition_sempred((AndConditionContext)_localctx, predIndex);
		case 16:
			return eqCondition_sempred((EqConditionContext)_localctx, predIndex);
		case 17:
			return relCondition_sempred((RelConditionContext)_localctx, predIndex);
		case 18:
			return additive_sempred((AdditiveContext)_localctx, predIndex);
		case 19:
			return multiple_sempred((MultipleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orCondition_sempred(OrConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andCondition_sempred(AndConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqCondition_sempred(EqConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relCondition_sempred(RelConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_sempred(AdditiveContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiple_sempred(MultipleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0109\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6V\n\6\3\7\3\7\5\7Z\n\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bb\n\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13y\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u0080\n\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008a\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0091\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u009a\n\20\f"+
		"\20\16\20\u009d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a6\n"+
		"\21\f\21\16\21\u00a9\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00b6\n\22\f\22\16\22\u00b9\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c6\n\23\f\23\16\23\u00c9\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d6"+
		"\n\24\f\24\16\24\u00d9\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u00e6\n\25\f\25\16\25\u00e9\13\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0104\n\30\3\31\3\31"+
		"\3\31\3\31\2\b\36 \"$&(\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\2\2\u010e\2\62\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bD\3\2\2\2\nK\3"+
		"\2\2\2\fW\3\2\2\2\16^\3\2\2\2\20j\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26\177"+
		"\3\2\2\2\30\u0081\3\2\2\2\32\u0089\3\2\2\2\34\u0090\3\2\2\2\36\u0092\3"+
		"\2\2\2 \u009e\3\2\2\2\"\u00aa\3\2\2\2$\u00ba\3\2\2\2&\u00ca\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00ea\3\2\2\2,\u00f5\3\2\2\2.\u0103\3\2\2\2\60\u0105\3\2\2\2"+
		"\62\64\5\4\3\2\63\65\5\b\5\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2"+
		"\66\67\7\2\2\3\67\3\3\2\2\289\5\6\4\29:\5\4\3\2:=\3\2\2\2;=\3\2\2\2<8"+
		"\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\7\3\2\2?@\7\4\2\2@A\7\37\2\2AB\7\5\2\2"+
		"BC\b\4\1\2C\7\3\2\2\2DE\7\6\2\2EF\7\7\2\2FG\7\b\2\2GH\7\t\2\2HI\b\5\1"+
		"\2IJ\5\16\b\2J\t\3\2\2\2KL\7\n\2\2LM\7\b\2\2MN\b\6\1\2NO\5\30\r\2OP\7"+
		"\t\2\2PQ\b\6\1\2QU\5\26\f\2RS\7\13\2\2ST\b\6\1\2TV\5\26\f\2UR\3\2\2\2"+
		"UV\3\2\2\2V\13\3\2\2\2WY\b\7\1\2XZ\5\30\r\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2"+
		"\2\2[\\\7\f\2\2\\]\b\7\1\2]\r\3\2\2\2^_\7\r\2\2_a\b\b\1\2`b\5\20\t\2a"+
		"`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\16\2\2de\b\b\1\2e\17\3\2\2\2fk\5\22"+
		"\n\2gh\5\22\n\2hi\5\20\t\2ik\3\2\2\2jf\3\2\2\2jg\3\2\2\2k\21\3\2\2\2l"+
		"m\b\n\1\2mq\5\24\13\2no\b\n\1\2oq\5\26\f\2pl\3\2\2\2pn\3\2\2\2q\23\3\2"+
		"\2\2rs\5.\30\2st\7\37\2\2tx\b\13\1\2uv\7\17\2\2vw\b\13\1\2wy\5\34\17\2"+
		"xu\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\f\2\2{\25\3\2\2\2|\u0080\5\16\b\2}"+
		"\u0080\5\f\7\2~\u0080\5\n\6\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080"+
		"\27\3\2\2\2\u0081\u0082\5\34\17\2\u0082\31\3\2\2\2\u0083\u0084\7\17\2"+
		"\2\u0084\u008a\b\16\1\2\u0085\u0086\7\20\2\2\u0086\u008a\b\16\1\2\u0087"+
		"\u0088\7\21\2\2\u0088\u008a\b\16\1\2\u0089\u0083\3\2\2\2\u0089\u0085\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u008a\33\3\2\2\2\u008b\u0091\5\36\20\2\u008c"+
		"\u008d\5*\26\2\u008d\u008e\5\32\16\2\u008e\u008f\5\34\17\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091\35\3\2\2\2\u0092"+
		"\u0093\b\20\1\2\u0093\u0094\5 \21\2\u0094\u009b\3\2\2\2\u0095\u0096\f"+
		"\3\2\2\u0096\u0097\7\22\2\2\u0097\u0098\b\20\1\2\u0098\u009a\5 \21\2\u0099"+
		"\u0095\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\37\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\b\21\1\2\u009f\u00a0"+
		"\5\"\22\2\u00a0\u00a7\3\2\2\2\u00a1\u00a2\f\3\2\2\u00a2\u00a3\7\23\2\2"+
		"\u00a3\u00a4\b\21\1\2\u00a4\u00a6\5\"\22\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8!\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\b\22\1\2\u00ab\u00ac\5$\23\2\u00ac\u00b7\3"+
		"\2\2\2\u00ad\u00ae\f\4\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\b\22\1\2\u00b0"+
		"\u00b6\5$\23\2\u00b1\u00b2\f\3\2\2\u00b2\u00b3\7\25\2\2\u00b3\u00b4\b"+
		"\22\1\2\u00b4\u00b6\5$\23\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8#\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\23\1\2\u00bb\u00bc\5&\24\2\u00bc\u00c7"+
		"\3\2\2\2\u00bd\u00be\f\4\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\b\23\1\2"+
		"\u00c0\u00c6\5&\24\2\u00c1\u00c2\f\3\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4"+
		"\b\23\1\2\u00c4\u00c6\5&\24\2\u00c5\u00bd\3\2\2\2\u00c5\u00c1\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8%\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\b\24\1\2\u00cb\u00cc\5(\25\2\u00cc"+
		"\u00d7\3\2\2\2\u00cd\u00ce\f\4\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\b"+
		"\24\1\2\u00d0\u00d6\5(\25\2\u00d1\u00d2\f\3\2\2\u00d2\u00d3\7\27\2\2\u00d3"+
		"\u00d4\b\24\1\2\u00d4\u00d6\5(\25\2\u00d5\u00cd\3\2\2\2\u00d5\u00d1\3"+
		"\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\'\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\b\25\1\2\u00db\u00dc\5*\26"+
		"\2\u00dc\u00e7\3\2\2\2\u00dd\u00de\f\4\2\2\u00de\u00df\7\30\2\2\u00df"+
		"\u00e0\b\25\1\2\u00e0\u00e6\5*\26\2\u00e1\u00e2\f\3\2\2\u00e2\u00e3\7"+
		"\31\2\2\u00e3\u00e4\b\25\1\2\u00e4\u00e6\5*\26\2\u00e5\u00dd\3\2\2\2\u00e5"+
		"\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8)\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5,\27\2\u00eb+\3\2"+
		"\2\2\u00ec\u00ed\7\37\2\2\u00ed\u00f6\b\27\1\2\u00ee\u00f6\5\60\31\2\u00ef"+
		"\u00f0\7\b\2\2\u00f0\u00f1\b\27\1\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7"+
		"\t\2\2\u00f3\u00f4\b\27\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5"+
		"\u00ee\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f8\7\32\2\2"+
		"\u00f8\u0104\b\30\1\2\u00f9\u00fa\7\33\2\2\u00fa\u0104\b\30\1\2\u00fb"+
		"\u00fc\7\34\2\2\u00fc\u0104\b\30\1\2\u00fd\u00fe\7\6\2\2\u00fe\u0104\b"+
		"\30\1\2\u00ff\u0100\7\35\2\2\u0100\u0104\b\30\1\2\u0101\u0102\7\36\2\2"+
		"\u0102\u0104\b\30\1\2\u0103\u00f7\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fb"+
		"\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"/\3\2\2\2\u0105\u0106\7 \2\2\u0106\u0107\b\31\1\2\u0107\61\3\2\2\2\31"+
		"\64<UYajpx\177\u0089\u0090\u009b\u00a7\u00b5\u00b7\u00c5\u00c7\u00d5\u00d7"+
		"\u00e5\u00e7\u00f5\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}