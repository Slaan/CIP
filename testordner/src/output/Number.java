package output;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.tree.Tree;

public class Number {
  char[] digits;
  int maxSize;

  public void setDigits(List<Tree> tokens) {
    System.out.println(tokens);
    digits = new char[tokens.size()];
    for (int i = 0; i < tokens.size(); i++) {
      Tree tree = tokens.get(i);
      char c = tree.getText().charAt(0);
      digits[i] = c;
    }
  }

  public List<String> getCharacters() {
    List<String> number = new ArrayList<String>();
    for (int i = maxSize - digits.length; i > 0; i--) {
      number.add(null);
    }
    for (int i = 0; i < digits.length; i++) {
      number.add("" + digits[i]);
    }
    return number;
  }

  public int getSize() {
    return digits.length;
  }
}

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
// import org.antlr.runtime.tree.Tree;
// public class Number {
// List<String> digits = new ArrayList<>();
// int maxSize;
// public void setDigits(List<Tree> tokens) {
// for (Tree tree : tokens) {
// digits.add(tree.getText());
// }
// }
// public List<String> getCharacters() {
// return digits;
// }
// public int getSize() {
// return digits.size();
// }
// }
