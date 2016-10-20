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

fragment
DecimalIntegerLiteral
:	DecimalNumeral IntegertypeSuffix?
;

fragment
IntegertypeSuffix
:	[lL]
;

fragment
DecimalNumeral
	:	'0'
|	NonZeroDigit (Digits? | Underscores Digits)
	;

	fragment
	Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

	fragment
	Digit
	:	'0'
	|	NonZeroDigit
	;

	fragment
	NonZeroDigit
	:	[1-9]
	;

	fragment
	DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

	fragment
	DigitOrUnderscore
	:	Digit
	|	'_'
	;

	fragment
	Underscores
	:	'_'+
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
