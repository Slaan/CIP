package output;

// $ANTLR 3.4 /home/slaan/git/cip/testordner/buchstabenGrammar.g 2015-06-15 14:33:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class buchstabenGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ARITHMULTT=4;
    public static final int A_LET=5;
    public static final int B_LET=6;
    public static final int COMMENT=7;
    public static final int C_LET=8;
    public static final int D_LET=9;
    public static final int EQUALS=10;
    public static final int EQUALSMULTT=11;
    public static final int E_LET=12;
    public static final int F_LET=13;
    public static final int G_LET=14;
    public static final int H_LET=15;
    public static final int I_LET=16;
    public static final int J_LET=17;
    public static final int K_LET=18;
    public static final int L_LET=19;
    public static final int MINUS=20;
    public static final int M_LET=21;
    public static final int N_LET=22;
    public static final int O_LET=23;
    public static final int PLUS=24;
    public static final int P_LET=25;
    public static final int Q_LET=26;
    public static final int R_LET=27;
    public static final int S_LET=28;
    public static final int T_LET=29;
    public static final int U_LET=30;
    public static final int V_LET=31;
    public static final int WORD=32;
    public static final int WS=33;
    public static final int W_LET=34;
    public static final int X_LET=35;
    public static final int Y_LET=36;
    public static final int Z_LET=37;

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
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:43:7: ( '+' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:43:9: '+'
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
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:45:7: ( '-' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:45:9: '-'
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
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:47:9: ( '=' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:47:12: '='
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

    // $ANTLR start "A_LET"
    public final void mA_LET() throws RecognitionException {
        try {
            int _type = A_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:53:7: ( 'A' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:53:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A_LET"

    // $ANTLR start "B_LET"
    public final void mB_LET() throws RecognitionException {
        try {
            int _type = B_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:54:7: ( 'B' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:54:9: 'B'
            {
            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B_LET"

    // $ANTLR start "C_LET"
    public final void mC_LET() throws RecognitionException {
        try {
            int _type = C_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:55:7: ( 'C' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:55:9: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C_LET"

    // $ANTLR start "D_LET"
    public final void mD_LET() throws RecognitionException {
        try {
            int _type = D_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:56:7: ( 'D' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:56:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_LET"

    // $ANTLR start "E_LET"
    public final void mE_LET() throws RecognitionException {
        try {
            int _type = E_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:57:7: ( 'E' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:57:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E_LET"

    // $ANTLR start "F_LET"
    public final void mF_LET() throws RecognitionException {
        try {
            int _type = F_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:58:7: ( 'F' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:58:9: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F_LET"

    // $ANTLR start "G_LET"
    public final void mG_LET() throws RecognitionException {
        try {
            int _type = G_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:59:7: ( 'G' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:59:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G_LET"

    // $ANTLR start "H_LET"
    public final void mH_LET() throws RecognitionException {
        try {
            int _type = H_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:60:7: ( 'H' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:60:9: 'H'
            {
            match('H'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H_LET"

    // $ANTLR start "I_LET"
    public final void mI_LET() throws RecognitionException {
        try {
            int _type = I_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:61:7: ( 'I' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:61:9: 'I'
            {
            match('I'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I_LET"

    // $ANTLR start "J_LET"
    public final void mJ_LET() throws RecognitionException {
        try {
            int _type = J_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:62:7: ( 'J' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:62:9: 'J'
            {
            match('J'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J_LET"

    // $ANTLR start "K_LET"
    public final void mK_LET() throws RecognitionException {
        try {
            int _type = K_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:63:7: ( 'K' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:63:9: 'K'
            {
            match('K'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K_LET"

    // $ANTLR start "L_LET"
    public final void mL_LET() throws RecognitionException {
        try {
            int _type = L_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:64:7: ( 'L' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:64:9: 'L'
            {
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_LET"

    // $ANTLR start "M_LET"
    public final void mM_LET() throws RecognitionException {
        try {
            int _type = M_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:65:7: ( 'M' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:65:9: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M_LET"

    // $ANTLR start "N_LET"
    public final void mN_LET() throws RecognitionException {
        try {
            int _type = N_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:66:7: ( 'N' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:66:9: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N_LET"

    // $ANTLR start "O_LET"
    public final void mO_LET() throws RecognitionException {
        try {
            int _type = O_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:67:7: ( 'O' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:67:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O_LET"

    // $ANTLR start "P_LET"
    public final void mP_LET() throws RecognitionException {
        try {
            int _type = P_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:68:7: ( 'P' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:68:9: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P_LET"

    // $ANTLR start "Q_LET"
    public final void mQ_LET() throws RecognitionException {
        try {
            int _type = Q_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:69:7: ( 'Q' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:69:9: 'Q'
            {
            match('Q'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q_LET"

    // $ANTLR start "R_LET"
    public final void mR_LET() throws RecognitionException {
        try {
            int _type = R_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:70:7: ( 'R' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:70:9: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_LET"

    // $ANTLR start "S_LET"
    public final void mS_LET() throws RecognitionException {
        try {
            int _type = S_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:71:7: ( 'S' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:71:9: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S_LET"

    // $ANTLR start "T_LET"
    public final void mT_LET() throws RecognitionException {
        try {
            int _type = T_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:72:7: ( 'T' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:72:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T_LET"

    // $ANTLR start "U_LET"
    public final void mU_LET() throws RecognitionException {
        try {
            int _type = U_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:73:7: ( 'U' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:73:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U_LET"

    // $ANTLR start "V_LET"
    public final void mV_LET() throws RecognitionException {
        try {
            int _type = V_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:74:7: ( 'V' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:74:9: 'V'
            {
            match('V'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V_LET"

    // $ANTLR start "W_LET"
    public final void mW_LET() throws RecognitionException {
        try {
            int _type = W_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:75:7: ( 'W' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:75:9: 'W'
            {
            match('W'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W_LET"

    // $ANTLR start "X_LET"
    public final void mX_LET() throws RecognitionException {
        try {
            int _type = X_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:76:7: ( 'X' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:76:9: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X_LET"

    // $ANTLR start "Y_LET"
    public final void mY_LET() throws RecognitionException {
        try {
            int _type = Y_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:77:7: ( 'Y' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:77:9: 'Y'
            {
            match('Y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y_LET"

    // $ANTLR start "Z_LET"
    public final void mZ_LET() throws RecognitionException {
        try {
            int _type = Z_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:78:7: ( 'Z' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:78:9: 'Z'
            {
            match('Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z_LET"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:82:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:82:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:82:14: ( options {greedy=false; } : . )*
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
            	    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:82:42: .
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
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:85:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:85:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:8: ( PLUS | MINUS | EQUALS | A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET | COMMENT | WS )
        int alt2=31;
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
            {
            alt2=4;
            }
            break;
        case 'B':
            {
            alt2=5;
            }
            break;
        case 'C':
            {
            alt2=6;
            }
            break;
        case 'D':
            {
            alt2=7;
            }
            break;
        case 'E':
            {
            alt2=8;
            }
            break;
        case 'F':
            {
            alt2=9;
            }
            break;
        case 'G':
            {
            alt2=10;
            }
            break;
        case 'H':
            {
            alt2=11;
            }
            break;
        case 'I':
            {
            alt2=12;
            }
            break;
        case 'J':
            {
            alt2=13;
            }
            break;
        case 'K':
            {
            alt2=14;
            }
            break;
        case 'L':
            {
            alt2=15;
            }
            break;
        case 'M':
            {
            alt2=16;
            }
            break;
        case 'N':
            {
            alt2=17;
            }
            break;
        case 'O':
            {
            alt2=18;
            }
            break;
        case 'P':
            {
            alt2=19;
            }
            break;
        case 'Q':
            {
            alt2=20;
            }
            break;
        case 'R':
            {
            alt2=21;
            }
            break;
        case 'S':
            {
            alt2=22;
            }
            break;
        case 'T':
            {
            alt2=23;
            }
            break;
        case 'U':
            {
            alt2=24;
            }
            break;
        case 'V':
            {
            alt2=25;
            }
            break;
        case 'W':
            {
            alt2=26;
            }
            break;
        case 'X':
            {
            alt2=27;
            }
            break;
        case 'Y':
            {
            alt2=28;
            }
            break;
        case 'Z':
            {
            alt2=29;
            }
            break;
        case '/':
            {
            alt2=30;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=31;
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
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:28: A_LET
                {
                mA_LET(); 


                }
                break;
            case 5 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:34: B_LET
                {
                mB_LET(); 


                }
                break;
            case 6 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:40: C_LET
                {
                mC_LET(); 


                }
                break;
            case 7 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:46: D_LET
                {
                mD_LET(); 


                }
                break;
            case 8 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:52: E_LET
                {
                mE_LET(); 


                }
                break;
            case 9 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:58: F_LET
                {
                mF_LET(); 


                }
                break;
            case 10 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:64: G_LET
                {
                mG_LET(); 


                }
                break;
            case 11 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:70: H_LET
                {
                mH_LET(); 


                }
                break;
            case 12 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:76: I_LET
                {
                mI_LET(); 


                }
                break;
            case 13 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:82: J_LET
                {
                mJ_LET(); 


                }
                break;
            case 14 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:88: K_LET
                {
                mK_LET(); 


                }
                break;
            case 15 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:94: L_LET
                {
                mL_LET(); 


                }
                break;
            case 16 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:100: M_LET
                {
                mM_LET(); 


                }
                break;
            case 17 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:106: N_LET
                {
                mN_LET(); 


                }
                break;
            case 18 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:112: O_LET
                {
                mO_LET(); 


                }
                break;
            case 19 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:118: P_LET
                {
                mP_LET(); 


                }
                break;
            case 20 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:124: Q_LET
                {
                mQ_LET(); 


                }
                break;
            case 21 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:130: R_LET
                {
                mR_LET(); 


                }
                break;
            case 22 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:136: S_LET
                {
                mS_LET(); 


                }
                break;
            case 23 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:142: T_LET
                {
                mT_LET(); 


                }
                break;
            case 24 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:148: U_LET
                {
                mU_LET(); 


                }
                break;
            case 25 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:154: V_LET
                {
                mV_LET(); 


                }
                break;
            case 26 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:160: W_LET
                {
                mW_LET(); 


                }
                break;
            case 27 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:166: X_LET
                {
                mX_LET(); 


                }
                break;
            case 28 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:172: Y_LET
                {
                mY_LET(); 


                }
                break;
            case 29 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:178: Z_LET
                {
                mZ_LET(); 


                }
                break;
            case 30 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:184: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 31 :
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:1:192: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}