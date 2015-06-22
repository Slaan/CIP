package output;

// $ANTLR 3.4 /home/slaan/git/cip/testordner/buchstabenGrammar.g 2015-06-22 16:29:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class buchstabenGrammarParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public buchstabenGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public buchstabenGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
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
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:12:1: start_all : wort1= word arithexpr wort2= word EQUALS wort3= word arithexpr arithexpr arithexpr wort4= word arithexpr wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word arithexpr wort8= word EQUALS wort9= word -> ^( PUZZLE ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3) ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6) ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9) ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7) ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8) ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9) ) ;
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
        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:13:2: (wort1= word arithexpr wort2= word EQUALS wort3= word arithexpr arithexpr arithexpr wort4= word arithexpr wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word arithexpr wort8= word EQUALS wort9= word -> ^( PUZZLE ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3) ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6) ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9) ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7) ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8) ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9) ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:13:4: wort1= word arithexpr wort2= word EQUALS wort3= word arithexpr arithexpr arithexpr wort4= word arithexpr wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word arithexpr wort8= word EQUALS wort9= word
            {
            pushFollow(FOLLOW_word_in_start_all42);
            wort1=word();

            state._fsp--;

            stream_word.add(wort1.getTree());

            pushFollow(FOLLOW_arithexpr_in_start_all44);
            arithexpr1=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr1.getTree());

            pushFollow(FOLLOW_word_in_start_all48);
            wort2=word();

            state._fsp--;

            stream_word.add(wort2.getTree());

            EQUALS2=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all50);  
            stream_EQUALS.add(EQUALS2);


            pushFollow(FOLLOW_word_in_start_all54);
            wort3=word();

            state._fsp--;

            stream_word.add(wort3.getTree());

            pushFollow(FOLLOW_arithexpr_in_start_all58);
            arithexpr3=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr3.getTree());

            pushFollow(FOLLOW_arithexpr_in_start_all60);
            arithexpr4=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr4.getTree());

            pushFollow(FOLLOW_arithexpr_in_start_all62);
            arithexpr5=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr5.getTree());

            pushFollow(FOLLOW_word_in_start_all68);
            wort4=word();

            state._fsp--;

            stream_word.add(wort4.getTree());

            pushFollow(FOLLOW_arithexpr_in_start_all70);
            arithexpr6=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr6.getTree());

            pushFollow(FOLLOW_word_in_start_all74);
            wort5=word();

            state._fsp--;

            stream_word.add(wort5.getTree());

            EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all76);  
            stream_EQUALS.add(EQUALS7);


            pushFollow(FOLLOW_word_in_start_all80);
            wort6=word();

            state._fsp--;

            stream_word.add(wort6.getTree());

            EQUALS8=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all84);  
            stream_EQUALS.add(EQUALS8);


            EQUALS9=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all86);  
            stream_EQUALS.add(EQUALS9);


            EQUALS10=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all88);  
            stream_EQUALS.add(EQUALS10);


            pushFollow(FOLLOW_word_in_start_all94);
            wort7=word();

            state._fsp--;

            stream_word.add(wort7.getTree());

            pushFollow(FOLLOW_arithexpr_in_start_all96);
            arithexpr11=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr11.getTree());

            pushFollow(FOLLOW_word_in_start_all100);
            wort8=word();

            state._fsp--;

            stream_word.add(wort8.getTree());

            EQUALS12=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all102);  
            stream_EQUALS.add(EQUALS12);


            pushFollow(FOLLOW_word_in_start_all106);
            wort9=word();

            state._fsp--;

            stream_word.add(wort9.getTree());

            // AST REWRITE
            // elements: wort2, arithexpr, wort5, wort9, arithexpr, wort1, arithexpr, EQUALS, EQUALS, wort2, arithexpr, wort4, wort5, arithexpr, wort7, wort3, wort6, wort1, wort8, wort9, wort7, wort6, wort4, EQUALS, EQUALS, EQUALS, wort3, arithexpr, EQUALS, wort8
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
            // 18:3: -> ^( PUZZLE ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3) ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6) ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9) ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7) ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8) ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9) )
            {
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:18:6: ^( PUZZLE ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3) ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6) ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9) ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7) ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8) ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PUZZLE, "PUZZLE")
                , root_1);

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:18:15: ^( EQUALS ^( arithexpr $wort1 $wort2) $wort3)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_2);

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:18:24: ^( arithexpr $wort1 $wort2)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort1.nextTree());

                adaptor.addChild(root_3, stream_wort2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:19:3: ^( EQUALS ^( arithexpr $wort4 $wort5) $wort6)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_2);

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:19:12: ^( arithexpr $wort4 $wort5)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort4.nextTree());

                adaptor.addChild(root_3, stream_wort5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort6.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:20:3: ^( EQUALS ^( arithexpr $wort7 $wort8) $wort9)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_2);

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:20:12: ^( arithexpr $wort7 $wort8)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort7.nextTree());

                adaptor.addChild(root_3, stream_wort8.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:21:3: ^( EQUALS ^( arithexpr $wort1 $wort4) $wort7)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_2);

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:21:12: ^( arithexpr $wort1 $wort4)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort1.nextTree());

                adaptor.addChild(root_3, stream_wort4.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort7.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:22:3: ^( EQUALS ^( arithexpr $wort2 $wort5) $wort8)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_2);

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:22:12: ^( arithexpr $wort2 $wort5)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort2.nextTree());

                adaptor.addChild(root_3, stream_wort5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort8.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:23:3: ^( EQUALS ^( arithexpr $wort3 $wort6) $wort9)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_2);

                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:23:12: ^( arithexpr $wort3 $wort6)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_3);

                adaptor.addChild(root_3, stream_wort3.nextTree());

                adaptor.addChild(root_3, stream_wort6.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_wort9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // $ANTLR end "start_all"


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:26:1: start : calcarithexpr equalsmultexpr calcZeile -> ^( EQUALSMULTT calcarithexpr calcZeile ) ;
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
        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:26:8: ( calcarithexpr equalsmultexpr calcZeile -> ^( EQUALSMULTT calcarithexpr calcZeile ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:26:11: calcarithexpr equalsmultexpr calcZeile
            {
            pushFollow(FOLLOW_calcarithexpr_in_start239);
            calcarithexpr13=calcarithexpr();

            state._fsp--;

            stream_calcarithexpr.add(calcarithexpr13.getTree());

            pushFollow(FOLLOW_equalsmultexpr_in_start241);
            equalsmultexpr14=equalsmultexpr();

            state._fsp--;

            stream_equalsmultexpr.add(equalsmultexpr14.getTree());

            pushFollow(FOLLOW_calcZeile_in_start243);
            calcZeile15=calcZeile();

            state._fsp--;

            stream_calcZeile.add(calcZeile15.getTree());

            // AST REWRITE
            // elements: calcZeile, calcarithexpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 26:50: -> ^( EQUALSMULTT calcarithexpr calcZeile )
            {
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:26:53: ^( EQUALSMULTT calcarithexpr calcZeile )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EQUALSMULTT, "EQUALSMULTT")
                , root_1);

                adaptor.addChild(root_1, stream_calcarithexpr.nextTree());

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
        return retval;
    }
    // $ANTLR end "start"


    public static class calcZeile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "calcZeile"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:28:1: calcZeile : arithsingleexpr EQUALS word -> ^( EQUALS arithsingleexpr word ) ;
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
        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:28:12: ( arithsingleexpr EQUALS word -> ^( EQUALS arithsingleexpr word ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:28:14: arithsingleexpr EQUALS word
            {
            pushFollow(FOLLOW_arithsingleexpr_in_calcZeile262);
            arithsingleexpr16=arithsingleexpr();

            state._fsp--;

            stream_arithsingleexpr.add(arithsingleexpr16.getTree());

            EQUALS17=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_calcZeile264);  
            stream_EQUALS.add(EQUALS17);


            pushFollow(FOLLOW_word_in_calcZeile266);
            word18=word();

            state._fsp--;

            stream_word.add(word18.getTree());

            // AST REWRITE
            // elements: word, arithsingleexpr, EQUALS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 28:42: -> ^( EQUALS arithsingleexpr word )
            {
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:28:45: ^( EQUALS arithsingleexpr word )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_arithsingleexpr.nextTree());

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
        return retval;
    }
    // $ANTLR end "calcZeile"


    public static class arithsingleexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithsingleexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:30:1: arithsingleexpr : word arithexpr word -> ^( arithexpr word word ) ;
    public final buchstabenGrammarParser.arithsingleexpr_return arithsingleexpr() throws RecognitionException {
        buchstabenGrammarParser.arithsingleexpr_return retval = new buchstabenGrammarParser.arithsingleexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.word_return word19 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr20 =null;

        buchstabenGrammarParser.word_return word21 =null;


        RewriteRuleSubtreeStream stream_arithexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithexpr");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:31:2: ( word arithexpr word -> ^( arithexpr word word ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:31:4: word arithexpr word
            {
            pushFollow(FOLLOW_word_in_arithsingleexpr285);
            word19=word();

            state._fsp--;

            stream_word.add(word19.getTree());

            pushFollow(FOLLOW_arithexpr_in_arithsingleexpr287);
            arithexpr20=arithexpr();

            state._fsp--;

            stream_arithexpr.add(arithexpr20.getTree());

            pushFollow(FOLLOW_word_in_arithsingleexpr289);
            word21=word();

            state._fsp--;

            stream_word.add(word21.getTree());

            // AST REWRITE
            // elements: word, word, arithexpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 31:24: -> ^( arithexpr word word )
            {
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:31:27: ^( arithexpr word word )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_arithexpr.nextNode(), root_1);

                adaptor.addChild(root_1, stream_word.nextTree());

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
        return retval;
    }
    // $ANTLR end "arithsingleexpr"


    public static class calcarithexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "calcarithexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:33:1: calcarithexpr : calcZeile arithmultexpr calcZeile -> ^( ARITHMULTT calcZeile calcZeile ) ;
    public final buchstabenGrammarParser.calcarithexpr_return calcarithexpr() throws RecognitionException {
        buchstabenGrammarParser.calcarithexpr_return retval = new buchstabenGrammarParser.calcarithexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.calcZeile_return calcZeile22 =null;

        buchstabenGrammarParser.arithmultexpr_return arithmultexpr23 =null;

        buchstabenGrammarParser.calcZeile_return calcZeile24 =null;


        RewriteRuleSubtreeStream stream_arithmultexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithmultexpr");
        RewriteRuleSubtreeStream stream_calcZeile=new RewriteRuleSubtreeStream(adaptor,"rule calcZeile");
        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:34:2: ( calcZeile arithmultexpr calcZeile -> ^( ARITHMULTT calcZeile calcZeile ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:34:4: calcZeile arithmultexpr calcZeile
            {
            pushFollow(FOLLOW_calcZeile_in_calcarithexpr308);
            calcZeile22=calcZeile();

            state._fsp--;

            stream_calcZeile.add(calcZeile22.getTree());

            pushFollow(FOLLOW_arithmultexpr_in_calcarithexpr310);
            arithmultexpr23=arithmultexpr();

            state._fsp--;

            stream_arithmultexpr.add(arithmultexpr23.getTree());

            pushFollow(FOLLOW_calcZeile_in_calcarithexpr312);
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
            // 34:38: -> ^( ARITHMULTT calcZeile calcZeile )
            {
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:34:41: ^( ARITHMULTT calcZeile calcZeile )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARITHMULTT, "ARITHMULTT")
                , root_1);

                adaptor.addChild(root_1, stream_calcZeile.nextTree());

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
        return retval;
    }
    // $ANTLR end "calcarithexpr"


    public static class arithmultexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmultexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:36:1: arithmultexpr : arithexpr arithexpr arithexpr ;
    public final buchstabenGrammarParser.arithmultexpr_return arithmultexpr() throws RecognitionException {
        buchstabenGrammarParser.arithmultexpr_return retval = new buchstabenGrammarParser.arithmultexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.arithexpr_return arithexpr25 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr26 =null;

        buchstabenGrammarParser.arithexpr_return arithexpr27 =null;



        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:37:2: ( arithexpr arithexpr arithexpr )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:37:4: arithexpr arithexpr arithexpr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arithexpr_in_arithmultexpr331);
            arithexpr25=arithexpr();

            state._fsp--;

            adaptor.addChild(root_0, arithexpr25.getTree());

            pushFollow(FOLLOW_arithexpr_in_arithmultexpr333);
            arithexpr26=arithexpr();

            state._fsp--;

            adaptor.addChild(root_0, arithexpr26.getTree());

            pushFollow(FOLLOW_arithexpr_in_arithmultexpr335);
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
        return retval;
    }
    // $ANTLR end "arithmultexpr"


    public static class equalsmultexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalsmultexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:39:1: equalsmultexpr : EQUALS EQUALS EQUALS ;
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

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:40:2: ( EQUALS EQUALS EQUALS )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:40:4: EQUALS EQUALS EQUALS
            {
            root_0 = (Object)adaptor.nil();


            EQUALS28=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr345); 
            EQUALS28_tree = 
            (Object)adaptor.create(EQUALS28)
            ;
            adaptor.addChild(root_0, EQUALS28_tree);


            EQUALS29=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr347); 
            EQUALS29_tree = 
            (Object)adaptor.create(EQUALS29)
            ;
            adaptor.addChild(root_0, EQUALS29_tree);


            EQUALS30=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr349); 
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
        return retval;
    }
    // $ANTLR end "equalsmultexpr"


    public static class arithexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithexpr"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:42:1: arithexpr : ( PLUS | MINUS ) ;
    public final buchstabenGrammarParser.arithexpr_return arithexpr() throws RecognitionException {
        buchstabenGrammarParser.arithexpr_return retval = new buchstabenGrammarParser.arithexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:42:11: ( ( PLUS | MINUS ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:
            {
            root_0 = (Object)adaptor.nil();


            set31=(Token)input.LT(1);

            if ( (input.LA(1) >= MINUS && input.LA(1) <= PLUS) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set31)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "arithexpr"


    public static class word_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "word"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:50:1: word : ( letters )+ -> ^( WORD ( letters )+ ) ;
    public final buchstabenGrammarParser.word_return word() throws RecognitionException {
        buchstabenGrammarParser.word_return retval = new buchstabenGrammarParser.word_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        buchstabenGrammarParser.letters_return letters32 =null;


        RewriteRuleSubtreeStream stream_letters=new RewriteRuleSubtreeStream(adaptor,"rule letters");
        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:50:6: ( ( letters )+ -> ^( WORD ( letters )+ ) )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:50:8: ( letters )+
            {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:50:8: ( letters )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BUCHSTABEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:50:8: letters
            	    {
            	    pushFollow(FOLLOW_letters_in_word396);
            	    letters32=letters();

            	    state._fsp--;

            	    stream_letters.add(letters32.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
            // 50:17: -> ^( WORD ( letters )+ )
            {
                // /home/slaan/git/cip/testordner/buchstabenGrammar.g:50:20: ^( WORD ( letters )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WORD, "WORD")
                , root_1);

                if ( !(stream_letters.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_letters.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "word"


    public static class letters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "letters"
    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:52:1: letters : ( BUCHSTABEN )+ ;
    public final buchstabenGrammarParser.letters_return letters() throws RecognitionException {
        buchstabenGrammarParser.letters_return retval = new buchstabenGrammarParser.letters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BUCHSTABEN33=null;

        Object BUCHSTABEN33_tree=null;

        try {
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:52:9: ( ( BUCHSTABEN )+ )
            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:52:11: ( BUCHSTABEN )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/slaan/git/cip/testordner/buchstabenGrammar.g:52:11: ( BUCHSTABEN )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BUCHSTABEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/slaan/git/cip/testordner/buchstabenGrammar.g:52:11: BUCHSTABEN
            	    {
            	    BUCHSTABEN33=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_letters414); 
            	    BUCHSTABEN33_tree = 
            	    (Object)adaptor.create(BUCHSTABEN33)
            	    ;
            	    adaptor.addChild(root_0, BUCHSTABEN33_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "letters"

    // Delegated rules


 

    public static final BitSet FOLLOW_word_in_start_all42 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_start_all44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all48 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start_all50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all54 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_start_all58 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_start_all60 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_start_all62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all68 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_start_all70 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all74 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start_all76 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all80 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start_all84 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start_all86 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start_all88 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all94 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_start_all96 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all100 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_start_all102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_start_all106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calcarithexpr_in_start239 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_equalsmultexpr_in_start241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calcZeile_in_start243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithsingleexpr_in_calcZeile262 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_calcZeile264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_calcZeile266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_word_in_arithsingleexpr285 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_arithsingleexpr287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_word_in_arithsingleexpr289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calcZeile_in_calcarithexpr308 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithmultexpr_in_calcarithexpr310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_calcZeile_in_calcarithexpr312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithexpr_in_arithmultexpr331 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_arithmultexpr333 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_arithexpr_in_arithmultexpr335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr345 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr347 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letters_in_word396 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_letters414 = new BitSet(new long[]{0x0000000000000022L});

}