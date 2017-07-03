grammar Ruby;

prog : expression_list;


expression_list : expression terminator
| expression_list expression terminator
| terminator
;

expression : function_definition
| if_statement
| unless_statement
| rvalue
| return_statement
| while_statement
| do_statement
| case_statement
| class_block
;

if_statement : IF rvalue CRLF expression_list END
| IF rvalue THEN expression_list END
| IF rvalue CRLF expression_list ELSE CRLF expression_list END
| IF rvalue THEN expression_list ELSE expression_list END
| IF rvalue CRLF expression_list if_elsif_statement END
;

if_elsif_statement : ELSIF rvalue CRLF expression_list
| ELSIF rvalue CRLF expression_list ELSE CRLF expression_list
| ELSIF rvalue CRLF expression_list if_elsif_statement
;

terminator : CRLF terminator | SEMICOLON terminator | SEMICOLON | CRLF
;

function_definition : function_definition_header expression_list END
;

function_definition_header : DEF lvalue function_definition_params CRLF | DEF lvalue CRLF
;

function_definition_params : LEFT_RBRACKET RIGHT_RBRACKET
| LEFT_RBRACKET function_definition_params_list RIGHT_RBRACKET
| function_definition_params_list
;

function_definition_params_list : lvalue
| function_definition_params_list COMMA lvalue
;

class_block : REQUIRE LITERAL
;

unless_statement : UNLESS rvalue CRLF expression_list END
;

rvalue : single_object
| assignment
| lvalue function_call
| rvalue EXP rvalue
| NOT rvalue
| BIT_NOT rvalue
| rvalue MUL rvalue
| rvalue DIV rvalue
| rvalue MOD rvalue
| rvalue PLUS rvalue
| rvalue MINUS rvalue
| rvalue BIT_SHL rvalue
| rvalue BIT_SHR rvalue
| rvalue BIT_AND rvalue
| rvalue BIT_OR rvalue
| rvalue BIT_XOR rvalue
| rvalue LESS rvalue
| rvalue GREATER rvalue
| rvalue LESS_EQUAL rvalue
| rvalue GREATER_EQUAL rvalue
| rvalue EQUAL rvalue
| rvalue NOT_EQUAL rvalue
| rvalue OR rvalue
| rvalue AND rvalue
| LEFT_RBRACKET rvalue RIGHT_RBRACKET
;

single_object : INT
| FLOAT
| LITERAL
| FALSE
| TRUE
| NIL
;

return_statement : RETURN rvalue
;

while_statement : WHILE rvalue CRLF while_expression_list END
;

while_expression_list : expression terminator
| RETRY terminator
| BREAK terminator
| while_expression_list expression terminator
| while_expression_list RETRY terminator
| while_expression_list BREAK terminator
;




lvalue : ID_GLOBAL
| ID
| ID DOT ID_FUNCTION
| ID_FUNCTION
;

array_assignment : rvalue array_definition ASSIGN rvalue
| lvalue ASSIGN array_definition
;

array_definition : LEFT_SBRACKET array_definition_elements RIGHT_SBRACKET
| LEFT_SBRACKET RIGHT_SBRACKET
;

array_definition_elements : lvalue COMMA array_definition_elements
| single_object COMMA array_definition_elements
| single_object
| lvalue
;

when_statement : WHEN array_definition_elements CRLF expression_list
| WHEN array_definition_elements CRLF expression_list when_statement
| WHEN array_definition_elements CRLF
| ELSE CRLF expression CRLF
;

int_result : int_result MUL int_result
| int_result DIV int_result
| int_result MOD int_result
| int_result PLUS int_result
| int_result MINUS int_result
| INT
;

string_result : string_result MUL int_result
| int_result MUL string_result
;

float_result : float_result MUL float_result
| float_result DIV float_result
| float_result MOD float_result
| int_result MUL float_result
| int_result DIV float_result
| int_result MOD float_result
| float_result MUL int_result
| float_result DIV int_result
| float_result MOD int_result
| float_result PLUS float_result
| float_result MINUS float_result
| int_result PLUS float_result
| int_result MINUS float_result
| float_result PLUS int_result
| float_result MINUS int_result
| FLOAT
;

assignment : lvalue PLUS_ASSIGN rvalue
| lvalue  MINUS_ASSIGN rvalue
| lvalue  MUL_ASSIGN rvalue
| lvalue  DIV_ASSIGN rvalue
| lvalue MOD_ASSIGN rvalue
| lvalue EXP_ASSIGN rvalue
| lvalue ASSIGN rvalue
;

function_call : LEFT_SBRACKET function_definition_params RIGHT_SBRACKET
| function_definition_params
| LEFT_SBRACKET RIGHT_SBRACKET
|
;

bool_t : TRUE | FALSE
;

case_statement : CASE lvalue CRLF when_statement END
;

do_statement : rvalue DO ID_ITER expression_list END
;


crlf : CRLF ;

ESCAPED_QUOTE : '\\"';

LITERAL : '"' ( ESCAPED_QUOTE | ~('\n'|'\r'|'\t') )*? '"' | '\'' ( ESCAPED_QUOTE | ~('\n'|'\r'|'\t') )*? '\'';

COMMA : ',';

DOT: '.';

SEMICOLON : ';';

CRLF : '\n';

REQUIRE : 'require';

DO : 'do';

END : 'end';

DEF : 'def';

RETURN : 'return';

IF: 'if';

CASE: 'case';

CLASS:'class';

WHEN: 'when';

ATTR: 'attr_accessor';

THEN : 'then';

ELSE : 'else';

ELSIF : 'elsif';

UNLESS : 'unless';

WHILE : 'while';

RETRY : 'retry';

BREAK : 'break';

FOR : 'for';

TRUE : 'true';

FALSE : 'false';

PLUS : '+';

MINUS : '-';

MUL : '*';

DIV : '/';

MOD : '%';

EXP : '**';

EQUAL : '==';

NOT_EQUAL : '!=';

GREATER : '>';

LESS : '<';

LESS_EQUAL : '<=';

GREATER_EQUAL : '>=';

ASSIGN : '=';

PLUS_ASSIGN : '+=';

MINUS_ASSIGN : '-=';

MUL_ASSIGN : '*=';

DIV_ASSIGN : '/=';

MOD_ASSIGN : '%=';

EXP_ASSIGN : '**=';

BIT_AND : '&';

BIT_OR : '|';

BIT_XOR : '^';

BIT_NOT : '~';

BIT_SHL : '<<';

BIT_SHR : '>>';

AND : 'and' | '&&';

OR : 'or' | '||';

NOT : 'not' | '!';

LEFT_RBRACKET : '(';

RIGHT_RBRACKET : ')';

LEFT_SBRACKET : '[';

RIGHT_SBRACKET : ']';

NIL : 'nil';

SL_COMMENT : ('#' ~('\r' | '\n')* '\n') -> skip;

ML_COMMENT : ('=begin' .*? '=end\n') -> skip;

WS : (' '|'\t')+ -> skip;

INT : [0-9]+;

FLOAT : [0-9]+'.'[0-9]+;

ID_ITER : '|'ID'|';

ID_ATTR : ':'[a-zA-Z_][a-zA-Z0-9_]*;

ID_GLOBAL : DOLLAR ID;

ID_FUNCTION : ID [!?];

DOLLAR : '$';

ID : ('@'|'@@'|) [a-zA-Z_][a-zA-Z0-9_]*;