grammar Calculadora;

prog: stat+ ;

stat
    : expr NEWLINE    # printExpr
    | NEWLINE         # blank
    ;

expr
    : expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | INT
    | '(' expr ')'
    ;

INT: [0-9]+ ;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip ;
