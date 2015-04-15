grammar praktikum1b;


start	
	:	 PROGRAM
		 deklaration*
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
	
anweisung 
	:	(wertzuweisung|arith1|ifanweisung|whileanweisung|read|print|vergleich)*;
	
wertzuweisung
	:	 ID WERTZUWEISUNG (INT|arith1|STRING|vergleich) SEMIKOLON;

ifanweisung 	
	:	'if' vergleich 'then' anweisung ('else' anweisung)? 'fi'SEMIKOLON;

whileanweisung	
	:	'while' vergleich 'do' anweisung 'od'SEMIKOLON;

read	
	:	'read' '('ID')'SEMIKOLON;

print
	:	'println' '('(arith1|STRING)')'SEMIKOLON;

vergleich
	:	(STRING|INT|FLOAT|BOOLEAN) VERGLEICHSZEICHEN (STRING|INT|FLOAT|BOOLEAN)SEMIKOLON;

fragment VERGLEICHSFRAG 
	:	('<'|'>'|'='|'>='|'<='|'<>');
	
VERGLEICHSZEICHEN 
	:	 VERGLEICHSFRAG;

 arith1	:	arithExpr SEMIKOLON;

arithExpr
	:	(INT|FLOAT|klammerrule) addsubrule;

addsubrule
	:	(ADDSUBSYM arithExpr)* muldivrule;

muldivrule
	:	(MULDIVSYM arithExpr)*;

klammerrule
	:	 '('arithExpr')';
	
	

arith_expression : term ( ADDSUBSYM term)*;
term : factor ( MULDIVSYM factor)*;
factor : ((INT|FLOAT) | ID | ('(' arith_expression ')'));	
	
ADDSUBSYM
	:	ADDFRAG;

fragment ADDFRAG
	:	'+'|'-';

MULDIVSYM
	:	MULFRAG;

fragment MULFRAG
	:	'*'|'/';
	
KOMMA
	: 	',';

ID  
	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT 
	:	'0'..'9'+;

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
