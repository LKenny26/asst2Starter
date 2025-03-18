package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
import
syntaxtree
.
*
;
import
wrangLR
.
runtime
.
MessageObject
;
import
wrangLR
.
runtime
.
FilePosObject
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 98; }
public int getNttSym() { return 99; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"`extends",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"`if",
"<exp>",
"`else",
"`while",
"`=",
"<exp8>",
"<exp7>",
"<exp6>",
"<exp5>",
"<exp4>",
"`+",
"<exp3>",
"`*",
"<exp2>",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`-",
"INTLIT",
"letter",
"{\"A\"..\"Z\" \"a\" \"d\" \"f\"..\"g\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"y\"..\"z\"}",
"\"p\"",
"\"v\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"t\"",
"\"w\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"ws",
"\" \"",
"10",
"\"#\"",
"\"+\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\";\"",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"idChar",
"\"_\"",
"idChar128",
"223",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 100;}
private static final int MIN_REDUCTION = 874;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
1,406, // <start>
2,592, // ws*
3,581, // <program>
4,627, // <class decl>+
5,716, // <class decl>
6,415, // `class
71,242, // ws
72,555, // " "
73,584, // {10}
74,549, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 3
71,649, // ws
72,100, // " "
73,141, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 4
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
568, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|426, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
0x80000000|1, // match move
0x80000000|665, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
2,437, // ws*
71,559, // ws
72,491, // " "
73,819, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 11
0x80000000|60, // match move
0x80000000|490, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
0x80000000|291, // match move
0x80000000|276, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 15
2,68, // ws*
71,420, // ws
72,764, // " "
73,244, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 17
0x80000000|289, // match move
0x80000000|272, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 18
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 20
2,850, // ws*
23,MIN_REDUCTION+90, // `[
71,75, // ws
72,11, // " "
73,71, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|614, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 23
27,266, // `;
85,500, // ";"
  }
,
{ // state 24
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 27
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 28
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|659, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
0x80000000|1, // match move
0x80000000|661, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 31
71,384, // ws
72,626, // " "
73,646, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 34
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,372, // letter128
64,132, // {199..218 231..250}
65,132, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,805, // digit128
70,108, // {176..185}
87,481, // $$0
92,827, // idChar
93,802, // "_"
94,422, // idChar128
95,390, // {223}
  }
,
{ // state 35
23,733, // `[
83,588, // "["
  }
,
{ // state 36
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
288, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
560, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
348, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 37
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
288, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
865, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
706, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 38
0x80000000|1, // match move
0x80000000|641, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
24,496, // `]
84,563, // "]"
  }
,
{ // state 40
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|440, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|442, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
7,147, // ID
16,356, // `(
30,619, // <exp>
34,757, // <exp8>
35,221, // <exp7>
36,18, // <exp6>
37,16, // <exp5>
38,94, // <exp4>
40,324, // <exp3>
42,58, // <exp2>
43,170, // <cast exp>
44,332, // <unary exp>
45,77, // <exp1>
46,562, // `-
47,318, // INTLIT
48,635, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,804, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
67,183, // {"1".."9"}
68,710, // "0"
69,393, // digit128
70,835, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 45
71,808, // ws
72,666, // " "
73,654, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 48
39,360, // `+
75,823, // "+"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 49
0x80000000|569, // match move
0x80000000|297, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 50
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 52
0x80000000|329, // match move
0x80000000|499, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 53
7,155, // ID
16,325, // `(
30,800, // <exp>
34,687, // <exp8>
35,216, // <exp7>
36,28, // <exp6>
37,26, // <exp5>
38,113, // <exp4>
40,285, // <exp3>
42,9, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 54
8,725, // `{
79,694, // "{"
  }
,
{ // state 55
2,441, // ws*
71,559, // ws
72,491, // " "
73,819, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 57
71,573, // ws
72,218, // " "
73,237, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 59
0x80000000|299, // match move
0x80000000|294, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 60
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 61
0x80000000|524, // match move
0x80000000|396, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 62
71,680, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 63
0x80000000|1, // match move
0x80000000|806, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|519, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 67
16,699, // `(
77,410, // "("
  }
,
{ // state 68
71,78, // ws
72,764, // " "
73,244, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 69
7,155, // ID
16,325, // `(
30,483, // <exp>
34,687, // <exp8>
35,216, // <exp7>
36,28, // <exp6>
37,26, // <exp5>
38,113, // <exp4>
40,285, // <exp3>
42,9, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 70
39,341, // `+
75,823, // "+"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 71
0x80000000|645, // match move
0x80000000|174, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 72
23,MIN_REDUCTION+125, // `[
71,6, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|815, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|816, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 75
0x80000000|607, // match move
0x80000000|351, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 78
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 79
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,778, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,520, // digit128
70,846, // {176..185}
87,63, // $$0
92,827, // idChar
93,802, // "_"
94,93, // idChar128
95,617, // {223}
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|810, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 81
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,615, // letter128
64,438, // {199..218 231..250}
65,438, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,293, // digit128
70,423, // {176..185}
86,849, // idChar*
87,536, // $$0
92,361, // idChar
93,802, // "_"
94,547, // idChar128
95,465, // {223}
  }
,
{ // state 82
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|583, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
41,298, // `*
76,751, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|206, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 86
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,692, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,525, // digit128
70,828, // {176..185}
87,80, // $$0
92,827, // idChar
93,802, // "_"
94,59, // idChar128
95,542, // {223}
  }
,
{ // state 87
41,304, // `*
76,751, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 89
0x80000000|1, // match move
0x80000000|553, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 90
57,642, // "x"
  }
,
{ // state 91
2,702, // ws*
71,167, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 93
0x80000000|275, // match move
0x80000000|369, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
39,350, // `+
75,823, // "+"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 96
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,682, // letter128
64,487, // {199..218 231..250}
65,487, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,534, // digit128
70,833, // {176..185}
87,74, // $$0
92,827, // idChar
93,802, // "_"
94,17, // idChar128
95,533, // {223}
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,684, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,531, // digit128
70,835, // {176..185}
87,73, // $$0
92,827, // idChar
93,802, // "_"
94,12, // idChar128
95,530, // {223}
  }
,
{ // state 99
23,MIN_REDUCTION+44, // `[
83,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 101
2,850, // ws*
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 104
41,295, // `*
76,751, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 105
71,52, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 106
71,47, // ws
72,821, // " "
73,464, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 107
0x80000000|1, // match move
0x80000000|589, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
0x80000000|738, // match move
0x80000000|842, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
17,651, // `)
78,404, // ")"
  }
,
{ // state 110
0x80000000|1, // match move
0x80000000|180, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|586, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 113
39,321, // `+
75,823, // "+"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 114
61,55, // "t"
  }
,
{ // state 115
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 116
23,MIN_REDUCTION+44, // `[
83,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 117
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
523, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
558, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
400, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 118
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 119
17,675, // `)
78,389, // ")"
  }
,
{ // state 120
0x80000000|364, // match move
0x80000000|162, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
2,681, // ws*
23,MIN_REDUCTION+124, // `[
71,736, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 122
0x80000000|367, // match move
0x80000000|163, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 123
41,257, // `*
76,751, // "*"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 124
0x80000000|287, // match move
0x80000000|634, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 125
2,300, // ws*
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 127
2,5, // ws*
23,MIN_REDUCTION+86, // `[
71,743, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|328, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
2,190, // ws*
  }
,
{ // state 130
0x80000000|1, // match move
0x80000000|330, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
7,155, // ID
16,325, // `(
30,502, // <exp>
34,687, // <exp8>
35,216, // <exp7>
36,28, // <exp6>
37,26, // <exp5>
38,113, // <exp4>
40,285, // <exp3>
42,9, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 132
0x80000000|679, // match move
0x80000000|648, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 136
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,701, // letter128
64,671, // {199..218 231..250}
65,671, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,797, // digit128
70,623, // {176..185}
86,169, // idChar*
87,598, // $$0
92,361, // idChar
93,802, // "_"
94,256, // idChar128
95,576, // {223}
  }
,
{ // state 137
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 138
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 139
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 140
0x80000000|1, // match move
0x80000000|347, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 141
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 142
7,783, // ID
22,189, // <empty bracket pair>
23,39, // `[
48,428, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,722, // letter128
64,686, // {199..218 231..250}
65,686, // {193..198 225..230}
83,588, // "["
  }
