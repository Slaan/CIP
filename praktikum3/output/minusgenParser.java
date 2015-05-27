// $ANTLR 3.4 /home/slaan/git/cip/praktikum3/minusgen.g 2015-05-27 17:28:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class minusgenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "EQUALS", "LETTER", "MINUS", "PLUS", "WS", "'('", "')'", "'WORD'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int COMMENT=4;
    public static final int EQUALS=5;
    public static final int LETTER=6;
    public static final int MINUS=7;
    public static final int PLUS=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public minusgenParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public minusgenParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return minusgenParser.tokenNames; }
    public String getGrammarFileName() { return "/home/slaan/git/cip/praktikum3/minusgen.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/slaan/git/cip/praktikum3/minusgen.g:5:1: start : ( subtree )* ;
    public final minusgenParser.start_return start() throws RecognitionException {
        minusgenParser.start_return retval = new minusgenParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        minusgenParser.subtree_return subtree1 =null;



        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:5:7: ( ( subtree )* )
            // /home/slaan/git/cip/praktikum3/minusgen.g:5:9: ( subtree )*
            {
            root_0 = (Object)adaptor.nil();


            // /home/slaan/git/cip/praktikum3/minusgen.g:5:9: ( subtree )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum3/minusgen.g:5:9: subtree
            	    {
            	    pushFollow(FOLLOW_subtree_in_start18);
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
        return retval;
    }
    // $ANTLR end "start"


    public static class subtree_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subtree"
    // /home/slaan/git/cip/praktikum3/minusgen.g:7:1: subtree : ( '(' EQUALS '(' '+' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort1 $wort2) $wort3) | '(' EQUALS '(' '-' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort3 $wort2) $wort1) );
    public final minusgenParser.subtree_return subtree() throws RecognitionException {
        minusgenParser.subtree_return retval = new minusgenParser.subtree_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        Token EQUALS3=null;
        Token char_literal4=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal8=null;
        Token EQUALS9=null;
        Token char_literal10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        Token char_literal13=null;
        minusgenParser.wordtree_return wort1 =null;

        minusgenParser.wordtree_return wort2 =null;

        minusgenParser.wordtree_return wort3 =null;


        Object char_literal2_tree=null;
        Object EQUALS3_tree=null;
        Object char_literal4_tree=null;
        Object char_literal5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal8_tree=null;
        Object EQUALS9_tree=null;
        Object char_literal10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_wordtree=new RewriteRuleSubtreeStream(adaptor,"rule wordtree");
        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:7:9: ( '(' EQUALS '(' '+' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort1 $wort2) $wort3) | '(' EQUALS '(' '-' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')' -> ^( EQUALS ^( PLUS $wort3 $wort2) $wort1) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EQUALS) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==10) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==PLUS) ) {
                            alt2=1;
                        }
                        else if ( (LA2_3==MINUS) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;

                        }
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
                    // /home/slaan/git/cip/praktikum3/minusgen.g:7:11: '(' EQUALS '(' '+' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')'
                    {
                    char_literal2=(Token)match(input,10,FOLLOW_10_in_subtree27);  
                    stream_10.add(char_literal2);


                    EQUALS3=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_subtree29);  
                    stream_EQUALS.add(EQUALS3);


                    char_literal4=(Token)match(input,10,FOLLOW_10_in_subtree31);  
                    stream_10.add(char_literal4);


                    char_literal5=(Token)match(input,PLUS,FOLLOW_PLUS_in_subtree33);  
                    stream_PLUS.add(char_literal5);


                    pushFollow(FOLLOW_wordtree_in_subtree37);
                    wort1=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort1.getTree());

                    pushFollow(FOLLOW_wordtree_in_subtree41);
                    wort2=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort2.getTree());

                    char_literal6=(Token)match(input,11,FOLLOW_11_in_subtree43);  
                    stream_11.add(char_literal6);


                    pushFollow(FOLLOW_wordtree_in_subtree47);
                    wort3=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort3.getTree());

                    char_literal7=(Token)match(input,11,FOLLOW_11_in_subtree50);  
                    stream_11.add(char_literal7);


                    // AST REWRITE
                    // elements: wort3, wort1, wort2, EQUALS
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

                    root_0 = (Object)adaptor.nil();
                    // 8:4: -> ^( EQUALS ^( PLUS $wort1 $wort2) $wort3)
                    {
                        // /home/slaan/git/cip/praktikum3/minusgen.g:8:7: ^( EQUALS ^( PLUS $wort1 $wort2) $wort3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EQUALS.nextNode()
                        , root_1);

                        // /home/slaan/git/cip/praktikum3/minusgen.g:8:16: ^( PLUS $wort1 $wort2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        adaptor.addChild(root_2, stream_wort1.nextTree());

                        adaptor.addChild(root_2, stream_wort2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_wort3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/slaan/git/cip/praktikum3/minusgen.g:9:4: '(' EQUALS '(' '-' wort1= wordtree wort2= wordtree ')' wort3= wordtree ')'
                    {
                    char_literal8=(Token)match(input,10,FOLLOW_10_in_subtree78);  
                    stream_10.add(char_literal8);


                    EQUALS9=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_subtree80);  
                    stream_EQUALS.add(EQUALS9);


                    char_literal10=(Token)match(input,10,FOLLOW_10_in_subtree82);  
                    stream_10.add(char_literal10);


                    char_literal11=(Token)match(input,MINUS,FOLLOW_MINUS_in_subtree84);  
                    stream_MINUS.add(char_literal11);


                    pushFollow(FOLLOW_wordtree_in_subtree88);
                    wort1=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort1.getTree());

                    pushFollow(FOLLOW_wordtree_in_subtree92);
                    wort2=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort2.getTree());

                    char_literal12=(Token)match(input,11,FOLLOW_11_in_subtree94);  
                    stream_11.add(char_literal12);


                    pushFollow(FOLLOW_wordtree_in_subtree98);
                    wort3=wordtree();

                    state._fsp--;

                    stream_wordtree.add(wort3.getTree());

                    char_literal13=(Token)match(input,11,FOLLOW_11_in_subtree101);  
                    stream_11.add(char_literal13);


                    // AST REWRITE
                    // elements: EQUALS, wort2, wort3, wort1
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

                    root_0 = (Object)adaptor.nil();
                    // 10:4: -> ^( EQUALS ^( PLUS $wort3 $wort2) $wort1)
                    {
                        // /home/slaan/git/cip/praktikum3/minusgen.g:10:7: ^( EQUALS ^( PLUS $wort3 $wort2) $wort1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EQUALS.nextNode()
                        , root_1);

                        // /home/slaan/git/cip/praktikum3/minusgen.g:10:16: ^( PLUS $wort3 $wort2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        adaptor.addChild(root_2, stream_wort3.nextTree());

                        adaptor.addChild(root_2, stream_wort2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_wort1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "subtree"


    public static class wordtree_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wordtree"
    // /home/slaan/git/cip/praktikum3/minusgen.g:12:1: wordtree : '(' 'WORD' ( LETTER )+ ')' -> ^( 'WORD' ( LETTER )+ ) ;
    public final minusgenParser.wordtree_return wordtree() throws RecognitionException {
        minusgenParser.wordtree_return retval = new minusgenParser.wordtree_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal14=null;
        Token string_literal15=null;
        Token LETTER16=null;
        Token char_literal17=null;

        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object LETTER16_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleTokenStream stream_LETTER=new RewriteRuleTokenStream(adaptor,"token LETTER");
        RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");

        try {
            // /home/slaan/git/cip/praktikum3/minusgen.g:13:2: ( '(' 'WORD' ( LETTER )+ ')' -> ^( 'WORD' ( LETTER )+ ) )
            // /home/slaan/git/cip/praktikum3/minusgen.g:13:4: '(' 'WORD' ( LETTER )+ ')'
            {
            char_literal14=(Token)match(input,10,FOLLOW_10_in_wordtree134);  
            stream_10.add(char_literal14);


            string_literal15=(Token)match(input,12,FOLLOW_12_in_wordtree136);  
            stream_12.add(string_literal15);


            // /home/slaan/git/cip/praktikum3/minusgen.g:13:15: ( LETTER )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==LETTER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum3/minusgen.g:13:15: LETTER
            	    {
            	    LETTER16=(Token)match(input,LETTER,FOLLOW_LETTER_in_wordtree138);  
            	    stream_LETTER.add(LETTER16);


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


            char_literal17=(Token)match(input,11,FOLLOW_11_in_wordtree141);  
            stream_11.add(char_literal17);


            // AST REWRITE
            // elements: 12, LETTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 13:27: -> ^( 'WORD' ( LETTER )+ )
            {
                // /home/slaan/git/cip/praktikum3/minusgen.g:13:30: ^( 'WORD' ( LETTER )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_12.nextNode()
                , root_1);

                if ( !(stream_LETTER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_LETTER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_LETTER.nextNode()
                    );

                }
                stream_LETTER.reset();

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
        return retval;
    }
    // $ANTLR end "wordtree"

    // Delegated rules


 

    public static final BitSet FOLLOW_subtree_in_start18 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_subtree27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_subtree29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_subtree31 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PLUS_in_subtree33 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wordtree_in_subtree37 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wordtree_in_subtree41 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_subtree43 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wordtree_in_subtree47 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_subtree50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_subtree78 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUALS_in_subtree80 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_subtree82 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_MINUS_in_subtree84 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wordtree_in_subtree88 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wordtree_in_subtree92 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_subtree94 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_wordtree_in_subtree98 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_subtree101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_wordtree134 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_wordtree136 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_wordtree138 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11_in_wordtree141 = new BitSet(new long[]{0x0000000000000002L});

}