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
private static final int MIN_REDUCTION = 1032;
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
1,480, // <start>
2,703, // ws*
3,688, // <program>
4,746, // <class decl>+
5,843, // <class decl>
6,492, // `class
71,282, // ws
72,657, // " "
73,692, // {10}
74,649, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 3
71,768, // ws
72,122, // " "
73,167, // {10}
MIN_REDUCTION+80, // (default reduction)
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
210, // ID
557, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
672, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
0x80000000|507, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,853, // letter128
64,644, // {199..218 231..250}
65,644, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,658, // digit128
70,941, // {176..185}
87,435, // $$0
92,978, // idChar
93,949, // "_"
94,272, // idChar128
95,678, // {223}
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|785, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
2,521, // ws*
71,662, // ws
72,580, // " "
73,970, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 12
99,MIN_REDUCTION+38, // $NT
  }
,
{ // state 13
0x80000000|73, // match move
0x80000000|579, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
0x80000000|338, // match move
0x80000000|322, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 17
2,83, // ws*
71,500, // ws
72,901, // " "
73,284, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 19
0x80000000|336, // match move
0x80000000|318, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 22
2,1002, // ws*
23,MIN_REDUCTION+91, // `[
71,90, // ws
72,13, // " "
73,85, // {10}
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 23
0x80000000|1, // match move
0x80000000|732, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 24
23,MIN_REDUCTION+99, // `[
83,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 25
27,309, // `;
85,589, // ";"
  }
,
{ // state 26
23,MIN_REDUCTION+99, // `[
83,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 28
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 29
23,MIN_REDUCTION+99, // `[
83,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 31
23,MIN_REDUCTION+105, // `[
83,MIN_REDUCTION+105, // "["
99,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 32
0x80000000|1, // match move
0x80000000|778, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
0x80000000|1, // match move
0x80000000|781, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 34
23,MIN_REDUCTION+126, // `[
71,257, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+126, // "["
99,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 35
71,453, // ws
72,745, // " "
73,765, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 38
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,436, // letter128
64,155, // {199..218 231..250}
65,155, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,952, // digit128
70,132, // {176..185}
87,568, // $$0
92,978, // idChar
93,949, // "_"
94,502, // idChar128
95,462, // {223}
  }
,
{ // state 39
23,866, // `[
83,696, // "["
  }
,
{ // state 40
99,MIN_REDUCTION+48, // $NT
  }