,
{ // state 143
2,761, // ws*
23,MIN_REDUCTION+124, // `[
71,748, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 145
0x80000000|129, // match move
0x80000000|200, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 146
2,765, // ws*
23,MIN_REDUCTION+124, // `[
71,745, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 147
0x80000000|1, // match move
0x80000000|444, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 148
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 149
0x80000000|1, // match move
0x80000000|448, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 151
66,830, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,854, // digit128
70,846, // {176..185}
88,376, // digit*
89,323, // $$1
  }
,
{ // state 152
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 153
0x80000000|1, // match move
0x80000000|456, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 154
71,66, // ws
72,32, // " "
73,609, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 155
0x80000000|1, // match move
0x80000000|452, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 156
2,219, // ws*
71,261, // ws
72,762, // " "
73,310, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 157
16,53, // `(
77,410, // "("
  }
,
{ // state 158
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 160
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 161
2,768, // ws*
23,MIN_REDUCTION+124, // `[
71,743, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 162
2,43, // ws*
23,MIN_REDUCTION+86, // `[
71,745, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 163
2,42, // ws*
23,MIN_REDUCTION+86, // `[
71,748, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 164
71,680, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 166
0x80000000|1, // match move
0x80000000|312, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 169
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,701, // letter128
64,671, // {199..218 231..250}
65,671, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,797, // digit128
70,623, // {176..185}
87,431, // $$0
92,827, // idChar
93,802, // "_"
94,256, // idChar128
95,576, // {223}
  }
,
{ // state 170
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 171
0x80000000|569, // match move
0x80000000|283, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 174
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 175
0x80000000|569, // match move
0x80000000|280, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 177
0x80000000|741, // match move
0x80000000|705, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 178
71,333, // ws
72,653, // " "
73,227, // {10}
99,MIN_REDUCTION+63, // $NT
  }
,
{ // state 179
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 180
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 181
66,830, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,832, // digit128
70,833, // {176..185}
88,447, // digit*
89,343, // $$1
  }
,
{ // state 182
0x80000000|569, // match move
0x80000000|427, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 183
66,830, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,836, // digit128
70,835, // {176..185}
88,443, // digit*
89,340, // $$1
  }
,
{ // state 184
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 185
71,630, // ws
72,115, // " "
73,133, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 186
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 187
0x80000000|429, // match move
0x80000000|8, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 188
23,MIN_REDUCTION+89, // `[
71,6, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 190
0x80000000|1, // match move
0x80000000|469, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 193
23,MIN_REDUCTION+89, // `[
71,29, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 198
51,445, // "v"
  }
,
{ // state 199
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 200
2,190, // ws*
23,MIN_REDUCTION+86, // `[
71,736, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 201
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 202
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 204
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
36, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
781, // <stmt>
683, // <assign>
-1, // `;
23, // <local var decl>
157, // `if
392, // <exp>
-1, // `else
593, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 205
66,830, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,841, // digit128
70,828, // {176..185}
88,451, // digit*
89,359, // $$1
  }
,
{ // state 206
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 208
23,MIN_REDUCTION+89, // `[
71,30, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|529, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|532, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 211
53,628, // "i"
58,480, // "b"
  }
,
{ // state 212
2,424, // ws*
71,349, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 213
15,831, // `void
74,198, // "#"
  }
,
{ // state 214
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 219
71,596, // ws
72,762, // " "
73,310, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 220
23,MIN_REDUCTION+46, // `[
83,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 222
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 223
23,MIN_REDUCTION+89, // `[
71,38, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 224
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 227
99,MIN_REDUCTION+48, // $NT
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 228
23,MIN_REDUCTION+46, // `[
83,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 230
23,MIN_REDUCTION+46, // `[
83,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 231
0x80000000|339, // match move
0x80000000|127, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
71,670, // ws
72,491, // " "
73,819, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 238
2,424, // ws*
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 240
71,398, // ws
72,264, // " "
73,152, // {10}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 247
17,399, // `)
22,693, // <empty bracket pair>
23,872, // `[
78,734, // ")"
83,588, // "["
  }
,
{ // state 248
71,808, // ws
72,666, // " "
73,654, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 249
71,112, // ws
72,655, // " "
73,673, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 252
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 253
2,402, // ws*
71,514, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 255
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,41, // letter128
64,724, // {199..218 231..250}
65,724, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,870, // digit128
70,194, // {176..185}
87,173, // $$0
92,827, // idChar
93,802, // "_"
94,566, // idChar128
95,246, // {223}
  }
,
{ // state 256
2,611, // ws*
71,167, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 257
7,160, // ID
16,259, // `(
42,818, // <exp2>
43,195, // <cast exp>
44,353, // <unary exp>
45,89, // <exp1>
46,571, // `-
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 258
2,545, // ws*
71,207, // ws
72,655, // " "
73,673, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 259
7,308, // ID
19,354, // <type>
20,695, // `int
21,82, // `boolean
48,136, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,91, // letter128
64,671, // {199..218 231..250}
65,671, // {193..198 225..230}
74,211, // "#"
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 261
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 262
0x80000000|101, // match move
0x80000000|20, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 263
17,554, // `)
22,693, // <empty bracket pair>
23,872, // `[
78,734, // ")"
83,588, // "["
  }
,
{ // state 264
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 265
17,522, // `)
22,693, // <empty bracket pair>
23,872, // `[
78,734, // ")"
83,588, // "["
  }
,
{ // state 266
0x80000000|863, // match move
0x80000000|650, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 267
0x80000000|1, // match move
0x80000000|24, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 268
7,147, // ID
16,356, // `(
30,25, // <exp>
34,757, // <exp8>
35,221, // <exp7>
36,18, // <exp6>
37,16, // <exp5>
38,94, // <exp4>
40,324, // <exp3>
42,58, // <exp2>
43,170, // <cast exp>
44,332, // <unary exp>
45,77, // <exp1>
46,562, // `-
47,318, // INTLIT
48,635, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,804, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
67,183, // {"1".."9"}
68,710, // "0"
69,393, // digit128
70,835, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 269
71,52, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 270
0x80000000|1, // match move
0x80000000|22, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 271
71,374, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 272
2,787, // ws*
23,MIN_REDUCTION+122, // `[
71,745, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 273
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,41, // letter128
64,724, // {199..218 231..250}
65,724, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,870, // digit128
70,194, // {176..185}
86,255, // idChar*
87,65, // $$0
92,361, // idChar
93,802, // "_"
94,566, // idChar128
95,246, // {223}
  }
,
{ // state 274
23,MIN_REDUCTION+95, // `[
71,38, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 275
2,92, // ws*
  }
,
{ // state 276
2,785, // ws*
23,MIN_REDUCTION+122, // `[
71,748, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 277
27,158, // `;
85,599, // ";"
  }
,
{ // state 278
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 280
23,MIN_REDUCTION+106, // `[
83,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 282
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
37, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
703, // <stmt>
605, // <assign>
-1, // `;
501, // <local var decl>
871, // `if
392, // <exp>
-1, // `else
620, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 283
23,MIN_REDUCTION+106, // `[
83,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 285
41,295, // `*
76,751, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 286
23,700, // `[
83,258, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 287
2,489, // ws*
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 288
0x80000000|379, // match move
0x80000000|845, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 289
2,787, // ws*
  }
,
{ // state 290
54,697, // "l"
  }
,
{ // state 291
2,785, // ws*
  }
,
{ // state 292
71,377, // ws
72,463, // " "
73,638, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 294
2,795, // ws*
23,MIN_REDUCTION+122, // `[
71,743, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 295
7,155, // ID
16,325, // `(
42,793, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 296
2,744, // ws*
71,167, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 297
23,MIN_REDUCTION+106, // `[
83,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 298
7,147, // ID
16,356, // `(
42,789, // <exp2>
43,170, // <cast exp>
44,332, // <unary exp>
45,77, // <exp1>
46,562, // `-
47,318, // INTLIT
48,635, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,804, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
67,183, // {"1".."9"}
68,710, // "0"
69,393, // digit128
70,835, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 299
2,795, // ws*
  }
