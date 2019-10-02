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
    private Symbol symbol(String name, int sym, Object val, int buflength) {
        Location left = new Location(yyline+1,yycolumn+yylength()-buflength,yychar+yylength()-buflength);
        Location right = new Location(yyline+1,yycolumn+yylength(),yychar+yylength());

        return symbolFactory.newSymbol(name, sym, left, right, val);
    }
  
    private void exibirErro(String msg) {
        System.out.println("Existe um erro na linha "+(yyline+1)+", column "+(yycolumn+1)+" : " + msg);
    }
%}

%cup
%public
%class AnalisadorLexico
%implements sym
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
    "="      { return symbol("equal", RELOP, new Integer(EQUAL)); }
    "<"      { return symbol("less", RELOP, new Integer(LESS)); }
    "<="     { return symbol("lessequal", RELOP, new Integer(LESSEQUAL)); }
    ">"      { return symbol("greater", RELOP, new Integer(GRATER)); }
    ">="     { return symbol("greaterequal", RELOP, new Integer(GRATEREQUAL)); }
    "!="     { return symbol("different", RELOP, new Integer(DIFFERENT)); }
    "not"    { return symbol("not", RELOP, new Integer(NOT)); }

    /* operadores de adição */
    "+"    { return symbol("plus", ADDOP, new Integer(PLUS)); }
    "-"    { return symbol("minus", ADDOP, new Integer(ADDOP)); }
    "or"   { return symbol("or", ADDOP, new Integer(OR)); }

    /* operadores de multiplicação */
    "*"      { return symbol("times", MULOP, new Integer(TIMES)); }
    "/"      { return symbol("divided", MULOP, new Integer(DIVIDED)); }
    "div"    { return symbol("divided", MULOP, new Integer(DIVIDED)); }
    "mod"    { return symbol("mod", MULOP, new Integer(MOD)); }
    "and"    { return symbol("and", MULOP, new Integer(AND)); }

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
{boolean_constant}  { return symbol("bool_const", BOOLEAN, new Boolean(Boolean.parseBool(yytext()))); }
{integer_constant}  { return symbol("int_const", INTEGER, new Integer(Integer.parseInt(yytext()))); }
{real_constant}     { return symbol("real_const", REAL, new Float(Float.parseFloat(yytext()))); }
{char_constant}     { return symbol("char_const", CHAR, new Character(yytext().charAt(1))); }

/* outros */
{identifier} { return symbol("identifier", IDENTIFIER, yytext()); }

/* erro */
[^]         { exibirErro("Caractere ilegal: " + yytext()); }