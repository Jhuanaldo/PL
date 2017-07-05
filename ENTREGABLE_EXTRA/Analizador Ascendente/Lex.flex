//* --------------------------Seccion codigo-usuario ------------------------*/
import java.io.*;
import java_cup.runtime.Symbol;

%%

/* -----------------Seccion de opciones y declaraciones -----------------*/
/*--OPCIONES --*/


/* Posibilitar acceso a la columna y fila actual de analisis*/


%line


%column

/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico */

%cup

%public

/*--DECLARACIONES --*/

%state STRING

/* Declaraciones de macros NL(nueva linea) BLANCO(espacio en blanco) y TAB(tabulador) */


NL  =  \r | \r\n | \n
BLANCO = " "
TAB =  \t


%%
/* ------------------------Sección de reglas y acciones ----------------------*/

<YYINITIAL>{

"#".* 								/*SL_COMMENT - DO NOTHING*/
"=begin"[^=]*"=end" 				/*ML_COMMENT - DO NOTHING*/
"=begin"           					{System.out.println("Error en =begin: comentario no terminado");}

"require"          					{ return new Symbol(sym.REQUIRE); }
"nil"              					{ return new Symbol(sym.NIL);  }
"when"             					{ return new Symbol(sym.WHEN);  }
"def"              					{ return new Symbol(sym.DEF);  }
"not"              					{ return new Symbol(sym.NOT);  }
"while"            					{ return new Symbol(sym.WHILE);  }
"then"             					{ return new Symbol(sym.THEN);  }
"do"               					{ return new Symbol(sym.DO);  }
"if"               					{ return new Symbol(sym.IF);  }
"true"             					{ return new Symbol(sym.TRUE);  }
"false"            					{ return new Symbol(sym.FALSE);  }
"else"             					{ return new Symbol(sym.ELSE);  }
"break"            					{ return new Symbol(sym.BREAK);  }
"elsif"            					{ return new Symbol(sym.ELSIF);  }
"retry"            					{ return new Symbol(sym.RETRY);  }
"unless"           					{ return new Symbol(sym.UNLESS);  }
"case"             					{ return new Symbol(sym.CASE);  }
"end"              					{ return new Symbol(sym.END);  }
"return"           					{ return new Symbol(sym.RETURN);  }
","                					{ return new Symbol(sym.COMMA);  }
";"                					{ return new Symbol(sym.SEMICOLON);  }


"&"              					{ return new Symbol(sym.BIT_AND);  }
"|"[a-zA-Z_][a-zA-Z0-9_]*"|"        { return new Symbol(sym.ID_ITER); } //esto tiene que estar mal
"|"              					{ return new Symbol(sym.BIT_OR);  }
"^"              					{ return new Symbol(sym.BIT_XOR);  }
"~"              					{ return new Symbol(sym.BIT_NOT);  }
"<<"           						{ return new Symbol(sym.BIT_SHL);  }
">>"           						{ return new Symbol(sym.BIT_SHR);  }
"+"              					{ return new Symbol(sym.PLUS);  }
"-"              					{ return new Symbol(sym.MINUS);  }
"/"              					{ return new Symbol(sym.DIV);  }
"**"           						{ return new Symbol(sym.EXP);  }
"*"              					{ return new Symbol(sym.MUL);  }
"%"              					{ return new Symbol(sym.MOD);  }
"=="           						{ return new Symbol(sym.EQUAL);  }
"!="           						{ return new Symbol(sym.NOT_EQUAL);  }
"<="           						{ return new Symbol(sym.LESS_EQUAL);  }
">="         						{ return new Symbol(sym.GREATER_EQUAL);  }
"<"          						{ return new Symbol(sym.LESS);  }
">"              					{ return new Symbol(sym.GREATER);  }
"="              					{ return new Symbol(sym.ASSIGN);  }
"+="           						{ return new Symbol(sym.PLUS_ASSIGN);  }
"-="           						{ return new Symbol(sym.MINUS_ASSIGN);  }
"**="          						{ return new Symbol(sym.EXP_ASSIGN);  }
"*="           						{ return new Symbol(sym.MUL_ASSIGN);  }
"/="           						{ return new Symbol(sym.DIV_ASSIGN);  }
"%="           						{ return new Symbol(sym.MOD_ASSIGN);  }

"and" | "&&"    					{ return new Symbol(sym.AND); }
"or" | "||"     					{ return new Symbol(sym.OR); }
"("         						{ return new Symbol(sym.LEFT_RBRACKET); }
")"         						{ return new Symbol(sym.RIGHT_RBRACKET); }
"["         						{ return new Symbol(sym.LEFT_SBRACKET); }
"]"         						{ return new Symbol(sym.RIGHT_SBRACKET); }


// "\""(\\.|[^"\""])*["\""]			{ return new Symbol(sym.LITERAL); }
[:digit:]+       				{ return new Symbol(sym.INT,Integer.parseInt(yytext())); }
[:digit:]*"."[0-9]+  				{ return new Symbol(sym.FLOAT,Double.parseDouble(yytext())); }
[a-zA-Z_][a-zA-Z0-9_]* 				{ return new Symbol(sym.ID,yytext()); }
[a-zA-Z_][a-zA-Z0-9_]*[!|?]?  		{ return new Symbol(sym.ID_FUNCTION,yytext()); }
("@" | "@@" | "$")?[a-zA-Z_][a-zA-Z0-9_]* { return new Symbol(sym.ID_GLOBAL,yytext()); }
"." 								{ return new Symbol(sym.DOT); }


{NL}								{return new Symbol(sym.CRLF);}
{TAB}       						{ /* ignora los tabuladores */ }
{BLANCO}    						{ /* ignora los espacios en blanco */ }

\" { yybegin(STRING); }
  . 								{  }
}

<STRING>{
[a-zA-Z0-9_" "][a-zA-Z0-9_" "]*  { return new Symbol(sym.LITERAL,yytext());}
\" { yybegin(YYINITIAL); }
}