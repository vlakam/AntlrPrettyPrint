grammar C;
@parser :: members {
    static void wr(String x) {System.out.print(x);}
    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}
}
start
    : includes main? EOF;

includes
    : include includes
    |;

include
    : '#include <' i=Identifier '>' {wr("#include <" + $i.text + ">\n");};

main
    : 'int main ()'{wr("int main () ");} (compoundStatement[0]) ;

conditionStatement[int amount]
    : 'if' '('{wr("if (");} expression ')'{wr(")");} statement[amount]  ('else'{wr(" else ");} statement[amount])?
    ;
expressionStatement[int amount]
    : {tabs(amount);} expression? ';'{wr(";\n");};

compoundStatement[int amount] : '{'{wr("{\n");} items[amount + 4] '}'{wr("}\n");};

items[int amount]
    :   item[amount]
    |   item[amount] items[amount]
    ;

item[int amount]
    :   {tabs(amount);} declaration
    |   {tabs(amount);}statement[amount];

declaration
    : type i=Identifier{wr(" " + $i.text + " ");} ('='{wr("= ");} assignExpression)?';'
    ;

statement[int amount]
    :   compoundStatement[amount]
    |   expressionStatement[amount]
    |   conditionStatement[amount]
    ;

expression: assignExpression | expression ',' assignExpression;

assignOperator : '=' | '*=' | '/=';

assignExpression
    :   conditional
    |   unary assignOperator assignExpression;

conditional : orCondition;

orCondition: andCondition | orCondition '||' andCondition;

andCondition: eqCondition | andCondition '&&' eqCondition;

eqCondition: relCondition | eqCondition '==' relCondition | eqCondition '!=' relCondition;

relCondition
    : additive
    | relCondition '<' additive
    | relCondition '>' additive;

additive
    : multiple
    | additive '+' multiple
    | additive '-' multiple;

multiple
    : unary
    | multiple '*' unary
    | multiple '/' unary;

unary
    : primary;

primary
    : Identifier
    | constant
    | '(' expression ')';

type : 'void' {wr("void");}| 'char' {wr("char");}| 'short' {wr("short");}| 'int' {wr("int");}| 'float' {wr("float");}| 'double'{wr("double");};

constant
    : IntConst;

Identifier
    : [a-zA-Z_] ( [a-zA-Z_] | [0-9] )*;

IntConst
    : [1-9][0-9]*;

WC: [\n\\s ] -> skip;
