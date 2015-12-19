// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-19 12:46:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DOUBLE", "ESC_SEQ", 
		"NUM", "STRING", "VAR", "WS", "'('", "')'", "','", "'-'", "'->'", "';'", 
		"'='", "'Double'", "'Function'", "'Integer'", "'Part'", "'Phrase'", "'Score'", 
		"'String'", "'add note'", "'else'", "'get'", "'if'", "'put'", "'return'", 
		"'to'", "'void'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int COMMENT=4;
	public static final int DOUBLE=5;
	public static final int ESC_SEQ=6;
	public static final int NUM=7;
	public static final int STRING=8;
	public static final int VAR=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public simple3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public simple3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return simple3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g"; }


	// override the default error reporting functions
	public void reportError(RecognitionException e) {
	    // call the Parser member function to report the error
	    displayRecognitionError(this.getTokenNames(), e);
	    // exit with error
	    System.exit(1);
	}



	// $ANTLR start "prog"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:23:1: prog returns [AST ast] : ( stmt )+ ;
	public final AST prog() throws RecognitionException {
		AST ast = null;


		Stmt stmt1 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:2: ( ( stmt )+ )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:4: ( stmt )+
			{
			ast = new StmtList();
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:29: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR||(LA1_0 >= 18 && LA1_0 <= 25)||(LA1_0 >= 27 && LA1_0 <= 30)||(LA1_0 >= 32 && LA1_0 <= 34)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:30: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog39);
					stmt1=stmt();
					state._fsp--;

					ast.addAST(stmt1);
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token phr=null;
		Token VAR2=null;
		Token VAR3=null;
		Token VAR4=null;
		Token VAR5=null;
		Token VAR6=null;
		Token VAR8=null;
		Token VAR9=null;
		Token VAR11=null;
		Token VAR13=null;
		Token VAR14=null;
		Stmt s =null;
		int dt =0;
		ArgList l =null;
		Expr instr =null;
		Expr rhy =null;
		Stmt s1 =null;
		Stmt s2 =null;
		Expr exp7 =null;
		Expr exp10 =null;
		Expr exp12 =null;
		Expr exp15 =null;
		Expr exp16 =null;
		Expr exp17 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:2: ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' )
			int alt14=17;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:4: 'void' VAR '(' ')' s= stmt
					{
					match(input,32,FOLLOW_32_in_stmt58); 
					VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_stmt60); 
					match(input,11,FOLLOW_11_in_stmt62); 
					match(input,12,FOLLOW_12_in_stmt63); 
					pushFollow(FOLLOW_stmt_in_stmt67);
					s=stmt();
					state._fsp--;

					 
					                    ast = new FuncDeclStmt((VAR2!=null?VAR2.getText():null),new Function(Value.NOTYPE,new ArgList(),s));
					                
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:32:17: dt= dataType VAR '(' ')' s= stmt
					{
					pushFollow(FOLLOW_dataType_in_stmt129);
					dt=dataType();
					state._fsp--;

					VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_stmt131); 
					match(input,11,FOLLOW_11_in_stmt133); 
					match(input,12,FOLLOW_12_in_stmt135); 
					pushFollow(FOLLOW_stmt_in_stmt139);
					s=stmt();
					state._fsp--;

					 
					                   ast = new FuncDeclStmt((VAR3!=null?VAR3.getText():null),new Function(dt,new ArgList(),s));
					                
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:17: 'void' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,32,FOLLOW_32_in_stmt178); 
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt180); 
					match(input,11,FOLLOW_11_in_stmt182); 
					pushFollow(FOLLOW_formalParamList_in_stmt186);
					l=formalParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt188); 
					pushFollow(FOLLOW_stmt_in_stmt192);
					s=stmt();
					state._fsp--;

					 
					                    ast = new FuncDeclStmt((VAR4!=null?VAR4.getText():null),new Function(Value.NOTYPE,l,s)); 
					                
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:40:17: dt= dataType VAR '(' l= formalParamList ')' s= stmt
					{
					pushFollow(FOLLOW_dataType_in_stmt230);
					dt=dataType();
					state._fsp--;

					VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stmt232); 
					match(input,11,FOLLOW_11_in_stmt234); 
					pushFollow(FOLLOW_formalParamList_in_stmt238);
					l=formalParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt240); 
					pushFollow(FOLLOW_stmt_in_stmt244);
					s=stmt();
					state._fsp--;

					 
					                    ast = new FuncDeclStmt((VAR5!=null?VAR5.getText():null),new Function(dt,l,s)); 
					                
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:17: dt= dataType VAR '=' exp ( ';' )?
					{
					pushFollow(FOLLOW_dataType_in_stmt283);
					dt=dataType();
					state._fsp--;

					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_stmt285); 
					match(input,17,FOLLOW_17_in_stmt287); 
					pushFollow(FOLLOW_exp_in_stmt289);
					exp7=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:41: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==16) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:41: ';'
							{
							match(input,16,FOLLOW_16_in_stmt291); 
							}
							break;

					}

					 
					                    ast = new VarDeclStmt(dt,(VAR6!=null?VAR6.getText():null),exp7); 
					                
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:17: dt= dataType VAR ( ';' )?
					{
					pushFollow(FOLLOW_dataType_in_stmt330);
					dt=dataType();
					state._fsp--;

					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_stmt332); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:33: ( ';' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==16) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:33: ';'
							{
							match(input,16,FOLLOW_16_in_stmt334); 
							}
							break;

					}

					 
					                    ast = new VarDeclStmt(dt,(VAR8!=null?VAR8.getText():null),new ConstExpr(new IntConst("0"))); 
					                
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:17: 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )?
					{
					match(input,25,FOLLOW_25_in_stmt372); 
					pushFollow(FOLLOW_exp_in_stmt376);
					instr=exp();
					state._fsp--;

					pushFollow(FOLLOW_exp_in_stmt380);
					rhy=exp();
					state._fsp--;

					match(input,31,FOLLOW_31_in_stmt382); 
					phr=(Token)match(input,VAR,FOLLOW_VAR_in_stmt386); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:59: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==16) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:59: ';'
							{
							match(input,16,FOLLOW_16_in_stmt388); 
							}
							break;

					}


					                    ast = new NoteStmt(instr, rhy, (phr!=null?phr.getText():null));
					                
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:56:4: VAR '=' exp ( ';' )?
					{
					VAR9=(Token)match(input,VAR,FOLLOW_VAR_in_stmt412); 
					match(input,17,FOLLOW_17_in_stmt414); 
					pushFollow(FOLLOW_exp_in_stmt416);
					exp10=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:56:16: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==16) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:56:16: ';'
							{
							match(input,16,FOLLOW_16_in_stmt418); 
							}
							break;

					}

					 ast = new AssignStmt((VAR9!=null?VAR9.getText():null),exp10); 
					}
					break;
				case 9 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:4: 'get' VAR ( ';' )?
					{
					match(input,27,FOLLOW_27_in_stmt429); 
					VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_stmt431); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:14: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==16) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:14: ';'
							{
							match(input,16,FOLLOW_16_in_stmt433); 
							}
							break;

					}

					 ast = new GetStmt((VAR11!=null?VAR11.getText():null)); 
					}
					break;
				case 10 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:4: 'put' exp ( ';' )?
					{
					match(input,29,FOLLOW_29_in_stmt445); 
					pushFollow(FOLLOW_exp_in_stmt447);
					exp12=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:14: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==16) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:14: ';'
							{
							match(input,16,FOLLOW_16_in_stmt449); 
							}
							break;

					}

					 ast = new PutStmt(exp12); 
					}
					break;
				case 11 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:4: VAR '(' ')' ( ';' )?
					{
					VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_stmt461); 
					match(input,11,FOLLOW_11_in_stmt463); 
					match(input,12,FOLLOW_12_in_stmt465); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:16: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==16) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:16: ';'
							{
							match(input,16,FOLLOW_16_in_stmt467); 
							}
							break;

					}

					 ast = new CallStmt((VAR13!=null?VAR13.getText():null));
					}
					break;
				case 12 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_stmt478); 
					match(input,11,FOLLOW_11_in_stmt480); 
					pushFollow(FOLLOW_actualParamList_in_stmt484);
					l=actualParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt486); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:34: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==16) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:34: ';'
							{
							match(input,16,FOLLOW_16_in_stmt488); 
							}
							break;

					}

					 ast = new CallStmt((VAR14!=null?VAR14.getText():null),l);
					}
					break;
				case 13 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:4: 'return' exp ( ';' )?
					{
					match(input,30,FOLLOW_30_in_stmt497); 
					pushFollow(FOLLOW_exp_in_stmt499);
					exp15=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:17: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==16) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:17: ';'
							{
							match(input,16,FOLLOW_16_in_stmt501); 
							}
							break;

					}

					 ast = new ReturnStmt(exp15); 
					}
					break;
				case 14 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:4: 'return' ( ';' )?
					{
					match(input,30,FOLLOW_30_in_stmt512); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:13: ( ';' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==16) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:13: ';'
							{
							match(input,16,FOLLOW_16_in_stmt514); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
					}
					break;
				case 15 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:4: 'while' '(' exp ')' s= stmt
					{
					match(input,33,FOLLOW_33_in_stmt526); 
					match(input,11,FOLLOW_11_in_stmt528); 
					pushFollow(FOLLOW_exp_in_stmt530);
					exp16=exp();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt532); 
					pushFollow(FOLLOW_stmt_in_stmt536);
					s=stmt();
					state._fsp--;

					 ast = new WhileStmt(exp16,s); 
					}
					break;
				case 16 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,28,FOLLOW_28_in_stmt545); 
					match(input,11,FOLLOW_11_in_stmt547); 
					pushFollow(FOLLOW_exp_in_stmt549);
					exp17=exp();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt551); 
					pushFollow(FOLLOW_stmt_in_stmt555);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp17,s1);
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:67: ( 'else' s2= stmt )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==26) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:68: 'else' s2= stmt
							{
							match(input,26,FOLLOW_26_in_stmt559); 
							pushFollow(FOLLOW_stmt_in_stmt563);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 17 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:4: '{' (s= stmt )+ '}'
					{
					match(input,34,FOLLOW_34_in_stmt574); 
					ast = new BlockStmt();
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:34: (s= stmt )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==VAR||(LA13_0 >= 18 && LA13_0 <= 25)||(LA13_0 >= 27 && LA13_0 <= 30)||(LA13_0 >= 32 && LA13_0 <= 34)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:35: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt581);
							s=stmt();
							state._fsp--;

							ast.addAST(s);
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					match(input,35,FOLLOW_35_in_stmt587); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "stmt"



	// $ANTLR start "dataType"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:68:1: dataType returns [int type] : ( 'String' | 'Integer' | 'Score' | 'Part' | 'Phrase' | 'Function' | 'Double' );
	public final int dataType() throws RecognitionException {
		int type = 0;


		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:9: ( 'String' | 'Integer' | 'Score' | 'Part' | 'Phrase' | 'Function' | 'Double' )
			int alt15=7;
			switch ( input.LA(1) ) {
			case 24:
				{
				alt15=1;
				}
				break;
			case 20:
				{
				alt15=2;
				}
				break;
			case 23:
				{
				alt15=3;
				}
				break;
			case 21:
				{
				alt15=4;
				}
				break;
			case 22:
				{
				alt15=5;
				}
				break;
			case 19:
				{
				alt15=6;
				}
				break;
			case 18:
				{
				alt15=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:17: 'String'
					{
					match(input,24,FOLLOW_24_in_dataType615); 
					 type = Value.STRING; 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:70:17: 'Integer'
					{
					match(input,20,FOLLOW_20_in_dataType650); 
					 type = Value.INTEGER; 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:71:17: 'Score'
					{
					match(input,23,FOLLOW_23_in_dataType684); 
					 type = Value.SCORE; 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:72:17: 'Part'
					{
					match(input,21,FOLLOW_21_in_dataType720); 
					 type = Value.PART; 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:73:17: 'Phrase'
					{
					match(input,22,FOLLOW_22_in_dataType757); 
					 type = Value.PHRASE; 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:74:17: 'Function'
					{
					match(input,19,FOLLOW_19_in_dataType792); 
					 type = Value.FUNCTION; 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:75:17: 'Double'
					{
					match(input,18,FOLLOW_18_in_dataType825); 
					 type = Value.DOUBLE; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "dataType"



	// $ANTLR start "formalParamList"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:1: formalParamList returns [ArgList ast] : dataType v1= VAR ( ',' dataType v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:2: ( dataType v1= VAR ( ',' dataType v2= VAR )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:4: dataType v1= VAR ( ',' dataType v2= VAR )*
			{
			pushFollow(FOLLOW_dataType_in_formalParamList864);
			dataType();
			state._fsp--;

			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList868); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:64: ( ',' dataType v2= VAR )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==13) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:65: ',' dataType v2= VAR
					{
					match(input,13,FOLLOW_13_in_formalParamList872); 
					pushFollow(FOLLOW_dataType_in_formalParamList874);
					dataType();
					state._fsp--;

					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList878); 
					ast.addAST(new VarExpr((v2!=null?v2.getText():null)));
					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "formalParamList"



	// $ANTLR start "actualParamList"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:82:1: actualParamList returns [ArgList ast] : (e1= exp ( ',' e2= exp )* |v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )* );
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;
		Expr e1 =null;
		Expr e2 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:83:2: (e1= exp ( ',' e2= exp )* |v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )* )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DOUBLE||(LA19_0 >= NUM && LA19_0 <= STRING)||LA19_0==11||LA19_0==14) ) {
				alt19=1;
			}
			else if ( (LA19_0==VAR) ) {
				int LA19_2 = input.LA(2);
				if ( ((LA19_2 >= 11 && LA19_2 <= 13)) ) {
					alt19=1;
				}
				else if ( (LA19_2==15) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:83:4: e1= exp ( ',' e2= exp )*
					{
					pushFollow(FOLLOW_exp_in_actualParamList901);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:85:19: ( ',' e2= exp )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==13) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:85:20: ',' e2= exp
							{
							match(input,13,FOLLOW_13_in_actualParamList906); 
							pushFollow(FOLLOW_exp_in_actualParamList910);
							e2=exp();
							state._fsp--;

							ast.addAST(e2);
							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:86:17: v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )*
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList935); 
					match(input,15,FOLLOW_15_in_actualParamList937); 
					pushFollow(FOLLOW_exp_in_actualParamList941);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                    ast.addKeyword((v1!=null?v1.getText():null));
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:89:19: ( ',' v2= VAR '->' e2= exp )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==13) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:89:20: ',' v2= VAR '->' e2= exp
							{
							match(input,13,FOLLOW_13_in_actualParamList946); 
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList950); 
							match(input,15,FOLLOW_15_in_actualParamList952); 
							pushFollow(FOLLOW_exp_in_actualParamList956);
							e2=exp();
							state._fsp--;


							                    ast.addAST(e2);
							                    ast.addKeyword((v2!=null?v2.getText():null));
							                
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "actualParamList"



	// $ANTLR start "exp"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:95:1: exp returns [Expr ast] : e1= atom ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:96:2: (e1= atom )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:96:4: e1= atom
			{
			pushFollow(FOLLOW_atom_in_exp978);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "exp"



	// $ANTLR start "atom"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:99:1: atom returns [Expr ast] : ( '(' exp ')' | VAR '(' ')' | VAR '(' l= actualParamList ')' | VAR | NUM | '-' NUM | DOUBLE | STRING );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR19=null;
		Token VAR20=null;
		Token VAR21=null;
		Token NUM22=null;
		Token NUM23=null;
		Token DOUBLE24=null;
		Token STRING25=null;
		ArgList l =null;
		Expr exp18 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:2: ( '(' exp ')' | VAR '(' ')' | VAR '(' l= actualParamList ')' | VAR | NUM | '-' NUM | DOUBLE | STRING )
			int alt20=8;
			switch ( input.LA(1) ) {
			case 11:
				{
				alt20=1;
				}
				break;
			case VAR:
				{
				int LA20_2 = input.LA(2);
				if ( (LA20_2==11) ) {
					switch ( input.LA(3) ) {
					case 12:
						{
						alt20=2;
						}
						break;
					case 11:
						{
						switch ( input.LA(4) ) {
						case 11:
							{
							alt20=3;
							}
							break;
						case VAR:
							{
							alt20=3;
							}
							break;
						case NUM:
							{
							alt20=3;
							}
							break;
						case 14:
							{
							alt20=3;
							}
							break;
						case DOUBLE:
							{
							alt20=3;
							}
							break;
						case STRING:
							{
							alt20=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 36, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case VAR:
						{
						switch ( input.LA(4) ) {
						case 11:
							{
							alt20=3;
							}
							break;
						case 13:
						case 15:
							{
							alt20=3;
							}
							break;
						case 12:
							{
							alt20=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 37, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case NUM:
						{
						int LA20_38 = input.LA(4);
						if ( (LA20_38==13) ) {
							alt20=3;
						}
						else if ( (LA20_38==12) ) {
							alt20=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 38, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 14:
						{
						int LA20_39 = input.LA(4);
						if ( (LA20_39==NUM) ) {
							alt20=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 39, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DOUBLE:
						{
						int LA20_40 = input.LA(4);
						if ( (LA20_40==13) ) {
							alt20=3;
						}
						else if ( (LA20_40==12) ) {
							alt20=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 40, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case STRING:
						{
						int LA20_41 = input.LA(4);
						if ( (LA20_41==13) ) {
							alt20=3;
						}
						else if ( (LA20_41==12) ) {
							alt20=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 41, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA20_2==EOF||LA20_2==DOUBLE||(LA20_2 >= NUM && LA20_2 <= VAR)||(LA20_2 >= 12 && LA20_2 <= 14)||LA20_2==16||(LA20_2 >= 18 && LA20_2 <= 35)) ) {
					alt20=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NUM:
				{
				alt20=5;
				}
				break;
			case 14:
				{
				alt20=6;
				}
				break;
			case DOUBLE:
				{
				alt20=7;
				}
				break;
			case STRING:
				{
				alt20=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:4: '(' exp ')'
					{
					match(input,11,FOLLOW_11_in_atom1002); 
					pushFollow(FOLLOW_exp_in_atom1004);
					exp18=exp();
					state._fsp--;

					match(input,12,FOLLOW_12_in_atom1006); 
					 ast = new ParenExpr(exp18); 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:4: VAR '(' ')'
					{
					VAR19=(Token)match(input,VAR,FOLLOW_VAR_in_atom1018); 
					match(input,11,FOLLOW_11_in_atom1020); 
					match(input,12,FOLLOW_12_in_atom1022); 
					 ast = new CallExpr((VAR19!=null?VAR19.getText():null));
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:102:4: VAR '(' l= actualParamList ')'
					{
					VAR20=(Token)match(input,VAR,FOLLOW_VAR_in_atom1031); 
					match(input,11,FOLLOW_11_in_atom1033); 
					pushFollow(FOLLOW_actualParamList_in_atom1037);
					l=actualParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_atom1039); 
					 ast = new CallExpr((VAR20!=null?VAR20.getText():null),l); 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:103:4: VAR
					{
					VAR21=(Token)match(input,VAR,FOLLOW_VAR_in_atom1047); 
					 ast = new VarExpr((VAR21!=null?VAR21.getText():null)); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:104:4: NUM
					{
					NUM22=(Token)match(input,NUM,FOLLOW_NUM_in_atom1057); 
					 ast = new NumExpr((NUM22!=null?NUM22.getText():null)); 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:105:4: '-' NUM
					{
					match(input,14,FOLLOW_14_in_atom1067); 
					NUM23=(Token)match(input,NUM,FOLLOW_NUM_in_atom1069); 
					 ast = new NumExpr('-' + (NUM23!=null?NUM23.getText():null)); 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:106:4: DOUBLE
					{
					DOUBLE24=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1079); 
					 ast = new DoubleExpr((DOUBLE24!=null?DOUBLE24.getText():null)); 
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:107:17: STRING
					{
					STRING25=(Token)match(input,STRING,FOLLOW_STRING_in_atom1102); 
					 
					                    String s = (STRING25!=null?STRING25.getText():null);

					                    if (s.equals("String")) {
					                        ast = new ConstExpr(new StringConst(s));
					                    }
					                    else if (s.equals("Score")) {
					                        ast = new ConstExpr(new ScoreConst());
					                    }
					                    else if (s.equals("Part")) {
					                        ast = new ConstExpr(new PartConst());
					                    }
					                    else if (s.equals("Phrase")) {
					                        ast = new ConstExpr(new PhraseConst());
					                    }
					                    else {
					                        String t;

					                        if ((s != null) && (s.length() > 0)) {
					                            t = s.substring(1, s.length()-1);
					                        }
					                        else {
					                            t = new String(s);
					                        }
					                        ast = new ConstExpr(new StringConst(t)); 
					                    }
					                
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "atom"

	// Delegated rules


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\u0133\uffff";
	static final String DFA14_eofS =
		"\15\uffff\1\41\4\uffff\7\67\3\uffff\1\33\u0116\uffff";
	static final String DFA14_minS =
		"\11\11\1\uffff\1\13\2\uffff\1\5\3\uffff\1\13\7\11\1\uffff\1\5\1\uffff"+
		"\1\11\27\uffff\2\14\25\uffff\1\14\25\uffff\1\14\25\uffff\1\14\25\uffff"+
		"\1\14\25\uffff\1\14\25\uffff\1\14\34\uffff\1\5\134\uffff";
	static final String DFA14_maxS =
		"\1\42\10\11\1\uffff\1\21\2\uffff\1\43\3\uffff\1\13\7\43\1\uffff\1\16\1"+
		"\uffff\1\43\27\uffff\2\30\25\uffff\1\30\25\uffff\1\30\25\uffff\1\30\25"+
		"\uffff\1\30\25\uffff\1\30\25\uffff\1\30\34\uffff\1\16\134\uffff";
	static final String DFA14_acceptS =
		"\11\uffff\1\7\1\uffff\1\11\1\12\1\uffff\1\17\1\20\1\21\10\uffff\1\10\1"+
		"\uffff\1\15\5\uffff\1\16\24\uffff\1\5\1\6\u0097\uffff\1\13\1\14\33\uffff"+
		"\1\1\1\3\6\uffff\1\2\1\4\66\uffff\7\15";
	static final String DFA14_specialS =
		"\u0133\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\12\10\uffff\1\10\1\7\1\3\1\5\1\6\1\4\1\2\1\11\1\uffff\1\13\1\17\1"+
			"\14\1\15\1\uffff\1\1\1\16\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"",
			"\1\32\5\uffff\1\31",
			"",
			"",
			"\1\33\1\uffff\2\33\1\34\1\uffff\1\33\2\uffff\1\33\1\uffff\1\41\1\uffff"+
			"\15\41\1\uffff\4\41",
			"",
			"",
			"",
			"\1\64",
			"\1\67\1\uffff\1\65\4\uffff\1\67\1\66\15\67\1\uffff\4\67",
			"\1\67\1\uffff\1\113\4\uffff\1\67\1\66\15\67\1\uffff\4\67",
			"\1\67\1\uffff\1\141\4\uffff\1\67\1\66\15\67\1\uffff\4\67",
			"\1\67\1\uffff\1\167\4\uffff\1\67\1\66\15\67\1\uffff\4\67",
			"\1\67\1\uffff\1\u008d\4\uffff\1\67\1\66\15\67\1\uffff\4\67",
			"\1\67\1\uffff\1\u00a3\4\uffff\1\67\1\66\15\67\1\uffff\4\67",
			"\1\67\1\uffff\1\u00b9\4\uffff\1\67\1\66\15\67\1\uffff\4\67",
			"",
			"\1\u00d0\1\uffff\3\u00d0\1\uffff\1\u00d0\1\u00cf\1\uffff\1\u00d0",
			"",
			"\1\33\1\uffff\1\u00d6\4\uffff\1\33\1\41\15\33\1\uffff\4\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ec\5\uffff\7\u00ed",
			"\1\u00f4\5\uffff\7\u00f5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f4\5\uffff\7\u00f5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f4\5\uffff\7\u00f5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f4\5\uffff\7\u00f5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f4\5\uffff\7\u00f5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f4\5\uffff\7\u00f5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f4\5\uffff\7\u00f5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0131\1\uffff\1\u012f\1\u0132\1\u012e\1\uffff\1\u012d\1\u012c\1\uffff"+
			"\1\u0130",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x000000077BFC0202L});
	public static final BitSet FOLLOW_32_in_stmt58 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt60 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt62 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt63 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt129 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt131 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt133 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt135 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stmt178 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt180 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt182 = new BitSet(new long[]{0x0000000001FC0000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt186 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt188 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt230 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt232 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt234 = new BitSet(new long[]{0x0000000001FC0000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt238 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt240 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt283 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt285 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt287 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt289 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt330 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt332 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt372 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt376 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt380 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_stmt382 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt386 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt412 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt414 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt416 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt429 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt431 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt445 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt447 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt461 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt463 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt465 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt478 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt480 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_actualParamList_in_stmt484 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt486 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt497 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt499 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt512 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_stmt514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_stmt526 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt528 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt530 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt532 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt545 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt547 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_stmt549 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt551 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt555 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_stmt559 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_stmt574 = new BitSet(new long[]{0x000000077BFC0200L});
	public static final BitSet FOLLOW_stmt_in_stmt581 = new BitSet(new long[]{0x0000000F7BFC0200L});
	public static final BitSet FOLLOW_35_in_stmt587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_dataType615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_dataType650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_dataType684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_dataType720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_dataType757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_dataType792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_dataType825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_formalParamList864 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_formalParamList868 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_formalParamList872 = new BitSet(new long[]{0x0000000001FC0000L});
	public static final BitSet FOLLOW_dataType_in_formalParamList874 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_formalParamList878 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_exp_in_actualParamList901 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_actualParamList906 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_actualParamList910 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_VAR_in_actualParamList935 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_actualParamList937 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_actualParamList941 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_actualParamList946 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_actualParamList950 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_actualParamList952 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_actualParamList956 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_atom_in_exp978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_atom1002 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_exp_in_atom1004 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1018 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom1020 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1031 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom1033 = new BitSet(new long[]{0x0000000000004BA0L});
	public static final BitSet FOLLOW_actualParamList_in_atom1037 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_atom1067 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NUM_in_atom1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_atom1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1102 = new BitSet(new long[]{0x0000000000000002L});
}
