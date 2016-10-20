grammar gramatica;

goal	
:	mainClass classDeclaration* EOF;

mainClass	
:	'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' statement '}' '}';

classDeclaration	
:	'class' Identifier ( 'extends' Identifier )? '{' varDeclaration* methodDeclaration* '}';

varDeclaration	
:	type Identifier ';';

methodDeclaration	
:	'public' type Identifier '(' parameterList? ')' '{' methodBody '}';

parameterList
:   parameter (',' parameter)*
;

parameter
:   type Identifier
;

methodBody
:	varDeclaration* statement* 'return' expression ';'
;

type	
:	'int' '[' ']'
|	'boolean'
|	'int'
|	Identifier
;	


statement	
:	'{' statement* '}'
|	'if' '(' expression')' statement 'else' statement
|	'while' '(' expression')' statement
|	'System.out.println' '(' expression')' ';'
|	Identifier '=' expression ';'
|	Identifier '[' expression ']' '=' expression ';'
;

expression
:   expression ('&&'|'<'|'+'|'-'|'*') expression
|	expression '[' expression ']'
|   expression '.length'
|   expression '.' Identifier '(' ( expression ( ',' expression )* )? ')'
|	IntegerLiteral
|	'true'
|   'false'
|   Identifier
|   'this'
|   'new' 'int' '[' expression ']'
|   'new' Identifier '(' ')'
|	'!' expression
|   '(' expression ')'
;

Identifier
: [a-zA-Z$_] [a-zA-Z0-9$_]*;

IntegerLiteral
:	DecimalIntegerLiteral
;

DecimalIntegerLiteral
:	DecimalNumeral IntegertypeSuffix?
;

IntegertypeSuffix
:	[lL]
;

DecimalNumeral
:	'0'
|	[1-9] (Digits? | '_'+ Digits);


Digits
:	Digit ((DigitOrUnderscore+)? Digit)?;

Digit
:	'0'
|	[1-9]
;

DigitOrUnderscore
:	Digit
|	'_'
;

WS
:   [ \r\t\n]+ -> skip
;   

MULTILINE_COMMENT
:  '/*' .*? '*/' -> skip
;
LINE_COMMENT
:  '//' .*? '\n' -> skip
;
