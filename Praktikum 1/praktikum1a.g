grammar praktikum1a;

start 	: 	calcZeile 
		ARITHEXPR ARITHEXPR ARITHEXPR
		calcZeile
		EQUALS  EQUALS EQUALS
		calcZeile;

calcZeile 	:	LETTERS ARITHEXPR LETTERS EQUALS LETTERS; 

ARITHEXPR	:	'+'|'-';

EQUALS 	:	 '=';

LETTERS	:	('A'..'Z')+;


COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
