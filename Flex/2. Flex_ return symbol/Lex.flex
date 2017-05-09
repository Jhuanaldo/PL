

//* --------------------------Seccion codigo-usuario ------------------------*/


import java.io.*;
import java_cup.runtime.Symbol;


%%


/* -----------------Seccion de opciones y declaraciones -----------------*/
/*--OPCIONES --*/
/* Nombre de la clase generada para el analizadorlexico*/


%class analex


/* Indicar funcionamiento autonomo


%standalone */


/* Posibilitar acceso a la columna y fila actual de analisis*/ 


%line


%column




/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico */
 
%cup


/*--DECLARACIONES --*/ 


%{ 


/* Creamos una instancia del analizador léxico y lo ejecutamos sobre el argumento dado en la entrada (sacamos un resumen de los caracteres, palabras) */


//these variables are defined static because they will be referenced in main, a static method
  
  static int numCount =0, identCount = 0, lineCount = 0;
  
  public static void main(String [] args) throws IOException
   
  {
      //create a scanner and use the scanner's yylex function
   
      //if you want standard input, System.in instead of new FileReader(args[0])
      analex lexer = new analex(new FileReader(args[0]));
      lexer.yylex();
      System.out.println("Numeros: " + numCount + " Identificadores: " + identCount +" Lines: " +lineCount);
  }
%} /* Fin Declaraciones */


%type Object


/* Declaraciones de macros NL(nueva linea) BLANCO(espacio en blanco) y TAB(tabulador) */


NL  =  \r | \r\n | \n
BLANCO = " "bas
TAB =  \t
%state STRING



%%
/* ------------------------Sección de reglas y acciones ----------------------*/
<YYINITIAL> {


"#".* {/*SL_COMMENT - DO NOTHING*/ return new Symbol(sym.SL_COMMENT); }
"=begin".*"=end" {/*ML_COMMENT - DO NOTHING*/ return new Symbol(sym.ML_COMMENT); }

"require"          { return new Symbol(sym.REQUIRE); }
"nil"              { return new Symbol(sym.NIL);  }
"when"             { return new Symbol(sym.WHEN);  }
"def"              { return new Symbol(sym.DEF);  }
"false"            { return new Symbol(sym.FALSE);  }
"not"              { return new Symbol(sym.NOT);  }
"while"            { return new Symbol(sym.WHILE);  }
"for"              { return new Symbol(sym.FOR);  }
"then"             { return new Symbol(sym.THEN);  }
"do"               { return new Symbol(sym.DO);  }
"if"               { return new Symbol(sym.IF);  }
"true"             { return new Symbol(sym.TRUE);  }
"begin"            { return new Symbol(sym.BEGIN);  }
"else"             { return new Symbol(sym.ELSE);  }
"break"            { return new Symbol(sym.BREAK);  }
"elsif"            { return new Symbol(sym.ELSIF);  }
"retry"            { return new Symbol(sym.RETRY);  }
"unless"           { return new Symbol(sym.UNLESS);  }
"case"             { return new Symbol(sym.CASE);  }
"end"              { return new Symbol(sym.END);  }
"return"           { return new Symbol(sym.RETURN);  }
"until"            { return new Symbol(sym.UNTIL);  }
","                { return new Symbol(sym.COMMA);  }
";"                { return new Symbol(sym.SEMICOLON);  }
"puts".*             { return new Symbol(sym.PUTS);  }




"&"              { return new Symbol(sym.BIT_AND);  }
"|"              { return new Symbol(sym.BIT_OR);  }
"^"              { return new Symbol(sym.BIT_XOR);  }
"~"              { return new Symbol(sym.BIT_NOT);  }
"<<"           { return new Symbol(sym.BIT_SHL);  }
">>"           { return new Symbol(sym.BIT_SHR);  }
"+="           { return new Symbol(sym.PLUS_ASSIGN);  }
"-="           { return new Symbol(sym.MINUS_ASSIGN);  }
"+"              { return new Symbol(sym.PLUS);  }
"-"              { return new Symbol(sym.MINUS);  }
"/"              { return new Symbol(sym.DIV);  }
"**"           { return new Symbol(sym.EXP);  }
"*"              { return new Symbol(sym.MUL);  }
"%"              { return new Symbol(sym.MOD);  }
"=="           { return new Symbol(sym.EQUAL);  }
"!="           { return new Symbol(sym.NOT_EQUAL);  }
"<="           { return new Symbol(sym.LESS_EQUAL);  }
">="         { return new Symbol(sym.GREATER_EQUAL);  }
"<"          { return new Symbol(sym.LESS);  }
">"              { return new Symbol(sym.GREATER);  }
"="              { return new Symbol(sym.ASSIGN);  }
"**="          { return new Symbol(sym.EXP_ASSIGN);  }
"*="           { return new Symbol(sym.MUL_ASSIGN);  }
"/="           { return new Symbol(sym.DIV_ASSIGN);  }
"%="           { return new Symbol(sym.MOD_ASSIGN);  }
"//\""           { return new Symbol(sym.LLAVE_I); }

"and" | "&&"    { return new Symbol(sym.AND); }
"or" | "||"     { return new Symbol(sym.OR); }
"("         { return new Symbol(sym.LEFT_RBRACKET); }
")"         { return new Symbol(sym.RIGHT_RBRACKET); }
"["         { return new Symbol(sym.LEFT_SBRACKET); }
"]"         { return new Symbol(sym.RIGHT_SBRACKET); }
"{"         { return new Symbol(sym.LLAVE_I); }
"}"         { return new Symbol(sym.LLAVE_I); }


[:digit:]+       { return new Symbol(sym.INT); }
[:digit:]*'.'[0-9]+  { return new Symbol(sym.FLOAT); }
"$"         { return new Symbol(sym.DOLLAR); }

//ahora todos los ident que no tienen @ seran considerados IDFUNCTION porque va antes, esto se soluciona luego con estados seguramente
[a-zA-Z_][a-zA-Z0-9_]*[!|?]?  { return new Symbol(sym.IDFUNCTION); }
("@" | "@@")?[a-zA-Z_][a-zA-Z0-9_]* { return new Symbol(sym.ID); }

"." { return new Symbol(sym.DOT); }


{NL}        { }
{TAB}       { /* ignora los tabuladores */ }
{BLANCO}      { /* ignora los espacios en blanco */ }

\"  { yybegin(STRING); }
\'  { yybegin(STRING); }


.         {System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}


}/* fin YYinitial */


<STRING> {
"#{" { return new Symbol(sym.ML_COMMENT); }
  ([a-zA-Z0-9\.á-ú" "])+ { System.out.println("Token String <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); }
  "\"" { yybegin(YYINITIAL); }
  "\'" { yybegin(YYINITIAL); }
  . {  }
}