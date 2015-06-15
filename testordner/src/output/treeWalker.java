package output;

// $ANTLR 3.4 /home/slaan/git/cip/testordner/treeWalker.g 2015-06-15 14:33:09

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class treeWalker extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITHMULTT", "A_LET", "B_LET", "COMMENT", "C_LET", "D_LET", "EQUALS", "EQUALSMULTT", "E_LET", "F_LET", "G_LET", "H_LET", "I_LET", "J_LET", "K_LET", "L_LET", "MINUS", "M_LET", "N_LET", "O_LET", "PLUS", "P_LET", "Q_LET", "R_LET", "S_LET", "T_LET", "U_LET", "V_LET", "WORD", "WS", "W_LET", "X_LET", "Y_LET", "Z_LET", "'('", "')'", "'+'", "'-'", "'WORD'"
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
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "letters", "start", "subtree", "wordtree"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public treeWalker(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public treeWalker(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
        setDebugListener(proxy);
        setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
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

public treeWalker(TreeNodeStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return treeWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/slaan/git/cip/testordner/treeWalker.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/slaan/git/cip/testordner/treeWalker.g:7:1: start : ( subtree )* ;
    public final treeWalker.start_return start() throws RecognitionException {
        treeWalker.start_return retval = new treeWalker.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        treeWalker.subtree_return subtree1 =null;



        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 0);

        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:7:7: ( ( subtree )* )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/treeWalker.g:7:9: ( subtree )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(7,9);
            // /home/slaan/git/cip/testordner/treeWalker.g:7:9: ( subtree )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==38) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/testordner/treeWalker.g:7:9: subtree
            	    {
            	    dbg.location(7,9);
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_subtree_in_start31);
            	    subtree1=subtree();

            	    state._fsp--;

            	    adaptor.addChild(root_0, subtree1.getTree());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(7, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class subtree_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subtree"
    // /home/slaan/git/cip/testordner/treeWalker.g:9:1: subtree : ( '(' EQUALS '(' '+' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort1 $wort2) $wort3) | '(' EQUALS '(' '-' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort3 $wort2) $wort1) );
    public final treeWalker.subtree_return subtree() throws RecognitionException {
        treeWalker.subtree_return retval = new treeWalker.subtree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal2=null;
        CommonTree EQUALS3=null;
        CommonTree char_literal4=null;
        CommonTree char_literal5=null;
        CommonTree char_literal6=null;
        CommonTree char_literal7=null;
        CommonTree char_literal8=null;
        CommonTree EQUALS9=null;
        CommonTree char_literal10=null;
        CommonTree char_literal11=null;
        CommonTree char_literal12=null;
        CommonTree char_literal13=null;
        treeWalker.wordtree_return wort1 =null;

        treeWalker.wordtree_return wort2 =null;

        treeWalker.wordtree_return wort3 =null;


        CommonTree char_literal2_tree=null;
        CommonTree EQUALS3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree EQUALS9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleNodeStream stream_38=new RewriteRuleNodeStream(adaptor,"token 38");
        RewriteRuleNodeStream stream_39=new RewriteRuleNodeStream(adaptor,"token 39");
        RewriteRuleNodeStream stream_40=new RewriteRuleNodeStream(adaptor,"token 40");
        RewriteRuleNodeStream stream_41=new RewriteRuleNodeStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_wordtree=new RewriteRuleSubtreeStream(adaptor,"rule wordtree");
        try { dbg.enterRule(getGrammarFileName(), "subtree");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:9:9: ( '(' EQUALS '(' '+' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort1 $wort2) $wort3) | '(' EQUALS '(' '-' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort3 $wort2) $wort1) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EQUALS) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==38) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==40) ) {
                            alt2=1;
                        }
                        else if ( (LA2_3==41) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/slaan/git/cip/testordner/treeWalker.g:9:11: '(' EQUALS '(' '+' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')'
                    {
                    dbg.location(9,11);
                    _last = (CommonTree)input.LT(1);
                    char_literal2=(CommonTree)match(input,38,FOLLOW_38_in_subtree40);  
                    stream_38.add(char_literal2);

                    dbg.location(9,15);
                    _last = (CommonTree)input.LT(1);
                    EQUALS3=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_subtree42);  
                    stream_EQUALS.add(EQUALS3);

                    dbg.location(9,22);
                    _last = (CommonTree)input.LT(1);
                    char_literal4=(CommonTree)match(input,38,FOLLOW_38_in_subtree44);  
                    stream_38.add(char_literal4);

                    dbg.location(9,26);
                    _last = (CommonTree)input.LT(1);
                    char_literal5=(CommonTree)match(input,40,FOLLOW_40_in_subtree46);  
                    stream_40.add(char_literal5);

                    dbg.location(9,35);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wordtree_in_subtree50);
                    wort1=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort1.getTree());
                    dbg.location(9,50);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wordtree_in_subtree54);
                    wort2=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort2.getTree());
                    dbg.location(9,60);
                    _last = (CommonTree)input.LT(1);
                    char_literal6=(CommonTree)match(input,39,FOLLOW_39_in_subtree56);  
                    stream_39.add(char_literal6);

                    dbg.location(9,69);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wordtree_in_subtree60);
                    wort3=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort3.getTree());
                    dbg.location(9,80);
                    _last = (CommonTree)input.LT(1);
                    char_literal7=(CommonTree)match(input,39,FOLLOW_39_in_subtree63);  
                    stream_39.add(char_literal7);


                    // AST REWRITE
                    // elements: wort2, wort1, EQUALS, wort3
                    // token labels: 
                    // rule labels: wort1, wort3, wort2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_wort1=new RewriteRuleSubtreeStream(adaptor,"rule wort1",wort1!=null?wort1.tree:null);
                    RewriteRuleSubtreeStream stream_wort3=new RewriteRuleSubtreeStream(adaptor,"rule wort3",wort3!=null?wort3.tree:null);
                    RewriteRuleSubtreeStream stream_wort2=new RewriteRuleSubtreeStream(adaptor,"rule wort2",wort2!=null?wort2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 10:4: -> ^( EQUALS ^( PLUS $wort1 $wort2) $wort3)
                    {
                        dbg.location(10,7);
                        // /home/slaan/git/cip/testordner/treeWalker.g:10:7: ^( EQUALS ^( PLUS $wort1 $wort2) $wort3)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(10,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQUALS.nextNode()
                        , root_1);

                        dbg.location(10,16);
                        // /home/slaan/git/cip/testordner/treeWalker.g:10:16: ^( PLUS $wort1 $wort2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(10,18);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        dbg.location(10,24);
                        adaptor.addChild(root_2, stream_wort1.nextTree());
                        dbg.location(10,31);
                        adaptor.addChild(root_2, stream_wort2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(10,39);
                        adaptor.addChild(root_1, stream_wort3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/slaan/git/cip/testordner/treeWalker.g:11:4: '(' EQUALS '(' '-' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')'
                    {
                    dbg.location(11,4);
                    _last = (CommonTree)input.LT(1);
                    char_literal8=(CommonTree)match(input,38,FOLLOW_38_in_subtree91);  
                    stream_38.add(char_literal8);

                    dbg.location(11,8);
                    _last = (CommonTree)input.LT(1);
                    EQUALS9=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_subtree93);  
                    stream_EQUALS.add(EQUALS9);

                    dbg.location(11,15);
                    _last = (CommonTree)input.LT(1);
                    char_literal10=(CommonTree)match(input,38,FOLLOW_38_in_subtree95);  
                    stream_38.add(char_literal10);

                    dbg.location(11,19);
                    _last = (CommonTree)input.LT(1);
                    char_literal11=(CommonTree)match(input,41,FOLLOW_41_in_subtree97);  
                    stream_41.add(char_literal11);

                    dbg.location(11,28);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wordtree_in_subtree101);
                    wort1=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort1.getTree());
                    dbg.location(11,43);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wordtree_in_subtree105);
                    wort2=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort2.getTree());
                    dbg.location(11,53);
                    _last = (CommonTree)input.LT(1);
                    char_literal12=(CommonTree)match(input,39,FOLLOW_39_in_subtree107);  
                    stream_39.add(char_literal12);

                    dbg.location(11,62);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_wordtree_in_subtree111);
                    wort3=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort3.getTree());
                    dbg.location(11,73);
                    _last = (CommonTree)input.LT(1);
                    char_literal13=(CommonTree)match(input,39,FOLLOW_39_in_subtree114);  
                    stream_39.add(char_literal13);


                    // AST REWRITE
                    // elements: wort1, EQUALS, wort3, wort2
                    // token labels: 
                    // rule labels: wort1, wort3, wort2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_wort1=new RewriteRuleSubtreeStream(adaptor,"rule wort1",wort1!=null?wort1.tree:null);
                    RewriteRuleSubtreeStream stream_wort3=new RewriteRuleSubtreeStream(adaptor,"rule wort3",wort3!=null?wort3.tree:null);
                    RewriteRuleSubtreeStream stream_wort2=new RewriteRuleSubtreeStream(adaptor,"rule wort2",wort2!=null?wort2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 12:4: -> ^( EQUALS ^( PLUS $wort3 $wort2) $wort1)
                    {
                        dbg.location(12,7);
                        // /home/slaan/git/cip/testordner/treeWalker.g:12:7: ^( EQUALS ^( PLUS $wort3 $wort2) $wort1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(12,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQUALS.nextNode()
                        , root_1);

                        dbg.location(12,16);
                        // /home/slaan/git/cip/testordner/treeWalker.g:12:16: ^( PLUS $wort3 $wort2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(12,18);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        dbg.location(12,24);
                        adaptor.addChild(root_2, stream_wort3.nextTree());
                        dbg.location(12,31);
                        adaptor.addChild(root_2, stream_wort2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(12,39);
                        adaptor.addChild(root_1, stream_wort1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "subtree");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "subtree"


    public static class wordtree_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wordtree"
    // /home/slaan/git/cip/testordner/treeWalker.g:14:1: wordtree : '(' 'WORD' ( letters )+ ')' -> ^( 'WORD' ( letters )+ ) ;
    public final treeWalker.wordtree_return wordtree() throws RecognitionException {
        treeWalker.wordtree_return retval = new treeWalker.wordtree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal14=null;
        CommonTree string_literal15=null;
        CommonTree char_literal17=null;
        treeWalker.letters_return letters16 =null;


        CommonTree char_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree char_literal17_tree=null;
        RewriteRuleNodeStream stream_38=new RewriteRuleNodeStream(adaptor,"token 38");
        RewriteRuleNodeStream stream_39=new RewriteRuleNodeStream(adaptor,"token 39");
        RewriteRuleNodeStream stream_42=new RewriteRuleNodeStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_letters=new RewriteRuleSubtreeStream(adaptor,"rule letters");
        try { dbg.enterRule(getGrammarFileName(), "wordtree");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:15:2: ( '(' 'WORD' ( letters )+ ')' -> ^( 'WORD' ( letters )+ ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/treeWalker.g:15:4: '(' 'WORD' ( letters )+ ')'
            {
            dbg.location(15,4);
            _last = (CommonTree)input.LT(1);
            char_literal14=(CommonTree)match(input,38,FOLLOW_38_in_wordtree147);  
            stream_38.add(char_literal14);

            dbg.location(15,8);
            _last = (CommonTree)input.LT(1);
            string_literal15=(CommonTree)match(input,42,FOLLOW_42_in_wordtree149);  
            stream_42.add(string_literal15);

            dbg.location(15,15);
            // /home/slaan/git/cip/testordner/treeWalker.g:15:15: ( letters )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= A_LET && LA3_0 <= B_LET)||(LA3_0 >= C_LET && LA3_0 <= D_LET)||(LA3_0 >= E_LET && LA3_0 <= L_LET)||(LA3_0 >= M_LET && LA3_0 <= O_LET)||(LA3_0 >= P_LET && LA3_0 <= V_LET)||(LA3_0 >= W_LET && LA3_0 <= Z_LET)) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/slaan/git/cip/testordner/treeWalker.g:15:15: letters
            	    {
            	    dbg.location(15,15);
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_letters_in_wordtree151);
            	    letters16=letters();

            	    state._fsp--;

            	    stream_letters.add(letters16.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(15,24);
            _last = (CommonTree)input.LT(1);
            char_literal17=(CommonTree)match(input,39,FOLLOW_39_in_wordtree154);  
            stream_39.add(char_literal17);


            // AST REWRITE
            // elements: letters, 42
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 15:28: -> ^( 'WORD' ( letters )+ )
            {
                dbg.location(15,31);
                // /home/slaan/git/cip/testordner/treeWalker.g:15:31: ^( 'WORD' ( letters )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(15,33);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_42.nextNode()
                , root_1);

                dbg.location(15,40);
                if ( !(stream_letters.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_letters.hasNext() ) {
                    dbg.location(15,40);
                    adaptor.addChild(root_1, stream_letters.nextTree());

                }
                stream_letters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wordtree");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wordtree"


    public static class letters_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "letters"
    // /home/slaan/git/cip/testordner/treeWalker.g:17:1: letters : ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) ;
    public final treeWalker.letters_return letters() throws RecognitionException {
        treeWalker.letters_return retval = new treeWalker.letters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set18=null;

        CommonTree set18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "letters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:17:9: ( ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) )
            dbg.enterAlt(1);

            // /home/slaan/git/cip/testordner/treeWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(17,9);
            _last = (CommonTree)input.LT(1);
            set18=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= A_LET && input.LA(1) <= B_LET)||(input.LA(1) >= C_LET && input.LA(1) <= D_LET)||(input.LA(1) >= E_LET && input.LA(1) <= L_LET)||(input.LA(1) >= M_LET && input.LA(1) <= O_LET)||(input.LA(1) >= P_LET && input.LA(1) <= V_LET)||(input.LA(1) >= W_LET && input.LA(1) <= Z_LET) ) {
                input.consume();
                set18_tree = (CommonTree)adaptor.dupNode(set18);


                adaptor.addChild(root_0, set18_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(18, 63);

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


 

    public static final BitSet FOLLOW_subtree_in_start31 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_subtree40 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_subtree42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_subtree44 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_subtree46 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_wordtree_in_subtree50 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_wordtree_in_subtree54 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_subtree56 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_wordtree_in_subtree60 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_subtree63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_subtree91 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_subtree93 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_subtree95 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_subtree97 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_wordtree_in_subtree101 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_wordtree_in_subtree105 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_subtree107 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_wordtree_in_subtree111 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_subtree114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_wordtree147 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_wordtree149 = new BitSet(new long[]{0x0000003CFEEFF360L});
    public static final BitSet FOLLOW_letters_in_wordtree151 = new BitSet(new long[]{0x000000BCFEEFF360L});
    public static final BitSet FOLLOW_39_in_wordtree154 = new BitSet(new long[]{0x0000000000000002L});

}