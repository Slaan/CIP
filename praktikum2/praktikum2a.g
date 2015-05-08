grammar praktikum2a;

options {output=AST;}

tokens {
	EQUALSMULTT;
	ARITHMULTT;
	WORD;
}

start 	: 	calcarithexpr equalsmultexpr calcZeile -> ^(EQUALSMULTT calcarithexpr calcZeile);

calcZeile 	:	arithsingleexpr EQUALS word -> ^(EQUALS arithsingleexpr word);

arithsingleexpr
	:	word ARITHEXPR word -> ^(ARITHEXPR word word);

calcarithexpr
	:	calcZeile arithmultexpr calcZeile -> ^(ARITHMULTT calcZeile calcZeile);

arithmultexpr
	:	ARITHEXPR ARITHEXPR ARITHEXPR;
	
equalsmultexpr
	:	EQUALS EQUALS EQUALS;

ARITHEXPR	:	'+'|'-';

EQUALS 	:	 '=';

word	:	letters+ -> ^(WORD letters+);

letters	:	(A_LET|B_LET|C_LET|D_LET|E_LET|F_LET|G_LET|H_LET|I_LET|J_LET|K_LET|L_LET|M_LET|N_LET|O_LET|P_LET
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


COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