,
{ // state 41
2,1009, // ws*
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 42
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
335, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
663, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
989, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
407, // "}"
996, // "-"
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
{ // state 43
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
335, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
1022, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
989, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
830, // "}"
996, // "-"
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
{ // state 44
0x80000000|1, // match move
0x80000000|760, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 45
24,585, // `]
84,666, // "]"
  }
,
{ // state 46
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 48
0x80000000|1, // match move
0x80000000|524, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 49
0x80000000|1, // match move
0x80000000|526, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 50
7,175, // ID
16,416, // `(
30,737, // <exp>
34,892, // <exp8>
35,259, // <exp7>
36,20, // <exp6>
37,18, // <exp5>
38,115, // <exp4>
40,383, // <exp3>
42,68, // <exp2>
43,203, // <cast exp>
44,391, // <unary exp>
45,92, // <exp1>
46,665, // `-
47,372, // INTLIT
48,754, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,951, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
67,217, // {"1".."9"}
68,834, // "0"
69,465, // digit128
70,986, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 51
71,956, // ws
72,786, // " "
73,773, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 54
39,422, // `+
75,974, // "+"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 55
0x80000000|674, // match move
0x80000000|344, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 56
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 58
99,MIN_REDUCTION+29, // $NT
  }
,
{ // state 59
0x80000000|388, // match move
0x80000000|588, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 60
23,MIN_REDUCTION+99, // `[
83,MIN_REDUCTION+99, // "["
99,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 61
99,MIN_REDUCTION+28, // $NT
  }
,
{ // state 62
7,187, // ID
16,384, // `(
30,946, // <exp>
34,810, // <exp8>
35,252, // <exp7>
36,30, // <exp6>
37,28, // <exp5>
38,137, // <exp4>
40,331, // <exp3>
42,10, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 63
8,857, // `{
79,817, // "{"
  }
,
{ // state 64
2,525, // ws*
71,662, // ws
72,580, // " "
73,970, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 66
71,679, // ws
72,255, // " "
73,277, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 67
41,373, // `*
76,886, // "*"
99,MIN_REDUCTION+31, // $NT
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 69
0x80000000|621, // match move
0x80000000|376, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
0x80000000|334, // match move
0x80000000|702, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 71
0x80000000|347, // match move
0x80000000|341, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 72
99,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 74
0x80000000|40, // match move
0x80000000|851, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 75
0x80000000|618, // match move
0x80000000|468, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 76
71,803, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|953, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 78
0x80000000|1, // match move
0x80000000|612, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 79
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 81
0x80000000|112, // match move
0x80000000|450, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
0x80000000|485, // match move
0x80000000|790, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 83
71,94, // ws
72,901, // " "
73,284, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 84
39,400, // `+
75,974, // "+"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 85
0x80000000|764, // match move
0x80000000|207, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 86
23,MIN_REDUCTION+126, // `[
71,7, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 87
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
99,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 88
0x80000000|1, // match move
0x80000000|965, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
0x80000000|1, // match move
0x80000000|967, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 90
0x80000000|723, // match move
0x80000000|411, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|595, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 93
99,MIN_REDUCTION+92, // $NT
  }
,
{ // state 94
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 95
0x80000000|690, // match move
0x80000000|498, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 96
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,916, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,613, // digit128
70,998, // {176..185}
87,77, // $$0
92,978, // idChar
93,949, // "_"
94,114, // idChar128
95,735, // {223}
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|958, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
0x80000000|519, // match move
0x80000000|174, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 99
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,733, // letter128
64,522, // {199..218 231..250}
65,522, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,340, // digit128
70,503, // {176..185}
86,1001, // idChar*
87,634, // $$0
92,423, // idChar
93,949, // "_"
94,647, // idChar128
95,552, // {223}
  }
,
{ // state 100
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 101
0x80000000|1, // match move
0x80000000|691, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
41,346, // `*
76,886, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 103
17,MIN_REDUCTION+120, // `)
78,MIN_REDUCTION+120, // ")"
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|241, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 105
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,815, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,619, // digit128
70,979, // {176..185}
87,97, // $$0
92,978, // idChar
93,949, // "_"
94,71, // idChar128
95,641, // {223}
  }
,
{ // state 106
41,354, // `*
76,886, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 107
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|655, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
99,MIN_REDUCTION+34, // $NT
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 110
57,761, // "x"
  }
,
{ // state 111
2,826, // ws*
71,200, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 112
99,MIN_REDUCTION+86, // $NT
  }
,
{ // state 113
0x80000000|1, // match move
0x80000000|653, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 114
0x80000000|321, // match move
0x80000000|432, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
39,410, // `+
75,974, // "+"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 116
0x80000000|1, // match move
0x80000000|236, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
17,443, // `)
78,461, // ")"
  }
,
{ // state 118
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,805, // letter128
64,575, // {199..218 231..250}
65,575, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,632, // digit128
70,984, // {176..185}
87,89, // $$0
92,978, // idChar
93,949, // "_"
94,19, // idChar128
95,631, // {223}
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|234, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,807, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,629, // digit128
70,986, // {176..185}
87,88, // $$0
92,978, // idChar
93,949, // "_"
94,14, // idChar128
95,628, // {223}
  }
,
{ // state 121
23,MIN_REDUCTION+45, // `[
83,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 123
99,MIN_REDUCTION+96, // $NT
  }
,
{ // state 124
2,1002, // ws*
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 127
41,342, // `*
76,886, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 128
71,59, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 129
71,53, // ws
72,972, // " "
73,551, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 130
2,994, // ws*
99,MIN_REDUCTION+123, // $NT
  }
,
{ // state 131
0x80000000|1, // match move
0x80000000|697, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 132
0x80000000|872, // match move
0x80000000|993, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
17,770, // `)
78,478, // ")"
  }
,
{ // state 134
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
0x80000000|1, // match move
0x80000000|694, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 136
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 137
39,380, // `+
75,974, // "+"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 138
61,64, // "t"
  }
,
{ // state 139
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 140
23,MIN_REDUCTION+45, // `[
83,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 141
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
616, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
661, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
472, // "}"
996, // "-"
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
{ // state 142
23,MIN_REDUCTION+95, // `[
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 143
17,798, // `)
78,461, // ")"
  }
,
{ // state 144
0x80000000|427, // match move
0x80000000|195, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 145
2,804, // ws*
23,MIN_REDUCTION+125, // `[
71,870, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 146
0x80000000|430, // match move
0x80000000|196, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 147
41,299, // `*
76,886, // "*"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 148
0x80000000|333, // match move
0x80000000|753, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 149
2,350, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 151
2,5, // ws*
23,MIN_REDUCTION+87, // `[
71,878, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|387, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 153
2,225, // ws*
  }
,
{ // state 154
0x80000000|1, // match move
0x80000000|389, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 155
0x80000000|802, // match move
0x80000000|767, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 156
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 157
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,253, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,253, // {176..185}
90,667, // hexDigit*
91,367, // $$2
96,943, // hexDigit
97,640, // hexDigit128
  }
,
{ // state 158
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 160
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,825, // letter128
64,793, // {199..218 231..250}
65,793, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,942, // digit128
70,742, // {176..185}
86,202, // idChar*
87,709, // $$0
92,423, // idChar
93,949, // "_"
94,298, // idChar128
95,682, // {223}
  }
,
{ // state 161
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 162
23,MIN_REDUCTION+95, // `[
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 163
7,187, // ID
16,384, // `(
30,570, // <exp>
34,810, // <exp8>
35,252, // <exp7>
36,30, // <exp6>
37,28, // <exp5>
38,137, // <exp4>
40,331, // <exp3>
42,10, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 164
23,MIN_REDUCTION+95, // `[
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 165
0x80000000|1, // match move
0x80000000|406, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 168
7,923, // ID
22,224, // <empty bracket pair>
23,45, // `[
48,509, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,852, // letter128
64,809, // {199..218 231..250}
65,809, // {193..198 225..230}
83,696, // "["
  }
,
{ // state 169
2,898, // ws*
23,MIN_REDUCTION+125, // `[
71,883, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 171
0x80000000|153, // match move
0x80000000|235, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
2,902, // ws*
23,MIN_REDUCTION+125, // `[
71,880, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 173
99,MIN_REDUCTION+99, // $NT
  }
,
{ // state 174
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
99,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 175
0x80000000|1, // match move
0x80000000|528, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
23,MIN_REDUCTION+96, // `[
71,257, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+96, // "["
99,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 178
0x80000000|1, // match move
0x80000000|532, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 181
66,981, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,1010, // digit128
70,998, // {176..185}
88,440, // digit*
89,382, // $$1
  }
,
{ // state 182
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 183
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
71,80, // ws
72,36, // " "
73,725, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 185
0x80000000|720, // match move
0x80000000|948, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 186
23,MIN_REDUCTION+95, // `[
83,MIN_REDUCTION+95, // "["
99,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 187
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
2,256, // ws*
71,303, // ws
72,899, // " "
73,362, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 189
16,62, // `(
77,487, // "("
  }
,
{ // state 190
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 192
0x80000000|12, // match move
0x80000000|496, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 193
0x80000000|1, // match move
0x80000000|518, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 194
2,905, // ws*
23,MIN_REDUCTION+125, // `[
71,878, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+125, // "["
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 195
2,49, // ws*
23,MIN_REDUCTION+87, // `[
71,880, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 196
2,48, // ws*
23,MIN_REDUCTION+87, // `[
71,883, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 197
71,803, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 199
0x80000000|1, // match move
0x80000000|364, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 200
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 202
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,825, // letter128
64,793, // {199..218 231..250}
65,793, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,942, // digit128
70,742, // {176..185}
87,513, // $$0
92,978, // idChar
93,949, // "_"
94,298, // idChar128
95,682, // {223}
  }
,
{ // state 203
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 204
0x80000000|674, // match move
0x80000000|329, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 205
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 207
23,MIN_REDUCTION+49, // `[
83,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 208
0x80000000|674, // match move
0x80000000|326, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 209
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 210
0x80000000|876, // match move
0x80000000|829, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 211
71,392, // ws
72,772, // " "
73,266, // {10}
99,MIN_REDUCTION+64, // $NT
  }
,
{ // state 212
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 213
99,MIN_REDUCTION+27, // $NT
  }
,
{ // state 214
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 215
66,981, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,983, // digit128
70,984, // {176..185}
88,531, // digit*
89,402, // $$1
  }
,
{ // state 216
0x80000000|674, // match move
0x80000000|508, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 217
66,981, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,987, // digit128
70,986, // {176..185}
88,527, // digit*
89,399, // $$1
  }
,
{ // state 218
23,MIN_REDUCTION+105, // `[
83,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 219
71,749, // ws
72,139, // " "
73,156, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 220
23,MIN_REDUCTION+105, // `[
83,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 221
0x80000000|511, // match move
0x80000000|9, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 222
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
99,MIN_REDUCTION+47, // $NT
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 223
23,MIN_REDUCTION+90, // `[
71,7, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 225
0x80000000|1, // match move
0x80000000|556, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 228
23,MIN_REDUCTION+90, // `[
71,32, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 233
51,529, // "v"
  }
,
{ // state 234
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 235
2,225, // ws*
23,MIN_REDUCTION+87, // `[
71,870, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 236
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 237
0x80000000|1, // match move
0x80000000|726, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 238
23,MIN_REDUCTION+105, // `[
83,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 239
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
42, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
921, // <stmt>
806, // <assign>
-1, // `;
25, // <local var decl>
189, // `if
464, // <exp>
-1, // `else
1008, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 240
66,981, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,992, // digit128
70,979, // {176..185}
88,538, // digit*
89,421, // $$1
  }
,
{ // state 241
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 243
23,MIN_REDUCTION+90, // `[
71,33, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 244
0x80000000|1, // match move
0x80000000|627, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
0x80000000|918, // match move
0x80000000|506, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 246
0x80000000|1, // match move
0x80000000|630, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 247
53,747, // "i"
58,567, // "b"
  }
,
{ // state 248
2,504, // ws*
71,409, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 249
15,982, // `void
74,233, // "#"
  }
,
{ // state 250
23,MIN_REDUCTION+105, // `[
83,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 252
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 253
0x80000000|72, // match move
0x80000000|536, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 254
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 256
71,707, // ws
72,899, // " "
73,362, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 257
0x80000000|864, // match move
0x80000000|571, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|654, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 261
23,MIN_REDUCTION+90, // `[
71,44, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 262
23,MIN_REDUCTION+105, // `[
83,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 265
0x80000000|623, // match move
0x80000000|454, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 266
99,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 267
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 269
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 270
0x80000000|398, // match move
0x80000000|151, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 271
71,791, // ws
72,580, // " "
73,970, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 272
0x80000000|130, // match move
0x80000000|792, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 273
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 278
2,504, // ws*
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 280
71,470, // ws
72,306, // " "
73,182, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 287
17,471, // `)
22,816, // <empty bracket pair>
23,1030, // `[
78,868, // ")"
83,696, // "["
  }
,
{ // state 288
71,956, // ws
72,786, // " "
73,773, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 289
71,136, // ws
72,774, // " "
73,795, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 291
0x80000000|451, // match move
0x80000000|371, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 292
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 294
0x80000000|1, // match move
0x80000000|540, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 295
2,475, // ws*
71,604, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 296
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 297
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,47, // letter128
64,855, // {199..218 231..250}
65,855, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,1028, // digit128
70,229, // {176..185}
87,206, // $$0
92,978, // idChar
93,949, // "_"
94,670, // idChar128
95,286, // {223}
  }
,
{ // state 298
2,728, // ws*
71,200, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 299
7,193, // ID
16,301, // `(
42,969, // <exp2>
43,230, // <cast exp>
44,413, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 300
2,645, // ws*
71,242, // ws
72,774, // " "
73,795, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 301
7,359, // ID
19,414, // <type>
20,819, // `int
21,100, // `boolean
48,160, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,111, // letter128
64,793, // {199..218 231..250}
65,793, // {193..198 225..230}
74,247, // "#"
  }
,
{ // state 302
0x80000000|1, // match move
0x80000000|29, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 304
0x80000000|124, // match move
0x80000000|22, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 305
17,656, // `)
22,816, // <empty bracket pair>
23,1030, // `[
78,868, // ")"
83,696, // "["
  }
,
{ // state 306
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 307
17,615, // `)
22,816, // <empty bracket pair>
23,1030, // `[
78,868, // ")"
83,696, // "["
  }
,
{ // state 308
66,981, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,897, // digit128
70,941, // {176..185}
88,483, // digit*
89,314, // $$1
  }
,
{ // state 309
0x80000000|1020, // match move
0x80000000|769, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 310
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 311
7,175, // ID
16,416, // `(
30,27, // <exp>
34,892, // <exp8>
35,259, // <exp7>
36,20, // <exp6>
37,18, // <exp5>
38,115, // <exp4>
40,383, // <exp3>
42,68, // <exp2>
43,203, // <cast exp>
44,391, // <unary exp>
45,92, // <exp1>
46,665, // `-
47,372, // INTLIT
48,754, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,951, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
67,217, // {"1".."9"}
68,834, // "0"
69,465, // digit128
70,986, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 312
71,59, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 313
0x80000000|1, // match move
0x80000000|24, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 314
0x80000000|685, // match move
0x80000000|186, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
71,438, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 316
16,473, // `(
77,822, // "("
  }
,
{ // state 317
99,MIN_REDUCTION+35, // $NT
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 318
2,927, // ws*
23,MIN_REDUCTION+123, // `[
71,880, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 319
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,47, // letter128
64,855, // {199..218 231..250}
65,855, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,1028, // digit128
70,229, // {176..185}
86,297, // idChar*
87,79, // $$0
92,423, // idChar
93,949, // "_"
94,670, // idChar128
95,286, // {223}
  }
,
{ // state 320
23,MIN_REDUCTION+96, // `[
71,44, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 321
2,113, // ws*
  }
,
{ // state 322
2,925, // ws*
23,MIN_REDUCTION+123, // `[
71,883, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 323
27,190, // `;
85,710, // ";"
  }
,
{ // state 324
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 326
23,MIN_REDUCTION+107, // `[
83,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 328
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
43, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
827, // <stmt>
718, // <assign>
-1, // `;
590, // <local var decl>
1029, // `if
464, // <exp>
-1, // `else
375, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 329
23,MIN_REDUCTION+107, // `[
83,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 331
41,342, // `*
76,886, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 332
23,824, // `[
83,300, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 333
2,578, // ws*
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 334
99,MIN_REDUCTION+93, // $NT
  }
,
{ // state 335
0x80000000|444, // match move
0x80000000|997, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 336
2,927, // ws*
  }
,
{ // state 337
54,821, // "l"
  }
,
{ // state 338
2,925, // ws*
  }
,
{ // state 339
71,441, // ws
72,550, // " "
73,757, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 341
2,939, // ws*
23,MIN_REDUCTION+123, // `[
71,878, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 342
7,187, // ID
16,384, // `(
42,936, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 343
2,879, // ws*
71,200, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 344
23,MIN_REDUCTION+107, // `[
83,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 345
99,MIN_REDUCTION+36, // $NT
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 346
7,175, // ID
16,416, // `(
42,930, // <exp2>
43,203, // <cast exp>
44,391, // <unary exp>
45,92, // <exp1>
46,665, // `-
47,372, // INTLIT
48,754, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,951, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
67,217, // {"1".."9"}
68,834, // "0"
69,465, // digit128
70,986, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 347
2,939, // ws*
  }
,
{ // state 348
24,729, // `]
84,69, // "]"
  }
,
{ // state 349
0x80000000|166, // match move
0x80000000|673, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 350
0x80000000|1019, // match move
0x80000000|713, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 351
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 353
23,832, // `[
83,300, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 354
7,178, // ID
16,412, // `(
42,929, // <exp2>
43,205, // <cast exp>
44,390, // <unary exp>
45,78, // <exp1>
46,668, // `-
47,369, // INTLIT
48,756, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,950, // letter128
64,575, // {199..218 231..250}
65,575, // {193..198 225..230}
67,215, // {"1".."9"}
68,837, // "0"
69,463, // digit128
70,984, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 355
0x80000000|1, // match move
0x80000000|429, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
23,838, // `[
83,300, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 357
99,MIN_REDUCTION+90, // $NT
  }
,
{ // state 358
23,MIN_REDUCTION+96, // `[
71,32, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 360
99,MIN_REDUCTION+126, // $NT
  }
,
{ // state 361
71,438, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 363
71,466, // ws
72,352, // " "
73,150, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 364
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 365
0x80000000|1, // match move
0x80000000|976, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 366
9,394, // <decl in class>*
10,159, // `}
12,512, // <decl in class>
13,170, // <method decl>
14,249, // `public
74,968, // "#"
80,17, // "}"
  }
,
{ // state 367
0x80000000|173, // match move
0x80000000|60, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 368
71,59, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 369
0x80000000|1, // match move
0x80000000|405, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 370
23,MIN_REDUCTION+96, // `[
71,33, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 371
2,510, // ws*
23,MIN_REDUCTION+97, // `[
71,908, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+97, // "["
99,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 372
0x80000000|1, // match move
0x80000000|404, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 373
7,265, // ID
16,704, // `(
42,1023, // <exp2>
43,317, // <cast exp>
44,345, // <unary exp>
45,245, // <exp1>
46,719, // `-
47,424, // INTLIT
48,727, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,818, // letter128
64,644, // {199..218 231..250}
65,644, // {193..198 225..230}
67,308, // {"1".."9"}
68,157, // "0"
69,291, // digit128
70,941, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 374
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 375
16,701, // `(
77,822, // "("
  }
,
{ // state 376
2,81, // ws*
23,MIN_REDUCTION+87, // `[
71,908, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+87, // "["
99,MIN_REDUCTION+87, // $NT
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 377
2,928, // ws*
99,MIN_REDUCTION+125, // $NT
  }
,
{ // state 378
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 379
59,559, // "e"
  }
,
{ // state 380
7,187, // ID
16,384, // `(
40,127, // <exp3>
42,10, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 381
0x80000000|1, // match move
0x80000000|455, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 382
0x80000000|1, // match move
0x80000000|895, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 383
41,346, // `*
76,886, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 384
7,359, // ID
19,287, // <type>
20,819, // `int
21,100, // `boolean
48,160, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,111, // letter128
64,793, // {199..218 231..250}
65,793, // {193..198 225..230}
74,247, // "#"
  }
,
{ // state 385
41,354, // `*
76,886, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 386
23,814, // `[
83,300, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 387
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 389
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 390
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 392
99,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 393
0x80000000|1, // match move
0x80000000|1012, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
10,915, // `}
12,293, // <decl in class>
13,170, // <method decl>
14,249, // `public
74,968, // "#"
80,17, // "}"
  }
,
{ // state 395
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 396
55,8, // "o"
  }
,
{ // state 397
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 398
2,5, // ws*
  }
,
{ // state 399
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 400
7,178, // ID
16,412, // `(
40,106, // <exp3>
42,65, // <exp2>
43,205, // <cast exp>
44,390, // <unary exp>
45,78, // <exp1>
46,668, // `-
47,369, // INTLIT
48,756, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,950, // letter128
64,575, // {199..218 231..250}
65,575, // {193..198 225..230}
67,215, // {"1".."9"}
68,837, // "0"
69,463, // digit128
70,984, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 401
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,11, // letter128
64,809, // {199..218 231..250}
65,809, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,1004, // digit128
70,263, // {176..185}
87,37, // $$0
92,978, // idChar
93,949, // "_"
94,593, // idChar128
95,325, // {223}
  }
,
{ // state 402
0x80000000|1, // match move
0x80000000|164, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 403
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 404
23,MIN_REDUCTION+43, // `[
83,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 405
23,MIN_REDUCTION+43, // `[
83,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 406
23,MIN_REDUCTION+94, // `[
83,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 407
0x80000000|636, // match move
0x80000000|873, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 408
2,1009, // ws*
71,651, // ws
72,95, // " "
73,349, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 409
0x80000000|161, // match move
0x80000000|863, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 410
7,175, // ID
16,416, // `(
40,102, // <exp3>
42,68, // <exp2>
43,203, // <cast exp>
44,391, // <unary exp>
45,92, // <exp1>
46,665, // `-
47,372, // INTLIT
48,754, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,951, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
67,217, // {"1".."9"}
68,834, // "0"
69,465, // digit128
70,986, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 411
23,MIN_REDUCTION+121, // `[
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 412
7,359, // ID
19,305, // <type>
20,819, // `int
21,100, // `boolean
48,160, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,111, // letter128
64,793, // {199..218 231..250}
65,793, // {193..198 225..230}
74,247, // "#"
  }
,
{ // state 413
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 414
17,684, // `)
22,816, // <empty bracket pair>
23,1030, // `[
78,868, // ")"
83,696, // "["
  }
,
{ // state 415
0x80000000|1, // match move
0x80000000|999, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 416
7,359, // ID
19,307, // <type>
20,819, // `int
21,100, // `boolean
48,160, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,111, // letter128
64,793, // {199..218 231..250}
65,793, // {193..198 225..230}
74,247, // "#"
  }
,
{ // state 417
0x80000000|1, // match move
0x80000000|1000, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
2,889, // ws*
23,MIN_REDUCTION+127, // `[
71,870, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 419
23,MIN_REDUCTION+90, // `[
71,257, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+90, // "["
99,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 420
99,MIN_REDUCTION+121, // $NT
  }
,
{ // state 421
0x80000000|1, // match move
0x80000000|142, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 422
7,193, // ID
16,301, // `(
40,147, // <exp3>
42,46, // <exp2>
43,230, // <cast exp>
44,413, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 423
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 424
0x80000000|449, // match move
0x80000000|482, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 425
41,299, // `*
76,886, // "*"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 426
23,MIN_REDUCTION+96, // `[
71,7, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 427
2,49, // ws*
  }
,
{ // state 428
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,125, // letter128
64,799, // {199..218 231..250}
65,799, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,995, // digit128
70,296, // {176..185}
87,57, // $$0
92,978, // idChar
93,949, // "_"
94,545, // idChar128
95,351, // {223}
  }
,
{ // state 429
23,MIN_REDUCTION+43, // `[
83,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 430
2,48, // ws*
  }
,
{ // state 431
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 432
2,113, // ws*
23,MIN_REDUCTION+123, // `[
71,870, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 433
0x80000000|15, // match move
0x80000000|397, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 434
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 435
0x80000000|93, // match move
0x80000000|87, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 436
0x80000000|516, // match move
0x80000000|789, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 437
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 438
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 439
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 440
66,811, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,1010, // digit128
70,998, // {176..185}
89,165, // $$1
  }
,
{ // state 441
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 442
0x80000000|486, // match move
0x80000000|491, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 443
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
42, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
796, // <stmt>
806, // <assign>
-1, // `;
25, // <local var decl>
189, // `if
464, // <exp>
-1, // `else
1008, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 444
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 445
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 446
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 447
2,861, // ws*
23,MIN_REDUCTION+127, // `[
71,883, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 448
2,859, // ws*
23,MIN_REDUCTION+127, // `[
71,880, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 449
99,MIN_REDUCTION+43, // $NT
  }
,
{ // state 450
23,MIN_REDUCTION+86, // `[
71,257, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+86, // "["
99,MIN_REDUCTION+86, // $NT
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 451
2,510, // ws*
99,MIN_REDUCTION+97, // $NT
  }
,
{ // state 452
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
638, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
661, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
687, // "}"
996, // "-"
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
{ // state 453
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 454
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
99,MIN_REDUCTION+41, // $NT
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 455
23,MIN_REDUCTION+43, // `[
83,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 456
31,4, // `else
74,379, // "#"
  }
,
{ // state 457
7,187, // ID
16,384, // `(
30,591, // <exp>
34,810, // <exp8>
35,252, // <exp7>
36,30, // <exp6>
37,28, // <exp5>
38,137, // <exp4>
40,331, // <exp3>
42,10, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 458
60,1026, // "h"
  }
,
{ // state 459
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 460
99,MIN_REDUCTION+45, // $NT
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 461
2,836, // ws*
71,831, // ws
72,550, // " "
73,757, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 462
0x80000000|290, // match move
0x80000000|250, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 463
0x80000000|499, // match move
0x80000000|520, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 464
33,311, // `=
82,932, // "="
  }
,
{ // state 465
0x80000000|497, // match move
0x80000000|517, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 466
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 467
2,833, // ws*
23,MIN_REDUCTION+127, // `[
71,878, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+127, // "["
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 468
71,MIN_REDUCTION+48, // ws
72,MIN_REDUCTION+48, // " "
73,MIN_REDUCTION+48, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 469
0x80000000|505, // match move
0x80000000|530, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 470
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 471
7,187, // ID
16,384, // `(
43,614, // <cast exp>
45,893, // <exp1>
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
  }
,
{ // state 472
2,288, // ws*
71,849, // ws
72,786, // " "
73,773, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 473
0x80000000|652, // match move
0x80000000|700, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 474
54,563, // "l"
  }
,
{ // state 475
71,438, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 476
31,490, // `else
74,379, // "#"
  }
,
{ // state 477
7,265, // ID
16,704, // `(
40,67, // <exp3>
42,109, // <exp2>
43,317, // <cast exp>
44,345, // <unary exp>
45,245, // <exp1>
46,719, // `-
47,424, // INTLIT
48,727, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,818, // letter128
64,644, // {199..218 231..250}
65,644, // {193..198 225..230}
67,308, // {"1".."9"}
68,157, // "0"
69,291, // digit128
70,941, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 478
2,708, // ws*
71,554, // ws
72,352, // " "
73,150, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 479
2,840, // ws*
71,755, // ws
72,772, // " "
73,266, // {10}
99,MIN_REDUCTION+87, // $NT
  }
,
{ // state 480
98,MIN_REDUCTION+0, // $
  }
,
{ // state 481
17,887, // `)
78,461, // ")"
  }
,
{ // state 482
23,MIN_REDUCTION+43, // `[
83,MIN_REDUCTION+43, // "["
99,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 483
66,811, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,897, // digit128
70,941, // {176..185}
89,98, // $$1
  }
,
{ // state 484
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,125, // letter128
64,799, // {199..218 231..250}
65,799, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,995, // digit128
70,296, // {176..185}
86,428, // idChar*
87,158, // $$0
92,423, // idChar
93,949, // "_"
94,545, // idChar128
95,351, // {223}
  }
,
{ // state 485
99,MIN_REDUCTION+49, // $NT
  }
,
{ // state 486
2,635, // ws*
  }
,
{ // state 487
2,1003, // ws*
71,242, // ws
72,774, // " "
73,795, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 488
0x80000000|562, // match move
0x80000000|418, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 489
24,695, // `]
84,144, // "]"
  }
,
{ // state 490
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
42, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
957, // <stmt>
806, // <assign>
-1, // `;
25, // <local var decl>
189, // `if
464, // <exp>
-1, // `else
1008, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 491
2,635, // ws*
23,MIN_REDUCTION+97, // `[
71,870, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 492
7,776, // ID
48,99, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,188, // letter128
64,522, // {199..218 231..250}
65,522, // {193..198 225..230}
  }
,
{ // state 493
17,537, // `)
22,816, // <empty bracket pair>
23,1030, // `[
78,868, // ")"
83,696, // "["
  }
,
{ // state 494
2,66, // ws*
71,766, // ws
72,255, // " "
73,277, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 495
24,699, // `]
84,146, // "]"
  }
,
{ // state 496
23,1005, // `[
83,300, // "["
99,MIN_REDUCTION+38, // $NT
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 497
2,600, // ws*
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
{ // state 498
17,MIN_REDUCTION+48, // `)
78,MIN_REDUCTION+48, // ")"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 499
2,598, // ws*
  }
,
{ // state 500
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 501
24,705, // `]
84,270, // "]"
  }
,
{ // state 502
0x80000000|149, // match move
0x80000000|784, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 503
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 504
0x80000000|955, // match move
0x80000000|128, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 505
2,547, // ws*
  }
,
{ // state 506
23,1005, // `[
83,300, // "["
99,MIN_REDUCTION+40, // $NT
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 507
23,MIN_REDUCTION+86, // `[
71,7, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 508
23,MIN_REDUCTION+107, // `[
83,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 509
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,11, // letter128
64,809, // {199..218 231..250}
65,809, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,1004, // digit128
70,263, // {176..185}
86,401, // idChar*
87,107, // $$0
92,423, // idChar
93,949, // "_"
94,593, // idChar128
95,325, // {223}
  }
,
{ // state 510
0x80000000|123, // match move
0x80000000|176, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 511
31,751, // `else
74,379, // "#"
  }
,
{ // state 512
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 513
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 514
41,373, // `*
76,886, // "*"
99,MIN_REDUCTION+32, // $NT
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 515
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 516
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 517
2,600, // ws*
23,MIN_REDUCTION+97, // `[
71,883, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 518
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 519
99,MIN_REDUCTION+94, // $NT
  }
,
{ // state 520
2,598, // ws*
23,MIN_REDUCTION+97, // `[
71,880, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 521
71,791, // ws
72,580, // " "
73,970, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 523
71,53, // ws
72,972, // " "
73,551, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 524
23,MIN_REDUCTION+86, // `[
71,33, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 525
71,791, // ws
72,580, // " "
73,970, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 526
23,MIN_REDUCTION+86, // `[
71,32, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 527
66,811, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,987, // digit128
70,986, // {176..185}
89,154, // $$1
  }
,
{ // state 528
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 529
55,881, // "o"
  }
,
{ // state 530
2,547, // ws*
23,MIN_REDUCTION+97, // `[
71,878, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 531
66,811, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,983, // digit128
70,984, // {176..185}
89,152, // $$1
  }
,
{ // state 532
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 533
2,1006, // ws*
23,MIN_REDUCTION+127, // `[
71,908, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+127, // "["
99,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 534
24,913, // `]
84,171, // "]"
  }
,
{ // state 535
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 536
23,MIN_REDUCTION+107, // `[
83,MIN_REDUCTION+107, // "["
99,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 537
7,265, // ID
16,704, // `(
43,617, // <cast exp>
45,192, // <exp1>
47,424, // INTLIT
48,727, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,818, // letter128
64,644, // {199..218 231..250}
65,644, // {193..198 225..230}
67,308, // {"1".."9"}
68,157, // "0"
69,291, // digit128
70,941, // {176..185}
77,744, // "("
  }
,
{ // state 538
66,811, // digit
67,848, // {"1".."9"}
68,848, // "0"
69,992, // digit128
70,979, // {176..185}
89,199, // $$1
  }
,
{ // state 539
23,MIN_REDUCTION+41, // `[
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 540
23,MIN_REDUCTION+99, // `[
83,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 541
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
922, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 542
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 543
23,824, // `[
83,300, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 544
2,730, // ws*
71,409, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 545
2,315, // ws*
71,604, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 546
23,MIN_REDUCTION+124, // `[
71,44, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 547
0x80000000|1, // match move
0x80000000|426, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 548
2,900, // ws*
71,607, // ws
72,283, // " "
73,226, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 549
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 550
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 553
17,541, // `)
78,461, // ")"
  }
,
{ // state 554
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 555
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 556
23,MIN_REDUCTION+86, // `[
71,44, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 557
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
706, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
141, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
989, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
472, // "}"
996, // "-"
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
{ // state 558
0x80000000|281, // match move
0x80000000|121, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 559
54,977, // "l"
  }
,
{ // state 560
16,133, // `(
77,548, // "("
  }
,
{ // state 561
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 562
2,889, // ws*
  }
,
{ // state 563
2,211, // ws*
71,755, // ws
72,772, // " "
73,266, // {10}
99,MIN_REDUCTION+65, // $NT
  }
,
{ // state 564
71,MIN_REDUCTION+49, // ws
72,MIN_REDUCTION+49, // " "
73,MIN_REDUCTION+49, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 565
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 566
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 567
55,875, // "o"
  }
,
{ // state 568
0x80000000|934, // match move
0x80000000|748, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 569
0x80000000|606, // match move
0x80000000|467, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 570
17,239, // `)
78,461, // ")"
  }
,
{ // state 571
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
99,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 572
99,MIN_REDUCTION+15, // $NT
  }
,
{ // state 573
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 574
0x80000000|281, // match move
0x80000000|920, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
0x80000000|281, // match move
0x80000000|140, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 576
2,1006, // ws*
99,MIN_REDUCTION+127, // $NT
  }
,
{ // state 577
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,55, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,55, // {176..185}
91,393, // $$2
96,603, // hexDigit
97,488, // hexDigit128
  }
,
{ // state 578
0x80000000|686, // match move
0x80000000|368, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 579
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 580
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 581
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 582
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 583
0x80000000|584, // match move
0x80000000|448, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 584
2,859, // ws*
  }
,
{ // state 585
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 586
0x80000000|281, // match move
0x80000000|926, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 587
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 588
71,MIN_REDUCTION+120, // ws
72,MIN_REDUCTION+120, // " "
73,MIN_REDUCTION+120, // {10}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 589
0x80000000|985, // match move
0x80000000|544, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 590
27,309, // `;
85,148, // ";"
  }
,
{ // state 591
17,1017, // `)
78,461, // ")"
  }
,
{ // state 592
0x80000000|594, // match move
0x80000000|447, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 593
2,280, // ws*
71,573, // ws
72,306, // " "
73,182, // {10}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 594
2,861, // ws*
  }
,
{ // state 595
23,838, // `[
83,300, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 596
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 598
0x80000000|1, // match move
0x80000000|358, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 599
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 600
0x80000000|1, // match move
0x80000000|370, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 601
2,896, // ws*
23,MIN_REDUCTION+91, // `[
71,908, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+91, // "["
99,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 602
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,916, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,613, // digit128
70,998, // {176..185}
86,96, // idChar*
87,260, // $$0
92,423, // idChar
93,949, // "_"
94,114, // idChar128
95,735, // {223}
  }
,
{ // state 603
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 605
7,187, // ID
16,384, // `(
30,143, // <exp>
34,810, // <exp8>
35,252, // <exp7>
36,30, // <exp6>
37,28, // <exp5>
38,137, // <exp4>
40,331, // <exp3>
42,10, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 606
2,833, // ws*
  }
,
{ // state 607
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 608
99,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 609
71,856, // ws
72,95, // " "
73,349, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 611
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 612
23,832, // `[
83,300, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 613
0x80000000|395, // match move
0x80000000|991, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 614
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 615
7,175, // ID
16,416, // `(
43,596, // <cast exp>
45,812, // <exp1>
47,372, // INTLIT
48,754, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,951, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
67,217, // {"1".."9"}
68,834, // "0"
69,465, // digit128
70,986, // {176..185}
77,744, // "("
  }
,
{ // state 616
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 617
99,MIN_REDUCTION+37, // $NT
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 619
0x80000000|395, // match move
0x80000000|962, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 620
7,265, // ID
16,704, // `(
34,846, // <exp8>
35,213, // <exp7>
36,61, // <exp6>
37,58, // <exp5>
38,960, // <exp4>
40,514, // <exp3>
42,109, // <exp2>
43,317, // <cast exp>
44,345, // <unary exp>
45,245, // <exp1>
46,719, // `-
47,424, // INTLIT
48,727, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,818, // letter128
64,644, // {199..218 231..250}
65,644, // {193..198 225..230}
67,308, // {"1".."9"}
68,157, // "0"
69,291, // digit128
70,941, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 621
2,81, // ws*
99,MIN_REDUCTION+87, // $NT
  }
,
{ // state 622
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 623
99,MIN_REDUCTION+41, // $NT
  }
,
{ // state 624
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 625
2,844, // ws*
23,MIN_REDUCTION+91, // `[
71,878, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 626
17,839, // `)
78,461, // ")"
  }
,
{ // state 627
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 628
0x80000000|794, // match move
0x80000000|218, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 629
0x80000000|395, // match move
0x80000000|944, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 630
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 631
0x80000000|794, // match move
0x80000000|220, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 632
0x80000000|395, // match move
0x80000000|947, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 633
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 634
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 635
0x80000000|1, // match move
0x80000000|320, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 636
2,787, // ws*
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 637
71,251, // ws
72,964, // " "
73,624, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 638
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 639
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,208, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,208, // {176..185}
91,415, // $$2
96,603, // hexDigit
97,592, // hexDigit128
  }
,
{ // state 640
0x80000000|576, // match move
0x80000000|533, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 641
0x80000000|794, // match move
0x80000000|262, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 642
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,204, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,204, // {176..185}
91,417, // $$2
96,603, // hexDigit
97,583, // hexDigit128
  }
,
{ // state 643
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 644
0x80000000|460, // match move
0x80000000|954, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 645
71,136, // ws
72,774, // " "
73,795, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 646
2,752, // ws*
23,MIN_REDUCTION+91, // `[
71,880, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 647
2,660, // ws*
71,303, // ws
72,899, // " "
73,362, // {10}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 648
2,750, // ws*
23,MIN_REDUCTION+91, // `[
71,883, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 649
52,337, // "c"
  }
,
{ // state 650
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,216, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,216, // {176..185}
91,365, // $$2
96,603, // hexDigit
97,569, // hexDigit128
  }
,
{ // state 651
0x80000000|966, // match move
0x80000000|874, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 652
7,187, // ID
16,384, // `(
30,553, // <exp>
34,810, // <exp8>
35,252, // <exp7>
36,30, // <exp6>
37,28, // <exp5>
38,137, // <exp4>
40,331, // <exp3>
42,10, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 653
23,MIN_REDUCTION+122, // `[
71,44, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 654
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 655
23,814, // `[
83,300, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 656
7,178, // ID
16,412, // `(
43,599, // <cast exp>
45,813, // <exp1>
47,369, // INTLIT
48,756, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,950, // letter128
64,575, // {199..218 231..250}
65,575, // {193..198 225..230}
67,215, // {"1".."9"}
68,837, // "0"
69,463, // digit128
70,984, // {176..185}
77,744, // "("
  }
,
{ // state 657
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 658
0x80000000|945, // match move
0x80000000|938, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 659
10,865, // `}
12,293, // <decl in class>
13,170, // <method decl>
14,249, // `public
74,968, // "#"
80,17, // "}"
  }
,
{ // state 660
71,707, // ws
72,899, // " "
73,362, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 661
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 662
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 663
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
433, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
661, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
407, // "}"
996, // "-"
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
{ // state 664
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
515, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
452, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
989, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
687, // "}"
996, // "-"
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
{ // state 665
7,175, // ID
44,1016, // <unary exp>
45,92, // <exp1>
46,665, // `-
47,372, // INTLIT
48,754, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,951, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
67,217, // {"1".."9"}
68,834, // "0"
69,465, // digit128
70,986, // {176..185}
81,996, // "-"
  }
,
{ // state 666
2,271, // ws*
71,662, // ws
72,580, // " "
73,970, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 667
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,253, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,253, // {176..185}
91,185, // $$2
96,603, // hexDigit
97,640, // hexDigit128
  }
,
{ // state 668
7,178, // ID
44,1013, // <unary exp>
45,78, // <exp1>
46,668, // `-
47,369, // INTLIT
48,756, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,950, // letter128
64,575, // {199..218 231..250}
65,575, // {193..198 225..230}
67,215, // {"1".."9"}
68,837, // "0"
69,463, // digit128
70,984, // {176..185}
81,996, // "-"
  }
,
{ // state 669
7,187, // ID
44,820, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
81,996, // "-"
  }
,
{ // state 670
2,363, // ws*
71,554, // ws
72,352, // " "
73,150, // {10}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 671
23,MIN_REDUCTION+121, // `[
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 672
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 673
17,MIN_REDUCTION+49, // `)
78,MIN_REDUCTION+49, // ")"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 674
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 675
23,MIN_REDUCTION+121, // `[
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 676
7,193, // ID
44,1024, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
81,996, // "-"
  }
,
{ // state 677
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 678
0x80000000|715, // match move
0x80000000|31, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 679
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 680
0x80000000|374, // match move
0x80000000|611, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 681
23,MIN_REDUCTION+121, // `[
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 682
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 683
23,MIN_REDUCTION+121, // `[
83,MIN_REDUCTION+121, // "["
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 684
7,193, // ID
16,301, // `(
43,542, // <cast exp>
45,845, // <exp1>
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
  }
,
{ // state 685
99,MIN_REDUCTION+95, // $NT
  }
,
{ // state 686
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 687
2,637, // ws*
71,126, // ws
72,964, // " "
73,624, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 688
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 689
2,931, // ws*
71,759, // ws
72,566, // " "
73,1018, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 690
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 691
23,MIN_REDUCTION+49, // `[
83,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 692
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 693
23,MIN_REDUCTION+122, // `[
71,7, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 694
23,MIN_REDUCTION+49, // `[
83,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 695
0x80000000|1, // match move
0x80000000|1025, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 696
2,763, // ws*
71,555, // ws
72,324, // " "
73,198, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 697
23,MIN_REDUCTION+49, // `[
83,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 698
59,474, // "e"
  }
,
{ // state 699
0x80000000|1, // match move
0x80000000|1027, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 700
17,963, // `)
78,461, // ")"
  }
,
{ // state 701
0x80000000|457, // match move
0x80000000|626, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 702
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
99,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 703
3,1014, // <program>
4,746, // <class decl>+
5,843, // <class decl>
6,492, // `class
71,231, // ws
72,657, // " "
73,692, // {10}
74,649, // "#"
  }
,
{ // state 704
7,359, // ID
19,493, // <type>
20,819, // `int
21,100, // `boolean
48,160, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,111, // letter128
64,793, // {199..218 231..250}
65,793, // {193..198 225..230}
74,247, // "#"
  }
,
{ // state 705
0x80000000|1, // match move
0x80000000|980, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 706
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 707
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 708
71,466, // ws
72,352, // " "
73,150, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 709
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 710
2,51, // ws*
71,849, // ws
72,786, // " "
73,773, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 711
23,MIN_REDUCTION+90, // `[
71,680, // ws
72,13, // " "
73,85, // {10}
83,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 712
23,MIN_REDUCTION+124, // `[
71,257, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+124, // "["
99,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 713
23,MIN_REDUCTION+122, // `[
71,680, // ws
72,13, // " "
73,85, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 714
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 715
99,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 716
71,274, // ws
72,891, // " "
73,677, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 717
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 718
27,961, // `;
85,148, // ";"
  }
,
{ // state 719
7,265, // ID
44,850, // <unary exp>
45,245, // <exp1>
46,719, // `-
47,424, // INTLIT
48,727, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,818, // letter128
64,644, // {199..218 231..250}
65,644, // {193..198 225..230}
67,308, // {"1".."9"}
68,157, // "0"
69,291, // digit128
70,941, // {176..185}
81,996, // "-"
  }
,
{ // state 720
99,MIN_REDUCTION+98, // $NT
  }
,
{ // state 721
99,MIN_REDUCTION+122, // $NT
  }
,
{ // state 722
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 723
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 724
2,782, // ws*
23,MIN_REDUCTION+91, // `[
71,870, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 725
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 726
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 727
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,853, // letter128
64,644, // {199..218 231..250}
65,644, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,658, // digit128
70,941, // {176..185}
86,6, // idChar*
87,70, // $$0
92,423, // idChar
93,949, // "_"
94,272, // idChar128
95,678, // {223}
  }
,
{ // state 728
71,803, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 729
0x80000000|739, // match move
0x80000000|835, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 730
0x80000000|686, // match move
0x80000000|771, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 731
23,MIN_REDUCTION+122, // `[
71,33, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 732
23,MIN_REDUCTION+49, // `[
83,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 734
23,MIN_REDUCTION+122, // `[
71,32, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 735
0x80000000|794, // match move
0x80000000|238, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 736
71,470, // ws
72,306, // " "
73,182, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 737
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 738
23,MIN_REDUCTION+122, // `[
71,257, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+122, // "["
99,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 739
99,MIN_REDUCTION+42, // $NT
  }
,
{ // state 740
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 741
71,438, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 742
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 743
27,191, // `;
85,710, // ";"
  }
,
{ // state 744
2,716, // ws*
71,91, // ws
72,891, // " "
73,677, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 745
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 746
5,179, // <class decl>
6,492, // `class
74,649, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 747
61,894, // "t"
  }
,
{ // state 748
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 749
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 750
0x80000000|1, // match move
0x80000000|243, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 751
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
43, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
957, // <stmt>
718, // <assign>
-1, // `;
590, // <local var decl>
1029, // `if
464, // <exp>
-1, // `else
375, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 752
0x80000000|1, // match move
0x80000000|228, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 753
2,578, // ws*
71,409, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 754
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,807, // letter128
64,574, // {199..218 231..250}
65,574, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,629, // digit128
70,986, // {176..185}
86,120, // idChar*
87,246, // $$0
92,423, // idChar
93,949, // "_"
94,14, // idChar128
95,628, // {223}
  }
,
{ // state 755
99,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 756
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,805, // letter128
64,575, // {199..218 231..250}
65,575, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,632, // digit128
70,984, // {176..185}
86,118, // idChar*
87,244, // $$0
92,423, // idChar
93,949, // "_"
94,19, // idChar128
95,631, // {223}
  }
,
{ // state 757
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 758
23,MIN_REDUCTION+124, // `[
71,7, // ws
72,104, // " "
73,101, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 759
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 760
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 761
2,129, // ws*
71,446, // ws
72,972, // " "
73,551, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 762
7,187, // ID
16,384, // `(
30,481, // <exp>
34,810, // <exp8>
35,252, // <exp7>
36,30, // <exp6>
37,28, // <exp5>
38,137, // <exp4>
40,331, // <exp3>
42,10, // <exp2>
43,273, // <cast exp>
44,403, // <unary exp>
45,183, // <exp1>
46,669, // `-
47,381, // INTLIT
48,797, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,990, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
67,240, // {"1".."9"}
68,862, // "0"
69,469, // digit128
70,979, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 763
71,459, // ws
72,324, // " "
73,198, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 764
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 765
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 766
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 767
23,MIN_REDUCTION+45, // `[
83,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 768
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 769
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 770
8,664, // `{
79,689, // "{"
  }
,
{ // state 771
71,59, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 772
99,MIN_REDUCTION+48, // $NT
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 773
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 774
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 775
23,MIN_REDUCTION+124, // `[
71,32, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 776
8,366, // `{
11,937, // `extends
74,858, // "#"
79,817, // "{"
  }
,
{ // state 777
23,MIN_REDUCTION+124, // `[
71,33, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+124, // "["
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 778
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 779
71,177, // ws
72,330, // " "
73,327, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 780
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
99,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 781
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 782
0x80000000|1, // match move
0x80000000|261, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 783
0x80000000|434, // match move
0x80000000|828, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 784
2,350, // ws*
23,MIN_REDUCTION+123, // `[
71,90, // ws
72,13, // " "
73,85, // {10}
83,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 785
23,MIN_REDUCTION+120, // `[
83,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 786
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 787
0x80000000|955, // match move
0x80000000|312, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 788
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 789
23,MIN_REDUCTION+103, // `[
83,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 790
23,MIN_REDUCTION+49, // `[
83,MIN_REDUCTION+49, // "["
99,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 791
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 792
2,994, // ws*
23,MIN_REDUCTION+123, // `[
71,908, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+123, // "["
99,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 793
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 794
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 795
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 796
0x80000000|610, // match move
0x80000000|378, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 797
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,815, // letter128
64,586, // {199..218 231..250}
65,586, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,619, // digit128
70,979, // {176..185}
86,105, // idChar*
87,237, // $$0
92,423, // idChar
93,949, // "_"
94,71, // idChar128
95,641, // {223}
  }
,
{ // state 798
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
42, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
847, // <stmt>
806, // <assign>
-1, // `;
25, // <local var decl>
189, // `if
464, // <exp>
-1, // `else
1008, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 799
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 800
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 801
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,55, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,55, // {176..185}
90,577, // hexDigit*
91,294, // $$2
96,943, // hexDigit
97,488, // hexDigit128
  }
,
{ // state 802
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 803
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 804
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 805
0x80000000|788, // match move
0x80000000|561, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 806
27,961, // `;
85,589, // ";"
  }
,
{ // state 807
0x80000000|788, // match move
0x80000000|565, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 808
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 809
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 810
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 811
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 812
0x80000000|1, // match move
0x80000000|356, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 813
0x80000000|1, // match move
0x80000000|353, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 814
7,193, // ID
16,301, // `(
30,534, // <exp>
34,909, // <exp8>
35,2, // <exp7>
36,275, // <exp6>
37,276, // <exp5>
38,54, // <exp4>
40,425, // <exp3>
42,46, // <exp2>
43,230, // <cast exp>
44,413, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 815
0x80000000|788, // match move
0x80000000|549, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 816
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 817
2,35, // ws*
71,279, // ws
72,745, // " "
73,765, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 818
0x80000000|935, // match move
0x80000000|601, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 819
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 820
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 821
2,523, // ws*
71,446, // ws
72,972, // " "
73,551, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 822
0x80000000|41, // match move
0x80000000|408, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 823
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 824
7,193, // ID
16,301, // `(
30,501, // <exp>
34,909, // <exp8>
35,2, // <exp7>
36,275, // <exp6>
37,276, // <exp5>
38,54, // <exp4>
40,425, // <exp3>
42,46, // <exp2>
43,230, // <cast exp>
44,413, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 825
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 826
71,803, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 827
0x80000000|476, // match move
0x80000000|9, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 828
23,MIN_REDUCTION+93, // `[
83,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 829
23,MIN_REDUCTION+41, // `[
33,MIN_REDUCTION+41, // `=
39,MIN_REDUCTION+41, // `+
41,MIN_REDUCTION+41, // `*
75,MIN_REDUCTION+41, // "+"
76,MIN_REDUCTION+41, // "*"
82,MIN_REDUCTION+41, // "="
83,MIN_REDUCTION+41, // "["
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 830
0x80000000|278, // match move
0x80000000|248, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 831
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 832
7,193, // ID
16,301, // `(
30,489, // <exp>
34,909, // <exp8>
35,2, // <exp7>
36,275, // <exp6>
37,276, // <exp5>
38,54, // <exp4>
40,425, // <exp3>
42,46, // <exp2>
43,230, // <cast exp>
44,413, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 833
0x80000000|1, // match move
0x80000000|86, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 834
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,208, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,208, // {176..185}
90,639, // hexDigit*
91,310, // $$2
96,943, // hexDigit
97,592, // hexDigit128
  }
,
{ // state 835
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
99,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 836
71,441, // ws
72,550, // " "
73,757, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 837
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,204, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,204, // {176..185}
90,642, // hexDigit*
91,313, // $$2
96,943, // hexDigit
97,583, // hexDigit128
  }
,
{ // state 838
7,193, // ID
16,301, // `(
30,495, // <exp>
34,909, // <exp8>
35,2, // <exp7>
36,275, // <exp6>
37,276, // <exp5>
38,54, // <exp4>
40,425, // <exp3>
42,46, // <exp2>
43,230, // <cast exp>
44,413, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
81,996, // "-"
  }
,
{ // state 839
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
43, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
796, // <stmt>
718, // <assign>
-1, // `;
590, // <local var decl>
1029, // `if
464, // <exp>
-1, // `else
375, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 840
71,392, // ws
72,772, // " "
73,266, // {10}
99,MIN_REDUCTION+86, // $NT
  }
,
{ // state 841
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 842
0x80000000|163, // match move
0x80000000|117, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 843
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 844
0x80000000|1, // match move
0x80000000|223, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 845
0x80000000|1, // match move
0x80000000|386, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 846
99,MIN_REDUCTION+26, // $NT
  }
,
{ // state 847
0x80000000|456, // match move
0x80000000|9, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 848
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 849
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 850
99,MIN_REDUCTION+39, // $NT
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 851
23,MIN_REDUCTION+48, // `[
83,MIN_REDUCTION+48, // "["
99,MIN_REDUCTION+48, // $NT
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 852
2,736, // ws*
71,573, // ws
72,306, // " "
73,182, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 853
0x80000000|608, // match move
0x80000000|780, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 854
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 855
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 856
0x80000000|445, // match move
0x80000000|103, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 857
9,659, // <decl in class>*
10,597, // `}
12,512, // <decl in class>
13,170, // <method decl>
14,249, // `public
74,968, // "#"
80,17, // "}"
  }
,
{ // state 858
59,110, // "e"
  }
,
{ // state 859
0x80000000|1, // match move
0x80000000|973, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 860
2,844, // ws*
  }
,
{ // state 861
0x80000000|1, // match move
0x80000000|971, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 862
49,823, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,823, // "p"
51,823, // "v"
52,823, // "c"
53,823, // "i"
54,823, // "l"
55,823, // "o"
56,823, // "u"
57,823, // "x"
58,823, // "b"
59,823, // "e"
60,823, // "h"
61,823, // "t"
62,823, // "w"
65,216, // {193..198 225..230}
67,823, // {"1".."9"}
68,823, // "0"
70,216, // {176..185}
90,650, // hexDigit*
91,302, // $$2
96,943, // hexDigit
97,569, // hexDigit128
  }
,
{ // state 863
71,MIN_REDUCTION+121, // ws
72,MIN_REDUCTION+121, // " "
73,MIN_REDUCTION+121, // {10}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 864
99,MIN_REDUCTION+120, // $NT
  }
,
{ // state 865
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 866
24,572, // `]
84,479, // "]"
  }
,
{ // state 867
99,MIN_REDUCTION+124, // $NT
  }
,
{ // state 868
2,184, // ws*
71,975, // ws
72,36, // " "
73,725, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 869
2,752, // ws*
  }
,
{ // state 870
0x80000000|1, // match move
0x80000000|671, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 871
2,750, // ws*
  }
,
{ // state 872
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 873
2,787, // ws*
71,409, // ws
72,75, // " "
73,904, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 874
17,MIN_REDUCTION+121, // `)
78,MIN_REDUCTION+121, // ")"
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 875
2,76, // ws*
71,200, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 876
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 877
2,741, // ws*
71,604, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 878
0x80000000|1, // match move
0x80000000|675, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 879
71,803, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 880
0x80000000|1, // match move
0x80000000|683, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 881
2,988, // ws*
71,446, // ws
72,972, // " "
73,551, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 882
74,698, // "#"
  }
,
{ // state 883
0x80000000|1, // match move
0x80000000|681, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 884
2,804, // ws*
  }
,
{ // state 885
56,494, // "u"
  }
,
{ // state 886
2,219, // ws*
71,841, // ws
72,139, // " "
73,156, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 887
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
43, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
221, // <stmt>
718, // <assign>
-1, // `;
590, // <local var decl>
1029, // `if
464, // <exp>
-1, // `else
375, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 888
53,138, // "i"
58,396, // "b"
62,458, // "w"
75,295, // "+"
  }
,
{ // state 889
0x80000000|1, // match move
0x80000000|940, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 890
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 891
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 892
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 893
0x80000000|1, // match move
0x80000000|332, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 894
2,197, // ws*
71,200, // ws
72,911, // " "
73,643, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 895
23,MIN_REDUCTION+95, // `[
83,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 896
0x80000000|357, // match move
0x80000000|419, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 897
0x80000000|377, // match move
0x80000000|917, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 898
0x80000000|1, // match move
0x80000000|777, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 899
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 900
71,439, // ws
72,283, // " "
73,226, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 901
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 902
0x80000000|1, // match move
0x80000000|775, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 903
2,902, // ws*
  }
,
{ // state 904
0x80000000|254, // match move
0x80000000|564, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 905
0x80000000|1, // match move
0x80000000|758, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 906
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 907
2,898, // ws*
  }
,
{ // state 908
0x80000000|420, // match move
0x80000000|933, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 909
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 910
71,466, // ws
72,352, // " "
73,150, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 911
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 912
2,905, // ws*
  }
,
{ // state 913
0x80000000|1, // match move
0x80000000|1015, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 914
2,782, // ws*
  }
,
{ // state 915
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 916
0x80000000|788, // match move
0x80000000|582, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 917
2,928, // ws*
23,MIN_REDUCTION+125, // `[
71,908, // ws
72,74, // " "
73,82, // {10}
83,MIN_REDUCTION+125, // "["
99,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 918
99,MIN_REDUCTION+40, // $NT
  }
,
{ // state 919
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 920
23,MIN_REDUCTION+45, // `[
83,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 921
0x80000000|714, // match move
0x80000000|919, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 922
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 923
33,50, // `=
82,932, // "="
  }
,
{ // state 924
0x80000000|914, // match move
0x80000000|724, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 925
0x80000000|1, // match move
0x80000000|731, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 926
23,MIN_REDUCTION+45, // `[
83,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 927
0x80000000|1, // match move
0x80000000|734, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 928
0x80000000|867, // match move
0x80000000|712, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 929
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 930
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 931
71,622, // ws
72,566, // " "
73,1018, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 932
2,289, // ws*
71,242, // ws
72,774, // " "
73,795, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 933
23,MIN_REDUCTION+121, // `[
83,MIN_REDUCTION+121, // "["
99,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 934
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 935
2,896, // ws*
99,MIN_REDUCTION+91, // $NT
  }
,
{ // state 936
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 937
7,63, // ID
48,319, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,1021, // letter128
64,855, // {199..218 231..250}
65,855, // {193..198 225..230}
  }
,
{ // state 938
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
99,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 939
0x80000000|1, // match move
0x80000000|693, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 940
23,MIN_REDUCTION+126, // `[
71,44, // ws
72,134, // " "
73,23, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 941
0x80000000|1011, // match move
0x80000000|222, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 942
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 943
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 944
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 945
99,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 946
17,328, // `)
78,461, // ")"
  }
,
{ // state 947
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 948
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
99,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 949
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 950
0x80000000|869, // match move
0x80000000|646, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 951
0x80000000|871, // match move
0x80000000|648, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 952
0x80000000|209, // match move
0x80000000|581, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 953
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 954
23,MIN_REDUCTION+45, // `[
83,MIN_REDUCTION+45, // "["
99,MIN_REDUCTION+45, // $NT
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 955
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 956
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 957
0x80000000|906, // match move
0x80000000|740, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 958
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 959
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,436, // letter128
64,155, // {199..218 231..250}
65,155, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,952, // digit128
70,132, // {176..185}
86,38, // idChar*
87,783, // $$0
92,423, // idChar
93,949, // "_"
94,502, // idChar128
95,462, // {223}
  }
,
{ // state 960
39,477, // `+
75,974, // "+"
99,MIN_REDUCTION+30, // $NT
  }
,
{ // state 961
0x80000000|808, // match move
0x80000000|52, // no-match move
0x80000000|882, // NT-test-match state for `else
  }
,
{ // state 962
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 963
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
292, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 964
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 965
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 966
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 967
23,MIN_REDUCTION+92, // `[
83,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 968
50,885, // "p"
  }
,
{ // state 969
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 970
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 971
23,MIN_REDUCTION+126, // `[
71,33, // ws
72,119, // " "
73,131, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 972
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 973
23,MIN_REDUCTION+126, // `[
71,32, // ws
72,116, // " "
73,135, // {10}
83,MIN_REDUCTION+126, // "["
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 974
2,3, // ws*
71,854, // ws
72,122, // " "
73,167, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 975
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 976
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 977
2,339, // ws*
71,831, // ws
72,550, // " "
73,757, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 978
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 979
0x80000000|587, // match move
0x80000000|258, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 980
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 981
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 982
7,560, // ID
48,484, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,877, // letter128
64,799, // {199..218 231..250}
65,799, // {193..198 225..230}
  }
,
{ // state 983
0x80000000|903, // match move
0x80000000|172, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 984
0x80000000|587, // match move
0x80000000|269, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 985
2,730, // ws*
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 986
0x80000000|587, // match move
0x80000000|267, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 987
0x80000000|907, // match move
0x80000000|169, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 988
71,53, // ws
72,972, // " "
73,551, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 989
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 990
0x80000000|860, // match move
0x80000000|625, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 991
23,MIN_REDUCTION+104, // `[
83,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 992
0x80000000|912, // match move
0x80000000|194, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 993
23,MIN_REDUCTION+47, // `[
83,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 994
0x80000000|721, // match move
0x80000000|738, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 995
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 996
2,779, // ws*
71,268, // ws
72,330, // " "
73,327, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 997
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 998
0x80000000|587, // match move
0x80000000|800, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 999
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1000
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1001
48,535, // letter
49,56, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,56, // "p"
51,56, // "v"
52,56, // "c"
53,56, // "i"
54,56, // "l"
55,56, // "o"
56,56, // "u"
57,56, // "x"
58,56, // "b"
59,56, // "e"
60,56, // "h"
61,56, // "t"
62,56, // "w"
63,733, // letter128
64,522, // {199..218 231..250}
65,522, // {193..198 225..230}
66,232, // digit
67,201, // {"1".."9"}
68,201, // "0"
69,340, // digit128
70,503, // {176..185}
87,212, // $$0
92,978, // idChar
93,949, // "_"
94,647, // idChar128
95,552, // {223}
  }
,
{ // state 1002
0x80000000|431, // match move
0x80000000|711, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1003
71,136, // ws
72,774, // " "
73,795, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1004
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1005
7,193, // ID
16,301, // `(
30,348, // <exp>
34,909, // <exp8>
35,2, // <exp7>
36,275, // <exp6>
37,276, // <exp5>
38,54, // <exp4>
40,425, // <exp3>
42,46, // <exp2>
43,230, // <cast exp>
44,413, // <unary exp>
45,108, // <exp1>
46,676, // `-
47,355, // INTLIT
48,602, // letter
49,633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
50,633, // "p"
51,633, // "v"
52,633, // "c"
53,633, // "i"
54,633, // "l"
55,633, // "o"
56,633, // "u"
57,633, // "x"
58,633, // "b"
59,633, // "e"
60,633, // "h"
61,633, // "t"
62,633, // "w"
63,924, // letter128
64,558, // {199..218 231..250}
65,558, // {193..198 225..230}
67,181, // {"1".."9"}
68,801, // "0"
69,442, // digit128
70,998, // {176..185}
77,744, // "("
81,996, // "-"
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1006
0x80000000|360, // match move
0x80000000|34, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1007
16,605, // `(
77,487, // "("
  }
,
{ // state 1008
16,842, // `(
77,822, // "("
  }
,
{ // state 1009
0x80000000|180, // match move
0x80000000|609, // no-match move
0x80000000|620, // NT-test-match state for <exp>
  }
,
{ // state 1010
0x80000000|884, // match move
0x80000000|145, // no-match move
0x80000000|39, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1011
99,MIN_REDUCTION+47, // $NT
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1012
23,MIN_REDUCTION+98, // `[
83,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1013
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1014
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 1015
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1016
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1017
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
43, // `{
-1, // <decl in class>*
-1, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
921, // <stmt>
718, // <assign>
-1, // `;
590, // <local var decl>
1029, // `if
464, // <exp>
-1, // `else
375, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
-1, // "}"
996, // "-"
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
{ // state 1018
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1019
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1020
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 1021
2,910, // ws*
71,554, // ws
72,352, // " "
73,150, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1022
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
210, // ID
557, // `{
-1, // <decl in class>*
433, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
412, // `(
-1, // `)
-1, // <stmt>*
168, // <type>
717, // `int
722, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
661, // <stmt>
743, // <assign>
-1, // `;
323, // <local var decl>
1007, // `if
464, // <exp>
-1, // `else
316, // `while
-1, // `=
890, // <exp8>
264, // <exp7>
16, // <exp6>
21, // <exp5>
84, // <exp4>
-1, // `+
385, // <exp3>
-1, // `*
65, // <exp2>
205, // <cast exp>
390, // <unary exp>
78, // <exp1>
668, // `-
369, // INTLIT
959, // letter
633, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q".."s" "y".."z"}
633, // "p"
633, // "v"
633, // "c"
633, // "i"
633, // "l"
633, // "o"
633, // "u"
633, // "x"
633, // "b"
633, // "e"
633, // "h"
633, // "t"
633, // "w"
304, // letter128
155, // {199..218 231..250}
155, // {193..198 225..230}
-1, // digit
215, // {"1".."9"}
837, // "0"
463, // digit128
984, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
888, // "#"
-1, // "+"
-1, // "*"
744, // "("
-1, // ")"
689, // "{"
830, // "}"
996, // "-"
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
{ // state 1023
99,MIN_REDUCTION+33, // $NT
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1024
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1025
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1026
2,361, // ws*
71,604, // ws
72,285, // " "
73,227, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1027
23,MIN_REDUCTION+42, // `[
83,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1028
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1029
16,762, // `(
77,487, // "("
  }
,
{ // state 1030
24,437, // `]
84,343, // "]"
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1031][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
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
// <stmt> ::= `while `( !<exp> `) <stmt>
(25<<16)+4,
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
"", // 107
"digit* ::= digit* digit", // 108
"digit* ::= digit* digit", // 109
"<decl in class>* ::= <decl in class>* <decl in class>", // 110
"<decl in class>* ::= <decl in class>* <decl in class>", // 111
"hexDigit* ::= hexDigit* hexDigit", // 112
"hexDigit* ::= hexDigit* hexDigit", // 113
"<stmt>* ::= <stmt>* <stmt>", // 114
"<stmt>* ::= <stmt>* <stmt>", // 115
"idChar* ::= idChar* idChar", // 116
"idChar* ::= idChar* idChar", // 117
"<class decl>+ ::= <class decl>", // 118
"<class decl>+ ::= <class decl>+ <class decl>", // 119
"ws* ::= ws* ws", // 120
"ws* ::= ws* ws", // 121
"", // 122
"", // 123
"", // 124
"", // 125
"", // 126
"", // 127
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
    { // 22: <stmt> ::= `while [#] `( !<exp> `) <stmt> @while_no_exp(int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <stmt> ::= `while [#] `( <exp> `) <stmt> @while_maker(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 26: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 32: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 34: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 38: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 39: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 40: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 42: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 43: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 44: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 46: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 48: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 49: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 50: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `extends ::= "#" "e" "x" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `while ::= "#" "w" "h" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 63: `if ::= "#" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 64: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `else ::= "#" "e" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 91: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 92: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 93: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 94: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 95: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 96: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 97: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 98: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 99: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 100: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 101: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 106: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 108: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 109: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 110: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 111: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 112: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 113: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 114: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 115: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 116: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 117: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 118: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 119: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 120: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 121: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 122: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 123: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 124: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 125: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 126: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 127: $$2 ::= hexDigit128 [ws*] @pass
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
      ((28<<5)|0x5)/*methodCall:28*/,
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
      Statement parm1 = (Statement)si.popPb();
      Statement result = actionObject.while_no_exp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.while_maker(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 28: {
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
"Statement while_no_exp(int,Statement)",
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
2,1,
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