,
{ // state 300
0x80000000|862, // match move
0x80000000|601, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 301
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 303
23,708, // `[
83,258, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 304
7,149, // ID
16,352, // `(
42,788, // <exp2>
43,172, // <cast exp>
44,331, // <unary exp>
45,64, // <exp1>
46,564, // `-
47,316, // INTLIT
48,637, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,803, // letter128
64,487, // {199..218 231..250}
65,487, // {193..198 225..230}
67,181, // {"1".."9"}
68,712, // "0"
69,391, // digit128
70,833, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 305
0x80000000|1, // match move
0x80000000|366, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
23,713, // `[
83,258, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 307
23,MIN_REDUCTION+95, // `[
71,29, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 309
71,374, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 311
71,394, // ws
72,302, // " "
73,126, // {10}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 312
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 313
0x80000000|1, // match move
0x80000000|825, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 314
9,335, // <decl in class>*
10,135, // `}
12,430, // <decl in class>
13,144, // <method decl>
14,213, // `public
74,817, // "#"
80,15, // "}"
  }
,
{ // state 315
71,52, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 316
0x80000000|1, // match move
0x80000000|346, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 317
23,MIN_REDUCTION+95, // `[
71,30, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 318
0x80000000|1, // match move
0x80000000|345, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 320
59,472, // "e"
  }
,
{ // state 321
7,155, // ID
16,325, // `(
40,104, // <exp3>
42,9, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 322
0x80000000|1, // match move
0x80000000|385, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|760, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 324
41,298, // `*
76,751, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 325
7,308, // ID
19,247, // <type>
20,695, // `int
21,82, // `boolean
48,136, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,91, // letter128
64,671, // {199..218 231..250}
65,671, // {193..198 225..230}
74,211, // "#"
  }
,
{ // state 326
41,304, // `*
76,751, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 327
23,691, // `[
83,258, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 328
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 330
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 333
99,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 334
0x80000000|1, // match move
0x80000000|855, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 335
10,777, // `}
12,251, // <decl in class>
13,144, // <method decl>
14,213, // `public
74,817, // "#"
80,15, // "}"
  }
,
{ // state 336
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 337
55,7, // "o"
  }
,
{ // state 338
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 339
2,5, // ws*
  }
,
{ // state 340
0x80000000|1, // match move
0x80000000|138, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 341
7,149, // ID
16,352, // `(
40,87, // <exp3>
42,56, // <exp2>
43,172, // <cast exp>
44,331, // <unary exp>
45,64, // <exp1>
46,564, // `-
47,316, // INTLIT
48,637, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,803, // letter128
64,487, // {199..218 231..250}
65,487, // {193..198 225..230}
67,181, // {"1".."9"}
68,712, // "0"
69,391, // digit128
70,833, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 342
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,10, // letter128
64,686, // {199..218 231..250}
65,686, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,852, // digit128
70,225, // {176..185}
87,33, // $$0
92,827, // idChar
93,802, // "_"
94,504, // idChar128
95,279, // {223}
  }
,
{ // state 343
0x80000000|1, // match move
0x80000000|139, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 344
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 345
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 346
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 347
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 348
0x80000000|538, // match move
0x80000000|739, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 349
0x80000000|137, // match move
0x80000000|731, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 350
7,147, // ID
16,356, // `(
40,84, // <exp3>
42,58, // <exp2>
43,170, // <cast exp>
44,332, // <unary exp>
45,77, // <exp1>
46,562, // `-
47,318, // INTLIT
48,635, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,804, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
67,183, // {"1".."9"}
68,710, // "0"
69,393, // digit128
70,835, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 351
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 352
7,308, // ID
19,263, // <type>
20,695, // `int
21,82, // `boolean
48,136, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,91, // letter128
64,671, // {199..218 231..250}
65,671, // {193..198 225..230}
74,211, // "#"
  }
,
{ // state 353
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 354
17,578, // `)
22,693, // <empty bracket pair>
23,872, // `[
78,734, // ")"
83,588, // "["
  }
,
{ // state 355
0x80000000|1, // match move
0x80000000|847, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
7,308, // ID
19,265, // <type>
20,695, // `int
21,82, // `boolean
48,136, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,91, // letter128
64,671, // {199..218 231..250}
65,671, // {193..198 225..230}
74,211, // "#"
  }
,
{ // state 357
0x80000000|1, // match move
0x80000000|848, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 358
2,754, // ws*
23,MIN_REDUCTION+126, // `[
71,736, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 359
0x80000000|1, // match move
0x80000000|118, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 360
7,160, // ID
16,259, // `(
40,123, // <exp3>
42,40, // <exp2>
43,195, // <cast exp>
44,353, // <unary exp>
45,89, // <exp1>
46,571, // `-
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 361
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 362
41,257, // `*
76,751, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 363
23,MIN_REDUCTION+95, // `[
71,6, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 364
2,43, // ws*
  }
,
{ // state 365
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,102, // letter128
64,676, // {199..218 231..250}
65,676, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,843, // digit128
70,254, // {176..185}
87,51, // $$0
92,827, // idChar
93,802, // "_"
94,458, // idChar128
95,301, // {223}
  }
,
{ // state 366
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 367
2,42, // ws*
  }
,
{ // state 368
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 369
2,92, // ws*
23,MIN_REDUCTION+122, // `[
71,736, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 370
0x80000000|13, // match move
0x80000000|338, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 371
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 372
0x80000000|433, // match move
0x80000000|669, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 373
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 375
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 376
66,688, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,854, // digit128
70,846, // {176..185}
89,140, // $$1
  }
,
{ // state 377
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 378
0x80000000|409, // match move
0x80000000|414, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 379
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 381
2,729, // ws*
23,MIN_REDUCTION+126, // `[
71,748, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 382
2,727, // ws*
23,MIN_REDUCTION+126, // `[
71,745, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 383
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
540, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
558, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
580, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 384
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 385
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 386
31,4, // `else
74,320, // "#"
  }
,
{ // state 387
60,868, // "h"
  }
,
{ // state 388
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 389
2,711, // ws*
71,707, // ws
72,463, // " "
73,638, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 390
0x80000000|250, // match move
0x80000000|214, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 391
0x80000000|419, // match move
0x80000000|436, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 392
33,268, // `=
82,791, // "="
  }
,
{ // state 393
0x80000000|418, // match move
0x80000000|434, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 395
2,709, // ws*
23,MIN_REDUCTION+126, // `[
71,743, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 396
71,MIN_REDUCTION+47, // ws
72,MIN_REDUCTION+47, // " "
73,MIN_REDUCTION+47, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 397
0x80000000|425, // match move
0x80000000|446, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 398
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 399
7,155, // ID
16,325, // `(
43,521, // <cast exp>
45,758, // <exp1>
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
  }
,
{ // state 400
2,248, // ws*
71,721, // ws
72,666, // " "
73,654, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 401
54,476, // "l"
  }
,
{ // state 402
71,374, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 403
31,413, // `else
74,320, // "#"
  }
,
{ // state 404
2,597, // ws*
71,467, // ws
72,302, // " "
73,126, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 405
2,714, // ws*
71,636, // ws
72,653, // " "
73,227, // {10}
99,MIN_REDUCTION+86, // $NT
  }
,
{ // state 406
98,MIN_REDUCTION+0, // $
  }
,
{ // state 407
17,752, // `)
78,389, // ")"
  }
,
{ // state 408
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,102, // letter128
64,676, // {199..218 231..250}
65,676, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,843, // digit128
70,254, // {176..185}
86,365, // idChar*
87,134, // $$0
92,361, // idChar
93,802, // "_"
94,458, // idChar128
95,301, // {223}
  }
,
{ // state 409
2,537, // ws*
  }
,
{ // state 410
2,851, // ws*
71,207, // ws
72,655, // " "
73,673, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 411
0x80000000|475, // match move
0x80000000|358, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 412
24,587, // `]
84,120, // "]"
  }
,
{ // state 413
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
36, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
809, // <stmt>
683, // <assign>
-1, // `;
23, // <local var decl>
157, // `if
392, // <exp>
-1, // `else
593, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 414
2,537, // ws*
23,MIN_REDUCTION+96, // `[
71,736, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 415
7,657, // ID
48,81, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,156, // letter128
64,438, // {199..218 231..250}
65,438, // {193..198 225..230}
  }
,
{ // state 416
2,57, // ws*
71,647, // ws
72,218, // " "
73,237, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 417
24,591, // `]
84,122, // "]"
  }
,
{ // state 418
2,511, // ws*
  }
,
{ // state 419
2,509, // ws*
  }
,
{ // state 420
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 421
24,594, // `]
84,231, // "]"
  }
