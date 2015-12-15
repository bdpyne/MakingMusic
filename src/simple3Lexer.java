// $ANTLR 3.5.2 C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g 2015-12-15 11:10:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simple3Lexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g"; }

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:2:7: ( '(' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:2:9: '('
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:3:7: ( ')' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:3:9: ')'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:4:7: ( '*' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:4:9: '*'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:5:7: ( '+' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:5:9: '+'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:6:7: ( ',' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:6:9: ','
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:7:7: ( '-' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:7:9: '-'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:8:7: ( '/' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:8:9: '/'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:9:7: ( ';' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:9:9: ';'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:10:7: ( '<=' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:10:9: '<='
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:11:7: ( '=' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:11:9: '='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:12:7: ( '==' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:12:9: '=='
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:13:7: ( 'declare' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:13:9: 'declare'
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:14:7: ( 'else' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:14:9: 'else'
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:15:7: ( 'get' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:15:9: 'get'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:16:7: ( 'if' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:16:9: 'if'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:17:7: ( 'put' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:17:9: 'put'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:18:7: ( 'return' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:18:9: 'return'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:19:7: ( 'while' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:19:9: 'while'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:20:7: ( '{' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:20:9: '{'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:21:7: ( '}' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:21:9: '}'
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
	// $ANTLR end "T__30"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:93:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:93:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:93:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:94:6: ( ( '0' .. '9' )+ )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:94:8: ( '0' .. '9' )+
			{
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:94:8: ( '0' .. '9' )+
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
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:95:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:95:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:95:19: (~ ( '\\n' | '\\r' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:
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

			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:95:33: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:95:33: '\\r'
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:96:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:96:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:97:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:97:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:97:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:97:18: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:97:28: ~ ( '\\\\' | '\"' )
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
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:98:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:98:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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

	// $ANTLR start "TONE"
	public final void mTONE() throws RecognitionException {
		try {
			int _type = TONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:99:9: ( ( 'A' .. 'G' ) ( 'M' | 'm' )? ( '#' | 'b' )? )
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:99:17: ( 'A' .. 'G' ) ( 'M' | 'm' )? ( '#' | 'b' )?
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'G') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:99:27: ( 'M' | 'm' )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='M'||LA6_0=='m') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:
					{
					if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:99:37: ( '#' | 'b' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='#'||LA7_0=='b') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:
					{
					if ( input.LA(1)=='#'||input.LA(1)=='b' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TONE"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | VAR | NUM | COMMENT | WS | STRING | ESC_SEQ | TONE )
		int alt8=27;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:16: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:22: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:28: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:34: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:40: T__16
				{
				mT__16(); 

				}
				break;
			case 7 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:46: T__17
				{
				mT__17(); 

				}
				break;
			case 8 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:52: T__18
				{
				mT__18(); 

				}
				break;
			case 9 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:58: T__19
				{
				mT__19(); 

				}
				break;
			case 10 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:64: T__20
				{
				mT__20(); 

				}
				break;
			case 11 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:70: T__21
				{
				mT__21(); 

				}
				break;
			case 12 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:76: T__22
				{
				mT__22(); 

				}
				break;
			case 13 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:82: T__23
				{
				mT__23(); 

				}
				break;
			case 14 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:88: T__24
				{
				mT__24(); 

				}
				break;
			case 15 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:94: T__25
				{
				mT__25(); 

				}
				break;
			case 16 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:100: T__26
				{
				mT__26(); 

				}
				break;
			case 17 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:106: T__27
				{
				mT__27(); 

				}
				break;
			case 18 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:112: T__28
				{
				mT__28(); 

				}
				break;
			case 19 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:118: T__29
				{
				mT__29(); 

				}
				break;
			case 20 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:124: T__30
				{
				mT__30(); 

				}
				break;
			case 21 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:130: VAR
				{
				mVAR(); 

				}
				break;
			case 22 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:134: NUM
				{
				mNUM(); 

				}
				break;
			case 23 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:138: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 24 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:146: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:149: STRING
				{
				mSTRING(); 

				}
				break;
			case 26 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:156: ESC_SEQ
				{
				mESC_SEQ(); 

				}
				break;
			case 27 :
				// C:\\Users\\bpyne\\NetBeansProjects\\MakingMusic\\src\\simple3.g:1:164: TONE
				{
				mTONE(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\7\uffff\1\33\2\uffff\1\35\7\31\2\uffff\1\31\11\uffff\3\31\1\53\4\31\2"+
		"\uffff\2\31\1\61\1\uffff\1\62\3\31\1\66\2\uffff\3\31\1\uffff\1\31\1\73"+
		"\1\31\1\75\1\uffff\1\76\2\uffff";
	static final String DFA8_eofS =
		"\77\uffff";
	static final String DFA8_minS =
		"\1\11\6\uffff\1\57\2\uffff\1\75\1\145\1\154\1\145\1\146\1\165\1\145\1"+
		"\150\2\uffff\1\43\11\uffff\1\143\1\163\1\164\1\60\2\164\1\151\1\43\2\uffff"+
		"\1\154\1\145\1\60\1\uffff\1\60\1\165\1\154\1\141\1\60\2\uffff\1\162\1"+
		"\145\1\162\1\uffff\1\156\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
	static final String DFA8_maxS =
		"\1\175\6\uffff\1\57\2\uffff\1\75\1\145\1\154\1\145\1\146\1\165\1\145\1"+
		"\150\2\uffff\1\155\11\uffff\1\143\1\163\1\164\1\172\2\164\1\151\1\142"+
		"\2\uffff\1\154\1\145\1\172\1\uffff\1\172\1\165\1\154\1\141\1\172\2\uffff"+
		"\1\162\1\145\1\162\1\uffff\1\156\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\10\uffff\1\23\1\24"+
		"\1\uffff\1\26\1\30\1\31\1\32\1\25\1\27\1\7\1\13\1\12\10\uffff\1\25\1\33"+
		"\3\uffff\1\17\5\uffff\1\16\1\20\3\uffff\1\15\4\uffff\1\22\1\uffff\1\21"+
		"\1\14";
	static final String DFA8_specialS =
		"\77\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\uffff\1\27\5\uffff\1\1\1\2\1\3\1\4"+
			"\1\5\1\6\1\uffff\1\7\12\25\1\uffff\1\10\1\11\1\12\3\uffff\7\24\23\31"+
			"\1\uffff\1\30\2\uffff\1\31\1\uffff\3\31\1\13\1\14\1\31\1\15\1\31\1\16"+
			"\6\31\1\17\1\31\1\20\4\31\1\21\3\31\1\22\1\uffff\1\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\32",
			"",
			"",
			"\1\34",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"",
			"",
			"\1\47\51\uffff\1\45\24\uffff\1\46\12\uffff\1\45",
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
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\47\76\uffff\1\46",
			"",
			"",
			"\1\57",
			"\1\60",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"\1\67",
			"\1\70",
			"\1\71",
			"",
			"\1\72",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\74",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | VAR | NUM | COMMENT | WS | STRING | ESC_SEQ | TONE );";
		}
	}

}
