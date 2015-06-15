// $ANTLR 3.4 /home/slaan/git/cip/praktikum3/minusgen.g 2015-06-15 16:13:47

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class minusgen extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public minusgen(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public minusgen(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return minusgen.tokenNames; }
    public String getGrammarFileName() { return "/home/slaan/git/cip/praktikum3/minusgen.g"; }


    public static class start_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/slaan/git/cip/praktikum3/minusgen.g:7:1: start : ( subtree )* ;
    public final minusgen.start_return start() throws RecognitionException {
        minusgen.start_return retval = new minusgen.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        minusgen.subtree_return subtree1 =null;



        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:7:7: ( ( subtree )* )
            // /home/slaan/git/cip/praktikum3/minusgen.g:7:9: ( subtree )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/slaan/git/cip/praktikum3/minusgen.g:7:9: ( subtree )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EQUALS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum3/minusgen.g:7:9: subtree
            	    {
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
        return retval;
    }
    // $ANTLR end "start"


    public static class subtree_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subtree"
    // /home/slaan/git/cip/praktikum3/minusgen.g:9:1: subtree : ( plustree | minustree );
    public final minusgen.subtree_return subtree() throws RecognitionException {
        minusgen.subtree_return retval = new minusgen.subtree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        minusgen.plustree_return plustree2 =null;

        minusgen.minustree_return minustree3 =null;



        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:9:9: ( plustree | minustree )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EQUALS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==PLUS) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==MINUS) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/slaan/git/cip/praktikum3/minusgen.g:9:11: plustree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_plustree_in_subtree40);
                    plustree2=plustree();

                    state._fsp--;

                    adaptor.addChild(root_0, plustree2.getTree());


                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum3/minusgen.g:9:20: minustree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_minustree_in_subtree42);
                    minustree3=minustree();

                    state._fsp--;

                    adaptor.addChild(root_0, minustree3.getTree());


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
        return retval;
    }
    // $ANTLR end "subtree"


    public static class plustree_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "plustree"
    // /home/slaan/git/cip/praktikum3/minusgen.g:11:1: plustree : ^( EQUALS ^( PLUS wordtree wordtree ) wordtree ) ;
    public final minusgen.plustree_return plustree() throws RecognitionException {
        minusgen.plustree_return retval = new minusgen.plustree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS4=null;
        CommonTree PLUS5=null;
        minusgen.wordtree_return wordtree6 =null;

        minusgen.wordtree_return wordtree7 =null;

        minusgen.wordtree_return wordtree8 =null;


        CommonTree EQUALS4_tree=null;
        CommonTree PLUS5_tree=null;

        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:11:9: ( ^( EQUALS ^( PLUS wordtree wordtree ) wordtree ) )
            // /home/slaan/git/cip/praktikum3/minusgen.g:11:12: ^( EQUALS ^( PLUS wordtree wordtree ) wordtree )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQUALS4=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_plustree51); 
            EQUALS4_tree = (CommonTree)adaptor.dupNode(EQUALS4);


            root_1 = (CommonTree)adaptor.becomeRoot(EQUALS4_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PLUS5=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_plustree54); 
            PLUS5_tree = (CommonTree)adaptor.dupNode(PLUS5);


            root_2 = (CommonTree)adaptor.becomeRoot(PLUS5_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_plustree56);
            wordtree6=wordtree();

            state._fsp--;

            adaptor.addChild(root_2, wordtree6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_plustree58);
            wordtree7=wordtree();

            state._fsp--;

            adaptor.addChild(root_2, wordtree7.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_plustree61);
            wordtree8=wordtree();

            state._fsp--;

            adaptor.addChild(root_1, wordtree8.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
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
        return retval;
    }
    // $ANTLR end "plustree"


    public static class minustree_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minustree"
    // /home/slaan/git/cip/praktikum3/minusgen.g:13:1: minustree : ^( EQUALS ^( MINUS l1= wordtree l2= wordtree ) l3= wordtree ) -> ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1) ;
    public final minusgen.minustree_return minustree() throws RecognitionException {
        minusgen.minustree_return retval = new minusgen.minustree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS9=null;
        CommonTree MINUS10=null;
        minusgen.wordtree_return l1 =null;

        minusgen.wordtree_return l2 =null;

        minusgen.wordtree_return l3 =null;


        CommonTree EQUALS9_tree=null;
        CommonTree MINUS10_tree=null;
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_wordtree=new RewriteRuleSubtreeStream(adaptor,"rule wordtree");
        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:13:10: ( ^( EQUALS ^( MINUS l1= wordtree l2= wordtree ) l3= wordtree ) -> ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1) )
            // /home/slaan/git/cip/praktikum3/minusgen.g:13:13: ^( EQUALS ^( MINUS l1= wordtree l2= wordtree ) l3= wordtree )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQUALS9=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_minustree74);  
            stream_EQUALS.add(EQUALS9);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MINUS10=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_minustree77);  
            stream_MINUS.add(MINUS10);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_minustree81);
            l1=wordtree();

            state._fsp--;

            stream_wordtree.add(l1.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_minustree85);
            l2=wordtree();

            state._fsp--;

            stream_wordtree.add(l2.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_minustree90);
            l3=wordtree();

            state._fsp--;

            stream_wordtree.add(l3.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: l1, EQUALS, l2, l3
            // token labels: 
            // rule labels: l1, l2, l3, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_l1=new RewriteRuleSubtreeStream(adaptor,"rule l1",l1!=null?l1.tree:null);
            RewriteRuleSubtreeStream stream_l2=new RewriteRuleSubtreeStream(adaptor,"rule l2",l2!=null?l2.tree:null);
            RewriteRuleSubtreeStream stream_l3=new RewriteRuleSubtreeStream(adaptor,"rule l3",l3!=null?l3.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 14:4: -> ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1)
            {
                // /home/slaan/git/cip/praktikum3/minusgen.g:14:7: ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/praktikum3/minusgen.g:14:16: ^( PLUS[\"+\"] $l3 $l2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PLUS, "+")
                , root_2);

                adaptor.addChild(root_2, stream_l3.nextTree());

                adaptor.addChild(root_2, stream_l2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_l1.nextTree());

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
        return retval;
    }
    // $ANTLR end "minustree"


    public static class wordtree_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wordtree"
    // /home/slaan/git/cip/praktikum3/minusgen.g:16:1: wordtree : ^( WORD ( letters )+ ) ;
    public final minusgen.wordtree_return wordtree() throws RecognitionException {
        minusgen.wordtree_return retval = new minusgen.wordtree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WORD11=null;
        minusgen.letters_return letters12 =null;


        CommonTree WORD11_tree=null;

        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:17:2: ( ^( WORD ( letters )+ ) )
            // /home/slaan/git/cip/praktikum3/minusgen.g:17:4: ^( WORD ( letters )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD11=(CommonTree)match(input,WORD,FOLLOW_WORD_in_wordtree125); 
            WORD11_tree = (CommonTree)adaptor.dupNode(WORD11);


            root_1 = (CommonTree)adaptor.becomeRoot(WORD11_tree, root_1);


            match(input, Token.DOWN, null); 
            // /home/slaan/git/cip/praktikum3/minusgen.g:17:11: ( letters )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= A_LET && LA3_0 <= B_LET)||(LA3_0 >= C_LET && LA3_0 <= D_LET)||(LA3_0 >= E_LET && LA3_0 <= L_LET)||(LA3_0 >= M_LET && LA3_0 <= O_LET)||(LA3_0 >= P_LET && LA3_0 <= V_LET)||(LA3_0 >= W_LET && LA3_0 <= Z_LET)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum3/minusgen.g:17:11: letters
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_letters_in_wordtree127);
            	    letters12=letters();

            	    state._fsp--;

            	    adaptor.addChild(root_1, letters12.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
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
        return retval;
    }
    // $ANTLR end "wordtree"


    public static class letters_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "letters"
    // /home/slaan/git/cip/praktikum3/minusgen.g:19:1: letters : ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) ;
    public final minusgen.letters_return letters() throws RecognitionException {
        minusgen.letters_return retval = new minusgen.letters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set13=null;

        CommonTree set13_tree=null;

        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:19:9: ( ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) )
            // /home/slaan/git/cip/praktikum3/minusgen.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set13=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= A_LET && input.LA(1) <= B_LET)||(input.LA(1) >= C_LET && input.LA(1) <= D_LET)||(input.LA(1) >= E_LET && input.LA(1) <= L_LET)||(input.LA(1) >= M_LET && input.LA(1) <= O_LET)||(input.LA(1) >= P_LET && input.LA(1) <= V_LET)||(input.LA(1) >= W_LET && input.LA(1) <= Z_LET) ) {
                input.consume();
                set13_tree = (CommonTree)adaptor.dupNode(set13);


                adaptor.addChild(root_0, set13_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "letters"

    // Delegated rules


 

    public static final BitSet FOLLOW_subtree_in_start31 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_plustree_in_subtree40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minustree_in_subtree42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_plustree51 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_plustree54 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wordtree_in_plustree56 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_wordtree_in_plustree58 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wordtree_in_plustree61 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_minustree74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_minustree77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wordtree_in_minustree81 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_wordtree_in_minustree85 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wordtree_in_minustree90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_wordtree125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_letters_in_wordtree127 = new BitSet(new long[]{0x0000003CFEEFF368L});

}