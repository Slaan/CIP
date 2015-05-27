grammar minusgen;

options {output=AST;}

start	:	subtree*;

subtree	:	'(' EQUALS '(' '+' wort1=wordtree wort2=wordtree ')' wort3=wordtree  ')' 
			-> ^(EQUALS ^(PLUS $wort1 $wort2) $wort3)
	|	'(' EQUALS '(' '-' wort1=wordtree wort2=wordtree ')' wort3=wordtree  ')' 
			-> ^(EQUALS ^(PLUS $wort3 $wort2) $wort1);

wordtree 
	:	'(' 'WORD' LETTER+ ')' -> ^('WORD' LETTER+);
	
PLUS	:	'+';

MINUS	:	'-';

EQUALS 	:	'=';

LETTER	:	('A'..'Z');

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