,
{ // state 422
0x80000000|125, // match move
0x80000000|664, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 423
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 424
0x80000000|807, // match move
0x80000000|105, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 425
2,460, // ws*
  }
,
{ // state 426
23,MIN_REDUCTION+85, // `[
71,6, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 427
23,MIN_REDUCTION+106, // `[
83,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 428
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,10, // letter128
64,686, // {199..218 231..250}
65,686, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,852, // digit128
70,225, // {176..185}
86,342, // idChar*
87,88, // $$0
92,361, // idChar
93,802, // "_"
94,504, // idChar128
95,279, // {223}
  }
,
{ // state 429
31,632, // `else
74,320, // "#"
  }
,
{ // state 430
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 434
2,511, // ws*
23,MIN_REDUCTION+96, // `[
71,748, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 435
23,MIN_REDUCTION+40, // `[
83,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 436
2,509, // ws*
23,MIN_REDUCTION+96, // `[
71,745, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 437
71,670, // ws
72,491, // " "
73,819, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 438
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 439
71,47, // ws
72,821, // " "
73,464, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 440
23,MIN_REDUCTION+85, // `[
71,30, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 441
71,670, // ws
72,491, // " "
73,819, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 442
23,MIN_REDUCTION+85, // `[
71,29, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 443
66,688, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,836, // digit128
70,835, // {176..185}
89,130, // $$1
  }
,
{ // state 444
23,MIN_REDUCTION+40, // `[
83,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 445
55,746, // "o"
  }
,
{ // state 446
2,460, // ws*
23,MIN_REDUCTION+96, // `[
71,743, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 447
66,688, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,832, // digit128
70,833, // {176..185}
89,128, // $$1
  }
,
{ // state 448
23,MIN_REDUCTION+40, // `[
83,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 449
24,775, // `]
84,145, // "]"
  }
,
{ // state 450
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 451
66,688, // digit
67,720, // {"1".."9"}
68,720, // "0"
69,841, // digit128
70,828, // {176..185}
89,166, // $$1
  }
,
{ // state 452
23,MIN_REDUCTION+40, // `[
83,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 453
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 454
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
782, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 455
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 456
23,700, // `[
83,258, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 457
2,612, // ws*
71,349, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 458
2,271, // ws*
71,514, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 459
23,MIN_REDUCTION+123, // `[
71,38, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 460
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 461
2,763, // ws*
71,517, // ws
72,243, // " "
73,191, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 462
23,MIN_REDUCTION+102, // `[
83,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 463
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 464
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 465
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 466
17,454, // `)
78,389, // ")"
  }
,
{ // state 467
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 469
23,MIN_REDUCTION+85, // `[
71,38, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 470
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
595, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
117, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
400, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 471
0x80000000|241, // match move
0x80000000|99, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 472
54,826, // "l"
  }
,
{ // state 473
16,109, // `(
77,461, // "("
  }
,
{ // state 474
23,MIN_REDUCTION+102, // `[
83,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 475
2,754, // ws*
  }
,
{ // state 476
2,178, // ws*
71,636, // ws
72,653, // " "
73,227, // {10}
99,MIN_REDUCTION+64, // $NT
  }
,
{ // state 477
71,MIN_REDUCTION+48, // ws
72,MIN_REDUCTION+48, // " "
73,MIN_REDUCTION+48, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 478
23,MIN_REDUCTION+102, // `[
83,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 479
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 480
55,740, // "o"
  }
,
{ // state 481
0x80000000|792, // match move
0x80000000|629, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 482
0x80000000|515, // match move
0x80000000|395, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 483
17,204, // `)
78,389, // ")"
  }
,
{ // state 484
99,MIN_REDUCTION+15, // $NT
  }
,
{ // state 485
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 486
0x80000000|241, // match move
0x80000000|780, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 487
0x80000000|241, // match move
0x80000000|116, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 488
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,49, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,49, // {176..185}
91,334, // $$2
96,513, // hexDigit
97,411, // hexDigit128
  }
,
{ // state 489
0x80000000|579, // match move
0x80000000|315, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 490
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 491
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 492
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 493
23,MIN_REDUCTION+102, // `[
83,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 494
0x80000000|495, // match move
0x80000000|382, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 495
2,727, // ws*
  }
,
{ // state 496
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 497
0x80000000|241, // match move
0x80000000|786, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 498
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 499
71,MIN_REDUCTION+119, // ws
72,MIN_REDUCTION+119, // " "
73,MIN_REDUCTION+119, // {10}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 500
0x80000000|834, // match move
0x80000000|457, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 501
27,266, // `;
85,124, // ";"
  }
,
{ // state 502
17,860, // `)
78,389, // ")"
  }
,
{ // state 503
0x80000000|505, // match move
0x80000000|381, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 504
2,240, // ws*
71,485, // ws
72,264, // " "
73,152, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 505
2,729, // ws*
  }
,
{ // state 506
23,713, // `[
83,258, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 507
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 509
0x80000000|1, // match move
0x80000000|307, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 510
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 511
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 512
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,778, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,520, // digit128
70,846, // {176..185}
86,79, // idChar*
87,222, // $$0
92,361, // idChar
93,802, // "_"
94,93, // idChar128
95,617, // {223}
  }
,
{ // state 513
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 514
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 515
2,709, // ws*
  }
,
{ // state 516
7,155, // ID
16,325, // `(
30,119, // <exp>
34,687, // <exp8>
35,216, // <exp7>
36,28, // <exp6>
37,26, // <exp5>
38,113, // <exp4>
40,285, // <exp3>
42,9, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 517
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 518
23,MIN_REDUCTION+119, // `[
83,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 519
23,708, // `[
83,258, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 520
0x80000000|336, // match move
0x80000000|840, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 521
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 522
7,147, // ID
16,356, // `(
43,507, // <cast exp>
45,689, // <exp1>
47,318, // INTLIT
48,635, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,804, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
67,183, // {"1".."9"}
68,710, // "0"
69,393, // digit128
70,835, // {176..185}
77,625, // "("
  }
,
{ // state 523
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 525
0x80000000|336, // match move
0x80000000|813, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 526
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 528
2,717, // ws*
23,MIN_REDUCTION+90, // `[
71,743, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 529
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 530
0x80000000|672, // match move
0x80000000|184, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 531
0x80000000|336, // match move
0x80000000|799, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 532
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 533
0x80000000|672, // match move
0x80000000|186, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 534
0x80000000|336, // match move
0x80000000|801, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 535
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 536
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 537
0x80000000|1, // match move
0x80000000|274, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 538
2,667, // ws*
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 539
71,215, // ws
72,814, // " "
73,527, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 541
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,175, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,175, // {176..185}
91,355, // $$2
96,513, // hexDigit
97,503, // hexDigit128
  }
,
{ // state 542
0x80000000|672, // match move
0x80000000|224, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 543
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,171, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,171, // {176..185}
91,357, // $$2
96,513, // hexDigit
97,494, // hexDigit128
  }
,
{ // state 544
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 545
71,112, // ws
72,655, // " "
73,673, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 546
2,633, // ws*
23,MIN_REDUCTION+90, // `[
71,745, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 547
2,557, // ws*
71,261, // ws
72,762, // " "
73,310, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 548
2,631, // ws*
23,MIN_REDUCTION+90, // `[
71,748, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 549
52,290, // "c"
  }
,
{ // state 550
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,182, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,182, // {176..185}
91,313, // $$2
96,513, // hexDigit
97,482, // hexDigit128
  }
,
{ // state 551
23,MIN_REDUCTION+121, // `[
71,38, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 552
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 553
23,691, // `[
83,258, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 554
7,149, // ID
16,352, // `(
43,510, // <cast exp>
45,690, // <exp1>
47,316, // INTLIT
48,637, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,803, // letter128
64,487, // {199..218 231..250}
65,487, // {193..198 225..230}
67,181, // {"1".."9"}
68,712, // "0"
69,391, // digit128
70,833, // {176..185}
77,625, // "("
  }
,
{ // state 555
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 556
10,732, // `}
12,251, // <decl in class>
13,144, // <method decl>
14,213, // `public
74,817, // "#"
80,15, // "}"
  }
