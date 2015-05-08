// $ANTLR 3.4 /home/slaan/git/cip/praktikum2/praktikum2b.g 2015-05-08 18:50:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class praktikum2bLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int ADDSUBSYM=4;
    public static final int ANWEIS=5;
    public static final int BEGIN=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int DEKLA=9;
    public static final int DEKLARATIONSSYMBOL=10;
    public static final int END=11;
    public static final int EQUALS=12;
    public static final int ESC_SEQ=13;
    public static final int FLOAT=14;
    public static final int HEX_DIGIT=15;
    public static final int ID=16;
    public static final int INT=17;
    public static final int KOMMA=18;
    public static final int MULDIVSYM=19;
    public static final int OCTAL_ESC=20;
    public static final int PROGRAM=21;
    public static final int SEMIKOLON=22;
    public static final int STRING=23;
    public static final int UNICODE_ESC=24;
    public static final int VERGLEICHSZEICHEN=25;
    public static final int WERTZUWEISUNG=26;
    public static final int WS=27;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public praktikum2bLexer() {} 
    public praktikum2bLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public praktikum2bLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/slaan/git/cip/praktikum2/praktikum2b.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:2:7: ( '(' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:2:9: '('
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:3:7: ( ')' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:3:9: ')'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:4:7: ( 'do' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:4:9: 'do'
            {
            match("do"); 



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
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:5:7: ( 'else' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:5:9: 'else'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:6:7: ( 'fi' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:6:9: 'fi'
            {
            match("fi"); 



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
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:7:7: ( 'if' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:7:9: 'if'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:8:7: ( 'od' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:8:9: 'od'
            {
            match("od"); 



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
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:9:7: ( 'println' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:9:9: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:10:7: ( 'read' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:10:9: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:11:7: ( 'then' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:11:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:12:7: ( 'while' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:12:9: 'while'
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
    // $ANTLR end "T__38"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:66:2: ( 'program' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:66:4: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:69:2: ( 'begin' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:69:4: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:72:2: ( 'end' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:72:4: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:75:2: ( '=' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:75:5: '='
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

    // $ANTLR start "WERTZUWEISUNG"
    public final void mWERTZUWEISUNG() throws RecognitionException {
        try {
            int _type = WERTZUWEISUNG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:78:2: ( ':=' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:78:5: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WERTZUWEISUNG"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:81:2: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:81:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:81:11: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "VERGLEICHSZEICHEN"
    public final void mVERGLEICHSZEICHEN() throws RecognitionException {
        try {
            int _type = VERGLEICHSZEICHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:2: ( ( '<' | '>' | '=' | '>=' | '<=' | '<>' ) )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:5: ( '<' | '>' | '=' | '>=' | '<=' | '<>' )
            {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:5: ( '<' | '>' | '=' | '>=' | '<=' | '<>' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt2=5;
                    }
                    break;
                case '>':
                    {
                    alt2=6;
                    }
                    break;
                default:
                    alt2=1;
                }

                }
                break;
            case '>':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=2;
                }
                }
                break;
            case '=':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:6: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:10: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:14: '='
                    {
                    match('='); 

                    }
                    break;
                case 4 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:18: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 5 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:23: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 6 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:84:28: '<>'
                    {
                    match("<>"); 



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
    // $ANTLR end "VERGLEICHSZEICHEN"

    // $ANTLR start "SEMIKOLON"
    public final void mSEMIKOLON() throws RecognitionException {
        try {
            int _type = SEMIKOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:87:2: ( ';' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:87:4: ';'
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
    // $ANTLR end "SEMIKOLON"

    // $ANTLR start "DEKLARATIONSSYMBOL"
    public final void mDEKLARATIONSSYMBOL() throws RecognitionException {
        try {
            int _type = DEKLARATIONSSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:90:2: ( ( 'boolean' | 'integer' | 'string' | 'real' ) )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:90:4: ( 'boolean' | 'integer' | 'string' | 'real' )
            {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:90:4: ( 'boolean' | 'integer' | 'string' | 'real' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt3=1;
                }
                break;
            case 'i':
                {
                alt3=2;
                }
                break;
            case 's':
                {
                alt3=3;
                }
                break;
            case 'r':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:90:5: 'boolean'
                    {
                    match("boolean"); 



                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:90:15: 'integer'
                    {
                    match("integer"); 



                    }
                    break;
                case 3 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:90:25: 'string'
                    {
                    match("string"); 



                    }
                    break;
                case 4 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:90:34: 'real'
                    {
                    match("real"); 



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
    // $ANTLR end "DEKLARATIONSSYMBOL"

    // $ANTLR start "ADDSUBSYM"
    public final void mADDSUBSYM() throws RecognitionException {
        try {
            int _type = ADDSUBSYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:93:2: ( '+' | '-' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
    // $ANTLR end "ADDSUBSYM"

    // $ANTLR start "MULDIVSYM"
    public final void mMULDIVSYM() throws RecognitionException {
        try {
            int _type = MULDIVSYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:96:2: ( '*' | '/' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
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
    // $ANTLR end "MULDIVSYM"

    // $ANTLR start "KOMMA"
    public final void mKOMMA() throws RecognitionException {
        try {
            int _type = KOMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:99:2: ( ',' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:99:5: ','
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
    // $ANTLR end "KOMMA"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:102:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:102:4: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/slaan/git/cip/praktikum2/praktikum2b.g:102:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:105:2: ( ( '-' )? ( '0' .. '9' )+ )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:105:4: ( '-' )? ( '0' .. '9' )+
            {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:105:4: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:105:5: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /home/slaan/git/cip/praktikum2/praktikum2b.g:105:10: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:
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
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:108:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:108:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:108:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:
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
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    match('.'); 

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:108:25: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:109:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:109:13: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:110:9: ( '0' .. '9' )+
                    {
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:110:9: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:114:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:114:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /home/slaan/git/cip/praktikum2/praktikum2b.g:114:14: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:114:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:117:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:117:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:125:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:125:8: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:125:13: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    alt13=1;
                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:125:15: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:125:25: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop13;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:130:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:134:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt14=1;
                    }
                    break;
                case 'u':
                    {
                    alt14=2;
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
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:134:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:135:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:136:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:141:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1 >= '0' && LA15_1 <= '3')) ) {
                    int LA15_2 = input.LA(3);

                    if ( ((LA15_2 >= '0' && LA15_2 <= '7')) ) {
                        int LA15_4 = input.LA(4);

                        if ( ((LA15_4 >= '0' && LA15_4 <= '7')) ) {
                            alt15=1;
                        }
                        else {
                            alt15=2;
                        }
                    }
                    else {
                        alt15=3;
                    }
                }
                else if ( ((LA15_1 >= '4' && LA15_1 <= '7')) ) {
                    int LA15_3 = input.LA(3);

                    if ( ((LA15_3 >= '0' && LA15_3 <= '7')) ) {
                        alt15=2;
                    }
                    else {
                        alt15=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:141:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:142:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:143:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:148:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:148:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | PROGRAM | BEGIN | END | EQUALS | WERTZUWEISUNG | BOOLEAN | VERGLEICHSZEICHEN | SEMIKOLON | DEKLARATIONSSYMBOL | ADDSUBSYM | MULDIVSYM | KOMMA | ID | INT | FLOAT | COMMENT | WS | STRING )
        int alt16=29;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:10: T__28
                {
                mT__28(); 


                }
                break;
            case 2 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:16: T__29
                {
                mT__29(); 


                }
                break;
            case 3 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:22: T__30
                {
                mT__30(); 


                }
                break;
            case 4 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:28: T__31
                {
                mT__31(); 


                }
                break;
            case 5 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:34: T__32
                {
                mT__32(); 


                }
                break;
            case 6 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:40: T__33
                {
                mT__33(); 


                }
                break;
            case 7 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:46: T__34
                {
                mT__34(); 


                }
                break;
            case 8 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:52: T__35
                {
                mT__35(); 


                }
                break;
            case 9 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:58: T__36
                {
                mT__36(); 


                }
                break;
            case 10 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:64: T__37
                {
                mT__37(); 


                }
                break;
            case 11 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:70: T__38
                {
                mT__38(); 


                }
                break;
            case 12 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:76: PROGRAM
                {
                mPROGRAM(); 


                }
                break;
            case 13 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:84: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 14 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:90: END
                {
                mEND(); 


                }
                break;
            case 15 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:94: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 16 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:101: WERTZUWEISUNG
                {
                mWERTZUWEISUNG(); 


                }
                break;
            case 17 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:115: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 18 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:123: VERGLEICHSZEICHEN
                {
                mVERGLEICHSZEICHEN(); 


                }
                break;
            case 19 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:141: SEMIKOLON
                {
                mSEMIKOLON(); 


                }
                break;
            case 20 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:151: DEKLARATIONSSYMBOL
                {
                mDEKLARATIONSSYMBOL(); 


                }
                break;
            case 21 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:170: ADDSUBSYM
                {
                mADDSUBSYM(); 


                }
                break;
            case 22 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:180: MULDIVSYM
                {
                mMULDIVSYM(); 


                }
                break;
            case 23 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:190: KOMMA
                {
                mKOMMA(); 


                }
                break;
            case 24 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:196: ID
                {
                mID(); 


                }
                break;
            case 25 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:199: INT
                {
                mINT(); 


                }
                break;
            case 26 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:203: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 27 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:209: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 28 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:217: WS
                {
                mWS(); 


                }
                break;
            case 29 :
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:1:220: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA11_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\2\71\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "107:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA16_eotS =
        "\3\uffff\12\25\4\uffff\1\25\1\26\1\31\3\uffff\1\55\4\uffff\1\57"+
        "\2\25\1\62\1\25\1\64\1\25\1\66\7\25\1\uffff\1\25\3\uffff\1\25\1"+
        "\101\1\uffff\1\25\1\uffff\1\25\1\uffff\11\25\1\116\1\uffff\4\25"+
        "\1\123\1\124\1\125\1\126\4\25\1\uffff\1\126\3\25\4\uffff\1\136\1"+
        "\137\5\25\2\uffff\1\25\2\124\1\146\1\147\1\124\2\uffff";
    static final String DFA16_eofS =
        "\150\uffff";
    static final String DFA16_minS =
        "\1\11\2\uffff\1\157\1\154\1\141\1\146\1\144\1\162\1\145\2\150\1"+
        "\145\4\uffff\1\164\1\60\1\52\3\uffff\1\56\4\uffff\1\60\1\163\1\144"+
        "\1\60\1\154\1\60\1\164\1\60\1\151\1\141\1\145\1\165\1\151\1\147"+
        "\1\157\1\uffff\1\162\3\uffff\1\145\1\60\1\uffff\1\163\1\uffff\1"+
        "\145\1\uffff\1\156\1\147\1\144\1\156\1\145\1\154\1\151\1\154\1\151"+
        "\1\60\1\uffff\1\145\1\147\1\164\1\162\4\60\1\145\1\156\1\145\1\156"+
        "\1\uffff\1\60\1\145\1\154\1\141\4\uffff\2\60\1\141\1\147\1\162\1"+
        "\156\1\155\2\uffff\1\156\5\60\2\uffff";
    static final String DFA16_maxS =
        "\1\172\2\uffff\1\157\1\156\1\151\1\156\1\144\1\162\1\145\1\162\1"+
        "\150\1\157\4\uffff\1\164\1\71\1\52\3\uffff\1\71\4\uffff\1\172\1"+
        "\163\1\144\1\172\1\154\1\172\1\164\1\172\1\157\1\141\1\145\1\165"+
        "\1\151\1\147\1\157\1\uffff\1\162\3\uffff\1\145\1\172\1\uffff\1\163"+
        "\1\uffff\1\145\1\uffff\1\156\1\147\1\154\1\156\1\145\1\154\1\151"+
        "\1\154\1\151\1\172\1\uffff\1\145\1\147\1\164\1\162\4\172\1\145\1"+
        "\156\1\145\1\156\1\uffff\1\172\1\145\1\154\1\141\4\uffff\2\172\1"+
        "\141\1\147\1\162\1\156\1\155\2\uffff\1\156\5\172\2\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\12\uffff\1\17\1\20\1\22\1\23\3\uffff\1\27\1\30"+
        "\1\25\1\uffff\1\32\1\26\1\34\1\35\17\uffff\1\17\1\uffff\1\31\1\33"+
        "\1\3\2\uffff\1\5\1\uffff\1\6\1\uffff\1\7\12\uffff\1\16\14\uffff"+
        "\1\4\4\uffff\1\11\1\24\1\12\1\21\7\uffff\1\13\1\15\6\uffff\1\10"+
        "\1\14";
    static final String DFA16_specialS =
        "\150\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\6\uffff\1\33\1\1\1\2\1\31\1"+
            "\26\1\24\1\22\1\30\1\23\12\27\1\16\1\20\1\17\1\15\1\17\2\uffff"+
            "\32\25\6\uffff\1\25\1\14\1\25\1\3\1\4\1\5\2\25\1\6\5\25\1\7"+
            "\1\10\1\25\1\11\1\21\1\12\2\25\1\13\3\25",
            "",
            "",
            "\1\34",
            "\1\35\1\uffff\1\36",
            "\1\40\7\uffff\1\37",
            "\1\41\7\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46\11\uffff\1\47",
            "\1\50",
            "\1\51\11\uffff\1\52",
            "",
            "",
            "",
            "",
            "\1\54",
            "\12\55",
            "\1\56",
            "",
            "",
            "",
            "\1\30\1\uffff\12\27",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\60",
            "\1\61",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\63",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\65",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\67\5\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "",
            "",
            "",
            "\1\100",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\102",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106\7\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\1\145",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | PROGRAM | BEGIN | END | EQUALS | WERTZUWEISUNG | BOOLEAN | VERGLEICHSZEICHEN | SEMIKOLON | DEKLARATIONSSYMBOL | ADDSUBSYM | MULDIVSYM | KOMMA | ID | INT | FLOAT | COMMENT | WS | STRING );";
        }
    }
 

}