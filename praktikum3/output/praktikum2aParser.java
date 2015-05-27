// $ANTLR 3.4 /home/slaan/git/cip/praktikum3/praktikum2a.g 2015-05-27 17:09:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class praktikum2aParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITHEXPR", "ARITHMULTT", "A_LET", "B_LET", "COMMENT", "C_LET", "D_LET", "EQUALS", "EQUALSMULTT", "E_LET", "F_LET", "G_LET", "H_LET", "I_LET", "J_LET", "K_LET", "L_LET", "M_LET", "N_LET", "O_LET", "P_LET", "Q_LET", "R_LET", "S_LET", "T_LET", "U_LET", "V_LET", "WORD", "WS", "W_LET", "X_LET", "Y_LET", "Z_LET"
    };

    public static final int EOF=-1;
    public static final int ARITHEXPR=4;
    public static final int ARITHMULTT=5;
    public static final int A_LET=6;
    public static final int B_LET=7;
    public static final int COMMENT=8;
    public static final int C_LET=9;
    public static final int D_LET=10;
    public static final int EQUALS=11;
    public static final int EQUALSMULTT=12;
    public static final int E_LET=13;
    public static final int F_LET=14;
    public static final int G_LET=15;
    public static final int H_LET=16;
    public static final int I_LET=17;
    public static final int J_LET=18;
    public static final int K_LET=19;
    public static final int L_LET=20;
    public static final int M_LET=21;
    public static final int N_LET=22;
    public static final int O_LET=23;
    public static final int P_LET=24;
    public static final int Q_LET=25;
    public static final int R_LET=26;
    public static final int S_LET=27;
    public static final int T_LET=28;
    public static final int U_LET=29;
    public static final int V_LET=30;
    public static final int WORD=31;
    public static final int WS=32;
    public static final int W_LET=33;
    public static final int X_LET=34;
    public static final int Y_LET=35;
    public static final int Z_LET=36;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public praktikum2aParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public praktikum2aParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return praktikum2aParser.tokenNames; }
    public String getGrammarFileName() { return "/home/slaan/git/cip/praktikum3/praktikum2a.g"; }


    public static class start_all_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start_all"
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:11:1: start_all : wort1= word ARITHEXPR wort2= word EQUALS wort3= word ARITHEXPR ARITHEXPR ARITHEXPR wort4= word ARITHEXPR wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word ARITHEXPR wort8= word EQUALS wort9= word -> ^( EQUALS ^( ARITHEXPR $wort1 $wort2) $wort3) ^( EQUALS ^( ARITHEXPR $wort4 $wort5) $wort6) ^( EQUALS ^( ARITHEXPR $wort7 $wort8) $wort9) ^( EQUALS ^( ARITHEXPR $wort1 $wort4) $wort7) ^( EQUALS ^( ARITHEXPR $wort2 $wort5) $wort8) ^( EQUALS ^( ARITHEXPR $wort3 $wort6) $wort9) ;
    public final praktikum2aParser.start_all_return start_all() throws RecognitionException {
        praktikum2aParser.start_all_return retval = new praktikum2aParser.start_all_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ARITHEXPR1=null;
        Token EQUALS2=null;
        Token ARITHEXPR3=null;
        Token ARITHEXPR4=null;
        Token ARITHEXPR5=null;
        Token ARITHEXPR6=null;
        Token EQUALS7=null;
        Token EQUALS8=null;
        Token EQUALS9=null;
        Token EQUALS10=null;
        Token ARITHEXPR11=null;
        Token EQUALS12=null;
        praktikum2aParser.word_return wort1 =null;

        praktikum2aParser.word_return wort2 =null;

        praktikum2aParser.word_return wort3 =null;

        praktikum2aParser.word_return wort4 =null;

        praktikum2aParser.word_return wort5 =null;

        praktikum2aParser.word_return wort6 =null;

        praktikum2aParser.word_return wort7 =null;

        praktikum2aParser.word_return wort8 =null;

        praktikum2aParser.word_return wort9 =null;


        Object ARITHEXPR1_tree=null;
        Object EQUALS2_tree=null;
        Object ARITHEXPR3_tree=null;
        Object ARITHEXPR4_tree=null;
        Object ARITHEXPR5_tree=null;
        Object ARITHEXPR6_tree=null;
        Object EQUALS7_tree=null;
        Object EQUALS8_tree=null;
        Object EQUALS9_tree=null;
        Object EQUALS10_tree=null;
        Object ARITHEXPR11_tree=null;
        Object EQUALS12_tree=null;
        RewriteRuleTokenStream stream_ARITHEXPR=new RewriteRuleTokenStream(adaptor,"token ARITHEXPR");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:12:2: (wort1= word ARITHEXPR wort2= word EQUALS wort3= word ARITHEXPR ARITHEXPR ARITHEXPR wort4= word ARITHEXPR wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word ARITHEXPR wort8= word EQUALS wort9= word -> ^( EQUALS ^( ARITHEXPR $wort1 $wort2) $wort3) ^( EQUALS ^( ARITHEXPR $wort4 $wort5) $wort6) ^( EQUALS ^( ARITHEXPR $wort7 $wort8) $wort9) ^( EQUALS ^( ARITHEXPR $wort1 $wort4) $wort7) ^( EQUALS ^( ARITHEXPR $wort2 $wort5) $wort8) ^( EQUALS ^( ARITHEXPR $wort3 $wort6) $wort9) )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:12:4: wort1= word ARITHEXPR wort2= word EQUALS wort3= word ARITHEXPR ARITHEXPR ARITHEXPR wort4= word ARITHEXPR wort5= word EQUALS wort6= word EQUALS EQUALS EQUALS wort7= word ARITHEXPR wort8= word EQUALS wort9= word
            {
            pushFollow(FOLLOW_word_in_start_all38);
            wort1=word();

            state._fsp--;

            stream_word.add(wort1.getTree());

            ARITHEXPR1=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_start_all40);  
            stream_ARITHEXPR.add(ARITHEXPR1);


            pushFollow(FOLLOW_word_in_start_all44);
            wort2=word();

            state._fsp--;

            stream_word.add(wort2.getTree());

            EQUALS2=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all46);  
            stream_EQUALS.add(EQUALS2);


            pushFollow(FOLLOW_word_in_start_all50);
            wort3=word();

            state._fsp--;

            stream_word.add(wort3.getTree());

            ARITHEXPR3=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_start_all54);  
            stream_ARITHEXPR.add(ARITHEXPR3);


            ARITHEXPR4=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_start_all56);  
            stream_ARITHEXPR.add(ARITHEXPR4);


            ARITHEXPR5=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_start_all58);  
            stream_ARITHEXPR.add(ARITHEXPR5);


            pushFollow(FOLLOW_word_in_start_all64);
            wort4=word();

            state._fsp--;

            stream_word.add(wort4.getTree());

            ARITHEXPR6=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_start_all66);  
            stream_ARITHEXPR.add(ARITHEXPR6);


            pushFollow(FOLLOW_word_in_start_all70);
            wort5=word();

            state._fsp--;

            stream_word.add(wort5.getTree());

            EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all72);  
            stream_EQUALS.add(EQUALS7);


            pushFollow(FOLLOW_word_in_start_all76);
            wort6=word();

            state._fsp--;

            stream_word.add(wort6.getTree());

            EQUALS8=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all80);  
            stream_EQUALS.add(EQUALS8);


            EQUALS9=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all82);  
            stream_EQUALS.add(EQUALS9);


            EQUALS10=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all84);  
            stream_EQUALS.add(EQUALS10);


            pushFollow(FOLLOW_word_in_start_all90);
            wort7=word();

            state._fsp--;

            stream_word.add(wort7.getTree());

            ARITHEXPR11=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_start_all92);  
            stream_ARITHEXPR.add(ARITHEXPR11);


            pushFollow(FOLLOW_word_in_start_all96);
            wort8=word();

            state._fsp--;

            stream_word.add(wort8.getTree());

            EQUALS12=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start_all98);  
            stream_EQUALS.add(EQUALS12);


            pushFollow(FOLLOW_word_in_start_all102);
            wort9=word();

            state._fsp--;

            stream_word.add(wort9.getTree());

            // AST REWRITE
            // elements: wort4, ARITHEXPR, ARITHEXPR, wort9, EQUALS, ARITHEXPR, wort7, EQUALS, EQUALS, wort5, wort3, ARITHEXPR, wort1, wort2, wort7, wort6, wort1, wort8, ARITHEXPR, wort6, wort8, wort3, wort9, wort4, wort2, EQUALS, EQUALS, wort5, EQUALS, ARITHEXPR
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
            // 17:3: -> ^( EQUALS ^( ARITHEXPR $wort1 $wort2) $wort3) ^( EQUALS ^( ARITHEXPR $wort4 $wort5) $wort6) ^( EQUALS ^( ARITHEXPR $wort7 $wort8) $wort9) ^( EQUALS ^( ARITHEXPR $wort1 $wort4) $wort7) ^( EQUALS ^( ARITHEXPR $wort2 $wort5) $wort8) ^( EQUALS ^( ARITHEXPR $wort3 $wort6) $wort9)
            {
                // /home/slaan/git/cip/praktikum3/praktikum2a.g:17:6: ^( EQUALS ^( ARITHEXPR $wort1 $wort2) $wort3)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:17:15: ^( ARITHEXPR $wort1 $wort2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_ARITHEXPR.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_wort1.nextTree());

                adaptor.addChild(root_2, stream_wort2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_wort3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:18:3: ^( EQUALS ^( ARITHEXPR $wort4 $wort5) $wort6)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:18:12: ^( ARITHEXPR $wort4 $wort5)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_ARITHEXPR.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_wort4.nextTree());

                adaptor.addChild(root_2, stream_wort5.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_wort6.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:19:3: ^( EQUALS ^( ARITHEXPR $wort7 $wort8) $wort9)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:19:12: ^( ARITHEXPR $wort7 $wort8)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_ARITHEXPR.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_wort7.nextTree());

                adaptor.addChild(root_2, stream_wort8.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_wort9.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:20:3: ^( EQUALS ^( ARITHEXPR $wort1 $wort4) $wort7)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:20:12: ^( ARITHEXPR $wort1 $wort4)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_ARITHEXPR.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_wort1.nextTree());

                adaptor.addChild(root_2, stream_wort4.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_wort7.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:21:3: ^( EQUALS ^( ARITHEXPR $wort2 $wort5) $wort8)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:21:12: ^( ARITHEXPR $wort2 $wort5)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_ARITHEXPR.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_wort2.nextTree());

                adaptor.addChild(root_2, stream_wort5.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_wort8.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:22:3: ^( EQUALS ^( ARITHEXPR $wort3 $wort6) $wort9)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUALS.nextNode()
                , root_1);

                // /home/slaan/git/cip/praktikum3/praktikum2a.g:22:12: ^( ARITHEXPR $wort3 $wort6)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_ARITHEXPR.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_wort3.nextTree());

                adaptor.addChild(root_2, stream_wort6.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
        return retval;
    }
    // $ANTLR end "start_all"


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:25:1: start : calcarithexpr equalsmultexpr calcZeile -> ^( EQUALSMULTT calcarithexpr calcZeile ) ;
    public final praktikum2aParser.start_return start() throws RecognitionException {
        praktikum2aParser.start_return retval = new praktikum2aParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        praktikum2aParser.calcarithexpr_return calcarithexpr13 =null;

        praktikum2aParser.equalsmultexpr_return equalsmultexpr14 =null;

        praktikum2aParser.calcZeile_return calcZeile15 =null;


        RewriteRuleSubtreeStream stream_calcarithexpr=new RewriteRuleSubtreeStream(adaptor,"rule calcarithexpr");
        RewriteRuleSubtreeStream stream_equalsmultexpr=new RewriteRuleSubtreeStream(adaptor,"rule equalsmultexpr");
        RewriteRuleSubtreeStream stream_calcZeile=new RewriteRuleSubtreeStream(adaptor,"rule calcZeile");
        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:25:8: ( calcarithexpr equalsmultexpr calcZeile -> ^( EQUALSMULTT calcarithexpr calcZeile ) )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:25:11: calcarithexpr equalsmultexpr calcZeile
            {
            pushFollow(FOLLOW_calcarithexpr_in_start231);
            calcarithexpr13=calcarithexpr();

            state._fsp--;

            stream_calcarithexpr.add(calcarithexpr13.getTree());

            pushFollow(FOLLOW_equalsmultexpr_in_start233);
            equalsmultexpr14=equalsmultexpr();

            state._fsp--;

            stream_equalsmultexpr.add(equalsmultexpr14.getTree());

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
                // /home/slaan/git/cip/praktikum3/praktikum2a.g:25:53: ^( EQUALSMULTT calcarithexpr calcZeile )
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
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:27:1: calcZeile : arithsingleexpr EQUALS word -> ^( EQUALS arithsingleexpr word ) ;
    public final praktikum2aParser.calcZeile_return calcZeile() throws RecognitionException {
        praktikum2aParser.calcZeile_return retval = new praktikum2aParser.calcZeile_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS17=null;
        praktikum2aParser.arithsingleexpr_return arithsingleexpr16 =null;

        praktikum2aParser.word_return word18 =null;


        Object EQUALS17_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleSubtreeStream stream_arithsingleexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithsingleexpr");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:27:12: ( arithsingleexpr EQUALS word -> ^( EQUALS arithsingleexpr word ) )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:27:14: arithsingleexpr EQUALS word
            {
            pushFollow(FOLLOW_arithsingleexpr_in_calcZeile254);
            arithsingleexpr16=arithsingleexpr();

            state._fsp--;

            stream_arithsingleexpr.add(arithsingleexpr16.getTree());

            EQUALS17=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_calcZeile256);  
            stream_EQUALS.add(EQUALS17);


            pushFollow(FOLLOW_word_in_calcZeile258);
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
            // 27:42: -> ^( EQUALS arithsingleexpr word )
            {
                // /home/slaan/git/cip/praktikum3/praktikum2a.g:27:45: ^( EQUALS arithsingleexpr word )
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
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:29:1: arithsingleexpr : word ARITHEXPR word -> ^( ARITHEXPR word word ) ;
    public final praktikum2aParser.arithsingleexpr_return arithsingleexpr() throws RecognitionException {
        praktikum2aParser.arithsingleexpr_return retval = new praktikum2aParser.arithsingleexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ARITHEXPR20=null;
        praktikum2aParser.word_return word19 =null;

        praktikum2aParser.word_return word21 =null;


        Object ARITHEXPR20_tree=null;
        RewriteRuleTokenStream stream_ARITHEXPR=new RewriteRuleTokenStream(adaptor,"token ARITHEXPR");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:30:2: ( word ARITHEXPR word -> ^( ARITHEXPR word word ) )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:30:4: word ARITHEXPR word
            {
            pushFollow(FOLLOW_word_in_arithsingleexpr277);
            word19=word();

            state._fsp--;

            stream_word.add(word19.getTree());

            ARITHEXPR20=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_arithsingleexpr279);  
            stream_ARITHEXPR.add(ARITHEXPR20);


            pushFollow(FOLLOW_word_in_arithsingleexpr281);
            word21=word();

            state._fsp--;

            stream_word.add(word21.getTree());

            // AST REWRITE
            // elements: ARITHEXPR, word, word
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:24: -> ^( ARITHEXPR word word )
            {
                // /home/slaan/git/cip/praktikum3/praktikum2a.g:30:27: ^( ARITHEXPR word word )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ARITHEXPR.nextNode()
                , root_1);

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
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:32:1: calcarithexpr : calcZeile arithmultexpr calcZeile -> ^( ARITHMULTT calcZeile calcZeile ) ;
    public final praktikum2aParser.calcarithexpr_return calcarithexpr() throws RecognitionException {
        praktikum2aParser.calcarithexpr_return retval = new praktikum2aParser.calcarithexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        praktikum2aParser.calcZeile_return calcZeile22 =null;

        praktikum2aParser.arithmultexpr_return arithmultexpr23 =null;

        praktikum2aParser.calcZeile_return calcZeile24 =null;


        RewriteRuleSubtreeStream stream_arithmultexpr=new RewriteRuleSubtreeStream(adaptor,"rule arithmultexpr");
        RewriteRuleSubtreeStream stream_calcZeile=new RewriteRuleSubtreeStream(adaptor,"rule calcZeile");
        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:33:2: ( calcZeile arithmultexpr calcZeile -> ^( ARITHMULTT calcZeile calcZeile ) )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:33:4: calcZeile arithmultexpr calcZeile
            {
            pushFollow(FOLLOW_calcZeile_in_calcarithexpr300);
            calcZeile22=calcZeile();

            state._fsp--;

            stream_calcZeile.add(calcZeile22.getTree());

            pushFollow(FOLLOW_arithmultexpr_in_calcarithexpr302);
            arithmultexpr23=arithmultexpr();

            state._fsp--;

            stream_arithmultexpr.add(arithmultexpr23.getTree());

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
                // /home/slaan/git/cip/praktikum3/praktikum2a.g:33:41: ^( ARITHMULTT calcZeile calcZeile )
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
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:35:1: arithmultexpr : ARITHEXPR ARITHEXPR ARITHEXPR ;
    public final praktikum2aParser.arithmultexpr_return arithmultexpr() throws RecognitionException {
        praktikum2aParser.arithmultexpr_return retval = new praktikum2aParser.arithmultexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ARITHEXPR25=null;
        Token ARITHEXPR26=null;
        Token ARITHEXPR27=null;

        Object ARITHEXPR25_tree=null;
        Object ARITHEXPR26_tree=null;
        Object ARITHEXPR27_tree=null;

        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:36:2: ( ARITHEXPR ARITHEXPR ARITHEXPR )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:36:4: ARITHEXPR ARITHEXPR ARITHEXPR
            {
            root_0 = (Object)adaptor.nil();


            ARITHEXPR25=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_arithmultexpr323); 
            ARITHEXPR25_tree = 
            (Object)adaptor.create(ARITHEXPR25)
            ;
            adaptor.addChild(root_0, ARITHEXPR25_tree);


            ARITHEXPR26=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_arithmultexpr325); 
            ARITHEXPR26_tree = 
            (Object)adaptor.create(ARITHEXPR26)
            ;
            adaptor.addChild(root_0, ARITHEXPR26_tree);


            ARITHEXPR27=(Token)match(input,ARITHEXPR,FOLLOW_ARITHEXPR_in_arithmultexpr327); 
            ARITHEXPR27_tree = 
            (Object)adaptor.create(ARITHEXPR27)
            ;
            adaptor.addChild(root_0, ARITHEXPR27_tree);


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
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:38:1: equalsmultexpr : EQUALS EQUALS EQUALS ;
    public final praktikum2aParser.equalsmultexpr_return equalsmultexpr() throws RecognitionException {
        praktikum2aParser.equalsmultexpr_return retval = new praktikum2aParser.equalsmultexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS28=null;
        Token EQUALS29=null;
        Token EQUALS30=null;

        Object EQUALS28_tree=null;
        Object EQUALS29_tree=null;
        Object EQUALS30_tree=null;

        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:39:2: ( EQUALS EQUALS EQUALS )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:39:4: EQUALS EQUALS EQUALS
            {
            root_0 = (Object)adaptor.nil();


            EQUALS28=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr337); 
            EQUALS28_tree = 
            (Object)adaptor.create(EQUALS28)
            ;
            adaptor.addChild(root_0, EQUALS28_tree);


            EQUALS29=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalsmultexpr339); 
            EQUALS29_tree = 
            (Object)adaptor.create(EQUALS29)
            ;
            adaptor.addChild(root_0, EQUALS29_tree);


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
        return retval;
    }
    // $ANTLR end "equalsmultexpr"


    public static class word_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "word"
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:45:1: word : ( letters )+ -> ^( WORD ( letters )+ ) ;
    public final praktikum2aParser.word_return word() throws RecognitionException {
        praktikum2aParser.word_return retval = new praktikum2aParser.word_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        praktikum2aParser.letters_return letters31 =null;


        RewriteRuleSubtreeStream stream_letters=new RewriteRuleSubtreeStream(adaptor,"rule letters");
        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:45:6: ( ( letters )+ -> ^( WORD ( letters )+ ) )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:45:8: ( letters )+
            {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:45:8: ( letters )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= A_LET && LA1_0 <= B_LET)||(LA1_0 >= C_LET && LA1_0 <= D_LET)||(LA1_0 >= E_LET && LA1_0 <= V_LET)||(LA1_0 >= W_LET && LA1_0 <= Z_LET)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/slaan/git/cip/praktikum3/praktikum2a.g:45:8: letters
            	    {
            	    pushFollow(FOLLOW_letters_in_word369);
            	    letters31=letters();

            	    state._fsp--;

            	    stream_letters.add(letters31.getTree());

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
            // 45:17: -> ^( WORD ( letters )+ )
            {
                // /home/slaan/git/cip/praktikum3/praktikum2a.g:45:20: ^( WORD ( letters )+ )
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
    // /home/slaan/git/cip/praktikum3/praktikum2a.g:47:1: letters : ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) ;
    public final praktikum2aParser.letters_return letters() throws RecognitionException {
        praktikum2aParser.letters_return retval = new praktikum2aParser.letters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:47:9: ( ( A_LET | B_LET | C_LET | D_LET | E_LET | F_LET | G_LET | H_LET | I_LET | J_LET | K_LET | L_LET | M_LET | N_LET | O_LET | P_LET | Q_LET | R_LET | S_LET | T_LET | U_LET | V_LET | W_LET | X_LET | Y_LET | Z_LET ) )
            // /home/slaan/git/cip/praktikum3/praktikum2a.g:
            {
            root_0 = (Object)adaptor.nil();


            set32=(Token)input.LT(1);

            if ( (input.LA(1) >= A_LET && input.LA(1) <= B_LET)||(input.LA(1) >= C_LET && input.LA(1) <= D_LET)||(input.LA(1) >= E_LET && input.LA(1) <= V_LET)||(input.LA(1) >= W_LET && input.LA(1) <= Z_LET) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set32)
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
    // $ANTLR end "letters"

    // Delegated rules


 

    public static final BitSet FOLLOW_word_in_start_all38 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_start_all40 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all44 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_start_all46 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_start_all54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_start_all56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_start_all58 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all64 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_start_all66 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all70 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_start_all72 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all76 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_start_all80 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_start_all82 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_start_all84 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all90 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_start_all92 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all96 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_start_all98 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_start_all102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calcarithexpr_in_start231 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_equalsmultexpr_in_start233 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_calcZeile_in_start235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithsingleexpr_in_calcZeile254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_calcZeile256 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_calcZeile258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_word_in_arithsingleexpr277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_arithsingleexpr279 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_word_in_arithsingleexpr281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calcZeile_in_calcarithexpr300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_arithmultexpr_in_calcarithexpr302 = new BitSet(new long[]{0x0000001E7FFFE6C0L});
    public static final BitSet FOLLOW_calcZeile_in_calcarithexpr304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITHEXPR_in_arithmultexpr323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_arithmultexpr325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARITHEXPR_in_arithmultexpr327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr337 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr339 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_equalsmultexpr341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letters_in_word369 = new BitSet(new long[]{0x0000001E7FFFE6C2L});

}