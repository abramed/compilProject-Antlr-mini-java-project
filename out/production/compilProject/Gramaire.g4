grammar Gramaire;
options {
language=Java;
}
//lexical
ENTIER : '-'?('1'..'9')?('0' .. '9')+('.' ('0'..'9')+)?
                          ;
AFFECTATION : ':=';
LOGIQUE :
    '='
    |'!='
    |'>'
    |'<'
    |'<='
    |'>='
   ;
ARITHME :
    '*'
    |'/'
    |'+'
    |'-'
    ;
PV :';';
VR :',';
BIB :
    'Small_Java.lang'
    |'Small_Java.io'
    ;

PAROUVR : '(';
PARFERM : ')';

IMPORT :
        'import'
;
MODIFICATEUR :
    'public'
    |'protected'
    ;
CLASS8SJ : 'class_SJ';

TYPE : 'int_SJ'
        |'float_SJ'
        |'string_SJ'
        ;
MAIN :'main_SJ';
NOMCLASS : [A-Z]+[a-zA-Z0-9]* ;

IDF: [a-zA-Z]+[a-zA-Z0-9]* ;
COMMENT : '/*' .*? '*/' -> skip;

WS : [ \t\n\r]+ -> skip ;
WHITESPACE          : (' ' | '\t') ->skip ;
GUIM : '"';
//Syntaxic
bib :
    IMPORT BIB ';' bib
    |
    ;

class1 :
    MODIFICATEUR CLASS8SJ NOMCLASS '{'blocclass
    ;

blocclass :
       declaration instructionmain
       |instructionmain
    ;
declaration: TYPE declaration1
        ;
declaration1:
             IDF VR declaration1
            |IDF PV declaration
            |IDF PV
            ;
instructionmain:
         MAIN '{'instruction  '}'
         |
       ;
instruction :
    calcul instruction
    |si instruction
    |lecture instruction
    |ecriture instruction
    |

    ;
start_rules :
              bib class1 end;
end :
    '}';


operateur:
    ARITHME
;
op1 :
    '+'
    |'-';
expression :expression op1 expression2
             |expression2
             |string
            ;
expression2 :
                expression2 op2 expression3
                |expression3;
expression3 : val
            |'('expression')';
val :
    ENTIER
    |IDF;
string :
     GUIM  string2 GUIM
;
string2:
    IDF string2
    |WHITESPACE string2
    |format string2
    |
;
op2:
    '*'
    |'/';



si : 'si' condition 'alors' '{'instruction'}'sinon
;
sinon :
        'sinon' '{'instruction'}'
        |
        ;

lecture : 'In_SJ' '(' '"'format'"' ','lec ')'';';

lec : IDF ',' lec
    |IDF;

format : '%d'format
       |'%f' format
       |'%s' format
       |'%s'
       |'%f'
       |'%d'
       ;
ecriture : 'Out_SJ' '('string ','lec ')'';'
        |'In_SJ' '('string ')'';'
        ;
condition:
            '('val LOGIQUE val')'
            ;
calcul : IDF AFFECTATION expression PV
;


