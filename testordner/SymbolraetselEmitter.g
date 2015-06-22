tree grammar SymbolraetselEmitter;
options {
  tokenVocab   = buchstabenGrammar;
  output       = template;
  ASTLabelType = CommonTree;
}

puzzle
  :
  ^(PUZZLE constraints+=constraint*)
  -> sums(sums={$constraints})
  ;

constraint
@after {
Constraint constraint = new Constraint();
constraint.numbers.add($n1.number);
constraint.numbers.add($n2.number);
constraint.numbers.add($n3.number);
constraint.prepare();
}
  :
  ^(
    EQUALS
    ^(PLUS n1=number n2=number)
    n3=number
   )
   -> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number})
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