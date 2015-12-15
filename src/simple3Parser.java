// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-14 22:54:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", 
		"VAR", "WS", "';'", "'='", "'declare'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:36: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:37: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog46);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:27:1: stmt returns [Stmt ast] : 'declare' VAR '=' exp ( ';' )? ;
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token VAR2=null;
		Expr exp3 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:2: ( 'declare' VAR '=' exp ( ';' )? )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:4: 'declare' VAR '=' exp ( ';' )?
			{
			match(input,12,FOLLOW_12_in_stmt65); 
			VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_stmt67); 
			match(input,11,FOLLOW_11_in_stmt69); 
			pushFollow(FOLLOW_exp_in_stmt71);
			exp3=exp();
			state._fsp--;

			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:26: ( ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==10) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:28:26: ';'
					{
					match(input,10,FOLLOW_10_in_stmt73); 
					}
					break;

			}

			 ast = new VarDeclStmt((VAR2!=null?VAR2.getText():null),exp3); 
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



	// $ANTLR start "exp"
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:31:1: exp returns [Expr ast] : e1= atom ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:32:2: (e1= atom )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:32:4: e1= atom
			{
			pushFollow(FOLLOW_atom_in_exp98);
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
	// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:35:1: atom returns [Expr ast] : VAR ;
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR4=null;

		try {
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:9: ( VAR )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:36:17: VAR
			{
			VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_atom159); 
			 ast = new VarExpr((VAR4!=null?VAR4.getText():null)); 
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



	public static final BitSet FOLLOW_stmt_in_prog46 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_stmt65 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt67 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_stmt69 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_exp_in_stmt71 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_stmt73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_exp98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom159 = new BitSet(new long[]{0x0000000000000002L});
}