,
{ // state 557
71,596, // ws
72,762, // " "
73,310, // {10}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 558
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 560
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
370, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
558, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
348, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 561
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
432, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
383, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
838, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
580, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 562
7,147, // ID
44,859, // <unary exp>
45,77, // <exp1>
46,562, // `-
47,318, // INTLIT
48,635, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,804, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
67,183, // {"1".."9"}
68,710, // "0"
69,393, // digit128
70,835, // {176..185}
81,844, // "-"
  }
,
{ // state 563
2,232, // ws*
71,559, // ws
72,491, // " "
73,819, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 564
7,149, // ID
44,856, // <unary exp>
45,64, // <exp1>
46,564, // `-
47,316, // INTLIT
48,637, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,803, // letter128
64,487, // {199..218 231..250}
65,487, // {193..198 225..230}
67,181, // {"1".."9"}
68,712, // "0"
69,391, // digit128
70,833, // {176..185}
81,844, // "-"
  }
,
{ // state 565
7,155, // ID
44,696, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
81,844, // "-"
  }
,
{ // state 566
2,311, // ws*
71,467, // ws
72,302, // " "
73,126, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 567
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 568
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 569
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 570
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 571
7,160, // ID
44,866, // <unary exp>
45,89, // <exp1>
46,571, // `-
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
81,844, // "-"
  }
,
{ // state 572
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 573
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 574
0x80000000|319, // match move
0x80000000|518, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 576
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 577
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 578
7,160, // ID
16,259, // `(
43,455, // <cast exp>
45,718, // <exp1>
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
77,625, // "("
  }
,
{ // state 579
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 580
2,539, // ws*
71,103, // ws
72,814, // " "
73,527, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 581
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 582
2,790, // ws*
71,640, // ws
72,479, // " "
73,861, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 583
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 584
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 585
23,MIN_REDUCTION+121, // `[
71,6, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 586
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 587
0x80000000|1, // match move
0x80000000|867, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 588
2,644, // ws*
71,468, // ws
72,278, // " "
73,165, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 589
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 590
59,401, // "e"
  }
,
{ // state 591
0x80000000|1, // match move
0x80000000|869, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 592
3,857, // <program>
4,627, // <class decl>+
5,716, // <class decl>
6,415, // `class
71,196, // ws
72,555, // " "
73,584, // {10}
74,549, // "#"
  }
,
{ // state 593
16,69, // `(
77,410, // "("
  }
,
{ // state 594
0x80000000|1, // match move
0x80000000|829, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 595
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 596
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 597
71,394, // ws
72,302, // " "
73,126, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 599
2,45, // ws*
71,721, // ws
72,666, // " "
73,654, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 600
23,MIN_REDUCTION+89, // `[
71,574, // ws
72,11, // " "
73,71, // {10}
83,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 601
23,MIN_REDUCTION+121, // `[
71,574, // ws
72,11, // " "
73,71, // {10}
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 602
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 603
71,234, // ws
72,756, // " "
73,572, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 605
27,812, // `;
85,124, // ";"
  }
,
{ // state 606
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 607
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 608
2,662, // ws*
23,MIN_REDUCTION+90, // `[
71,736, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 610
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 611
71,680, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 612
0x80000000|579, // match move
0x80000000|652, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 613
23,MIN_REDUCTION+121, // `[
71,30, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 614
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 616
23,MIN_REDUCTION+121, // `[
71,29, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 617
0x80000000|672, // match move
0x80000000|203, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 618
71,398, // ws
72,264, // " "
73,152, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 619
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 620
16,131, // `(
77,410, // "("
  }
,
{ // state 621
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 622
71,374, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 624
27,159, // `;
85,599, // ";"
  }
,
{ // state 625
2,603, // ws*
71,76, // ws
72,756, // " "
73,572, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 626
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 627
5,150, // <class decl>
6,415, // `class
74,549, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 628
61,759, // "t"
  }
,
{ // state 629
23,MIN_REDUCTION+91, // `[
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 630
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 631
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 632
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
37, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
809, // <stmt>
605, // <assign>
-1, // `;
501, // <local var decl>
871, // `if
392, // <exp>
-1, // `else
620, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 633
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 634
2,489, // ws*
71,349, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 635
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,684, // letter128
64,486, // {199..218 231..250}
65,486, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,531, // digit128
70,835, // {176..185}
86,98, // idChar*
87,210, // $$0
92,361, // idChar
93,802, // "_"
94,12, // idChar128
95,530, // {223}
  }
,
{ // state 636
99,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 637
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,682, // letter128
64,487, // {199..218 231..250}
65,487, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,534, // digit128
70,833, // {176..185}
86,96, // idChar*
87,209, // $$0
92,361, // idChar
93,802, // "_"
94,17, // idChar128
95,533, // {223}
  }
,
{ // state 638
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 639
23,MIN_REDUCTION+123, // `[
71,6, // ws
72,85, // " "
73,83, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 640
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 641
23,MIN_REDUCTION+119, // `[
83,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 642
2,106, // ws*
71,380, // ws
72,821, // " "
73,464, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 643
7,155, // ID
16,325, // `(
30,407, // <exp>
34,687, // <exp8>
35,216, // <exp7>
36,28, // <exp6>
37,26, // <exp5>
38,113, // <exp4>
40,285, // <exp3>
42,9, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 644
71,388, // ws
72,278, // " "
73,165, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 645
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 646
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 647
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 648
23,MIN_REDUCTION+44, // `[
83,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 649
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 651
8,561, // `{
79,582, // "{"
  }
,
{ // state 652
71,52, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 653
99,MIN_REDUCTION+47, // $NT
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 654
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 655
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 656
23,MIN_REDUCTION+123, // `[
71,29, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 657
8,314, // `{
11,794, // `extends
74,726, // "#"
79,694, // "{"
  }
,
{ // state 658
23,MIN_REDUCTION+123, // `[
71,30, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 659
23,MIN_REDUCTION+119, // `[
83,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 660
71,148, // ws
72,284, // " "
73,281, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 661
23,MIN_REDUCTION+119, // `[
83,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 662
0x80000000|1, // match move
0x80000000|223, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 663
0x80000000|371, // match move
0x80000000|704, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 664
2,300, // ws*
23,MIN_REDUCTION+122, // `[
71,75, // ws
72,11, // " "
73,71, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 665
23,MIN_REDUCTION+119, // `[
83,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 666
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 667
0x80000000|807, // match move
0x80000000|269, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 668
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 669
23,MIN_REDUCTION+102, // `[
83,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 670
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 671
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 672
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 673
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 674
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,692, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,525, // digit128
70,828, // {176..185}
86,86, // idChar*
87,202, // $$0
92,361, // idChar
93,802, // "_"
94,59, // idChar128
95,542, // {223}
  }
,
{ // state 675
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
36, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
719, // <stmt>
683, // <assign>
-1, // `;
23, // <local var decl>
157, // `if
392, // <exp>
-1, // `else
593, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 676
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 677
23,MIN_REDUCTION+46, // `[
83,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 678
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,49, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,49, // {176..185}
90,488, // hexDigit*
91,252, // $$2
96,798, // hexDigit
97,411, // hexDigit128
  }
,
{ // state 679
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 680
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 681
0x80000000|1, // match move
0x80000000|459, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 682
0x80000000|668, // match move
0x80000000|474, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 683
27,812, // `;
85,500, // ";"
  }
