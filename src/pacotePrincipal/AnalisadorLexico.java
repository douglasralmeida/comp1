/* The following code was generated by JFlex 1.7.0 */

/* Analisador L�xico para linguagem MLM */

package pacotePrincipal;

import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/especificacoes/Yylex.lex</tt>
 */
public class AnalisadorLexico implements java_cup.runtime.Scanner, AnalisadorSintaticoSym {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\11\1\12\1\1\22\0\1\3\1\27\5\0"+
    "\1\13\1\51\1\52\1\33\1\32\1\53\1\7\1\0\1\34\1\6"+
    "\11\5\1\47\1\50\1\25\1\24\1\26\2\0\4\4\1\10\25\4"+
    "\6\0\1\15\1\43\1\44\1\35\1\20\1\14\1\42\1\45\1\36"+
    "\2\4\1\16\1\40\1\30\1\31\1\41\1\4\1\22\1\17\1\21"+
    "\1\23\1\37\1\46\3\4\12\0\1\11\u1fa2\0\1\11\1\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\2\4\1\5\1\1\6\3"+
    "\1\6\1\7\1\10\1\1\2\3\1\11\1\12\1\13"+
    "\7\3\1\14\1\15\1\16\1\17\1\20\2\21\1\0"+
    "\10\3\1\22\1\23\1\24\1\3\1\25\1\26\1\3"+
    "\1\27\10\3\1\30\2\0\1\31\1\3\1\32\1\3"+
    "\1\33\4\3\1\34\1\13\1\3\1\35\6\3\2\21"+
    "\1\36\1\37\1\40\1\41\1\42\5\3\1\43\2\3"+
    "\1\44\2\3\1\45\1\3\1\46\1\47\3\3\1\50"+
    "\1\51\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\54\0\204\0\260\0\334\0\54"+
    "\0\u0108\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\54"+
    "\0\u023c\0\u0268\0\u0294\0\u02c0\0\u02ec\0\54\0\54\0\54"+
    "\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8\0\u03f4\0\u0420\0\u044c"+
    "\0\54\0\54\0\54\0\54\0\u0478\0\u04a4\0\u04d0\0\u04fc"+
    "\0\u0528\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\54"+
    "\0\54\0\54\0\u065c\0\204\0\204\0\u0688\0\204\0\u06b4"+
    "\0\u06e0\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\54"+
    "\0\u0814\0\u0840\0\54\0\u086c\0\204\0\u0898\0\204\0\u08c4"+
    "\0\u08f0\0\u091c\0\u0948\0\204\0\204\0\u0974\0\204\0\u09a0"+
    "\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\u0a7c\0\u0aa8\0\54\0\204"+
    "\0\204\0\204\0\204\0\204\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58"+
    "\0\u0b84\0\204\0\u0bb0\0\u0bdc\0\204\0\u0c08\0\u0c34\0\204"+
    "\0\u0c60\0\204\0\204\0\u0c8c\0\u0cb8\0\u0ce4\0\204\0\204"+
    "\0\204";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\5"+
    "\1\2\1\4\1\11\1\12\1\13\2\5\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\5\1\33\1\34"+
    "\1\5\1\35\1\36\1\5\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\56\0\1\4\55\0\3\5\1\0\1\5"+
    "\3\0\10\5\4\0\2\5\3\0\12\5\5\0\1\45"+
    "\2\0\2\45\2\6\1\45\1\46\2\0\42\45\2\0"+
    "\5\45\1\46\2\0\41\45\1\47\2\0\51\47\4\0"+
    "\3\5\1\0\1\5\3\0\1\5\1\50\6\5\4\0"+
    "\2\5\3\0\12\5\11\0\3\5\1\0\1\5\3\0"+
    "\10\5\4\0\1\51\1\5\3\0\12\5\11\0\3\5"+
    "\1\0\1\5\3\0\2\5\1\52\5\5\4\0\1\53"+
    "\1\5\3\0\12\5\11\0\3\5\1\0\1\5\3\0"+
    "\6\5\1\54\1\5\4\0\2\5\3\0\10\5\1\55"+
    "\1\5\11\0\3\5\1\0\1\5\3\0\4\5\1\56"+
    "\3\5\4\0\2\5\3\0\12\5\11\0\3\5\1\0"+
    "\1\5\3\0\10\5\4\0\1\57\1\5\3\0\12\5"+
    "\31\0\1\60\53\0\1\61\53\0\1\62\33\0\3\5"+
    "\1\0\1\5\3\0\10\5\4\0\1\5\1\63\3\0"+
    "\12\5\11\0\3\5\1\0\1\5\3\0\6\5\1\64"+
    "\1\5\4\0\2\5\3\0\12\5\11\0\3\5\1\0"+
    "\1\5\3\0\10\5\4\0\1\5\1\65\3\0\1\5"+
    "\1\66\10\5\11\0\3\5\1\0\1\5\3\0\1\67"+
    "\7\5\4\0\1\70\1\5\3\0\12\5\11\0\3\5"+
    "\1\0\1\5\3\0\10\5\4\0\1\5\1\71\3\0"+
    "\12\5\11\0\3\5\1\0\1\5\3\0\6\5\1\72"+
    "\1\5\4\0\2\5\3\0\12\5\11\0\3\5\1\0"+
    "\1\5\3\0\4\5\1\73\3\5\4\0\1\5\1\74"+
    "\3\0\12\5\11\0\3\5\1\0\1\5\3\0\10\5"+
    "\4\0\2\5\3\0\10\5\1\75\1\5\11\0\3\5"+
    "\1\0\1\5\3\0\6\5\1\76\1\5\4\0\2\5"+
    "\3\0\10\5\1\77\1\5\31\0\1\100\34\0\2\45"+
    "\1\0\1\101\50\0\2\45\1\102\1\101\21\0\1\102"+
    "\34\0\1\103\44\0\3\5\1\0\1\5\3\0\2\5"+
    "\1\104\5\5\4\0\2\5\3\0\12\5\11\0\3\5"+
    "\1\0\1\5\3\0\10\5\4\0\2\5\3\0\1\105"+
    "\11\5\11\0\3\5\1\0\1\5\3\0\3\5\1\106"+
    "\4\5\4\0\2\5\3\0\12\5\11\0\3\5\1\0"+
    "\1\5\3\0\10\5\4\0\2\5\3\0\1\107\11\5"+
    "\11\0\3\5\1\0\1\5\3\0\7\5\1\110\4\0"+
    "\2\5\3\0\12\5\11\0\3\5\1\0\1\5\3\0"+
    "\4\5\1\111\3\5\4\0\2\5\3\0\12\5\11\0"+
    "\3\5\1\0\1\5\3\0\1\5\1\112\6\5\4\0"+
    "\2\5\3\0\12\5\11\0\3\5\1\0\1\5\3\0"+
    "\5\5\1\113\2\5\4\0\2\5\3\0\12\5\11\0"+
    "\3\5\1\0\1\5\3\0\5\5\1\114\2\5\4\0"+
    "\2\5\3\0\12\5\11\0\3\5\1\0\1\5\3\0"+
    "\10\5\4\0\2\5\3\0\2\5\1\115\7\5\11\0"+
    "\3\5\1\0\1\5\3\0\5\5\1\116\2\5\4\0"+
    "\2\5\3\0\12\5\11\0\3\5\1\0\1\5\3\0"+
    "\10\5\4\0\2\5\3\0\1\117\11\5\11\0\3\5"+
    "\1\0\1\5\3\0\10\5\4\0\1\5\1\120\3\0"+
    "\12\5\11\0\3\5\1\0\1\5\3\0\10\5\4\0"+
    "\2\5\3\0\5\5\1\121\4\5\11\0\3\5\1\0"+
    "\1\5\3\0\10\5\4\0\1\5\1\122\3\0\12\5"+
    "\11\0\3\5\1\0\1\5\3\0\1\5\1\123\6\5"+
    "\4\0\2\5\3\0\12\5\11\0\3\5\1\0\1\5"+
    "\3\0\10\5\4\0\2\5\3\0\1\5\1\124\10\5"+
    "\11\0\3\5\1\0\1\5\3\0\10\5\4\0\2\5"+
    "\3\0\1\5\1\125\10\5\12\0\1\126\1\127\1\102"+
    "\22\0\1\102\26\0\1\126\1\127\51\0\3\5\1\0"+
    "\1\5\3\0\3\5\1\110\4\5\4\0\2\5\3\0"+
    "\12\5\11\0\3\5\1\0\1\5\3\0\4\5\1\130"+
    "\3\5\4\0\2\5\3\0\12\5\11\0\3\5\1\0"+
    "\1\5\3\0\4\5\1\131\3\5\4\0\2\5\3\0"+
    "\12\5\11\0\3\5\1\0\1\5\3\0\10\5\4\0"+
    "\1\132\1\5\3\0\12\5\11\0\3\5\1\0\1\5"+
    "\3\0\2\5\1\133\5\5\4\0\2\5\3\0\1\134"+
    "\11\5\11\0\3\5\1\0\1\5\3\0\10\5\4\0"+
    "\2\5\3\0\1\5\1\135\10\5\11\0\3\5\1\0"+
    "\1\5\3\0\4\5\1\136\3\5\4\0\2\5\3\0"+
    "\12\5\11\0\3\5\1\0\1\5\3\0\10\5\4\0"+
    "\2\5\3\0\5\5\1\137\4\5\11\0\3\5\1\0"+
    "\1\5\3\0\10\5\4\0\2\5\3\0\1\5\1\140"+
    "\10\5\11\0\3\5\1\0\1\5\3\0\2\5\1\141"+
    "\5\5\4\0\2\5\3\0\12\5\11\0\3\5\1\0"+
    "\1\5\3\0\6\5\1\142\1\5\4\0\2\5\3\0"+
    "\12\5\11\0\3\5\1\0\1\5\3\0\5\5\1\143"+
    "\2\5\4\0\2\5\3\0\12\5\11\0\3\5\1\0"+
    "\1\5\3\0\2\5\1\144\5\5\4\0\2\5\3\0"+
    "\12\5\12\0\2\126\51\0\3\5\1\0\1\5\3\0"+
    "\2\5\1\145\5\5\4\0\2\5\3\0\12\5\11\0"+
    "\3\5\1\0\1\5\3\0\10\5\4\0\2\5\3\0"+
    "\5\5\1\146\4\5\11\0\3\5\1\0\1\5\3\0"+
    "\6\5\1\147\1\5\4\0\2\5\3\0\12\5\11\0"+
    "\3\5\1\0\1\5\3\0\10\5\4\0\1\150\1\5"+
    "\3\0\12\5\11\0\3\5\1\0\1\5\3\0\4\5"+
    "\1\151\3\5\4\0\2\5\3\0\12\5\11\0\3\5"+
    "\1\0\1\5\3\0\4\5\1\152\3\5\4\0\2\5"+
    "\3\0\12\5\11\0\3\5\1\0\1\5\3\0\4\5"+
    "\1\153\3\5\4\0\2\5\3\0\12\5\11\0\3\5"+
    "\1\0\1\5\3\0\4\5\1\154\3\5\4\0\2\5"+
    "\3\0\12\5\11\0\3\5\1\0\1\5\3\0\1\5"+
    "\1\155\6\5\4\0\2\5\3\0\12\5\11\0\3\5"+
    "\1\0\1\5\3\0\1\5\1\156\6\5\4\0\2\5"+
    "\3\0\12\5\11\0\3\5\1\0\1\5\3\0\6\5"+
    "\1\157\1\5\4\0\2\5\3\0\12\5\11\0\3\5"+
    "\1\0\1\5\3\0\10\5\4\0\2\5\3\0\3\5"+
    "\1\160\6\5\11\0\3\5\1\0\1\5\3\0\10\5"+
    "\4\0\1\161\1\5\3\0\12\5\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3344];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\3\1\1\11\7\1\1\11"+
    "\5\1\3\11\10\1\4\11\2\1\1\0\10\1\3\11"+
    "\15\1\1\11\2\0\1\11\23\1\1\11\32\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalisadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return symbolFactory.newSymbol("EOF", EOF, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+1,yychar+1));
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { exibirErro("Caractere n�o esperado: " + yytext());
            } 
            // fall through
          case 43: break;
          case 2: 
            { /* ignora */
            } 
            // fall through
          case 44: break;
          case 3: 
            { return symbol("identifier", IDENTIFIER, yytext());
            } 
            // fall through
          case 45: break;
          case 4: 
            { return symbol("int_const", INTEGER, Integer.valueOf(Integer.parseInt(yytext())));
            } 
            // fall through
          case 46: break;
          case 5: 
            { return symbol("minus", ADDOP, Integer.valueOf(ADDOP));
            } 
            // fall through
          case 47: break;
          case 6: 
            { return symbol("equal", RELOP, Integer.valueOf(EQUAL));
            } 
            // fall through
          case 48: break;
          case 7: 
            { return symbol("less", RELOP, Integer.valueOf(LESS));
            } 
            // fall through
          case 49: break;
          case 8: 
            { return symbol("greater", RELOP, Integer.valueOf(GREATER));
            } 
            // fall through
          case 50: break;
          case 9: 
            { return symbol("plus", ADDOP, Integer.valueOf(PLUS));
            } 
            // fall through
          case 51: break;
          case 10: 
            { return symbol("times", MULOP, Integer.valueOf(TIMES));
            } 
            // fall through
          case 52: break;
          case 11: 
            { return symbol("divided", MULOP, Integer.valueOf(DIVIDED));
            } 
            // fall through
          case 53: break;
          case 12: 
            { return symbol("decchar", DECCHAR);
            } 
            // fall through
          case 54: break;
          case 13: 
            { return symbol("eolchar", EOLCHAR);
            } 
            // fall through
          case 55: break;
          case 14: 
            { return symbol("openparchar", OPENPARCHAR);
            } 
            // fall through
          case 56: break;
          case 15: 
            { return symbol("closeparchar", CLOSEPARCHAR);
            } 
            // fall through
          case 57: break;
          case 16: 
            { return symbol("enumchar", ENUMCHAR);
            } 
            // fall through
          case 58: break;
          case 17: 
            { return symbol("real_const", REAL, Float.valueOf(Float.parseFloat(yytext())));
            } 
            // fall through
          case 59: break;
          case 18: 
            { return symbol("lessequal", RELOP, Integer.valueOf(LESSEQUAL));
            } 
            // fall through
          case 60: break;
          case 19: 
            { return symbol("greaterequal", RELOP, Integer.valueOf(GRATEREQUAL));
            } 
            // fall through
          case 61: break;
          case 20: 
            { return symbol("different", RELOP, Integer.valueOf(DIFFERENT));
            } 
            // fall through
          case 62: break;
          case 21: 
            { return symbol("or", ADDOP, Integer.valueOf(OR));
            } 
            // fall through
          case 63: break;
          case 22: 
            { return symbol("do", DO);
            } 
            // fall through
          case 64: break;
          case 23: 
            { return symbol("if", IF);
            } 
            // fall through
          case 65: break;
          case 24: 
            { return symbol("assignchar", ASSIGNCHAR);
            } 
            // fall through
          case 66: break;
          case 25: 
            { return symbol("char_const", CHAR, Character.valueOf(yytext().charAt(1)));
            } 
            // fall through
          case 67: break;
          case 26: 
            { return symbol("and", MULOP, Integer.valueOf(AND));
            } 
            // fall through
          case 68: break;
          case 27: 
            { return symbol("end", END);
            } 
            // fall through
          case 69: break;
          case 28: 
            { return symbol("not", RELOP, Integer.valueOf(NOT));
            } 
            // fall through
          case 70: break;
          case 29: 
            { return symbol("mod", MULOP, Integer.valueOf(MOD));
            } 
            // fall through
          case 71: break;
          case 30: 
            { return symbol("else", ELSE);
            } 
            // fall through
          case 72: break;
          case 31: 
            { return symbol("bool_const", BOOLEAN, Boolean.valueOf(Boolean.parseBoolean(yytext())));
            } 
            // fall through
          case 73: break;
          case 32: 
            { return symbol("then", THEN);
            } 
            // fall through
          case 74: break;
          case 33: 
            { return symbol("real", REAL);
            } 
            // fall through
          case 75: break;
          case 34: 
            { return symbol("read", READ);
            } 
            // fall through
          case 76: break;
          case 35: 
            { return symbol("char", CHAR);
            } 
            // fall through
          case 77: break;
          case 36: 
            { return symbol("until", UNTIL);
            } 
            // fall through
          case 78: break;
          case 37: 
            { return symbol("begin", BEGIN);
            } 
            // fall through
          case 79: break;
          case 38: 
            { return symbol("rite", WRITE);
            } 
            // fall through
          case 80: break;
          case 39: 
            { return symbol("while", WHILE);
            } 
            // fall through
          case 81: break;
          case 40: 
            { return symbol("integer", INTEGER);
            } 
            // fall through
          case 82: break;
          case 41: 
            { return symbol("program", PROGRAM);
            } 
            // fall through
          case 83: break;
          case 42: 
            { return symbol("boolean", BOOLEAN);
            } 
            // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
