tree grammar treeWalker;

options {
	output=AST;
	tokenVocab=buchstabenGrammar; 
	ASTLabelType=CommonTree;
}

start	:	^(PUZZLE subtree*) -> ^(PUZZLE subtree*);

subtree	:	plustree|minustree;

plustree:		^(EQUALS ^(PLUS wordtree wordtree) wordtree);
			
minustree:		^(EQUALS ^(MINUS l1=wordtree l2=wordtree) l3=wordtree)
			-> ^(EQUALS ^(PLUS["+"] $l3 $l2) $l1);

wordtree 
	:	^(WORD letters+);

letters	:	BUCHSTABEN+;
	
/*letters	:	(A_LET|B_LET|C_LET|D_LET|E_LET|F_LET|G_LET|H_LET|I_LET|J_LET|K_LET|L_LET|M_LET|N_LET|O_LET|P_LET
		|Q_LET|R_LET|S_LET|T_LET|U_LET|V_LET|W_LET|X_LET|Y_LET|Z_LET);