,
{ // state 684
0x80000000|668, // match move
0x80000000|478, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 685
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 686
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 687
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 688
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 689
0x80000000|1, // match move
0x80000000|306, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 690
0x80000000|1, // match move
0x80000000|303, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 691
7,160, // ID
16,259, // `(
30,449, // <exp>
34,771, // <exp8>
35,2, // <exp7>
36,235, // <exp6>
37,236, // <exp5>
38,48, // <exp4>
40,362, // <exp3>
42,40, // <exp2>
43,195, // <cast exp>
44,353, // <unary exp>
45,89, // <exp1>
46,571, // `-
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 692
0x80000000|668, // match move
0x80000000|462, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 693
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 694
2,31, // ws*
71,239, // ws
72,626, // " "
73,646, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 695
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 696
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 697
2,439, // ws*
71,380, // ws
72,821, // " "
73,464, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 698
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 699
7,155, // ID
16,325, // `(
30,466, // <exp>
34,687, // <exp8>
35,216, // <exp7>
36,28, // <exp6>
37,26, // <exp5>
38,113, // <exp4>
40,285, // <exp3>
42,9, // <exp2>
43,233, // <cast exp>
44,344, // <unary exp>
45,153, // <exp1>
46,565, // `-
47,322, // INTLIT
48,674, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,839, // letter128
64,497, // {199..218 231..250}
65,497, // {193..198 225..230}
67,205, // {"1".."9"}
68,730, // "0"
69,397, // digit128
70,828, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 700
7,160, // ID
16,259, // `(
30,421, // <exp>
34,771, // <exp8>
35,2, // <exp7>
36,235, // <exp6>
37,236, // <exp5>
38,48, // <exp4>
40,362, // <exp3>
42,40, // <exp2>
43,195, // <cast exp>
44,353, // <unary exp>
45,89, // <exp1>
46,571, // `-
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 701
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 702
71,680, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 703
0x80000000|403, // match move
0x80000000|8, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 704
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 705
23,MIN_REDUCTION+40, // `[
33,MIN_REDUCTION+40, // `=
39,MIN_REDUCTION+40, // `+
41,MIN_REDUCTION+40, // `*
75,MIN_REDUCTION+40, // "+"
76,MIN_REDUCTION+40, // "*"
82,MIN_REDUCTION+40, // "="
83,MIN_REDUCTION+40, // "["
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 706
0x80000000|238, // match move
0x80000000|212, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 707
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 708
7,160, // ID
16,259, // `(
30,412, // <exp>
34,771, // <exp8>
35,2, // <exp7>
36,235, // <exp6>
37,236, // <exp5>
38,48, // <exp4>
40,362, // <exp3>
42,40, // <exp2>
43,195, // <cast exp>
44,353, // <unary exp>
45,89, // <exp1>
46,571, // `-
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 709
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 710
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,175, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,175, // {176..185}
90,541, // hexDigit*
91,267, // $$2
96,798, // hexDigit
97,503, // hexDigit128
  }
,
{ // state 711
71,377, // ws
72,463, // " "
73,638, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 712
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,171, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,171, // {176..185}
90,543, // hexDigit*
91,270, // $$2
96,798, // hexDigit
97,494, // hexDigit128
  }
,
{ // state 713
7,160, // ID
16,259, // `(
30,417, // <exp>
34,771, // <exp8>
35,2, // <exp7>
36,235, // <exp6>
37,236, // <exp5>
38,48, // <exp4>
40,362, // <exp3>
42,40, // <exp2>
43,195, // <cast exp>
44,353, // <unary exp>
45,89, // <exp1>
46,571, // `-
47,305, // INTLIT
48,512, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,784, // letter128
64,471, // {199..218 231..250}
65,471, // {193..198 225..230}
67,151, // {"1".."9"}
68,678, // "0"
69,378, // digit128
70,846, // {176..185}
77,625, // "("
81,844, // "-"
  }
,
{ // state 714
71,333, // ws
72,653, // " "
73,227, // {10}
99,MIN_REDUCTION+85, // $NT
  }
,
{ // state 715
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 716
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 717
0x80000000|1, // match move
0x80000000|188, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 718
0x80000000|1, // match move
0x80000000|327, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 719
0x80000000|386, // match move
0x80000000|8, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 720
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 721
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 722
2,618, // ws*
71,485, // ws
72,264, // " "
73,152, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 723
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 724
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 725
9,556, // <decl in class>*
10,508, // `}
12,430, // <decl in class>
13,144, // <method decl>
14,213, // `public
74,817, // "#"
80,15, // "}"
  }
,
{ // state 726
59,90, // "e"
  }
,
{ // state 727
0x80000000|1, // match move
0x80000000|822, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 728
2,717, // ws*
  }
,
{ // state 729
0x80000000|1, // match move
0x80000000|820, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 730
49,698, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,698, // "p"
51,698, // "v"
52,698, // "c"
53,698, // "i"
54,698, // "l"
55,698, // "o"
56,698, // "u"
57,698, // "x"
58,698, // "b"
59,698, // "e"
60,698, // "h"
61,698, // "t"
62,698, // "w"
65,182, // {193..198 225..230}
67,698, // {"1".."9"}
68,698, // "0"
70,182, // {176..185}
90,550, // hexDigit*
91,260, // $$2
96,798, // hexDigit
97,482, // hexDigit128
  }
,
{ // state 731
71,MIN_REDUCTION+120, // ws
72,MIN_REDUCTION+120, // " "
73,MIN_REDUCTION+120, // {10}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 732
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 733
24,484, // `]
84,405, // "]"
  }
,
{ // state 734
2,154, // ws*
71,824, // ws
72,32, // " "
73,609, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 735
2,633, // ws*
  }
,
{ // state 736
0x80000000|1, // match move
0x80000000|567, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 737
2,631, // ws*
  }
,
{ // state 738
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 739
2,667, // ws*
71,349, // ws
72,61, // " "
73,767, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 740
2,62, // ws*
71,167, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 741
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 742
2,622, // ws*
71,514, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 743
0x80000000|1, // match move
0x80000000|570, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 744
71,680, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 745
0x80000000|1, // match move
0x80000000|577, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 746
2,837, // ws*
71,380, // ws
72,821, // " "
73,464, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 747
74,590, // "#"
  }
,
{ // state 748
0x80000000|1, // match move
0x80000000|575, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 749
2,681, // ws*
  }
,
{ // state 750
56,416, // "u"
  }
,
{ // state 751
2,185, // ws*
71,715, // ws
72,115, // " "
73,133, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 752
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
37, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
187, // <stmt>
605, // <assign>
-1, // `;
501, // <local var decl>
871, // `if
392, // <exp>
-1, // `else
620, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 753
53,114, // "i"
58,337, // "b"
62,387, // "w"
75,253, // "+"
  }
,
{ // state 754
0x80000000|1, // match move
0x80000000|796, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 755
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 756
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 757
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 758
0x80000000|1, // match move
0x80000000|286, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 759
2,164, // ws*
71,167, // ws
72,773, // " "
73,544, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 760
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|658, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 762
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 763
71,375, // ws
72,243, // " "
73,191, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 764
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 765
0x80000000|1, // match move
0x80000000|656, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 766
2,765, // ws*
  }
,
{ // state 767
0x80000000|217, // match move
0x80000000|477, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 768
0x80000000|1, // match move
0x80000000|639, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 769
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 770
2,761, // ws*
  }
,
{ // state 771
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 772
71,394, // ws
72,302, // " "
73,126, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 773
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 774
2,768, // ws*
  }
,
{ // state 775
0x80000000|1, // match move
0x80000000|858, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 776
2,662, // ws*
  }
,
{ // state 777
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 778
0x80000000|668, // match move
0x80000000|493, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 779
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 780
23,MIN_REDUCTION+44, // `[
83,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 781
0x80000000|602, // match move
0x80000000|779, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 782
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 783
33,44, // `=
82,791, // "="
  }
,
{ // state 784
0x80000000|776, // match move
0x80000000|608, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 785
0x80000000|1, // match move
0x80000000|613, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 786
23,MIN_REDUCTION+44, // `[
83,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 787
0x80000000|1, // match move
0x80000000|616, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 788
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 789
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 790
71,526, // ws
72,479, // " "
73,861, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 791
2,249, // ws*
71,207, // ws
72,655, // " "
73,673, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 792
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 793
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 794
7,54, // ID
48,273, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,864, // letter128
64,724, // {199..218 231..250}
65,724, // {193..198 225..230}
  }
,
{ // state 795
0x80000000|1, // match move
0x80000000|585, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 796
23,MIN_REDUCTION+125, // `[
71,38, // ws
72,110, // " "
73,21, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 797
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 798
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 799
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 800
17,282, // `)
78,389, // ")"
  }
,
{ // state 801
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 802
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 803
0x80000000|735, // match move
0x80000000|546, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 804
0x80000000|737, // match move
0x80000000|548, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 805
0x80000000|176, // match move
0x80000000|492, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 806
23,MIN_REDUCTION+91, // `[
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 807
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 808
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 809
0x80000000|769, // match move
0x80000000|621, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 810
23,MIN_REDUCTION+91, // `[
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 811
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,372, // letter128
64,132, // {199..218 231..250}
65,132, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,805, // digit128
70,108, // {176..185}
86,34, // idChar*
87,663, // $$0
92,361, // idChar
93,802, // "_"
94,422, // idChar128
95,390, // {223}
  }
,
{ // state 812
0x80000000|685, // match move
0x80000000|46, // no-match move
0x80000000|747, // NT-test-match state for `else
  }
