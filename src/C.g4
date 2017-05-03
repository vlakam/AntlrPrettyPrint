grammar C;
@parser :: members {
    static void wr(String x) {System.out.print(x);}
    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}
}
start
    : includes main? EOF;

includes
    : include includes
    |
    ;

include
    : '#include' '<' i=Identifier '>' {wr("#include <" + $i.text + ">\n");};

main
    : 'int' 'main' '(' ')'{wr("\nint main () ");} (compoundStatement[0]) ;

conditionStatement[int amount]
    : 'if' '('{wr("if (");} expression ')'{wr(")");} statement[amount]  ('else'{wr(" else ");} statement[amount])?
    ;
expressionStatement[int amount]
    : {tabs(amount);} expression? ';'{wr(";\n");};

compoundStatement[int amount] : '{'{wr("{\n");} items[amount + 4]? '}'{wr("}\n");};

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

expression
    : assignExpression
    ;

assignOperator
    : '='{wr(" = ");} 
    | '*='{wr(" *= ");} 
    | '/='{wr(" /= ");}
    ;

assignExpression
    :   orCondition
    |   unary assignOperator assignExpression;

orCondition
    : andCondition 
    | orCondition '||'{wr(" || ");} andCondition
    ;

andCondition
    : eqCondition 
    | andCondition '&&'{wr(" && ");} eqCondition
    ;

eqCondition
    : relCondition 
    | eqCondition '=='{wr(" == ");} relCondition 
    | eqCondition '!='{wr(" != ");} relCondition
    ;

relCondition
    : additive
    | relCondition '<'{wr(" < ");} additive
    | relCondition '>'{wr(" > ");} additive
    ;

additive
    : multiple
    | additive '+'{wr(" + ");} multiple
    | additive '-'{wr(" - ");} multiple;

multiple
    : unary
    | multiple '*'{wr(" * ");} unary
    | multiple '/'{wr(" / ");} unary;

unary
    : primary;

primary
    : i=Identifier {wr($i.text);}
    | constant
    | '('{wr("(");} expression ')'{wr(")");}
    ;

type
    : 'void' {wr("void");}
    | 'char' {wr("char");}
    | 'short' {wr("short");}
    | 'int' {wr("int");}
    | 'float' {wr("float");}
    | 'double'{wr("double");}
    ;

constant
    : i=IntConst {wr($i.text);};

Identifier
    : [a-zA-Z_] ( [a-zA-Z_] | [0-9] )*;

IntConst
    : [1-9][0-9]*;

WC: [\n\\s ] -> skip;
