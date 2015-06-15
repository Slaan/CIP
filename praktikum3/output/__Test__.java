import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        praktikum2aLexer lex = new praktikum2aLexer(new ANTLRFileStream("/home/slaan/git/cip/praktikum3/zwischentree", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        praktikum2aParser parser = new praktikum2aParser(tokens);
        praktikum2aParser.start_return r = parser.start();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        minusgen walker = new minusgen(nodes);
        try {
            walker.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}