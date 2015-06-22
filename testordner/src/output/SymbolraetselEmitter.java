package output;

// $ANTLR 3.4 /home/slaan/git/cip/testordner/SymbolraetselEmitter.g 2015-06-22 16:30:51

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselEmitter extends TreeParser {
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


    public SymbolraetselEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SymbolraetselEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SymbolraetselEmitter.tokenNames; }
    public String getGrammarFileName() { return "/home/slaan/git/cip/testordner/SymbolraetselEmitter.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "puzzle"
    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:8:1: puzzle : ^( PUZZLE (constraints+= constraint )* ) -> sums(sums=$constraints);
    public final SymbolraetselEmitter.puzzle_return puzzle() throws RecognitionException {
        SymbolraetselEmitter.puzzle_return retval = new SymbolraetselEmitter.puzzle_return();
        retval.start = input.LT(1);


        List list_constraints=null;
        RuleReturnScope constraints = null;
        try {
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:9:3: ( ^( PUZZLE (constraints+= constraint )* ) -> sums(sums=$constraints))
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:10:3: ^( PUZZLE (constraints+= constraint )* )
            {
            match(input,PUZZLE,FOLLOW_PUZZLE_in_puzzle56); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:10:23: (constraints+= constraint )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==EQUALS) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:10:23: constraints+= constraint
                	    {
                	    pushFollow(FOLLOW_constraint_in_puzzle60);
                	    constraints=constraint();

                	    state._fsp--;

                	    if (list_constraints==null) list_constraints=new ArrayList();
                	    list_constraints.add(constraints.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 11:3: -> sums(sums=$constraints)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("sums", list_constraints));
            }



            }

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
    // $ANTLR end "puzzle"


    public static class constraint_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:14:1: constraint : ^( EQUALS ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final SymbolraetselEmitter.constraint_return constraint() throws RecognitionException {
        SymbolraetselEmitter.constraint_return retval = new SymbolraetselEmitter.constraint_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.number_return n1 =null;

        SymbolraetselEmitter.number_return n2 =null;

        SymbolraetselEmitter.number_return n3 =null;


        try {
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:22:3: ( ^( EQUALS ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:23:3: ^( EQUALS ^( PLUS n1= number n2= number ) n3= number )
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_constraint99); 

            match(input, Token.DOWN, null); 
            match(input,PLUS,FOLLOW_PLUS_in_constraint106); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint110);
            n1=number();

            state._fsp--;


            pushFollow(FOLLOW_number_in_constraint114);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_number_in_constraint123);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 28:4: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }



            }


            Constraint constraint = new Constraint();
            constraint.numbers.add((n1!=null?n1.number:null));
            constraint.numbers.add((n2!=null?n2.number:null));
            constraint.numbers.add((n3!=null?n3.number:null));
            constraint.prepare();

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
    // $ANTLR end "constraint"


    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "number"
    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:31:1: number returns [Number number] : ^( WORD (syms+= BUCHSTABEN )+ ) ;
    public final SymbolraetselEmitter.number_return number() throws RecognitionException {
        SymbolraetselEmitter.number_return retval = new SymbolraetselEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree syms=null;
        List list_syms=null;

        try {
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:36:3: ( ^( WORD (syms+= BUCHSTABEN )+ ) )
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:37:3: ^( WORD (syms+= BUCHSTABEN )+ )
            {
            match(input,WORD,FOLLOW_WORD_in_number175); 

            match(input, Token.DOWN, null); 
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:37:14: (syms+= BUCHSTABEN )+
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
            	    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:37:14: syms+= BUCHSTABEN
            	    {
            	    syms=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_number179); 
            	    if (list_syms==null) list_syms=new ArrayList();
            	    list_syms.add(syms);


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


            match(input, Token.UP, null); 


            }


            retval.number = new Number();
            retval.number.setDigits(list_syms);

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
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_PUZZLE_in_puzzle56 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_puzzle60 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_EQUALS_in_constraint99 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_constraint106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint110 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_constraint114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_number175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_number179 = new BitSet(new long[]{0x0000000000000028L});

}