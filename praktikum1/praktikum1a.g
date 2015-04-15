grammar praktikum1a;

start 	: 	calcZeile 
		ARITHEXPR ARITHEXPR ARITHEXPR
		calcZeile
		EQUALS  EQUALS EQUALS
		calcZeile;

calcZeile 	:	letters ARITHEXPR letters EQUALS letters; 

ARITHEXPR	:	'+'|'-';

EQUALS 	:	 '=';

letters	:	(A_LET|B_LET|C_LET|D_LET|E_LET|F_LET|G_LET|H_LET|I_LET|J_LET|K_LET|L_LET|M_LET|N_LET|O_LET|P_LET
		|Q_LET|R_LET|S_LET|T_LET|U_LET|V_LET|W_LET|X_LET|Y_LET|Z_LET)+;
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
