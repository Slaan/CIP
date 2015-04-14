grammar praktikum1b;


start	
	:	 PROGRAM
		 deklaration
		 BEGIN
		 anweisung
		 END;

PROGRAM       
	:	 'program';

BEGIN 	
	:	'begin';

END	
	:	'end';

EQUALS	
	: 	'=';

BOOLEAN 	
	:	'true'|'false';

SEMIKOLON     
	:	';';

deklaration    
	:	 (ID (INT|STRING|FLOAT|BOOLEAN) SEMIKOLON)*;
	
anweisung 
	:	(wertzuweisung|arithExpr|ifanweisung|whileanweisung|read|print|vergleich)+;
	
wertzuweisung
	:	 ID EQUALS (arithExpr|STRING|vergleich);

ifanweisung 	
	:	'if' vergleich 'then' anweisung ('else' anweisung)? 'fi';

whileanweisung	
	:	'while' vergleich 'do' anweisung 'od';

read	
	:	'read' '('ID')';

print
	:	'println' '('(arithExpr|STRING)')';

vergleich
	:	(STRING|arithExpr) VERGLEICHSZEICHEN (STRING|arithExpr);

fragment VERGLEICHSFRAG 
	:	('<'|'>'|'='|'>='|'<=');
	
VERGLEICHSZEICHEN 
	:	 VERGLEICHSFRAG;

arithExpr
	:	INT (arithSubExpr)* EQUALS INT;
	
arithSubExpr
	:	ARITHZEICHEN INT;
	
ARITHZEICHEN 
	:	ARITHFRAG;
	
fragment ARITHFRAG
	:	('+'|'-'|'*'|'/');

ID  
	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT 
	:	'0'..'9'+;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
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
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

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
