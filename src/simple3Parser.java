// $ANTLR 3.5.2 C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g 2015-12-17 13:33:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", 
		"VAR", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<='", 
		"'='", "'=='", "'Drum'", "'Phrase'", "'Piano'", "'create song '", "'declare'", 
		"'else'", "'fun'", "'generate'", "'get'", "'if'", "'put'", "'return'", 
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
				if ( (LA1_0==VAR||(LA1_0 >= 21 && LA1_0 <= 25)||(LA1_0 >= 27 && LA1_0 <= 34)) ) {
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:27:1: stmt returns [Stmt ast] : ( 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | part VAR | 'Phrase' VAR | 'fun' VAR '(' ')' s= stmt | 'fun' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token STRING2=null;
		Token VAR4=null;
		Token VAR5=null;
		Token VAR6=null;
		Token VAR7=null;
		Token VAR8=null;
		Token VAR10=null;
		Token VAR11=null;
		Token VAR13=null;
		Token VAR15=null;
		Token VAR16=null;
		Stmt s =null;
		ArgList l =null;
		Stmt s1 =null;
		Stmt s2 =null;
		Integer part3 =null;
		Expr exp9 =null;
		Expr exp12 =null;
		Expr exp14 =null;
		Expr exp17 =null;
		Expr exp18 =null;
		Expr exp19 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:2: ( 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | part VAR | 'Phrase' VAR | 'fun' VAR '(' ')' s= stmt | 'fun' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' )
			int alt15=18;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:4: 'create song ' STRING ( ';' )?
					{
					match(input,24,FOLLOW_24_in_stmt58); 
					STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_stmt60); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:26: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==17) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:28:26: ';'
							{
							match(input,17,FOLLOW_17_in_stmt62); 
							}
							break;

					}

					 ast = new CreateSongStmt((STRING2!=null?STRING2.getText():null)); 
					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:29:17: 'generate' ( ';' )?
					{
					match(input,28,FOLLOW_28_in_stmt104); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:29:28: ( ';' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==17) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:29:28: ';'
							{
							match(input,17,FOLLOW_17_in_stmt106); 
							}
							break;

					}

					 ast = new GenerateStmt(); 
					}
					break;
				case 3 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:30:17: part VAR
					{
					pushFollow(FOLLOW_part_in_stmt159);
					part3=part();
					state._fsp--;

					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt161); 
					 ast = new PartStmt(part3,(VAR4!=null?VAR4.getText():null)); 
					}
					break;
				case 4 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:31:17: 'Phrase' VAR
					{
					match(input,22,FOLLOW_22_in_stmt221); 
					VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stmt223); 
					 ast = new PhraseStmt((VAR5!=null?VAR5.getText():null)); 
					}
					break;
				case 5 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:32:17: 'fun' VAR '(' ')' s= stmt
					{
					match(input,27,FOLLOW_27_in_stmt278); 
					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_stmt280); 
					match(input,10,FOLLOW_10_in_stmt282); 
					match(input,11,FOLLOW_11_in_stmt284); 
					pushFollow(FOLLOW_stmt_in_stmt288);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR6!=null?VAR6.getText():null),new Function(new ArgList(),s));	
					}
					break;
				case 6 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:33:4: 'fun' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,27,FOLLOW_27_in_stmt297); 
					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_stmt299); 
					match(input,10,FOLLOW_10_in_stmt301); 
					pushFollow(FOLLOW_formalParamList_in_stmt305);
					l=formalParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt307); 
					pushFollow(FOLLOW_stmt_in_stmt311);
					s=stmt();
					state._fsp--;

					 ast = new FuncDeclStmt((VAR7!=null?VAR7.getText():null),new Function(l,s)); 
					}
					break;
				case 7 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:4: 'declare' VAR '=' exp ( ';' )?
					{
					match(input,25,FOLLOW_25_in_stmt318); 
					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_stmt320); 
					match(input,19,FOLLOW_19_in_stmt322); 
					pushFollow(FOLLOW_exp_in_stmt324);
					exp9=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:26: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==17) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:34:26: ';'
							{
							match(input,17,FOLLOW_17_in_stmt326); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR8!=null?VAR8.getText():null),exp9); 
					}
					break;
				case 8 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:4: 'declare' VAR ( ';' )?
					{
					match(input,25,FOLLOW_25_in_stmt336); 
					VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_stmt338); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:18: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==17) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:35:18: ';'
							{
							match(input,17,FOLLOW_17_in_stmt340); 
							}
							break;

					}

					 ast = new VarDeclStmt((VAR10!=null?VAR10.getText():null),new NumExpr(0)); 
					}
					break;
				case 9 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:4: VAR '=' exp ( ';' )?
					{
					VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_stmt351); 
					match(input,19,FOLLOW_19_in_stmt353); 
					pushFollow(FOLLOW_exp_in_stmt355);
					exp12=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:16: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==17) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:36:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt357); 
							}
							break;

					}

					 ast = new AssignStmt((VAR11!=null?VAR11.getText():null),exp12); 
					}
					break;
				case 10 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:4: 'get' VAR ( ';' )?
					{
					match(input,29,FOLLOW_29_in_stmt368); 
					VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_stmt370); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:14: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==17) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:37:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt372); 
							}
							break;

					}

					 ast = new GetStmt((VAR13!=null?VAR13.getText():null)); 
					}
					break;
				case 11 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:4: 'put' exp ( ';' )?
					{
					match(input,31,FOLLOW_31_in_stmt384); 
					pushFollow(FOLLOW_exp_in_stmt386);
					exp14=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:14: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==17) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:38:14: ';'
							{
							match(input,17,FOLLOW_17_in_stmt388); 
							}
							break;

					}

					 ast = new PutStmt(exp14); 
					}
					break;
				case 12 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:39:4: VAR '(' ')' ( ';' )?
					{
					VAR15=(Token)match(input,VAR,FOLLOW_VAR_in_stmt400); 
					match(input,10,FOLLOW_10_in_stmt402); 
					match(input,11,FOLLOW_11_in_stmt404); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:39:16: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==17) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:39:16: ';'
							{
							match(input,17,FOLLOW_17_in_stmt406); 
							}
							break;

					}

					 ast = new CallStmt((VAR15!=null?VAR15.getText():null));
					}
					break;
				case 13 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:40:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_stmt417); 
					match(input,10,FOLLOW_10_in_stmt419); 
					pushFollow(FOLLOW_actualParamList_in_stmt423);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt425); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:40:34: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==17) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:40:34: ';'
							{
							match(input,17,FOLLOW_17_in_stmt427); 
							}
							break;

					}

					 ast = new CallStmt((VAR16!=null?VAR16.getText():null),l);
					}
					break;
				case 14 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:4: 'return' exp ( ';' )?
					{
					match(input,32,FOLLOW_32_in_stmt436); 
					pushFollow(FOLLOW_exp_in_stmt438);
					exp17=exp();
					state._fsp--;

					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:17: ( ';' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==17) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:41:17: ';'
							{
							match(input,17,FOLLOW_17_in_stmt440); 
							}
							break;

					}

					 ast = new ReturnStmt(exp17); 
					}
					break;
				case 15 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:42:4: 'return' ( ';' )?
					{
					match(input,32,FOLLOW_32_in_stmt451); 
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:42:13: ( ';' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==17) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:42:13: ';'
							{
							match(input,17,FOLLOW_17_in_stmt453); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
					}
					break;
				case 16 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:43:4: 'while' '(' exp ')' s= stmt
					{
					match(input,33,FOLLOW_33_in_stmt465); 
					match(input,10,FOLLOW_10_in_stmt467); 
					pushFollow(FOLLOW_exp_in_stmt469);
					exp18=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt471); 
					pushFollow(FOLLOW_stmt_in_stmt475);
					s=stmt();
					state._fsp--;

					 ast = new WhileStmt(exp18,s); 
					}
					break;
				case 17 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:44:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,30,FOLLOW_30_in_stmt484); 
					match(input,10,FOLLOW_10_in_stmt486); 
					pushFollow(FOLLOW_exp_in_stmt488);
					exp19=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt490); 
					pushFollow(FOLLOW_stmt_in_stmt494);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp19,s1);
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:44:67: ( 'else' s2= stmt )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==26) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:44:68: 'else' s2= stmt
							{
							match(input,26,FOLLOW_26_in_stmt498); 
							pushFollow(FOLLOW_stmt_in_stmt502);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 18 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:4: '{' (s= stmt )+ '}'
					{
					match(input,34,FOLLOW_34_in_stmt513); 
					ast = new BlockStmt();
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:34: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==VAR||(LA14_0 >= 21 && LA14_0 <= 25)||(LA14_0 >= 27 && LA14_0 <= 34)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:45:35: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt520);
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

					match(input,35,FOLLOW_35_in_stmt526); 
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:48:1: formalParamList returns [ArgList ast] : v1= VAR ( ',' v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:2: (v1= VAR ( ',' v2= VAR )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:4: v1= VAR ( ',' v2= VAR )*
			{
			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList543); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:55: ( ',' v2= VAR )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==14) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:49:56: ',' v2= VAR
					{
					match(input,14,FOLLOW_14_in_formalParamList547); 
					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList551); 
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:52:1: actualParamList returns [ArgList ast] : e1= exp ( ',' e2= exp )* ;
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:53:2: (e1= exp ( ',' e2= exp )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:53:4: e1= exp ( ',' e2= exp )*
			{
			pushFollow(FOLLOW_exp_in_actualParamList575);
			e1=exp();
			state._fsp--;

			ast = new ArgList(e1);
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:53:43: ( ',' e2= exp )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==14) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:53:44: ',' e2= exp
					{
					match(input,14,FOLLOW_14_in_actualParamList580); 
					pushFollow(FOLLOW_exp_in_actualParamList584);
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:56:1: exp returns [Expr ast] : relexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr relexp20 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:57:2: ( relexp )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:57:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp604);
			relexp20=relexp();
			state._fsp--;

			ast = relexp20; 
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:59:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:60:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:60:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp621);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:61:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
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
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:62:4: ( '==' e2= addexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:62:4: ( '==' e2= addexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:62:5: '==' e2= addexp
					{
					match(input,20,FOLLOW_20_in_relexp634); 
					pushFollow(FOLLOW_addexp_in_relexp638);
					e2=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:63:4: ( '<=' e3= addexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:63:4: ( '<=' e3= addexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:63:5: '<=' e3= addexp
					{
					match(input,18,FOLLOW_18_in_relexp648); 
					pushFollow(FOLLOW_addexp_in_relexp652);
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:67:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:68:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:68:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp677);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:69:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
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
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:70:4: ( '+' e2= mulexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:70:4: ( '+' e2= mulexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:70:5: '+' e2= mulexp
					{
					match(input,13,FOLLOW_13_in_addexp689); 
					pushFollow(FOLLOW_mulexp_in_addexp693);
					e2=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:71:4: ( '-' e3= mulexp )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:71:4: ( '-' e3= mulexp )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:71:5: '-' e3= mulexp
					{
					match(input,15,FOLLOW_15_in_addexp703); 
					pushFollow(FOLLOW_mulexp_in_addexp707);
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:75:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:76:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:76:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp733);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:77:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
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
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:78:4: ( '*' e2= atom )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:78:4: ( '*' e2= atom )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:78:5: '*' e2= atom
					{
					match(input,12,FOLLOW_12_in_mulexp745); 
					pushFollow(FOLLOW_atom_in_mulexp749);
					e2=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:79:4: ( '/' e3= atom )
					{
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:79:4: ( '/' e3= atom )
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:79:5: '/' e3= atom
					{
					match(input,16,FOLLOW_16_in_mulexp759); 
					pushFollow(FOLLOW_atom_in_mulexp763);
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
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:83:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR22=null;
		Token NUM23=null;
		Token NUM24=null;
		Token VAR25=null;
		Token VAR26=null;
		Token STRING27=null;
		ArgList l =null;
		Expr exp21 =null;

		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:84:2: ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING )
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
				else if ( (LA21_2==EOF||LA21_2==VAR||(LA21_2 >= 11 && LA21_2 <= 18)||(LA21_2 >= 20 && LA21_2 <= 35)) ) {
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
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:84:4: '(' exp ')'
					{
					match(input,10,FOLLOW_10_in_atom787); 
					pushFollow(FOLLOW_exp_in_atom789);
					exp21=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom791); 
					 ast = new ParenExpr(exp21); 
					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:85:4: VAR
					{
					VAR22=(Token)match(input,VAR,FOLLOW_VAR_in_atom803); 
					 ast = new VarExpr((VAR22!=null?VAR22.getText():null)); 
					}
					break;
				case 3 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:86:4: NUM
					{
					NUM23=(Token)match(input,NUM,FOLLOW_NUM_in_atom813); 
					 ast = new NumExpr((NUM23!=null?NUM23.getText():null)); 
					}
					break;
				case 4 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:87:4: '-' NUM
					{
					match(input,15,FOLLOW_15_in_atom823); 
					NUM24=(Token)match(input,NUM,FOLLOW_NUM_in_atom825); 
					 ast = new NumExpr('-' + (NUM24!=null?NUM24.getText():null)); 
					}
					break;
				case 5 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:88:4: VAR '(' ')'
					{
					VAR25=(Token)match(input,VAR,FOLLOW_VAR_in_atom835); 
					match(input,10,FOLLOW_10_in_atom837); 
					match(input,11,FOLLOW_11_in_atom839); 
					 ast = new CallExpr((VAR25!=null?VAR25.getText():null));
					}
					break;
				case 6 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:89:4: VAR '(' l= actualParamList ')'
					{
					VAR26=(Token)match(input,VAR,FOLLOW_VAR_in_atom848); 
					match(input,10,FOLLOW_10_in_atom850); 
					pushFollow(FOLLOW_actualParamList_in_atom854);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom856); 
					 ast = new CallExpr((VAR26!=null?VAR26.getText():null),l); 
					}
					break;
				case 7 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:90:17: STRING
					{
					STRING27=(Token)match(input,STRING,FOLLOW_STRING_in_atom877); 
					 ast = new ValueExpr(new Value((STRING27!=null?STRING27.getText():null))); 
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



	// $ANTLR start "part"
	// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:93:1: part returns [Integer p] : ( 'Drum' | 'Piano' );
	public final Integer part() throws RecognitionException {
		Integer p = null;


		try {
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:94:9: ( 'Drum' | 'Piano' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==21) ) {
				alt22=1;
			}
			else if ( (LA22_0==23) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:94:17: 'Drum'
					{
					match(input,21,FOLLOW_21_in_part932); 
					 p = new Integer(Song.DRUM); 
					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:95:17: 'Piano'
					{
					match(input,23,FOLLOW_23_in_part977); 
					 p = new Integer(Song.PIANO); 
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
		return p;
	}
	// $ANTLR end "part"

	// Delegated rules


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\145\uffff";
	static final String DFA15_eofS =
		"\13\uffff\1\30\4\uffff\1\53\3\uffff\1\23\120\uffff";
	static final String DFA15_minS =
		"\1\10\5\uffff\2\10\1\12\2\uffff\1\6\3\uffff\1\12\1\10\1\uffff\1\6\1\uffff"+
		"\1\10\24\uffff\1\10\31\uffff\1\6\41\uffff";
	static final String DFA15_maxS =
		"\1\42\5\uffff\2\10\1\23\2\uffff\1\43\3\uffff\1\12\1\43\1\uffff\1\17\1"+
		"\uffff\1\43\24\uffff\1\13\31\uffff\1\17\41\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\4\3\uffff\1\12\1\13\1\uffff\1\20\1\21\1"+
		"\22\2\uffff\1\11\1\uffff\1\16\4\uffff\1\17\21\uffff\1\7\1\10\21\uffff"+
		"\1\14\1\15\36\uffff\1\5\1\6\6\16";
	static final String DFA15_specialS =
		"\145\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\10\14\uffff\1\3\1\5\1\3\1\1\1\7\1\uffff\1\6\1\2\1\11\1\15\1\12\1\13"+
			"\1\14\1\16",
			"",
			"",
			"",
			"",
			"",
			"\1\17",
			"\1\20",
			"\1\22\10\uffff\1\21",
			"",
			"",
			"\2\23\1\24\1\uffff\1\23\4\uffff\1\23\1\uffff\1\30\3\uffff\17\30",
			"",
			"",
			"",
			"\1\51",
			"\1\53\10\uffff\1\53\1\uffff\1\52\1\uffff\17\53",
			"",
			"\3\76\1\uffff\1\76\1\75\3\uffff\1\76",
			"",
			"\1\23\1\uffff\1\103\1\uffff\2\23\1\uffff\4\23\1\30\20\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\136\2\uffff\1\135",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\142\1\144\1\141\1\uffff\1\140\1\137\3\uffff\1\143",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "27:1: stmt returns [Stmt ast] : ( 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | part VAR | 'Phrase' VAR | 'fun' VAR '(' ')' s= stmt | 'fun' VAR '(' l= formalParamList ')' s= stmt | 'declare' VAR '=' exp ( ';' )? | 'declare' VAR ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x00000007FBE00102L});
	public static final BitSet FOLLOW_24_in_stmt58 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STRING_in_stmt60 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt104 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_part_in_stmt159 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_stmt221 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt278 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt280 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt282 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt284 = new BitSet(new long[]{0x00000007FBE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_stmt297 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt299 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt301 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_formalParamList_in_stmt305 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt307 = new BitSet(new long[]{0x00000007FBE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt318 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt320 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt322 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt324 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_stmt336 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt338 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt351 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt353 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt355 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt368 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt370 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_stmt384 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt386 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt400 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt402 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt404 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt417 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt419 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_stmt423 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt425 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stmt436 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt438 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stmt451 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_stmt453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_stmt465 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt467 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt469 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt471 = new BitSet(new long[]{0x00000007FBE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt484 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt486 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt488 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt490 = new BitSet(new long[]{0x00000007FBE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt494 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_stmt498 = new BitSet(new long[]{0x00000007FBE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_stmt513 = new BitSet(new long[]{0x00000007FBE00100L});
	public static final BitSet FOLLOW_stmt_in_stmt520 = new BitSet(new long[]{0x0000000FFBE00100L});
	public static final BitSet FOLLOW_35_in_stmt526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_formalParamList543 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_formalParamList547 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_formalParamList551 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_exp_in_actualParamList575 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_actualParamList580 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_actualParamList584 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_relexp_in_exp604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp621 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_relexp634 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp638 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_relexp648 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp652 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_mulexp_in_addexp677 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_13_in_addexp689 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp693 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_15_in_addexp703 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp707 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_atom_in_mulexp733 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_12_in_mulexp745 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp749 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_16_in_mulexp759 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp763 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_10_in_atom787 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_atom789 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_atom823 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUM_in_atom825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom835 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom837 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom848 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom850 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_atom854 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_part932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_part977 = new BitSet(new long[]{0x0000000000000002L});
}
