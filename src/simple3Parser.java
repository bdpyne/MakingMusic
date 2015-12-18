// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-18 14:39:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "FUNCTION", 
		"NUM", "PART", "PHRASE", "SCORE", "STRING", "String", "VAR", "WS", "'('", 
		"')'", "'*'", "'+'", "','", "'-'", "'->'", "'/'", "';'", "'<='", "'='", 
		"'=='", "'Function'", "'Integer'", "'Part'", "'Phrase'", "'Score'", "'String'", 
		"'create song '", "'else'", "'generate'", "'get'", "'if'", "'on'", "'play'", 
		"'put'", "'return'", "'void'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int COMMENT=4;
	public static final int ESC_SEQ=5;
	public static final int FUNCTION=6;
	public static final int NUM=7;
	public static final int PART=8;
	public static final int PHRASE=9;
	public static final int SCORE=10;
	public static final int STRING=11;
	public static final int String=12;
	public static final int VAR=13;
	public static final int WS=14;

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
				if ( (LA1_0==VAR||(LA1_0 >= 27 && LA1_0 <= 33)||(LA1_0 >= 35 && LA1_0 <= 37)||(LA1_0 >= 39 && LA1_0 <= 44)) ) {
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ';' |dt= dataType VAR ';' | 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | 'Part' exp ( ';' )? | 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token ntype=null;
		Token VAR2=null;
		Token VAR3=null;
		Token VAR4=null;
		Token VAR5=null;
		Token VAR6=null;
		Token VAR8=null;
		Token STRING9=null;
		Token VAR11=null;
		Token VAR13=null;
		Token VAR15=null;
		Token VAR16=null;
		Stmt s =null;
		int dt =0;
		ArgList l =null;
		Expr num =null;
		Expr instr =null;
		Stmt s1 =null;
		Stmt s2 =null;
		Expr exp7 =null;
		Expr exp10 =null;
		Expr exp12 =null;
		Expr exp14 =null;
		Expr exp17 =null;
		Expr exp18 =null;
		Expr exp19 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:2: ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ';' |dt= dataType VAR ';' | 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | 'Part' exp ( ';' )? | 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' )
			int alt15=20;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:4: 'void' VAR '(' ')' s= stmt
					{
					match(input,42,FOLLOW_42_in_stmt58); 
					VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_stmt60); 
					match(input,15,FOLLOW_15_in_stmt62); 
					match(input,16,FOLLOW_16_in_stmt63); 
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
					match(input,15,FOLLOW_15_in_stmt133); 
					match(input,16,FOLLOW_16_in_stmt135); 
					pushFollow(FOLLOW_stmt_in_stmt139);
					s=stmt();
					state._fsp--;

					 
					                    ast = new FuncDeclStmt((VAR3!=null?VAR3.getText():null),new Function(dt,new ArgList(),s));
					                
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:17: 'void' VAR '(' l= formalParamList ')' s= stmt
					{
					match(input,42,FOLLOW_42_in_stmt178); 
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt180); 
					match(input,15,FOLLOW_15_in_stmt182); 
					pushFollow(FOLLOW_formalParamList_in_stmt186);
					l=formalParamList();
					state._fsp--;

					match(input,16,FOLLOW_16_in_stmt188); 
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
					match(input,15,FOLLOW_15_in_stmt234); 
					pushFollow(FOLLOW_formalParamList_in_stmt238);
					l=formalParamList();
					state._fsp--;

					match(input,16,FOLLOW_16_in_stmt240); 
					pushFollow(FOLLOW_stmt_in_stmt244);
					s=stmt();
					state._fsp--;

					 
					                    ast = new FuncDeclStmt((VAR5!=null?VAR5.getText():null),new Function(dt,l,s)); 
					                
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:17: dt= dataType VAR '=' exp ';'
					{
					pushFollow(FOLLOW_dataType_in_stmt283);
					dt=dataType();
					state._fsp--;

					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_stmt285); 
					match(input,25,FOLLOW_25_in_stmt287); 
					pushFollow(FOLLOW_exp_in_stmt289);
					exp7=exp();
					state._fsp--;

					match(input,23,FOLLOW_23_in_stmt291); 
					 
					                    ast = new VarDeclStmt(dt,(VAR6!=null?VAR6.getText():null),exp7); 
					                
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:17: dt= dataType VAR ';'
					{
					pushFollow(FOLLOW_dataType_in_stmt329);
					dt=dataType();
					state._fsp--;

					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_stmt331); 
					match(input,23,FOLLOW_23_in_stmt333); 
					 
					                    ast = new VarDeclStmt(dt,(VAR8!=null?VAR8.getText():null),new ConstExpr(new IntConst("0"))); 
					                
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:17: 'create song ' STRING ( ';' )?
					{
					match(input,33,FOLLOW_33_in_stmt370); 
					STRING9=(Token)match(input,STRING,FOLLOW_STRING_in_stmt372); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:39: ( ';' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==23) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:52:39: ';'
							{
							match(input,23,FOLLOW_23_in_stmt374); 
							}
							break;

					}

					 ast = new CreateSongStmt((STRING9!=null?STRING9.getText():null)); 
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:53:17: 'generate' ( ';' )?
					{
					match(input,35,FOLLOW_35_in_stmt416); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:53:28: ( ';' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==23) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:53:28: ';'
							{
							match(input,23,FOLLOW_23_in_stmt418); 
							}
							break;

					}

					 ast = new GenerateStmt(); 
					}
					break;
				case 9 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:54:17: 'Part' exp ( ';' )?
					{
					match(input,29,FOLLOW_29_in_stmt471); 
					pushFollow(FOLLOW_exp_in_stmt473);
					exp10=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:54:28: ( ';' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==23) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:54:28: ';'
							{
							match(input,23,FOLLOW_23_in_stmt475); 
							}
							break;

					}

					 ast = new PartStmt(exp10); 
					}
					break;
				case 10 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:55:17: 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )?
					{
					match(input,39,FOLLOW_39_in_stmt529); 
					pushFollow(FOLLOW_exp_in_stmt533);
					num=exp();
					state._fsp--;

					ntype=(Token)match(input,VAR,FOLLOW_VAR_in_stmt537); 
					match(input,38,FOLLOW_38_in_stmt539); 
					pushFollow(FOLLOW_exp_in_stmt543);
					instr=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:55:57: ( ';' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==23) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:55:57: ';'
							{
							match(input,23,FOLLOW_23_in_stmt545); 
							}
							break;

					}

					 ast = new PhraseStmt(num, (ntype!=null?ntype.getText():null), instr); 
					}
					break;
				case 11 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:56:4: VAR '=' exp ( ';' )?
					{
					VAR11=(Token)match(input,VAR,FOLLOW_VAR_in_stmt556); 
					match(input,25,FOLLOW_25_in_stmt558); 
					pushFollow(FOLLOW_exp_in_stmt560);
					exp12=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:56:16: ( ';' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==23) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:56:16: ';'
							{
							match(input,23,FOLLOW_23_in_stmt562); 
							}
							break;

					}

					 ast = new AssignStmt((VAR11!=null?VAR11.getText():null),exp12); 
					}
					break;
				case 12 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:4: 'get' VAR ( ';' )?
					{
					match(input,36,FOLLOW_36_in_stmt573); 
					VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_stmt575); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:14: ( ';' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==23) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:57:14: ';'
							{
							match(input,23,FOLLOW_23_in_stmt577); 
							}
							break;

					}

					 ast = new GetStmt((VAR13!=null?VAR13.getText():null)); 
					}
					break;
				case 13 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:4: 'put' exp ( ';' )?
					{
					match(input,40,FOLLOW_40_in_stmt589); 
					pushFollow(FOLLOW_exp_in_stmt591);
					exp14=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:14: ( ';' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==23) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:58:14: ';'
							{
							match(input,23,FOLLOW_23_in_stmt593); 
							}
							break;

					}

					 ast = new PutStmt(exp14); 
					}
					break;
				case 14 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:4: VAR '(' ')' ( ';' )?
					{
					VAR15=(Token)match(input,VAR,FOLLOW_VAR_in_stmt605); 
					match(input,15,FOLLOW_15_in_stmt607); 
					match(input,16,FOLLOW_16_in_stmt609); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:16: ( ';' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==23) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:59:16: ';'
							{
							match(input,23,FOLLOW_23_in_stmt611); 
							}
							break;

					}

					 ast = new CallStmt((VAR15!=null?VAR15.getText():null));
					}
					break;
				case 15 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:4: VAR '(' l= actualParamList ')' ( ';' )?
					{
					VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_stmt622); 
					match(input,15,FOLLOW_15_in_stmt624); 
					pushFollow(FOLLOW_actualParamList_in_stmt628);
					l=actualParamList();
					state._fsp--;

					match(input,16,FOLLOW_16_in_stmt630); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:34: ( ';' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==23) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:60:34: ';'
							{
							match(input,23,FOLLOW_23_in_stmt632); 
							}
							break;

					}

					 ast = new CallStmt((VAR16!=null?VAR16.getText():null),l);
					}
					break;
				case 16 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:4: 'return' exp ( ';' )?
					{
					match(input,41,FOLLOW_41_in_stmt641); 
					pushFollow(FOLLOW_exp_in_stmt643);
					exp17=exp();
					state._fsp--;

					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:17: ( ';' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==23) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:61:17: ';'
							{
							match(input,23,FOLLOW_23_in_stmt645); 
							}
							break;

					}

					 ast = new ReturnStmt(exp17); 
					}
					break;
				case 17 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:4: 'return' ( ';' )?
					{
					match(input,41,FOLLOW_41_in_stmt656); 
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:13: ( ';' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==23) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:62:13: ';'
							{
							match(input,23,FOLLOW_23_in_stmt658); 
							}
							break;

					}

					 ast = new ReturnStmt(); 
					}
					break;
				case 18 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:63:4: 'while' '(' exp ')' s= stmt
					{
					match(input,43,FOLLOW_43_in_stmt670); 
					match(input,15,FOLLOW_15_in_stmt672); 
					pushFollow(FOLLOW_exp_in_stmt674);
					exp18=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_stmt676); 
					pushFollow(FOLLOW_stmt_in_stmt680);
					s=stmt();
					state._fsp--;

					 ast = new WhileStmt(exp18,s); 
					}
					break;
				case 19 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,37,FOLLOW_37_in_stmt689); 
					match(input,15,FOLLOW_15_in_stmt691); 
					pushFollow(FOLLOW_exp_in_stmt693);
					exp19=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_stmt695); 
					pushFollow(FOLLOW_stmt_in_stmt699);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp19,s1);
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:67: ( 'else' s2= stmt )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==34) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:64:68: 'else' s2= stmt
							{
							match(input,34,FOLLOW_34_in_stmt703); 
							pushFollow(FOLLOW_stmt_in_stmt707);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 20 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:4: '{' (s= stmt )+ '}'
					{
					match(input,44,FOLLOW_44_in_stmt718); 
					ast = new BlockStmt();
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:34: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==VAR||(LA14_0 >= 27 && LA14_0 <= 33)||(LA14_0 >= 35 && LA14_0 <= 37)||(LA14_0 >= 39 && LA14_0 <= 44)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:65:35: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt725);
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

					match(input,45,FOLLOW_45_in_stmt731); 
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
			int alt16=6;
			switch ( input.LA(1) ) {
			case 32:
				{
				alt16=1;
				}
				break;
			case 28:
				{
				alt16=2;
				}
				break;
			case 31:
				{
				alt16=3;
				}
				break;
			case 29:
				{
				alt16=4;
				}
				break;
			case 30:
				{
				alt16=5;
				}
				break;
			case 27:
				{
				alt16=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:69:17: 'String'
					{
					match(input,32,FOLLOW_32_in_dataType759); 
					 type = Value.STRING; 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:70:17: 'Integer'
					{
					match(input,28,FOLLOW_28_in_dataType794); 
					 type = Value.INTEGER; 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:71:17: 'Score'
					{
					match(input,31,FOLLOW_31_in_dataType828); 
					 type = Value.SCORE; 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:72:17: 'Part'
					{
					match(input,29,FOLLOW_29_in_dataType864); 
					 type = Value.PART; 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:73:17: 'Phrase'
					{
					match(input,30,FOLLOW_30_in_dataType901); 
					 type = Value.PHRASE; 
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:74:17: 'Function'
					{
					match(input,27,FOLLOW_27_in_dataType936); 
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
			pushFollow(FOLLOW_dataType_in_formalParamList973);
			dataType();
			state._fsp--;

			v1=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList977); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:64: ( ',' dataType v2= VAR )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==19) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:78:65: ',' dataType v2= VAR
					{
					match(input,19,FOLLOW_19_in_formalParamList981); 
					pushFollow(FOLLOW_dataType_in_formalParamList983);
					dataType();
					state._fsp--;

					v2=(Token)match(input,VAR,FOLLOW_VAR_in_formalParamList987); 
					ast.addAST(new VarExpr((v2!=null?v2.getText():null)));
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
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= NUM && LA20_0 <= String)||LA20_0==15||LA20_0==20) ) {
				alt20=1;
			}
			else if ( (LA20_0==VAR) ) {
				int LA20_2 = input.LA(2);
				if ( ((LA20_2 >= 15 && LA20_2 <= 20)||LA20_2==22||LA20_2==24||LA20_2==26) ) {
					alt20=1;
				}
				else if ( (LA20_2==21) ) {
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:82:4: e1= exp ( ',' e2= exp )*
					{
					pushFollow(FOLLOW_exp_in_actualParamList1010);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:19: ( ',' e2= exp )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==19) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:84:20: ',' e2= exp
							{
							match(input,19,FOLLOW_19_in_actualParamList1015); 
							pushFollow(FOLLOW_exp_in_actualParamList1019);
							e2=exp();
							state._fsp--;

							ast.addAST(e2);
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:85:17: v1= VAR '->' e1= exp ( ',' v2= VAR '->' e2= exp )*
					{
					v1=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList1044); 
					match(input,21,FOLLOW_21_in_actualParamList1046); 
					pushFollow(FOLLOW_exp_in_actualParamList1050);
					e1=exp();
					state._fsp--;


					                    ast = new ArgList(e1);
					                    ast.addKeyword((v1!=null?v1.getText():null));
					                
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:19: ( ',' v2= VAR '->' e2= exp )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==19) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:88:20: ',' v2= VAR '->' e2= exp
							{
							match(input,19,FOLLOW_19_in_actualParamList1055); 
							v2=(Token)match(input,VAR,FOLLOW_VAR_in_actualParamList1059); 
							match(input,21,FOLLOW_21_in_actualParamList1061); 
							pushFollow(FOLLOW_exp_in_actualParamList1065);
							e2=exp();
							state._fsp--;


							                    ast.addAST(e2);
							                    ast.addKeyword((v2!=null?v2.getText():null));
							                
							}
							break;

						default :
							break loop19;
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


		Expr relexp20 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:95:2: ( relexp )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:95:4: relexp
			{
			pushFollow(FOLLOW_relexp_in_exp1085);
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
			pushFollow(FOLLOW_addexp_in_relexp1111);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop21:
			while (true) {
				int alt21=3;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==26) ) {
					alt21=1;
				}
				else if ( (LA21_0==24) ) {
					alt21=2;
				}

				switch (alt21) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:4: ( '==' e2= addexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:4: ( '==' e2= addexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:5: '==' e2= addexp
					{
					match(input,26,FOLLOW_26_in_relexp1124); 
					pushFollow(FOLLOW_addexp_in_relexp1128);
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
					match(input,24,FOLLOW_24_in_relexp1138); 
					pushFollow(FOLLOW_addexp_in_relexp1142);
					e3=addexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.LESSEQ,ast,e3); 
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
			pushFollow(FOLLOW_mulexp_in_addexp1167);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:108:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop22:
			while (true) {
				int alt22=3;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==18) ) {
					alt22=1;
				}
				else if ( (LA22_0==20) ) {
					alt22=2;
				}

				switch (alt22) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:109:4: ( '+' e2= mulexp )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:109:4: ( '+' e2= mulexp )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:109:5: '+' e2= mulexp
					{
					match(input,18,FOLLOW_18_in_addexp1179); 
					pushFollow(FOLLOW_mulexp_in_addexp1183);
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
					match(input,20,FOLLOW_20_in_addexp1193); 
					pushFollow(FOLLOW_mulexp_in_addexp1197);
					e3=mulexp();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.MINUS,ast,e3); 
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
			pushFollow(FOLLOW_atom_in_mulexp1223);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:116:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==17) ) {
					alt23=1;
				}
				else if ( (LA23_0==22) ) {
					alt23=2;
				}

				switch (alt23) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:117:4: ( '*' e2= atom )
					{
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:117:4: ( '*' e2= atom )
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:117:5: '*' e2= atom
					{
					match(input,17,FOLLOW_17_in_mulexp1235); 
					pushFollow(FOLLOW_atom_in_mulexp1239);
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
					match(input,22,FOLLOW_22_in_mulexp1249); 
					pushFollow(FOLLOW_atom_in_mulexp1253);
					e3=atom();
					state._fsp--;

					 ast = new BinopExpr(BinopExpr.DIV,ast,e3); 
					}

					}
					break;

				default :
					break loop23;
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:122:1: atom returns [Expr ast] : ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING | String | SCORE | PART | PHRASE );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR22=null;
		Token NUM23=null;
		Token NUM24=null;
		Token VAR25=null;
		Token VAR26=null;
		Token STRING27=null;
		Token String28=null;
		Token SCORE29=null;
		Token PART30=null;
		Token PHRASE31=null;
		ArgList l =null;
		Expr exp21 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:123:2: ( '(' exp ')' | VAR | NUM | '-' NUM | VAR '(' ')' | VAR '(' l= actualParamList ')' | STRING | String | SCORE | PART | PHRASE )
			int alt24=11;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt24=1;
				}
				break;
			case VAR:
				{
				int LA24_2 = input.LA(2);
				if ( (LA24_2==15) ) {
					int LA24_10 = input.LA(3);
					if ( (LA24_10==16) ) {
						alt24=5;
					}
					else if ( ((LA24_10 >= NUM && LA24_10 <= VAR)||LA24_10==15||LA24_10==20) ) {
						alt24=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 24, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA24_2==EOF||LA24_2==VAR||(LA24_2 >= 16 && LA24_2 <= 20)||(LA24_2 >= 22 && LA24_2 <= 24)||(LA24_2 >= 26 && LA24_2 <= 37)||(LA24_2 >= 39 && LA24_2 <= 45)) ) {
					alt24=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NUM:
				{
				alt24=3;
				}
				break;
			case 20:
				{
				alt24=4;
				}
				break;
			case STRING:
				{
				alt24=7;
				}
				break;
			case String:
				{
				alt24=8;
				}
				break;
			case SCORE:
				{
				alt24=9;
				}
				break;
			case PART:
				{
				alt24=10;
				}
				break;
			case PHRASE:
				{
				alt24=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:123:4: '(' exp ')'
					{
					match(input,15,FOLLOW_15_in_atom1277); 
					pushFollow(FOLLOW_exp_in_atom1279);
					exp21=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1281); 
					 ast = new ParenExpr(exp21); 
					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:124:4: VAR
					{
					VAR22=(Token)match(input,VAR,FOLLOW_VAR_in_atom1293); 
					 ast = new VarExpr((VAR22!=null?VAR22.getText():null)); 
					}
					break;
				case 3 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:125:4: NUM
					{
					NUM23=(Token)match(input,NUM,FOLLOW_NUM_in_atom1303); 
					 ast = new NumExpr((NUM23!=null?NUM23.getText():null)); 
					}
					break;
				case 4 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:126:4: '-' NUM
					{
					match(input,20,FOLLOW_20_in_atom1313); 
					NUM24=(Token)match(input,NUM,FOLLOW_NUM_in_atom1315); 
					 ast = new NumExpr('-' + (NUM24!=null?NUM24.getText():null)); 
					}
					break;
				case 5 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:127:4: VAR '(' ')'
					{
					VAR25=(Token)match(input,VAR,FOLLOW_VAR_in_atom1325); 
					match(input,15,FOLLOW_15_in_atom1327); 
					match(input,16,FOLLOW_16_in_atom1329); 
					 ast = new CallExpr((VAR25!=null?VAR25.getText():null));
					}
					break;
				case 6 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:128:4: VAR '(' l= actualParamList ')'
					{
					VAR26=(Token)match(input,VAR,FOLLOW_VAR_in_atom1338); 
					match(input,15,FOLLOW_15_in_atom1340); 
					pushFollow(FOLLOW_actualParamList_in_atom1344);
					l=actualParamList();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1346); 
					 ast = new CallExpr((VAR26!=null?VAR26.getText():null),l); 
					}
					break;
				case 7 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:129:17: STRING
					{
					STRING27=(Token)match(input,STRING,FOLLOW_STRING_in_atom1367); 
					 
					                    String s = (STRING27!=null?STRING27.getText():null);
					                    String t = s.substring(1, s.length()-1);
					                    ast = new ConstExpr(new StringConst(t)); 
					                
					}
					break;
				case 8 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:135:17: String
					{
					String28=(Token)match(input,String,FOLLOW_String_in_atom1403); 
					 
					                    String s = (String28!=null?String28.getText():null);
					                    String t = s.substring(1, s.length()-1);
					                    ast = new ConstExpr(new StringConst(t)); 
					                
					}
					break;
				case 9 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:141:17: SCORE
					{
					SCORE29=(Token)match(input,SCORE,FOLLOW_SCORE_in_atom1465); 

					                    ast = new ConstExpr(new ScoreConst((SCORE29!=null?SCORE29.getText():null)));
					                
					}
					break;
				case 10 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:145:17: PART
					{
					PART30=(Token)match(input,PART,FOLLOW_PART_in_atom1501); 

					                    ast = new ConstExpr(new PartConst((PART30!=null?PART30.getText():null)));
					                
					}
					break;
				case 11 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:149:17: PHRASE
					{
					PHRASE31=(Token)match(input,PHRASE,FOLLOW_PHRASE_in_atom1537); 

					                    ast = new ConstExpr(new PhraseConst((PHRASE31!=null?PHRASE31.getText():null)));
					                
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
		"\u00d8\uffff";
	static final String DFA15_eofS =
		"\16\uffff\1\54\7\uffff\1\27\15\uffff\1\43\u00b3\uffff";
	static final String DFA15_minS =
		"\5\15\1\7\2\15\3\uffff\1\17\2\uffff\1\7\3\uffff\4\17\1\15\10\uffff\2\17"+
		"\1\uffff\1\7\1\uffff\1\15\33\uffff\2\20\2\uffff\1\20\2\uffff\1\20\2\uffff"+
		"\1\7\34\uffff\1\20\2\uffff\1\20\14\uffff\1\7\140\uffff";
	static final String DFA15_maxS =
		"\1\54\4\15\1\24\2\15\3\uffff\1\31\2\uffff\1\55\3\uffff\1\17\3\31\1\55"+
		"\10\uffff\2\31\1\uffff\1\24\1\uffff\1\55\33\uffff\2\40\2\uffff\1\40\2"+
		"\uffff\1\40\2\uffff\1\40\34\uffff\1\40\2\uffff\1\40\14\uffff\1\24\140"+
		"\uffff";
	static final String DFA15_acceptS =
		"\10\uffff\1\7\1\10\1\12\1\uffff\1\14\1\15\1\uffff\1\22\1\23\1\24\5\uffff"+
		"\1\11\11\uffff\1\13\1\uffff\1\20\10\uffff\1\21\25\uffff\1\5\1\6\10\uffff"+
		"\1\6\40\uffff\1\16\1\17\45\uffff\1\1\1\3\5\uffff\1\2\1\4\23\uffff\1\2"+
		"\35\uffff\12\20";
	static final String DFA15_specialS =
		"\u00d8\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\13\15\uffff\1\7\1\3\1\5\1\6\1\4\1\2\1\10\1\uffff\1\11\1\14\1\20\1"+
			"\uffff\1\12\1\15\1\16\1\1\1\17\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\6\27\1\26\1\uffff\1\27\4\uffff\1\27",
			"\1\37",
			"\1\40",
			"",
			"",
			"",
			"\1\42\11\uffff\1\41",
			"",
			"",
			"\6\43\1\44\1\uffff\1\43\4\uffff\1\43\2\uffff\1\54\3\uffff\13\54\1\uffff"+
			"\7\54",
			"",
			"",
			"",
			"\1\100",
			"\1\101\7\uffff\1\103\1\uffff\1\102",
			"\1\104\7\uffff\1\103\1\uffff\1\102",
			"\1\107\7\uffff\1\103\1\uffff\1\102",
			"\1\27\1\uffff\1\112\1\uffff\2\27\1\uffff\1\27\1\uffff\1\27\1\114\1\27"+
			"\1\102\14\27\1\uffff\7\27",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\147\7\uffff\1\114\1\uffff\1\102",
			"\1\152\7\uffff\1\114\1\uffff\1\102",
			"",
			"\7\156\1\uffff\1\156\1\155\3\uffff\1\156",
			"",
			"\1\43\1\uffff\1\167\1\uffff\2\43\1\uffff\1\43\1\uffff\3\43\1\54\14\43"+
			"\1\uffff\7\43",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0094\12\uffff\6\u0095",
			"\1\u009b\12\uffff\6\u009c",
			"",
			"",
			"\1\u009b\12\uffff\6\u009c",
			"",
			"",
			"\1\u009b\12\uffff\6\u009c",
			"",
			"",
			"\7\27\1\uffff\1\27\1\u00b0\3\uffff\1\27\6\uffff\6\u009c",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u009b\12\uffff\6\u009c",
			"",
			"",
			"\1\u009b\12\uffff\6\u009c",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d1\1\u00d6\1\u00d7\1\u00d5\1\u00d3\1\u00d4\1\u00d0\1\uffff\1\u00cf"+
			"\1\u00ce\3\uffff\1\u00d2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "27:1: stmt returns [Stmt ast] : ( 'void' VAR '(' ')' s= stmt |dt= dataType VAR '(' ')' s= stmt | 'void' VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '(' l= formalParamList ')' s= stmt |dt= dataType VAR '=' exp ';' |dt= dataType VAR ';' | 'create song ' STRING ( ';' )? | 'generate' ( ';' )? | 'Part' exp ( ';' )? | 'play' num= exp ntype= VAR 'on' instr= exp ( ';' )? | VAR '=' exp ( ';' )? | 'get' VAR ( ';' )? | 'put' exp ( ';' )? | VAR '(' ')' ( ';' )? | VAR '(' l= actualParamList ')' ( ';' )? | 'return' exp ( ';' )? | 'return' ( ';' )? | 'while' '(' exp ')' s= stmt | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | '{' (s= stmt )+ '}' );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog39 = new BitSet(new long[]{0x00001FBBF8002002L});
	public static final BitSet FOLLOW_42_in_stmt58 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt60 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt62 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt63 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt129 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt131 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt133 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt135 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_stmt178 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt180 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt182 = new BitSet(new long[]{0x00000001F8000000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt186 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt188 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt230 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt232 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt234 = new BitSet(new long[]{0x00000001F8000000L});
	public static final BitSet FOLLOW_formalParamList_in_stmt238 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt240 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt283 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt285 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt287 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt289 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_stmt329 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt331 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_stmt370 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_STRING_in_stmt372 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_stmt416 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt471 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt473 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_stmt529 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt533 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt537 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_stmt539 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt543 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt556 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt558 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt560 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_stmt573 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_stmt575 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_stmt589 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt591 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt605 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt607 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt609 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt622 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt624 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_actualParamList_in_stmt628 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt630 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_stmt641 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt643 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_stmt656 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_stmt658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_stmt670 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt672 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt674 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt676 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_stmt689 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt691 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_stmt693 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt695 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt699 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_stmt703 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_stmt718 = new BitSet(new long[]{0x00001FBBF8002000L});
	public static final BitSet FOLLOW_stmt_in_stmt725 = new BitSet(new long[]{0x00003FBBF8002000L});
	public static final BitSet FOLLOW_45_in_stmt731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_dataType759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_dataType794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_dataType828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_dataType864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_dataType901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_dataType936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataType_in_formalParamList973 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_formalParamList977 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_formalParamList981 = new BitSet(new long[]{0x00000001F8000000L});
	public static final BitSet FOLLOW_dataType_in_formalParamList983 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_formalParamList987 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_exp_in_actualParamList1010 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_actualParamList1015 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_actualParamList1019 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_VAR_in_actualParamList1044 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_actualParamList1046 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_actualParamList1050 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_actualParamList1055 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_VAR_in_actualParamList1059 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_actualParamList1061 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_actualParamList1065 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_relexp_in_exp1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp1111 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_relexp1124 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_addexp_in_relexp1128 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_relexp1138 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_addexp_in_relexp1142 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_mulexp_in_addexp1167 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_addexp1179 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_mulexp_in_addexp1183 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_addexp1193 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_mulexp_in_addexp1197 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_atom_in_mulexp1223 = new BitSet(new long[]{0x0000000000420002L});
	public static final BitSet FOLLOW_17_in_mulexp1235 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_atom_in_mulexp1239 = new BitSet(new long[]{0x0000000000420002L});
	public static final BitSet FOLLOW_22_in_mulexp1249 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_atom_in_mulexp1253 = new BitSet(new long[]{0x0000000000420002L});
	public static final BitSet FOLLOW_15_in_atom1277 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_exp_in_atom1279 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_atom1313 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NUM_in_atom1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1325 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom1327 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom1338 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom1340 = new BitSet(new long[]{0x000000000010BF80L});
	public static final BitSet FOLLOW_actualParamList_in_atom1344 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_atom1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCORE_in_atom1465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PART_in_atom1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHRASE_in_atom1537 = new BitSet(new long[]{0x0000000000000002L});
}
