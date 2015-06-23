package output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Main {
	private static final String TEMPLATE_FILE = "template.stg";

	public static void main(String[] args) throws RecognitionException,
			FileNotFoundException, IOException {
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				"SymbolRaetsel.txt"));
		 
		buchstabenGrammarLexer lexer = new buchstabenGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		buchstabenGrammarParser parser = new buchstabenGrammarParser(tokens);
		buchstabenGrammarParser.start_all_return result = parser.start_all();
		Tree t = (Tree) result.getTree();
		System.out.println("nach dem parsen");
		System.out.println(t.toStringTree());

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		treeWalker normalizer = new treeWalker(nodes);
		treeWalker.start_return ast2 = normalizer.start();
		Tree r2 = ((Tree) ast2.getTree());
		System.out.println("\n\nnach dem normalisieren");
		System.out.println(r2.toStringTree());


		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(r2);
		nodes2.setTokenStream(tokens);
		SymbolraetselEmitter emitter = new SymbolraetselEmitter(nodes2);
		InputStream templateIs = Main.class.getClassLoader()
				.getResourceAsStream(TEMPLATE_FILE);

		StringTemplateGroup templates = new StringTemplateGroup(
				new InputStreamReader(templateIs, "ISO-8859-15"),
				AngleBracketTemplateLexer.class);
		emitter.setTemplateLib(templates);
		SymbolraetselEmitter.puzzle_return puzzle_return = emitter.puzzle();
		String output = puzzle_return.getTemplate().toString();
		System.out.println("\n\nausgabe");
		System.out.println(output);
		Path relative = Paths.get("Chocobo.java");
		Path absolut = relative.toAbsolutePath();
		System.out.println(absolut);
		Files.write(Paths.get("Chocobo.java"), output.getBytes());
	}

}
