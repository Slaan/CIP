import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        praktikum2bLexer lex = new praktikum2bLexer(new ANTLRFileStream("/home/slaan/git/cip/praktikum2/sprachtest", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        praktikum2bParser g = new praktikum2bParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}