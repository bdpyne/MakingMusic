// $ANTLR 3.5.2 /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g 2015-12-14 22:54:26

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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:2:7: ( ';' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:2:9: ';'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:3:7: ( '=' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:3:9: '='
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:4:7: ( 'declare' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:4:9: 'declare'
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
	// $ANTLR end "T__12"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:44:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:45:6: ( ( '0' .. '9' )+ )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:45:8: ( '0' .. '9' )+
			{
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:45:8: ( '0' .. '9' )+
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:46:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:46:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:46:19: (~ ( '\\n' | '\\r' ) )*
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

			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:46:33: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:46:33: '\\r'
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:47:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:47:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:18: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:48:28: ~ ( '\\\\' | '\"' )
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
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:49:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:49:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
		// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:8: ( T__10 | T__11 | T__12 | VAR | NUM | COMMENT | WS | STRING | ESC_SEQ )
		int alt6=9;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt6=1;
			}
			break;
		case '=':
			{
			alt6=2;
			}
			break;
		case 'd':
			{
			int LA6_3 = input.LA(2);
			if ( (LA6_3=='e') ) {
				int LA6_10 = input.LA(3);
				if ( (LA6_10=='c') ) {
					int LA6_11 = input.LA(4);
					if ( (LA6_11=='l') ) {
						int LA6_12 = input.LA(5);
						if ( (LA6_12=='a') ) {
							int LA6_13 = input.LA(6);
							if ( (LA6_13=='r') ) {
								int LA6_14 = input.LA(7);
								if ( (LA6_14=='e') ) {
									int LA6_15 = input.LA(8);
									if ( ((LA6_15 >= '0' && LA6_15 <= '9')||(LA6_15 >= 'A' && LA6_15 <= 'Z')||LA6_15=='_'||(LA6_15 >= 'a' && LA6_15 <= 'z')) ) {
										alt6=4;
									}

									else {
										alt6=3;
									}

								}

								else {
									alt6=4;
								}

							}

							else {
								alt6=4;
							}

						}

						else {
							alt6=4;
						}

					}

					else {
						alt6=4;
					}

				}

				else {
					alt6=4;
				}

			}

			else {
				alt6=4;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt6=4;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt6=5;
			}
			break;
		case '/':
			{
			alt6=6;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt6=7;
			}
			break;
		case '\"':
			{
			alt6=8;
			}
			break;
		case '\\':
			{
			alt6=9;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}
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
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:28: VAR
				{
				mVAR(); 

				}
				break;
			case 5 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:32: NUM
				{
				mNUM(); 

				}
				break;
			case 6 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:36: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 7 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:44: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:47: STRING
				{
				mSTRING(); 

				}
				break;
			case 9 :
				// /Users/billpyne/NetBeansProjects/MakingMusic/src/simple3.g:1:54: ESC_SEQ
				{
				mESC_SEQ(); 

				}
				break;

		}
	}



}
