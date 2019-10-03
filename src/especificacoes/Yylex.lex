/* Analisador Léxico para linguagem MLM */

package pacotePrincipal;

import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;

%%

/* procedimentos */
%{
    ComplexSymbolFactory symbolFactory;

    StringBuffer string = new StringBuffer();

    public AnalisadorLexico(java.io.Reader in, ComplexSymbolFactory sf) {
        this(in);
        symbolFactory = sf;
    }
    
    private Symbol symbol(String name, int sym) {
        return symbolFactory.newSymbol(name, sym, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+yylength(),yychar+yylength()));
    }

    private Symbol symbol(String name, int sym, Object val) {
        Location left = new Location(yyline+1,yycolumn+1,yychar);
        Location right = new Location(yyline+1,yycolumn+yylength(), yychar+yylength());

        return symbolFactory.newSymbol(name, sym, left, right, val);
    }
  
    private void exibirErro(String msg) {
        System.out.println("Existe um erro na linha "+(yyline+1)+", column "+(yycolumn+1)+" : " + msg);
    }
%}

%cup
%public
%class AnalisadorLexico
%implements AnalisadorSintaticoSym
%char
%line
%column

%eofval{
     return symbolFactory.newSymbol("EOF", EOF, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+1,yychar+1));
%eofval}

/* definicoes regulares */
delim=\r|\n|[\r\n]|\ |\t|\f
stoken={delim}+
letter=[a-zA-Z]
digit=[0-9]
identifier={letter}({letter}|{digit})*
unsigned_integer=0|[1-9]{digit}*
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
    "="      { return symbol("equal", RELOP, Integer.valueOf(EQUAL)); }
    "<"      { return symbol("less", RELOP, Integer.valueOf(LESS)); }
    "<="     { return symbol("lessequal", RELOP, Integer.valueOf(LESSEQUAL)); }
    ">"      { return symbol("greater", RELOP, Integer.valueOf(GREATER)); }
    ">="     { return symbol("greaterequal", RELOP, Integer.valueOf(GRATEREQUAL)); }
    "!="     { return symbol("different", RELOP, Integer.valueOf(DIFFERENT)); }
    "not"    { return symbol("not", RELOP, Integer.valueOf(NOT)); }

    /* operadores de adição */
    "+"    { return symbol("plus", ADDOP, Integer.valueOf(PLUS)); }
    "-"    { return symbol("minus", ADDOP, Integer.valueOf(ADDOP)); }
    "or"   { return symbol("or", ADDOP, Integer.valueOf(OR)); }

    /* operadores de multiplicação */
    "*"      { return symbol("times", MULOP, Integer.valueOf(TIMES)); }
    "/"      { return symbol("divided", MULOP, Integer.valueOf(DIVIDED)); }
    "div"    { return symbol("divided", MULOP, Integer.valueOf(DIVIDED)); }
    "mod"    { return symbol("mod", MULOP, Integer.valueOf(MOD)); }
    "and"    { return symbol("and", MULOP, Integer.valueOf(AND)); }

    /* palavras reservadas */
    "program" { return symbol("program", PROGRAM); }
    "integer" { return symbol("integer", INTEGER); }
    "real"    { return symbol("real", REAL); }
    "boolean" { return symbol("boolean", BOOLEAN); }
    "char"    { return symbol("char", CHAR); }
    "begin"   { return symbol("begin", BEGIN); }
    "end"     { return symbol("end", END); }
    "if"      { return symbol("if", IF); }
    "then"    { return symbol("then", THEN); }
    "else"    { return symbol("else", ELSE); }
    "do"      { return symbol("do", DO); }
    "while"   { return symbol("while", WHILE); }
    "until"   { return symbol("until", UNTIL); }
    "read"    { return symbol("read", READ); }
    "write"   { return symbol("rite", WRITE); }

    /* sinais */
    ":=" { return symbol("assignchar", ASSIGNCHAR); }
    ";"  { return symbol("eolchar", EOLCHAR); }
    ":"  { return symbol("decchar", DECCHAR); }
    "("  { return symbol("openparchar", OPENPARCHAR); }
    ")"  { return symbol("closeparchar", CLOSEPARCHAR); }
    ","  { return symbol("enumchar", ENUMCHAR); }
}

/* constantes */
{boolean_constant}  { return symbol("bool_const", BOOLEAN, Boolean.valueOf(Boolean.parseBoolean(yytext()))); }
{integer_constant}  { return symbol("int_const", INTEGER, Integer.valueOf(Integer.parseInt(yytext()))); }
{real_constant}     { return symbol("real_const", REAL, Float.valueOf(Float.parseFloat(yytext()))); }
{char_constant}     { return symbol("char_const", CHAR, Character.valueOf(yytext().charAt(1))); }

/* outros */
{identifier} { return symbol("identifier", IDENTIFIER, yytext()); }

/* erro */
[^]         { exibirErro("Caractere ilegal: " + yytext()); }