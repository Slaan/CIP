import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        buchstabenGrammarLexer lex = new buchstabenGrammarLexer(new ANTLRFileStream("/home/slaan/git/cip/praktikum3/zwischentree", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        buchstabenGrammarParser parser = new buchstabenGrammarParser(tokens);
        buchstabenGrammarParser.start_return r = parser.start();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        treeWalker walker = new treeWalker(nodes);
        try {
            walker.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}