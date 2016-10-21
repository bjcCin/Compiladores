// Generated from bjcc_idrn.g4 by ANTLR 4.4
package bjcc_idrn;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bjcc_idrnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, Identifier=36, IntegerLiteral=37, 
		DecimalIntegerLiteral=38, IntegertypeSuffix=39, DecimalNumeral=40, Digits=41, 
		Digit=42, DigitOrUnderscore=43, WS=44, MULTILINE_COMMENT=45, LINE_COMMENT=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'new'", "'true'", "'return'", "'class'", "'while'", 
		"';'", "'void'", "'{'", "'&&'", "'='", "'extends'", "'}'", "'if'", "'int'", 
		"'.length'", "'('", "'*'", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'<'", "'String'", "']'", "'public'", "'!'", 
		"'static'", "'else'", "')'", "'+'", "'-'", "Identifier", "IntegerLiteral", 
		"DecimalIntegerLiteral", "IntegertypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "DigitOrUnderscore", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_parameterList = 5, RULE_parameter = 6, 
		RULE_methodBody = 7, RULE_type = 8, RULE_statement = 9, RULE_expression = 10;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"parameterList", "parameter", "methodBody", "type", "statement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "bjcc_idrn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bjcc_idrnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(bjcc_idrnParser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); mainClass();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(23); classDeclaration();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(bjcc_idrnParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(bjcc_idrnParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(T__30);
			setState(32); match(Identifier);
			setState(33); match(T__26);
			setState(34); match(T__6);
			setState(35); match(T__4);
			setState(36); match(T__27);
			setState(37); match(T__34);
			setState(38); match(T__18);
			setState(39); match(T__8);
			setState(40); match(T__10);
			setState(41); match(T__7);
			setState(42); match(Identifier);
			setState(43); match(T__2);
			setState(44); match(T__26);
			setState(45); statement();
			setState(46); match(T__22);
			setState(47); match(T__22);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(bjcc_idrnParser.Identifier); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(bjcc_idrnParser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(T__30);
			setState(50); match(Identifier);
			setState(53);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(51); match(T__23);
				setState(52); match(Identifier);
				}
			}

			setState(55); match(T__26);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				{
				setState(56); varDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(62); methodDeclaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68); match(T__22);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bjcc_idrnParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); type();
			setState(71); match(Identifier);
			setState(72); match(T__28);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bjcc_idrnParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__6);
			setState(75); type();
			setState(76); match(Identifier);
			setState(77); match(T__18);
			setState(79);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				setState(78); parameterList();
				}
			}

			setState(81); match(T__2);
			setState(82); match(T__26);
			setState(83); methodBody();
			setState(84); match(T__22);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); parameter();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(87); match(T__15);
				setState(88); parameter();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bjcc_idrnParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); type();
			setState(95); match(Identifier);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97); varDeclaration();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__26) | (1L << T__21) | (1L << T__11) | (1L << Identifier))) != 0)) {
				{
				{
				setState(103); statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(T__31);
			setState(110); expression(0);
			setState(111); match(T__28);
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
		public TerminalNode Identifier() { return getToken(bjcc_idrnParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(T__20);
				setState(114); match(T__10);
				setState(115); match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117); match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118); match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bjcc_idrnParser.Identifier, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); match(T__26);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__26) | (1L << T__21) | (1L << T__11) | (1L << Identifier))) != 0)) {
					{
					{
					setState(122); statement();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128); match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(T__21);
				setState(130); match(T__18);
				setState(131); expression(0);
				setState(132); match(T__2);
				setState(133); statement();
				setState(134); match(T__3);
				setState(135); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137); match(T__29);
				setState(138); match(T__18);
				setState(139); expression(0);
				setState(140); match(T__2);
				setState(141); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); match(T__11);
				setState(144); match(T__18);
				setState(145); expression(0);
				setState(146); match(T__2);
				setState(147); match(T__28);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149); match(Identifier);
				setState(150); match(T__24);
				setState(151); expression(0);
				setState(152); match(T__28);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154); match(Identifier);
				setState(155); match(T__10);
				setState(156); expression(0);
				setState(157); match(T__7);
				setState(158); match(T__24);
				setState(159); expression(0);
				setState(160); match(T__28);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bjcc_idrnParser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(bjcc_idrnParser.IntegerLiteral, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bjcc_idrnListener ) ((bjcc_idrnListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bjcc_idrnVisitor ) return ((bjcc_idrnVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(165); match(T__5);
				setState(166); expression(2);
				}
				break;
			case 2:
				{
				setState(167); match(IntegerLiteral);
				}
				break;
			case 3:
				{
				setState(168); match(T__32);
				}
				break;
			case 4:
				{
				setState(169); match(T__14);
				}
				break;
			case 5:
				{
				setState(170); match(Identifier);
				}
				break;
			case 6:
				{
				setState(171); match(T__16);
				}
				break;
			case 7:
				{
				setState(172); match(T__33);
				setState(173); match(T__20);
				setState(174); match(T__10);
				setState(175); expression(0);
				setState(176); match(T__7);
				}
				break;
			case 8:
				{
				setState(178); match(T__33);
				setState(179); match(Identifier);
				setState(180); match(T__18);
				setState(181); match(T__2);
				}
				break;
			case 9:
				{
				setState(182); match(T__18);
				setState(183); expression(0);
				setState(184); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__17) | (1L << T__9) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(190); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(192); match(T__10);
						setState(193); expression(0);
						setState(194); match(T__7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(197); match(T__19);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(199); match(T__13);
						setState(200); match(Identifier);
						setState(201); match(T__18);
						setState(210);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__32) | (1L << T__18) | (1L << T__16) | (1L << T__14) | (1L << T__5) | (1L << Identifier) | (1L << IntegerLiteral))) != 0)) {
							{
							setState(202); expression(0);
							setState(207);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(203); match(T__15);
								setState(204); expression(0);
								}
								}
								setState(209);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(212); match(T__2);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\48\n\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\7\4B\n\4\f\4\16\4"+
		"E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3\b\3\b\3\t\7\te\n"+
		"\t\f\t\16\th\13\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bd"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00d0\n\f\f\f\16\f\u00d3\13\f\5\f\u00d5\n\f\3\f\7\f\u00d8\n\f\f"+
		"\f\16\f\u00db\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24\26\2\3\6\2\f\f"+
		"\24\24\34\34$%\u00f0\2\30\3\2\2\2\4!\3\2\2\2\6\63\3\2\2\2\bH\3\2\2\2\n"+
		"L\3\2\2\2\fX\3\2\2\2\16`\3\2\2\2\20f\3\2\2\2\22y\3\2\2\2\24\u00a4\3\2"+
		"\2\2\26\u00bc\3\2\2\2\30\34\5\4\3\2\31\33\5\6\4\2\32\31\3\2\2\2\33\36"+
		"\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7"+
		"\2\2\3 \3\3\2\2\2!\"\7\7\2\2\"#\7&\2\2#$\7\13\2\2$%\7\37\2\2%&\7!\2\2"+
		"&\'\7\n\2\2\'(\7\3\2\2()\7\23\2\2)*\7\35\2\2*+\7\33\2\2+,\7\36\2\2,-\7"+
		"&\2\2-.\7#\2\2./\7\13\2\2/\60\5\24\13\2\60\61\7\17\2\2\61\62\7\17\2\2"+
		"\62\5\3\2\2\2\63\64\7\7\2\2\64\67\7&\2\2\65\66\7\16\2\2\668\7&\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\289\3\2\2\29=\7\13\2\2:<\5\b\5\2;:\3\2\2\2<?\3\2"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\5\n\6\2A@\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\17\2\2G\7\3\2\2\2HI\5"+
		"\22\n\2IJ\7&\2\2JK\7\t\2\2K\t\3\2\2\2LM\7\37\2\2MN\5\22\n\2NO\7&\2\2O"+
		"Q\7\23\2\2PR\5\f\7\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7#\2\2TU\7\13\2\2"+
		"UV\5\20\t\2VW\7\17\2\2W\13\3\2\2\2X]\5\16\b\2YZ\7\26\2\2Z\\\5\16\b\2["+
		"Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_]\3\2\2\2`a\5\22\n"+
		"\2ab\7&\2\2b\17\3\2\2\2ce\5\b\5\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gl\3\2\2\2hf\3\2\2\2ik\5\24\13\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\6\2\2pq\5\26\f\2qr\7\t\2\2r\21\3\2\2\2"+
		"st\7\21\2\2tu\7\33\2\2uz\7\36\2\2vz\7\31\2\2wz\7\21\2\2xz\7&\2\2ys\3\2"+
		"\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\23\3\2\2\2{\177\7\13\2\2|~\5\24\13"+
		"\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u00a5\7\17\2\2\u0083\u0084\7\20\2\2\u0084"+
		"\u0085\7\23\2\2\u0085\u0086\5\26\f\2\u0086\u0087\7#\2\2\u0087\u0088\5"+
		"\24\13\2\u0088\u0089\7\"\2\2\u0089\u008a\5\24\13\2\u008a\u00a5\3\2\2\2"+
		"\u008b\u008c\7\b\2\2\u008c\u008d\7\23\2\2\u008d\u008e\5\26\f\2\u008e\u008f"+
		"\7#\2\2\u008f\u0090\5\24\13\2\u0090\u00a5\3\2\2\2\u0091\u0092\7\32\2\2"+
		"\u0092\u0093\7\23\2\2\u0093\u0094\5\26\f\2\u0094\u0095\7#\2\2\u0095\u0096"+
		"\7\t\2\2\u0096\u00a5\3\2\2\2\u0097\u0098\7&\2\2\u0098\u0099\7\r\2\2\u0099"+
		"\u009a\5\26\f\2\u009a\u009b\7\t\2\2\u009b\u00a5\3\2\2\2\u009c\u009d\7"+
		"&\2\2\u009d\u009e\7\33\2\2\u009e\u009f\5\26\f\2\u009f\u00a0\7\36\2\2\u00a0"+
		"\u00a1\7\r\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\t\2\2\u00a3\u00a5\3"+
		"\2\2\2\u00a4{\3\2\2\2\u00a4\u0083\3\2\2\2\u00a4\u008b\3\2\2\2\u00a4\u0091"+
		"\3\2\2\2\u00a4\u0097\3\2\2\2\u00a4\u009c\3\2\2\2\u00a5\25\3\2\2\2\u00a6"+
		"\u00a7\b\f\1\2\u00a7\u00a8\7 \2\2\u00a8\u00bd\5\26\f\4\u00a9\u00bd\7\'"+
		"\2\2\u00aa\u00bd\7\5\2\2\u00ab\u00bd\7\27\2\2\u00ac\u00bd\7&\2\2\u00ad"+
		"\u00bd\7\25\2\2\u00ae\u00af\7\4\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\7"+
		"\33\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7\36\2\2\u00b3\u00bd\3\2\2\2"+
		"\u00b4\u00b5\7\4\2\2\u00b5\u00b6\7&\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00bd"+
		"\7#\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\7#\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00a6\3\2\2\2\u00bc\u00a9\3\2\2\2\u00bc\u00aa\3\2"+
		"\2\2\u00bc\u00ab\3\2\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc"+
		"\u00ae\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00d9\3\2"+
		"\2\2\u00be\u00bf\f\17\2\2\u00bf\u00c0\t\2\2\2\u00c0\u00d8\5\26\f\20\u00c1"+
		"\u00c2\f\16\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\5\26\f\2\u00c4\u00c5"+
		"\7\36\2\2\u00c5\u00d8\3\2\2\2\u00c6\u00c7\f\r\2\2\u00c7\u00d8\7\22\2\2"+
		"\u00c8\u00c9\f\f\2\2\u00c9\u00ca\7\30\2\2\u00ca\u00cb\7&\2\2\u00cb\u00d4"+
		"\7\23\2\2\u00cc\u00d1\5\26\f\2\u00cd\u00ce\7\26\2\2\u00ce\u00d0\5\26\f"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7#\2\2\u00d7\u00be\3\2"+
		"\2\2\u00d7\u00c1\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d7\u00c8\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\27\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\22\34\67=CQ]fly\177\u00a4\u00bc\u00d1\u00d4\u00d7"+
		"\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}