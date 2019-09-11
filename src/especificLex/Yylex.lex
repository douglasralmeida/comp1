package pacotePrincipal;

%%

/* procedimentos */
%{

private void imprimir(String tipo, String valor) {
    System.out.println("(" + tipo + ", " + valor + ")");
}

%}

%class AnalisadorLexico
%type void

/* definicoes regulares */
delim=\r|\n|[\r\n]|\ |\t|\f
stoken={delim}+
letter=[a-zA-Z]
digit=[0-9]
identifier={letter}({letter}|{digit})*
unsigned_integer={digit}+
sign=[+-]?
scale_factor=E{sign}{unsigned_integer}
unsigned_real={unsigned_integer}(.{digit}*)?({scale_factor})?
integer_constant={unsigned_integer}
real_constant={unsigned_real}
char_constant=\'[^\r\n]\'
boolean_constant=false|true

%% /* regras de traducao */
{stoken}     { /* ignora */ }

<YYINITIAL> {
    /* operadores de relação */
    "="  | 
    "<"  | 
    "<=" | 
    ">"  | 
    ">=" | 
    "!=" | 
    "not"    { imprimir("RELOP", yytext()); }

    /* operadores de adição */
    "+"  | 
    "-"  | 
    "or"     { imprimir("ADDOP", yytext()); }

    /* operadores de multiplicação */
    "*"   | 
    "/"   | 
    "div" |
    "mod" |
    "and"    { imprimir("MULOP", yytext()); }

    /* palavras reservadas */
    "program" { imprimir("program", ""); }
    "integer" { imprimir("integer", ""); }
    "real"    { imprimir("real", ""); }
    "boolean" { imprimir("boolean", ""); }
    "char"    { imprimir("char", ""); }
    "begin"    { imprimir("begin", ""); }
    "end"    { imprimir("end", ""); }
    "if"    { imprimir("if", ""); }
    "then"    { imprimir("then", ""); }
    "else"    { imprimir("else", ""); }
    "do"    { imprimir("do", ""); }
    "while"    { imprimir("while", ""); }
    "until"    { imprimir("until", ""); }
    "read"    { imprimir("read", ""); }
    "write"    { imprimir("write", ""); }

    /* temporario */
    ":=" {}
    ";"  {}
    ":"  {}
    "("  {}
    ")"  {}
}

/* constantes */
{boolean_constant}  { imprimir("constant", yytext()); }
{integer_constant}  { imprimir("constant", yytext()); }
{real_constant}     { imprimir("constant", yytext()); }
{char_constant}     { imprimir("constant", yytext().substring(1, 2)); }

/* outros */
{identifier} { imprimir("identifier", yytext()); }
<<EOF>>                          { System.exit(0); }