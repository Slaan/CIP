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
    try {
      praktikum2aParser.start_all_return grammar1_return = g.start_all();
      CommonTree tree1 = (CommonTree) grammar1_return.getTree();
      writetree(tree1);
      System.out.println(tree1.toStringTree() + "\r\n");
      TreeNodeStream symbolNodeStream = new CommonTreeNodeStream(tree1);
      
      minusgenLexer minuslex = new minusgenLexer(new ANTLRFileStream("./zwischentree.txt"));
      CommonTokenStream minusgentokens = new CommonTokenStream(minuslex);
      minusgenParser minusgenpars = new minusgenParser(minusgentokens);
      minusgenParser.start_return grammar2_return = minusgenpars.start();
      CommonTree tree2 = (CommonTree) grammar2_return.getTree();
      System.out.println(tree2.toStringTree());
      
//      CommonTokenStream asf = (CommonTokenStream) symbolNodeStream.getTokenStream();
//      
//      minusgenParser umwandlung = new minusgenParser(asf);
//      minusgenParser.start_return grammar2_return = umwandlung.start();
//      CommonTree tree2 = (CommonTree) grammar2_return.getTree();      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }

  private static void writetree(CommonTree tree1) {
    File dir = new File("./");
    String filename = "zwischentree.txt";
    File file = new File(dir,filename);
    try {
      FileWriter fw = new FileWriter(file);
      fw.write(tree1.toStringTree());
      fw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
