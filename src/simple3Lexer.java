// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-16 22:18:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Lexer extends Lexer {
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
	public static final int COMMENT=4;
	public static final int ESC_SEQ=5;
	public static final int NUM=6;
	public static final int STRING=7;
	public static final int VAR=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public simple3Lexer() {} 
	public simple3Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public simple3Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:2:7: ( '(' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:3:7: ( ')' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:4:7: ( '*' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:5:7: ( '+' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:6:7: ( ',' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:7:7: ( '-' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:8:7: ( '/' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:8:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:9:7: ( ';' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:9:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:10:7: ( '<=' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:10:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:11:7: ( '=' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:11:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:12:7: ( '==' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:12:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:13:7: ( 'create song ' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:13:9: 'create song '
			{
			match("create song "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:14:7: ( 'declare' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:14:9: 'declare'
			{
			match("declare"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:15:7: ( 'else' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:15:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:16:7: ( 'fun' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:16:9: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:17:7: ( 'generate' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:17:9: 'generate'
			{
			match("generate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:18:7: ( 'get' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:18:9: 'get'
			{
			match("get"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:19:7: ( 'if' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:19:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:20:7: ( 'put' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:20:9: 'put'
			{
			match("put"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:21:7: ( 'return' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:21:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:22:7: ( 'while' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:22:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:23:7: ( '{' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:23:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:7: ( '}' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:96:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:96:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:96:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:97:6: ( ( '0' .. '9' )+ )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:97:8: ( '0' .. '9' )+
			{
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:97:8: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:98:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:98:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:98:19: (~ ( '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:98:33: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:98:33: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:99:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:99:11: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\\') ) {
					alt5=1;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:18: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:100:28: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			int _type = ESC_SEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:101:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | VAR | NUM | COMMENT | WS | STRING | ESC_SEQ )
		int alt6=29;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:148: VAR
				{
				mVAR(); 

				}
				break;
			case 25 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:152: NUM
				{
				mNUM(); 

				}
				break;
			case 26 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:156: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 27 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:164: WS
				{
				mWS(); 

				}
				break;
			case 28 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:167: STRING
				{
				mSTRING(); 

				}
				break;
			case 29 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:174: ESC_SEQ
				{
				mESC_SEQ(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\7\uffff\1\34\2\uffff\1\36\11\26\13\uffff\5\26\1\56\6\26\1\65\1\26\1\67"+
		"\1\uffff\1\70\4\26\1\75\1\uffff\1\26\2\uffff\4\26\1\uffff\2\26\1\105\3"+
		"\26\1\111\2\uffff\1\112\1\26\2\uffff\1\114\1\uffff";
	static final String DFA6_eofS =
		"\115\uffff";
	static final String DFA6_minS =
		"\1\11\6\uffff\1\57\2\uffff\1\75\1\162\1\145\1\154\1\165\1\145\1\146\1"+
		"\165\1\145\1\150\13\uffff\1\145\1\143\1\163\2\156\1\60\2\164\1\151\1\141"+
		"\1\154\1\145\1\60\1\145\1\60\1\uffff\1\60\1\165\1\154\1\164\1\141\1\60"+
		"\1\uffff\1\162\2\uffff\1\162\2\145\1\162\1\uffff\1\141\1\156\1\60\1\40"+
		"\1\145\1\164\1\60\2\uffff\1\60\1\145\2\uffff\1\60\1\uffff";
	static final String DFA6_maxS =
		"\1\175\6\uffff\1\57\2\uffff\1\75\1\162\1\145\1\154\1\165\1\145\1\146\1"+
		"\165\1\145\1\150\13\uffff\1\145\1\143\1\163\1\156\1\164\1\172\2\164\1"+
		"\151\1\141\1\154\1\145\1\172\1\145\1\172\1\uffff\1\172\1\165\1\154\1\164"+
		"\1\141\1\172\1\uffff\1\162\2\uffff\1\162\2\145\1\162\1\uffff\1\141\1\156"+
		"\1\172\1\40\1\145\1\164\1\172\2\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\12\uffff\1\26\1\27"+
		"\1\30\1\31\1\33\1\34\1\35\1\32\1\7\1\13\1\12\17\uffff\1\22\6\uffff\1\17"+
		"\1\uffff\1\21\1\23\4\uffff\1\16\7\uffff\1\25\1\14\2\uffff\1\24\1\15\1"+
		"\uffff\1\20";
	static final String DFA6_specialS =
		"\115\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\30\2\uffff\1\30\22\uffff\1\30\1\uffff\1\31\5\uffff\1\1\1\2\1\3\1\4"+
			"\1\5\1\6\1\uffff\1\7\12\27\1\uffff\1\10\1\11\1\12\3\uffff\32\26\1\uffff"+
			"\1\32\2\uffff\1\26\1\uffff\2\26\1\13\1\14\1\15\1\16\1\17\1\26\1\20\6"+
			"\26\1\21\1\26\1\22\4\26\1\23\3\26\1\24\1\uffff\1\25",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"",
			"",
			"\1\35",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54\5\uffff\1\55",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\66",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\1\76",
			"",
			"",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"\1\103",
			"\1\104",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\106",
			"\1\107",
			"\1\110",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\113",
			"",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | VAR | NUM | COMMENT | WS | STRING | ESC_SEQ );";
		}
	}

}
