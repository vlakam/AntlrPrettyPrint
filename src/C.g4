grammar C;
@parser :: members {
    static void wr(String x) {System.out.print(x);}
    static void tabs(int amount) {for(int i=0; i<amount; i++) System.out.print(' ');}
}
start
    :   includes main? EOF;

includes
    :   include includes
    |
    ;

include
    :   '#include' '<' i=Identifier '>' {wr("#include <" + $i.text + ">\n");};

main
    :   'int' 'main' '(' ')'{wr("\nint main () ");} '{'{wr("{\n");} items[4]'}'{wr("}");} ;

conditionStatement[int amount]
    :   'if' '('{wr("if (");} expression ')'{wr(")\n");tabs(amount);} compoundStatement[amount]  ('else'{wr("\n");tabs(amount);wr("else\n");tabs(amount);} compoundStatement[amount])?
    ;

expressionStatement[int amount]
    :   expression? ';'{wr(";");}
    ;

compoundStatement[int amount]
    :   '{'{wr("{\n");} items[amount + 4]? '}'{tabs(amount);wr("}");}
    ;

items[int amount]
    :   item[amount]{wr("\n");}
    |   item[amount]{wr("\n");} items[amount]
    ;

item[int amount]
    :   {tabs(amount);}declaration
    |   {tabs(amount);}statement[amount]
    ;

declaration
    :   type i=Identifier{wr(" " + $i.text + " ");} ('='{wr("= ");} assignExpression)?';'{wr(";");}
    ;

statement[int amount]
    :   compoundStatement[amount]
    |   expressionStatement[amount]
    |   conditionStatement[amount]
    ;

expression
    :   assignExpression
    ;

assignOperator
    :   '='{wr(" = ");} 
    |   '*='{wr(" *= ");} 
    |   '/='{wr(" /= ");}
    ;

assignExpression
    :   orCondition
    |   unary assignOperator assignExpression;

orCondition
    :   andCondition 
    |   orCondition '||'{wr(" || ");} andCondition
    ;

andCondition
    :   eqCondition 
    |   andCondition '&&'{wr(" && ");} eqCondition
    ;

eqCondition
    :   relCondition 
    |   eqCondition '=='{wr(" == ");} relCondition 
    |   eqCondition '!='{wr(" != ");} relCondition
    ;

relCondition
    :   additive
    |   relCondition '<'{wr(" < ");} additive
    |   relCondition '>'{wr(" > ");} additive
    ;

additive
    :   multiple
    |   additive '+'{wr(" + ");} multiple
    |   additive '-'{wr(" - ");} multiple;

multiple
    :   unary
    |   multiple '*'{wr(" * ");} unary
    |   multiple '/'{wr(" / ");} unary;

unary
    :   primary;

primary
    :   i=Identifier {wr($i.text);}
    |   constant
    |   '('{wr("(");} expression ')'{wr(")");}
    ;

type
    :   'void' {wr("void");}
    |   'char' {wr("char");}
    |   'short' {wr("short");}
    |   'int' {wr("int");}
    |   'float' {wr("float");}
    |   'double'{wr("double");}
    ;

constant
    :   i=IntConst {wr($i.text);};

Identifier
    :   [a-zA-Z_] ( [a-zA-Z_] | [0-9] )*;

IntConst
    :   [1-9][0-9]*;

Whitespace
    :   [ \t]+ -> skip
    ;

Newline
    :   ('\r' '\n'?|'\n') -> skip
    ;

LineComment
    :   '//' ~[\r\n]* -> skip
    ;