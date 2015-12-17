// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-16 19:07:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", 
		"VAR", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<='", 
		"'='", "'=='", "'create song '", "'declare'", "'else'", "'get'", "'if'", 
		"'play'", "'put'", "'return'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
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
	public static final int COMMENT=4;
	public static final int ESC_SEQ=5;
	public static final int NUM=6;
	public static final int STRING=7;
	public static final int VAR=8;
	public static final int WS=9;

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
				if ( (LA1_0==VAR||(LA1_0 >= 21 && LA1_0 <= 22)||(LA1_0 >= 24 && LA1_0 <= 30)) ) {
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:27:1: stmt returns [Stmt ast] : ( 'create song ' STRING ( ';' )? | 'play' ( ';' )? | 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token STRING2=null;
		Token VAR3=null;
		Token VAR4=null;
		Token VAR5=null;
		Token VAR7=null;
		Token VAR8=null;
		Token VAR10=null;
		Token VAR12=null;
		Token VAR13=null;
		Stmt s =null;
		ArgList l =null;
		Stmt s1 =null;
		Stmt s2 =null;
		Expr exp6 =null;
		Expr exp9 =null;
		Expr exp11 =null;
		Expr exp14 =null;
		Expr exp15 =null;
		Expr exp16 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:2: ( 'create song ' STRING ( ';' )? | 'play' ( ';' )? | 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' )
			int alt15=16;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:4: 'create song ' STRING ( ';' )?
					{
					match(input,21,FOLLOW_21_in_stmt58); 
					STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_stmt60); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:26: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==17) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:26: ';'
							{
							match(input,17,FOLLOW_17_in_stmt62); 
							}
							break;

					}

					 ast = new CreateSongStmt((STRING2!=null?STRING2.getText():null)); 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:29:17: 'play' ( ';' )?
					{
					match(input,26,FOLLOW_26_in_stmt104); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:29:24: ( ';' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==17) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:29:24: ';'
							{
							match(input,17,FOLLOW_17_in_stmt106); 
							}
							break;

					}

					 ast = new PlayStmt(); 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:30:17: 'declare' VAR '(' ')' s= stmt
					{
					match(input,22,FOLLOW_22_in_stmt163); 
					VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_stmt165); 
					match(input,10,FOLLOW_10_in_stmt167); 
					match(input,11,FOLLOW_11_in_stmt169); 
					pushFollow(FOLLOW_stmt_in_stmt173);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR3!=null?VAR3.getText():null),new Function(new ArgList(),s));	
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:31:4: 'declare' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,22,FOLLOW_22_in_stmt182); 
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt184); 
					match(input,10,FOLLOW_10_in_stmt186); 
					pushFollow(FOLLOW_formalParamList_in_stmt190);
					l=formalParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt192); 
					pushFollow(FOLLOW_stmt_in_stmt196);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR4!=null?VAR4.getText():null),new Function(l,s)); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:32:4: 'declare' VAR '=' exp ( ';' )?
					{
					match(input,22,FOLLOW_22_in_stmt203); 
					VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stmt205); 
					match(input,19,FOLLOW_19_in_stmt207); 
					pushFollow(FOLLOW_exp_in_stmt209);
					exp6=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:32:26: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==17) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:32:26: ';'
							{
							match(input,17,FOLLOW_17_in_stmt211); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR5!=null?VAR5.getText():null),exp6); 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:33:4: 'declare' VAR ( ';' )?
					{
					match(input,22,FOLLOW_22_in_stmt221); 
					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_stmt223); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:33:18: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==17) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:33:18: ';'
							{
							match(input,17,FOLLOW_17_in_stmt225); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR7!=null?VAR7.getText():null),new NumExpr(0)); 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:34:4: VAR '=' exp ( ';' )?
					{
					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_stmt236); 
					match(input,19,FOLLOW_19_in_stmt238); 
					pushFollow(FOLLOW_exp_in_stmt240);
					exp9=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:34:16: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==17) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:34:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt242); 
							}
							break;

					}

					 ast = new AssignStmt((VAR8!=null?VAR8.getText():null),exp9); 
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:35:4: 'get' VAR ( ';' )?
					{
					match(input,24,FOLLOW_24_in_stmt253); 
					VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_stmt255); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:35:14: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==17) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:35:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt257); 
							}
							break;

					}

					 ast = new GetStmt((VAR10!=null?VAR10.getText():null)); 
					}
					break;
				case 9 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:4: 'put' exp ( ';' )?
					{
					match(input,27,FOLLOW_27_in_stmt269); 
					pushFollow(FOLLOW_exp_in_stmt271);
					exp11=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:14: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==17) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt273); 
							}
							break;

					}

					 ast = new PutStmt(exp11); 
					}
					break;
				case 10 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:37:4: VAR '(' ')' ( ';' )?
					{
					VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_stmt285); 
					match(input,10,FOLLOW_10_in_stmt287); 
					match(input,11,FOLLOW_11_in_stmt289); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:37:16: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==17) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:37:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt291); 
							}
							break;

					}

					 ast = new CallStmt((VAR12!=null?VAR12.getText():null));
					}
					break;
				case 11 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:38:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_stmt302); 
					match(input,10,FOLLOW_10_in_stmt304); 
					pushFollow(FOLLOW_actualParamList_in_stmt308);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt310); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:38:34: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==17) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:38:34: ';'
							{
							match(input,17,FOLLOW_17_in_stmt312); 
							}
							break;

					}

					 ast = new CallStmt((VAR13!=null?VAR13.getText():null),l);
					}
					break;
				case 12 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:39:4: 'return' exp ( ';' )?
					{
					match(input,28,FOLLOW_28_in_stmt321); 
					pushFollow(FOLLOW_exp_in_stmt323);
					exp14=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:39:17: ( ';' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==17) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:39:17: ';'
							{
							match(input,17,FOLLOW_17_in_stmt325); 
							}
							break;

					}

					 ast = new ReturnStmt(exp14); 
					}
					break;
				case 13 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:40:4: 'return' ( ';' )?
					{
					match(input,28,FOLLOW_28_in_stmt336); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:40:13: ( ';' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==17) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:40:13: ';'
							{
							match(input,17,FOLLOW_17_in_stmt338); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
					}
					break;
				case 14 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:41:4: 'while' '(' exp ')' s= stmt
					{
					match(input,29,FOLLOW_29_in_stmt350); 
					match(input,10,FOLLOW_10_in_stmt352); 
					pushFollow(FOLLOW_exp_in_stmt354);
					exp15=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt356); 
					pushFollow(FOLLOW_stmt_in_stmt360);
					s=stmt();
					state._fsp--;

					 ast = new WhileStmt(exp15,s); 
					}
					break;
				case 15 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:42:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,25,FOLLOW_25_in_stmt369); 
					match(input,10,FOLLOW_10_in_stmt371); 
					pushFollow(FOLLOW_exp_in_stmt373);
					exp16=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt375); 
					pushFollow(FOLLOW_stmt_in_stmt379);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp16,s1);
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:42:67: ( 'else' s2= stmt )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==23) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:42:68: 'else' s2= stmt
							{
							match(input,23,FOLLOW_23_in_stmt383); 
							pushFollow(FOLLOW_stmt_in_stmt387);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 16 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:43:4: '{' (s= stmt )+ '}'
					{
					match(input,30,FOLLOW_30_in_stmt398); 
					ast = new BlockStmt();
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:43:34: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==VAR||(LA14_0 >= 21 && LA14_0 <= 22)||(LA14_0 >= 24 && LA14_0 <= 30)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:43:35: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt405);
							s=stmt();
							state._fsp--;

							ast.addAST(s);
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input,31,FOLLOW_31_in_stmt411); 
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



	// $ANTLR start "formalParamList"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:46:1: formalParamList returns [ArgList ast] : v1= VAR ( ',' v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:47:2: (v1= VAR ( ',' v2= VAR )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:47:4: v1= VAR ( ',' v2= VAR )*
			{
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList428); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:47:55: ( ',' v2= VAR )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==14) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:47:56: ',' v2= VAR
					{
					match(input,14,FOLLOW_14_in_formalParamList432); 
					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList436); 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:50:1: actualParamList returns [ArgList ast] : e1= exp ( ',' e2= exp )* ;
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:51:2: (e1= exp ( ',' e2= exp )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:51:4: e1= exp ( ',' e2= exp )*
			{
			pushFollow(FOLLOW_exp_in_actualParamList460);
			e1=exp();
			state._fsp--;

			ast = new ArgList(e1);
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:51:43: ( ',' e2= exp )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==14) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:51:44: ',' e2= exp
					{
					match(input,14,FOLLOW_14_in_actualParamList465); 
					pushFollow(FOLLOW_exp_in_actualParamList469);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:54:1: exp returns [Expr ast] : relexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr relexp17 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:55:2: ( relexp )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:55:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp489);
			relexp17=relexp();
			state._fsp--;

			ast = relexp17; 
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



	// $ANTLR start "relexp"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp506);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==20) ) {
					alt18=1;
				}
				else if ( (LA18_0==18) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:4: ( '==' e2= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:4: ( '==' e2= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:5: '==' e2= addexp
					{
					match(input,20,FOLLOW_20_in_relexp519); 
					pushFollow(FOLLOW_addexp_in_relexp523);
					e2=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:4: ( '<=' e3= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:4: ( '<=' e3= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:5: '<=' e3= addexp
					{
					match(input,18,FOLLOW_18_in_relexp533); 
					pushFollow(FOLLOW_addexp_in_relexp537);
					e3=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.LESSEQ,ast,e3); 
					}

					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "relexp"



	// $ANTLR start "addexp"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:66:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:66:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp562);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:67:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop19:
			while (true) {
				int alt19=3;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==13) ) {
					alt19=1;
				}
				else if ( (LA19_0==15) ) {
					alt19=2;
				}

				switch (alt19) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:68:4: ( '+' e2= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:68:4: ( '+' e2= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:68:5: '+' e2= mulexp
					{
					match(input,13,FOLLOW_13_in_addexp574); 
					pushFollow(FOLLOW_mulexp_in_addexp578);
					e2=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:4: ( '-' e3= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:4: ( '-' e3= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:5: '-' e3= mulexp
					{
					match(input,15,FOLLOW_15_in_addexp588); 
					pushFollow(FOLLOW_mulexp_in_addexp592);
					e3=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MINUS,ast,e3); 
					}

					}
					break;

				default :
					break loop19;
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
	// $ANTLR end "addexp"



	// $ANTLR start "mulexp"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:73:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:74:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:74:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp618);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:75:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==12) ) {
					alt20=1;
				}
				else if ( (LA20_0==16) ) {
					alt20=2;
				}

				switch (alt20) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:76:4: ( '*' e2= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:76:4: ( '*' e2= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:76:5: '*' e2= atom
					{
					match(input,12,FOLLOW_12_in_mulexp630); 
					pushFollow(FOLLOW_atom_in_mulexp634);
					e2=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:77:4: ( '/' e3= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:77:4: ( '/' e3= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:77:5: '/' e3= atom
					{
					match(input,16,FOLLOW_16_in_mulexp644); 
					pushFollow(FOLLOW_atom_in_mulexp648);
					e3=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.DIV,ast,e3); 
					}

					}
					break;

				default :
					break loop20;
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
	// $ANTLR end "mulexp"



	// $ANTLR start "atom"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:81:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR19=null;
		Token NUM20=null;
		Token NUM21=null;
		Token VAR22=null;
		Token VAR23=null;
		Token STRING24=null;
		ArgList l =null;
		Expr exp18 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:82:2: ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING )
			int alt21=7;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt21=1;
				}
				break;
			case VAR:
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2==10) ) {
					int LA21_6 = input.LA(3);
					if ( (LA21_6==11) ) {
						alt21=5;
					}
					else if ( ((LA21_6 >= NUM && LA21_6 <= VAR)||LA21_6==10||LA21_6==15) ) {
						alt21=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA21_2==EOF||LA21_2==VAR||(LA21_2 >= 11 && LA21_2 <= 18)||(LA21_2 >= 20 && LA21_2 <= 31)) ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NUM:
				{
				alt21=3;
				}
				break;
			case 15:
				{
				alt21=4;
				}
				break;
			case STRING:
				{
				alt21=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:82:4: '(' exp ')'
					{
					match(input,10,FOLLOW_10_in_atom672); 
					pushFollow(FOLLOW_exp_in_atom674);
					exp18=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom676); 
					 ast = new ParenExpr(exp18); 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:83:4: VAR
					{
					VAR19=(Token)match(input,VAR,FOLLOW_VAR_in_atom688); 
					 ast = new VarExpr((VAR19!=null?VAR19.getText():null)); 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:4: NUM
					{
					NUM20=(Token)match(input,NUM,FOLLOW_NUM_in_atom698); 
					 ast = new NumExpr((NUM20!=null?NUM20.getText():null)); 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:85:4: '-' NUM
					{
					match(input,15,FOLLOW_15_in_atom708); 
					NUM21=(Token)match(input,NUM,FOLLOW_NUM_in_atom710); 
					 ast = new NumExpr('-' + (NUM21!=null?NUM21.getText():null)); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:86:4: VAR '(' ')'
					{
					VAR22=(Token)match(input,VAR,FOLLOW_VAR_in_atom720); 
					match(input,10,FOLLOW_10_in_atom722); 
					match(input,11,FOLLOW_11_in_atom724); 
					 ast = new CallExpr((VAR22!=null?VAR22.getText():null));
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:87:4: VAR '(' l= actualParamList ')'
					{
					VAR23=(Token)match(input,VAR,FOLLOW_VAR_in_atom733); 
					match(input,10,FOLLOW_10_in_atom735); 
					pushFollow(FOLLOW_actualParamList_in_atom739);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom741); 
					 ast = new CallExpr((VAR23!=null?VAR23.getText():null),l); 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:17: STRING
					{
					STRING24=(Token)match(input,STRING,FOLLOW_STRING_in_atom762); 
					 ast = new ValueExpr(new Value((STRING24!=null?STRING24.getText():null))); 
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


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\124\uffff";
	static final String DFA15_eofS =
		"\7\uffff\1\23\3\uffff\1\42\3\uffff\1\16\104\uffff";
	static final String DFA15_minS =
		"\1\10\2\uffff\1\10\1\12\2\uffff\1\6\3\uffff\1\10\1\uffff\1\6\1\uffff\1"+
		"\10\20\uffff\1\10\25\uffff\1\6\35\uffff";
	static final String DFA15_maxS =
		"\1\36\2\uffff\1\10\1\23\2\uffff\1\37\3\uffff\1\37\1\uffff\1\17\1\uffff"+
		"\1\37\20\uffff\1\13\25\uffff\1\17\35\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\2\uffff\1\10\1\11\1\uffff\1\16\1\17\1\20\1\uffff\1\7"+
		"\1\uffff\1\14\4\uffff\1\15\15\uffff\1\5\1\6\15\uffff\1\12\1\13\32\uffff"+
		"\1\3\1\4\6\14";
	static final String DFA15_specialS =
		"\124\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\4\14\uffff\1\1\1\3\1\uffff\1\5\1\11\1\2\1\6\1\7\1\10\1\12",
			"",
			"",
			"\1\13",
			"\1\15\10\uffff\1\14",
			"",
			"",
			"\2\16\1\17\1\uffff\1\16\4\uffff\1\16\1\uffff\1\23\3\uffff\13\23",
			"",
			"",
			"",
			"\1\42\1\uffff\1\40\6\uffff\1\42\1\uffff\1\41\1\uffff\13\42",
			"",
			"\3\61\1\uffff\1\61\1\60\3\uffff\1\61",
			"",
			"\1\16\1\uffff\1\66\1\uffff\2\16\1\uffff\4\16\1\23\14\16",
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
			"\1\115\2\uffff\1\114",
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
			"\1\121\1\123\1\120\1\uffff\1\117\1\116\3\uffff\1\122",
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

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "27:1: stmt returns [Stmt ast] : ( 'create song ' STRING ( ';' )? | 'play' ( ';' )? | 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x000000007F600102L});
	public static final BitSet FOLLOW_21_in_stmt58 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_in_stmt60 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_stmt104 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt163 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt165 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt167 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt169 = new BitSet(new long[]{0x000000007F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt182 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt184 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt186 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_formalParamList_in_stmt190 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt192 = new BitSet(new long[]{0x000000007F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt203 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt205 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt207 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt209 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt221 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt223 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt236 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt238 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt240 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_stmt253 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt255 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt269 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt271 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt285 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt287 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt289 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt302 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt304 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_stmt308 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt310 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt321 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt323 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt336 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt350 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt352 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt354 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt356 = new BitSet(new long[]{0x000000007F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt369 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt371 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt373 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt375 = new BitSet(new long[]{0x000000007F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt379 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt383 = new BitSet(new long[]{0x000000007F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt398 = new BitSet(new long[]{0x000000007F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt405 = new BitSet(new long[]{0x00000000FF600100L});
	public static final BitSet FOLLOW_31_in_stmt411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formalParamList428 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_formalParamList432 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_formalParamList436 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_exp_in_actualParamList460 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_actualParamList465 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_actualParamList469 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_relexp_in_exp489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp506 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_relexp519 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp523 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_relexp533 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp537 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_mulexp_in_addexp562 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_13_in_addexp574 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp578 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_15_in_addexp588 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp592 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_atom_in_mulexp618 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_12_in_mulexp630 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp634 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_16_in_mulexp644 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp648 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_10_in_atom672 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_atom674 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_atom708 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUM_in_atom710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom720 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom722 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom733 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom735 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_atom739 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom762 = new BitSet(new long[]{0x0000000000000002L});
}
