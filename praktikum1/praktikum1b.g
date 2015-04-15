grammar praktikum1b;


start	
	:	 PROGRAM
		 deklaration*
		 BEGIN
		 anweisung_start*
		 END;

PROGRAM       
	:	 'program';

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

SEMIKOLON     
	:	';';
	
DEKLARATIONSSYMBOL
	:	('boolean'|'integer'|'string'|'real');

deklaration    
	:	DEKLARATIONSSYMBOL ID (KOMMA ID)* SEMIKOLON;

anweisung_start
	:	anweisung SEMIKOLON;
	
anweisung 
	:	(wertzuweisung|arith1|ifanweisung|whileanweisung|read|print|vergleich);
	
wertzuweisung
	:	 ID WERTZUWEISUNG (arith1|STRING|vergleich);

ifanweisung 	
	:	'if' vergleich 'then' anweisung_start ('else' anweisung_start)? 'fi';

whileanweisung	
	:	'while' vergleich 'do' anweisung_start 'od';

read	
	:	'read' '('ID')';

print
	:	'println' '('(arith1|STRING)')';

vergleich
	:	(STRING|INT|FLOAT|BOOLEAN) VERGLEICHSZEICHEN (STRING|INT|FLOAT|BOOLEAN);
	
VERGLEICHSZEICHEN 
	:	 ('<'|'>'|'='|'>='|'<='|'<>');

 arithExpr	:	arith1 SEMIKOLON;

arith1
	:	arith2 (ADDSUBSYM arith2)*;	

arith2
	:	arith3 (MULDIVSYM arith3)*;

arith3
	:	(INT|FLOAT|'('arith1')'|ID);
	
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
