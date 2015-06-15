package output;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        buchstabenGrammarLexer lex = new buchstabenGrammarLexer(new ANTLRFileStream("/home/slaan/git/cip/testordner/SymbolRaetsel", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        System.out.println(tokens);
        buchstabenGrammarParser g = new buchstabenGrammarParser(tokens);
        System.out.println("test1");
        try {
          System.out.println("test2");
            buchstabenGrammarParser.start_all_return result = g.start_all();
            System.out.println(result);
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}