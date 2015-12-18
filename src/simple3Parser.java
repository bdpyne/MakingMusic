// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-18 01:07:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", 
		"VAR", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<='", 
		"'='", "'=='", "'Part'", "'create song '", "'declare'", "'else'", "'fun'", 
		"'generate'", "'get'", "'if'", "'on'", "'play'", "'put'", "'return'", 
		"'while'", "'{'", "'}'"
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
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
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
				if ( (LA1_0==VAR||(LA1_0 >= 21 && LA1_0 <= 23)||(LA1_0 >= 25 && LA1_0 <= 28)||(LA1_0 >= 30 && LA1_0 <= 34)) ) {
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:27:1: stmt returns [Stmt ast] : ( 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | 'Part' exp ( ';' )? | 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )? | 'fun' VAR '(' ')' s= stmt | 'fun' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token ntype=null;
		Token STRING2=null;
		Token VAR4=null;
		Token VAR5=null;
		Token VAR6=null;
		Token VAR8=null;
		Token VAR9=null;
		Token VAR11=null;
		Token VAR13=null;
		Token VAR14=null;
		Expr num =null;
		Expr instr =null;
		Stmt s =null;
		ArgList l =null;
		Stmt s1 =null;
		Stmt s2 =null;
		Expr exp3 =null;
		Expr exp7 =null;
		Expr exp10 =null;
		Expr exp12 =null;
		Expr exp15 =null;
		Expr exp16 =null;
		Expr exp17 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:2: ( 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | 'Part' exp ( ';' )? | 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )? | 'fun' VAR '(' ')' s= stmt | 'fun' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' )
			int alt17=18;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:4: 'create song ' STRING ( ';' )?
					{
					match(input,22,FOLLOW_22_in_stmt58); 
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
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:29:17: 'generate' ( ';' )?
					{
					match(input,26,FOLLOW_26_in_stmt104); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:29:28: ( ';' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==17) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:29:28: ';'
							{
							match(input,17,FOLLOW_17_in_stmt106); 
							}
							break;

					}

					 ast = new GenerateStmt(); 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:30:17: 'Part' exp ( ';' )?
					{
					match(input,21,FOLLOW_21_in_stmt159); 
					pushFollow(FOLLOW_exp_in_stmt161);
					exp3=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:30:28: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==17) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:30:28: ';'
							{
							match(input,17,FOLLOW_17_in_stmt163); 
							}
							break;

					}

					 ast = new PartStmt(exp3); 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:31:17: 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )?
					{
					match(input,30,FOLLOW_30_in_stmt217); 
					pushFollow(FOLLOW_exp_in_stmt221);
					num=exp();
					state._fsp--;

					ntype=(Token)match(input,VAR,FOLLOW_VAR_in_stmt225); 
					match(input,29,FOLLOW_29_in_stmt227); 
					pushFollow(FOLLOW_exp_in_stmt231);
					instr=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:31:57: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==17) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:31:57: ';'
							{
							match(input,17,FOLLOW_17_in_stmt233); 
							}
							break;

					}

					 ast = new PhraseStmt(num, (ntype!=null?ntype.getText():null), instr); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:32:17: 'fun' VAR '(' ')' s= stmt
					{
					match(input,25,FOLLOW_25_in_stmt257); 
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt259); 
					match(input,10,FOLLOW_10_in_stmt261); 
					match(input,11,FOLLOW_11_in_stmt263); 
					pushFollow(FOLLOW_stmt_in_stmt267);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR4!=null?VAR4.getText():null),new Function(new ArgList(),s)); 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:33:4: 'fun' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,25,FOLLOW_25_in_stmt276); 
					VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stmt278); 
					match(input,10,FOLLOW_10_in_stmt280); 
					pushFollow(FOLLOW_formalParamList_in_stmt284);
					l=formalParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt286); 
					pushFollow(FOLLOW_stmt_in_stmt290);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR5!=null?VAR5.getText():null),new Function(l,s)); 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:34:4: 'declare' VAR '=' exp ( ';' )?
					{
					match(input,23,FOLLOW_23_in_stmt297); 
					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_stmt299); 
					match(input,19,FOLLOW_19_in_stmt301); 
					pushFollow(FOLLOW_exp_in_stmt303);
					exp7=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:34:26: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==17) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:34:26: ';'
							{
							match(input,17,FOLLOW_17_in_stmt305); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR6!=null?VAR6.getText():null),exp7); 
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:35:4: 'declare' VAR ( ';' )?
					{
					match(input,23,FOLLOW_23_in_stmt315); 
					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_stmt317); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:35:18: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==17) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:35:18: ';'
							{
							match(input,17,FOLLOW_17_in_stmt319); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR8!=null?VAR8.getText():null),new NumExpr(0)); 
					}
					break;
				case 9 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:4: VAR '=' exp ( ';' )?
					{
					VAR9=(Token)match(input,VAR,FOLLOW_VAR_in_stmt330); 
					match(input,19,FOLLOW_19_in_stmt332); 
					pushFollow(FOLLOW_exp_in_stmt334);
					exp10=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:16: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==17) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt336); 
							}
							break;

					}

					 ast = new AssignStmt((VAR9!=null?VAR9.getText():null),exp10); 
					}
					break;
				case 10 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:37:4: 'get' VAR ( ';' )?
					{
					match(input,27,FOLLOW_27_in_stmt347); 
					VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_stmt349); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:37:14: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==17) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:37:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt351); 
							}
							break;

					}

					 ast = new GetStmt((VAR11!=null?VAR11.getText():null)); 
					}
					break;
				case 11 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:38:4: 'put' exp ( ';' )?
					{
					match(input,31,FOLLOW_31_in_stmt363); 
					pushFollow(FOLLOW_exp_in_stmt365);
					exp12=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:38:14: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==17) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:38:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt367); 
							}
							break;

					}

					 ast = new PutStmt(exp12); 
					}
					break;
				case 12 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:39:4: VAR '(' ')' ( ';' )?
					{
					VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_stmt379); 
					match(input,10,FOLLOW_10_in_stmt381); 
					match(input,11,FOLLOW_11_in_stmt383); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:39:16: ( ';' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==17) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:39:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt385); 
							}
							break;

					}

					 ast = new CallStmt((VAR13!=null?VAR13.getText():null));
					}
					break;
				case 13 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:40:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_stmt396); 
					match(input,10,FOLLOW_10_in_stmt398); 
					pushFollow(FOLLOW_actualParamList_in_stmt402);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt404); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:40:34: ( ';' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==17) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:40:34: ';'
							{
							match(input,17,FOLLOW_17_in_stmt406); 
							}
							break;

					}

					 ast = new CallStmt((VAR14!=null?VAR14.getText():null),l);
					}
					break;
				case 14 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:41:4: 'return' exp ( ';' )?
					{
					match(input,32,FOLLOW_32_in_stmt415); 
					pushFollow(FOLLOW_exp_in_stmt417);
					exp15=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:41:17: ( ';' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==17) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:41:17: ';'
							{
							match(input,17,FOLLOW_17_in_stmt419); 
							}
							break;

					}

					 ast = new ReturnStmt(exp15); 
					}
					break;
				case 15 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:42:4: 'return' ( ';' )?
					{
					match(input,32,FOLLOW_32_in_stmt430); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:42:13: ( ';' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==17) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:42:13: ';'
							{
							match(input,17,FOLLOW_17_in_stmt432); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
					}
					break;
				case 16 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:43:4: 'while' '(' exp ')' s= stmt
					{
					match(input,33,FOLLOW_33_in_stmt444); 
					match(input,10,FOLLOW_10_in_stmt446); 
					pushFollow(FOLLOW_exp_in_stmt448);
					exp16=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt450); 
					pushFollow(FOLLOW_stmt_in_stmt454);
					s=stmt();
					state._fsp--;

					 ast = new WhileStmt(exp16,s); 
					}
					break;
				case 17 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,28,FOLLOW_28_in_stmt463); 
					match(input,10,FOLLOW_10_in_stmt465); 
					pushFollow(FOLLOW_exp_in_stmt467);
					exp17=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt469); 
					pushFollow(FOLLOW_stmt_in_stmt473);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp17,s1);
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:67: ( 'else' s2= stmt )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==24) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:68: 'else' s2= stmt
							{
							match(input,24,FOLLOW_24_in_stmt477); 
							pushFollow(FOLLOW_stmt_in_stmt481);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 18 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:45:4: '{' (s= stmt )+ '}'
					{
					match(input,34,FOLLOW_34_in_stmt492); 
					ast = new BlockStmt();
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:45:34: (s= stmt )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==VAR||(LA16_0 >= 21 && LA16_0 <= 23)||(LA16_0 >= 25 && LA16_0 <= 28)||(LA16_0 >= 30 && LA16_0 <= 34)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:45:35: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt499);
							s=stmt();
							state._fsp--;

							ast.addAST(s);
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input,35,FOLLOW_35_in_stmt505); 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:1: formalParamList returns [ArgList ast] : v1= VAR ( ',' v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:49:2: (v1= VAR ( ',' v2= VAR )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:49:4: v1= VAR ( ',' v2= VAR )*
			{
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList522); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:49:55: ( ',' v2= VAR )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==14) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:49:56: ',' v2= VAR
					{
					match(input,14,FOLLOW_14_in_formalParamList526); 
					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList530); 
					ast.addAST(new VarExpr((v2!=null?v2.getText():null)));
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
	// $ANTLR end "formalParamList"



	// $ANTLR start "actualParamList"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:1: actualParamList returns [ArgList ast] : e1= exp ( ',' e2= exp )* ;
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:53:2: (e1= exp ( ',' e2= exp )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:53:4: e1= exp ( ',' e2= exp )*
			{
			pushFollow(FOLLOW_exp_in_actualParamList554);
			e1=exp();
			state._fsp--;

			ast = new ArgList(e1);
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:53:43: ( ',' e2= exp )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==14) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:53:44: ',' e2= exp
					{
					match(input,14,FOLLOW_14_in_actualParamList559); 
					pushFollow(FOLLOW_exp_in_actualParamList563);
					e2=exp();
					state._fsp--;

					ast.addAST(e2);
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
	// $ANTLR end "actualParamList"



	// $ANTLR start "exp"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:56:1: exp returns [Expr ast] : relexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr relexp18 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:2: ( relexp )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp583);
			relexp18=relexp();
			state._fsp--;

			ast = relexp18; 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp600);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==20) ) {
					alt20=1;
				}
				else if ( (LA20_0==18) ) {
					alt20=2;
				}

				switch (alt20) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:4: ( '==' e2= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:4: ( '==' e2= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:5: '==' e2= addexp
					{
					match(input,20,FOLLOW_20_in_relexp613); 
					pushFollow(FOLLOW_addexp_in_relexp617);
					e2=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:4: ( '<=' e3= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:4: ( '<=' e3= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:5: '<=' e3= addexp
					{
					match(input,18,FOLLOW_18_in_relexp627); 
					pushFollow(FOLLOW_addexp_in_relexp631);
					e3=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.LESSEQ,ast,e3); 
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
	// $ANTLR end "relexp"



	// $ANTLR start "addexp"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:67:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:68:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:68:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp656);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop21:
			while (true) {
				int alt21=3;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==13) ) {
					alt21=1;
				}
				else if ( (LA21_0==15) ) {
					alt21=2;
				}

				switch (alt21) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:70:4: ( '+' e2= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:70:4: ( '+' e2= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:70:5: '+' e2= mulexp
					{
					match(input,13,FOLLOW_13_in_addexp668); 
					pushFollow(FOLLOW_mulexp_in_addexp672);
					e2=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:71:4: ( '-' e3= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:71:4: ( '-' e3= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:71:5: '-' e3= mulexp
					{
					match(input,15,FOLLOW_15_in_addexp682); 
					pushFollow(FOLLOW_mulexp_in_addexp686);
					e3=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MINUS,ast,e3); 
					}

					}
					break;

				default :
					break loop21;
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:75:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:76:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:76:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp712);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:77:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop22:
			while (true) {
				int alt22=3;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==12) ) {
					alt22=1;
				}
				else if ( (LA22_0==16) ) {
					alt22=2;
				}

				switch (alt22) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:4: ( '*' e2= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:4: ( '*' e2= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:5: '*' e2= atom
					{
					match(input,12,FOLLOW_12_in_mulexp724); 
					pushFollow(FOLLOW_atom_in_mulexp728);
					e2=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:4: ( '/' e3= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:4: ( '/' e3= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:5: '/' e3= atom
					{
					match(input,16,FOLLOW_16_in_mulexp738); 
					pushFollow(FOLLOW_atom_in_mulexp742);
					e3=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.DIV,ast,e3); 
					}

					}
					break;

				default :
					break loop22;
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:83:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR20=null;
		Token NUM21=null;
		Token NUM22=null;
		Token VAR23=null;
		Token VAR24=null;
		Token STRING25=null;
		ArgList l =null;
		Expr exp19 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:2: ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING )
			int alt23=7;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt23=1;
				}
				break;
			case VAR:
				{
				int LA23_2 = input.LA(2);
				if ( (LA23_2==10) ) {
					int LA23_6 = input.LA(3);
					if ( (LA23_6==11) ) {
						alt23=5;
					}
					else if ( ((LA23_6 >= NUM && LA23_6 <= VAR)||LA23_6==10||LA23_6==15) ) {
						alt23=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 23, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA23_2==EOF||LA23_2==VAR||(LA23_2 >= 11 && LA23_2 <= 18)||(LA23_2 >= 20 && LA23_2 <= 28)||(LA23_2 >= 30 && LA23_2 <= 35)) ) {
					alt23=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NUM:
				{
				alt23=3;
				}
				break;
			case 15:
				{
				alt23=4;
				}
				break;
			case STRING:
				{
				alt23=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:4: '(' exp ')'
					{
					match(input,10,FOLLOW_10_in_atom766); 
					pushFollow(FOLLOW_exp_in_atom768);
					exp19=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom770); 
					 ast = new ParenExpr(exp19); 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:85:4: VAR
					{
					VAR20=(Token)match(input,VAR,FOLLOW_VAR_in_atom782); 
					 ast = new VarExpr((VAR20!=null?VAR20.getText():null)); 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:86:4: NUM
					{
					NUM21=(Token)match(input,NUM,FOLLOW_NUM_in_atom792); 
					 ast = new NumExpr((NUM21!=null?NUM21.getText():null)); 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:87:4: '-' NUM
					{
					match(input,15,FOLLOW_15_in_atom802); 
					NUM22=(Token)match(input,NUM,FOLLOW_NUM_in_atom804); 
					 ast = new NumExpr('-' + (NUM22!=null?NUM22.getText():null)); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:4: VAR '(' ')'
					{
					VAR23=(Token)match(input,VAR,FOLLOW_VAR_in_atom814); 
					match(input,10,FOLLOW_10_in_atom816); 
					match(input,11,FOLLOW_11_in_atom818); 
					 ast = new CallExpr((VAR23!=null?VAR23.getText():null));
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:89:4: VAR '(' l= actualParamList ')'
					{
					VAR24=(Token)match(input,VAR,FOLLOW_VAR_in_atom827); 
					match(input,10,FOLLOW_10_in_atom829); 
					pushFollow(FOLLOW_actualParamList_in_atom833);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom835); 
					 ast = new CallExpr((VAR24!=null?VAR24.getText():null),l); 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:90:17: STRING
					{
					STRING25=(Token)match(input,STRING,FOLLOW_STRING_in_atom856); 
					 
					                    String s = (STRING25!=null?STRING25.getText():null);
					                    String t = s.substring(1, s.length()-1);
					                    ast = new ValueExpr(new Value(t)); 
					                
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


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\141\uffff";
	static final String DFA17_eofS =
		"\12\uffff\1\27\4\uffff\1\51\3\uffff\1\22\115\uffff";
	static final String DFA17_minS =
		"\1\10\4\uffff\2\10\1\12\2\uffff\1\6\3\uffff\1\12\1\10\1\uffff\1\6\1\uffff"+
		"\1\10\23\uffff\1\10\30\uffff\1\6\40\uffff";
	static final String DFA17_maxS =
		"\1\42\4\uffff\2\10\1\23\2\uffff\1\43\3\uffff\1\12\1\43\1\uffff\1\17\1"+
		"\uffff\1\43\23\uffff\1\13\30\uffff\1\17\40\uffff";
	static final String DFA17_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\12\1\13\1\uffff\1\20\1\21\1\22\2\uffff"+
		"\1\11\1\uffff\1\16\4\uffff\1\17\20\uffff\1\7\1\10\20\uffff\1\14\1\15\35"+
		"\uffff\1\5\1\6\6\16";
	static final String DFA17_specialS =
		"\141\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\7\14\uffff\1\3\1\1\1\6\1\uffff\1\5\1\2\1\10\1\14\1\uffff\1\4\1\11"+
			"\1\12\1\13\1\15",
			"",
			"",
			"",
			"",
			"\1\16",
			"\1\17",
			"\1\21\10\uffff\1\20",
			"",
			"",
			"\2\22\1\23\1\uffff\1\22\4\uffff\1\22\1\uffff\1\27\3\uffff\10\27\1\uffff"+
			"\6\27",
			"",
			"",
			"",
			"\1\47",
			"\1\51\10\uffff\1\51\1\uffff\1\50\1\uffff\10\51\1\uffff\6\51",
			"",
			"\3\73\1\uffff\1\73\1\72\3\uffff\1\73",
			"",
			"\1\22\1\uffff\1\100\1\uffff\2\22\1\uffff\4\22\1\27\11\22\1\uffff\6\22",
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
			"\1\132\2\uffff\1\131",
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
			"\1\136\1\140\1\135\1\uffff\1\134\1\133\3\uffff\1\137",
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

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "27:1: stmt returns [Stmt ast] : ( 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | 'Part' exp ( ';' )? | 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )? | 'fun' VAR '(' ')' s= stmt | 'fun' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x00000007DEE00102L});
	public static final BitSet FOLLOW_22_in_stmt58 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_in_stmt60 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_stmt104 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_stmt159 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt161 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt217 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt221 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt225 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_stmt227 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt231 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt257 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt259 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt261 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt263 = new BitSet(new long[]{0x00000007DEE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt276 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt278 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt280 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_formalParamList_in_stmt284 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt286 = new BitSet(new long[]{0x00000007DEE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_stmt297 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt299 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt301 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt303 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_stmt315 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt317 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt330 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt332 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt334 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt347 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt349 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_stmt363 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt365 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt379 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt381 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt383 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt396 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt398 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_stmt402 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt404 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stmt415 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt417 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stmt430 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_stmt444 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt446 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt448 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt450 = new BitSet(new long[]{0x00000007DEE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt463 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt465 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt467 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt469 = new BitSet(new long[]{0x00000007DEE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt473 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_stmt477 = new BitSet(new long[]{0x00000007DEE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_stmt492 = new BitSet(new long[]{0x00000007DEE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt499 = new BitSet(new long[]{0x0000000FDEE00100L});
	public static final BitSet FOLLOW_35_in_stmt505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formalParamList522 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_formalParamList526 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_formalParamList530 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_exp_in_actualParamList554 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_actualParamList559 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_actualParamList563 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_relexp_in_exp583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp600 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_relexp613 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp617 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_relexp627 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp631 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_mulexp_in_addexp656 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_13_in_addexp668 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp672 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_15_in_addexp682 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp686 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_atom_in_mulexp712 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_12_in_mulexp724 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp728 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_16_in_mulexp738 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp742 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_10_in_atom766 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_atom768 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_atom802 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUM_in_atom804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom814 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom816 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom827 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom829 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_atom833 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom856 = new BitSet(new long[]{0x0000000000000002L});
}
