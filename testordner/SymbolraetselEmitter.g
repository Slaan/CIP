tree grammar SymbolraetselEmitter;
options {
  tokenVocab   = buchstabenGrammar;
  output       = template;
  ASTLabelType = CommonTree;
}
@header {
import java.util.Set;
import java.util.HashSet;
import java.lang.Character;
}
puzzle returns [Set<String> symbole, Set<String> constraints]
  :
  ^(PUZZLE part1=constraint part2=constraint part3=constraint part4=constraint part5=constraint part6=constraint)  
	{
	$symbole = new HashSet<>();
	$constraints = new HashSet<>();
	
	$symbole.addAll($part1.constraints);
	$symbole.addAll($part2.constraints);
	$symbole.addAll($part3.constraints);
	$symbole.addAll($part4.constraints);
	$symbole.addAll($part5.constraints);
	$symbole.addAll($part6.constraints);
	
	$constraints.add($part1.st.toString());
	$constraints.add($part2.st.toString());
	$constraints.add($part3.st.toString());
	$constraints.add($part4.st.toString());
	$constraints.add($part5.st.toString());
	$constraints.add($part6.st.toString());
	}

  -> sums(symbols={$symbole},sums={$constraints})
  ;

constraint returns [Set<String> constraints]
  @after {
  	$constraints = new HashSet<String>();
    	$constraints.addAll(n1.number.getCharacters());
   	$constraints.addAll(n2.number.getCharacters());
    	$constraints.addAll(n3.number.getCharacters());  	    	
  }
  :
  ^(
    EQUALS
    ^(PLUS n1=number n2=number)  n3=number  )
    
   -> sum(number1={$n1.number}, number2={$n2.number}, erg={$n3.number})
  ;

number returns [Number number]
@after {
$number = new Number();
$number.setDigits($syms);
}
  :
  ^(WORD syms+=BUCHSTABEN+)
  ;
  /*
buchstaben
	:	(A_LET|B_LET|C_LET|D_LET|E_LET|F_LET|G_LET|H_LET|I_LET|J_LET|K_LET|L_LET|M_LET|N_LET|O_LET|P_LET
		|Q_LET|R_LET|S_LET|T_LET|U_LET|V_LET|W_LET|X_LET|Y_LET|Z_LET);
*/