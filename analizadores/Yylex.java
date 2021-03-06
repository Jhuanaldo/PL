/* The following code was generated by JFlex 1.6.1 */

//* --------------------------Seccion codigo-usuario ------------------------*/
package analizadores;
import java.io.*;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lex.flex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\2\1\6\1\6\1\1\22\0\1\3\1\53\1\65"+
    "\1\5\1\64\1\52\1\36\1\0\1\54\1\55\1\51\1\46\1\34"+
    "\1\47\1\61\1\50\12\41\1\0\1\35\1\44\1\7\1\45\1\62"+
    "\1\63\32\40\1\56\1\0\1\57\1\42\1\40\1\0\1\25\1\10"+
    "\1\33\1\15\1\11\1\24\1\12\1\23\1\13\1\40\1\31\1\21"+
    "\1\40\1\14\1\27\1\40\1\17\1\16\1\26\1\30\1\20\1\40"+
    "\1\22\1\40\1\32\1\40\1\0\1\37\1\0\1\43\6\0\1\6"+
    "\u05da\0\12\60\206\0\12\60\306\0\12\60\u019c\0\12\60\166\0\12\60"+
    "\166\0\12\60\166\0\12\60\166\0\12\60\166\0\12\60\166\0\12\60"+
    "\166\0\12\60\166\0\12\60\166\0\12\60\140\0\12\60\166\0\12\60"+
    "\106\0\12\60\u0116\0\12\60\106\0\12\60\u0746\0\12\60\46\0\12\60"+
    "\u012c\0\12\60\200\0\12\60\246\0\12\60\6\0\12\60\266\0\12\60"+
    "\126\0\12\60\206\0\12\60\6\0\12\60\u03ce\0\1\6\1\6\u85f6\0"+
    "\12\60\u02a6\0\12\60\46\0\12\60\306\0\12\60\26\0\12\60\126\0"+
    "\12\60\u0196\0\12\60\u5316\0\12\60\u0586\0\12\60\u0bbc\0\12\60\200\0"+
    "\12\60\74\0\12\60\220\0\12\60\u0116\0\12\60\u01d6\0\12\60\u0176\0"+
    "\12\60\146\0\12\60\u0216\0\12\60\u5176\0\12\60\346\0\12\60\u6c74\0"+
    "\62\60\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u280f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\1\1\5\16\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\1\1\25"+
    "\1\26\1\27\1\30\1\31\2\1\1\32\1\33\1\34"+
    "\2\0\1\35\1\6\1\36\2\6\1\37\3\6\1\40"+
    "\5\6\1\41\3\6\1\42\1\0\1\41\1\0\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\2\0\1\6\1\60\1\6"+
    "\1\61\1\62\1\63\6\6\1\42\3\6\1\64\1\65"+
    "\1\0\1\6\1\66\5\6\1\67\2\6\1\70\1\71"+
    "\1\72\1\0\1\73\1\74\1\6\1\75\2\6\1\76"+
    "\1\77\1\0\1\6\1\100\1\101\1\0\1\102\23\0"+
    "\2\103";

  private static int [] zzUnpackAction() {
    int [] result = new int[156];
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
    "\0\0\0\66\0\154\0\242\0\154\0\154\0\154\0\330"+
    "\0\u010e\0\u0144\0\u017a\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288"+
    "\0\u02be\0\u02f4\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\154"+
    "\0\154\0\u0438\0\u046e\0\u04a4\0\154\0\154\0\u04da\0\u0510"+
    "\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654\0\154\0\154"+
    "\0\154\0\154\0\u068a\0\u06c0\0\u06f6\0\154\0\u072c\0\154"+
    "\0\330\0\u0762\0\154\0\u0798\0\154\0\u07ce\0\u0804\0\u01b0"+
    "\0\u083a\0\u0870\0\u08a6\0\u01b0\0\u08dc\0\u0912\0\u0948\0\u097e"+
    "\0\u09b4\0\u01b0\0\u09ea\0\u0a20\0\u0a56\0\154\0\u0a8c\0\154"+
    "\0\u068a\0\154\0\154\0\154\0\154\0\154\0\154\0\154"+
    "\0\154\0\u0ac2\0\154\0\154\0\u068a\0\u0af8\0\u06f6\0\u0b2e"+
    "\0\u0b64\0\u01b0\0\u0b9a\0\u01b0\0\u01b0\0\u01b0\0\u0bd0\0\u0c06"+
    "\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde\0\u01b0\0\u0d14\0\u0d4a\0\u0d80"+
    "\0\154\0\154\0\u0db6\0\u0dec\0\u01b0\0\u0e22\0\u0e58\0\u0e8e"+
    "\0\u0ec4\0\u0efa\0\u01b0\0\u0f30\0\u0f66\0\u01b0\0\u01b0\0\u01b0"+
    "\0\u0f9c\0\u01b0\0\u01b0\0\u0fd2\0\u01b0\0\u1008\0\u103e\0\u01b0"+
    "\0\u01b0\0\u1074\0\u10aa\0\u01b0\0\u01b0\0\u10e0\0\u01b0\0\u1116"+
    "\0\u114c\0\u1182\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u1290\0\u12c6"+
    "\0\u12fc\0\u1332\0\u1368\0\u139e\0\u13d4\0\u140a\0\u1440\0\u1476"+
    "\0\u14ac\0\u14e2\0\u10e0\0\154";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[156];
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
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\0\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\14"+
    "\1\21\1\14\1\22\1\14\1\23\1\24\1\14\1\25"+
    "\1\26\2\14\1\27\1\30\1\31\1\32\1\33\1\14"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\34"+
    "\1\53\1\3\1\54\1\55\1\56\3\0\1\57\4\0"+
    "\24\57\4\0\1\57\24\0\1\60\70\0\1\5\63\0"+
    "\1\61\2\0\3\61\1\0\1\62\56\61\7\0\1\63"+
    "\66\0\6\14\1\64\15\14\3\0\1\65\2\14\11\0"+
    "\1\65\6\0\1\65\13\0\4\14\1\66\4\14\1\67"+
    "\12\14\3\0\1\65\2\14\11\0\1\65\6\0\1\65"+
    "\13\0\24\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\14\14\1\70\7\14\3\0\1\65\2\14"+
    "\11\0\1\65\6\0\1\65\13\0\3\14\1\71\13\14"+
    "\1\72\4\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\1\14\1\73\15\14\1\74\4\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\13\0\1\14"+
    "\1\75\22\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\4\14\1\76\17\14\3\0\1\65\2\14"+
    "\11\0\1\65\6\0\1\65\13\0\13\14\1\77\10\14"+
    "\3\0\1\65\2\14\11\0\1\65\6\0\1\65\13\0"+
    "\15\14\1\100\6\14\3\0\1\65\2\14\11\0\1\65"+
    "\6\0\1\65\13\0\4\14\1\101\17\14\3\0\1\65"+
    "\2\14\11\0\1\65\6\0\1\65\13\0\6\14\1\102"+
    "\15\14\3\0\1\65\2\14\11\0\1\65\6\0\1\65"+
    "\13\0\6\14\1\103\4\14\1\104\10\14\3\0\1\65"+
    "\2\14\11\0\1\65\6\0\1\65\13\0\15\14\1\105"+
    "\6\14\3\0\1\65\2\14\11\0\1\65\6\0\1\65"+
    "\41\0\1\106\37\0\24\107\3\0\1\110\1\107\66\0"+
    "\1\34\16\0\1\34\1\111\13\0\1\112\34\0\1\113"+
    "\30\0\1\114\35\0\1\115\27\0\1\116\65\0\1\117"+
    "\65\0\1\120\65\0\1\121\41\0\1\122\23\0\1\123"+
    "\65\0\1\124\117\0\1\125\34\0\24\126\4\0\1\126"+
    "\22\0\1\127\12\0\24\126\4\0\1\126\30\0\1\57"+
    "\4\0\24\57\4\0\2\57\24\0\1\61\2\0\3\61"+
    "\1\0\1\62\1\130\55\61\10\0\1\14\1\131\22\14"+
    "\3\0\1\65\2\14\11\0\1\65\6\0\1\65\13\0"+
    "\5\14\1\132\16\14\3\0\1\65\2\14\11\0\1\65"+
    "\6\0\1\65\13\0\16\14\1\133\5\14\3\0\1\65"+
    "\2\14\11\0\1\65\6\0\1\65\13\0\11\14\1\134"+
    "\12\14\3\0\1\65\2\14\11\0\1\65\6\0\1\65"+
    "\13\0\20\14\1\135\3\14\3\0\1\65\2\14\11\0"+
    "\1\65\6\0\1\65\13\0\14\14\1\136\7\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\13\0\7\14"+
    "\1\137\10\14\1\140\3\14\3\0\1\65\2\14\11\0"+
    "\1\65\6\0\1\65\13\0\11\14\1\141\12\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\13\0\1\14"+
    "\1\142\1\14\1\143\20\14\3\0\1\65\2\14\11\0"+
    "\1\65\6\0\1\65\13\0\11\14\1\144\12\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\13\0\5\14"+
    "\1\145\16\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\10\14\1\146\13\14\3\0\1\65\2\14"+
    "\11\0\1\65\6\0\1\65\13\0\1\14\1\147\22\14"+
    "\3\0\1\65\2\14\11\0\1\65\6\0\1\65\13\0"+
    "\16\14\1\150\5\14\3\0\1\65\2\14\11\0\1\65"+
    "\6\0\1\65\13\0\24\107\3\0\1\151\2\107\33\0"+
    "\1\152\66\0\24\126\4\0\2\126\24\0\1\61\2\0"+
    "\3\61\1\0\1\62\1\61\1\153\54\61\10\0\15\14"+
    "\1\154\6\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\1\14\1\155\1\14\1\156\20\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\13\0\10\14"+
    "\1\157\13\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\6\14\1\160\1\14\1\161\13\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\13\0\1\14"+
    "\1\162\22\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\4\14\1\163\17\14\3\0\1\65\2\14"+
    "\11\0\1\65\6\0\1\65\13\0\11\14\1\164\12\14"+
    "\3\0\1\65\2\14\11\0\1\65\6\0\1\65\13\0"+
    "\16\14\1\165\5\14\3\0\1\65\2\14\11\0\1\65"+
    "\6\0\1\65\13\0\1\14\1\166\22\14\3\0\1\65"+
    "\2\14\11\0\1\65\6\0\1\65\13\0\4\14\1\167"+
    "\17\14\3\0\1\65\2\14\11\0\1\65\6\0\1\65"+
    "\13\0\1\14\1\170\22\14\3\0\1\65\2\14\11\0"+
    "\1\65\6\0\1\65\3\0\1\61\2\0\3\61\1\0"+
    "\1\62\2\61\1\171\53\61\10\0\21\14\1\172\2\14"+
    "\3\0\1\65\2\14\11\0\1\65\6\0\1\65\13\0"+
    "\14\14\1\173\7\14\3\0\1\65\2\14\11\0\1\65"+
    "\6\0\1\65\13\0\3\14\1\174\20\14\3\0\1\65"+
    "\2\14\11\0\1\65\6\0\1\65\13\0\22\14\1\175"+
    "\1\14\3\0\1\65\2\14\11\0\1\65\6\0\1\65"+
    "\13\0\6\14\1\176\15\14\3\0\1\65\2\14\11\0"+
    "\1\65\6\0\1\65\13\0\16\14\1\177\5\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\13\0\1\14"+
    "\1\200\22\14\3\0\1\65\2\14\11\0\1\65\6\0"+
    "\1\65\13\0\1\14\1\201\22\14\3\0\1\65\2\14"+
    "\11\0\1\65\6\0\1\65\3\0\1\61\2\0\3\61"+
    "\1\0\1\62\3\61\1\202\52\61\10\0\6\14\1\203"+
    "\15\14\3\0\1\65\2\14\11\0\1\65\6\0\1\65"+
    "\13\0\4\14\1\204\17\14\3\0\1\65\2\14\11\0"+
    "\1\65\6\0\1\65\13\0\16\14\1\205\5\14\3\0"+
    "\1\65\2\14\11\0\1\65\6\0\1\65\3\0\1\61"+
    "\2\0\3\61\1\0\1\62\4\61\1\206\51\61\10\0"+
    "\1\14\1\207\22\14\3\0\1\65\2\14\11\0\1\65"+
    "\6\0\1\65\3\0\1\206\2\210\3\206\1\210\1\211"+
    "\56\206\7\210\1\212\56\210\1\61\2\0\3\61\1\0"+
    "\1\62\1\130\1\213\54\61\11\0\1\214\54\0\1\61"+
    "\2\0\3\61\1\0\1\62\4\61\1\215\51\61\14\0"+
    "\1\216\51\0\1\61\2\0\3\61\1\0\1\62\5\61"+
    "\1\217\50\61\15\0\1\220\50\0\1\61\2\0\3\61"+
    "\1\0\1\221\56\61\7\0\1\222\56\0\1\61\2\0"+
    "\3\61\1\0\1\62\1\223\55\61\10\0\1\224\55\0"+
    "\1\61\2\0\3\61\1\0\1\62\1\61\1\225\54\61"+
    "\11\0\1\226\54\0\1\61\2\0\3\61\1\0\1\62"+
    "\2\61\1\227\53\61\12\0\1\230\53\0\1\61\2\0"+
    "\3\61\1\0\1\62\3\61\1\231\52\61\13\0\1\232"+
    "\52\0\1\61\2\0\3\61\1\0\1\62\4\61\1\233"+
    "\51\61\14\0\1\234\51\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5400];
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
    "\2\0\1\11\1\1\3\11\20\1\2\11\3\1\2\11"+
    "\10\1\4\11\3\1\1\11\1\1\1\11\2\0\1\11"+
    "\1\1\1\11\20\1\1\11\1\0\1\11\1\0\10\11"+
    "\1\1\2\11\2\1\2\0\20\1\2\11\1\0\15\1"+
    "\1\0\10\1\1\0\3\1\1\0\1\1\23\0\1\1"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[156];
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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
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
    while (i < 374) {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 68: break;
          case 2: 
            { return new Symbol(sym.CRLF);
            }
          case 69: break;
          case 3: 
            { /* ignora los espacios en blanco */
            }
          case 70: break;
          case 4: 
            { /* ignora los tabuladores */
            }
          case 71: break;
          case 5: 
            { return new Symbol(sym.ASSIGN);
            }
          case 72: break;
          case 6: 
            { return new Symbol(sym.ID);
            }
          case 73: break;
          case 7: 
            { return new Symbol(sym.COMMA);
            }
          case 74: break;
          case 8: 
            { return new Symbol(sym.SEMICOLON);
            }
          case 75: break;
          case 9: 
            { return new Symbol(sym.BIT_AND);
            }
          case 76: break;
          case 10: 
            { return new Symbol(sym.BIT_OR);
            }
          case 77: break;
          case 11: 
            { return new Symbol(sym.INT,Integer.parseInt(yytext()));
            }
          case 78: break;
          case 12: 
            { return new Symbol(sym.BIT_XOR);
            }
          case 79: break;
          case 13: 
            { return new Symbol(sym.BIT_NOT);
            }
          case 80: break;
          case 14: 
            { return new Symbol(sym.LESS);
            }
          case 81: break;
          case 15: 
            { return new Symbol(sym.GREATER);
            }
          case 82: break;
          case 16: 
            { return new Symbol(sym.PLUS);
            }
          case 83: break;
          case 17: 
            { return new Symbol(sym.MINUS);
            }
          case 84: break;
          case 18: 
            { return new Symbol(sym.DIV);
            }
          case 85: break;
          case 19: 
            { return new Symbol(sym.MUL);
            }
          case 86: break;
          case 20: 
            { return new Symbol(sym.MOD);
            }
          case 87: break;
          case 21: 
            { return new Symbol(sym.LEFT_RBRACKET);
            }
          case 88: break;
          case 22: 
            { return new Symbol(sym.RIGHT_RBRACKET);
            }
          case 89: break;
          case 23: 
            { return new Symbol(sym.LEFT_SBRACKET);
            }
          case 90: break;
          case 24: 
            { return new Symbol(sym.RIGHT_SBRACKET);
            }
          case 91: break;
          case 25: 
            { return new Symbol(sym.DOT);
            }
          case 92: break;
          case 26: 
            { yybegin(STRING);
            }
          case 93: break;
          case 27: 
            { return new Symbol(sym.LITERAL,yytext());
            }
          case 94: break;
          case 28: 
            { yybegin(YYINITIAL);
            }
          case 95: break;
          case 29: 
            { return new Symbol(sym.EQUAL);
            }
          case 96: break;
          case 30: 
            { return new Symbol(sym.ID_FUNCTION);
            }
          case 97: break;
          case 31: 
            { return new Symbol(sym.IF);
            }
          case 98: break;
          case 32: 
            { return new Symbol(sym.DO);
            }
          case 99: break;
          case 33: 
            { return new Symbol(sym.OR);
            }
          case 100: break;
          case 34: 
            { return new Symbol(sym.AND);
            }
          case 101: break;
          case 35: 
            { return new Symbol(sym.LESS_EQUAL);
            }
          case 102: break;
          case 36: 
            { return new Symbol(sym.BIT_SHL);
            }
          case 103: break;
          case 37: 
            { return new Symbol(sym.GREATER_EQUAL);
            }
          case 104: break;
          case 38: 
            { return new Symbol(sym.BIT_SHR);
            }
          case 105: break;
          case 39: 
            { return new Symbol(sym.PLUS_ASSIGN);
            }
          case 106: break;
          case 40: 
            { return new Symbol(sym.MINUS_ASSIGN);
            }
          case 107: break;
          case 41: 
            { return new Symbol(sym.DIV_ASSIGN);
            }
          case 108: break;
          case 42: 
            { return new Symbol(sym.MUL_ASSIGN);
            }
          case 109: break;
          case 43: 
            { return new Symbol(sym.EXP);
            }
          case 110: break;
          case 44: 
            { return new Symbol(sym.MOD_ASSIGN);
            }
          case 111: break;
          case 45: 
            { return new Symbol(sym.NOT_EQUAL);
            }
          case 112: break;
          case 46: 
            { return new Symbol(sym.FLOAT,Double.parseDouble(yytext()));
            }
          case 113: break;
          case 47: 
            { return new Symbol(sym.ID_GLOBAL);
            }
          case 114: break;
          case 48: 
            { return new Symbol(sym.END);
            }
          case 115: break;
          case 49: 
            { return new Symbol(sym.NIL);
            }
          case 116: break;
          case 50: 
            { return new Symbol(sym.NOT);
            }
          case 117: break;
          case 51: 
            { return new Symbol(sym.DEF);
            }
          case 118: break;
          case 52: 
            { return new Symbol(sym.ID_ITER);
            }
          case 119: break;
          case 53: 
            { return new Symbol(sym.EXP_ASSIGN);
            }
          case 120: break;
          case 54: 
            { return new Symbol(sym.ELSE);
            }
          case 121: break;
          case 55: 
            { return new Symbol(sym.WHEN);
            }
          case 122: break;
          case 56: 
            { return new Symbol(sym.TRUE);
            }
          case 123: break;
          case 57: 
            { return new Symbol(sym.THEN);
            }
          case 124: break;
          case 58: 
            { return new Symbol(sym.CASE);
            }
          case 125: break;
          case 59: 
            { return new Symbol(sym.BREAK);
            }
          case 126: break;
          case 60: 
            { return new Symbol(sym.ELSIF);
            }
          case 127: break;
          case 61: 
            { return new Symbol(sym.RETRY);
            }
          case 128: break;
          case 62: 
            { return new Symbol(sym.WHILE);
            }
          case 129: break;
          case 63: 
            { return new Symbol(sym.FALSE);
            }
          case 130: break;
          case 64: 
            { return new Symbol(sym.RETURN);
            }
          case 131: break;
          case 65: 
            { return new Symbol(sym.UNLESS);
            }
          case 132: break;
          case 66: 
            { return new Symbol(sym.REQUIRE);
            }
          case 133: break;
          case 67: 
            { System.out.println("Error en =begin: comentario no terminado");
            }
          case 134: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
