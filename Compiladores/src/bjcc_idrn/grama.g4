grammar grama;

resultado: NUMBER MULT NUMBER
		| NUMBER SOMA NUMBER;

NUMBER: [0-9]+;
MULT: '*';
SOMA: '+';
ESPACOS: [ \r\n\t]+ ->skip;
