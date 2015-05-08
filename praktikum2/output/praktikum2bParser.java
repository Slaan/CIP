// $ANTLR 3.4 /home/slaan/git/cip/praktikum2/praktikum2b.g 2015-05-08 18:50:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class praktikum2bParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDSUBSYM", "ANWEIS", "BEGIN", "BOOLEAN", "COMMENT", "DEKLA", "DEKLARATIONSSYMBOL", "END", "EQUALS", "ESC_SEQ", "FLOAT", "HEX_DIGIT", "ID", "INT", "KOMMA", "MULDIVSYM", "OCTAL_ESC", "PROGRAM", "SEMIKOLON", "STRING", "UNICODE_ESC", "VERGLEICHSZEICHEN", "WERTZUWEISUNG", "WS", "'('", "')'", "'do'", "'else'", "'fi'", "'if'", "'od'", "'println'", "'read'", "'then'", "'while'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "anweisung", "zuweisung", "arith2", "deklaration", "print2", 
    "dekla", "ifanweisung", "vergleich", "vergleich2", "start", "anweisung_start", 
    "arithExpr", "wertzuweisung", "read", "arith1", "arith3", "whileanweisung", 
    "print"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public praktikum2bParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public praktikum2bParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public praktikum2bParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return praktikum2bParser.tokenNames; }
    public String getGrammarFileName() { return "/home/slaan/git/cip/praktikum2/praktikum2b.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:10:1: start : PROGRAM ! dekla BEGIN ! anweisung_start END !;
    public final praktikum2bParser.start_return start() throws RecognitionException {
        praktikum2bParser.start_return retval = new praktikum2bParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PROGRAM1=null;
        Token BEGIN3=null;
        Token END5=null;
        praktikum2bParser.dekla_return dekla2 =null;

        praktikum2bParser.anweisung_start_return anweisung_start4 =null;


        Object PROGRAM1_tree=null;
        Object BEGIN3_tree=null;
        Object END5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:11:2: ( PROGRAM ! dekla BEGIN ! anweisung_start END !)
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:11:5: PROGRAM ! dekla BEGIN ! anweisung_start END !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(11,13);
            PROGRAM1=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_start34); 
            dbg.location(12,4);
            pushFollow(FOLLOW_dekla_in_start41);
            dekla2=dekla();

            state._fsp--;

            adaptor.addChild(root_0, dekla2.getTree());
            dbg.location(13,10);
            BEGIN3=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_start46); 
            dbg.location(14,4);
            pushFollow(FOLLOW_anweisung_start_in_start53);
            anweisung_start4=anweisung_start();

            state._fsp--;

            adaptor.addChild(root_0, anweisung_start4.getTree());
            dbg.location(15,8);
            END5=(Token)match(input,END,FOLLOW_END_in_start58); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class dekla_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dekla"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:17:1: dekla : ( deklaration )* -> ^( DEKLA ( deklaration )* ) ;
    public final praktikum2bParser.dekla_return dekla() throws RecognitionException {
        praktikum2bParser.dekla_return retval = new praktikum2bParser.dekla_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        praktikum2bParser.deklaration_return deklaration6 =null;


        RewriteRuleSubtreeStream stream_deklaration=new RewriteRuleSubtreeStream(adaptor,"rule deklaration");
        try { dbg.enterRule(getGrammarFileName(), "dekla");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:17:7: ( ( deklaration )* -> ^( DEKLA ( deklaration )* ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:17:9: ( deklaration )*
            {
            dbg.location(17,9);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:17:9: ( deklaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEKLARATIONSSYMBOL) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:17:9: deklaration
            	    {
            	    dbg.location(17,9);
            	    pushFollow(FOLLOW_deklaration_in_dekla70);
            	    deklaration6=deklaration();

            	    state._fsp--;

            	    stream_deklaration.add(deklaration6.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: deklaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 17:22: -> ^( DEKLA ( deklaration )* )
            {
                dbg.location(17,25);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:17:25: ^( DEKLA ( deklaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(17,27);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DEKLA, "DEKLA")
                , root_1);

                dbg.location(17,33);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:17:33: ( deklaration )*
                while ( stream_deklaration.hasNext() ) {
                    dbg.location(17,33);
                    adaptor.addChild(root_1, stream_deklaration.nextTree());

                }
                stream_deklaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dekla");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dekla"


    public static class deklaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deklaration"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:19:1: deklaration : DEKLARATIONSSYMBOL ID ( KOMMA ID )* SEMIKOLON -> ^( DEKLARATIONSSYMBOL ( ID )* ) ;
    public final praktikum2bParser.deklaration_return deklaration() throws RecognitionException {
        praktikum2bParser.deklaration_return retval = new praktikum2bParser.deklaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEKLARATIONSSYMBOL7=null;
        Token ID8=null;
        Token KOMMA9=null;
        Token ID10=null;
        Token SEMIKOLON11=null;

        Object DEKLARATIONSSYMBOL7_tree=null;
        Object ID8_tree=null;
        Object KOMMA9_tree=null;
        Object ID10_tree=null;
        Object SEMIKOLON11_tree=null;
        RewriteRuleTokenStream stream_SEMIKOLON=new RewriteRuleTokenStream(adaptor,"token SEMIKOLON");
        RewriteRuleTokenStream stream_KOMMA=new RewriteRuleTokenStream(adaptor,"token KOMMA");
        RewriteRuleTokenStream stream_DEKLARATIONSSYMBOL=new RewriteRuleTokenStream(adaptor,"token DEKLARATIONSSYMBOL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "deklaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:20:2: ( DEKLARATIONSSYMBOL ID ( KOMMA ID )* SEMIKOLON -> ^( DEKLARATIONSSYMBOL ( ID )* ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:20:4: DEKLARATIONSSYMBOL ID ( KOMMA ID )* SEMIKOLON
            {
            dbg.location(20,4);
            DEKLARATIONSSYMBOL7=(Token)match(input,DEKLARATIONSSYMBOL,FOLLOW_DEKLARATIONSSYMBOL_in_deklaration93);  
            stream_DEKLARATIONSSYMBOL.add(DEKLARATIONSSYMBOL7);

            dbg.location(20,23);
            ID8=(Token)match(input,ID,FOLLOW_ID_in_deklaration95);  
            stream_ID.add(ID8);

            dbg.location(20,26);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:20:26: ( KOMMA ID )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==KOMMA) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:20:27: KOMMA ID
            	    {
            	    dbg.location(20,27);
            	    KOMMA9=(Token)match(input,KOMMA,FOLLOW_KOMMA_in_deklaration98);  
            	    stream_KOMMA.add(KOMMA9);

            	    dbg.location(20,33);
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_deklaration100);  
            	    stream_ID.add(ID10);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(20,38);
            SEMIKOLON11=(Token)match(input,SEMIKOLON,FOLLOW_SEMIKOLON_in_deklaration104);  
            stream_SEMIKOLON.add(SEMIKOLON11);


            // AST REWRITE
            // elements: ID, DEKLARATIONSSYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 20:48: -> ^( DEKLARATIONSSYMBOL ( ID )* )
            {
                dbg.location(20,51);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:20:51: ^( DEKLARATIONSSYMBOL ( ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(20,53);
                root_1 = (Object)adaptor.becomeRoot(
                stream_DEKLARATIONSSYMBOL.nextNode()
                , root_1);

                dbg.location(20,72);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:20:72: ( ID )*
                while ( stream_ID.hasNext() ) {
                    dbg.location(20,72);
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(20, 75);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deklaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "deklaration"


    public static class anweisung_start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anweisung_start"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:22:1: anweisung_start : ( anweisung )* -> ^( ANWEIS ( anweisung )* ) ;
    public final praktikum2bParser.anweisung_start_return anweisung_start() throws RecognitionException {
        praktikum2bParser.anweisung_start_return retval = new praktikum2bParser.anweisung_start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        praktikum2bParser.anweisung_return anweisung12 =null;


        RewriteRuleSubtreeStream stream_anweisung=new RewriteRuleSubtreeStream(adaptor,"rule anweisung");
        try { dbg.enterRule(getGrammarFileName(), "anweisung_start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:23:2: ( ( anweisung )* -> ^( ANWEIS ( anweisung )* ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:23:4: ( anweisung )*
            {
            dbg.location(23,4);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:23:4: ( anweisung )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==BOOLEAN||LA3_0==FLOAT||(LA3_0 >= ID && LA3_0 <= INT)||LA3_0==STRING||LA3_0==28||LA3_0==33||(LA3_0 >= 35 && LA3_0 <= 36)||LA3_0==38) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:23:4: anweisung
            	    {
            	    dbg.location(23,4);
            	    pushFollow(FOLLOW_anweisung_in_anweisung_start122);
            	    anweisung12=anweisung();

            	    state._fsp--;

            	    stream_anweisung.add(anweisung12.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            // AST REWRITE
            // elements: anweisung
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 23:15: -> ^( ANWEIS ( anweisung )* )
            {
                dbg.location(23,18);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:23:18: ^( ANWEIS ( anweisung )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(23,20);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ANWEIS, "ANWEIS")
                , root_1);

                dbg.location(23,27);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:23:27: ( anweisung )*
                while ( stream_anweisung.hasNext() ) {
                    dbg.location(23,27);
                    adaptor.addChild(root_1, stream_anweisung.nextTree());

                }
                stream_anweisung.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(23, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anweisung_start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anweisung_start"


    public static class anweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anweisung"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:25:1: anweisung : ( wertzuweisung | arith1 | ifanweisung | whileanweisung | read | print | vergleich ) SEMIKOLON !;
    public final praktikum2bParser.anweisung_return anweisung() throws RecognitionException {
        praktikum2bParser.anweisung_return retval = new praktikum2bParser.anweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMIKOLON20=null;
        praktikum2bParser.wertzuweisung_return wertzuweisung13 =null;

        praktikum2bParser.arith1_return arith114 =null;

        praktikum2bParser.ifanweisung_return ifanweisung15 =null;

        praktikum2bParser.whileanweisung_return whileanweisung16 =null;

        praktikum2bParser.read_return read17 =null;

        praktikum2bParser.print_return print18 =null;

        praktikum2bParser.vergleich_return vergleich19 =null;


        Object SEMIKOLON20_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:2: ( ( wertzuweisung | arith1 | ifanweisung | whileanweisung | read | print | vergleich ) SEMIKOLON !)
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:4: ( wertzuweisung | arith1 | ifanweisung | whileanweisung | read | print | vergleich ) SEMIKOLON !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(26,4);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:4: ( wertzuweisung | arith1 | ifanweisung | whileanweisung | read | print | vergleich )
            int alt4=7;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==WERTZUWEISUNG) ) {
                    alt4=1;
                }
                else if ( (LA4_1==ADDSUBSYM||LA4_1==MULDIVSYM||LA4_1==SEMIKOLON) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==ADDSUBSYM||LA4_2==MULDIVSYM||LA4_2==SEMIKOLON) ) {
                    alt4=2;
                }
                else if ( (LA4_2==VERGLEICHSZEICHEN) ) {
                    alt4=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==ADDSUBSYM||LA4_3==MULDIVSYM||LA4_3==SEMIKOLON) ) {
                    alt4=2;
                }
                else if ( (LA4_3==VERGLEICHSZEICHEN) ) {
                    alt4=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 38:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 35:
                {
                alt4=6;
                }
                break;
            case BOOLEAN:
            case STRING:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:5: wertzuweisung
                    {
                    dbg.location(26,5);
                    pushFollow(FOLLOW_wertzuweisung_in_anweisung144);
                    wertzuweisung13=wertzuweisung();

                    state._fsp--;

                    adaptor.addChild(root_0, wertzuweisung13.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:19: arith1
                    {
                    dbg.location(26,19);
                    pushFollow(FOLLOW_arith1_in_anweisung146);
                    arith114=arith1();

                    state._fsp--;

                    adaptor.addChild(root_0, arith114.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:26: ifanweisung
                    {
                    dbg.location(26,26);
                    pushFollow(FOLLOW_ifanweisung_in_anweisung148);
                    ifanweisung15=ifanweisung();

                    state._fsp--;

                    adaptor.addChild(root_0, ifanweisung15.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:38: whileanweisung
                    {
                    dbg.location(26,38);
                    pushFollow(FOLLOW_whileanweisung_in_anweisung150);
                    whileanweisung16=whileanweisung();

                    state._fsp--;

                    adaptor.addChild(root_0, whileanweisung16.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:53: read
                    {
                    dbg.location(26,53);
                    pushFollow(FOLLOW_read_in_anweisung152);
                    read17=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read17.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:58: print
                    {
                    dbg.location(26,58);
                    pushFollow(FOLLOW_print_in_anweisung154);
                    print18=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print18.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:26:64: vergleich
                    {
                    dbg.location(26,64);
                    pushFollow(FOLLOW_vergleich_in_anweisung156);
                    vergleich19=vergleich();

                    state._fsp--;

                    adaptor.addChild(root_0, vergleich19.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(26,85);
            SEMIKOLON20=(Token)match(input,SEMIKOLON,FOLLOW_SEMIKOLON_in_anweisung159); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(26, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anweisung"


    public static class wertzuweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wertzuweisung"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:28:1: wertzuweisung : ID WERTZUWEISUNG zuweisung -> ^( WERTZUWEISUNG ID zuweisung ) ;
    public final praktikum2bParser.wertzuweisung_return wertzuweisung() throws RecognitionException {
        praktikum2bParser.wertzuweisung_return retval = new praktikum2bParser.wertzuweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID21=null;
        Token WERTZUWEISUNG22=null;
        praktikum2bParser.zuweisung_return zuweisung23 =null;


        Object ID21_tree=null;
        Object WERTZUWEISUNG22_tree=null;
        RewriteRuleTokenStream stream_WERTZUWEISUNG=new RewriteRuleTokenStream(adaptor,"token WERTZUWEISUNG");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_zuweisung=new RewriteRuleSubtreeStream(adaptor,"rule zuweisung");
        try { dbg.enterRule(getGrammarFileName(), "wertzuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:29:2: ( ID WERTZUWEISUNG zuweisung -> ^( WERTZUWEISUNG ID zuweisung ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:29:5: ID WERTZUWEISUNG zuweisung
            {
            dbg.location(29,5);
            ID21=(Token)match(input,ID,FOLLOW_ID_in_wertzuweisung172);  
            stream_ID.add(ID21);

            dbg.location(29,8);
            WERTZUWEISUNG22=(Token)match(input,WERTZUWEISUNG,FOLLOW_WERTZUWEISUNG_in_wertzuweisung174);  
            stream_WERTZUWEISUNG.add(WERTZUWEISUNG22);

            dbg.location(29,22);
            pushFollow(FOLLOW_zuweisung_in_wertzuweisung176);
            zuweisung23=zuweisung();

            state._fsp--;

            stream_zuweisung.add(zuweisung23.getTree());

            // AST REWRITE
            // elements: ID, WERTZUWEISUNG, zuweisung
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:32: -> ^( WERTZUWEISUNG ID zuweisung )
            {
                dbg.location(29,35);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:29:35: ^( WERTZUWEISUNG ID zuweisung )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(29,37);
                root_1 = (Object)adaptor.becomeRoot(
                stream_WERTZUWEISUNG.nextNode()
                , root_1);

                dbg.location(29,51);
                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );
                dbg.location(29,54);
                adaptor.addChild(root_1, stream_zuweisung.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(29, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wertzuweisung"


    public static class zuweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "zuweisung"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:31:1: zuweisung : ( arith1 | STRING | vergleich ) ;
    public final praktikum2bParser.zuweisung_return zuweisung() throws RecognitionException {
        praktikum2bParser.zuweisung_return retval = new praktikum2bParser.zuweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING25=null;
        praktikum2bParser.arith1_return arith124 =null;

        praktikum2bParser.vergleich_return vergleich26 =null;


        Object STRING25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "zuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:32:2: ( ( arith1 | STRING | vergleich ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:32:4: ( arith1 | STRING | vergleich )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(32,4);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:32:4: ( arith1 | STRING | vergleich )
            int alt5=3;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ADDSUBSYM||LA5_1==MULDIVSYM||LA5_1==SEMIKOLON) ) {
                    alt5=1;
                }
                else if ( (LA5_1==VERGLEICHSZEICHEN) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==ADDSUBSYM||LA5_2==MULDIVSYM||LA5_2==SEMIKOLON) ) {
                    alt5=1;
                }
                else if ( (LA5_2==VERGLEICHSZEICHEN) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
            case 28:
                {
                alt5=1;
                }
                break;
            case STRING:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==SEMIKOLON) ) {
                    alt5=2;
                }
                else if ( (LA5_4==VERGLEICHSZEICHEN) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:32:5: arith1
                    {
                    dbg.location(32,5);
                    pushFollow(FOLLOW_arith1_in_zuweisung196);
                    arith124=arith1();

                    state._fsp--;

                    adaptor.addChild(root_0, arith124.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:32:12: STRING
                    {
                    dbg.location(32,12);
                    STRING25=(Token)match(input,STRING,FOLLOW_STRING_in_zuweisung198); 
                    STRING25_tree = 
                    (Object)adaptor.create(STRING25)
                    ;
                    adaptor.addChild(root_0, STRING25_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:32:19: vergleich
                    {
                    dbg.location(32,19);
                    pushFollow(FOLLOW_vergleich_in_zuweisung200);
                    vergleich26=vergleich();

                    state._fsp--;

                    adaptor.addChild(root_0, vergleich26.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(32, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "zuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "zuweisung"


    public static class ifanweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifanweisung"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:34:1: ifanweisung : 'if' vergleich 'then' anweisung_start ( 'else' anweisung_start )? 'fi' -> ^( 'if' vergleich anweisung_start ) ;
    public final praktikum2bParser.ifanweisung_return ifanweisung() throws RecognitionException {
        praktikum2bParser.ifanweisung_return retval = new praktikum2bParser.ifanweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal27=null;
        Token string_literal29=null;
        Token string_literal31=null;
        Token string_literal33=null;
        praktikum2bParser.vergleich_return vergleich28 =null;

        praktikum2bParser.anweisung_start_return anweisung_start30 =null;

        praktikum2bParser.anweisung_start_return anweisung_start32 =null;


        Object string_literal27_tree=null;
        Object string_literal29_tree=null;
        Object string_literal31_tree=null;
        Object string_literal33_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_anweisung_start=new RewriteRuleSubtreeStream(adaptor,"rule anweisung_start");
        RewriteRuleSubtreeStream stream_vergleich=new RewriteRuleSubtreeStream(adaptor,"rule vergleich");
        try { dbg.enterRule(getGrammarFileName(), "ifanweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:35:2: ( 'if' vergleich 'then' anweisung_start ( 'else' anweisung_start )? 'fi' -> ^( 'if' vergleich anweisung_start ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:35:4: 'if' vergleich 'then' anweisung_start ( 'else' anweisung_start )? 'fi'
            {
            dbg.location(35,4);
            string_literal27=(Token)match(input,33,FOLLOW_33_in_ifanweisung212);  
            stream_33.add(string_literal27);

            dbg.location(35,9);
            pushFollow(FOLLOW_vergleich_in_ifanweisung214);
            vergleich28=vergleich();

            state._fsp--;

            stream_vergleich.add(vergleich28.getTree());
            dbg.location(35,19);
            string_literal29=(Token)match(input,37,FOLLOW_37_in_ifanweisung216);  
            stream_37.add(string_literal29);

            dbg.location(35,26);
            pushFollow(FOLLOW_anweisung_start_in_ifanweisung218);
            anweisung_start30=anweisung_start();

            state._fsp--;

            stream_anweisung_start.add(anweisung_start30.getTree());
            dbg.location(35,42);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:35:42: ( 'else' anweisung_start )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:35:43: 'else' anweisung_start
                    {
                    dbg.location(35,43);
                    string_literal31=(Token)match(input,31,FOLLOW_31_in_ifanweisung221);  
                    stream_31.add(string_literal31);

                    dbg.location(35,50);
                    pushFollow(FOLLOW_anweisung_start_in_ifanweisung223);
                    anweisung_start32=anweisung_start();

                    state._fsp--;

                    stream_anweisung_start.add(anweisung_start32.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(35,68);
            string_literal33=(Token)match(input,32,FOLLOW_32_in_ifanweisung227);  
            stream_32.add(string_literal33);


            // AST REWRITE
            // elements: 33, anweisung_start, vergleich
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 35:73: -> ^( 'if' vergleich anweisung_start )
            {
                dbg.location(35,76);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:35:76: ^( 'if' vergleich anweisung_start )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(35,78);
                root_1 = (Object)adaptor.becomeRoot(
                stream_33.nextNode()
                , root_1);

                dbg.location(35,83);
                adaptor.addChild(root_1, stream_vergleich.nextTree());
                dbg.location(35,93);
                adaptor.addChild(root_1, stream_anweisung_start.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(35, 108);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifanweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifanweisung"


    public static class whileanweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileanweisung"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:37:1: whileanweisung : 'while' vergleich 'do' anweisung_start 'od' -> ^( 'while' vergleich anweisung_start ) ;
    public final praktikum2bParser.whileanweisung_return whileanweisung() throws RecognitionException {
        praktikum2bParser.whileanweisung_return retval = new praktikum2bParser.whileanweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal34=null;
        Token string_literal36=null;
        Token string_literal38=null;
        praktikum2bParser.vergleich_return vergleich35 =null;

        praktikum2bParser.anweisung_start_return anweisung_start37 =null;


        Object string_literal34_tree=null;
        Object string_literal36_tree=null;
        Object string_literal38_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_anweisung_start=new RewriteRuleSubtreeStream(adaptor,"rule anweisung_start");
        RewriteRuleSubtreeStream stream_vergleich=new RewriteRuleSubtreeStream(adaptor,"rule vergleich");
        try { dbg.enterRule(getGrammarFileName(), "whileanweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:38:2: ( 'while' vergleich 'do' anweisung_start 'od' -> ^( 'while' vergleich anweisung_start ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:38:4: 'while' vergleich 'do' anweisung_start 'od'
            {
            dbg.location(38,4);
            string_literal34=(Token)match(input,38,FOLLOW_38_in_whileanweisung247);  
            stream_38.add(string_literal34);

            dbg.location(38,12);
            pushFollow(FOLLOW_vergleich_in_whileanweisung249);
            vergleich35=vergleich();

            state._fsp--;

            stream_vergleich.add(vergleich35.getTree());
            dbg.location(38,22);
            string_literal36=(Token)match(input,30,FOLLOW_30_in_whileanweisung251);  
            stream_30.add(string_literal36);

            dbg.location(38,27);
            pushFollow(FOLLOW_anweisung_start_in_whileanweisung253);
            anweisung_start37=anweisung_start();

            state._fsp--;

            stream_anweisung_start.add(anweisung_start37.getTree());
            dbg.location(38,43);
            string_literal38=(Token)match(input,34,FOLLOW_34_in_whileanweisung255);  
            stream_34.add(string_literal38);


            // AST REWRITE
            // elements: 38, anweisung_start, vergleich
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 38:48: -> ^( 'while' vergleich anweisung_start )
            {
                dbg.location(38,51);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:38:51: ^( 'while' vergleich anweisung_start )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(38,53);
                root_1 = (Object)adaptor.becomeRoot(
                stream_38.nextNode()
                , root_1);

                dbg.location(38,61);
                adaptor.addChild(root_1, stream_vergleich.nextTree());
                dbg.location(38,71);
                adaptor.addChild(root_1, stream_anweisung_start.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(38, 86);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileanweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whileanweisung"


    public static class read_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:40:1: read : 'read' '(' ID ')' -> ^( 'read' ID ) ;
    public final praktikum2bParser.read_return read() throws RecognitionException {
        praktikum2bParser.read_return retval = new praktikum2bParser.read_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal39=null;
        Token char_literal40=null;
        Token ID41=null;
        Token char_literal42=null;

        Object string_literal39_tree=null;
        Object char_literal40_tree=null;
        Object ID41_tree=null;
        Object char_literal42_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:41:2: ( 'read' '(' ID ')' -> ^( 'read' ID ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:41:4: 'read' '(' ID ')'
            {
            dbg.location(41,4);
            string_literal39=(Token)match(input,36,FOLLOW_36_in_read275);  
            stream_36.add(string_literal39);

            dbg.location(41,11);
            char_literal40=(Token)match(input,28,FOLLOW_28_in_read277);  
            stream_28.add(char_literal40);

            dbg.location(41,14);
            ID41=(Token)match(input,ID,FOLLOW_ID_in_read278);  
            stream_ID.add(ID41);

            dbg.location(41,16);
            char_literal42=(Token)match(input,29,FOLLOW_29_in_read279);  
            stream_29.add(char_literal42);


            // AST REWRITE
            // elements: ID, 36
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 41:20: -> ^( 'read' ID )
            {
                dbg.location(41,23);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:41:23: ^( 'read' ID )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(41,25);
                root_1 = (Object)adaptor.becomeRoot(
                stream_36.nextNode()
                , root_1);

                dbg.location(41,32);
                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(41, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read"


    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:43:1: print : 'println' '(' print2 ')' -> ^( 'println' print2 ) ;
    public final praktikum2bParser.print_return print() throws RecognitionException {
        praktikum2bParser.print_return retval = new praktikum2bParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        praktikum2bParser.print2_return print245 =null;


        Object string_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_print2=new RewriteRuleSubtreeStream(adaptor,"rule print2");
        try { dbg.enterRule(getGrammarFileName(), "print");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:44:2: ( 'println' '(' print2 ')' -> ^( 'println' print2 ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:44:4: 'println' '(' print2 ')'
            {
            dbg.location(44,4);
            string_literal43=(Token)match(input,35,FOLLOW_35_in_print296);  
            stream_35.add(string_literal43);

            dbg.location(44,14);
            char_literal44=(Token)match(input,28,FOLLOW_28_in_print298);  
            stream_28.add(char_literal44);

            dbg.location(44,17);
            pushFollow(FOLLOW_print2_in_print299);
            print245=print2();

            state._fsp--;

            stream_print2.add(print245.getTree());
            dbg.location(44,23);
            char_literal46=(Token)match(input,29,FOLLOW_29_in_print300);  
            stream_29.add(char_literal46);


            // AST REWRITE
            // elements: print2, 35
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:27: -> ^( 'println' print2 )
            {
                dbg.location(44,30);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:44:30: ^( 'println' print2 )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(44,32);
                root_1 = (Object)adaptor.becomeRoot(
                stream_35.nextNode()
                , root_1);

                dbg.location(44,42);
                adaptor.addChild(root_1, stream_print2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(44, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "print"


    public static class print2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print2"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:46:1: print2 : ( arith1 | STRING ) ;
    public final praktikum2bParser.print2_return print2() throws RecognitionException {
        praktikum2bParser.print2_return retval = new praktikum2bParser.print2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING48=null;
        praktikum2bParser.arith1_return arith147 =null;


        Object STRING48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "print2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:46:8: ( ( arith1 | STRING ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:46:10: ( arith1 | STRING )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(46,10);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:46:10: ( arith1 | STRING )
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==FLOAT||(LA7_0 >= ID && LA7_0 <= INT)||LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:46:11: arith1
                    {
                    dbg.location(46,11);
                    pushFollow(FOLLOW_arith1_in_print2317);
                    arith147=arith1();

                    state._fsp--;

                    adaptor.addChild(root_0, arith147.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:46:18: STRING
                    {
                    dbg.location(46,18);
                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_print2319); 
                    STRING48_tree = 
                    (Object)adaptor.create(STRING48)
                    ;
                    adaptor.addChild(root_0, STRING48_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(46, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "print2"


    public static class vergleich_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vergleich"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:48:1: vergleich : first= vergleich2 VERGLEICHSZEICHEN second= vergleich2 -> ^( VERGLEICHSZEICHEN $first $second) ;
    public final praktikum2bParser.vergleich_return vergleich() throws RecognitionException {
        praktikum2bParser.vergleich_return retval = new praktikum2bParser.vergleich_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VERGLEICHSZEICHEN49=null;
        praktikum2bParser.vergleich2_return first =null;

        praktikum2bParser.vergleich2_return second =null;


        Object VERGLEICHSZEICHEN49_tree=null;
        RewriteRuleTokenStream stream_VERGLEICHSZEICHEN=new RewriteRuleTokenStream(adaptor,"token VERGLEICHSZEICHEN");
        RewriteRuleSubtreeStream stream_vergleich2=new RewriteRuleSubtreeStream(adaptor,"rule vergleich2");
        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:49:2: (first= vergleich2 VERGLEICHSZEICHEN second= vergleich2 -> ^( VERGLEICHSZEICHEN $first $second) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:49:5: first= vergleich2 VERGLEICHSZEICHEN second= vergleich2
            {
            dbg.location(49,10);
            pushFollow(FOLLOW_vergleich2_in_vergleich332);
            first=vergleich2();

            state._fsp--;

            stream_vergleich2.add(first.getTree());
            dbg.location(49,22);
            VERGLEICHSZEICHEN49=(Token)match(input,VERGLEICHSZEICHEN,FOLLOW_VERGLEICHSZEICHEN_in_vergleich334);  
            stream_VERGLEICHSZEICHEN.add(VERGLEICHSZEICHEN49);

            dbg.location(49,46);
            pushFollow(FOLLOW_vergleich2_in_vergleich338);
            second=vergleich2();

            state._fsp--;

            stream_vergleich2.add(second.getTree());

            // AST REWRITE
            // elements: first, VERGLEICHSZEICHEN, second
            // token labels: 
            // rule labels: first, retval, second
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:58: -> ^( VERGLEICHSZEICHEN $first $second)
            {
                dbg.location(49,61);
                // /home/slaan/git/cip/praktikum2/praktikum2b.g:49:61: ^( VERGLEICHSZEICHEN $first $second)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(49,63);
                root_1 = (Object)adaptor.becomeRoot(
                stream_VERGLEICHSZEICHEN.nextNode()
                , root_1);

                dbg.location(49,82);
                adaptor.addChild(root_1, stream_first.nextTree());
                dbg.location(49,89);
                adaptor.addChild(root_1, stream_second.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 95);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vergleich");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vergleich"


    public static class vergleich2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vergleich2"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:51:1: vergleich2 : ( STRING | INT | FLOAT | BOOLEAN ) ;
    public final praktikum2bParser.vergleich2_return vergleich2() throws RecognitionException {
        praktikum2bParser.vergleich2_return retval = new praktikum2bParser.vergleich2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vergleich2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:52:2: ( ( STRING | INT | FLOAT | BOOLEAN ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(52,2);
            set50=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set50)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(52, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vergleich2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vergleich2"


    public static class arithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithExpr"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:54:2: arithExpr : arith1 SEMIKOLON !;
    public final praktikum2bParser.arithExpr_return arithExpr() throws RecognitionException {
        praktikum2bParser.arithExpr_return retval = new praktikum2bParser.arithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMIKOLON52=null;
        praktikum2bParser.arith1_return arith151 =null;


        Object SEMIKOLON52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arithExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:54:12: ( arith1 SEMIKOLON !)
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:54:14: arith1 SEMIKOLON !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(54,14);
            pushFollow(FOLLOW_arith1_in_arithExpr378);
            arith151=arith1();

            state._fsp--;

            adaptor.addChild(root_0, arith151.getTree());
            dbg.location(54,31);
            SEMIKOLON52=(Token)match(input,SEMIKOLON,FOLLOW_SEMIKOLON_in_arithExpr380); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(54, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arithExpr"


    public static class arith1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith1"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:56:1: arith1 : arith2 ( ADDSUBSYM ^ arith2 )* ;
    public final praktikum2bParser.arith1_return arith1() throws RecognitionException {
        praktikum2bParser.arith1_return retval = new praktikum2bParser.arith1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADDSUBSYM54=null;
        praktikum2bParser.arith2_return arith253 =null;

        praktikum2bParser.arith2_return arith255 =null;


        Object ADDSUBSYM54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:57:2: ( arith2 ( ADDSUBSYM ^ arith2 )* )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:57:4: arith2 ( ADDSUBSYM ^ arith2 )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(57,4);
            pushFollow(FOLLOW_arith2_in_arith1391);
            arith253=arith2();

            state._fsp--;

            adaptor.addChild(root_0, arith253.getTree());
            dbg.location(57,11);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:57:11: ( ADDSUBSYM ^ arith2 )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==ADDSUBSYM) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:57:12: ADDSUBSYM ^ arith2
            	    {
            	    dbg.location(57,21);
            	    ADDSUBSYM54=(Token)match(input,ADDSUBSYM,FOLLOW_ADDSUBSYM_in_arith1394); 
            	    ADDSUBSYM54_tree = 
            	    (Object)adaptor.create(ADDSUBSYM54)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(ADDSUBSYM54_tree, root_0);

            	    dbg.location(57,23);
            	    pushFollow(FOLLOW_arith2_in_arith1397);
            	    arith255=arith2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arith255.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 30);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arith1"


    public static class arith2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith2"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:59:1: arith2 : arith3 ( MULDIVSYM ^ arith3 )* ;
    public final praktikum2bParser.arith2_return arith2() throws RecognitionException {
        praktikum2bParser.arith2_return retval = new praktikum2bParser.arith2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULDIVSYM57=null;
        praktikum2bParser.arith3_return arith356 =null;

        praktikum2bParser.arith3_return arith358 =null;


        Object MULDIVSYM57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:60:2: ( arith3 ( MULDIVSYM ^ arith3 )* )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:60:4: arith3 ( MULDIVSYM ^ arith3 )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(60,4);
            pushFollow(FOLLOW_arith3_in_arith2408);
            arith356=arith3();

            state._fsp--;

            adaptor.addChild(root_0, arith356.getTree());
            dbg.location(60,11);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:60:11: ( MULDIVSYM ^ arith3 )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==MULDIVSYM) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/praktikum2/praktikum2b.g:60:12: MULDIVSYM ^ arith3
            	    {
            	    dbg.location(60,21);
            	    MULDIVSYM57=(Token)match(input,MULDIVSYM,FOLLOW_MULDIVSYM_in_arith2411); 
            	    MULDIVSYM57_tree = 
            	    (Object)adaptor.create(MULDIVSYM57)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MULDIVSYM57_tree, root_0);

            	    dbg.location(60,23);
            	    pushFollow(FOLLOW_arith3_in_arith2414);
            	    arith358=arith3();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arith358.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(60, 30);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arith2"


    public static class arith3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith3"
    // /home/slaan/git/cip/praktikum2/praktikum2b.g:62:1: arith3 : ( INT | FLOAT | '(' ! arith1 ')' !| ID ) ;
    public final praktikum2bParser.arith3_return arith3() throws RecognitionException {
        praktikum2bParser.arith3_return retval = new praktikum2bParser.arith3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT59=null;
        Token FLOAT60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token ID64=null;
        praktikum2bParser.arith1_return arith162 =null;


        Object INT59_tree=null;
        Object FLOAT60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        Object ID64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 0);

        try {
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:63:2: ( ( INT | FLOAT | '(' ! arith1 ')' !| ID ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/praktikum2/praktikum2b.g:63:4: ( INT | FLOAT | '(' ! arith1 ')' !| ID )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(63,4);
            // /home/slaan/git/cip/praktikum2/praktikum2b.g:63:4: ( INT | FLOAT | '(' ! arith1 ')' !| ID )
            int alt10=4;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt10=1;
                }
                break;
            case FLOAT:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:63:5: INT
                    {
                    dbg.location(63,5);
                    INT59=(Token)match(input,INT,FOLLOW_INT_in_arith3426); 
                    INT59_tree = 
                    (Object)adaptor.create(INT59)
                    ;
                    adaptor.addChild(root_0, INT59_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:63:9: FLOAT
                    {
                    dbg.location(63,9);
                    FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_arith3428); 
                    FLOAT60_tree = 
                    (Object)adaptor.create(FLOAT60)
                    ;
                    adaptor.addChild(root_0, FLOAT60_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:63:16: '(' ! arith1 ')' !
                    {
                    dbg.location(63,20);
                    char_literal61=(Token)match(input,28,FOLLOW_28_in_arith3431); 
                    dbg.location(63,22);
                    pushFollow(FOLLOW_arith1_in_arith3435);
                    arith162=arith1();

                    state._fsp--;

                    adaptor.addChild(root_0, arith162.getTree());
                    dbg.location(63,33);
                    char_literal63=(Token)match(input,29,FOLLOW_29_in_arith3437); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/slaan/git/cip/praktikum2/praktikum2b.g:63:36: ID
                    {
                    dbg.location(63,36);
                    ID64=(Token)match(input,ID,FOLLOW_ID_in_arith3442); 
                    ID64_tree = 
                    (Object)adaptor.create(ID64)
                    ;
                    adaptor.addChild(root_0, ID64_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(63, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arith3"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_start34 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_dekla_in_start41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_start46 = new BitSet(new long[]{0x0000005A10834880L});
    public static final BitSet FOLLOW_anweisung_start_in_start53 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_END_in_start58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deklaration_in_dekla70 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_DEKLARATIONSSYMBOL_in_deklaration93 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_deklaration95 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_KOMMA_in_deklaration98 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_deklaration100 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_SEMIKOLON_in_deklaration104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anweisung_in_anweisung_start122 = new BitSet(new long[]{0x0000005A10834082L});
    public static final BitSet FOLLOW_wertzuweisung_in_anweisung144 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_arith1_in_anweisung146 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ifanweisung_in_anweisung148 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_whileanweisung_in_anweisung150 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_read_in_anweisung152 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_print_in_anweisung154 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_vergleich_in_anweisung156 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMIKOLON_in_anweisung159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_wertzuweisung172 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_WERTZUWEISUNG_in_wertzuweisung174 = new BitSet(new long[]{0x0000000010834080L});
    public static final BitSet FOLLOW_zuweisung_in_wertzuweisung176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith1_in_zuweisung196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_zuweisung198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vergleich_in_zuweisung200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ifanweisung212 = new BitSet(new long[]{0x0000000000824080L});
    public static final BitSet FOLLOW_vergleich_in_ifanweisung214 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ifanweisung216 = new BitSet(new long[]{0x0000005B90834080L});
    public static final BitSet FOLLOW_anweisung_start_in_ifanweisung218 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ifanweisung221 = new BitSet(new long[]{0x0000005B10834080L});
    public static final BitSet FOLLOW_anweisung_start_in_ifanweisung223 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ifanweisung227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_whileanweisung247 = new BitSet(new long[]{0x0000000000824080L});
    public static final BitSet FOLLOW_vergleich_in_whileanweisung249 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_whileanweisung251 = new BitSet(new long[]{0x0000005E10834080L});
    public static final BitSet FOLLOW_anweisung_start_in_whileanweisung253 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_whileanweisung255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_read275 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_read277 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_read278 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_read279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_print296 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_print298 = new BitSet(new long[]{0x0000000010834000L});
    public static final BitSet FOLLOW_print2_in_print299 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_print300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith1_in_print2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_print2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vergleich2_in_vergleich332 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VERGLEICHSZEICHEN_in_vergleich334 = new BitSet(new long[]{0x0000000000824080L});
    public static final BitSet FOLLOW_vergleich2_in_vergleich338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith1_in_arithExpr378 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMIKOLON_in_arithExpr380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith2_in_arith1391 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ADDSUBSYM_in_arith1394 = new BitSet(new long[]{0x0000000010034000L});
    public static final BitSet FOLLOW_arith2_in_arith1397 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_arith3_in_arith2408 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_MULDIVSYM_in_arith2411 = new BitSet(new long[]{0x0000000010034000L});
    public static final BitSet FOLLOW_arith3_in_arith2414 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_INT_in_arith3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_arith3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_arith3431 = new BitSet(new long[]{0x0000000010034000L});
    public static final BitSet FOLLOW_arith1_in_arith3435 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_arith3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arith3442 = new BitSet(new long[]{0x0000000000000002L});

}