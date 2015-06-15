tree grammar treeWalker;

options {
	output=AST;
	tokenVocab=buchstabenGrammar; 
	ASTLabelType=CommonTree;
}
start	:	subtree*;

subtree	:	'(' EQUALS '(' '+' wort1=wordtree wort2=wordtree ')' wort3=wordtree  ')' 
			-> ^(EQUALS ^(PLUS $wort1 $wort2) $wort3)
	|	'(' EQUALS '(' '-' wort1=wordtree wort2=wordtree ')' wort3=wordtree  ')' 
			-> ^(EQUALS ^(PLUS $wort3 $wort2) $wort1);

wordtree 
	:	'(' 'WORD' letters+ ')' -> ^('WORD' letters+);
	
letters	:	(A_LET|B_LET|C_LET|D_LET|E_LET|F_LET|G_LET|H_LET|I_LET|J_LET|K_LET|L_LET|M_LET|N_LET|O_LET|P_LET
		|Q_LET|R_LET|S_LET|T_LET|U_LET|V_LET|W_LET|X_LET|Y_LET|Z_LET);
