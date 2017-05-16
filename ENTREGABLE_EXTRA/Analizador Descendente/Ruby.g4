         


grammar Ruby;

prog : expression_list;


expression_list : expression terminator
                | expression_list expression terminator
                | terminator
             ;


expression : function_definition | class_block| require_block | if_statement | do_statement|unless_statement | rvalue | return_statement | while_statement | for_statement ;

class_block : CLASS ID class_body END;
class_body: expression_list | attr_definition |class_body expression_list | class_body attr_definition;
attr_definition: ATTR attr_ids terminator;
attr_ids: ID_ATTR | attr_ids COMMA ID_ATTR ;

require_block : REQUIRE literal_t;


function_definition : function_definition_header function_definition_body END;


function_definition_body : expression_list;


function_definition_header : DEF function_name function_definition_params crlf | DEF function_name  crlf  ;

function_name : id_function | id | ID DOT ID_FUNCTION | ID DOT ID ;


function_definition_params : LEFT_RBRACKET RIGHT_RBRACKET
                           | LEFT_RBRACKET function_definition_params_list RIGHT_RBRACKET
                           | function_definition_params_list;


function_definition_params_list : id | function_definition_params_list COMMA id;


do_statement : function_name DO ID_ITER expression_list END;

return_statement : RETURN rvalue  |RETURN function_name | RETURN rvalue UNLESS function_name | RETURN rvalue UNLESS function_name function_definition_params ;


function_call : function_name | function_name (LEFT_RBRACKET function_call_param_list RIGHT_RBRACKET |function_call_param_list | LEFT_RBRACKET RIGHT_RBRACKET);


function_call_param_list : function_call_params;


function_call_params : rvalue | function_call_params COMMA rvalue ;


if_elsif_statement : ELSIF rvalue crlf expression_list 
| ELSIF rvalue crlf expression_list ELSE crlf expression_list 
| ELSIF rvalue crlf expression_list if_elsif_statement;

if_statement : IF rvalue crlf expression_list END
| IF rvalue THEN expression_list END
| IF rvalue crlf expression_list ELSE crlf expression_list END
| IF rvalue THEN expression_list ELSE expression_list END
| IF rvalue crlf expression_list if_elsif_statement END
;

case_statement : CASE ID WHEN rvalue THEN END
|CASE ID WHEN rvalue terminator END
|CASE ID WHEN rvalue THEN  expression_list END
|CASE ID WHEN rvalue terminator  expression_list END
|CASE ID ELSE expression_list END
|CASE ID WHEN rvalue THEN case_statement
|CASE ID WHEN rvalue terminator case_statement
|CASE ID WHEN rvalue THEN  expression_list case_statement
|CASE ID WHEN rvalue terminator  expression_list case_statement
;

unless_statement : UNLESS rvalue crlf expression_list END;


while_statement : WHILE rvalue crlf while_expression_list END;


while_expression_list : expression terminator
| RETRY terminator
| BREAK terminator
| while_expression_list expression terminator
| while_expression_list RETRY terminator
| while_expression_list BREAK terminator ;


for_statement : FOR LEFT_RBRACKET expression SEMICOLON expression SEMICOLON expression RIGHT_RBRACKET crlf for_expression_list END | FOR expression SEMICOLON expression SEMICOLON expression crlf for_expression_list END;


for_expression_list : expression terminator
| RETRY terminator
| BREAK terminator
| for_expression_list expression terminator
| for_expression_list RETRY terminator
| for_expression_list BREAK terminator
;


assignment : lvalue ( PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN | ASSIGN ) rvalue;


array_assignment : lvalue (array_definition ASSIGN rvalue | ASSIGN array_definition);


array_definition : LEFT_SBRACKET array_definition_elements RIGHT_SBRACKET | LEFT_SBRACKET RIGHT_SBRACKET | id LEFT_SBRACKET array_definition_elements RIGHT_SBRACKET;


array_definition_elements : rvalue
| array_definition_elements COMMA rvalue
;




int_result : int_result ( MUL | DIV | MOD ) int_result
| int_result ( PLUS | MINUS ) int_result
| int_t;  

float_result : float_result ( MUL | DIV | MOD ) float_result
| int_result ( MUL | DIV | MOD ) float_result
| float_result ( MUL | DIV | MOD ) int_result
| float_result ( PLUS | MINUS ) float_result
| int_result ( PLUS | MINUS ) float_result
| float_result ( PLUS | MINUS ) int_result
| float_t;

string_result : string_result PLUS string_result
| literal_t
;

lvalue : id | id_global | ID DOT ID_FUNCTION | ID DOT ID ;

rvalue: lvalue 
| ID_ATTR
| array_assignment
| int_result
| float_result
| string_result
| assignment       
| function_call
| literal_t
| bool_t
| float_t
| int_t
| nil_t 
| rvalue UNLESS rvalue
| rvalue EXP rvalue
| ( NOT | BIT_NOT ) rvalue
| rvalue ( MUL | DIV | MOD ) rvalue
| rvalue ( PLUS | MINUS ) rvalue
| rvalue ( BIT_SHL | BIT_SHR ) rvalue
| rvalue BIT_AND rvalue
| rvalue ( BIT_OR | BIT_XOR )rvalue
| rvalue ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL) rvalue
| rvalue ( EQUAL | NOT_EQUAL) rvalue
| rvalue ( OR | AND) rvalue
| LEFT_RBRACKET rvalue RIGHT_RBRACKET;


literal_t : LITERAL;


float_t : FLOAT;


int_t : INT;


bool_t : TRUE | FALSE ;


nil_t : NIL;


id : ID;


id_global : ID_GLOBAL;


id_function : ID_FUNCTION;


terminator : terminator SEMICOLON
| terminator crlf
| SEMICOLON
| crlf
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










