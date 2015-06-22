// $ANTLR 3.4 /home/slaan/git/cip/testordner/buchstabenGrammar.g 2015-06-22 16:29:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class buchstabenGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ARITHMULTT=4;
    public static final int BUCHSTABEN=5;
    public static final int COMMENT=6;
    public static final int EQUALS=7;
    public static final int EQUALSMULTT=8;
    public static final int MINUS=9;
    public static final int PLUS=10;
    public static final int PUZZLE=11;
    public static final int WORD=12;
    public static final int WS=13;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public buchstabenGrammarLexer() {} 
    public buchstabenGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public buchstabenGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/slaan/git/cip/testordner/buchstabenGrammar.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:44:7: ( '+' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:44:9: '+'
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
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:46:7: ( '-' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:46:9: '-'
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
    // $ANTLR end "MINUS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:48:9: ( '=' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:48:12: '='
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
    // $ANTLR end "EQUALS"

    // $ANTLR start "BUCHSTABEN"
    public final void mBUCHSTABEN() throws RecognitionException {
        try {
            int _type = BUCHSTABEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:85:4: ( ( 'A' .. 'Z' ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
    // $ANTLR end "BUCHSTABEN"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:89:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:89:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:89:14: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:89:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match("*/"); 



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
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:92:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:92:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    public void mTokens() throws RecognitionException {
        // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:8: ( PLUS | MINUS | EQUALS | BUCHSTABEN | COMMENT | WS )
        int alt2=6;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt2=1;
            }
            break;
        case '-':
            {
            alt2=2;
            }
            break;
        case '=':
            {
            alt2=3;
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
            {
            alt2=4;
            }
            break;
        case '/':
            {
            alt2=5;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:10: PLUS
                {
                mPLUS(); 


                }
                break;
            case 2 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:15: MINUS
                {
                mMINUS(); 


                }
                break;
            case 3 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:21: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 4 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:28: BUCHSTABEN
                {
                mBUCHSTABEN(); 


                }
                break;
            case 5 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:39: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 6 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:47: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}