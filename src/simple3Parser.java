// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-18 20:39:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", 
		"VAR", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'->'", "'/'", 
		"';'", "'<='", "'='", "'=='", "'Function'", "'Integer'", "'Part'", "'Phrase'", 
		"'Score'", "'String'", "'get'", "'put'", "'return'", "'void'"
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
				if ( (LA1_0==VAR||(LA1_0 >= 22 && LA1_0 <= 31)) ) {
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token VAR2=null;
		Token VAR3=null;
		Token VAR4=null;
		Token VAR5=null;
		Token VAR6=null;
		Token VAR8=null;
		Token VAR9=null;
		Token VAR11=null;
		Token VAR12=null;
		Stmt s =null;
		int dt =0;
		ArgList l =null;
		Expr exp7 =null;
		Expr exp10 =null;
		Expr exp13 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:2: ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? )
			int alt10=12;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:4: 'void' VAR '(' ')' s= stmt
					{
					match(input,31,FOLLOW_31_in_stmt58); 
					VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_stmt60); 
					match(input,10,FOLLOW_10_in_stmt62); 
					match(input,11,FOLLOW_11_in_stmt63); 
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
					match(input,10,FOLLOW_10_in_stmt133); 
					match(input,11,FOLLOW_11_in_stmt135); 
					pushFollow(FOLLOW_stmt_in_stmt139);
					s=stmt();
					state._fsp--;

					 
					                   ast = new FuncDeclStmt((VAR3!=null?VAR3.getText():null),new Function(dt,new ArgList(),s));
					                
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:17: 'void' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,31,FOLLOW_31_in_stmt178); 
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt180); 
					match(input,10,FOLLOW_10_in_stmt182); 
					pushFollow(FOLLOW_formalParamList_in_stmt186);
					l=formalParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt188); 
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
					match(input,10,FOLLOW_10_in_stmt234); 
					pushFollow(FOLLOW_formalParamList_in_stmt238);
					l=formalParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt240); 
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
					match(input,20,FOLLOW_20_in_stmt287); 
					pushFollow(FOLLOW_exp_in_stmt289);
					exp7=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:41: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==18) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:41: ';'
							{
							match(input,18,FOLLOW_18_in_stmt291); 
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
					if ( (LA3_0==18) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:33: ';'
							{
							match(input,18,FOLLOW_18_in_stmt334); 
							}
							break;

					}

					 
					                    ast = new VarDeclStmt(dt,(VAR8!=null?VAR8.getText():null),new ConstExpr(new IntConst("0"))); 
					                
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:4: 'get' VAR ( ';' )?
					{
					match(input,28,FOLLOW_28_in_stmt364); 
					VAR9=(Token)match(input,VAR,FOLLOW_VAR_in_stmt366); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:14: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==18) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:14: ';'
							{
							match(input,18,FOLLOW_18_in_stmt368); 
							}
							break;

					}

					 ast = new GetStmt((VAR9!=null?VAR9.getText():null)); 
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:4: 'put' exp ( ';' )?
					{
					match(input,29,FOLLOW_29_in_stmt380); 
					pushFollow(FOLLOW_exp_in_stmt382);
					exp10=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:14: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==18) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:14: ';'
							{
							match(input,18,FOLLOW_18_in_stmt384); 
							}
							break;

					}

					 ast = new PutStmt(exp10); 
					}
					break;
				case 9 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:4: VAR '(' ')' ( ';' )?
					{
					VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_stmt396); 
					match(input,10,FOLLOW_10_in_stmt398); 
					match(input,11,FOLLOW_11_in_stmt400); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:16: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==18) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:16: ';'
							{
							match(input,18,FOLLOW_18_in_stmt402); 
							}
							break;

					}

					 ast = new CallStmt((VAR11!=null?VAR11.getText():null));
					}
					break;
				case 10 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_stmt413); 
					match(input,10,FOLLOW_10_in_stmt415); 
					pushFollow(FOLLOW_actualParamList_in_stmt419);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_stmt421); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:34: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==18) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:34: ';'
							{
							match(input,18,FOLLOW_18_in_stmt423); 
							}
							break;

					}

					 ast = new CallStmt((VAR12!=null?VAR12.getText():null),l);
					}
					break;
				case 11 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:4: 'return' exp ( ';' )?
					{
					match(input,30,FOLLOW_30_in_stmt432); 
					pushFollow(FOLLOW_exp_in_stmt434);
					exp13=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:17: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==18) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:17: ';'
							{
							match(input,18,FOLLOW_18_in_stmt436); 
							}
							break;

					}

					 ast = new ReturnStmt(exp13); 
					}
					break;
				case 12 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:4: 'return' ( ';' )?
					{
					match(input,30,FOLLOW_30_in_stmt447); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:13: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==18) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:13: ';'
							{
							match(input,18,FOLLOW_18_in_stmt449); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:68:1: dataType returns [int type] : ( 'String' | 'Integer' | 'Score' | 'Part' | 'Phrase' | 'Function' );
	public final int dataType() throws RecognitionException {
		int type = 0;


		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:9: ( 'String' | 'Integer' | 'Score' | 'Part' | 'Phrase' | 'Function' )
			int alt11=6;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt11=1;
				}
				break;
			case 23:
				{
				alt11=2;
				}
				break;
			case 26:
				{
				alt11=3;
				}
				break;
			case 24:
				{
				alt11=4;
				}
				break;
			case 25:
				{
				alt11=5;
				}
				break;
			case 22:
				{
				alt11=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:17: 'String'
					{
					match(input,27,FOLLOW_27_in_dataType487); 
					 type = Value.STRING; 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:70:17: 'Integer'
					{
					match(input,23,FOLLOW_23_in_dataType522); 
					 type = Value.INTEGER; 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:71:17: 'Score'
					{
					match(input,26,FOLLOW_26_in_dataType556); 
					 type = Value.SCORE; 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:72:17: 'Part'
					{
					match(input,24,FOLLOW_24_in_dataType592); 
					 type = Value.PART; 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:73:17: 'Phrase'
					{
					match(input,25,FOLLOW_25_in_dataType629); 
					 type = Value.PHRASE; 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:74:17: 'Function'
					{
					match(input,22,FOLLOW_22_in_dataType664); 
					 type = Value.FUNCTION; 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:77:1: formalParamList returns [ArgList ast] : dataType v1= VAR ( ',' dataType v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:2: ( dataType v1= VAR ( ',' dataType v2= VAR )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:4: dataType v1= VAR ( ',' dataType v2= VAR )*
			{
			pushFollow(FOLLOW_dataType_in_formalParamList701);
			dataType();
			state._fsp--;

			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList705); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:64: ( ',' dataType v2= VAR )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==14) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:65: ',' dataType v2= VAR
					{
					match(input,14,FOLLOW_14_in_formalParamList709); 
					pushFollow(FOLLOW_dataType_in_formalParamList711);
					dataType();
					state._fsp--;

					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList715); 
					ast.addAST(new VarExpr((v2!=null?v2.getText():null)));
					}
					break;

				default :
					break loop12;
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:81:1: actualParamList returns [ArgList ast] : (e1= exp ( ',' e2= exp )* |v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )* );
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;
		Expr e1 =null;
		Expr e2 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:82:2: (e1= exp ( ',' e2= exp )* |v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )* )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= NUM && LA15_0 <= STRING)||LA15_0==10||LA15_0==15) ) {
				alt15=1;
			}
			else if ( (LA15_0==VAR) ) {
				int LA15_2 = input.LA(2);
				if ( ((LA15_2 >= 10 && LA15_2 <= 15)||LA15_2==17||LA15_2==19||LA15_2==21) ) {
					alt15=1;
				}
				else if ( (LA15_2==16) ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:82:4: e1= exp ( ',' e2= exp )*
					{
					pushFollow(FOLLOW_exp_in_actualParamList738);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:19: ( ',' e2= exp )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==14) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:20: ',' e2= exp
							{
							match(input,14,FOLLOW_14_in_actualParamList743); 
							pushFollow(FOLLOW_exp_in_actualParamList747);
							e2=exp();
							state._fsp--;

							ast.addAST(e2);
							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:85:17: v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )*
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList772); 
					match(input,16,FOLLOW_16_in_actualParamList774); 
					pushFollow(FOLLOW_exp_in_actualParamList778);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                    ast.addKeyword((v1!=null?v1.getText():null));
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:19: ( ',' v2= VAR '->' e2= exp )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==14) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:20: ',' v2= VAR '->' e2= exp
							{
							match(input,14,FOLLOW_14_in_actualParamList783); 
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList787); 
							match(input,16,FOLLOW_16_in_actualParamList789); 
							pushFollow(FOLLOW_exp_in_actualParamList793);
							e2=exp();
							state._fsp--;


							                    ast.addAST(e2);
							                    ast.addKeyword((v2!=null?v2.getText():null));
							                
							}
							break;

						default :
							break loop14;
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:94:1: exp returns [Expr ast] : relexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr relexp14 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:95:2: ( relexp )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:95:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp813);
			relexp14=relexp();
			state._fsp--;

			ast = relexp14; 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:98:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:99:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:99:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp839);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
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
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:4: ( '==' e2= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:4: ( '==' e2= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:5: '==' e2= addexp
					{
					match(input,21,FOLLOW_21_in_relexp852); 
					pushFollow(FOLLOW_addexp_in_relexp856);
					e2=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:102:4: ( '<=' e3= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:102:4: ( '<=' e3= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:102:5: '<=' e3= addexp
					{
					match(input,19,FOLLOW_19_in_relexp866); 
					pushFollow(FOLLOW_addexp_in_relexp870);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:106:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:107:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:107:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp895);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:108:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==13) ) {
					alt17=1;
				}
				else if ( (LA17_0==15) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:109:4: ( '+' e2= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:109:4: ( '+' e2= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:109:5: '+' e2= mulexp
					{
					match(input,13,FOLLOW_13_in_addexp907); 
					pushFollow(FOLLOW_mulexp_in_addexp911);
					e2=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:110:4: ( '-' e3= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:110:4: ( '-' e3= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:110:5: '-' e3= mulexp
					{
					match(input,15,FOLLOW_15_in_addexp921); 
					pushFollow(FOLLOW_mulexp_in_addexp925);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:114:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:115:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:115:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp951);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:116:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==12) ) {
					alt18=1;
				}
				else if ( (LA18_0==17) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:117:4: ( '*' e2= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:117:4: ( '*' e2= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:117:5: '*' e2= atom
					{
					match(input,12,FOLLOW_12_in_mulexp963); 
					pushFollow(FOLLOW_atom_in_mulexp967);
					e2=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:118:4: ( '/' e3= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:118:4: ( '/' e3= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:118:5: '/' e3= atom
					{
					match(input,17,FOLLOW_17_in_mulexp977); 
					pushFollow(FOLLOW_atom_in_mulexp981);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:122:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR16=null;
		Token NUM17=null;
		Token NUM18=null;
		Token VAR19=null;
		Token VAR20=null;
		Token STRING21=null;
		ArgList l =null;
		Expr exp15 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:123:2: ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING )
			int alt19=7;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt19=1;
				}
				break;
			case VAR:
				{
				int LA19_2 = input.LA(2);
				if ( (LA19_2==10) ) {
					int LA19_6 = input.LA(3);
					if ( (LA19_6==11) ) {
						alt19=5;
					}
					else if ( ((LA19_6 >= NUM && LA19_6 <= VAR)||LA19_6==10||LA19_6==15) ) {
						alt19=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA19_2==EOF||LA19_2==VAR||(LA19_2 >= 11 && LA19_2 <= 15)||(LA19_2 >= 17 && LA19_2 <= 19)||(LA19_2 >= 21 && LA19_2 <= 31)) ) {
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
			case 15:
				{
				alt19=4;
				}
				break;
			case STRING:
				{
				alt19=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:123:4: '(' exp ')'
					{
					match(input,10,FOLLOW_10_in_atom1005); 
					pushFollow(FOLLOW_exp_in_atom1007);
					exp15=exp();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom1009); 
					 ast = new ParenExpr(exp15); 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:124:4: VAR
					{
					VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_atom1021); 
					 ast = new VarExpr((VAR16!=null?VAR16.getText():null)); 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:125:4: NUM
					{
					NUM17=(Token)match(input,NUM,FOLLOW_NUM_in_atom1031); 
					 ast = new NumExpr((NUM17!=null?NUM17.getText():null)); 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:126:4: '-' NUM
					{
					match(input,15,FOLLOW_15_in_atom1041); 
					NUM18=(Token)match(input,NUM,FOLLOW_NUM_in_atom1043); 
					 ast = new NumExpr('-' + (NUM18!=null?NUM18.getText():null)); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:127:4: VAR '(' ')'
					{
					VAR19=(Token)match(input,VAR,FOLLOW_VAR_in_atom1053); 
					match(input,10,FOLLOW_10_in_atom1055); 
					match(input,11,FOLLOW_11_in_atom1057); 
					 ast = new CallExpr((VAR19!=null?VAR19.getText():null));
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:128:4: VAR '(' l= actualParamList ')'
					{
					VAR20=(Token)match(input,VAR,FOLLOW_VAR_in_atom1066); 
					match(input,10,FOLLOW_10_in_atom1068); 
					pushFollow(FOLLOW_actualParamList_in_atom1072);
					l=actualParamList();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom1074); 
					 ast = new CallExpr((VAR20!=null?VAR20.getText():null),l); 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:129:17: STRING
					{
					STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_atom1095); 
					 
					                    String s = (STRING21!=null?STRING21.getText():null);

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


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\u00d1\uffff";
	static final String DFA10_eofS =
		"\13\uffff\1\31\1\uffff\6\50\2\uffff\1\24\u00bb\uffff";
	static final String DFA10_minS =
		"\10\10\2\uffff\1\12\1\6\1\12\6\10\1\6\1\uffff\1\10\17\uffff\2\13\16\uffff"+
		"\1\13\16\uffff\1\13\16\uffff\1\13\16\uffff\1\13\16\uffff\1\13\24\uffff"+
		"\1\6\112\uffff";
	static final String DFA10_maxS =
		"\1\37\7\10\2\uffff\1\12\1\37\1\12\6\37\1\17\1\uffff\1\37\17\uffff\2\33"+
		"\16\uffff\1\33\16\uffff\1\33\16\uffff\1\33\16\uffff\1\33\16\uffff\1\33"+
		"\24\uffff\1\17\112\uffff";
	static final String DFA10_acceptS =
		"\10\uffff\1\7\1\10\12\uffff\1\13\4\uffff\1\14\15\uffff\1\5\1\6\127\uffff"+
		"\1\11\1\12\30\uffff\1\1\1\3\5\uffff\1\2\1\4\50\uffff\6\13";
	static final String DFA10_specialS =
		"\u00d1\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\12\15\uffff\1\7\1\3\1\5\1\6\1\4\1\2\1\10\1\11\1\13\1\1",
			"\1\14",
			"\1\15",
			"\1\16",
			"\1\17",
			"\1\20",
			"\1\21",
			"\1\22",
			"",
			"",
			"\1\23",
			"\2\24\1\25\1\uffff\1\24\4\uffff\1\24\2\uffff\1\31\3\uffff\12\31",
			"\1\45",
			"\1\50\1\uffff\1\46\7\uffff\1\50\1\uffff\1\47\1\uffff\12\50",
			"\1\50\1\uffff\1\65\7\uffff\1\50\1\uffff\1\47\1\uffff\12\50",
			"\1\50\1\uffff\1\104\7\uffff\1\50\1\uffff\1\47\1\uffff\12\50",
			"\1\50\1\uffff\1\123\7\uffff\1\50\1\uffff\1\47\1\uffff\12\50",
			"\1\50\1\uffff\1\142\7\uffff\1\50\1\uffff\1\47\1\uffff\12\50",
			"\1\50\1\uffff\1\161\7\uffff\1\50\1\uffff\1\47\1\uffff\12\50",
			"\3\u0081\1\uffff\1\u0081\1\u0080\3\uffff\1\u0081",
			"",
			"\1\24\1\uffff\1\u0086\1\uffff\2\24\1\uffff\1\24\1\uffff\3\24\1\uffff"+
			"\13\24",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u009a\12\uffff\6\u009b",
			"\1\u00a1\12\uffff\6\u00a2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a1\12\uffff\6\u00a2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a1\12\uffff\6\u00a2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a1\12\uffff\6\u00a2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a1\12\uffff\6\u00a2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a1\12\uffff\6\u00a2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ce\1\u00d0\1\u00cd\1\uffff\1\u00cc\1\u00cb\3\uffff\1\u00cf",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x00000000FFC00102L});
	public static final BitSet FOLLOW_31_in_stmt58 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt60 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt62 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt63 = new BitSet(new long[]{0x00000000FFC00100L});
	public static final BitSet FOLLOW_stmt_in_stmt67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt129 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt131 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt133 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt135 = new BitSet(new long[]{0x00000000FFC00100L});
	public static final BitSet FOLLOW_stmt_in_stmt139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_stmt178 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt180 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt182 = new BitSet(new long[]{0x000000000FC00000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt186 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt188 = new BitSet(new long[]{0x00000000FFC00100L});
	public static final BitSet FOLLOW_stmt_in_stmt192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt230 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt232 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt234 = new BitSet(new long[]{0x000000000FC00000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt238 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt240 = new BitSet(new long[]{0x00000000FFC00100L});
	public static final BitSet FOLLOW_stmt_in_stmt244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt283 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt285 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_stmt287 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt289 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt330 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt332 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stmt364 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt366 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt380 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt382 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt396 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt398 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt400 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt413 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stmt415 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_stmt419 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt421 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt432 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_stmt434 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt447 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_dataType487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_dataType522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_dataType556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_dataType592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_dataType629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_dataType664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_formalParamList701 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_formalParamList705 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_formalParamList709 = new BitSet(new long[]{0x000000000FC00000L});
	public static final BitSet FOLLOW_dataType_in_formalParamList711 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_formalParamList715 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_exp_in_actualParamList738 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_actualParamList743 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_actualParamList747 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_VAR_in_actualParamList772 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_actualParamList774 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_actualParamList778 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_actualParamList783 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_actualParamList787 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_actualParamList789 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_actualParamList793 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_relexp_in_exp813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp839 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_21_in_relexp852 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp856 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_19_in_relexp866 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_addexp_in_relexp870 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_mulexp_in_addexp895 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_13_in_addexp907 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp911 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_15_in_addexp921 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_mulexp_in_addexp925 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_atom_in_mulexp951 = new BitSet(new long[]{0x0000000000021002L});
	public static final BitSet FOLLOW_12_in_mulexp963 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp967 = new BitSet(new long[]{0x0000000000021002L});
	public static final BitSet FOLLOW_17_in_mulexp977 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_atom_in_mulexp981 = new BitSet(new long[]{0x0000000000021002L});
	public static final BitSet FOLLOW_10_in_atom1005 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_exp_in_atom1007 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_atom1041 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUM_in_atom1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1053 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom1055 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1066 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom1068 = new BitSet(new long[]{0x00000000000085C0L});
	public static final BitSet FOLLOW_actualParamList_in_atom1072 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1095 = new BitSet(new long[]{0x0000000000000002L});
}
