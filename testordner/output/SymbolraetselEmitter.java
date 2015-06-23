// $ANTLR 3.4 /home/slaan/git/cip/testordner/SymbolraetselEmitter.g 2015-06-23 18:24:36

import java.util.Set;
import java.util.HashSet;
import java.lang.Character;


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
        public Set<String> symbole;
        public Set<String> constraints;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "puzzle"
    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:12:1: puzzle returns [Set<String> symbole, Set<String> constraints] : ^( PUZZLE part1= constraint part2= constraint part3= constraint part4= constraint part5= constraint part6= constraint ) -> sums(symbols=$symbolesums=$constraints);
    public final SymbolraetselEmitter.puzzle_return puzzle() throws RecognitionException {
        SymbolraetselEmitter.puzzle_return retval = new SymbolraetselEmitter.puzzle_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.constraint_return part1 =null;

        SymbolraetselEmitter.constraint_return part2 =null;

        SymbolraetselEmitter.constraint_return part3 =null;

        SymbolraetselEmitter.constraint_return part4 =null;

        SymbolraetselEmitter.constraint_return part5 =null;

        SymbolraetselEmitter.constraint_return part6 =null;


        try {
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:13:3: ( ^( PUZZLE part1= constraint part2= constraint part3= constraint part4= constraint part5= constraint part6= constraint ) -> sums(symbols=$symbolesums=$constraints))
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:14:3: ^( PUZZLE part1= constraint part2= constraint part3= constraint part4= constraint part5= constraint part6= constraint )
            {
            match(input,PUZZLE,FOLLOW_PUZZLE_in_puzzle64); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_constraint_in_puzzle68);
            part1=constraint();

            state._fsp--;


            pushFollow(FOLLOW_constraint_in_puzzle72);
            part2=constraint();

            state._fsp--;


            pushFollow(FOLLOW_constraint_in_puzzle76);
            part3=constraint();

            state._fsp--;


            pushFollow(FOLLOW_constraint_in_puzzle80);
            part4=constraint();

            state._fsp--;


            pushFollow(FOLLOW_constraint_in_puzzle84);
            part5=constraint();

            state._fsp--;


            pushFollow(FOLLOW_constraint_in_puzzle88);
            part6=constraint();

            state._fsp--;


            match(input, Token.UP, null); 



            	retval.symbole = new HashSet<>();
            	retval.constraints = new HashSet<>();
            	
            	retval.symbole.addAll((part1!=null?part1.constraints:null));
            	retval.symbole.addAll((part2!=null?part2.constraints:null));
            	retval.symbole.addAll((part3!=null?part3.constraints:null));
            	retval.symbole.addAll((part4!=null?part4.constraints:null));
            	retval.symbole.addAll((part5!=null?part5.constraints:null));
            	retval.symbole.addAll((part6!=null?part6.constraints:null));
            	
            	retval.constraints.add((part1!=null?part1.st:null).toString());
            	retval.constraints.add((part2!=null?part2.st:null).toString());
            	retval.constraints.add((part3!=null?part3.st:null).toString());
            	retval.constraints.add((part4!=null?part4.st:null).toString());
            	retval.constraints.add((part5!=null?part5.st:null).toString());
            	retval.constraints.add((part6!=null?part6.st:null).toString());
            	

            // TEMPLATE REWRITE
            // 34:3: -> sums(symbols=$symbolesums=$constraints)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("symbols", retval.symbole).put("sums", retval.constraints));
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
        public Set<String> constraints;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:37:1: constraint returns [Set<String> constraints] : ^( EQUALS ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbererg=$n3.number);
    public final SymbolraetselEmitter.constraint_return constraint() throws RecognitionException {
        SymbolraetselEmitter.constraint_return retval = new SymbolraetselEmitter.constraint_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.number_return n1 =null;

        SymbolraetselEmitter.number_return n2 =null;

        SymbolraetselEmitter.number_return n3 =null;


        try {
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:44:3: ( ^( EQUALS ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbererg=$n3.number))
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:45:3: ^( EQUALS ^( PLUS n1= number n2= number ) n3= number )
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_constraint142); 

            match(input, Token.DOWN, null); 
            match(input,PLUS,FOLLOW_PLUS_in_constraint149); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint153);
            n1=number();

            state._fsp--;


            pushFollow(FOLLOW_number_in_constraint157);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_number_in_constraint163);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 49:4: -> sum(number1=$n1.numbernumber2=$n2.numbererg=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("erg", (n3!=null?n3.number:null)));
            }



            }


              	retval.constraints = new HashSet<String>();
                	retval.constraints.addAll(n1.number.getCharacters());
               	retval.constraints.addAll(n2.number.getCharacters());
                	retval.constraints.addAll(n3.number.getCharacters());  	    	
              
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
    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:52:1: number returns [Number number] : ^( WORD (syms+= BUCHSTABEN )+ ) ;
    public final SymbolraetselEmitter.number_return number() throws RecognitionException {
        SymbolraetselEmitter.number_return retval = new SymbolraetselEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree syms=null;
        List list_syms=null;

        try {
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:57:3: ( ^( WORD (syms+= BUCHSTABEN )+ ) )
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:58:3: ^( WORD (syms+= BUCHSTABEN )+ )
            {
            match(input,WORD,FOLLOW_WORD_in_number218); 

            match(input, Token.DOWN, null); 
            // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:58:14: (syms+= BUCHSTABEN )+
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
            	    // /home/slaan/git/cip/testordner/SymbolraetselEmitter.g:58:14: syms+= BUCHSTABEN
            	    {
            	    syms=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_number222); 
            	    if (list_syms==null) list_syms=new ArrayList();
            	    list_syms.add(syms);


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


 

    public static final BitSet FOLLOW_PUZZLE_in_puzzle64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_puzzle68 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_constraint_in_puzzle72 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_constraint_in_puzzle76 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_constraint_in_puzzle80 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_constraint_in_puzzle84 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_constraint_in_puzzle88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUALS_in_constraint142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_constraint149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_number_in_constraint157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_number218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_number222 = new BitSet(new long[]{0x0000000000000028L});

}