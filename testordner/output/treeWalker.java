// $ANTLR 3.4 /home/slaan/git/cip/testordner/treeWalker.g 2015-06-22 16:30:23

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class treeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITHMULTT", "BUCHSTABEN", "COMMENT", "EQUALS", "EQUALSMULTT", "MINUS", "PLUS", "PUZZLE", "WORD", "WS"
    };

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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public treeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public treeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
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
    // /home/slaan/git/cip/testordner/treeWalker.g:9:1: start : ^( PUZZLE ( subtree )* ) -> ^( PUZZLE ( subtree )* ) ;
    public final treeWalker.start_return start() throws RecognitionException {
        treeWalker.start_return retval = new treeWalker.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUZZLE1=null;
        treeWalker.subtree_return subtree2 =null;


        CommonTree PUZZLE1_tree=null;
        RewriteRuleNodeStream stream_PUZZLE=new RewriteRuleNodeStream(adaptor,"token PUZZLE");
        RewriteRuleSubtreeStream stream_subtree=new RewriteRuleSubtreeStream(adaptor,"rule subtree");
        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:9:7: ( ^( PUZZLE ( subtree )* ) -> ^( PUZZLE ( subtree )* ) )
            // /home/slaan/git/cip/testordner/treeWalker.g:9:9: ^( PUZZLE ( subtree )* )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PUZZLE1=(CommonTree)match(input,PUZZLE,FOLLOW_PUZZLE_in_start37);  
            stream_PUZZLE.add(PUZZLE1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/slaan/git/cip/testordner/treeWalker.g:9:18: ( subtree )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==EQUALS) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/slaan/git/cip/testordner/treeWalker.g:9:18: subtree
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_subtree_in_start39);
                	    subtree2=subtree();

                	    state._fsp--;

                	    stream_subtree.add(subtree2.getTree());

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: subtree, PUZZLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 9:28: -> ^( PUZZLE ( subtree )* )
            {
                // /home/slaan/git/cip/testordner/treeWalker.g:9:31: ^( PUZZLE ( subtree )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_PUZZLE.nextNode()
                , root_1);

                // /home/slaan/git/cip/testordner/treeWalker.g:9:40: ( subtree )*
                while ( stream_subtree.hasNext() ) {
                    adaptor.addChild(root_1, stream_subtree.nextTree());

                }
                stream_subtree.reset();

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
    // $ANTLR end "start"


    public static class subtree_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subtree"
    // /home/slaan/git/cip/testordner/treeWalker.g:11:1: subtree : ( plustree | minustree );
    public final treeWalker.subtree_return subtree() throws RecognitionException {
        treeWalker.subtree_return retval = new treeWalker.subtree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        treeWalker.plustree_return plustree3 =null;

        treeWalker.minustree_return minustree4 =null;



        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:11:9: ( plustree | minustree )
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
                    // /home/slaan/git/cip/testordner/treeWalker.g:11:11: plustree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_plustree_in_subtree58);
                    plustree3=plustree();

                    state._fsp--;

                    adaptor.addChild(root_0, plustree3.getTree());


                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/testordner/treeWalker.g:11:20: minustree
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_minustree_in_subtree60);
                    minustree4=minustree();

                    state._fsp--;

                    adaptor.addChild(root_0, minustree4.getTree());


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
    // /home/slaan/git/cip/testordner/treeWalker.g:13:1: plustree : ^( EQUALS ^( PLUS wordtree wordtree ) wordtree ) ;
    public final treeWalker.plustree_return plustree() throws RecognitionException {
        treeWalker.plustree_return retval = new treeWalker.plustree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS5=null;
        CommonTree PLUS6=null;
        treeWalker.wordtree_return wordtree7 =null;

        treeWalker.wordtree_return wordtree8 =null;

        treeWalker.wordtree_return wordtree9 =null;


        CommonTree EQUALS5_tree=null;
        CommonTree PLUS6_tree=null;

        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:13:9: ( ^( EQUALS ^( PLUS wordtree wordtree ) wordtree ) )
            // /home/slaan/git/cip/testordner/treeWalker.g:13:12: ^( EQUALS ^( PLUS wordtree wordtree ) wordtree )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQUALS5=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_plustree69); 
            EQUALS5_tree = (CommonTree)adaptor.dupNode(EQUALS5);


            root_1 = (CommonTree)adaptor.becomeRoot(EQUALS5_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PLUS6=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_plustree72); 
            PLUS6_tree = (CommonTree)adaptor.dupNode(PLUS6);


            root_2 = (CommonTree)adaptor.becomeRoot(PLUS6_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_plustree74);
            wordtree7=wordtree();

            state._fsp--;

            adaptor.addChild(root_2, wordtree7.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_plustree76);
            wordtree8=wordtree();

            state._fsp--;

            adaptor.addChild(root_2, wordtree8.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_plustree79);
            wordtree9=wordtree();

            state._fsp--;

            adaptor.addChild(root_1, wordtree9.getTree());


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
    // /home/slaan/git/cip/testordner/treeWalker.g:15:1: minustree : ^( EQUALS ^( MINUS l1= wordtree l2= wordtree ) l3= wordtree ) -> ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1) ;
    public final treeWalker.minustree_return minustree() throws RecognitionException {
        treeWalker.minustree_return retval = new treeWalker.minustree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUALS10=null;
        CommonTree MINUS11=null;
        treeWalker.wordtree_return l1 =null;

        treeWalker.wordtree_return l2 =null;

        treeWalker.wordtree_return l3 =null;


        CommonTree EQUALS10_tree=null;
        CommonTree MINUS11_tree=null;
        RewriteRuleNodeStream stream_EQUALS=new RewriteRuleNodeStream(adaptor,"token EQUALS");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_wordtree=new RewriteRuleSubtreeStream(adaptor,"rule wordtree");
        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:15:10: ( ^( EQUALS ^( MINUS l1= wordtree l2= wordtree ) l3= wordtree ) -> ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1) )
            // /home/slaan/git/cip/testordner/treeWalker.g:15:13: ^( EQUALS ^( MINUS l1= wordtree l2= wordtree ) l3= wordtree )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQUALS10=(CommonTree)match(input,EQUALS,FOLLOW_EQUALS_in_minustree92);  
            stream_EQUALS.add(EQUALS10);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MINUS11=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_minustree95);  
            stream_MINUS.add(MINUS11);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_minustree99);
            l1=wordtree();

            state._fsp--;

            stream_wordtree.add(l1.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_minustree103);
            l2=wordtree();

            state._fsp--;

            stream_wordtree.add(l2.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_wordtree_in_minustree108);
            l3=wordtree();

            state._fsp--;

            stream_wordtree.add(l3.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: EQUALS, l3, l1, l2
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
            // 16:4: -> ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1)
            {
                // /home/slaan/git/cip/testordner/treeWalker.g:16:7: ^( EQUALS ^( PLUS[\"+\"] $l3 $l2) $l1)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/testordner/treeWalker.g:16:16: ^( PLUS[\"+\"] $l3 $l2)
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
    // /home/slaan/git/cip/testordner/treeWalker.g:18:1: wordtree : ^( WORD ( letters )+ ) ;
    public final treeWalker.wordtree_return wordtree() throws RecognitionException {
        treeWalker.wordtree_return retval = new treeWalker.wordtree_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WORD12=null;
        treeWalker.letters_return letters13 =null;


        CommonTree WORD12_tree=null;

        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:19:2: ( ^( WORD ( letters )+ ) )
            // /home/slaan/git/cip/testordner/treeWalker.g:19:4: ^( WORD ( letters )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD12=(CommonTree)match(input,WORD,FOLLOW_WORD_in_wordtree143); 
            WORD12_tree = (CommonTree)adaptor.dupNode(WORD12);


            root_1 = (CommonTree)adaptor.becomeRoot(WORD12_tree, root_1);


            match(input, Token.DOWN, null); 
            // /home/slaan/git/cip/testordner/treeWalker.g:19:11: ( letters )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BUCHSTABEN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/slaan/git/cip/testordner/treeWalker.g:19:11: letters
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_letters_in_wordtree145);
            	    letters13=letters();

            	    state._fsp--;

            	    adaptor.addChild(root_1, letters13.getTree());


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
    // /home/slaan/git/cip/testordner/treeWalker.g:21:1: letters : ( BUCHSTABEN )+ ;
    public final treeWalker.letters_return letters() throws RecognitionException {
        treeWalker.letters_return retval = new treeWalker.letters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BUCHSTABEN14=null;

        CommonTree BUCHSTABEN14_tree=null;

        try {
            // /home/slaan/git/cip/testordner/treeWalker.g:21:9: ( ( BUCHSTABEN )+ )
            // /home/slaan/git/cip/testordner/treeWalker.g:21:11: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/slaan/git/cip/testordner/treeWalker.g:21:11: ( BUCHSTABEN )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BUCHSTABEN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/slaan/git/cip/testordner/treeWalker.g:21:11: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN14=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_letters155); 
            	    BUCHSTABEN14_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN14);


            	    adaptor.addChild(root_0, BUCHSTABEN14_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "letters"

    // Delegated rules


 

    public static final BitSet FOLLOW_PUZZLE_in_start37 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtree_in_start39 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_plustree_in_subtree58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minustree_in_subtree60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_plustree69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_plustree72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wordtree_in_plustree74 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_wordtree_in_plustree76 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wordtree_in_plustree79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_minustree92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_minustree95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wordtree_in_minustree99 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_wordtree_in_minustree103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_wordtree_in_minustree108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_wordtree143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_letters_in_wordtree145 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_letters155 = new BitSet(new long[]{0x0000000000000022L});

}