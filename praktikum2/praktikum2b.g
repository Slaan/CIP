grammar praktikum2b;

options {output=AST;}

tokens {
	DEKLA;
	ANWEIS;
}

start	
	:	 PROGRAM !
		 dekla
		 BEGIN !
		 anweisung_start
		 END !;
		
dekla	:	deklaration* -> ^(DEKLA deklaration*);

deklaration    
	:	DEKLARATIONSSYMBOL ID (KOMMA ID)* SEMIKOLON -> ^(DEKLARATIONSSYMBOL ID*);

anweisung_start
	:	anweisung* -> ^(ANWEIS anweisung*);
	
anweisung 
	:	(wertzuweisung|arith1|ifanweisung|whileanweisung|read|print|vergleich) SEMIKOLON !;
	
wertzuweisung
	:	 ID WERTZUWEISUNG zuweisung -> ^(WERTZUWEISUNG ID zuweisung);

zuweisung
	:	(arith1|STRING|vergleich);

ifanweisung 	
	:	'if' vergleich 'then' anweisung_start ('else' anweisung_start)? 'fi' -> ^('if' vergleich anweisung_start);

whileanweisung	
	:	'while' vergleich 'do' anweisung_start 'od' -> ^('while' vergleich anweisung_start);

read	
	:	'read' '('ID')' -> ^('read' ID);

print
	:	'println' '('print2')' -> ^('println' print2);

print2	:	(arith1|STRING);

vergleich
	:	 first=vergleich2 VERGLEICHSZEICHEN second=vergleich2 -> ^(VERGLEICHSZEICHEN $first $second);
	
vergleich2
	:	(STRING|INT|FLOAT|BOOLEAN);
	
 arithExpr	:	arith1 SEMIKOLON !;

arith1
	:	arith2 (ADDSUBSYM^ arith2)*;

arith2
	:	arith3 (MULDIVSYM^ arith3)*;

arith3
	:	(INT|FLOAT| '(' ! arith1 ')' ! |ID);

PROGRAM       
	:	'program';

BEGIN 	
	:	'begin';

END	
	:	'end';

EQUALS	
	: 	'=';

WERTZUWEISUNG
	: 	':=';

BOOLEAN 	
	:	'true'|'false';

VERGLEICHSZEICHEN 
	:	 ('<'|'>'|'='|'>='|'<='|'<>');

SEMIKOLON     
	:	';';
	
DEKLARATIONSSYMBOL
	:	('boolean'|'integer'|'string'|'real');
	
ADDSUBSYM
	:	'+'|'-';

MULDIVSYM
	:	'*'|'/';
	
KOMMA
	: 	',';

ID  
	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT 
	:	('-')?'0'..'9'+;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* 
    |   '.' ('0'..'9')+ 
    |   ('0'..'9')+ 
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
