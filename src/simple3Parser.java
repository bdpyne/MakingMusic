// $ANTLR 3.5.2 C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g 2015-12-16 12:36:46

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
		"'put'", "'return'", "'while'", "'{'", "'}'"
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
	@Override public String getGrammarFileName() { return "C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g"; }


	// override the default error reporting functions
	public void reportError(RecognitionException e) {
	    // call the Parser member function to report the error
	    displayRecognitionError(this.getTokenNames(), e);
	    // exit with error
	    System.exit(1);
	}



	// $ANTLR start "prog"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:23:1: prog returns [AST ast] : ( stmt )+ ;
	public final AST prog() throws RecognitionException {
		AST ast = null;


		Stmt stmt1 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:24:2: ( ( stmt )+ )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:24:4: ( stmt )+
			{
			ast = new StmtList();
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:24:29: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR||(LA1_0 >= 21 && LA1_0 <= 22)||(LA1_0 >= 24 && LA1_0 <= 29)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:24:30: stmt
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:27:1: stmt returns [Stmt ast] : ( 'create song ' exp ( ';' )? | 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


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
		Expr exp2 =null;
		Expr exp6 =null;
		Expr exp9 =null;
		Expr exp11 =null;
		Expr exp14 =null;
		Expr exp15 =null;
		Expr exp16 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:2: ( 'create song ' exp ( ';' )? | 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' )
			int alt14=15;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:4: 'create song ' exp ( ';' )?
					{
					match(input,21,FOLLOW_21_in_stmt58); 
					pushFollow(FOLLOW_exp_in_stmt60);
					exp2=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:23: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==17) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:23: ';'
							{
							match(input,17,FOLLOW_17_in_stmt62); 
							}
							break;

					}

					 ast = new VarDeclStmt("songname",exp2); 
					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:29:17: 'declare' VAR '(' ')' s= stmt
					{
					match(input,22,FOLLOW_22_in_stmt107); 
					VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_stmt109); 
					match(input,10,FOLLOW_10_in_stmt111); 
					match(input,11,FOLLOW_11_in_stmt113); 
					pushFollow(FOLLOW_stmt_in_stmt117);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR3!=null?VAR3.getText():null),new Function(new ArgList(),s));	
					}
					break;
				case 3 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:30:4: 'declare' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,22,FOLLOW_22_in_stmt126); 
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt128); 
					match(input,10,FOLLOW_10_in_stmt130); 
					pushFollow(FOLLOW_formalParamList_in_stmt134);
					l=formalParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt136); 
					pushFollow(FOLLOW_stmt_in_stmt140);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR4!=null?VAR4.getText():null),new Function(l,s)); 
					}
					break;
				case 4 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:31:4: 'declare' VAR '=' exp ( ';' )?
					{
					match(input,22,FOLLOW_22_in_stmt147); 
					VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stmt149); 
					match(input,19,FOLLOW_19_in_stmt151); 
					pushFollow(FOLLOW_exp_in_stmt153);
					exp6=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:31:26: ( ';' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==17) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:31:26: ';'
							{
							match(input,17,FOLLOW_17_in_stmt155); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR5!=null?VAR5.getText():null),exp6); 
					}
					break;
				case 5 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:32:4: 'declare' VAR ( ';' )?
					{
					match(input,22,FOLLOW_22_in_stmt165); 
					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_stmt167); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:32:18: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==17) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:32:18: ';'
							{
							match(input,17,FOLLOW_17_in_stmt169); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR7!=null?VAR7.getText():null),new NumExpr(0)); 
					}
					break;
				case 6 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:33:4: VAR '=' exp ( ';' )?
					{
					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_stmt180); 
					match(input,19,FOLLOW_19_in_stmt182); 
					pushFollow(FOLLOW_exp_in_stmt184);
					exp9=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:33:16: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==17) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:33:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt186); 
							}
							break;

					}

					 ast = new AssignStmt((VAR8!=null?VAR8.getText():null),exp9); 
					}
					break;
				case 7 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:4: 'get' VAR ( ';' )?
					{
					match(input,24,FOLLOW_24_in_stmt197); 
					VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_stmt199); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:14: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==17) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt201); 
							}
							break;

					}

					 ast = new GetStmt((VAR10!=null?VAR10.getText():null)); 
					}
					break;
				case 8 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:4: 'put' exp ( ';' )?
					{
					match(input,26,FOLLOW_26_in_stmt213); 
					pushFollow(FOLLOW_exp_in_stmt215);
					exp11=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:14: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==17) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt217); 
							}
							break;

					}

					 ast = new PutStmt(exp11); 
					}
					break;
				case 9 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:4: VAR '(' ')' ( ';' )?
					{
					VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_stmt229); 
					match(input,10,FOLLOW_10_in_stmt231); 
					match(input,11,FOLLOW_11_in_stmt233); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:16: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==17) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt235); 
							}
							break;

					}

					 ast = new CallStmt((VAR12!=null?VAR12.getText():null));
					}
					break;
				case 10 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_stmt246); 
					match(input,10,FOLLOW_10_in_stmt248); 
					pushFollow(FOLLOW_actualParamList_in_stmt252);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt254); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:34: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==17) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:34: ';'
							{
							match(input,17,FOLLOW_17_in_stmt256); 
							}
							break;

					}

					 ast = new CallStmt((VAR13!=null?VAR13.getText():null),l);
					}
					break;
				case 11 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:4: 'return' exp ( ';' )?
					{
					match(input,27,FOLLOW_27_in_stmt265); 
					pushFollow(FOLLOW_exp_in_stmt267);
					exp14=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:17: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==17) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:17: ';'
							{
							match(input,17,FOLLOW_17_in_stmt269); 
							}
							break;

					}

					 ast = new ReturnStmt(exp14); 
					}
					break;
				case 12 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:39:4: 'return' ( ';' )?
					{
					match(input,27,FOLLOW_27_in_stmt280); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:39:13: ( ';' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==17) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:39:13: ';'
							{
							match(input,17,FOLLOW_17_in_stmt282); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
					}
					break;
				case 13 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:40:4: 'while' '(' exp ')' s= stmt
					{
					match(input,28,FOLLOW_28_in_stmt294); 
					match(input,10,FOLLOW_10_in_stmt296); 
					pushFollow(FOLLOW_exp_in_stmt298);
					exp15=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt300); 
					pushFollow(FOLLOW_stmt_in_stmt304);
					s=stmt();
					state._fsp--;

					 ast = new WhileStmt(exp15,s); 
					}
					break;
				case 14 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,25,FOLLOW_25_in_stmt313); 
					match(input,10,FOLLOW_10_in_stmt315); 
					pushFollow(FOLLOW_exp_in_stmt317);
					exp16=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt319); 
					pushFollow(FOLLOW_stmt_in_stmt323);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp16,s1);
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:67: ( 'else' s2= stmt )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==23) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:68: 'else' s2= stmt
							{
							match(input,23,FOLLOW_23_in_stmt327); 
							pushFollow(FOLLOW_stmt_in_stmt331);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 15 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:42:4: '{' (s= stmt )+ '}'
					{
					match(input,29,FOLLOW_29_in_stmt342); 
					ast = new BlockStmt();
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:42:34: (s= stmt )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==VAR||(LA13_0 >= 21 && LA13_0 <= 22)||(LA13_0 >= 24 && LA13_0 <= 29)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:42:35: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt349);
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

					match(input,30,FOLLOW_30_in_stmt355); 
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:1: formalParamList returns [ArgList ast] : v1= VAR ( ',' v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:46:2: (v1= VAR ( ',' v2= VAR )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:46:4: v1= VAR ( ',' v2= VAR )*
			{
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList372); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:46:55: ( ',' v2= VAR )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==14) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:46:56: ',' v2= VAR
					{
					match(input,14,FOLLOW_14_in_formalParamList376); 
					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList380); 
					ast.addAST(new VarExpr((v2!=null?v2.getText():null)));
					}
					break;

				default :
					break loop15;
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:1: actualParamList returns [ArgList ast] : e1= exp ( ',' e2= exp )* ;
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:50:2: (e1= exp ( ',' e2= exp )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:50:4: e1= exp ( ',' e2= exp )*
			{
			pushFollow(FOLLOW_exp_in_actualParamList404);
			e1=exp();
			state._fsp--;

			ast = new ArgList(e1);
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:50:43: ( ',' e2= exp )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==14) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:50:44: ',' e2= exp
					{
					match(input,14,FOLLOW_14_in_actualParamList409); 
					pushFollow(FOLLOW_exp_in_actualParamList413);
					e2=exp();
					state._fsp--;

					ast.addAST(e2);
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
	// $ANTLR end "actualParamList"



	// $ANTLR start "exp"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:53:1: exp returns [Expr ast] : relexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr relexp17 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:54:2: ( relexp )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:54:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp433);
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:56:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:57:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:57:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp450);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:58:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==20) ) {
					alt17=1;
				}
				else if ( (LA17_0==18) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:59:4: ( '==' e2= addexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:59:4: ( '==' e2= addexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:59:5: '==' e2= addexp
					{
					match(input,20,FOLLOW_20_in_relexp463); 
					pushFollow(FOLLOW_addexp_in_relexp467);
					e2=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:60:4: ( '<=' e3= addexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:60:4: ( '<=' e3= addexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:60:5: '<=' e3= addexp
					{
					match(input,18,FOLLOW_18_in_relexp477); 
					pushFollow(FOLLOW_addexp_in_relexp481);
					e3=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.LESSEQ,ast,e3); 
					}

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
	// $ANTLR end "relexp"



	// $ANTLR start "addexp"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:64:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:65:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:65:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp506);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:66:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==13) ) {
					alt18=1;
				}
				else if ( (LA18_0==15) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:67:4: ( '+' e2= mulexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:67:4: ( '+' e2= mulexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:67:5: '+' e2= mulexp
					{
					match(input,13,FOLLOW_13_in_addexp518); 
					pushFollow(FOLLOW_mulexp_in_addexp522);
					e2=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:68:4: ( '-' e3= mulexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:68:4: ( '-' e3= mulexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:68:5: '-' e3= mulexp
					{
					match(input,15,FOLLOW_15_in_addexp532); 
					pushFollow(FOLLOW_mulexp_in_addexp536);
					e3=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MINUS,ast,e3); 
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
	// $ANTLR end "addexp"



	// $ANTLR start "mulexp"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:72:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:73:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:73:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp562);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:74:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop19:
			while (true) {
				int alt19=3;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==12) ) {
					alt19=1;
				}
				else if ( (LA19_0==16) ) {
					alt19=2;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:75:4: ( '*' e2= atom )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:75:4: ( '*' e2= atom )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:75:5: '*' e2= atom
					{
					match(input,12,FOLLOW_12_in_mulexp574); 
					pushFollow(FOLLOW_atom_in_mulexp578);
					e2=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:76:4: ( '/' e3= atom )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:76:4: ( '/' e3= atom )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:76:5: '/' e3= atom
					{
					match(input,16,FOLLOW_16_in_mulexp588); 
					pushFollow(FOLLOW_atom_in_mulexp592);
					e3=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.DIV,ast,e3); 
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
	// $ANTLR end "mulexp"



	// $ANTLR start "atom"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:80:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING );
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:81:2: ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING )
			int alt20=7;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt20=1;
				}
				break;
			case VAR:
				{
				int LA20_2 = input.LA(2);
				if ( (LA20_2==10) ) {
					int LA20_6 = input.LA(3);
					if ( (LA20_6==11) ) {
						alt20=5;
					}
					else if ( ((LA20_6 >= NUM && LA20_6 <= VAR)||LA20_6==10||LA20_6==15) ) {
						alt20=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA20_2==EOF||LA20_2==VAR||(LA20_2 >= 11 && LA20_2 <= 18)||(LA20_2 >= 20 && LA20_2 <= 30)) ) {
					alt20=2;
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
				alt20=3;
				}
				break;
			case 15:
				{
				alt20=4;
				}
				break;
			case STRING:
				{
				alt20=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:81:4: '(' exp ')'
					{
					match(input,10,FOLLOW_10_in_atom616); 
					pushFollow(FOLLOW_exp_in_atom618);
					exp18=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom620); 
					 ast = new ParenExpr(exp18); 
					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:82:4: VAR
					{
					VAR19=(Token)match(input,VAR,FOLLOW_VAR_in_atom632); 
					 ast = new VarExpr((VAR19!=null?VAR19.getText():null)); 
					}
					break;
				case 3 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:83:4: NUM
					{
					NUM20=(Token)match(input,NUM,FOLLOW_NUM_in_atom642); 
					 ast = new NumExpr((NUM20!=null?NUM20.getText():null)); 
					}
					break;
				case 4 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:84:4: '-' NUM
					{
					match(input,15,FOLLOW_15_in_atom652); 
					NUM21=(Token)match(input,NUM,FOLLOW_NUM_in_atom654); 
					 ast = new NumExpr('-' + (NUM21!=null?NUM21.getText():null)); 
					}
					break;
				case 5 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:85:4: VAR '(' ')'
					{
					VAR22=(Token)match(input,VAR,FOLLOW_VAR_in_atom664); 
					match(input,10,FOLLOW_10_in_atom666); 
					match(input,11,FOLLOW_11_in_atom668); 
					 ast = new CallExpr((VAR22!=null?VAR22.getText():null));
					}
					break;
				case 6 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:86:4: VAR '(' l= actualParamList ')'
					{
					VAR23=(Token)match(input,VAR,FOLLOW_VAR_in_atom677); 
					match(input,10,FOLLOW_10_in_atom679); 
					pushFollow(FOLLOW_actualParamList_in_atom683);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom685); 
					 ast = new CallExpr((VAR23!=null?VAR23.getText():null),l); 
					}
					break;
				case 7 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:87:17: STRING
					{
					STRING24=(Token)match(input,STRING,FOLLOW_STRING_in_atom706); 
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


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\120\uffff";
	static final String DFA14_eofS =
		"\6\uffff\1\22\3\uffff\1\40\3\uffff\1\15\101\uffff";
	static final String DFA14_minS =
		"\1\10\1\uffff\1\10\1\12\2\uffff\1\6\3\uffff\1\10\1\uffff\1\6\1\uffff\1"+
		"\10\17\uffff\1\10\24\uffff\1\6\34\uffff";
	static final String DFA14_maxS =
		"\1\35\1\uffff\1\10\1\23\2\uffff\1\36\3\uffff\1\36\1\uffff\1\17\1\uffff"+
		"\1\36\17\uffff\1\13\24\uffff\1\17\34\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\2\uffff\1\7\1\10\1\uffff\1\15\1\16\1\17\1\uffff\1\6\1\uffff"+
		"\1\13\4\uffff\1\14\14\uffff\1\4\1\5\14\uffff\1\11\1\12\31\uffff\1\2\1"+
		"\3\6\13";
	static final String DFA14_specialS =
		"\120\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\3\14\uffff\1\1\1\2\1\uffff\1\4\1\10\1\5\1\6\1\7\1\11",
			"",
			"\1\12",
			"\1\14\10\uffff\1\13",
			"",
			"",
			"\2\15\1\16\1\uffff\1\15\4\uffff\1\15\1\uffff\1\22\3\uffff\12\22",
			"",
			"",
			"",
			"\1\40\1\uffff\1\36\6\uffff\1\40\1\uffff\1\37\1\uffff\12\40",
			"",
			"\3\56\1\uffff\1\56\1\55\3\uffff\1\56",
			"",
			"\1\15\1\uffff\1\63\1\uffff\2\15\1\uffff\4\15\1\22\13\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\111\2\uffff\1\110",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\115\1\117\1\114\1\uffff\1\113\1\112\3\uffff\1\116",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "27:1: stmt returns [Stmt ast] : ( 'create song ' exp ( ';' )? | 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x000000003F600102L});
	public static final BitSet FOLLOW_21_in_stmt58 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt60 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt107 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt109 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt111 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt113 = new BitSet(new long[]{0x000000003F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt126 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt128 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt130 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_formalParamList_in_stmt134 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt136 = new BitSet(new long[]{0x000000003F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt147 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt149 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt151 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt153 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt165 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt167 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt180 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt182 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt184 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_stmt197 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt199 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_stmt213 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt215 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt229 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt231 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt233 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt246 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt248 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_stmt252 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt254 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt265 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt267 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt280 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt294 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt296 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt298 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt300 = new BitSet(new long[]{0x000000003F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt313 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt315 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt317 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt319 = new BitSet(new long[]{0x000000003F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt323 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt327 = new BitSet(new long[]{0x000000003F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt342 = new BitSet(new long[]{0x000000003F600100L});
	public static final BitSet FOLLOW_stmt_in_stmt349 = new BitSet(new long[]{0x000000007F600100L});
	public static final BitSet FOLLOW_30_in_stmt355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formalParamList372 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_formalParamList376 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_formalParamList380 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_exp_in_actualParamList404 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_actualParamList409 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_actualParamList413 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_relexp_in_exp433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp450 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_relexp463 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp467 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_relexp477 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp481 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_mulexp_in_addexp506 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_13_in_addexp518 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp522 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_15_in_addexp532 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp536 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_atom_in_mulexp562 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_12_in_mulexp574 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp578 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_16_in_mulexp588 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp592 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_10_in_atom616 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_atom618 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_atom652 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUM_in_atom654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom664 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom666 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom677 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom679 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_atom683 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom706 = new BitSet(new long[]{0x0000000000000002L});
}
