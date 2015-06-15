import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeNodeStream;

public class symbol_1 {

  public static void main(String args[]) throws Exception {
    praktikum2aLexer lex =
        new praktikum2aLexer(new ANTLRFileStream("/home/slaan/git/cip/praktikum3/SymbolRaetsel",
            "UTF8"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    praktikum2aParser g = new praktikum2aParser(tokens);
    System.out.println(tokens);
    try {
      praktikum2aParser.start_all_return r = g.start_all();
      CommonTree tree1 = (CommonTree) r.getTree();
      System.out.println(tree1.toStringTree());
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());

      minusgen umwandler = new minusgen(nodes);
      minusgen.start_return result = umwandler.start();
      CommonTree tree2 = (CommonTree) result.getTree();
      System.out.println(tree2.toStringTree());
            
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }
}