,
{ // state 813
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 814
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 815
23,MIN_REDUCTION+91, // `[
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 816
23,MIN_REDUCTION+91, // `[
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 817
50,750, // "p"
  }
,
{ // state 818
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 819
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 820
23,MIN_REDUCTION+125, // `[
71,30, // ws
72,97, // " "
73,107, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 821
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 822
23,MIN_REDUCTION+125, // `[
71,29, // ws
72,95, // " "
73,111, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 823
2,3, // ws*
71,723, // ws
72,100, // " "
73,141, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 824
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 825
23,MIN_REDUCTION+97, // `[
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 826
2,292, // ws*
71,707, // ws
72,463, // " "
73,638, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 827
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 828
0x80000000|498, // match move
0x80000000|220, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 829
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 830
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 831
7,473, // ID
48,408, // letter
49,535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,535, // "p"
51,535, // "v"
52,535, // "c"
53,535, // "i"
54,535, // "l"
55,535, // "o"
56,535, // "u"
57,535, // "x"
58,535, // "b"
59,535, // "e"
60,535, // "h"
61,535, // "t"
62,535, // "w"
63,742, // letter128
64,676, // {199..218 231..250}
65,676, // {193..198 225..230}
  }
,
{ // state 832
0x80000000|766, // match move
0x80000000|146, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 833
0x80000000|498, // match move
0x80000000|230, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 834
2,612, // ws*
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 835
0x80000000|498, // match move
0x80000000|228, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 836
0x80000000|770, // match move
0x80000000|143, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 837
71,47, // ws
72,821, // " "
73,464, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 838
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 839
0x80000000|728, // match move
0x80000000|528, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 840
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 841
0x80000000|774, // match move
0x80000000|161, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 842
23,MIN_REDUCTION+46, // `[
83,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 843
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 844
2,660, // ws*
71,229, // ws
72,284, // " "
73,281, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 845
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 846
0x80000000|498, // match move
0x80000000|677, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 847
23,MIN_REDUCTION+97, // `[
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 848
23,MIN_REDUCTION+97, // `[
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 849
48,450, // letter
49,50, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,50, // "p"
51,50, // "v"
52,50, // "c"
53,50, // "i"
54,50, // "l"
55,50, // "o"
56,50, // "u"
57,50, // "x"
58,50, // "b"
59,50, // "e"
60,50, // "h"
61,50, // "t"
62,50, // "w"
63,615, // letter128
64,438, // {199..218 231..250}
65,438, // {193..198 225..230}
66,197, // digit
67,168, // {"1".."9"}
68,168, // "0"
69,293, // digit128
70,423, // {176..185}
87,179, // $$0
92,827, // idChar
93,802, // "_"
94,547, // idChar128
95,465, // {223}
  }
,
{ // state 850
0x80000000|368, // match move
0x80000000|600, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 851
71,112, // ws
72,655, // " "
73,673, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 852
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 853
16,516, // `(
77,410, // "("
  }
,
{ // state 854
0x80000000|749, // match move
0x80000000|121, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 855
23,MIN_REDUCTION+97, // `[
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 856
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 857
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 858
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 859
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 860
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
37, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
781, // <stmt>
605, // <assign>
-1, // `;
501, // <local var decl>
871, // `if
392, // <exp>
-1, // `else
620, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
-1, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 861
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 862
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 863
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 864
2,772, // ws*
71,467, // ws
72,302, // " "
73,126, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 865
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
177, // ID
470, // `{
-1, // <decl in class>*
370, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
352, // `(
-1, // `)
-1, // <stmt>*
142, // <type>
604, // `int
606, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
558, // <stmt>
624, // <assign>
-1, // `;
277, // <local var decl>
853, // `if
392, // <exp>
-1, // `else
67, // `while
-1, // `=
755, // <exp8>
226, // <exp7>
14, // <exp6>
19, // <exp5>
70, // <exp4>
-1, // `+
326, // <exp3>
-1, // `*
56, // <exp2>
172, // <cast exp>
331, // <unary exp>
64, // <exp1>
564, // `-
316, // INTLIT
811, // letter
535, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
535, // "p"
535, // "v"
535, // "c"
535, // "i"
535, // "l"
535, // "o"
535, // "u"
535, // "x"
535, // "b"
535, // "e"
535, // "h"
535, // "t"
535, // "w"
262, // letter128
132, // {199..218 231..250}
132, // {193..198 225..230}
-1, // digit
181, // {"1".."9"}
712, // "0"
391, // digit128
833, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
753, // "#"
-1, // "+"
-1, // "*"
625, // "("
-1, // ")"
582, // "{"
706, // "}"
844, // "-"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 866
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 867
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 868
2,309, // ws*
71,514, // ws
72,245, // " "
73,192, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 869
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 870
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 871
16,643, // `(
77,410, // "("
  }
