package output;

// $ANTLR 3.4 /home/slaan/git/cip/testordner/buchstabenGrammar.g 2015-06-15 14:33:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class buchstabenGrammarParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITHMULTT", "A_LET", "B_LET", "COMMENT", "C_LET", "D_LET", "EQUALS", "EQUALSMULTT", "E_LET", "F_LET", "G_LET", "H_LET", "I_LET", "J_LET", "K_LET", "L_LET", "MINUS", "M_LET", "N_LET", "O_LET", "PLUS", "P_LET", "Q_LET", "R_LET", "S_LET", "T_LET", "U_LET", "V_LET", "WORD", "WS", "W_LET", "X_LET", "Y_LET", "Z_LET"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "word", "arithexpr", "arithsingleexpr", "equalsmultexpr", 
    "calcarithexpr", "start", "arithmultexpr", "calcZeile", "letters", "start_all"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public buchstabenGrammarParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public buchstabenGrammarParser(TokenStream input, int port, RecognizerSharedState state) {
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

public buchstabenGrammarParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return buchstabenGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/home/slaan/git/cip/testordner/buchstabenGrammar.g"; }


    public static class start_all_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start_all"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:11:1: start_all : wort1= word arithexpr wort2= word EQUALS wort3= word arithexpr arithexpr arithexpr wort4= word arithexpr wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word arithexpr wort8= word EQUALS wort9= word -> ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3) ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6) ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9) ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7) ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8) ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9) ;
    public final buchstabenGrammarParser.start_all_return start_all() throws RecognitionException {
        buchstabenGrammarParser.start_all_return retval = new buchstabenGrammarParser.start_all_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS2=null;
        Token EQUALS7=null;
        Token EQUALS8=null;
        Token EQUALS9=null;
        Token EQUALS10=null;
        Token EQUALS12=null;
        buchstabenGrammarParser.word_return wort1 =null;

        buchstabenGrammarParser.word_return wort2 =null;

        buchstabenGrammarParser.word_return wort3 =null;

        buchstabenGrammarParser.word_return wort4 =null;

        buchstabenGrammarParser.word_return wort5 =null;

        buchstabenGrammarParser.word_return wort6 =null;

        buchstabenGrammarParser.word_return wort7 =null;

        buchstabenGrammarParser.word_return wort8 =null;

        buchstabenGrammarParser.word_return wort9 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr1 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr3 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr4 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr5 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr6 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr11 =null;


        Object EQUALS2_tree=null;
        Object EQUALS7_tree=null;
        Object EQUALS8_tree=null;
        Object EQUALS9_tree=null;
        Object EQUALS10_tree=null;
        Object EQUALS12_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_arithexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithexpr");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try { dbg.enterRule(getGrammarFileName(), "start_all");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:12:2: (wort1= word arithexpr wort2= word EQUALS wort3= word arithexpr arithexpr arithexpr wort4= word arithexpr wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word arithexpr wort8= word EQUALS wort9= word -> ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3) ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6) ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9) ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7) ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8) ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:12:4: wort1= word arithexpr wort2= word EQUALS wort3= word arithexpr arithexpr arithexpr wort4= word arithexpr wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word arithexpr wort8= word EQUALS wort9= word
            {
            dbg.location(12,9);
            pushFollow(FOLLOW_word_in_start_all38);
            wort1=word();

            state._fsp--;

            stream_word.add(wort1.getTree());
            dbg.location(12,15);
            pushFollow(FOLLOW_arithexpr_in_start_all40);
            arithexpr1=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr1.getTree());
            dbg.location(12,30);
            pushFollow(FOLLOW_word_in_start_all44);
            wort2=word();

            state._fsp--;

            stream_word.add(wort2.getTree());
            dbg.location(12,36);
            EQUALS2=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all46);  
            stream_EQUALS.add(EQUALS2);

            dbg.location(12,48);
            pushFollow(FOLLOW_word_in_start_all50);
            wort3=word();

            state._fsp--;

            stream_word.add(wort3.getTree());
            dbg.location(13,3);
            pushFollow(FOLLOW_arithexpr_in_start_all54);
            arithexpr3=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr3.getTree());
            dbg.location(13,13);
            pushFollow(FOLLOW_arithexpr_in_start_all56);
            arithexpr4=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr4.getTree());
            dbg.location(13,23);
            pushFollow(FOLLOW_arithexpr_in_start_all58);
            arithexpr5=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr5.getTree());
            dbg.location(14,8);
            pushFollow(FOLLOW_word_in_start_all64);
            wort4=word();

            state._fsp--;

            stream_word.add(wort4.getTree());
            dbg.location(14,14);
            pushFollow(FOLLOW_arithexpr_in_start_all66);
            arithexpr6=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr6.getTree());
            dbg.location(14,29);
            pushFollow(FOLLOW_word_in_start_all70);
            wort5=word();

            state._fsp--;

            stream_word.add(wort5.getTree());
            dbg.location(14,35);
            EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all72);  
            stream_EQUALS.add(EQUALS7);

            dbg.location(14,47);
            pushFollow(FOLLOW_word_in_start_all76);
            wort6=word();

            state._fsp--;

            stream_word.add(wort6.getTree());
            dbg.location(15,3);
            EQUALS8=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all80);  
            stream_EQUALS.add(EQUALS8);

            dbg.location(15,10);
            EQUALS9=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all82);  
            stream_EQUALS.add(EQUALS9);

            dbg.location(15,17);
            EQUALS10=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all84);  
            stream_EQUALS.add(EQUALS10);

            dbg.location(16,8);
            pushFollow(FOLLOW_word_in_start_all90);
            wort7=word();

            state._fsp--;

            stream_word.add(wort7.getTree());
            dbg.location(16,14);
            pushFollow(FOLLOW_arithexpr_in_start_all92);
            arithexpr11=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr11.getTree());
            dbg.location(16,29);
            pushFollow(FOLLOW_word_in_start_all96);
            wort8=word();

            state._fsp--;

            stream_word.add(wort8.getTree());
            dbg.location(16,35);
            EQUALS12=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all98);  
            stream_EQUALS.add(EQUALS12);

            dbg.location(16,47);
            pushFollow(FOLLOW_word_in_start_all102);
            wort9=word();

            state._fsp--;

            stream_word.add(wort9.getTree());

            // AST REWRITE
            // elements: wort4, wort5, wort6, wort9, wort8, wort7, arithexpr, wort4, arithexpr, wort2, EQUALS, wort3, wort2, wort5, EQUALS, wort3, EQUALS, arithexpr, EQUALS, arithexpr, arithexpr, EQUALS, wort1, wort7, wort6, wort8, EQUALS, arithexpr, wort1, wort9
            // token labels: 
            // rule labels: wort1, wort3, wort2, wort5, wort4, wort7, wort6, wort9, retval, wort8
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_wort1=new RewriteRuleSubtreeStream(adaptor,"rule wort1",wort1!=null?wort1.tree:null);
            RewriteRuleSubtreeStream stream_wort3=new RewriteRuleSubtreeStream(adaptor,"rule wort3",wort3!=null?wort3.tree:null);
            RewriteRuleSubtreeStream stream_wort2=new RewriteRuleSubtreeStream(adaptor,"rule wort2",wort2!=null?wort2.tree:null);
            RewriteRuleSubtreeStream stream_wort5=new RewriteRuleSubtreeStream(adaptor,"rule wort5",wort5!=null?wort5.tree:null);
            RewriteRuleSubtreeStream stream_wort4=new RewriteRuleSubtreeStream(adaptor,"rule wort4",wort4!=null?wort4.tree:null);
            RewriteRuleSubtreeStream stream_wort7=new RewriteRuleSubtreeStream(adaptor,"rule wort7",wort7!=null?wort7.tree:null);
            RewriteRuleSubtreeStream stream_wort6=new RewriteRuleSubtreeStream(adaptor,"rule wort6",wort6!=null?wort6.tree:null);
            RewriteRuleSubtreeStream stream_wort9=new RewriteRuleSubtreeStream(adaptor,"rule wort9",wort9!=null?wort9.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_wort8=new RewriteRuleSubtreeStream(adaptor,"rule wort8",wort8!=null?wort8.tree:null);

            root_0 = (Object)adaptor.nil();
            // 17:3: -> ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3) ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6) ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9) ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7) ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8) ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9)
            {
                dbg.location(17,6);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:17:6: ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(17,8);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                dbg.location(17,15);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:17:15: ^( arithexpr $wort1 $wort2)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(17,17);
                root_2 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_2);

                dbg.location(17,28);
                adaptor.addChild(root_2, stream_wort1.nextTree());
                dbg.location(17,35);
                adaptor.addChild(root_2, stream_wort2.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(17,43);
                adaptor.addChild(root_1, stream_wort3.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(18,3);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:18:3: ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(18,5);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                dbg.location(18,12);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:18:12: ^( arithexpr $wort4 $wort5)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(18,14);
                root_2 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_2);

                dbg.location(18,25);
                adaptor.addChild(root_2, stream_wort4.nextTree());
                dbg.location(18,32);
                adaptor.addChild(root_2, stream_wort5.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(18,40);
                adaptor.addChild(root_1, stream_wort6.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(19,3);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:19:3: ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(19,5);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                dbg.location(19,12);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:19:12: ^( arithexpr $wort7 $wort8)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(19,14);
                root_2 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_2);

                dbg.location(19,25);
                adaptor.addChild(root_2, stream_wort7.nextTree());
                dbg.location(19,32);
                adaptor.addChild(root_2, stream_wort8.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(19,40);
                adaptor.addChild(root_1, stream_wort9.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(20,3);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:20:3: ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(20,5);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                dbg.location(20,12);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:20:12: ^( arithexpr $wort1 $wort4)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(20,14);
                root_2 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_2);

                dbg.location(20,25);
                adaptor.addChild(root_2, stream_wort1.nextTree());
                dbg.location(20,32);
                adaptor.addChild(root_2, stream_wort4.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(20,40);
                adaptor.addChild(root_1, stream_wort7.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(21,3);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:21:3: ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(21,5);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                dbg.location(21,12);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:21:12: ^( arithexpr $wort2 $wort5)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(21,14);
                root_2 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_2);

                dbg.location(21,25);
                adaptor.addChild(root_2, stream_wort2.nextTree());
                dbg.location(21,32);
                adaptor.addChild(root_2, stream_wort5.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(21,40);
                adaptor.addChild(root_1, stream_wort8.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(22,3);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:22:3: ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,5);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                dbg.location(22,12);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:22:12: ^( arithexpr $wort3 $wort6)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(22,14);
                root_2 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_2);

                dbg.location(22,25);
                adaptor.addChild(root_2, stream_wort3.nextTree());
                dbg.location(22,32);
                adaptor.addChild(root_2, stream_wort6.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(22,40);
                adaptor.addChild(root_1, stream_wort9.nextTree());

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
        dbg.location(23, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start_all");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start_all"


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:25:1: start : calcarithexpr equalsmultexpr calcZeile -> ^( EQUALSMULTT calcarithexpr calcZeile ) ;
    public final buchstabenGrammarParser.start_return start() throws RecognitionException {
        buchstabenGrammarParser.start_return retval = new buchstabenGrammarParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.calcarithexpr_return calcarithexpr13 =null;

        buchstabenGrammarParser.equalsmultexpr_return equalsmultexpr14 =null;

        buchstabenGrammarParser.calcZeile_return calcZeile15 =null;


        RewriteRuleSubtreeStream stream_calcarithexpr=new RewriteRuleSubtreeStream(adaptor,"rule calcarithexpr");
        RewriteRuleSubtreeStream stream_equalsmultexpr=new RewriteRuleSubtreeStream(adaptor,"rule equalsmultexpr");
        RewriteRuleSubtreeStream stream_calcZeile=new RewriteRuleSubtreeStream(adaptor,"rule calcZeile");
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:25:8: ( calcarithexpr equalsmultexpr calcZeile -> ^( EQUALSMULTT calcarithexpr calcZeile ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:25:11: calcarithexpr equalsmultexpr calcZeile
            {
            dbg.location(25,11);
            pushFollow(FOLLOW_calcarithexpr_in_start231);
            calcarithexpr13=calcarithexpr();

            state._fsp--;

            stream_calcarithexpr.add(calcarithexpr13.getTree());
            dbg.location(25,25);
            pushFollow(FOLLOW_equalsmultexpr_in_start233);
            equalsmultexpr14=equalsmultexpr();

            state._fsp--;

            stream_equalsmultexpr.add(equalsmultexpr14.getTree());
            dbg.location(25,40);
            pushFollow(FOLLOW_calcZeile_in_start235);
            calcZeile15=calcZeile();

            state._fsp--;

            stream_calcZeile.add(calcZeile15.getTree());

            // AST REWRITE
            // elements: calcarithexpr, calcZeile
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 25:50: -> ^( EQUALSMULTT calcarithexpr calcZeile )
            {
                dbg.location(25,53);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:25:53: ^( EQUALSMULTT calcarithexpr calcZeile )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(25,55);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EQUALSMULTT, "EQUALSMULTT")
                , root_1);

                dbg.location(25,67);
                adaptor.addChild(root_1, stream_calcarithexpr.nextTree());
                dbg.location(25,81);
                adaptor.addChild(root_1, stream_calcZeile.nextTree());

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
        dbg.location(25, 90);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class calcZeile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "calcZeile"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:27:1: calcZeile : arithsingleexpr EQUALS word -> ^( EQUALS arithsingleexpr word ) ;
    public final buchstabenGrammarParser.calcZeile_return calcZeile() throws RecognitionException {
        buchstabenGrammarParser.calcZeile_return retval = new buchstabenGrammarParser.calcZeile_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS17=null;
        buchstabenGrammarParser.arithsingleexpr_return arithsingleexpr16 =null;

        buchstabenGrammarParser.word_return word18 =null;


        Object EQUALS17_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_arithsingleexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithsingleexpr");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try { dbg.enterRule(getGrammarFileName(), "calcZeile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:27:12: ( arithsingleexpr EQUALS word -> ^( EQUALS arithsingleexpr word ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:27:14: arithsingleexpr EQUALS word
            {
            dbg.location(27,14);
            pushFollow(FOLLOW_arithsingleexpr_in_calcZeile254);
            arithsingleexpr16=arithsingleexpr();

            state._fsp--;

            stream_arithsingleexpr.add(arithsingleexpr16.getTree());
            dbg.location(27,30);
            EQUALS17=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_calcZeile256);  
            stream_EQUALS.add(EQUALS17);

            dbg.location(27,37);
            pushFollow(FOLLOW_word_in_calcZeile258);
            word18=word();

            state._fsp--;

            stream_word.add(word18.getTree());

            // AST REWRITE
            // elements: word, EQUALS, arithsingleexpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:42: -> ^( EQUALS arithsingleexpr word )
            {
                dbg.location(27,45);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:27:45: ^( EQUALS arithsingleexpr word )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(27,47);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                dbg.location(27,54);
                adaptor.addChild(root_1, stream_arithsingleexpr.nextTree());
                dbg.location(27,70);
                adaptor.addChild(root_1, stream_word.nextTree());

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
        dbg.location(27, 74);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "calcZeile");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "calcZeile"


    public static class arithsingleexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithsingleexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:29:1: arithsingleexpr : word arithexpr word -> ^( arithexpr word word ) ;
    public final buchstabenGrammarParser.arithsingleexpr_return arithsingleexpr() throws RecognitionException {
        buchstabenGrammarParser.arithsingleexpr_return retval = new buchstabenGrammarParser.arithsingleexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.word_return word19 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr20 =null;

        buchstabenGrammarParser.word_return word21 =null;


        RewriteRuleSubtreeStream stream_arithexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithexpr");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try { dbg.enterRule(getGrammarFileName(), "arithsingleexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:30:2: ( word arithexpr word -> ^( arithexpr word word ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:30:4: word arithexpr word
            {
            dbg.location(30,4);
            pushFollow(FOLLOW_word_in_arithsingleexpr277);
            word19=word();

            state._fsp--;

            stream_word.add(word19.getTree());
            dbg.location(30,9);
            pushFollow(FOLLOW_arithexpr_in_arithsingleexpr279);
            arithexpr20=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr20.getTree());
            dbg.location(30,19);
            pushFollow(FOLLOW_word_in_arithsingleexpr281);
            word21=word();

            state._fsp--;

            stream_word.add(word21.getTree());

            // AST REWRITE
            // elements: arithexpr, word, word
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:24: -> ^( arithexpr word word )
            {
                dbg.location(30,27);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:30:27: ^( arithexpr word word )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(30,29);
                root_1 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_1);

                dbg.location(30,39);
                adaptor.addChild(root_1, stream_word.nextTree());
                dbg.location(30,44);
                adaptor.addChild(root_1, stream_word.nextTree());

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
        dbg.location(30, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithsingleexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arithsingleexpr"


    public static class calcarithexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "calcarithexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:32:1: calcarithexpr : calcZeile arithmultexpr calcZeile -> ^( ARITHMULTT calcZeile calcZeile ) ;
    public final buchstabenGrammarParser.calcarithexpr_return calcarithexpr() throws RecognitionException {
        buchstabenGrammarParser.calcarithexpr_return retval = new buchstabenGrammarParser.calcarithexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.calcZeile_return calcZeile22 =null;

        buchstabenGrammarParser.arithmultexpr_return arithmultexpr23 =null;

        buchstabenGrammarParser.calcZeile_return calcZeile24 =null;


        RewriteRuleSubtreeStream stream_arithmultexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithmultexpr");
        RewriteRuleSubtreeStream stream_calcZeile=new RewriteRuleSubtreeStream(adaptor,"rule calcZeile");
        try { dbg.enterRule(getGrammarFileName(), "calcarithexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:33:2: ( calcZeile arithmultexpr calcZeile -> ^( ARITHMULTT calcZeile calcZeile ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:33:4: calcZeile arithmultexpr calcZeile
            {
            dbg.location(33,4);
            pushFollow(FOLLOW_calcZeile_in_calcarithexpr300);
            calcZeile22=calcZeile();

            state._fsp--;

            stream_calcZeile.add(calcZeile22.getTree());
            dbg.location(33,14);
            pushFollow(FOLLOW_arithmultexpr_in_calcarithexpr302);
            arithmultexpr23=arithmultexpr();

            state._fsp--;

            stream_arithmultexpr.add(arithmultexpr23.getTree());
            dbg.location(33,28);
            pushFollow(FOLLOW_calcZeile_in_calcarithexpr304);
            calcZeile24=calcZeile();

            state._fsp--;

            stream_calcZeile.add(calcZeile24.getTree());

            // AST REWRITE
            // elements: calcZeile, calcZeile
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 33:38: -> ^( ARITHMULTT calcZeile calcZeile )
            {
                dbg.location(33,41);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:33:41: ^( ARITHMULTT calcZeile calcZeile )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(33,43);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARITHMULTT, "ARITHMULTT")
                , root_1);

                dbg.location(33,54);
                adaptor.addChild(root_1, stream_calcZeile.nextTree());
                dbg.location(33,64);
                adaptor.addChild(root_1, stream_calcZeile.nextTree());

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
        dbg.location(33, 73);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "calcarithexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "calcarithexpr"


    public static class arithmultexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmultexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:35:1: arithmultexpr : arithexpr arithexpr arithexpr ;
    public final buchstabenGrammarParser.arithmultexpr_return arithmultexpr() throws RecognitionException {
        buchstabenGrammarParser.arithmultexpr_return retval = new buchstabenGrammarParser.arithmultexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.arithexpr_return arithexpr25 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr26 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr27 =null;



        try { dbg.enterRule(getGrammarFileName(), "arithmultexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:36:2: ( arithexpr arithexpr arithexpr )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:36:4: arithexpr arithexpr arithexpr
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(36,4);
            pushFollow(FOLLOW_arithexpr_in_arithmultexpr323);
            arithexpr25=arithexpr();

            state._fsp--;

            adaptor.addChild(root_0, arithexpr25.getTree());
            dbg.location(36,14);
            pushFollow(FOLLOW_arithexpr_in_arithmultexpr325);
            arithexpr26=arithexpr();

            state._fsp--;

            adaptor.addChild(root_0, arithexpr26.getTree());
            dbg.location(36,24);
            pushFollow(FOLLOW_arithexpr_in_arithmultexpr327);
            arithexpr27=arithexpr();

            state._fsp--;

            adaptor.addChild(root_0, arithexpr27.getTree());

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
        dbg.location(36, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithmultexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arithmultexpr"


    public static class equalsmultexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalsmultexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:38:1: equalsmultexpr : EQUALS EQUALS EQUALS ;
    public final buchstabenGrammarParser.equalsmultexpr_return equalsmultexpr() throws RecognitionException {
        buchstabenGrammarParser.equalsmultexpr_return retval = new buchstabenGrammarParser.equalsmultexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS28=null;
        Token EQUALS29=null;
        Token EQUALS30=null;

        Object EQUALS28_tree=null;
        Object EQUALS29_tree=null;
        Object EQUALS30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equalsmultexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:39:2: ( EQUALS EQUALS EQUALS )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:39:4: EQUALS EQUALS EQUALS
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(39,4);
            EQUALS28=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr337); 
            EQUALS28_tree = 
            (Object)adaptor.create(EQUALS28)
            ;
            adaptor.addChild(root_0, EQUALS28_tree);

            dbg.location(39,11);
            EQUALS29=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr339); 
            EQUALS29_tree = 
            (Object)adaptor.create(EQUALS29)
            ;
            adaptor.addChild(root_0, EQUALS29_tree);

            dbg.location(39,18);
            EQUALS30=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr341); 
            EQUALS30_tree = 
            (Object)adaptor.create(EQUALS30)
            ;
            adaptor.addChild(root_0, EQUALS30_tree);


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
        dbg.location(39, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalsmultexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equalsmultexpr"


    public static class arithexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:41:1: arithexpr : ( PLUS | MINUS ) ;
    public final buchstabenGrammarParser.arithexpr_return arithexpr() throws RecognitionException {
        buchstabenGrammarParser.arithexpr_return retval = new buchstabenGrammarParser.arithexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arithexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:41:11: ( ( PLUS | MINUS ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(41,11);
            set31=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set31)
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
        dbg.location(41, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arithexpr"


    public static class word_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "word"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:49:1: word : ( letters )+ -> ^( WORD ( letters )+ ) ;
    public final buchstabenGrammarParser.word_return word() throws RecognitionException {
        buchstabenGrammarParser.word_return retval = new buchstabenGrammarParser.word_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.letters_return letters32 =null;


        RewriteRuleSubtreeStream stream_letters=new RewriteRuleSubtreeStream(adaptor,"rule letters");
        try { dbg.enterRule(getGrammarFileName(), "word");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:49:6: ( ( letters )+ -> ^( WORD ( letters )+ ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:49:8: ( letters )+
            {
            dbg.location(49,8);
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:49:8: ( letters )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= A_LET && LA1_0 <= B_LET)||(LA1_0 >= C_LET && LA1_0 <= D_LET)||(LA1_0 >= E_LET && LA1_0 <= L_LET)||(LA1_0 >= M_LET && LA1_0 <= O_LET)||(LA1_0 >= P_LET && LA1_0 <= V_LET)||(LA1_0 >= W_LET && LA1_0 <= Z_LET)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:49:8: letters
            	    {
            	    dbg.location(49,8);
            	    pushFollow(FOLLOW_letters_in_word388);
            	    letters32=letters();

            	    state._fsp--;

            	    stream_letters.add(letters32.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: letters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:17: -> ^( WORD ( letters )+ )
            {
                dbg.location(49,20);
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:49:20: ^( WORD ( letters )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(49,22);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WORD, "WORD")
                , root_1);

                dbg.location(49,27);
                if ( !(stream_letters.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_letters.hasNext() ) {
                    dbg.location(49,27);
                    adaptor.addChild(root_1, stream_letters.nextTree());

                }
                stream_letters.reset();

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
        dbg.location(49, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "word");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "word"


    public static class letters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "letters"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:51:1: letters : ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) ;
    public final buchstabenGrammarParser.letters_return letters() throws RecognitionException {
        buchstabenGrammarParser.letters_return retval = new buchstabenGrammarParser.letters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set33=null;

        Object set33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "letters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:51:9: ( ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(51,9);
            set33=(Token)input.LT(1);

            if ( (input.LA(1) >= A_LET && input.LA(1) <= B_LET)||(input.LA(1) >= C_LET && input.LA(1) <= D_LET)||(input.LA(1) >= E_LET && input.LA(1) <= L_LET)||(input.LA(1) >= M_LET && input.LA(1) <= O_LET)||(input.LA(1) >= P_LET && input.LA(1) <= V_LET)||(input.LA(1) >= W_LET && input.LA(1) <= Z_LET) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set33)
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
        dbg.location(52, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "letters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "letters"

    // Delegated rules


 

    public static final BitSet FOLLOW_word_in_start_all38 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_start_all40 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all44 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_start_all46 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all50 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_start_all54 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_start_all56 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_start_all58 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all64 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_start_all66 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all70 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_start_all72 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all76 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_start_all80 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_start_all82 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_start_all84 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all90 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_start_all92 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all96 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_start_all98 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_start_all102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calcarithexpr_in_start231 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_equalsmultexpr_in_start233 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_calcZeile_in_start235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithsingleexpr_in_calcZeile254 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_calcZeile256 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_calcZeile258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_word_in_arithsingleexpr277 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_arithsingleexpr279 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_word_in_arithsingleexpr281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calcZeile_in_calcarithexpr300 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithmultexpr_in_calcarithexpr302 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_calcZeile_in_calcarithexpr304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithexpr_in_arithmultexpr323 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_arithmultexpr325 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_arithexpr_in_arithmultexpr327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr337 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr339 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letters_in_word388 = new BitSet(new long[]{0x0000003CFEEFF362L});

}