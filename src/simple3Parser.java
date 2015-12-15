// $ANTLR 3.5.2 C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g 2015-12-15 11:10:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", 
		"TONE", "VAR", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", 
		"';'", "'<='", "'='", "'=='", "'declare'", "'else'", "'get'", "'if'", 
		"'put'", "'return'", "'while'", "'{'", "'}'"
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
	public static final int COMMENT=4;
	public static final int ESC_SEQ=5;
	public static final int NUM=6;
	public static final int STRING=7;
	public static final int TONE=8;
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
				if ( (LA1_0==VAR||LA1_0==22||(LA1_0 >= 24 && LA1_0 <= 29)) ) {
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:27:1: stmt returns [Stmt ast] : ( 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token VAR2=null;
		Token VAR3=null;
		Token VAR4=null;
		Token VAR6=null;
		Token VAR7=null;
		Token VAR9=null;
		Token VAR11=null;
		Token VAR12=null;
		Stmt s =null;
		ArgList l =null;
		Stmt s1 =null;
		Stmt s2 =null;
		Expr exp5 =null;
		Expr exp8 =null;
		Expr exp10 =null;
		Expr exp13 =null;
		Expr exp14 =null;
		Expr exp15 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:2: ( 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' )
			int alt13=14;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:4: 'declare' VAR '(' ')' s= stmt
					{
					match(input,22,FOLLOW_22_in_stmt58); 
					VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_stmt60); 
					match(input,11,FOLLOW_11_in_stmt62); 
					match(input,12,FOLLOW_12_in_stmt64); 
					pushFollow(FOLLOW_stmt_in_stmt68);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR2!=null?VAR2.getText():null),new Function(new ArgList(),s));	
					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:29:4: 'declare' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,22,FOLLOW_22_in_stmt77); 
					VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_stmt79); 
					match(input,11,FOLLOW_11_in_stmt81); 
					pushFollow(FOLLOW_formalParamList_in_stmt85);
					l=formalParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt87); 
					pushFollow(FOLLOW_stmt_in_stmt91);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR3!=null?VAR3.getText():null),new Function(l,s)); 
					}
					break;
				case 3 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:30:4: 'declare' VAR '=' exp ( ';' )?
					{
					match(input,22,FOLLOW_22_in_stmt98); 
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt100); 
					match(input,20,FOLLOW_20_in_stmt102); 
					pushFollow(FOLLOW_exp_in_stmt104);
					exp5=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:30:26: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==18) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:30:26: ';'
							{
							match(input,18,FOLLOW_18_in_stmt106); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR4!=null?VAR4.getText():null),exp5); 
					}
					break;
				case 4 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:31:4: 'declare' VAR ( ';' )?
					{
					match(input,22,FOLLOW_22_in_stmt116); 
					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_stmt118); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:31:18: ( ';' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==18) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:31:18: ';'
							{
							match(input,18,FOLLOW_18_in_stmt120); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR6!=null?VAR6.getText():null),new NumExpr(0)); 
					}
					break;
				case 5 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:32:4: VAR '=' exp ( ';' )?
					{
					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_stmt131); 
					match(input,20,FOLLOW_20_in_stmt133); 
					pushFollow(FOLLOW_exp_in_stmt135);
					exp8=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:32:16: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==18) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:32:16: ';'
							{
							match(input,18,FOLLOW_18_in_stmt137); 
							}
							break;

					}

					 ast = new AssignStmt((VAR7!=null?VAR7.getText():null),exp8); 
					}
					break;
				case 6 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:33:4: 'get' VAR ( ';' )?
					{
					match(input,24,FOLLOW_24_in_stmt148); 
					VAR9=(Token)match(input,VAR,FOLLOW_VAR_in_stmt150); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:33:14: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==18) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:33:14: ';'
							{
							match(input,18,FOLLOW_18_in_stmt152); 
							}
							break;

					}

					 ast = new GetStmt((VAR9!=null?VAR9.getText():null)); 
					}
					break;
				case 7 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:4: 'put' exp ( ';' )?
					{
					match(input,26,FOLLOW_26_in_stmt164); 
					pushFollow(FOLLOW_exp_in_stmt166);
					exp10=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:14: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==18) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:14: ';'
							{
							match(input,18,FOLLOW_18_in_stmt168); 
							}
							break;

					}

					 ast = new PutStmt(exp10); 
					}
					break;
				case 8 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:4: VAR '(' ')' ( ';' )?
					{
					VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_stmt180); 
					match(input,11,FOLLOW_11_in_stmt182); 
					match(input,12,FOLLOW_12_in_stmt184); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:16: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==18) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:16: ';'
							{
							match(input,18,FOLLOW_18_in_stmt186); 
							}
							break;

					}

					 ast = new CallStmt((VAR11!=null?VAR11.getText():null));
					}
					break;
				case 9 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_stmt197); 
					match(input,11,FOLLOW_11_in_stmt199); 
					pushFollow(FOLLOW_actualParamList_in_stmt203);
					l=actualParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt205); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:34: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==18) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:34: ';'
							{
							match(input,18,FOLLOW_18_in_stmt207); 
							}
							break;

					}

					 ast = new CallStmt((VAR12!=null?VAR12.getText():null),l);
					}
					break;
				case 10 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:4: 'return' exp ( ';' )?
					{
					match(input,27,FOLLOW_27_in_stmt216); 
					pushFollow(FOLLOW_exp_in_stmt218);
					exp13=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:17: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==18) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:17: ';'
							{
							match(input,18,FOLLOW_18_in_stmt220); 
							}
							break;

					}

					 ast = new ReturnStmt(exp13); 
					}
					break;
				case 11 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:4: 'return' ( ';' )?
					{
					match(input,27,FOLLOW_27_in_stmt231); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:13: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==18) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:13: ';'
							{
							match(input,18,FOLLOW_18_in_stmt233); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
					}
					break;
				case 12 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:39:4: 'while' '(' exp ')' s= stmt
					{
					match(input,28,FOLLOW_28_in_stmt245); 
					match(input,11,FOLLOW_11_in_stmt247); 
					pushFollow(FOLLOW_exp_in_stmt249);
					exp14=exp();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt251); 
					pushFollow(FOLLOW_stmt_in_stmt255);
					s=stmt();
					state._fsp--;

					 ast = new WhileStmt(exp14,s); 
					}
					break;
				case 13 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:40:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,25,FOLLOW_25_in_stmt264); 
					match(input,11,FOLLOW_11_in_stmt266); 
					pushFollow(FOLLOW_exp_in_stmt268);
					exp15=exp();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt270); 
					pushFollow(FOLLOW_stmt_in_stmt274);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp15,s1);
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:40:67: ( 'else' s2= stmt )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==23) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:40:68: 'else' s2= stmt
							{
							match(input,23,FOLLOW_23_in_stmt278); 
							pushFollow(FOLLOW_stmt_in_stmt282);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 14 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:4: '{' (s= stmt )+ '}'
					{
					match(input,29,FOLLOW_29_in_stmt293); 
					ast = new BlockStmt();
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:34: (s= stmt )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==VAR||LA12_0==22||(LA12_0 >= 24 && LA12_0 <= 29)) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:35: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt300);
							s=stmt();
							state._fsp--;

							ast.addAST(s);
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					match(input,30,FOLLOW_30_in_stmt306); 
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:44:1: formalParamList returns [ArgList ast] : v1= VAR ( ',' v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:2: (v1= VAR ( ',' v2= VAR )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:4: v1= VAR ( ',' v2= VAR )*
			{
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList323); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:55: ( ',' v2= VAR )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==15) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:56: ',' v2= VAR
					{
					match(input,15,FOLLOW_15_in_formalParamList327); 
					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList331); 
					ast.addAST(new VarExpr((v2!=null?v2.getText():null)));
					}
					break;

				default :
					break loop14;
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:48:1: actualParamList returns [ArgList ast] : e1= exp ( ',' e2= exp )* ;
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:2: (e1= exp ( ',' e2= exp )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:4: e1= exp ( ',' e2= exp )*
			{
			pushFollow(FOLLOW_exp_in_actualParamList355);
			e1=exp();
			state._fsp--;

			ast = new ArgList(e1);
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:43: ( ',' e2= exp )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==15) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:44: ',' e2= exp
					{
					match(input,15,FOLLOW_15_in_actualParamList360); 
					pushFollow(FOLLOW_exp_in_actualParamList364);
					e2=exp();
					state._fsp--;

					ast.addAST(e2);
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
	// $ANTLR end "actualParamList"



	// $ANTLR start "exp"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:52:1: exp returns [Expr ast] : relexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr relexp16 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:53:2: ( relexp )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:53:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp384);
			relexp16=relexp();
			state._fsp--;

			ast = relexp16; 
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:55:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:56:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:56:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp401);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:57:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==21) ) {
					alt16=1;
				}
				else if ( (LA16_0==19) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:58:4: ( '==' e2= addexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:58:4: ( '==' e2= addexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:58:5: '==' e2= addexp
					{
					match(input,21,FOLLOW_21_in_relexp414); 
					pushFollow(FOLLOW_addexp_in_relexp418);
					e2=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:59:4: ( '<=' e3= addexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:59:4: ( '<=' e3= addexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:59:5: '<=' e3= addexp
					{
					match(input,19,FOLLOW_19_in_relexp428); 
					pushFollow(FOLLOW_addexp_in_relexp432);
					e3=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.LESSEQ,ast,e3); 
					}

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
	// $ANTLR end "relexp"



	// $ANTLR start "addexp"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:63:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:64:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:64:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp457);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:65:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==14) ) {
					alt17=1;
				}
				else if ( (LA17_0==16) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:66:4: ( '+' e2= mulexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:66:4: ( '+' e2= mulexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:66:5: '+' e2= mulexp
					{
					match(input,14,FOLLOW_14_in_addexp469); 
					pushFollow(FOLLOW_mulexp_in_addexp473);
					e2=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:67:4: ( '-' e3= mulexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:67:4: ( '-' e3= mulexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:67:5: '-' e3= mulexp
					{
					match(input,16,FOLLOW_16_in_addexp483); 
					pushFollow(FOLLOW_mulexp_in_addexp487);
					e3=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MINUS,ast,e3); 
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
	// $ANTLR end "addexp"



	// $ANTLR start "mulexp"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:71:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:72:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:72:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp513);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:73:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==13) ) {
					alt18=1;
				}
				else if ( (LA18_0==17) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:74:4: ( '*' e2= atom )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:74:4: ( '*' e2= atom )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:74:5: '*' e2= atom
					{
					match(input,13,FOLLOW_13_in_mulexp525); 
					pushFollow(FOLLOW_atom_in_mulexp529);
					e2=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:75:4: ( '/' e3= atom )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:75:4: ( '/' e3= atom )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:75:5: '/' e3= atom
					{
					match(input,17,FOLLOW_17_in_mulexp539); 
					pushFollow(FOLLOW_atom_in_mulexp543);
					e3=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.DIV,ast,e3); 
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
	// $ANTLR end "mulexp"



	// $ANTLR start "atom"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:79:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR18=null;
		Token NUM19=null;
		Token NUM20=null;
		Token VAR21=null;
		Token VAR22=null;
		ArgList l =null;
		Expr exp17 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:80:2: ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' )
			int alt19=6;
			switch ( input.LA(1) ) {
			case 11:
				{
				alt19=1;
				}
				break;
			case VAR:
				{
				int LA19_2 = input.LA(2);
				if ( (LA19_2==11) ) {
					int LA19_5 = input.LA(3);
					if ( (LA19_5==12) ) {
						alt19=5;
					}
					else if ( (LA19_5==NUM||LA19_5==VAR||LA19_5==11||LA19_5==16) ) {
						alt19=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA19_2==EOF||LA19_2==VAR||(LA19_2 >= 12 && LA19_2 <= 19)||(LA19_2 >= 21 && LA19_2 <= 30)) ) {
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
				break;
			case NUM:
				{
				alt19=3;
				}
				break;
			case 16:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:80:4: '(' exp ')'
					{
					match(input,11,FOLLOW_11_in_atom567); 
					pushFollow(FOLLOW_exp_in_atom569);
					exp17=exp();
					state._fsp--;

					match(input,12,FOLLOW_12_in_atom571); 
					 ast = new ParenExpr(exp17); 
					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:81:4: VAR
					{
					VAR18=(Token)match(input,VAR,FOLLOW_VAR_in_atom583); 
					 ast = new VarExpr((VAR18!=null?VAR18.getText():null)); 
					}
					break;
				case 3 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:82:4: NUM
					{
					NUM19=(Token)match(input,NUM,FOLLOW_NUM_in_atom593); 
					 ast = new NumExpr((NUM19!=null?NUM19.getText():null)); 
					}
					break;
				case 4 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:83:4: '-' NUM
					{
					match(input,16,FOLLOW_16_in_atom603); 
					NUM20=(Token)match(input,NUM,FOLLOW_NUM_in_atom605); 
					 ast = new NumExpr('-' + (NUM20!=null?NUM20.getText():null)); 
					}
					break;
				case 5 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:84:4: VAR '(' ')'
					{
					VAR21=(Token)match(input,VAR,FOLLOW_VAR_in_atom615); 
					match(input,11,FOLLOW_11_in_atom617); 
					match(input,12,FOLLOW_12_in_atom619); 
					 ast = new CallExpr((VAR21!=null?VAR21.getText():null));
					}
					break;
				case 6 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:85:4: VAR '(' l= actualParamList ')'
					{
					VAR22=(Token)match(input,VAR,FOLLOW_VAR_in_atom628); 
					match(input,11,FOLLOW_11_in_atom630); 
					pushFollow(FOLLOW_actualParamList_in_atom634);
					l=actualParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_atom636); 
					 ast = new CallExpr((VAR22!=null?VAR22.getText():null),l);
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


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\111\uffff";
	static final String DFA13_eofS =
		"\5\uffff\1\20\3\uffff\1\35\3\uffff\1\14\73\uffff";
	static final String DFA13_minS =
		"\2\11\1\13\2\uffff\1\6\3\uffff\1\11\1\uffff\1\6\1\uffff\1\11\15\uffff"+
		"\1\11\22\uffff\1\6\32\uffff";
	static final String DFA13_maxS =
		"\1\35\1\11\1\24\2\uffff\1\36\3\uffff\1\36\1\uffff\1\20\1\uffff\1\36\15"+
		"\uffff\1\14\22\uffff\1\20\32\uffff";
	static final String DFA13_acceptS =
		"\3\uffff\1\6\1\7\1\uffff\1\14\1\15\1\16\1\uffff\1\5\1\uffff\1\12\3\uffff"+
		"\1\13\13\uffff\1\3\1\4\13\uffff\1\10\1\11\27\uffff\1\1\1\2\5\12";
	static final String DFA13_specialS =
		"\111\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\2\14\uffff\1\1\1\uffff\1\3\1\7\1\4\1\5\1\6\1\10",
			"\1\11",
			"\1\13\10\uffff\1\12",
			"",
			"",
			"\1\14\2\uffff\1\15\1\uffff\1\14\4\uffff\1\14\1\uffff\1\20\3\uffff\11"+
			"\20",
			"",
			"",
			"",
			"\1\35\1\uffff\1\33\6\uffff\1\35\1\uffff\1\34\1\uffff\11\35",
			"",
			"\1\52\2\uffff\1\52\1\uffff\1\52\1\51\3\uffff\1\52",
			"",
			"\1\14\1\uffff\1\56\1\uffff\2\14\1\uffff\4\14\1\20\12\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\103\2\uffff\1\102",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\107\2\uffff\1\106\1\uffff\1\105\1\104\3\uffff\1\110",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "27:1: stmt returns [Stmt ast] : ( 'declare' VAR '(' ')' s= stmt | 'declare' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x000000003F400202L});
	public static final BitSet FOLLOW_22_in_stmt58 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt60 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt62 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt64 = new BitSet(new long[]{0x000000003F400200L});
	public static final BitSet FOLLOW_stmt_in_stmt68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt77 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt79 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt81 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_formalParamList_in_stmt85 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt87 = new BitSet(new long[]{0x000000003F400200L});
	public static final BitSet FOLLOW_stmt_in_stmt91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt98 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt100 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_stmt102 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_stmt104 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt116 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt118 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt131 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_stmt133 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_stmt135 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_stmt148 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt150 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_stmt164 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_stmt166 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt180 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt182 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt184 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt197 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt199 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_actualParamList_in_stmt203 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt205 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt216 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_stmt218 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt231 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt245 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt247 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_stmt249 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt251 = new BitSet(new long[]{0x000000003F400200L});
	public static final BitSet FOLLOW_stmt_in_stmt255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt264 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt266 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_stmt268 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt270 = new BitSet(new long[]{0x000000003F400200L});
	public static final BitSet FOLLOW_stmt_in_stmt274 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt278 = new BitSet(new long[]{0x000000003F400200L});
	public static final BitSet FOLLOW_stmt_in_stmt282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt293 = new BitSet(new long[]{0x000000003F400200L});
	public static final BitSet FOLLOW_stmt_in_stmt300 = new BitSet(new long[]{0x000000007F400200L});
	public static final BitSet FOLLOW_30_in_stmt306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formalParamList323 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_formalParamList327 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_formalParamList331 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_exp_in_actualParamList355 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_actualParamList360 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_actualParamList364 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_relexp_in_exp384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp401 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_21_in_relexp414 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_addexp_in_relexp418 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_19_in_relexp428 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_addexp_in_relexp432 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_mulexp_in_addexp457 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_14_in_addexp469 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_mulexp_in_addexp473 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_16_in_addexp483 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_mulexp_in_addexp487 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_atom_in_mulexp513 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_13_in_mulexp525 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_atom_in_mulexp529 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_17_in_mulexp539 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_atom_in_mulexp543 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_11_in_atom567 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_exp_in_atom569 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom603 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUM_in_atom605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom615 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom617 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom628 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom630 = new BitSet(new long[]{0x0000000000010A40L});
	public static final BitSet FOLLOW_actualParamList_in_atom634 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom636 = new BitSet(new long[]{0x0000000000000002L});
}