,
{ // state 872
24,373, // `]
84,296, // "]"
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[873][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <class decl> ::= `class ID `extends ID `{ <decl in class>* `}
(5<<16)+7,
// <class decl> ::= `class ID `extends ID `{ `}
(5<<16)+6,
// <decl in class> ::= <method decl>
(12<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(13<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(13<<16)+7,
// <type> ::= `int
(19<<16)+1,
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= ID
(19<<16)+1,
// <type> ::= <type> <empty bracket pair>
(19<<16)+2,
// <empty bracket pair> ::= `[ `]
(22<<16)+2,
// <stmt> ::= <assign> `;
(25<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(25<<16)+3,
// <stmt> ::= `{ `}
(25<<16)+2,
// <stmt> ::= <local var decl> `;
(25<<16)+2,
// <stmt> ::= `if `( <exp> `) <stmt> !`else
(25<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(25<<16)+7,
// <stmt> ::= `while `( <exp> `) <stmt>
(25<<16)+5,
// <assign> ::= <exp> `= <exp>
(26<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(28<<16)+4,
// <exp> ::= <exp8>
(30<<16)+1,
// <exp8> ::= <exp7>
(34<<16)+1,
// <exp7> ::= <exp6>
(35<<16)+1,
// <exp6> ::= <exp5>
(36<<16)+1,
// <exp5> ::= <exp4>
(37<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(38<<16)+3,
// <exp4> ::= <exp3>
(38<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(40<<16)+3,
// <exp3> ::= <exp2>
(40<<16)+1,
// <exp2> ::= <cast exp>
(42<<16)+1,
// <exp2> ::= <unary exp>
(42<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(43<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(43<<16)+4,
// <unary exp> ::= `- <unary exp>
(44<<16)+2,
// <unary exp> ::= <exp1>
(44<<16)+1,
// <exp1> ::= ID
(45<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(45<<16)+4,
// <exp1> ::= INTLIT
(45<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(48<<16)+1,
// letter128 ::= {193..218 225..250}
(63<<16)+1,
// digit ::= {"0".."9"}
(66<<16)+1,
// digit128 ::= {176..185}
(69<<16)+1,
// ws ::= " "
(71<<16)+1,
// ws ::= {10}
(71<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(21<<16)+4,
// `boolean ::= "#" "b" "o"
(21<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `extends ::= "#" "e" "x" ws*
(11<<16)+4,
// `extends ::= "#" "e" "x"
(11<<16)+3,
// `void ::= "#" "v" "o" ws*
(15<<16)+4,
// `void ::= "#" "v" "o"
(15<<16)+3,
// `int ::= "#" "i" "t" ws*
(20<<16)+4,
// `int ::= "#" "i" "t"
(20<<16)+3,
// `while ::= "#" "w" "h" ws*
(32<<16)+4,
// `while ::= "#" "w" "h"
(32<<16)+3,
// `if ::= "#" "+" ws*
(29<<16)+3,
// `if ::= "#" "+"
(29<<16)+2,
// `else ::= "#" "e" "l" ws*
(31<<16)+4,
// `else ::= "#" "e" "l"
(31<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `* ::= "*" ws*
(41<<16)+2,
// `* ::= "*"
(41<<16)+1,
// `( ::= "(" ws*
(16<<16)+2,
// `( ::= "("
(16<<16)+1,
// `) ::= ")" ws*
(17<<16)+2,
// `) ::= ")"
(17<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(46<<16)+2,
// `- ::= "-"
(46<<16)+1,
// `+ ::= "+" ws*
(39<<16)+2,
// `+ ::= "+"
(39<<16)+1,
// `= ::= "=" ws*
(33<<16)+2,
// `= ::= "="
(33<<16)+1,
// `[ ::= "[" ws*
(23<<16)+2,
// `[ ::= "["
(23<<16)+1,
// `] ::= "]" ws*
(24<<16)+2,
// `] ::= "]"
(24<<16)+1,
// `; ::= ";" ws*
(27<<16)+2,
// `; ::= ";"
(27<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(47<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(47<<16)+2,
// INTLIT ::= digit128 ws*
(47<<16)+2,
// INTLIT ::= digit128
(47<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(47<<16)+3,
// INTLIT ::= "0" $$2
(47<<16)+2,
// idChar ::= letter
(92<<16)+1,
// idChar ::= digit
(92<<16)+1,
// idChar ::= "_"
(92<<16)+1,
// idChar128 ::= letter128
(94<<16)+1,
// idChar128 ::= digit128
(94<<16)+1,
// idChar128 ::= {223}
(94<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(96<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(97<<16)+1,
// digit* ::= digit* digit
(88<<16)+2,
// digit* ::= digit
(88<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(90<<16)+2,
// hexDigit* ::= hexDigit
(90<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(86<<16)+2,
// idChar* ::= idChar
(86<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(87<<16)+2,
// $$0 ::= idChar128
(87<<16)+1,
// $$1 ::= digit128 ws*
(89<<16)+2,
// $$1 ::= digit128
(89<<16)+1,
// $$2 ::= hexDigit128 ws*
(91<<16)+2,
// $$2 ::= hexDigit128
(91<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
-1, // 9
73, // 10
-1, // 11
-1, // 12
-1, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
72, // " "
-1, // "!"
-1, // '"'
74, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
77, // "("
78, // ")"
76, // "*"
75, // "+"
-1, // ","
81, // "-"
-1, // "."
-1, // "/"
68, // "0"
67, // "1"
67, // "2"
67, // "3"
67, // "4"
67, // "5"
67, // "6"
67, // "7"
67, // "8"
67, // "9"
-1, // ":"
85, // ";"
-1, // "<"
82, // "="
-1, // ">"
-1, // "?"
-1, // "@"
49, // "A"
49, // "B"
49, // "C"
49, // "D"
49, // "E"
49, // "F"
49, // "G"
49, // "H"
49, // "I"
49, // "J"
49, // "K"
49, // "L"
49, // "M"
49, // "N"
49, // "O"
49, // "P"
49, // "Q"
49, // "R"
49, // "S"
49, // "T"
49, // "U"
49, // "V"
49, // "W"
49, // "X"
49, // "Y"
49, // "Z"
83, // "["
-1, // "\"
84, // "]"
-1, // "^"
93, // "_"
-1, // "`"
49, // "a"
58, // "b"
52, // "c"
49, // "d"
59, // "e"
49, // "f"
49, // "g"
60, // "h"
53, // "i"
49, // "j"
49, // "k"
54, // "l"
49, // "m"
49, // "n"
55, // "o"
50, // "p"
49, // "q"
49, // "r"
49, // "s"
61, // "t"
56, // "u"
51, // "v"
62, // "w"
57, // "x"
49, // "y"
49, // "z"
79, // "{"
-1, // "|"
80, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
70, // 176
70, // 177
70, // 178
70, // 179
70, // 180
70, // 181
70, // 182
70, // 183
70, // 184
70, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
65, // 193
65, // 194
65, // 195
65, // 196
65, // 197
65, // 198
64, // 199
64, // 200
64, // 201
64, // 202
64, // 203
64, // 204
64, // 205
64, // 206
64, // 207
64, // 208
64, // 209
64, // 210
64, // 211
64, // 212
64, // 213
64, // 214
64, // 215
64, // 216
64, // 217
64, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
95, // 223
-1, // 224
65, // 225
65, // 226
65, // 227
65, // 228
65, // 229
65, // 230
64, // 231
64, // 232
64, // 233
64, // 234
64, // 235
64, // 236
64, // 237
64, // 238
64, // 239
64, // 240
64, // 241
64, // 242
64, // 243
64, // 244
64, // 245
64, // 246
64, // 247
64, // 248
64, // 249
64, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"", // 2
"", // 3
"", // 4
"", // 5
"", // 6
"", // 7
"", // 8
"", // 9
"", // 10
"", // 11
"", // 12
"", // 13
"", // 14
"", // 15
"", // 16
"", // 17
"", // 18
"", // 19
"", // 20
"", // 21
"", // 22
"", // 23
"", // 24
"", // 25
"", // 26
"", // 27
"", // 28
"", // 29
"", // 30
"", // 31
"", // 32
"", // 33
"", // 34
"", // 35
"", // 36
"", // 37
"", // 38
"", // 39
"", // 40
"", // 41
"", // 42
"", // 43
"", // 44
"", // 45
"", // 46
"", // 47
"", // 48
"", // 49
"", // 50
"", // 51
"", // 52
"", // 53
"", // 54
"", // 55
"", // 56
"", // 57
"", // 58
"", // 59
"", // 60
"", // 61
"", // 62
"", // 63
"", // 64
"", // 65
"", // 66
"", // 67
"", // 68
"", // 69
"", // 70
"", // 71
"", // 72
"", // 73
"", // 74
"", // 75
"", // 76
"", // 77
"", // 78
"", // 79
"", // 80
"", // 81
"", // 82
"", // 83
"", // 84
"", // 85
"", // 86
"", // 87
"", // 88
"", // 89
"", // 90
"", // 91
"", // 92
"", // 93
"", // 94
"", // 95
"", // 96
"", // 97
"", // 98
"", // 99
"", // 100
"", // 101
"", // 102
"", // 103
"", // 104
"", // 105
"", // 106
"digit* ::= digit* digit", // 107
"digit* ::= digit* digit", // 108
"<decl in class>* ::= <decl in class>* <decl in class>", // 109
"<decl in class>* ::= <decl in class>* <decl in class>", // 110
"hexDigit* ::= hexDigit* hexDigit", // 111
"hexDigit* ::= hexDigit* hexDigit", // 112
"<stmt>* ::= <stmt>* <stmt>", // 113
"<stmt>* ::= <stmt>* <stmt>", // 114
"idChar* ::= idChar* idChar", // 115
"idChar* ::= idChar* idChar", // 116
"<class decl>+ ::= <class decl>", // 117
"<class decl>+ ::= <class decl>+ <class decl>", // 118
"ws* ::= ws* ws", // 119
"ws* ::= ws* ws", // 120
"", // 121
"", // 122
"", // 123
"", // 124
"", // 125
"", // 126
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <class decl> ::= `class [#] ID `extends ID `{ <decl in class>* `} @creatClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @creatClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 14: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 16: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 17: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 18: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 20: <stmt> ::= `if [#] `( <exp> `) <stmt> !`else @if_no_else_maker(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <stmt> ::= `if [#] `( <exp> `) <stmt> `else <stmt> @if_maker(int,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <stmt> ::= `while [#] `( <exp> `) <stmt> @while_maker(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 31: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 33: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 37: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 38: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 39: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 41: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 42: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 43: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 45: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 46: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 47: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 48: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 49: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `while ::= "#" "w" "h" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 62: `if ::= "#" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 63: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `else ::= "#" "e" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 90: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 91: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 92: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 93: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 94: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 95: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 96: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 97: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 98: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 99: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 100: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 101: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 105: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 106: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 107: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 108: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 109: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 110: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 111: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 112: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 113: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 114: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 115: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 116: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 117: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 118: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 119: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 120: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 121: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 122: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 123: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 124: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 125: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 126: $$2 ::= hexDigit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      String parm2 = (String)si.popPb();
      List<Decl> parm3 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.creatClassDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.if_no_else_maker(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.if_maker(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.while_maker(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"ClassDecl creatClassDecl(int,String,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement if_no_else_maker(int,Exp,Statement)",
"Statement if_maker(int,Exp,Statement,Statement)",
"Statement while_maker(int,Exp,Statement)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
4,1,
3,1,
1,1,
1,1,
2,1,
3,1,
2,1,
3,1,
4,1,
3,1,
3,1,
4,1,
3,1,
3,1,
3,1,
2,1,
2,1,
3,1,
2,1,
1,1,
3,1,
1,1,
3,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    1,
    1,
    1,
    0,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    -1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
