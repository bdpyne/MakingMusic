// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-18 22:50:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DOUBLE", "ESC_SEQ", 
		"NUM", "STRING", "VAR", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'->'", "'/'", "';'", "'<='", "'='", "'=='", "'Double'", "'Function'", 
		"'Integer'", "'Part'", "'Phrase'", "'Score'", "'String'", "'add note'", 
		"'generate'", "'get'", "'put'", "'return'", "'to'", "'void'"
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
	public static final int T__36=36;
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
				if ( (LA1_0==VAR||(LA1_0 >= 23 && LA1_0 <= 34)||LA1_0==36) ) {
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )? | 'generate' ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? );
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
		Token VAR12=null;
		Stmt s =null;
		int dt =0;
		ArgList l =null;
		Expr instr =null;
		Expr rhy =null;
		Expr exp7 =null;
		Expr exp10 =null;
		Expr exp13 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:2: ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )? | 'generate' ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? )
			int alt12=14;
			alt12 = dfa12.predict(input);
			switch (alt12) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:4: 'void' VAR '(' ')' s= stmt
					{
					match(input,36,FOLLOW_36_in_stmt58); 
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
					match(input,36,FOLLOW_36_in_stmt178); 
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
					match(input,21,FOLLOW_21_in_stmt287); 
					pushFollow(FOLLOW_exp_in_stmt289);
					exp7=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:41: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==19) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:41: ';'
							{
							match(input,19,FOLLOW_19_in_stmt291); 
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
					if ( (LA3_0==19) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:33: ';'
							{
							match(input,19,FOLLOW_19_in_stmt334); 
							}
							break;

					}

					 
					                    ast = new VarDeclStmt(dt,(VAR8!=null?VAR8.getText():null),new ConstExpr(new IntConst("0"))); 
					                
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:17: 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )?
					{
					match(input,30,FOLLOW_30_in_stmt372); 
					pushFollow(FOLLOW_exp_in_stmt376);
					instr=exp();
					state._fsp--;

					pushFollow(FOLLOW_exp_in_stmt380);
					rhy=exp();
					state._fsp--;

					match(input,35,FOLLOW_35_in_stmt382); 
					phr=(Token)match(input,VAR,FOLLOW_VAR_in_stmt386); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:59: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==19) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:59: ';'
							{
							match(input,19,FOLLOW_19_in_stmt388); 
							}
							break;

					}


					                    ast = new NoteStmt(instr, rhy, (phr!=null?phr.getText():null));
					                
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:17: 'generate' ( ';' )?
					{
					match(input,31,FOLLOW_31_in_stmt427); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:28: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==19) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:28: ';'
							{
							match(input,19,FOLLOW_19_in_stmt429); 
							}
							break;

					}

					 ast = new GenerateStmt(); 
					}
					break;
				case 9 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:4: 'get' VAR ( ';' )?
					{
					match(input,32,FOLLOW_32_in_stmt472); 
					VAR9=(Token)match(input,VAR,FOLLOW_VAR_in_stmt474); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:14: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==19) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:14: ';'
							{
							match(input,19,FOLLOW_19_in_stmt476); 
							}
							break;

					}

					 ast = new GetStmt((VAR9!=null?VAR9.getText():null)); 
					}
					break;
				case 10 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:4: 'put' exp ( ';' )?
					{
					match(input,33,FOLLOW_33_in_stmt488); 
					pushFollow(FOLLOW_exp_in_stmt490);
					exp10=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:14: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==19) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:14: ';'
							{
							match(input,19,FOLLOW_19_in_stmt492); 
							}
							break;

					}

					 ast = new PutStmt(exp10); 
					}
					break;
				case 11 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:4: VAR '(' ')' ( ';' )?
					{
					VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_stmt504); 
					match(input,11,FOLLOW_11_in_stmt506); 
					match(input,12,FOLLOW_12_in_stmt508); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:16: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==19) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:16: ';'
							{
							match(input,19,FOLLOW_19_in_stmt510); 
							}
							break;

					}

					 ast = new CallStmt((VAR11!=null?VAR11.getText():null));
					}
					break;
				case 12 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_stmt521); 
					match(input,11,FOLLOW_11_in_stmt523); 
					pushFollow(FOLLOW_actualParamList_in_stmt527);
					l=actualParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_stmt529); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:34: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==19) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:34: ';'
							{
							match(input,19,FOLLOW_19_in_stmt531); 
							}
							break;

					}

					 ast = new CallStmt((VAR12!=null?VAR12.getText():null),l);
					}
					break;
				case 13 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:66:4: 'return' exp ( ';' )?
					{
					match(input,34,FOLLOW_34_in_stmt540); 
					pushFollow(FOLLOW_exp_in_stmt542);
					exp13=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:66:17: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==19) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:66:17: ';'
							{
							match(input,19,FOLLOW_19_in_stmt544); 
							}
							break;

					}

					 ast = new ReturnStmt(exp13); 
					}
					break;
				case 14 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:67:4: 'return' ( ';' )?
					{
					match(input,34,FOLLOW_34_in_stmt555); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:67:13: ( ';' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==19) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:67:13: ';'
							{
							match(input,19,FOLLOW_19_in_stmt557); 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:73:1: dataType returns [int type] : ( 'String' | 'Integer' | 'Score' | 'Part' | 'Phrase' | 'Function' | 'Double' );
	public final int dataType() throws RecognitionException {
		int type = 0;


		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:74:9: ( 'String' | 'Integer' | 'Score' | 'Part' | 'Phrase' | 'Function' | 'Double' )
			int alt13=7;
			switch ( input.LA(1) ) {
			case 29:
				{
				alt13=1;
				}
				break;
			case 25:
				{
				alt13=2;
				}
				break;
			case 28:
				{
				alt13=3;
				}
				break;
			case 26:
				{
				alt13=4;
				}
				break;
			case 27:
				{
				alt13=5;
				}
				break;
			case 24:
				{
				alt13=6;
				}
				break;
			case 23:
				{
				alt13=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:74:17: 'String'
					{
					match(input,29,FOLLOW_29_in_dataType595); 
					 type = Value.STRING; 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:75:17: 'Integer'
					{
					match(input,25,FOLLOW_25_in_dataType630); 
					 type = Value.INTEGER; 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:76:17: 'Score'
					{
					match(input,28,FOLLOW_28_in_dataType664); 
					 type = Value.SCORE; 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:77:17: 'Part'
					{
					match(input,26,FOLLOW_26_in_dataType700); 
					 type = Value.PART; 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:17: 'Phrase'
					{
					match(input,27,FOLLOW_27_in_dataType737); 
					 type = Value.PHRASE; 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:79:17: 'Function'
					{
					match(input,24,FOLLOW_24_in_dataType772); 
					 type = Value.FUNCTION; 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:80:17: 'Double'
					{
					match(input,23,FOLLOW_23_in_dataType805); 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:83:1: formalParamList returns [ArgList ast] : dataType v1= VAR ( ',' dataType v2= VAR )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:2: ( dataType v1= VAR ( ',' dataType v2= VAR )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:4: dataType v1= VAR ( ',' dataType v2= VAR )*
			{
			pushFollow(FOLLOW_dataType_in_formalParamList844);
			dataType();
			state._fsp--;

			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList848); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:64: ( ',' dataType v2= VAR )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==15) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:65: ',' dataType v2= VAR
					{
					match(input,15,FOLLOW_15_in_formalParamList852); 
					pushFollow(FOLLOW_dataType_in_formalParamList854);
					dataType();
					state._fsp--;

					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList858); 
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:87:1: actualParamList returns [ArgList ast] : (e1= exp ( ',' e2= exp )* |v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )* );
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;
		Expr e1 =null;
		Expr e2 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:2: (e1= exp ( ',' e2= exp )* |v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )* )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==DOUBLE||(LA17_0 >= NUM && LA17_0 <= STRING)||LA17_0==11||LA17_0==16) ) {
				alt17=1;
			}
			else if ( (LA17_0==VAR) ) {
				int LA17_2 = input.LA(2);
				if ( ((LA17_2 >= 11 && LA17_2 <= 16)||LA17_2==18||LA17_2==20||LA17_2==22) ) {
					alt17=1;
				}
				else if ( (LA17_2==17) ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:4: e1= exp ( ',' e2= exp )*
					{
					pushFollow(FOLLOW_exp_in_actualParamList881);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:90:19: ( ',' e2= exp )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==15) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:90:20: ',' e2= exp
							{
							match(input,15,FOLLOW_15_in_actualParamList886); 
							pushFollow(FOLLOW_exp_in_actualParamList890);
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
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:91:17: v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )*
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList915); 
					match(input,17,FOLLOW_17_in_actualParamList917); 
					pushFollow(FOLLOW_exp_in_actualParamList921);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                    ast.addKeyword((v1!=null?v1.getText():null));
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:94:19: ( ',' v2= VAR '->' e2= exp )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==15) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:94:20: ',' v2= VAR '->' e2= exp
							{
							match(input,15,FOLLOW_15_in_actualParamList926); 
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList930); 
							match(input,17,FOLLOW_17_in_actualParamList932); 
							pushFollow(FOLLOW_exp_in_actualParamList936);
							e2=exp();
							state._fsp--;


							                    ast.addAST(e2);
							                    ast.addKeyword((v2!=null?v2.getText():null));
							                
							}
							break;

						default :
							break loop16;
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:1: exp returns [Expr ast] : relexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr relexp14 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:2: ( relexp )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp956);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:104:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:105:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:105:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp982);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:106:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==22) ) {
					alt18=1;
				}
				else if ( (LA18_0==20) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:107:4: ( '==' e2= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:107:4: ( '==' e2= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:107:5: '==' e2= addexp
					{
					match(input,22,FOLLOW_22_in_relexp995); 
					pushFollow(FOLLOW_addexp_in_relexp999);
					e2=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:108:4: ( '<=' e3= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:108:4: ( '<=' e3= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:108:5: '<=' e3= addexp
					{
					match(input,20,FOLLOW_20_in_relexp1009); 
					pushFollow(FOLLOW_addexp_in_relexp1013);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:112:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:113:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:113:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp1038);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:114:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop19:
			while (true) {
				int alt19=3;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==16) ) {
					int LA19_21 = input.LA(2);
					if ( (LA19_21==DOUBLE||(LA19_21 >= NUM && LA19_21 <= VAR)||LA19_21==11||LA19_21==16) ) {
						alt19=2;
					}

				}
				else if ( (LA19_0==14) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:115:4: ( '+' e2= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:115:4: ( '+' e2= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:115:5: '+' e2= mulexp
					{
					match(input,14,FOLLOW_14_in_addexp1050); 
					pushFollow(FOLLOW_mulexp_in_addexp1054);
					e2=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:116:4: ( '-' e3= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:116:4: ( '-' e3= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:116:5: '-' e3= mulexp
					{
					match(input,16,FOLLOW_16_in_addexp1064); 
					pushFollow(FOLLOW_mulexp_in_addexp1068);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:120:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:121:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:121:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp1094);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:122:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==13) ) {
					alt20=1;
				}
				else if ( (LA20_0==18) ) {
					alt20=2;
				}

				switch (alt20) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:123:4: ( '*' e2= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:123:4: ( '*' e2= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:123:5: '*' e2= atom
					{
					match(input,13,FOLLOW_13_in_mulexp1106); 
					pushFollow(FOLLOW_atom_in_mulexp1110);
					e2=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:124:4: ( '/' e3= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:124:4: ( '/' e3= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:124:5: '/' e3= atom
					{
					match(input,18,FOLLOW_18_in_mulexp1120); 
					pushFollow(FOLLOW_atom_in_mulexp1124);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:128:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | DOUBLE | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR16=null;
		Token NUM17=null;
		Token NUM18=null;
		Token DOUBLE19=null;
		Token VAR20=null;
		Token VAR21=null;
		Token STRING22=null;
		ArgList l =null;
		Expr exp15 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:129:2: ( '(' exp ')' | VAR | NUM | '-' NUM | DOUBLE | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING )
			int alt21=8;
			alt21 = dfa21.predict(input);
			switch (alt21) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:129:4: '(' exp ')'
					{
					match(input,11,FOLLOW_11_in_atom1148); 
					pushFollow(FOLLOW_exp_in_atom1150);
					exp15=exp();
					state._fsp--;

					match(input,12,FOLLOW_12_in_atom1152); 
					 ast = new ParenExpr(exp15); 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:130:4: VAR
					{
					VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_atom1164); 
					 ast = new VarExpr((VAR16!=null?VAR16.getText():null)); 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:131:4: NUM
					{
					NUM17=(Token)match(input,NUM,FOLLOW_NUM_in_atom1174); 
					 ast = new NumExpr((NUM17!=null?NUM17.getText():null)); 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:132:4: '-' NUM
					{
					match(input,16,FOLLOW_16_in_atom1184); 
					NUM18=(Token)match(input,NUM,FOLLOW_NUM_in_atom1186); 
					 ast = new NumExpr('-' + (NUM18!=null?NUM18.getText():null)); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:133:4: DOUBLE
					{
					DOUBLE19=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1196); 
					 ast = new DoubleExpr((DOUBLE19!=null?DOUBLE19.getText():null)); 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:134:4: VAR '(' ')'
					{
					VAR20=(Token)match(input,VAR,FOLLOW_VAR_in_atom1206); 
					match(input,11,FOLLOW_11_in_atom1208); 
					match(input,12,FOLLOW_12_in_atom1210); 
					 ast = new CallExpr((VAR20!=null?VAR20.getText():null));
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:135:4: VAR '(' l= actualParamList ')'
					{
					VAR21=(Token)match(input,VAR,FOLLOW_VAR_in_atom1219); 
					match(input,11,FOLLOW_11_in_atom1221); 
					pushFollow(FOLLOW_actualParamList_in_atom1225);
					l=actualParamList();
					state._fsp--;

					match(input,12,FOLLOW_12_in_atom1227); 
					 ast = new CallExpr((VAR21!=null?VAR21.getText():null),l); 
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:136:17: STRING
					{
					STRING22=(Token)match(input,STRING,FOLLOW_STRING_in_atom1248); 
					 
					                    String s = (STRING22!=null?STRING22.getText():null);

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


	protected DFA12 dfa12 = new DFA12(this);
	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA12_eotS =
		"\u0111\uffff";
	static final String DFA12_eofS =
		"\16\uffff\1\36\1\uffff\7\60\2\uffff\1\30\u00f7\uffff";
	static final String DFA12_minS =
		"\11\11\4\uffff\1\13\1\5\1\13\7\11\1\5\1\uffff\1\11\23\uffff\2\14\21\uffff"+
		"\1\14\21\uffff\1\14\21\uffff\1\14\21\uffff\1\14\21\uffff\1\14\21\uffff"+
		"\1\14\30\uffff\1\5\135\uffff";
	static final String DFA12_maxS =
		"\1\44\10\11\4\uffff\1\13\1\44\1\13\7\44\1\20\1\uffff\1\44\23\uffff\2\35"+
		"\21\uffff\1\35\21\uffff\1\35\21\uffff\1\35\21\uffff\1\35\21\uffff\1\35"+
		"\21\uffff\1\35\30\uffff\1\20\135\uffff";
	static final String DFA12_acceptS =
		"\11\uffff\1\7\1\10\1\11\1\12\13\uffff\1\15\5\uffff\1\16\20\uffff\1\5\1"+
		"\6\173\uffff\1\13\1\14\34\uffff\1\1\1\3\6\uffff\1\2\1\4\66\uffff\7\15";
	static final String DFA12_specialS =
		"\u0111\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\15\15\uffff\1\10\1\7\1\3\1\5\1\6\1\4\1\2\1\11\1\12\1\13\1\14\1\16"+
			"\1\uffff\1\1",
			"\1\17",
			"\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"",
			"",
			"",
			"",
			"\1\27",
			"\1\30\1\uffff\2\30\1\31\1\uffff\1\30\4\uffff\1\30\2\uffff\1\36\3\uffff"+
			"\14\36\1\uffff\1\36",
			"\1\55",
			"\1\60\1\uffff\1\56\7\uffff\1\60\1\uffff\1\57\1\uffff\14\60\1\uffff\1"+
			"\60",
			"\1\60\1\uffff\1\100\7\uffff\1\60\1\uffff\1\57\1\uffff\14\60\1\uffff"+
			"\1\60",
			"\1\60\1\uffff\1\122\7\uffff\1\60\1\uffff\1\57\1\uffff\14\60\1\uffff"+
			"\1\60",
			"\1\60\1\uffff\1\144\7\uffff\1\60\1\uffff\1\57\1\uffff\14\60\1\uffff"+
			"\1\60",
			"\1\60\1\uffff\1\166\7\uffff\1\60\1\uffff\1\57\1\uffff\14\60\1\uffff"+
			"\1\60",
			"\1\60\1\uffff\1\u0088\7\uffff\1\60\1\uffff\1\57\1\uffff\14\60\1\uffff"+
			"\1\60",
			"\1\60\1\uffff\1\u009a\7\uffff\1\60\1\uffff\1\57\1\uffff\14\60\1\uffff"+
			"\1\60",
			"\1\u00ad\1\uffff\3\u00ad\1\uffff\1\u00ad\1\u00ac\3\uffff\1\u00ad",
			"",
			"\1\30\1\uffff\1\u00b3\1\uffff\2\30\1\uffff\1\30\1\uffff\3\30\1\uffff"+
			"\15\30\1\uffff\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00ca\12\uffff\7\u00cb",
			"\1\u00d2\12\uffff\7\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d2\12\uffff\7\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d2\12\uffff\7\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d2\12\uffff\7\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d2\12\uffff\7\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d2\12\uffff\7\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d2\12\uffff\7\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u010f\1\uffff\1\u010d\1\u0110\1\u010c\1\uffff\1\u010b\1\u010a\3\uffff"+
			"\1\u010e",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ( ';' )? |dt= dataType VAR ( ';' )? | 'add note' instr= exp rhy= exp 'to' phr= VAR ( ';' )? | 'generate' ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? );";
		}
	}

	static final String DFA21_eotS =
		"\124\uffff";
	static final String DFA21_eofS =
		"\2\uffff\1\10\121\uffff";
	static final String DFA21_minS =
		"\1\5\1\uffff\1\5\4\uffff\1\5\35\uffff\1\5\1\13\1\14\1\7\2\14\51\uffff";
	static final String DFA21_maxS =
		"\1\20\1\uffff\1\44\4\uffff\1\20\35\uffff\1\20\2\26\1\7\2\26\51\uffff";
	static final String DFA21_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\10\1\uffff\1\2\33\uffff\1\6\6\uffff"+
		"\7\2\1\7\6\2\1\uffff\7\2\1\uffff\10\2\1\uffff\7\2\1\uffff\1\2";
	static final String DFA21_specialS =
		"\124\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\5\1\uffff\1\3\1\6\1\2\1\uffff\1\1\4\uffff\1\4",
			"",
			"\1\10\1\uffff\3\10\1\uffff\1\7\5\10\1\uffff\3\10\1\uffff\17\10",
			"",
			"",
			"",
			"",
			"\1\51\1\uffff\1\47\1\52\1\46\1\uffff\1\45\1\44\3\uffff\1\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57\1\uffff\1\55\1\60\1\54\1\uffff\1\53\4\uffff\1\56",
			"\1\61\1\72\1\63\1\65\1\62\1\66\1\62\1\64\1\uffff\1\70\1\uffff\1\67",
			"\1\102\1\73\1\75\1\62\1\76\1\uffff\1\74\1\uffff\1\100\1\uffff\1\77",
			"\1\103",
			"\1\113\1\104\1\106\1\62\1\107\1\uffff\1\105\1\uffff\1\111\1\uffff\1"+
			"\110",
			"\1\123\1\114\1\116\1\62\1\117\1\uffff\1\115\1\uffff\1\121\1\uffff\1"+
			"\120",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "128:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | DOUBLE | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x00000017FF800202L});
	public static final BitSet FOLLOW_36_in_stmt58 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt60 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt62 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt63 = new BitSet(new long[]{0x00000017FF800200L});
	public static final BitSet FOLLOW_stmt_in_stmt67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt129 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt131 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt133 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt135 = new BitSet(new long[]{0x00000017FF800200L});
	public static final BitSet FOLLOW_stmt_in_stmt139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_stmt178 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt180 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt182 = new BitSet(new long[]{0x000000003F800000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt186 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt188 = new BitSet(new long[]{0x00000017FF800200L});
	public static final BitSet FOLLOW_stmt_in_stmt192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt230 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt232 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt234 = new BitSet(new long[]{0x000000003F800000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt238 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt240 = new BitSet(new long[]{0x00000017FF800200L});
	public static final BitSet FOLLOW_stmt_in_stmt244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt283 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt285 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt287 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_stmt289 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt330 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt332 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt372 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_stmt376 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_stmt380 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_stmt382 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt386 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_stmt427 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stmt472 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_stmt474 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_stmt488 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_stmt490 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt504 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt506 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt508 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt521 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt523 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_actualParamList_in_stmt527 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stmt529 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_stmt540 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_stmt542 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_stmt555 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_dataType595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_dataType630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_dataType664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_dataType700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_dataType737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_dataType772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_dataType805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_formalParamList844 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_formalParamList848 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_formalParamList852 = new BitSet(new long[]{0x000000003F800000L});
	public static final BitSet FOLLOW_dataType_in_formalParamList854 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_formalParamList858 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_exp_in_actualParamList881 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_actualParamList886 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_actualParamList890 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_VAR_in_actualParamList915 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_actualParamList917 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_actualParamList921 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_actualParamList926 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_VAR_in_actualParamList930 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_actualParamList932 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_actualParamList936 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_relexp_in_exp956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp982 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_22_in_relexp995 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_addexp_in_relexp999 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_20_in_relexp1009 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_addexp_in_relexp1013 = new BitSet(new long[]{0x0000000000500002L});
	public static final BitSet FOLLOW_mulexp_in_addexp1038 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_14_in_addexp1050 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_mulexp_in_addexp1054 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_16_in_addexp1064 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_mulexp_in_addexp1068 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_atom_in_mulexp1094 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_13_in_mulexp1106 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_atom_in_mulexp1110 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_18_in_mulexp1120 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_atom_in_mulexp1124 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_11_in_atom1148 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_exp_in_atom1150 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom1184 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NUM_in_atom1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_atom1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1206 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom1208 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1219 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom1221 = new BitSet(new long[]{0x0000000000010BA0L});
	public static final BitSet FOLLOW_actualParamList_in_atom1225 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1248 = new BitSet(new long[]{0x0000000000000002L});
}
