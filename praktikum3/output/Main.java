import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Main {
	private static final String TEMPLATE_FILE = "template.stg";

	public static void main(String[] args) throws RecognitionException,
			FileNotFoundException, IOException {
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				"TestInput.txt"));
		praktikum2aLexer lexer = new praktikum2aLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		praktikum2aParser parser = new praktikum2aParser(tokens);
		praktikum2aParser.start_all_return result = parser.start_all();
		Tree t = (Tree) result.getTree();
		System.out.println("nach dem parsen");
	
		System.out.println(t.toStringTree());
		writetree((CommonTree) result.getTree(), "./zwischentree.txt");

//		minusgenLexer minuslex = new minusgenLexer(new ANTLRFileStream("./zwischentree.txt"));
//	    CommonTokenStream minusgentokens = new CommonTokenStream(minuslex);
//	    minusgenParser minusgenpars = new minusgenParser(minusgentokens);
//	    minusgenParser.start_return grammar2_return = minusgenpars.start();
//	    CommonTree tree2 = (CommonTree) grammar2_return.getTree();
//		System.out.println("\n\nnach dem normalisieren");
//		System.out.println(tree2.toStringTree());
//		writetree(tree2, "./zwischentree2.txt");
//

//		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(r2);
//		nodes2.setTokenStream(tokens);
//		SymbolraetselEmitter emitter = new SymbolraetselEmitter(nodes2);
//		InputStreamf templateIs = Main.class.getClassLoader()
//				.getResourceAsStream(TEMPLATE_FILE);
//
//		StringTemplateGroup templates = new StringTemplateGroup(
//				new InputStreamReader(templateIs, "ISO-8859-15"),
//				AngleBracketTemplateLexer.class);
//		emitter.setTemplateLib(templates);
//		SymbolraetselEmitter.puzzle_return puzzle_return = emitter.puzzle();
//		String output = puzzle_return.getTemplate().toString();
//		System.out.println("\n\nausgabe");
//		System.out.println(output);
	}

	private static void writetree(CommonTree tree1, String path) {
	    File dir = new File("./");
	    String filename = path;
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
