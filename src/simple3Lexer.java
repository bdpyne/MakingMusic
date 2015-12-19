// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-19 12:46:23

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
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int COMMENT=4;
	public static final int DOUBLE=5;
	public static final int ESC_SEQ=6;
	public static final int NUM=7;
	public static final int STRING=8;
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
	@Override public String getGrammarFileName() { return "/Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g"; }

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:4:7: ( ',' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:4:9: ','
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:5:7: ( '-' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:5:9: '-'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:6:7: ( '->' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:6:9: '->'
			{
			match("->"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:7:7: ( ';' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:7:9: ';'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:8:7: ( '=' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:8:9: '='
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:9:7: ( 'Double' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:9:9: 'Double'
			{
			match("Double"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:10:7: ( 'Function' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:10:9: 'Function'
			{
			match("Function"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:11:7: ( 'Integer' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:11:9: 'Integer'
			{
			match("Integer"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:12:7: ( 'Part' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:12:9: 'Part'
			{
			match("Part"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:13:7: ( 'Phrase' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:13:9: 'Phrase'
			{
			match("Phrase"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:14:7: ( 'Score' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:14:9: 'Score'
			{
			match("Score"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:15:7: ( 'String' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:15:9: 'String'
			{
			match("String"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:16:7: ( 'add note' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:16:9: 'add note'
			{
			match("add note"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:17:7: ( 'else' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:17:9: 'else'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:22:7: ( 'to' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:22:9: 'to'
			{
			match("to"); 

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:23:7: ( 'void' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:23:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:7: ( 'while' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:24:9: 'while'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:25:7: ( '{' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:25:9: '{'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:26:7: ( '}' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:26:9: '}'
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
	// $ANTLR end "T__35"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:142:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:142:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:142:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:143:6: ( ( '0' .. '9' )+ )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:143:8: ( '0' .. '9' )+
			{
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:143:8: ( '0' .. '9' )+
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:144:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:144:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:144:19: (~ ( '\\n' | '\\r' ) )*
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

			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:144:33: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:144:33: '\\r'
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:145:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:145:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:146:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:146:17: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:146:17: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('.'); 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:146:29: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:147:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:147:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:147:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\\') ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:147:18: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:147:28: ~ ( '\\\\' | '\"' )
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
					break loop7;
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:148:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:148:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
		// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | VAR | NUM | COMMENT | WS | DOUBLE | STRING | ESC_SEQ )
		int alt8=32;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:16: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:22: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:28: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:34: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:40: T__16
				{
				mT__16(); 

				}
				break;
			case 7 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:46: T__17
				{
				mT__17(); 

				}
				break;
			case 8 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:52: T__18
				{
				mT__18(); 

				}
				break;
			case 9 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:58: T__19
				{
				mT__19(); 

				}
				break;
			case 10 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:64: T__20
				{
				mT__20(); 

				}
				break;
			case 11 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:70: T__21
				{
				mT__21(); 

				}
				break;
			case 12 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:76: T__22
				{
				mT__22(); 

				}
				break;
			case 13 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:82: T__23
				{
				mT__23(); 

				}
				break;
			case 14 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:88: T__24
				{
				mT__24(); 

				}
				break;
			case 15 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:94: T__25
				{
				mT__25(); 

				}
				break;
			case 16 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:100: T__26
				{
				mT__26(); 

				}
				break;
			case 17 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:106: T__27
				{
				mT__27(); 

				}
				break;
			case 18 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:112: T__28
				{
				mT__28(); 

				}
				break;
			case 19 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:118: T__29
				{
				mT__29(); 

				}
				break;
			case 20 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:124: T__30
				{
				mT__30(); 

				}
				break;
			case 21 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:130: T__31
				{
				mT__31(); 

				}
				break;
			case 22 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:136: T__32
				{
				mT__32(); 

				}
				break;
			case 23 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:142: T__33
				{
				mT__33(); 

				}
				break;
			case 24 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:148: T__34
				{
				mT__34(); 

				}
				break;
			case 25 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:154: T__35
				{
				mT__35(); 

				}
				break;
			case 26 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:160: VAR
				{
				mVAR(); 

				}
				break;
			case 27 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:164: NUM
				{
				mNUM(); 

				}
				break;
			case 28 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:168: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 29 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:176: WS
				{
				mWS(); 

				}
				break;
			case 30 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:179: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 31 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:186: STRING
				{
				mSTRING(); 

				}
				break;
			case 32 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:193: ESC_SEQ
				{
				mESC_SEQ(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\4\uffff\1\36\2\uffff\16\27\3\uffff\1\57\6\uffff\12\27\1\73\2\27\1\76"+
		"\2\27\2\uffff\11\27\1\112\1\uffff\1\113\1\27\1\uffff\5\27\1\122\3\27\1"+
		"\uffff\1\126\2\uffff\1\27\1\130\4\27\1\uffff\1\27\1\136\1\27\1\uffff\1"+
		"\27\1\uffff\1\141\1\142\2\27\1\145\1\uffff\1\146\1\147\2\uffff\1\27\1"+
		"\151\3\uffff\1\152\2\uffff";
	static final String DFA8_eofS =
		"\153\uffff";
	static final String DFA8_minS =
		"\1\11\3\uffff\1\76\2\uffff\1\157\1\165\1\156\1\141\1\143\1\144\1\154\1"+
		"\145\1\146\1\165\1\145\2\157\1\150\3\uffff\1\56\6\uffff\1\165\1\156\1"+
		"\164\2\162\1\157\1\162\1\144\1\163\1\164\1\60\2\164\1\60\2\151\2\uffff"+
		"\1\142\1\143\1\145\1\164\1\141\1\162\1\151\1\40\1\145\1\60\1\uffff\1\60"+
		"\1\165\1\uffff\1\144\2\154\1\164\1\147\1\60\1\163\1\145\1\156\1\uffff"+
		"\1\60\2\uffff\1\162\1\60\2\145\1\151\1\145\1\uffff\1\145\1\60\1\147\1"+
		"\uffff\1\156\1\uffff\2\60\1\157\1\162\1\60\1\uffff\2\60\2\uffff\1\156"+
		"\1\60\3\uffff\1\60\2\uffff";
	static final String DFA8_maxS =
		"\1\175\3\uffff\1\76\2\uffff\1\157\1\165\1\156\1\150\1\164\1\144\1\154"+
		"\1\145\1\146\1\165\1\145\2\157\1\150\3\uffff\1\71\6\uffff\1\165\1\156"+
		"\1\164\2\162\1\157\1\162\1\144\1\163\1\164\1\172\2\164\1\172\2\151\2\uffff"+
		"\1\142\1\143\1\145\1\164\1\141\1\162\1\151\1\40\1\145\1\172\1\uffff\1"+
		"\172\1\165\1\uffff\1\144\2\154\1\164\1\147\1\172\1\163\1\145\1\156\1\uffff"+
		"\1\172\2\uffff\1\162\1\172\2\145\1\151\1\145\1\uffff\1\145\1\172\1\147"+
		"\1\uffff\1\156\1\uffff\2\172\1\157\1\162\1\172\1\uffff\2\172\2\uffff\1"+
		"\156\1\172\3\uffff\1\172\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\16\uffff\1\30\1\31\1\32\1\uffff\1"+
		"\34\1\35\1\37\1\40\1\5\1\4\20\uffff\1\33\1\36\12\uffff\1\22\2\uffff\1"+
		"\25\11\uffff\1\17\1\uffff\1\21\1\23\6\uffff\1\13\3\uffff\1\20\1\uffff"+
		"\1\26\5\uffff\1\15\2\uffff\1\27\1\10\2\uffff\1\14\1\16\1\24\1\uffff\1"+
		"\12\1\11";
	static final String DFA8_specialS =
		"\153\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\uffff\1\33\5\uffff\1\1\1\2\2\uffff"+
			"\1\3\1\4\1\uffff\1\31\12\30\1\uffff\1\5\1\uffff\1\6\3\uffff\3\27\1\7"+
			"\1\27\1\10\2\27\1\11\6\27\1\12\2\27\1\13\7\27\1\uffff\1\34\2\uffff\1"+
			"\27\1\uffff\1\14\3\27\1\15\1\27\1\16\1\27\1\17\6\27\1\20\1\27\1\21\1"+
			"\27\1\22\1\27\1\23\1\24\3\27\1\25\1\uffff\1\26",
			"",
			"",
			"",
			"\1\35",
			"",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42\6\uffff\1\43",
			"\1\44\20\uffff\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"",
			"",
			"",
			"\1\60\1\uffff\12\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\74",
			"\1\75",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\77",
			"\1\100",
			"",
			"",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\114",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"\1\127",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"\1\135",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\137",
			"",
			"\1\140",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\143",
			"\1\144",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"\1\150",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
			return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | VAR | NUM | COMMENT | WS | DOUBLE | STRING | ESC_SEQ );";
		}
	}

}
