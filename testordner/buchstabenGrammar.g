grammar buchstabenGrammar;

options {output=AST;}

tokens {
	EQUALSMULTT;
	ARITHMULTT;
	WORD;
	PUZZLE;
}

start_all
	:	wort1=word arithexpr wort2=word EQUALS wort3=word
		arithexpr arithexpr arithexpr
		wort4=word arithexpr wort5=word EQUALS wort6=word
		EQUALS EQUALS EQUALS
		wort7=word arithexpr wort8=word EQUALS wort9=word
		-> ^(PUZZLE ^(EQUALS ^(arithexpr $wort1 $wort2) $wort3)
		^(EQUALS ^(arithexpr $wort4 $wort5) $wort6)
		^(EQUALS ^(arithexpr $wort7 $wort8) $wort9)
		^(EQUALS ^(arithexpr $wort1 $wort4) $wort7)
		^(EQUALS ^(arithexpr $wort2 $wort5) $wort8)
		^(EQUALS ^(arithexpr $wort3 $wort6) $wort9))
		;

start 	: 	calcarithexpr equalsmultexpr calcZeile -> ^(EQUALSMULTT calcarithexpr calcZeile);

calcZeile 	:	arithsingleexpr EQUALS word -> ^(EQUALS arithsingleexpr word);

arithsingleexpr
	:	word arithexpr word -> ^(arithexpr word word);

calcarithexpr
	:	calcZeile arithmultexpr calcZeile -> ^(ARITHMULTT calcZeile calcZeile);

arithmultexpr
	:	arithexpr arithexpr arithexpr;
	
equalsmultexpr
	:	EQUALS EQUALS EQUALS;

arithexpr	:	(PLUS|MINUS);

PLUS 	:	'+';

MINUS	:	'-';

EQUALS 	:	 '=';

word	:	letters+ -> ^(WORD letters+);

letters	:	BUCHSTABEN+;
/*
(A_LET|B_LET|C_LET|D_LET|E_LET|F_LET|G_LET|H_LET|I_LET|J_LET|K_LET|L_LET|M_LET|N_LET|O_LET|P_LET
		|Q_LET|R_LET|S_LET|T_LET|U_LET|V_LET|W_LET|X_LET|Y_LET|Z_LET);
A_LET	:	'A';
B_LET	:	'B';
C_LET	:	'C';
D_LET	:	'D';
E_LET	:	'E';
F_LET	:	'F';
G_LET	:	'G';
H_LET	:	'H';
I_LET	:	'I';
J_LET	:	'J';
K_LET	:	'K';
L_LET	:	'L';
M_LET	:	'M';
N_LET	:	'N';
O_LET	:	'O';
P_LET	:	'P';
Q_LET	:	'Q';
R_LET	:	'R';
S_LET	:	'S';
T_LET	:	'T';
U_LET	:	'U';
V_LET	:	'V';
W_LET	:	'W';
X_LET	:	'X';
Y_LET	:	'Y';
Z_LET	:	'Z';
*/

  BUCHSTABEN
  	:	('A'..'Z');	


COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
